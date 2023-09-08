package jb1;

import com.tencent.p014mm.memory.C92702a;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.plugin.facedetect.model.C105224h;
import com.tencent.p014mm.plugin.facedetect.model.C85191v;
import com.tencent.p014mm.plugin.facedetect.model.FaceContextData;
import com.tencent.p014mm.plugin.facedetect.model.FaceDetectReporter;
import com.tencent.p014mm.plugin.mmsight.model.CaptureMMProxy;
import com.tencent.p014mm.remoteservice.C96905d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;
import g72.C107757b;
import i72.C108388k;
import j72.C108607f;
import j72.C98921l;
import java.util.List;
import p375qh.C89658b;
import zh0.C112626d;

/* renamed from: jb1.a */
public class C108680a {

    /* renamed from: r */
    public static volatile C108680a f325466r;

    /* renamed from: s */
    public static final String f325467s = (C85191v.m105070i() + XVFSFile.SEPARATOR_CHAR + "fdv_");

    /* renamed from: t */
    public static final String f325468t = (C85191v.m105070i() + XVFSFile.SEPARATOR_CHAR + "fdv_t_");

    /* renamed from: a */
    public C108607f f325469a;

    /* renamed from: b */
    public final Object f325470b;

    /* renamed from: c */
    public MMHandler f325471c;

    /* renamed from: d */
    public C108691g f325472d;

    /* renamed from: e */
    public int f325473e;

    /* renamed from: f */
    public boolean f325474f;

    /* renamed from: g */
    public int f325475g;

    /* renamed from: h */
    public boolean f325476h;

    /* renamed from: i */
    public C108692h f325477i;

    /* renamed from: j */
    public int f325478j;

    /* renamed from: k */
    public int f325479k;

    /* renamed from: l */
    public String f325480l;

    /* renamed from: m */
    public String f325481m;

    /* renamed from: n */
    public C96905d f325482n;

    /* renamed from: o */
    public C107757b f325483o;

    /* renamed from: p */
    public C105224h.C105226b f325484p;

    /* renamed from: q */
    public C108607f.C108608a f325485q;

    /* renamed from: jb1.a$a */
    public class C108681a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f325486d;

        /* renamed from: e */
        public final /* synthetic */ int f325487e;

        /* renamed from: f */
        public final /* synthetic */ int f325488f;

        /* renamed from: g */
        public final /* synthetic */ boolean f325489g;

        /* renamed from: h */
        public final /* synthetic */ int f325490h;

        /* renamed from: i */
        public final /* synthetic */ boolean f325491i;

        /* renamed from: j */
        public final /* synthetic */ int f325492j;

        /* renamed from: n */
        public final /* synthetic */ int f325493n;

        /* renamed from: jb1.a$a$a */
        public class C108682a implements Runnable {

            /* renamed from: jb1.a$a$a$a */
            public class C108683a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ long f325496d;

                public C108683a(long j) {
                    this.f325496d = j;
                }

                public void run() {
                    synchronized (C108680a.this.f325470b) {
                        Log.m105925i("MicroMsg.FaceVideoRecorder", "hy: connect cost %s ms", Long.valueOf(Util.ticksToNow(this.f325496d)));
                        long currentTicks = Util.currentTicks();
                        C108680a aVar = C108680a.this;
                        aVar.f325469a = aVar.f325483o.mo158188a();
                        C108680a aVar2 = C108680a.this;
                        aVar2.f325469a.mo159615m(aVar2.f325480l);
                        C108680a aVar3 = C108680a.this;
                        aVar3.f325469a.mo159630x(aVar3.f325481m);
                        C108681a aVar4 = C108681a.this;
                        C108680a.this.f325469a.mo159629w(aVar4.f325491i);
                        C108681a aVar5 = C108681a.this;
                        C108680a aVar6 = C108680a.this;
                        aVar6.f325469a.mo159612i(aVar6.f325478j, aVar6.f325479k, aVar5.f325492j, aVar5.f325493n);
                        C108680a aVar7 = C108680a.this;
                        aVar7.f325469a.mo159618p(aVar7.f325473e);
                        C108680a aVar8 = C108680a.this;
                        aVar8.f325469a.mo159606e(aVar8.f325485q);
                        C108680a.this.f325469a.setMute(true);
                        C108680a.this.f325472d = C108691g.INITIALIZED;
                        Log.m105925i("MicroMsg.FaceVideoRecorder", "hy: init in main thread cost %d ms", Long.valueOf(Util.ticksToNow(currentTicks)));
                    }
                }
            }

            public C108682a() {
            }

            public void run() {
                C108680a.this.f325482n.mo135257a(new C108683a(Util.currentTicks()));
            }
        }

        public C108681a(int i, int i2, int i3, boolean z, int i4, boolean z2, int i5, int i6) {
            this.f325486d = i;
            this.f325487e = i2;
            this.f325488f = i3;
            this.f325489g = z;
            this.f325490h = i4;
            this.f325491i = z2;
            this.f325492j = i5;
            this.f325493n = i6;
        }

        public void run() {
            C108680a aVar;
            int i = this.f325486d;
            if (i == 90 || i == 270) {
                Log.m105924i("MicroMsg.FaceVideoRecorder", "hy: need make width and height upside down");
                C108680a aVar2 = C108680a.this;
                aVar2.f325478j = this.f325487e;
                aVar2.f325479k = this.f325488f;
            } else {
                C108680a aVar3 = C108680a.this;
                aVar3.f325478j = this.f325488f;
                aVar3.f325479k = this.f325487e;
            }
            synchronized (C108680a.this.f325470b) {
                aVar = C108680a.this;
                aVar.f325473e = this.f325486d;
                aVar.f325474f = this.f325489g;
                aVar.f325475g = this.f325490h;
            }
            C108680a.m147398a(aVar);
            C108680a.m147399b(C108680a.this);
            C108680a.m147400c(C108680a.this);
            if (MMApplicationContext.isMainProcess()) {
                synchronized (C108680a.this.f325470b) {
                    long currentTicks = Util.currentTicks();
                    C108680a aVar4 = C108680a.this;
                    aVar4.f325469a = aVar4.f325483o.mo158188a();
                    C108680a aVar5 = C108680a.this;
                    aVar5.f325469a.mo159615m(aVar5.f325480l);
                    C108680a aVar6 = C108680a.this;
                    aVar6.f325469a.mo159630x(aVar6.f325481m);
                    C108680a.this.f325469a.mo159629w(this.f325491i);
                    C108680a aVar7 = C108680a.this;
                    aVar7.f325469a.mo159612i(aVar7.f325478j, aVar7.f325479k, this.f325492j, this.f325493n);
                    C108680a aVar8 = C108680a.this;
                    aVar8.f325469a.mo159618p(aVar8.f325473e);
                    C108680a aVar9 = C108680a.this;
                    aVar9.f325469a.mo159606e(aVar9.f325485q);
                    C108680a.this.f325469a.setMute(true);
                    C108680a.this.f325472d = C108691g.INITIALIZED;
                    Log.m105925i("MicroMsg.FaceVideoRecorder", "hy: init in main thread cost %d ms", Long.valueOf(Util.ticksToNow(currentTicks)));
                }
                return;
            }
            MMHandlerThread.postToMainThread(new C108682a());
        }
    }

    /* renamed from: jb1.a$b */
    public class C108684b implements C108607f.C108608a {

        /* renamed from: jb1.a$b$a */
        public class C108685a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int f325499d;

            public C108685a(int i) {
                this.f325499d = i;
            }

            public void run() {
                FaceContextData faceContextData;
                FaceContextData faceContextData2;
                try {
                    C108607f fVar = C108680a.this.f325469a;
                    if (fVar != null) {
                        fVar.reset();
                    }
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.FaceVideoRecorder", "hy: onError, reset mediaRecorder error: %s", e.getMessage());
                } catch (Throwable th) {
                    C108680a.m147400c(C108680a.this);
                    throw th;
                }
                C108680a.m147400c(C108680a.this);
                synchronized (C108680a.this.f325470b) {
                    C108680a.this.f325472d = C108691g.INITIALIZED;
                }
                synchronized (FaceContextData.class) {
                    faceContextData = FaceContextData.f312602e;
                }
                if (faceContextData != null) {
                    synchronized (FaceContextData.class) {
                        faceContextData2 = FaceContextData.f312602e;
                    }
                    FaceDetectReporter.m162243d(faceContextData2.f312603d, 2, this.f325499d);
                }
            }
        }

        public C108684b() {
        }

        /* renamed from: d */
        public void mo150355d(int i) {
            Log.m105921e("MicroMsg.FaceVideoRecorder", "hy: video capture error: %d", Integer.valueOf(i));
            C108680a.this.f325471c.postToWorker(new C108685a(i));
        }
    }

    /* renamed from: jb1.a$c */
    public class C108686c implements Runnable {
        public C108686c() {
        }

        public void run() {
            synchronized (C108680a.this.f325470b) {
                C108691g gVar = C108680a.this.f325472d;
                if (gVar == C108691g.UNINITIALIZED) {
                    Log.m105920e("MicroMsg.FaceVideoRecorder", "hy: not started. should not happen");
                    C108680a.m147400c(C108680a.this);
                    return;
                }
                C108691g gVar2 = C108691g.STARTED;
                if (gVar == gVar2) {
                    Log.m105928w("MicroMsg.FaceVideoRecorder", "hy: already started or wait start");
                    return;
                }
                Log.m105924i("MicroMsg.FaceVideoRecorder", "hy: startRecord record");
                C105224h b = C105224h.m141309b();
                b.getClass();
                synchronized (C105224h.f312605c) {
                    List<C105224h.C105225a> list = b.f312606a;
                    if (list != null) {
                        list.clear();
                    }
                }
                C105224h.m141309b().mo149588a(C108680a.this.f325484p);
                C108680a aVar = C108680a.this;
                aVar.f325469a.mo159632z(aVar.f325473e, aVar.f325474f, aVar.f325475g);
                C108680a.this.f325472d = gVar2;
            }
        }
    }

    /* renamed from: jb1.a$d */
    public class C108687d implements Runnable {
        public C108687d() {
        }

        public void run() {
            synchronized (C108680a.this.f325470b) {
                if (C108680a.this.f325472d == C108691g.UNINITIALIZED) {
                    Log.m105920e("MicroMsg.FaceVideoRecorder", "hy: not started when cancel. should not happen");
                    C108680a.m147400c(C108680a.this);
                    return;
                }
                Log.m105924i("MicroMsg.FaceVideoRecorder", "hy: cancel record");
                C108680a.this.f325469a.cancel();
                C108680a.m147400c(C108680a.this);
                C105224h.m141309b().mo149590d(C108680a.this.f325484p);
                C108680a aVar = C108680a.this;
                aVar.f325472d = C108691g.CANCELLED;
                aVar.f325482n.mo135260d();
            }
        }
    }

    /* renamed from: jb1.a$e */
    public class C108688e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C108692h f325503d;

        /* renamed from: jb1.a$e$a */
        public class C108689a implements Runnable {
            public C108689a() {
            }

            public void run() {
                synchronized (C108680a.this.f325470b) {
                    Log.m105924i("MicroMsg.FaceVideoRecorder", "carson: begin to stop" + C108680a.this.f325469a.getFilePath());
                    C108680a aVar = C108680a.this;
                    aVar.f325472d = C108691g.STOPPED;
                    C86013q1.m106447h(aVar.f325481m);
                    C108680a aVar2 = C108680a.this;
                    C108692h hVar = aVar2.f325477i;
                    if (hVar != null) {
                        hVar.mo9420a(aVar2.f325469a.getFilePath());
                        C108680a.this.f325477i = null;
                    }
                }
            }
        }

        public C108688e(C108692h hVar) {
            this.f325503d = hVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0055, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b6, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r5 = this;
                jb1.a r0 = jb1.C108680a.this
                java.lang.Object r0 = r0.f325470b
                monitor-enter(r0)
                jb1.a r1 = jb1.C108680a.this     // Catch:{ all -> 0x00b7 }
                jb1.a$h r2 = r5.f325503d     // Catch:{ all -> 0x00b7 }
                r1.f325477i = r2     // Catch:{ all -> 0x00b7 }
                jb1.a$g r1 = r1.f325472d     // Catch:{ all -> 0x00b7 }
                jb1.a$g r2 = jb1.C108680a.C108691g.UNINITIALIZED     // Catch:{ all -> 0x00b7 }
                r3 = 0
                if (r1 != r2) goto L_0x002d
                java.lang.String r1 = "MicroMsg.FaceVideoRecorder"
                java.lang.String r2 = "hy: not initialized. should not happen"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)     // Catch:{ all -> 0x00b7 }
                jb1.a r1 = jb1.C108680a.this     // Catch:{ all -> 0x00b7 }
                jb1.C108680a.m147400c(r1)     // Catch:{ all -> 0x00b7 }
                jb1.a r1 = jb1.C108680a.this     // Catch:{ all -> 0x00b7 }
                jb1.a$h r1 = r1.f325477i     // Catch:{ all -> 0x00b7 }
                if (r1 == 0) goto L_0x002b
                r1.mo9420a(r3)     // Catch:{ all -> 0x00b7 }
                jb1.a r1 = jb1.C108680a.this     // Catch:{ all -> 0x00b7 }
                r1.f325477i = r3     // Catch:{ all -> 0x00b7 }
            L_0x002b:
                monitor-exit(r0)     // Catch:{ all -> 0x00b7 }
                return
            L_0x002d:
                jb1.a$g r2 = jb1.C108680a.C108691g.CANCELLED     // Catch:{ all -> 0x00b7 }
                if (r1 == r2) goto L_0x009c
                jb1.a$g r2 = jb1.C108680a.C108691g.INITIALIZED     // Catch:{ all -> 0x00b7 }
                if (r1 != r2) goto L_0x0036
                goto L_0x009c
            L_0x0036:
                jb1.a$g r2 = jb1.C108680a.C108691g.STOPPED     // Catch:{ all -> 0x00b7 }
                if (r1 != r2) goto L_0x0056
                java.lang.String r1 = "MicroMsg.FaceVideoRecorder"
                java.lang.String r2 = "hy: already stopped"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ all -> 0x00b7 }
                jb1.a r1 = jb1.C108680a.this     // Catch:{ all -> 0x00b7 }
                jb1.a$h r2 = r1.f325477i     // Catch:{ all -> 0x00b7 }
                if (r2 == 0) goto L_0x0054
                j72.f r1 = r1.f325469a     // Catch:{ all -> 0x00b7 }
                java.lang.String r1 = r1.getFilePath()     // Catch:{ all -> 0x00b7 }
                r2.mo9420a(r1)     // Catch:{ all -> 0x00b7 }
                jb1.a r1 = jb1.C108680a.this     // Catch:{ all -> 0x00b7 }
                r1.f325477i = r3     // Catch:{ all -> 0x00b7 }
            L_0x0054:
                monitor-exit(r0)     // Catch:{ all -> 0x00b7 }
                return
            L_0x0056:
                jb1.a$g r2 = jb1.C108680a.C108691g.STOPPING     // Catch:{ all -> 0x00b7 }
                if (r1 != r2) goto L_0x0063
                java.lang.String r1 = "MicroMsg.FaceVideoRecorder"
                java.lang.String r2 = "hy: stopping. wait"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ all -> 0x00b7 }
                monitor-exit(r0)     // Catch:{ all -> 0x00b7 }
                return
            L_0x0063:
                java.lang.String r1 = "MicroMsg.FaceVideoRecorder"
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b7 }
                r3.<init>()     // Catch:{ all -> 0x00b7 }
                java.lang.String r4 = "hy: stop record and release"
                r3.append(r4)     // Catch:{ all -> 0x00b7 }
                java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00b7 }
                java.lang.String r4 = r4.getName()     // Catch:{ all -> 0x00b7 }
                r3.append(r4)     // Catch:{ all -> 0x00b7 }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00b7 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)     // Catch:{ all -> 0x00b7 }
                com.tencent.mm.plugin.facedetect.model.h r1 = com.tencent.p014mm.plugin.facedetect.model.C105224h.m141309b()     // Catch:{ all -> 0x00b7 }
                jb1.a r3 = jb1.C108680a.this     // Catch:{ all -> 0x00b7 }
                com.tencent.mm.plugin.facedetect.model.h$b r3 = r3.f325484p     // Catch:{ all -> 0x00b7 }
                r1.mo149590d(r3)     // Catch:{ all -> 0x00b7 }
                jb1.a r1 = jb1.C108680a.this     // Catch:{ all -> 0x00b7 }
                r1.f325472d = r2     // Catch:{ all -> 0x00b7 }
                j72.f r1 = r1.f325469a     // Catch:{ all -> 0x00b7 }
                jb1.a$e$a r2 = new jb1.a$e$a     // Catch:{ all -> 0x00b7 }
                r2.<init>()     // Catch:{ all -> 0x00b7 }
                r1.mo159616n(r2)     // Catch:{ all -> 0x00b7 }
                monitor-exit(r0)     // Catch:{ all -> 0x00b7 }
                return
            L_0x009c:
                java.lang.String r1 = "MicroMsg.FaceVideoRecorder"
                java.lang.String r2 = "hy: cancelled or not started capturing."
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r2)     // Catch:{ all -> 0x00b7 }
                jb1.a r1 = jb1.C108680a.this     // Catch:{ all -> 0x00b7 }
                jb1.C108680a.m147400c(r1)     // Catch:{ all -> 0x00b7 }
                jb1.a r1 = jb1.C108680a.this     // Catch:{ all -> 0x00b7 }
                jb1.a$h r1 = r1.f325477i     // Catch:{ all -> 0x00b7 }
                if (r1 == 0) goto L_0x00b5
                r1.mo9420a(r3)     // Catch:{ all -> 0x00b7 }
                jb1.a r1 = jb1.C108680a.this     // Catch:{ all -> 0x00b7 }
                r1.f325477i = r3     // Catch:{ all -> 0x00b7 }
            L_0x00b5:
                monitor-exit(r0)     // Catch:{ all -> 0x00b7 }
                return
            L_0x00b7:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x00b7 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: jb1.C108680a.C108688e.run():void");
        }
    }

    /* renamed from: jb1.a$f */
    public class C108690f implements C105224h.C105226b {
        public C108690f() {
        }

        /* renamed from: a */
        public void mo149592a(byte[] bArr) {
            C108680a aVar = C108680a.this;
            aVar.f325471c.postToWorker(new C108698e(aVar, bArr));
        }

        /* renamed from: b */
        public C92702a<byte[]> mo149593b() {
            return C98921l.f289964d;
        }
    }

    /* renamed from: jb1.a$g */
    public enum C108691g {
        UNINITIALIZED,
        INITIALIZED,
        STARTED,
        STOPPING,
        STOPPED,
        CANCELLED
    }

    /* renamed from: jb1.a$h */
    public interface C108692h {
        /* renamed from: a */
        void mo9420a(String str);
    }

    static {
        C85191v.m105070i();
    }

    public C108680a() {
        this.f325470b = new Object();
        this.f325471c = null;
        this.f325472d = C108691g.UNINITIALIZED;
        this.f325473e = 0;
        this.f325474f = false;
        this.f325475g = 0;
        this.f325476h = false;
        this.f325477i = null;
        this.f325478j = -1;
        this.f325479k = -1;
        this.f325480l = "";
        this.f325481m = "";
        this.f325482n = new C96905d(MMApplicationContext.getContext());
        this.f325483o = C107757b.f322497a.get();
        this.f325484p = new C108690f();
        this.f325485q = new C108684b();
        this.f325471c = new MMHandler("face_video_handler");
    }

    /* renamed from: a */
    public static void m147398a(C108680a aVar) {
        aVar.getClass();
        aVar.f325480l = f325467s + Util.currentTicks() + ".mp4";
    }

    /* renamed from: b */
    public static void m147399b(C108680a aVar) {
        aVar.getClass();
        aVar.f325481m = f325468t + Util.currentTicks() + ".thumb";
    }

    /* renamed from: c */
    public static void m147400c(C108680a aVar) {
        C86013q1.m106447h(aVar.f325480l);
        C86013q1.m106447h(aVar.f325481m);
    }

    /* renamed from: e */
    public static C108680a m147401e() {
        C108680a aVar;
        if (f325466r != null) {
            return f325466r;
        }
        synchronized (C108680a.class) {
            if (f325466r == null) {
                f325466r = new C108680a();
            }
            aVar = f325466r;
        }
        return aVar;
    }

    /* renamed from: d */
    public void mo159697d() {
        Log.m105920e("MicroMsg.FaceVideoRecorder", "carson: cancel Record Video");
        this.f325471c.postToWorker(new C108687d());
    }

    /* renamed from: f */
    public C89658b mo159698f() {
        C108607f fVar = this.f325469a;
        if (fVar != null) {
            return fVar.mo159626t();
        }
        Log.m105928w("MicroMsg.FaceVideoRecorder", "hy: no media recorder");
        return null;
    }

    /* renamed from: g */
    public boolean mo159699g(int i, int i2, int i3, boolean z, int i4, int i5, int i6, boolean z2) {
        Log.m105924i("MicroMsg.FaceVideoRecorder", "hy: init record");
        Log.m105925i("MicroMsg.FaceVideoRecorder", "hy: cameraOrientation: %d, previewWidth: %d, previewHeight: %d,isLandscape: %b,  degree: %d, acceptVoiceFromOutside: %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Boolean.valueOf(z), Integer.valueOf(i4), Boolean.valueOf(z2));
        VideoTransPara videoTransPara = new VideoTransPara();
        videoTransPara.f267178s = true;
        videoTransPara.f267166d = this.f325478j;
        videoTransPara.f267167e = this.f325479k;
        videoTransPara.f267168f = 30;
        videoTransPara.f267169g = 1200000;
        videoTransPara.f267172j = 10;
        videoTransPara.f267173n = 64000;
        videoTransPara.f267176q = 2;
        videoTransPara.f267177r = 1;
        videoTransPara.f267174o = 16000;
        videoTransPara.f267170h = 15;
        C107757b bVar = this.f325483o;
        C96905d dVar = this.f325482n;
        C112626d dVar2 = (C112626d) bVar;
        dVar2.getClass();
        if (dVar != null) {
            CaptureMMProxy.createProxy(new CaptureMMProxy(dVar));
        }
        C108388k.m146838d(videoTransPara);
        dVar2.f337279c = videoTransPara;
        this.f325471c.postToWorker(new C108681a(i, i3, i2, z, i4, z2, i5, i6));
        return true;
    }

    /* renamed from: h */
    public boolean mo159700h() {
        boolean z;
        synchronized (this.f325470b) {
            z = this.f325472d == C108691g.STARTED;
        }
        return z;
    }

    /* renamed from: i */
    public boolean mo159701i() {
        Log.m105920e("MicroMsg.FaceVideoRecorder", "carson: start Record Video");
        this.f325471c.postToWorker(new C108686c());
        return true;
    }

    /* renamed from: j */
    public void mo159702j(C108692h hVar) {
        Log.m105920e("MicroMsg.FaceVideoRecorder", "carson: stop Record Video");
        this.f325471c.postToWorker(new C108688e(hVar));
    }
}
