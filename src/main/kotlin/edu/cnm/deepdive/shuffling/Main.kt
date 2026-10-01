package edu.cnm.deepdive.shuffling

import java.util.random.RandomGenerator

fun main(args: Array<String>) {
    val rng = RandomGenerator.getDefault()
    val shuffler = Shuffler(rng)
    shuffler.shuffle(args)
    println(args.contentToString())
}