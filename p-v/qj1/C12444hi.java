package qj1;

import ak1.C54067f0;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import di3.C86312j;
import gy3.C87412m;
import ht1.C8777j5;
import java.util.Iterator;
import java.util.LinkedList;
import te3.C50767p11;
import te3.C51428tp2;
import te3.C51503u71;

/* renamed from: qj1.hi */
public final class C12444hi<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C12429gi f35821d;

    public C12444hi(C12429gi giVar) {
        this.f35821d = giVar;
    }

    public void onChanged(Object obj) {
        boolean z;
        T t;
        boolean z2;
        C51503u71 u712 = (C51503u71) obj;
        boolean z3 = true;
        if (u712 == null || !u712.f142641d || u712.f142646i.size() == 0) {
            C12429gi giVar = this.f35821d;
            giVar.f35796r = 0;
            giVar.f35800v.clear();
            giVar.f35801w.removeMessages(1);
            giVar.mo10792g(8);
            giVar.f35799u = true;
            return;
        }
        C12429gi giVar2 = this.f35821d;
        giVar2.f35797s = u712.f142647j;
        LinkedList<C51428tp2> linkedList = u712.f142646i;
        C87412m.m108593f(linkedList, "it.wish_list");
        Iterator<T> it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            C51428tp2 tp22 = (C51428tp2) it.next();
            Iterator<T> it4 = giVar2.f35800v.iterator();
            while (true) {
                t = null;
                if (!it4.hasNext()) {
                    break;
                }
                T next = it4.next();
                C51428tp2 tp23 = (C51428tp2) next;
                C50767p11 p112 = tp22.f142318d;
                String str = p112 != null ? p112.f139507d : null;
                C50767p11 p113 = tp23.f142318d;
                if (p113 != null) {
                    t = p113.f139507d;
                }
                if (!C87412m.m108589b(str, t) || tp22.f142319e != tp23.f142319e) {
                    z2 = false;
                    continue;
                } else {
                    z2 = true;
                    continue;
                }
                if (z2) {
                    t = next;
                    continue;
                    break;
                }
            }
            if (t == null) {
                z = true;
                break;
            }
        }
        C12429gi giVar3 = this.f35821d;
        giVar3.f35798t = u712.f142643f >= u712.f142642e;
        LinkedList<C51428tp2> linkedList2 = u712.f142646i;
        C87412m.m108593f(linkedList2, "it.wish_list");
        giVar3.f35800v.clear();
        giVar3.f35800v.addAll(linkedList2);
        if (this.f35821d.f35796r < this.f35821d.f35800v.size()) {
            C12429gi giVar4 = this.f35821d;
            C51428tp2 tp24 = giVar4.f35800v.get(giVar4.f35796r);
            C87412m.m108593f(tp24, "currentList[currentPosition]");
            giVar4.mo12115b1(tp24, z);
        }
        C56032b F0 = this.f35821d.mo14482F0();
        if (F0 == null || !F0.isScreenClear()) {
            z3 = false;
        }
        if (!z3) {
            C12429gi giVar5 = this.f35821d;
            if (giVar5.f35799u) {
                C12429gi.m12006a1(giVar5);
                ((C8777j5) C86312j.m106911c(C8777j5.class)).mo9602Jz(C54067f0.C0066n.WISH_LIST_BANNER, C12429gi.m12005Z0(this.f35821d));
                this.f35821d.f35799u = false;
            }
            this.f35821d.mo10792g(0);
        }
    }
}
