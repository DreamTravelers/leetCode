package utils.list_node;

public class ListNodeUtils {
    public static ListNode generateListNode(int[] arr) {
        if(arr.length == 0) return null;

        ListNode head = new ListNode(arr[0]);
        ListNode next = head;
        for (int i = 1; i < arr.length; i++) {
            next.next = new ListNode(arr[i]);
            next = next.next;
        }
        next.next = null;

        return head;
    }

    public static void iteratorListNode(ListNode l1) {
        while (l1!=null){
            System.out.print(l1.val + " --> ");
            l1 = l1.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static void generateCycle(ListNode head,int pos){
        if(pos != -1){
            // 通过 pos 构建环
            ListNode bf = head;
            int index = 0;

            ListNode cycleNode = null;
            while (bf!=null){
                if(index == pos){
                    cycleNode = bf;
                }

                if(bf.next == null){
                    bf.next = cycleNode;
                    break;
                }

                bf = bf.next;
                index++;
            }
        }
    }
}
