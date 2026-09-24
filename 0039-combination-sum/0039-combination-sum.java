class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrack(candidates, target, 0, new ArrayList<>());
        return ans;
    }

    void backtrack(int[] candidates, int target, int start, List<Integer> list) {
        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }

        if (target < 0) {
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            list.add(candidates[i]);

            backtrack(candidates, target - candidates[i], i, list);

            list.remove(list.size() - 1);
        }
    }
}