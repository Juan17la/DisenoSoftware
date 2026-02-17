### Actividad de Abstraction:

1. **Objetivo del sistema:** Desarrollar una aplicación web y móvil que permita gestionar el proceso de pedidos de una cafetería universitaria, incluyendo selección de productos, pago y seguimiento del estado del pedido.
2. **Actores:**
    - **Estudiante / Cliente:** Realiza pedidos, consulta el menú y efectúa pagos.
    - **Personal de la cafetería:** Gestiona y actualiza el estado de los pedidos.
    - **Sistema bancario externo:** Procesa los pagos realizados por los clientes.
3. **Funciones Principales**

    **Usuarios**

    - Registrarse en la plataforma.
    - Iniciar sesión.

    **Pedidos**

    - Ver el menú disponible.
    - Crear y confirmar un pedido.
    - Asignar estado inicial al pedido (pendiente).
    - Consultar estado del pedido.

    **Pagos**

    - Pagar un pedido.
    - Procesar respuesta del sistema bancario.
    - Generar y enviar recibo de pago.

    **Personal Cafeteria**

    - Cambiar el estado del pedido (en preparación, completado, entregado).
    - Enviar notificaciones sobre:
        - Cambios de estado del pedido.
        - Resultado del pago.
4. **Límites del sistema:** El sistema se encarga del flujo completo de pedidos dentro de la cafetería universitaria: desde la selección de productos hasta el pago y el seguimiento del estado.

    No procesa directamente los pagos bancarios, sino que depende de un sistema bancario externo para esa función.

    El cambio de estado de los pedidos requiere la intervención del personal de la cafetería.


![image1](diseno-taller-bloque-2(1).png)

### Actividad de **Modularidad**

![image2](diseno-taller-bloque-2(2).png)

### Actividad de Refinamiento (Pedidos)

![image3](diseno-taller-bloque-2(3).png)

### Actividad de Aplicacion de principios

- **Cómo el diseño es flexible**
El sistema está dividido en módulos, y cada uno tiene una función clara. Por ejemplo, el Módulo de Pedidos coordina el proceso, pero no necesita saber cómo funciona internamente el módulo de Pagos o el de Menú.

    Si en algún momento se cambia el proveedor de pagos, solo habría que modificar el Módulo de Pagos, sin tocar el resto del sistema. Además, como están separados, si una parte del sistema recibe mucho uso (por ejemplo Pedidos), se puede mejorar o ampliar solo ese módulo sin afectar a los demás.

- **Cómo permite pruebas**

    Al estar dividido en módulos, cada parte se puede probar por separado. Por ejemplo, se puede probar el flujo de creación de pedidos usando simulaciones (mocks) del módulo de Pagos o del Menú, sin necesidad de tener todo el sistema funcionando.

    También, definir errores claros (401, 404, 422), es más fácil detectar fallos y saber qué está pasando cuando algo no funciona.

- **Cómo reutiliza componentes**

    El mejor ejemplo es el Módulo de Notificación. No solo lo usa el módulo de Pedidos, también puede ser usado por Pagos (por ejemplo, si falla una tarjeta) o por Personal (para avisos internos). Así se evita repetir código para enviar mensajes, y se mantiene todo más ordenado

- **Qué pasaría si crece a varias sedes**

    Si el sistema se usa en varias sedes, no es necesario cambiar la lógica principal. Solo se agregaría un identificador de sede para que cada módulo trabaje con los datos correspondientes (inventario de la sede A o B).

    Si el sistema crece mucho, se pueden duplicar los módulos que más se usen en lugar de rehacer todo el sistema desde cero.


### Actividad de Arquitectura

![image4](diseno-taller-bloque-2(4).png)
