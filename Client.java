import java.rmi.*;
import java.util.Scanner; 
public class Client { 
public static void main(String[] args) { 
try {
MyInterface service1 = (MyInterface) Naming.lookup("rmi://127.0.0.1:1250/server"); 
int chx=0; 
while(chx!=4){
System.out.println(" 1 - Debiter \n 2 - Crediter \n 3 - lireSolde \n 4 - Quitter"); 
Scanner sc=new Scanner(System.in); 
chx=sc.nextInt();
if(chx==1){ 
System.out.println("Saisir le montant à débiter : "); 
double md=sc.nextDouble(); 
service1.debiter(md); 
} 
else if(chx==2){ 
System.out.println("Saisir le montant à créditer ; ");
double mc =sc.nextDouble();
service1.crediter(mc); 
} 
else if(chx==3){ 
System.out.println(service1.lireSolde()); 
} 
} 
} catch (Exception e) { 
System.out.println("Error"); 
System.out.println(e.toString()); 
} 
} 
}
