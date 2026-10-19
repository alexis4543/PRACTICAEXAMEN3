//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
SistemaSeguridad s1 =new SistemaSeguridad("SEGURIDAD1");

s1.mostrarEstado();
System.out.println();
s1.registrarIntentoFallido();
s1.registrarIntentoFallido();
s1.registrarIntentoFallido();
s1.registrarIntentoFallido();
s1.mostrarEstado();
System.out.println();
s1.reiniciarContador();
s1.mostrarEstado();

}
