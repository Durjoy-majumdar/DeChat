package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload;

import android.net.Uri;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMFileSlotManager;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.xweb.file.XVFSFile;
import ea3.C45590f;
import f40.C86709a0;
import f40.C86718e;
import fy3.C32226l;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import rx3.C13598b0;
import sx3.C110818d0;
import te3.C48812b6;
import te3.C50885pw3;
import te3.C51023qw3;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.i */
public final class C40714i {

    /* renamed from: a */
    public static ConcurrentHashMap<String, String> f109359a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public static ConcurrentHashMap<String, String> f109360b = new ConcurrentHashMap<>();

    /* renamed from: c */
    public static ConcurrentHashMap<String, ConcurrentLinkedDeque<String>> f109361c = new ConcurrentHashMap<>();

    /* renamed from: a */
    public static final void m43952a(String str) {
        C87412m.m108594g(str, "domain");
        String g = m43958g(str, false, 2, (Object) null);
        LinkedList linkedList = new LinkedList();
        synchronized (C40709f.class) {
            ConcurrentLinkedDeque<String> concurrentLinkedDeque = f109361c.get(g);
            if (concurrentLinkedDeque != null) {
                for (String str2 : concurrentLinkedDeque) {
                    String remove = f109359a.remove(str2);
                    if (remove != null) {
                        linkedList.add(remove);
                    }
                    String remove2 = f109360b.remove(str2);
                    if (remove2 != null) {
                        linkedList.add(remove2);
                    }
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
        Log.m105924i("AppMsgContextEx", "clearDomain:" + str + '#' + g + ", [" + C110818d0.m150921S(linkedList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null) + ']');
    }

    /* renamed from: b */
    public static final C86009m1 m43953b(C86009m1 m1Var) {
        C87412m.m108594g(m1Var, "<this>");
        if (!m1Var.mo119967g()) {
            String k = m1Var.mo119973k();
            C87412m.m108591d(k);
            Uri n = C116299g2.m163858n(k);
            String path = n.getPath();
            if (path != null) {
                String k2 = C116299g2.m163855k(path, false, false);
                if (!n.getPath().equals(k2)) {
                    n = n.buildUpon().path(k2).build();
                }
            }
            C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
            if (l.mo177810a()) {
                l.f348991a.mo119937g(l.f348992b);
            }
            m1Var.mo119964e();
        }
        return m1Var;
    }

    /* renamed from: c */
    public static final C86009m1 m43954c(MMFileSlotManager mMFileSlotManager, String str) {
        C87412m.m108594g(mMFileSlotManager, "<this>");
        C87412m.m108594g(str, "contentId");
        C86009m1 m1Var = (C86009m1) mMFileSlotManager.findSlot(str);
        if (m1Var != null) {
            return m43957f(m1Var, str);
        }
        return null;
    }

    /* renamed from: d */
    public static final String m43955d(String str) {
        C87412m.m108594g(str, "url");
        return "_content_" + m43968q(str, false, 2, (Object) null);
    }

    /* renamed from: e */
    public static final String m43956e(C48812b6 b6Var) {
        C87412m.m108594g(b6Var, "<this>");
        String str = b6Var.f130962d;
        C87412m.m108593f(str, "this.Url");
        return m43955d(str);
    }

    /* renamed from: f */
    public static final C86009m1 m43957f(C86009m1 m1Var, String str) {
        return new C86009m1(m1Var.mo119976n() + XVFSFile.SEPARATOR_CHAR + str);
    }

    /* renamed from: g */
    public static String m43958g(String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        C87412m.m108594g(str, "domain");
        StringBuilder sb = new StringBuilder();
        sb.append("_domain_");
        sb.append(z ? "fetch_" : "");
        sb.append(str.hashCode());
        return sb.toString();
    }

    /* renamed from: h */
    public static final String m43959h(String str) {
        C87412m.m108594g(str, "url");
        return "_info_" + m43967p(str, false);
    }

    /* renamed from: i */
    public static final String m43960i(String str, boolean z) {
        C87412m.m108594g(str, "url");
        return "_web_" + m43967p(str, z);
    }

    /* renamed from: j */
    public static final String m43961j(String str) {
        C87412m.m108594g(str, "<this>");
        try {
            String host = Uri.parse(C45590f.m50647g(str)).getHost();
            return host == null ? "unknow" : host;
        } catch (Exception unused) {
            return "unknow";
        }
    }

    /* renamed from: k */
    public static final String m43962k(String str) {
        C87412m.m108594g(str, "url");
        return "_info_" + m43968q(str, false, 2, (Object) null);
    }

    /* renamed from: l */
    public static final String m43963l(String str) {
        C87412m.m108594g(str, "url");
        return "_invalid_" + m43968q(str, false, 2, (Object) null);
    }

    /* renamed from: m */
    public static final String m43964m(String str) {
        C87412m.m108594g(str, "url");
        MultiProcessMMKV r = m43969r();
        String decodeString = r.decodeString("short_url_" + str, "");
        C87412m.m108593f(decodeString, "mpDataMmkv().decodeString(\"short_url_$url\", \"\")");
        return decodeString;
    }

    /* renamed from: n */
    public static final int m43965n(int i) {
        byte[] decodeBytes = C40716j0.m43979g().decodeBytes("_msg_scene_strip");
        boolean z = false;
        if (decodeBytes != null) {
            if (!(decodeBytes.length == 0)) {
                z = true;
            }
        }
        if (!z) {
            return 10;
        }
        C51023qw3 qw32 = new C51023qw3();
        qw32.parseFrom(decodeBytes);
        LinkedList<C50885pw3> linkedList = qw32.f140590d;
        C87412m.m108593f(linkedList, "SceneControlSets().apply…(buff) }.SceneControlList");
        for (C50885pw3 pw32 : linkedList) {
            if (pw32.f140033d == i) {
                if (pw32.f140034e <= 0) {
                    Log.m105920e("MicroMsg.AppMsgContextEx", "strip error " + i + XVFSFile.PATH_SEPARATOR_CHAR + pw32.f140034e);
                } else {
                    Log.m105924i("MicroMsg.AppMsgContextEx", "strip " + i + XVFSFile.PATH_SEPARATOR_CHAR + pw32.f140034e);
                    return pw32.f140034e;
                }
            }
        }
        return 10;
    }

    /* renamed from: o */
    public static final String m43966o(String str, String str2) {
        C87412m.m108594g(str, "host");
        C87412m.m108594g(str2, "resUrl");
        return str + "/_web_res_" + m43968q(str2, false, 2, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0043, code lost:
        r2 = m43958g(m43961j(r12), false, 2, (java.lang.Object) null);
        r3 = new java.lang.StringBuilder("matched_");
        r7 = new java.lang.String[]{"__biz", "mid", "idx"};
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005f, code lost:
        if (r8 >= 3) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0061, code lost:
        r9 = r7[r8];
        r10 = ea3.C45590f.m50646f(r12, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0067, code lost:
        if (r10 != null) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0069, code lost:
        r1 = ea3.C45590f.m50643c(r12, true);
        r3 = m43964m(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0075, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r3) != false) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0077, code lost:
        f109360b.put(r12, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007c, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r3 = android.net.Uri.parse(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0081, code lost:
        if (r13 == false) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0083, code lost:
        r4 = r3.getScheme();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0087, code lost:
        if (r4 == null) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008f, code lost:
        if (p225rc.C12969d.m12408b(r4, "http", true) != true) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0091, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0093, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0094, code lost:
        if (r4 == false) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0096, code lost:
        r3 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.WebPrefetcherManifest.f109312a;
        r4 = r3.mo63596h(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009c, code lost:
        if (r4 == null) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009e, code lost:
        r3 = r3.mo63593e(r12, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a2, code lost:
        if (r3 != null) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a4, code lost:
        r3 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a6, code lost:
        r3 = r3.toString();
        gy3.C87412m.m108593f(r3, "{\n                //data… toString()\n            }");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b0, code lost:
        r1 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b5, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b6, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace("hashUrl", r3, "hash url %s", r1);
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x012d, code lost:
        r3.append(r9 + com.tencent.xweb.file.XVFSFile.PATH_SEPARATOR_CHAR + r10 + '-');
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x014b, code lost:
        r12 = r3.toString();
        gy3.C87412m.m108593f(r12, "key.toString()");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x015a, code lost:
        if (f109361c.containsKey(r2) != false) goto L_0x0166;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x015c, code lost:
        f109361c.put(r2, new java.util.concurrent.ConcurrentLinkedDeque());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0166, code lost:
        r13 = f109361c.get(r2);
        gy3.C87412m.m108591d(r13);
        r13.add(r0);
        f109360b.put(r0, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0179, code lost:
        return r12;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m43967p(java.lang.String r12, boolean r13) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            r1 = 45
            r0.append(r1)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            java.lang.Class<com.tencent.mm.plugin.brandservice.ui.timeline.preload.f> r2 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40709f.class
            monitor-enter(r2)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r3 = f109360b     // Catch:{ all -> 0x017a }
            boolean r3 = r3.containsKey(r0)     // Catch:{ all -> 0x017a }
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L_0x0040
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r12 = f109360b     // Catch:{ all -> 0x017a }
            java.lang.Object r12 = sx3.C90364q0.m113145d(r12, r0)     // Catch:{ all -> 0x017a }
            r13 = r12
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x017a }
            boolean r1 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG     // Catch:{ all -> 0x017a }
            if (r1 == 0) goto L_0x003c
            java.lang.String r1 = "AppMsgContextEx"
            java.lang.String r3 = "hashFullUrl cacheKey: %s, value: %s"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x017a }
            r4[r6] = r0     // Catch:{ all -> 0x017a }
            r4[r5] = r13     // Catch:{ all -> 0x017a }
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r1, r3, r4)     // Catch:{ all -> 0x017a }
        L_0x003c:
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x017a }
            monitor-exit(r2)
            return r12
        L_0x0040:
            rx3.b0 r3 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x017a }
            monitor-exit(r2)
            java.lang.String r2 = m43961j(r12)
            r3 = 0
            java.lang.String r2 = m43958g(r2, r6, r4, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "matched_"
            r3.<init>(r4)
            r4 = 3
            java.lang.String r7 = "__biz"
            java.lang.String r8 = "mid"
            java.lang.String r9 = "idx"
            java.lang.String[] r7 = new java.lang.String[]{r7, r8, r9}
            r8 = 0
        L_0x005f:
            if (r8 >= r4) goto L_0x014b
            r9 = r7[r8]
            java.lang.String r10 = ea3.C45590f.m50646f(r12, r9)
            if (r10 != 0) goto L_0x012d
            java.lang.String r1 = ea3.C45590f.m50643c(r12, r5)
            java.lang.String r3 = m43964m(r1)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r4 != 0) goto L_0x007d
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r13 = f109360b
            r13.put(r12, r3)
            return r3
        L_0x007d:
            android.net.Uri r3 = android.net.Uri.parse(r1)     // Catch:{ Exception -> 0x00b5 }
            if (r13 == 0) goto L_0x00a6
            java.lang.String r4 = r3.getScheme()     // Catch:{ Exception -> 0x00b5 }
            if (r4 == 0) goto L_0x0093
            java.lang.String r7 = "http"
            boolean r4 = p225rc.C12969d.m12408b(r4, r7, r5)     // Catch:{ Exception -> 0x00b5 }
            if (r4 != r5) goto L_0x0093
            r4 = 1
            goto L_0x0094
        L_0x0093:
            r4 = 0
        L_0x0094:
            if (r4 == 0) goto L_0x00a6
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.WebPrefetcherManifest r3 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.WebPrefetcherManifest.f109312a     // Catch:{ Exception -> 0x00b5 }
            t73.a r4 = r3.mo63596h(r12)     // Catch:{ Exception -> 0x00b5 }
            if (r4 == 0) goto L_0x00a4
            java.lang.String r3 = r3.mo63593e(r12, r4)     // Catch:{ Exception -> 0x00b5 }
            if (r3 != 0) goto L_0x00b0
        L_0x00a4:
            r3 = r12
            goto L_0x00b0
        L_0x00a6:
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r4 = "{\n                //data… toString()\n            }"
            gy3.C87412m.m108593f(r3, r4)     // Catch:{ Exception -> 0x00b5 }
        L_0x00b0:
            int r1 = r3.hashCode()     // Catch:{ Exception -> 0x00b5 }
            goto L_0x00c2
        L_0x00b5:
            r3 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r5]
            r4[r6] = r1
            java.lang.String r1 = "hashUrl"
            java.lang.String r7 = "hash url %s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r3, r7, r4)
            r1 = 0
        L_0x00c2:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "not_matched_"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            int r1 = r1.hashCode()
            r3 = 16
            z04.C66713a.m78712a(r3)
            java.lang.String r1 = java.lang.Integer.toString(r1, r3)
            java.lang.String r3 = "toString(this, checkRadix(radix))"
            gy3.C87412m.m108593f(r1, r3)
            if (r13 == 0) goto L_0x012c
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.ConcurrentLinkedDeque<java.lang.String>> r13 = f109361c
            boolean r13 = r13.containsKey(r2)
            if (r13 != 0) goto L_0x00fa
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.ConcurrentLinkedDeque<java.lang.String>> r13 = f109361c
            java.util.concurrent.ConcurrentLinkedDeque r3 = new java.util.concurrent.ConcurrentLinkedDeque
            r3.<init>()
            r13.put(r2, r3)
        L_0x00fa:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.ConcurrentLinkedDeque<java.lang.String>> r13 = f109361c
            java.lang.Object r13 = r13.get(r2)
            gy3.C87412m.m108591d(r13)
            java.util.concurrent.ConcurrentLinkedDeque r13 = (java.util.concurrent.ConcurrentLinkedDeque) r13
            r13.add(r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r13 = f109360b
            r13.put(r0, r1)
            java.lang.String r13 = "AppMsgContextEx"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r2 = 35
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = " hash from:%s"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r2[r6] = r12
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r13, r0, r2)
        L_0x012c:
            return r1
        L_0x012d:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r9)
            r9 = 58
            r11.append(r9)
            r11.append(r10)
            r11.append(r1)
            java.lang.String r9 = r11.toString()
            r3.append(r9)
            int r8 = r8 + 1
            goto L_0x005f
        L_0x014b:
            java.lang.String r12 = r3.toString()
            java.lang.String r13 = "key.toString()"
            gy3.C87412m.m108593f(r12, r13)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.ConcurrentLinkedDeque<java.lang.String>> r13 = f109361c
            boolean r13 = r13.containsKey(r2)
            if (r13 != 0) goto L_0x0166
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.ConcurrentLinkedDeque<java.lang.String>> r13 = f109361c
            java.util.concurrent.ConcurrentLinkedDeque r1 = new java.util.concurrent.ConcurrentLinkedDeque
            r1.<init>()
            r13.put(r2, r1)
        L_0x0166:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.ConcurrentLinkedDeque<java.lang.String>> r13 = f109361c
            java.lang.Object r13 = r13.get(r2)
            gy3.C87412m.m108591d(r13)
            java.util.concurrent.ConcurrentLinkedDeque r13 = (java.util.concurrent.ConcurrentLinkedDeque) r13
            r13.add(r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r13 = f109360b
            r13.put(r0, r12)
            return r12
        L_0x017a:
            r12 = move-exception
            monitor-exit(r2)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40714i.m43967p(java.lang.String, boolean):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004a, code lost:
        r12 = m43958g(m43961j(r9), false, 2, (java.lang.Object) null);
        r2 = new java.lang.StringBuilder("matched_");
        r4 = new java.lang.String[]{"__biz", "mid", "idx"};
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0066, code lost:
        if (r5 >= 3) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0068, code lost:
        r6 = r4[r5];
        r7 = ea3.C45590f.m50646f(r9, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006e, code lost:
        if (r7 != null) goto L_0x0138;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0070, code lost:
        r1 = ea3.C45590f.m50643c(r9, false);
        r2 = m43964m(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007c, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r2) != false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007e, code lost:
        f109359a.put(r9, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r3 = android.net.Uri.parse(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008b, code lost:
        if (r10 == false) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008d, code lost:
        r4 = r3.getScheme();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0091, code lost:
        if (r4 == null) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0099, code lost:
        if (p225rc.C12969d.m12408b(r4, "http", true) != true) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009b, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009d, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009e, code lost:
        if (r4 == false) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a0, code lost:
        r3 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.WebPrefetcherManifest.f109312a;
        r4 = r3.mo63596h(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a6, code lost:
        if (r4 == null) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a8, code lost:
        r3 = r3.mo63593e(r9, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ac, code lost:
        if (r3 != null) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ae, code lost:
        r3 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b0, code lost:
        r3 = r3.toString();
        gy3.C87412m.m108593f(r3, "{\n                //data… toString()\n            }");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ba, code lost:
        r1 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bf, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c0, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace("hashUrl", r3, "hash url %s", r1);
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0138, code lost:
        r2.append(r6 + com.tencent.xweb.file.XVFSFile.PATH_SEPARATOR_CHAR + r7 + '-');
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0156, code lost:
        r9 = r2.toString();
        gy3.C87412m.m108593f(r9, "key.toString()");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0165, code lost:
        if (f109361c.containsKey(r12) != false) goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0167, code lost:
        f109361c.put(r12, new java.util.concurrent.ConcurrentLinkedDeque());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0171, code lost:
        r10 = f109361c.get(r12);
        gy3.C87412m.m108591d(r10);
        r10.add(r11);
        f109359a.put(r11, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        return r2;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m43968q(java.lang.String r9, boolean r10, int r11, java.lang.Object r12) {
        /*
            r12 = 2
            r11 = r11 & r12
            r0 = 0
            if (r11 == 0) goto L_0x0006
            r10 = 0
        L_0x0006:
            java.lang.String r11 = "#"
            java.lang.String r9 = z04.C112550d0.m153795e0(r9, r11, r9)
            java.lang.String r11 = "from"
            java.lang.String r1 = "isappinstalled"
            java.lang.String r2 = "pass_ticket"
            java.lang.String r3 = "exportKey"
            java.lang.String[] r11 = new java.lang.String[]{r11, r1, r2, r3}
            java.lang.String r9 = ea3.C45590f.m50645e(r9, r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r9)
            r1 = 45
            r11.append(r1)
            r11.append(r10)
            java.lang.String r11 = r11.toString()
            java.lang.Class<com.tencent.mm.plugin.brandservice.ui.timeline.preload.f> r2 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40709f.class
            monitor-enter(r2)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r3 = f109359a     // Catch:{ all -> 0x0185 }
            boolean r3 = r3.containsKey(r11)     // Catch:{ all -> 0x0185 }
            if (r3 == 0) goto L_0x0047
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r9 = f109359a     // Catch:{ all -> 0x0185 }
            java.lang.Object r9 = sx3.C90364q0.m113145d(r9, r11)     // Catch:{ all -> 0x0185 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0185 }
            monitor-exit(r2)
            goto L_0x0184
        L_0x0047:
            rx3.b0 r3 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0185 }
            monitor-exit(r2)
            java.lang.String r2 = m43961j(r9)
            r3 = 0
            java.lang.String r12 = m43958g(r2, r0, r12, r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "matched_"
            r2.<init>(r3)
            r3 = 3
            java.lang.String r4 = "__biz"
            java.lang.String r5 = "mid"
            java.lang.String r6 = "idx"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6}
            r5 = 0
        L_0x0066:
            if (r5 >= r3) goto L_0x0156
            r6 = r4[r5]
            java.lang.String r7 = ea3.C45590f.m50646f(r9, r6)
            if (r7 != 0) goto L_0x0138
            java.lang.String r1 = ea3.C45590f.m50643c(r9, r0)
            java.lang.String r2 = m43964m(r1)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r3 != 0) goto L_0x0086
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r10 = f109359a
            r10.put(r9, r2)
            r9 = r2
            goto L_0x0184
        L_0x0086:
            r2 = 1
            android.net.Uri r3 = android.net.Uri.parse(r1)     // Catch:{ Exception -> 0x00bf }
            if (r10 == 0) goto L_0x00b0
            java.lang.String r4 = r3.getScheme()     // Catch:{ Exception -> 0x00bf }
            if (r4 == 0) goto L_0x009d
            java.lang.String r5 = "http"
            boolean r4 = p225rc.C12969d.m12408b(r4, r5, r2)     // Catch:{ Exception -> 0x00bf }
            if (r4 != r2) goto L_0x009d
            r4 = 1
            goto L_0x009e
        L_0x009d:
            r4 = 0
        L_0x009e:
            if (r4 == 0) goto L_0x00b0
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.WebPrefetcherManifest r3 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.WebPrefetcherManifest.f109312a     // Catch:{ Exception -> 0x00bf }
            t73.a r4 = r3.mo63596h(r9)     // Catch:{ Exception -> 0x00bf }
            if (r4 == 0) goto L_0x00ae
            java.lang.String r3 = r3.mo63593e(r9, r4)     // Catch:{ Exception -> 0x00bf }
            if (r3 != 0) goto L_0x00ba
        L_0x00ae:
            r3 = r9
            goto L_0x00ba
        L_0x00b0:
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00bf }
            java.lang.String r4 = "{\n                //data… toString()\n            }"
            gy3.C87412m.m108593f(r3, r4)     // Catch:{ Exception -> 0x00bf }
        L_0x00ba:
            int r1 = r3.hashCode()     // Catch:{ Exception -> 0x00bf }
            goto L_0x00cc
        L_0x00bf:
            r3 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r0] = r1
            java.lang.String r1 = "hashUrl"
            java.lang.String r5 = "hash url %s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r3, r5, r4)
            r1 = 0
        L_0x00cc:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "not_matched_"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            int r1 = r1.hashCode()
            r3 = 16
            z04.C66713a.m78712a(r3)
            java.lang.String r1 = java.lang.Integer.toString(r1, r3)
            java.lang.String r3 = "toString(this, checkRadix(radix))"
            gy3.C87412m.m108593f(r1, r3)
            if (r10 == 0) goto L_0x0136
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.ConcurrentLinkedDeque<java.lang.String>> r10 = f109361c
            boolean r10 = r10.containsKey(r12)
            if (r10 != 0) goto L_0x0104
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.ConcurrentLinkedDeque<java.lang.String>> r10 = f109361c
            java.util.concurrent.ConcurrentLinkedDeque r3 = new java.util.concurrent.ConcurrentLinkedDeque
            r3.<init>()
            r10.put(r12, r3)
        L_0x0104:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.ConcurrentLinkedDeque<java.lang.String>> r10 = f109361c
            java.lang.Object r10 = r10.get(r12)
            gy3.C87412m.m108591d(r10)
            java.util.concurrent.ConcurrentLinkedDeque r10 = (java.util.concurrent.ConcurrentLinkedDeque) r10
            r10.add(r11)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r10 = f109359a
            r10.put(r11, r1)
            java.lang.String r10 = "AppMsgContextEx"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r12 = 35
            r11.append(r12)
            r11.append(r1)
            java.lang.String r12 = " hash from:%s"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r0] = r9
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r11, r12)
        L_0x0136:
            r9 = r1
            goto L_0x0184
        L_0x0138:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r6)
            r6 = 58
            r8.append(r6)
            r8.append(r7)
            r8.append(r1)
            java.lang.String r6 = r8.toString()
            r2.append(r6)
            int r5 = r5 + 1
            goto L_0x0066
        L_0x0156:
            java.lang.String r9 = r2.toString()
            java.lang.String r10 = "key.toString()"
            gy3.C87412m.m108593f(r9, r10)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.ConcurrentLinkedDeque<java.lang.String>> r10 = f109361c
            boolean r10 = r10.containsKey(r12)
            if (r10 != 0) goto L_0x0171
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.ConcurrentLinkedDeque<java.lang.String>> r10 = f109361c
            java.util.concurrent.ConcurrentLinkedDeque r0 = new java.util.concurrent.ConcurrentLinkedDeque
            r0.<init>()
            r10.put(r12, r0)
        L_0x0171:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.ConcurrentLinkedDeque<java.lang.String>> r10 = f109361c
            java.lang.Object r10 = r10.get(r12)
            gy3.C87412m.m108591d(r10)
            java.util.concurrent.ConcurrentLinkedDeque r10 = (java.util.concurrent.ConcurrentLinkedDeque) r10
            r10.add(r11)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r10 = f109359a
            r10.put(r11, r9)
        L_0x0184:
            return r9
        L_0x0185:
            r9 = move-exception
            monitor-exit(r2)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40714i.m43968q(java.lang.String, boolean, int, java.lang.Object):java.lang.String");
    }

    /* renamed from: r */
    public static final MultiProcessMMKV m43969r() {
        int g = MMApplicationContext.isMainProcess() ? C86709a0.m107523b().mo121110g() : C86718e.m107549h();
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("mpRelateData_" + g, 2);
        C87412m.m108593f(mmkv, "getMMKV(\"${BizConstants.…sMMKV.MULTI_PROCESS_MODE)");
        return mmkv;
    }

    /* renamed from: s */
    public static final void m43970s(String str, String str2) {
        C87412m.m108594g(str, "shortUrl");
        C87412m.m108594g(str2, "longUrl");
        String c = C45590f.m50643c(str, false);
        String q = m43968q(str2, false, 2, (Object) null);
        m43969r().encode("short_url_" + c, q);
        f109359a.put(c, q);
    }
}
