
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ansArr = new int[nums1.length];
        // aaj toh brute force approach bhi darr gya rahega
        for (int i = 0; i < nums1.length; i++) {
            boolean gotGreater = false;

            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {

                    for (int k = j + 1; k < nums2.length; k++) {
                        if (nums2[k] > nums2[j]) {
                            ansArr[i] = nums2[k];
                            gotGreater = true;
                            break;
                        }
                    }

                    if (!gotGreater) {
                        ansArr[i] = -1;
                    }

                    break;
                }
            }
        }

        return ansArr;
    }
}