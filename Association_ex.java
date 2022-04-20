package example;
import java.util.*;

class progLang{
	private String lang;
	public void setLang(String lang)
	{
		this.lang=lang;
	}
	public String getLang() {
		return lang;
	}
}

class dev{
	private String name;
	List <progLang> langlist;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public List<progLang> getLang(){
		return langlist;
	}
	public void setLang(List<progLang> langlist) {
		this.langlist=langlist;
	}
}


public class Association_ex {
	public static void main(String args[]) {
		dev d=new dev();
		d.setName("Kumar");
		progLang pl=new progLang();
		pl.setLang("java");
	List<progLang> list=new ArrayList<>();
	list.add(pl);
	List<dev> list1=new ArrayList<>();
	list1.add(0, d);
	
//		list.add(pl);
//		d.setLang(list);l
		System.out.println(d.getName());
		System.out.println(pl.getLang());
		
	}
}
