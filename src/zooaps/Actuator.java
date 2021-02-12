package zooaps;

import zooaps.zoo.Zoo;

/**
 * Класс с точкой входа приложения
 */
public class Actuator
{
	/**
	 * Точка входа приложения
	 *
	 * @param args консольные аргументы
	 */
	public static void main(String[] args)
	{
		Zoo zoo = new Zoo();

		zoo.animalsSounds();
	}
}
