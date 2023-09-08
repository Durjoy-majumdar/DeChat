package kh0;

import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.ByteArrayOutputStream;
import p1081gi.C98124g;

/* renamed from: kh0.c */
public class C88151c implements C98124g.C98125a {

    /* renamed from: d */
    public String f254929d;

    /* renamed from: e */
    public String f254930e;

    /* renamed from: f */
    public String f254931f;

    /* renamed from: g */
    public C88152a f254932g;

    /* renamed from: h */
    public String f254933h = "";

    /* renamed from: i */
    public String f254934i = "";

    /* renamed from: j */
    public boolean f254935j = false;

    /* renamed from: n */
    public String f254936n = "";

    /* renamed from: kh0.c$a */
    public interface C88152a {
    }

    public C88151c(String str, String str2, String str3, C88152a aVar, boolean z, String str4) {
        this.f254929d = str;
        this.f254930e = str2;
        this.f254931f = str3;
        this.f254932g = aVar;
        this.f254933h = "ai_download_" + str.hashCode() + Util.nowMilliSecond();
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(".tmp");
        this.f254934i = sb.toString();
        this.f254935j = z;
        this.f254936n = str4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0062  */
    /* renamed from: g0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo1773g0(java.lang.String r11, int r12, p1081gi.C98120c r13, p1081gi.C98121d r14, boolean r15) {
        /*
            r10 = this;
            java.lang.String r12 = r10.f254933h
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r11, (java.lang.String) r12)
            r12 = 0
            if (r11 != 0) goto L_0x000a
            return r12
        L_0x000a:
            if (r14 == 0) goto L_0x00ba
            int r11 = r14.field_retCode
            java.lang.String r13 = ""
            if (r11 != 0) goto L_0x0036
            java.lang.String r11 = r10.f254934i
            java.lang.String r11 = p823sg.C90193h.m112876d(r11)
            java.lang.String r15 = r10.f254931f
            boolean r15 = r15.equalsIgnoreCase(r11)
            if (r15 == 0) goto L_0x0037
            java.lang.String r15 = r10.f254930e
            boolean r15 = com.tencent.p014mm.vfs.C86013q1.m106450k(r15)
            if (r15 == 0) goto L_0x002d
            java.lang.String r15 = r10.f254930e
            com.tencent.p014mm.vfs.C86013q1.m106447h(r15)
        L_0x002d:
            java.lang.String r15 = r10.f254934i
            java.lang.String r0 = r10.f254930e
            boolean r15 = com.tencent.p014mm.vfs.C86013q1.m106463x(r15, r0)
            goto L_0x0038
        L_0x0036:
            r11 = r13
        L_0x0037:
            r15 = 0
        L_0x0038:
            r0 = 5
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r15)
            r0[r12] = r1
            int r14 = r14.field_retCode
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r1 = 1
            r0[r1] = r14
            java.lang.String r14 = r10.f254930e
            r2 = 2
            r0[r2] = r14
            java.lang.String r14 = r10.f254931f
            r3 = 3
            r0[r3] = r14
            r14 = 4
            r0[r14] = r11
            java.lang.String r11 = "MicroMsg.AiDownloadTask"
            java.lang.String r4 = "ai download task finish flag[%b] ret[%d] path[%s] md5[%s] tmpMd5[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r4, r0)
            kh0.c$a r11 = r10.f254932g
            if (r11 == 0) goto L_0x00ba
            java.lang.String r0 = r10.f254929d
            java.lang.String r4 = r10.f254930e
            boolean r5 = r10.f254935j
            java.lang.String r6 = r10.f254936n
            kh0.b$a r11 = (kh0.C88149b.C88150a) r11
            java.lang.Object[] r7 = new java.lang.Object[r14]
            kh0.b r8 = kh0.C88149b.this
            r8.getClass()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r13)
            int r13 = r8.hashCode()
            r9.append(r13)
            java.lang.String r13 = r9.toString()
            r7[r12] = r13
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r15)
            r7[r1] = r13
            r7[r2] = r0
            r7[r3] = r4
            java.lang.String r13 = "MicroMsg.AiDownloadLogic"
            java.lang.String r0 = "%s download ai model [%b] [%s] [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r0, r7)
            r13 = 1559(0x617, float:2.185E-42)
            if (r15 == 0) goto L_0x00a3
            com.tencent.mm.plugin.report.service.n r14 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r14.mo175911u(r13, r3)
            goto L_0x00a8
        L_0x00a3:
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r0.mo175911u(r13, r14)
        L_0x00a8:
            if (r15 == 0) goto L_0x00ba
            if (r5 == 0) goto L_0x00ba
            zt3.t r13 = zt3.C119157j.f356862d
            kh0.a r14 = new kh0.a
            r14.<init>(r11, r6, r4)
            zt3.j r13 = (zt3.C119157j) r13
            java.lang.String r11 = "Ai_thread"
            r13.mo183876g(r14, r11)
        L_0x00ba:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kh0.C88151c.mo1773g0(java.lang.String, int, gi.c, gi.d, boolean):int");
    }

    /* renamed from: h */
    public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
    }

    /* renamed from: j */
    public byte[] mo1775j(String str, byte[] bArr) {
        return new byte[0];
    }
}
