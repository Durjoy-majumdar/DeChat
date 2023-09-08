package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import k20.C60958c;
import k20.C9556a;
import p849e3.C107168a0;
import p849e3.C107207u;

/* renamed from: androidx.recyclerview.widget.f */
public class C54234f extends C67092e0 {

    /* renamed from: s */
    public static TimeInterpolator f152212s;

    /* renamed from: h */
    public ArrayList<RecyclerView.C16631z> f152213h = new ArrayList<>();

    /* renamed from: i */
    public ArrayList<RecyclerView.C16631z> f152214i = new ArrayList<>();

    /* renamed from: j */
    public ArrayList<C54239e> f152215j = new ArrayList<>();

    /* renamed from: k */
    public ArrayList<C54238d> f152216k = new ArrayList<>();

    /* renamed from: l */
    public ArrayList<ArrayList<RecyclerView.C16631z>> f152217l = new ArrayList<>();

    /* renamed from: m */
    public ArrayList<ArrayList<C54239e>> f152218m = new ArrayList<>();

    /* renamed from: n */
    public ArrayList<ArrayList<C54238d>> f152219n = new ArrayList<>();

    /* renamed from: o */
    public ArrayList<RecyclerView.C16631z> f152220o = new ArrayList<>();

    /* renamed from: p */
    public ArrayList<RecyclerView.C16631z> f152221p = new ArrayList<>();

    /* renamed from: q */
    public ArrayList<RecyclerView.C16631z> f152222q = new ArrayList<>();

    /* renamed from: r */
    public ArrayList<RecyclerView.C16631z> f152223r = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.f$a */
    public class C54235a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ArrayList f152224d;

        public C54235a(ArrayList arrayList) {
            this.f152224d = arrayList;
        }

        public void run() {
            Iterator it = this.f152224d.iterator();
            while (it.hasNext()) {
                C54239e eVar = (C54239e) it.next();
                C54234f fVar = C54234f.this;
                RecyclerView.C16631z zVar = eVar.f152236a;
                int i = eVar.f152237b;
                int i2 = eVar.f152238c;
                int i3 = eVar.f152239d;
                int i4 = eVar.f152240e;
                fVar.getClass();
                View view = zVar.f44854d;
                int i5 = i3 - i;
                int i6 = i4 - i2;
                if (i5 != 0) {
                    view.animate().translationX(0.0f);
                }
                if (i6 != 0) {
                    view.animate().translationY(0.0f);
                }
                ViewPropertyAnimator animate = view.animate();
                fVar.f152221p.add(zVar);
                animate.setDuration(fVar.f44809e).setListener(new C54245i(fVar, zVar, i5, view, i6, animate)).start();
            }
            this.f152224d.clear();
            C54234f.this.f152218m.remove(this.f152224d);
        }
    }

    /* renamed from: androidx.recyclerview.widget.f$b */
    public class C54236b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ArrayList f152226d;

        public C54236b(ArrayList arrayList) {
            this.f152226d = arrayList;
        }

        public void run() {
            Iterator it = this.f152226d.iterator();
            while (it.hasNext()) {
                C54238d dVar = (C54238d) it.next();
                C54234f fVar = C54234f.this;
                fVar.getClass();
                RecyclerView.C16631z zVar = dVar.f152230a;
                View view = null;
                View view2 = zVar == null ? null : zVar.f44854d;
                RecyclerView.C16631z zVar2 = dVar.f152231b;
                if (zVar2 != null) {
                    view = zVar2.f44854d;
                }
                if (view2 != null) {
                    ViewPropertyAnimator duration = view2.animate().setDuration(fVar.f44810f);
                    fVar.f152223r.add(dVar.f152230a);
                    duration.translationX((float) (dVar.f152234e - dVar.f152232c));
                    duration.translationY((float) (dVar.f152235f - dVar.f152233d));
                    duration.alpha(0.0f).setListener(new C54246j(fVar, dVar, duration, view2)).start();
                }
                if (view != null) {
                    ViewPropertyAnimator animate = view.animate();
                    fVar.f152223r.add(dVar.f152231b);
                    animate.translationX(0.0f).translationY(0.0f).setDuration(fVar.f44810f).alpha(1.0f).setListener(new C54247k(fVar, dVar, animate, view)).start();
                }
            }
            this.f152226d.clear();
            C54234f.this.f152219n.remove(this.f152226d);
        }
    }

    /* renamed from: androidx.recyclerview.widget.f$c */
    public class C54237c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ArrayList f152228d;

        public C54237c(ArrayList arrayList) {
            this.f152228d = arrayList;
        }

        public void run() {
            Iterator it = this.f152228d.iterator();
            while (it.hasNext()) {
                RecyclerView.C16631z zVar = (RecyclerView.C16631z) it.next();
                C54234f fVar = C54234f.this;
                fVar.getClass();
                View view = zVar.f44854d;
                ViewPropertyAnimator animate = view.animate();
                fVar.f152220o.add(zVar);
                animate.alpha(1.0f).setDuration(fVar.f44807c).setListener(new C54244h(fVar, zVar, view, animate)).start();
            }
            this.f152228d.clear();
            C54234f.this.f152217l.remove(this.f152228d);
        }
    }

    /* renamed from: androidx.recyclerview.widget.f$d */
    public static class C54238d {

        /* renamed from: a */
        public RecyclerView.C16631z f152230a;

        /* renamed from: b */
        public RecyclerView.C16631z f152231b;

        /* renamed from: c */
        public int f152232c;

        /* renamed from: d */
        public int f152233d;

        /* renamed from: e */
        public int f152234e;

        /* renamed from: f */
        public int f152235f;

        public C54238d(RecyclerView.C16631z zVar, RecyclerView.C16631z zVar2, int i, int i2, int i3, int i4) {
            this.f152230a = zVar;
            this.f152231b = zVar2;
            this.f152232c = i;
            this.f152233d = i2;
            this.f152234e = i3;
            this.f152235f = i4;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f152230a + ", newHolder=" + this.f152231b + ", fromX=" + this.f152232c + ", fromY=" + this.f152233d + ", toX=" + this.f152234e + ", toY=" + this.f152235f + '}';
        }
    }

    /* renamed from: androidx.recyclerview.widget.f$e */
    public static class C54239e {

        /* renamed from: a */
        public RecyclerView.C16631z f152236a;

        /* renamed from: b */
        public int f152237b;

        /* renamed from: c */
        public int f152238c;

        /* renamed from: d */
        public int f152239d;

        /* renamed from: e */
        public int f152240e;

        public C54239e(RecyclerView.C16631z zVar, int i, int i2, int i3, int i4) {
            this.f152236a = zVar;
            this.f152237b = i;
            this.f152238c = i2;
            this.f152239d = i3;
            this.f152240e = i4;
        }
    }

    /* renamed from: C */
    public void mo75012C(List<RecyclerView.C16631z> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).f44854d.animate().cancel();
        }
    }

    /* renamed from: D */
    public void mo75013D() {
        if (!mo17325n()) {
            mo17320i();
        }
    }

    /* renamed from: E */
    public final void mo75014E(List<C54238d> list, RecyclerView.C16631z zVar) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C54238d dVar = list.get(size);
            if (mo75015F(dVar, zVar) && dVar.f152230a == null && dVar.f152231b == null) {
                list.remove(dVar);
            }
        }
    }

    /* renamed from: F */
    public final boolean mo75015F(C54238d dVar, RecyclerView.C16631z zVar) {
        if (dVar.f152231b == zVar) {
            dVar.f152231b = null;
        } else if (dVar.f152230a != zVar) {
            return false;
        } else {
            dVar.f152230a = null;
        }
        View view = zVar.f44854d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(1.0f));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "androidx/recyclerview/widget/DefaultItemAnimator", "endChangeAnimationIfNecessary", "(Landroidx/recyclerview/widget/DefaultItemAnimator$ChangeInfo;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view2, "androidx/recyclerview/widget/DefaultItemAnimator", "endChangeAnimationIfNecessary", "(Landroidx/recyclerview/widget/DefaultItemAnimator$ChangeInfo;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        zVar.f44854d.setTranslationX(0.0f);
        zVar.f44854d.setTranslationY(0.0f);
        mo17319h(zVar);
        return true;
    }

    /* renamed from: G */
    public final void mo75016G(RecyclerView.C16631z zVar) {
        if (f152212s == null) {
            f152212s = new ValueAnimator().getInterpolator();
        }
        zVar.f44854d.animate().setInterpolator(f152212s);
        mo17321j(zVar);
    }

    /* renamed from: g */
    public boolean mo17318g(RecyclerView.C16631z zVar, List<Object> list) {
        return !list.isEmpty() || mo17317f(zVar);
    }

    /* renamed from: j */
    public void mo17321j(RecyclerView.C16631z zVar) {
        View view = zVar.f44854d;
        view.animate().cancel();
        int size = this.f152215j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.f152215j.get(size).f152236a == zVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                mo91175w(zVar);
                this.f152215j.remove(size);
            }
        }
        mo75014E(this.f152216k, zVar);
        if (this.f152213h.remove(zVar)) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(1.0f));
            C117292a.m165358d(view, aVar.mo10232b(), "androidx/recyclerview/widget/DefaultItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "androidx/recyclerview/widget/DefaultItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            mo91176x(zVar);
        }
        if (this.f152214i.remove(zVar)) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(Float.valueOf(1.0f));
            C117292a.m165358d(view, aVar2.mo10232b(), "androidx/recyclerview/widget/DefaultItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "androidx/recyclerview/widget/DefaultItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            mo17319h(zVar);
        }
        int size2 = this.f152219n.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList = this.f152219n.get(size2);
            mo75014E(arrayList, zVar);
            if (arrayList.isEmpty()) {
                this.f152219n.remove(size2);
            }
        }
        int size3 = this.f152218m.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList arrayList2 = this.f152218m.get(size3);
            int size4 = arrayList2.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                } else if (((C54239e) arrayList2.get(size4)).f152236a == zVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    mo91175w(zVar);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f152218m.remove(size3);
                    }
                }
            }
        }
        for (int size5 = this.f152217l.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = this.f152217l.get(size5);
            if (arrayList3.remove(zVar)) {
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(Float.valueOf(1.0f));
                C117292a.m165358d(view, aVar3.mo10232b(), "androidx/recyclerview/widget/DefaultItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
                C117292a.m165359e(view, "androidx/recyclerview/widget/DefaultItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                mo17319h(zVar);
                if (arrayList3.isEmpty()) {
                    this.f152217l.remove(size5);
                }
            }
        }
        this.f152222q.remove(zVar);
        this.f152220o.remove(zVar);
        this.f152223r.remove(zVar);
        this.f152221p.remove(zVar);
        mo75013D();
    }

    /* renamed from: k */
    public void mo17322k() {
        float f;
        int size = this.f152215j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C54239e eVar = this.f152215j.get(size);
            View view = eVar.f152236a.f44854d;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            mo91175w(eVar.f152236a);
            this.f152215j.remove(size);
        }
        int size2 = this.f152213h.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            mo91176x(this.f152213h.get(size2));
            this.f152213h.remove(size2);
        }
        int size3 = this.f152214i.size();
        while (true) {
            size3--;
            f = 1.0f;
            if (size3 < 0) {
                break;
            }
            RecyclerView.C16631z zVar = this.f152214i.get(size3);
            View view2 = zVar.f44854d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(1.0f));
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "androidx/recyclerview/widget/DefaultItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view3, "androidx/recyclerview/widget/DefaultItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            mo17319h(zVar);
            this.f152214i.remove(size3);
        }
        int size4 = this.f152216k.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            C54238d dVar = this.f152216k.get(size4);
            RecyclerView.C16631z zVar2 = dVar.f152230a;
            if (zVar2 != null) {
                mo75015F(dVar, zVar2);
            }
            RecyclerView.C16631z zVar3 = dVar.f152231b;
            if (zVar3 != null) {
                mo75015F(dVar, zVar3);
            }
        }
        this.f152216k.clear();
        if (mo17325n()) {
            int size5 = this.f152218m.size();
            while (true) {
                size5--;
                if (size5 < 0) {
                    break;
                }
                ArrayList arrayList = this.f152218m.get(size5);
                int size6 = arrayList.size();
                while (true) {
                    size6--;
                    if (size6 >= 0) {
                        C54239e eVar2 = (C54239e) arrayList.get(size6);
                        View view4 = eVar2.f152236a.f44854d;
                        view4.setTranslationY(0.0f);
                        view4.setTranslationX(0.0f);
                        mo91175w(eVar2.f152236a);
                        arrayList.remove(size6);
                        if (arrayList.isEmpty()) {
                            this.f152218m.remove(arrayList);
                        }
                    }
                }
            }
            int size7 = this.f152217l.size() - 1;
            while (size7 >= 0) {
                ArrayList arrayList2 = this.f152217l.get(size7);
                int size8 = arrayList2.size() - 1;
                while (size8 >= 0) {
                    RecyclerView.C16631z zVar4 = (RecyclerView.C16631z) arrayList2.get(size8);
                    View view5 = zVar4.f44854d;
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(Float.valueOf(f));
                    View view6 = view5;
                    C117292a.m165358d(view6, aVar2.mo10232b(), "androidx/recyclerview/widget/DefaultItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view5.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                    C117292a.m165359e(view6, "androidx/recyclerview/widget/DefaultItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    mo17319h(zVar4);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f152217l.remove(arrayList2);
                    }
                    size8--;
                    f = 1.0f;
                }
                size7--;
                f = 1.0f;
            }
            int size9 = this.f152219n.size();
            while (true) {
                size9--;
                if (size9 >= 0) {
                    ArrayList arrayList3 = this.f152219n.get(size9);
                    int size10 = arrayList3.size();
                    while (true) {
                        size10--;
                        if (size10 >= 0) {
                            C54238d dVar2 = (C54238d) arrayList3.get(size10);
                            RecyclerView.C16631z zVar5 = dVar2.f152230a;
                            if (zVar5 != null) {
                                mo75015F(dVar2, zVar5);
                            }
                            RecyclerView.C16631z zVar6 = dVar2.f152231b;
                            if (zVar6 != null) {
                                mo75015F(dVar2, zVar6);
                            }
                            if (arrayList3.isEmpty()) {
                                this.f152219n.remove(arrayList3);
                            }
                        }
                    }
                } else {
                    mo75012C(this.f152222q);
                    mo75012C(this.f152221p);
                    mo75012C(this.f152220o);
                    mo75012C(this.f152223r);
                    mo17320i();
                    return;
                }
            }
        }
    }

    /* renamed from: n */
    public boolean mo17325n() {
        return !this.f152214i.isEmpty() || !this.f152216k.isEmpty() || !this.f152215j.isEmpty() || !this.f152213h.isEmpty() || !this.f152221p.isEmpty() || !this.f152222q.isEmpty() || !this.f152220o.isEmpty() || !this.f152223r.isEmpty() || !this.f152218m.isEmpty() || !this.f152217l.isEmpty() || !this.f152219n.isEmpty();
    }

    /* renamed from: r */
    public void mo17329r() {
        boolean z = !this.f152213h.isEmpty();
        boolean z2 = !this.f152215j.isEmpty();
        boolean z3 = !this.f152216k.isEmpty();
        boolean z4 = !this.f152214i.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.C16631z> it = this.f152213h.iterator();
            while (it.hasNext()) {
                RecyclerView.C16631z next = it.next();
                View view = next.f44854d;
                ViewPropertyAnimator animate = view.animate();
                this.f152222q.add(next);
                animate.setDuration(this.f44808d).alpha(0.0f).setListener(new C54243g(this, next, animate, view)).start();
            }
            this.f152213h.clear();
            if (z2) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f152215j);
                this.f152218m.add(arrayList);
                this.f152215j.clear();
                C54235a aVar = new C54235a(arrayList);
                if (z) {
                    View view2 = ((C54239e) arrayList.get(0)).f152236a.f44854d;
                    long j = this.f44808d;
                    WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                    C107207u.C107208b.m145186n(view2, aVar, j);
                } else {
                    aVar.run();
                }
            }
            if (z3) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f152216k);
                this.f152219n.add(arrayList2);
                this.f152216k.clear();
                C54236b bVar = new C54236b(arrayList2);
                if (z) {
                    View view3 = ((C54238d) arrayList2.get(0)).f152230a.f44854d;
                    long j2 = this.f44808d;
                    WeakHashMap<View, C107168a0> weakHashMap2 = C107207u.f320808a;
                    C107207u.C107208b.m145186n(view3, bVar, j2);
                } else {
                    bVar.run();
                }
            }
            if (z4) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f152214i);
                this.f152217l.add(arrayList3);
                this.f152214i.clear();
                C54237c cVar = new C54237c(arrayList3);
                if (z || z2 || z3) {
                    long j3 = 0;
                    long j4 = z ? this.f44808d : 0;
                    long j5 = z2 ? this.f44809e : 0;
                    if (z3) {
                        j3 = this.f44810f;
                    }
                    long max = j4 + Math.max(j5, j3);
                    View view4 = ((RecyclerView.C16631z) arrayList3.get(0)).f44854d;
                    WeakHashMap<View, C107168a0> weakHashMap3 = C107207u.f320808a;
                    C107207u.C107208b.m145186n(view4, cVar, max);
                    return;
                }
                cVar.run();
            }
        }
    }

    /* renamed from: s */
    public boolean mo75017s(RecyclerView.C16631z zVar) {
        mo75016G(zVar);
        View view = zVar.f44854d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(0.0f));
        C117292a.m165358d(view, aVar.mo10232b(), "androidx/recyclerview/widget/DefaultItemAnimator", "animateAdd", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "androidx/recyclerview/widget/DefaultItemAnimator", "animateAdd", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f152214i.add(zVar);
        return true;
    }

    /* renamed from: t */
    public boolean mo75018t(RecyclerView.C16631z zVar, RecyclerView.C16631z zVar2, int i, int i2, int i3, int i4) {
        RecyclerView.C16631z zVar3 = zVar;
        RecyclerView.C16631z zVar4 = zVar2;
        if (zVar3 == zVar4) {
            return mo75019u(zVar, i, i2, i3, i4);
        }
        float translationX = zVar3.f44854d.getTranslationX();
        float translationY = zVar3.f44854d.getTranslationY();
        float alpha = zVar3.f44854d.getAlpha();
        mo75016G(zVar);
        int i5 = (int) (((float) (i3 - i)) - translationX);
        int i6 = (int) (((float) (i4 - i2)) - translationY);
        zVar3.f44854d.setTranslationX(translationX);
        zVar3.f44854d.setTranslationY(translationY);
        View view = zVar3.f44854d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(alpha));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "androidx/recyclerview/widget/DefaultItemAnimator", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view2, "androidx/recyclerview/widget/DefaultItemAnimator", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        if (zVar4 != null) {
            mo75016G(zVar4);
            zVar4.f44854d.setTranslationX((float) (-i5));
            zVar4.f44854d.setTranslationY((float) (-i6));
            View view3 = zVar4.f44854d;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(Float.valueOf(0.0f));
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "androidx/recyclerview/widget/DefaultItemAnimator", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view4, "androidx/recyclerview/widget/DefaultItemAnimator", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        this.f152216k.add(new C54238d(zVar, zVar2, i, i2, i3, i4));
        return true;
    }

    /* renamed from: u */
    public boolean mo75019u(RecyclerView.C16631z zVar, int i, int i2, int i3, int i4) {
        View view = zVar.f44854d;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) zVar.f44854d.getTranslationY());
        mo75016G(zVar);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            mo91175w(zVar);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX((float) (-i5));
        }
        if (i6 != 0) {
            view.setTranslationY((float) (-i6));
        }
        this.f152215j.add(new C54239e(zVar, translationX, translationY, i3, i4));
        return true;
    }

    /* renamed from: v */
    public boolean mo75020v(RecyclerView.C16631z zVar) {
        mo75016G(zVar);
        this.f152213h.add(zVar);
        return true;
    }
}
