/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    TreeNode* insertIntoBST(TreeNode* root, int val) {
        if (root == NULL)
    {
        TreeNode *newNode= new TreeNode(val);
        return newNode;
    }
    // if value to be inserted is smaller than root node then insert in left side
    if (root->val > val)
    {
        root->left = insertIntoBST(root->left, val);
    }
    // else value to be inserted is greater than root node hence insert in right side
    else
    {
        root->right = insertIntoBST(root->right, val);
    }
    return root;
        
    }
};