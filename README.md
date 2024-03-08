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
```

### Desencriptar texto:

```java
String textoDesencriptado = desencriptar(textoEncriptado, clave);
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

Es importante tener en cuenta que, debido a las debilidades y al obsolescencia del algoritmo DES, se recomienda utilizar algoritmos de cifrado más modernos y seguros, como AES (Advanced Encryption Standard), para aplicaciones que requieran un alto nivel de seguridad en la actualidad.

Recuerda siempre evaluar los requisitos de seguridad de tu aplicación y elegir algoritmos de cifrado adecuados en consecuencia.



