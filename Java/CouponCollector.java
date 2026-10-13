public class CouponCollector {

  public static void main(String[] args) {

    int trials;
    int coupons;

    try {
      trials = Integer.parseInt(args[0]);
      coupons = Integer.parseInt(args[1]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("ERROR: Requires two valid integer inputs. java CouponCollector <trials> <coupons>");
      return;
    } catch (NumberFormatException e) {
      System.out.println("ERROR: Requires two valid integer inputs. java CouponCollector <trials> <coupons>");
      return;
    }

    boolean[] found;
    int average = 0;
    int total = 0;

    for (int n = 0; n < trials; n++) {
      found = new boolean[coupons]; 

      total += play(found);

    }
  
    average = total/trials;
    System.out.println("Average total over " + trials + " trials: " + average);

  }

  private static int play(boolean[] found) {
    int total = 0; // number of total coupons collected
    int distinct = 0; // number of distinct coupons collected

    while (distinct < found.length) {

      int r = (int) (Math.random() * found.length);
      total++;

      if (!found[r]) {
        distinct++;
        found[r] = true;
      }

    }

    return total;

  }

}
