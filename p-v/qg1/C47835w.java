package qg1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import it1.C60625c;
import o40.C61926c;
import ob0.C117747y;
import te3.C49335eu3;
import te3.C51590us0;
import te3.C51732vs0;

/* renamed from: qg1.w */
public final class C47835w extends C60625c<C51732vs0> {

    /* renamed from: s */
    public final String f128411s = "Finder.CgiFinderLivePushOrCancelPromote";

    /* renamed from: t */
    public C51590us0 f128412t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x002e, code lost:
        r3 = ((cl1.C54991o) r3.mo71262a(cl1.C54991o.class)).f154345o;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C47835w(long r8, long r10, te3.C51059r51 r12, int r13) {
        /*
            r7 = this;
            java.lang.String r0 = "item"
            gy3.C87412m.m108594g(r12, r0)
            r0 = 0
            r1 = 2
            r7.<init>(r0, r0, r1, r0)
            java.lang.String r0 = "Finder.CgiFinderLivePushOrCancelPromote"
            r7.f128411s = r0
            te3.us0 r2 = new te3.us0
            r2.<init>()
            r7.f128412t = r2
            je1.h2 r3 = je1.C46523h2.f125330a
            r4 = 5970(0x1752, float:8.366E-42)
            te3.ig0 r3 = r3.mo71859a(r4)
            r2.f143061d = r3
            te3.us0 r2 = r7.f128412t
            r2.f143063f = r8
            r2.f143064g = r10
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r3 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r3.getClass()
            fj1.b r3 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159348A
            if (r3 == 0) goto L_0x003a
            java.lang.Class<cl1.o> r5 = cl1.C54991o.class
            androidx.lifecycle.i0 r3 = r3.mo71262a(r5)
            cl1.o r3 = (cl1.C54991o) r3
            java.lang.String r3 = r3.f154345o
            if (r3 != 0) goto L_0x0040
        L_0x003a:
            zc1.b r3 = zc1.C66785b.f191882e
            java.lang.String r3 = r3.mo90662O5()
        L_0x0040:
            r2.f143062e = r3
            te3.us0 r2 = r7.f128412t
            long r5 = r12.f140705d
            r2.f143065h = r5
            boolean r3 = r12.f140708g
            if (r3 == 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r1 = 1
        L_0x004e:
            r2.f143066i = r1
            r2.f143067j = r13
            ob0.c$b r13 = new ob0.c$b
            r13.<init>()
            r13.f127066a = r2
            te3.vs0 r1 = new te3.vs0
            r1.<init>()
            te3.ja r2 = new te3.ja
            r2.<init>()
            r1.setBaseResponse(r2)
            te3.ja r2 = r1.getBaseResponse()
            te3.rv3 r3 = new te3.rv3
            r3.<init>()
            r2.f135956e = r3
            r13.f127067b = r1
            java.lang.String r1 = "/cgi-bin/micromsg-bin/finderliveanchorsendpromoteinfo"
            r13.f127068c = r1
            r13.f127069d = r4
            ob0.c r13 = r13.mo72403a()
            r7.mo123453j(r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r1 = "init liveId:"
            r13.append(r1)
            r13.append(r10)
            java.lang.String r10 = ", objectId:"
            r13.append(r10)
            r13.append(r8)
            java.lang.String r8 = "}, promoteId:"
            r13.append(r8)
            long r8 = r12.f140705d
            r13.append(r8)
            java.lang.String r8 = ", scene:"
            r13.append(r8)
            te3.us0 r8 = r7.f128412t
            int r8 = r8.f143066i
            r13.append(r8)
            java.lang.String r8 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qg1.C47835w.<init>(long, long, te3.r51, int):void");
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C51732vs0) eu32, "resp");
        String str2 = this.f128411s;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread() + ' ');
        switch (i2) {
            case -200194:
            case -200193:
                C61926c.m72668M(C12232v.f35303d);
                return;
            default:
                return;
        }
    }
}
