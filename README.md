# Reto Suma de Parámetros

Ejercicio introductorio en Java que implementa un método para sumar dos parámetros enteros. El proyecto forma parte de una serie de retos prácticos y utiliza Maven para gestionar la compilación.

## Descripción

La clase `Reto` contiene el método:

```java
public int suma(int valor1, int valor2)
```

El método recibe dos valores de tipo `int`, calcula su suma y devuelve el resultado. En el método `main` se crea una instancia de la clase y se prueba la operación con los valores `10` y `5`.

**Salida esperada:**

```text
El resultado es: 15
```

## Tecnologías utilizadas

- **Java 8 o superior** — lenguaje de programación.
- **Maven** — gestión del proyecto y proceso de compilación.
- **Git** — control de versiones.
- **IntelliJ IDEA** — configuración del entorno de desarrollo incluida en el repositorio.

## Requisitos previos

Antes de comenzar, asegúrate de tener instalado:

- JDK 8 o una versión posterior.
- Apache Maven 3.6 o una versión posterior.
- Git, si deseas clonar el repositorio.

Puedes comprobar las instalaciones con:

```bash
java -version
mvn -version
```

## Instalación

Clona el repositorio y accede al módulo Maven:

```bash
git clone https://github.com/MarioSi3ri/RetoSumaParametros.git
cd RetoSumaParametros/Reto
```

También puedes abrir la carpeta `Reto` directamente desde IntelliJ IDEA y cargar el proyecto como un proyecto Maven a partir del archivo `pom.xml`.

## Compilación

Desde la carpeta `Reto`, ejecuta:

```bash
mvn clean package
```

Este comando limpia compilaciones anteriores, compila el código y genera el archivo `.jar` dentro de `target/`.

## Uso

Después de compilar, ejecuta la clase principal con:

```bash
java -cp target/classes com.si3ri.reto.Reto
```

El programa mostrará:

```text
El resultado es: 15
```

Para probar otros valores, modifica la llamada al método en `Reto.java`:

```java
int resultado = reto.suma(10, 5);
```

Por ejemplo:

```java
int resultado = reto.suma(25, 17);
```

## Estructura del proyecto

```text
RetoSumaParametros/
├── Reto/
│   ├── pom.xml
│   └── src/
│       └── main/
│           └── java/
│               └── com/si3ri/reto/
│                   └── Reto.java
└── README.md
```

## Funcionamiento

1. Se instancia la clase `Reto`.
2. Se invoca `suma` pasando dos números enteros.
3. El método devuelve `valor1 + valor2`.
4. El resultado se imprime en la consola.

La lógica principal es deliberadamente sencilla para practicar métodos, parámetros, valores de retorno, instanciación de clases y ejecución de una aplicación Java.

## Próximas mejoras

- Permitir que los valores se introduzcan por consola.
- Añadir pruebas unitarias con JUnit.
- Incorporar validaciones y ejemplos para distintos casos de suma.
- Configurar un plugin de ejecución de Maven para lanzar la aplicación mediante `mvn exec:java`.

## Autor

**MarioSi3ri**

Repositorio: [MarioSi3ri/RetoSumaParametros](https://github.com/MarioSi3ri/RetoSumaParametros)

## Licencia

Este proyecto se publica con fines educativos. No se ha definido una licencia específica en el repositorio.
