package tl0;

import com.google.android.gms.common.Scopes;
import com.tencent.mars.cdn.CronetLogic;
import com.tencent.p014mm.autogen.events.AppBrandNetWorkReqHeaderReceivedEvent;
import com.tencent.p014mm.plugin.appbrand.C84081q4;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82919r2;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82489v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.system.MimeTypeUtil;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.thumbplayer.tmediacodec.codec.CodecError;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import jk0.C87975a;
import jk0.C87986j;
import js0.C9514m;
import org.json.JSONObject;
import sp0.C90272a;
import sp0.C90280d;
import sp0.C90283e;
import sp0.C90309m;

/* renamed from: tl0.a */
public class C90509a implements C87986j {

    /* renamed from: d */
    public C90280d.C90282b f260122d;

    /* renamed from: e */
    public boolean f260123e = false;

    /* renamed from: f */
    public C87975a f260124f;

    /* renamed from: g */
    public final AtomicBoolean f260125g = new AtomicBoolean(false);

    /* renamed from: tl0.a$a */
    public class C90510a implements C90280d.C90281a {

        /* renamed from: a */
        public JSONObject f260126a;

        /* renamed from: b */
        public final /* synthetic */ String f260127b;

        /* renamed from: c */
        public final /* synthetic */ C82381f f260128c;

        /* renamed from: d */
        public final /* synthetic */ String f260129d;

        public C90510a(String str, C82381f fVar, String str2) {
            this.f260127b = str;
            this.f260128c = fVar;
            this.f260129d = str2;
        }

        /* renamed from: a */
        public void mo114287a(JSONObject jSONObject) {
            if (jSONObject != null) {
                if (!jSONObject.optBoolean("__AppBrandRemoteDebugRequestHeader__")) {
                    this.f260126a = jSONObject;
                    HashMap hashMap = new HashMap();
                    hashMap.put("downloadTaskId", this.f260129d);
                    hashMap.put("state", "headersReceived");
                    hashMap.put("header", this.f260126a);
                    String jSONObject2 = new JSONObject(hashMap).toString();
                    C90511b bVar = new C90511b();
                    bVar.mo115161k(this.f260128c);
                    bVar.mo115163m(jSONObject2);
                    bVar.mo115159i(C90509a.this.f260124f.mo122426a(this.f260129d));
                } else if (((C90272a) this.f260128c.mo109671p(C90272a.class)).f259124F) {
                    jSONObject.remove("__AppBrandRemoteDebugRequestHeader__");
                    AppBrandNetWorkReqHeaderReceivedEvent appBrandNetWorkReqHeaderReceivedEvent = new AppBrandNetWorkReqHeaderReceivedEvent();
                    AppBrandNetWorkReqHeaderReceivedEvent.C80702a aVar = appBrandNetWorkReqHeaderReceivedEvent.f236133d;
                    aVar.f236134a = "download";
                    aVar.f236136c = jSONObject;
                    aVar.f236135b = this.f260129d;
                    appBrandNetWorkReqHeaderReceivedEvent.publish();
                }
            }
        }

        /* renamed from: b */
        public void mo114288b(int i, String str, int i2) {
            Log.m105925i("MicroMsg.BaseCreateDownloadTask", "onDownloadError downloadTaskId=%s,errMsg=%d,error=%s,errno=%d", this.f260129d, Integer.valueOf(i), str, Integer.valueOf(i2));
            if (!C90509a.m113331b(C90509a.this, this.f260128c, this.f260129d)) {
                C90509a.this.mo124673e(this.f260128c, this.f260129d, str, i2);
            }
        }

        /* renamed from: c */
        public void mo114289c(int i, long j, long j2) {
            HashMap hashMap = new HashMap();
            hashMap.put("downloadTaskId", this.f260129d);
            hashMap.put("state", "progressUpdate");
            hashMap.put("progress", Integer.valueOf(i));
            hashMap.put("totalBytesWritten", Long.valueOf(j));
            hashMap.put("totalBytesExpectedToWrite", Long.valueOf(j2));
            String jSONObject = new JSONObject(hashMap).toString();
            C90511b bVar = new C90511b();
            bVar.mo115161k(this.f260128c);
            bVar.mo115163m(jSONObject);
            bVar.mo115159i(C90509a.this.f260124f.mo122426a(this.f260129d));
        }

        /* renamed from: d */
        public void mo114290d(int i, String str, String str2, int i2, long j, Map map) {
            String str3 = str;
            String str4 = str2;
            Map map2 = map;
            Log.m105925i("MicroMsg.BaseCreateDownloadTask", "onDownloadResultWithCode errMsg = %d, mimeType = %s, filePath = %s, statusCode = %d, dataLength = %d", Integer.valueOf(i), str3, str4, Integer.valueOf(i2), Long.valueOf(j));
            if (!Util.isNullOrNil(this.f260127b)) {
                String str5 = C82489v0.m101249x(this.f260128c, new C86009m1(str4), this.f260127b, (C9514m<String>) null).f252305b;
                if ("ok".equals(str5)) {
                    Log.m105925i("MicroMsg.BaseCreateDownloadTask", "onDownloadResultWithCode filePath %s", this.f260127b);
                    HashMap hashMap = new HashMap();
                    hashMap.put("downloadTaskId", this.f260129d);
                    hashMap.put(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, this.f260127b);
                    hashMap.put("dataLength", Long.valueOf(j));
                    hashMap.put("statusCode", Integer.valueOf(i2));
                    hashMap.put("state", "success");
                    JSONObject jSONObject = this.f260126a;
                    if (jSONObject != null) {
                        hashMap.put("header", jSONObject);
                    }
                    if (map2 != null && map.size() > 0) {
                        hashMap.put(Scopes.PROFILE, map2);
                    }
                    String jSONObject2 = new JSONObject(hashMap).toString();
                    C90511b bVar = new C90511b();
                    bVar.mo115161k(this.f260128c);
                    bVar.mo115163m(jSONObject2);
                    bVar.mo115159i(C90509a.this.f260124f.mo122426a(this.f260129d));
                    C90509a.this.f260124f.mo122427b(this.f260129d);
                } else if (!C90509a.m113331b(C90509a.this, this.f260128c, this.f260129d)) {
                    C90509a.this.mo124673e(this.f260128c, this.f260129d, str5, 603300);
                }
            } else {
                C9514m mVar = new C9514m();
                C90509a aVar = C90509a.this;
                C82381f fVar = this.f260128c;
                aVar.getClass();
                String extByMimeType = MimeTypeUtil.getExtByMimeType(str);
                if (Util.isNullOrNil(extByMimeType) && MimeTypes.AUDIO_MP4.equals(str3)) {
                    extByMimeType = "mp4";
                }
                C9514m mVar2 = new C9514m();
                T createTempFileFrom = fVar.getFileSystem().createTempFileFrom(new C86009m1(str4), extByMimeType, true, mVar2);
                mVar.f29691a = createTempFileFrom;
                String str6 = createTempFileFrom != C81410b0.OK ? null : (String) mVar2.f29691a;
                if (str6 != null) {
                    Log.m105925i("MicroMsg.BaseCreateDownloadTask", "onDownloadResultWithCode localId %s", str6);
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("downloadTaskId", this.f260129d);
                    hashMap2.put("tempFilePath", str6);
                    hashMap2.put("dataLength", Long.valueOf(j));
                    hashMap2.put("statusCode", Integer.valueOf(i2));
                    hashMap2.put("state", "success");
                    JSONObject jSONObject3 = this.f260126a;
                    if (jSONObject3 != null) {
                        hashMap2.put("header", jSONObject3);
                    }
                    if (map2 != null && map.size() > 0) {
                        hashMap2.put(Scopes.PROFILE, map2);
                    }
                    String jSONObject4 = new JSONObject(hashMap2).toString();
                    C90511b bVar2 = new C90511b();
                    bVar2.mo115161k(this.f260128c);
                    bVar2.mo115163m(jSONObject4);
                    bVar2.mo115159i(C90509a.this.f260124f.mo122426a(this.f260129d));
                    C90509a.this.f260124f.mo122427b(this.f260129d);
                } else if (!C90509a.m113331b(C90509a.this, this.f260128c, this.f260129d)) {
                    C90509a.this.mo124673e(this.f260128c, this.f260129d, mVar.f29691a == C81410b0.ERR_EXCEED_DIRECTORY_MAX_SIZE ? "temp file size exceed limit" : "download fail save file fail", 603300);
                }
            }
        }
    }

    /* renamed from: tl0.a$b */
    public static class C90511b extends C82919r2 {
        public static final int CTRL_INDEX = 271;
        public static final String NAME = "onDownloadTaskStateChange";
    }

    public C90509a(C90280d.C90282b bVar, C87975a aVar) {
        this.f260122d = bVar;
        this.f260124f = aVar;
    }

    /* renamed from: b */
    public static boolean m113331b(C90509a aVar, C82381f fVar, String str) {
        aVar.getClass();
        AtomicInteger atomicInteger = C90283e.f259174b;
        C90280d a = C90283e.C90285b.f259176a.mo124502a(fVar.getAppId());
        if (a == null || !a.f259170f.contains(str)) {
            return false;
        }
        Log.m105925i("MicroMsg.BaseCreateDownloadTask", "download abort %s", str);
        return true;
    }

    /* renamed from: a */
    public String mo122435a() {
        return "downloadTaskId";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00a4, code lost:
        r17 = r1.optString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        r20 = r1.optBoolean("enableHttp2", false);
        r21 = r1.optBoolean("enableQuic", false);
        r22 = r1.optBoolean("enableCache", false);
        r23 = r1.optBoolean("enableProfile", true);
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.AppBrandNetworkDownload", "download taskId %s,useHttp2 %b, useQuic %b, useMemoryCache %b, useProfile %b", r3, java.lang.Boolean.valueOf(r20), java.lang.Boolean.valueOf(r21), java.lang.Boolean.valueOf(r22), java.lang.Boolean.valueOf(r23));
        r13 = new tp0.C90567d(r4.f259171g, r9, r4.f259166b + com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String(r9) + "temp" + java.lang.System.currentTimeMillis(), r17, r4.f259169e, r4.f259167c, r20, r21, r22, r23, new sp0.C90273b(r4, r3, r2));
        r13.f260214p = r31;
        r13.f260215q = r30;
        r13.f260208g = true;
        r13.f260217s = r0;
        r13.f260218t = (long) (r6 * 1048576);
        r13.f260216r = r4.f259168d;
        r13.f260220v = r3;
        r13.f260224z = "createDownloadTask";
        r2 = r4.f259173i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x013f, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r4.f259173i.add(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0145, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0146, code lost:
        r3 = r4.f259172h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0148, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0151, code lost:
        if (((java.util.Hashtable) r4.f259172h).containsKey(r9) != false) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0153, code lost:
        r0 = new java.util.concurrent.ConcurrentLinkedQueue();
        ((java.util.Hashtable) r4.f259172h).put(r9, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0160, code lost:
        r0 = (java.util.concurrent.ConcurrentLinkedQueue) ((java.util.Hashtable) r4.f259172h).get(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x016a, code lost:
        r0.offer(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x016d, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0176, code lost:
        if (((java.util.Hashtable) r4.f259172h).get(r9) == null) goto L_0x0190;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0186, code lost:
        if (((java.util.concurrent.ConcurrentLinkedQueue) ((java.util.Hashtable) r4.f259172h).get(r9)).size() <= 1) goto L_0x0190;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0188, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.AppBrandNetworkDownload", "hy: more than one same url in the queue, just add and wait");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0190, code lost:
        com.tencent.p014mm.sdk.thread.ThreadPool.post(new sp0.C90274c(r4, r9), "appbrand_download_thread");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo114486c(com.tencent.p014mm.plugin.appbrand.jsapi.C82381f r26, sp0.C90272a r27, boolean r28, org.json.JSONObject r29, int r30, java.util.Map<java.lang.String, java.lang.String> r31, sp0.C90280d.C90281a r32, java.lang.String r33) {
        /*
            r25 = this;
            r0 = r27
            r1 = r29
            r2 = r32
            r3 = r33
            java.util.concurrent.atomic.AtomicInteger r4 = sp0.C90283e.f259174b
            sp0.e r4 = sp0.C90283e.C90285b.f259176a
            java.lang.String r5 = r26.getAppId()
            sp0.d r4 = r4.mo124502a(r5)
            if (r4 != 0) goto L_0x0035
            sp0.d r4 = new sp0.d
            r5 = r25
            boolean r6 = r5.f260123e
            r7 = r26
            r4.<init>(r7, r6)
            sp0.e r6 = sp0.C90283e.C90285b.f259176a
            java.lang.String r7 = r26.getAppId()
            java.util.HashMap<java.lang.String, sp0.d> r8 = r6.f259175a
            boolean r8 = r8.containsKey(r7)
            if (r8 != 0) goto L_0x0037
            java.util.HashMap<java.lang.String, sp0.d> r6 = r6.f259175a
            r6.put(r7, r4)
            goto L_0x0037
        L_0x0035:
            r5 = r25
        L_0x0037:
            java.lang.String r6 = "MicroMsg.BaseCreateDownloadTask"
            java.lang.String r7 = "before do download, checkDomains = %b, timeout %d"
            r8 = 2
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r28)
            r11 = 0
            r9[r11] = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r30)
            r12 = 1
            r9[r12] = r10
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r9)
            int r6 = r0.f259146z
            if (r28 == 0) goto L_0x0056
            java.util.ArrayList<java.lang.String> r0 = r0.f259140t
            goto L_0x0057
        L_0x0056:
            r0 = 0
        L_0x0057:
            java.lang.String r7 = "createDownloadTask"
            java.lang.String r9 = "url"
            java.lang.String r9 = r1.optString(r9)
            java.lang.String r10 = "MicroMsg.AppBrandNetworkDownload"
            java.lang.String r13 = "download taskId:%s url:%s"
            java.lang.Object[] r14 = new java.lang.Object[r8]
            r14[r11] = r3
            r14[r12] = r9
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r13, r14)
            java.util.ArrayList<tp0.d> r10 = r4.f259173i
            monitor-enter(r10)
            java.util.ArrayList<tp0.d> r13 = r4.f259173i     // Catch:{ all -> 0x01a1 }
            int r13 = r13.size()     // Catch:{ all -> 0x01a1 }
            int r14 = r4.f259165a     // Catch:{ all -> 0x01a1 }
            if (r13 < r14) goto L_0x00a3
            r0 = -1
            java.lang.String r1 = "fail:network exceed max task count"
            r3 = 600007(0x927c7, float:8.40789E-40)
            r2.mo114288b(r0, r1, r3)     // Catch:{ all -> 0x01a1 }
            java.lang.String r0 = "MicroMsg.AppBrandNetworkDownload"
            java.lang.String r1 = "exceed max task count mDownloadTaskList.size():%d,mMaxConnected:%d"
            java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch:{ all -> 0x01a1 }
            java.util.ArrayList<tp0.d> r3 = r4.f259173i     // Catch:{ all -> 0x01a1 }
            int r3 = r3.size()     // Catch:{ all -> 0x01a1 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x01a1 }
            r2[r11] = r3     // Catch:{ all -> 0x01a1 }
            int r3 = r4.f259165a     // Catch:{ all -> 0x01a1 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x01a1 }
            r2[r12] = r3     // Catch:{ all -> 0x01a1 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r2)     // Catch:{ all -> 0x01a1 }
            monitor-exit(r10)     // Catch:{ all -> 0x01a1 }
            goto L_0x019a
        L_0x00a3:
            monitor-exit(r10)     // Catch:{ all -> 0x01a1 }
            java.lang.String r10 = "filePath"
            java.lang.String r17 = r1.optString(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r13 = r4.f259166b
            r10.append(r13)
            java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r9)
            r10.append(r13)
            java.lang.String r13 = "temp"
            r10.append(r13)
            long r13 = java.lang.System.currentTimeMillis()
            r10.append(r13)
            java.lang.String r16 = r10.toString()
            java.lang.String r10 = "enableHttp2"
            boolean r20 = r1.optBoolean(r10, r11)
            java.lang.String r10 = "enableQuic"
            boolean r21 = r1.optBoolean(r10, r11)
            java.lang.String r10 = "enableCache"
            boolean r22 = r1.optBoolean(r10, r11)
            java.lang.String r10 = "enableProfile"
            boolean r23 = r1.optBoolean(r10, r12)
            java.lang.String r1 = "MicroMsg.AppBrandNetworkDownload"
            java.lang.String r10 = "download taskId %s,useHttp2 %b, useQuic %b, useMemoryCache %b, useProfile %b"
            r13 = 5
            java.lang.Object[] r13 = new java.lang.Object[r13]
            r13[r11] = r3
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r20)
            r13[r12] = r11
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r21)
            r13[r8] = r11
            r8 = 3
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r22)
            r13[r8] = r11
            r8 = 4
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r23)
            r13[r8] = r11
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r10, r13)
            tp0.d r1 = new tp0.d
            com.tencent.mm.plugin.appbrand.jsapi.f r14 = r4.f259171g
            java.lang.String r8 = r4.f259169e
            boolean r10 = r4.f259167c
            sp0.b r11 = new sp0.b
            r11.<init>(r4, r3, r2)
            r13 = r1
            r15 = r9
            r18 = r8
            r19 = r10
            r24 = r11
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r2 = r31
            r1.f260214p = r2
            r2 = r30
            r1.f260215q = r2
            r1.f260208g = r12
            r1.f260217s = r0
            r0 = 1048576(0x100000, float:1.469368E-39)
            int r6 = r6 * r0
            long r10 = (long) r6
            r1.f260218t = r10
            javax.net.ssl.SSLContext r0 = r4.f259168d
            r1.f260216r = r0
            r1.f260220v = r3
            r1.f260224z = r7
            java.util.ArrayList<tp0.d> r2 = r4.f259173i
            monitor-enter(r2)
            java.util.ArrayList<tp0.d> r0 = r4.f259173i     // Catch:{ all -> 0x019e }
            r0.add(r1)     // Catch:{ all -> 0x019e }
            monitor-exit(r2)     // Catch:{ all -> 0x019e }
            java.util.Map<java.lang.String, java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable>> r3 = r4.f259172h
            monitor-enter(r3)
            java.util.Map<java.lang.String, java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable>> r0 = r4.f259172h     // Catch:{ all -> 0x019b }
            java.util.Hashtable r0 = (java.util.Hashtable) r0     // Catch:{ all -> 0x019b }
            boolean r0 = r0.containsKey(r9)     // Catch:{ all -> 0x019b }
            if (r0 != 0) goto L_0x0160
            java.util.concurrent.ConcurrentLinkedQueue r0 = new java.util.concurrent.ConcurrentLinkedQueue     // Catch:{ all -> 0x019b }
            r0.<init>()     // Catch:{ all -> 0x019b }
            java.util.Map<java.lang.String, java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable>> r2 = r4.f259172h     // Catch:{ all -> 0x019b }
            java.util.Hashtable r2 = (java.util.Hashtable) r2     // Catch:{ all -> 0x019b }
            r2.put(r9, r0)     // Catch:{ all -> 0x019b }
            goto L_0x016a
        L_0x0160:
            java.util.Map<java.lang.String, java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable>> r0 = r4.f259172h     // Catch:{ all -> 0x019b }
            java.util.Hashtable r0 = (java.util.Hashtable) r0     // Catch:{ all -> 0x019b }
            java.lang.Object r0 = r0.get(r9)     // Catch:{ all -> 0x019b }
            java.util.concurrent.ConcurrentLinkedQueue r0 = (java.util.concurrent.ConcurrentLinkedQueue) r0     // Catch:{ all -> 0x019b }
        L_0x016a:
            r0.offer(r1)     // Catch:{ all -> 0x019b }
            monitor-exit(r3)     // Catch:{ all -> 0x019b }
            java.util.Map<java.lang.String, java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable>> r0 = r4.f259172h
            java.util.Hashtable r0 = (java.util.Hashtable) r0
            java.lang.Object r0 = r0.get(r9)
            if (r0 == 0) goto L_0x0190
            java.util.Map<java.lang.String, java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable>> r0 = r4.f259172h
            java.util.Hashtable r0 = (java.util.Hashtable) r0
            java.lang.Object r0 = r0.get(r9)
            java.util.concurrent.ConcurrentLinkedQueue r0 = (java.util.concurrent.ConcurrentLinkedQueue) r0
            int r0 = r0.size()
            if (r0 <= r12) goto L_0x0190
            java.lang.String r0 = "MicroMsg.AppBrandNetworkDownload"
            java.lang.String r1 = "hy: more than one same url in the queue, just add and wait"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            goto L_0x019a
        L_0x0190:
            sp0.c r0 = new sp0.c
            r0.<init>(r4, r9)
            java.lang.String r1 = "appbrand_download_thread"
            com.tencent.p014mm.sdk.thread.ThreadPool.post(r0, r1)
        L_0x019a:
            return
        L_0x019b:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x019b }
            throw r0
        L_0x019e:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x019e }
            throw r0
        L_0x01a1:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x01a1 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tl0.C90509a.mo114486c(com.tencent.mm.plugin.appbrand.jsapi.f, sp0.a, boolean, org.json.JSONObject, int, java.util.Map, sp0.d$a, java.lang.String):void");
    }

    /* renamed from: d */
    public void mo122436d(C82381f fVar, JSONObject jSONObject, String str) {
        C82381f fVar2 = fVar;
        JSONObject jSONObject2 = jSONObject;
        String str2 = str;
        Class cls = C90272a.class;
        Log.m105918d("MicroMsg.BaseCreateDownloadTask", "JsApiCreateDownloadTask");
        if (!this.f260125g.getAndSet(true)) {
            if (this.f260122d != null) {
                fVar.getAppId();
                this.f260123e = C84081q4.m103608a(3);
            }
            if (this.f260123e) {
                C90272a aVar = (C90272a) fVar2.mo109671p(cls);
                if (aVar == null) {
                    Log.m105921e("MicroMsg.BaseCreateDownloadTask", "setupRequestMode config not found, setUserCertVerify false appId(%s)", fVar.getAppId());
                    CronetLogic.setUserCertVerify(false);
                } else {
                    Log.m105925i("MicroMsg.BaseCreateDownloadTask", "setupRequestMode(%b),appId(%s)", Boolean.valueOf(aVar.f259126H), fVar.getAppId());
                    CronetLogic.setUserCertVerify(aVar.f259126H);
                }
            }
        }
        fVar.getAppId();
        C90510a aVar2 = new C90510a(jSONObject2.optString(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH), fVar2, str2);
        C90272a aVar3 = (C90272a) fVar2.mo109671p(cls);
        Map<String, String> g = C90309m.m113072g(jSONObject2, aVar3);
        String optString = jSONObject2.optString("url");
        if (Util.isNullOrNil(optString)) {
            Log.m105924i("MicroMsg.BaseCreateDownloadTask", "url is null");
            mo124673e(fVar2, str2, "url is null or nil", 600005);
            return;
        }
        boolean z = jSONObject2.optBoolean("__skipDomainCheck__") ? false : aVar3.f259128e;
        if (!z || C90309m.m113088w(aVar3.f259140t, optString, false)) {
            if (aVar3.f259136p <= 0) {
                Log.m105924i("MicroMsg.BaseCreateDownloadTask", "maxDownloadConcurrent <= 0 ");
            }
            int optInt = jSONObject2.optInt("timeout", 0);
            if (optInt <= 0) {
                optInt = C90309m.m113079n(aVar3, 3);
            }
            int i = optInt > 0 ? optInt : CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;
            Log.m105925i("MicroMsg.BaseCreateDownloadTask", "lm:configTimeout: %d,timeout: %d", Integer.valueOf(optInt), Integer.valueOf(i));
            mo114486c(fVar, aVar3, z, jSONObject, i, g, aVar2, str);
            return;
        }
        Log.m105925i("MicroMsg.BaseCreateDownloadTask", "not in domain url %s", optString);
        mo124673e(fVar2, str2, "url not in domain list", 600002);
    }

    /* renamed from: e */
    public void mo124673e(C82381f fVar, String str, String str2, int i) {
        Log.m105929w("MicroMsg.BaseCreateDownloadTask", "sendFailMsg, downloadTaskId = %s, errMsg = %s, errno = %d", str, str2, Integer.valueOf(i));
        HashMap hashMap = new HashMap();
        hashMap.put("downloadTaskId", str);
        hashMap.put("state", "fail");
        hashMap.put("errno", Integer.valueOf(i));
        hashMap.put("errMsg", str2);
        String jSONObject = new JSONObject(hashMap).toString();
        C90511b bVar = new C90511b();
        bVar.mo115161k(fVar);
        bVar.mo115163m(jSONObject);
        bVar.mo115159i(this.f260124f.mo122426a(str));
    }

    public String getTaskId() {
        StringBuilder sb = new StringBuilder();
        AtomicInteger atomicInteger = C90283e.f259174b;
        C90283e.C90285b.f259176a.getClass();
        sb.append(C90283e.f259174b.incrementAndGet());
        sb.append("");
        return sb.toString();
    }
}
