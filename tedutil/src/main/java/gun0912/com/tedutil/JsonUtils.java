package gun0912.com.tedutil;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonUtils {

	static Gson gson = new GsonBuilder().setPrettyPrinting().create();


	public static <T> T fromJson(String json, Class<T> c) {
		return gson.fromJson(json, c);
	}
	
	 public static String toJson(Object obj) {
		 return gson.toJson(obj);
		 
		 
	 }

}
