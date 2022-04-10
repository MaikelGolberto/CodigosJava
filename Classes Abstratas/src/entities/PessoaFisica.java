package entities;

public class PessoaFisica extends Pessoa {
	
	private Double gastosSaude;
	
	public PessoaFisica() {
	}	
	
	public PessoaFisica(String name, Double rendaAnual, Double gastosSaude) {
		super(name, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public double imposto() {
		double imp = 0.0;
		if(rendaAnual < 20000.0 && gastosSaude <= 0.0) {
			imp = rendaAnual * 0.15;
		} else if (rendaAnual < 20000.0 && gastosSaude > 0.0) {
			imp = (rendaAnual * 0.15) - (gastosSaude * 0.50);
		} else if (rendaAnual >= 20000.0 && gastosSaude <= 0.0) {
			imp = rendaAnual * 0.25;
		} else {
			imp = (rendaAnual * 0.25) - (gastosSaude * 0.50);
		}
		return imp;
	}

}
