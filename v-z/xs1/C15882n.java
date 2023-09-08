package xs1;

import android.view.ViewGroup;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import hp3.C87581a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import nj3.C76912y0;
import ob0.C89132b;
import rx3.C13598b0;
import sx3.C64197v;
import te3.C51215sa1;
import te3.C52172yv;
import vs1.C15003o;

/* renamed from: xs1.n */
public final class C15882n<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C15883o f42740a;

    /* renamed from: b */
    public final /* synthetic */ int f42741b;

    /* renamed from: c */
    public final /* synthetic */ ViewGroup f42742c;

    public C15882n(C15883o oVar, int i, ViewGroup viewGroup) {
        this.f42740a = oVar;
        this.f42741b = i;
        this.f42742c = viewGroup;
    }

    public Object call(Object obj) {
        ArrayList<C52172yv> arrayList;
        LinkedList<C52172yv> linkedList;
        LinkedList<C52172yv> linkedList2;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        this.f42740a.f42746C.mo8913b();
        C51215sa1 sa12 = ((C54991o) this.f42740a.mo87696x0(C54991o.class)).f154275W3;
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            C15003o oVar = this.f42740a.f42744A;
            if (oVar != null) {
                int i = this.f42741b;
                oVar.f41127n = true;
                if (!oVar.f41125i) {
                    C52172yv yvVar = oVar.f41122f.get(i);
                    C87412m.m108593f(yvVar, "dataList[changeIndex]");
                    if (yvVar.f145529f == 0) {
                        oVar.mo14053F4(i);
                    } else {
                        oVar.mo14054G4(i);
                    }
                } else if (oVar.f41122f.get(i).f145529f == 0) {
                    Iterator<C52172yv> it = oVar.f41122f.iterator();
                    int i2 = 0;
                    while (it.hasNext()) {
                        C52172yv next = it.next();
                        int i3 = i2 + 1;
                        if (i2 >= 0) {
                            C52172yv yvVar2 = next;
                            if (i2 == i) {
                                oVar.mo14053F4(i2);
                            } else if (yvVar2.f145529f == 1) {
                                oVar.mo14054G4(i2);
                            }
                            i2 = i3;
                        } else {
                            C64197v.m75542k();
                            throw null;
                        }
                    }
                } else {
                    Iterator<C52172yv> it4 = oVar.f41122f.iterator();
                    int i4 = 0;
                    while (it4.hasNext()) {
                        C52172yv next2 = it4.next();
                        int i5 = i4 + 1;
                        if (i4 >= 0) {
                            if (next2.f145529f == 1) {
                                oVar.mo14054G4(i4);
                            }
                            i4 = i5;
                        } else {
                            C64197v.m75542k();
                            throw null;
                        }
                    }
                }
                oVar.notifyItemRangeChanged(0, oVar.getItemCount(), Boolean.TRUE);
            }
            if (!(sa12 == null || (linkedList2 = sa12.f141390f) == null)) {
                linkedList2.clear();
            }
            C15003o oVar2 = this.f42740a.f42744A;
            if (!(oVar2 == null || (arrayList = oVar2.f41122f) == null || sa12 == null || (linkedList = sa12.f141390f) == null)) {
                linkedList.addAll(arrayList);
            }
        } else {
            C76912y0.m92767f(this.f42742c.getContext(), this.f42742c.getContext().getResources().getString(C0966R.string.ms9));
        }
        C15003o oVar3 = this.f42740a.f42744A;
        if (oVar3 != null) {
            oVar3.f41126j = false;
        }
        return C13598b0.f38549a;
    }
}
