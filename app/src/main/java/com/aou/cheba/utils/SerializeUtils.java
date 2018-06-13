package com.aou.cheba.utils;

import com.google.gson.Gson;

import java.io.IOException;

/**
 * 序列化工具
 * 
 * @author 李daiaosi
 */
public class SerializeUtils
{

	/**
	 * 对象转JSON
	 * 
	 * @param object
	 * @return
	 */
	public static String object2Json(Object object) throws Exception
	{
		return new Gson().toJson(object);
	}

	/**
	 * JSON转对象
	 * 
	 * @param json
	 * @param clazz
	 * @return
	 * @throws IOException
	 */
	public static <T> T json2Object(String json, Class<T> clazz) throws Exception
	{
		T res = null;
		Gson gson = new Gson();
		res = gson.fromJson(json, clazz);
		return res;
	}
}