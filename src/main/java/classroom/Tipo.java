package classroom;

public enum Tipo {
	DISCIPLINAR(10),FUNDAMENTACION(20),ELECTIVA(30);
	
	;
	private int creditos;
	private Tipo(int credito) {
		this.creditos = credito;
		
	}
	public int getCreditos() {
		return creditos;
	}
	public void setCodigo(int credito) {
		this.creditos = credito;

	
	}
}
