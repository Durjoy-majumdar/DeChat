package p396x6;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import p295b8.C16772f;
import p295b8.C16774g;
import p295b8.C16775h;
import p295b8.C16776i;
import p333e8.C20528a;
import p333e8.C20551y;
import p370p7.C21949o;
import p370p7.C21962v;
import p396x6.C22998f;
import p396x6.C23004h;
import p396x6.C23017p;
import p396x6.C23027v;

/* renamed from: x6.g */
public final class C23002g implements C22998f {

    /* renamed from: a */
    public final C23019q[] f66084a;

    /* renamed from: b */
    public final C16775h f66085b;

    /* renamed from: c */
    public final C16774g f66086c;

    /* renamed from: d */
    public final Handler f66087d;

    /* renamed from: e */
    public final C23004h f66088e;

    /* renamed from: f */
    public final CopyOnWriteArraySet<C23017p.C23018a> f66089f;

    /* renamed from: g */
    public final C23027v.C23030c f66090g;

    /* renamed from: h */
    public final C23027v.C23029b f66091h;

    /* renamed from: i */
    public boolean f66092i;

    /* renamed from: j */
    public boolean f66093j;

    /* renamed from: k */
    public int f66094k;

    /* renamed from: l */
    public int f66095l;

    /* renamed from: m */
    public int f66096m;

    /* renamed from: n */
    public int f66097n;

    /* renamed from: o */
    public boolean f66098o;

    /* renamed from: p */
    public C23027v f66099p;

    /* renamed from: q */
    public Object f66100q;

    /* renamed from: r */
    public C21962v f66101r;

    /* renamed from: s */
    public C16774g f66102s;

    /* renamed from: t */
    public C23016o f66103t;

    /* renamed from: u */
    public C23004h.C23006b f66104u;

    /* renamed from: v */
    public int f66105v;

    /* renamed from: w */
    public long f66106w;

    /* renamed from: x6.g$a */
    public class C23003a extends Handler {
        public C23003a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            C23002g gVar = C23002g.this;
            gVar.getClass();
            boolean z = false;
            switch (message.what) {
                case 0:
                    gVar.f66097n--;
                    return;
                case 1:
                    gVar.f66095l = message.arg1;
                    Iterator<C23017p.C23018a> it = gVar.f66089f.iterator();
                    while (it.hasNext()) {
                        it.next().onPlayerStateChanged(gVar.f66093j, gVar.f66095l);
                    }
                    return;
                case 2:
                    if (message.arg1 != 0) {
                        z = true;
                    }
                    gVar.f66098o = z;
                    Iterator<C23017p.C23018a> it4 = gVar.f66089f.iterator();
                    while (it4.hasNext()) {
                        it4.next().onLoadingChanged(gVar.f66098o);
                    }
                    return;
                case 3:
                    if (gVar.f66097n == 0) {
                        C16776i iVar = (C16776i) message.obj;
                        gVar.f66092i = true;
                        gVar.f66101r = iVar.f45337a;
                        gVar.f66102s = iVar.f45338b;
                        gVar.f66085b.mo17804a(iVar.f45339c);
                        Iterator<C23017p.C23018a> it5 = gVar.f66089f.iterator();
                        while (it5.hasNext()) {
                            it5.next().onTracksChanged(gVar.f66101r, gVar.f66102s);
                        }
                        return;
                    }
                    return;
                case 4:
                    int i = gVar.f66096m - 1;
                    gVar.f66096m = i;
                    if (i == 0) {
                        gVar.f66104u = (C23004h.C23006b) message.obj;
                        if (gVar.f66099p.mo36345k()) {
                            gVar.f66105v = 0;
                            gVar.f66106w = 0;
                        }
                        if (message.arg1 != 0) {
                            Iterator<C23017p.C23018a> it6 = gVar.f66089f.iterator();
                            while (it6.hasNext()) {
                                it6.next().onPositionDiscontinuity();
                            }
                            return;
                        }
                        return;
                    }
                    return;
                case 5:
                    if (gVar.f66096m == 0) {
                        gVar.f66104u = (C23004h.C23006b) message.obj;
                        Iterator<C23017p.C23018a> it7 = gVar.f66089f.iterator();
                        while (it7.hasNext()) {
                            it7.next().onPositionDiscontinuity();
                        }
                        return;
                    }
                    return;
                case 6:
                    C23004h.C23008d dVar = (C23004h.C23008d) message.obj;
                    int i2 = gVar.f66096m - dVar.f66170d;
                    gVar.f66096m = i2;
                    if (gVar.f66097n == 0) {
                        C23027v vVar = dVar.f66167a;
                        gVar.f66099p = vVar;
                        gVar.f66100q = dVar.f66168b;
                        gVar.f66104u = dVar.f66169c;
                        if (i2 == 0 && vVar.mo36345k()) {
                            gVar.f66105v = 0;
                            gVar.f66106w = 0;
                        }
                        Iterator<C23017p.C23018a> it8 = gVar.f66089f.iterator();
                        while (it8.hasNext()) {
                            it8.next().onTimelineChanged(gVar.f66099p, gVar.f66100q);
                        }
                        return;
                    }
                    return;
                case 7:
                    C23016o oVar = (C23016o) message.obj;
                    if (!gVar.f66103t.equals(oVar)) {
                        gVar.f66103t = oVar;
                        Iterator<C23017p.C23018a> it9 = gVar.f66089f.iterator();
                        while (it9.hasNext()) {
                            it9.next().onPlaybackParametersChanged(oVar);
                        }
                        return;
                    }
                    return;
                case 8:
                    C22997e eVar = (C22997e) message.obj;
                    Iterator<C23017p.C23018a> it10 = gVar.f66089f.iterator();
                    while (it10.hasNext()) {
                        it10.next().onPlayerError(eVar);
                    }
                    return;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    public C23002g(C23019q[] qVarArr, C16775h hVar, C23012l lVar) {
        Integer.toHexString(System.identityHashCode(this));
        int i = C20551y.f57835a;
        C20528a.m22240d(qVarArr.length > 0);
        this.f66084a = qVarArr;
        hVar.getClass();
        this.f66085b = hVar;
        this.f66093j = false;
        this.f66094k = 0;
        this.f66095l = 1;
        this.f66089f = new CopyOnWriteArraySet<>();
        C16774g gVar = new C16774g(new C16772f[qVarArr.length]);
        this.f66086c = gVar;
        this.f66099p = C23027v.f66205a;
        this.f66090g = new C23027v.C23030c();
        this.f66091h = new C23027v.C23029b();
        this.f66101r = C21962v.f62176d;
        this.f66102s = gVar;
        this.f66103t = C23016o.f66185d;
        C23003a aVar = new C23003a(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.f66087d = aVar;
        C23004h.C23006b bVar = new C23004h.C23006b(0, 0);
        this.f66104u = bVar;
        this.f66088e = new C23004h(qVarArr, hVar, lVar, this.f66093j, this.f66094k, aVar, bVar, this);
    }

    /* renamed from: a */
    public void mo36262a(boolean z) {
        if (this.f66093j != z) {
            this.f66093j = z;
            this.f66088e.f66127i.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
            Iterator<C23017p.C23018a> it = this.f66089f.iterator();
            while (it.hasNext()) {
                it.next().onPlayerStateChanged(z, this.f66095l);
            }
        }
    }

    /* renamed from: b */
    public boolean mo36263b() {
        return this.f66093j;
    }

    /* renamed from: c */
    public void mo36264c(C23016o oVar) {
        if (oVar == null) {
            oVar = C23016o.f66185d;
        }
        this.f66088e.f66127i.obtainMessage(4, oVar).sendToTarget();
    }

    /* renamed from: d */
    public void mo36265d(C23017p.C23018a aVar) {
        this.f66089f.remove(aVar);
    }

    /* renamed from: e */
    public void mo36260e(C22998f.C23001c... cVarArr) {
        C23004h hVar = this.f66088e;
        if (!hVar.f66140y) {
            hVar.f66112E++;
            hVar.f66127i.obtainMessage(11, cVarArr).sendToTarget();
        }
    }

    /* renamed from: f */
    public int mo36266f() {
        return this.f66095l;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo36261g(p396x6.C22998f.C23001c... r5) {
        /*
            r4 = this;
            x6.h r0 = r4.f66088e
            monitor-enter(r0)
            boolean r1 = r0.f66140y     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)
            goto L_0x002f
        L_0x0009:
            int r1 = r0.f66112E     // Catch:{ all -> 0x0030 }
            int r2 = r1 + 1
            r0.f66112E = r2     // Catch:{ all -> 0x0030 }
            android.os.Handler r2 = r0.f66127i     // Catch:{ all -> 0x0030 }
            r3 = 11
            android.os.Message r5 = r2.obtainMessage(r3, r5)     // Catch:{ all -> 0x0030 }
            r5.sendToTarget()     // Catch:{ all -> 0x0030 }
            r5 = 0
        L_0x001b:
            int r2 = r0.f66113F     // Catch:{ all -> 0x0030 }
            if (r2 > r1) goto L_0x0025
            r0.wait()     // Catch:{ InterruptedException -> 0x0023 }
            goto L_0x001b
        L_0x0023:
            r5 = 1
            goto L_0x001b
        L_0x0025:
            if (r5 == 0) goto L_0x002e
            java.lang.Thread r5 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0030 }
            r5.interrupt()     // Catch:{ all -> 0x0030 }
        L_0x002e:
            monitor-exit(r0)
        L_0x002f:
            return
        L_0x0030:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p396x6.C23002g.mo36261g(x6.f$c[]):void");
    }

    public long getCurrentPosition() {
        return (this.f66099p.mo36345k() || this.f66096m > 0) ? this.f66106w : mo36271j(this.f66104u.f66162d);
    }

    public long getDuration() {
        long j = -9223372036854775807L;
        if (this.f66099p.mo36345k()) {
            return -9223372036854775807L;
        }
        if (!(!this.f66099p.mo36345k() && this.f66096m == 0 && this.f66104u.f66159a.mo35017a())) {
            return C22994b.m27204b(this.f66099p.mo36344h(mo36270i(), this.f66090g, false).f66225i);
        }
        C21949o.C21951b bVar = this.f66104u.f66159a;
        this.f66099p.mo36342d(bVar.f62123a, this.f66091h);
        C23027v.C23029b bVar2 = this.f66091h;
        int i = bVar.f62124b;
        int i2 = bVar.f62125c;
        long[] jArr = bVar2.f66215j[i];
        if (i2 < jArr.length) {
            j = jArr[i2];
        }
        return C22994b.m27204b(j);
    }

    /* renamed from: h */
    public int mo36269h() {
        if (this.f66099p.mo36345k()) {
            return 0;
        }
        long j = (this.f66099p.mo36345k() || this.f66096m > 0) ? this.f66106w : mo36271j(this.f66104u.f66163e);
        long duration = getDuration();
        if (j == -9223372036854775807L || duration == -9223372036854775807L) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        int i = (int) ((j * 100) / duration);
        int i2 = C20551y.f57835a;
        return Math.max(0, Math.min(i, 100));
    }

    /* renamed from: i */
    public int mo36270i() {
        return (this.f66099p.mo36345k() || this.f66096m > 0) ? this.f66105v : this.f66099p.mo34969e(this.f66104u.f66159a.f62123a, this.f66091h, false).f66208c;
    }

    /* renamed from: j */
    public final long mo36271j(long j) {
        long b = C22994b.m27204b(j);
        if (this.f66104u.f66159a.mo35017a()) {
            return b;
        }
        this.f66099p.mo36342d(this.f66104u.f66159a.f62123a, this.f66091h);
        return b + C22994b.m27204b(this.f66091h.f66210e);
    }

    /* renamed from: k */
    public void mo36272k(C21949o oVar) {
        if (!this.f66099p.mo36345k() || this.f66100q != null) {
            this.f66099p = C23027v.f66205a;
            this.f66100q = null;
            Iterator<C23017p.C23018a> it = this.f66089f.iterator();
            while (it.hasNext()) {
                it.next().onTimelineChanged(this.f66099p, this.f66100q);
            }
        }
        if (this.f66092i) {
            this.f66092i = false;
            this.f66101r = C21962v.f62176d;
            this.f66102s = this.f66086c;
            this.f66085b.mo17804a((Object) null);
            Iterator<C23017p.C23018a> it4 = this.f66089f.iterator();
            while (it4.hasNext()) {
                it4.next().onTracksChanged(this.f66101r, this.f66102s);
            }
        }
        this.f66097n++;
        this.f66088e.f66127i.obtainMessage(0, 1, 0, oVar).sendToTarget();
    }

    /* renamed from: l */
    public void mo36273l(long j) {
        int i = mo36270i();
        if (i < 0 || (!this.f66099p.mo36345k() && i >= this.f66099p.mo35006j())) {
            throw new C23011k(this.f66099p, i, j);
        }
        this.f66096m++;
        this.f66105v = i;
        if (!this.f66099p.mo36345k()) {
            this.f66099p.mo36344h(i, this.f66090g, false);
            long a = j == -9223372036854775807L ? this.f66090g.f66224h : C22994b.m27203a(j);
            C23027v.C23030c cVar = this.f66090g;
            int i2 = cVar.f66222f;
            long j2 = cVar.f66226j + a;
            long j3 = this.f66099p.mo34969e(i2, this.f66091h, false).f66209d;
            while (j3 != -9223372036854775807L && j2 >= j3 && i2 < this.f66090g.f66223g) {
                j2 -= j3;
                i2++;
                j3 = this.f66099p.mo34969e(i2, this.f66091h, false).f66209d;
            }
        }
        if (j == -9223372036854775807L) {
            this.f66106w = 0;
            this.f66088e.f66127i.obtainMessage(3, new C23004h.C23007c(this.f66099p, i, -9223372036854775807L)).sendToTarget();
            return;
        }
        this.f66106w = j;
        this.f66088e.f66127i.obtainMessage(3, new C23004h.C23007c(this.f66099p, i, C22994b.m27203a(j))).sendToTarget();
        Iterator<C23017p.C23018a> it = this.f66089f.iterator();
        while (it.hasNext()) {
            it.next().onPositionDiscontinuity();
        }
    }

    public void release() {
        Integer.toHexString(System.identityHashCode(this));
        int i = C20551y.f57835a;
        HashSet<String> hashSet = C23009i.f66171a;
        synchronized (C23009i.class) {
            HashSet<String> hashSet2 = C23009i.f66171a;
        }
        C23004h hVar = this.f66088e;
        synchronized (hVar) {
            if (!hVar.f66140y) {
                hVar.f66127i.sendEmptyMessage(6);
                boolean z = false;
                while (!hVar.f66140y) {
                    try {
                        hVar.wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
                hVar.f66128j.quit();
            }
        }
        this.f66087d.removeCallbacksAndMessages((Object) null);
    }

    public void stop() {
        this.f66088e.f66127i.sendEmptyMessage(5);
    }
}
