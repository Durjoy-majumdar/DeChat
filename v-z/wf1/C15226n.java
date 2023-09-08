package wf1;

import android.widget.TextView;
import fy3.C32226l;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.LinkedList;
import rx3.C13598b0;
import rx3.C36570n;
import sx3.C36907w;
import tj1.C13929a;
import wf1.C15193l;

/* renamed from: wf1.n */
public final class C15226n extends C87413o implements C32226l<C13929a, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C15193l f41443d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15226n(C15193l lVar) {
        super(1);
        this.f41443d = lVar;
    }

    public Object invoke(Object obj) {
        C13929a aVar = (C13929a) obj;
        if (aVar != null) {
            C15193l lVar = this.f41443d;
            lVar.f41379L = aVar.f39130a;
            lVar.mo14135l3((Integer) null);
            long j = aVar.f39131b;
            ((TextView) ((C36570n) lVar.f41385h).getValue()).setText(String.valueOf(j));
            lVar.f41375H = j;
            LinkedList<C13929a.C13930a> linkedList = aVar.f39132c;
            ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
            for (C13929a.C13930a aVar2 : linkedList) {
                if (!aVar2.f39133a) {
                    aVar2.f39134b.f130787e = 0;
                }
                arrayList.add(aVar2.f39134b);
            }
            lVar.f41371D = new LinkedList<>(arrayList);
            ((C15193l.C15195b) ((C36570n) lVar.f41369B).getValue()).mo14136F4();
        }
        return C13598b0.f38549a;
    }
}
