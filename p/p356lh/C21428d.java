package p356lh;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import com.tencent.p014mm.autogen.events.AudioPlayerEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import nb0.C88912b;
import nb0.C88914d;
import p213oh.C11412b;
import p335eh.C20599b;
import p335eh.C20600c;
import p339fh.C116869j;
import p339fh.C20711f;
import p339fh.C20712g;
import p348ih.C21076a;
import p348ih.C21078b;
import p348ih.C21090n;
import p348ih.C21091o;
import p354kh.C21333a;
import p354kh.C21335b;
import p354kh.C21338g;
import tm0.C14016b0;

/* renamed from: lh.d */
public class C21428d {

    /* renamed from: a */
    public AudioTrack f60639a;

    /* renamed from: b */
    public AtomicBoolean f60640b = new AtomicBoolean(false);

    /* renamed from: c */
    public AtomicBoolean f60641c = new AtomicBoolean(false);

    /* renamed from: d */
    public AtomicBoolean f60642d = new AtomicBoolean(true);

    /* renamed from: e */
    public Queue<C20599b> f60643e = new ArrayDeque();

    /* renamed from: f */
    public Object f60644f = new Object();

    /* renamed from: g */
    public Object f60645g = new Object();

    /* renamed from: h */
    public Thread f60646h;

    /* renamed from: i */
    public C21333a f60647i;

    /* renamed from: j */
    public C21426b f60648j;

    /* renamed from: k */
    public C21091o f60649k;

    /* renamed from: l */
    public C21435i f60650l;

    /* renamed from: m */
    public volatile HashMap<String, C88912b> f60651m = new HashMap<>();

    /* renamed from: n */
    public volatile HashMap<String, Boolean> f60652n = new HashMap<>();

    /* renamed from: o */
    public volatile HashMap<String, Boolean> f60653o = new HashMap<>();

    /* renamed from: p */
    public volatile HashMap<String, C21433g<Integer>> f60654p = new HashMap<>();

    /* renamed from: q */
    public volatile HashMap<String, C88914d> f60655q = new HashMap<>();

    /* renamed from: r */
    public volatile HashMap<String, Boolean> f60656r = new HashMap<>();

    /* renamed from: s */
    public ArrayList<String> f60657s = new ArrayList<>();

    /* renamed from: t */
    public C21076a f60658t;

    /* renamed from: u */
    public byte[] f60659u;

    /* renamed from: v */
    public Handler f60660v;

    /* renamed from: w */
    public volatile boolean f60661w;

    /* renamed from: x */
    public int f60662x;

    /* renamed from: y */
    public Runnable f60663y;

    /* renamed from: z */
    public ArrayList<String> f60664z;

    /* renamed from: lh.d$a */
    public class C21429a implements Runnable {
        public C21429a() {
        }

        public void run() {
            C20599b bVar;
            int i;
            Process.setThreadPriority(-19);
            if (C21428d.this.f60642d.get()) {
                int i2 = C11412b.f33577a;
                Log.m105921e("MicroMsg.Mix.AudioMixPlayerImpl", "stop and exit", (Object[]) null);
                return;
            }
            C21428d dVar = C21428d.this;
            if (dVar.f60639a == null) {
                C21428d.m24210a(dVar);
            }
            int i3 = C11412b.f33577a;
            Log.m105925i("MicroMsg.Mix.AudioMixPlayerImpl", "playback start", (Object[]) null);
            while (true) {
                if (C21428d.this.f60642d.get()) {
                    break;
                }
                C21428d dVar2 = C21428d.this;
                synchronized (dVar2.f60644f) {
                    while (dVar2.f60641c.get() && !dVar2.f60642d.get()) {
                        int i4 = C11412b.f33577a;
                        Log.m105925i("MicroMsg.Mix.AudioMixPlayerImpl", "waitPlay", (Object[]) null);
                        try {
                            dVar2.f60644f.wait();
                        } catch (Exception e) {
                            Log.printErrStackTrace("MicroMsg.Mix.AudioMixPlayerImpl", e, "waitPlay", new Object[0]);
                        }
                    }
                }
                if (C21428d.this.f60642d.get()) {
                    Log.m105921e("MicroMsg.Mix.AudioMixPlayerImpl", "playback break", (Object[]) null);
                    break;
                }
                C21428d dVar3 = C21428d.this;
                synchronized (dVar3.f60644f) {
                    while (true) {
                        if ((((ArrayDeque) dVar3.f60643e).size() == 0 || dVar3.f60641c.get()) && !dVar3.f60642d.get()) {
                            try {
                                int i5 = C11412b.f33577a;
                                Log.m105925i("MicroMsg.Mix.AudioMixPlayerImpl", "wait play", (Object[]) null);
                                dVar3.mo33593n(0.0f, 0.0f);
                                AudioTrack audioTrack = dVar3.f60639a;
                                if (audioTrack != null && audioTrack.getPlayState() == 3) {
                                    dVar3.f60639a.stop();
                                }
                                dVar3.f60644f.wait();
                                dVar3.f60662x = 0;
                            } catch (InterruptedException e2) {
                                int i6 = C11412b.f33577a;
                                Log.printErrStackTrace("MicroMsg.Mix.AudioMixPlayerImpl", e2, "waitPlay", new Object[0]);
                            }
                        }
                    }
                    bVar = (C20599b) ((ArrayDeque) dVar3.f60643e).poll();
                    dVar3.f60644f.notifyAll();
                }
                if (bVar != null) {
                    byte[] bArr = bVar.f57998c;
                    C21428d dVar4 = C21428d.this;
                    if (dVar4.f60639a == null) {
                        C21428d.m24210a(dVar4);
                    }
                    if (bArr != null && bArr.length > 0) {
                        AudioTrack audioTrack2 = C21428d.this.f60639a;
                        if (audioTrack2 != null && (audioTrack2.getPlayState() == 1 || C21428d.this.f60639a.getPlayState() == 2)) {
                            C21428d.this.f60639a.play();
                        }
                        C21428d.m24211b(C21428d.this, bVar);
                        C21428d dVar5 = C21428d.this;
                        dVar5.f60662x++;
                        dVar5.mo33589j(bVar);
                        long currentTimeMillis = System.currentTimeMillis();
                        C21428d dVar6 = C21428d.this;
                        if (dVar6.f60639a != null) {
                            if (dVar6.f60647i.f60298e.get()) {
                                Log.m105925i("MicroMsg.Mix.AudioMixPlayerImpl", "isMute", (Object[]) null);
                                C21428d.this.f60639a.setStereoVolume(0.0f, 0.0f);
                            } else {
                                C21428d.this.f60639a.setStereoVolume(1.0f, 1.0f);
                            }
                            i = C21428d.this.f60639a.write(bArr, 0, bArr.length);
                        } else {
                            i = 0;
                        }
                        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                        if (currentTimeMillis2 > 100) {
                            Log.m105921e("MicroMsg.Mix.AudioMixPlayerImpl", "write audio track after writeSize:%d, time:%d, writeCount:%d", Integer.valueOf(i), Long.valueOf(currentTimeMillis2), Integer.valueOf(C21428d.this.f60662x));
                        }
                        if (i < 0) {
                            Log.m105921e("MicroMsg.Mix.AudioMixPlayerImpl", "write audio track buffer failed, Size:%d", Integer.valueOf(i));
                        }
                        if (((ArrayDeque) C21428d.this.f60643e).size() == 0) {
                            byte[] bArr2 = C21428d.this.f60659u;
                            bArr2[0] = bArr[bArr.length - 2];
                            bArr2[1] = bArr[bArr.length - 1];
                        }
                    }
                    if (C20711f.f58566b == null) {
                        synchronized (C20711f.class) {
                            if (C20711f.f58566b == null) {
                                C20711f.f58566b = new C20711f();
                            }
                        }
                    }
                    C20711f fVar = C20711f.f58566b;
                    synchronized (fVar) {
                        if (bVar.f57998c != null) {
                            bVar.f57997b = 0;
                            bVar.f57996a = 0;
                            bVar.f57999d.clear();
                            byte[] bArr3 = bVar.f57998c;
                            Arrays.fill(bArr3, 0, bArr3.length, (byte) 0);
                            fVar.f58567a.add(0, bVar);
                        }
                    }
                }
            }
            C21428d dVar7 = C21428d.this;
            synchronized (dVar7) {
                try {
                    AudioTrack audioTrack3 = dVar7.f60639a;
                    if (audioTrack3 != null) {
                        audioTrack3.flush();
                        dVar7.f60639a.stop();
                        dVar7.f60639a.release();
                        dVar7.f60639a = null;
                    }
                } catch (Exception e3) {
                    int i7 = C11412b.f33577a;
                    Log.printErrStackTrace("MicroMsg.Mix.AudioMixPlayerImpl", e3, "releaseAudioTrack", new Object[0]);
                }
            }
            Log.m105925i("MicroMsg.Mix.AudioMixPlayerImpl", "release AudioTrack and exit playback thread id:%d", Long.valueOf(Thread.currentThread().getId()));
            return;
        }
    }

    /* renamed from: lh.d$b */
    public class C21430b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f60666d;

        public C21430b(String str) {
            this.f60666d = str;
        }

        public void run() {
            C21428d.this.mo33590k(11, this.f60666d);
        }
    }

    public C21428d(boolean z) {
        new HashMap();
        new HashMap();
        new HashMap();
        new HashMap();
        new HashMap();
        new HashMap();
        this.f60659u = new byte[2];
        this.f60661w = false;
        this.f60662x = 0;
        this.f60663y = new C21429a();
        this.f60664z = new ArrayList<>();
        C21333a aVar = new C21333a(this);
        this.f60647i = aVar;
        int i = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mix.AudioMixController", "onInit", (Object[]) null);
        if (aVar.f60301h == null) {
            Thread thread = new Thread(aVar.f60317x, "audio_mix_controller");
            aVar.f60301h = thread;
            thread.start();
        }
        aVar.f60304k.clear();
        C21335b bVar = new C21335b();
        aVar.f60294a = bVar;
        if (bVar.f60319a == null) {
            bVar.f60319a = new C21338g();
        }
        if (this.f60649k == null) {
            this.f60649k = new C21431e(this);
        }
        if (z) {
            mo33587h();
        }
        this.f60660v = new Handler(Looper.myLooper());
    }

    /* renamed from: a */
    public static void m24210a(C21428d dVar) {
        boolean z;
        synchronized (dVar) {
            int i = C11412b.f33577a;
            Log.m105925i("MicroMsg.Mix.AudioMixPlayerImpl", "createAudioTrack", (Object[]) null);
            int minBufferSize = AudioTrack.getMinBufferSize(44100, 12, 2);
            int i2 = minBufferSize / 3536;
            Log.m105925i("MicroMsg.Mix.AudioMixPlayerImpl", "miniBufferSize:%d, channels:%d, sampleRate:%d", Integer.valueOf(minBufferSize), 2, 44100);
            if (dVar.f60639a == null) {
                Log.m105921e("MicroMsg.Mix.AudioMixPlayerImpl", "audioTrack is null, new AudioTrack", (Object[]) null);
                try {
                    dVar.f60639a = new AudioTrack(3, 44100, 12, 2, minBufferSize, 1);
                } catch (IllegalArgumentException e) {
                    Log.printErrStackTrace("MicroMsg.Mix.AudioMixPlayerImpl", e, "AudioTrack create", new Object[0]);
                }
            }
            AudioTrack audioTrack = dVar.f60639a;
            if (audioTrack == null || audioTrack.getState() != 1) {
                Log.m105921e("MicroMsg.Mix.AudioMixPlayerImpl", "audio track not initialized", (Object[]) null);
                AudioTrack audioTrack2 = dVar.f60639a;
                if (audioTrack2 != null) {
                    Log.m105921e("MicroMsg.Mix.AudioMixPlayerImpl", "AudioTrack getState", Integer.valueOf(audioTrack2.getState()));
                    try {
                        dVar.f60639a.release();
                        dVar.f60639a = null;
                    } catch (Exception e2) {
                        Log.printErrStackTrace("MicroMsg.Mix.AudioMixPlayerImpl", e2, "AudioTrack release", new Object[0]);
                    }
                }
                z = false;
            } else {
                z = true;
            }
        }
        if (!z) {
            int i3 = C11412b.f33577a;
            Log.m105921e("MicroMsg.Mix.AudioMixPlayerImpl", "onError, errCode:%d", 710);
            return;
        }
        Log.m105925i("MicroMsg.Mix.AudioMixPlayerImpl", "create AudioTrack success", (Object[]) null);
        dVar.f60639a.play();
        return;
    }

    /* renamed from: b */
    public static void m24211b(C21428d dVar, C20599b bVar) {
        C20600c cVar;
        if (dVar.f60648j != null && dVar.f60661w) {
            if (C20712g.f58568d == null) {
                synchronized (C20712g.class) {
                    if (C20712g.f58568d == null) {
                        C20712g.f58568d = new C20712g();
                    }
                }
            }
            C20712g gVar = C20712g.f58568d;
            synchronized (gVar) {
                if (gVar.f58569a.size() > 0) {
                    cVar = gVar.f58569a.remove(gVar.f58569a.size() - 1);
                } else if (((long) gVar.f58571c) >= gVar.f58570b) {
                    Object[] objArr = {Integer.valueOf(gVar.f58571c)};
                    int i = C11412b.f33577a;
                    Log.m105921e("MicroMsg.Mix.AudioOutputMixBufferPool", "size >= FIX_SIZE, size:%d", objArr);
                    cVar = null;
                } else {
                    gVar.f58571c++;
                    cVar = new C20600c();
                }
            }
            if (cVar != null) {
                byte[] bArr = cVar.f57998c;
                if (bArr == null || bArr.length < bVar.f57998c.length) {
                    cVar.f57998c = new byte[bVar.f57998c.length];
                }
                byte[] bArr2 = bVar.f57998c;
                System.arraycopy(bArr2, 0, cVar.f57998c, 0, bArr2.length);
                dVar.f60660v.post(new C21432f(dVar, cVar));
            }
        }
    }

    /* renamed from: c */
    public C88912b mo33582c(String str) {
        if (this.f60651m.containsKey(str)) {
            return this.f60651m.get(str);
        }
        return null;
    }

    /* renamed from: d */
    public int mo33583d(String str) {
        C88912b bVar;
        if (!this.f60651m.containsKey(str) || (bVar = this.f60651m.get(str)) == null) {
            return 0;
        }
        String str2 = bVar.f256418c;
        if (TextUtils.isEmpty(str2)) {
            return 0;
        }
        return (int) C116869j.m164845a().mo180853b(str2).f350075d;
    }

    /* renamed from: e */
    public int mo33584e(String str) {
        C88912b bVar;
        int i;
        C21090n nVar;
        if (!this.f60651m.containsKey(str) || (bVar = this.f60651m.get(str)) == null) {
            return 0;
        }
        if (bVar.f256441z) {
            i = (int) this.f60647i.mo33366b(str);
        } else {
            C21078b bVar2 = this.f60658t.f59590b.get(str);
            long j = -1;
            if (!(bVar2 == null || (nVar = bVar2.f59598i) == null)) {
                j = nVar.getCurrentPosition();
            }
            i = (int) j;
        }
        if (i != -1) {
            bVar.f256421f = i;
        } else {
            i = bVar.f256421f;
        }
        if (i == -1) {
            return 0;
        }
        int d = mo33583d(str);
        return (d <= 0 || i <= d) ? i : d;
    }

    /* renamed from: f */
    public int mo33585f() {
        int i;
        synchronized (this.f60645g) {
            Set<String> keySet = this.f60654p.keySet();
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(keySet);
            Iterator it = arrayList.iterator();
            i = 0;
            while (it.hasNext()) {
                C21433g gVar = this.f60654p.get((String) it.next());
                if (gVar != null) {
                    if (!gVar.mo33599a(0)) {
                        if (!gVar.mo33599a(1)) {
                        }
                    }
                    i++;
                }
            }
        }
        return i;
    }

    /* renamed from: g */
    public int mo33586g(String str) {
        C21433g gVar;
        T t;
        if (!this.f60654p.containsKey(str) || (gVar = this.f60654p.get(str)) == null) {
            return -1;
        }
        synchronized (gVar) {
            t = gVar.f60671a;
        }
        return ((Integer) t).intValue();
    }

    /* renamed from: h */
    public void mo33587h() {
        if (!this.f60640b.get()) {
            int i = C11412b.f33577a;
            Log.m105925i("MicroMsg.Mix.AudioMixPlayerImpl", "initThread", (Object[]) null);
            this.f60640b.set(true);
            this.f60642d.set(false);
            this.f60641c.set(false);
            mo33592m();
        }
    }

    /* renamed from: i */
    public boolean mo33588i(String str) {
        if (this.f60654p.containsKey(str)) {
            C21433g gVar = this.f60654p.get(str);
            if (gVar != null) {
                if (gVar.mo33599a(0) && !this.f60647i.f60297d.get()) {
                    return true;
                }
            }
            return !this.f60647i.f60297d.get() && !this.f60647i.mo33368d(str) && this.f60658t.mo32800b(str);
        }
    }

    /* renamed from: j */
    public void mo33589j(C20599b bVar) {
        Iterator<String> it = bVar.f57999d.iterator();
        while (it.hasNext()) {
            String next = it.next();
            boolean z = false;
            synchronized (this.f60645g) {
                if (!TextUtils.isEmpty(next)) {
                    if (!this.f60656r.containsKey(next) || !this.f60656r.get(next).booleanValue()) {
                        if (this.f60656r.containsKey(next)) {
                            this.f60656r.put(next, Boolean.TRUE);
                            z = true;
                        }
                        if (z) {
                            this.f60660v.post(new C21430b(next));
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        r0 = (p348ih.C21079c) r0.get();
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo33590k(int r3, java.lang.String r4) {
        /*
            r2 = this;
            kh.a r0 = r2.f60647i
            java.util.HashMap<java.lang.String, java.lang.ref.WeakReference<ih.c>> r0 = r0.f60306m
            java.lang.Object r0 = r0.get(r4)
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            if (r0 == 0) goto L_0x001d
            java.lang.Object r1 = r0.get()
            if (r1 == 0) goto L_0x001d
            java.lang.Object r0 = r0.get()
            ih.c r0 = (p348ih.C21079c) r0
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r0.f59605g
            goto L_0x001f
        L_0x001d:
            java.lang.String r0 = ""
        L_0x001f:
            r2.mo33591l(r3, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p356lh.C21428d.mo33590k(int, java.lang.String):void");
    }

    /* renamed from: l */
    public void mo33591l(int i, String str, String str2) {
        C88912b bVar = this.f60651m.get(str);
        if (bVar != null) {
            AudioPlayerEvent audioPlayerEvent = new AudioPlayerEvent();
            AudioPlayerEvent.C17674a aVar = audioPlayerEvent.f48073d;
            aVar.f48076c = str;
            aVar.f48074a = i;
            aVar.f48078e = bVar.f256429n;
            if (TextUtils.isEmpty(str2)) {
                str2 = bVar.f256417b;
            }
            AudioPlayerEvent.C17674a aVar2 = audioPlayerEvent.f48073d;
            aVar2.f48081h = str2;
            aVar2.f48077d = AudioPlayerEvent.m17972a(i);
            C21091o oVar = this.f60649k;
            if (oVar != null) {
                ((C21431e) oVar).mo33597a(audioPlayerEvent);
            }
        }
    }

    /* renamed from: m */
    public final void mo33592m() {
        synchronized (this) {
            if (this.f60646h == null) {
                Thread thread = new Thread(this.f60663y, "audio_mix_player");
                this.f60646h = thread;
                thread.start();
                Object[] objArr = {Long.valueOf(this.f60646h.getId())};
                int i = C11412b.f33577a;
                Log.m105925i("MicroMsg.Mix.AudioMixPlayerImpl", "start playback thread id:%d", objArr);
            }
        }
    }

    /* renamed from: n */
    public void mo33593n(float f, float f2) {
        try {
            AudioTrack audioTrack = this.f60639a;
            if (audioTrack != null) {
                audioTrack.setStereoVolume(f, f2);
            }
        } catch (Exception e) {
            int i = C11412b.f33577a;
            Log.printErrStackTrace("MicroMsg.Mix.AudioMixPlayerImpl", e, C14016b0.NAME, new Object[0]);
        }
    }

    /* renamed from: o */
    public void mo33594o() {
        synchronized (this.f60644f) {
            int i = C11412b.f33577a;
            Log.m105925i("MicroMsg.Mix.AudioMixPlayerImpl", "sync notify", (Object[]) null);
            try {
                this.f60644f.notifyAll();
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.Mix.AudioMixPlayerImpl", e, "syncNotify", new Object[0]);
            }
        }
    }
}
