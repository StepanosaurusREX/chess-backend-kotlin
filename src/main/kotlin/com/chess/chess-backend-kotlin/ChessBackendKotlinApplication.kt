package com.chess.chess_backend_kotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ChessBackendKotlinApplication

fun main(args: Array<String>) {
	runApplication<ChessBackendKotlinApplication>(*args)

	println("Hello world!")
}
