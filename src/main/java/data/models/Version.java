package data.models;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Version{

	@SerializedName("name")
	private String name;

	@SerializedName("url")
	private String url;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	@Override
 	public String toString(){
		return 
			"Version{" + 
			"name = '" + name + '\'' + 
			",url = '" + url + '\'' + 
			"}";
		}
}