

class robberDemo {





   private static int rob(int[] houses, int index) {

      if(index == houses.length - 1) return houses[index];

      if(index >= houses.length) return 0;

      int pick = houses[index] + rob(houses, index + 2);
      int not_pick = rob(houses, index + 1);

      return Math.max(pick, not_pick);
   }


   public static void main(String args[] ) {

      int n = 5;

      int[] houses = {
         9, 
         2,
         1, 
         8,
         7
      };

      // int[] houses = new int[4];

      // houses[0] = 8;
      // houses[1] = 1;
      // houses[2] = 2;
      // houses[3] = 9;
      


      System.out.println(rob(houses, 0));

   }
}