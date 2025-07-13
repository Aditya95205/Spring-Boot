package Kiitmodel;

public class Engine {
      private String engineMfgName;
      private int engineLiterCapacity;
      private int engineCC;
      
      public Engine()  {}     
	public Engine(String engineMfgName, int engineLiterCapacity, int engineCC) {
		this.engineMfgName = engineMfgName;
		this.engineLiterCapacity = engineLiterCapacity;
		this.engineCC = engineCC;
	}
	public String getEngineMfgName() {
		return engineMfgName;
	}
	public void setEngineMfgName(String engineMfgName) {
		this.engineMfgName = engineMfgName;
	}
	public int getEngineLiterCapacity() {
		return engineLiterCapacity;
	}
	public void setEngineLiterCapacity(int engineLiterCapacity) {
		this.engineLiterCapacity = engineLiterCapacity;
	}
	public int getEngineCC() {
		return engineCC;
	}
	public void setEngineCC(int engineCC) {
		this.engineCC = engineCC;
	}
	@Override
	public String toString() {
		return "Engine [engineMfgName=" + engineMfgName + ", engineLiterCapacity=" + engineLiterCapacity + ", engineCC="
				+ engineCC + "]";
	}
      
      
}
