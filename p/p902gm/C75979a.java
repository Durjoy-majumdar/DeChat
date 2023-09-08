package p902gm;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
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

/* renamed from: gm.a */
public class C75979a extends C67092e0 {

    /* renamed from: s */
    public static TimeInterpolator f222779s;

    /* renamed from: h */
    public ArrayList<RecyclerView.C16631z> f222780h = new ArrayList<>();

    /* renamed from: i */
    public ArrayList<RecyclerView.C16631z> f222781i = new ArrayList<>();

    /* renamed from: j */
    public ArrayList<C75986g> f222782j = new ArrayList<>();

    /* renamed from: k */
    public ArrayList<C75985f> f222783k = new ArrayList<>();

    /* renamed from: l */
    public ArrayList<ArrayList<RecyclerView.C16631z>> f222784l = new ArrayList<>();

    /* renamed from: m */
    public ArrayList<ArrayList<C75986g>> f222785m = new ArrayList<>();

    /* renamed from: n */
    public ArrayList<ArrayList<C75985f>> f222786n = new ArrayList<>();

    /* renamed from: o */
    public ArrayList<RecyclerView.C16631z> f222787o = new ArrayList<>();

    /* renamed from: p */
    public ArrayList<RecyclerView.C16631z> f222788p = new ArrayList<>();

    /* renamed from: q */
    public ArrayList<RecyclerView.C16631z> f222789q = new ArrayList<>();

    /* renamed from: r */
    public ArrayList<RecyclerView.C16631z> f222790r = new ArrayList<>();

    /* renamed from: gm.a$a */
    public class C75980a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ArrayList f222791d;

        public C75980a(ArrayList arrayList) {
            this.f222791d = arrayList;
        }

        public void run() {
            Iterator it = this.f222791d.iterator();
            while (it.hasNext()) {
                C75986g gVar = (C75986g) it.next();
                C75979a aVar = C75979a.this;
                RecyclerView.C16631z zVar = gVar.f222811a;
                int i = gVar.f222812b;
                int i2 = gVar.f222813c;
                int i3 = gVar.f222814d;
                int i4 = gVar.f222815e;
                aVar.getClass();
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
                aVar.f222788p.add(zVar);
                animate.setDuration(aVar.f44809e).setListener(new C75987b(aVar, zVar, i5, view, i6, animate)).start();
            }
            this.f222791d.clear();
            C75979a.this.f222785m.remove(this.f222791d);
        }
    }

    /* renamed from: gm.a$b */
    public class C75981b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ArrayList f222793d;

        public C75981b(ArrayList arrayList) {
            this.f222793d = arrayList;
        }

        public void run() {
            Iterator it = this.f222793d.iterator();
            while (it.hasNext()) {
                C75985f fVar = (C75985f) it.next();
                C75979a aVar = C75979a.this;
                aVar.getClass();
                RecyclerView.C16631z zVar = fVar.f222805a;
                View view = null;
                View view2 = zVar == null ? null : zVar.f44854d;
                RecyclerView.C16631z zVar2 = fVar.f222806b;
                if (zVar2 != null) {
                    view = zVar2.f44854d;
                }
                if (view2 != null) {
                    ViewPropertyAnimator duration = view2.animate().setDuration(aVar.f44810f);
                    aVar.f222790r.add(fVar.f222805a);
                    duration.translationX((float) (fVar.f222809e - fVar.f222807c));
                    duration.translationY((float) (fVar.f222810f - fVar.f222808d));
                    duration.alpha(0.0f).setListener(new C75988c(aVar, fVar, duration, view2)).start();
                }
                if (view != null) {
                    ViewPropertyAnimator animate = view.animate();
                    aVar.f222790r.add(fVar.f222806b);
                    animate.translationX(0.0f).translationY(0.0f).setDuration(aVar.f44810f).alpha(1.0f).setListener(new C75989d(aVar, fVar, animate, view)).start();
                }
            }
            this.f222793d.clear();
            C75979a.this.f222786n.remove(this.f222793d);
        }
    }

    /* renamed from: gm.a$c */
    public class C75982c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ArrayList f222795d;

        public C75982c(ArrayList arrayList) {
            this.f222795d = arrayList;
        }

        public void run() {
            Iterator it = this.f222795d.iterator();
            while (it.hasNext()) {
                C75979a.this.mo106197C((RecyclerView.C16631z) it.next());
            }
            this.f222795d.clear();
            C75979a.this.f222784l.remove(this.f222795d);
        }
    }

    /* renamed from: gm.a$d */
    public class C75983d extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ RecyclerView.C16631z f222797d;

        /* renamed from: e */
        public final /* synthetic */ ViewPropertyAnimator f222798e;

        /* renamed from: f */
        public final /* synthetic */ View f222799f;

        public C75983d(RecyclerView.C16631z zVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f222797d = zVar;
            this.f222798e = viewPropertyAnimator;
            this.f222799f = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f222798e.setListener((Animator.AnimatorListener) null);
            View view = this.f222799f;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(1.0f));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/feature/anim/DefaultItemAnimator$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/feature/anim/DefaultItemAnimator$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            C75979a.this.mo91176x(this.f222797d);
            C75979a.this.f222789q.remove(this.f222797d);
            C75979a.this.mo106200F();
        }

        public void onAnimationStart(Animator animator) {
            C75979a.this.mo91174B(this.f222797d);
        }
    }

    /* renamed from: gm.a$e */
    public class C75984e extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ RecyclerView.C16631z f222801d;

        /* renamed from: e */
        public final /* synthetic */ View f222802e;

        /* renamed from: f */
        public final /* synthetic */ ViewPropertyAnimator f222803f;

        public C75984e(RecyclerView.C16631z zVar, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f222801d = zVar;
            this.f222802e = view;
            this.f222803f = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            View view = this.f222802e;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(1.0f));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/feature/anim/DefaultItemAnimator$5", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/feature/anim/DefaultItemAnimator$5", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }

        public void onAnimationEnd(Animator animator) {
            this.f222803f.setListener((Animator.AnimatorListener) null);
            C75979a.this.mo17319h(this.f222801d);
            C75979a.this.f222787o.remove(this.f222801d);
            C75979a.this.mo106200F();
        }

        public void onAnimationStart(Animator animator) {
            C75979a.this.getClass();
        }
    }

    /* renamed from: gm.a$f */
    public static class C75985f {

        /* renamed from: a */
        public RecyclerView.C16631z f222805a;

        /* renamed from: b */
        public RecyclerView.C16631z f222806b;

        /* renamed from: c */
        public int f222807c;

        /* renamed from: d */
        public int f222808d;

        /* renamed from: e */
        public int f222809e;

        /* renamed from: f */
        public int f222810f;

        public C75985f(RecyclerView.C16631z zVar, RecyclerView.C16631z zVar2, int i, int i2, int i3, int i4) {
            this.f222805a = zVar;
            this.f222806b = zVar2;
            this.f222807c = i;
            this.f222808d = i2;
            this.f222809e = i3;
            this.f222810f = i4;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f222805a + ", newHolder=" + this.f222806b + ", fromX=" + this.f222807c + ", fromY=" + this.f222808d + ", toX=" + this.f222809e + ", toY=" + this.f222810f + '}';
        }
    }

    /* renamed from: gm.a$g */
    public static class C75986g {

        /* renamed from: a */
        public RecyclerView.C16631z f222811a;

        /* renamed from: b */
        public int f222812b;

        /* renamed from: c */
        public int f222813c;

        /* renamed from: d */
        public int f222814d;

        /* renamed from: e */
        public int f222815e;

        public C75986g(RecyclerView.C16631z zVar, int i, int i2, int i3, int i4) {
            this.f222811a = zVar;
            this.f222812b = i;
            this.f222813c = i2;
            this.f222814d = i3;
            this.f222815e = i4;
        }
    }

    /* renamed from: C */
    public void mo106197C(RecyclerView.C16631z zVar) {
        View view = zVar.f44854d;
        ViewPropertyAnimator animate = view.animate();
        this.f222787o.add(zVar);
        animate.alpha(1.0f).setDuration(mo17323l()).setListener(new C75984e(zVar, view, animate)).start();
    }

    /* renamed from: D */
    public void mo106198D(RecyclerView.C16631z zVar) {
        View view = zVar.f44854d;
        ViewPropertyAnimator animate = view.animate();
        this.f222789q.add(zVar);
        animate.setDuration(mo17324m()).alpha(0.0f).setListener(new C75983d(zVar, animate, view)).start();
    }

    /* renamed from: E */
    public void mo106199E(List<RecyclerView.C16631z> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).f44854d.animate().cancel();
        }
    }

    /* renamed from: F */
    public void mo106200F() {
        if (!mo17325n()) {
            mo17320i();
        }
    }

    /* renamed from: G */
    public final void mo106201G(List<C75985f> list, RecyclerView.C16631z zVar) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C75985f fVar = list.get(size);
            if (mo106202H(fVar, zVar) && fVar.f222805a == null && fVar.f222806b == null) {
                list.remove(fVar);
            }
        }
    }

    /* renamed from: H */
    public final boolean mo106202H(C75985f fVar, RecyclerView.C16631z zVar) {
        if (fVar.f222806b == zVar) {
            fVar.f222806b = null;
        } else if (fVar.f222805a != zVar) {
            return false;
        } else {
            fVar.f222805a = null;
        }
        View view = zVar.f44854d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(1.0f));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/feature/anim/DefaultItemAnimator", "endChangeAnimationIfNecessary", "(Lcom/tencent/mm/feature/anim/DefaultItemAnimator$ChangeInfo;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view2, "com/tencent/mm/feature/anim/DefaultItemAnimator", "endChangeAnimationIfNecessary", "(Lcom/tencent/mm/feature/anim/DefaultItemAnimator$ChangeInfo;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        zVar.f44854d.setTranslationX(0.0f);
        zVar.f44854d.setTranslationY(0.0f);
        mo17319h(zVar);
        return true;
    }

    /* renamed from: I */
    public long mo106203I() {
        return mo17324m();
    }

    /* renamed from: J */
    public void mo106204J(RecyclerView.C16631z zVar) {
        if (f222779s == null) {
            f222779s = new ValueAnimator().getInterpolator();
        }
        zVar.f44854d.animate().setInterpolator(f222779s);
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
        int size = this.f222782j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.f222782j.get(size).f222811a == zVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                mo91175w(zVar);
                this.f222782j.remove(size);
            }
        }
        mo106201G(this.f222783k, zVar);
        if (this.f222780h.remove(zVar)) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(1.0f));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/feature/anim/DefaultItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/feature/anim/DefaultItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            mo91176x(zVar);
        }
        if (this.f222781i.remove(zVar)) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(Float.valueOf(1.0f));
            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/feature/anim/DefaultItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/feature/anim/DefaultItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            mo17319h(zVar);
        }
        int size2 = this.f222786n.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList = this.f222786n.get(size2);
            mo106201G(arrayList, zVar);
            if (arrayList.isEmpty()) {
                this.f222786n.remove(size2);
            }
        }
        int size3 = this.f222785m.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList arrayList2 = this.f222785m.get(size3);
            int size4 = arrayList2.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                } else if (((C75986g) arrayList2.get(size4)).f222811a == zVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    mo91175w(zVar);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f222785m.remove(size3);
                    }
                }
            }
        }
        for (int size5 = this.f222784l.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = this.f222784l.get(size5);
            if (arrayList3.remove(zVar)) {
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(Float.valueOf(1.0f));
                C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/feature/anim/DefaultItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
                C117292a.m165359e(view, "com/tencent/mm/feature/anim/DefaultItemAnimator", "endAnimation", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                mo17319h(zVar);
                if (arrayList3.isEmpty()) {
                    this.f222784l.remove(size5);
                }
            }
        }
        this.f222789q.remove(zVar);
        this.f222787o.remove(zVar);
        this.f222790r.remove(zVar);
        this.f222788p.remove(zVar);
        mo106200F();
    }

    /* renamed from: k */
    public void mo17322k() {
        float f;
        int size = this.f222782j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C75986g gVar = this.f222782j.get(size);
            View view = gVar.f222811a.f44854d;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            mo91175w(gVar.f222811a);
            this.f222782j.remove(size);
        }
        int size2 = this.f222780h.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            mo91176x(this.f222780h.get(size2));
            this.f222780h.remove(size2);
        }
        int size3 = this.f222781i.size();
        while (true) {
            size3--;
            f = 1.0f;
            if (size3 < 0) {
                break;
            }
            RecyclerView.C16631z zVar = this.f222781i.get(size3);
            View view2 = zVar.f44854d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(1.0f));
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/feature/anim/DefaultItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view3, "com/tencent/mm/feature/anim/DefaultItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            mo17319h(zVar);
            this.f222781i.remove(size3);
        }
        int size4 = this.f222783k.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            C75985f fVar = this.f222783k.get(size4);
            RecyclerView.C16631z zVar2 = fVar.f222805a;
            if (zVar2 != null) {
                mo106202H(fVar, zVar2);
            }
            RecyclerView.C16631z zVar3 = fVar.f222806b;
            if (zVar3 != null) {
                mo106202H(fVar, zVar3);
            }
        }
        this.f222783k.clear();
        if (mo17325n()) {
            int size5 = this.f222785m.size();
            while (true) {
                size5--;
                if (size5 < 0) {
                    break;
                }
                ArrayList arrayList = this.f222785m.get(size5);
                int size6 = arrayList.size();
                while (true) {
                    size6--;
                    if (size6 >= 0) {
                        C75986g gVar2 = (C75986g) arrayList.get(size6);
                        View view4 = gVar2.f222811a.f44854d;
                        view4.setTranslationY(0.0f);
                        view4.setTranslationX(0.0f);
                        mo91175w(gVar2.f222811a);
                        arrayList.remove(size6);
                        if (arrayList.isEmpty()) {
                            this.f222785m.remove(arrayList);
                        }
                    }
                }
            }
            int size7 = this.f222784l.size() - 1;
            while (size7 >= 0) {
                ArrayList arrayList2 = this.f222784l.get(size7);
                int size8 = arrayList2.size() - 1;
                while (size8 >= 0) {
                    RecyclerView.C16631z zVar4 = (RecyclerView.C16631z) arrayList2.get(size8);
                    View view5 = zVar4.f44854d;
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(Float.valueOf(f));
                    View view6 = view5;
                    C117292a.m165358d(view6, aVar2.mo10232b(), "com/tencent/mm/feature/anim/DefaultItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view5.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                    C117292a.m165359e(view6, "com/tencent/mm/feature/anim/DefaultItemAnimator", "endAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    mo17319h(zVar4);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f222784l.remove(arrayList2);
                    }
                    size8--;
                    f = 1.0f;
                }
                size7--;
                f = 1.0f;
            }
            int size9 = this.f222786n.size();
            while (true) {
                size9--;
                if (size9 >= 0) {
                    ArrayList arrayList3 = this.f222786n.get(size9);
                    int size10 = arrayList3.size();
                    while (true) {
                        size10--;
                        if (size10 >= 0) {
                            C75985f fVar2 = (C75985f) arrayList3.get(size10);
                            RecyclerView.C16631z zVar5 = fVar2.f222805a;
                            if (zVar5 != null) {
                                mo106202H(fVar2, zVar5);
                            }
                            RecyclerView.C16631z zVar6 = fVar2.f222806b;
                            if (zVar6 != null) {
                                mo106202H(fVar2, zVar6);
                            }
                            if (arrayList3.isEmpty()) {
                                this.f222786n.remove(arrayList3);
                            }
                        }
                    }
                } else {
                    mo106199E(this.f222789q);
                    mo106199E(this.f222788p);
                    mo106199E(this.f222787o);
                    mo106199E(this.f222790r);
                    mo17320i();
                    return;
                }
            }
        }
    }

    /* renamed from: n */
    public boolean mo17325n() {
        return !this.f222781i.isEmpty() || !this.f222783k.isEmpty() || !this.f222782j.isEmpty() || !this.f222780h.isEmpty() || !this.f222788p.isEmpty() || !this.f222789q.isEmpty() || !this.f222787o.isEmpty() || !this.f222790r.isEmpty() || !this.f222785m.isEmpty() || !this.f222784l.isEmpty() || !this.f222786n.isEmpty();
    }

    /* renamed from: r */
    public void mo17329r() {
        boolean z = !this.f222780h.isEmpty();
        boolean z2 = !this.f222782j.isEmpty();
        boolean z3 = !this.f222783k.isEmpty();
        boolean z4 = !this.f222781i.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.C16631z> it = this.f222780h.iterator();
            while (it.hasNext()) {
                mo106198D(it.next());
            }
            this.f222780h.clear();
            if (z2) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f222782j);
                this.f222785m.add(arrayList);
                this.f222782j.clear();
                C75980a aVar = new C75980a(arrayList);
                if (z) {
                    View view = ((C75986g) arrayList.get(0)).f222811a.f44854d;
                    long m = mo17324m();
                    WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                    C107207u.C107208b.m145186n(view, aVar, m);
                } else {
                    aVar.run();
                }
            }
            if (z3) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f222783k);
                this.f222786n.add(arrayList2);
                this.f222783k.clear();
                C75981b bVar = new C75981b(arrayList2);
                if (z) {
                    View view2 = ((C75985f) arrayList2.get(0)).f222805a.f44854d;
                    long m2 = mo17324m();
                    WeakHashMap<View, C107168a0> weakHashMap2 = C107207u.f320808a;
                    C107207u.C107208b.m145186n(view2, bVar, m2);
                } else {
                    bVar.run();
                }
            }
            if (z4) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f222781i);
                this.f222784l.add(arrayList3);
                this.f222781i.clear();
                C75982c cVar = new C75982c(arrayList3);
                if (z || z2 || z3) {
                    View view3 = ((RecyclerView.C16631z) arrayList3.get(0)).f44854d;
                    long I = mo106203I();
                    WeakHashMap<View, C107168a0> weakHashMap3 = C107207u.f320808a;
                    C107207u.C107208b.m145186n(view3, cVar, I);
                    return;
                }
                cVar.run();
            }
        }
    }

    /* renamed from: s */
    public boolean mo75017s(RecyclerView.C16631z zVar) {
        mo106204J(zVar);
        View view = zVar.f44854d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(0.0f));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/feature/anim/DefaultItemAnimator", "animateAdd", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/feature/anim/DefaultItemAnimator", "animateAdd", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f222781i.add(zVar);
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
        mo106204J(zVar);
        int i5 = (int) (((float) (i3 - i)) - translationX);
        int i6 = (int) (((float) (i4 - i2)) - translationY);
        zVar3.f44854d.setTranslationX(translationX);
        zVar3.f44854d.setTranslationY(translationY);
        View view = zVar3.f44854d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(alpha));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/feature/anim/DefaultItemAnimator", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view2, "com/tencent/mm/feature/anim/DefaultItemAnimator", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        if (zVar4 != null) {
            mo106204J(zVar4);
            zVar4.f44854d.setTranslationX((float) (-i5));
            zVar4.f44854d.setTranslationY((float) (-i6));
            View view3 = zVar4.f44854d;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(Float.valueOf(0.0f));
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/feature/anim/DefaultItemAnimator", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view4, "com/tencent/mm/feature/anim/DefaultItemAnimator", "animateChange", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;IIII)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        this.f222783k.add(new C75985f(zVar, zVar2, i, i2, i3, i4));
        return true;
    }

    /* renamed from: u */
    public boolean mo75019u(RecyclerView.C16631z zVar, int i, int i2, int i3, int i4) {
        View view = zVar.f44854d;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) zVar.f44854d.getTranslationY());
        mo106204J(zVar);
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
        this.f222782j.add(new C75986g(zVar, translationX, translationY, i3, i4));
        return true;
    }

    /* renamed from: v */
    public boolean mo75020v(RecyclerView.C16631z zVar) {
        mo106204J(zVar);
        this.f222780h.add(zVar);
        return true;
    }
}
