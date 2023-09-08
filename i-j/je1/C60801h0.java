package je1;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import dj1.C58286q;
import gy3.C87412m;
import ob0.C117747y;
import te3.C49030co0;
import te3.C49335eu3;
import te3.C64262bo0;

/* renamed from: je1.h0 */
public final class C60801h0 extends C58286q<C49030co0> {

    /* renamed from: t */
    public final String f173179t;

    /* renamed from: u */
    public final String f173180u = "Finder.CgiFinderGetLiveMsgWithOffset";

    /* renamed from: v */
    public C64262bo0 f173181v;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C60801h0(java.lang.String r13, long r14, long r16, java.lang.String r18, int r19, java.lang.String r20, te3.C49712hj1 r21, int r22, boolean r23, pe3.C89349b r24, java.lang.String r25) {
        /*
            r12 = this;
            r0 = r12
            r1 = r13
            r2 = r18
            r3 = r20
            r4 = r21
            r5 = r25
            java.lang.String r6 = "targetFinderUsername"
            gy3.C87412m.m108594g(r13, r6)
            java.lang.String r6 = "nonceId"
            gy3.C87412m.m108594g(r2, r6)
            java.lang.String r6 = "highLightId"
            gy3.C87412m.m108594g(r3, r6)
            java.lang.String r6 = "contextObj"
            gy3.C87412m.m108594g(r4, r6)
            java.lang.String r6 = "requestUniqueCode"
            gy3.C87412m.m108594g(r5, r6)
            r12.<init>(r4)
            r0.f173179t = r5
            java.lang.String r6 = "Finder.CgiFinderGetLiveMsgWithOffset"
            r0.f173180u = r6
            te3.bo0 r7 = new te3.bo0
            r7.<init>()
            r0.f173181v = r7
            je1.h2 r8 = je1.C46523h2.f125330a
            r9 = 5806(0x16ae, float:8.136E-42)
            te3.ig0 r10 = r8.mo71859a(r9)
            r7.f182291d = r10
            te3.bo0 r7 = r0.f173181v
            r7.f182293f = r1
            r10 = r14
            r7.f182292e = r10
            r10 = r16
            r7.f182294g = r10
            r7.f182295h = r2
            r7.f182300p = r3
            r1 = r22
            r7.f182296i = r1
            r1 = r23
            r7.f182297j = r1
            r1 = r24
            r7.f182299o = r1
            r1 = r19
            r7.f182298n = r1
            te3.ig0 r1 = r7.f182291d
            rx3.l r2 = new rx3.l
            int r3 = r4.f134675i
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Long r4 = java.lang.Long.valueOf(r16)
            r2.<init>(r3, r4)
            java.util.List r2 = sx3.C26236u.m33719b(r2)
            r3 = 0
            r8.mo71865g(r1, r2, r3)
            ob0.c$b r1 = new ob0.c$b
            r1.<init>()
            te3.bo0 r2 = r0.f173181v
            r1.f127066a = r2
            te3.co0 r2 = new te3.co0
            r2.<init>()
            te3.ja r3 = new te3.ja
            r3.<init>()
            r2.setBaseResponse(r3)
            te3.ja r3 = r2.getBaseResponse()
            te3.rv3 r4 = new te3.rv3
            r4.<init>()
            r3.f135956e = r4
            r1.f127067b = r2
            java.lang.String r2 = "/cgi-bin/micromsg-bin/findergetlivemsgwithoffset"
            r1.f127068c = r2
            r1.f127069d = r9
            r2 = 1
            r1.f127075j = r2
            r2 = 25000(0x61a8, float:3.5032E-41)
            r1.f127076k = r2
            ob0.c r1 = r1.mo72403a()
            r12.mo123453j(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "CgiFinderGetLiveMsg init "
            r1.append(r2)
            te3.bo0 r2 = r0.f173181v
            long r2 = r2.f182292e
            r1.append(r2)
            java.lang.String r2 = ", object_id:"
            r1.append(r2)
            te3.bo0 r2 = r0.f173181v
            long r2 = r2.f182294g
            java.lang.String r2 = o40.C61926c.m72691p(r2)
            r1.append(r2)
            java.lang.String r2 = ", nonce_id:"
            r1.append(r2)
            te3.bo0 r2 = r0.f173181v
            java.lang.String r2 = r2.f182295h
            r1.append(r2)
            java.lang.String r2 = ", offset:"
            r1.append(r2)
            te3.bo0 r2 = r0.f173181v
            int r2 = r2.f182296i
            r1.append(r2)
            java.lang.String r2 = ", continual:"
            r1.append(r2)
            te3.bo0 r2 = r0.f173181v
            boolean r2 = r2.f182297j
            r1.append(r2)
            java.lang.String r2 = ", username:"
            r1.append(r2)
            te3.bo0 r2 = r0.f173181v
            java.lang.String r2 = r2.f182293f
            r1.append(r2)
            java.lang.String r2 = ", scene:"
            r1.append(r2)
            te3.bo0 r2 = r0.f173181v
            int r2 = r2.f182298n
            r1.append(r2)
            java.lang.String r2 = ",requestUniqueCode:"
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: je1.C60801h0.<init>(java.lang.String, long, long, java.lang.String, int, java.lang.String, te3.hj1, int, boolean, pe3.b, java.lang.String):void");
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C49030co0 co02 = (C49030co0) eu32;
        C87412m.m108594g(co02, "resp");
        co02.f131869o = this.f173179t;
        if (i == 0 && i2 == 0) {
            String str2 = this.f173180u;
            Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + ' ');
            C115669n.INSTANCE.mo175912v(this.f166900s, 22);
        } else {
            String str3 = this.f173180u;
            Log.m105924i(str3, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
            C115669n.INSTANCE.mo175912v(this.f166900s, 23);
        }
        C115669n.INSTANCE.mo175912v(this.f166900s, 21);
    }
}
