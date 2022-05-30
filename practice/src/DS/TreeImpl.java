package DS;

import java.util.ArrayList;

public class TreeImpl {
    private String value;
    private ArrayList<TreeImpl> children;

    public TreeImpl() {	//전달인자가 없을 경우의 생성자
        this.value = null;
        this.children = null;
    }

    public TreeImpl(String data) {	//전달인자가 존재할 경우의 생성자
        this.value = data;
        this.children = null;
    }

    public void setValue(String data) {
        this.value = data;
    }

    public String getValue() {      //현재 노드의 데이터를 반환
        return value;
    }

    public void addChildNode(TreeImpl node) {
        if(children == null) children = new ArrayList<>();
        children.add(node);
    }

    public void removeChildNode(TreeImpl node) {
        if(children != null) children.remove(node);
    }

    public ArrayList<TreeImpl> getChildrenNode() {
        return children;
    }

    public boolean contains(String data) {      //재귀를 사용하여 값을 검색합니다.
        if(value.equals(data)) return true;

        if(children != null) {
            for (TreeImpl child : children) {
                return child.contains(data);
            }
        }
        return false;
    }
}

