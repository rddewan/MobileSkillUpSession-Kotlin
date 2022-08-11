package com.example.mobileskillupsession.lsp.bad

fun main() {
    val realDuck: Duck = RealDuck();
    realDuck.duckDuck()
    realDuck.swim()

    val toyDuck1: ToyDuck = ToyDuck()
    toyDuck1.duckDuck()
    // this break the lSP
    toyDuck1.swim()

    val toyDuck2: Duck = ToyDuck()
    toyDuck2.duckDuck()
    // this break the lSP
    toyDuck2.swim()
}