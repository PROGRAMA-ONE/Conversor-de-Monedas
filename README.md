# Conversor de Monedas

Este es un proyecto en Java que permite convertir entre diferentes monedas utilizando una API de tipo de cambio en tiempo real. El programa es interactivo y se ejecuta por consola.

## Descripción

El conversor permite realizar conversiones entre las siguientes monedas:
- Dólar estadounidense (USD) y Peso Argentino (ARS)
- Dólar estadounidense (USD) y Real Brasileño (BRL)
- Dólar estadounidense (USD) y Peso Colombiano (COP)
- Y viceversa para cada par.

El programa solicita al usuario seleccionar la conversión deseada y la cantidad a convertir, mostrando el resultado en pantalla.

## Estructura del Proyecto

- `Principal`: Clase principal con el menú interactivo y la lógica de entrada/salida.
- `ConsultaConversorDeMonedas`: Realiza la consulta HTTP a la API de tipo de cambio y obtiene los datos.
- `ConversorDeMonedas`: Record que representa la respuesta de la API.

## Requisitos

- Java 17 o superior
- Gson (`gson-2.13.1.jar`)
- Conexión a Internet para consultar la API (`https://www.exchangerate-api.com/`)

## Instrucciones para Ejecutar en IntelliJ IDEA

1. **Clona o descarga el repositorio.**
2. **Abre el proyecto en IntelliJ IDEA.**
3. **Asegúrate de tener configurado Java 17.**
4. **Verifica que la librería Gson esté incluida.**
5. **Ejecuta la clase `Principal`**

## Uso

1. Al ejecutar el programa, verás un menú con las opciones de conversión.
2. Ingresa el número de la opción deseada.
3. Ingresa la cantidad a convertir (debe ser mayor a 0).
4. El programa mostrará el resultado de la conversión.
5. Para salir, selecciona la opción 7.

## Ejemplo de Uso

```
**********************************************
Sea bienvenido/a al Conversor de Moneda =]
1 - Dólar =>> Peso Argentino
2 - Peso Argentino =>> Dólar
3 - Dólar =>> Real Brasileño
4 - Real Brasileño =>> Dólar
5 - Dólar =>> Peso colombiano
6 - Peso colombiano =>> Dólar
7 - Salir
*** Elija una opción valida: ***
**********************************************
```

## Notas

- Si introduces un valor no numérico o negativo, el programa te pedirá que ingreses un valor válido.
- Si la API no responde o hay un error de conexión, se mostrará un mensaje de error.
