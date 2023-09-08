package com.tencent.liteav.videobase.frame;

import android.os.SystemClock;
import com.tencent.liteav.base.p1181b.C113456a;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.frame.C17236k;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.tencent.liteav.videobase.frame.a */
public abstract class C17218a<T extends C17236k> {

    /* renamed from: a */
    private static final long f46560a = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: b */
    private final String f46561b = null;

    /* renamed from: c */
    private final Map<C17219a, Deque<T>> f46562c = new HashMap();

    /* renamed from: d */
    private volatile boolean f46563d = false;

    /* renamed from: e */
    private final C113456a f46564e = new C113456a(f46560a);

    /* renamed from: f */
    private final C17228g<T> f46565f = new C17220b(this);

    /* renamed from: com.tencent.liteav.videobase.frame.a$a */
    public interface C17219a {
    }

    /* renamed from: a */
    public static /* synthetic */ void m17059a(C17218a aVar, C17236k kVar) {
        if (kVar != null) {
            synchronized (aVar.f46562c) {
                if (aVar.f46563d) {
                    aVar.mo20185a(kVar);
                    return;
                }
                Deque b = aVar.m17060b(aVar.mo20186b(kVar));
                kVar.updateLastUsedTimestamp(SystemClock.elapsedRealtime());
                b.addFirst(kVar);
                aVar.m17061c();
            }
        }
    }

    /* renamed from: c */
    private void m17061c() {
        C17236k kVar;
        if (this.f46564e.mo169948a()) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ArrayList arrayList = new ArrayList();
            synchronized (this.f46562c) {
                Iterator<Deque<T>> it = this.f46562c.values().iterator();
                while (it.hasNext()) {
                    Deque next = it.next();
                    while (!next.isEmpty() && ((kVar = (C17236k) next.peekLast()) == null || elapsedRealtime - kVar.getLastUsedTimestamp() >= f46560a)) {
                        next.pollLast();
                        arrayList.add(kVar);
                    }
                }
            }
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                mo20185a((C17236k) it4.next());
            }
        }
    }

    /* renamed from: a */
    public abstract T mo20183a(C17228g<T> gVar, C17219a aVar);

    /* renamed from: a */
    public abstract void mo20185a(T t);

    /* renamed from: b */
    public abstract C17219a mo20186b(T t);

    /* renamed from: b */
    public void mo20187b() {
        this.f46563d = true;
        mo20184a();
    }

    public void finalize() {
        super.finalize();
        if (!this.f46563d) {
            LiteavLog.m16900e("FramePool", "%s must call destroy() before finalize()!\n%s", getClass().getName(), this.f46561b);
        }
    }

    /* renamed from: b */
    private Deque<T> m17060b(C17219a aVar) {
        Deque<T> deque = this.f46562c.get(aVar);
        if (deque != null) {
            return deque;
        }
        LinkedList linkedList = new LinkedList();
        this.f46562c.put(aVar, linkedList);
        return linkedList;
    }

    /* renamed from: a */
    public final T mo20182a(C17219a aVar) {
        T t;
        synchronized (this.f46562c) {
            Deque b = m17060b(aVar);
            t = !b.isEmpty() ? (C17236k) b.removeFirst() : null;
        }
        m17061c();
        if (t == null) {
            t = mo20183a(this.f46565f, aVar);
        }
        if (t.retain() != 1) {
            LiteavLog.m16900e("FramePool", "invalid reference count for %s", t);
        }
        return t;
    }

    /* renamed from: a */
    public void mo20184a() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f46562c) {
            for (Deque<T> addAll : this.f46562c.values()) {
                arrayList.addAll(addAll);
            }
            this.f46562c.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            mo20185a((C17236k) it.next());
        }
    }
}
