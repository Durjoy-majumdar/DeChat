package je1;

import cm1.C0720c3;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import rx3.C13604l;
import sx3.C26236u;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C51163rv3;
import te3.C51863wp0;
import te3.C52002xp0;

/* renamed from: je1.q0 */
public final class C9366q0 extends C60625c<C52002xp0> {

    /* renamed from: s */
    public C51863wp0 f29246s;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C9366q0(int r11, long r12, java.lang.Long r14, java.lang.String r15, int r16, pe3.C89349b r17, te3.C49712hj1 r18, java.lang.String r19) {
        /*
            r10 = this;
            r0 = r10
            r1 = r18
            r2 = r19
            r3 = 0
            r4 = 2
            r10.<init>(r1, r3, r4, r3)
            te3.wp0 r4 = new te3.wp0
            r4.<init>()
            r0.f29246s = r4
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
            r5 = 0
            if (r4 != 0) goto L_0x001a
            r4 = 4
            goto L_0x001b
        L_0x001a:
            r4 = 0
        L_0x001b:
            te3.wp0 r6 = r0.f29246s
            je1.h2 r7 = je1.C46523h2.f125330a
            r8 = 817(0x331, float:1.145E-42)
            te3.ig0 r8 = r7.mo71860b(r8, r1)
            r6.f144190d = r8
            if (r14 == 0) goto L_0x0034
            r14.longValue()
            te3.wp0 r6 = r0.f29246s
            long r8 = r14.longValue()
            r6.f144196j = r8
        L_0x0034:
            te3.wp0 r6 = r0.f29246s
            r8 = r11
            r6.f144192f = r8
            java.lang.String r8 = ""
            r6.f144193g = r8
            r8 = r17
            r6.f144191e = r8
            r8 = r12
            r6.f144202s = r8
            r6.f144199p = r3
            r8 = r15
            r6.f144204u = r8
            r8 = r16
            r6.f144205v = r8
            r6.f144200q = r4
            r6.f144203t = r3
            r6.f144197n = r5
            r4 = 0
            r6.f144194h = r4
            r6.f144195i = r4
            r6.f144198o = r3
            if (r2 == 0) goto L_0x0070
            java.nio.charset.Charset r4 = z04.C119027c.f356488a
            byte[] r2 = r2.getBytes(r4)
            java.lang.String r4 = "this as java.lang.String).getBytes(charset)"
            gy3.C87412m.m108593f(r2, r4)
            pe3.b r4 = new pe3.b
            int r8 = r2.length
            r4.<init>(r2, r5, r8)
            r6.f144206w = r4
        L_0x0070:
            te3.wp0 r2 = r0.f29246s
            te3.ig0 r2 = r2.f144190d
            rx3.l r4 = new rx3.l
            if (r1 == 0) goto L_0x007a
            int r5 = r1.f134677n
        L_0x007a:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            te3.wp0 r5 = r0.f29246s
            long r5 = r5.f144196j
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r4.<init>(r1, r5)
            java.util.List r1 = sx3.C26236u.m33719b(r4)
            r7.mo71865g(r2, r1, r3)
            r10.mo10092s()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: je1.C9366q0.<init>(int, long, java.lang.Long, java.lang.String, int, pe3.b, te3.hj1, java.lang.String):void");
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C52002xp0) eu32, "resp");
        Log.m105924i("CgiFinderGetTopicFeed", "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
    }

    /* renamed from: s */
    public final void mo10092s() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = this.f29246s;
        C52002xp0 xp02 = new C52002xp0();
        xp02.setBaseResponse(new C49966ja());
        xp02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = xp02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/findergettopiclist";
        bVar.f127069d = 817;
        mo123453j(bVar.mo72403a());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9366q0(C0720c3 c3Var, C49712hj1 hj12) {
        super(hj12, (C9487b) null, 2, (C8480h) null);
        C87412m.m108594g(c3Var, "args");
        C51863wp0 wp02 = new C51863wp0();
        this.f29246s = wp02;
        C46523h2 h2Var = C46523h2.f125330a;
        wp02.f144190d = h2Var.mo71860b(817, hj12);
        C51863wp0 wp03 = this.f29246s;
        wp03.f144191e = c3Var.f1727a;
        wp03.f144192f = c3Var.f1728b;
        wp03.f144196j = c3Var.f1729c;
        wp03.f144202s = c3Var.f1730d;
        wp03.f144207x = c3Var.f1731e;
        h2Var.mo71865g(wp03.f144190d, C26236u.m33719b(new C13604l(Integer.valueOf(hj12 != null ? hj12.f134677n : 0), Long.valueOf(this.f29246s.f144196j))), (C49712hj1) null);
        mo10092s();
    }
}
