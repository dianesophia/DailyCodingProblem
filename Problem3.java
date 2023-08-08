//meduim
import java.util.*;

class Node {
    String val;
    Node left;
    Node right;
    
    Node(String val) {
        this.val = val;
    }
    
    Node(String val, Node left, Node right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Problem3 {
    public String serialize(Node root) {
        if (root == null) {
            return "null,";
        }
        return root.val + "," + serialize(root.left) + serialize(root.right);
    }
    
    public Node deserialize(String data) {
        Queue<String> nodes = new LinkedList<>(Arrays.asList(data.split(",")));
        return deserializeHelper(nodes);
    }
    
    private Node deserializeHelper(Queue<String> nodes) {
        String val = nodes.poll();
        if (val.equals("null")) {
            return null;
        }
        
        Node node = new Node(val);
        node.left = deserializeHelper(nodes);
        node.right = deserializeHelper(nodes);
        return node;
    }
    
    public static void main(String[] args) {
        BinaryTreeSerializationWithStringNode serializer = new BinaryTreeSerializationWithStringNode();
        
        // Construct a sample binary tree using Node class
        Node node = new Node("root",
            new Node("left", new Node("left.left"), null),
            new Node("right")
        );
        
        // Serialize the binary tree
        String serializedTree = serializer.serialize(node);
        System.out.println("Serialized: " + serializedTree);
        
        // Deserialize the binary tree
        Node deserializedTree = serializer.deserialize(serializedTree);
        
        // Test the deserialized tree
        System.out.println("Test passed: " + deserializedTree.left.left.val.equals("left.left"));
    }
}
