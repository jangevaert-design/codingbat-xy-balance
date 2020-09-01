public class xyBalance {
  public boolean xyBalance(String str) {
    int lastIndexOfX = str.lastIndexOf('x');

    if (lastIndexOfX == - 1 || str.indexOf('y', lastIndexOfX) != -1) {
      //true if there is no x in the string or if the x is followed by a y.
      return true;
    }
    return false;
  }
}
