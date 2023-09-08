package mu3;

import android.os.Handler;
import android.os.Message;
import android.os.MessageQueue;
import gu3.C116992c;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: mu3.d */
public final class C117573d implements Handler.Callback {

    /* renamed from: d */
    public Handler f351727d = C116992c.m165057a("SerialQueueLeader", this);

    /* renamed from: e */
    public AtomicBoolean f351728e = new AtomicBoolean(false);

    /* renamed from: f */
    public final C117576d f351729f;

    /* renamed from: g */
    public boolean f351730g = false;

    /* renamed from: h */
    public HashSet<C117577e> f351731h = new HashSet<>();

    /* renamed from: i */
    public LinkedList<C117577e> f351732i = new LinkedList<>();

    /* renamed from: j */
    public final LinkedList<C88849c> f351733j = new LinkedList<>();

    /* renamed from: n */
    public C88849c[] f351734n;

    /* renamed from: mu3.d$c */
    public interface C88849c extends MessageQueue.IdleHandler {
    }

    /* renamed from: mu3.d$a */
    public interface C117574a {
        /* renamed from: a */
        boolean mo182305a(C117577e eVar);
    }

    /* renamed from: mu3.d$b */
    public interface C117575b {
        /* renamed from: a */
        boolean mo182304a(C117577e eVar);
    }

    /* renamed from: mu3.d$d */
    public interface C117576d {
        /* renamed from: a */
        void mo182292a(C117577e eVar);
    }

    public C117573d(C117576d dVar) {
        this.f351729f = dVar;
    }

    /* renamed from: a */
    public void mo182308a() {
        synchronized (this) {
            this.f351727d.removeMessages(1);
            Iterator<C117577e> it = this.f351732i.iterator();
            while (it.hasNext()) {
                C117577e next = it.next();
                if (!next.isCancelled()) {
                    next.cancel(false);
                }
            }
            this.f351732i.clear();
            Iterator<C117577e> it4 = this.f351731h.iterator();
            while (it4.hasNext()) {
                C117577e next2 = it4.next();
                if (!next2.isCancelled()) {
                    next2.cancel(false);
                }
            }
            this.f351731h.clear();
        }
    }

    /* renamed from: b */
    public boolean mo182309b(C117574a aVar) {
        synchronized (this) {
            Iterator<C117577e> it = this.f351731h.iterator();
            while (it.hasNext()) {
                if (aVar.mo182305a(it.next())) {
                    return true;
                }
            }
            Iterator<C117577e> it4 = this.f351732i.iterator();
            while (it4.hasNext()) {
                if (aVar.mo182305a(it4.next())) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: c */
    public List<String> mo182310c() {
        LinkedList linkedList;
        LinkedList linkedList2 = new LinkedList();
        synchronized (this) {
            linkedList = new LinkedList(this.f351732i);
            linkedList.addAll(this.f351731h);
        }
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            linkedList2.add(((C117577e) it.next()).getKey());
        }
        return linkedList2;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: d */
    public void mo182311d(long r5, mu3.C117577e r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.f351728e     // Catch:{ all -> 0x006e }
            boolean r0 = r0.get()     // Catch:{ all -> 0x006e }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r4)     // Catch:{ all -> 0x006e }
            return
        L_0x000b:
            if (r7 != 0) goto L_0x000f
            monitor-exit(r4)     // Catch:{ all -> 0x006e }
            return
        L_0x000f:
            boolean r0 = r7.isCancelled()     // Catch:{ all -> 0x006e }
            if (r0 == 0) goto L_0x0017
            monitor-exit(r4)     // Catch:{ all -> 0x006e }
            return
        L_0x0017:
            r0 = 0
            r2 = 1
            int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x003e
            android.os.Handler r0 = r4.f351727d     // Catch:{ all -> 0x006e }
            android.os.Message r0 = r0.obtainMessage()     // Catch:{ all -> 0x006e }
            r0.obj = r7     // Catch:{ all -> 0x006e }
            r0.what = r2     // Catch:{ all -> 0x006e }
            monitor-enter(r4)     // Catch:{ all -> 0x006e }
            java.util.HashSet<mu3.e> r1 = r4.f351731h     // Catch:{ all -> 0x003b }
            r1.add(r7)     // Catch:{ all -> 0x003b }
            android.os.Handler r7 = r4.f351727d     // Catch:{ all -> 0x003b }
            long r1 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x003b }
            long r1 = r1 + r5
            r7.sendMessageAtTime(r0, r1)     // Catch:{ all -> 0x003b }
            monitor-exit(r4)     // Catch:{ all -> 0x003b }
            monitor-exit(r4)     // Catch:{ all -> 0x006e }
            return
        L_0x003b:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003b }
            throw r5     // Catch:{ all -> 0x006e }
        L_0x003e:
            java.util.LinkedList<mu3.e> r0 = r4.f351732i     // Catch:{ all -> 0x006e }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x006e }
            if (r0 == 0) goto L_0x0058
            boolean r1 = r4.f351730g     // Catch:{ all -> 0x006e }
            if (r1 != 0) goto L_0x0058
            r4.f351730g = r2     // Catch:{ all -> 0x006e }
            mu3.d$d r5 = r4.f351729f     // Catch:{ all -> 0x006e }
            java.util.Objects.requireNonNull(r5)     // Catch:{ all -> 0x006e }
            mu3.d$d r5 = (mu3.C117573d.C117576d) r5     // Catch:{ all -> 0x006e }
            r5.mo182292a(r7)     // Catch:{ all -> 0x006e }
            monitor-exit(r4)     // Catch:{ all -> 0x006e }
            return
        L_0x0058:
            if (r0 != 0) goto L_0x0067
            r0 = -9223372036854775808
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x0061
            goto L_0x0067
        L_0x0061:
            java.util.LinkedList<mu3.e> r5 = r4.f351732i     // Catch:{ all -> 0x006e }
            r5.addLast(r7)     // Catch:{ all -> 0x006e }
            goto L_0x006c
        L_0x0067:
            java.util.LinkedList<mu3.e> r5 = r4.f351732i     // Catch:{ all -> 0x006e }
            r5.addFirst(r7)     // Catch:{ all -> 0x006e }
        L_0x006c:
            monitor-exit(r4)     // Catch:{ all -> 0x006e }
            return
        L_0x006e:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x006e }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mu3.C117573d.mo182311d(long, mu3.e):void");
    }

    /* renamed from: e */
    public final void mo182312e() {
        int size;
        synchronized (this) {
            size = this.f351733j.size();
            if (size > 0) {
                if (this.f351734n == null) {
                    this.f351734n = new C88849c[size];
                }
                this.f351734n = (C88849c[]) this.f351733j.toArray(this.f351734n);
            }
        }
        int i = 0;
        while (i < size) {
            C88849c[] cVarArr = this.f351734n;
            C88849c cVar = cVarArr[i];
            cVarArr[i] = null;
            try {
                if (!cVar.queueIdle()) {
                    synchronized (this) {
                        this.f351733j.remove(cVar);
                    }
                }
                i++;
            } catch (Throwable th) {
                synchronized (this) {
                    this.f351733j.remove(cVar);
                    throw th;
                }
            }
        }
    }

    /* renamed from: f */
    public boolean mo182313f() {
        if (!this.f351728e.compareAndSet(false, true)) {
            return false;
        }
        synchronized (this) {
            mo182308a();
            this.f351730g = false;
        }
        return true;
    }

    /* renamed from: g */
    public void mo182314g(C117575b bVar) {
        Objects.requireNonNull(bVar);
        synchronized (this) {
            Iterator<C117577e> it = this.f351731h.iterator();
            while (it.hasNext()) {
                C117577e next = it.next();
                if (bVar.mo182304a(next)) {
                    this.f351727d.removeMessages(1, next);
                    if (!next.isCancelled()) {
                        next.cancel(false);
                    }
                    it.remove();
                }
            }
            Iterator<C117577e> it4 = this.f351732i.iterator();
            while (it4.hasNext()) {
                C117577e next2 = it4.next();
                if (bVar.mo182304a(next2)) {
                    if (!next2.isCancelled()) {
                        next2.cancel(false);
                    }
                    it4.remove();
                }
            }
        }
    }

    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        synchronized (this) {
            if (!this.f351731h.remove(message.obj)) {
                return false;
            }
            mo182311d(0, (C117577e) message.obj);
            return true;
        }
    }
}
