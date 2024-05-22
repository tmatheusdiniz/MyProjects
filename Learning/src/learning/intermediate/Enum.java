package learning.intermediate;

public enum Enum {
	MANHA("manhã"), TARDE("tarde"), NOITE("noite");

	private String descricao;



	Enum(String descricao) {
        this.descricao = descricao;
    }

	public String getDescricao() {
		return descricao;
	}
}
