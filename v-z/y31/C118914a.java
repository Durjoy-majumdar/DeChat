package y31;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import r31.C118218a;
import u24.C90599h;

/* renamed from: y31.a */
public class C118914a implements C118915b {
    /* renamed from: a */
    public Map<String, Object> mo183599a(List<C118218a> list, C118218a aVar, Map<String, Object> map, boolean z) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (aVar != null) {
            String str = aVar.f353362a;
            if (!C90599h.m113511d(str)) {
                hashMap2.put("page_id", str);
            }
            Map<String, Object> map2 = aVar.f353363b;
            if (map2 != null && ((HashMap) map2).size() > 0) {
                hashMap2.putAll(map2);
            }
        }
        if (hashMap2.size() > 0) {
            if (z || (list != null && list.size() > 0)) {
                hashMap.put("cur_page", hashMap2);
            } else {
                hashMap.putAll(hashMap2);
            }
        }
        if (list != null && list.size() > 0) {
            ArrayList arrayList = new ArrayList();
            for (int size = list.size() - 1; size >= 0; size--) {
                C118218a aVar2 = list.get(size);
                if (aVar2 != null) {
                    String str2 = aVar2.f353362a;
                    if (!C90599h.m113511d(str2)) {
                        hashMap.put("view_id", str2);
                        arrayList.add(0, str2);
                        Map<String, Object> map3 = aVar2.f353363b;
                        if (map3 != null && ((HashMap) map3).size() > 0) {
                            hashMap.putAll(map3);
                        }
                    }
                }
            }
            if (arrayList.size() > 0) {
                hashMap.put("view_path", arrayList);
            }
        }
        if (map != null && map.size() > 0) {
            hashMap.putAll(map);
        }
        return hashMap;
    }
}
