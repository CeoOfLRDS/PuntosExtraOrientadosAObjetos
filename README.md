# PuntosExtraOrientadosAObjetos

### 1. Correcciones en la Clase `Pizza`

* **Tipo de dato de la Masa:** El diagrama indicaba de forma ambigua un atributo `double masa` dentro de la clase `Pizza`. Esto se descarto en favor de utilizar correctamente el enumerador `Masa` definido en el mismo documento.
* **Manejo de Ingredientes:** El diagrama especificaba un atributo `-ingr[]` y un metodo `+ingresar(ingr : string)`. En el codigo, esto se implemento literalmente como un arreglo primitivo `String[] ingredientes` y se aniadio un contador interno para gestionar las inserciones sin sobrepasar el limite de memoria del arreglo.
* **Integracion de Salsa:** Se implemento el uso del `Enum Salsa` dentro de la clase, reemplazando la sintaxis inconsistente del original.

### 2. Implementacion Fiel de Enumeradores (Enums)

* **Enum Masa:** Se implemento como una estructura independiente con las opciones exactas listadas en el esquema: `DELGADA`, `GRUESA`, `BORDE_QUESO` (adaptado de "borde queso"), `TOSTADA` y `SUAVE`.
* **Enum Salsa:** Se traslado la nota textual del documento al codigo, incluyendo los valores `NORMAL`, `ENDULZADA`, `PICANTE`, `EXTRAPICANTE` y `SINSALSA`.

### 3. Ajustes Logicos en la Clase `Orden`

* Se implementaron los atributos exigidos: `-prioridad: int`, `nombre: String` y `delivery: boolean`.
* Se respetaron los metodos `+nombrarPedido(nombre: String)` y `+marcarDelivery(delivery: boolean)`.
* **Conexion de objetos:** Aunque el esquema original omitia visualmente la relacion directa, se anadio un atributo de tipo `Pizza` a la clase `Orden` para que el sistema tenga sentido logico y la orden almacene realmente el producto solicitado.

### 4. Traduccion Estricta en la Clase `Cocina`

* **Arreglos estaticos y dinamicos:** La instruccion `+OrdAct[ ] static ordAct[5]` se tradujo de forma directa a un arreglo de capacidad fija `private static Orden[] ordAct = new Orden[5]`. De igual forma, el atributo `-Ordenes[]` se implemento como un arreglo estandar de ordenes.
