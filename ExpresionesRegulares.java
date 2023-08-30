import java.util.regex.Matcher;
import java.util.regex.Pattern;
  public class ExpresionesRegulares {
          public static void main(String[] args) {
              if (args.length != 1) {
                  System.out.println("Uso: java ExpresionRegularValidator <cadena>");
                  return;
              }
              String cadena = args[0];
              String expresionregular = "[a-zA-Z]+\\d{2}";

              boolean esValida = validarExpresionRegular(cadena, expresionregular);

              if (esValida) {
                  System.out.println("La cadena es una expresión válida.");
              } else {
                  System.out.println("La cadena no es una expresión válida.");
              }
          }
          public static boolean validarExpresionRegular(String cadena, String expresionRegular) {
              Pattern pattern = Pattern.compile(expresionRegular);
              Matcher matcher = pattern.matcher(cadena);
              return matcher.matches();
          }
      }

