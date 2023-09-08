package tg3;

import android.os.AsyncTask;
import android.os.Looper;
import android.os.Message;
import com.tencent.p014mm.sandbox.monitor.C85705h;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import p206nj.C88955f;
import p206nj.C88956h;
import rg3.C89963b;
import te3.C49335eu3;

/* renamed from: tg3.q */
public class C90485q extends C85705h {

    /* renamed from: g */
    public String[] f260052g;

    /* renamed from: h */
    public C90488c f260053h = null;

    /* renamed from: i */
    public C89963b.C89964a f260054i;

    /* renamed from: j */
    public int f260055j = 0;

    /* renamed from: k */
    public boolean f260056k = false;

    /* renamed from: l */
    public String f260057l;

    /* renamed from: m */
    public String f260058m;

    /* renamed from: n */
    public boolean f260059n = false;

    /* renamed from: o */
    public MMHandler f260060o = new C90486a();

    /* renamed from: p */
    public C89963b.C89964a f260061p = new C90487b();

    /* renamed from: tg3.q$a */
    public class C90486a extends MMHandler {
        public C90486a() {
        }

        public void handleMessage(Message message) {
            if (1 == message.what) {
                C90485q qVar = C90485q.this;
                if (!qVar.f260059n) {
                    C86013q1.m106447h(qVar.mo119309f());
                    int i = message.arg1;
                    if (i == 0) {
                        Log.m105918d("MicroMsg.NetSceneGetUpdatePackFromCDN", "patch ok");
                        C90485q.this.f260054i.mo124303d(200, 0, (C49335eu3) message.obj);
                    } else if (i == 3) {
                        C90485q.this.f260054i.mo124303d(3, -1, (C49335eu3) message.obj);
                    } else if (i == 4) {
                        C90485q.this.f260054i.mo124303d(4, -1, (C49335eu3) message.obj);
                    }
                }
            }
            super.handleMessage(message);
        }
    }

    /* renamed from: tg3.q$b */
    public class C90487b implements C89963b.C89964a {
        public C90487b() {
        }

        /* renamed from: a */
        public void mo124302a(int i, int i2) {
            Log.m105918d("MicroMsg.NetSceneGetUpdatePackFromCDN", "progress, total=" + i + ", offset=" + i2);
            C90485q.this.f260054i.mo124302a(i, i2);
        }

        /* renamed from: b */
        public void mo124298b(long j) {
            C90485q.this.f260054i.mo124298b(j);
        }

        /* renamed from: c */
        public void mo124299c(long j) {
            C90485q.this.f260054i.mo124299c(j);
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x005d A[Catch:{ Exception -> 0x00fd }] */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x006b A[Catch:{ Exception -> 0x00fd }] */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo124303d(int r6, int r7, te3.C49335eu3 r8) {
            /*
                r5 = this;
                java.lang.String r7 = "MicroMsg.NetSceneGetUpdatePackFromCDN"
                if (r6 == 0) goto L_0x0034
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r0 = "scene error. netRet="
                r8.append(r0)
                r8.append(r6)
                java.lang.String r8 = r8.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r8)
                r7 = -2
                if (r6 != r7) goto L_0x0025
                tg3.q r6 = tg3.C90485q.this
                java.lang.String r6 = r6.mo119309f()
                com.tencent.p014mm.vfs.C86013q1.m106447h(r6)
            L_0x0025:
                tg3.q r6 = tg3.C90485q.this
                int r7 = r6.f260055j
                int r7 = r7 + 1
                r6.f260055j = r7
                rg3.b$a r7 = r6.f260054i
                r6.mo124300a(r7)
                goto L_0x0111
            L_0x0034:
                java.lang.String r6 = "scene success"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
                r6 = -1
                r0 = 0
                tg3.q r1 = tg3.C90485q.this     // Catch:{ Exception -> 0x00fd }
                java.lang.String r1 = r1.mo119309f()     // Catch:{ Exception -> 0x00fd }
                if (r1 != 0) goto L_0x0046
            L_0x0044:
                r2 = 0
                goto L_0x0057
            L_0x0046:
                java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x00fd }
                r2.<init>(r1)     // Catch:{ Exception -> 0x00fd }
                boolean r1 = r2.exists()     // Catch:{ Exception -> 0x00fd }
                if (r1 != 0) goto L_0x0052
                goto L_0x0044
            L_0x0052:
                long r1 = r2.length()     // Catch:{ Exception -> 0x00fd }
                int r2 = (int) r1     // Catch:{ Exception -> 0x00fd }
            L_0x0057:
                tg3.q r1 = tg3.C90485q.this     // Catch:{ Exception -> 0x00fd }
                int r3 = r1.f249724b     // Catch:{ Exception -> 0x00fd }
                if (r2 >= r3) goto L_0x006b
                java.lang.String r1 = "scene continue;"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)     // Catch:{ Exception -> 0x00fd }
                tg3.q r1 = tg3.C90485q.this     // Catch:{ Exception -> 0x00fd }
                rg3.b$a r2 = r1.f260054i     // Catch:{ Exception -> 0x00fd }
                r1.mo124300a(r2)     // Catch:{ Exception -> 0x00fd }
                return
            L_0x006b:
                boolean r2 = r1.f260056k     // Catch:{ Exception -> 0x00fd }
                if (r2 == 0) goto L_0x009d
                java.lang.String r2 = r1.f260057l     // Catch:{ Exception -> 0x00fd }
                java.lang.String r1 = r1.mo119309f()     // Catch:{ Exception -> 0x00fd }
                java.lang.String r1 = tg3.C90492s.m113305a(r1)     // Catch:{ Exception -> 0x00fd }
                boolean r1 = r2.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x00fd }
                if (r1 != 0) goto L_0x0097
                java.lang.String r1 = "pack md5 check error"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r1)     // Catch:{ Exception -> 0x00fd }
                tg3.q r1 = tg3.C90485q.this     // Catch:{ Exception -> 0x00fd }
                java.lang.String r1 = r1.mo119309f()     // Catch:{ Exception -> 0x00fd }
                com.tencent.p014mm.vfs.C86013q1.m106447h(r1)     // Catch:{ Exception -> 0x00fd }
                tg3.q r1 = tg3.C90485q.this     // Catch:{ Exception -> 0x00fd }
                rg3.b$a r1 = r1.f260054i     // Catch:{ Exception -> 0x00fd }
                r2 = 2
                r1.mo124303d(r2, r6, r8)     // Catch:{ Exception -> 0x00fd }
                return
            L_0x0097:
                tg3.q r1 = tg3.C90485q.this     // Catch:{ Exception -> 0x00fd }
                tg3.C90485q.m113296h(r1, r8)     // Catch:{ Exception -> 0x00fd }
                return
            L_0x009d:
                java.lang.String r2 = r1.f249726d     // Catch:{ Exception -> 0x00fd }
                java.lang.String r1 = r1.mo119309f()     // Catch:{ Exception -> 0x00fd }
                java.lang.String r1 = tg3.C90492s.m113305a(r1)     // Catch:{ Exception -> 0x00fd }
                boolean r1 = r2.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x00fd }
                if (r1 != 0) goto L_0x00c4
                java.lang.String r1 = "update pack check error"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r1)     // Catch:{ Exception -> 0x00fd }
                tg3.q r1 = tg3.C90485q.this     // Catch:{ Exception -> 0x00fd }
                java.lang.String r1 = r1.mo119309f()     // Catch:{ Exception -> 0x00fd }
                com.tencent.p014mm.vfs.C86013q1.m106447h(r1)     // Catch:{ Exception -> 0x00fd }
                tg3.q r1 = tg3.C90485q.this     // Catch:{ Exception -> 0x00fd }
                rg3.b$a r1 = r1.f260054i     // Catch:{ Exception -> 0x00fd }
                r1.mo124303d(r6, r6, r8)     // Catch:{ Exception -> 0x00fd }
                return
            L_0x00c4:
                java.lang.String r1 = com.tencent.p014mm.sandbox.monitor.C85705h.f249722f     // Catch:{ Exception -> 0x00fd }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00fd }
                r2.<init>()     // Catch:{ Exception -> 0x00fd }
                tg3.q r3 = tg3.C90485q.this     // Catch:{ Exception -> 0x00fd }
                java.lang.String r3 = r3.f249726d     // Catch:{ Exception -> 0x00fd }
                r2.append(r3)     // Catch:{ Exception -> 0x00fd }
                java.lang.String r3 = ".temp"
                r2.append(r3)     // Catch:{ Exception -> 0x00fd }
                java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00fd }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00fd }
                r3.<init>()     // Catch:{ Exception -> 0x00fd }
                tg3.q r4 = tg3.C90485q.this     // Catch:{ Exception -> 0x00fd }
                java.lang.String r4 = r4.f249726d     // Catch:{ Exception -> 0x00fd }
                r3.append(r4)     // Catch:{ Exception -> 0x00fd }
                java.lang.String r4 = ".apk"
                r3.append(r4)     // Catch:{ Exception -> 0x00fd }
                java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00fd }
                tg3.C90492s.m113306b(r1, r2, r3)     // Catch:{ Exception -> 0x00fd }
                tg3.q r1 = tg3.C90485q.this     // Catch:{ Exception -> 0x00fd }
                rg3.b$a r1 = r1.f260054i     // Catch:{ Exception -> 0x00fd }
                r2 = 200(0xc8, float:2.8E-43)
                r1.mo124303d(r2, r0, r8)     // Catch:{ Exception -> 0x00fd }
                goto L_0x0111
            L_0x00fd:
                r1 = move-exception
                java.lang.String r2 = "error occured during pack processing"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r2)
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r2 = ""
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r1, r2, r0)
                tg3.q r7 = tg3.C90485q.this
                rg3.b$a r7 = r7.f260054i
                r7.mo124303d(r6, r6, r8)
            L_0x0111:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: tg3.C90485q.C90487b.mo124303d(int, int, te3.eu3):void");
        }
    }

    public C90485q(int i, String str, int i2, String[] strArr, boolean z) {
        super(i, str, i2, z);
        this.f260052g = strArr;
    }

    /* renamed from: h */
    public static void m113296h(C90485q qVar, C49335eu3 eu32) {
        qVar.getClass();
        try {
            Log.m105918d("MicroMsg.NetSceneGetUpdatePackFromCDN", "in genNewAPKInNewThread()");
            ThreadPool.post(new C90491r(qVar, eu32), "NetSceneGetUpdatePackFromCDN_genApk");
        } catch (Exception e) {
            Log.m105920e("MicroMsg.NetSceneGetUpdatePackFromCDN", "exception in genNewAPKInNewThread()");
            Log.printErrStackTrace("MicroMsg.NetSceneGetUpdatePackFromCDN", e, "", new Object[0]);
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.arg1 = 3;
            obtain.obj = eu32;
            qVar.f260060o.sendMessage(obtain);
        }
    }

    /* renamed from: a */
    public void mo124300a(C89963b.C89964a aVar) {
        int i;
        this.f260054i = aVar;
        if (!C88956h.m111062c().equals("mounted")) {
            Log.m105920e("MicroMsg.NetSceneGetUpdatePackFromCDN", "SDCard not available.");
            aVar.mo124303d(-1, -1, (C49335eu3) null);
        } else if (this.f260059n) {
            Log.m105920e("MicroMsg.NetSceneGetUpdatePackFromCDN", "netscene had been canceled.");
            aVar.mo124303d(-1, -1, (C49335eu3) null);
        } else {
            if ((this.f249727e ? !NetStatusUtil.isWifi(MMApplicationContext.getContext()) : false) || mo124656i() >= this.f260052g.length) {
                Log.m105920e("MicroMsg.NetSceneGetUpdatePackFromCDN", "exceed max download url. url count = " + this.f260052g.length);
                if (this.f260056k) {
                    aVar.mo124303d(1, -1, (C49335eu3) null);
                } else {
                    aVar.mo124303d(-1, -1, (C49335eu3) null);
                }
            } else if (!C88955f.m111059c((long) this.f249724b)) {
                Log.m105920e("MicroMsg.NetSceneGetUpdatePackFromCDN", "SDCard full");
                if (this.f260056k) {
                    aVar.mo124303d(13, -1, (C49335eu3) null);
                } else {
                    aVar.mo124303d(-1, -1, (C49335eu3) null);
                }
            } else {
                int i2 = this.f249724b;
                String f = mo119309f();
                if (f != null) {
                    File file = new File(f);
                    if (file.exists()) {
                        i = (int) file.length();
                        C90488c cVar = new C90488c(i2, i, this.f260061p);
                        this.f260053h = cVar;
                        cVar.execute(new String[]{this.f260052g[mo124656i()]});
                    }
                }
                i = 0;
                C90488c cVar2 = new C90488c(i2, i, this.f260061p);
                this.f260053h = cVar2;
                cVar2.execute(new String[]{this.f260052g[mo124656i()]});
            }
        }
    }

    /* renamed from: c */
    public String mo119308c() {
        if (this.f260056k) {
            return C85705h.f249722f + this.f260058m + ".apk";
        }
        return C85705h.f249722f + this.f249726d + ".apk";
    }

    public void cancel() {
        Log.m105918d("MicroMsg.NetSceneGetUpdatePackFromCDN", "cancel netscene");
        this.f260059n = true;
        C90488c cVar = this.f260053h;
        if (cVar != null && !cVar.isCancelled()) {
            this.f260053h.cancel(true);
        }
    }

    /* renamed from: f */
    public String mo119309f() {
        if (!this.f260056k) {
            return super.mo119309f();
        }
        return C85705h.f249722f + this.f260057l + ".temp";
    }

    /* renamed from: i */
    public final int mo124656i() {
        Log.m105924i("MicroMsg.NetSceneGetUpdatePackFromCDN", "requestCount=" + this.f260055j + ", curLinkIdx = " + (this.f260055j / 5));
        return this.f260055j / 5;
    }

    public C90485q(int i, String str, int i2, String str2, String str3, String str4, boolean z) {
        super(i, str, i2, z);
        this.f260052g = new String[]{str2};
        this.f260056k = true;
        this.f260057l = str3;
        this.f260058m = str4;
    }

    /* renamed from: tg3.q$c */
    public class C90488c extends AsyncTask<String, Integer, Integer> {

        /* renamed from: a */
        public int f260064a;

        /* renamed from: b */
        public int f260065b;

        /* renamed from: c */
        public C89963b.C89964a f260066c;

        /* renamed from: d */
        public HttpClient f260067d = null;

        /* renamed from: e */
        public HttpGet f260068e = null;

        /* renamed from: f */
        public HttpResponse f260069f = null;

        /* renamed from: g */
        public HttpEntity f260070g = null;

        /* renamed from: h */
        public OutputStream f260071h = new C90489a();

        public C90488c(int i, int i2, C89963b.C89964a aVar) {
            this.f260064a = i;
            this.f260065b = i2;
            this.f260066c = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:104:0x01c1, code lost:
            if (r12 == null) goto L_0x01e6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x00d4, code lost:
            if (r12 != null) goto L_0x00d6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d6, code lost:
            r12.getConnectionManager().shutdown();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f6, code lost:
            if (r12 != null) goto L_0x00d6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x012f, code lost:
            if (r12 != null) goto L_0x00d6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x0166, code lost:
            if (r12 != null) goto L_0x00d6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:0x0197, code lost:
            if (r12 != null) goto L_0x00d6;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object doInBackground(java.lang.Object[] r12) {
            /*
                r11 = this;
                java.lang.String[] r12 = (java.lang.String[]) r12
                r0 = 0
                r12 = r12[r0]
                r1 = -1
                java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
                if (r12 == 0) goto L_0x01e6
                int r3 = r12.length()
                if (r3 != 0) goto L_0x0014
                goto L_0x01e6
            L_0x0014:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "current download url="
                r3.append(r4)
                r3.append(r12)
                java.lang.String r4 = ", range="
                r3.append(r4)
                int r4 = r11.f260065b
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                java.lang.String r4 = "MicroMsg.NetSceneGetUpdatePackFromCDN"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
                org.apache.http.client.HttpClient r3 = com.tencent.p014mm.network.C81035d.m98962c()
                r11.f260067d = r3
                org.apache.http.params.HttpParams r3 = r3.getParams()
                r5 = 15000(0x3a98, float:2.102E-41)
                java.lang.String r6 = "http.connection.timeout"
                r3.setIntParameter(r6, r5)
                org.apache.http.client.methods.HttpGet r3 = new org.apache.http.client.methods.HttpGet
                r3.<init>(r12)
                r11.f260068e = r3
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r5 = "bytes="
                r12.append(r5)
                int r5 = r11.f260065b
                r12.append(r5)
                java.lang.String r5 = "-"
                r12.append(r5)
                int r5 = r11.f260064a
                int r6 = r11.f260065b
                int r5 = r5 - r6
                r7 = 1048576(0x100000, float:1.469368E-39)
                java.lang.String r8 = ""
                if (r5 <= r7) goto L_0x0072
                int r6 = r6 + r7
                int r6 = r6 + r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
                goto L_0x0073
            L_0x0072:
                r1 = r8
            L_0x0073:
                r12.append(r1)
                java.lang.String r12 = r12.toString()
                java.lang.String r1 = "RANGE"
                r3.addHeader(r1, r12)
                r5 = 50
                rg3.b$a r12 = r11.f260066c     // Catch:{ Exception -> 0x019d }
                r12.mo124298b(r5)     // Catch:{ Exception -> 0x019d }
                org.apache.http.client.HttpClient r12 = r11.f260067d     // Catch:{ Exception -> 0x019d }
                org.apache.http.client.methods.HttpGet r1 = r11.f260068e     // Catch:{ Exception -> 0x019d }
                org.apache.http.HttpResponse r12 = r12.execute(r1)     // Catch:{ Exception -> 0x019d }
                r11.f260069f = r12     // Catch:{ Exception -> 0x019d }
                org.apache.http.StatusLine r12 = r12.getStatusLine()     // Catch:{ Exception -> 0x019d }
                int r12 = r12.getStatusCode()     // Catch:{ Exception -> 0x019d }
                r1 = 200(0xc8, float:2.8E-43)
                r3 = -2
                if (r12 == r1) goto L_0x00f9
                r1 = 206(0xce, float:2.89E-43)
                if (r12 == r1) goto L_0x00f9
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x019d }
                r1.<init>()     // Catch:{ Exception -> 0x019d }
                java.lang.String r5 = "HttpClient return code:"
                r1.append(r5)     // Catch:{ Exception -> 0x019d }
                r1.append(r12)     // Catch:{ Exception -> 0x019d }
                java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x019d }
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r1)     // Catch:{ Exception -> 0x019d }
                r1 = 416(0x1a0, float:5.83E-43)
                if (r12 != r1) goto L_0x00df
                java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x019d }
                org.apache.http.client.methods.HttpGet r12 = r11.f260068e
                if (r12 == 0) goto L_0x00c4
                r12.abort()
            L_0x00c4:
                org.apache.http.HttpEntity r12 = r11.f260070g
                if (r12 == 0) goto L_0x00d2
                r12.consumeContent()     // Catch:{ IOException -> 0x00cc }
                goto L_0x00d2
            L_0x00cc:
                r12 = move-exception
                java.lang.Object[] r0 = new java.lang.Object[r0]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r12, r8, r0)
            L_0x00d2:
                org.apache.http.client.HttpClient r12 = r11.f260067d
                if (r12 == 0) goto L_0x01e6
            L_0x00d6:
                org.apache.http.conn.ClientConnectionManager r12 = r12.getConnectionManager()
                r12.shutdown()
                goto L_0x01e6
            L_0x00df:
                org.apache.http.client.methods.HttpGet r12 = r11.f260068e
                if (r12 == 0) goto L_0x00e6
                r12.abort()
            L_0x00e6:
                org.apache.http.HttpEntity r12 = r11.f260070g
                if (r12 == 0) goto L_0x00f4
                r12.consumeContent()     // Catch:{ IOException -> 0x00ee }
                goto L_0x00f4
            L_0x00ee:
                r12 = move-exception
                java.lang.Object[] r0 = new java.lang.Object[r0]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r12, r8, r0)
            L_0x00f4:
                org.apache.http.client.HttpClient r12 = r11.f260067d
                if (r12 == 0) goto L_0x01e6
                goto L_0x00d6
            L_0x00f9:
                tg3.q r12 = tg3.C90485q.this     // Catch:{ Exception -> 0x019d }
                boolean r12 = r12.f260056k     // Catch:{ Exception -> 0x019d }
                if (r12 == 0) goto L_0x0132
                boolean r12 = sf0.C90188n0.f258941i     // Catch:{ Exception -> 0x019d }
                if (r12 == 0) goto L_0x0132
                double r5 = java.lang.Math.random()     // Catch:{ Exception -> 0x019d }
                r9 = 4596373779694328218(0x3fc999999999999a, double:0.2)
                int r12 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
                if (r12 <= 0) goto L_0x0132
                java.lang.String r12 = "simulateNetworkFault"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r12)     // Catch:{ Exception -> 0x019d }
                org.apache.http.client.methods.HttpGet r12 = r11.f260068e
                if (r12 == 0) goto L_0x011f
                r12.abort()
            L_0x011f:
                org.apache.http.HttpEntity r12 = r11.f260070g
                if (r12 == 0) goto L_0x012d
                r12.consumeContent()     // Catch:{ IOException -> 0x0127 }
                goto L_0x012d
            L_0x0127:
                r12 = move-exception
                java.lang.Object[] r0 = new java.lang.Object[r0]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r12, r8, r0)
            L_0x012d:
                org.apache.http.client.HttpClient r12 = r11.f260067d
                if (r12 == 0) goto L_0x01e6
                goto L_0x00d6
            L_0x0132:
                org.apache.http.HttpResponse r12 = r11.f260069f     // Catch:{ Exception -> 0x019d }
                java.lang.String r1 = "Content-Length"
                org.apache.http.Header[] r12 = r12.getHeaders(r1)     // Catch:{ Exception -> 0x019d }
                int r1 = r12.length     // Catch:{ Exception -> 0x019d }
                if (r1 <= 0) goto L_0x013f
                r12 = r12[r0]     // Catch:{ Exception -> 0x019d }
            L_0x013f:
                int r12 = r11.f260065b     // Catch:{ Exception -> 0x019d }
                int r1 = r11.f260064a     // Catch:{ Exception -> 0x019d }
                if (r12 <= r1) goto L_0x016a
                java.lang.String r12 = "range out of size"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r12)     // Catch:{ Exception -> 0x019d }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x019d }
                org.apache.http.client.methods.HttpGet r12 = r11.f260068e
                if (r12 == 0) goto L_0x0156
                r12.abort()
            L_0x0156:
                org.apache.http.HttpEntity r12 = r11.f260070g
                if (r12 == 0) goto L_0x0164
                r12.consumeContent()     // Catch:{ IOException -> 0x015e }
                goto L_0x0164
            L_0x015e:
                r12 = move-exception
                java.lang.Object[] r0 = new java.lang.Object[r0]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r12, r8, r0)
            L_0x0164:
                org.apache.http.client.HttpClient r12 = r11.f260067d
                if (r12 == 0) goto L_0x01e6
                goto L_0x00d6
            L_0x016a:
                org.apache.http.HttpResponse r12 = r11.f260069f     // Catch:{ Exception -> 0x019d }
                org.apache.http.HttpEntity r12 = r12.getEntity()     // Catch:{ Exception -> 0x019d }
                r11.f260070g = r12     // Catch:{ Exception -> 0x019d }
                java.io.OutputStream r1 = r11.f260071h     // Catch:{ Exception -> 0x019d }
                r12.writeTo(r1)     // Catch:{ Exception -> 0x019d }
                org.apache.http.HttpEntity r12 = r11.f260070g     // Catch:{ Exception -> 0x019d }
                r12.consumeContent()     // Catch:{ Exception -> 0x019d }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x019d }
                org.apache.http.client.methods.HttpGet r12 = r11.f260068e
                if (r12 == 0) goto L_0x0187
                r12.abort()
            L_0x0187:
                org.apache.http.HttpEntity r12 = r11.f260070g
                if (r12 == 0) goto L_0x0195
                r12.consumeContent()     // Catch:{ IOException -> 0x018f }
                goto L_0x0195
            L_0x018f:
                r12 = move-exception
                java.lang.Object[] r0 = new java.lang.Object[r0]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r12, r8, r0)
            L_0x0195:
                org.apache.http.client.HttpClient r12 = r11.f260067d
                if (r12 == 0) goto L_0x01e6
                goto L_0x00d6
            L_0x019b:
                r12 = move-exception
                goto L_0x01c5
            L_0x019d:
                r12 = move-exception
                java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x019b }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r12, r8, r1)     // Catch:{ all -> 0x019b }
                java.lang.String r1 = "exception current in download pack"
                java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ all -> 0x019b }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r12, r1, r3)     // Catch:{ all -> 0x019b }
                org.apache.http.client.methods.HttpGet r12 = r11.f260068e
                if (r12 == 0) goto L_0x01b1
                r12.abort()
            L_0x01b1:
                org.apache.http.HttpEntity r12 = r11.f260070g
                if (r12 == 0) goto L_0x01bf
                r12.consumeContent()     // Catch:{ IOException -> 0x01b9 }
                goto L_0x01bf
            L_0x01b9:
                r12 = move-exception
                java.lang.Object[] r0 = new java.lang.Object[r0]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r12, r8, r0)
            L_0x01bf:
                org.apache.http.client.HttpClient r12 = r11.f260067d
                if (r12 == 0) goto L_0x01e6
                goto L_0x00d6
            L_0x01c5:
                org.apache.http.client.methods.HttpGet r1 = r11.f260068e
                if (r1 == 0) goto L_0x01cc
                r1.abort()
            L_0x01cc:
                org.apache.http.HttpEntity r1 = r11.f260070g
                if (r1 == 0) goto L_0x01da
                r1.consumeContent()     // Catch:{ IOException -> 0x01d4 }
                goto L_0x01da
            L_0x01d4:
                r1 = move-exception
                java.lang.Object[] r0 = new java.lang.Object[r0]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r1, r8, r0)
            L_0x01da:
                org.apache.http.client.HttpClient r0 = r11.f260067d
                if (r0 == 0) goto L_0x01e5
                org.apache.http.conn.ClientConnectionManager r0 = r0.getConnectionManager()
                r0.shutdown()
            L_0x01e5:
                throw r12
            L_0x01e6:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: tg3.C90485q.C90488c.doInBackground(java.lang.Object[]):java.lang.Object");
        }

        public void onCancelled() {
            Log.m105918d("MicroMsg.NetSceneGetUpdatePackFromCDN", "AsyncTask had been canceled.");
            HttpGet httpGet = this.f260068e;
            if (httpGet != null) {
                httpGet.abort();
            }
            HttpEntity httpEntity = this.f260070g;
            if (httpEntity != null) {
                try {
                    httpEntity.consumeContent();
                } catch (IOException e) {
                    Log.printErrStackTrace("MicroMsg.NetSceneGetUpdatePackFromCDN", e, "", new Object[0]);
                }
            }
            if (this.f260067d != null) {
                Log.m105918d("MicroMsg.NetSceneGetUpdatePackFromCDN", "connection shutdown.");
                this.f260067d.getConnectionManager().shutdown();
            }
        }

        public void onPostExecute(Object obj) {
            this.f260066c.mo124303d(((Integer) obj).intValue(), 0, (C49335eu3) null);
        }

        /* renamed from: tg3.q$c$a */
        public class C90489a extends OutputStream {

            /* renamed from: d */
            public MMHandler f260073d = new MMHandler(Looper.getMainLooper());

            /* renamed from: e */
            public ByteArrayOutputStream f260074e = new ByteArrayOutputStream();

            /* renamed from: tg3.q$c$a$a */
            public class C90490a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ int f260076d;

                public C90490a(int i) {
                    this.f260076d = i;
                }

                public void run() {
                    C90488c cVar = C90488c.this;
                    int i = cVar.f260065b;
                    int i2 = cVar.f260064a;
                    if (i <= i2) {
                        cVar.f260066c.mo124302a(i2, i);
                    }
                    C90488c.this.f260066c.mo124299c((long) this.f260076d);
                }
            }

            public C90489a() {
            }

            /* JADX WARNING: Removed duplicated region for block: B:30:0x00da A[SYNTHETIC, Splitter:B:30:0x00da] */
            /* JADX WARNING: Removed duplicated region for block: B:37:0x011a A[SYNTHETIC, Splitter:B:37:0x011a] */
            /* JADX WARNING: Removed duplicated region for block: B:45:0x015a  */
            /* JADX WARNING: Removed duplicated region for block: B:50:0x017c  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void write(byte[] r19, int r20, int r21) {
                /*
                    r18 = this;
                    r1 = r18
                    java.io.ByteArrayOutputStream r0 = r1.f260074e
                    r2 = r19
                    r3 = r20
                    r4 = r21
                    r0.write(r2, r3, r4)
                    java.io.ByteArrayOutputStream r0 = r1.f260074e
                    int r0 = r0.size()
                    r2 = 131072(0x20000, float:1.83671E-40)
                    if (r0 >= r2) goto L_0x0029
                    tg3.q$c r0 = tg3.C90485q.C90488c.this
                    int r0 = r0.f260065b
                    java.io.ByteArrayOutputStream r2 = r1.f260074e
                    int r2 = r2.size()
                    int r0 = r0 + r2
                    tg3.q$c r2 = tg3.C90485q.C90488c.this
                    int r2 = r2.f260064a
                    if (r0 >= r2) goto L_0x0029
                    return
                L_0x0029:
                    java.io.ByteArrayOutputStream r0 = r1.f260074e
                    int r2 = r0.size()
                    tg3.q$c r0 = tg3.C90485q.C90488c.this
                    tg3.q r0 = tg3.C90485q.this
                    java.lang.String r3 = r0.mo119309f()
                    java.io.ByteArrayOutputStream r0 = r1.f260074e
                    byte[] r4 = r0.toByteArray()
                    java.lang.String r5 = "file op appendToFile close e type:%s, e msg:%s, fileName:%s, buf len:%d, bufOffset:%d, writeLen:%d"
                    java.lang.String r6 = ""
                    java.lang.String r7 = "MicroMsg.CrashFileOperatioin"
                    r8 = 0
                    if (r4 == 0) goto L_0x0152
                    int r0 = r4.length
                    if (r0 == 0) goto L_0x0152
                    int r0 = r4.length
                    int r9 = r8 + r2
                    if (r0 >= r9) goto L_0x0050
                    goto L_0x0152
                L_0x0050:
                    r9 = 3
                    r10 = 2
                    r11 = 6
                    r12 = 1
                    r14 = 4
                    r15 = 5
                    java.io.FileOutputStream r13 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00a0, all -> 0x009b }
                    r13.<init>(r3, r12)     // Catch:{ Exception -> 0x00a0, all -> 0x009b }
                    r13.write(r4, r8, r2)     // Catch:{ Exception -> 0x0099 }
                    r13.close()     // Catch:{ IOException -> 0x0063 }
                    goto L_0x0153
                L_0x0063:
                    r0 = move-exception
                    r13 = r0
                    java.lang.Object[] r0 = new java.lang.Object[r8]
                    com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r13, r6, r0)
                    java.lang.Object[] r0 = new java.lang.Object[r11]
                    java.lang.Class r6 = r13.getClass()
                    java.lang.String r6 = r6.getSimpleName()
                    r0[r8] = r6
                    java.lang.String r6 = r13.getMessage()
                    r0[r12] = r6
                    r0[r10] = r3
                    int r3 = r4.length
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                    r0[r9] = r3
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
                    r0[r14] = r3
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
                    r0[r15] = r3
                    com.tencent.p014mm.sdk.platformtools.Log.m105929w(r7, r5, r0)
                    goto L_0x0153
                L_0x0096:
                    r0 = move-exception
                    goto L_0x0113
                L_0x0099:
                    r0 = move-exception
                    goto L_0x00a2
                L_0x009b:
                    r0 = move-exception
                    r13 = r0
                    r0 = 0
                    goto L_0x0118
                L_0x00a0:
                    r0 = move-exception
                    r13 = 0
                L_0x00a2:
                    java.lang.Object[] r15 = new java.lang.Object[r8]     // Catch:{ all -> 0x0096 }
                    com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r6, r15)     // Catch:{ all -> 0x0096 }
                    java.lang.String r15 = "file op appendToFile e type:%s, e msg:%s, fileName:%s, buf len:%d, bufOffset:%d, writeLen:%d"
                    java.lang.Object[] r14 = new java.lang.Object[r11]     // Catch:{ all -> 0x0096 }
                    java.lang.Class r16 = r0.getClass()     // Catch:{ all -> 0x0096 }
                    java.lang.String r16 = r16.getSimpleName()     // Catch:{ all -> 0x0096 }
                    r14[r8] = r16     // Catch:{ all -> 0x0096 }
                    java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0096 }
                    r14[r12] = r0     // Catch:{ all -> 0x0096 }
                    r14[r10] = r3     // Catch:{ all -> 0x0096 }
                    int r0 = r4.length     // Catch:{ all -> 0x0096 }
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0096 }
                    r14[r9] = r0     // Catch:{ all -> 0x0096 }
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0096 }
                    r16 = 4
                    r14[r16] = r0     // Catch:{ all -> 0x0096 }
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0096 }
                    r16 = 5
                    r14[r16] = r0     // Catch:{ all -> 0x0096 }
                    com.tencent.p014mm.sdk.platformtools.Log.m105929w(r7, r15, r14)     // Catch:{ all -> 0x0096 }
                    r14 = -1
                    if (r13 == 0) goto L_0x0111
                    r13.close()     // Catch:{ IOException -> 0x00de }
                    goto L_0x0111
                L_0x00de:
                    r0 = move-exception
                    r13 = r0
                    java.lang.Object[] r0 = new java.lang.Object[r8]
                    com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r13, r6, r0)
                    java.lang.Object[] r0 = new java.lang.Object[r11]
                    java.lang.Class r6 = r13.getClass()
                    java.lang.String r6 = r6.getSimpleName()
                    r0[r8] = r6
                    java.lang.String r6 = r13.getMessage()
                    r0[r12] = r6
                    r0[r10] = r3
                    int r3 = r4.length
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                    r0[r9] = r3
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
                    r4 = 4
                    r0[r4] = r3
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
                    r4 = 5
                    r0[r4] = r3
                    com.tencent.p014mm.sdk.platformtools.Log.m105929w(r7, r5, r0)
                L_0x0111:
                    r8 = -1
                    goto L_0x0153
                L_0x0113:
                    r17 = r13
                    r13 = r0
                    r0 = r17
                L_0x0118:
                    if (r0 == 0) goto L_0x0151
                    r0.close()     // Catch:{ IOException -> 0x011e }
                    goto L_0x0151
                L_0x011e:
                    r0 = move-exception
                    r14 = r0
                    java.lang.Object[] r0 = new java.lang.Object[r8]
                    com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r14, r6, r0)
                    java.lang.Object[] r0 = new java.lang.Object[r11]
                    java.lang.Class r6 = r14.getClass()
                    java.lang.String r6 = r6.getSimpleName()
                    r0[r8] = r6
                    java.lang.String r6 = r14.getMessage()
                    r0[r12] = r6
                    r0[r10] = r3
                    int r3 = r4.length
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                    r0[r9] = r3
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
                    r4 = 4
                    r0[r4] = r3
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                    r3 = 5
                    r0[r3] = r2
                    com.tencent.p014mm.sdk.platformtools.Log.m105929w(r7, r5, r0)
                L_0x0151:
                    throw r13
                L_0x0152:
                    r8 = -2
                L_0x0153:
                    java.io.ByteArrayOutputStream r0 = r1.f260074e
                    r0.reset()
                    if (r8 != 0) goto L_0x017c
                    tg3.q$c r0 = tg3.C90485q.C90488c.this
                    int r3 = r0.f260065b
                    int r3 = r3 + r2
                    r0.f260065b = r3
                    com.tencent.mm.sdk.platformtools.MMHandler r0 = r1.f260073d
                    tg3.q$c$a$a r3 = new tg3.q$c$a$a
                    r3.<init>(r2)
                    r0.post(r3)
                    tg3.q$c r0 = tg3.C90485q.C90488c.this
                    tg3.q r0 = tg3.C90485q.this
                    boolean r0 = r0.f260059n
                    if (r0 != 0) goto L_0x0174
                    return
                L_0x0174:
                    java.io.IOException r0 = new java.io.IOException
                    java.lang.String r2 = "manual force cancel!"
                    r0.<init>(r2)
                    throw r0
                L_0x017c:
                    java.io.IOException r0 = new java.io.IOException
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r3 = "appendToFile failed :"
                    r2.append(r3)
                    r2.append(r8)
                    java.lang.String r2 = r2.toString()
                    r0.<init>(r2)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: tg3.C90485q.C90488c.C90489a.write(byte[], int, int):void");
            }

            public void write(int i) {
                throw new IOException("unexpected operation");
            }
        }
    }
}
