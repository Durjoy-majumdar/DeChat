package com.tencent.p014mm.plugin.appbrand.jsapi.storage;

import android.net.Uri;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81414g0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C45114t1;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.xweb.file.XVFSFile;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.storage.c0 */
public class C83011c0 {
    /* renamed from: a */
    public static int m101816a(String... strArr) {
        int i = 0;
        for (String str : strArr) {
            if (str != null) {
                i += str.length();
            }
        }
        return i;
    }

    /* renamed from: b */
    public static void m101817b(String str) {
        Uri.Builder builder;
        File cacheDir = MMApplicationContext.getContext().getCacheDir();
        Uri n = cacheDir == null ? null : C116299g2.m163858n(cacheDir.getPath());
        if (n == null) {
            builder = new Uri.Builder().path(str);
        } else {
            builder = n.buildUpon();
            if (!str.isEmpty()) {
                builder.appendPath(str);
            }
        }
        Uri build = builder.build();
        String path = build.getPath();
        boolean z = false;
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!build.getPath().equals(k)) {
                build = builder.path(k).build();
            }
        }
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(build, (C116281f0.C116288h) null);
        if (l.mo177810a() && l.f348991a.mo119933c(l.f348992b)) {
            z = true;
        }
        Log.m105924i("MicroMsg.JsApiStorageHelper", "deleteTmpFile: " + str + XVFSFile.PATH_SEPARATOR + z);
    }

    /* renamed from: c */
    public static String m101818c(String str) {
        C86009m1 m1Var = new C86009m1(MMApplicationContext.getContext().getCacheDir(), str);
        if (!m1Var.mo119967g()) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new C45114t1(m1Var));
            try {
                char[] cArr = new char[1024];
                while (true) {
                    int read = bufferedReader2.read(cArr);
                    if (read != -1) {
                        stringBuffer.append(String.valueOf(cArr, 0, read));
                    } else {
                        try {
                            bufferedReader2.close();
                            return stringBuffer.toString();
                        } catch (Exception e) {
                            throw e;
                        }
                    }
                }
            } catch (IOException e2) {
                e = e2;
                bufferedReader = bufferedReader2;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    bufferedReader2 = bufferedReader;
                }
            } catch (Throwable th4) {
                th = th4;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (Exception e3) {
                        throw e3;
                    }
                }
                throw th;
            }
        } catch (IOException e4) {
            e = e4;
            throw e;
        }
    }

    /* renamed from: d */
    public static String m101819d(C81414g0.C29326a aVar) {
        return aVar == C81414g0.C29326a.NONE ? "ok" : aVar == C81414g0.C29326a.QUOTA_REACHED ? "fail:quota reached" : "fail:internal error set DB data fail";
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002a A[SYNTHETIC, Splitter:B:15:0x002a] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m101820e(java.lang.String r3, java.lang.String... r4) {
        /*
            com.tencent.mm.vfs.m1 r0 = new com.tencent.mm.vfs.m1
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.io.File r1 = r1.getCacheDir()
            r0.<init>((java.io.File) r1, (java.lang.String) r3)
            r3 = 0
            com.tencent.mm.vfs.u1 r1 = new com.tencent.mm.vfs.u1     // Catch:{ all -> 0x0025 }
            r1.<init>((com.tencent.p014mm.vfs.C86009m1) r0)     // Catch:{ all -> 0x0025 }
            int r3 = r4.length     // Catch:{ all -> 0x0023 }
            r0 = 0
        L_0x0015:
            if (r0 >= r3) goto L_0x001f
            r2 = r4[r0]     // Catch:{ all -> 0x0023 }
            r1.write(r2)     // Catch:{ all -> 0x0023 }
            int r0 = r0 + 1
            goto L_0x0015
        L_0x001f:
            r1.close()     // Catch:{ IOException -> 0x0022 }
        L_0x0022:
            return
        L_0x0023:
            r3 = move-exception
            goto L_0x0028
        L_0x0025:
            r4 = move-exception
            r1 = r3
            r3 = r4
        L_0x0028:
            if (r1 == 0) goto L_0x002d
            r1.close()     // Catch:{ IOException -> 0x002d }
        L_0x002d:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.storage.C83011c0.m101820e(java.lang.String, java.lang.String[]):void");
    }
}
