package com.tencent.p014mm.plugin.appbrand.jsapi.file;

import com.tencent.p014mm.plugin.appbrand.appstorage.C81411c0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81418k0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import rx3.C13598b0;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.y1 */
public final class C82503y1 implements C81418k0 {

    /* renamed from: a */
    public final String f241571a;

    /* renamed from: b */
    public final String f241572b = "MicroMsg.WxaStorageSpaceStatisticsService";

    /* renamed from: c */
    public final Map<String, Long> f241573c = new LinkedHashMap();

    /* renamed from: d */
    public final Map<String, List<C81411c0>> f241574d = new LinkedHashMap();

    /* renamed from: e */
    public final Object f241575e = new Object();

    /* renamed from: f */
    public boolean f241576f;

    public C82503y1(String str) {
        C87412m.m108594g(str, "appid");
        this.f241571a = str;
    }

    /* renamed from: a */
    public void mo113735a(String str, long j, String str2) {
        C87412m.m108594g(str, "dirPath");
        C87412m.m108594g(str2, "op");
        mo113737c(mo114829e(str), str, j, str2);
    }

    /* renamed from: b */
    public long mo113736b(String str, String str2) {
        C87412m.m108594g(str, "dirPath");
        C87412m.m108594g(str2, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        synchronized (this.f241575e) {
            if (!mo114835k(str, str2)) {
                return -1;
            }
            long h = mo114832h(str, str2);
            return h;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0064, code lost:
        if (r12.longValue() != r15) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x012e, code lost:
        r3 = java.lang.System.currentTimeMillis() - r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0136, code lost:
        if (com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED != false) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x013a, code lost:
        if (com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x013c, code lost:
        r0 = r1.f241572b;
        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, "handleFileSizeChangeEvent cost[" + r3 + "] filePath[" + r2 + ']');
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0161, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo113737c(java.lang.String r19, java.lang.String r20, long r21, java.lang.String r23) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            r2 = r20
            r3 = r21
            r5 = r23
            java.lang.String r6 = "monitorDirPath"
            gy3.C87412m.m108594g(r0, r6)
            java.lang.String r6 = "filePath"
            gy3.C87412m.m108594g(r2, r6)
            java.lang.String r6 = "op"
            gy3.C87412m.m108594g(r5, r6)
            r6 = 0
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0021
            return
        L_0x0021:
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.Object r8 = r1.f241575e
            monitor-enter(r8)
            int r9 = r19.length()     // Catch:{ all -> 0x0162 }
            if (r9 != 0) goto L_0x0030
            r9 = 1
            goto L_0x0031
        L_0x0030:
            r9 = 0
        L_0x0031:
            if (r9 != 0) goto L_0x0160
            boolean r9 = r18.mo114835k(r19, r20)     // Catch:{ all -> 0x0162 }
            if (r9 != 0) goto L_0x003b
            goto L_0x0160
        L_0x003b:
            com.tencent.mm.plugin.appbrand.appstorage.c0 r9 = r18.mo114831g(r19, r20)     // Catch:{ all -> 0x0162 }
            java.lang.String r9 = r1.mo114833i(r0, r9)     // Catch:{ all -> 0x0162 }
            long r10 = r18.mo114832h(r19, r20)     // Catch:{ all -> 0x0162 }
            long r15 = r10 + r3
            com.tencent.mm.plugin.appbrand.appstorage.c0 r10 = r18.mo114831g(r19, r20)     // Catch:{ all -> 0x0162 }
            java.lang.String r11 = r1.mo114833i(r0, r10)     // Catch:{ all -> 0x0162 }
            java.util.Map<java.lang.String, java.lang.Long> r12 = r1.f241573c     // Catch:{ all -> 0x0162 }
            java.util.LinkedHashMap r12 = (java.util.LinkedHashMap) r12     // Catch:{ all -> 0x0162 }
            java.lang.Object r12 = r12.get(r11)     // Catch:{ all -> 0x0162 }
            java.lang.Long r12 = (java.lang.Long) r12     // Catch:{ all -> 0x0162 }
            if (r12 != 0) goto L_0x005e
            goto L_0x0066
        L_0x005e:
            long r12 = r12.longValue()     // Catch:{ all -> 0x0162 }
            int r14 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r14 == 0) goto L_0x007e
        L_0x0066:
            java.lang.Long r12 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x0162 }
            java.util.Map<java.lang.String, java.lang.Long> r13 = r1.f241573c     // Catch:{ all -> 0x0162 }
            r13.put(r11, r12)     // Catch:{ all -> 0x0162 }
            if (r10 == 0) goto L_0x007e
            com.tencent.mm.plugin.appbrand.appstorage.AppBrandStorageQuotaManager r12 = com.tencent.p014mm.plugin.appbrand.appstorage.AppBrandStorageQuotaManager.f238916a     // Catch:{ all -> 0x0162 }
            java.lang.String r13 = r1.f241571a     // Catch:{ all -> 0x0162 }
            java.lang.String r14 = r10.key()     // Catch:{ all -> 0x0162 }
            r17 = 0
            r12.mo113690g(r13, r14, r15, r17)     // Catch:{ all -> 0x0162 }
        L_0x007e:
            boolean r10 = r1.f241576f     // Catch:{ all -> 0x0162 }
            if (r10 == 0) goto L_0x0129
            com.tencent.mm.vfs.m1 r10 = new com.tencent.mm.vfs.m1     // Catch:{ all -> 0x0162 }
            r10.<init>((java.lang.String) r0)     // Catch:{ all -> 0x0162 }
            com.tencent.mm.plugin.appbrand.appstorage.c0 r11 = r18.mo114831g(r19, r20)     // Catch:{ all -> 0x0162 }
            long r10 = r1.mo114830f(r10, r11)     // Catch:{ all -> 0x0162 }
            long r12 = r18.mo114832h(r19, r20)     // Catch:{ all -> 0x0162 }
            int r14 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r14 != 0) goto L_0x00e0
            java.lang.String r14 = r1.f241572b     // Catch:{ all -> 0x0162 }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x0162 }
            r15.<init>()     // Catch:{ all -> 0x0162 }
            r16 = r6
            java.lang.String r6 = "[handleFileChanged] \nkey:"
            r15.append(r6)     // Catch:{ all -> 0x0162 }
            r15.append(r9)     // Catch:{ all -> 0x0162 }
            java.lang.String r6 = " \nsizeDiff:"
            r15.append(r6)     // Catch:{ all -> 0x0162 }
            r15.append(r3)     // Catch:{ all -> 0x0162 }
            java.lang.String r3 = "  newDirSize:"
            r15.append(r3)     // Catch:{ all -> 0x0162 }
            r15.append(r12)     // Catch:{ all -> 0x0162 }
            java.lang.String r3 = "  dirSizeByRecursively:"
            r15.append(r3)     // Catch:{ all -> 0x0162 }
            r15.append(r10)     // Catch:{ all -> 0x0162 }
            java.lang.String r3 = " checkOk:TRUE \ndirPath:"
            r15.append(r3)     // Catch:{ all -> 0x0162 }
            r15.append(r0)     // Catch:{ all -> 0x0162 }
            java.lang.String r0 = "  \nfilePath:"
            r15.append(r0)     // Catch:{ all -> 0x0162 }
            r15.append(r2)     // Catch:{ all -> 0x0162 }
            java.lang.String r0 = " \nop:"
            r15.append(r0)     // Catch:{ all -> 0x0162 }
            r15.append(r5)     // Catch:{ all -> 0x0162 }
            java.lang.String r0 = r15.toString()     // Catch:{ all -> 0x0162 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)     // Catch:{ all -> 0x0162 }
            goto L_0x012b
        L_0x00e0:
            r16 = r6
            java.lang.String r6 = r1.f241572b     // Catch:{ all -> 0x0162 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0162 }
            r7.<init>()     // Catch:{ all -> 0x0162 }
            java.lang.String r14 = "[handleFileChanged] \nkey:"
            r7.append(r14)     // Catch:{ all -> 0x0162 }
            r7.append(r9)     // Catch:{ all -> 0x0162 }
            java.lang.String r9 = " \nsizeDiff:"
            r7.append(r9)     // Catch:{ all -> 0x0162 }
            r7.append(r3)     // Catch:{ all -> 0x0162 }
            java.lang.String r3 = "  newDirSize:"
            r7.append(r3)     // Catch:{ all -> 0x0162 }
            r7.append(r12)     // Catch:{ all -> 0x0162 }
            java.lang.String r3 = "  dirSizeByRecursively:"
            r7.append(r3)     // Catch:{ all -> 0x0162 }
            r7.append(r10)     // Catch:{ all -> 0x0162 }
            java.lang.String r3 = " checkOk:FALSE \ndirPath:"
            r7.append(r3)     // Catch:{ all -> 0x0162 }
            r7.append(r0)     // Catch:{ all -> 0x0162 }
            java.lang.String r0 = "  \nfilePath:"
            r7.append(r0)     // Catch:{ all -> 0x0162 }
            r7.append(r2)     // Catch:{ all -> 0x0162 }
            java.lang.String r0 = " \nop:"
            r7.append(r0)     // Catch:{ all -> 0x0162 }
            r7.append(r5)     // Catch:{ all -> 0x0162 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x0162 }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r0)     // Catch:{ all -> 0x0162 }
            goto L_0x012b
        L_0x0129:
            r16 = r6
        L_0x012b:
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0162 }
            monitor-exit(r8)
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r16
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r0 != 0) goto L_0x013c
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r0 == 0) goto L_0x015f
        L_0x013c:
            java.lang.String r0 = r1.f241572b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "handleFileSizeChangeEvent cost["
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = "] filePath["
            r5.append(r3)
            r5.append(r2)
            r2 = 93
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
        L_0x015f:
            return
        L_0x0160:
            monitor-exit(r8)
            return
        L_0x0162:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.file.C82503y1.mo113737c(java.lang.String, java.lang.String, long, java.lang.String):void");
    }

    /* renamed from: d */
    public void mo113738d(String str, long j, String str2) {
        C87412m.m108594g(str, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        C87412m.m108594g(str2, "op");
        mo113737c(mo114829e(str), str, j, str2);
    }

    /* renamed from: e */
    public final String mo114829e(String str) {
        Object obj;
        Iterator it = ((LinkedHashMap) this.f241574d).keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C112551y.m153819s(str, (String) obj, false)) {
                break;
            }
        }
        String str2 = (String) obj;
        String str3 = "";
        if (str2 == null) {
            str2 = str3;
        }
        if (mo114835k(str2, str)) {
            str3 = str2;
        }
        if (this.f241576f) {
            String str4 = this.f241572b;
            Log.m105924i(str4, "[findMatchMonitorDir] dirPath:" + str3 + "  filePath:" + str + ' ');
        }
        return str3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0037  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo114830f(com.tencent.p014mm.vfs.C86009m1 r11, com.tencent.p014mm.plugin.appbrand.appstorage.C81411c0 r12) {
        /*
            r10 = this;
            if (r11 != 0) goto L_0x0005
            r11 = -1
            return r11
        L_0x0005:
            com.tencent.mm.vfs.m1[] r11 = r11.mo119984u()
            r0 = 0
            if (r11 != 0) goto L_0x000e
            return r0
        L_0x000e:
            int r2 = r11.length
            r3 = 0
            r5 = r0
            r4 = 0
        L_0x0012:
            if (r4 >= r2) goto L_0x0043
            r7 = r11[r4]
            boolean r8 = r7.mo119978p()
            if (r8 == 0) goto L_0x003b
            if (r12 == 0) goto L_0x002f
            java.lang.String r8 = r7.mo119971i()
            java.lang.String r9 = "file.absolutePath"
            gy3.C87412m.m108593f(r8, r9)
            boolean r8 = r12.accept(r8)
            if (r8 != 0) goto L_0x002f
            r8 = 1
            goto L_0x0030
        L_0x002f:
            r8 = 0
        L_0x0030:
            if (r8 != 0) goto L_0x0037
            long r7 = r7.mo119980r()
            goto L_0x0038
        L_0x0037:
            r7 = r0
        L_0x0038:
            rx3.b0 r9 = rx3.C13598b0.f38549a
            goto L_0x003f
        L_0x003b:
            long r7 = r10.mo114830f(r7, r12)
        L_0x003f:
            long r5 = r5 + r7
            int r4 = r4 + 1
            goto L_0x0012
        L_0x0043:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.file.C82503y1.mo114830f(com.tencent.mm.vfs.m1, com.tencent.mm.plugin.appbrand.appstorage.c0):long");
    }

    /* renamed from: g */
    public final C81411c0 mo114831g(String str, String str2) {
        List<C81411c0> list = (List) ((LinkedHashMap) this.f241574d).get(str);
        if (list == null) {
            return null;
        }
        for (C81411c0 c0Var : list) {
            if (c0Var.accept(str2)) {
                return c0Var;
            }
        }
        return null;
    }

    /* renamed from: h */
    public final long mo114832h(String str, String str2) {
        String i = mo114833i(str, mo114831g(str, str2));
        Long l = (Long) ((LinkedHashMap) this.f241573c).get(i);
        long longValue = l != null ? l.longValue() : -1;
        if (longValue != Long.MIN_VALUE) {
            return longValue;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long f = mo114830f(new C86009m1(str), mo114831g(str, str2));
        this.f241573c.put(i, Long.valueOf(f));
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        String str3 = this.f241572b;
        Log.m105924i(str3, "[getSpaceSize] invalid storage space, get size recursively.  size[" + f + "]  cost[" + currentTimeMillis2 + ']');
        return f;
    }

    /* renamed from: i */
    public final String mo114833i(String str, C81411c0 c0Var) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if ((c0Var != null ? c0Var.key() : null) == null) {
            str2 = "";
        } else {
            str2 = '#' + c0Var.key();
        }
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: j */
    public boolean mo114834j(String str, C81411c0 c0Var, long j) {
        C87412m.m108594g(str, "dirPath");
        C87412m.m108594g(c0Var, "filePattern");
        synchronized (this.f241575e) {
            String i = mo114833i(str, c0Var);
            if (this.f241573c.containsKey(i)) {
                return false;
            }
            this.f241573c.put(i, Long.valueOf(j));
            if (((List) ((LinkedHashMap) this.f241574d).get(str)) == null) {
                this.f241574d.put(str, new ArrayList());
                C13598b0 b0Var = C13598b0.f38549a;
            }
            List list = (List) ((LinkedHashMap) this.f241574d).get(str);
            if (list != null) {
                list.add(c0Var);
            }
            String str2 = this.f241572b;
            Log.m105924i(str2, "register id=" + i + " currentSize=" + j);
            return true;
        }
    }

    /* renamed from: k */
    public final boolean mo114835k(String str, String str2) {
        if (!this.f241574d.containsKey(str)) {
            return false;
        }
        List list = (List) ((LinkedHashMap) this.f241574d).get(str);
        if ((list != null ? list.size() : 0) == 0) {
            return true;
        }
        List<C81411c0> list2 = (List) ((LinkedHashMap) this.f241574d).get(str);
        if (list2 != null) {
            for (C81411c0 accept : list2) {
                if (accept.accept(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
