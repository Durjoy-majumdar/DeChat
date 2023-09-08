package bp3;

import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.vfs.VFSStrategy;
import com.tencent.xweb.file.XVFSFile;

/* renamed from: bp3.d */
public final class C28360d {

    /* renamed from: a */
    public static final C28360d f78014a = new C28360d();

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0032, code lost:
        if (r7 == null) goto L_0x0034;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo55933a(java.lang.String r7, long r8) {
        /*
            r6 = this;
            java.lang.String r0 = "chatUsername"
            gy3.C87412m.m108594g(r7, r0)
            boolean r0 = z04.C112551y.m153811k(r7)
            java.lang.String r1 = "error"
            if (r0 == 0) goto L_0x0017
            boolean r7 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r7 == 0) goto L_0x003d
            java.lang.String r7 = "chatUsername is empty, fix it!"
            junit.framework.Assert.fail(r7)
            goto L_0x003d
        L_0x0017:
            java.nio.charset.Charset r0 = z04.C119027c.f356488a
            byte[] r7 = r7.getBytes(r0)
            java.lang.String r0 = "this as java.lang.String).getBytes(charset)"
            gy3.C87412m.m108593f(r7, r0)
            java.lang.String r7 = c24.C79920c.m97090g(r7)
            if (r7 == 0) goto L_0x0034
            boolean r0 = z04.C112551y.m153811k(r7)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0031
            goto L_0x0032
        L_0x0031:
            r7 = 0
        L_0x0032:
            if (r7 != 0) goto L_0x003e
        L_0x0034:
            boolean r7 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r7 == 0) goto L_0x003d
            java.lang.String r7 = "chatUsername gen md5 error, fix it!"
            junit.framework.Assert.fail(r7)
        L_0x003d:
            r7 = r1
        L_0x003e:
            boolean r0 = gy3.C87412m.m108589b(r7, r1)
            r1 = 47
            if (r0 == 0) goto L_0x005a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r6.mo55934b()
            r0.append(r2)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            goto L_0x0086
        L_0x005a:
            int r0 = r7.length()
            r2 = 3
            if (r0 <= r2) goto L_0x006c
            r0 = 0
            java.lang.String r0 = r7.substring(r0, r2)
            java.lang.String r2 = "this as java.lang.String…ing(startIndex, endIndex)"
            gy3.C87412m.m108593f(r0, r2)
            goto L_0x006d
        L_0x006c:
            r0 = r7
        L_0x006d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r6.mo55934b()
            r2.append(r3)
            r2.append(r0)
            r2.append(r1)
            r2.append(r7)
            java.lang.String r7 = r2.toString()
        L_0x0086:
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r7)
            if (r0 != 0) goto L_0x008f
            com.tencent.p014mm.vfs.C86013q1.m106461v(r7)
        L_0x008f:
            r0 = 50000(0xc350, float:7.0065E-41)
            long r2 = (long) r0
            long r2 = r8 / r2
            r4 = 1
            long r2 = r2 + r4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r0.append(r1)
            r0.append(r2)
            r0.append(r1)
            r0.append(r8)
            java.lang.String r7 = r0.toString()
            boolean r8 = com.tencent.p014mm.vfs.C86013q1.m106450k(r7)
            if (r8 != 0) goto L_0x00b9
            com.tencent.p014mm.vfs.C86013q1.m106461v(r7)
        L_0x00b9:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: bp3.C28360d.mo55933a(java.lang.String, long):java.lang.String");
    }

    /* renamed from: b */
    public final String mo55934b() {
        String str = VFSStrategy.m163776d("c2c") + XVFSFile.SEPARATOR_CHAR;
        if (!C86013q1.m106450k(str)) {
            C86013q1.m106461v(str);
        }
        return str;
    }
}
