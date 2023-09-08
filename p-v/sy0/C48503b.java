package sy0;

import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import te3.C50844pl;

/* renamed from: sy0.b */
public final class C48503b extends C48502a {

    /* renamed from: h */
    public final int f129715h;

    /* renamed from: i */
    public final String f129716i;

    /* renamed from: j */
    public final String f129717j;

    /* renamed from: n */
    public final String f129718n;

    /* renamed from: o */
    public final IEmojiInfo f129719o;

    static {
        boolean z = BuildInfo.DEBUG;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C48503b(int r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, com.tencent.p014mm.api.IEmojiInfo r12, long r13) {
        /*
            r7 = this;
            java.lang.Class<f62.k0> r0 = f62.C75700k0.class
            java.lang.String r1 = "session_id"
            gy3.C87412m.m108594g(r9, r1)
            java.lang.String r1 = "from_username"
            gy3.C87412m.m108594g(r10, r1)
            java.lang.String r1 = "to_username"
            gy3.C87412m.m108594g(r11, r1)
            java.lang.String r1 = "emoji"
            gy3.C87412m.m108594g(r12, r1)
            te3.kl r1 = new te3.kl
            r1.<init>()
            te3.il r2 = new te3.il
            r2.<init>()
            r1.f136873r = r2
            r1.f136868j = r9
            r1.f136864f = r11
            r1.f136863e = r10
            r2 = 47
            r1.f136862d = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = eb0.C75592q0.m90789s()
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r3)
            r2.append(r3)
            r2.append(r9)
            r2.append(r13)
            r3 = 95
            r2.append(r3)
            long r3 = eb0.C31543z5.m39453c()
            r5 = 1000(0x3e8, float:1.401E-42)
            long r5 = (long) r5
            long r3 = r3 / r5
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.f136865g = r2
            java.lang.String r2 = eb0.C75569c4.m90679l()
            r1.f136866h = r2
            rx3.b0 r2 = rx3.C13598b0.f38549a
            r7.<init>(r8, r1)
            r7.f129715h = r8
            r7.f129716i = r9
            r7.f129717j = r10
            r7.f129718n = r11
            r7.f129719o = r12
            te3.kl r8 = r7.f129712d
            te3.il r8 = r8.f136873r
            java.lang.String r9 = r12.getMd5()
            r8.f135440d = r9
            int r9 = r12.getType()
            r8.f135443g = r9
            int r9 = r12.getSize()
            r8.f135441e = r9
            java.lang.String r9 = r12.getContent()
            r8.f135444h = r9
            r9 = 0
            r8.f135446j = r9
            k40.a r8 = f40.C86709a0.m107533q(r0)
            f62.k0 r8 = (f62.C75700k0) r8
            g62.l r8 = r8.mo96095LE()
            com.tencent.mm.storage.g4 r8 = (com.tencent.p014mm.storage.C72972g4) r8
            com.tencent.mm.storage.f4 r8 = r8.b00(r13)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r10)
            java.lang.String r10 = r8.getContent()
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.mo108732L2(r9)
            k40.a r9 = f40.C86709a0.m107533q(r0)
            f62.k0 r9 = (f62.C75700k0) r9
            g62.l r9 = r9.mo96095LE()
            com.tencent.mm.storage.g4 r9 = (com.tencent.p014mm.storage.C72972g4) r9
            r9.xy0(r13, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sy0.C48503b.<init>(int, java.lang.String, java.lang.String, java.lang.String, com.tencent.mm.api.IEmojiInfo, long):void");
    }

    /* renamed from: k1 */
    public void mo73136k1(int i, int i2, String str, C50844pl plVar) {
        C87412m.m108594g(plVar, "resp");
        Log.m105920e("Byp.CgiBypSendEmoij", "[onSendFailed] bizType=" + this.f129715h + " sessionId=" + this.f129716i + " toUsername=" + this.f129718n + " fromUsername=" + this.f129717j + " errCode:" + i2 + " errMsg:" + str);
    }

    /* renamed from: l1 */
    public void mo73137l1(C50844pl plVar) {
        C87412m.m108594g(plVar, "resp");
        Log.m105924i("Byp.CgiBypSendEmoij", "[onSendSuccessfully] bizType=" + this.f129715h + " msgSvrId=" + plVar.f139817d + "  sessionId=" + this.f129716i + " toUsername=" + this.f129718n + " fromUsername=" + this.f129717j);
    }
}
