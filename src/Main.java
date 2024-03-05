import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import java.util.Base64;

/**
 * Clase principal que muestra un ejemplo básico de encriptación y desencriptación utilizando DES (Data Encryption Standard).
 */
public class Main {

    /**
     * Método principal que realiza la encriptación y desencriptación utilizando DES.
     */
    public static void main(String[] args) {
        try {
            String textoClaro = "Este es una prueba de texto plano para encriptar";

            //Clave de 56 bytes que utiliza des para la encriptacion y desencriptación
            String clave = "pablo123";

            // Encriptar texto
            String textoEncriptado = encriptar(textoClaro, clave);
            System.out.println("Texto encriptado: " + textoEncriptado);

            // Desencriptar texto
            String textoDesencriptado = desencriptar(textoEncriptado, clave);
            System.out.println("Texto desencriptado: " + textoDesencriptado);
            System.out.println("Clave de encriptación:.-,. "+clave);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Encripta un texto utilizando el algoritmo DES.
     *
     * @param texto El texto a encriptar.
     * @param clave La clave utilizada para encriptar el texto.
     * @return El texto encriptado en formato Base64.
     * @throws Exception Si ocurre algún error durante el proceso de encriptación.
     */
    public static String encriptar(String texto, String clave) throws Exception {
        // Convertimos la clave en un array de bytes usando el método getBytes() de la clase String
        DESKeySpec desKeySpec = new DESKeySpec(clave.getBytes());

        // Creamos una instancia de SecretKeyFactory para convertir la clave en una instancia de SecretKey
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");

        // Generamos una instancia de SecretKey a partir de la DESKeySpec usando el SecretKeyFactory
        SecretKey secretKey = keyFactory.generateSecret(desKeySpec);

        // Creamos una instancia de Cipher para realizar la encriptación usando el algoritmo DES
        Cipher cipher = Cipher.getInstance("DES");

        // Inicializamos el Cipher en modo de encriptación con la clave secreta generada
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);

        // Convertimos el texto en un array de bytes y encriptamos los datos
        byte[] textoEncriptadoBytes = cipher.doFinal(texto.getBytes());

        // Convertimos el array de bytes encriptados a una cadena Base64 para facilitar su almacenamiento y transporte
        return Base64.getEncoder().encodeToString(textoEncriptadoBytes);
    }


    /**
     * Desencripta un texto encriptado utilizando el algoritmo DES.
     *
     * @param textoEncriptado El texto encriptado en formato Base64.
     * @param clave           La clave utilizada para desencriptar el texto.
     * @return El texto desencriptado.
     * @throws Exception Si ocurre algún error durante el proceso de desencriptación.
     */
    public static String desencriptar(String textoEncriptado, String clave) throws Exception {
        // Convertimos la clave en un array de bytes usando el método getBytes() de la clase String
        DESKeySpec desKeySpec = new DESKeySpec(clave.getBytes());

        // Creamos una instancia de SecretKeyFactory para convertir la clave en una instancia de SecretKey
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");

        // Generamos una instancia de SecretKey a partir de la DESKeySpec usando el SecretKeyFactory
        SecretKey secretKey = keyFactory.generateSecret(desKeySpec);

        // Creamos una instancia de Cipher para realizar la desencriptación usando el algoritmo DES
        Cipher cipher = Cipher.getInstance("DES");

        // Inicializamos el Cipher en modo de desencriptación con la clave secreta generada
        cipher.init(Cipher.DECRYPT_MODE, secretKey);

        // Convertimos el texto encriptado de Base64 a un array de bytes y desencriptamos los datos
        byte[] textoBytes = cipher.doFinal(Base64.getDecoder().decode(textoEncriptado));

        // Convertimos el array de bytes desencriptados a una cadena de texto
        return new String(textoBytes);
    }

}
