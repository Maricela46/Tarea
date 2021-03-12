
package metodosnumericos;

public class errores {

    private double ValorReal;
    private double ValorAproximado;

    public errores(double ValorReal, double ValorAproximado) {
        this.ValorReal = ValorReal;
        this.ValorAproximado = ValorAproximado;
    }

    public double getValorReal() {
        return ValorReal;
    }

    public double getValorAproximado() {
        return ValorAproximado;
    }

    public void setValorReal(double ValorReal) {
        this.ValorReal = ValorReal;
    }

    public void setValorAproximado(double ValorAproximado) {
        this.ValorAproximado = ValorAproximado;
    }
    
    double ErrorAbsoluto() {
        double ErrorR = Math.abs(ValorAproximado - ValorReal);
        return ErrorR;
    }

    double ErrorRelativo() {
        double ErrorA = (ErrorAbsoluto()) / ValorReal;
        return ErrorA;
    }

    double ErrorRelativoPorcentual() {
        double ERP = (ErrorRelativo()) * 100;
        return ERP;
    
}

}
