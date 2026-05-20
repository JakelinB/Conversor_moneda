# 💱 Conversor de Monedas — Currency Converter

> **ES** | [EN below](#en---currency-converter)

Aplicación de consola en Java que convierte entre divisas en tiempo real consultando la [ExchangeRate API](https://www.exchangerate-api.com/). El usuario ingresa el valor, la moneda origen y la moneda destino, y obtiene el resultado al instante.

Challenge del programa **Oracle Next Education (ONE)** — Alura LATAM.

## ¿Cómo funciona?

1. El usuario ingresa por consola: monto + código de moneda origen + código de moneda destino
2. La app realiza una solicitud HTTP a la ExchangeRate API
3. La respuesta JSON se deserializa con **Gson** y se extrae la tasa de cambio
4. Se muestra el resultado calculado en consola

## Tecnologías

| Tecnología | Uso |
|---|---|
| Java 17 | Lenguaje principal |
| HttpClient | Solicitudes HTTP a la API |
| Gson | Deserialización de JSON |
| ExchangeRate API | Fuente de tasas de cambio |

## Requisitos

- Java 17+
- IntelliJ IDEA (recomendado)
- Archivo JAR de Gson — [descargar aquí](https://mvnrepository.com/artifact/com.google.code.gson/gson)

## Cómo ejecutarlo

```
1. Clona el repositorio
2. Abre el proyecto en IntelliJ IDEA
3. Agrega el JAR de Gson:
   File > Project Structure > Modules > + > JARs or Directories
4. Ejecuta la clase Main
```

## Ejemplo de uso

```
Ingresa el monto: 100
Ingresa la moneda origen (ej: USD): USD
Ingresa la moneda destino (ej: COP): COP
Resultado: 100 USD = 420,500.00 COP
```

## Lo que aprendí

- Consumo de APIs REST desde Java puro (sin frameworks)
- Manejo de respuestas JSON con Gson
- Flujo completo de una aplicación de consola orientada a objetos

---

## EN — Currency Converter

Java console app that converts between currencies in real time using the ExchangeRate API. Part of the **Oracle Next Education (ONE)** challenge.

### Stack
`Java 17` · `HttpClient` · `Gson` · `ExchangeRate API`

### Run it
Open in IntelliJ, add the Gson JAR (`File > Project Structure > Modules > +`), then run the `Main` class.

---
*Desarrollado por [Jakelin Bedoya](https://www.linkedin.com/in/jakelin-bedoya-becerra) · Oracle ONE Challenge*

