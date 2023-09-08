package w93;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: w93.c */
public class C15055c {

    /* renamed from: a */
    public static final Map<String, Map<Integer, Object>> f41192a = new HashMap();

    /* renamed from: a */
    public static String m14223a(Map<Integer, Object> map) {
        if (map == null || map.isEmpty()) {
            return "";
        }
        int intValue = ((Integer) Collections.max(map.keySet())).intValue();
        int min = Math.min(intValue, 200);
        StringBuffer stringBuffer = new StringBuffer();
        for (int intValue2 = ((Integer) Collections.min(map.keySet())).intValue(); intValue2 <= min; intValue2++) {
            Object obj = map.get(Integer.valueOf(intValue2));
            if (obj == null) {
                stringBuffer.append("");
            } else {
                stringBuffer.append(obj);
            }
            stringBuffer.append(",");
        }
        if (stringBuffer.length() > 0) {
            stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        }
        return stringBuffer.toString();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.util.TreeMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.util.TreeMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.util.TreeMap} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m14224b(java.lang.String r4, w93.C15056d r5) {
        /*
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            java.util.TreeMap r0 = new java.util.TreeMap
            w93.b r1 = new w93.b
            r1.<init>()
            r0.<init>(r1)
            if (r5 == 0) goto L_0x0025
            java.util.Map r1 = r5.mo14075r1()
            if (r1 == 0) goto L_0x001c
            r0.putAll(r1)
        L_0x001c:
            java.util.Map r5 = r5.mo14074C3()
            if (r5 == 0) goto L_0x0025
            r0.putAll(r5)
        L_0x0025:
            java.util.Map<java.lang.String, java.util.Map<java.lang.Integer, java.lang.Object>> r5 = f41192a
            java.util.HashMap r5 = (java.util.HashMap) r5
            java.lang.Object r4 = r5.remove(r4)
            java.util.Map r4 = (java.util.Map) r4
            if (r4 == 0) goto L_0x0035
            r4.putAll(r0)
            r0 = r4
        L_0x0035:
            r4 = 1000(0x3e8, float:1.401E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            boolean r5 = r0.containsKey(r5)
            r1 = 1
            if (r5 == 0) goto L_0x0051
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r0.remove(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            goto L_0x0052
        L_0x0051:
            r4 = 1
        L_0x0052:
            java.lang.String r5 = m14223a(r0)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            r3 = 0
            r0[r3] = r2
            r0[r1] = r5
            java.lang.String r1 = "MicroMsg.GameWebReport"
            java.lang.String r2 = "report web performance. isReportNow: %b, reportData: [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r0)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 16142(0x3f0e, float:2.262E-41)
            r0.mo160126c(r1, r5, r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w93.C15055c.m14224b(java.lang.String, w93.d):void");
    }
}
