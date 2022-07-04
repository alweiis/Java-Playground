package Daily;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TreeBFS {
    public static void main(String[] args) {
        tree root = new tree("1");
        tree rootChild1 = root.addChildNode(new tree("2"));
        tree rootChild2 = root.addChildNode(new tree("3"));
        tree leaf1 = rootChild1.addChildNode(new tree("4"));
        tree leaf2 = rootChild1.addChildNode(new tree("5"));
        ArrayList<String> output = solution(root);
        System.out.println(output); // --> ["1", "2", "3", "4", "5"]

        leaf1.addChildNode(new tree("6"));
        rootChild2.addChildNode(new tree("7"));
        output = solution(root);
        System.out.println(output); // --> ["1", "2", "3", "4", "5", "7", "6"]
    }

    public static ArrayList<String> solution(tree node) {
        ArrayList<String> visited = new ArrayList<>();
        Queue<tree> queue = new LinkedList<>();
        queue.offer(node);
        while (!queue.isEmpty()) {
            tree curNode = queue.poll();
            visited.add(curNode.getValue());
            if (curNode.getChildrenNode() != null) {
                for (tree nextNode: curNode.getChildrenNode()) {
                    queue.offer(nextNode);
                }
            }
        }
        return visited;
    }

    public static class tree {
        private String value;
        private ArrayList<tree> children;

        public tree(String data) {
            this.value = data;
            this.children = null;
        }

        public tree addChildNode(tree node) {
            if(children == null) children = new ArrayList<>();
            children.add(node);
            return children.get(children.size() - 1);
        }

        public String getValue() {      //현재 노드의 데이터를 반환
            return value;
        }

        public ArrayList<tree> getChildrenNode() {
            return children;
        }
    }
}
