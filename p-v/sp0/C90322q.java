package sp0;

import a70.C112760b;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.net.ssl.SSLContext;
import org.json.JSONObject;
import sp0.C90280d;
import tp0.C90563a;
import tp0.C90567d;

/* renamed from: sp0.q */
public class C90322q {

    /* renamed from: a */
    public int f259283a;

    /* renamed from: b */
    public String f259284b = (C112760b.m154247s() + "appbrand/");

    /* renamed from: c */
    public boolean f259285c = false;

    /* renamed from: d */
    public SSLContext f259286d;

    /* renamed from: e */
    public String f259287e;

    /* renamed from: f */
    public final ArrayList<String> f259288f = new ArrayList<>();

    /* renamed from: g */
    public C82381f f259289g;

    /* renamed from: h */
    public final Map<String, ConcurrentLinkedQueue<C90280d.C90281a>> f259290h;

    /* renamed from: i */
    public final Map<String, C90324b> f259291i;

    /* renamed from: j */
    public final ArrayList<C90567d> f259292j = new ArrayList<>();

    /* renamed from: k */
    public final ConcurrentLinkedQueue<C90567d> f259293k = new ConcurrentLinkedQueue<>();

    /* renamed from: sp0.q$a */
    public class C90323a implements C90563a {

        /* renamed from: a */
        public final /* synthetic */ String f259294a;

        /* renamed from: b */
        public final /* synthetic */ C90280d.C90281a f259295b;

        public C90323a(String str, C90280d.C90281a aVar) {
            this.f259294a = str;
            this.f259295b = aVar;
        }

        /* renamed from: a */
        public void mo124491a(JSONObject jSONObject) {
            this.f259295b.mo114287a(jSONObject);
        }

        /* renamed from: b */
        public void mo124492b(String str, String str2, String str3, int i, long j, Map map) {
            String str4 = str3;
            C90322q.m113116a(C90322q.this, this.f259294a);
            ArrayList arrayList = new ArrayList();
            synchronized (C90322q.this.f259290h) {
                arrayList.addAll((Collection) ((Hashtable) C90322q.this.f259290h).get(str3));
                ((Hashtable) C90322q.this.f259290h).remove(str3);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C90280d.C90281a) it.next()).mo114290d(0, str2, str, i, j, map);
            }
            Log.m105925i("MicroMsg.AppBrandPreloadNetworkDownload", "download success! filename %s, url %s", str, str4);
        }

        /* renamed from: c */
        public void mo124493c(String str, String str2) {
            Log.m105925i("MicroMsg.AppBrandPreloadNetworkDownload", "download start! filename %s, url %s", str, str2);
        }

        /* renamed from: d */
        public void mo124494d(String str, String str2, String str3, int i) {
            Log.m105921e("MicroMsg.AppBrandPreloadNetworkDownload", "download error! filename %s, url %s", str, str2);
            ArrayList arrayList = new ArrayList();
            synchronized (C90322q.this.f259290h) {
                arrayList.addAll((Collection) ((Hashtable) C90322q.this.f259290h).get(str2));
                ((Hashtable) C90322q.this.f259290h).remove(str2);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C90280d.C90281a) it.next()).mo114288b(-1, str3, i);
            }
            C90322q.m113116a(C90322q.this, this.f259294a);
        }

        /* renamed from: e */
        public void mo124495e(String str) {
            C90322q.this.f259288f.remove(str);
        }

        /* renamed from: f */
        public void mo124496f(String str, String str2, int i, long j, long j2) {
            Iterator it = ((ConcurrentLinkedQueue) ((Hashtable) C90322q.this.f259290h).get(str2)).iterator();
            while (it.hasNext()) {
                ((C90280d.C90281a) it.next()).mo114289c(i, j, j2);
            }
        }
    }

    /* renamed from: sp0.q$b */
    public static class C90324b {

        /* renamed from: a */
        public String f259297a;

        /* renamed from: b */
        public String f259298b;

        /* renamed from: c */
        public int f259299c;

        /* renamed from: d */
        public long f259300d;

        public C90324b(String str, String str2, String str3, int i, long j) {
            this.f259297a = str;
            this.f259298b = str2;
            this.f259299c = i;
            this.f259300d = j;
        }
    }

    public C90322q(C82381f fVar, boolean z) {
        this.f259289g = fVar;
        this.f259283a = Integer.MAX_VALUE;
        this.f259290h = new Hashtable(10);
        this.f259291i = new HashMap();
        this.f259285c = z;
    }

    /* renamed from: a */
    public static void m113116a(C90322q qVar, String str) {
        if (str == null) {
            qVar.getClass();
            return;
        }
        synchronized (qVar.f259292j) {
            Iterator<C90567d> it = qVar.f259292j.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C90567d next = it.next();
                if (str.equals(next.f260220v)) {
                    qVar.f259292j.remove(next);
                    break;
                }
            }
            if (qVar.f259292j.size() < qVar.f259283a && qVar.f259293k.peek() != null) {
                C90567d poll = qVar.f259293k.poll();
                qVar.f259292j.add(poll);
                ThreadPool.post(poll, "appbrand_preload_download_thread");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0080, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0089, code lost:
        if (((java.util.Hashtable) r1.f259290h).get(r7) != null) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x008b, code lost:
        r4 = new java.util.concurrent.ConcurrentLinkedQueue();
        r4.offer(r2);
        ((java.util.Hashtable) r1.f259290h).put(r7, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x009a, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x009b, code lost:
        r4 = r0.optString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        r12 = r0.optBoolean("enableHttp2", false);
        r13 = r0.optBoolean("enableQuic", false);
        r14 = r0.optBoolean("enableCache", false);
        r0 = r0.optBoolean("enableProfile", true);
        r9 = r4;
        r4 = r5;
        r5 = new tp0.C90567d(r1.f259289g, r7, r8, r9, r1.f259287e, r1.f259285c, r12, r13, r14, r0, new sp0.C90322q.C90323a(r1, r3, r2));
        r4.f260214p = r20;
        r4.f260215q = r19;
        r4.f260208g = true;
        r4.f260217s = r21;
        r4.f260218t = (long) (1048576 * r22);
        r4.f260216r = r1.f259286d;
        r4.f260220v = r24;
        r4.f260224z = r25;
        r2 = r1.f259292j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00f8, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0101, code lost:
        if (r1.f259292j.size() < r1.f259283a) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0103, code lost:
        r3 = r1.f259293k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0105, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r1.f259293k.add(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x010b, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x010d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0111, code lost:
        r1.f259292j.add(r4);
        com.tencent.p014mm.sdk.thread.ThreadPool.post(r4, "appbrand_predownload_thread");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x011b, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x011c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r3 = (java.util.concurrent.ConcurrentLinkedQueue) ((java.util.Hashtable) r1.f259290h).get(r7);
        r3.offer(r2);
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.AppBrandPreloadNetworkDownload", "predownload the same task is working url:%s,size:%d", r7, java.lang.Integer.valueOf(r3.size()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0144, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0145, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0063, code lost:
        r8 = r1.f259284b + com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String(r7) + "temp";
        r5 = r1.f259290h;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo124552b(org.json.JSONObject r18, int r19, java.util.Map<java.lang.String, java.lang.String> r20, java.util.ArrayList<java.lang.String> r21, int r22, sp0.C90280d.C90281a r23, java.lang.String r24, java.lang.String r25) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r23
            r3 = r24
            java.lang.String r4 = "url"
            java.lang.String r7 = r0.optString(r4)
            java.lang.String r4 = "MicroMsg.AppBrandPreloadNetworkDownload"
            java.lang.String r5 = "predownload taskId:%s url:%s"
            r6 = 2
            java.lang.Object[] r8 = new java.lang.Object[r6]
            r9 = 0
            r8[r9] = r3
            r15 = 1
            r8[r15] = r7
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r8)
            java.util.Map<java.lang.String, sp0.q$b> r4 = r1.f259291i
            monitor-enter(r4)
            java.util.Map<java.lang.String, sp0.q$b> r5 = r1.f259291i     // Catch:{ all -> 0x0149 }
            java.util.HashMap r5 = (java.util.HashMap) r5     // Catch:{ all -> 0x0149 }
            java.lang.Object r5 = r5.get(r7)     // Catch:{ all -> 0x0149 }
            sp0.q$b r5 = (sp0.C90322q.C90324b) r5     // Catch:{ all -> 0x0149 }
            if (r5 == 0) goto L_0x0062
            java.lang.String r0 = "MicroMsg.AppBrandPreloadNetworkDownload"
            java.lang.String r3 = "already downloaded return cached file:%s url:%s"
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x0149 }
            java.lang.String r8 = r5.f259297a     // Catch:{ all -> 0x0149 }
            r6[r9] = r8     // Catch:{ all -> 0x0149 }
            r6[r15] = r7     // Catch:{ all -> 0x0149 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r3, r6)     // Catch:{ all -> 0x0149 }
            r0 = 0
            java.lang.String r3 = r5.f259298b     // Catch:{ all -> 0x0149 }
            java.lang.String r6 = r5.f259297a     // Catch:{ all -> 0x0149 }
            int r8 = r5.f259299c     // Catch:{ all -> 0x0149 }
            long r9 = r5.f259300d     // Catch:{ all -> 0x0149 }
            r5 = 0
            r18 = r23
            r19 = r0
            r20 = r3
            r21 = r6
            r22 = r8
            r23 = r9
            r25 = r5
            r18.mo114290d(r19, r20, r21, r22, r23, r25)     // Catch:{ all -> 0x0149 }
            java.util.Map<java.lang.String, sp0.q$b> r0 = r1.f259291i     // Catch:{ all -> 0x0149 }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x0149 }
            r0.remove(r7)     // Catch:{ all -> 0x0149 }
            monitor-exit(r4)     // Catch:{ all -> 0x0149 }
            return
        L_0x0062:
            monitor-exit(r4)     // Catch:{ all -> 0x0149 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r1.f259284b
            r4.append(r5)
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r7)
            r4.append(r5)
            java.lang.String r5 = "temp"
            r4.append(r5)
            java.lang.String r8 = r4.toString()
            java.util.Map<java.lang.String, java.util.concurrent.ConcurrentLinkedQueue<sp0.d$a>> r5 = r1.f259290h
            monitor-enter(r5)
            java.util.Map<java.lang.String, java.util.concurrent.ConcurrentLinkedQueue<sp0.d$a>> r4 = r1.f259290h     // Catch:{ all -> 0x0146 }
            java.util.Hashtable r4 = (java.util.Hashtable) r4     // Catch:{ all -> 0x0146 }
            java.lang.Object r4 = r4.get(r7)     // Catch:{ all -> 0x0146 }
            if (r4 != 0) goto L_0x0120
            java.util.concurrent.ConcurrentLinkedQueue r4 = new java.util.concurrent.ConcurrentLinkedQueue     // Catch:{ all -> 0x0146 }
            r4.<init>()     // Catch:{ all -> 0x0146 }
            r4.offer(r2)     // Catch:{ all -> 0x0146 }
            java.util.Map<java.lang.String, java.util.concurrent.ConcurrentLinkedQueue<sp0.d$a>> r6 = r1.f259290h     // Catch:{ all -> 0x0146 }
            java.util.Hashtable r6 = (java.util.Hashtable) r6     // Catch:{ all -> 0x0146 }
            r6.put(r7, r4)     // Catch:{ all -> 0x0146 }
            monitor-exit(r5)     // Catch:{ all -> 0x0146 }
            java.lang.String r4 = "filePath"
            java.lang.String r4 = r0.optString(r4)
            java.lang.String r5 = "enableHttp2"
            boolean r12 = r0.optBoolean(r5, r9)
            java.lang.String r5 = "enableQuic"
            boolean r13 = r0.optBoolean(r5, r9)
            java.lang.String r5 = "enableCache"
            boolean r14 = r0.optBoolean(r5, r9)
            java.lang.String r5 = "enableProfile"
            boolean r0 = r0.optBoolean(r5, r15)
            tp0.d r11 = new tp0.d
            com.tencent.mm.plugin.appbrand.jsapi.f r6 = r1.f259289g
            java.lang.String r10 = r1.f259287e
            boolean r9 = r1.f259285c
            sp0.q$a r5 = new sp0.q$a
            r5.<init>(r3, r2)
            r2 = r5
            r5 = r11
            r16 = r9
            r9 = r4
            r4 = r11
            r11 = r16
            r3 = 1
            r15 = r0
            r16 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0 = r20
            r4.f260214p = r0
            r0 = r19
            r4.f260215q = r0
            r4.f260208g = r3
            r0 = r21
            r4.f260217s = r0
            r0 = 1048576(0x100000, float:1.469368E-39)
            int r0 = r0 * r22
            long r2 = (long) r0
            r4.f260218t = r2
            javax.net.ssl.SSLContext r0 = r1.f259286d
            r4.f260216r = r0
            r0 = r24
            r4.f260220v = r0
            r0 = r25
            r4.f260224z = r0
            java.util.ArrayList<tp0.d> r2 = r1.f259292j
            monitor-enter(r2)
            java.util.ArrayList<tp0.d> r0 = r1.f259292j     // Catch:{ all -> 0x011d }
            int r0 = r0.size()     // Catch:{ all -> 0x011d }
            int r3 = r1.f259283a     // Catch:{ all -> 0x011d }
            if (r0 < r3) goto L_0x0111
            java.util.concurrent.ConcurrentLinkedQueue<tp0.d> r3 = r1.f259293k     // Catch:{ all -> 0x011d }
            monitor-enter(r3)     // Catch:{ all -> 0x011d }
            java.util.concurrent.ConcurrentLinkedQueue<tp0.d> r0 = r1.f259293k     // Catch:{ all -> 0x010e }
            r0.add(r4)     // Catch:{ all -> 0x010e }
            monitor-exit(r3)     // Catch:{ all -> 0x010e }
            monitor-exit(r2)     // Catch:{ all -> 0x011d }
            return
        L_0x010e:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x010e }
            throw r0     // Catch:{ all -> 0x011d }
        L_0x0111:
            java.util.ArrayList<tp0.d> r0 = r1.f259292j     // Catch:{ all -> 0x011d }
            r0.add(r4)     // Catch:{ all -> 0x011d }
            java.lang.String r0 = "appbrand_predownload_thread"
            com.tencent.p014mm.sdk.thread.ThreadPool.post(r4, r0)     // Catch:{ all -> 0x011d }
            monitor-exit(r2)     // Catch:{ all -> 0x011d }
            return
        L_0x011d:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x011d }
            throw r0
        L_0x0120:
            r0 = 1
            java.util.Map<java.lang.String, java.util.concurrent.ConcurrentLinkedQueue<sp0.d$a>> r3 = r1.f259290h     // Catch:{ all -> 0x0146 }
            java.util.Hashtable r3 = (java.util.Hashtable) r3     // Catch:{ all -> 0x0146 }
            java.lang.Object r3 = r3.get(r7)     // Catch:{ all -> 0x0146 }
            java.util.concurrent.ConcurrentLinkedQueue r3 = (java.util.concurrent.ConcurrentLinkedQueue) r3     // Catch:{ all -> 0x0146 }
            r3.offer(r2)     // Catch:{ all -> 0x0146 }
            java.lang.String r2 = "MicroMsg.AppBrandPreloadNetworkDownload"
            java.lang.String r4 = "predownload the same task is working url:%s,size:%d"
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x0146 }
            r6[r9] = r7     // Catch:{ all -> 0x0146 }
            int r3 = r3.size()     // Catch:{ all -> 0x0146 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0146 }
            r6[r0] = r3     // Catch:{ all -> 0x0146 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r6)     // Catch:{ all -> 0x0146 }
            monitor-exit(r5)     // Catch:{ all -> 0x0146 }
            return
        L_0x0146:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0146 }
            throw r0
        L_0x0149:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0149 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sp0.C90322q.mo124552b(org.json.JSONObject, int, java.util.Map, java.util.ArrayList, int, sp0.d$a, java.lang.String, java.lang.String):void");
    }

    /* renamed from: c */
    public void mo124553c() {
        synchronized (this.f259292j) {
            Iterator<C90567d> it = this.f259292j.iterator();
            while (it.hasNext()) {
                it.next().f260208g = false;
            }
            this.f259292j.clear();
        }
        synchronized (this.f259293k) {
            Iterator<C90567d> it4 = this.f259293k.iterator();
            while (it4.hasNext()) {
                it4.next().f260208g = false;
            }
            this.f259293k.clear();
        }
        synchronized (this.f259291i) {
            ((HashMap) this.f259291i).clear();
        }
    }
}
