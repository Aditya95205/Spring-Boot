package Kiitmodel;

public class Gear {
     private String gearMfgName;
     private int gearLeverCount;
     private String gearType;
     public Gear() {} 
	public Gear(String gearMfgName, int gearLeverCount, String gearType) {
		this.gearMfgName = gearMfgName;
		this.gearLeverCount = gearLeverCount;
		this.gearType = gearType;
	}
	public String getGearMfgName() {
		return gearMfgName;
	}
	public void setGearMfgName(String gearMfgName) {
		this.gearMfgName = gearMfgName;
	}
	public int getGearLeverCount() {
		return gearLeverCount;
	}
	public void setGearLeverCount(int gearLeverCount) {
		this.gearLeverCount = gearLeverCount;
	}
	public String getGearType() {
		return gearType;
	}
	public void setGearType(String gearType) {
		this.gearType = gearType;
	}
	@Override
	public String toString() {
		return "Gear [gearMfgName=" + gearMfgName + ", gearLeverCount=" + gearLeverCount + ", gearType=" + gearType
				+ "]";
	}
     
      
     
}
