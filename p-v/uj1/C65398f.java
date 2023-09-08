package uj1;

import android.view.View;
import com.tencent.p014mm.C0966R;
import java.util.Iterator;
import java.util.LinkedList;
import nj3.C11182m0;
import nj3.C76874e0;
import nj3.C76875f0;
import pe3.C89349b;
import qo3.C77407n;
import te3.C50585ns0;
import te3.C64699s51;
import te3.C64745u51;

/* renamed from: uj1.f */
public final class C65398f implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C65374a f188204d;

    public C65398f(C65374a aVar) {
        this.f188204d = aVar;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        LinkedList<C64699s51> linkedList;
        boolean z;
        LinkedList<C64699s51> linkedList2;
        T t;
        boolean z2;
        LinkedList<C64699s51> linkedList3;
        T t2;
        boolean z3;
        LinkedList<C64699s51> linkedList4;
        T t3;
        boolean z4;
        LinkedList<C64699s51> linkedList5;
        T t4;
        boolean z5;
        LinkedList<C64699s51> linkedList6;
        T t5;
        boolean z6;
        C77407n nVar = this.f188204d.f188171p;
        T t6 = null;
        if (nVar != null) {
            nVar.mo107567l((View) null);
        }
        e0Var.clear();
        C50585ns0 ns02 = this.f188204d.f188164f;
        if (!(ns02 == null || (linkedList6 = ns02.f138744e) == null)) {
            Iterator<T> it = linkedList6.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t5 = null;
                    break;
                }
                t5 = it.next();
                if (((C64699s51) t5).f185341d == 13) {
                    z6 = true;
                    continue;
                } else {
                    z6 = false;
                    continue;
                }
                if (z6) {
                    break;
                }
            }
            if (((C64699s51) t5) != null) {
                e0Var.mo107125a(this.f188204d.f188178w, C0966R.string.f8135nd);
            }
        }
        C50585ns0 ns03 = this.f188204d.f188164f;
        if (!(ns03 == null || (linkedList5 = ns03.f138744e) == null)) {
            Iterator<T> it4 = linkedList5.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    t4 = null;
                    break;
                }
                t4 = it4.next();
                if (((C64699s51) t4).f185341d == 1) {
                    z5 = true;
                    continue;
                } else {
                    z5 = false;
                    continue;
                }
                if (z5) {
                    break;
                }
            }
            if (((C64699s51) t4) != null) {
                e0Var.mo107125a(this.f188204d.f188172q, C0966R.string.e4n);
            }
        }
        C50585ns0 ns04 = this.f188204d.f188164f;
        if (!(ns04 == null || (linkedList4 = ns04.f138744e) == null)) {
            Iterator<T> it5 = linkedList4.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    t3 = null;
                    break;
                }
                t3 = it5.next();
                C64699s51 s512 = (C64699s51) t3;
                if (s512.f185341d == 8 && s512.f185344g == 2) {
                    z4 = true;
                    continue;
                } else {
                    z4 = false;
                    continue;
                }
                if (z4) {
                    break;
                }
            }
            if (((C64699s51) t3) != null) {
                e0Var.mo107125a(this.f188204d.f188177v, C0966R.string.n2d);
            }
        }
        C50585ns0 ns05 = this.f188204d.f188164f;
        if (!(ns05 == null || (linkedList3 = ns05.f138744e) == null)) {
            Iterator<T> it6 = linkedList3.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    t2 = null;
                    break;
                }
                t2 = it6.next();
                if (((C64699s51) t2).f185341d == 7) {
                    z3 = true;
                    continue;
                } else {
                    z3 = false;
                    continue;
                }
                if (z3) {
                    break;
                }
            }
            if (((C64699s51) t2) != null) {
                e0Var.mo107125a(this.f188204d.f188176u, C0966R.string.f360677lu1);
            }
        }
        C50585ns0 ns06 = this.f188204d.f188164f;
        if (!(ns06 == null || (linkedList2 = ns06.f138744e) == null)) {
            Iterator<T> it7 = linkedList2.iterator();
            while (true) {
                if (!it7.hasNext()) {
                    t = null;
                    break;
                }
                t = it7.next();
                if (((C64699s51) t).f185341d == 3) {
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
            C64699s51 s513 = (C64699s51) t;
            if (s513 != null) {
                C76875f0 f0Var = (C76875f0) e0Var.mo107125a(this.f188204d.f188174s, C0966R.string.e5e);
                C64745u51 u512 = new C64745u51();
                C89349b bVar = s513.f185343f;
                u512.parseFrom(bVar != null ? bVar.mo123703f() : null);
                f0Var.f224721p = u512.f185714d;
            }
        }
        C50585ns0 ns07 = this.f188204d.f188164f;
        if (ns07 != null && (linkedList = ns07.f138744e) != null) {
            Iterator<T> it8 = linkedList.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                T next = it8.next();
                if (((C64699s51) next).f185341d == 2) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    t6 = next;
                    break;
                }
            }
            if (((C64699s51) t6) != null) {
                e0Var.mo107125a(this.f188204d.f188173r, C0966R.string.e4m);
            }
        }
    }
}
