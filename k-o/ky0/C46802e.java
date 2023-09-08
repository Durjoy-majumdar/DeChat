package ky0;

import com.tencent.p014mm.plugin.brandservice.api.TransferRequestInfo;
import ex0.C45699g;
import iy0.C46353a;
import jy0.C46579a;
import jy0.C46580b;

/* renamed from: ky0.e */
public final class C46802e implements C45699g {

    /* renamed from: a */
    public final /* synthetic */ C46353a f125926a;

    /* renamed from: b */
    public final /* synthetic */ C46580b f125927b;

    /* renamed from: c */
    public final /* synthetic */ C46579a f125928c;

    public C46802e(C46353a aVar, C46580b bVar, C46579a aVar2) {
        this.f125926a = aVar;
        this.f125927b = bVar;
        this.f125928c = aVar2;
    }

    /* renamed from: a */
    public boolean mo66580a(TransferRequestInfo transferRequestInfo) {
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: te3.yf2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x012c  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo66581b(int r7, java.lang.String r8, te3.C52278zk2 r9) {
        /*
            r6 = this;
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "fetchContentByWebTransfer onResult errCode: "
            r8.append(r0)
            r8.append(r7)
            java.lang.String r0 = ", ret: "
            r8.append(r0)
            r0 = 0
            if (r9 == 0) goto L_0x001c
            int r1 = r9.f146051d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x001d
        L_0x001c:
            r1 = r0
        L_0x001d:
            r8.append(r1)
            java.lang.String r1 = ", errMsg: "
            r8.append(r1)
            if (r9 == 0) goto L_0x002a
            java.lang.String r2 = r9.f146052e
            goto L_0x002b
        L_0x002a:
            r2 = r0
        L_0x002b:
            r8.append(r2)
            java.lang.String r2 = ", headers: "
            r8.append(r2)
            if (r9 == 0) goto L_0x0042
            java.util.LinkedList<te3.yf2> r2 = r9.f146054g
            if (r2 == 0) goto L_0x0042
            int r2 = r2.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0043
        L_0x0042:
            r2 = r0
        L_0x0043:
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.String r2 = "MicroMsg.WebTransferContentFetcher"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r8)
            iy0.a r8 = r6.f125926a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "onFetchContentResult ret: "
            r3.append(r4)
            if (r9 == 0) goto L_0x0064
            int r4 = r9.f146051d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x0065
        L_0x0064:
            r4 = r0
        L_0x0065:
            r3.append(r4)
            r3.append(r1)
            if (r9 == 0) goto L_0x0070
            java.lang.String r1 = r9.f146052e
            goto L_0x0071
        L_0x0070:
            r1 = r0
        L_0x0071:
            r3.append(r1)
            java.lang.String r1 = ", resp_json: "
            r3.append(r1)
            if (r9 == 0) goto L_0x0088
            java.lang.String r1 = r9.f146053f
            if (r1 == 0) goto L_0x0088
            int r1 = r1.length()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0089
        L_0x0088:
            r1 = r0
        L_0x0089:
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            r1 = 1
            r3 = 0
            if (r9 == 0) goto L_0x009d
            int r4 = r9.f146051d
            if (r4 != 0) goto L_0x009d
            r4 = 1
            goto L_0x009e
        L_0x009d:
            r4 = 0
        L_0x009e:
            r5 = 99
            if (r4 == 0) goto L_0x00f5
            t73.b r4 = r8.f124921c
            if (r4 == 0) goto L_0x00f5
            java.lang.String r4 = r9.f146053f
            if (r4 == 0) goto L_0x00b3
            int r4 = r4.length()
            if (r4 != 0) goto L_0x00b1
            goto L_0x00b3
        L_0x00b1:
            r4 = 0
            goto L_0x00b4
        L_0x00b3:
            r4 = 1
        L_0x00b4:
            if (r4 != 0) goto L_0x00f5
            t73.b r7 = r8.f124921c     // Catch:{ Exception -> 0x00e7 }
            java.lang.String r8 = r8.mo71762d()     // Catch:{ Exception -> 0x00e7 }
            com.tencent.mm.vfs.m1 r7 = r7.mo73172B(r8)     // Catch:{ Exception -> 0x00e7 }
            java.io.OutputStream r7 = com.tencent.p014mm.vfs.C86013q1.m106426H(r7)     // Catch:{ Exception -> 0x00e7 }
            java.lang.String r8 = "openWrite(saveFile)"
            gy3.C87412m.m108593f(r7, r8)     // Catch:{ Exception -> 0x00e7 }
            java.lang.String r8 = r9.f146053f     // Catch:{ Exception -> 0x00e7 }
            java.lang.String r1 = "response.resp_json"
            gy3.C87412m.m108593f(r8, r1)     // Catch:{ Exception -> 0x00e7 }
            java.nio.charset.Charset r1 = z04.C119027c.f356488a     // Catch:{ Exception -> 0x00e7 }
            byte[] r8 = r8.getBytes(r1)     // Catch:{ Exception -> 0x00e7 }
            java.lang.String r1 = "this as java.lang.String).getBytes(charset)"
            gy3.C87412m.m108593f(r8, r1)     // Catch:{ Exception -> 0x00e7 }
            r7.write(r8)     // Catch:{ Exception -> 0x00e7 }
            ky0.d$a r7 = ky0.C46800d.C46801a.f125925a     // Catch:{ Exception -> 0x00e7 }
            r7.mo72022a(r3)     // Catch:{ Exception -> 0x00e7 }
            goto L_0x0124
        L_0x00e7:
            r7 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r3]
            java.lang.String r1 = "onFetchContentResult exception"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r7, r1, r8)
            ky0.d$a r7 = ky0.C46800d.C46801a.f125925a
            r7.mo72022a(r5)
            goto L_0x0124
        L_0x00f5:
            r8 = 5
            r4 = 4
            if (r9 != 0) goto L_0x010a
            r1 = 2
            if (r7 == r1) goto L_0x0108
            if (r7 == r4) goto L_0x0105
            if (r7 == r8) goto L_0x0102
            r5 = 4
            goto L_0x011f
        L_0x0102:
            r5 = 9
            goto L_0x011f
        L_0x0105:
            r5 = 8
            goto L_0x011f
        L_0x0108:
            r5 = 7
            goto L_0x011f
        L_0x010a:
            int r7 = r9.f146051d
            if (r7 == 0) goto L_0x0110
            r5 = 5
            goto L_0x011f
        L_0x0110:
            java.lang.String r7 = r9.f146053f
            if (r7 == 0) goto L_0x011c
            int r7 = r7.length()
            if (r7 != 0) goto L_0x011b
            goto L_0x011c
        L_0x011b:
            r1 = 0
        L_0x011c:
            if (r1 == 0) goto L_0x011f
            r5 = 6
        L_0x011f:
            ky0.d$a r7 = ky0.C46800d.C46801a.f125925a
            r7.mo72022a(r5)
        L_0x0124:
            if (r9 != 0) goto L_0x012c
            java.lang.String r7 = "fetchContentByWebTransfer response null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r7)
            return
        L_0x012c:
            java.util.LinkedList<te3.yf2> r7 = r9.f146054g
            java.lang.String r8 = "status"
            if (r7 == 0) goto L_0x0160
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x013c:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x0159
            java.lang.Object r2 = r7.next()
            r3 = r2
            te3.yf2 r3 = (te3.C52109yf2) r3
            if (r3 == 0) goto L_0x014e
            java.lang.String r3 = r3.f145258d
            goto L_0x014f
        L_0x014e:
            r3 = r0
        L_0x014f:
            boolean r3 = gy3.C87412m.m108589b(r3, r8)
            if (r3 == 0) goto L_0x013c
            r1.add(r2)
            goto L_0x013c
        L_0x0159:
            java.lang.Object r7 = sx3.C110818d0.m150916N(r1)
            r0 = r7
            te3.yf2 r0 = (te3.C52109yf2) r0
        L_0x0160:
            if (r0 != 0) goto L_0x016c
            int r7 = r9.f146051d
            if (r7 != 0) goto L_0x0169
            r7 = 200(0xc8, float:2.8E-43)
            goto L_0x0173
        L_0x0169:
            r7 = -99
            goto L_0x0173
        L_0x016c:
            java.lang.String r7 = r0.f145259e
            r0 = -1
            int r7 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r7, (int) r0)
        L_0x0173:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.LinkedList<te3.yf2> r9 = r9.f146054g
            if (r9 == 0) goto L_0x01b1
            java.util.Iterator r9 = r9.iterator()
        L_0x0180:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x01b1
            java.lang.Object r1 = r9.next()
            te3.yf2 r1 = (te3.C52109yf2) r1
            java.lang.String r2 = r1.f145258d
            java.lang.String r3 = ""
            if (r2 != 0) goto L_0x0193
            r2 = r3
        L_0x0193:
            java.lang.String r1 = r1.f145259e
            if (r1 != 0) goto L_0x0198
            goto L_0x0199
        L_0x0198:
            r3 = r1
        L_0x0199:
            boolean r1 = gy3.C87412m.m108589b(r2, r8)
            if (r1 != 0) goto L_0x0180
            java.lang.String r1 = r2.toLowerCase()
            java.lang.String r2 = "this as java.lang.String).toLowerCase()"
            gy3.C87412m.m108593f(r1, r2)
            java.util.List r2 = sx3.C26236u.m33719b(r3)
            r0.put(r1, r2)
            goto L_0x0180
        L_0x01b1:
            r9 = 304(0x130, float:4.26E-43)
            if (r7 != r9) goto L_0x01bf
            java.lang.String r9 = "200"
            java.util.List r9 = sx3.C26236u.m33719b(r9)
            r0.put(r8, r9)
            goto L_0x01ca
        L_0x01bf:
            java.lang.String r9 = java.lang.String.valueOf(r7)
            java.util.List r9 = sx3.C26236u.m33719b(r9)
            r0.put(r8, r9)
        L_0x01ca:
            jy0.b r8 = r6.f125927b
            iy0.a r8 = r8.f125480b
            java.util.HashMap r8 = r8.mo71770l()
            r8.putAll(r0)
            ky0.d r8 = ky0.C46800d.f125924a
            jy0.b r9 = r6.f125927b
            java.lang.String r1 = r9.f125479a
            iy0.a r2 = r9.f125480b
            java.lang.String r9 = r9.f125481c
            boolean r8 = r8.mo72016c(r1, r2, r9, r7)
            jy0.a r9 = r6.f125928c
            r9.mo63641a(r8, r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ky0.C46802e.mo66581b(int, java.lang.String, te3.zk2):void");
    }
}
