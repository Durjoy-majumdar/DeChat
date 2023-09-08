package kd0;

import android.content.Context;
import android.media.AudioTrack;
import android.media.MediaPlayer;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.qqpinyin.voicerecoapi.C19979a;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import lu3.C34379c;
import lu3.C88656g;
import p156gj.C107823c;
import p156gj.C107835h0;
import p206nj.C100115c;
import p331dj.C107045e;
import p375qh.C22086d;
import p492dn.C45427v;
import pu0.C110248b;
import qu0.C110472b;
import zn0.C91807d;
import zt3.C119157j;

/* renamed from: kd0.r */
public class C21329r implements C22086d {

    /* renamed from: a */
    public AudioTrack f60275a;

    /* renamed from: b */
    public String f60276b;

    /* renamed from: c */
    public C22086d.C22087a f60277c;

    /* renamed from: d */
    public C22086d.C22088b f60278d;

    /* renamed from: e */
    public volatile int f60279e;

    /* renamed from: f */
    public int f60280f;

    /* renamed from: g */
    public C34379c f60281g;

    /* renamed from: h */
    public C19979a f60282h;

    /* renamed from: i */
    public MediaPlayer.OnCompletionListener f60283i;

    /* renamed from: j */
    public MediaPlayer.OnErrorListener f60284j;

    /* renamed from: k */
    public int f60285k;

    /* renamed from: l */
    public C100115c f60286l;

    /* renamed from: m */
    public boolean f60287m;

    /* renamed from: n */
    public boolean f60288n;

    /* renamed from: o */
    public byte[] f60289o;

    /* renamed from: p */
    public int f60290p;

    /* renamed from: q */
    public InputStream f60291q;

    /* renamed from: r */
    public int f60292r;

    /* renamed from: kd0.r$a */
    public class C21330a implements C88656g {
        public C21330a() {
        }

        public String getKey() {
            return "SpeexPlayer_play";
        }

        /* JADX WARNING: Removed duplicated region for block: B:100:0x017a  */
        /* JADX WARNING: Removed duplicated region for block: B:106:0x018f A[SYNTHETIC, Splitter:B:106:0x018f] */
        /* JADX WARNING: Removed duplicated region for block: B:110:0x0198  */
        /* JADX WARNING: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r11 = this;
                r0 = 0
                r1 = -16
                r2 = 3
                r3 = 0
                r4 = 1
                android.os.Process.setThreadPriority(r1)     // Catch:{ Exception -> 0x012f }
                kd0.r r1 = kd0.C21329r.this     // Catch:{ Exception -> 0x012f }
                java.lang.String r5 = r1.f60276b     // Catch:{ Exception -> 0x012f }
                java.io.InputStream r5 = com.tencent.p014mm.vfs.C86013q1.m106423E(r5)     // Catch:{ Exception -> 0x012f }
                r1.f60291q = r5     // Catch:{ Exception -> 0x012f }
            L_0x0013:
                kd0.r r1 = kd0.C21329r.this     // Catch:{ Exception -> 0x012f }
                int r1 = r1.f60279e     // Catch:{ Exception -> 0x012f }
                r5 = 2
                if (r1 == r4) goto L_0x002e
                kd0.r r1 = kd0.C21329r.this     // Catch:{ Exception -> 0x012f }
                int r1 = r1.f60279e     // Catch:{ Exception -> 0x012f }
                if (r1 != r5) goto L_0x0021
                goto L_0x002e
            L_0x0021:
                kd0.r r1 = kd0.C21329r.this     // Catch:{ Exception -> 0x012f }
                int r1 = r1.f60279e     // Catch:{ Exception -> 0x012f }
                if (r1 == r2) goto L_0x014e
                r5 = 1000(0x3e8, double:4.94E-321)
                java.lang.Thread.sleep(r5)     // Catch:{ Exception -> 0x012f }
                goto L_0x014e
            L_0x002e:
                kd0.r r1 = kd0.C21329r.this     // Catch:{ Exception -> 0x012f }
                java.io.InputStream r6 = r1.f60291q     // Catch:{ Exception -> 0x012f }
                byte[] r7 = r1.f60289o     // Catch:{ Exception -> 0x012f }
                int r6 = r6.read(r7)     // Catch:{ Exception -> 0x012f }
                r1.f60290p = r6     // Catch:{ Exception -> 0x012f }
                kd0.r r1 = kd0.C21329r.this     // Catch:{ Exception -> 0x012f }
                int r6 = r1.f60290p     // Catch:{ Exception -> 0x012f }
                r7 = -1
                if (r6 == r7) goto L_0x008f
                com.tencent.qqpinyin.voicerecoapi.a r7 = r1.f60282h     // Catch:{ Exception -> 0x012f }
                byte[] r1 = r1.f60289o     // Catch:{ Exception -> 0x012f }
                byte[] r1 = r7.mo27822a(r1, r0, r6)     // Catch:{ Exception -> 0x012f }
                if (r1 == 0) goto L_0x008a
                int r6 = r1.length     // Catch:{ Exception -> 0x012f }
                if (r6 != 0) goto L_0x004f
                goto L_0x008a
            L_0x004f:
                int r6 = r1.length     // Catch:{ Exception -> 0x012f }
                r7 = 0
            L_0x0051:
                kd0.r r8 = kd0.C21329r.this     // Catch:{ Exception -> 0x012f }
                int r9 = r8.f60292r     // Catch:{ Exception -> 0x012f }
                if (r6 < r9) goto L_0x007a
                int r8 = r8.f60279e     // Catch:{ Exception -> 0x012f }
                if (r8 == r4) goto L_0x005c
                goto L_0x007a
            L_0x005c:
                kd0.r r8 = kd0.C21329r.this     // Catch:{ Exception -> 0x012f }
                boolean r9 = r8.f60287m     // Catch:{ Exception -> 0x012f }
                if (r9 == 0) goto L_0x0068
                r8 = 20
                java.lang.Thread.sleep(r8)     // Catch:{ Exception -> 0x012f }
                goto L_0x0051
            L_0x0068:
                android.media.AudioTrack r10 = r8.f60275a     // Catch:{ Exception -> 0x012f }
                if (r10 == 0) goto L_0x0051
                if (r9 != 0) goto L_0x0051
                int r8 = r8.f60292r     // Catch:{ Exception -> 0x012f }
                r10.write(r1, r7, r8)     // Catch:{ Exception -> 0x012f }
                kd0.r r8 = kd0.C21329r.this     // Catch:{ Exception -> 0x012f }
                int r8 = r8.f60292r     // Catch:{ Exception -> 0x012f }
                int r7 = r7 + r8
                int r6 = r6 - r8
                goto L_0x0051
            L_0x007a:
                kd0.r r8 = kd0.C21329r.this     // Catch:{ Exception -> 0x012f }
                int r9 = r8.f60292r     // Catch:{ Exception -> 0x012f }
                if (r6 >= r9) goto L_0x0091
                if (r6 <= 0) goto L_0x0091
                android.media.AudioTrack r8 = r8.f60275a     // Catch:{ Exception -> 0x012f }
                if (r8 == 0) goto L_0x0091
                r8.write(r1, r7, r6)     // Catch:{ Exception -> 0x012f }
                goto L_0x0091
            L_0x008a:
                kd0.r r1 = kd0.C21329r.this     // Catch:{ Exception -> 0x012f }
                r1.f60279e = r0     // Catch:{ Exception -> 0x012f }
                goto L_0x0013
            L_0x008f:
                r1.f60279e = r0     // Catch:{ Exception -> 0x012f }
            L_0x0091:
                kd0.r r1 = kd0.C21329r.this     // Catch:{ Exception -> 0x012f }
                int r1 = r1.f60279e     // Catch:{ Exception -> 0x012f }
                if (r1 != r5) goto L_0x0105
                kd0.r r1 = kd0.C21329r.this     // Catch:{ Exception -> 0x012f }
                r1.getClass()     // Catch:{ Exception -> 0x012f }
                java.lang.String r1 = ""
                monitor-enter(r1)     // Catch:{ Exception -> 0x012f }
                java.lang.String r5 = "MicroMsg.SpeexPlayer"
                java.lang.String r6 = "before mOk.notify"
                com.tencent.p014mm.sdk.platformtools.Log.m105926v(r5, r6)     // Catch:{ Exception -> 0x00ba }
                kd0.r r5 = kd0.C21329r.this     // Catch:{ Exception -> 0x00ba }
                r5.getClass()     // Catch:{ Exception -> 0x00ba }
                java.lang.String r5 = ""
                r5.notify()     // Catch:{ Exception -> 0x00ba }
                java.lang.String r5 = "MicroMsg.SpeexPlayer"
                java.lang.String r6 = "after mOk.notify"
                com.tencent.p014mm.sdk.platformtools.Log.m105926v(r5, r6)     // Catch:{ Exception -> 0x00ba }
                goto L_0x00ca
            L_0x00b8:
                r5 = move-exception
                goto L_0x0103
            L_0x00ba:
                r5 = move-exception
                java.lang.String r6 = "MicroMsg.SpeexPlayer"
                java.lang.String r7 = "exception:%s"
                java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ all -> 0x00b8 }
                java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r5)     // Catch:{ all -> 0x00b8 }
                r8[r0] = r5     // Catch:{ all -> 0x00b8 }
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r7, r8)     // Catch:{ all -> 0x00b8 }
            L_0x00ca:
                monitor-exit(r1)     // Catch:{ all -> 0x00b8 }
                kd0.r r1 = kd0.C21329r.this     // Catch:{ Exception -> 0x012f }
                r1.getClass()     // Catch:{ Exception -> 0x012f }
                java.lang.String r1 = ""
                monitor-enter(r1)     // Catch:{ Exception -> 0x012f }
                java.lang.String r5 = "MicroMsg.SpeexPlayer"
                java.lang.String r6 = "before mpause.wait"
                com.tencent.p014mm.sdk.platformtools.Log.m105926v(r5, r6)     // Catch:{ Exception -> 0x00ee }
                kd0.r r5 = kd0.C21329r.this     // Catch:{ Exception -> 0x00ee }
                r5.getClass()     // Catch:{ Exception -> 0x00ee }
                java.lang.String r5 = ""
                r5.wait()     // Catch:{ Exception -> 0x00ee }
                java.lang.String r5 = "MicroMsg.SpeexPlayer"
                java.lang.String r6 = "after mpause.wait"
                com.tencent.p014mm.sdk.platformtools.Log.m105926v(r5, r6)     // Catch:{ Exception -> 0x00ee }
                goto L_0x00fe
            L_0x00ec:
                r5 = move-exception
                goto L_0x0101
            L_0x00ee:
                r5 = move-exception
                java.lang.String r6 = "MicroMsg.SpeexPlayer"
                java.lang.String r7 = "exception:%s"
                java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ all -> 0x00ec }
                java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r5)     // Catch:{ all -> 0x00ec }
                r8[r0] = r5     // Catch:{ all -> 0x00ec }
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r7, r8)     // Catch:{ all -> 0x00ec }
            L_0x00fe:
                monitor-exit(r1)     // Catch:{ all -> 0x00ec }
                goto L_0x0013
            L_0x0101:
                monitor-exit(r1)     // Catch:{ all -> 0x00ec }
                throw r5     // Catch:{ Exception -> 0x012f }
            L_0x0103:
                monitor-exit(r1)     // Catch:{ all -> 0x00b8 }
                throw r5     // Catch:{ Exception -> 0x012f }
            L_0x0105:
                kd0.r r1 = kd0.C21329r.this     // Catch:{ Exception -> 0x012f }
                r1.getClass()     // Catch:{ Exception -> 0x012f }
                java.lang.String r1 = ""
                monitor-enter(r1)     // Catch:{ Exception -> 0x012f }
                kd0.r r5 = kd0.C21329r.this     // Catch:{ Exception -> 0x011a }
                r5.getClass()     // Catch:{ Exception -> 0x011a }
                java.lang.String r5 = ""
                r5.notify()     // Catch:{ Exception -> 0x011a }
                goto L_0x012a
            L_0x0118:
                r5 = move-exception
                goto L_0x012d
            L_0x011a:
                r5 = move-exception
                java.lang.String r6 = "MicroMsg.SpeexPlayer"
                java.lang.String r7 = "exception:%s"
                java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ all -> 0x0118 }
                java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r5)     // Catch:{ all -> 0x0118 }
                r8[r0] = r5     // Catch:{ all -> 0x0118 }
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r7, r8)     // Catch:{ all -> 0x0118 }
            L_0x012a:
                monitor-exit(r1)     // Catch:{ all -> 0x0118 }
                goto L_0x0013
            L_0x012d:
                monitor-exit(r1)     // Catch:{ all -> 0x0118 }
                throw r5     // Catch:{ Exception -> 0x012f }
            L_0x012f:
                r1 = move-exception
                java.lang.String r5 = "MicroMsg.SpeexPlayer"
                java.lang.String r6 = "exception:%s"
                java.lang.Object[] r7 = new java.lang.Object[r4]
                java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r1)
                r7[r0] = r1
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r6, r7)
                kd0.r r1 = kd0.C21329r.this
                android.media.MediaPlayer$OnErrorListener r1 = r1.f60284j
                if (r1 == 0) goto L_0x014a
                kd0.q r1 = (kd0.C21328q) r1
                r1.onError(r3, r0, r0)
            L_0x014a:
                kd0.r r1 = kd0.C21329r.this
                r1.f60279e = r0
            L_0x014e:
                kd0.r r1 = kd0.C21329r.this
                java.io.InputStream r1 = r1.f60291q
                if (r1 == 0) goto L_0x016c
                r1.close()     // Catch:{ IOException -> 0x0158 }
                goto L_0x0168
            L_0x0158:
                r1 = move-exception
                java.lang.String r5 = "MicroMsg.SpeexPlayer"
                java.lang.String r6 = "exception:%s"
                java.lang.Object[] r4 = new java.lang.Object[r4]
                java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r1)
                r4[r0] = r1
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r6, r4)
            L_0x0168:
                kd0.r r0 = kd0.C21329r.this
                r0.f60291q = r3
            L_0x016c:
                kd0.r r0 = kd0.C21329r.this
                com.tencent.qqpinyin.voicerecoapi.a r0 = r0.f60282h
                int r0 = r0.mo27824c()
                kd0.r r1 = kd0.C21329r.this
                int r1 = r1.f60279e
                if (r1 == r2) goto L_0x018f
                kd0.r r1 = kd0.C21329r.this
                qh.d$a r1 = r1.f60277c
                if (r1 == 0) goto L_0x0183
                r1.onCompletion()
            L_0x0183:
                kd0.r r1 = kd0.C21329r.this
                android.media.MediaPlayer$OnCompletionListener r1 = r1.f60283i
                if (r1 == 0) goto L_0x0196
                kd0.p r1 = (kd0.C21327p) r1
                r1.onCompletion(r3)
                goto L_0x0196
            L_0x018f:
                kd0.r r1 = kd0.C21329r.this     // Catch:{ Exception -> 0x0195 }
                r1.mo33363n()     // Catch:{ Exception -> 0x0195 }
                goto L_0x0196
            L_0x0195:
            L_0x0196:
                if (r0 == 0) goto L_0x01ae
                java.lang.String r1 = "MicroMsg.SpeexPlayer"
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "res: "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            L_0x01ae:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kd0.C21329r.C21330a.run():void");
        }
    }

    public C21329r() {
        this.f60276b = "";
        this.f60277c = null;
        this.f60278d = null;
        this.f60279e = 0;
        this.f60280f = 2;
        this.f60282h = null;
        this.f60287m = false;
        this.f60288n = true;
        this.f60289o = new byte[2000];
        this.f60290p = 0;
        this.f60291q = null;
        this.f60292r = C91807d.CTRL_INDEX;
        C45427v.m50377a();
        this.f60283i = new C21327p(this);
        this.f60284j = new C21328q(this);
        C19979a aVar = new C19979a();
        this.f60282h = aVar;
        int b = aVar.mo27823b();
        if (b != 0) {
            Log.m105920e("speex", "res: " + b);
        }
    }

    /* renamed from: j */
    public static void m23931j(C21329r rVar) {
        C34379c cVar = rVar.f60281g;
        if (cVar != null && cVar.mo59576a() != Thread.currentThread()) {
            try {
                rVar.f60281g.get();
            } catch (ExecutionException e) {
                Log.m105921e("MicroMsg.SpeexPlayer", "ExecutionException:%s", e.toString());
            }
            rVar.f60281g = null;
        }
    }

    /* renamed from: a */
    public boolean mo33325a(String str, boolean z, int i) {
        return mo33362m(str, z, i);
    }

    /* renamed from: b */
    public boolean mo33326b(boolean z) {
        if (this.f60279e != 1) {
            return false;
        }
        this.f60279e = 2;
        synchronized ("") {
            try {
                Log.m105926v("MicroMsg.SpeexPlayer", "before mOk.wait");
                long currentTimeMillis = System.currentTimeMillis();
                "".wait();
                Log.m105926v("MicroMsg.SpeexPlayer", "after mOk.wait time:" + (System.currentTimeMillis() - currentTimeMillis));
                C100115c cVar = this.f60286l;
                if (cVar != null && z && this.f60288n) {
                    cVar.mo139414a();
                }
            } catch (Exception e) {
                try {
                    Log.m105921e("MicroMsg.SpeexPlayer", "exception:%s", Util.stackTraceToString(e));
                    C100115c cVar2 = this.f60286l;
                    if (cVar2 != null && z && this.f60288n) {
                        cVar2.mo139414a();
                    }
                    return false;
                } catch (Throwable th) {
                    C100115c cVar3 = this.f60286l;
                    if (cVar3 != null && z && this.f60288n) {
                        cVar3.mo139414a();
                    }
                    throw th;
                }
            }
        }
        return true;
    }

    /* renamed from: c */
    public void mo33327c(boolean z) {
        int i;
        this.f60287m = true;
        this.f60280f = 2;
        this.f60285k = AudioTrack.getMinBufferSize(16000, 2, 2);
        AudioTrack audioTrack = this.f60275a;
        if (audioTrack != null) {
            try {
                audioTrack.stop();
                this.f60275a.release();
            } catch (Exception e) {
                Log.m105920e("MicroMsg.SpeexPlayer", e.getMessage());
            } catch (Throwable th) {
                this.f60275a = null;
                throw th;
            }
            this.f60275a = null;
        }
        int i2 = z ? 3 : 0;
        C107823c cVar = C107835h0.f322846c;
        if (cVar.f322730a) {
            cVar.mo158230d();
            if (C107835h0.f322846c.f322745h == 1) {
                i = 3;
                C107045e eVar = new C107045e(i, 16000, this.f60280f, 2, this.f60285k * 8, 1);
                this.f60275a = eVar;
                eVar.play();
                this.f60287m = false;
            }
        }
        i = i2;
        C107045e eVar2 = new C107045e(i, 16000, this.f60280f, 2, this.f60285k * 8, 1);
        this.f60275a = eVar2;
        try {
            eVar2.play();
        } catch (Exception e2) {
            Log.m105921e("MicroMsg.SpeexPlayer", "audioTrack error:%s", e2.getMessage());
        }
        this.f60287m = false;
    }

    /* renamed from: d */
    public void mo33328d(C22086d.C22087a aVar) {
        this.f60277c = aVar;
    }

    /* renamed from: e */
    public boolean mo33329e(String str, boolean z) {
        return mo33362m(str, z, 0);
    }

    /* renamed from: f */
    public double mo33330f() {
        return 0.0d;
    }

    /* renamed from: g */
    public void mo33331g(boolean z) {
        this.f60288n = z;
    }

    public int getStatus() {
        return this.f60279e;
    }

    /* renamed from: h */
    public void mo33333h(C22086d.C22089c cVar) {
        Log.m105920e("MicroMsg.SpeexPlayer", "seek not support");
    }

    /* renamed from: i */
    public void mo33334i(C22086d.C22088b bVar) {
        this.f60278d = bVar;
    }

    public boolean isPlaying() {
        return this.f60279e == 1;
    }

    /* renamed from: k */
    public final void mo33360k() {
        AudioTrack audioTrack = this.f60275a;
        if (audioTrack != null) {
            try {
                audioTrack.play();
                C21330a aVar = new C21330a();
                C119157j jVar = (C119157j) C119157j.f356862d;
                jVar.getClass();
                this.f60281g = jVar.mo183878i(aVar, 0);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.SpeexPlayer", "audioTrack error:%s", e.getMessage());
            }
        }
    }

    /* renamed from: l */
    public final void mo33361l(boolean z, int i) {
        int i2;
        C100115c cVar;
        if (C86013q1.m106450k(this.f60276b)) {
            int i3 = z ? 3 : 0;
            try {
                if (C110248b.vx0().mo157504C() || C110472b.f330365a.mo161950a()) {
                    i3 = 3;
                }
                C107823c cVar2 = C107835h0.f322846c;
                if (cVar2.f322730a) {
                    cVar2.mo158230d();
                    if (C107835h0.f322846c.f322745h == 1) {
                        i2 = 3;
                        this.f60285k = AudioTrack.getMinBufferSize(16000, this.f60280f, 2);
                        mo33363n();
                        this.f60275a = new C107045e(i2, 16000, this.f60280f, 2, this.f60285k * 8, 1);
                        this.f60292r = 640;
                        cVar = this.f60286l;
                        if (cVar != null && this.f60288n) {
                            cVar.mo139415b();
                        }
                        mo33360k();
                    }
                }
                i2 = i3;
                this.f60285k = AudioTrack.getMinBufferSize(16000, this.f60280f, 2);
                mo33363n();
                this.f60275a = new C107045e(i2, 16000, this.f60280f, 2, this.f60285k * 8, 1);
                this.f60292r = 640;
                cVar = this.f60286l;
                cVar.mo139415b();
                mo33360k();
            } catch (Exception e) {
                C100115c cVar3 = this.f60286l;
                if (cVar3 != null && this.f60288n) {
                    cVar3.mo139414a();
                }
                mo33363n();
                Log.m105920e("MicroMsg.SpeexPlayer", "playImp : fail, exception = " + e.getMessage());
                Log.m105921e("MicroMsg.SpeexPlayer", "exception:%s", Util.stackTraceToString(e));
            }
        }
    }

    /* renamed from: m */
    public final boolean mo33362m(String str, boolean z, int i) {
        if (this.f60279e != 0) {
            Log.m105920e("MicroMsg.SpeexPlayer", "startPlay error status:" + this.f60279e);
            return false;
        }
        Log.m105924i("MicroMsg.SpeexPlayer", "startPlay");
        this.f60279e = 1;
        this.f60276b = str;
        try {
            mo33361l(z, i);
        } catch (Exception e) {
            try {
                mo33361l(true, i);
            } catch (Exception unused) {
                Log.m105920e("MicroMsg.SpeexPlayer", "startPlay File[" + this.f60276b + "] failed");
                Log.m105921e("MicroMsg.SpeexPlayer", "exception:%s", Util.stackTraceToString(e));
                this.f60279e = -1;
                return false;
            }
        }
        return true;
    }

    /* renamed from: n */
    public final void mo33363n() {
        AudioTrack audioTrack = this.f60275a;
        if (audioTrack != null) {
            audioTrack.stop();
            this.f60275a.release();
            this.f60275a = null;
        }
    }

    public boolean resume() {
        if (this.f60279e != 2) {
            return false;
        }
        this.f60279e = 1;
        synchronized ("") {
            try {
                Log.m105926v("MicroMsg.SpeexPlayer", "before mpause.notify");
                "".notify();
                Log.m105926v("MicroMsg.SpeexPlayer", "after mpause.notify");
                C100115c cVar = this.f60286l;
                if (cVar != null && this.f60288n) {
                    cVar.mo139415b();
                }
            } catch (Exception e) {
                try {
                    Log.m105921e("MicroMsg.SpeexPlayer", "exception:%s", Util.stackTraceToString(e));
                    C100115c cVar2 = this.f60286l;
                    if (cVar2 != null && this.f60288n) {
                        cVar2.mo139415b();
                    }
                    return false;
                } catch (Throwable th) {
                    C100115c cVar3 = this.f60286l;
                    if (cVar3 != null && this.f60288n) {
                        cVar3.mo139415b();
                    }
                    throw th;
                }
            }
        }
        return true;
    }

    public boolean seek(long j) {
        Log.m105920e("MicroMsg.SpeexPlayer", "seek not support");
        return false;
    }

    public boolean stop() {
        Log.m105920e("MicroMsg.SpeexPlayer", "stop  status:" + this.f60279e);
        if (this.f60279e == 1 || this.f60279e == 2) {
            this.f60279e = 3;
            synchronized ("") {
                try {
                    "".notify();
                    C100115c cVar = this.f60286l;
                    if (cVar != null && this.f60288n) {
                        cVar.mo139414a();
                    }
                } catch (Exception e) {
                    try {
                        Log.m105921e("MicroMsg.SpeexPlayer", "exception:%s", Util.stackTraceToString(e));
                        mo33363n();
                        C100115c cVar2 = this.f60286l;
                        if (cVar2 != null && this.f60288n) {
                            cVar2.mo139414a();
                        }
                        return false;
                    } catch (Throwable th) {
                        C100115c cVar3 = this.f60286l;
                        if (cVar3 != null && this.f60288n) {
                            cVar3.mo139414a();
                        }
                        throw th;
                    }
                }
            }
            return true;
        }
        Log.m105920e("MicroMsg.SpeexPlayer", "stop  error status:" + this.f60279e);
        try {
            synchronized ("") {
                "".notify();
            }
            synchronized ("") {
                "".notify();
            }
        } catch (Exception unused) {
        }
        this.f60279e = 3;
        return false;
    }

    public C21329r(Context context) {
        this();
        this.f60286l = new C100115c(context);
    }
}
