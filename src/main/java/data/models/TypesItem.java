package data.models;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class TypesItem{

	@SerializedName("slot")
	private int slot;

	@SerializedName("type")
	private Type type;

	public void setSlot(int slot){
		this.slot = slot;
	}

	public int getSlot(){
		return slot;
	}

	public void setType(Type type){
		this.type = type;
	}

	public Type getType(){
		return type;
	}

	@Override
 	public String toString(){
		return 
			"TypesItem{" + 
			"slot = '" + slot + '\'' + 
			",type = '" + type + '\'' + 
			"}";
		}
}