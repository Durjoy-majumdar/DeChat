package com.tencent.p014mm.plugin.appbrand.appcache;

import com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMSlotKt;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import gy3.C87412m;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import js0.C9514m;
import p823sg.C90193h;
import z04.C112550d0;
import z04.C112551y;
import z04.C119027c;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.m0 */
public final class C81291m0 {

    /* renamed from: a */
    public static final Map<String, Long> f238702a = new HashMap();

    /* renamed from: a */
    public static final String m99665a(C40427l0 l0Var) {
        C87412m.m108594g(l0Var, "<this>");
        String q = C86013q1.m106456q(l0Var.mo63190c());
        if (q != null) {
            String str = "MD5_" + q;
            if (str != null) {
                return str;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("REV_");
        byte[] bytes = (BuildInfo.REV + l0Var.mo63190c()).getBytes(C119027c.f356488a);
        C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
        sb.append(C90193h.m112878f(bytes));
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        cy3.C58003b.m67160a(r2, r3);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m99666b(com.tencent.p014mm.plugin.appbrand.appcache.C40427l0 r2, java.lang.String r3) {
        /*
            java.lang.String r0 = "<this>"
            gy3.C87412m.m108594g(r2, r0)
            java.lang.String r0 = "path"
            gy3.C87412m.m108594g(r3, r0)
            java.io.InputStream r2 = r2.mo63188a(r3)
            java.lang.String r3 = new java.lang.String     // Catch:{ all -> 0x0024 }
            java.lang.String r0 = "it"
            gy3.C87412m.m108593f(r2, r0)     // Catch:{ all -> 0x0024 }
            byte[] r0 = cy3.C86147a.m106661c(r2)     // Catch:{ all -> 0x0024 }
            java.nio.charset.Charset r1 = z04.C119027c.f356488a     // Catch:{ all -> 0x0024 }
            r3.<init>(r0, r1)     // Catch:{ all -> 0x0024 }
            r0 = 0
            cy3.C58003b.m67160a(r2, r0)
            return r3
        L_0x0024:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0026 }
        L_0x0026:
            r0 = move-exception
            cy3.C58003b.m67160a(r2, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appcache.C81291m0.m99666b(com.tencent.mm.plugin.appbrand.appcache.l0, java.lang.String):java.lang.String");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0 m99667c(com.tencent.p014mm.plugin.appbrand.appcache.C40427l0 r16, java.lang.String r17, long r18, long r20, js0.C9514m<java.nio.ByteBuffer> r22) {
        /*
            r0 = r18
            r2 = r22
            java.lang.String r3 = "<this>"
            r4 = r16
            gy3.C87412m.m108594g(r4, r3)
            java.lang.String r3 = "path"
            r5 = r17
            gy3.C87412m.m108594g(r5, r3)
            java.lang.String r3 = "pByteBuffer"
            gy3.C87412m.m108594g(r2, r3)
            java.io.InputStream r3 = r16.mo63188a(r17)
            if (r3 != 0) goto L_0x0022
            com.tencent.mm.plugin.appbrand.appstorage.b0 r0 = com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0.RET_NOT_EXISTS
            return r0
        L_0x0022:
            r6 = 0
            int r7 = r3.available()     // Catch:{ Exception -> 0x0048 }
            long r7 = (long) r7     // Catch:{ Exception -> 0x0048 }
            com.tencent.mm.plugin.appbrand.appstorage.b0 r9 = com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0.OK     // Catch:{ Exception -> 0x0048 }
            r10 = 0
            int r12 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r12 < 0) goto L_0x004a
            r10 = 1
            long r13 = r7 - r10
            int r15 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r15 <= 0) goto L_0x0039
            goto L_0x004a
        L_0x0039:
            int r13 = (r20 > r10 ? 1 : (r20 == r10 ? 0 : -1))
            if (r13 < 0) goto L_0x0045
            long r7 = r7 - r0
            int r10 = (r20 > r7 ? 1 : (r20 == r7 ? 0 : -1))
            if (r10 <= 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r7 = r9
            goto L_0x004c
        L_0x0045:
            com.tencent.mm.plugin.appbrand.appstorage.b0 r7 = com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0.ERR_ILLEGAL_READ_LENGTH     // Catch:{ Exception -> 0x0048 }
            goto L_0x004c
        L_0x0048:
            r0 = move-exception
            goto L_0x00a2
        L_0x004a:
            com.tencent.mm.plugin.appbrand.appstorage.b0 r7 = com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0.ERR_ILLEGAL_READ_POSITION     // Catch:{ Exception -> 0x0048 }
        L_0x004c:
            if (r7 == r9) goto L_0x0052
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r3)
            return r7
        L_0x0052:
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r10 = (r20 > r7 ? 1 : (r20 == r7 ? 0 : -1))
            if (r10 != 0) goto L_0x0062
            int r7 = r3.available()     // Catch:{ Exception -> 0x0048 }
            long r7 = (long) r7     // Catch:{ Exception -> 0x0048 }
            long r7 = r7 - r0
            goto L_0x0064
        L_0x0062:
            r7 = r20
        L_0x0064:
            int r10 = r3.available()     // Catch:{ Exception -> 0x0048 }
            java.nio.ByteBuffer r10 = java.nio.ByteBuffer.allocateDirect(r10)     // Catch:{ Exception -> 0x0048 }
            if (r12 != 0) goto L_0x0079
            int r11 = r3.available()     // Catch:{ Exception -> 0x0048 }
            long r11 = (long) r11     // Catch:{ Exception -> 0x0048 }
            int r13 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r13 != 0) goto L_0x0079
            r11 = 1
            goto L_0x007a
        L_0x0079:
            r11 = 0
        L_0x007a:
            if (r11 == 0) goto L_0x0089
            boolean r11 = r3 instanceof p225rc.C89912a     // Catch:{ Exception -> 0x0048 }
            if (r11 == 0) goto L_0x0089
            r0 = r3
            rc.a r0 = (p225rc.C89912a) r0     // Catch:{ Exception -> 0x0048 }
            java.nio.ByteBuffer r0 = r0.f258369d     // Catch:{ Exception -> 0x0048 }
            r10.put(r0)     // Catch:{ Exception -> 0x0048 }
            goto L_0x0094
        L_0x0089:
            byte[] r0 = js0.C88016e.m109546c(r3, r0, r7)     // Catch:{ Exception -> 0x0048 }
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)     // Catch:{ Exception -> 0x0048 }
            r10.put(r0)     // Catch:{ Exception -> 0x0048 }
        L_0x0094:
            r10.rewind()     // Catch:{ Exception -> 0x0048 }
            r2.f29691a = r10     // Catch:{ Exception -> 0x0048 }
            m99671g(r16, r17)     // Catch:{ Exception -> 0x0048 }
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r3)
            return r9
        L_0x00a0:
            r0 = move-exception
            goto L_0x00b2
        L_0x00a2:
            java.lang.String r1 = "MicroMsg.IWxaPkg.Extend"
            java.lang.String r2 = "readFile"
            java.lang.Object[] r4 = new java.lang.Object[r6]     // Catch:{ all -> 0x00a0 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r2, r4)     // Catch:{ all -> 0x00a0 }
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r3)
            com.tencent.mm.plugin.appbrand.appstorage.b0 r0 = com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0.ERR_OP_FAIL
            return r0
        L_0x00b2:
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appcache.C81291m0.m99667c(com.tencent.mm.plugin.appbrand.appcache.l0, java.lang.String, long, long, js0.m):com.tencent.mm.plugin.appbrand.appstorage.b0");
    }

    /* renamed from: d */
    public static final C81410b0 m99668d(C40427l0 l0Var, String str, C9514m<ByteBuffer> mVar) {
        C87412m.m108594g(l0Var, "<this>");
        C87412m.m108594g(str, "path");
        C87412m.m108594g(mVar, "pByteBuffer");
        InputStream a = l0Var.mo63188a(str);
        if (a == null) {
            return C81410b0.RET_NOT_EXISTS;
        }
        try {
            int available = a.available();
            Util.qualityClose(a);
            return m99667c(l0Var, str, 0, (long) available, mVar);
        } catch (IOException e) {
            Log.printErrStackTrace("MicroMsg.IWxaPkg.Extend", e, XWalkReaderBasePlugin.READ_METHOD_NAME, new Object[0]);
            C81410b0 b0Var = C81410b0.ERR_OP_FAIL;
            Util.qualityClose(a);
            return b0Var;
        } catch (Throwable th) {
            Util.qualityClose(a);
            throw th;
        }
    }

    /* renamed from: e */
    public static final void m99669e(C40427l0 l0Var) {
        C87412m.m108594g(l0Var, "<this>");
        try {
            ((Closeable) l0Var).close();
        } catch (IOException unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        cy3.C58003b.m67160a(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        throw r0;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m99670f(com.tencent.p014mm.plugin.appbrand.appcache.C40427l0 r2, java.lang.String r3) {
        /*
            java.lang.String r0 = "<this>"
            gy3.C87412m.m108594g(r2, r0)
            java.lang.String r0 = "path"
            gy3.C87412m.m108594g(r3, r0)
            java.io.InputStream r2 = r2.mo63188a(r3)
            if (r2 == 0) goto L_0x001d
            java.lang.String r3 = new java.lang.String     // Catch:{ all -> 0x0024 }
            byte[] r0 = cy3.C86147a.m106661c(r2)     // Catch:{ all -> 0x0024 }
            java.nio.charset.Charset r1 = z04.C119027c.f356488a     // Catch:{ all -> 0x0024 }
            r3.<init>(r0, r1)     // Catch:{ all -> 0x0024 }
            goto L_0x001f
        L_0x001d:
            java.lang.String r3 = ""
        L_0x001f:
            r0 = 0
            cy3.C58003b.m67160a(r2, r0)
            return r3
        L_0x0024:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0026 }
        L_0x0026:
            r0 = move-exception
            cy3.C58003b.m67160a(r2, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appcache.C81291m0.m99670f(com.tencent.mm.plugin.appbrand.appcache.l0, java.lang.String):java.lang.String");
    }

    /* renamed from: g */
    public static final void m99671g(C40427l0 l0Var, String str) {
        if (!C112551y.m153819s(str, "/", false)) {
            str = XVFSFile.SEPARATOR_CHAR + str;
        }
        if (!C112550d0.m153803w(str, "\\", false, 2, (Object) null)) {
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = C87412m.m108596i(str.charAt(!z ? i : length), 32) <= 0;
                if (!z) {
                    if (!z2) {
                        z = true;
                    } else {
                        i++;
                    }
                } else if (!z2) {
                    break;
                } else {
                    length--;
                }
            }
            if (!(str.subSequence(i, length + 1).toString().length() == 0)) {
                ArrayList arrayList = new ArrayList();
                while (true) {
                    if (!C87412m.m108589b(str, "")) {
                        if (C112551y.m153808h(str, "/", false, 2, (Object) null)) {
                            Log.m105921e("MicroMsg.IWxaPkg.Extend", "updateDirAccessTimeRecord: file = [%s] is illegal", str);
                            break;
                        }
                        str = str.substring(0, C112550d0.m153772H(str, "/", 0, false, 6, (Object) null));
                        C87412m.m108593f(str, "this as java.lang.String…ing(startIndex, endIndex)");
                        if (C87412m.m108589b(str, "")) {
                            arrayList.add("/");
                        } else {
                            arrayList.add(str + XVFSFile.SEPARATOR_CHAR);
                        }
                    } else {
                        break;
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((HashMap) f238702a).put((String) it.next(), Long.valueOf(MMSlotKt.now() / ((long) 1000)));
                }
                return;
            }
        }
        Log.m105921e("MicroMsg.IWxaPkg.Extend", "updateDirAccessTimeRecord: path = [%s] is illegal", str);
    }
}
