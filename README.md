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

\```java
String textoEncriptado = encriptar(textoClaro, clave);
\```

### Desencriptar texto:

\```java
String textoDesencriptado = desencriptar(textoEncriptado, clave);
\```

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


