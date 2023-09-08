package com.tencent.p014mm.plugin.appbrand.appcache;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.appcache.C81298o0;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkg;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81412d0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81432q0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81461w;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81463z;
import com.tencent.p014mm.plugin.appbrand.appstorage.FileStructStat;
import com.tencent.p014mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import js0.C9514m;
import junit.framework.Assert;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.w2 */
public class C81383w2 extends C81461w implements IWxaFileSystemWithModularizing {

    /* renamed from: d */
    public final C81301p0 f238887d;

    /* renamed from: e */
    public Map<String, Long> f238888e = new HashMap();

    public C81383w2(C81298o0 o0Var) {
        Assert.assertTrue(o0Var instanceof C81301p0);
        this.f238887d = (C81301p0) o0Var;
    }

    public boolean accept(String str) {
        try {
            this.f238887d.mo113506i(str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public C81410b0 access(String str) {
        C81410b0 b0Var = C81410b0.RET_NOT_EXISTS;
        C81410b0 b0Var2 = C81410b0.OK;
        C81410b0 b0Var3 = !this.f238887d.mo113501d(str) ? b0Var : b0Var2;
        if (b0Var3 == b0Var) {
            if (str.length() == 0) {
                return b0Var;
            }
            String b = C81412d0.m99868b(str, true);
            if (!b.substring(b.length() - 1).equals("/")) {
                b = b + "/";
            }
            List<String> e = this.f238887d.mo113502e();
            if (e == null) {
                e = Collections.emptyList();
            }
            for (String nullAsNil : e) {
                if (Util.nullAsNil(nullAsNil).startsWith(b)) {
                    return b0Var2;
                }
            }
        }
        return b0Var3;
    }

    /* renamed from: b */
    public final void mo113657b(String str) {
        if (!str.startsWith("/")) {
            str = "/" + str;
        }
        if (str.contains("\\") || str.trim().isEmpty()) {
            Log.m105921e("Luggage.WXA.WxaPkgFileSystemWithModularizingNewImpl", "updateDirAccessTimeRecord: path = [%s] is illegal", str);
            return;
        }
        while (!str.equals("")) {
            if (!str.endsWith("/")) {
                str = str.substring(0, str.lastIndexOf("/"));
                if (str.equals("")) {
                    ((HashMap) this.f238888e).put("/", Long.valueOf(System.currentTimeMillis() / 1000));
                } else {
                    ((HashMap) this.f238888e).put(str + "/", Long.valueOf(System.currentTimeMillis() / 1000));
                }
            } else {
                Log.m105921e("Luggage.WXA.WxaPkgFileSystemWithModularizingNewImpl", "updateDirAccessTimeRecord: path = [%s] is illegal", str);
                return;
            }
        }
    }

    public C86009m1 getAbsoluteFile(String str, boolean z) {
        if (!z) {
            if (isdir(str) == C81410b0.OK) {
                return null;
            }
        }
        C81298o0.C81299a openReadPartialInfo = this.f238887d.openReadPartialInfo(str);
        if (openReadPartialInfo == null) {
            return null;
        }
        String a = C81257h1.m99577a(openReadPartialInfo.f238719d, openReadPartialInfo.f238721f);
        if (!TextUtils.isEmpty(a)) {
            return new C86009m1(a);
        }
        return null;
    }

    public void initialize() {
    }

    public C81410b0 isdir(String str) {
        return readDir(str, new C9514m());
    }

    public WxaPkg.Info openReadPartialInfo(String str) {
        C81298o0.C81299a openReadPartialInfo = this.f238887d.openReadPartialInfo(str);
        if (openReadPartialInfo != null) {
            return new WxaPkg.Info(openReadPartialInfo.f238720e, openReadPartialInfo.f238721f, openReadPartialInfo.f238722g, openReadPartialInfo.f238723h);
        }
        return null;
    }

    public C81410b0 readDir(String str, C9514m<List<C81463z>> mVar) {
        C81410b0 b0Var = C81410b0.RET_NOT_EXISTS;
        C81410b0 b0Var2 = C81410b0.OK;
        if ((!this.f238887d.mo113501d(str) ? b0Var : b0Var2) == b0Var2) {
            return C81410b0.ERR_IS_FILE;
        }
        String b = C81412d0.m99868b(str, true);
        List<String> e = this.f238887d.mo113502e();
        if (e == null) {
            return b0Var;
        }
        String quote = Pattern.quote(b);
        for (String next : e) {
            if (Util.nullAsNil(next).startsWith(b)) {
                String replaceFirst = next.replaceFirst(quote, "");
                if (replaceFirst.split("/").length <= 1) {
                    C81463z zVar = new C81463z();
                    zVar.f239026a = replaceFirst;
                    mVar.f29691a = mVar.f29691a == null ? new LinkedList() : (List) mVar.f29691a;
                    ((List) mVar.f29691a).add(zVar);
                }
            }
        }
        return mVar.f29691a == null ? b0Var : b0Var2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0053 A[Catch:{ Exception -> 0x0085, all -> 0x0083 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0064 A[Catch:{ Exception -> 0x0085, all -> 0x0083 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0 readFile(java.lang.String r17, long r18, long r20, js0.C9514m<java.nio.ByteBuffer> r22) {
        /*
            r16 = this;
            r8 = r18
            r10 = r16
            com.tencent.mm.plugin.appbrand.appcache.p0 r0 = r10.f238887d
            r11 = r17
            java.io.InputStream r12 = r0.mo113504g(r11)
            if (r12 != 0) goto L_0x0011
            com.tencent.mm.plugin.appbrand.appstorage.b0 r0 = com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0.RET_NOT_EXISTS
            return r0
        L_0x0011:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r13 = 0
            int r2 = (r20 > r0 ? 1 : (r20 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x0023
            int r0 = r12.available()     // Catch:{ Exception -> 0x0085 }
            long r0 = (long) r0     // Catch:{ Exception -> 0x0085 }
            long r0 = r0 - r8
            r14 = r0
            goto L_0x0025
        L_0x0023:
            r14 = r20
        L_0x0025:
            int r0 = r12.available()     // Catch:{ Exception -> 0x0085 }
            long r6 = (long) r0     // Catch:{ Exception -> 0x0085 }
            r1 = r16
            r2 = r18
            r4 = r14
            com.tencent.mm.plugin.appbrand.appstorage.b0 r0 = r1.mo113759a(r2, r4, r6)     // Catch:{ Exception -> 0x0085 }
            com.tencent.mm.plugin.appbrand.appstorage.b0 r1 = com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0.OK     // Catch:{ Exception -> 0x0085 }
            if (r0 == r1) goto L_0x003b
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r12)
            return r0
        L_0x003b:
            r2 = 0
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x004c
            int r0 = r12.available()     // Catch:{ Exception -> 0x0085 }
            long r2 = (long) r0     // Catch:{ Exception -> 0x0085 }
            int r0 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x004c
            r0 = 1
            goto L_0x004d
        L_0x004c:
            r0 = 0
        L_0x004d:
            if (r0 == 0) goto L_0x0064
            boolean r0 = r12 instanceof p225rc.C89912a     // Catch:{ Exception -> 0x0085 }
            if (r0 == 0) goto L_0x0064
            int r0 = r12.available()     // Catch:{ Exception -> 0x0085 }
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)     // Catch:{ Exception -> 0x0085 }
            r2 = r12
            rc.a r2 = (p225rc.C89912a) r2     // Catch:{ Exception -> 0x0085 }
            java.nio.ByteBuffer r2 = r2.f258369d     // Catch:{ Exception -> 0x0085 }
            r0.put(r2)     // Catch:{ Exception -> 0x0085 }
            goto L_0x0075
        L_0x0064:
            byte[] r0 = js0.C88016e.m109546c(r12, r8, r14)     // Catch:{ Exception -> 0x0085 }
            int r2 = r0.length     // Catch:{ Exception -> 0x0085 }
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r2)     // Catch:{ Exception -> 0x0085 }
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)     // Catch:{ Exception -> 0x0085 }
            r2.put(r0)     // Catch:{ Exception -> 0x0085 }
            r0 = r2
        L_0x0075:
            r0.rewind()     // Catch:{ Exception -> 0x0085 }
            r2 = r22
            r2.f29691a = r0     // Catch:{ Exception -> 0x0085 }
            r16.mo113657b(r17)     // Catch:{ Exception -> 0x0085 }
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r12)
            return r1
        L_0x0083:
            r0 = move-exception
            goto L_0x0096
        L_0x0085:
            r0 = move-exception
            java.lang.String r1 = "Luggage.WXA.WxaPkgFileSystemWithModularizingNewImpl"
            java.lang.String r2 = "readFile"
            java.lang.Object[] r3 = new java.lang.Object[r13]     // Catch:{ all -> 0x0083 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r2, r3)     // Catch:{ all -> 0x0083 }
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r12)
            com.tencent.mm.plugin.appbrand.appstorage.b0 r0 = com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0.ERR_OP_FAIL
            return r0
        L_0x0096:
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appcache.C81383w2.readFile(java.lang.String, long, long, js0.m):com.tencent.mm.plugin.appbrand.appstorage.b0");
    }

    public C81410b0 readZipEntry(String str, C9514m<Map<String, ByteBuffer>> mVar, String str2, long j, long j2) {
        return C81412d0.m99871e(getAbsoluteFile(str, false).mo119971i(), mVar, str2, j, j2);
    }

    public void release() {
        this.f238887d.close();
    }

    public C81410b0 stat(String str, FileStructStat fileStructStat) {
        WxaPkg b;
        C81410b0 b0Var = C81410b0.RET_NOT_EXISTS;
        C81410b0 b0Var2 = C81410b0.OK;
        C81298o0.C81299a openReadPartialInfo = this.f238887d.openReadPartialInfo(str);
        if (openReadPartialInfo == null) {
            if (!str.endsWith("/")) {
                str = str + "/";
            }
            if (!str.startsWith("/")) {
                str = "/" + str;
            }
            if ((!this.f238887d.mo113501d(str) ? b0Var : b0Var2) != b0Var || (b = this.f238887d.mo113498b(str)) == null) {
                return b0Var;
            }
            b.mo113437k().fillAnother(fileStructStat);
            fileStructStat.makeItIsDir();
            fileStructStat.st_size = 0;
            Long l = (Long) ((HashMap) this.f238888e).get(str);
            if (l != null) {
                fileStructStat.st_atime = l.longValue();
            }
            return b0Var2;
        }
        openReadPartialInfo.f238719d.mo113437k().fillAnother(fileStructStat);
        fileStructStat.st_size = (long) openReadPartialInfo.f238723h;
        return b0Var2;
    }

    public C81410b0 statDir(String str, List<C81432q0> list) {
        if (!str.endsWith("/")) {
            str = str + "/";
        }
        if (!str.startsWith("/")) {
            str = "/" + str;
        }
        if (str.contains("\\") || str.trim().isEmpty()) {
            Log.m105921e("Luggage.WXA.WxaPkgFileSystemWithModularizingNewImpl", "statDir: path = [%s] is illegal", str);
            return C81410b0.ERR_PERMISSION_DENIED;
        }
        for (String next : this.f238887d.mo113502e()) {
            if (next != null && next.startsWith(str)) {
                C81432q0 q0Var = new C81432q0(next);
                String name = stat(next, q0Var).name();
                if (name.equals("OK")) {
                    list.add(q0Var);
                } else {
                    Log.m105929w("Luggage.WXA.WxaPkgFileSystemWithModularizingNewImpl", "statDir: stat [%s] fail:[%s]", next, name);
                }
            }
        }
        return C81410b0.OK;
    }

    public C81410b0 readFile(String str, C9514m<ByteBuffer> mVar) {
        InputStream g = this.f238887d.mo113504g(str);
        if (g == null) {
            return C81410b0.RET_NOT_EXISTS;
        }
        try {
            int available = g.available();
            Util.qualityClose(g);
            return readFile(str, 0, (long) available, mVar);
        } catch (IOException e) {
            Log.printErrStackTrace("Luggage.WXA.WxaPkgFileSystemWithModularizingNewImpl", e, XWalkReaderBasePlugin.READ_METHOD_NAME, new Object[0]);
            C81410b0 b0Var = C81410b0.ERR_OP_FAIL;
            Util.qualityClose(g);
            return b0Var;
        } catch (Throwable th) {
            Util.qualityClose(g);
            throw th;
        }
    }
}
