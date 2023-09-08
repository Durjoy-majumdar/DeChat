package h52;

import a70.C112760b;
import android.webkit.WebSettings;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import d42.C86176d0;
import d42.C86184l;
import d42.C86185m;
import g52.C87159a;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONObject;

/* renamed from: h52.k */
public class C87449k implements C86184l {

    /* renamed from: a */
    public int f253402a = 10;

    /* renamed from: b */
    public int f253403b = 2048;

    /* renamed from: c */
    public String f253404c = (C112760b.m154247s() + "magicbrush/");

    /* renamed from: d */
    public final String f253405d;

    /* renamed from: e */
    public final ArrayList<String> f253406e = new ArrayList<>();

    /* renamed from: f */
    public final Map<String, ConcurrentLinkedQueue<Runnable>> f253407f;

    /* renamed from: g */
    public final ArrayList<C87443g> f253408g = new ArrayList<>();

    /* renamed from: h52.k$a */
    public class C87450a implements C87439d {

        /* renamed from: a */
        public final /* synthetic */ String f253409a;

        /* renamed from: b */
        public final /* synthetic */ C86176d0 f253410b;

        public C87450a(String str, C86176d0 d0Var) {
            this.f253409a = str;
            this.f253410b = d0Var;
        }

        /* renamed from: b */
        public void mo121896b(String str, String str2, String str3, int i, long j, Map map) {
            C87449k.this.mo121908e(this.f253409a);
            HashMap hashMap = new HashMap();
            String str4 = str2;
            hashMap.put("mimeType", str2);
            hashMap.put(FFmpegMetadataRetriever.METADATA_KEY_FILENAME, str);
            hashMap.put("statusCode", Integer.valueOf(i));
            hashMap.put("dataLength", Long.valueOf(j));
            this.f253410b.mo120573c(0, "ok", (Object) null, (JSONObject) null, hashMap, map, (Map) null);
            Log.m105925i("MicroMsg.MagicBrushNetworkDownload", "download success! filename %s, url %s", str, str3);
        }

        /* renamed from: c */
        public void mo121897c(String str, String str2) {
            Log.m105925i("MicroMsg.MagicBrushNetworkDownload", "download start! filename %s, url %s", str, str2);
        }

        /* renamed from: d */
        public void mo121898d(String str, String str2, String str3, int i) {
            Log.m105921e("MicroMsg.MagicBrushNetworkDownload", "download error! errorMessage:%s, filename %s, url %s", str3, str, str2);
            C87449k.this.mo121908e(this.f253409a);
            this.f253410b.mo120572b(i, str3, (String) null, (Map) null);
        }

        /* renamed from: e */
        public void mo121899e(String str) {
            C87449k.this.f253406e.remove(str);
        }

        /* renamed from: f */
        public void mo121900f(String str, String str2, int i, long j, long j2) {
            this.f253410b.mo120574d(i, j, j2);
        }

        /* renamed from: g */
        public void mo121901g(JSONObject jSONObject, int i) {
            this.f253410b.mo120571a(jSONObject, i);
        }
    }

    public C87449k() {
        String str = C87159a.f252769a.get();
        boolean z = true;
        if (!(str == null || str.length() == 0)) {
            Log.m105924i("MicroMsg.MagicBrushNetworkConfigUserAgentHelper", "getSystemUserAgent by memory cache");
            C87412m.m108593f(str, "this");
        } else {
            str = MultiProcessMMKV.getMMKV("MagicBrushNetworkConfigUserAgentHelper", 2).decodeString("UserAgent");
            if (!(str == null || str.length() == 0)) {
                z = false;
            }
            if (z) {
                try {
                    str = WebSettings.getDefaultUserAgent(MMApplicationContext.getContext());
                    C87412m.m108593f(str, "{\n            WebSetting…t.getContext())\n        }");
                } catch (Throwable unused) {
                    str = System.getProperty("http.agent");
                    if (str == null) {
                        str = "";
                    }
                }
            }
            C87159a.f252769a.set(str);
        }
        this.f253405d = str;
        this.f253407f = new Hashtable(10);
    }

    /* renamed from: a */
    public C86185m mo120589a(String str) {
        if (str == null) {
            return null;
        }
        synchronized (this.f253408g) {
            Iterator<C87443g> it = this.f253408g.iterator();
            while (it.hasNext()) {
                C87443g next = it.next();
                if (str.equals(next.f253381t)) {
                    return next;
                }
            }
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r0 = r2.optJSONObject("header");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0060, code lost:
        if (r0 == null) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0062, code lost:
        r5 = r0.keys();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006a, code lost:
        if (r5.hasNext() == false) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006c, code lost:
        r7 = r5.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0072, code lost:
        if (r7 != null) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0075, code lost:
        r13.put(r7.toLowerCase(), r0.getString(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0081, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0082, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace("MicroMsg.MagicBrushNetworkUtil", r0, "Exception: get header error", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0055, code lost:
        r13 = new java.util.HashMap();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo120590b(e42.C7597n r20, java.lang.String r21, e42.C7596h r22, int r23, java.lang.String r24, java.lang.String r25, d42.C86176d0 r26) {
        /*
            r19 = this;
            r1 = r19
            r2 = r22
            r3 = r24
            r4 = r26
            java.lang.String r0 = "url"
            java.lang.String r15 = r2.optString(r0)
            java.lang.String r0 = "MicroMsg.MagicBrushNetworkDownload"
            java.lang.String r5 = "download taskId:%s url:%s"
            r6 = 2
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r8 = 0
            r7[r8] = r3
            r14 = 1
            r7[r14] = r15
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r5, r7)
            java.util.ArrayList<h52.g> r5 = r1.f253408g
            monitor-enter(r5)
            java.util.ArrayList<h52.g> r0 = r1.f253408g     // Catch:{ all -> 0x0199 }
            int r0 = r0.size()     // Catch:{ all -> 0x0199 }
            int r7 = r1.f253402a     // Catch:{ all -> 0x0199 }
            if (r0 < r7) goto L_0x0054
            r0 = 300007(0x493e7, float:4.204E-40)
            java.lang.String r2 = "fail:network exceed max task count"
            r3 = 0
            r4.mo120572b(r0, r2, r3, r3)     // Catch:{ all -> 0x0199 }
            java.lang.String r0 = "MicroMsg.MagicBrushNetworkDownload"
            java.lang.String r2 = "exceed max task count mDownloadTaskList.size():%d,mMaxConnected:%d"
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch:{ all -> 0x0199 }
            java.util.ArrayList<h52.g> r4 = r1.f253408g     // Catch:{ all -> 0x0199 }
            int r4 = r4.size()     // Catch:{ all -> 0x0199 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0199 }
            r3[r8] = r4     // Catch:{ all -> 0x0199 }
            int r4 = r1.f253402a     // Catch:{ all -> 0x0199 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0199 }
            r3[r14] = r4     // Catch:{ all -> 0x0199 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r2, r3)     // Catch:{ all -> 0x0199 }
            monitor-exit(r5)     // Catch:{ all -> 0x0199 }
            return
        L_0x0054:
            monitor-exit(r5)     // Catch:{ all -> 0x0199 }
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>()
            java.lang.String r0 = "header"
            org.json.JSONObject r0 = r2.optJSONObject(r0)     // Catch:{ Exception -> 0x0081 }
            if (r0 == 0) goto L_0x008b
            java.util.Iterator r5 = r0.keys()     // Catch:{ Exception -> 0x0081 }
        L_0x0066:
            boolean r7 = r5.hasNext()     // Catch:{ Exception -> 0x0081 }
            if (r7 == 0) goto L_0x008b
            java.lang.Object r7 = r5.next()     // Catch:{ Exception -> 0x0081 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x0081 }
            if (r7 != 0) goto L_0x0075
            goto L_0x0066
        L_0x0075:
            java.lang.String r9 = r7.toLowerCase()     // Catch:{ Exception -> 0x0081 }
            java.lang.String r7 = r0.getString(r7)     // Catch:{ Exception -> 0x0081 }
            r13.put(r9, r7)     // Catch:{ Exception -> 0x0081 }
            goto L_0x0066
        L_0x0081:
            r0 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r8]
            java.lang.String r7 = "MicroMsg.MagicBrushNetworkUtil"
            java.lang.String r9 = "Exception: get header error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r9, r5)
        L_0x008b:
            java.lang.String r0 = "filePath"
            java.lang.String r5 = ""
            java.lang.String r9 = r2.optString(r0, r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = r1.f253404c
            r0.append(r5)
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r15)
            r0.append(r5)
            java.lang.String r5 = "temp"
            r0.append(r5)
            long r10 = java.lang.System.currentTimeMillis()
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "enableHttp2"
            boolean r11 = r2.optBoolean(r5, r8)
            java.lang.String r5 = "enableQuic"
            boolean r12 = r2.optBoolean(r5, r8)
            java.lang.String r5 = "enableCache"
            boolean r16 = r2.optBoolean(r5, r8)
            java.lang.String r5 = "enableProfile"
            boolean r2 = r2.optBoolean(r5, r14)
            java.lang.String r5 = "MicroMsg.MagicBrushNetworkDownload"
            java.lang.String r7 = "download taskId %s,useHttp2 %b, useQuic %b, useMemoryCache %b, useProfile %b"
            r10 = 5
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r10[r8] = r3
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r11)
            r10[r14] = r8
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r12)
            r10[r6] = r8
            r6 = 3
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r16)
            r10[r6] = r8
            r6 = 4
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            r10[r6] = r8
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r7, r10)
            h52.g r10 = new h52.g
            java.lang.String r8 = r1.f253405d
            h52.k$a r7 = new h52.k$a
            r7.<init>(r3, r4)
            r4 = r10
            r5 = r20
            r6 = r21
            r17 = r7
            r7 = r15
            r18 = r8
            r8 = r0
            r0 = r10
            r10 = r18
            r3 = r13
            r13 = r16
            r1 = 1
            r14 = r2
            r2 = r15
            r15 = r17
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0.f253377p = r3
            r3 = r23
            r0.f253378q = r3
            r0.f253371g = r1
            r3 = 1
            r1 = r19
            int r4 = r1.f253403b
            r5 = 1048576(0x100000, float:1.469368E-39)
            int r4 = r4 * r5
            long r4 = (long) r4
            r0.f253379r = r4
            r4 = r24
            r0.f253381t = r4
            r4 = r25
            r0.f253384w = r4
            java.util.ArrayList<h52.g> r4 = r1.f253408g
            monitor-enter(r4)
            java.util.ArrayList<h52.g> r5 = r1.f253408g     // Catch:{ all -> 0x0196 }
            r5.add(r0)     // Catch:{ all -> 0x0196 }
            monitor-exit(r4)     // Catch:{ all -> 0x0196 }
            java.util.Map<java.lang.String, java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable>> r5 = r1.f253407f
            monitor-enter(r5)
            java.util.Map<java.lang.String, java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable>> r4 = r1.f253407f     // Catch:{ all -> 0x0193 }
            java.util.Hashtable r4 = (java.util.Hashtable) r4     // Catch:{ all -> 0x0193 }
            boolean r4 = r4.containsKey(r2)     // Catch:{ all -> 0x0193 }
            if (r4 != 0) goto L_0x0154
            java.util.concurrent.ConcurrentLinkedQueue r4 = new java.util.concurrent.ConcurrentLinkedQueue     // Catch:{ all -> 0x0193 }
            r4.<init>()     // Catch:{ all -> 0x0193 }
            java.util.Map<java.lang.String, java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable>> r6 = r1.f253407f     // Catch:{ all -> 0x0193 }
            java.util.Hashtable r6 = (java.util.Hashtable) r6     // Catch:{ all -> 0x0193 }
            r6.put(r2, r4)     // Catch:{ all -> 0x0193 }
            goto L_0x015e
        L_0x0154:
            java.util.Map<java.lang.String, java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable>> r4 = r1.f253407f     // Catch:{ all -> 0x0193 }
            java.util.Hashtable r4 = (java.util.Hashtable) r4     // Catch:{ all -> 0x0193 }
            java.lang.Object r4 = r4.get(r2)     // Catch:{ all -> 0x0193 }
            java.util.concurrent.ConcurrentLinkedQueue r4 = (java.util.concurrent.ConcurrentLinkedQueue) r4     // Catch:{ all -> 0x0193 }
        L_0x015e:
            r4.offer(r0)     // Catch:{ all -> 0x0193 }
            monitor-exit(r5)     // Catch:{ all -> 0x0193 }
            java.util.Map<java.lang.String, java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable>> r0 = r1.f253407f
            java.util.Hashtable r0 = (java.util.Hashtable) r0
            java.lang.Object r0 = r0.get(r2)
            if (r0 == 0) goto L_0x0184
            java.util.Map<java.lang.String, java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable>> r0 = r1.f253407f
            java.util.Hashtable r0 = (java.util.Hashtable) r0
            java.lang.Object r0 = r0.get(r2)
            java.util.concurrent.ConcurrentLinkedQueue r0 = (java.util.concurrent.ConcurrentLinkedQueue) r0
            int r0 = r0.size()
            if (r0 <= r3) goto L_0x0184
            java.lang.String r0 = "MicroMsg.MagicBrushNetworkDownload"
            java.lang.String r2 = "hy: more than one same url in the queue, just add and wait"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            return
        L_0x0184:
            zt3.t r0 = zt3.C119157j.f356862d
            h52.j r3 = new h52.j
            r3.<init>(r1, r2)
            zt3.j r0 = (zt3.C119157j) r0
            java.lang.String r2 = "magicbrush_download_thread"
            r0.mo183876g(r3, r2)
            return
        L_0x0193:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0193 }
            throw r0
        L_0x0196:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0196 }
            throw r0
        L_0x0199:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0199 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h52.C87449k.mo120590b(e42.n, java.lang.String, e42.h, int, java.lang.String, java.lang.String, d42.d0):void");
    }

    /* renamed from: c */
    public void mo120591c(C86185m mVar) {
        if (mVar != null) {
            this.f253406e.add(mVar.getTaskId());
            mo121908e(mVar.getTaskId());
            mVar.mo120593a();
        }
    }

    /* renamed from: d */
    public boolean mo120592d(String str) {
        return this.f253406e.contains(str);
    }

    /* renamed from: e */
    public final void mo121908e(String str) {
        if (str != null) {
            synchronized (this.f253408g) {
                Iterator<C87443g> it = this.f253408g.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C87443g next = it.next();
                    if (str.equals(next.f253381t)) {
                        this.f253408g.remove(next);
                        break;
                    }
                }
            }
        }
    }
}
