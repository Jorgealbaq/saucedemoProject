| Test Case | Description | Test Step | Expected Result | Status |
| --- | --- | --- | --- | --- |
| Login con usuario Valido | Inicio de sesión exitoso con credenciales válidas | 1. Ingresar credenciales válidas\n2. Hacer click en "Login" | El sistema permite el inicio de sesión y redirige al usuario a la página principal | PASSED |
| Login con usuario bloqueado | Intento de inicio de sesión con credenciales inválidas | 1. Ingresar credenciales inválidas\n2. Hacer click en "Login" | El sistema muestra un mensaje de error indicando credenciales incorrectas y no permite el acceso | PASSED |
| Login sin credenciales | Inicio de sesión sin ingresar credenciales | 1. Dejar campos de usuario y contraseña en blanco\n2. Hacer click en "Login" | El sistema muestra mensajes de error y no permite el acceso | |
| Login y agregar producto al carrito | Agregar producto al carrito con éxito | 1. Iniciar sesión\n2. Seleccionar producto\n3. Hacer click en "Add to cart" | El producto se agrega al carrito y la cantidad se actualiza en el ícono del carrito | PASSED |
| Login y agregar varios productos al carrito | Agregar varios productos al carrito | 1. Iniciar sesión\n2. Seleccionar múltiples productos\n3. Hacer click en "Add to cart" para cada producto | Todos los productos se agregan al carrito y la cantidad total se refleja en el ícono del carrito | |
|  Login, agregado de producto y eliminación del carrito | Agregar y luego remover producto del carrito | 1. Iniciar sesión\n2. Seleccionar producto\n3. Hacer click en "Add to cart"\n4. Navegar al carrito y remover producto | El producto se agrega y luego se elimina del carrito, cantidad en el ícono del carrito cambia | PASSED |
| Login, agregado de producto y compra de producto | Agregar producto al carrito y finalizar la compra | 1. Iniciar sesión\n2. Seleccionar producto\n3. Hacer click en "Add to cart"\n4. Acceder al carrito\n5. Hacer click en "Checkout"\n6. Completar campos de usuario y código postal\n7. Hacer click en "Continue"\n8. Hacer click en "Finish" | El usuario puede completar la compra y finalizar el proceso de checkout | |