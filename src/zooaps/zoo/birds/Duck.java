package zooaps.zoo.birds;

import zooaps.zoo.AnimalsSound;

/**
 * Класс описывающий утку
 */
public class Duck implements AnimalsSound
{
	/**
	 * Звук издаваемый уткой
	 * @return Строка с издаваемым уткой звуком
	 */
	@Override
	public String sound()
	{
		return "quack";
	}
}
