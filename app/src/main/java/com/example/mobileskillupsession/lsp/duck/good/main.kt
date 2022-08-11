package com.example.mobileskillupsession.lsp.duck.good



fun main() {

    val realDuck1: RealDuck = RealDuck();
    realDuck1.duckDuck()
    realDuck1.swim()

    // substitute with super class / base class
    val realDuck2: Duck = RealDuck();
    realDuck2.duckDuck()
    realDuck2.swim()


    val toyDuck1: ToyDuck = ToyDuck()
    toyDuck1.duckDuck()

    // substitute with super class / base class
    val toyDuck2: DuckDuck = ToyDuck()
    toyDuck2.duckDuck()


}