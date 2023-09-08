package p1085qk;

import com.tencent.p014mm.smiley.C96974x;
import com.tencent.p014mm.smiley.C96975y;
import gy3.C87412m;
import java.util.LinkedList;

/* renamed from: qk.d */
public final class C110443d implements C96975y {

    /* renamed from: a */
    public final /* synthetic */ LinkedList<C110442c> f330282a;

    public C110443d(LinkedList<C110442c> linkedList) {
        this.f330282a = linkedList;
    }

    /* renamed from: a */
    public boolean mo135526a(C96974x xVar, int i, int i2) {
        C87412m.m108594g(xVar, "item");
        if (!(xVar instanceof C110441a)) {
            return false;
        }
        C110441a aVar = (C110441a) xVar;
        this.f330282a.add(new C110442c(aVar.f330277a, aVar.f330278b, i, i2));
        return false;
    }
}
