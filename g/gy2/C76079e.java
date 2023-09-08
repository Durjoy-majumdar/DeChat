package gy2;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.C67092e0;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import k20.C60958c;
import k20.C9556a;
import p849e3.C107168a0;
import p849e3.C107207u;

/* renamed from: gy2.e */
public class C76079e extends C67092e0 {

    /* renamed from: s */
    public static TimeInterpolator f222945s;

    /* renamed from: h */
    public ArrayList<RecyclerView.C16631z> f222946h = new ArrayList<>();

    /* renamed from: i */
    public ArrayList<RecyclerView.C16631z> f222947i = new ArrayList<>();

    /* renamed from: j */
    public ArrayList<C76084e> f222948j = new ArrayList<>();

    /* renamed from: k */
    public ArrayList<C76083d> f222949k = new ArrayList<>();

    /* renamed from: l */
    public ArrayList<ArrayList<RecyclerView.C16631z>> f222950l = new ArrayList<>();

    /* renamed from: m */
    public ArrayList<ArrayList<C76084e>> f222951m = new ArrayList<>();

    /* renamed from: n */
    public ArrayList<ArrayList<C76083d>> f222952n = new ArrayList<>();

    /* renamed from: o */
    public ArrayList<RecyclerView.C16631z> f222953o = new ArrayList<>();

    /* renamed from: p */
    public ArrayList<RecyclerView.C16631z> f222954p = new ArrayList<>();

    /* renamed from: q */
    public ArrayList<RecyclerView.C16631z> f222955q = new ArrayList<>();

    /* renamed from: r */
    public ArrayList<RecyclerView.C16631z> f222956r = new ArrayList<>();

    /* renamed from: gy2.e$a */
    public class C76080a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ArrayList f222957d;

        public C76080a(ArrayList arrayList) {
            this.f222957d = arrayList;
        }

        public void run() {
            Iterator it = this.f222957d.iterator();
            while (it.hasNext()) {
                C76084e eVar = (C76084e) it.next();
                C76079e eVar2 = C76079e.this;
                RecyclerView.C16631z zVar = eVar.f222969a;
                int i = eVar.f222970b;
                int i2 = eVar.f222971c;
                int i3 = eVar.f222972d;
                int i4 = eVar.f222973e;
                eVar2.getClass();
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
                eVar2.f222954p.add(zVar);
                animate.setDuration(eVar2.f44809e).setListener(new C76087h(eVar2, zVar, i5, view, i6, animate)).start();
            }
            this.f222957d.clear();
            C76079e.this.f222951m.remove(this.f222957d);
        }
    }

    /* renamed from: gy2.e$b */
    public class C76081b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ArrayList f222959d;

        public C76081b(ArrayList arrayList) {
            this.f222959d = arrayList;
        }

        public void run() {
            Iterator it = this.f222959d.iterator();
            while (it.hasNext()) {
                C76083d dVar = (C76083d) it.next();
                C76079e eVar = C76079e.this;
                eVar.getClass();
                RecyclerView.C16631z zVar = dVar.f222963a;
                View view = null;
                View view2 = zVar == null ? null : zVar.f44854d;
                RecyclerView.C16631z zVar2 = dVar.f222964b;
                if (zVar2 != null) {
                    view = zVar2.f44854d;
                }
                if (view2 != null) {
                    ViewPropertyAnimator duration = view2.animate().setDuration(eVar.f44810f);
                    eVar.f222956r.add(dVar.f222963a);
                    duration.translationX((float) (dVar.f222967e - dVar.f222965c));
                    duration.translationY((float) (dVar.f222968f - dVar.f222966d));
                    duration.alpha(0.0f).setListener(new C76088i(eVar, dVar, duration, view2)).start();
                }
                if (view != null) {
                    ViewPropertyAnimator animate = view.animate();
                    eVar.f222956r.add(dVar.f222964b);
                    animate.translationX(0.0f).translationY(0.0f).setDuration(eVar.f44810f).alpha(1.0f).setListener(new C76089j(eVar, dVar, animate, view)).start();
                }
            }
            this.f222959d.clear();
            C76079e.this.f222952n.remove(this.f222959d);
        }
    }

    /* renamed from: gy2.e$c */
    public class C76082c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ArrayList f222961d;

        public C76082c(ArrayList arrayList) {
            this.f222961d = arrayList;
        }

        public void run() {
            Iterator it = this.f222961d.iterator();
            while (it.hasNext()) {
                RecyclerView.C16631z zVar = (RecyclerView.C16631z) it.next();
                C76079e eVar = C76079e.this;
                eVar.getClass();
                View view = zVar.f44854d;
                ViewPropertyAnimator animate = view.animate();
                eVar.f222953o.add(zVar);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(1.0f));
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppItemAnimator", "animateAddImpl", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppItemAnimator", "animateAddImpl", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                animate.scaleX(1.0f).scaleY(1.0f).setDuration(eVar.f44807c).setListener(new C76086g(eVar, zVar, view, animate)).start();
            }
            this.f222961d.clear();
            C76079e.this.f222950l.remove(this.f222961d);
        }
    }

    /* renamed from: gy2.e$d */
    public static class C76083d {

        /* renamed from: a */
        public RecyclerView.C16631z f222963a;

        /* renamed from: b */
        public RecyclerView.C16631z f222964b;

        /* renamed from: c */
        public int f222965c;

        /* renamed from: d */
        public int f222966d;

        /* renamed from: e */
        public int f222967e;

        /* renamed from: f */
        public int f222968f;

        public C76083d(RecyclerView.C16631z zVar, RecyclerView.C16631z zVar2, int i, int i2, int i3, int i4) {
            this.f222963a = zVar;
            this.f222964b = zVar2;
            this.f222965c = i;
            this.f222966d = i2;
            this.f222967e = i3;
            this.f222968f = i4;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f222963a + ", newHolder=" + this.f222964b + ", fromX=" + this.f222965c + ", fromY=" + this.f222966d + ", toX=" + this.f222967e + ", toY=" + this.f222968f + '}';
        }
    }

    /* renamed from: gy2.e$e */
    public static class C76084e {

        /* renamed from: a */
        public RecyclerView.C16631z f222969a;

        /* renamed from: b */
        public int f222970b;

        /* renamed from: c */
        public int f222971c;

        /* renamed from: d */
        public int f222972d;

        /* renamed from: e */
        public int f222973e;

        public C76084e(RecyclerView.C16631z zVar, int i, int i2, int i3, int i4) {
            this.f222969a = zVar;
            this.f222970b = i;
            this.f222971c = i2;
            this.f222972d = i3;
            this.f222973e = i4;
        }
    }

    public C76079e() {
        this.f44807c = 200;
        this.f44810f = 200;
        this.f44809e = 200;
        this.f44808d = 200;
    }

    /* renamed from: C */
    public void mo106285C(List<RecyclerView.C16631z> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).f44854d.animate().cancel();
        }
    }

    /* renamed from: D */
    public void mo106286D() {
        if (!mo17325n()) {
            mo17320i();
        }
    }

    /* renamed from: E */
    public final void mo106287E(List<C76083d> list, RecyclerView.C16631z zVar) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C76083d dVar = list.get(size);
            if (mo106288F(dVar, zVar) && dVar.f222963a == null && dVar.f222964b == null) {
                list.remove(dVar);
            }
        }
    }

    /* renamed from: F */
    public final boolean mo106288F(C76083d dVar, RecyclerView.C16631z zVar) {
        if (dVar.f222964b == zVar) {
            dVar.f222964b = null;
        } else if (dVar.f222963a != zVar) {
            return false;
        } else {
            dVar.f222963a = null;
        }
        View view = zVar.f44854d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(1.0f));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppItemAnimator", "endChangeAnimationIfNecessary", "(Lcom/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppItemAnimator$ChangeInfo;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppItemAnimator", "endChangeAnimationIfNecessary", "(Lcom/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppItemAnimator$ChangeInfo;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        zVar.f44854d.setTranslationX(0.0f);
        zVar.f44854d.setTranslationY(0.0f);
        mo17319h(zVar);
        return true;
    }

    /* renamed from: G */
    public final void mo106289G(RecyclerView.C16631z zVar) {
        if (f222945s == null) {
            f222945s = new ValueAnimator().getInterpolator();
        }
        zVar.f44854d.animate().setInterpolator(f222945s);
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
        int size = this.f222948j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.f222948j.get(size).f222969a == zVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                mo91175w(zVar);
                this.f222948j.remove(size);
            }
        }
        mo106287E(this.f222949k, zVar);
        if (this.f222946h.remove(zVar)) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(1.0f));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            mo91176x(zVar);
        }
        if (this.f222947i.remove(zVar)) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(Float.valueOf(1.0f));
            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            mo17319h(zVar);
        }
        int size2 = this.f222952n.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList = this.f222952n.get(size2);
            mo106287E(arrayList, zVar);
            if (arrayList.isEmpty()) {
                this.f222952n.remove(size2);
            }
        }
        int size3 = this.f222951m.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList arrayList2 = this.f222951m.get(size3);
            int size4 = arrayList2.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                } else if (((C76084e) arrayList2.get(size4)).f222969a == zVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    mo91175w(zVar);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f222951m.remove(size3);
                    }
                }
            }
        }
        for (int size5 = this.f222950l.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = this.f222950l.get(size5);
            if (arrayList3.remove(zVar)) {
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(Float.valueOf(1.0f));
                C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                mo17319h(zVar);
                if (arrayList3.isEmpty()) {
                    this.f222950l.remove(size5);
                }
            }
        }
        this.f222955q.remove(zVar);
        this.f222953o.remove(zVar);
        this.f222956r.remove(zVar);
        this.f222954p.remove(zVar);
        mo106286D();
    }

    /* renamed from: k */
    public void mo17322k() {
        float f;
        int size = this.f222948j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C76084e eVar = this.f222948j.get(size);
            View view = eVar.f222969a.f44854d;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            mo91175w(eVar.f222969a);
            this.f222948j.remove(size);
        }
        int size2 = this.f222946h.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            mo91176x(this.f222946h.get(size2));
            this.f222946h.remove(size2);
        }
        int size3 = this.f222947i.size();
        while (true) {
            size3--;
            f = 1.0f;
            if (size3 < 0) {
                break;
            }
            RecyclerView.C16631z zVar = this.f222947i.get(size3);
            View view2 = zVar.f44854d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(1.0f));
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            mo17319h(zVar);
            this.f222947i.remove(size3);
        }
        int size4 = this.f222949k.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            C76083d dVar = this.f222949k.get(size4);
            RecyclerView.C16631z zVar2 = dVar.f222963a;
            if (zVar2 != null) {
                mo106288F(dVar, zVar2);
            }
            RecyclerView.C16631z zVar3 = dVar.f222964b;
            if (zVar3 != null) {
                mo106288F(dVar, zVar3);
            }
        }
        this.f222949k.clear();
        if (mo17325n()) {
            int size5 = this.f222951m.size();
            while (true) {
                size5--;
                if (size5 < 0) {
                    break;
                }
                ArrayList arrayList = this.f222951m.get(size5);
                int size6 = arrayList.size();
                while (true) {
                    size6--;
                    if (size6 >= 0) {
                        C76084e eVar2 = (C76084e) arrayList.get(size6);
                        View view4 = eVar2.f222969a.f44854d;
                        view4.setTranslationY(0.0f);
                        view4.setTranslationX(0.0f);
                        mo91175w(eVar2.f222969a);
                        arrayList.remove(size6);
                        if (arrayList.isEmpty()) {
                            this.f222951m.remove(arrayList);
                        }
                    }
                }
            }
            int size7 = this.f222950l.size() - 1;
            while (size7 >= 0) {
                ArrayList arrayList2 = this.f222950l.get(size7);
                int size8 = arrayList2.size() - 1;
                while (size8 >= 0) {
                    RecyclerView.C16631z zVar4 = (RecyclerView.C16631z) arrayList2.get(size8);
                    View view5 = zVar4.f44854d;
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(Float.valueOf(f));
                    View view6 = view5;
                    C117292a.m165358d(view6, aVar2.mo10232b(), "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view5.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                    C117292a.m165359e(view6, "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    mo17319h(zVar4);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f222950l.remove(arrayList2);
                    }
                    size8--;
                    f = 1.0f;
                }
                size7--;
                f = 1.0f;
            }
            int size9 = this.f222952n.size();
            while (true) {
                size9--;
                if (size9 >= 0) {
                    ArrayList arrayList3 = this.f222952n.get(size9);
                    int size10 = arrayList3.size();
                    while (true) {
                        size10--;
                        if (size10 >= 0) {
                            C76083d dVar2 = (C76083d) arrayList3.get(size10);
                            RecyclerView.C16631z zVar5 = dVar2.f222963a;
                            if (zVar5 != null) {
                                mo106288F(dVar2, zVar5);
                            }
                            RecyclerView.C16631z zVar6 = dVar2.f222964b;
                            if (zVar6 != null) {
                                mo106288F(dVar2, zVar6);
                            }
                            if (arrayList3.isEmpty()) {
                                this.f222952n.remove(arrayList3);
                            }
                        }
                    }
                } else {
                    mo106285C(this.f222955q);
                    mo106285C(this.f222954p);
                    mo106285C(this.f222953o);
                    mo106285C(this.f222956r);
                    mo17320i();
                    return;
                }
            }
        }
    }

    /* renamed from: n */
    public boolean mo17325n() {
        return !this.f222947i.isEmpty() || !this.f222949k.isEmpty() || !this.f222948j.isEmpty() || !this.f222946h.isEmpty() || !this.f222954p.isEmpty() || !this.f222955q.isEmpty() || !this.f222953o.isEmpty() || !this.f222956r.isEmpty() || !this.f222951m.isEmpty() || !this.f222950l.isEmpty() || !this.f222952n.isEmpty();
    }

    /* renamed from: r */
    public void mo17329r() {
        long j;
        boolean z = !this.f222946h.isEmpty();
        boolean z2 = !this.f222948j.isEmpty();
        boolean z3 = !this.f222949k.isEmpty();
        boolean z4 = !this.f222947i.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.C16631z> it = this.f222946h.iterator();
            while (true) {
                j = 0;
                if (!it.hasNext()) {
                    break;
                }
                RecyclerView.C16631z next = it.next();
                View view = next.f44854d;
                ViewPropertyAnimator animate = view.animate();
                this.f222955q.add(next);
                animate.setDuration(0).alpha(0.0f).setListener(new C76085f(this, next, animate, view)).start();
            }
            this.f222946h.clear();
            if (z2) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f222948j);
                this.f222951m.add(arrayList);
                this.f222948j.clear();
                C76080a aVar = new C76080a(arrayList);
                if (z) {
                    View view2 = ((C76084e) arrayList.get(0)).f222969a.f44854d;
                    long j2 = this.f44808d;
                    WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                    C107207u.C107208b.m145186n(view2, aVar, j2);
                } else {
                    aVar.run();
                }
            }
            if (z3) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f222949k);
                this.f222952n.add(arrayList2);
                this.f222949k.clear();
                C76081b bVar = new C76081b(arrayList2);
                if (z) {
                    View view3 = ((C76083d) arrayList2.get(0)).f222963a.f44854d;
                    long j3 = this.f44808d;
                    WeakHashMap<View, C107168a0> weakHashMap2 = C107207u.f320808a;
                    C107207u.C107208b.m145186n(view3, bVar, j3);
                } else {
                    bVar.run();
                }
            }
            if (z4) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f222947i);
                this.f222950l.add(arrayList3);
                this.f222947i.clear();
                C76082c cVar = new C76082c(arrayList3);
                if (z || z2 || z3) {
                    long j4 = z ? this.f44808d : 0;
                    long j5 = z2 ? this.f44809e : 0;
                    if (z3) {
                        j = this.f44810f;
                    }
                    long max = j4 + Math.max(j5, j);
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
        mo106289G(zVar);
        View view = zVar.f44854d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(0.0f));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppItemAnimator", "animateAdd", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppItemAnimator", "animateAdd", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        zVar.f44854d.setScaleX(0.75f);
        zVar.f44854d.setScaleY(0.75f);
        this.f222947i.add(zVar);
        return true;
    }

    /* renamed from: t */
    public boolean mo75018t(RecyclerView.C16631z zVar, RecyclerView.C16631z zVar2, int i, int i2, int i3, int i4) {
        RecyclerView.C16631z zVar3 = zVar;
        RecyclerView.C16631z zVar4 = zVar2;
        Log.m105925i("MicroMsg.AppBrandDesktopSectionWeAppItemAnimator", "alvinluo animateChange lastPos: %d", Integer.valueOf(zVar.mo17363j()));
        if (zVar3 == zVar4) {
            return mo75019u(zVar, i, i2, i3, i4);
        }
        float translationX = zVar3.f44854d.getTranslationX();
        float translationY = zVar3.f44854d.getTranslationY();
        float alpha = zVar3.f44854d.getAlpha();
        mo106289G(zVar);
        int i5 = (int) (((float) (i3 - i)) - translationX);
        int i6 = (int) (((float) (i4 - i2)) - translationY);
        zVar3.f44854d.setTranslationX(translationX);
        zVar3.f44854d.setTranslationY(translationY);
        View view = zVar3.f44854d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(alpha));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppItemAnimator", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppItemAnimator", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        if (zVar4 != null) {
            mo106289G(zVar4);
            zVar4.f44854d.setTranslationX((float) (-i5));
            zVar4.f44854d.setTranslationY((float) (-i6));
            View view3 = zVar4.f44854d;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(Float.valueOf(0.0f));
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppItemAnimator", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppItemAnimator", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        this.f222949k.add(new C76083d(zVar, zVar2, i, i2, i3, i4));
        return true;
    }

    /* renamed from: u */
    public boolean mo75019u(RecyclerView.C16631z zVar, int i, int i2, int i3, int i4) {
        View view = zVar.f44854d;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) zVar.f44854d.getTranslationY());
        mo106289G(zVar);
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
        this.f222948j.add(new C76084e(zVar, translationX, translationY, i3, i4));
        return true;
    }

    /* renamed from: v */
    public boolean mo75020v(RecyclerView.C16631z zVar) {
        Log.m105925i("MicroMsg.AppBrandDesktopSectionWeAppItemAnimator", "alvinluo animateRemove %d", Integer.valueOf(zVar.mo17363j()));
        mo106289G(zVar);
        View view = zVar.f44854d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(0.0f));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppItemAnimator", "animateRemove", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppItemAnimator", "animateRemove", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f222946h.add(zVar);
        return true;
    }
}
