package com.shy2850.convertor;

/**ϵͳת����BooleanConvertor*/
class BooleanConvertor extends Convertor {

	public BooleanConvertor() {
		super();
	}
	public Object parse(String convertorString) {
		if(null == convertorString || "null".equals(convertorString))return null;
		return "true".equals(convertorString);
	}

	public Class<?> getType() {
		return Boolean.class;
	}

}
