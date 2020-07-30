package base;

import java.util.Date;

public class Videojuego {
	private String name;
	private String edition;
	private String platform;
	private Date added_on;
	private Date release_date;
	
	public Videojuego(String name, String edition, String platform, Date added_on, Date release_date) {
		this.name = name;
		this.edition = edition;
		this.platform = platform;
		this.added_on = added_on;
		this.release_date = release_date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public Date getAdded_on() {
		return added_on;
	}

	public void setAdded_on(Date added_on) {
		this.added_on = added_on;
	}

	public Date getRelease_date() {
		return release_date;
	}

	public void setRelease_date(Date release_date) {
		this.release_date = release_date;
	}

	@Override
	public String toString() {
		return "Videojuego [name=" + name + ", edition=" + edition + ", platform=" + platform + ", added_on=" + added_on
				+ ", release_date=" + release_date + "]";
	}
	
	
}
