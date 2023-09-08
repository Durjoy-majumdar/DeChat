package t83;

import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: t83.a */
public abstract class C13841a {

    /* renamed from: a */
    public Map<String, Object> f38983a;

    /* renamed from: a */
    public static Map<String, Object> m13131a(Bundle bundle) {
        Set<String> keySet;
        if (bundle == null || (keySet = bundle.keySet()) == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String next : keySet) {
            hashMap.put(next, bundle.get(next));
        }
        return hashMap;
    }
}
