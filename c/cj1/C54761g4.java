package cj1;

import android.os.SystemClock;
import cj1.C54847z3;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Iterator;
import java.util.PriorityQueue;
import pe3.C47465a;

/* renamed from: cj1.g4 */
public final class C54761g4 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f153481d;

    /* renamed from: e */
    public final /* synthetic */ C54847z3 f153482e;

    /* renamed from: f */
    public final /* synthetic */ int f153483f;

    public C54761g4(int i, C54847z3 z3Var, int i2) {
        this.f153481d = i;
        this.f153482e = z3Var;
        this.f153483f = i2;
    }

    public final void run() {
        T t;
        T t2;
        boolean z;
        boolean z2;
        Log.m105924i("MicroMsg.FinderLivePollingService", "update Req Interval for " + this.f153481d + ' ');
        PriorityQueue<C54847z3.C54848a<? extends C47465a>> priorityQueue = this.f153482e.f153752a;
        int i = this.f153481d;
        Iterator<T> it = priorityQueue.iterator();
        while (true) {
            t = null;
            if (!it.hasNext()) {
                t2 = null;
                break;
            }
            t2 = it.next();
            if (((C54847z3.C54848a) t2).f153760d == i) {
                z2 = true;
                continue;
            } else {
                z2 = false;
                continue;
            }
            if (z2) {
                break;
            }
        }
        C54847z3.C54848a aVar = (C54847z3.C54848a) t2;
        if (aVar != null) {
            aVar.f153763g = this.f153483f;
        }
        PriorityQueue<C54847z3.C54848a<? extends C47465a>> priorityQueue2 = this.f153482e.f153752a;
        int i2 = this.f153481d;
        Iterator<T> it4 = priorityQueue2.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            T next = it4.next();
            if (((C54847z3.C54848a) next).f153760d == i2) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                t = next;
                break;
            }
        }
        C54847z3.C54848a aVar2 = (C54847z3.C54848a) t;
        if (aVar2 != null) {
            aVar2.f153764h = SystemClock.uptimeMillis() + ((long) (this.f153483f * 1000));
        }
        C54847z3.C54848a aVar3 = this.f153482e.f153753b.get(Integer.valueOf(this.f153481d));
        if (aVar3 != null) {
            aVar3.f153763g = this.f153483f;
        }
        C54847z3.C54848a aVar4 = this.f153482e.f153753b.get(Integer.valueOf(this.f153481d));
        if (aVar4 != null) {
            aVar4.f153764h = SystemClock.uptimeMillis() + ((long) (this.f153483f * 1000));
        }
        C54847z3.m61835b(this.f153482e);
    }
}
