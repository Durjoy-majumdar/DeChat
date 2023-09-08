package yx0;

import te3.C49981je2;

/* renamed from: yx0.i */
public final class C53630i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C49981je2 f150676d;

    public C53630i(C49981je2 je22) {
        this.f150676d = je22;
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x011f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.util.ArrayList<yx0.a$a> r2 = yx0.C53625f.f150668c
            int r2 = r2.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "MicroMsg.TransferRequestTokenManager"
            java.lang.String r4 = "[transferRequest] h5Auth onGetTokenSuccess callback size: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r1)
            yx0.C53625f.f150669d = r3
            yx0.f r1 = yx0.C53625f.f150666a
            te3.je2 r1 = r10.f150676d
            java.lang.String r4 = r1.f136047d
            if (r4 == 0) goto L_0x002a
            int r4 = r4.length()
            if (r4 != 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r4 = 0
            goto L_0x002b
        L_0x002a:
            r4 = 1
        L_0x002b:
            if (r4 != 0) goto L_0x0078
            yx0.a$b r4 = yx0.C53625f.f150667b
            java.lang.String r5 = r1.f136047d
            java.lang.String r6 = ""
            if (r5 != 0) goto L_0x0036
            r5 = r6
        L_0x0036:
            r4.getClass()
            r4.f150652a = r5
            int r5 = r1.f136048e
            r4.f150654c = r5
            java.lang.String r5 = r1.f136049f
            if (r5 != 0) goto L_0x0044
            goto L_0x0045
        L_0x0044:
            r6 = r5
        L_0x0045:
            r4.f150653b = r6
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "saveH5AuthToken token: "
            r4.append(r5)
            yx0.a$b r5 = yx0.C53625f.f150667b
            java.lang.String r5 = r5.f150652a
            r4.append(r5)
            java.lang.String r5 = ", pubKeyToken: "
            r4.append(r5)
            yx0.a$b r5 = yx0.C53625f.f150667b
            java.lang.String r5 = r5.f150653b
            r4.append(r5)
            java.lang.String r5 = ", expiredTime: "
            r4.append(r5)
            yx0.a$b r5 = yx0.C53625f.f150667b
            int r5 = r5.f150654c
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
        L_0x0078:
            int r4 = r1.f136051h
            if (r4 != r0) goto L_0x0167
            te3.iu2 r1 = r1.f136050g
            if (r1 != 0) goto L_0x0088
            java.lang.String r0 = "updateRoutingMap: cgiInfoListObj is nil"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)
            goto L_0x016c
        L_0x0088:
            java.util.LinkedList<te3.hu2> r1 = r1.f135678e
            if (r1 == 0) goto L_0x0160
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L_0x0094
            goto L_0x0160
        L_0x0094:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.util.Iterator r5 = r1.iterator()
        L_0x009d:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x012b
            java.lang.Object r6 = r5.next()
            te3.hu2 r6 = (te3.C49754hu2) r6
            if (r6 == 0) goto L_0x00e1
            java.lang.String r7 = r6.f134889d
            if (r7 == 0) goto L_0x00b8
            int r7 = r7.length()
            if (r7 != 0) goto L_0x00b6
            goto L_0x00b8
        L_0x00b6:
            r7 = 0
            goto L_0x00b9
        L_0x00b8:
            r7 = 1
        L_0x00b9:
            if (r7 == 0) goto L_0x00bc
            goto L_0x00e1
        L_0x00bc:
            java.lang.String r7 = r6.f134891f
            int r8 = r6.f134890e
            if (r8 <= 0) goto L_0x00e1
            if (r7 == 0) goto L_0x00cd
            int r8 = r7.length()
            if (r8 != 0) goto L_0x00cb
            goto L_0x00cd
        L_0x00cb:
            r8 = 0
            goto L_0x00ce
        L_0x00cd:
            r8 = 1
        L_0x00ce:
            if (r8 == 0) goto L_0x00d1
            goto L_0x00e1
        L_0x00d1:
            java.lang.String r8 = "cgiUrl"
            gy3.C87412m.m108593f(r7, r8)
            java.lang.String r8 = "/cgi-bin/micromsg-bin/transfer/"
            boolean r7 = p225rc.C12969d.m12408b(r7, r8, r0)
            if (r7 != 0) goto L_0x00df
            goto L_0x00e1
        L_0x00df:
            r7 = 1
            goto L_0x00e2
        L_0x00e1:
            r7 = 0
        L_0x00e2:
            if (r7 != 0) goto L_0x011f
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "invalid cgiInfo, scope:"
            r7.append(r8)
            r8 = 0
            if (r6 == 0) goto L_0x00f4
            java.lang.String r9 = r6.f134889d
            goto L_0x00f5
        L_0x00f4:
            r9 = r8
        L_0x00f5:
            r7.append(r9)
            java.lang.String r9 = ", cgiId:"
            r7.append(r9)
            if (r6 == 0) goto L_0x0106
            int r9 = r6.f134890e
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            goto L_0x0107
        L_0x0106:
            r9 = r8
        L_0x0107:
            r7.append(r9)
            java.lang.String r9 = ", cgiUrl"
            r7.append(r9)
            if (r6 == 0) goto L_0x0113
            java.lang.String r8 = r6.f134891f
        L_0x0113:
            r7.append(r8)
            java.lang.String r6 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r6)
            goto L_0x009d
        L_0x011f:
            java.lang.String r7 = r6.f134889d
            java.lang.String r8 = "cgiInfo.scope"
            gy3.C87412m.m108593f(r7, r8)
            r4.put(r7, r6)
            goto L_0x009d
        L_0x012b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "updateRoutingMap result, cgiInfoList count:"
            r3.append(r5)
            int r1 = r1.size()
            r3.append(r1)
            java.lang.String r1 = ", cgiRouteMap count:"
            r3.append(r1)
            int r1 = r4.size()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            boolean r1 = r4.isEmpty()
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x016c
            java.util.concurrent.ConcurrentHashMap<java.lang.String, te3.hu2> r0 = yx0.C53625f.f150670e
            r0.clear()
            r0.putAll(r4)
            goto L_0x016c
        L_0x0160:
            java.lang.String r0 = "updateRoutingMap: cgiInfoList is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)
            goto L_0x016c
        L_0x0167:
            java.lang.String r0 = "Dynamic Routing is not enable"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)
        L_0x016c:
            java.util.ArrayList<yx0.a$a> r0 = yx0.C53625f.f150668c
            java.util.Iterator r0 = r0.iterator()
        L_0x0172:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0184
            java.lang.Object r1 = r0.next()
            yx0.a$a r1 = (yx0.C53613a.C53614a) r1
            yx0.a$b r2 = yx0.C53625f.f150667b
            r1.mo74239a(r2)
            goto L_0x0172
        L_0x0184:
            java.util.ArrayList<yx0.a$a> r0 = yx0.C53625f.f150668c
            r0.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.C53630i.run():void");
    }
}
