package zooaps.zoo.animals;

import zooaps.zoo.AnimalsSound;

/**
 * Класс описывающий кошку
 */
public class Cat implements AnimalsSound
{
	/**
	 * Звук издаваемый кошкой
	 * @return Строка с издаваемым кошкой звуком
	 */
	@Override
	public String sound()
	{
		return "meow";
	}
}
