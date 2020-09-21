package task3;

class Desktop implements CPU, HDD, RAM, Computer {

	public String getCPU() {
		return "LGA";

	}

	public String getHDD() {
		return "HDD";

	}

	public String getRAM() {
		return "DIMM";

	}

	public String type() {

		return "Desktop";
	}

}