package com.tencent.p014mm.plugin.ipcall.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.mm.plugin.ipcall.model.e */
public class C105381e {

    /* renamed from: b */
    public static Map<Integer, List<Integer>> f313244b = new HashMap();

    /* renamed from: a */
    public int f313245a = -1;

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(8);
        arrayList.add(12);
        f313244b.put(1, arrayList);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(12);
        arrayList2.add(8);
        f313244b.put(2, arrayList2);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(4);
        arrayList3.add(5);
        arrayList3.add(8);
        arrayList3.add(12);
        f313244b.put(3, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(5);
        arrayList4.add(8);
        arrayList4.add(12);
        f313244b.put(4, arrayList4);
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(9);
        arrayList5.add(10);
        arrayList5.add(11);
        f313244b.put(5, arrayList5);
    }

    /* renamed from: e */
    public static String m141555e(int i) {
        switch (i) {
            case -1:
                return "RESET_STATE";
            case 1:
                return "START_INVITE";
            case 2:
                return "INVITE_FAILED";
            case 3:
                return "INVITE_SUCCESS";
            case 4:
                return "RING_ING";
            case 5:
                return "USER_ACCEPT";
            case 8:
                return "USER_CANCEL";
            case 9:
                return "USER_SELF_SHUTDOWN";
            case 10:
                return "OTHER_SIDE_USER_SHUTDOWN";
            case 11:
                return "USER_SELF_SHUTDOWN_BY_ERR";
            case 12:
                return "CANCEL_BY_ERR";
            default:
                return i + "";
        }
    }

    /* renamed from: a */
    public String mo150083a() {
        return m141555e(this.f313245a);
    }

    /* renamed from: b */
    public boolean mo150084b() {
        int i = this.f313245a;
        return i == 4 || i == 5;
    }

    /* renamed from: c */
    public boolean mo150085c() {
        return this.f313245a == 5;
    }

    /* renamed from: d */
    public boolean mo150086d() {
        int i = this.f313245a;
        return i == 1 || i == 3 || i == 4 || i == 5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002f, code lost:
        if (((java.util.List) ((java.util.HashMap) f313244b).get(java.lang.Integer.valueOf(r5.f313245a))).contains(java.lang.Integer.valueOf(r6)) != false) goto L_0x0007;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0050  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo150087f(int r6) {
        /*
            r5 = this;
            int r0 = r5.f313245a
            r1 = -1
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L_0x0009
        L_0x0007:
            r0 = 1
            goto L_0x0033
        L_0x0009:
            java.util.Map<java.lang.Integer, java.util.List<java.lang.Integer>> r1 = f313244b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.HashMap r1 = (java.util.HashMap) r1
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x0032
            java.util.Map<java.lang.Integer, java.util.List<java.lang.Integer>> r0 = f313244b
            int r1 = r5.f313245a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0032
            goto L_0x0007
        L_0x0032:
            r0 = 0
        L_0x0033:
            r1 = 2
            java.lang.String r4 = "MicroMsg.IPCallStateIndicator"
            if (r0 == 0) goto L_0x0050
            java.lang.Object[] r0 = new java.lang.Object[r1]
            int r1 = r5.f313245a
            java.lang.String r1 = m141555e(r1)
            r0[r2] = r1
            java.lang.String r1 = m141555e(r6)
            r0[r3] = r1
            java.lang.String r1 = "updateState, origin: %s, new: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r1, r0)
            r5.f313245a = r6
            return r3
        L_0x0050:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            com.tencent.mm.plugin.ipcall.model.e r1 = com.tencent.p014mm.plugin.ipcall.model.C105385g.Fx0()
            java.lang.String r1 = r1.mo150083a()
            r0[r2] = r1
            java.lang.String r6 = m141555e(r6)
            r0[r3] = r6
            java.lang.String r6 = "transform state error, origin state: %s, new state: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r6, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.ipcall.model.C105381e.mo150087f(int):boolean");
    }
}
