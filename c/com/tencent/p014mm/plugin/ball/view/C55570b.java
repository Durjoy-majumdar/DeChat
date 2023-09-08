package com.tencent.p014mm.plugin.ball.view;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.recyclerview.widget.C67092e0;
import androidx.recyclerview.widget.RecyclerView;
import bw0.C54596r;
import bw0.C54597s;
import bw0.C54598t;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import k20.C60958c;
import k20.C9556a;
import p849e3.C107168a0;
import p849e3.C107207u;

/* renamed from: com.tencent.mm.plugin.ball.view.b */
public class C55570b extends C67092e0 {

    /* renamed from: t */
    public static TimeInterpolator f158212t;

    /* renamed from: h */
    public ArrayList<RecyclerView.C16631z> f158213h = new ArrayList<>();

    /* renamed from: i */
    public ArrayList<RecyclerView.C16631z> f158214i = new ArrayList<>();

    /* renamed from: j */
    public ArrayList<C55576f> f158215j = new ArrayList<>();

    /* renamed from: k */
    public ArrayList<C55574d> f158216k = new ArrayList<>();

    /* renamed from: l */
    public ArrayList<ArrayList<RecyclerView.C16631z>> f158217l = new ArrayList<>();

    /* renamed from: m */
    public ArrayList<ArrayList<C55576f>> f158218m = new ArrayList<>();

    /* renamed from: n */
    public ArrayList<ArrayList<C55574d>> f158219n = new ArrayList<>();

    /* renamed from: o */
    public ArrayList<RecyclerView.C16631z> f158220o = new ArrayList<>();

    /* renamed from: p */
    public ArrayList<RecyclerView.C16631z> f158221p = new ArrayList<>();

    /* renamed from: q */
    public ArrayList<RecyclerView.C16631z> f158222q = new ArrayList<>();

    /* renamed from: r */
    public ArrayList<RecyclerView.C16631z> f158223r = new ArrayList<>();

    /* renamed from: s */
    public C55575e f158224s;

    /* renamed from: com.tencent.mm.plugin.ball.view.b$a */
    public class C55571a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ArrayList f158225d;

        public C55571a(ArrayList arrayList) {
            this.f158225d = arrayList;
        }

        public void run() {
            Iterator it = this.f158225d.iterator();
            while (it.hasNext()) {
                C55576f fVar = (C55576f) it.next();
                C55570b bVar = C55570b.this;
                RecyclerView.C16631z zVar = fVar.f158237a;
                int i = fVar.f158238b;
                int i2 = fVar.f158239c;
                int i3 = fVar.f158240d;
                int i4 = fVar.f158241e;
                bVar.getClass();
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
                bVar.f158221p.add(zVar);
                animate.setInterpolator(new AccelerateDecelerateInterpolator()).setDuration(bVar.f44809e).setListener(new C54598t(bVar, zVar, i5, view, i6, animate)).start();
            }
            this.f158225d.clear();
            C55570b.this.f158218m.remove(this.f158225d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.view.b$b */
    public class C55572b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ArrayList f158227d;

        public C55572b(ArrayList arrayList) {
            this.f158227d = arrayList;
        }

        public void run() {
            Iterator it = this.f158227d.iterator();
            while (it.hasNext()) {
                C55574d dVar = (C55574d) it.next();
                C55570b bVar = C55570b.this;
                bVar.getClass();
                RecyclerView.C16631z zVar = dVar.f158231a;
                View view = null;
                View view2 = zVar == null ? null : zVar.f44854d;
                RecyclerView.C16631z zVar2 = dVar.f158232b;
                if (zVar2 != null) {
                    view = zVar2.f44854d;
                }
                if (view2 != null) {
                    ViewPropertyAnimator duration = view2.animate().setDuration(bVar.f44810f);
                    bVar.f158223r.add(dVar.f158231a);
                    duration.translationX((float) (dVar.f158235e - dVar.f158233c));
                    duration.translationY((float) (dVar.f158236f - dVar.f158234d));
                    duration.alpha(0.0f).setListener(new C55577c(bVar, dVar, duration, view2)).start();
                }
                if (view != null) {
                    ViewPropertyAnimator animate = view.animate();
                    bVar.f158223r.add(dVar.f158232b);
                    animate.translationX(0.0f).translationY(0.0f).setDuration(bVar.f44810f).alpha(1.0f).setListener(new C55578d(bVar, dVar, animate, view)).start();
                }
            }
            this.f158227d.clear();
            C55570b.this.f158219n.remove(this.f158227d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.view.b$c */
    public class C55573c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ArrayList f158229d;

        public C55573c(ArrayList arrayList) {
            this.f158229d = arrayList;
        }

        public void run() {
            Iterator it = this.f158229d.iterator();
            while (it.hasNext()) {
                RecyclerView.C16631z zVar = (RecyclerView.C16631z) it.next();
                C55570b bVar = C55570b.this;
                bVar.getClass();
                View view = zVar.f44854d;
                ViewPropertyAnimator animate = view.animate();
                bVar.f158220o.add(zVar);
                animate.alpha(1.0f).setDuration(bVar.f44807c).setListener(new C54597s(bVar, zVar, view, animate)).start();
            }
            this.f158229d.clear();
            C55570b.this.f158217l.remove(this.f158229d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.view.b$d */
    public static class C55574d {

        /* renamed from: a */
        public RecyclerView.C16631z f158231a;

        /* renamed from: b */
        public RecyclerView.C16631z f158232b;

        /* renamed from: c */
        public int f158233c;

        /* renamed from: d */
        public int f158234d;

        /* renamed from: e */
        public int f158235e;

        /* renamed from: f */
        public int f158236f;

        public C55574d(RecyclerView.C16631z zVar, RecyclerView.C16631z zVar2, int i, int i2, int i3, int i4) {
            this.f158231a = zVar;
            this.f158232b = zVar2;
            this.f158233c = i;
            this.f158234d = i2;
            this.f158235e = i3;
            this.f158236f = i4;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f158231a + ", newHolder=" + this.f158232b + ", fromX=" + this.f158233c + ", fromY=" + this.f158234d + ", toX=" + this.f158235e + ", toY=" + this.f158236f + '}';
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.view.b$e */
    public interface C55575e {
    }

    /* renamed from: com.tencent.mm.plugin.ball.view.b$f */
    public static class C55576f {

        /* renamed from: a */
        public RecyclerView.C16631z f158237a;

        /* renamed from: b */
        public int f158238b;

        /* renamed from: c */
        public int f158239c;

        /* renamed from: d */
        public int f158240d;

        /* renamed from: e */
        public int f158241e;

        public C55576f(RecyclerView.C16631z zVar, int i, int i2, int i3, int i4) {
            this.f158237a = zVar;
            this.f158238b = i;
            this.f158239c = i2;
            this.f158240d = i3;
            this.f158241e = i4;
        }
    }

    /* renamed from: C */
    public void mo77093C(List<RecyclerView.C16631z> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).f44854d.animate().cancel();
        }
    }

    /* renamed from: D */
    public void mo77094D() {
        if (!mo17325n()) {
            mo17320i();
        }
    }

    /* renamed from: E */
    public final void mo77095E(List<C55574d> list, RecyclerView.C16631z zVar) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C55574d dVar = list.get(size);
            if (mo77096F(dVar, zVar) && dVar.f158231a == null && dVar.f158232b == null) {
                list.remove(dVar);
            }
        }
    }

    /* renamed from: F */
    public final boolean mo77096F(C55574d dVar, RecyclerView.C16631z zVar) {
        if (dVar.f158232b == zVar) {
            dVar.f158232b = null;
        } else if (dVar.f158231a != zVar) {
            return false;
        } else {
            dVar.f158231a = null;
        }
        View view = zVar.f44854d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(1.0f));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/ball/view/FloatMenuViewItemAnimator", "endChangeAnimationIfNecessary", "(Lcom/tencent/mm/plugin/ball/view/FloatMenuViewItemAnimator$ChangeInfo;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/ball/view/FloatMenuViewItemAnimator", "endChangeAnimationIfNecessary", "(Lcom/tencent/mm/plugin/ball/view/FloatMenuViewItemAnimator$ChangeInfo;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        zVar.f44854d.setTranslationX(0.0f);
        zVar.f44854d.setTranslationY(0.0f);
        mo17319h(zVar);
        return true;
    }

    /* renamed from: G */
    public final void mo77097G(RecyclerView.C16631z zVar) {
        if (f158212t == null) {
            f158212t = new ValueAnimator().getInterpolator();
        }
        zVar.f44854d.animate().setInterpolator(f158212t);
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
        int size = this.f158215j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.f158215j.get(size).f158237a == zVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                mo91175w(zVar);
                this.f158215j.remove(size);
            }
        }
        mo77095E(this.f158216k, zVar);
        if (this.f158213h.remove(zVar)) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(1.0f));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/ball/view/FloatMenuViewItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/ball/view/FloatMenuViewItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setTranslationX(0.0f);
            mo91176x(zVar);
        }
        if (this.f158214i.remove(zVar)) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(Float.valueOf(1.0f));
            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/ball/view/FloatMenuViewItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/ball/view/FloatMenuViewItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            mo17319h(zVar);
        }
        int size2 = this.f158219n.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList = this.f158219n.get(size2);
            mo77095E(arrayList, zVar);
            if (arrayList.isEmpty()) {
                this.f158219n.remove(size2);
            }
        }
        int size3 = this.f158218m.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList arrayList2 = this.f158218m.get(size3);
            int size4 = arrayList2.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                } else if (((C55576f) arrayList2.get(size4)).f158237a == zVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    mo91175w(zVar);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f158218m.remove(size3);
                    }
                }
            }
        }
        for (int size5 = this.f158217l.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = this.f158217l.get(size5);
            if (arrayList3.remove(zVar)) {
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(Float.valueOf(1.0f));
                C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/plugin/ball/view/FloatMenuViewItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/ball/view/FloatMenuViewItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                mo17319h(zVar);
                if (arrayList3.isEmpty()) {
                    this.f158217l.remove(size5);
                }
            }
        }
        this.f158222q.remove(zVar);
        this.f158220o.remove(zVar);
        this.f158223r.remove(zVar);
        this.f158221p.remove(zVar);
        mo77094D();
    }

    /* renamed from: k */
    public void mo17322k() {
        float f;
        int size = this.f158215j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C55576f fVar = this.f158215j.get(size);
            View view = fVar.f158237a.f44854d;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            mo91175w(fVar.f158237a);
            this.f158215j.remove(size);
        }
        int size2 = this.f158213h.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            mo91176x(this.f158213h.get(size2));
            this.f158213h.remove(size2);
        }
        int size3 = this.f158214i.size();
        while (true) {
            size3--;
            f = 1.0f;
            if (size3 < 0) {
                break;
            }
            RecyclerView.C16631z zVar = this.f158214i.get(size3);
            View view2 = zVar.f44854d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(1.0f));
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/ball/view/FloatMenuViewItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/ball/view/FloatMenuViewItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            mo17319h(zVar);
            this.f158214i.remove(size3);
        }
        int size4 = this.f158216k.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            C55574d dVar = this.f158216k.get(size4);
            RecyclerView.C16631z zVar2 = dVar.f158231a;
            if (zVar2 != null) {
                mo77096F(dVar, zVar2);
            }
            RecyclerView.C16631z zVar3 = dVar.f158232b;
            if (zVar3 != null) {
                mo77096F(dVar, zVar3);
            }
        }
        this.f158216k.clear();
        if (mo17325n()) {
            int size5 = this.f158218m.size();
            while (true) {
                size5--;
                if (size5 < 0) {
                    break;
                }
                ArrayList arrayList = this.f158218m.get(size5);
                int size6 = arrayList.size();
                while (true) {
                    size6--;
                    if (size6 >= 0) {
                        C55576f fVar2 = (C55576f) arrayList.get(size6);
                        View view4 = fVar2.f158237a.f44854d;
                        view4.setTranslationY(0.0f);
                        view4.setTranslationX(0.0f);
                        mo91175w(fVar2.f158237a);
                        arrayList.remove(size6);
                        if (arrayList.isEmpty()) {
                            this.f158218m.remove(arrayList);
                        }
                    }
                }
            }
            int size7 = this.f158217l.size() - 1;
            while (size7 >= 0) {
                ArrayList arrayList2 = this.f158217l.get(size7);
                int size8 = arrayList2.size() - 1;
                while (size8 >= 0) {
                    RecyclerView.C16631z zVar4 = (RecyclerView.C16631z) arrayList2.get(size8);
                    View view5 = zVar4.f44854d;
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(Float.valueOf(f));
                    View view6 = view5;
                    C117292a.m165358d(view6, aVar2.mo10232b(), "com/tencent/mm/plugin/ball/view/FloatMenuViewItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view5.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                    C117292a.m165359e(view6, "com/tencent/mm/plugin/ball/view/FloatMenuViewItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    mo17319h(zVar4);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f158217l.remove(arrayList2);
                    }
                    size8--;
                    f = 1.0f;
                }
                size7--;
                f = 1.0f;
            }
            int size9 = this.f158219n.size();
            while (true) {
                size9--;
                if (size9 >= 0) {
                    ArrayList arrayList3 = this.f158219n.get(size9);
                    int size10 = arrayList3.size();
                    while (true) {
                        size10--;
                        if (size10 >= 0) {
                            C55574d dVar2 = (C55574d) arrayList3.get(size10);
                            RecyclerView.C16631z zVar5 = dVar2.f158231a;
                            if (zVar5 != null) {
                                mo77096F(dVar2, zVar5);
                            }
                            RecyclerView.C16631z zVar6 = dVar2.f158232b;
                            if (zVar6 != null) {
                                mo77096F(dVar2, zVar6);
                            }
                            if (arrayList3.isEmpty()) {
                                this.f158219n.remove(arrayList3);
                            }
                        }
                    }
                } else {
                    mo77093C(this.f158222q);
                    mo77093C(this.f158221p);
                    mo77093C(this.f158220o);
                    mo77093C(this.f158223r);
                    mo17320i();
                    return;
                }
            }
        }
    }

    /* renamed from: n */
    public boolean mo17325n() {
        return !this.f158214i.isEmpty() || !this.f158216k.isEmpty() || !this.f158215j.isEmpty() || !this.f158213h.isEmpty() || !this.f158221p.isEmpty() || !this.f158222q.isEmpty() || !this.f158220o.isEmpty() || !this.f158223r.isEmpty() || !this.f158218m.isEmpty() || !this.f158217l.isEmpty() || !this.f158219n.isEmpty();
    }

    /* renamed from: r */
    public void mo17329r() {
        boolean z = !this.f158213h.isEmpty();
        boolean z2 = !this.f158215j.isEmpty();
        boolean z3 = !this.f158216k.isEmpty();
        boolean z4 = !this.f158214i.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.C16631z> it = this.f158213h.iterator();
            while (it.hasNext()) {
                RecyclerView.C16631z next = it.next();
                View view = next.f44854d;
                this.f158222q.add(next);
                ViewPropertyAnimator animate = view.animate();
                C54596r rVar = new C54596r(this, next, animate, view);
                C55575e eVar = this.f158224s;
                if (eVar == null || !((C105107a) eVar).mo149377a(next, rVar)) {
                    animate.setDuration(this.f44808d).alpha(0.0f).setListener(rVar).start();
                }
            }
            this.f158213h.clear();
            if (z2) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f158215j);
                this.f158218m.add(arrayList);
                this.f158215j.clear();
                C55571a aVar = new C55571a(arrayList);
                if (z) {
                    View view2 = ((C55576f) arrayList.get(0)).f158237a.f44854d;
                    long j = this.f44808d;
                    WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                    C107207u.C107208b.m145186n(view2, aVar, j);
                } else {
                    aVar.run();
                }
            }
            if (z3) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f158216k);
                this.f158219n.add(arrayList2);
                this.f158216k.clear();
                C55572b bVar = new C55572b(arrayList2);
                if (z) {
                    View view3 = ((C55574d) arrayList2.get(0)).f158231a.f44854d;
                    long j2 = this.f44808d;
                    WeakHashMap<View, C107168a0> weakHashMap2 = C107207u.f320808a;
                    C107207u.C107208b.m145186n(view3, bVar, j2);
                } else {
                    bVar.run();
                }
            }
            if (z4) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f158214i);
                this.f158217l.add(arrayList3);
                this.f158214i.clear();
                C55573c cVar = new C55573c(arrayList3);
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
        mo77097G(zVar);
        View view = zVar.f44854d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(0.0f));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/ball/view/FloatMenuViewItemAnimator", "animateAdd", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/ball/view/FloatMenuViewItemAnimator", "animateAdd", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f158214i.add(zVar);
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
        mo77097G(zVar);
        int i5 = (int) (((float) (i3 - i)) - translationX);
        int i6 = (int) (((float) (i4 - i2)) - translationY);
        zVar3.f44854d.setTranslationX(translationX);
        zVar3.f44854d.setTranslationY(translationY);
        View view = zVar3.f44854d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(alpha));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/ball/view/FloatMenuViewItemAnimator", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/ball/view/FloatMenuViewItemAnimator", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        if (zVar4 != null) {
            mo77097G(zVar4);
            zVar4.f44854d.setTranslationX((float) (-i5));
            zVar4.f44854d.setTranslationY((float) (-i6));
            View view3 = zVar4.f44854d;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(Float.valueOf(0.0f));
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/ball/view/FloatMenuViewItemAnimator", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/ball/view/FloatMenuViewItemAnimator", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        this.f158216k.add(new C55574d(zVar, zVar2, i, i2, i3, i4));
        return true;
    }

    /* renamed from: u */
    public boolean mo75019u(RecyclerView.C16631z zVar, int i, int i2, int i3, int i4) {
        View view = zVar.f44854d;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) zVar.f44854d.getTranslationY());
        mo77097G(zVar);
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
        this.f158215j.add(new C55576f(zVar, translationX, translationY, i3, i4));
        return true;
    }

    /* renamed from: v */
    public boolean mo75020v(RecyclerView.C16631z zVar) {
        mo77097G(zVar);
        this.f158213h.add(zVar);
        return true;
    }
}
