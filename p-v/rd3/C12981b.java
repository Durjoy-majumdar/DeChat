package rd3;

import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.List;
import java.util.Map;

/* renamed from: rd3.b */
public enum C12981b {
    ;

    /* renamed from: a */
    public static String m12427a(Map<String, List<String>> map) {
        if (map == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry next : map.entrySet()) {
            sb.append(Util.nullAs((String) next.getKey(), "null"));
            sb.append(" : ");
            List<String> list = (List) next.getValue();
            if (list != null && list.size() > 0) {
                for (String nullAsNil : list) {
                    sb.append(Util.nullAsNil(nullAsNil));
                    sb.append("|");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
