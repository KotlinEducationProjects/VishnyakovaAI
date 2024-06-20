var heroName = "ХХХ"
var level = 1
var experience = 0
val enemy = 6
var enemyNum = 0


fun main() {
    println("Введите имя героя")
    heroName = readLine().toString()

    while (enemy > enemyNum) {
        enemyNum = enemyNum + 1
        println("${heroName} убил врага ${enemyNum}? (Введите да или нет)")
        var answerEnemy = readLine()
        if (answerEnemy == "да") {
            experience = experience + 10
            println("Враг побеждён. ${heroName} приобрёл баллы опыта. Опыт на этом уровне ${experience}")
        } else {
            println("Враг не побеждён. ${heroName} не приобрёл баллы опыта")
        }
        if(experience == 30) {
            level = level + 1
            println("${heroName} перешёл на уровень ${level}")
            experience = 0
        } else {

        println("Уровень ${heroName} ${level}")
        }
    }
}



