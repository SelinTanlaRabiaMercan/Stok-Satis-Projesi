package com.Tanla.dal;

import java.awt.Paint;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.mysql.cj.MysqlConnection;
import com.mysql.cj.xdevapi.PreparableStatement;
import com.Tanla.core.ObjectHelper;
import com.Tanla.entity.CategoryContract;
import com.Tanla.interfaces.DalInterfaces;


public class CategoryDal extends ObjectHelper implements DalInterfaces<CategoryContract>{

	@Override
	public void Insert(CategoryContract entity) {
		Connection connection = getConnection();
		try {
			/*
			Statement statement=connection.createStatement();
			statement.executeUpdate(
					"INSERT INTO values ('entity.getName()',' entity.getParentId()')"
					);
			//"INSERT INTO category (name,parentId) values ("+entity.getName()+","+ entity.getParentId()+")"
			statement.close();
			connection.close();
			*/
			PreparedStatement stmt = connection.prepareStatement("INSERT INTO category(id, name, parentId)"
					+ " VALUES (0, ?, ?)");

			
			stmt.setString(1, entity.getName());
			stmt.setInt(2, entity.getParentId());

			stmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println(entity.getName());
		}
		
	}

	@Override
	public List<CategoryContract> GetAll() {
		List<CategoryContract> datalist= new ArrayList<CategoryContract>();
		Connection connection=getConnection();
		CategoryContract categoryContract;
		try {
			Statement statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery(
					"Select * From category"
					);
			while(resultSet.next()) {
				categoryContract=new CategoryContract();
				categoryContract.setId(resultSet.getInt("id"));
				categoryContract.setName(resultSet.getString("name"));
                categoryContract.setParentId(resultSet.getInt("parentId"));
                
                datalist.add(categoryContract);
			}
			statement.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return datalist;
	}
	
	public List<CategoryContract> GetAllparentId() {
		List<CategoryContract> datalist= new ArrayList<CategoryContract>();
		Connection connection=getConnection();
		CategoryContract categoryContract;
		try {
			Statement statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery(
					"Select * From category where parentId=0 "
					);
			while(resultSet.next()) {
				categoryContract=new CategoryContract();
				categoryContract.setId(resultSet.getInt("id"));
				categoryContract.setName(resultSet.getString("name"));
                categoryContract.setParentId(resultSet.getInt("parentId"));
                
                datalist.add(categoryContract);
			}
			statement.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return datalist;
	}

	@Override
	public CategoryContract Delete(CategoryContract entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void Update(CategoryContract entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CategoryContract> GetById(int id) {
		// TODO Auto-generated method stub
		return null;
	}



}
