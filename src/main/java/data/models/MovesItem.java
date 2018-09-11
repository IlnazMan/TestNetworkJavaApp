package data.models;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class MovesItem{

	@SerializedName("version_group_details")
	private List<VersionGroupDetailsItem> versionGroupDetails;

	@SerializedName("move")
	private Move move;

	public void setVersionGroupDetails(List<VersionGroupDetailsItem> versionGroupDetails){
		this.versionGroupDetails = versionGroupDetails;
	}

	public List<VersionGroupDetailsItem> getVersionGroupDetails(){
		return versionGroupDetails;
	}

	public void setMove(Move move){
		this.move = move;
	}

	public Move getMove(){
		return move;
	}

	@Override
 	public String toString(){
		return 
			"MovesItem{" + 
			"version_group_details = '" + versionGroupDetails + '\'' + 
			",move = '" + move + '\'' + 
			"}";
		}
}