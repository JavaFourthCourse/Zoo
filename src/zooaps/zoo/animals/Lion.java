package zooaps.zoo.animals;

import zooaps.zoo.AnimalsSound;

/**
 * Класс описывающий льва
 */
public class Lion implements AnimalsSound
{
	/**
	 * Звук издаваемый львом
	 * @return Строка с издаваемым львом звуком
	 */
	@Override
	public String sound()
	{
		return "roar";
	}
}
