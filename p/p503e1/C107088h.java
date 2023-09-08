package p503e1;

import gy3.C87412m;
import java.util.ArrayList;
import p175j0.C33485a;

/* renamed from: e1.h */
public final class C107088h extends C33485a<C107087g> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107088h(C107087g gVar) {
        super(gVar);
        C87412m.m108594g(gVar, "root");
    }

    /* renamed from: c */
    public void mo51486c(int i, Object obj) {
        C87412m.m108594g((C107087g) obj, "instance");
    }

    /* renamed from: e */
    public void mo51489e(int i, int i2) {
        mo157548k((C107087g) this.f90679c).mo157538e(i, i2);
    }

    /* renamed from: g */
    public void mo51491g(int i, int i2, int i3) {
        C107081b k = mo157548k((C107087g) this.f90679c);
        int i4 = 0;
        if (i > i2) {
            while (i4 < i3) {
                ((ArrayList) k.f320528c).remove(i);
                ((ArrayList) k.f320528c).add(i2, (C107087g) ((ArrayList) k.f320528c).get(i));
                i2++;
                i4++;
            }
        } else {
            while (i4 < i3) {
                ((ArrayList) k.f320528c).remove(i);
                ArrayList arrayList = (ArrayList) k.f320528c;
                arrayList.add(i2 - 1, (C107087g) ((ArrayList) k.f320528c).get(i));
                i4++;
            }
        }
        k.mo157547c();
    }

    /* renamed from: h */
    public void mo51492h(int i, Object obj) {
        C107087g gVar = (C107087g) obj;
        C87412m.m108594g(gVar, "instance");
        C107081b k = mo157548k((C107087g) this.f90679c);
        k.getClass();
        if (i < ((ArrayList) k.f320528c).size()) {
            ((ArrayList) k.f320528c).set(i, gVar);
        } else {
            ((ArrayList) k.f320528c).add(gVar);
        }
        gVar.mo157537d(k.f320533h);
        k.mo157547c();
    }

    /* renamed from: j */
    public void mo59167j() {
        C107081b k = mo157548k((C107087g) this.f90677a);
        k.mo157538e(0, ((ArrayList) k.f320528c).size());
    }

    /* renamed from: k */
    public final C107081b mo157548k(C107087g gVar) {
        if (gVar instanceof C107081b) {
            return (C107081b) gVar;
        }
        throw new IllegalStateException("Cannot only insert VNode into Group".toString());
    }
}
