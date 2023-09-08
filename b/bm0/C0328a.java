package bm0;

/* renamed from: bm0.a */
public final class C0328a {
    /* JADX WARNING: type inference failed for: r6v0, types: [fy3.l<java.lang.Object, ? extends java.lang.Object>, java.lang.Object, fy3.l] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List<java.lang.Object> m268a(org.json.JSONArray r5, fy3.C32226l<java.lang.Object, ? extends java.lang.Object> r6) {
        /*
            java.lang.String r0 = "<this>"
            gy3.C87412m.m108594g(r5, r0)
            java.lang.String r0 = "transform"
            gy3.C87412m.m108594g(r6, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r5.length()
            r0.<init>(r1)
            int r1 = r5.length()
            r2 = 0
        L_0x0019:
            if (r2 >= r1) goto L_0x0043
            java.lang.Object r3 = r5.get(r2)
            java.lang.String r4 = "get(index)"
            gy3.C87412m.m108593f(r3, r4)
            java.lang.Object r3 = r6.invoke(r3)
            boolean r4 = r3 instanceof org.json.JSONObject
            if (r4 == 0) goto L_0x0033
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            java.util.Map r3 = m269b(r3, r6)
            goto L_0x003d
        L_0x0033:
            boolean r4 = r3 instanceof org.json.JSONArray
            if (r4 == 0) goto L_0x003d
            org.json.JSONArray r3 = (org.json.JSONArray) r3
            java.util.List r3 = m268a(r3, r6)
        L_0x003d:
            r0.add(r3)
            int r2 = r2 + 1
            goto L_0x0019
        L_0x0043:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bm0.C0328a.m268a(org.json.JSONArray, fy3.l):java.util.List");
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [fy3.l<java.lang.Object, ? extends java.lang.Object>, java.lang.Object, fy3.l] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.Map<java.lang.String, java.lang.Object> m269b(org.json.JSONObject r5, fy3.C32226l<java.lang.Object, ? extends java.lang.Object> r6) {
        /*
            java.lang.String r0 = "<this>"
            gy3.C87412m.m108594g(r5, r0)
            java.lang.String r0 = "transform"
            gy3.C87412m.m108594g(r6, r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Iterator r1 = r5.keys()
            java.lang.String r2 = "keys()"
            gy3.C87412m.m108593f(r1, r2)
        L_0x0019:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0050
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r5.get(r2)
            java.lang.String r4 = "get(it)"
            gy3.C87412m.m108593f(r3, r4)
            java.lang.Object r3 = r6.invoke(r3)
            java.lang.String r4 = "it"
            gy3.C87412m.m108593f(r2, r4)
            boolean r4 = r3 instanceof org.json.JSONObject
            if (r4 == 0) goto L_0x0042
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            java.util.Map r3 = m269b(r3, r6)
            goto L_0x004c
        L_0x0042:
            boolean r4 = r3 instanceof org.json.JSONArray
            if (r4 == 0) goto L_0x004c
            org.json.JSONArray r3 = (org.json.JSONArray) r3
            java.util.List r3 = m268a(r3, r6)
        L_0x004c:
            r0.put(r2, r3)
            goto L_0x0019
        L_0x0050:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bm0.C0328a.m269b(org.json.JSONObject, fy3.l):java.util.Map");
    }
}
