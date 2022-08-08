package calculadora;
import java.util.Scanner;

public class Calculadora {
//MENU PRINCIPAL    
    public static void main(String[] args) {

        int opcion = 0;
      
        do{
        System.out.println("--------------MENU--------------");
        
        System.out.println("1. Aritmetica");
        System.out.println("2. Trigonometria");
        System.out.println("3. Estadistica");
        System.out.println("4. Calculo");
        System.out.println("5. Salir");
        System.out.print("Ingrese una opcion : ");
        
        Scanner scan = new Scanner(System.in);
        opcion = scan.nextInt();

             switch (opcion) {
            case 1:
                Aritmetica();
                break;
            case 2:
                Trigonometria();
                break;
            case 3:
                Estadistica();
                break;
            case 4:
                Calculo();
            break;
            case 5:
                System.out.println("Programa cerrado");
                System.exit(0);
            default:
                System.out.println("Opcion no Valida");
                break;
        }
        }while(opcion!=5);              
    }

// MENU ARITMETICA
    public static void Aritmetica() {
        
        Scanner leer =new Scanner(System.in);
        
        int num1 =0;
        int num2 =0;
        int resultado;
        int opcion = 0;
        Scanner espera = new Scanner(System.in);
        boolean seguirEnMenu = true;
        
        
        while (seguirEnMenu) {
            System.out.println("\n\n");
           
            System.out.println("-----------------------ARITMETICA-----------------------");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Pontencia");
            System.out.println("6. Regresar");
            System.out.print("Ingrese una opcion: ");
    
            opcion = leer.nextInt();         
            
            switch (opcion) {
                case 1:
                    System.out.println("---------------------SUMA---------------------"); 
                    System.out.println("Ingrese un numero : ");
                    num1 =leer.nextInt();       
                    System.out.println("Ingrese otro numero : ");
                    num2 =leer.nextInt();
                    
                    resultado= num1+num2;
                    
                    System.out.println("La Suma es "+resultado);
                   espera.nextLine();
                    break;
                case 2:
                    System.out.println("---------------------RESTA---------------------");
                    System.out.println("Ingrese un numero : ");
                    num1 =leer.nextInt();       
                    System.out.println("Ingrese otro numero : ");
                    num2 =leer.nextInt();
                    
                    resultado= num1-num2;
                    System.out.println("La Resta es "+resultado);
                   espera.nextLine();
                    
                    break;
                case 3:
                     System.out.println("---------------------MULTIPLICACION---------------------");
                     System.out.println("Ingrese un numero : ");
                     num1 =leer.nextInt();       
                     System.out.println("Ingrese otro numero : ");
                     num2 =leer.nextInt();
                    
                     resultado= num1*num2;
                     System.out.println("La Multiplicacion es "+resultado);
                   espera.nextLine();
                
                    break;
                case 4:
                     System.out.println("---------------------DIVISION---------------------");
                     System.out.println("Ingrese un numero : ");
                     num1 =leer.nextInt();       
                     System.out.println("Ingrese otro numero : ");
                     num2 =leer.nextInt();
                     if(num2==0){
                         System.out.println("! No se Puede dividir entre 0 ! ");
                         espera.nextLine();
                         break;
                     }else
                    
                     resultado= num1/num2;
                    System.out.println("La Division es "+resultado);
                   espera.nextLine();
                   
                    break;
                case 5:
                     System.out.println("---------------------POTENCIA---------------------");
                     System.out.println("Ingrese la base : ");
                    num1 =leer.nextInt();       
                    System.out.println("Ingrese la potencia a elevar : ");
                    num2 =leer.nextInt();                   
                    System.out.println("La potencia es : "+ potencia(num1,num2));
                   
                    espera.nextLine();
                   
                    break;
                case 6:
                   seguirEnMenu=false;
                    break;
            
                default:
                    System.out.println("Opcion Invalida");
                    break;
            }            
        }
    }
// MENU TRIGONOMETRIA   
    public static void Trigonometria(){
        
        Scanner leer =new Scanner(System.in);
        
     
        double num1 =0;
        int opcion = 0;
        Scanner espera = new Scanner(System.in);
        boolean seguirEnMenu = true;       
        
        while (seguirEnMenu) {
            System.out.println("\n\n");
           
            System.out.println("-----------------------TRIGONOMETRIA-----------------------");
            System.out.println("1. Seno");
            System.out.println("2. Coseno");
            System.out.println("3. Tangente");
            System.out.println("4. Regresar");
            System.out.print("Ingrese una opcion: ");
    
            opcion = leer.nextInt();         
            
            switch (opcion) {
                case 1:
                    System.out.println("---------------------SENO---------------------"); 
                    
                    System.out.print("Ingrese un numero : ");
                    num1 = leer.nextDouble();
                    System.out.println("Seno de "+num1+" es : "+ seno(num1));
                    espera.nextLine();

                    break;
                case 2:
                    System.out.println("---------------------COSENO---------------------");
                    System.out.print("Ingrese un numero : ");
                    num1 = leer.nextDouble();
                    System.out.println("Coseno de "+num1+" es : "+ coseno(num1));
                    espera.nextLine();
                    
                    break;
                case 3:
                    System.out.println("---------------------TANGENTE---------------------");                                      
                    System.out.print("Ingrese un numero : ");
                    num1 = leer.nextDouble();
                    System.out.println("La tangente de "+num1+" es : "+ tangente(num1));
                    espera.nextLine();
                    break;
            
                case 4:
                   seguirEnMenu=false;
                    break;
            
                default:
                    System.out.println("Opcion Invalida");
                    break;
            }            
        }
            
    }
// MENU ESTADISTICA    
    public static void Estadistica(){
        Scanner leer =new Scanner(System.in);
        
        int tamVector = 0;
        double mediana;
        int opcion = 0;
        Scanner espera = new Scanner(System.in);
        boolean seguirEnMenu = true;       
        
        while (seguirEnMenu) {
            System.out.println("\n\n");
           
            System.out.println("-----------------------ESTADISTICA-----------------------");
            System.out.println("1. Promedio");
            System.out.println("2. Media");
            System.out.println("3. Moda");
            System.out.println("4. Varianza");
            System.out.println("5. Desviacion Estandar");
            System.out.println("6. Regresar");
            System.out.print("Ingrese una opcion: ");
    
            opcion = leer.nextInt();         
            
            switch (opcion) {
                case 1:
                    double sumaVector=0;
                    System.out.println("-------------PROMEDIO-------------");
                    System.out.println("Ingrese el tamano del vector");
                    tamVector= leer.nextInt();
                    System.out.println("Ingrese los datos del vector : ");
                    String cadena = leer.next();
                    String[] datosSeparados = cadena.split(",");

                    double[] datosConvertidos = new double[tamVector];
                    
                    if(datosSeparados.length==tamVector){
                        
                    for (int i = 0; i < datosSeparados.length; i++) {
                        datosConvertidos[i] = Double.valueOf(datosSeparados[i]);
                    }
                    
                    //SUMANDO CADA DATO
                    for(int i=0; i<datosConvertidos.length; i++){
                        sumaVector += datosConvertidos[i];
                    }                          
                    
                    double promedio = sumaVector / datosSeparados.length;
                   
                   //System.out.println("datosSeparados : "+ datosSeparados.length);
                   //System.out.println("datosConvertidos : "+ datosConvertidos.length);
                    System.out.println("El promedio es : "+promedio);
                    espera.nextLine();
                    break;
                    }else{
                        System.out.println("La cantidad de datos no coincide con"
                                + " el tamano del vector");
                        espera.nextLine();
                        break;   
                    }
                case 2:
                    System.out.println("---------------------MEDIA---------------------");   
                    
                    System.out.println("Ingrese el tamano del vector");
                    tamVector= leer.nextInt();
                    System.out.println("Ingrese los datos del vector : ");
                    cadena = leer.next();
                    
                    datosSeparados = cadena.split(",");
                    datosConvertidos = new double[tamVector];
                    
                    if(datosSeparados.length==tamVector){
                        
                        for (int i = 0; i < datosSeparados.length; i++) {
                            datosConvertidos[i] = Double.valueOf(datosSeparados[i]);
                      }
                    //MEDIANA DE DATOS
                       if (tamVector % 2 == 0){
                            mediana = ((double)datosConvertidos[tamVector/2] + (double)datosConvertidos[tamVector/2 - 1])/2;
                       }else
                            mediana = (double) datosConvertidos[tamVector/2];
                       
                    System.out.println("El promedio es : "+mediana);
                    espera.nextLine();
                    break;
                    
                    }else{
                        System.out.println("La cantidad de datos no coincide con"
                                + " el tamano del vector");
                        espera.nextLine();
                        break;
                    }
                  
                case 3:
                    System.out.println("---------------------MODA---------------------");                                      
                  System.out.println("Ingrese el tamano del vector");
                    tamVector= leer.nextInt();
                    System.out.println("Ingrese los datos del vector : ");
                    cadena = leer.next();
                    
                    datosSeparados = cadena.split(",");
                     int[] vector = new int[tamVector];
                    
                    if(datosSeparados.length==tamVector){
                        
                        for (int i = 0; i < datosSeparados.length; i++) {
                            vector[i] = Integer.valueOf(datosSeparados[i]);
                      }
                        System.out.println("La moda es : "+moda(vector,tamVector));
                        espera.nextLine();
                    }else{
                        System.out.println("La cantidad de datos no coincide con "
                                + "el tamano del vector");
                        espera.nextLine();
                        break;
                    }
                        
                    break;
                case 4:
                    System.out.println("---------------------VARIANZA---------------------");
                    double sum=0;
                    System.out.println("Ingrese el tamano del vector");
                    tamVector= leer.nextInt();
                    System.out.println("Ingrese los datos del vector : ");
                    cadena = leer.next();
                    datosSeparados = cadena.split(",");

                    double[] vectorVarianza = new double[tamVector];
                    
                    if(datosSeparados.length==tamVector){
                        
                    for (int i = 0; i < datosSeparados.length; i++) {
                        vectorVarianza[i] = Double.valueOf(datosSeparados[i]);
                    }
                    //SUMANDO CADA DATO
                    for(int i=0; i<vectorVarianza.length; i++){
                        sum += vectorVarianza[i];
                    }  
                    double promedio = sum / datosSeparados.length;
                    //Varianza
                        System.out.println("Varianza : "+varianza(vectorVarianza,tamVector,promedio));
                        espera.nextLine();
                    }else{
                        System.out.println("La cantidad de datos no coincide con"
                                + " el tamano del vector");
                        espera.nextLine();
                        break;
                    }
                    
                    break;
                case 5:
                    double promedio=0;
                    System.out.println("---------------------DESVIACION ESTANDAR---------------------");                                      
                    sum=0;
                    System.out.println("Ingrese el tamano del vector");
                    tamVector= leer.nextInt();
                    System.out.println("Ingrese los datos del vector : ");
                    cadena = leer.next();
                    datosSeparados = cadena.split(",");

                    vectorVarianza = new double[tamVector];
                    
                    if(datosSeparados.length==tamVector){
                        
                    for (int i = 0; i < datosSeparados.length; i++) {
                        vectorVarianza[i] = Double.valueOf(datosSeparados[i]);
                    }
                    //SUMANDO CADA DATO
                    for(int i=0; i<vectorVarianza.length; i++){
                        sum += vectorVarianza[i];
                    }  
                     promedio = sum / datosSeparados.length;
                     //Mandando a la varianza
                     double varianza = varianza(vectorVarianza,tamVector,promedio);
                     //desv= raiz(varianza)
                        System.out.println("Desviacion Estandar : "+raiz(varianza));
                        espera.nextLine();
                    }else{
                        System.out.println("La cantidad de datos no coincide con "
                                + "el tamano del vector");
                        espera.nextLine();
                        break;
                    }
                    break;
            
                case 6:
                   seguirEnMenu=false;
                    break;
            
                default:
                    System.out.println("Opcion Invalida");
                    break;
            }            
        }
    }
// MENU CALCULO    
    public static void Calculo() {
        
        Scanner leer =new Scanner(System.in);

        int opcion = 0;
        int nFilas;
        int nColumnas;
        Scanner espera = new Scanner(System.in);
        boolean seguirEnMenu = true;
        
        
        while (seguirEnMenu) {
            System.out.println("\n\n");
           
            System.out.println("-----------------------ARITMETICA-----------------------");
            System.out.println("1. Resolver sistema de ecuaciones lineales Gauss Jordan");
            System.out.println("2. Regresar");
            System.out.print("Ingrese una opcion: ");
    
            opcion = leer.nextInt();         
            
            switch (opcion) {
                case 1:
                        
               Scanner input = new Scanner(System.in);
               System.out.print("Ingresa el numero de filas: ");
               int nfilas = input.nextInt();
               System.out.print("Ingresa el numero de columnas: ");
               int ncolumnas = input.nextInt();
               int[][] matriz = new int[nfilas][ncolumnas];
               System.out.println("Ingresa los elementos de la matriz: ");
               
               for (int x = 0; x < nfilas; x++) {
                   for (int y = 0; y < ncolumnas; y++) {
                       matriz[x][y] = input.nextInt();
                   }
               }
                System.out.println("Matriz Ingresada");
                
                for (int i = 0; i < nfilas; i++) {
                   for (int l = 0; l < ncolumnas; l++) {
                       System.out.print(matriz[i][l] + " ");
                   }
                      }
               break; 
                case 2:
                   seguirEnMenu=false;
                    break;
            
                default:
                    System.out.println("Opcion Invalida");
                    break;
            }            
        }
    }
    
    public static double varianza(double[] vectorVarianza,int tamVector,double promedio){
        double varianza=0;
        for (int i = 0; i <  tamVector; i++){
        varianza += potencia(vectorVarianza[i]-promedio,2);
    }
        varianza /= tamVector;
    return varianza;
    }
    
    public static int moda( int [ ]vector,int tamVector ) {
    int x = 0; 
    int y = 0;
    int aux =0;//variable auxiliar
    int frecAux;
    int frecModa = 0;
    int moda = -1; 
  
    // ORDENA DE Menos A Mayor
     for (x= 0; x<tamVector - 1; x++ )
         for (y= x + 1;y<tamVector;y++ )
        
          if ( vector[x] > vector[y] ) {
            aux = vector[y];
            vector[y] = vector[x];
            vector[x ] = aux;
          }
     // FRECUENCIA CON LA QUE APARECEN LOS NUMERO
    for ( x = 0; x < tamVector; x++ ) {
      frecAux = 1; 
      for ( y = x + 1; y <tamVector; y++ ) {
        if (vector[x] == vector[y ] )
          frecAux++;
      }
      if ( frecAux > frecModa ) {
        frecModa = frecAux;
        moda =vector[x];
      }
    }
    return moda;
  }
    
    public static double raiz(double num) {
	
        double aux;
	double raiz = num / 2;
	do {
            aux = raiz;
            raiz = (aux + (num / aux)) / 2;
	} while ((aux - raiz) != 0);
	return raiz;
    }
    
    public static double potencia(double base, double potencia){
   if(potencia == 0) return 1;
   if(potencia == 1) return base;
   if (potencia == -1) return 1 / base;
   double res = base;
   for(int x = 1; x<potencia; x++){
       res = res * base;
   }
   return res;
}
     
    public static double seno(double num1) {
        double pi = 3.14159265;
        double res=0;
        double rads = (num1*pi / 180);
        //seno(x)
        for (int n = 0; n < 10; n++) {
            double fact = factorial(2*n+1);
            res += potencia(-1, n) * potencia(rads, 2*n+1) / fact;
        }
        return res;
    }

    public static double coseno(double num1){
        double pi = 3.14159265;
        double res=0;
        double rads = (num1*pi / 180);
        //coseno(x)
        for (int n = 0; n < 10; n++) {
            double fact = factorial(2*n);
            res += potencia(-1, n) * potencia(rads, 2*n) / fact;
        }
        return res;
    }   
    
    public static double tangente(double num1){
        //Tangente= sen/coseno
        return seno(num1) / coseno(num1);
    }

    public static double factorial(double x){
        double a = 1;
        while(x>0){
            a = a * x;
            x--;
        }
        return a;
    } 

}
