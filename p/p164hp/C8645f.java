package p164hp;

import a14.C53916l;
import gy3.C8477a0;
import gy3.C87412m;
import java.io.ByteArrayOutputStream;
import p1081gi.C98124g;
import rx3.C13604l;

/* renamed from: hp.f */
public final class C8645f implements C98124g.C98125a {

    /* renamed from: d */
    public final /* synthetic */ String f27796d;

    /* renamed from: e */
    public final /* synthetic */ String f27797e;

    /* renamed from: f */
    public final /* synthetic */ C8477a0 f27798f;

    /* renamed from: g */
    public final /* synthetic */ String f27799g;

    /* renamed from: h */
    public final /* synthetic */ C53916l<C13604l<Boolean, String>> f27800h;

    public C8645f(String str, String str2, C8477a0 a0Var, String str3, C53916l<? super C13604l<Boolean, String>> lVar) {
        this.f27796d = str;
        this.f27797e = str2;
        this.f27798f = a0Var;
        this.f27799g = str3;
        this.f27800h = lVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x007f  */
    /* renamed from: g0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo1773g0(java.lang.String r4, int r5, p1081gi.C98120c r6, p1081gi.C98121d r7, boolean r8) {
        /*
            r3 = this;
            java.lang.String r6 = "mediaId"
            gy3.C87412m.m108594g(r4, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "#downloadUrlRes cdncallback, mediaId:"
            r6.append(r8)
            r6.append(r4)
            java.lang.String r4 = ", startRet:"
            r6.append(r4)
            r6.append(r5)
            java.lang.String r4 = ", "
            r6.append(r4)
            if (r7 == 0) goto L_0x0028
            int r4 = r7.field_retCode
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x0029
        L_0x0028:
            r4 = 0
        L_0x0029:
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            java.lang.String r5 = "Download.SuperDownloaderWrapCore"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
            r4 = 0
            if (r7 != 0) goto L_0x0039
            return r4
        L_0x0039:
            int r6 = r7.field_retCode
            r8 = 1
            java.lang.String r0 = ""
            if (r6 != 0) goto L_0x00c3
            java.lang.String r6 = r3.f27796d
            boolean r6 = com.tencent.p014mm.vfs.C86013q1.m106450k(r6)
            if (r6 == 0) goto L_0x005c
            java.lang.String r7 = r3.f27797e
            int r7 = r7.length()
            if (r7 <= 0) goto L_0x0052
            r7 = 1
            goto L_0x0053
        L_0x0052:
            r7 = 0
        L_0x0053:
            if (r7 == 0) goto L_0x005c
            java.lang.String r7 = r3.f27796d
            java.lang.String r7 = com.tencent.p014mm.vfs.C86013q1.m106456q(r7)
            goto L_0x005d
        L_0x005c:
            r7 = r0
        L_0x005d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "#downloadUrlRes success, fileExist:"
            r1.append(r2)
            r1.append(r6)
            java.lang.String r2 = " tempMd5="
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
            gy3.a0 r5 = r3.f27798f
            boolean r1 = r5.f27482d
            if (r1 != 0) goto L_0x00f3
            r5.f27482d = r8
            if (r6 == 0) goto L_0x00ab
            java.lang.String r5 = r3.f27797e
            boolean r5 = gy3.C87412m.m108589b(r7, r5)
            if (r5 == 0) goto L_0x00ab
            java.lang.String r5 = r3.f27796d
            java.lang.String r7 = r3.f27799g
            com.tencent.p014mm.vfs.C86013q1.m106463x(r5, r7)
            a14.l<rx3.l<java.lang.Boolean, java.lang.String>> r5 = r3.f27800h
            kotlin.Result$Companion r7 = kotlin.Result.Companion
            rx3.l r7 = new rx3.l
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r6)
            if (r6 == 0) goto L_0x00a0
            java.lang.String r0 = r3.f27799g
        L_0x00a0:
            r7.<init>(r8, r0)
            java.lang.Object r6 = kotlin.Result.m168114constructorimpl(r7)
            r5.resumeWith(r6)
            goto L_0x00f3
        L_0x00ab:
            java.lang.String r5 = r3.f27796d
            com.tencent.p014mm.vfs.C86013q1.m106447h(r5)
            a14.l<rx3.l<java.lang.Boolean, java.lang.String>> r5 = r3.f27800h
            kotlin.Result$Companion r6 = kotlin.Result.Companion
            rx3.l r6 = new rx3.l
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r6.<init>(r7, r0)
            java.lang.Object r6 = kotlin.Result.m168114constructorimpl(r6)
            r5.resumeWith(r6)
            goto L_0x00f3
        L_0x00c3:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = "#downloadUrlRes failed, "
            r6.append(r1)
            int r7 = r7.field_retCode
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            gy3.a0 r5 = r3.f27798f
            boolean r6 = r5.f27482d
            if (r6 != 0) goto L_0x00f3
            r5.f27482d = r8
            a14.l<rx3.l<java.lang.Boolean, java.lang.String>> r5 = r3.f27800h
            kotlin.Result$Companion r6 = kotlin.Result.Companion
            rx3.l r6 = new rx3.l
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r6.<init>(r7, r0)
            java.lang.Object r6 = kotlin.Result.m168114constructorimpl(r6)
            r5.resumeWith(r6)
        L_0x00f3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p164hp.C8645f.mo1773g0(java.lang.String, int, gi.c, gi.d, boolean):int");
    }

    /* renamed from: h */
    public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
        C87412m.m108594g(str, "mediaId");
        C87412m.m108594g(byteArrayOutputStream, "buff");
    }

    /* renamed from: j */
    public byte[] mo1775j(String str, byte[] bArr) {
        C87412m.m108594g(str, "mediaId");
        C87412m.m108594g(bArr, "inbuf");
        return new byte[0];
    }
}
