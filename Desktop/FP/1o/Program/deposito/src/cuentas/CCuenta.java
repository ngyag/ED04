package cuentas;
/** 
 * @author 15yag
 * @version 1.0
 * Esta clase funciona como un cajero 
 * */
public class CCuenta {


    private String nombre;
    /**
     * El nombre del titular de la cuenta
     */
    private String cuenta;
    /**
     * El identificador de la cuenta bancaria
     */
    private double saldo;
    /**
     * El saldo disponible en la cuenta
     */
    private double tipoInter√s;

    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    public double estado()
    {
        return getSaldo();
    }

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getTipoInter√s() {
		return tipoInter√s;
	}

	public void setTipoInter√s(double tipoInter√s) {
		this.tipoInter√s = tipoInter√s;
	}
}
