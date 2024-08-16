Descripción de la prueba
Implementación del patrón Circuit Braker
Objetivo(s) de la prueba
•	Aprender el concepto y su utilización del patrón Circuit Braker
•	Implementar el patrón Circuit Braker en un lenguaje de programación
•	Realizar conclusiones con respecto a vivencias o proyectos realizados en la vida real
Pasos implementados para llevar a cabo la prueba
•	Investigación de la teoría acerca del del patrón Circuit Braker
•	Como implementarlo bajo un lenguaje de programación
•	Escoger una librearía que apoye la implementación
•	Desarrollo de la prueba
•	Pruebas del desarrollo realizado
•	Conclusiones
Tecnologías usadas en la prueba (especifique lenguajes, librerías)
•	JAVA 22
•	SPRING BOOT 3
•	RESILIENCE4J-SPRING-BOOT3
•	SPRING-BOOT-STARTER-ACTUATOR
Resultados
Se implementa con éxito la prueba como resultado se evidencia los beneficios de utilizar este patrón en desarrollo que utilicen servicios externos y que no se tenga el control de ellos
Conclusiones
•	Al implementar este patrón, el sistema impide que se sigan haciendo peticiones  y esto genere un deterioro en el performance de la aplicación que con lleve  a una caída de todo el sistema
•	La librería utilizada permite configurar cuantes peticiones con fallas para cambiar el estado open y de la misma forma a close
•	También permite configurar este circuito en forma automática o manual
•	También permite auditar el estado a través del atuactor
•	Los beneficios de implementar este tipo de patron es controlar sobre todos los servicios una respuesta controlada para que el usuario identifique de una forma amigable que se tiene algún problema y no lo siga intentando o lo haga depues de espera un periodo de tiempo
•	De igual forma se recomienda llevar los logs de los errores reportados sobre alguna plataforma externa para poder revisarlos y hacerle seguimiento



