package yj0;

import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.os.SystemClock;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.p944ap.WVAPJNI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import ea2.C20561h;
import ea2.C86468a;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import mj0.C88733c;
import p375qh.C89658b;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: yj0.c */
public class C91465c {

    /* renamed from: a */
    public final String f262213a;

    /* renamed from: b */
    public final Map<Short, C91464b> f262214b = new HashMap();

    /* renamed from: c */
    public final C91463a f262215c = new C91463a();

    /* renamed from: d */
    public final AudioManager f262216d;

    /* renamed from: e */
    public final int f262217e;

    /* renamed from: f */
    public int f262218f;

    /* renamed from: g */
    public C91468c f262219g;

    /* renamed from: h */
    public OutputStream f262220h;

    /* renamed from: i */
    public C86468a f262221i;

    /* renamed from: j */
    public long f262222j;

    /* renamed from: k */
    public final Runnable f262223k;

    /* renamed from: l */
    public C89658b f262224l;

    /* renamed from: m */
    public final WeakReference<C88733c> f262225m;

    /* renamed from: n */
    public boolean f262226n;

    /* renamed from: o */
    public boolean f262227o;

    /* renamed from: yj0.c$a */
    public class C91466a extends C86468a {
        public C91466a() {
        }

        /* renamed from: a */
        public void mo120890a(C86468a.C86469a aVar, int i, int i2, int i3, byte[] bArr) {
            if (!C91465c.this.mo125402a() && !C91465c.this.mo125403b()) {
                c$a$$a c_a__a = new c$a$$a(this, aVar, i, i2, i3, (byte[]) bArr.clone(), System.currentTimeMillis());
                ((C119157j) C119157j.f356862d).mo183876g(c_a__a, C91465c.this.f262213a);
            }
        }

        /* renamed from: b */
        public void mo120891b(C86468a.C86469a aVar, int i, int i2, int i3, float[] fArr) {
            if (!C91465c.this.mo125402a() && !C91465c.this.mo125403b()) {
                c$a$$d c_a__d = new c$a$$d(this, aVar, i, i2, i3, (float[]) fArr.clone());
                ((C119157j) C119157j.f356862d).mo183876g(c_a__d, C91465c.this.f262213a);
            }
        }

        /* renamed from: c */
        public void mo120892c(C86468a.C86469a aVar) {
            if (!C91465c.this.mo125402a() && !C91465c.this.mo125403b()) {
                ((C119157j) C119157j.f356862d).mo183876g(new c$a$$b(this, aVar), C91465c.this.f262213a);
            }
        }

        /* renamed from: d */
        public void mo120893d(C86468a.C86469a aVar) {
            c$a$$c c_a__c = new c$a$$c(this, aVar);
            ((C119157j) C119157j.f356862d).mo183876g(c_a__c, C91465c.this.f262213a);
        }
    }

    /* renamed from: yj0.c$b */
    public class C91467b implements Runnable {
        public C91467b() {
        }

        public void run() {
            C91465c cVar;
            if (!C91465c.this.mo125402a() && !C91465c.this.mo125403b()) {
                if (!((HashMap) C91465c.this.f262214b).isEmpty()) {
                    for (Map.Entry value : ((HashMap) C91465c.this.f262214b).entrySet()) {
                        C91464b bVar = (C91464b) value.getValue();
                        if (bVar.f262203b) {
                            C91465c.this.f262215c.mo125396c(bVar.f262202a, bVar.f262205d, bVar.f262204c, bVar.mo125397a());
                        }
                    }
                    byte[] a = C91465c.this.f262215c.mo125394a();
                    if (a == null) {
                        Log.m105920e("MicroMsg.GameRecordAudioLogic", "[hilive] getData fail");
                        return;
                    }
                    C91465c cVar2 = C91465c.this;
                    float f = ((float) cVar2.f262218f) / ((float) cVar2.f262217e);
                    cVar2.getClass();
                    for (int i = 0; i < a.length; i += 2) {
                        int i2 = i + 1;
                        short s = (short) ((int) (((float) ((short) (((a[i2] << 8) | (a[i] & ExifInterface.MARKER)) & ExifInterface.MARKER))) * f));
                        a[i] = (byte) (s & 255);
                        a[i2] = (byte) ((s >> 8) & 255);
                    }
                    OutputStream outputStream = C91465c.this.f262220h;
                    if (outputStream != null) {
                        try {
                            outputStream.write(a);
                        } catch (Exception unused) {
                        }
                    }
                    C89658b bVar2 = C91465c.this.f262224l;
                    if (bVar2 != null) {
                        bVar2.mo35508a(a, a.length);
                    }
                }
                C91465c cVar3 = C91465c.this;
                if (cVar3.f262222j == 0) {
                    cVar3.f262222j = SystemClock.uptimeMillis();
                }
                long uptimeMillis = SystemClock.uptimeMillis();
                while (true) {
                    cVar = C91465c.this;
                    long j = cVar.f262222j;
                    if (j >= uptimeMillis) {
                        break;
                    }
                    cVar.f262222j = j + ((long) 40);
                }
                if (!cVar.mo125402a() && !C91465c.this.mo125403b()) {
                    C119179t tVar = C119157j.f356862d;
                    C91465c cVar4 = C91465c.this;
                    ((C119157j) tVar).mo183879j(cVar4.f262223k, cVar4.f262222j - uptimeMillis, cVar4.f262213a);
                }
            }
        }
    }

    /* renamed from: yj0.c$c */
    public class C91468c extends ContentObserver {
        public C91468c(Handler handler) {
            super(handler);
        }

        public boolean deliverSelfNotifications() {
            return false;
        }

        public void onChange(boolean z) {
            int streamVolume = C91465c.this.f262216d.getStreamVolume(3);
            Log.m105925i("MicroMsg.GameRecordAudioLogic", "user vol changed old:%d new:%d max:%d", Integer.valueOf(C91465c.this.f262218f), Integer.valueOf(streamVolume), Integer.valueOf(C91465c.this.f262217e));
            C91465c.this.f262218f = streamVolume;
        }
    }

    public C91465c(C81925i2 i2Var) {
        AudioManager audioManager = (AudioManager) MMApplicationContext.getContext().getSystemService("audio");
        this.f262216d = audioManager;
        this.f262217e = audioManager.getStreamMaxVolume(3);
        this.f262219g = new C91468c((Handler) null);
        this.f262220h = null;
        this.f262221i = new C91466a();
        this.f262222j = 0;
        this.f262223k = new C91467b();
        this.f262226n = true;
        this.f262227o = true;
        Log.m105924i("MicroMsg.GameRecordAudioLogic", "game record audio: create audio logic");
        this.f262213a = "MicroMsg.GameRecordAudioLogic" + hashCode();
        this.f262225m = new WeakReference<>((C88733c) i2Var.mo114341l0().mo116150E0(C88733c.class));
    }

    /* renamed from: a */
    public final synchronized boolean mo125402a() {
        return this.f262227o;
    }

    /* renamed from: b */
    public final synchronized boolean mo125403b() {
        return this.f262226n;
    }

    /* renamed from: c */
    public void mo125404c() {
        Log.m105924i("MicroMsg.GameRecordAudioLogic", "pause, mIsPaused: " + mo125402a());
        if (!mo125402a()) {
            synchronized (this) {
                this.f262227o = true;
            }
            C20561h.m22332s().mo32149H();
            if (this.f262225m.get() != null) {
                this.f262225m.get().mo123168z((C86468a) null);
            }
            ((C119157j) C119157j.f356862d).mo183894y(this.f262213a);
        }
    }

    /* renamed from: d */
    public void mo125405d() {
        Log.m105924i("MicroMsg.GameRecordAudioLogic", "resume, mIsPaused: " + mo125402a());
        if (mo125402a()) {
            synchronized (this) {
                this.f262227o = false;
            }
            C20561h.m22332s().mo32156O(this.f262221i);
            if (this.f262225m.get() != null) {
                this.f262225m.get().mo123168z(this.f262221i);
            }
            this.f262222j = 0;
            ((C119157j) C119157j.f356862d).mo183876g(this.f262223k, this.f262213a);
        }
    }

    /* renamed from: e */
    public void mo125406e() {
        Log.m105924i("MicroMsg.GameRecordAudioLogic", "stop, mIsStopped: " + mo125403b());
        if (!mo125403b()) {
            synchronized (this) {
                this.f262226n = true;
            }
            MMApplicationContext.getContext().getContentResolver().unregisterContentObserver(this.f262219g);
            mo125404c();
            for (C91464b c : ((HashMap) this.f262214b).values()) {
                c.mo125399c();
            }
            ((HashMap) this.f262214b).clear();
            C91463a aVar = this.f262215c;
            synchronized (aVar) {
                try {
                    WVAPJNI.nativeMixerUninit(aVar.f262198b);
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.GameLiveAudioMixer", "[hilive] nativeMixerUninit Exception " + e.getMessage());
                } catch (UnsatisfiedLinkError e2) {
                    try {
                        Log.m105920e("MicroMsg.GameLiveAudioMixer", "[hilive] nativeMixerUninit UnsatisfiedLinkError " + e2.getMessage());
                    } catch (Throwable th) {
                        aVar.f262198b = 0;
                        aVar.f262197a = false;
                        throw th;
                    }
                }
                aVar.f262198b = 0;
                aVar.f262197a = false;
            }
            OutputStream outputStream = this.f262220h;
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException unused) {
                }
            }
        }
    }
}
