package com.tencent.p014mm.plugin.appbrand.appstorage;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ConcurrentHashMap;
import js0.C9514m;

/* renamed from: com.tencent.mm.plugin.appbrand.appstorage.t */
public class C81437t extends C81461w {

    /* renamed from: d */
    public final String f238989d;

    /* renamed from: e */
    public String f238990e;

    /* renamed from: f */
    public final C81423o0 f238991f;

    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.t$a */
    public interface C81438a {
    }

    public C81437t(String str, String str2, String str3, C81438a aVar) {
        this.f238990e = str;
        String i = new C86009m1(str).mo119971i();
        this.f238989d = str3;
        this.f238991f = new C81423o0(i, str2, str3, aVar);
    }

    public boolean accept(String str) {
        return Util.nullAsNil(str).startsWith(this.f238989d);
    }

    public C81410b0 access(String str) {
        return this.f238991f.mo113740a(str) == null ? C81410b0.RET_NOT_EXISTS : C81410b0.OK;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0053 A[LOOP:0: B:17:0x0053->B:20:0x0066, LOOP_START, PHI: r4 
      PHI: (r4v5 op3.j) = (r4v4 op3.j), (r4v11 op3.j) binds: [B:16:0x004c, B:20:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.p014mm.vfs.C86009m1 getPrivateAbsoluteFile(java.lang.String r10) {
        /*
            r9 = this;
            com.tencent.mm.plugin.appbrand.appstorage.o0 r0 = r9.f238991f
            r0.getClass()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            r2 = 0
            if (r1 == 0) goto L_0x000e
            goto L_0x00c8
        L_0x000e:
            java.nio.ByteBuffer r1 = r0.mo113740a(r10)
            java.util.Map<java.lang.String, com.tencent.mm.vfs.m1> r3 = r0.f238963h
            java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3
            boolean r3 = r3.containsKey(r10)
            if (r1 != 0) goto L_0x0035
            if (r3 == 0) goto L_0x0035
            java.util.Map<java.lang.String, com.tencent.mm.vfs.m1> r0 = r0.f238963h
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.lang.Object r10 = r0.remove(r10)
            com.tencent.mm.vfs.m1 r10 = (com.tencent.p014mm.vfs.C86009m1) r10
            if (r10 == 0) goto L_0x00c8
            boolean r0 = r10.mo119967g()
            if (r0 == 0) goto L_0x00c8
            r10.mo119966f()
            goto L_0x00c8
        L_0x0035:
            java.util.Map<java.lang.String, com.tencent.mm.vfs.m1> r4 = r0.f238963h
            java.util.concurrent.ConcurrentHashMap r4 = (java.util.concurrent.ConcurrentHashMap) r4
            java.lang.Object r4 = r4.get(r10)
            com.tencent.mm.vfs.m1 r4 = (com.tencent.p014mm.vfs.C86009m1) r4
            if (r3 == 0) goto L_0x004c
            if (r4 == 0) goto L_0x004c
            boolean r3 = r4.mo119967g()
            if (r3 == 0) goto L_0x004c
            r2 = r4
            goto L_0x00c8
        L_0x004c:
            java.util.Collection<com.tencent.mm.plugin.appbrand.appstorage.o0$b> r3 = r0.f238962g
            java.util.Iterator r3 = r3.iterator()
            r4 = r2
        L_0x0053:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0068
            java.lang.Object r4 = r3.next()
            com.tencent.mm.plugin.appbrand.appstorage.o0$b r4 = (com.tencent.p014mm.plugin.appbrand.appstorage.C81423o0.C81425b) r4
            java.lang.String r5 = "unknown"
            op3.j r4 = r4.mo113742a(r10, r5)
            if (r4 == 0) goto L_0x0053
        L_0x0068:
            r3 = 0
            r5 = 1
            java.lang.String r6 = "MicroMsg.AppBrand.LuggageBlobFileObjectManager"
            if (r4 == 0) goto L_0x00b3
            int r7 = r4.mo182597g()
            r8 = 2
            if (r7 >= r8) goto L_0x0076
            goto L_0x00b3
        L_0x0076:
            java.lang.Object r4 = r4.mo182596a(r5)     // Catch:{ Exception -> 0x00aa }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00aa }
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)     // Catch:{ Exception -> 0x00aa }
            if (r5 == 0) goto L_0x0088
            java.lang.String r10 = "createTempLocalFile appId %s, Null Or Nil fileFullPath"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r10)     // Catch:{ Exception -> 0x00aa }
            goto L_0x00c8
        L_0x0088:
            if (r1 == 0) goto L_0x00a4
            java.lang.String r5 = "get buffer success"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)     // Catch:{ Exception -> 0x00aa }
            byte[] r1 = js0.C88016e.m109544a(r1)     // Catch:{ Exception -> 0x00aa }
            com.tencent.p014mm.vfs.C86013q1.m106437S(r4, r1)     // Catch:{ Exception -> 0x00aa }
            com.tencent.mm.vfs.m1 r1 = new com.tencent.mm.vfs.m1     // Catch:{ Exception -> 0x00aa }
            r1.<init>((java.lang.String) r4)     // Catch:{ Exception -> 0x00aa }
            java.util.Map<java.lang.String, com.tencent.mm.vfs.m1> r0 = r0.f238963h     // Catch:{ Exception -> 0x00aa }
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0     // Catch:{ Exception -> 0x00aa }
            r0.put(r10, r1)     // Catch:{ Exception -> 0x00aa }
            r2 = r1
            goto L_0x00c8
        L_0x00a4:
            java.lang.String r10 = "get buffer fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r10)     // Catch:{ Exception -> 0x00aa }
            goto L_0x00c8
        L_0x00aa:
            r10 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r1 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r10, r1, r0)
            goto L_0x00c8
        L_0x00b3:
            java.lang.Object[] r10 = new java.lang.Object[r5]
            if (r4 != 0) goto L_0x00b9
            r0 = -1
            goto L_0x00bd
        L_0x00b9:
            int r0 = r4.mo182597g()
        L_0x00bd:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10[r3] = r0
            java.lang.String r0 = "createTempLocalFile, no handler return correct info, attach.size = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r0, r10)
        L_0x00c8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appstorage.C81437t.getPrivateAbsoluteFile(java.lang.String):com.tencent.mm.vfs.m1");
    }

    public void initialize() {
        if (!C86013q1.m106461v(this.f238990e)) {
            Log.m105920e("MicroMsg.Luggage.BlobFileSystem", "Initialization Failed");
        }
    }

    public C81410b0 readFile(String str, C9514m<ByteBuffer> mVar) {
        if (!accept(str)) {
            return C81410b0.ERR_NOT_SUPPORTED;
        }
        T a = this.f238991f.mo113740a(str);
        if (a == null) {
            return C81410b0.RET_NOT_EXISTS;
        }
        mVar.f29691a = a;
        return C81410b0.OK;
    }

    public void release() {
        C81423o0 o0Var = this.f238991f;
        ((ConcurrentHashMap) o0Var.f238963h).clear();
        C86013q1.m106445f(o0Var.f238956a);
    }

    public C81410b0 stat(String str, FileStructStat fileStructStat) {
        if (!accept(str)) {
            return C81410b0.ERR_NOT_SUPPORTED;
        }
        ByteBuffer a = this.f238991f.mo113740a(str);
        if (a == null) {
            return C81410b0.RET_NOT_EXISTS;
        }
        if (fileStructStat == null) {
            return C81410b0.ERR_OP_FAIL;
        }
        fileStructStat.st_mode = 33152;
        fileStructStat.st_size = (long) a.limit();
        return C81410b0.OK;
    }

    public C81410b0 readFile(String str, long j, long j2, C9514m<ByteBuffer> mVar) {
        if (!accept(str)) {
            return C81410b0.ERR_NOT_SUPPORTED;
        }
        ByteBuffer a = this.f238991f.mo113740a(str);
        if (a == null) {
            return C81410b0.RET_NOT_EXISTS;
        }
        int limit = a.limit();
        if (j2 > 2147483647L) {
            j2 = ((long) limit) - j;
        }
        C81410b0 a2 = mo113759a(j, j2, (long) limit);
        C81410b0 b0Var = C81410b0.OK;
        if (a2 != b0Var) {
            return a2;
        }
        int i = (int) j2;
        byte[] bArr = new byte[i];
        a.get(bArr, (int) j, i);
        T wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.BIG_ENDIAN);
        mVar.f29691a = wrap;
        return b0Var;
    }
}
