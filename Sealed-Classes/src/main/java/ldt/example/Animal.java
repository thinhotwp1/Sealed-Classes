package ldt.example;

public sealed interface Animal permits Dog, Cat, Mouse {
    void name();
}
