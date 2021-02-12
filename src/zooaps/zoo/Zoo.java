package zooaps.zoo;

import java.util.ArrayList;
import java.util.List;

import zooaps.zoo.animals.Cat;
import zooaps.zoo.animals.Lion;
import zooaps.zoo.birds.Crow;
import zooaps.zoo.birds.Duck;

/**
 * Класс описывающий зоопарк
 */
public class Zoo
{
	/**
	 * Звуки всех животных в зоопарке
	 */
	public void animalsSounds()
	{
		List<AnimalsSound> sounds = new ArrayList<>();

		sounds.add(new Cat());
		sounds.add(new Lion());
		sounds.add(new Crow());
		sounds.add(new Duck());

		for (AnimalsSound i : sounds)
		{
			System.out.println(i.getClass().getSimpleName() + " is " + i.sound() + "ing");
		}
	}
}
