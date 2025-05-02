# Conversor de Monedas Fashion (Por Martin Vera)

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)

![HttpClient](https://img.shields.io/badge/HttpClient-007bff?style=for-the-badge&logo=java&logoColor=white)

![Gson](https://img.shields.io/badge/Gson-E066FF?style=for-the-badge&logo=google&logoColor=white)

## Descripción del Proyecto

Este es una aplicación de línea de comandos desarrollada en Java que permite a los usuarios convertir cantidades de dinero entre diferentes divisas. Utiliza colores en el menú para una mejor experiencia visual. La aplicación consume una API externa ([https://www.exchangerate-api.com/](https://www.exchangerate-api.com/)) para obtener las tasas de cambio más recientes. Ofrece conversiones básicas predefinidas y la opción de ingresar códigos de moneda personalizados. Además, mantiene un historial de todas las conversiones realizadas.

## Funcionalidades Principales

* **Menú con Colores:** Interfaz de línea de comandos con colores para mejorar la legibilidad.
* **Conversiones Básicas:** Opciones predefinidas para conversiones comunes (Dólar a Peso Argentino, etc.).
* **Conversiones Personalizadas:** Permite ingresar códigos de moneda base y de destino para cualquier par soportado por la API.
* **Consumo de API:** Obtiene tasas de cambio actualizadas desde [ExchangeRate-API](https://www.exchangerate-api.com/).
* **Historial de Conversiones:** Registra todas las conversiones con detalles de monedas, cantidades y fecha/hora.
* **Visualización del Historial:** Permite al usuario ver el historial de conversiones.

## Tecnologías Utilizadas

* **Java:** Lenguaje de programación principal.
* **Java HttpClient:** Para realizar peticiones HTTP a la API.
* **Gson:** Biblioteca de Google para la serialización y deserialización de JSON.


## Prerrequisitos

* **Java Development Kit (JDK):** Asegúrate de tener Java instalado. Descarga desde [Oracle](https://www.oracle.com/java/technologies/javase-downloads.html) o tu gestor de paquetes.
* **Conexión a Internet:** Necesaria para obtener las tasas de cambio de la API.
* **Cuenta en ExchangeRate-API (Opcional):** Puede ser requerida para un uso más extenso de la API. Reemplaza `"TU_API_KEY"` en `ConsumirAPI.java` si es necesario.
* **Terminal con soporte para códigos de escape ANSI:** La mayoría de las terminales lo soportan para la visualización de colores.

## Instalación y Ejecución

1.  **Clonar el Repositorio:**
    ```bash
    git clone https://github.com/kazike19/ConversorMoneda.git
    cd ConversorMoneda
    ```

2.  **Compilar el Código Java:**
    ```bash
    javac src/Models/*.java src/Registro/*.java src/Utils/*.java Main.java
    ```
    (Asegúrate de ajustar las rutas si es necesario).

3.  **Ejecutar la Aplicación:**
    ```bash
    java Main
    ```

## Uso

Puedes ver una captura de pantalla del menú en el archivo `Menu.png` que se encuentra en la raíz del repositorio.
![Menu](https://github.com/kazike19/ConversorMoneda/blob/master/imagenes/Menu.png)

**Elige una opción:**

* **Opciones 1-6:** Elige la opción numérica para realizar la conversión directa. Se te pedirá la cantidad y se mostrará el resultado. La conversión se guarda en el historial.
* **Opción 7: Ingresar codigos de moneda:** Se te pedirá que ingreses el código de la moneda base y luego el código de la moneda a convertir. Después, ingresa la cantidad.
* **Opción 8: Ver Historial de Conversiones:** Muestra la lista de conversiones realizadas.
* **Opción 9: Salir:** Cierra la aplicación.

## Estructura del Proyecto
```
├── README.md
├── src/
│   ├── Models/
│   │   ├── Historial.java
│   │   └── Moneda.java
│   ├── Registro/
│   │   └── RegistroHistorial.java
│   ├── Utils/
│   │   ├── ConvertidorMoneda.java
│   │   ├── ConsumirAPI.java
│   │   ├── Ejecutor.java
│   │   └── MostrarMenu.java
└── Main.java
```
## Demostración en Video

Puedes ver una breve demostración del funcionamiento de la aplicación en el siguiente enlace:

[Demostración del Conversor de Monedas](https://youtu.be/H5DS2HfJHsg)
