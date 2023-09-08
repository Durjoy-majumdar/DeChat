package zu0;

import java.util.LinkedList;
import yu0.C102912i;

public final /* synthetic */ class d$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C103085d f304152d;

    /* renamed from: e */
    public final /* synthetic */ d$$d f304153e;

    /* renamed from: f */
    public final /* synthetic */ LinkedList f304154f;

    /* renamed from: g */
    public final /* synthetic */ C102912i f304155g;

    /* renamed from: h */
    public final /* synthetic */ int f304156h;

    public /* synthetic */ d$$a(C103085d dVar, d$$d d__d, LinkedList linkedList, C102912i iVar, int i) {
        this.f304152d = dVar;
        this.f304153e = d__d;
        this.f304154f = linkedList;
        this.f304155g = iVar;
        this.f304156h = i;
    }

    public final void run() {
        C103085d dVar = this.f304152d;
        d$$d d__d = this.f304153e;
        LinkedList linkedList = this.f304154f;
        C102912i iVar = this.f304155g;
        int i = this.f304156h;
        if (!dVar.f304151a) {
            d__d.mo22651g1(linkedList, iVar, i);
        }
    }
}
