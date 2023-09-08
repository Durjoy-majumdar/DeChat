package com.tencent.p014mm.plugin.appbrand.appstorage;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.appcache.C81257h1;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkg;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import js0.C9514m;

@Deprecated
/* renamed from: com.tencent.mm.plugin.appbrand.appstorage.w0 */
public class C81462w0 extends C81461w {

    /* renamed from: d */
    public final WxaPkg f239024d;

    /* renamed from: e */
    public Map<String, Long> f239025e = new HashMap();

    public C81462w0(WxaPkg wxaPkg) {
        this.f239024d = wxaPkg;
    }

    public boolean accept(String str) {
        return true;
    }

    public C81410b0 access(String str) {
        C81410b0 b = mo113761b(str);
        C81410b0 b0Var = C81410b0.RET_NOT_EXISTS;
        if (b != b0Var) {
            return b;
        }
        if (str.length() == 0) {
            return b0Var;
        }
        String b2 = C81412d0.m99868b(str, true);
        if (!b2.substring(b2.length() - 1).equals("/")) {
            b2 = b2 + "/";
        }
        for (WxaPkg.Info info : this.f239024d.mo113434g()) {
            if (info.f238570e.startsWith(b2)) {
                return C81410b0.OK;
            }
        }
        return b;
    }

    /* renamed from: b */
    public final C81410b0 mo113761b(String str) {
        InputStream a = this.f239024d.mo63188a(str);
        if (a == null) {
            return C81410b0.RET_NOT_EXISTS;
        }
        Util.qualityClose(a);
        return C81410b0.OK;
    }

    /* renamed from: c */
    public final void mo113762c(String str) {
        if (!str.startsWith("/")) {
            str = "/" + str;
        }
        if (str.contains("\\") || str.trim().isEmpty()) {
            Log.m105921e("MicroMsg.WxaPkgFileSystem", "updateDirAccessTimeRecord: path = [%s] is illegal", str);
            return;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (!str.equals("")) {
                if (str.endsWith("/")) {
                    Log.m105921e("MicroMsg.WxaPkgFileSystem", "updateDirAccessTimeRecord: file = [%s] is illegal", str);
                    break;
                }
                str = str.substring(0, str.lastIndexOf("/"));
                if (str.equals("")) {
                    arrayList.add("/");
                } else {
                    arrayList.add(str + "/");
                }
            } else {
                break;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((HashMap) this.f239025e).put((String) it.next(), Long.valueOf(System.currentTimeMillis() / 1000));
        }
    }

    public C86009m1 getAbsoluteFile(String str, boolean z) {
        if (!z) {
            if (isdir(str) == C81410b0.OK) {
                return null;
            }
        }
        String a = C81257h1.m99577a(this.f239024d, str);
        if (!TextUtils.isEmpty(a)) {
            return new C86009m1(a);
        }
        return null;
    }

    public void initialize() {
        this.f239024d.mo63189b();
    }

    public C81410b0 isdir(String str) {
        return readDir(str, new C9514m());
    }

    public C81410b0 readDir(String str, C9514m<List<C81463z>> mVar) {
        C81410b0 b0Var = C81410b0.OK;
        if (mo113761b(str) == b0Var) {
            return C81410b0.ERR_IS_FILE;
        }
        String b = C81412d0.m99868b(str, true);
        List<WxaPkg.Info> g = this.f239024d.mo113434g();
        String quote = Pattern.quote(b);
        for (WxaPkg.Info next : g) {
            if (next.f238570e.startsWith(b)) {
                String replaceFirst = next.f238570e.replaceFirst(quote, "");
                if (replaceFirst.split("/").length <= 1) {
                    C81463z zVar = new C81463z();
                    zVar.f239026a = replaceFirst;
                    mVar.f29691a = mVar.f29691a == null ? new LinkedList() : (List) mVar.f29691a;
                    ((List) mVar.f29691a).add(zVar);
                }
            }
        }
        return mVar.f29691a == null ? C81410b0.RET_NOT_EXISTS : b0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0053 A[Catch:{ Exception -> 0x0085, all -> 0x0083 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0064 A[Catch:{ Exception -> 0x0085, all -> 0x0083 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0 readFile(java.lang.String r17, long r18, long r20, js0.C9514m<java.nio.ByteBuffer> r22) {
        /*
            r16 = this;
            r8 = r18
            r10 = r16
            com.tencent.mm.plugin.appbrand.appcache.WxaPkg r0 = r10.f239024d
            r11 = r17
            java.io.InputStream r12 = r0.mo63188a(r11)
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
            r16.mo113762c(r17)     // Catch:{ Exception -> 0x0085 }
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r12)
            return r1
        L_0x0083:
            r0 = move-exception
            goto L_0x0096
        L_0x0085:
            r0 = move-exception
            java.lang.String r1 = "MicroMsg.WxaPkgFileSystem"
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appstorage.C81462w0.readFile(java.lang.String, long, long, js0.m):com.tencent.mm.plugin.appbrand.appstorage.b0");
    }

    public void release() {
        this.f239024d.close();
    }

    public C81410b0 stat(String str, FileStructStat fileStructStat) {
        C81410b0 b0Var = C81410b0.OK;
        InputStream a = this.f239024d.mo63188a(str);
        if (a == null) {
            if (!str.endsWith("/")) {
                str = str + "/";
            }
            if (!str.startsWith("/")) {
                str = "/" + str;
            }
            C81410b0 b = mo113761b(str);
            C81410b0 b0Var2 = C81410b0.RET_NOT_EXISTS;
            if (b != b0Var2 || access(str) != b0Var) {
                return b0Var2;
            }
            this.f239024d.mo113437k().fillAnother(fileStructStat);
            fileStructStat.makeItIsDir();
            fileStructStat.st_size = 0;
            Long l = (Long) ((HashMap) this.f239025e).get(str);
            if (l == null) {
                return b0Var;
            }
            fileStructStat.st_atime = l.longValue();
            return b0Var;
        }
        this.f239024d.mo113437k().fillAnother(fileStructStat);
        try {
            fileStructStat.st_size = (long) a.available();
            Util.qualityClose(a);
        } catch (Exception unused) {
            Log.m105921e("MicroMsg.WxaPkgFileSystem", "stat(), %s stream.available fail", str);
        }
        return b0Var;
    }

    public C81410b0 statDir(String str, List<C81432q0> list) {
        if (!str.endsWith("/")) {
            str = str + "/";
        }
        if (!str.startsWith("/")) {
            str = "/" + str;
        }
        if (str.contains("\\") || str.trim().isEmpty()) {
            Log.m105921e("MicroMsg.WxaPkgFileSystem", "statDir: path = [%s] is illegal", str);
            return C81410b0.ERR_PERMISSION_DENIED;
        }
        WxaPkg wxaPkg = this.f239024d;
        wxaPkg.getClass();
        for (String str2 : new LinkedList(wxaPkg.f238565h.keySet())) {
            if (str2.startsWith(str)) {
                C81432q0 q0Var = new C81432q0(str2);
                String name = stat(str2, q0Var).name();
                if (name.equals("OK")) {
                    list.add(q0Var);
                } else {
                    Log.m105929w("MicroMsg.WxaPkgFileSystem", "statDir: stat [%s] fail:[%s]", str2, name);
                }
            }
        }
        return C81410b0.OK;
    }

    public C81410b0 readFile(String str, C9514m<ByteBuffer> mVar) {
        InputStream a = this.f239024d.mo63188a(str);
        if (a == null) {
            return C81410b0.RET_NOT_EXISTS;
        }
        try {
            int available = a.available();
            Util.qualityClose(a);
            return readFile(str, 0, (long) available, mVar);
        } catch (IOException e) {
            Log.printErrStackTrace("MicroMsg.WxaPkgFileSystem", e, XWalkReaderBasePlugin.READ_METHOD_NAME, new Object[0]);
            C81410b0 b0Var = C81410b0.ERR_OP_FAIL;
            Util.qualityClose(a);
            return b0Var;
        } catch (Throwable th) {
            Util.qualityClose(a);
            throw th;
        }
    }
}
