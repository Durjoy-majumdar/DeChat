package p386u7;

import java.util.LinkedList;
import java.util.PriorityQueue;
import p333e8.C20528a;
import p383t7.C22442d;
import p383t7.C22443e;
import p383t7.C22447h;
import p383t7.C22448i;

/* renamed from: u7.d */
public abstract class C22607d implements C22443e {

    /* renamed from: a */
    public final LinkedList<C22447h> f65016a = new LinkedList<>();

    /* renamed from: b */
    public final LinkedList<C22448i> f65017b;

    /* renamed from: c */
    public final PriorityQueue<C22447h> f65018c;

    /* renamed from: d */
    public C22447h f65019d;

    /* renamed from: e */
    public long f65020e;

    public C22607d() {
        for (int i = 0; i < 10; i++) {
            this.f65016a.add(new C22447h());
        }
        this.f65017b = new LinkedList<>();
        for (int i2 = 0; i2 < 2; i2++) {
            this.f65017b.add(new C22608e(this));
        }
        this.f65018c = new PriorityQueue<>();
    }

    /* renamed from: a */
    public Object mo35730a() {
        C20528a.m22240d(this.f65019d == null);
        if (this.f65016a.isEmpty()) {
            return null;
        }
        C22447h pollFirst = this.f65016a.pollFirst();
        this.f65019d = pollFirst;
        return pollFirst;
    }

    /* renamed from: b */
    public void mo35588b(long j) {
        this.f65020e = j;
    }

    /* renamed from: c */
    public void mo35731c(Object obj) {
        C22447h hVar = (C22447h) obj;
        C20528a.m22237a(hVar == this.f65019d);
        if (hVar.mo36911h()) {
            hVar.mo35592f();
            this.f65016a.add(hVar);
        } else {
            this.f65018c.add(hVar);
        }
        this.f65019d = null;
    }

    /* renamed from: d */
    public abstract C22442d mo35708d();

    public Object dequeueOutputBuffer() {
        if (!this.f65017b.isEmpty()) {
            while (!this.f65018c.isEmpty() && this.f65018c.peek().f67261g <= this.f65020e) {
                C22447h poll = this.f65018c.poll();
                if (poll.mo36910g(4)) {
                    C22448i pollFirst = this.f65017b.pollFirst();
                    pollFirst.f67251d = 4 | pollFirst.f67251d;
                    poll.mo35592f();
                    this.f65016a.add(poll);
                    return pollFirst;
                }
                mo35709e(poll);
                if (mo35710f()) {
                    C22442d d = mo35708d();
                    if (!poll.mo36911h()) {
                        C22448i pollFirst2 = this.f65017b.pollFirst();
                        long j = poll.f67261g;
                        pollFirst2.f67263e = j;
                        pollFirst2.f63571f = d;
                        pollFirst2.f63572g = j;
                        poll.mo35592f();
                        this.f65016a.add(poll);
                        return pollFirst2;
                    }
                }
                poll.mo35592f();
                this.f65016a.add(poll);
            }
        }
        return null;
    }

    /* renamed from: e */
    public abstract void mo35709e(C22447h hVar);

    /* renamed from: f */
    public abstract boolean mo35710f();

    public void flush() {
        this.f65020e = 0;
        while (!this.f65018c.isEmpty()) {
            C22447h poll = this.f65018c.poll();
            poll.mo35592f();
            this.f65016a.add(poll);
        }
        C22447h hVar = this.f65019d;
        if (hVar != null) {
            hVar.mo35592f();
            this.f65016a.add(hVar);
            this.f65019d = null;
        }
    }

    public void release() {
    }
}
