/*Краткое описание
*
* Игра предусматривает один игровой объект и три объекта-игрока. Генерируются случайные числа от 0 до 9, а три объекта-игрока пытаются их угадать
*
* Классы: GuessGame.class Player.class Main.class
*
* Логика:
* 1) Класс Main - это точка, из которой стартует прилоджение. Содержит класс main.
* 2) В методе main() создается объект GuessGame, из которого вызывается метод startGame().
* 3) В методе startGame() объекта GuessGame происходлит весь игровой процесс. Он создает трех игроков, затем "придумывает" случайные числа
*    (которые игроки должны угадывать).
*    После того как каждого из игроков просят угадать число, проверяется результат и либо выводится информация о победителях, либо игроков просят угадать еще раз.*/

package com.company;

public class Main {

    public static void main(String[] args) {
	GuessGame game = new GuessGame();
	game.startGame();
    }
}