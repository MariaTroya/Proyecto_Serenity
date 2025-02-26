Ejercicio 1 - Serenity BDD.

María Magdalena Troya Iriarte

Realizar una prueba funcional automatizada (Prueba E2E) de un flujo de compra en la página
https://www.demoblaze.com/ que incluya:
• Agregar dos productos al carrito
• Visualizar el carrito
• Completar el formulario de compra
• Finalizar la compra

Datos para login: maria_test y password: maria_test


## Requisitos

Para ejecutar el proyecto es necesario tener instalado lo siguiente:

    - Sistema Operativo Windows 10
    - IDE IntelliJ version 2024.1
    - Gradle 8.0 (debe estar en la variable de entorno)
    - JDK versión 17 (debe estar en la variable de entorno)


## Ejecucion
- Para ejecutar el proyecto
        1. Abrir el IDE IntellijIdea
        2. Ingresar en la opción File -> Open y ubicarse en el proyecto (abrir)
        3. Esperar unos minutos para que se descargen las despendencias (gradle)
        4. dentro del Intellij ubicarse sobre  la carpeta principal del proyecto y clic derecho sobre Run 'Test in Automatizacion' o dirigirse
	  \src\test\java\co\com\ejercicio\software\runners y ejecutar la clase buyRunner.java
        5. Reporte Serenity: Una vez finalizada la ejecución se crea el informe propio de Serenity (se añadio capturas de pantalla de cada paso)
            para visualizarlo ubicarse en la ruta target/serenity/index.html
        6. El escenario se modifico mediante el ingreso de datos outline.
        7. Los resultados de las pruebas ejecutas se ubican en la carpeta Evidencias.
