/**
  Represent a date
 */
public class Date implements Comparable{
    private int y,m,d;


    // -------- previously-written code --------
    // constructor
    public Date( int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }

    /**
      @return a string representation of this instance
     */
    public String toString() {
        // ISO 8601 rules!
        return String.format("%4d-%02d-%02d",y, m, d);
    }

    public int compareTo( Object otherObj){
           Date objOther = (Date) otherObj;
           double d0 = y * 365 + m * 30 + d;
           double d1 = objOther.y * 365 + objOther.m * 30 + objOther.d;
           return Double.compare(d0,d1);
    }

}
