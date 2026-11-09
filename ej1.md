# Ejercicio 1: FiguraGeometrica

## Explicación Lógica
1. **Clase Abstracta:** `FiguraGeometrica` no puede ser instanciada directamente con el operador `new` porque actúa como un molde/contrato incompleto.
2. **Método Abstracto:** `calcularArea()` no posee cuerpo en la superclase, forzando a `Circulo` y `Rectangulo` a implementar obligatoriamente sus fórmulas matemáticas específicas.
3. **Reutilización:** Ambas subclases heredan y reutilizan la propiedad común `color` y su getter desde la clase abstracta.