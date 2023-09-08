package eo1;

import bo1.C54512y;
import fy3.C32224a;
import gy3.C87413o;
import java.util.LinkedList;

/* renamed from: eo1.f */
public final class C58658f extends C87413o implements C32224a<Boolean> {

    /* renamed from: d */
    public final /* synthetic */ C58638b f167931d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58658f(C58638b bVar) {
        super(0);
        this.f167931d = bVar;
    }

    public Object invoke() {
        LinkedList<C54512y> linkedList = new LinkedList<>();
        linkedList.addAll(this.f167931d.f167876e.values());
        C58638b bVar = this.f167931d;
        for (C54512y yVar : linkedList) {
            bVar.mo83520a(yVar.f152814l1, true, "resetRunningTask");
        }
        return Boolean.valueOf(this.f167931d.f167877f.addAll(linkedList));
    }
}
