package youqi.weatherapp.domain.commands

import youqi.weatherapp.ForecastRequest
import youqi.weatherapp.domain.datasource.ForecastDataMapper
import youqi.weatherapp.domain.model.ForecastList

class RequestForecastCommand(private val zipCode: String) : Command<ForecastList>{
    override fun execute(): ForecastList {
        val forecastRequest = ForecastRequest(zipCode)
        return ForecastDataMapper().convertFormDataModel(forecastRequest.execute())
    }
}