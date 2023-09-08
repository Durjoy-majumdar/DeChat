package zu0;

import java.util.LinkedList;

public final /* synthetic */ class d$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C103085d f304157d;

    /* renamed from: e */
    public final /* synthetic */ d$$d f304158e;

    /* renamed from: f */
    public final /* synthetic */ LinkedList f304159f;

    public /* synthetic */ d$$b(C103085d dVar, d$$d d__d, LinkedList linkedList) {
        this.f304157d = dVar;
        this.f304158e = d__d;
        this.f304159f = linkedList;
    }

    public final void run() {
        C103085d dVar = this.f304157d;
        d$$d d__d = this.f304158e;
        LinkedList linkedList = this.f304159f;
        if (!dVar.f304151a && d__d != null) {
            d__d.mo22650T4(linkedList);
        }
    }
}
