## Clase `Main`

La clase `Main` proporciona un ejemplo básico de encriptación y desencriptación utilizando el algoritmo DES (Data Encryption Standard).

### Métodos

- `main`: Método principal que realiza la encriptación y desencriptación utilizando DES.
  
- `encriptar(String texto, String clave)`: Método que encripta un texto utilizando el algoritmo DES.
  
- `desencriptar(String textoEncriptado, String clave)`: Método que desencripta un texto encriptado utilizando el algoritmo DES.

### Uso

```java
public static void main(String[] args) {
    try {
        String textoClaro = "Este es una prueba de texto plano para encriptar";
        String clave = "pablo123";

        // Encriptar texto
        String textoEncriptado = encriptar(textoClaro, clave);
        System.out.println("Texto encriptado: " + textoEncriptado);

        // Desencriptar texto
        String textoDesencriptado = desencriptar(textoEncriptado, clave);
        System.out.println("Texto desencriptado: " + textoDesencriptado);
        System.out.println("Clave de encriptación: " + clave);
    } catch (Exception e) {
        e.printStackTrace();
    }
}
```
## Encriptación y Desencriptación

### Encriptar texto:

```java
String textoEncriptado = encriptar(textoClaro, clave);
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

```

### Desencriptar texto:

```java
String textoDesencriptado = desencriptar(textoEncriptado, clave);
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
```

### Excepciones

Si ocurre algún error durante el proceso de encriptación o desencriptación, se lanzará una excepción.

### Método `encriptar(String texto, String clave)`

Encripta un texto utilizando el algoritmo DES.

- `texto`: El texto a encriptar.
- `clave`: La clave utilizada para encriptar el texto.
- Retorna: El texto encriptado en formato Base64.
- Excepciones: Se lanza una excepción si ocurre algún error durante el proceso de encriptación.

### Método `desencriptar(String textoEncriptado, String clave)`

Desencripta un texto encriptado utilizando el algoritmo DES.

- `textoEncriptado`: El texto encriptado en formato Base64.
- `clave`: La clave utilizada para desencriptar el texto.
- Retorna: El texto desencriptado.
- Excepciones: Se lanza una excepción si ocurre algún error durante el proceso de desencriptación.

- ### Ventajas de usar cifrado DES:

- **Ampliamente conocido**: El DES ha sido un algoritmo estándar durante décadas y ha sido ampliamente revisado y analizado por expertos en seguridad.

- **Implementación rápida**: El algoritmo DES es relativamente simple y puede implementarse eficientemente en hardware y software.

- **Compatibilidad**: Muchos sistemas y dispositivos todavía admiten DES, lo que lo hace útil para la interoperabilidad con sistemas heredados.

### Inconvenientes de usar cifrado DES:

- **Tamaño de clave corto**: La longitud de la clave DES (56 bits) se considera corta en comparación con los estándares modernos, lo que lo hace vulnerable a ataques de fuerza bruta.

- **Vulnerabilidades conocidas**: A lo largo de los años, se han descubierto y demostrado varios ataques criptográficos efectivos contra DES, incluidos ataques de texto cifrado conocido y fuerza bruta.

- **Estándar obsoleto**: El estándar DES se considera obsoleto y no se recomienda para nuevos sistemas o aplicaciones que requieran un alto nivel de seguridad.

- **Criptografía débil**: Dada su vulnerabilidad a ataques modernos y su tamaño de clave corto, el DES se considera una forma de criptografía débil en la actualidad.

### Funcionamiento
![Captura](https://github.com/pabloaten/desencriptacionDES/assets/92804753/9aa92255-2130-47a4-b39e-94c3e2646894)

