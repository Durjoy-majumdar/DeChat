package ex0;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;

/* renamed from: ex0.i */
public class C45706i {
    /* renamed from: a */
    public static boolean m50950a() {
        return BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_P_ALPHA;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m50951b(java.lang.String r10) {
        /*
            boolean r0 = m50950a()
            java.lang.String r1 = "MicroMsg.TransferRequestInfo"
            r2 = 0
            if (r0 != 0) goto L_0x000f
            java.lang.String r10 = "getTransferDebugIP can not debug"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r10)
            return r2
        L_0x000f:
            java.lang.String r0 = com.tencent.p014mm.network.C114803y.f344201B
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            java.lang.String r4 = "shenzhen"
            java.lang.String r5 = "shanghai"
            if (r3 == 0) goto L_0x001f
        L_0x001d:
            r3 = r2
            goto L_0x0034
        L_0x001f:
            java.lang.String r3 = "sh"
            boolean r3 = r0.startsWith(r3)
            if (r3 == 0) goto L_0x002a
            r3 = r5
            goto L_0x0034
        L_0x002a:
            java.lang.String r3 = "sz"
            boolean r3 = r0.startsWith(r3)
            if (r3 == 0) goto L_0x001d
            r3 = r4
        L_0x0034:
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r7 = 0
            r6[r7] = r10
            r8 = 1
            r6[r8] = r0
            r0 = 2
            r6[r0] = r3
            java.lang.String r9 = "getTransferDebugIP key: %s, shortHost: %s, idc: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r9, r6)
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r6 == 0) goto L_0x004c
            return r2
        L_0x004c:
            r10.getClass()
            int r6 = r10.hashCode()
            r9 = -1
            switch(r6) {
                case 56597: goto L_0x006e;
                case 56598: goto L_0x0063;
                case 56599: goto L_0x0058;
                default: goto L_0x0057;
            }
        L_0x0057:
            goto L_0x0078
        L_0x0058:
            java.lang.String r6 = "997"
            boolean r10 = r10.equals(r6)
            if (r10 != 0) goto L_0x0061
            goto L_0x0078
        L_0x0061:
            r9 = 2
            goto L_0x0078
        L_0x0063:
            java.lang.String r6 = "996"
            boolean r10 = r10.equals(r6)
            if (r10 != 0) goto L_0x006c
            goto L_0x0078
        L_0x006c:
            r9 = 1
            goto L_0x0078
        L_0x006e:
            java.lang.String r6 = "995"
            boolean r10 = r10.equals(r6)
            if (r10 != 0) goto L_0x0077
            goto L_0x0078
        L_0x0077:
            r9 = 0
        L_0x0078:
            if (r9 == 0) goto L_0x0091
            if (r9 == r8) goto L_0x0088
            if (r9 == r0) goto L_0x007f
            goto L_0x00a2
        L_0x007f:
            boolean r10 = r3.equalsIgnoreCase(r5)
            if (r10 == 0) goto L_0x00a2
            java.lang.String r2 = "61.151.229.114"
            goto L_0x00a2
        L_0x0088:
            boolean r10 = r3.equalsIgnoreCase(r5)
            if (r10 == 0) goto L_0x00a2
            java.lang.String r2 = "101.89.41.97"
            goto L_0x00a2
        L_0x0091:
            boolean r10 = r3.equalsIgnoreCase(r5)
            if (r10 == 0) goto L_0x009a
            java.lang.String r2 = "61.151.167.72"
            goto L_0x00a2
        L_0x009a:
            boolean r10 = r3.equalsIgnoreCase(r4)
            if (r10 == 0) goto L_0x00a2
            java.lang.String r2 = "109.244.191.10"
        L_0x00a2:
            java.lang.Object[] r10 = new java.lang.Object[r8]
            r10[r7] = r2
            java.lang.String r0 = "getTransferDebugIP result ip: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r0, r10)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ex0.C45706i.m50951b(java.lang.String):java.lang.String");
    }
}
