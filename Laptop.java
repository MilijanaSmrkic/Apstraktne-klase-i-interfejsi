package task3;

class Laptop implements CPU, HDD, RAM, Computer {

	public String getCPU() {
		return "BGA";

	}

	public String getHDD() {
		return "HDD";

	}

	public String getRAM() {
		return "SODIMM";

	}

	public String type() {

		return "Laptop";
	}

}
