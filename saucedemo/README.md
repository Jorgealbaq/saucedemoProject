Challenge | Automation

Este repositorio contiene pruebas automatizadas que validan las funcionalidades "Inicio de sesión" y "Agregado de productos al carrito de compras" en el sitio web https://www.saucedemo.com/. Además, se ha creado un pequeño framework de automatización utilizando Java, Selenium WebDriver y TestNG. El framework también permite interactuar con servicios web y capturar capturas de pantalla en caso de fallas.

Instrucciones de Instalación con comandos: 
1. Clona este repositorio en tu máquina local:
git clone https://github.com/tu-usuario/tu-repositorio.git
2. Navega al directorio del proyecto:
cd nombre-del-proyecto
3. Instala las dependencias nombradas:
- org.seleniumhq.selenium:selenium-java:3.141.59
- org.assertj:assertj-core:3.21.0 (scope: test)
- org.testng:testng:7.7.1
- commons-io:commons-io:2.11.0
- io.rest-assured:rest-assured:4.4.0 (scope: test)

Ejecución de las Pruebas
1. Asegúrate de estar en el directorio del proyecto.
2. Ejecuta las pruebas usando el comando:
mvn test
3. Los resultados de las pruebas se mostrarán en la consola y se generarán reportes en la carpeta test-output archivo emailable-report.