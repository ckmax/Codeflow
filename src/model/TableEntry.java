package model;

public class TableEntry {

	private String name;
	private String info;
	
	public TableEntry(String name, String info){
		this.name = name;
		this.info = info;
	}
	
	public TableEntry(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getInfo(){
		return info;
	}
	
	public void setInfo(String info){
		this.info = info;
	}
}
