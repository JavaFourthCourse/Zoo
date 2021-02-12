package zooaps.zoo.birds;

import zooaps.zoo.AnimalsSound;

/**
 * Класс описывающий ворону
 */
public class Crow implements AnimalsSound
{
	/**
	 * Звук издаваемый вороной
	 * @return Строка с издаваемым вороной звуком
	 */
	@Override
	public String sound()
	{
		return "caw";
	}
}
