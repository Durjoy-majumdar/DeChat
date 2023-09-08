package cj1;

import cl1.C0656e1;
import cl1.C54991o;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import fj1.C45795b;
import fy3.C32229r;
import gy3.C87413o;
import ht1.C60216z4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rx3.C13598b0;
import sx3.C36907w;
import sx3.C64186f0;
import te3.C49585go0;
import te3.C49765hx0;
import te3.C50073k31;

/* renamed from: cj1.k1 */
public final class C0557k1 extends C87413o implements C32229r<Integer, Integer, String, C49585go0, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C60216z4.C8821a<List<C50073k31>> f1349d;

    /* renamed from: e */
    public final /* synthetic */ C45795b f1350e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0557k1(C60216z4.C8821a<List<C50073k31>> aVar, C45795b bVar) {
        super(4);
        this.f1349d = aVar;
        this.f1350e = bVar;
    }

    /* renamed from: I */
    public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj).intValue();
        String str = (String) obj3;
        C49585go0 go02 = (C49585go0) obj4;
        if (((Number) obj2).intValue() == 0 && intValue == 0) {
            C60216z4.C8821a<List<C50073k31>> aVar = this.f1349d;
            ArrayList<C49765hx0> arrayList = ((C0656e1) ((C54991o) this.f1350e.mo71262a(C54991o.class)).business(C0656e1.class)).f1549f;
            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
            Iterator<C49765hx0> it = arrayList.iterator();
            while (it.hasNext()) {
                C49765hx0 next = it.next();
                C50073k31 k312 = new C50073k31();
                FinderContact finderContact = next.f134919d;
                k312.f136528d = finderContact != null ? finderContact.nickname : null;
                k312.f136529e = (int) next.f134934v;
                arrayList2.add(k312);
            }
            aVar.mo6382a(arrayList2);
        } else {
            this.f1349d.mo6382a(C64186f0.f181907d);
        }
        return C13598b0.f38549a;
    }
}
