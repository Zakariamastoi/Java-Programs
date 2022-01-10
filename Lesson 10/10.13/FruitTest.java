public class FruitTest
{
	int totalVc = 0;
	int totalAo = 0;
	 public static void main(String[] args) 
	 {
        
        // create subclass objects
        Kino k1 = new Kino(5) ;
        Malta m1 = new Malta (6);
        Kharboza kh1 = new Kharboza (9);
        Tarbooz t1 = new Tarbooz (7) ;
		
		Fruit[] fruitBasket = new Fruit[4];
   
        // initialize array
        fruitBasket[0] = k1;
        fruitBasket[1] = m1;
        fruitBasket[2] = kh1;
        fruitBasket[3] = t1;
		
		for (Fruit currentFruit : fruitBasket)
		{
			System.out.println(currentFruit);
			totalWeight += currentFruit.getPrice();	
	
			System.out.println(totalWeight);
		
			if(fruitBasket instanceof Citrus)
			{
				totalVc += fruitBasket;
			}
			
			if(fruitBasket instanceof Melon)
			{
				totalAo += fruitBasket;
			}
		}
		System.out.println(totalVc + totalAo);
	 }
}