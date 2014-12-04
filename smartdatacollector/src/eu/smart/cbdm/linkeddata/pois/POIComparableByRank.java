/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.smart.cbdm.linkeddata.pois;

/**
 *
 * @author albert
 */
public final class POIComparableByRank extends PointOfInterest implements Comparable<PointOfInterest> {

    @Override
    public int compareTo(PointOfInterest t) {
        final int BEFORE = -1;
        final int EQUAL = 0;
        final int AFTER = 1;
        int ret_val = 0;

        if (t.getRank() < this.getRank()) {
            ret_val = AFTER;
        }
        if (t.getRank()  > this.getRank()) {
            ret_val = BEFORE;
        }


        return ret_val;

    }
}
