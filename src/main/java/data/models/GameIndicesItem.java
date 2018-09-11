package data.models;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class GameIndicesItem{

	@SerializedName("game_index")
	private int gameIndex;

	@SerializedName("version")
	private Version version;

	public void setGameIndex(int gameIndex){
		this.gameIndex = gameIndex;
	}

	public int getGameIndex(){
		return gameIndex;
	}

	public void setVersion(Version version){
		this.version = version;
	}

	public Version getVersion(){
		return version;
	}

	@Override
 	public String toString(){
		return 
			"GameIndicesItem{" + 
			"game_index = '" + gameIndex + '\'' + 
			",version = '" + version + '\'' + 
			"}";
		}
}