
public class Solution {
	    // basic theory behind the solution is two pointers start at each ends of the array
	    //as we move along the array we record a max height for the left and right side. 
	    //max height starts at zero. As per the algorithm if both max height are equal then 
	    //we subtract 1 from the right pointer. If MaxR > MaxL we know that any water on the 
	    //left side will be contained for sure and that it'll be the difference between the tallest 
	    //point at that side and the height at which the water landed so we add the difference to the answer 
	    // eventually the pointers will meet at the tallest height in the array outputting answer
	    // TRAPPING RAIN WATER
	    public int trap(int[] height) {
	        if (height.length==0) return 0; 
	        int left = 0, right = height.length-1;  // left and right are intialized to the ends of the array left beginning anf right at the end
	        
	        int MaxL=0, MaxR=0; // left max and right max are place hilers for the max size
	        int answer = 0; 
	        while (left < right) { // prevent crossing of pointers to stop double counting
	            if (height[left] > MaxL) 
	            {MaxL = height[left]; } // check if the height of the oncoming array position is greater than the height stored 
	            if (height[right] > MaxR) // same just for the right side
	            {MaxR = height[right];}
	            if (MaxR > MaxL) { // checking the tallest point discovered in the array
	                answer += Math.max(0, MaxL-height[left]); //if the tallest point is on the right side 
	                // then 
	                left++; 
	            } else {
	                answer += Math.max(0, MaxR-height[right]); 
	                right--; 
	            }
	        }
	        return answer; 
	    }
	}

