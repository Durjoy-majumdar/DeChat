package p348ih;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import nb0.C88912b;
import p213oh.C11412b;
import p335eh.C107275e;
import p335eh.C116768d;
import p339fh.C116867h;
import p339fh.C116869j;
import p346hh.C20941j;
import p354kh.C21333a;
import p356lh.C21428d;
import p356lh.C21434h;
import p366nh.C21632c;

/* renamed from: ih.c */
public abstract class C21079c implements C21090n, C21434h {

    /* renamed from: a */
    public volatile C21428d f59599a;

    /* renamed from: b */
    public volatile C21632c f59600b;

    /* renamed from: c */
    public volatile C88912b f59601c;

    /* renamed from: d */
    public volatile String f59602d;

    /* renamed from: e */
    public C20941j f59603e;

    /* renamed from: f */
    public volatile String f59604f;

    /* renamed from: g */
    public volatile String f59605g;

    /* renamed from: h */
    public AtomicBoolean f59606h = new AtomicBoolean(false);

    /* renamed from: i */
    public AtomicInteger f59607i = new AtomicInteger(0);

    /* renamed from: j */
    public AtomicBoolean f59608j = new AtomicBoolean(false);

    /* renamed from: k */
    public AtomicBoolean f59609k = new AtomicBoolean(false);

    /* renamed from: l */
    public AtomicBoolean f59610l = new AtomicBoolean(false);

    /* renamed from: m */
    public AtomicBoolean f59611m = new AtomicBoolean(false);

    /* renamed from: n */
    public AtomicBoolean f59612n = new AtomicBoolean(false);

    /* renamed from: o */
    public int f59613o = 0;

    /* renamed from: p */
    public int f59614p = 0;

    /* renamed from: q */
    public int f59615q;

    /* renamed from: r */
    public int f59616r = -1;

    /* renamed from: s */
    public Object f59617s = new Object();

    /* renamed from: t */
    public Object f59618t = new Object();

    public C21079c(C21428d dVar, C21632c cVar) {
        this.f59599a = dVar;
        this.f59600b = cVar;
        this.f59601c = this.f59600b.mo32136a();
        this.f59602d = this.f59601c.f256416a;
        this.f59604f = this.f59601c.f256418c;
        this.f59615q = this.f59601c.f256419d;
        this.f59605g = this.f59601c.f256417b;
    }

    /* renamed from: a */
    public void mo32807a(float f, float f2) {
    }

    /* renamed from: b */
    public void mo32808b() {
        int i = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mix.AudioDecoderBase", "pauseOnBackground", (Object[]) null);
        pause();
    }

    /* renamed from: c */
    public String mo32809c() {
        C88912b f = mo32811f();
        if (f != null) {
            return f.f256416a;
        }
        int i = C11412b.f33577a;
        Log.m105921e("MicroMsg.Mix.AudioDecoderBase", "param is null", (Object[]) null);
        return this.f59602d;
    }

    /* renamed from: e */
    public C116768d mo32810e() {
        return C116869j.m164845a().mo180853b(this.f59604f);
    }

    /* renamed from: f */
    public C88912b mo32811f() {
        return this.f59600b != null ? this.f59600b.mo32136a() : this.f59601c;
    }

    /* renamed from: g */
    public boolean mo32812g() {
        return this.f59608j.get();
    }

    public long getCurrentPosition() {
        return -1;
    }

    /* renamed from: h */
    public boolean mo32814h() {
        return this.f59609k.get();
    }

    /* renamed from: i */
    public void mo32815i(int i) {
        if (i < 50) {
            this.f59610l.set(false);
            return;
        }
        C116768d e = mo32810e();
        mo32811f();
        if (e.f350073b) {
            this.f59610l.set(true);
            synchronized (this.f59618t) {
                try {
                    Object[] objArr = {Integer.valueOf(i)};
                    int i2 = C11412b.f33577a;
                    Log.m105925i("MicroMsg.Mix.AudioDecoderBase", "lockWriteBuffer, writeSize:%d", objArr);
                    this.f59618t.wait();
                } catch (Exception e2) {
                    int i3 = C11412b.f33577a;
                    Log.printErrStackTrace("MicroMsg.Mix.AudioDecoderBase", e2, "lockWriteBuffer", new Object[0]);
                }
            }
            return;
        }
        this.f59610l.set(false);
    }

    /* renamed from: j */
    public void mo32816j() {
        synchronized (this.f59618t) {
            try {
                this.f59618t.notify();
            } catch (Exception e) {
                int i = C11412b.f33577a;
                Log.printErrStackTrace("MicroMsg.Mix.AudioDecoderBase", e, "notifyDecode", new Object[0]);
            }
        }
    }

    /* renamed from: k */
    public abstract void mo32817k();

    /* renamed from: l */
    public void mo32818l(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        int i2 = C11412b.f33577a;
        Log.m105921e("MicroMsg.Mix.AudioDecoderBase", "onError, errType:%d", objArr);
        this.f59609k.set(true);
        mo32822p(9, i, "");
    }

    /* renamed from: m */
    public void mo32819m(boolean z) {
        Object[] objArr = {Boolean.valueOf(z)};
        int i = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mix.AudioDecoderBase", "onError needTry:%b", objArr);
        this.f59609k.set(true);
        mo32821o(9);
        C116768d e = mo32810e();
        if (!e.f350073b) {
            e.mo180741g();
        }
    }

    /* renamed from: n */
    public void mo32820n() {
        WeakReference remove;
        C21333a aVar = this.f59599a.f60647i;
        String c = mo32809c();
        if (aVar.f60306m.containsKey(c) && (remove = aVar.f60306m.remove(c)) != null && remove.get() != null) {
            remove.clear();
        }
    }

    /* renamed from: o */
    public void mo32821o(int i) {
        mo32822p(i, 0, "");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0054, code lost:
        if (r13 == 15) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0062 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0063  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo32822p(int r13, int r14, java.lang.String r15) {
        /*
            r12 = this;
            lh.d r0 = r12.f59599a
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            java.util.concurrent.atomic.AtomicInteger r0 = r12.f59607i
            r0.set(r13)
            r0 = 13
            r1 = 12
            r2 = 11
            r3 = 6
            r4 = 5
            r5 = 7
            r6 = 9
            r7 = 2
            r8 = 3
            r9 = -1
            r10 = 4
            if (r13 != 0) goto L_0x001c
            goto L_0x0057
        L_0x001c:
            r11 = 1
            if (r13 != r11) goto L_0x0020
            goto L_0x0057
        L_0x0020:
            if (r13 != r8) goto L_0x0025
            r0 = 9
            goto L_0x0058
        L_0x0025:
            if (r13 != r7) goto L_0x0029
            r0 = 7
            goto L_0x0058
        L_0x0029:
            if (r13 != r10) goto L_0x002d
            r0 = 0
            goto L_0x0058
        L_0x002d:
            if (r13 != r4) goto L_0x0031
            r0 = 2
            goto L_0x0058
        L_0x0031:
            if (r13 != r3) goto L_0x0035
            r0 = 3
            goto L_0x0058
        L_0x0035:
            if (r13 != r5) goto L_0x0039
            r0 = 5
            goto L_0x0058
        L_0x0039:
            if (r13 != r6) goto L_0x003d
            r0 = 4
            goto L_0x0058
        L_0x003d:
            if (r13 != r2) goto L_0x0041
            r0 = 6
            goto L_0x0058
        L_0x0041:
            if (r13 != r1) goto L_0x0046
            r0 = 10
            goto L_0x0058
        L_0x0046:
            if (r13 != r0) goto L_0x004b
            r0 = 11
            goto L_0x0058
        L_0x004b:
            r2 = 14
            if (r13 != r2) goto L_0x0052
            r0 = 12
            goto L_0x0058
        L_0x0052:
            r1 = 15
            if (r13 != r1) goto L_0x0057
            goto L_0x0058
        L_0x0057:
            r0 = -1
        L_0x0058:
            java.lang.String r13 = r12.mo32809c()
            boolean r1 = android.text.TextUtils.isEmpty(r13)
            if (r1 == 0) goto L_0x0063
            return
        L_0x0063:
            lh.d r1 = r12.f59599a
            if (r0 != r9) goto L_0x0068
            goto L_0x00a1
        L_0x0068:
            if (r1 == 0) goto L_0x009a
            if (r0 != r10) goto L_0x009a
            java.util.HashMap<java.lang.String, nb0.b> r2 = r1.f60651m
            java.lang.Object r2 = r2.get(r13)
            nb0.b r2 = (nb0.C88912b) r2
            if (r2 != 0) goto L_0x0077
            goto L_0x00a1
        L_0x0077:
            com.tencent.mm.autogen.events.AudioPlayerEvent r3 = new com.tencent.mm.autogen.events.AudioPlayerEvent
            r3.<init>()
            com.tencent.mm.autogen.events.AudioPlayerEvent$a r4 = r3.f48073d
            r4.f48076c = r13
            r4.f48074a = r0
            java.lang.String r13 = r2.f256429n
            r4.f48078e = r13
            r4.f48079f = r14
            r4.f48080g = r15
            java.lang.String r13 = com.tencent.p014mm.autogen.events.AudioPlayerEvent.m17972a(r0)
            r4.f48077d = r13
            ih.o r13 = r1.f60649k
            if (r13 == 0) goto L_0x00a1
            lh.e r13 = (p356lh.C21431e) r13
            r13.mo33597a(r3)
            goto L_0x00a1
        L_0x009a:
            if (r1 == 0) goto L_0x00a1
            java.lang.String r14 = r12.f59605g
            r1.mo33591l(r0, r13, r14)
        L_0x00a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p348ih.C21079c.mo32822p(int, int, java.lang.String):void");
    }

    public void pause() {
        int i = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mix.AudioDecoderBase", "pause", (Object[]) null);
        mo32821o(5);
        this.f59608j.set(true);
        this.f59611m.set(false);
    }

    /* renamed from: q */
    public void mo32824q() {
    }

    /* renamed from: r */
    public void mo32825r() {
    }

    /* renamed from: s */
    public void mo32826s(C107275e eVar) {
        Object obj;
        if (this.f59600b.mo32136a().f256441z) {
            if (!this.f59612n.get()) {
                this.f59612n.set(true);
                mo32821o(14);
            }
            C21333a aVar = this.f59599a.f60647i;
            String c = mo32809c();
            aVar.getClass();
            Object obj2 = null;
            int i = 0;
            if (eVar == null || TextUtils.isEmpty(c) || eVar.f320943f == null) {
                int i2 = C11412b.f33577a;
                Log.m105921e("MicroMsg.Mix.AudioMixController", "track is invalid", (Object[]) null);
            } else {
                if (!aVar.f60304k.containsKey(c)) {
                    int i3 = C11412b.f33577a;
                    Log.m105921e("MicroMsg.Mix.AudioMixController", "queue not exist for audioId:%s", c);
                    synchronized (aVar.f60307n) {
                        aVar.f60304k.put(c, new ArrayList());
                        if (!aVar.f60302i.contains(c)) {
                            aVar.f60302i.add(c);
                        }
                        if (!aVar.f60303j.containsKey(c)) {
                            obj2 = new Object();
                            aVar.f60303j.put(c, obj2);
                        }
                    }
                }
                if (obj == null) {
                    if (!aVar.f60303j.containsKey(c)) {
                        synchronized (aVar.f60307n) {
                            if (!aVar.f60303j.containsKey(c)) {
                                obj = new Object();
                                aVar.f60303j.put(c, obj);
                            } else {
                                obj = aVar.f60303j.get(c);
                            }
                        }
                    } else {
                        obj = aVar.f60303j.get(c);
                    }
                }
                if (obj == null) {
                    obj = new Object();
                }
                Object obj3 = obj;
                if (!aVar.f60306m.containsKey(c)) {
                    aVar.f60306m.put(c, new WeakReference(this));
                }
                List list = aVar.f60304k.get(c);
                synchronized (obj3) {
                    if (list != null) {
                        list.add(0, eVar);
                        synchronized (aVar.f60307n) {
                            try {
                                aVar.f60307n.notifyAll();
                            } catch (Exception e) {
                                int i4 = C11412b.f33577a;
                                Log.printErrStackTrace("MicroMsg.Mix.AudioMixController", e, "writePcmDataTrack", new Object[0]);
                            }
                        }
                        i = list.size();
                    } else if (eVar.f320944g) {
                        C116867h.m164840a().mo180851c(eVar);
                    }
                }
            }
            mo32815i(i);
        }
    }

    public void seek(int i) {
        int i2 = this.f59615q;
        synchronized (this.f59617s) {
            this.f59615q = i;
            this.f59616r = i / 20;
            Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i)};
            int i3 = C11412b.f33577a;
            Log.m105925i("MicroMsg.Mix.AudioDecoderBase", "seek preStartTime:%d, seek position:%d", objArr);
        }
    }

    /* renamed from: t */
    public void mo32828t() {
        int i = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mix.AudioDecoderBase", "readCacheAndPlay", (Object[]) null);
        C116768d e = mo32810e();
        mo32825r();
        int k = e.mo180745k();
        int i2 = 0;
        while (i2 < k && !mo32814h()) {
            mo32832x();
            synchronized (this.f59617s) {
                int i3 = this.f59616r;
                if (i3 >= 0 && i3 < k) {
                    this.f59616r = -1;
                    Log.m105925i("MicroMsg.Mix.AudioDecoderBase", "seek to pos:%s", Integer.valueOf(i3));
                    i2 = i3;
                }
            }
            C107275e e2 = e.mo180739e(i2);
            if (e2 != null) {
                mo32833y(e2);
            }
            i2++;
        }
        mo32824q();
    }

    /* renamed from: u */
    public void mo32829u() {
        if (!this.f59611m.get() && !this.f59609k.get()) {
            this.f59611m.set(true);
            mo32821o(13);
        }
    }

    /* renamed from: v */
    public void mo32830v() {
        int i = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mix.AudioDecoderBase", "stop", (Object[]) null);
        mo32807a(0.0f, 0.0f);
        mo32821o(6);
        this.f59609k.set(true);
        this.f59608j.set(false);
        mo32816j();
        this.f59611m.set(false);
        this.f59612n.set(false);
    }

    /* renamed from: w */
    public void mo32831w(int i) {
        if (i < 20 && this.f59610l.get() && !mo32812g() && !mo32814h()) {
            Object[] objArr = {Integer.valueOf(i)};
            int i2 = C11412b.f33577a;
            Log.m105925i("MicroMsg.Mix.AudioDecoderBase", "unLockWrite, queueSize:%d", objArr);
            mo32816j();
        }
    }

    /* renamed from: x */
    public void mo32832x() {
        synchronized (this.f59618t) {
            while (!mo32814h() && mo32812g()) {
                try {
                    int i = C11412b.f33577a;
                    Log.m105925i("MicroMsg.Mix.AudioDecoderBase", "waitDecode", (Object[]) null);
                    this.f59618t.wait();
                } catch (Exception e) {
                    int i2 = C11412b.f33577a;
                    Log.printErrStackTrace("MicroMsg.Mix.AudioDecoderBase", e, "waitDecode", new Object[0]);
                }
            }
        }
    }

    /* renamed from: y */
    public void mo32833y(C107275e eVar) {
        int i;
        if (!this.f59606h.get() && eVar != null) {
            long j = eVar.f320942e;
            if (j <= 0 || (i = this.f59615q) <= 0 || j >= ((long) i)) {
                if (this.f59599a != null && this.f59599a.f60647i != null) {
                    eVar.f320938a = mo32809c();
                    mo32826s(eVar);
                }
            } else if (eVar.f320944g) {
                C116867h.m164840a().mo180851c(eVar);
            }
        }
    }

    /* renamed from: z */
    public void mo32834z(C116768d dVar) {
        if (this.f59603e == null) {
            int i = C11412b.f33577a;
            Log.m105921e("MicroMsg.Mix.AudioDecoderBase", "process is null", (Object[]) null);
            return;
        }
        int i2 = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mix.AudioDecoderBase", "writeCacheAndPlay", (Object[]) null);
        mo32825r();
        while (true) {
            if (!mo32814h()) {
                mo32832x();
                C107275e d = this.f59603e.mo32682d(3536);
                if (dVar.mo180745k() <= 0 || d != null) {
                    if (dVar.mo180745k() == 0 && d == null) {
                        dVar.mo180742h();
                        break;
                    } else if (d == null) {
                        break;
                    } else {
                        if (!dVar.f350073b) {
                            dVar.mo180747m(d);
                        }
                        mo32833y(d);
                    }
                } else {
                    dVar.mo180735a();
                    break;
                }
            } else {
                break;
            }
        }
        mo32824q();
    }
}
