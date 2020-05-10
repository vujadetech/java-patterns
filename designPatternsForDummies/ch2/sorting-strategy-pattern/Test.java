import static java.lang.System.out;
import java.util.*;


/**
 * Java Program to implement Strategy design pattern in Java.
 * Strategy pattern allows you to supply different strategy without
 * changing the Context class, which uses that strategy. You can
 * also introduce new sorting strategy any time. Similar example
 * is Collections.sort() method, which accept Comparator or Comparable
 * which is actually a Strategy to compare objects in Java.
 *
 * @author WINDOWS 8
 */

public class Test {
    public static boolean VERBOSE = true;

    public static void main(String args[]) {

        // we can provide any strategy to do the sorting
        int[] var = {4, 1, 5, 3, 2};
        int N = 6, MaxValue = 20;

        Context ctx = new Context(new BubbleSort());
        // int[] xs = new int[] {0,1,2,3,4,5,6}; // Test.makeRandomArrayInts(N, MaxValue);
        int[] xs = Test.makeRandomArrayInts(N, MaxValue);
        ArrayList<Character> Chars = new ArrayList<Character>(Arrays.asList('c', 'd', 'a', 'b', 'e'));
      //  ArrayList<Integer> Idxs = Test.locsLessThan(Chars, 'c');

        Character pivot = new Character(Chars.get(0));
        ArrayList<Integer> LTidxs = locsLessThan(Chars, pivot);
        ArrayList<Integer> GTidxs = locsGreaterThan(Chars, pivot);
        qs(Chars, LTidxs, pivot, GTidxs);

  //      int[] idxs = new int[] {0, 2, 3, 5};
    //    out.println("ys = ");
    //    int[] ys = Test.getValsAtIndices(xs, idxs);
        //Test.pArray(ys);
        out.println();

        // Test.pArray(rest(var));

        //Test.pArray(xs);
        //ctx.arrange(xs);
        //Test.pArray(xs);


        // Test.pArray(xs);

        // we can change the strategy without changing Context class
        //ctx = new Context(new QuickSort());
        //ctx.arrange(var);smallers.add()
        //Test.swap(var, 1);

    }

    public static void swap(int[] xs, int idx) { // swap xs[idx] with xs[idx+1]
      int temp = xs[idx];
      xs[idx] = xs[idx+1];
      xs[idx+1] = temp;
    }

    public static void pArray(int[] xs) {
      for (int x: xs) { out.print(x + ", "); }
      //out.println();
    }

    public static int[] makeRandomArrayInts(int N, int MAX) {
          int[] xs = new int[ N ];
          Random r = new Random();
          //for(int x: xs) {  x = r.nextInt() % MAX; }
          for (int i = 0; i < N; ++i) {
            xs[i] = Math.floorMod(r.nextInt(), MAX);
          }
          return xs;
    }

    public static int[] getValsAtIndices(int[] xs, int[] idxs) {
      int N = idxs.length;
      int[] ys = new int[ N ];
      for(int i = 0; i < N; ++i) {
        ys[ i ] = xs[ idxs[ i ] ];
      }
      return ys;
    }

    public static char[] subArray(char[] xs, int[] idxs) {
      int N = idxs.length;
      char[] ys = new char[ N ];
      for(int i = 0; i < N; ++i) {
        ys[ i ] = xs[ idxs[ i ] ];
      }
      return ys;
    }


    public static ArrayList<Integer> arrayOfIntsToArrayListIntegers(int[] xs) {
      ArrayList<Integer> ys = new ArrayList<Integer>();
      for(int x : xs) { ys.add(x); }
      return ys;
    }

    public static int[] ArrayListOfIntegersToArrayOfInts(ArrayList<Integer> xs) {
      int[] ys = new int[ xs.size() ];
      for(int i = 0; i < xs.size(); ++i) { ys[ i ] = xs.get(i); }
      return ys;
    }

/*
    public static ArrayList<Integer> locsLessThan(ArrayList<Character> xs, Character pivot) { //
      // ArrayList<Character> LocsLess = new ArrayList<Character>();
      ArrayList<Integer> LocsLess = new ArrayList<Integer>();
      for(int i = 0; i < xs.size() ; ++i) {
        if (xs.get(i) < pivot) LocsLess.add(i);
      }
      out.println(LocsLess);
      return LocsLess;
    }
*/

    public static ArrayList<Integer> locsLessThan(ArrayList<Character> xs, ArrayList<Integer> idxs, Character pivot) { //
      // ArrayList<Character> LocsLess = new ArrayList<Character>();
      ArrayList<Integer> LocsLess = new ArrayList<Integer>();
      for(int i = 0; i < idxs.size() ; ++i) {
        if (xs.get( idxs.get(i) ) < pivot) LocsLess.add(i);
      }
      //out.println(LocsLess);
      return LocsLess;
    }

    public static ArrayList<Integer> locsGreaterThan(ArrayList<Character> xs, ArrayList<Integer> idxs, Character pivot) { //
      // ArrayList<Character> LocsLess = new ArrayList<Character>();
      ArrayList<Integer> LocsGreater = new ArrayList<Integer>();
      for(int i = 0; i < xs.size() ; ++i) {
        if (xs.get( idxs.get(i) ) > pivot) LocsGreater.add(i);
      }
      out.println(LocsGreater);
      return LocsGreater;
    }

// method overloading
/*
    public static ArrayList<Integer> locsGreaterThan(ArrayList<Character> xs, ArrayList<Integer> idxs, Character pivot) { //
      // ArrayList<Character> LocsLess = new ArrayList<Character>();
      ArrayList<Integer> LocsGreater = new ArrayList<Integer>();
      for(int i = 0; i < idxs.size() ; ++i) {
        if (xs.get( idxs.get(i) ) > pivot) LocsGreater.add(i);
      }
      out.println(LocsGreater);
      return LocsGreater;
    }
*/

/*
    public static void qs(ArrayList<Character> xs, int[] LTidxs, Character pivot, int[] GTidxs) {
      //if ((LTidxs.length == 0) && (GTidxs.length == 0)) { out.print(pivot + ", "); }
      if (LTidxs.length > 0) {  // { out.print(pivot + ", "); }

        int LeftPivotIndex = LTidxs[0];
        Character leftPivot = new Character(xs.get(LeftPivotIndex));
        ArrayList<Integer> leftLT = locsLessThan(xs, rest(LTidxs), leftPivot);
        ArrayList<Integer> leftGT = locsGreaterThan(xs, rest(LTidxs), leftPivot);
      //  qs(Test.arrayOfIntsToArrayListIntegers())

      }
    }
*/

    public static void qs(ArrayList<Character> xs, ArrayList<Integer> LTidxs, Character pivot, ArrayList<Integer> GTidxs) {
      //if ((LTidxs.length == 0) && (GTidxs.length == 0)) { out.print(pivot + ", "); }
      if (LTidxs.size() > 0) {  // { out.print(pivot + ", "); }

        int LeftPivotIndex = LTidxs.get(0);
        Character leftPivot = new Character(xs.get(LeftPivotIndex));
        ArrayList<Integer> leftLT = locsLessThan(xs, Test.ArrayListOfIntegersToArrayOfInts(rest(LTidxs)), leftPivot);
        ArrayList<Integer> rightLT = locsGreaterThan(xs, Test.ArrayListOfIntegersToArrayOfInts(rest(LTidxs)), leftPivot);
    //    ArrayList<Integer> leftGT = locsGreaterThan(xs, rest(LTidxs), leftPivot);
        qs(xs, leftLT, leftPivot, rightLT); // , Test.arrayOfIntsToArrayListIntegers(
      }
      out.print(", " + pivot);


    }

    public static int[] rest(int[] xs) {
      if (xs.length == 1) return new int[0]; // rest is empty
      else {
        int[] tail = new int[xs.length - 1];
        for(int i = 1; i < xs.length; ++i) { tail[i-1] = xs[i]; }
        return tail;
      }
    }

    public static ArrayList<Integer> rest(ArrayList<Integer> xs) {
      xs.remove(0);
      return xs;
    }

interface Strategy {
    public void sort(int[] xs, boolean verbose);
    public void sort(int[] xs);
}

static class BubbleSort implements Strategy {

    @Override
    public void sort(int[] xs, boolean verbose) {
        System.out.println("sorting array using bubble sort strategy");
        int N = xs.length, swaps = 0, i = 0;
        boolean sorted = false;

        while(!sorted) {
          if (xs[i] > xs[i+1]) {
            Test.swap(xs, i);
            ++swaps;
            if (verbose) { Test.pArray(xs); out.println(); }
          }
          if (i == N-2) { // at next to last element, either done or start from beginning
            if (swaps == 0) { sorted = true; } // done
            else { // start from beginning
              i = 0; swaps = 0;
            }
          } else { ++i; } // before next to last element, keep going
        }
    }

    @Override
    public void sort(int[] xs) { this.sort(xs, Test.VERBOSE); }
}

/*
class InsertionSort implements Strategy {
    @Override
    public void sort(int[] numbers) {
        System.out.println("sorting array using insertion sort strategy");

    }
}
*/

class QuickSort implements Strategy {
    @Override
    public void sort(int[] xs, boolean verbose) {
        System.out.println("\nsorting array using quick sort strategy");



    }

    @Override
    public void sort(int[] xs) { sort(xs, Test.VERBOSE); }
}
/*
class MergeSort implements Strategy {
    @Override
    public void sort(int[] numbers) {
        System.out.println("sorting array using merge sort strategy");

    }
}
*/

static class Context {
    private final Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void arrange(int[] input) {
        strategy.sort(input);
    }
}

}
