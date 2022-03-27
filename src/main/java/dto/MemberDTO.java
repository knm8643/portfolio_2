package dto;

public class MemberDTO {
	
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
   private String name;
   private String pass;
   private int age;
		
   public MemberDTO() {}
   public MemberDTO(String name, String pass, int age) {
	   super();
	   this.name = name;
	   this.pass = pass;
	   this.age = age;
   }
}
