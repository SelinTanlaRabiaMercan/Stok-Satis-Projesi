package com.Tanla.dal;

import java.util.List;

import com.Tanla.core.ObjectHelper;
import com.Tanla.entity.ProductsContract;
import com.Tanla.interfaces.DalInterfaces;

public class ProductsDal<ProductsContrat> extends ObjectHelper implements DalInterfaces<ProductsContract>{

	@Override
	public void Insert(ProductsContract entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ProductsContract> GetAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductsContract Delete(ProductsContract entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void Update(ProductsContract entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ProductsContract> GetById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
