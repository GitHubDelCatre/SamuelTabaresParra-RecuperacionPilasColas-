# Gestión de Turnos - Banco

Sistema simple de colas para atender clientes en un banco.

## Compilar y ejecutar

```
javac -d bin src/*.java
cd bin
java App
```

## Funciones

1. **Llegada cliente** - Encola un nuevo cliente
2. **Atender cliente** - Desencola y atiende al primero
3. **Ver siguiente cliente** - Muestra quién es el próximo (sin eliminar)
4. **Ver cola** - Muestra todos en espera
5. **Ver turnos** - Muestra atendidos y pendientes
