package ky0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.util.WXWebReporter;
import gy3.C87412m;
import java.util.LinkedList;
import jy0.C46580b;
import kj2.C117407d;
import te3.C52109yf2;
import te3.C52129yk2;

/* renamed from: ky0.d */
public final class C46800d extends C46795a {

    /* renamed from: a */
    public static final C46800d f125924a = new C46800d();

    /* renamed from: ky0.d$a */
    public static final class C46801a {

        /* renamed from: a */
        public static final C46801a f125925a = new C46801a();

        /* renamed from: a */
        public final void mo72022a(int i) {
            int i2;
            if (i != 99) {
                switch (i) {
                    case 0:
                        i2 = 220;
                        break;
                    case 1:
                        i2 = 221;
                        break;
                    case 2:
                        i2 = WXWebReporter.WXXWEB_IDKEY_XWEB_LOAD_URL_MAX_FAILED_SWITCH_TO_SYS;
                        break;
                    case 3:
                        i2 = WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_FROM_WEB;
                        break;
                    case 4:
                        i2 = WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_ALL;
                        break;
                    case 5:
                        i2 = 225;
                        break;
                    case 6:
                        i2 = 226;
                        break;
                    case 7:
                        i2 = 229;
                        break;
                    case 8:
                        i2 = 230;
                        break;
                    case 9:
                        i2 = 231;
                        break;
                    default:
                        i2 = -1;
                        break;
                }
            } else {
                i2 = WXWebReporter.WXXWEB_IDKEY_X5_LOAD_URL_MAX_FAILED_TEST_SYS_SUC;
            }
            if (i2 != -1) {
                C117407d.INSTANCE.mo182089r(1454, (long) i2, 1);
            }
        }
    }

    /* renamed from: a */
    public boolean mo72017a(C46580b bVar) {
        C87412m.m108594g(bVar, "request");
        return bVar.f125483e.length() > 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ab  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo72018b(jy0.C46580b r17, jy0.C46579a r18) {
        /*
            r16 = this;
            r1 = r17
            r2 = r18
            java.lang.String r0 = "request"
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "callback"
            gy3.C87412m.m108594g(r2, r0)
            kj2.d r3 = kj2.C117407d.INSTANCE
            r4 = 1454(0x5ae, double:7.184E-321)
            r6 = 219(0xdb, double:1.08E-321)
            r8 = 1
            r3.mo182089r(r4, r6, r8)
            java.lang.String r3 = "jsApiRequest"
            java.lang.String r0 = r1.f125483e
            int r0 = r0.length()
            r4 = 0
            r5 = 1
            if (r0 != 0) goto L_0x0028
            r0 = 1
            goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            r6 = -1
            r7 = 2
            if (r0 == 0) goto L_0x0030
            r0 = 1
            goto L_0x0206
        L_0x0030:
            iy0.a r8 = r1.f125480b
            com.tencent.mm.plugin.webview.core.v$b r0 = com.tencent.p014mm.plugin.webview.core.C43520v.f117665a
            boolean r0 = r0.mo67810a()
            r9 = 0
            if (r0 == 0) goto L_0x007c
            java.lang.String r0 = sf0.C90188n0.f258945m
            if (r0 == 0) goto L_0x0048
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0046
            goto L_0x0048
        L_0x0046:
            r0 = 0
            goto L_0x0049
        L_0x0048:
            r0 = 1
        L_0x0049:
            java.lang.String r10 = "MicroMsg.WebPrefetcherJsApiHandler"
            if (r0 == 0) goto L_0x0053
            java.lang.String r0 = "getHardCodeJsPermission, Test.jsapiPermission is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
            goto L_0x007c
        L_0x0053:
            java.lang.String r0 = sf0.C90188n0.f258945m     // Catch:{ Exception -> 0x0074 }
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r4)     // Catch:{ Exception -> 0x0074 }
            if (r0 >= 0) goto L_0x0061
            java.lang.String r0 = "getHardCodeJsPermission, Test.jsapiPermission wrong"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)     // Catch:{ Exception -> 0x0074 }
            goto L_0x007c
        L_0x0061:
            java.lang.String r11 = "getHardCodeJsPermission %d"
            java.lang.Object[] r12 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0074 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0074 }
            r12[r4] = r13     // Catch:{ Exception -> 0x0074 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r11, r12)     // Catch:{ Exception -> 0x0074 }
            com.tencent.mm.protocal.JsapiPermissionWrapper r11 = new com.tencent.mm.protocal.JsapiPermissionWrapper     // Catch:{ Exception -> 0x0074 }
            r11.<init>((int) r0)     // Catch:{ Exception -> 0x0074 }
            goto L_0x007d
        L_0x0074:
            r0 = move-exception
            java.lang.Object[] r11 = new java.lang.Object[r4]
            java.lang.String r12 = "getHardCodeJsPermission exception"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r10, r0, r12, r11)
        L_0x007c:
            r11 = r9
        L_0x007d:
            if (r11 != 0) goto L_0x0094
            com.tencent.mm.protocal.JsapiPermissionWrapper r11 = new com.tencent.mm.protocal.JsapiPermissionWrapper
            rx3.g r0 = r8.f124938t
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            pe3.b r0 = (pe3.C89349b) r0
            if (r0 == 0) goto L_0x0090
            byte[] r0 = r0.f257327a
            goto L_0x0091
        L_0x0090:
            r0 = r9
        L_0x0091:
            r11.<init>((byte[]) r0)
        L_0x0094:
            r0 = 435(0x1b3, float:6.1E-43)
            boolean r0 = r11.mo69447f(r0)
            java.lang.String r8 = "MicroMsg.WebTransferContentFetcher"
            if (r0 != 0) goto L_0x00a5
            java.lang.String r0 = "fetchContentByWebTransfer has no permission of webTransfer and ignore"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r0)
            r0 = 0
            goto L_0x00a6
        L_0x00a5:
            r0 = 1
        L_0x00a6:
            if (r0 != 0) goto L_0x00ab
            r0 = 2
            goto L_0x0206
        L_0x00ab:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r10 = "fetchContentByWebTransfer data: "
            r0.append(r10)
            java.lang.String r10 = r1.f125483e
            r0.append(r10)
            java.lang.String r10 = ", url: %s"
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r10 = new java.lang.Object[r5]
            java.lang.String r11 = r1.f125479a
            r10[r4] = r11
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r0, r10)
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x01fd }
            java.lang.String r10 = r1.f125483e     // Catch:{ Exception -> 0x01fd }
            r0.<init>(r10)     // Catch:{ Exception -> 0x01fd }
            com.tencent.mm.plugin.brandservice.api.TransferRequestInfo r10 = new com.tencent.mm.plugin.brandservice.api.TransferRequestInfo     // Catch:{ Exception -> 0x01fd }
            r10.<init>()     // Catch:{ Exception -> 0x01fd }
            r10.f109024d = r7     // Catch:{ Exception -> 0x01fd }
            java.lang.String r11 = "scope"
            java.lang.String r11 = r0.optString(r11)     // Catch:{ Exception -> 0x01fd }
            r10.f109026f = r11     // Catch:{ Exception -> 0x01fd }
            java.lang.String r11 = r1.f125479a     // Catch:{ Exception -> 0x01fd }
            r10.f109025e = r11     // Catch:{ Exception -> 0x01fd }
            te3.yk2 r11 = new te3.yk2     // Catch:{ Exception -> 0x01fd }
            r11.<init>()     // Catch:{ Exception -> 0x01fd }
            java.lang.String r12 = r1.f125479a     // Catch:{ Exception -> 0x01fd }
            r11.f145341d = r12     // Catch:{ Exception -> 0x01fd }
            r11.f145345h = r4     // Catch:{ Exception -> 0x01fd }
            r10.f109028h = r11     // Catch:{ Exception -> 0x01fd }
            r10.f109029i = r4     // Catch:{ Exception -> 0x01fd }
            boolean r12 = com.tencent.p014mm.plugin.brandservice.webprefetcher.debug.C40819a.m44115a()     // Catch:{ Exception -> 0x01fd }
            if (r12 == 0) goto L_0x0110
            java.util.LinkedList<te3.yf2> r11 = r11.f145344g     // Catch:{ Exception -> 0x01fd }
            te3.yf2 r12 = new te3.yf2     // Catch:{ Exception -> 0x01fd }
            r12.<init>()     // Catch:{ Exception -> 0x01fd }
            java.lang.String r13 = "Cookie"
            r12.f145258d = r13     // Catch:{ Exception -> 0x01fd }
            java.lang.String r13 = com.tencent.p014mm.plugin.brandservice.webprefetcher.debug.C40819a.m44117c()     // Catch:{ Exception -> 0x01fd }
            r12.f145259e = r13     // Catch:{ Exception -> 0x01fd }
            r11.push(r12)     // Catch:{ Exception -> 0x01fd }
        L_0x0110:
            android.content.Context r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x01fd }
            ea3.j$b r12 = ea3.C45596j.f123315f     // Catch:{ Exception -> 0x01fd }
            java.lang.String r12 = r12.mo71117a()     // Catch:{ Exception -> 0x01fd }
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0 r13 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0.f109363a     // Catch:{ Exception -> 0x01fd }
            r13.getClass()     // Catch:{ Exception -> 0x01fd }
            rx3.g r13 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0.f109367e     // Catch:{ Exception -> 0x01fd }
            rx3.n r13 = (rx3.C36570n) r13     // Catch:{ Exception -> 0x01fd }
            java.lang.Object r13 = r13.getValue()     // Catch:{ Exception -> 0x01fd }
            ea3.j r13 = (ea3.C45596j) r13     // Catch:{ Exception -> 0x01fd }
            java.lang.String r11 = js0.C46574u.m51897a(r11, r12, r13)     // Catch:{ Exception -> 0x01fd }
            ky0.d r12 = f125924a     // Catch:{ Exception -> 0x01fd }
            te3.yk2 r13 = r10.f109028h     // Catch:{ Exception -> 0x01fd }
            gy3.C87412m.m108593f(r13, r3)     // Catch:{ Exception -> 0x01fd }
            java.lang.String r14 = "User-Agent"
            r12.mo72021d(r13, r14, r11)     // Catch:{ Exception -> 0x01fd }
            java.util.Map<java.lang.String, java.lang.String> r11 = r1.f125482d     // Catch:{ Exception -> 0x01fd }
            if (r11 == 0) goto L_0x0168
            java.util.Set r11 = r11.entrySet()     // Catch:{ Exception -> 0x01fd }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ Exception -> 0x01fd }
        L_0x0145:
            boolean r12 = r11.hasNext()     // Catch:{ Exception -> 0x01fd }
            if (r12 == 0) goto L_0x0168
            java.lang.Object r12 = r11.next()     // Catch:{ Exception -> 0x01fd }
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12     // Catch:{ Exception -> 0x01fd }
            ky0.d r13 = f125924a     // Catch:{ Exception -> 0x01fd }
            te3.yk2 r14 = r10.f109028h     // Catch:{ Exception -> 0x01fd }
            gy3.C87412m.m108593f(r14, r3)     // Catch:{ Exception -> 0x01fd }
            java.lang.Object r15 = r12.getKey()     // Catch:{ Exception -> 0x01fd }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ Exception -> 0x01fd }
            java.lang.Object r12 = r12.getValue()     // Catch:{ Exception -> 0x01fd }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x01fd }
            r13.mo72021d(r14, r15, r12)     // Catch:{ Exception -> 0x01fd }
            goto L_0x0145
        L_0x0168:
            java.lang.String r11 = "header"
            org.json.JSONObject r0 = r0.optJSONObject(r11)     // Catch:{ Exception -> 0x01fd }
            if (r0 == 0) goto L_0x0175
            java.util.Iterator r11 = r0.keys()     // Catch:{ Exception -> 0x01fd }
            goto L_0x0176
        L_0x0175:
            r11 = r9
        L_0x0176:
            if (r11 == 0) goto L_0x0197
        L_0x0178:
            boolean r12 = r11.hasNext()     // Catch:{ Exception -> 0x01fd }
            if (r12 == 0) goto L_0x0197
            java.lang.Object r12 = r11.next()     // Catch:{ Exception -> 0x01fd }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x01fd }
            java.lang.String r13 = r0.optString(r12)     // Catch:{ Exception -> 0x01fd }
            if (r13 != 0) goto L_0x018c
            java.lang.String r13 = ""
        L_0x018c:
            ky0.d r14 = f125924a     // Catch:{ Exception -> 0x01fd }
            te3.yk2 r15 = r10.f109028h     // Catch:{ Exception -> 0x01fd }
            gy3.C87412m.m108593f(r15, r3)     // Catch:{ Exception -> 0x01fd }
            r14.mo72021d(r15, r12, r13)     // Catch:{ Exception -> 0x01fd }
            goto L_0x0178
        L_0x0197:
            iy0.a r0 = r1.f125480b     // Catch:{ Exception -> 0x01fd }
            t73.b r11 = r0.f124921c     // Catch:{ Exception -> 0x01fd }
            if (r11 == 0) goto L_0x01a5
            java.lang.String r9 = r0.mo71762d()     // Catch:{ Exception -> 0x01fd }
            com.tencent.mm.vfs.m1 r9 = r11.mo73172B(r9)     // Catch:{ Exception -> 0x01fd }
        L_0x01a5:
            if (r9 == 0) goto L_0x01af
            boolean r9 = r9.mo119967g()     // Catch:{ Exception -> 0x01fd }
            if (r9 != r5) goto L_0x01af
            r9 = 1
            goto L_0x01b0
        L_0x01af:
            r9 = 0
        L_0x01b0:
            if (r9 == 0) goto L_0x01e9
            java.lang.String r9 = r0.mo71780v()     // Catch:{ Exception -> 0x01fd }
            boolean r9 = z04.C112551y.m153811k(r9)     // Catch:{ Exception -> 0x01fd }
            r9 = r9 ^ r5
            if (r9 == 0) goto L_0x01ce
            ky0.d r9 = f125924a     // Catch:{ Exception -> 0x01fd }
            te3.yk2 r11 = r10.f109028h     // Catch:{ Exception -> 0x01fd }
            gy3.C87412m.m108593f(r11, r3)     // Catch:{ Exception -> 0x01fd }
            java.lang.String r12 = "x-wx-if-none-match"
            java.lang.String r13 = r0.mo71780v()     // Catch:{ Exception -> 0x01fd }
            r9.mo72021d(r11, r12, r13)     // Catch:{ Exception -> 0x01fd }
        L_0x01ce:
            java.lang.String r9 = r0.mo71767i()     // Catch:{ Exception -> 0x01fd }
            boolean r9 = z04.C112551y.m153811k(r9)     // Catch:{ Exception -> 0x01fd }
            r9 = r9 ^ r5
            if (r9 == 0) goto L_0x01e9
            ky0.d r9 = f125924a     // Catch:{ Exception -> 0x01fd }
            te3.yk2 r11 = r10.f109028h     // Catch:{ Exception -> 0x01fd }
            gy3.C87412m.m108593f(r11, r3)     // Catch:{ Exception -> 0x01fd }
            java.lang.String r3 = "if-none-match"
            java.lang.String r0 = r0.mo71767i()     // Catch:{ Exception -> 0x01fd }
            r9.mo72021d(r11, r3, r0)     // Catch:{ Exception -> 0x01fd }
        L_0x01e9:
            iy0.a r0 = r1.f125480b     // Catch:{ Exception -> 0x01fd }
            java.lang.Class<ex0.f> r3 = ex0.C45698f.class
            k40.a r3 = f40.C86709a0.m107533q(r3)     // Catch:{ Exception -> 0x01fd }
            ex0.f r3 = (ex0.C45698f) r3     // Catch:{ Exception -> 0x01fd }
            ky0.e r9 = new ky0.e     // Catch:{ Exception -> 0x01fd }
            r9.<init>(r0, r1, r2)     // Catch:{ Exception -> 0x01fd }
            r3.mo71195RT(r10, r9)     // Catch:{ Exception -> 0x01fd }
            r0 = -1
            goto L_0x0206
        L_0x01fd:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r2 = "fetchContentByTransfer exception"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r2, r1)
            r0 = 3
        L_0x0206:
            if (r0 == r6) goto L_0x020d
            ky0.d$a r1 = ky0.C46800d.C46801a.f125925a
            r1.mo72022a(r0)
        L_0x020d:
            if (r0 != r7) goto L_0x0210
            return r5
        L_0x0210:
            if (r0 != r6) goto L_0x0213
            r4 = 1
        L_0x0213:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ky0.C46800d.mo72018b(jy0.b, jy0.a):boolean");
    }

    /* renamed from: d */
    public final void mo72021d(C52129yk2 yk22, String str, String str2) {
        if (!(str == null || str.length() == 0)) {
            Log.m105926v("MicroMsg.WebTransferContentFetcher", "fetchContentByWebTransfer request header key: " + str + ", value: " + str2);
            LinkedList<C52109yf2> linkedList = yk22.f145344g;
            C52109yf2 yf22 = new C52109yf2();
            yf22.f145258d = str;
            yf22.f145259e = str2;
            linkedList.push(yf22);
        }
    }

    public String name() {
        return "MicroMsg.WebTransferContentFetcher";
    }
}
