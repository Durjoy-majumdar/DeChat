package p645pj;

import android.view.ContextMenu;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/* renamed from: pj.e */
public class C47506e {

    /* renamed from: c */
    public static final int[] f127473c = {1};

    /* renamed from: a */
    public HashMap<String, HashMap<String, String>> f127474a = new HashMap<>();

    /* renamed from: b */
    public Map<String, String> f127475b = null;

    /* renamed from: pj.e$a */
    public static class C47507a {

        /* renamed from: a */
        public String f127476a;

        /* renamed from: b */
        public String f127477b;

        public C47507a(String str, String str2, String str3) {
            this.f127476a = str;
            this.f127477b = str3;
        }
    }

    /* renamed from: pj.e$b */
    public static class C47508b implements ContextMenu.ContextMenuInfo {

        /* renamed from: d */
        public static int f127478d = 10000;

        /* renamed from: a */
        public final String f127479a;

        /* renamed from: b */
        public final String f127480b;

        /* renamed from: c */
        public final int f127481c;

        public C47508b(String str, String str2) {
            int i = f127478d;
            f127478d = i + 1;
            this.f127481c = i;
            this.f127480b = str;
            this.f127479a = str2;
        }
    }

    public C47506e(int i) {
    }

    /* renamed from: a */
    public static LinkedList<C47507a> m52835a(Map<String, String> map) {
        LinkedList<C47507a> linkedList = null;
        int i = 0;
        while (true) {
            StringBuilder sb = new StringBuilder();
            sb.append(".ConfigList.Config");
            sb.append(i == 0 ? "" : Integer.valueOf(i));
            String sb4 = sb.toString();
            if (map.get(sb4 + ".$name") == null) {
                return linkedList;
            }
            if (map.get(sb4 + ".$name").equalsIgnoreCase("JDWebViewMenu")) {
                linkedList = m52836b(map, sb4 + ".menuItems" + ".menuItem");
                LinkedList<C47507a> b = m52836b(map, sb4 + ".menuItems" + ".newMenuItem");
                if (linkedList == null) {
                    return b;
                }
                if (b != null && b.size() > 0) {
                    Log.m105919d("MicroMsg.ConfigListInfo", "has menuItem2, %s, %s", Integer.valueOf(linkedList.size()), Integer.valueOf(b.size()));
                    linkedList.addAll(b);
                }
            }
            i++;
        }
    }

    /* renamed from: b */
    public static LinkedList<C47507a> m52836b(Map<String, String> map, String str) {
        LinkedList<C47507a> linkedList = null;
        int i = 0;
        while (true) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(i == 0 ? "" : Integer.valueOf(i));
            String sb4 = sb.toString();
            if (map.get(sb4) == null) {
                break;
            }
            String str2 = sb4 + ".id";
            String str3 = sb4 + ".title";
            String str4 = sb4 + ".url";
            if (!map.containsKey(str2)) {
                break;
            }
            C47507a aVar = new C47507a(map.get(str2), map.get(str3), map.get(str4));
            if (linkedList == null) {
                linkedList = new LinkedList<>();
            }
            linkedList.add(aVar);
            i++;
        }
        return linkedList;
    }

    /* renamed from: c */
    public final void mo72516c(String str, String str2, String str3) {
        if (!this.f127474a.containsKey(str)) {
            this.f127474a.put(str, new HashMap());
        }
        this.f127474a.get(str).put(str2, str3);
    }
}
