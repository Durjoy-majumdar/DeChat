package wi0;

import java.util.LinkedList;
import org.json.JSONArray;

/* renamed from: wi0.h0 */
public final class C15407h0 {
    /* renamed from: a */
    public static LinkedList<String> m14353a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        LinkedList<String> linkedList = new LinkedList<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            linkedList.add(jSONArray.optString(i));
        }
        return linkedList;
    }
}
