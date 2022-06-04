package Quiz2_FaizAthaRadhitya9;

public class DoubleLinkedList_9 {

    NodePembeli_9 head;
    int size;

    public DoubleLinkedList_9() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            NodePembeli_9 tmp = head;
            System.out.println("===================");
            System.out.println("Daftar Antrian Resto Royal Delish");
            System.out.println("===================");
            System.out.println("|No\t|Nama\t|");
            while (tmp != null) {
                System.out.print("|" + tmp.namaPembeli + "\t|" + tmp.noHP + "\t|");
                System.out.println();
                tmp = tmp.next;
            }
            System.out.println();
            System.out.println("Sisa antri: " + size);
            System.out.println();
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void addFirst(int noHP, String namaPembeli) {
        if (isEmpty()) {
            head = new NodePembeli_9(null, noHP, namaPembeli, null);
        } else {
            NodePembeli_9 newNode = new NodePembeli_9(null, noHP, namaPembeli, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
}
