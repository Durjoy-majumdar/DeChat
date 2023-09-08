package sn1;

import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import java.util.LinkedList;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import sx3.C110818d0;
import te3.C49335eu3;
import te3.C49385f60;
import te3.C49520g60;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C51163rv3;
import te3.se4;

/* renamed from: sn1.a */
public final class C13735a extends C60625c<C49520g60> {

    /* renamed from: t */
    public static final C13736a f38834t = new C13736a((C8480h) null);

    /* renamed from: s */
    public final String f38835s = "Finder.CgiFinderLiveEcCustomerGetAllTabOrderCnt";

    /* renamed from: sn1.a$a */
    public static final class C13736a {
        public C13736a(C8480h hVar) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x004b  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.List<java.lang.Integer> mo13109a(java.util.List<java.lang.Integer> r10) {
            /*
                r9 = this;
                java.lang.String r0 = "tabTypeList"
                gy3.C87412m.m108594g(r10, r0)
                f40.o r0 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r0 = r0.mo121142i()
                com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_MY_FINDER_ORDER_TAB_COUNTS_STRING_SYNC
                java.lang.String r2 = ""
                java.lang.String r0 = r0.mo119675I(r1, r2)
                te3.g60 r1 = new te3.g60
                r1.<init>()
                byte[] r0 = com.tencent.p014mm.sdk.platformtools.Util.decodeHexString(r0)
                r3 = 1
                r4 = 0
                r5 = 0
                if (r0 != 0) goto L_0x0026
            L_0x0024:
                r1 = r5
                goto L_0x0036
            L_0x0026:
                r1.parseFrom(r0)     // Catch:{ Exception -> 0x002a }
                goto L_0x0036
            L_0x002a:
                r0 = move-exception
                java.lang.Object[] r1 = new java.lang.Object[r3]
                r1[r4] = r0
                java.lang.String r0 = "safeParser"
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r0, r2, r1)
                goto L_0x0024
            L_0x0036:
                java.util.ArrayList r0 = new java.util.ArrayList
                r2 = 10
                int r2 = sx3.C36907w.m41090l(r10, r2)
                r0.<init>(r2)
                java.util.Iterator r10 = r10.iterator()
            L_0x0045:
                boolean r2 = r10.hasNext()
                if (r2 == 0) goto L_0x0087
                java.lang.Object r2 = r10.next()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                if (r1 == 0) goto L_0x007e
                java.util.LinkedList<te3.se4> r6 = r1.f133887d
                if (r6 == 0) goto L_0x007e
                java.util.Iterator r6 = r6.iterator()
            L_0x005f:
                boolean r7 = r6.hasNext()
                if (r7 == 0) goto L_0x0076
                java.lang.Object r7 = r6.next()
                r8 = r7
                te3.se4 r8 = (te3.se4) r8
                int r8 = r8.f141465d
                if (r8 != r2) goto L_0x0072
                r8 = 1
                goto L_0x0073
            L_0x0072:
                r8 = 0
            L_0x0073:
                if (r8 == 0) goto L_0x005f
                goto L_0x0077
            L_0x0076:
                r7 = r5
            L_0x0077:
                te3.se4 r7 = (te3.se4) r7
                if (r7 == 0) goto L_0x007e
                int r2 = r7.f141466e
                goto L_0x007f
            L_0x007e:
                r2 = 0
            L_0x007f:
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0.add(r2)
                goto L_0x0045
            L_0x0087:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: sn1.C13735a.C13736a.mo13109a(java.util.List):java.util.List");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13735a(String str) {
        super((C49712hj1) null, (C9487b) null, 2, (C8480h) null);
        C87412m.m108594g(str, "filterAppId");
        C49385f60 f602 = new C49385f60();
        f602.f133308d = str;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = f602;
        C49520g60 g602 = new C49520g60();
        g602.setBaseResponse(new C49966ja());
        g602.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = g602;
        bVar.f127068c = "/cgi-bin/micromsg-bin/eccustomergettabordercnt";
        bVar.f127069d = 6247;
        mo123453j(bVar.mo72403a());
        Log.m105924i("Finder.CgiFinderLiveEcCustomerGetAllTabOrderCnt", APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C49520g60 g602 = (C49520g60) eu32;
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_MY_FINDER_ORDER_TAB_COUNTS_STRING_SYNC;
        C87412m.m108594g(g602, "resp");
        String str2 = this.f38835s;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread() + ' ');
        if (i != 0 || i2 != 0) {
            return;
        }
        if (g602.f133887d == null) {
            C86709a0.m107535s().mo121142i().mo119677K(aVar, "");
            return;
        }
        String str3 = this.f38835s;
        StringBuilder sb = new StringBuilder();
        sb.append("count :");
        LinkedList<se4> linkedList = g602.f133887d;
        C87412m.m108593f(linkedList, "resp.cnts");
        sb.append(C110818d0.m150921S(linkedList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null));
        Log.m105924i(str3, sb.toString());
        C86709a0.m107535s().mo121142i().mo119677K(aVar, Util.encodeHexString(g602.toByteArray()));
    }
}
