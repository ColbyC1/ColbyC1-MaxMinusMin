
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */

    public int difference(List<Integer> nums) {

        ArrayList<Integer> sorted_list = new ArrayList<Integer>(nums);
        Collections.sort(sorted_list);

        int max = Collections.max(sorted_list);
        int min = Collections.min(sorted_list);
        int res = max - min;

        return res;
        
    }
}
