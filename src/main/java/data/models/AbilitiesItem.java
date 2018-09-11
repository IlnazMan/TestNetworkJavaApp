package data.models;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class AbilitiesItem{

	@SerializedName("is_hidden")
	private boolean isHidden;

	@SerializedName("slot")
	private int slot;

	@SerializedName("ability")
	private Ability ability;

	public void setIsHidden(boolean isHidden){
		this.isHidden = isHidden;
	}

	public boolean isIsHidden(){
		return isHidden;
	}

	public void setSlot(int slot){
		this.slot = slot;
	}

	public int getSlot(){
		return slot;
	}

	public void setAbility(Ability ability){
		this.ability = ability;
	}

	public Ability getAbility(){
		return ability;
	}

	@Override
 	public String toString(){
		return 
			"AbilitiesItem{" + 
			"is_hidden = '" + isHidden + '\'' + 
			",slot = '" + slot + '\'' + 
			",ability = '" + ability + '\'' + 
			"}";
		}
}