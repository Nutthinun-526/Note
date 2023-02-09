
public class FictionBook implements Author,Book{

	private String author_name;
	private String email;
	private String title;
	private int publicYear;
	private String name;
	
	public FictionBook(String title, int publicYear) {
		this.title = title;
		this.publicYear = publicYear;
	}
	
	public void setAuthorName(String name) {
		this.name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public boolean checkFormatName() {
		
	}
	
	public String toString() {
		return this.title + " wrire by " +""+ "." + this.firtname + "(" + this.email + ")" +""
				+ "\nPublished for " + totalPublicYear() + " years.";
	}
}
