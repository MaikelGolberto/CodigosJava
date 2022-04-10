package entities;

public class PessoaJuridica extends Pessoa {
	
	private Integer numFuncionarios;
	
	public PessoaJuridica() {
	}
	
	public PessoaJuridica(String name, Double rendaAnual, Integer numFuncionarios) {
		super(name, rendaAnual);
		this.numFuncionarios = numFuncionarios;
	}

	public Integer getNumFuncionarios() {
		return numFuncionarios;
	}

	public void setNumFuncionarios(Integer numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}

	@Override
	public double imposto() {
		double imp = 0.0;
		if (numFuncionarios < 10) {
			imp = rendaAnual * 0.16;
		} else {
			imp = rendaAnual * 0.14;
		}
		return imp;
	}
}
