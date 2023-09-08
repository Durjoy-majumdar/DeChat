package sy0;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C87412m;
import p910lj.C76701a;
import te3.C50844pl;

/* renamed from: sy0.d */
public final class C48504d extends C48502a {

    /* renamed from: q */
    public static final boolean f129720q = BuildInfo.DEBUG;

    /* renamed from: h */
    public final int f129721h;

    /* renamed from: i */
    public final String f129722i;

    /* renamed from: j */
    public final String f129723j;

    /* renamed from: n */
    public final String f129724n;

    /* renamed from: o */
    public final String f129725o;

    /* renamed from: p */
    public final C72963f4 f129726p;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C48504d(int r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, long r22) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            java.lang.Class<f62.k0> r8 = f62.C75700k0.class
            java.lang.String r9 = "session_id"
            gy3.C87412m.m108594g(r2, r9)
            java.lang.String r9 = "from_username"
            gy3.C87412m.m108594g(r3, r9)
            java.lang.String r9 = "to_username"
            gy3.C87412m.m108594g(r4, r9)
            java.lang.String r9 = "text"
            gy3.C87412m.m108594g(r5, r9)
            te3.kl r9 = new te3.kl
            r9.<init>()
            te3.ll r10 = new te3.ll
            r10.<init>()
            r10.f137498d = r5
            r9.f136869n = r10
            r9.f136868j = r2
            r9.f136864f = r4
            r9.f136863e = r3
            r10 = 1
            r9.f136862d = r10
            rx3.b0 r11 = rx3.C13598b0.f38549a
            r0.<init>(r1, r9)
            r0.f129721h = r1
            r0.f129722i = r2
            r0.f129723j = r3
            r0.f129724n = r4
            r0.f129725o = r5
            com.tencent.mm.storage.f4 r9 = new com.tencent.mm.storage.f4
            r9.<init>()
            r0.f129726p = r9
            r9.mo100991d(r10)
            r9.mo108749c3(r2)
            long r11 = eb0.C75604z3.m90843o(r18)
            r9.mo108733M2(r11)
            r9.mo108740T2(r10)
            r9.mo108732L2(r5)
            int r11 = eb0.C45628s0.m50810y(r20)
            r9.setType(r11)
            java.lang.Class<f62.x0> r11 = f62.C75710x0.class
            di3.d r11 = di3.C86312j.m106911c(r11)
            f62.x0 r11 = (f62.C75710x0) r11
            java.lang.String r11 = r11.B00(r9)
            r9.mo101012p4(r11)
            r9.mo108753g3(r4)
            r9.mo108736P2(r3)
            r11 = 0
            int r13 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r13 <= 0) goto L_0x009d
            k40.a r8 = f40.C86709a0.m107533q(r8)
            f62.k0 r8 = (f62.C75700k0) r8
            g62.l r8 = r8.mo96095LE()
            com.tencent.mm.storage.g4 r8 = (com.tencent.p014mm.storage.C72972g4) r8
            r8.xy0(r6, r9)
            r9.setMsgId(r6)
            r10 = r6
            goto L_0x00ae
        L_0x009d:
            k40.a r8 = f40.C86709a0.m107533q(r8)
            f62.k0 r8 = (f62.C75700k0) r8
            g62.l r8 = r8.mo96095LE()
            r11 = 0
            com.tencent.mm.storage.g4 r8 = (com.tencent.p014mm.storage.C72972g4) r8
            long r10 = r8.oy0(r9, r11, r10)
        L_0x00ae:
            r9.setMsgId(r10)
            te3.kl r8 = r0.f129712d
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = eb0.C75592q0.m90789s()
            java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r13)
            r12.append(r13)
            r12.append(r2)
            r12.append(r10)
            r13 = 95
            r12.append(r13)
            long r13 = r9.getCreateTime()
            r15 = 1000(0x3e8, float:1.401E-42)
            long r3 = (long) r15
            long r13 = r13 / r3
            r12.append(r13)
            java.lang.String r3 = r12.toString()
            r8.f136865g = r3
            te3.kl r3 = r0.f129712d
            java.lang.String r4 = r9.f230724G
            r3.f136866h = r4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "[CgiBypSendText] bizType="
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " msgId="
            r3.append(r1)
            r3.append(r6)
            java.lang.String r1 = " clientId="
            r3.append(r1)
            r3.append(r10)
            java.lang.String r1 = " sessionId="
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = " toUsername="
            r3.append(r1)
            r1 = r20
            r3.append(r1)
            java.lang.String r1 = " fromUsername="
            r3.append(r1)
            r1 = r19
            r3.append(r1)
            java.lang.String r1 = " text="
            r3.append(r1)
            boolean r1 = f129720q
            if (r1 == 0) goto L_0x0129
            r1 = r5
            goto L_0x012b
        L_0x0129:
            java.lang.String r1 = ""
        L_0x012b:
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r2 = "Byp.CgiBypSendText"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sy0.C48504d.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long):void");
    }

    /* renamed from: j1 */
    public long mo73135j1() {
        return this.f129726p.getMsgId();
    }

    /* renamed from: k1 */
    public void mo73136k1(int i, int i2, String str, C50844pl plVar) {
        C87412m.m108594g(plVar, "resp");
        StringBuilder sb = new StringBuilder();
        sb.append("[onSendFailed] bizType=");
        sb.append(this.f129721h);
        sb.append(" sessionId=");
        sb.append(this.f129722i);
        sb.append(" toUsername=");
        sb.append(this.f129724n);
        sb.append(" fromUsername=");
        sb.append(this.f129723j);
        sb.append(" text=");
        sb.append(f129720q ? this.f129725o : "");
        sb.append(",errCode");
        sb.append(i2);
        Log.m105920e("Byp.CgiBypSendText", sb.toString());
        this.f129726p.mo100991d(5);
        ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).xy0(this.f129726p.getMsgId(), this.f129726p);
    }

    /* renamed from: l1 */
    public void mo73137l1(C50844pl plVar) {
        C87412m.m108594g(plVar, "resp");
        C72963f4 f4Var = this.f129726p;
        f4Var.mo100991d(2);
        f4Var.mo108745Y2(plVar.f139817d);
        boolean z = f129720q;
        if (z && plVar.f139817d == 0) {
            C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) "svr id is zero!", 1).show();
        }
        ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).xy0(this.f129726p.getMsgId(), this.f129726p);
        StringBuilder sb = new StringBuilder();
        sb.append("[onSendSuccessfully] bizType=");
        sb.append(this.f129721h);
        sb.append(" msgSvrId=");
        sb.append(plVar.f139817d);
        sb.append(" text=");
        sb.append(z ? this.f129725o : "");
        sb.append(" sessionId=");
        sb.append(this.f129722i);
        sb.append(" toUsername=");
        sb.append(this.f129724n);
        sb.append(" fromUsername=");
        sb.append(this.f129723j);
        Log.m105924i("Byp.CgiBypSendText", sb.toString());
    }
}
