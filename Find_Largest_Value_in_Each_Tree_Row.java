class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        
        if(root==null)
        {
            return ans;
        }
        
        Queue<TreeNode> q = new LinkedList<>();
        
        q.offer(root);
        
        while(!q.isEmpty())
        {
            int s = q.size();
            int max = Integer.MIN_VALUE;
            
            for(int i=0;i<s;i++)
            {
                TreeNode rem = q.remove();
                max =Math.max(max,rem.val);
                if(rem.left!=null)
                {
                    q.add(rem.left);
                }
                if(rem.right!=null)
                {
                    q.add(rem.right);
                }
            }
            
            ans.add(max);
        }
        
        return ans;
        
    }
}
