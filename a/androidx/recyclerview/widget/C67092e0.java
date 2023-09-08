package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.e0 */
public abstract class C67092e0 extends RecyclerView.C16616j {

    /* renamed from: g */
    public boolean f192682g = true;

    /* renamed from: A */
    public void mo25004A(RecyclerView.C16631z zVar) {
    }

    /* renamed from: B */
    public void mo91174B(RecyclerView.C16631z zVar) {
    }

    /* renamed from: a */
    public boolean mo17313a(RecyclerView.C16631z zVar, RecyclerView.C16616j.C16619c cVar, RecyclerView.C16616j.C16619c cVar2) {
        int i;
        int i2;
        if (cVar == null || ((i = cVar.f44811a) == (i2 = cVar2.f44811a) && cVar.f44812b == cVar2.f44812b)) {
            return mo75017s(zVar);
        }
        return mo75019u(zVar, i, cVar.f44812b, i2, cVar2.f44812b);
    }

    /* renamed from: b */
    public boolean mo17314b(RecyclerView.C16631z zVar, RecyclerView.C16631z zVar2, RecyclerView.C16616j.C16619c cVar, RecyclerView.C16616j.C16619c cVar2) {
        int i;
        int i2;
        int i3 = cVar.f44811a;
        int i4 = cVar.f44812b;
        if (zVar2.mo17377w()) {
            int i5 = cVar.f44811a;
            i = cVar.f44812b;
            i2 = i5;
        } else {
            i2 = cVar2.f44811a;
            i = cVar2.f44812b;
        }
        return mo75018t(zVar, zVar2, i3, i4, i2, i);
    }

    /* renamed from: c */
    public boolean mo17315c(RecyclerView.C16631z zVar, RecyclerView.C16616j.C16619c cVar, RecyclerView.C16616j.C16619c cVar2) {
        int i = cVar.f44811a;
        int i2 = cVar.f44812b;
        View view = zVar.f44854d;
        int left = cVar2 == null ? view.getLeft() : cVar2.f44811a;
        int top = cVar2 == null ? view.getTop() : cVar2.f44812b;
        if (zVar.mo17370q() || (i == left && i2 == top)) {
            return mo75020v(zVar);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return mo75019u(zVar, i, i2, left, top);
    }

    /* renamed from: d */
    public boolean mo17316d(RecyclerView.C16631z zVar, RecyclerView.C16616j.C16619c cVar, RecyclerView.C16616j.C16619c cVar2) {
        int i = cVar.f44811a;
        int i2 = cVar2.f44811a;
        if (i == i2 && cVar.f44812b == cVar2.f44812b) {
            mo91175w(zVar);
            return false;
        }
        return mo75019u(zVar, i, cVar.f44812b, i2, cVar2.f44812b);
    }

    /* renamed from: f */
    public boolean mo17317f(RecyclerView.C16631z zVar) {
        return !this.f192682g || zVar.mo17369p();
    }

    /* renamed from: s */
    public abstract boolean mo75017s(RecyclerView.C16631z zVar);

    /* renamed from: t */
    public abstract boolean mo75018t(RecyclerView.C16631z zVar, RecyclerView.C16631z zVar2, int i, int i2, int i3, int i4);

    /* renamed from: u */
    public abstract boolean mo75019u(RecyclerView.C16631z zVar, int i, int i2, int i3, int i4);

    /* renamed from: v */
    public abstract boolean mo75020v(RecyclerView.C16631z zVar);

    /* renamed from: w */
    public final void mo91175w(RecyclerView.C16631z zVar) {
        mo91177y(zVar);
        mo17319h(zVar);
    }

    /* renamed from: x */
    public final void mo91176x(RecyclerView.C16631z zVar) {
        mo25004A(zVar);
        mo17319h(zVar);
    }

    /* renamed from: y */
    public void mo91177y(RecyclerView.C16631z zVar) {
    }

    /* renamed from: z */
    public void mo91178z(RecyclerView.C16631z zVar) {
    }
}
