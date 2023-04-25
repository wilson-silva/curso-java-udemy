package entities;

import java.util.Date;
import java.util.Objects;

public class Log {
	private String username;
	private Date moment;
	
	public Log(String username, Date moment) {
		this.username = username;
		this.moment = moment;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	@Override
	public int hashCode() {
		return Objects.hash(username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Log other = (Log) obj;
		return Objects.equals(username, other.username);
	}
	
	
	

}
