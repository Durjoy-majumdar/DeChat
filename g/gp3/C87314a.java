package gp3;

import java.util.LinkedList;
import junit.framework.Assert;
import mp3.C88819d;
import mp3.C88822g;
import mp3.C88824h;

/* renamed from: gp3.a */
public abstract class C87314a<_Callback> {
    private LinkedList<C87315b> mQueue;
    public C88819d mScheduler;
    public C88822g mSchedulerInvoker;

    public C87314a() {
        this(C88824h.m110907a());
    }

    public synchronized C87315b add(C87315b bVar) {
        if (bVar == null) {
            return null;
        }
        this.mQueue.add(bVar);
        return bVar;
    }

    public synchronized boolean contains(_Callback _callback) {
        return this.mQueue.contains(new C87315b(_callback, this));
    }

    public synchronized LinkedList<C87315b> getQueue() {
        return getQueueImpl();
    }

    public LinkedList<C87315b> getQueueImpl() {
        return new LinkedList<>(this.mQueue);
    }

    public synchronized void remove(C87315b bVar) {
        if (bVar != null) {
            this.mQueue.remove(bVar);
        }
    }

    public synchronized int size() {
        return this.mQueue.size();
    }

    public C87314a(String str) {
        this(C88824h.m110909c(str));
    }

    public C87314a(C88819d dVar) {
        this.mQueue = new LinkedList<>();
        Assert.assertNotNull(dVar);
        this.mScheduler = dVar;
        this.mSchedulerInvoker = new C88822g(dVar, (C88822g.C88823a) null);
    }
}
