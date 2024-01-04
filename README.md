# AUTOMATIZACIÓN DE PRUEBAS A BOOKING.COM APP

Este es un proyecto de Automatización Mobile que utiliza Serenity BDD Screenplay y Appium
para la creación de un framework de automatización que permita probar el apk [BOOKING](https://drive.google.com/file/d/1ruY_5qcqWlsE3-W3rgXpFyyMiO59wFUc/view?usp=sharing)

Este proyecto ha sido desarrollado por [Herbert Melendez](https://www.linkedin.com/in/herb-me-ga/) para mejorar en el
desarrollo en pruebas avanzadas de mobile automation.

PLAN DE PRUEBAS en la ruta:

> src/test/resources/Deliverables/PLAN_DE_PRUEBAS_BOOKING_APP.markdown

***

## Detalles del Tester

* Name: `Herbert Melendez`
* Country: `PERU`
* City: `Lima`
* LinkedIn: [https://www.linkedin.com/in/herb-me-ga/](https://www.linkedin.com/in/herb-me-ga/)

***

## Lenguajes & Frameworks

Este proyecto utiliza los siguientes lenguajes y frameworks:

* [Serenity BDD](https://serenity-bdd.github.io/docs/guide/user_guide_intro) como framework de pruebas
  automatizadas.
* [Appium](https://appium.io/) como framework para probar y validar aplicaciones web nativas, híbridas y móviles.
* [Cucumber](https://cucumber.io/) como software de testing BDD que permite elaborar pruebas a partir de AC.


* [Java 11](https://www.oracle.com/co/java/technologies/javase/jdk11-archive-downloads.html) como lenguaje de
  programación.
* [Screen Play](https://serenity-bdd.github.io/docs/screenplay/screenplay_fundamentals) como el patrón de
  diseño.
* [MAVEN](https://maven.apache.org/what-is-maven.html) como herramienta de compilación.

***

## Pre-requisitos:

1. Descargar la última versión estable de Java
   JDK [aquí](https://www.oracle.com/co/java/technologies/javase/jdk11-archive-downloads.html)
2. Instalar git desde [aquí](https://git-scm.com)
3. Instalar MAVEN desde [aquí](https://maven.apache.org/download.cgi)
4. Instalar Android studio [aquí](https://developer.android.com/studio)
5. Instalar Appium Desktop(Server GUI) [aquí](https://github.com/appium/appium-desktop)
6. Instalar Appium Inspector [aquí](https://github.com/appium/appium-inspector)


👀 Adicional en su **IDE** de preferencia deberá tener instalados los siguientes plugins:

1. [x] *JUnit*
2. [x] *Cucumber for Java*
3. [x] *Gherkin*
4. [x] *Lombok*

***

### 🚀 Pruebas de Integración continua

> Con GitHub Actions, puedes crear flujos de trabajo de integración continua (IC) directamente en tu repositorio de
> GitHub.

Para este proyecto se hace uso de GitHUb Actions como herramienta para la integración continua del framework de
automatización desarrollado.

La ruta del pipeline se encuentra en: `.github/workflows/mobile-booking-testing-integration.yml`

**⏱️ Ejecución automatizada**:   
El pipepile se ejecutará periódicamente de forma automática por medio la siguiente 'cron schedule expression':

```yml
on:
  schedule:
    - cron: "00 00 * * THU"
```

**📄️ Generando los reportes de prueba**:  
Con la ejecución del pipepile se generará un artefacto `serenity-reports` donde se alojarán los reportes con los
resultados de la ejecución realizada, en la ruta `target/site/serenity`.

### 🧪 Casos de prueba contemplados

Test diseñados para validar los escenarios **Happy Paths** 😃

***
> **✨ FEATURE**: Booking | Creación de un servicio completo de alojamiento
> - [x] [TEST-001] - Validar busqueda de habitación
>
> - [x] [TEST-002] - Validar alojamiento seleccionable
>
> - [x] [TEST-003] - Validar el ingreso de datos de cliente
>
> - [x] [TEST-004] - Validar pago y finalizacion de la reserva
***
Test diseñados para validar los escenarios **UNHappy Paths** 🤡

> **✨ FEATURE**: UnHappy Paths | Funcionamiento del servicio de alojamiento
> - [x] [TEST-005] - Validar que no permita buscar sin ciudad de destino
***

## 🏗️ Estructura del proyecto

El proyecto tiene scripts de compilación para MAVEN las dependencias se encuentran en el archivo pom.xml y sigue la estructura la siguiente estructura basada en el patrón
de diseño de Screenplay:

```Gherkin
src
+ main                                  | Source main
+ test                                  |
+ java                                  | Test runners and supporting code
+ features                              | Features set
+ {feature_name}                        | Feature name
+ pages                                 | Pages use with webdriver test
+ steps                                 | Utility class for definition steps
+ {feature_name}Definition.java         | Definition class
+ utils                                 | General utility class
+ Runners                               | Main class
+ resources                             |
+ features                              | Feature files
          + {feature_name}               | Feature file  specific
{feature_name}.feature                   |
+ serenity.conf                             | Config file for Serenity
serenity.properties                       | General properties Serenity
```

***

## ▶️ Ejecución del proyecto:

1. Descarga el proyecto desde GitHub
    * **Opción 1** (HTTPS): `https://github.com/HerbertMG/TestAndroidBooking.git`
    * **Opción 2:** Descárgalo como archivo Zip y extráelo

***

2. **CD** en la carpeta `TestAndroidBooking`.
3. Configurar MAVEN
    * Ejecute el siguiente comando en el terminal:`mvn clean install`.

***

4. Ejecutar las pruebas en el proyecto
* Ir a las clases de la carpeta **runners** `src/test/java/runners/BookingAppRunner.java` y ejecutar
  el Runner.

***

## 📄 Generación de informes

El informe al detalle con los pasos y resultados de las pruebas que se registrará en la ruta:
`TestAndroidBooking\target\site\serenityindex.html`.

Adicional se genera un reporte single page si se desea una revisión de alto nivel sobre los resultados de los test, el
cual se registrará en la ruta:
`target/site/serenity/serenity-summary.html`.

Este comando permitirá generar ambos reportes:

```bash
mvn clean verify serenity:aggregate

```

***