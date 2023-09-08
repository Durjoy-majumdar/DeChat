package com.tencent.p014mm.plugin.taskbar.p110ui;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.C67092e0;
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

/* renamed from: com.tencent.mm.plugin.taskbar.ui.s */
public class C57440s extends C67092e0 {

    /* renamed from: s */
    public static TimeInterpolator f164534s;

    /* renamed from: h */
    public ArrayList<RecyclerView.C16631z> f164535h = new ArrayList<>();

    /* renamed from: i */
    public ArrayList<RecyclerView.C16631z> f164536i = new ArrayList<>();

    /* renamed from: j */
    public ArrayList<C57445e> f164537j = new ArrayList<>();

    /* renamed from: k */
    public ArrayList<C57444d> f164538k = new ArrayList<>();

    /* renamed from: l */
    public ArrayList<ArrayList<RecyclerView.C16631z>> f164539l = new ArrayList<>();

    /* renamed from: m */
    public ArrayList<ArrayList<C57445e>> f164540m = new ArrayList<>();

    /* renamed from: n */
    public ArrayList<ArrayList<C57444d>> f164541n = new ArrayList<>();

    /* renamed from: o */
    public ArrayList<RecyclerView.C16631z> f164542o = new ArrayList<>();

    /* renamed from: p */
    public ArrayList<RecyclerView.C16631z> f164543p = new ArrayList<>();

    /* renamed from: q */
    public ArrayList<RecyclerView.C16631z> f164544q = new ArrayList<>();

    /* renamed from: r */
    public ArrayList<RecyclerView.C16631z> f164545r = new ArrayList<>();

    /* renamed from: com.tencent.mm.plugin.taskbar.ui.s$a */
    public class C57441a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ArrayList f164546d;

        public C57441a(ArrayList arrayList) {
            this.f164546d = arrayList;
        }

        public void run() {
            Iterator it = this.f164546d.iterator();
            while (it.hasNext()) {
                C57445e eVar = (C57445e) it.next();
                C57440s sVar = C57440s.this;
                RecyclerView.C16631z zVar = eVar.f164558a;
                int i = eVar.f164559b;
                int i2 = eVar.f164560c;
                int i3 = eVar.f164561d;
                int i4 = eVar.f164562e;
                sVar.getClass();
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
                sVar.f164543p.add(zVar);
                animate.setDuration(sVar.f44809e).setListener(new C57448v(sVar, zVar, i5, view, i6, animate)).start();
            }
            this.f164546d.clear();
            C57440s.this.f164540m.remove(this.f164546d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.taskbar.ui.s$b */
    public class C57442b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ArrayList f164548d;

        public C57442b(ArrayList arrayList) {
            this.f164548d = arrayList;
        }

        public void run() {
            Iterator it = this.f164548d.iterator();
            while (it.hasNext()) {
                C57444d dVar = (C57444d) it.next();
                C57440s sVar = C57440s.this;
                sVar.getClass();
                RecyclerView.C16631z zVar = dVar.f164552a;
                View view = null;
                View view2 = zVar == null ? null : zVar.f44854d;
                RecyclerView.C16631z zVar2 = dVar.f164553b;
                if (zVar2 != null) {
                    view = zVar2.f44854d;
                }
                if (view2 != null) {
                    ViewPropertyAnimator duration = view2.animate().setDuration(sVar.f44810f);
                    sVar.f164545r.add(dVar.f164552a);
                    duration.translationX((float) (dVar.f164556e - dVar.f164554c));
                    duration.translationY((float) (dVar.f164557f - dVar.f164555d));
                    duration.alpha(0.0f).setListener(new C57449w(sVar, dVar, duration, view2)).start();
                }
                if (view != null) {
                    ViewPropertyAnimator animate = view.animate();
                    sVar.f164545r.add(dVar.f164553b);
                    animate.translationX(0.0f).translationY(0.0f).setDuration(sVar.f44810f).alpha(1.0f).setListener(new C57450x(sVar, dVar, animate, view)).start();
                }
            }
            this.f164548d.clear();
            C57440s.this.f164541n.remove(this.f164548d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.taskbar.ui.s$c */
    public class C57443c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ArrayList f164550d;

        public C57443c(ArrayList arrayList) {
            this.f164550d = arrayList;
        }

        public void run() {
            Iterator it = this.f164550d.iterator();
            while (it.hasNext()) {
                RecyclerView.C16631z zVar = (RecyclerView.C16631z) it.next();
                C57440s sVar = C57440s.this;
                sVar.getClass();
                View view = zVar.f44854d;
                ViewPropertyAnimator animate = view.animate();
                sVar.f164542o.add(zVar);
                animate.alpha(1.0f).setDuration(sVar.f44807c).setListener(new C57447u(sVar, zVar, view, animate)).start();
            }
            this.f164550d.clear();
            C57440s.this.f164539l.remove(this.f164550d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.taskbar.ui.s$d */
    public static class C57444d {

        /* renamed from: a */
        public RecyclerView.C16631z f164552a;

        /* renamed from: b */
        public RecyclerView.C16631z f164553b;

        /* renamed from: c */
        public int f164554c;

        /* renamed from: d */
        public int f164555d;

        /* renamed from: e */
        public int f164556e;

        /* renamed from: f */
        public int f164557f;

        public C57444d(RecyclerView.C16631z zVar, RecyclerView.C16631z zVar2, int i, int i2, int i3, int i4) {
            this.f164552a = zVar;
            this.f164553b = zVar2;
            this.f164554c = i;
            this.f164555d = i2;
            this.f164556e = i3;
            this.f164557f = i4;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f164552a + ", newHolder=" + this.f164553b + ", fromX=" + this.f164554c + ", fromY=" + this.f164555d + ", toX=" + this.f164556e + ", toY=" + this.f164557f + '}';
        }
    }

    /* renamed from: com.tencent.mm.plugin.taskbar.ui.s$e */
    public static class C57445e {

        /* renamed from: a */
        public RecyclerView.C16631z f164558a;

        /* renamed from: b */
        public int f164559b;

        /* renamed from: c */
        public int f164560c;

        /* renamed from: d */
        public int f164561d;

        /* renamed from: e */
        public int f164562e;

        public C57445e(RecyclerView.C16631z zVar, int i, int i2, int i3, int i4) {
            this.f164558a = zVar;
            this.f164559b = i;
            this.f164560c = i2;
            this.f164561d = i3;
            this.f164562e = i4;
        }
    }

    /* renamed from: C */
    public void mo81037C(List<RecyclerView.C16631z> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).f44854d.animate().cancel();
        }
    }

    /* renamed from: D */
    public void mo81038D() {
        if (!mo17325n()) {
            mo17320i();
        }
    }

    /* renamed from: E */
    public final void mo81039E(List<C57444d> list, RecyclerView.C16631z zVar) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C57444d dVar = list.get(size);
            if (mo81040F(dVar, zVar) && dVar.f164552a == null && dVar.f164553b == null) {
                list.remove(dVar);
            }
        }
    }

    /* renamed from: F */
    public final boolean mo81040F(C57444d dVar, RecyclerView.C16631z zVar) {
        if (dVar.f164553b == zVar) {
            dVar.f164553b = null;
        } else if (dVar.f164552a != zVar) {
            return false;
        } else {
            dVar.f164552a = null;
        }
        View view = zVar.f44854d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(1.0f));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/taskbar/ui/TaskBarItemAnimator", "endChangeAnimationIfNecessary", "(Lcom/tencent/mm/plugin/taskbar/ui/TaskBarItemAnimator$ChangeInfo;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/taskbar/ui/TaskBarItemAnimator", "endChangeAnimationIfNecessary", "(Lcom/tencent/mm/plugin/taskbar/ui/TaskBarItemAnimator$ChangeInfo;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        zVar.f44854d.setTranslationX(0.0f);
        zVar.f44854d.setTranslationY(0.0f);
        mo17319h(zVar);
        return true;
    }

    /* renamed from: G */
    public void mo81041G(RecyclerView.C16631z zVar) {
        if (f164534s == null) {
            f164534s = new ValueAnimator().getInterpolator();
        }
        zVar.f44854d.animate().setInterpolator(f164534s);
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
        int size = this.f164537j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.f164537j.get(size).f164558a == zVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                mo91175w(zVar);
                this.f164537j.remove(size);
            }
        }
        mo81039E(this.f164538k, zVar);
        if (this.f164535h.remove(zVar)) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(1.0f));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/taskbar/ui/TaskBarItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/taskbar/ui/TaskBarItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            mo91176x(zVar);
        }
        if (this.f164536i.remove(zVar)) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(Float.valueOf(1.0f));
            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/taskbar/ui/TaskBarItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/taskbar/ui/TaskBarItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            mo17319h(zVar);
        }
        int size2 = this.f164541n.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList = this.f164541n.get(size2);
            mo81039E(arrayList, zVar);
            if (arrayList.isEmpty()) {
                this.f164541n.remove(size2);
            }
        }
        int size3 = this.f164540m.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList arrayList2 = this.f164540m.get(size3);
            int size4 = arrayList2.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                } else if (((C57445e) arrayList2.get(size4)).f164558a == zVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    mo91175w(zVar);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f164540m.remove(size3);
                    }
                }
            }
        }
        for (int size5 = this.f164539l.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = this.f164539l.get(size5);
            if (arrayList3.remove(zVar)) {
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(Float.valueOf(1.0f));
                C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/plugin/taskbar/ui/TaskBarItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/taskbar/ui/TaskBarItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                mo17319h(zVar);
                if (arrayList3.isEmpty()) {
                    this.f164539l.remove(size5);
                }
            }
        }
        this.f164544q.remove(zVar);
        this.f164542o.remove(zVar);
        this.f164545r.remove(zVar);
        this.f164543p.remove(zVar);
        mo81038D();
    }

    /* renamed from: k */
    public void mo17322k() {
        float f;
        int size = this.f164537j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C57445e eVar = this.f164537j.get(size);
            View view = eVar.f164558a.f44854d;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            mo91175w(eVar.f164558a);
            this.f164537j.remove(size);
        }
        int size2 = this.f164535h.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            mo91176x(this.f164535h.get(size2));
            this.f164535h.remove(size2);
        }
        int size3 = this.f164536i.size();
        while (true) {
            size3--;
            f = 1.0f;
            if (size3 < 0) {
                break;
            }
            RecyclerView.C16631z zVar = this.f164536i.get(size3);
            View view2 = zVar.f44854d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(1.0f));
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/taskbar/ui/TaskBarItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/taskbar/ui/TaskBarItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            mo17319h(zVar);
            this.f164536i.remove(size3);
        }
        int size4 = this.f164538k.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            C57444d dVar = this.f164538k.get(size4);
            RecyclerView.C16631z zVar2 = dVar.f164552a;
            if (zVar2 != null) {
                mo81040F(dVar, zVar2);
            }
            RecyclerView.C16631z zVar3 = dVar.f164553b;
            if (zVar3 != null) {
                mo81040F(dVar, zVar3);
            }
        }
        this.f164538k.clear();
        if (mo17325n()) {
            int size5 = this.f164540m.size();
            while (true) {
                size5--;
                if (size5 < 0) {
                    break;
                }
                ArrayList arrayList = this.f164540m.get(size5);
                int size6 = arrayList.size();
                while (true) {
                    size6--;
                    if (size6 >= 0) {
                        C57445e eVar2 = (C57445e) arrayList.get(size6);
                        View view4 = eVar2.f164558a.f44854d;
                        view4.setTranslationY(0.0f);
                        view4.setTranslationX(0.0f);
                        mo91175w(eVar2.f164558a);
                        arrayList.remove(size6);
                        if (arrayList.isEmpty()) {
                            this.f164540m.remove(arrayList);
                        }
                    }
                }
            }
            int size7 = this.f164539l.size() - 1;
            while (size7 >= 0) {
                ArrayList arrayList2 = this.f164539l.get(size7);
                int size8 = arrayList2.size() - 1;
                while (size8 >= 0) {
                    RecyclerView.C16631z zVar4 = (RecyclerView.C16631z) arrayList2.get(size8);
                    View view5 = zVar4.f44854d;
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(Float.valueOf(f));
                    View view6 = view5;
                    C117292a.m165358d(view6, aVar2.mo10232b(), "com/tencent/mm/plugin/taskbar/ui/TaskBarItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view5.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                    C117292a.m165359e(view6, "com/tencent/mm/plugin/taskbar/ui/TaskBarItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    mo17319h(zVar4);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f164539l.remove(arrayList2);
                    }
                    size8--;
                    f = 1.0f;
                }
                size7--;
                f = 1.0f;
            }
            int size9 = this.f164541n.size();
            while (true) {
                size9--;
                if (size9 >= 0) {
                    ArrayList arrayList3 = this.f164541n.get(size9);
                    int size10 = arrayList3.size();
                    while (true) {
                        size10--;
                        if (size10 >= 0) {
                            C57444d dVar2 = (C57444d) arrayList3.get(size10);
                            RecyclerView.C16631z zVar5 = dVar2.f164552a;
                            if (zVar5 != null) {
                                mo81040F(dVar2, zVar5);
                            }
                            RecyclerView.C16631z zVar6 = dVar2.f164553b;
                            if (zVar6 != null) {
                                mo81040F(dVar2, zVar6);
                            }
                            if (arrayList3.isEmpty()) {
                                this.f164541n.remove(arrayList3);
                            }
                        }
                    }
                } else {
                    mo81037C(this.f164544q);
                    mo81037C(this.f164543p);
                    mo81037C(this.f164542o);
                    mo81037C(this.f164545r);
                    mo17320i();
                    return;
                }
            }
        }
    }

    /* renamed from: n */
    public boolean mo17325n() {
        return !this.f164536i.isEmpty() || !this.f164538k.isEmpty() || !this.f164537j.isEmpty() || !this.f164535h.isEmpty() || !this.f164543p.isEmpty() || !this.f164544q.isEmpty() || !this.f164542o.isEmpty() || !this.f164545r.isEmpty() || !this.f164540m.isEmpty() || !this.f164539l.isEmpty() || !this.f164541n.isEmpty();
    }

    /* renamed from: r */
    public void mo17329r() {
        boolean z = !this.f164535h.isEmpty();
        boolean z2 = !this.f164537j.isEmpty();
        boolean z3 = !this.f164538k.isEmpty();
        boolean z4 = !this.f164536i.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.C16631z> it = this.f164535h.iterator();
            while (it.hasNext()) {
                RecyclerView.C16631z next = it.next();
                View view = next.f44854d;
                ViewPropertyAnimator animate = view.animate();
                this.f164544q.add(next);
                animate.setDuration(this.f44808d).alpha(0.0f).setListener(new C57446t(this, next, animate, view)).start();
            }
            this.f164535h.clear();
            if (z2) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f164537j);
                this.f164540m.add(arrayList);
                this.f164537j.clear();
                C57441a aVar = new C57441a(arrayList);
                View view2 = ((C57445e) arrayList.get(0)).f164558a.f44854d;
                long j = this.f44808d;
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                C107207u.C107208b.m145186n(view2, aVar, j);
            }
            if (z3) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f164538k);
                this.f164541n.add(arrayList2);
                this.f164538k.clear();
                C57442b bVar = new C57442b(arrayList2);
                if (z) {
                    View view3 = ((C57444d) arrayList2.get(0)).f164552a.f44854d;
                    long j2 = this.f44808d;
                    WeakHashMap<View, C107168a0> weakHashMap2 = C107207u.f320808a;
                    C107207u.C107208b.m145186n(view3, bVar, j2);
                } else {
                    bVar.run();
                }
            }
            if (z4) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f164536i);
                this.f164539l.add(arrayList3);
                this.f164536i.clear();
                C57443c cVar = new C57443c(arrayList3);
                if (z || z2 || z3) {
                    View view4 = ((RecyclerView.C16631z) arrayList3.get(0)).f44854d;
                    long j3 = this.f44808d;
                    WeakHashMap<View, C107168a0> weakHashMap3 = C107207u.f320808a;
                    C107207u.C107208b.m145186n(view4, cVar, j3);
                    return;
                }
                cVar.run();
            }
        }
    }

    /* renamed from: s */
    public boolean mo75017s(RecyclerView.C16631z zVar) {
        mo81041G(zVar);
        View view = zVar.f44854d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(0.0f));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/taskbar/ui/TaskBarItemAnimator", "animateAdd", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/taskbar/ui/TaskBarItemAnimator", "animateAdd", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f164536i.add(zVar);
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
        mo81041G(zVar);
        int i5 = (int) (((float) (i3 - i)) - translationX);
        int i6 = (int) (((float) (i4 - i2)) - translationY);
        zVar3.f44854d.setTranslationX(translationX);
        zVar3.f44854d.setTranslationY(translationY);
        View view = zVar3.f44854d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(alpha));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/taskbar/ui/TaskBarItemAnimator", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/taskbar/ui/TaskBarItemAnimator", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        if (zVar4 != null) {
            mo81041G(zVar4);
            zVar4.f44854d.setTranslationX((float) (-i5));
            zVar4.f44854d.setTranslationY((float) (-i6));
            View view3 = zVar4.f44854d;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(Float.valueOf(0.0f));
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/taskbar/ui/TaskBarItemAnimator", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/taskbar/ui/TaskBarItemAnimator", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        this.f164538k.add(new C57444d(zVar, zVar2, i, i2, i3, i4));
        return true;
    }

    /* renamed from: u */
    public boolean mo75019u(RecyclerView.C16631z zVar, int i, int i2, int i3, int i4) {
        View view = zVar.f44854d;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) zVar.f44854d.getTranslationY());
        mo81041G(zVar);
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
        this.f164537j.add(new C57445e(zVar, translationX, translationY, i3, i4));
        return true;
    }

    /* renamed from: v */
    public boolean mo75020v(RecyclerView.C16631z zVar) {
        mo81041G(zVar);
        this.f164535h.add(zVar);
        return true;
    }
}
