import javax.security.sasl.SaslClient;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EjemploTexto {
    public static void main(String[] args) {

        Libro libro = new Libro();
        //cada add es una pagina nueva
        libro.addTexto(new Texto("\"Ya habías pasado en anteriores ocasiones por el Cañón de la Serpiente, cuando ibas en bicicleta a visitar a tu tío Howard en el rancho Red Creek, pero nunca te habías fijado en la entrada de la cueva. Parece como si un desprendimiento de rocas la hubiese dejado al descubierto recientemente. " +
                "\nEl sol de la tarde ilumina la entrada de la cueva, pero su interior permanece en la más absoluta oscuridad. Das unos pasos hacia dentro para hacerte una idea de su tamaño." +
                "\nÁ medida que te vas acostumbrando a la oscuridad, empiezas a vislumbrar una especie de túnel iluminado débilmente por algún tipo de material fosforescente incrustado en las rocas. " +
                "\nLas paredes del túnel tienen una forma suave, como si hubiesen sido modeladas por el curso del agua." +
                "\n Cinco o seis metros más adelante, el túnel describe una curva. Te preguntas a dónde conduce. Das unos pasos más. Te pone nervioso estar solo en un lugar tan extraño. Das la vuelta y sales corriendo al exterior. " +
                "\nÁ juzgar por la oscuridad que reina en el exterior, está a punto de desencadenarse una tormenta. " +
                "\nDe pronto, te das cuenta que el sol ya se ha puesto y que la única iluminación procede de la pálida luna llena. Quizás has debido quedarte dormido un par de horas." +
                "\n Entonces recuerdas algo que todavía te resulta mucho más extraño: la noche anterior, la luna apenas estaba empezando su cuarto creciente. Empiezas a dudar del tiempo que has pasado dentro de la cueva. " +
                "\nNo tienes hambre, ni te parece que hayas podido quedarte dormido." +
                "\n No sabes si intentar volver a casa guiado por la luz de la luna o si esperar a que amanezca " +
                "para no correr el riesgo de resbalar en el escarpado sendero" +
                "\nOpción 1: Decides volver a casa." +
                "\nOpción 2: Decides esperar."));
        libro.addTexto(new Texto("\"Ya habías pasado en anteriores ocasiones por el Cañón de la Serpiente, cuando ibas en bicicleta a visitar a tu tío Howard en el rancho Red Creek, pero nunca te habías fijado en la entrada de la cueva. Parece como si un desprendimiento de rocas la hubiese dejado al descubierto recientemente. " +
                "\nEl sol de la tarde ilumina la entrada de la cueva, pero su interior permanece en la más absoluta oscuridad. Das unos pasos hacia dentro para hacerte una idea de su tamaño." +
                "\nÁ medida que te vas acostumbrando a la oscuridad, empiezas a vislumbrar una especie de túnel iluminado débilmente por algún tipo de material fosforescente incrustado en las rocas. " +
                "\nLas paredes del túnel tienen una forma suave, como si hubiesen sido modeladas por el curso del agua." +
                "\n Cinco o seis metros más adelante, el túnel describe una curva. Te preguntas a dónde conduce. Das unos pasos más. Te pone nervioso estar solo en un lugar tan extraño. Das la vuelta y sales corriendo al exterior. " +
                "\nÁ juzgar por la oscuridad que reina en el exterior, está a punto de desencadenarse una tormenta. " +
                "\nDe pronto, te das cuenta que el sol ya se ha puesto y que la única iluminación procede de la pálida luna llena. Quizás has debido quedarte dormido un par de horas." +
                "\n Entonces recuerdas algo que todavía te resulta mucho más extraño: la noche anterior, la luna apenas estaba empezando su cuarto creciente. Empiezas a dudar del tiempo que has pasado dentro de la cueva. " +
                "\nNo tienes hambre, ni te parece que hayas podido quedarte dormido." +
                "\n No sabes si intentar volver a casa guiado por la luz de la luna o si esperar a que amanezca para no correr el riesgo de resbalar en el escarpado sendero#"));
        libro.addTexto(new Texto("\"asd"));
        libro.addTexto(new Texto("Bien  abrigado  con  tus  toscas  botas  y  abrigo de  pieles,  sales  poco  después  de  amanecer  con los  demás,  un  andrajoso  grupo  formado  por una  treintena  de  hombres,  mujeres  y  chiquillos.  Afortunadamente  no  hay  ningún  niño  pequeño  ya  que  no  lograría  sobrevivir  al  duro viaje. El  sol  asoma  tímidamente  entre  las  nubes,  el  viento  es  moderado  y  avanzáis  con  rapidez  en  vuestra  larga  ruta  hacia  el  sur.  Al  cabo  de  unos  cuantos  días  de  viaje,  casi todos  están  al  borde  del  agotamiento.  Los  cazadores  no  han  conseguido  encontrar  ninguna presa.  No  es  posible  encender  un  fuego  por  las noches  y  la  única  forma  de  no  quedarse  helados  es  dormir  agrupados.  Sin  embargo,  una  semana  después  notas que  el  sol  brilla  con  más  calor  a  mediodía  y que  la  nieve  ya  no  es  tan  espesa.  Parece  que después  de  todo  lograréis  sobrevivir,  aunque debes  abandonar  toda  esperanza  de  volver  a tu  propia  época.#"));



        Scanner s = new Scanner(System.in);
        //Acorde a la opt que elija es para la pagina o seccion del arreglo que se va a ir.
        int options = 0;// las opciones que va a brindar cada pagina siempre va a ser 1 o 2
        int valueopt1 = 0;//pagina inicio opt 1 ex "x"
        int valueopt2 = 30;//pagina inicio opt2 ex "i"

        boolean flag = true;



        System.out.println("                                                                                           ADVERTENCIA");
        System.out.println("                                                                     ---------------------------------------------------------");
        System.out.println("¡No  leas  todo  el  libro  seguido,  del  principio  al fin!  En  sus  páginas  hallarás  muchas  y  variadas aventuras.  Á  medida  que  lo  vayas  leyendo,  te verás  obligado  a  elegir.  De  tu  decisión  depende que  la  aventura  constituya  un  éxito  o  un  fracaso,");
        System.out.println("Tú  serás  el  responsable  del  resultado  final.  Te corresponde  a  ti  tomar  las  decisiones.  Una  vez que  hayas  elegido,  sigue  las  instrucciones  para averiguar  qué  sucede  a  continuación. Recuerda  que  no  puedes  volverte  atrás.  Recapacita  antes  de  decidirte  por  una  opción.  Tu elección  puede  conducirte  al  desastre  o...  ¡a  un magnífico  final!");

        System.out.println("Toque la letra Y para continuar ");

        String teclacontinua = s.next();
        System.out.println("Elige con sabiduría: \n");
        System.out.println("\n" + libro.textoList[0].toString() + "\n");

        while(flag) {
            options = s.nextInt();
            System.out.println(" ");
            if (options == 1){
                valueopt1++;
                System.out.println(libro.textoList[valueopt1].toString() + "\n");
                if ((libro.textoList[valueopt1].toString().contains("#"))){
                    flag = false;
                }
            }else if (options == 2){
                System.out.println(libro.textoList[valueopt2].toString() + "\n");
            }

        }


    }
}
