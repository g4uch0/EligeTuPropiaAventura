import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class EjemploTexto {
    public static void main(String[] args) throws InterruptedException {

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
        libro.addTexto(new Texto("A  medida  que  aclara  el  día  te  das  cuenta que  no  estás  en  el  buen  camino.  El  cañón  parece  menos  profundo  y  el  cauce  del  río  está sembrado  de  cantos  rodados  que  nunca  habías  visto.  El  viento  es  helado  a  pesar  de  estar  en pleno  verano.  Al  subir  a  un  terreno  más  elevado  descubres  manchas  de  nieve.  Desde  un  risco,  divisas  una  llanura  árida  con  lagos  helados y,  a  lo  lejos,  una  cadena  montañosa  con  picos cubiertos  por  la  nieve.  Empiezas  a  pensar  que no  se  trata  simplemente  de  que  te  hayas  perdido;  te  has  perdido  en  el  tiempo  y,  por  alguna extraña  razón,  has  sido  transportado  varios millones  de  años  atrás  a  la  Edad  del  Hielo. Te  diriges  a  una  de  las  colinas  que  bordean el  cañón,  buscando  un  lugar  para  resguardarte  del  viento  y  descubres  la  entrada  de  otra cueva.  Sientes  la  tentación  de  penetrar  en  ella aunque  piensas  que  deberías  seguir  andando para  ver  si  de  algún  modo  logras  llegar  a  un sitio  conocido."));
        libro.addTexto(new Texto("Al  entrar en la cueva caminas  a  lo  largo  de un  pasadizo  hasta  llegar  a  una  amplia  cámara.  El  humo  procede  de  unas  vasijas de  barro.  Unos  hombres  bajos  y  robustos,  con  pelo negro,  muy  lacio  y  rasgos  primitivos,  están ocupados  pintando  sobre  las  paredes  de  la cueva.  Visten  con  pieles  de  animales. Te  quedas  paralizado  por  el  miedo  cuando los  habitantes  de  la  cueva  abandonan  su  trabajo  para  correr  hacia  ti  con  muestras  de asombro. Adoptas  una  actitud  amistosa.  Se  dirigen  a  ti  dando  muestras  de  simpatía,  pero  no  logras  entender  lo  que  dicen  ni tampoco  ellos  pueden  entenderte  a  ti. Algunos hombres  vuelven  a  su  pintura. Poco  a  poco  entablas  amistad  y  aprendes unas  cuantas  palabras. Un  día  reciben  la  visita  de  otras  gentes.  Tú no  los  habías  visto  anteriormente,  pero  tus amigos  los  reciben  calurosamente  y  celebran una  gran  fiesta. Al  terminar la comida empaquetan  sus  pertenencias  y  te  recomienda que  hagas  lo  mismo.  Sin  lugar  a  dudas,  se  proponen  emigrar  a  un  clima  más  cálido.  Probablemente  deberías  ir  con  ellos,  pero  quieres volver  a  tu  casa  y  saber  que  la  única  posibilidad  de  lograrlo  es  encontrando  el  camino  de vuelta  a  través  de  la  Cueva  del  Tiempo. "));
        libro.addTexto(new Texto("Bien  abrigado  con  tus  toscas  botas  y  abrigo de  pieles,  sales  poco  después  de  amanecer  con los  demás,  un  andrajoso  grupo  formado  por una  treintena  de  hombres,  mujeres  y  chiquillos.  Afortunadamente  no  hay  ningún  niño  pequeño  ya  que  no  lograría  sobrevivir  al  duro viaje. El  sol  asoma  tímidamente  entre  las  nubes,  el  viento  es  moderado  y  avanzáis  con  rapidez  en  vuestra  larga  ruta  hacia  el  sur.  Al  cabo  de  unos  cuantos  días  de  viaje,  casi todos  están  al  borde  del  agotamiento.  Los  cazadores  no  han  conseguido  encontrar  ninguna presa.  No  es  posible  encender  un  fuego  por  las noches  y  la  única  forma  de  no  quedarse  helados  es  dormir  agrupados.  Sin  embargo,  una  semana  después  notas que  el  sol  brilla  con  más  calor  a  mediodía  y que  la  nieve  ya  no  es  tan  espesa.  Parece  que después  de  todo  lograréis  sobrevivir,  aunque debes  abandonar  toda  esperanza  de  volver  a tu  propia  época.#"));
        libro.addTexto(new Texto("Recoges  tus  escasas  pertenencias,  de  las cuales  la  más  apreciable  es  un  cuchillo  hecho de  un  colmillo  de  mamut.  Dices  adiós  a  tus amigos  y  te  alejas  andando  con  dificultad  sobre  la  nieve  intentando  rehacer  el  camino  de vuelta  a  la  Cueva  del  Tiempo.  Aunque  el  frío es  muy  intenso,  el  radiante  sol  aviva  tus  esperanzas. Tu  estancia  con  los  habitantes  de  la  cueva te  ha  fortalecido  y  tus  toscos  ropajes  de  pieles te  protegen  admirablemente  del  frío.  Logras encontrar  el  camino  a  lo  largo  del  cañón  y,  al cabo  de  unas  horas,  alcanzas  la  entrada  de  la cueva,  ahora, casi  totalmente  cubierta  por  la nieve. Estás  agotado  por  la  larga  caminata  y  te  lloran  los  ojos  a  causa  del  fuerte  viento.  Casi  no percibes  la  gran  figura  gris  agazapada  a  poca distancia  de  la  entrada  de  la  cueva  hasta  que llega  a  ti  el  aullido  gutural  del  lobo.  En  ese mismo  instante,  te  enfrentas  directamente  a su  fría  y  cruel  mirada. Sacas rápidamente tu cuchillo de marfil...pero nunca serás más rápido que un lobo. #"));
        libro.addTexto(new Texto("Sigues  adelante  por  un  sendero  que  sube una  empinada  cuesta.  Puedes  oír  unos  fuertes sonidos  que  llegan  desde  un  barranco  cerca- no;  probablemente  pertenecen  a  algún  animal de  gran  tamaño.  Trepas  a  un  risco  y  contemplas  uno  de  los  mayores  mamíferos  terrestres que  haya  existido  jamás:  el  mamut  lanudo.  Su impresionante  volumen  resulta  todavía  mucho  mayor  debido  a  la  espesa  capa  de  pelo que  le  cubre.  Estás  helado,  cansado  y  desesperado.  Desde  el  saliente  rocoso  en  el  que  te  encuentras, a  poca  distancia  del  mamut,  podrías  saltar  sobre  su  lomo,  refugiarte  en  su  cálido  pelo  y  dejarte  llevar."));
        libro.addTexto(new Texto("Cuando  caes  sobre  él,  el  mamut  se  sacude como  un  caballo  que  ahuyenta  las  moscas. Empieza  a  avanzar  pesadamente  por  el  valle, aparentemente  sin  notar  que  sigues  abrazado a  su  peludo  lomo  disfrutando  del  calor  y  del paseo. Llega  a  un  terreno  elevado,  mordisquea una  corteza  y  sigue  adelante.  Quizá  te  lleve hasta  algunos  habitantes  de  las  cuevas  que puedan  darte  comida  y  abrigo. De  pronto,  se  para  y  vuelve  la  cabeza  como para  oír  mejor.  Levantas  la  vista  y  descubres unas  figuras  humanas  que  se  acercan  desde dos  lados  distintos.  Llevan  lanzas  y  mazas.  El mamut  empieza  a  correr  y  tú  te  agarras  fuertemente.  Los  cazadores  os  persiguen  dando alaridos.  No  puedes  ver  hacia  dónde  se  dirige el  animal  y  temes  que  los  cazadores  traten  de despeñarlo  por  algún  barranco.  Sin  embargo, si  saltas  en  plena  carrera  podrías  hacerte  mucho  daño."));
        libro.addTexto(new Texto("Te  dejas  resbalar  por  el  costado  del  animal y  caes  sobre  el  helado  terreno,  permaneciendo allí  magullado  y  dolorido  mientras  el  mamut sigue  su  carrera.  De  pronto,  desaparece  de  la vista  despeñándose  por  la  colina.  Los  cazadores  gritan  de  contento.  Algunos  se  acercan  a  ti. Son  bajos  y  musculosos,  con  mandíbulas  prominentes  y  brillantes  ojos.  El  pelo  negro  les llega  hasta  los  hombros  y  van  vestidos  con pieles. Te  sientes  desamparado  pensando  en  lo que  pueden  hacer  contigo.  Sin  embargo,  enseguida  notas  que  no  van  a  hacerte  daño.  Te ayudan  y  te  llevan  hasta  su  cueva,  donde  te ofrecen  caldo  caliente.  Tiene  mal  sabor  pero te  hace  sentir  mucho  mejor.  Te  das  cuenta que  los  hombres  de  la  cueva  están  dispuestos a  aceptarte  porque,  sin  saberlo,  has  logrado llevar  a  cabo  el  rito  sagrado  de  su  pueblo  al cabalgar  valientemente  sobre  un  mamut. La  vida  de  las  gentes  de  la  cueva  es  sencilla y  dura  y,  a  menudo,  echas  de  menos  a  tu  familia,  a  tus  amigos  y  a  tu  época;  sin  embargo,  tu nueva  vida  es  todo  lo  emocionante  y  feliz  que pudieras  desear. #"));
        libro.addTexto(new Texto("Te  agarras  firmemente  a  los  mechones  de pelo  esperando  que  el  mamut  disminuya  la velocidad  para  poder  saltar  sin  sufrir  ningún daño.  De  pronto,  el  animal  se  lanza  hacia  adelante  emitiendo  un  terrible  bramido.  Te  das cuenta  que  estás  cayendo  cada  vez  más  deprisa  y  gritas  desesperadamente. Miles  de  años  más  tarde,  el  eminente  paleontólogo  Dr.  Carleton  Frisbee,  al  descubrir tus  huesos  en  la  excavación  de  Red  Creek  se asombra  enormemente  de  tu  parecido  con  un ser  del  siglo  XX. #"));
        libro.addTexto(new Texto("Sigues  andando  desanimado  y  triste cuando descubres  un  agujero  en  el  suelo.  Te  metes por  él  a  gatas  esperando  encontrar  refugio  o un  camino  hacia  la  Cueva  del  Tiempo. Desembocas  en  un  túnel  cruzado.  Ahora  estás  seguro  de haber  vuelto  a  la  Cueva  del  Tiempo.  Te  metes  por  el  primer  túnel  que  encuentras. Pasan unas tediosas horas y  por  fin,  tus  esperanzas  se  ven  realizadas ya  que  logras ver un  hermoso  valle . A  lo lejos,  se  divisa  una  carretera  de  tierra.  Por  ella avanza  un  caballo  arrastrando  un carro  cargado  de  heno  sobre  el  cual  está  sentado  un  campesino y a lo lejos se  puede  oír  el silbido  de  un  tren.  Notas que no estas en  tu  época. Necesitas comer algo por lo que te diriges a la granja cercana a ti. La  mujer  del  granjero  te  ofrece  un  tazón  de caldo,  pero notas  que  no  eres  bien acogido,  por  lo  que  te  marchas  a  la  ciudad donde  el  posadero  te  permite  pasar  la  noche en  una  de  sus  habitaciones.  A  la  mañana  siguiente  logras  que  una  diligencia  te  lleve  a  Nueva  York,  donde  consigues  empleo  en  un periódico.  Finalmente,  acabas  viajando  a  lo largo  y  ancho  del  mundo,  disfrutando  de  una larga  y  maravillosa  vida  que  termina  precisamente  unos  cuantos  años  antes  de  que  hayas nacido. #"));
        libro.addTexto(new Texto("Entras  en  la  extraña  cueva  y  te  detienes hasta  que  logras  acostumbrarte  a  la  tenue  luz ambarina  que  ilumina  su  interior.  Gradualmente  empiezas  a  distinguir  dos  túneles.  Uno de  ellos,  el  de  la  derecha,  forma  una  curva  hacia  abajo.  El  otro  sube  en  pendiente  hacia  la izquierda. Se  te  ocurre  que  el  que  desciende  puede conducir  al  pasado  y  el  que  sube  al  futuro."));
        libro.addTexto(new Texto("El  túnel  de  la  izquierda  forma  una  espiral, cruzándose  con  otros  túneles.  Tomas  uno  de ellos  y  empiezas  a  subir  una  cuesta  muy  pronunciada.  Al  cabo  de  un  rato,  trepas  por  un agujero  y  sales  a  un  desierto.  El  calor  es  sofocante,  desde  luego  superior  a  los  cuarenta  grados,  pero  el  sol  está  a  punto  de  ponerse  y pronto  empezará  a  refrescar.  A  lo  lejos  se  divisa  una  cadena  de  montañas  que,  a  pesar  de  su aparente  altura,  no  están  cubiertas  de  nieve. No  tienes  ni  idea  de  si  estás  en  el  pasado,  en  el futuro  o  en  el  presente.  En  ese  momento,  descubres  algo  asombroso:  la  arena  se  funde  en un  cristal  amarillento.  Al  examinarla  con  más detalle,  notas  una  oleada  de  aire  todavía  más caliente.  De  pronto,  te  das  cuenta  que  el  sol no  se  pone,  sino  que  sale.  Es  imposible  que  la temperatura  a  mediodía  pueda  ser  soportada por  ningún  ser  vivo.  A  medida  que  el  sol  asciende,  el  calor  se  va  haciendo  abrasador.  La luz  es  cegadora.  Quizás  estás  presenciando  el fin  del  mundo.#"));
        libro.addTexto(new Texto("Sigues el túnel hacia abajo. Resbalas, te golpeas la cabeza con algún objeto y pierdes el conocimiento. Cuando vuelves en si?, te encuentras cerca de un pequeño lago. A la vista solo hay un muchacho de unos doce años que esta? pescando. Te acercas para informarte sobre el año en el que estas sin que parezca raro. Por suerte el muchacho resulta ser muy amable. Dice que se llama Nick Tyler y que ayuda a su padre en la fabricación de jabones y velas."));
        libro.addTexto(new Texto("Cuando  le  cuentas  que  vienes  del  siglo  XX  a través  de  la  Cueva  del  Tiempo,  Nick  se  sonríe. Entonces  le  hablas  de  la  vida  en  tu  época,  de los  coches,  aviones,  teléfonos  y  televisores.  Te escucha  con  mucha  atención,  exhibiendo  una gran  sonrisa,  como  si  fuese  la  historia  más  divertida  del  mundo. -  ¡Cómo  me  alegro  de  haberte  encontrado! - dice  -.  Siempre  había  deseado  saber  cómo sería  la  vida  en  el  siglo  XX.  Trata  de  parecer  serio,  pero  no  consigue evitar  la  risa  porque  piensa  que  se  trata  de una  broma.  -  En  serio  -  dices  (sabiendo  que  nunca  va  a creerte)  -,  no  tengo  hogar.  ¿Sabes  de  algún sitio  donde  pueda  quedarme? -  Seguramente  podrás  quedarte  en  mi  casa. Somos  tantos  que  uno  más  no  importa,  pero tendrás  que  trabajar  en  la  tienda  como  todos nosotros. Como  prácticamente  no  tienes  otra  posibilidad,  aceptas  su  oferta  agradecido  por  la  comida  y  la  cama  que  te  ofrecen  sus  padres.  Muy seriamente,  Nick  te  informa  que  estás  en  el año  1718  en  Boston,  la  ciudad  más  importante  de  la  colonia  inglesa  de  Massachussetts. Pronto  formas  parte  de  la  familia.  Son  buena  gente  y  te  tratan  bien,  pero  tienes  que  trabajar  muchas  horas  al  día  cociendo  jabón  y vertiéndolo  en  los  moldes,  atendiendo  a  los clientes  o  haciendo  recados  para  el  padre  de Nick,  a  quien  llamas  tío  Ted. Uno  de  los  vecinos,  el  señor  Nelson,  es  impresor,  Acaba  de  volver  de  Inglaterra  donde ha  comprado  una  imprenta.  El  negocio  te  interesa  y  piensas  en  trabajar  con  él  como aprendiz,  pero  si  lo  haces  tendrás  que  firmar un  contrato  que  te  obliga  a  trabajar  lealmente para  él  durante  seis  años."));
        libro.addTexto(new Texto("Aunque  sin  duda  te  gustaría  más  trabajar en  la  imprenta  que  en  el  negocio  de  jabones, quieres  permanecer  libre  para  poder  aprovechar  cualquier  oportunidad  que  se  te  presente. El  trabajo  con  el  tío  Ted  te  resulta  aburrido. No  podrías  soportar  pasarte  la  vida  fabricando velas  y  jabones.  Dedicas  la  mayor  parte  de  tu tiempo  libre  a  leer  los  libros  que  caen  en  tus manos  y  tienes  enormes  deseos  de  viajar  y  ver mundo. Al  cabo  de  algún  tiempo,  te  enrolas  como grumete  en  el  bergantín  Nina.  El  barco  pertenece  a  un  rico  mercader  y  se  dirige  a  las  Barbados,  en  las  Antillas,  con  una  carga  de  madera  para  seguir  después  hasta  Inglaterra.Descubres  que  la  vida  en  el  mar  es  mucho más  dura  de  lo  que  habías  pensado,  sobre todo  cuando  te  ves  obligado  a  trepar  por  la jarcia  en  medio  del  temporal.  Sin  embargo, llegas  a  ser  capitán  de  tu  propio  barco.  En  ninguno  de  los  lugares  que  recorres  dejas  de  preguntar  a  la  gente  si  han  oído  hablar  de  la Cueva  del  Tiempo.#"));
        libro.addTexto(new Texto("Decides  trabajar  con  el  señor  Nelson  y,  en poco  tiempo,  aprendes  a  manejar  la  imprenta. Sin  embargo,  no  eres  feliz.  El  impresor  se  niega  a  subirte  el  sueldo  o  a  permitir  que  entres en  el  negocio.  No  encuentras  trabajo  en  Boston,  así  que  decides  trasladarte  a  Filadelfia donde,  al  parecer,  hay  una  gran  demanda  de impresores. Afortunadamente,  el  señor  Nelson  accede  a liberarte  del  contrato  de  aprendizaje.  Vendiendo  casi  todas  tus  pertenencias  logras  reunir suficiente  dinero  para  pagar  un  pasaje  en  una goleta  que  bordea  la  costa.  Tras  un  largo  y  desapacible  viaje,  el  barco  atraca  un  domingo por  la  mañana  en  el  muelle  comercial  de  Filadelfia. Estás  cansado  y  hambriento,  y  empleas  el poco  dinero  que  te  queda  en  comprar  una  barra  de  pan.  Movido  por  la  curiosidad,  sigues  a varias  personas  bien  vestidas  que  entran  en  el lugar  de  reunión  de  los  cuáqueros.  Todos  se sientan  pero,  siguiendo  la  costumbre,  permanecen  en  silencio.  El  lugar  es  tan  apacible  que te  quedas  dormido.  Cuando  despiertas,  los cuáqueros  te  dan  la  bienvenida.  Una  familia  te ofrece  alojamiento  y,  felizmente,  logran  encontrar  trabajo  con  uno  de  los  dos  impresores de  la  ciudad.Te  esfuerzas  trabajando  para  perfeccionarte  como  impresor.  En  pocos  años,  con  la  ayuda  de  algunos  amigos,  logras  reunir  dinero para  establecerte  por  tu  cuenta. Tu  negocio  prospera  y  consigues  editar  tu propio  periódico.  Empiezas  a  pensar  que  el  siglo  XVIll  es  una  buena  época  para  vivir. #"));
        libro.addTexto(new Texto("Tratas  de  persuadirlo diciendo que te escapaste de tu casa pero el niño nota que estas mintiendo .  Antes  de  que  logres  terminar te  dice  adiós  y  se  marcha. Cuando  se va  tomas un camino que   al  cabo  de  un  par  de kilómetros te lleva  a  una  población.  Te  paras  al lado  de  una  iglesia  y  se  acerca  un  guardia  que  te  pregunta  de dónde  vienes.  Esta  vez  intentas  explicar  lo  que realmente  ha  sucedido.  Después  de  oír  algunas  frases,  el  guardia  te  arresta  por  conducta desordenada  y  te  encierra  en  prisión  local.  Mas  tarde,  entra  un  guardia  en  tu  celda  a traerte  tu  ración  de  sopa  y  pan.  Está  maravillado  por  tus  extrañas  ropas.  Después  de  abrir la  puerta,  te  alcanza  la  comida  y  te  observa con  curiosidad. Este está  demasiado  sorprendido   por lo que aprovechas y corres  por  la  calle  tan  deprisa  como puedes.  Cuando  paras  para  recobrar  el  aliento,  un  carruaje  conducido  por  un  hombre  delgado  y  con  barba  se  acerca  a  ti. -Al  parecer,  estás  en  apuros-  dice  el  hombre- ¿Puedo  ayudarte? Le cuentas rápidamente la verdad y aunque parece sorprendido te tranquiliza e invita a una taberna. Cuando  terminas  tu  historia te cuenta su angustia por padecer tuberculosis y plantea  que su  única  esperanza  es  encontrar  la  forma  de  llegar  al futuro. Llegan al trato de ayudarse mutuamente y a la mañana siguiente emprenden  la búsqueda  a  la  salida  del  sol. Parece conocer el lugar y parece haber estado esperando a alguien como tu. Vuelven a donde inicio todo. Llegan a tu época y  tu nuevo  amigo  se  cura  con  ayuda  de  los  medicamentos  modernos  y  se  convierte  en  profesor  de  historia,  famoso  en  todo  el  país  por sus  asombrosos  conocimientos  sobre  la  América  colonial.#"));
        libro.addTexto(new Texto("Esperas hasta la mañana siguiente, pero a medida que comienza a amaanecer empieza a soplar un viento helado y amenazador. Te diriges hacia un risco y comienzas a treparlo. El fuerte viento choca violentamente contra tu cuerpo. El mundo parece haber cambiado para mal. Meditando sobre tu destino, tropiezas y te caes, hundiéndote en una grieta. Pierdes el conocimiento y, al volver en si?, te encuentras en un lugar más cálido. Por la pálida luz deduces que, de algún modo, has ido a parar de nuevo a la Cueva del Tiempo. Hay un pasaje a tu derecha y otro a la izquierda. ¿Sera? que uno conduce al futuro y otro al pasado?"));
        libro.addTexto(new Texto("Sigues el pasaje de la izquierda. Subes hasta la superficie. Delante de ti ves un lugar muy verde en el que hay un riachuelo claro. Al otro lado se dislumbrn laderas de pinos que se pierden hasta unos picos cubiertos de nieve. La época a la que has llegado parece tranquila.      Ves una manada de búfalos pero ningún rastro de vida humana. Parece ser una época muy lejana. Miras hacia el cielo y ves que una de las nubes comienza a bajar y con tus ojos presencias el aterrizaje de una nave espacial."));
        libro.addTexto(new Texto("Piensas que debes haber llegado a un futuro lejano. ¿Se trata realmente de una nave espacial? Si es así?, quizá? lo más conveniente sería retirarte a una distancia prudencial. Trepas rápidamente por la colina y sales a campo abierto al otro lado de la misma. Desde donde estás puedes divisar una gran extensión de terreno rocoso y más bien árido. Una gran muchedumbre se ve en la construcción de un enorme muro. Por todas partes hay carretas tiradas por bueyes, cargadas con grandes bloques de piedra. El muro se extiende a lo largo de todo el espacio que logras divisar. "));
        libro.addTexto(new Texto("Te acercas a la muralla, caminando hacia los trabajadores. Cuando se dan cuenta de tu presencia, piensan que eres un espía de alguna tribu desconocida. Eres capturado por dos guardias que te obligan a sentarte en una pila	de piedras mientras deciden qué hacer contigo. Al cabo de un rato te señalan una de las escaleras. Dos trabajadores te obligan a trasladar piedras. Te das cuenta que has sido condenado a trabajar en la construcción de una muralla de seis metros de altura, cuatro de ancho y más de 2,800 kilómetros de largo. Calculas que harán falta más de diez billones de piedras. Te preguntas cuántas tendrás que acarrear antes de poder escapar, si es que algún día llegas a hacerlo1.#"));
        libro.addTexto(new Texto("No tienes ningún deseo de entrometerte en la construcción de la Gran Muralla de China. Vuelves a la colina con la esperanza de encontrar un túnel que te devuelva a tu época. Caminas por el fondo, hasta que descubres una abertura al otro lado de un saliente. Te metes por ella, suponiendo que vas a volver al lugar que acabas de abandonar. Sin embargo sales al océano. Las colinas se han transformado en amenazantes olas. Te encuentras sobre un risco que apenas sobresale unos metros por encima del mar barrido por el viento. No parece existir ninguna posibilidad de escapar, ya que pareces estar sobre el único pedazo de tierra que emerge en el mundo cubierto por las aguas.#"));
        libro.addTexto(new Texto("Te acercas cautelosamente a la nave espacial, no es nada parecido a lo que te imaginabas. En ese momento se abre una puerta, lo unico que ves dentro es una luz azulada. De la nave se desprende un enorme cubo sostenido por unas pinzas que lo dejan en tierra y luego lo abren. Dentro descansan una figuras muy parecidas a los cavernicolas de los dibujos de las cavernas. Sienes el impulso de saltar dentro de la nave antes que despegue."));
        libro.addTexto(new Texto("Al subir a bordo te encuentras con una cámara cerrada. Piensas que quienes controlan la nave pueden tener algún medio para dominar el tiempo. Quizás la Cueva del tiempo sea su creación. Empiezas a sentir sueño y te quedas dormido.      Te despiertas a oscuras y percibes una luz. Comienzas a seguirla y te das cuenta de que estas ante la entrada de la cueva. Sales y con gran alegría descubres que estas en El Cañon de la serpiente. Nada ha cambiado. Has vuelto a tu época. Cuando vuelves a esos pasajes descubres que la entrada de la Cueva del Tiempo ha sido cubierta por rocas y piensas que quizá haya sido mejor asi.#"));
        libro.addTexto(new Texto("Aunque te gustaría ver el interior de la nave, no tienes deseo de ser lanzado al espacio. Te retiras a ver lo que sucede.  La puerta se cierra y la nave se eleva en silencio. En minutos se pierde de vista. Te acercas para observar a los hombres de aspecto primitivo dormidos en el cubo. Estos comienzan a desperezarse y frotarse los ojos como si despertasen de un largo sueño. Los hombres primitivos observan alrededor y parecen no notar tu presencia. Uno bebe del arroyo. El mas alto del grupo toma un palo  y comienza a buscar raíces por la orilla del rio. Mordisquea las que encuentra y finalmente pasa una a los demás. Todos comienzan a buscar palos y un hombre te da un trozo de raíz. La pruebas y sabe similar a la zanahoria. Las mujeres te sonríen. Te han aceptado como miembro del grupo. A la mañana siguiente te despiertas sobre el musgo de la Caverna de la Serpiente, a unos cuantos metros de la entrada. Preguntandote si todo lo anterior había sido un sueño o realidad. De todos modos no sientes deseo de entrar para comprobarlo.#"));

        //Opciones



        Scanner s = new Scanner(System.in);
        //Acorde a la opt que elija es para la pagina o seccion del arreglo que se va a ir.
        int options = 0;// las opciones que va a brindar cada pagina siempre va a ser 1 o 2
        int valueOpt1 = 0;//pagina inicio opt 1 ex "x"
        int valueOpt2 = 30;//pagina inicio opt2 ex "i"

        boolean flag = true;


        System.out.println("                                                                                           ADVERTENCIA");
        System.out.println("                                                                     ---------------------------------------------------------");
        System.out.println("¡No  leas  todo  el  libro  seguido,  del  principio  al fin!  En  sus  páginas  hallarás  muchas  y  variadas aventuras.  Á  medida  que  lo  vayas  leyendo,  te verás  obligado  a  elegir.  De  tu  decisión  depende que  la  aventura  constituya  un  éxito  o  un  fracaso,");
        System.out.println("Tú  serás  el  responsable  del  resultado  final.  Te corresponde  a  ti  tomar  las  decisiones.  Una  vez que  hayas  elegido,  sigue  las  instrucciones  para averiguar  qué  sucede  a  continuación. Recuerda  que  no  puedes  volverte  atrás.  Recapacita  antes  de  decidirte  por  una  opción.  Tu elección  puede  conducirte  al  desastre  o...  ¡a  un magnífico  final!");

        System.out.println("Toque la letra Y para continuar ");

        String teclacontinua = s.next();
        System.out.println("Elige con sabiduría: \n");
        System.out.println("\n" + libro.textoList[0].toString() + "\n");

        while (flag) {
            options = s.nextInt();
            System.out.println(" ");
            if (options == 1) {
                valueOpt1++;
                System.out.println(libro.textoList[valueOpt1].toString() + "\n");
                if ((libro.textoList[valueOpt1].toString().contains("#"))) {
                    Matrix();
                    flag = false;
                }
            } else if (options == 2) {
                System.out.println(libro.textoList[valueOpt2].toString() + "\n");
            }else if (valueOpt1 == 45 && options == 2) {
                System.out.println("JAJA ENTRASTE A UN BUCLE INFINTO PARA SALIR RESUELVE ESTE ACERTIJO : El único cuñado del hermano de tu madre está durmiendo en el sillón. ¿Quién está durmiendo en el sillón??");
                System.out.println("OPCION 1= TU PADRE");
                System.out.println("OPCION 2= TU TIO");


                valueOpt1 = valueOpt1 - valueOpt2;
                valueOpt2 = 30;
            } else  {
                System.out.println(libro.textoList[valueOpt1] + "\n");

                if (libro.textoList[valueOpt1].toString().contains("#")) {
                    Matrix();
                    flag = false;
                } else {
                    System.out.println("Por favor ingrese una opción valida");
                }
                valueOpt2 = Math.round(valueOpt2 / 2);
                System.out.println("i = " + valueOpt2);
            }
        }

    }


    public static void Matrix() throws InterruptedException {

        String matrizFin[][] = new String[4][10];

        matrizFin[0][0] = "**";
        matrizFin[0][1] = "**";
        matrizFin[0][2] = "**";
        matrizFin[0][3] = "  ";
        matrizFin[0][4] = "**";
        matrizFin[0][5] = "  ";
        matrizFin[0][6] = "**";
        matrizFin[0][7] = "  ";
        matrizFin[0][8] = "  ";
        matrizFin[0][9] = "**";
        matrizFin[1][0] = "**";
        matrizFin[1][1] = "  ";
        matrizFin[1][2] = "  ";
        matrizFin[1][3] = "  ";
        matrizFin[1][4] = "**";
        matrizFin[1][5] = "  ";
        matrizFin[1][6] = "**";
        matrizFin[1][7] = "**";
        matrizFin[1][8] = "  ";
        matrizFin[1][9] = "**";
        matrizFin[2][0] = "**";
        matrizFin[2][1] = "**";
        matrizFin[2][2] = "  ";
        matrizFin[2][3] = "  ";
        matrizFin[2][4] = "**";
        matrizFin[2][5] = "  ";
        matrizFin[2][6] = "**";
        matrizFin[2][7] = "  ";
        matrizFin[2][8] = "**";
        matrizFin[2][9] = "**";
        matrizFin[3][0] = "**";
        matrizFin[3][1] = "  ";
        matrizFin[3][2] = "  ";
        matrizFin[3][3] = "  ";
        matrizFin[3][4] = "**";
        matrizFin[3][5] = "  ";
        matrizFin[3][6] = "**";
        matrizFin[3][7] = "  ";
        matrizFin[3][8] = "  ";
        matrizFin[3][9] = "**";

        for (int i = 0; i < matrizFin.length; i++) {
            for (int k = 0; k < matrizFin[i].length; k++) {
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.print(matrizFin[i][k] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("\n");

        Conclusion();
    }

    public static void Conclusion() throws InterruptedException {

        TimeUnit.SECONDS.sleep(2);
        System.out.println("CONCLUSION");
        System.out.println("¿Qué sucede a continuacion? Todo depende de tu eleccion. ¿Cómo termina la aventura? Solo tu puedes saberlo...\n");
        System.out.println("Esperamos que te haya gustado esta aventura tan divertida, pero recuerda: Nunca un juego será más importante que tu propia vida real.\n");
        System.out.println("APUNTA ALTO, SIGUE ADELANTE, NO TENGAS MIEDO A LA ALTURA.");
        System.out.println("NO SIGAS LA MODA, SÉ ORIGINAL, ELIGE TU PROPIA AVENTURA. ");
    }
}

