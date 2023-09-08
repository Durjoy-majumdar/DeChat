package p1054vg;

import java.util.HashMap;
import java.util.Map;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* renamed from: vg.f */
public class C102188f {
    /* renamed from: a */
    public static void m134649a(Map<String, String> map, String str, String str2, Node node, int i) {
        if (node.getNodeName().equals("#text")) {
            map.put(str, node.getNodeValue());
            map.put(str2, node.getNodeValue());
        } else if (node.getNodeName().equals("#cdata-section")) {
            map.put(str, node.getNodeValue());
            map.put(str2, node.getNodeValue());
        } else {
            String str3 = str + "." + node.getNodeName();
            String str4 = str2 + "." + node.getNodeName();
            if (i > 0) {
                str3 = str3 + i;
                map.put(str3, node.getNodeValue());
                str4 = str4 + "#" + i;
                map.put(str4, node.getNodeValue());
            } else {
                map.put(str3, node.getNodeValue());
                map.put(str4, node.getNodeValue());
            }
            NamedNodeMap attributes = node.getAttributes();
            if (attributes != null) {
                for (int i2 = 0; i2 < attributes.getLength(); i2++) {
                    Node item = attributes.item(i2);
                    map.put(str3 + ".$" + item.getNodeName(), item.getNodeValue());
                    map.put(str4 + ".$" + item.getNodeName(), item.getNodeValue());
                }
            }
            HashMap hashMap = new HashMap();
            NodeList childNodes = node.getChildNodes();
            for (int i3 = 0; i3 < childNodes.getLength(); i3++) {
                Node item2 = childNodes.item(i3);
                Integer num = (Integer) hashMap.get(item2.getNodeName());
                int intValue = num == null ? 0 : num.intValue();
                m134649a(map, str3, str4, item2, intValue);
                hashMap.put(item2.getNodeName(), Integer.valueOf(intValue + 1));
            }
        }
    }
}
