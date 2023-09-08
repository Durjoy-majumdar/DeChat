package dj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ob0.C117747y;
import te3.C49335eu3;
import te3.C50512n91;
import te3.C64547m91;

/* renamed from: dj1.a1 */
public final class C58272a1 extends C58286q<C50512n91> {

    /* renamed from: t */
    public final String f166856t = "Finder.CgiFinderLiveSyncExtraInfo";

    /* renamed from: u */
    public C58273a f166857u;

    /* renamed from: v */
    public final C64547m91 f166858v;

    /* renamed from: dj1.a1$a */
    public interface C58273a {
        /* renamed from: a */
        void mo75796a(C58272a1 a1Var, int i, int i2, String str, C50512n91 n912);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x003e, code lost:
        r4 = ((cl1.C54991o) r4.mo71262a(cl1.C54991o.class)).f154203G1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C58272a1(long r4, long r6, java.lang.String r8, java.lang.String r9, java.lang.String r10, pe3.C89349b r11, java.util.LinkedList<te3.ge4> r12, java.lang.String r13, dj1.C58272a1.C58273a r14, te3.C49712hj1 r15) {
        /*
            r3 = this;
            java.lang.String r0 = "nonceId"
            gy3.C87412m.m108594g(r8, r0)
            java.lang.String r0 = "anchorUsername"
            gy3.C87412m.m108594g(r9, r0)
            java.lang.String r0 = "syncReqList"
            gy3.C87412m.m108594g(r12, r0)
            r3.<init>(r15)
            java.lang.String r0 = "Finder.CgiFinderLiveSyncExtraInfo"
            r3.f166856t = r0
            r3.f166857u = r14
            te3.m91 r14 = new te3.m91
            r14.<init>()
            r3.f166858v = r14
            je1.h2 r1 = je1.C46523h2.f125330a
            r2 = 5971(0x1753, float:8.367E-42)
            te3.ig0 r15 = r1.mo71860b(r2, r15)
            r14.f184239d = r15
            r14.f184244i = r4
            r14.f184243h = r6
            r14.f184240e = r9
            r14.f184241f = r10
            r14.f184242g = r11
            r14.f184245j = r12
            r14.f184246n = r8
            fj1.b$a r4 = fj1.C45795b.f123697j
            fj1.b r4 = fj1.C45795b.f123698n
            if (r4 == 0) goto L_0x004a
            java.lang.Class<cl1.o> r5 = cl1.C54991o.class
            androidx.lifecycle.i0 r4 = r4.mo71262a(r5)
            cl1.o r4 = (cl1.C54991o) r4
            java.lang.String r4 = r4.f154203G1
            if (r4 != 0) goto L_0x004c
        L_0x004a:
            java.lang.String r4 = ""
        L_0x004c:
            r14.f184248p = r4
            if (r13 == 0) goto L_0x0059
            int r4 = r13.length()
            if (r4 != 0) goto L_0x0057
            goto L_0x0059
        L_0x0057:
            r4 = 0
            goto L_0x005a
        L_0x0059:
            r4 = 1
        L_0x005a:
            if (r4 != 0) goto L_0x0062
            pe3.b r4 = pe3.C89349b.m111675b(r13)
            r14.f184247o = r4
        L_0x0062:
            er1.j4 r4 = er1.C58739j4.f168176a
            r5 = 3
            r6 = 0
            te3.xw0 r4 = er1.C58739j4.m68251e(r4, r6, r6, r5, r6)
            r14.f184249q = r4
            ob0.c$b r4 = new ob0.c$b
            r4.<init>()
            r4.f127066a = r14
            te3.n91 r5 = new te3.n91
            r5.<init>()
            te3.ja r6 = new te3.ja
            r6.<init>()
            r5.setBaseResponse(r6)
            te3.ja r6 = r5.getBaseResponse()
            te3.rv3 r7 = new te3.rv3
            r7.<init>()
            r6.f135956e = r7
            r4.f127067b = r5
            java.lang.String r5 = "/cgi-bin/micromsg-bin/finderlivesyncextrainfo"
            r4.f127068c = r5
            r4.f127069d = r2
            ob0.c r4 = r4.mo72403a()
            r3.mo123453j(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "init "
            r4.append(r5)
            long r5 = r14.f184244i
            r4.append(r5)
            java.lang.String r5 = ",ux_info:"
            r4.append(r5)
            pe3.b r5 = r14.f184247o
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dj1.C58272a1.<init>(long, long, java.lang.String, java.lang.String, java.lang.String, pe3.b, java.util.LinkedList, java.lang.String, dj1.a1$a, te3.hj1):void");
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C50512n91 n912 = (C50512n91) eu32;
        C87412m.m108594g(n912, "resp");
        String str2 = this.f166856t;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
        C58273a aVar = this.f166857u;
        if (aVar != null) {
            aVar.mo75796a(this, i, i2, str, n912);
        }
    }
}
