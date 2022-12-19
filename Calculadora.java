package CalcPackage;

public class Calculadora{
	public double a;
	public double b;
	public ICalculadora _calc;
	public Calculadora(double a, double b, ICalculadora _calc) {
		this.a = a;
		this.b = b;
		this._calc = _calc;
	}
	
	public double calculando() {
		return _calc.calcular(a, b);
	}
	
	

}
