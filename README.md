# ➕ Reto Suma de Parámetros

<p align="center">
  <strong>Ejercicio académico de Java para practicar métodos, parámetros y valores de retorno.</strong>
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-8%2B-orange?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java 8 o superior" />
  <img src="https://img.shields.io/badge/Maven-Proyecto-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white" alt="Maven" />
  <img src="https://img.shields.io/badge/Estado-Académico-informational?style=for-the-badge" alt="Proyecto académico" />
  <img src="https://img.shields.io/badge/Tipo-Consola-success?style=for-the-badge" alt="Aplicación de consola" />
</p>

---

## 📖 Tabla de contenido

- [Acerca del proyecto](#-acerca-del-proyecto)
- [Objetivo de aprendizaje](#-objetivo-de-aprendizaje)
- [Características](#-características)
- [Tecnologías utilizadas](#-tecnologías-utilizadas)
- [Estructura del proyecto](#-estructura-del-proyecto)
- [Requisitos previos](#-requisitos-previos)
- [Instalación](#-instalación)
- [Compilación y ejecución](#-compilación-y-ejecución)
- [Ejemplo de uso](#-ejemplo-de-uso)
- [Funcionamiento](#-funcionamiento)
- [Posibles mejoras](#-posibles-mejoras)
- [Autor](#-autor)
- [Licencia](#-licencia)

## 🧭 Acerca del proyecto

**Reto Suma de Parámetros** es un ejercicio introductorio desarrollado en **Java**. Su propósito es demostrar cómo definir un método que recibe dos parámetros enteros, realiza una operación aritmética y devuelve el resultado.

La aplicación se ejecuta desde la consola. En el método `main` se crea una instancia de la clase `Reto` y se invoca el método `suma` con los valores `10` y `5`.

> Este proyecto corresponde al **Reto 6: suma de dos parámetros establecidos** de la UVEG.

## 🎯 Objetivo de aprendizaje

El ejercicio permite practicar:

- Declaración de clases y métodos.
- Definición de parámetros de tipo `int`.
- Uso de valores de retorno.
- Instanciación de una clase.
- Invocación de métodos.
- Impresión de resultados en la consola.
- Organización básica de un proyecto Java con Maven.

## ✨ Características

- Método `suma(int valor1, int valor2)` para sumar dos números enteros.
- Ejecución mediante un método `main`.
- Resultado mostrado directamente en la consola.
- Proyecto organizado con la estructura estándar de Maven.
- Configuración compatible con Java 8 o versiones posteriores.

## 🛠️ Tecnologías utilizadas

| Tecnología | Uso |
|---|---|
| **Java 8+** | Lenguaje y plataforma de ejecución. |
| **Maven** | Compilación y gestión de la estructura del proyecto. |
| **Git** | Control de versiones. |
| **IntelliJ IDEA** | Entorno de desarrollo recomendado. |

El proyecto no requiere dependencias externas adicionales.

## 📁 Estructura del proyecto

```text
RetoSumaParametros/
├── Reto/
│   ├── pom.xml
│   └── src/
│       └── main/
│           └── java/
│               └── com/
│                   └── si3ri/
│                       └── reto/
│                           └── Reto.java
└── README.md
```

### 📄 Clase principal

- **`Reto.java`**: contiene el método `suma` y el punto de entrada `main` de la aplicación.
- **`pom.xml`**: define las coordenadas del proyecto Maven, la versión de Java y la clase principal.

## ✅ Requisitos previos

Antes de ejecutar el proyecto, asegúrate de contar con:

- **JDK 8 o superior**.
- **Apache Maven 3.6 o superior**.
- **Git**, si deseas clonar el repositorio.

Comprueba las versiones instaladas con:

```bash
java -version
mvn -version
```

## 📥 Instalación

Clona el repositorio y accede al módulo Maven:

```bash
git clone https://github.com/MarioSi3ri/RetoSumaParametros.git
cd RetoSumaParametros/Reto
```

También puedes abrir la carpeta `Reto` desde IntelliJ IDEA y cargar el proyecto a partir del archivo `pom.xml`.

## ▶️ Compilación y ejecución

### Compilar el proyecto

Desde la carpeta `Reto`, ejecuta:

```bash
mvn clean package
```

El comando compila el código y genera los archivos resultantes en el directorio `target/`.

### Ejecutar la aplicación

Después de compilar, ejecuta la clase principal con:

```bash
java -cp target/classes com.si3ri.reto.Reto
```

## 🧪 Ejemplo de uso

La llamada incluida en `Reto.java` utiliza los valores `10` y `5`:

```java
Reto reto = new Reto();
int resultado = reto.suma(10, 5);
System.out.println("\nEl resultado es: " + resultado);
```

La salida esperada es:

```text
El resultado es: 15
```

Para probar otros valores, modifica los argumentos del método:

```java
int resultado = reto.suma(25, 17);
```

En este caso, el resultado será `42`.

## ⚙️ Funcionamiento

1. Se crea un objeto de la clase `Reto`.
2. Se invoca el método `suma` con dos valores enteros.
3. El método calcula `valor1 + valor2`.
4. El resultado se devuelve y se almacena en la variable `resultado`.
5. El valor se imprime en la consola.

La implementación principal es:

```java
public int suma(int valor1, int valor2) {
    return valor1 + valor2;
}
```

## 🚀 Posibles mejoras

- Permitir la captura de valores mediante `Scanner`.
- Añadir pruebas unitarias con JUnit.
- Incorporar validaciones para entradas no numéricas.
- Configurar el plugin de ejecución de Maven para utilizar `mvn exec:java`.
- Ampliar el ejercicio con otras operaciones matemáticas.

## 👨‍💻 Autor

**MarioSi3ri**

Repositorio: [RetoSumaParametros](https://github.com/MarioSi3ri/RetoSumaParametros)

## 📄 Licencia

Este proyecto se distribuye bajo la **Licencia MIT**. Consulta el archivo [LICENSE](LICENSE) para conocer los términos completos.

---

<p align="center">
  Desarrollado con Java & Maven como proyecto académico de programación.
</p>
