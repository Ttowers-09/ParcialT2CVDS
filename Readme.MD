# Parcial - Ciclo de Vida del Desarrollo de Software (CVDS) - Segundo Tercio

Este proyecto corresponde al MVP de la primera versión de un sistema de pagos desarrollado para una empresa del sector de ventas. El sistema permite registrar pagos a través de un proveedor externo llamado **ECICredit**, validando la información del usuario y mostrando los pagos realizados.

## Descripción del Proceso

El flujo del proceso de pago es el siguiente:

1. El usuario ingresa la información de la compra, incluyendo los productos que desea adquirir.
2. Si los campos no cumplen con las restricciones, la solicitud es **declinada**.
3. Si pasa las validaciones, el pago es **aprobado** y se guarda en el sistema con su respectivo estado.
4. El usuario puede **consultar sus pagos** utilizando su identificador, visualizando sus pagos acreditados.

## Criterios de Aceptación y Restricciones

- Se debe solicitar al usuario la información detallada del pago:
  - Lista de artículos con su **valor unitario**, **cantidad**, y **fecha de compra**.
- El **valor total** debe coincidir con la suma de todos los productos.
  - Si no coincide, debe lanzarse una **excepción informativa** al usuario.
- Al finalizar el pago, el usuario debe ver:
  - Toda la información de la orden.
  - El **monto total**, **número de transacción**, y **respuesta del sistema**.
  - En caso de error, incluir el mensaje de respuesta y el estatus (**Aprobado** / **Declinado**).
- Las fechas deben ser ingresadas en formato **DD-MM-YYYY**.

## Puntos a Evaluar

1. **Diseño de arquitectura** del sistema:
   - Diagrama de **clases** y **componentes** para explicar la solución.
2. Implementar los métodos:
   - `pagar()`
   - `consultarPagoPorUsuario()`
   - Persistencia con **MongoDB** para guardar las transacciones.
3. Pruebas unitarias:
   - Cobertura mínima del **80%** para servicios y utilidades.
4. Implementación de **CI/CD** para el servicio.
5. **Despliegue del backend** en **Azure**.
6. Desarrollo de un **frontend en React**:
   - Permitir el **registro** y la **consulta** de pagos.
   - El frontend puede correr localmente, pero debe conectarse al backend desplegado en Azure.
7. Este `README` debe incluir:
   - Explicación de la **arquitectura del proyecto**.
   - Instrucciones para **ejecutar el proyecto**.
   - Tecnologías utilizadas.
   - Métodos de la **API**.
   - Imágenes del frontend mostrando los escenarios requeridos.


# Imágenes del Proyecto

![Imagen 1](resources/1.png)  
![Imagen 2](resources/2.png)  
![Imagen 3](resources/3.png)  
![Imagen 4](resources/4.png)  
![Imagen 5](resources/5.png)  
![Imagen 6](resources/6.png)  
![Imagen 7](resources/7.png)  
![Imagen 8](resources/8.png)  
![Imagen 9](resources/9.png)  
![Imagen 10](resources/10.png)  
![Imagen 11](resources/11.png)  
![Imagen 12](resources/12.png)  
![Imagen 13](resources/13.png)  
![Imagen 14](resources/14.png)  
![Imagen 15](resources/15.png)  
![Imagen 16](resources/16.png)  
![Imagen 17](resources/17.png)  
![Imagen 18](resources/18.png)  
![Imagen 19](resources/19.png)  
![Imagen 20](resources/20.png)  
![Imagen 21](resources/21.png)  
![Imagen 22](resources/22.png)  
![Imagen 23](resources/23.png)  
![Imagen 24](resources/24.png)  
![Imagen 25](resources/25.png)  
![Imagen 26](resources/26.png)  
![Imagen 27](resources/27.png)  
![Imagen 28](resources/28.png)  
![Imagen 29](resources/29.png)  
![Imagen 30](resources/30.png)


![Imagen 31](resources/diag.jpeg)
