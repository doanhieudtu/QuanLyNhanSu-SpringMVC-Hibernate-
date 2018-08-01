package com.quanlinhansu.interfacedao;

import java.io.Serializable;
import java.util.List;

public  interface  GenericDao<ID extends Serializable, T > {
	 List<T> FindAll();
	 int Update(T eTiTy);
	 Object[] FindbyProperty(String property, Object value, String typeSort, String sortDisrection  );
	 int DeleteT(T eNtity);
	 int Add(T enTyti);
}
