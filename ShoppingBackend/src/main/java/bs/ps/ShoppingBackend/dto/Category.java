package bs.ps.ShoppingBackend.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Category {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String description;
	
	@Column(name="image_url")
	private String img_url;
	private String is_active;
	public Category() {
	
	}
	public Category(int id, String name, String description, String img_url, String is_active) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.img_url = img_url;
		this.is_active = is_active;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImg_url() {
		return img_url;
	}
	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}
	public String getIs_active() {
		return is_active;
	}
	public void setIs_active(String is_active) {
		this.is_active = is_active;
	}
	
	
	
}
