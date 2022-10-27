/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* swapPairs(ListNode* head) {
        if(!head || !head->next) return head;
        ListNode* current = head;
        ListNode* dummyNode = new ListNode();
        ListNode* prev=dummyNode;
        ListNode* forward = NULL;
        
        while(current != NULL && current->next != NULL){
            forward = current->next;
            prev->next=forward;
            current->next = forward->next;
            forward->next= current;
            prev= current;
            current = current->next;
        }
        return dummyNode->next;
    }
};