package edu.cnm.deepdive.shuffling

import java.util.random.RandomGenerator

class Shuffler(rng: RandomGenerator) {

    private val rng: RandomGenerator = rng;

    fun <T> shuffle(data: Array<T>) {
        for (target in data.lastIndex downTo 1) {
            val source = rng.nextInt(target + 1)
            val temp = data[target]
            data[target] = data[source]
            data[source] = temp
        }
    }

}