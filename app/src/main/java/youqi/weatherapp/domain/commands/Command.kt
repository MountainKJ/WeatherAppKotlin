package youqi.weatherapp.domain.commands

interface Command<T> {
    fun execute(): T
}