
# Práctica de Clases Parametrizadas (Genéricos en Java)

Este repositorio contiene la resolución de la práctica grupal sobre programación genérica en Java para la materia **Paradigmas de Programación**.

---

## 👥 Integrantes del Grupo
* **Román Ávila**
* **Maximiliano Reinoso**
* **Leonel Facinelli**

---

## 🚀 Ejercicios Seleccionados

De acuerdo con las consignas de la cátedra, nuestro grupo seleccionó y resolvió los siguientes **2 ejercicios**:

### 📦 Ejercicio 2 — La Mochila de Mario
* **Objetivo:** Demostrar las ventajas, la flexibilidad y la seguridad de tipos que ofrecen los genéricos frente a las implementaciones cerradas de dominio.
* **Implementación:** * Se diseñó una clase abstracta y reutilizable `Mochila<T>` utilizando un `ArrayList<T>` interno para almacenar cualquier tipo de elemento.
  * Se creó una clase de dominio cerrado `MochilaDeMonedas` restringida únicamente al tipo `Moneda`, incorporando métodos específicos del negocio (como el cálculo del valor acumulado).
  * Se desarrolló una clase `Banana` para probar la flexibilidad total del molde genérico instanciado como `<Object>`.

### 🧮 Ejercicio 4 — Calculadora Genérica (`<T extends Number>`)
* **Objetivo:** Aplicar el concepto de **Tipos Acotados (Bounded Types)** para restringir los parámetros de tipo a operaciones puramente matemáticas.
* **Implementación:**
  * Se implementó la clase utilizando la cota `<T extends Number>` para asegurar que el molde solo acepte tipos numéricos (`Integer`, `Double`, `Float`, etc.).
  * Se desarrollaron los métodos genéricos para calcular el `promedio()` y hallar el `maximo()` dentro de listas numéricas, resolviendo las limitaciones del borrado de tipos mediante métodos de la clase `Number`.

---

## 💻 Tecnologías Utilizadas
* **Lenguaje:** Java (Versión 8 o superior)
* **IDE:** IntelliJ IDEA
* **Control de Versiones:** Git & GitHub

---

## 🛠️ Cómo Ejecutar las Pruebas

1. Clonar este repositorio en tu máquina local.
2. Abrir el proyecto desde tu IDE de preferencia (se recomienda IntelliJ IDEA).
3. Dirigirse al archivo `src/Main.java`.
4. Ejecutar el método `main` (clic en el botón de Play verde) para observar en la consola las salidas de prueba, el comportamiento de las mochilas y los cálculos de la calculadora genérica.
