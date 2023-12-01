package entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vote")
public class vote {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String teacherno;
	private String teachername;
	private Integer vote;
	public vote() {
		super();
		// TODO Auto-generated constructor stub
	}
	public vote(String teacherNo, String teacherName, Integer vote) {
		super();
		this.teacherno = teacherNo;
		this.teachername = teacherName;
		this.vote = vote;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTeacherno() {
		return teacherno;
	}
	public void setTeacherno(String teacherno) {
		this.teacherno = teacherno;
	}
	public String getTeachername() {
		return teachername;
	}
	public void setTeachername(String teachername) {
		this.teachername = teachername;
	}
	public Integer getVote() {
		return vote;
	}
	public void setVote(Integer vote) {
		this.vote = vote;
	}
	
	

}