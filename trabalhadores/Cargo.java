

public enum Cargo {
	MED("medico",8), TRAD("tecnico em radiologia",4), DEV("programador de sistemas",8), PA("piloto de aviao",5);
	
	String descricao;
	int horasMaximas;
	
	private Cargo(String descricao, int horasMaximas) {
		this.descricao = descricao;
		this.horasMaximas = horasMaximas;
	}
	
	public String getdescricao() {
		return descricao;
	}
	
	public int getHorasMaximas() {
		return horasMaximas;
	}
	
	

}
