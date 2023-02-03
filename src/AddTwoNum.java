public class AddTwoNum {
    public static int returnValList(ListNode l){
        if (l == null){
            return 0;
        }
        else{
            return  l.val;
        }
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode();
        ListNode l4 = l3;
        int carry = 0;
        while (true){
            int sum = returnValList(l1) + returnValList(l2) + carry;
            if (carry == 1){
                carry = 0;
            }
            if(sum >= 10){
                carry = 1;
                sum = sum - 10;
            }
            l4.val = sum;
            //System.out.println(sum);

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
            if(l1 == null && l2 == null && carry == 0){
                break;
            }
            l4.next = new ListNode();
            l4 = l4.next;
        }
        return l3;
    }


    public static void printListNode(ListNode l1){
        while(l1 != null){
            System.out.print(l1.val + " ");
            l1 = l1.next;
        }
    }
}
