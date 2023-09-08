package lz1;

import android.database.ContentObserver;
import android.media.AudioManager;
import android.net.LocalServerSocket;
import android.os.Handler;
import android.os.SystemClock;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.feature.gamelive.GameLiveCommonService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import di3.C86301e;
import di3.C86312j;
import ea2.C86468a;
import ei3.C86522b;
import h81.C32735h;
import ht1.C60194q2;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import mj0.C88733c;
import mt1.C61580b;
import mt1.C88848a;
import p635os.C89291d;
import rx3.C36570n;
import yj0.C91463a;
import yj0.C91464b;
import zt3.C119143b;

@C86522b(dependencies = {C89291d.class}, onProcess = {C80625v0.MATCH_APPBRAND})
/* renamed from: lz1.e */
public class C88672e extends C86301e implements C88686l, C61580b {

    /* renamed from: A */
    public Runnable f255987A;

    /* renamed from: d */
    public C119143b f255988d = null;

    /* renamed from: e */
    public ObjectOutputStream f255989e = null;

    /* renamed from: f */
    public MMHandler f255990f;

    /* renamed from: g */
    public MMHandler f255991g;

    /* renamed from: h */
    public LocalServerSocket f255992h;

    /* renamed from: i */
    public final Map<Short, C91464b> f255993i = new HashMap();

    /* renamed from: j */
    public final C91463a f255994j = new C91463a();

    /* renamed from: n */
    public long f255995n = 0;

    /* renamed from: o */
    public OutputStream f255996o = null;

    /* renamed from: p */
    public AudioManager f255997p;

    /* renamed from: q */
    public int f255998q;

    /* renamed from: r */
    public int f255999r;

    /* renamed from: s */
    public boolean f256000s;

    /* renamed from: t */
    public boolean f256001t;

    /* renamed from: u */
    public C88679c f256002u;

    /* renamed from: v */
    public long f256003v;

    /* renamed from: w */
    public WeakReference<C88733c> f256004w;

    /* renamed from: x */
    public String f256005x;

    /* renamed from: y */
    public C88848a f256006y;

    /* renamed from: z */
    public C86468a f256007z;

    /* renamed from: lz1.e$a */
    public class C88673a extends C86468a {

        /* renamed from: lz1.e$a$a */
        public class C88674a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C86468a.C86469a f256009d;

            public C88674a(C86468a.C86469a aVar) {
                this.f256009d = aVar;
            }

            public void run() {
                ((HashMap) C88672e.this.f255993i).put(Short.valueOf(this.f256009d.f251260a), new C91464b(this.f256009d.f251260a, ((Boolean) ((C36570n) ((GameLiveCommonService) C86312j.m106911c(GameLiveCommonService.class)).f237641d).getValue()).booleanValue()));
                Log.m105924i("MicroMsg.GameLiveAppbrandAudioMgrService", "[hilive] AbstractAudioOutputListener onStart sessionId: " + this.f256009d.f251260a + " audioType: " + this.f256009d.f251261b + " audioId: " + this.f256009d.f251262c + " streams: " + ((HashMap) C88672e.this.f255993i).size());
            }
        }

        /* renamed from: lz1.e$a$b */
        public class C88675b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C86468a.C86469a f256011d;

            /* renamed from: e */
            public final /* synthetic */ int f256012e;

            /* renamed from: f */
            public final /* synthetic */ int f256013f;

            /* renamed from: g */
            public final /* synthetic */ int f256014g;

            /* renamed from: h */
            public final /* synthetic */ byte[] f256015h;

            /* renamed from: i */
            public final /* synthetic */ long f256016i;

            public C88675b(C86468a.C86469a aVar, int i, int i2, int i3, byte[] bArr, long j) {
                this.f256011d = aVar;
                this.f256012e = i;
                this.f256013f = i2;
                this.f256014g = i3;
                this.f256015h = bArr;
                this.f256016i = j;
            }

            public void run() {
                C91464b bVar = (C91464b) ((HashMap) C88672e.this.f255993i).get(Short.valueOf(this.f256011d.f251260a));
                if (bVar == null) {
                    Log.m105920e("MicroMsg.GameLiveAppbrandAudioMgrService", "[hilive] AbstractAudioOutputListener onOutput failed, sessionId: " + this.f256011d.f251260a + " audioType: " + this.f256011d.f251261b + " audioId: " + this.f256011d.f251262c + " format: " + this.f256012e + " channel: " + this.f256013f + " samplerate: " + this.f256014g + " size: " + this.f256015h.length);
                    return;
                }
                bVar.mo125400d((short) this.f256013f, this.f256014g, this.f256015h, this.f256016i);
            }
        }

        /* renamed from: lz1.e$a$c */
        public class C88676c implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C86468a.C86469a f256018d;

            /* renamed from: e */
            public final /* synthetic */ int f256019e;

            /* renamed from: f */
            public final /* synthetic */ int f256020f;

            /* renamed from: g */
            public final /* synthetic */ int f256021g;

            /* renamed from: h */
            public final /* synthetic */ float[] f256022h;

            public C88676c(C86468a.C86469a aVar, int i, int i2, int i3, float[] fArr) {
                this.f256018d = aVar;
                this.f256019e = i;
                this.f256020f = i2;
                this.f256021g = i3;
                this.f256022h = fArr;
            }

            public void run() {
                C91464b bVar = (C91464b) ((HashMap) C88672e.this.f255993i).get(Short.valueOf(this.f256018d.f251260a));
                if (bVar == null) {
                    Log.m105920e("MicroMsg.GameLiveAppbrandAudioMgrService", "[hilive] AbstractAudioOutputListener onOutput failed, sessionId: " + this.f256018d.f251260a + " audioType: " + this.f256018d.f251261b + " audioId: " + this.f256018d.f251262c + " format: " + this.f256019e + " channel: " + this.f256020f + " samplerate: " + this.f256021g + " size: " + this.f256022h.length);
                    return;
                }
                bVar.mo125401e((short) this.f256020f, this.f256021g, this.f256022h);
            }
        }

        /* renamed from: lz1.e$a$d */
        public class C88677d implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C86468a.C86469a f256024d;

            public C88677d(C86468a.C86469a aVar) {
                this.f256024d = aVar;
            }

            public void run() {
                Log.m105924i("MicroMsg.GameLiveAppbrandAudioMgrService", "[hilive] AbstractAudioOutputListener onStop sessionId: " + this.f256024d.f251260a + " audioType: " + this.f256024d.f251261b + " audioId: " + this.f256024d.f251262c + " streams: " + ((HashMap) C88672e.this.f255993i).size());
                C91464b bVar = (C91464b) ((HashMap) C88672e.this.f255993i).remove(Short.valueOf(this.f256024d.f251260a));
                if (bVar == null) {
                    Log.m105920e("MicroMsg.GameLiveAppbrandAudioMgrService", "[hilive] AbstractAudioOutputListener onStop, not found sessionId: " + this.f256024d.f251260a + " audioType: " + this.f256024d.f251261b + " audioId: " + this.f256024d.f251262c + " streams: " + ((HashMap) C88672e.this.f255993i).size());
                    return;
                }
                bVar.mo125399c();
            }
        }

        public C88673a() {
        }

        /* renamed from: a */
        public void mo120890a(C86468a.C86469a aVar, int i, int i2, int i3, byte[] bArr) {
            if (C88672e.this.f255990f != null) {
                synchronized (this) {
                    C88672e eVar = C88672e.this;
                    if (!eVar.f256000s) {
                        if (!eVar.f256001t) {
                            C86468a.C86469a aVar2 = aVar;
                            int i4 = i;
                            int i5 = i2;
                            int i6 = i3;
                            C88672e.this.f255990f.post(new C88675b(aVar2, i4, i5, i6, (byte[]) bArr.clone(), System.currentTimeMillis()));
                        }
                    }
                }
            }
        }

        /* renamed from: b */
        public void mo120891b(C86468a.C86469a aVar, int i, int i2, int i3, float[] fArr) {
            if (C88672e.this.f255990f != null) {
                synchronized (this) {
                    C88672e eVar = C88672e.this;
                    if (!eVar.f256000s) {
                        if (!eVar.f256001t) {
                            C88672e.this.f255990f.post(new C88676c(aVar, i, i2, i3, (float[]) fArr.clone()));
                        }
                    }
                }
            }
        }

        /* renamed from: c */
        public void mo120892c(C86468a.C86469a aVar) {
            MMHandler mMHandler = C88672e.this.f255990f;
            if (mMHandler != null) {
                mMHandler.post(new C88674a(aVar));
            }
        }

        /* renamed from: d */
        public void mo120893d(C86468a.C86469a aVar) {
            MMHandler mMHandler = C88672e.this.f255990f;
            if (mMHandler != null) {
                mMHandler.post(new C88677d(aVar));
            }
        }
    }

    /* renamed from: lz1.e$b */
    public class C88678b implements Runnable {
        public C88678b() {
        }

        public void run() {
            long currentTimeMillis = System.currentTimeMillis();
            if (!((HashMap) C88672e.this.f255993i).isEmpty()) {
                for (Map.Entry value : ((HashMap) C88672e.this.f255993i).entrySet()) {
                    C91464b bVar = (C91464b) value.getValue();
                    if (bVar.f262203b) {
                        C88672e.this.f255994j.mo125396c(bVar.f262202a, bVar.f262205d, bVar.f262204c, bVar.mo125397a());
                    }
                }
                byte[] a = C88672e.this.f255994j.mo125394a();
                if (a == null) {
                    Log.m105920e("MicroMsg.GameLiveAppbrandAudioMgrService", "[hilive] getData fail");
                    return;
                }
                C88672e eVar = C88672e.this;
                float f = ((float) eVar.f255999r) / ((float) eVar.f255998q);
                for (int i = 0; i < a.length; i += 2) {
                    int i2 = i + 1;
                    short s = (short) ((int) (((float) ((short) (((a[i2] << 8) | (a[i] & ExifInterface.MARKER)) & ExifInterface.MARKER))) * f));
                    a[i] = (byte) (s & 255);
                    a[i2] = (byte) ((s >> 8) & 255);
                }
                if (((Boolean) ((C36570n) ((GameLiveCommonService) C86312j.m106911c(GameLiveCommonService.class)).f237641d).getValue()).booleanValue()) {
                    try {
                        C88672e.this.f255996o.write(a);
                    } catch (IOException unused) {
                    }
                }
                C88687n nVar = new C88687n((byte[]) a.clone(), System.currentTimeMillis());
                C88672e eVar2 = C88672e.this;
                MMHandler mMHandler = eVar2.f255991g;
                if (mMHandler != null) {
                    mMHandler.post(new C88682h(eVar2, nVar));
                }
            }
            C88672e eVar3 = C88672e.this;
            if (eVar3.f255995n == 0) {
                eVar3.f255995n = SystemClock.uptimeMillis();
            }
            long j = (long) 40;
            C88672e.this.f255995n += j;
            long uptimeMillis = SystemClock.uptimeMillis();
            if (uptimeMillis > C88672e.this.f255995n) {
                Log.m105925i("MicroMsg.GameLiveAppbrandAudioMgrService", "fix next update time, now:%d updateTime:%d", Long.valueOf(uptimeMillis), Long.valueOf(C88672e.this.f255995n));
                C88672e.this.f255995n = uptimeMillis + j;
            }
            synchronized (this) {
                C88672e eVar4 = C88672e.this;
                MMHandler mMHandler2 = eVar4.f255990f;
                if (mMHandler2 != null && !eVar4.f256001t) {
                    mMHandler2.postAtTime(eVar4.f255987A, eVar4.f255995n);
                }
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            C88672e eVar5 = C88672e.this;
            if (currentTimeMillis2 - eVar5.f256003v > 10000) {
                eVar5.f256003v = System.currentTimeMillis();
                Log.m105925i("MicroMsg.GameLiveAppbrandAudioMgrService", "send audio data, cost %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            }
        }
    }

    /* renamed from: lz1.e$c */
    public class C88679c extends ContentObserver {
        public C88679c(Handler handler) {
            super(handler);
        }

        public boolean deliverSelfNotifications() {
            return false;
        }

        public void onChange(boolean z) {
            int streamVolume = C88672e.this.f255997p.getStreamVolume(3);
            Log.m105925i("MicroMsg.GameLiveAppbrandAudioMgrService", "user vol changed old:%d new:%d max:%d", Integer.valueOf(C88672e.this.f255999r), Integer.valueOf(streamVolume), Integer.valueOf(C88672e.this.f255998q));
            C88672e.this.f255999r = streamVolume;
        }
    }

    public C88672e() {
        AudioManager audioManager = (AudioManager) MMApplicationContext.getContext().getSystemService("audio");
        this.f255997p = audioManager;
        this.f255998q = audioManager.getStreamMaxVolume(3);
        this.f256000s = false;
        this.f256001t = false;
        this.f256002u = new C88679c((Handler) null);
        this.f256003v = 0;
        this.f256005x = "MicroMsgGameLiveAudio";
        this.f256006y = ((C60194q2) C86312j.m106911c(C60194q2.class)).tq0();
        this.f256007z = new C88673a();
        this.f255987A = new C88678b();
    }

    /* renamed from: g5 */
    public void mo80088g5(boolean z) {
        Log.m105925i("MicroMsg.GameLiveAppbrandAudioMgrService", "onHeadsetStateChange %b", Boolean.valueOf(z));
        kg0(true, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0067, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void kg0(boolean r7, boolean r8) {
        /*
            r6 = this;
            boolean r0 = r6.vx0()
            r1 = 0
            if (r0 == 0) goto L_0x0012
            java.lang.String r7 = "MicroMsg.GameLiveAppbrandAudioMgrService"
            java.lang.String r8 = "switch disabled"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)
            r6.f256001t = r1
            return
        L_0x0012:
            if (r7 == 0) goto L_0x0015
            goto L_0x001b
        L_0x0015:
            mt1.a r7 = r6.f256006y
            boolean r8 = r7.mo80132a()
        L_0x001b:
            java.lang.Class<kz1.l> r7 = kz1.C88349l.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            kz1.l r7 = (kz1.C88349l) r7
            java.lang.Boolean r7 = r7.mo118236Ao()
            boolean r7 = r7.booleanValue()
            r0 = 1
            r7 = r7 ^ r0
            java.lang.String r2 = "MicroMsg.GameLiveAppbrandAudioMgrService"
            java.lang.String r3 = "checkDisableMusicCapture headset: %b isMute:%b"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r8)
            r4[r1] = r5
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r7)
            r4[r0] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r4)
            monitor-enter(r6)
            boolean r2 = r6.f256001t     // Catch:{ all -> 0x0068 }
            if (r8 != 0) goto L_0x004b
            if (r7 != 0) goto L_0x004b
            r1 = 1
        L_0x004b:
            r6.f256001t = r1     // Catch:{ all -> 0x0068 }
            if (r2 != r1) goto L_0x0051
            monitor-exit(r6)     // Catch:{ all -> 0x0068 }
            return
        L_0x0051:
            if (r1 == 0) goto L_0x005d
            com.tencent.mm.sdk.platformtools.MMHandler r7 = r6.f255990f     // Catch:{ all -> 0x0068 }
            if (r7 == 0) goto L_0x0066
            java.lang.Runnable r8 = r6.f255987A     // Catch:{ all -> 0x0068 }
            r7.removeCallbacks(r8)     // Catch:{ all -> 0x0068 }
            goto L_0x0066
        L_0x005d:
            com.tencent.mm.sdk.platformtools.MMHandler r7 = r6.f255990f     // Catch:{ all -> 0x0068 }
            if (r7 == 0) goto L_0x0066
            java.lang.Runnable r8 = r6.f255987A     // Catch:{ all -> 0x0068 }
            r7.post(r8)     // Catch:{ all -> 0x0068 }
        L_0x0066:
            monitor-exit(r6)     // Catch:{ all -> 0x0068 }
            return
        L_0x0068:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0068 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: lz1.C88672e.kg0(boolean, boolean):void");
    }

    public final boolean vx0() {
        return ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_finder_live_wagame_disable_mic_capture_music, 0) == 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void wx0() {
        /*
            r6 = this;
            monitor-enter(r6)
            java.lang.String r0 = "MicroMsg.GameLiveAppbrandAudioMgrService"
            java.lang.String r1 = "pause %b"
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x0028 }
            r4 = 0
            boolean r5 = r6.f256000s     // Catch:{ all -> 0x0028 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x0028 }
            r3[r4] = r5     // Catch:{ all -> 0x0028 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r3)     // Catch:{ all -> 0x0028 }
            boolean r0 = r6.f256000s     // Catch:{ all -> 0x0028 }
            if (r0 == 0) goto L_0x001b
            monitor-exit(r6)
            return
        L_0x001b:
            r6.f256000s = r2     // Catch:{ all -> 0x0028 }
            com.tencent.mm.sdk.platformtools.MMHandler r0 = r6.f255990f     // Catch:{ all -> 0x0028 }
            if (r0 == 0) goto L_0x0026
            java.lang.Runnable r1 = r6.f255987A     // Catch:{ all -> 0x0028 }
            r0.removeCallbacks(r1)     // Catch:{ all -> 0x0028 }
        L_0x0026:
            monitor-exit(r6)
            return
        L_0x0028:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lz1.C88672e.wx0():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void xx0() {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = "MicroMsg.GameLiveAppbrandAudioMgrService"
            java.lang.String r1 = "resume %b"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0028 }
            boolean r3 = r5.f256000s     // Catch:{ all -> 0x0028 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x0028 }
            r4 = 0
            r2[r4] = r3     // Catch:{ all -> 0x0028 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r2)     // Catch:{ all -> 0x0028 }
            boolean r0 = r5.f256000s     // Catch:{ all -> 0x0028 }
            if (r0 != 0) goto L_0x001b
            monitor-exit(r5)
            return
        L_0x001b:
            r5.f256000s = r4     // Catch:{ all -> 0x0028 }
            com.tencent.mm.sdk.platformtools.MMHandler r0 = r5.f255990f     // Catch:{ all -> 0x0028 }
            if (r0 == 0) goto L_0x0026
            java.lang.Runnable r1 = r5.f255987A     // Catch:{ all -> 0x0028 }
            r0.post(r1)     // Catch:{ all -> 0x0028 }
        L_0x0026:
            monitor-exit(r5)
            return
        L_0x0028:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lz1.C88672e.xx0():void");
    }
}
