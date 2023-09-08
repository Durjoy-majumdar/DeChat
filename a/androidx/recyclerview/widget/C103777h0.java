package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import p1042u.C111055b;
import p1042u.C111057f;
import p329d3.C106985e;
import p329d3.C86167d;

/* renamed from: androidx.recyclerview.widget.h0 */
public class C103777h0 {

    /* renamed from: a */
    public final C111055b<RecyclerView.C16631z, C103778a> f306554a = new C111055b<>();

    /* renamed from: b */
    public final C111057f<RecyclerView.C16631z> f306555b = new C111057f<>();

    /* renamed from: androidx.recyclerview.widget.h0$a */
    public static class C103778a {

        /* renamed from: d */
        public static C86167d<C103778a> f306556d = new C106985e(20);

        /* renamed from: a */
        public int f306557a;

        /* renamed from: b */
        public RecyclerView.C16616j.C16619c f306558b;

        /* renamed from: c */
        public RecyclerView.C16616j.C16619c f306559c;

        /* renamed from: a */
        public static C103778a m138192a() {
            C103778a aVar = (C103778a) ((C106985e) f306556d).mo157419a();
            return aVar == null ? new C103778a() : aVar;
        }
    }

    /* renamed from: androidx.recyclerview.widget.h0$b */
    public interface C103779b {
    }

    /* renamed from: a */
    public void mo145148a(RecyclerView.C16631z zVar, RecyclerView.C16616j.C16619c cVar) {
        C103778a orDefault = this.f306554a.getOrDefault(zVar, null);
        if (orDefault == null) {
            orDefault = C103778a.m138192a();
            this.f306554a.put(zVar, orDefault);
        }
        orDefault.f306559c = cVar;
        orDefault.f306557a |= 8;
    }

    /* renamed from: b */
    public void mo145149b(RecyclerView.C16631z zVar, RecyclerView.C16616j.C16619c cVar) {
        C103778a orDefault = this.f306554a.getOrDefault(zVar, null);
        if (orDefault == null) {
            orDefault = C103778a.m138192a();
            this.f306554a.put(zVar, orDefault);
        }
        orDefault.f306558b = cVar;
        orDefault.f306557a |= 4;
    }

    /* renamed from: c */
    public final RecyclerView.C16616j.C16619c mo145150c(RecyclerView.C16631z zVar, int i) {
        C103778a l;
        RecyclerView.C16616j.C16619c cVar;
        int f = this.f306554a.mo162782f(zVar);
        if (f >= 0 && (l = this.f306554a.mo162791l(f)) != null) {
            int i2 = l.f306557a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                l.f306557a = i3;
                if (i == 4) {
                    cVar = l.f306558b;
                } else if (i == 8) {
                    cVar = l.f306559c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    this.f306554a.mo162790k(f);
                    l.f306557a = 0;
                    l.f306558b = null;
                    l.f306559c = null;
                    ((C106985e) C103778a.f306556d).mo157420b(l);
                }
                return cVar;
            }
        }
        return null;
    }

    /* renamed from: d */
    public void mo145151d(RecyclerView.C16631z zVar) {
        C103778a orDefault = this.f306554a.getOrDefault(zVar, null);
        if (orDefault != null) {
            orDefault.f306557a &= -2;
        }
    }

    /* renamed from: e */
    public void mo145152e(RecyclerView.C16631z zVar) {
        int f = this.f306555b.mo162757f() - 1;
        while (true) {
            if (f < 0) {
                break;
            } else if (zVar == this.f306555b.mo162758g(f)) {
                C111057f<RecyclerView.C16631z> fVar = this.f306555b;
                Object[] objArr = fVar.f332575f;
                Object obj = objArr[f];
                Object obj2 = C111057f.f332572h;
                if (obj != obj2) {
                    objArr[f] = obj2;
                    fVar.f332573d = true;
                }
            } else {
                f--;
            }
        }
        C103778a remove = this.f306554a.remove(zVar);
        if (remove != null) {
            remove.f306557a = 0;
            remove.f306558b = null;
            remove.f306559c = null;
            ((C106985e) C103778a.f306556d).mo157420b(remove);
        }
    }
}
