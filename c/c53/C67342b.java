package c53;

import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: c53.b */
public class C67342b {

    /* renamed from: a */
    public static Map<String, List<Integer>> f193187a = new ConcurrentHashMap();

    /* renamed from: b */
    public static Map<String, Boolean> f193188b = new ConcurrentHashMap();

    /* renamed from: c */
    public static Map<String, Integer> f193189c = new ConcurrentHashMap();

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        r2 = (java.lang.Integer) ((java.util.concurrent.ConcurrentHashMap) f193189c).get(r2);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m79682a(java.lang.String r2) {
        /*
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.util.Map<java.lang.String, java.lang.Integer> r0 = f193189c
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L_0x0027
            java.util.Map<java.lang.String, java.lang.Integer> r0 = f193189c
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.lang.Object r2 = r0.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 != 0) goto L_0x001f
            return r1
        L_0x001f:
            int r2 = r2.intValue()
            r0 = 1
            if (r2 <= r0) goto L_0x0027
            return r0
        L_0x0027:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c53.C67342b.m79682a(java.lang.String):boolean");
    }

    /* renamed from: b */
    public static void m79683b(String str, int i, boolean z) {
        if (!Util.isNullOrNil(str)) {
            if (!((ConcurrentHashMap) f193187a).containsKey(str)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Integer.valueOf(i));
                ((ConcurrentHashMap) f193187a).put(str, arrayList);
                return;
            }
            List list = (List) ((ConcurrentHashMap) f193187a).get(str);
            list.add(Integer.valueOf(i));
            ((ConcurrentHashMap) f193187a).put(str, list);
        }
    }

    /* renamed from: c */
    public static void m79684c(String str) {
        if (!Util.isNullOrNil(str)) {
            ((ConcurrentHashMap) f193187a).remove(str);
            ((ConcurrentHashMap) f193188b).remove(str);
        }
    }

    /* renamed from: d */
    public static void m79685d(String str) {
        if (!Util.isNullOrNil(str) && !((ConcurrentHashMap) f193187a).containsKey(str)) {
            ((ConcurrentHashMap) f193187a).put(str, new ArrayList());
        }
    }
}
