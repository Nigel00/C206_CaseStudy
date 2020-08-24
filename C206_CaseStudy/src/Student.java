
public class Student {

	private String id;
	private String name;
	private String level;
	private String classroom;
	private String teacher;
	private String parentname;
	private String parentemail;
	public Student(String id, String name, String level, String classroom, String teacher, String parentname,
			String parentemail) {
	
		this.id = id;
		this.name = name;
		this.level = level;
		this.classroom = classroom;
		this.teacher = teacher;
		this.parentname = parentname;
		this.parentemail = parentemail;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getClassroom() {
		return classroom;
	}
	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public String getParentname() {
		return parentname;
	}
	public void setParentname(String parentname) {
		this.parentname = parentname;
	}
	public String getParentemail() {
		return parentemail;
	}
	public void setParentemail(String parentemail) {
		this.parentemail = parentemail;
	}
	
	
	
}
