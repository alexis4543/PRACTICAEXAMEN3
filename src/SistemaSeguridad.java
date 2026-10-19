public class SistemaSeguridad {
    private String nombreSistema;
    private int intentosFallidos;

    public void setNombreSistema(String nombreSistema) {
        if (nombreSistema == null || nombreSistema.isBlank()){
            System.out.println("El nombre del sistema no puede estar vacio ni ser null");
        }else{
            this.nombreSistema = nombreSistema;
        }

    }

    public String getNombreSistema() {
        return nombreSistema;
    }

    public int getIntentosFallidos() {
        return intentosFallidos;
    }

    public SistemaSeguridad(String nombreSistema) {
        setNombreSistema(nombreSistema);
        this.intentosFallidos=0;
    }

    public void registrarIntentoFallido(){
        this.intentosFallidos ++;
        System.out.println("Se ha registrado un intento fallido");
    }

    public void reiniciarContador(){
        this.intentosFallidos=0;
        System.out.println("Se ha reiniciado el contador correctamente");
    }

    public void mostrarEstado(){
        System.out.println("El nombre del sistema es: "+nombreSistema);
        System.out.println("El numero de intentos fallidos es:"+intentosFallidos);
        if (intentosFallidos >=3){
            System.out.println("EL SISTEMA ESTA BLOQUEADO 3 O MAS INTENTOS FALLIDOS");
        }else{
            System.out.println("El sistema se encuentra habilitado");
        }

    }
}
