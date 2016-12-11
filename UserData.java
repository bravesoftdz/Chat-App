package Application;

public class UserData {
	
	private String nickname, password, ip;
	
	public UserData(){}
	
	public UserData(String nickname, String password, String ip){
		this.nickname = nickname;
		this.password = password;
		this.ip = ip;
	};
	

	public void print() {
		System.out.println(this.nickname + "|" + this.password + "|" + this.ip);
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}
}
