## Abstractions

Hiding implementation is not just a matter of putting a layer of functions between the variables.
Hiding implementation is about abstraction! A class does not simply push its **variables out through getters and setters**.
Rather it exposes abstract interfaces that allow its users to manipulate the **essence of the data**, without having to know
its implementation.

Objects expose behavior and hide data. This makes it easy to add new kinds of objects
without changing existing behaviors. It also makes it hard to add new behaviors to existing
objects. Data structures expose data and have no significant behavior. This makes it easy to
add new behaviors to existing data structures but makes it hard to add new data structures
to existing functions.
