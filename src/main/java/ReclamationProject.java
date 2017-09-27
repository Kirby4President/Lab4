/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */

public class ReclamationProject
{
    static String doit(String a,String b){
        if (a.length() > b.length()){
            String c = a;
            a=b;
            b=c;
        }
        String r = /* (a.equals(b)) ? "" : */ "";
        for (int iCounter = 0; iCounter < a.length(); iCounter++){
            for (int jCounter = a.length() - iCounter; jCounter > 0; jCounter--) {
                for (int kCounter = 0; kCounter < b.length()- jCounter; kCounter++) {
                    boolean regionMatch = a.regionMatches(iCounter, b, kCounter, jCounter);
                    r = (regionMatch && jCounter > r.length()) ? a.substring(iCounter,iCounter + jCounter) : r; // Setting R to the largest substring from both a and b
                }
            }
        }
        return r;
    }
}
