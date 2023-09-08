package h52;

import a70.C112760b;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import d42.C86176d0;
import d42.C86184l;
import d42.C86185m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONObject;

/* renamed from: h52.i */
public class C87446i implements C86184l {

    /* renamed from: a */
    public int f253392a = 10;

    /* renamed from: b */
    public String f253393b = (C112760b.m154247s() + "magicbrush/");

    /* renamed from: c */
    public final ArrayList<String> f253394c = new ArrayList<>();

    /* renamed from: d */
    public final Map<String, ConcurrentLinkedQueue<C87438c>> f253395d = new Hashtable(10);

    /* renamed from: e */
    public final ArrayList<C87438c> f253396e = new ArrayList<>();

    /* renamed from: h52.i$a */
    public class C87447a implements C87439d {

        /* renamed from: a */
        public final /* synthetic */ String f253397a;

        /* renamed from: b */
        public final /* synthetic */ C86176d0 f253398b;

        public C87447a(String str, C86176d0 d0Var) {
            this.f253397a = str;
            this.f253398b = d0Var;
        }

        /* renamed from: b */
        public void mo121896b(String str, String str2, String str3, int i, long j, Map map) {
            C87446i.this.mo121906e(this.f253397a);
            HashMap hashMap = new HashMap();
            String str4 = str2;
            hashMap.put("mimeType", str2);
            hashMap.put(FFmpegMetadataRetriever.METADATA_KEY_FILENAME, str);
            hashMap.put("dataLength", Long.valueOf(j));
            this.f253398b.mo120573c(0, "ok", (Object) null, (JSONObject) null, hashMap, map, (Map) null);
            Log.m105925i("MicroMsg.MagicBrushNetworkCDNDownload", "download success! filename %s, url %s", str, str3);
        }

        /* renamed from: c */
        public void mo121897c(String str, String str2) {
            Log.m105925i("MicroMsg.MagicBrushNetworkCDNDownload", "download start! filename %s, url %s", str, str2);
        }

        /* renamed from: d */
        public void mo121898d(String str, String str2, String str3, int i) {
            Log.m105921e("MicroMsg.MagicBrushNetworkCDNDownload", "download error! errorMessage:%s, filename %s, url %s", str3, str, str2);
            C87446i.this.mo121906e(this.f253397a);
            this.f253398b.mo120572b(i, str3, (String) null, (Map) null);
        }

        /* renamed from: e */
        public void mo121899e(String str) {
            C87446i.this.f253394c.remove(str);
        }

        /* renamed from: f */
        public void mo121900f(String str, String str2, int i, long j, long j2) {
        }

        /* renamed from: g */
        public void mo121901g(JSONObject jSONObject, int i) {
        }
    }

    /* renamed from: a */
    public C86185m mo120589a(String str) {
        if (str == null) {
            return null;
        }
        synchronized (this.f253396e) {
            Iterator<C87438c> it = this.f253396e.iterator();
            while (it.hasNext()) {
                C87438c next = it.next();
                if (str.equals(next.f253357s)) {
                    return next;
                }
            }
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x00b4, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r1.f253396e.add(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00ba, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00bb, code lost:
        r3 = r1.f253395d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00bd, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00c6, code lost:
        if (((java.util.Hashtable) r1.f253395d).containsKey(r4) != false) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00c8, code lost:
        r0 = new java.util.concurrent.ConcurrentLinkedQueue();
        ((java.util.Hashtable) r1.f253395d).put(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00d5, code lost:
        r0 = (java.util.concurrent.ConcurrentLinkedQueue) ((java.util.Hashtable) r1.f253395d).get(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00df, code lost:
        r0.offer(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00e2, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00eb, code lost:
        if (((java.util.Hashtable) r1.f253395d).get(r4) == null) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00fb, code lost:
        if (((java.util.concurrent.ConcurrentLinkedQueue) ((java.util.Hashtable) r1.f253395d).get(r4)).size() <= 1) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00fd, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.MagicBrushNetworkCDNDownload", "hy: more than one same url in the queue, just add and wait");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0104, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0105, code lost:
        ((zt3.C119157j) zt3.C119157j.f356862d).mo183876g(new h52.C87445h(r15, r4), "magicbrush_cdndownload_thread");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0113, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0054, code lost:
        r10 = r1.f253393b;
        r8 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String(r4) + "temp" + java.lang.System.currentTimeMillis();
        r0 = r0.optInt("fileType", 0);
        com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String(r4);
        java.lang.System.currentTimeMillis();
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.MagicBrushNetworkCDNDownload", "download taskId %s,fileDir %s, fileName %s, fileType %d", r2, r10, r8, java.lang.Integer.valueOf(r0));
        r5 = new h52.C87438c(r17, r4, r8, r10, r0, new h52.C87446i.C87447a(r15, r2, r3));
        r5.f253355q = r19;
        r5.f253346e = true;
        r5.f253357s = r2;
        r5.f253359u = r21;
        r2 = r1.f253396e;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo120590b(e42.C7597n r16, java.lang.String r17, e42.C7596h r18, int r19, java.lang.String r20, java.lang.String r21, d42.C86176d0 r22) {
        /*
            r15 = this;
            r1 = r15
            r0 = r18
            r2 = r20
            r3 = r22
            java.lang.String r4 = "url"
            java.lang.String r4 = r0.optString(r4)
            java.lang.String r5 = "MicroMsg.MagicBrushNetworkCDNDownload"
            java.lang.String r6 = "download taskId:%s url:%s"
            r7 = 2
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r9 = 0
            r8[r9] = r2
            r12 = 1
            r8[r12] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r8)
            java.util.ArrayList<h52.c> r5 = r1.f253396e
            monitor-enter(r5)
            java.util.ArrayList<h52.c> r6 = r1.f253396e     // Catch:{ all -> 0x011a }
            int r6 = r6.size()     // Catch:{ all -> 0x011a }
            int r8 = r1.f253392a     // Catch:{ all -> 0x011a }
            if (r6 < r8) goto L_0x0053
            r0 = 300007(0x493e7, float:4.204E-40)
            java.lang.String r2 = "fail:network exceed max task count"
            r4 = 0
            r3.mo120572b(r0, r2, r4, r4)     // Catch:{ all -> 0x011a }
            java.lang.String r0 = "MicroMsg.MagicBrushNetworkCDNDownload"
            java.lang.String r2 = "exceed max task count mDownloadTaskList.size():%d,mMaxConnected:%d"
            java.lang.Object[] r3 = new java.lang.Object[r7]     // Catch:{ all -> 0x011a }
            java.util.ArrayList<h52.c> r4 = r1.f253396e     // Catch:{ all -> 0x011a }
            int r4 = r4.size()     // Catch:{ all -> 0x011a }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x011a }
            r3[r9] = r4     // Catch:{ all -> 0x011a }
            int r4 = r1.f253392a     // Catch:{ all -> 0x011a }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x011a }
            r3[r12] = r4     // Catch:{ all -> 0x011a }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r2, r3)     // Catch:{ all -> 0x011a }
            monitor-exit(r5)     // Catch:{ all -> 0x011a }
            return
        L_0x0053:
            monitor-exit(r5)     // Catch:{ all -> 0x011a }
            java.lang.String r10 = r1.f253393b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r4)
            r5.append(r6)
            java.lang.String r6 = "temp"
            r5.append(r6)
            long r13 = java.lang.System.currentTimeMillis()
            r5.append(r13)
            java.lang.String r8 = r5.toString()
            java.lang.String r5 = "fileType"
            int r0 = r0.optInt(r5, r9)
            com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r4)
            java.lang.System.currentTimeMillis()
            java.lang.String r5 = "MicroMsg.MagicBrushNetworkCDNDownload"
            java.lang.String r6 = "download taskId %s,fileDir %s, fileName %s, fileType %d"
            r11 = 4
            java.lang.Object[] r11 = new java.lang.Object[r11]
            r11[r9] = r2
            r11[r12] = r10
            r11[r7] = r8
            r7 = 3
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            r11[r7] = r9
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r11)
            h52.c r13 = new h52.c
            h52.i$a r11 = new h52.i$a
            r11.<init>(r2, r3)
            r5 = r13
            r6 = r17
            r7 = r4
            r9 = r10
            r10 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0 = r19
            r13.f253355q = r0
            r13.f253346e = r12
            r13.f253357s = r2
            r0 = r21
            r13.f253359u = r0
            java.util.ArrayList<h52.c> r2 = r1.f253396e
            monitor-enter(r2)
            java.util.ArrayList<h52.c> r0 = r1.f253396e     // Catch:{ all -> 0x0117 }
            r0.add(r13)     // Catch:{ all -> 0x0117 }
            monitor-exit(r2)     // Catch:{ all -> 0x0117 }
            java.util.Map<java.lang.String, java.util.concurrent.ConcurrentLinkedQueue<h52.c>> r3 = r1.f253395d
            monitor-enter(r3)
            java.util.Map<java.lang.String, java.util.concurrent.ConcurrentLinkedQueue<h52.c>> r0 = r1.f253395d     // Catch:{ all -> 0x0114 }
            java.util.Hashtable r0 = (java.util.Hashtable) r0     // Catch:{ all -> 0x0114 }
            boolean r0 = r0.containsKey(r4)     // Catch:{ all -> 0x0114 }
            if (r0 != 0) goto L_0x00d5
            java.util.concurrent.ConcurrentLinkedQueue r0 = new java.util.concurrent.ConcurrentLinkedQueue     // Catch:{ all -> 0x0114 }
            r0.<init>()     // Catch:{ all -> 0x0114 }
            java.util.Map<java.lang.String, java.util.concurrent.ConcurrentLinkedQueue<h52.c>> r2 = r1.f253395d     // Catch:{ all -> 0x0114 }
            java.util.Hashtable r2 = (java.util.Hashtable) r2     // Catch:{ all -> 0x0114 }
            r2.put(r4, r0)     // Catch:{ all -> 0x0114 }
            goto L_0x00df
        L_0x00d5:
            java.util.Map<java.lang.String, java.util.concurrent.ConcurrentLinkedQueue<h52.c>> r0 = r1.f253395d     // Catch:{ all -> 0x0114 }
            java.util.Hashtable r0 = (java.util.Hashtable) r0     // Catch:{ all -> 0x0114 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0114 }
            java.util.concurrent.ConcurrentLinkedQueue r0 = (java.util.concurrent.ConcurrentLinkedQueue) r0     // Catch:{ all -> 0x0114 }
        L_0x00df:
            r0.offer(r13)     // Catch:{ all -> 0x0114 }
            monitor-exit(r3)     // Catch:{ all -> 0x0114 }
            java.util.Map<java.lang.String, java.util.concurrent.ConcurrentLinkedQueue<h52.c>> r0 = r1.f253395d
            java.util.Hashtable r0 = (java.util.Hashtable) r0
            java.lang.Object r0 = r0.get(r4)
            if (r0 == 0) goto L_0x0105
            java.util.Map<java.lang.String, java.util.concurrent.ConcurrentLinkedQueue<h52.c>> r0 = r1.f253395d
            java.util.Hashtable r0 = (java.util.Hashtable) r0
            java.lang.Object r0 = r0.get(r4)
            java.util.concurrent.ConcurrentLinkedQueue r0 = (java.util.concurrent.ConcurrentLinkedQueue) r0
            int r0 = r0.size()
            if (r0 <= r12) goto L_0x0105
            java.lang.String r0 = "MicroMsg.MagicBrushNetworkCDNDownload"
            java.lang.String r2 = "hy: more than one same url in the queue, just add and wait"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            return
        L_0x0105:
            zt3.t r0 = zt3.C119157j.f356862d
            h52.h r2 = new h52.h
            r2.<init>(r15, r4)
            zt3.j r0 = (zt3.C119157j) r0
            java.lang.String r3 = "magicbrush_cdndownload_thread"
            r0.mo183876g(r2, r3)
            return
        L_0x0114:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0114 }
            throw r0
        L_0x0117:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0117 }
            throw r0
        L_0x011a:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x011a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h52.C87446i.mo120590b(e42.n, java.lang.String, e42.h, int, java.lang.String, java.lang.String, d42.d0):void");
    }

    /* renamed from: c */
    public void mo120591c(C86185m mVar) {
        if (mVar != null) {
            this.f253394c.add(mVar.getTaskId());
            mo121906e(mVar.getTaskId());
            mVar.mo120593a();
        }
    }

    /* renamed from: d */
    public boolean mo120592d(String str) {
        return this.f253394c.contains(str);
    }

    /* renamed from: e */
    public final void mo121906e(String str) {
        if (str != null) {
            synchronized (this.f253396e) {
                Iterator<C87438c> it = this.f253396e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C87438c next = it.next();
                    if (str.equals(next.f253357s)) {
                        this.f253396e.remove(next);
                        break;
                    }
                }
            }
        }
    }
}
