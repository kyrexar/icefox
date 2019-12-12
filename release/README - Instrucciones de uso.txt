---
ARRANQUE
---
En la cmd de Windows ejecutar en la misma ubicación donde esté icefox.jar el comando:

java -jar icefox.jar

----
USO
---
Solicitará una URL, introducir completa (incluido "http://www...").
Devolverá el código de respuesta del servidor.
Si ha sido 200 OK preguntará la cantidad de cáracteres del HTML que desea mostrar (0 muestra todo el html).

---
COMANDOS ADICIONALES
---
Estos comandos se pueden introducir en lugar de una URL:
 - icefox: modo debbugging que testea los códigos HTTP conectandose a la web https://httpstat.us/
 - salir: cierra el programa