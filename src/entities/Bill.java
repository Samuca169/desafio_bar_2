package entities;

public class Bill {

	private Character gender;
	private Integer beer;
	private Integer barbecue;
	private Integer softDrink;
	
	public Bill() {
	}

	public Bill(Character gender, Integer beer, Integer barbecue, Integer softDrink) {
		this.gender = gender;
		this.beer = beer;
		this.barbecue = barbecue;
		this.softDrink = softDrink;
	}

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	public Integer getBeer() {
		return beer;
	}

	public void setBeer(Integer beer) {
		this.beer = beer;
	}

	public Integer getBarbecue() {
		return barbecue;
	}

	public void setBarbecue(Integer barbecue) {
		this.barbecue = barbecue;
	}

	public Integer getSoftDrink() {
		return softDrink;
	}

	public void setSoftDrink(Integer softDrink) {
		this.softDrink = softDrink;
	}
	
	public double cover() {
		double tax = 0.0;
		double consumo = feeding();
		if (consumo < 30.00) {
			tax = 4.00;
		}
		return tax;
	}
	
	public double feeding() {
		double valor = (beer * 5.00) + (softDrink * 3.00) + (barbecue * 7.00);
		return valor;
	}
	
	public double ticket() {
		double valor = 0.0;
		if (gender == 'F') {
			valor = 8.00;
		}else {
			if (gender == 'M') {
				valor = 10.00;
			}
		}
		return valor;
	}
	
	public double total() {
		double valor = feeding() + cover() + ticket();
		return valor;
	}
}
