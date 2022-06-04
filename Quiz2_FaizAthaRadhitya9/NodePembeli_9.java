package Quiz2_FaizAthaRadhitya9;

public class NodePembeli_9 {
    
    String namaPembeli;
    String noHP;
    NodePembeli_9 prev,next;

        NodePembeli_9(NodePembeli_9 prev,String b, String c,NodePembeli_9 next){
            this.namaPembeli = b;
            this.prev = prev;
            this.next = next;
            this.noHP = c;
        }
    
}
