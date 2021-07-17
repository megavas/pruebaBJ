package semana3.agregacion;

public class Main{
    public static void main(String[] args) throws Exception{
        Empleado emp1 = new Empleado("Jorge", "Mac�as");
        Empleado emp2 = new Empleado("�ngela", "Cucal�n");
        Empleado emp3 = new Empleado("Irma", "Caceres");
        // Array que almacena hasta 200 empleados
        Empleado listaEmpleados[] = new Empleado[200];
        listaEmpleados[0] = emp1;
        listaEmpleados[1] = emp2;
        Banco banco= new Banco("Bancolombia", listaEmpleados);
        banco.agregarEmpleado(emp3, 2);
    }
}