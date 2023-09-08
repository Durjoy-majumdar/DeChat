package com.tencent.p014mm.plugin.appbrand.p026ui.recents;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.recyclerview.widget.C54234f;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.appbrand.p026ui.recents.AppBrandLauncherRecentsList;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import k20.C60958c;
import k20.C9556a;
import p849e3.C107168a0;
import p849e3.C107173b0;
import p849e3.C107175c0;
import p849e3.C107207u;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.e0 */
public final class C104801e0 extends C54234f {

    /* renamed from: A */
    public final ArrayList<RecyclerView.C16631z> f311265A;

    /* renamed from: B */
    public final ArrayList<AppBrandLauncherRecentsList.C84609n> f311266B;

    /* renamed from: C */
    public final ArrayList<AppBrandLauncherRecentsList.C84609n> f311267C;

    /* renamed from: D */
    public final ArrayList<AppBrandLauncherRecentsList.C84609n> f311268D;

    /* renamed from: E */
    public final ArrayList<AppBrandLauncherRecentsList.C84609n> f311269E;

    /* renamed from: F */
    public final ArrayList<C104812k> f311270F;

    /* renamed from: G */
    public final ArrayList<AppBrandLauncherRecentsList.C84609n> f311271G;

    /* renamed from: H */
    public final ArrayList<RecyclerView.C16631z> f311272H;

    /* renamed from: I */
    public final ArrayList<AppBrandLauncherRecentsList.C84609n> f311273I;

    /* renamed from: J */
    public final ArrayList<AppBrandLauncherRecentsList.C84609n> f311274J;

    /* renamed from: K */
    public final ArrayList<AppBrandLauncherRecentsList.C84609n> f311275K;

    /* renamed from: L */
    public boolean f311276L;

    /* renamed from: t */
    public boolean f311277t = false;

    /* renamed from: u */
    public boolean f311278u = true;

    /* renamed from: v */
    public final RecyclerView.C16616j.C16618a f311279v = new C104802a();

    /* renamed from: w */
    public final Set<RecyclerView.C16616j.C16618a> f311280w = new HashSet();

    /* renamed from: x */
    public final ArrayList<C104808g> f311281x;

    /* renamed from: y */
    public final ArrayList<RecyclerView.C16631z> f311282y;

    /* renamed from: z */
    public final ArrayList<C104810i> f311283z;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.e0$a */
    public class C104802a implements RecyclerView.C16616j.C16618a {
        public C104802a() {
        }

        /* renamed from: a */
        public void mo17330a() {
            synchronized (C104801e0.this.f311280w) {
                Iterator it = new HashSet(C104801e0.this.f311280w).iterator();
                while (it.hasNext()) {
                    ((RecyclerView.C16616j.C16618a) it.next()).mo17330a();
                }
            }
            C104801e0.this.f311276L = false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.e0$b */
    public class C104803b extends C107175c0 {

        /* renamed from: a */
        public final /* synthetic */ AppBrandLauncherRecentsList.C84609n f311285a;

        /* renamed from: b */
        public final /* synthetic */ C107168a0 f311286b;

        public C104803b(AppBrandLauncherRecentsList.C84609n nVar, C107168a0 a0Var) {
            this.f311285a = nVar;
            this.f311286b = a0Var;
        }

        /* renamed from: a */
        public void mo143420a(View view) {
            this.f311286b.mo157608d((C107173b0) null);
            C104801e0.this.mo17319h(this.f311285a);
            C104801e0.this.f311267C.remove(this.f311285a);
            C104801e0 e0Var = C104801e0.this;
            if (!e0Var.mo17325n()) {
                e0Var.mo17320i();
            }
        }

        /* renamed from: b */
        public void mo143457b(View view) {
            C104801e0.this.getClass();
        }

        /* renamed from: c */
        public void mo144304c(View view) {
            if (view != null) {
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                view.setTranslationY(0.0f);
                C107207u.m145169j(view, 1.0f);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.e0$c */
    public class C104804c extends C107175c0 {

        /* renamed from: a */
        public final /* synthetic */ AppBrandLauncherRecentsList.C84609n f311288a;

        public C104804c(AppBrandLauncherRecentsList.C84609n nVar) {
            this.f311288a = nVar;
        }

        /* renamed from: a */
        public void mo143420a(View view) {
            View view2 = this.f311288a.f246881F;
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            view2.setScaleX(1.0f);
            this.f311288a.f246881F.setScaleY(1.0f);
            C107207u.m145169j(this.f311288a.f246881F, 1.0f);
            View view3 = this.f311288a.f246881F;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/recents/RecentsItemAnimator$5", "onAnimationEnd", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/appbrand/ui/recents/RecentsItemAnimator$5", "onAnimationEnd", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C104801e0.this.mo17319h(this.f311288a);
            C104801e0.this.f311269E.remove(this.f311288a);
            C104801e0 e0Var = C104801e0.this;
            if (!e0Var.mo17325n()) {
                e0Var.mo17320i();
            }
        }

        /* renamed from: b */
        public void mo143457b(View view) {
            C104801e0.this.getClass();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.e0$d */
    public class C104805d extends C107175c0 {

        /* renamed from: a */
        public final /* synthetic */ AppBrandLauncherRecentsList.C84609n f311290a;

        public C104805d(AppBrandLauncherRecentsList.C84609n nVar) {
            this.f311290a = nVar;
        }

        /* renamed from: a */
        public void mo143420a(View view) {
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            view.setTranslationY(0.0f);
            C107207u.m145169j(view, 1.0f);
            C104801e0.this.mo91176x(this.f311290a);
            C104801e0.this.f311271G.remove(this.f311290a);
            C104801e0 e0Var = C104801e0.this;
            if (!e0Var.mo17325n()) {
                e0Var.mo17320i();
            }
        }

        /* renamed from: b */
        public void mo143457b(View view) {
            C104801e0.this.mo91174B(this.f311290a);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.e0$e */
    public class C104806e implements Runnable {
        public C104806e() {
        }

        public void run() {
            Iterator<AppBrandLauncherRecentsList.C84609n> it = C104801e0.this.f311274J.iterator();
            while (it.hasNext()) {
                AppBrandLauncherRecentsList.C84609n next = it.next();
                C104801e0 e0Var = C104801e0.this;
                e0Var.getClass();
                C107168a0 a = C107207u.m145160a(next.f44854d);
                e0Var.f311275K.add(next);
                a.mo157611g(0.0f);
                a.mo157607c(e0Var.f44809e);
                a.mo157608d(new C104814f0(e0Var, next, a));
                a.mo157610f();
            }
            C104801e0.this.f311274J.clear();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.e0$f */
    public static class C104807f extends RecyclerView.C16616j.C16619c {
        public C104807f(C104802a aVar) {
        }

        /* renamed from: a */
        public final RecyclerView.C16616j.C16619c mo17331a(RecyclerView.C16631z zVar, int i) {
            super.mo17331a(zVar, i);
            this.f44814d = i;
            return this;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.e0$g */
    public static final class C104808g extends C104813l {
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.e0$h */
    public static final class C104809h extends C104807f {
        public C104809h(C104802a aVar) {
            super((C104802a) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.e0$i */
    public static final class C104810i extends C104813l {
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.e0$j */
    public static final class C104811j extends C104807f {
        public C104811j(C104802a aVar) {
            super((C104802a) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.e0$k */
    public static class C104812k {

        /* renamed from: a */
        public AppBrandLauncherRecentsList.C84609n f311293a;

        public C104812k(AppBrandLauncherRecentsList.C84609n nVar, int i, int i2, C104802a aVar) {
            this.f311293a = nVar;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.e0$l */
    public static class C104813l {
    }

    public C104801e0() {
        new AccelerateDecelerateInterpolator();
        this.f311281x = new ArrayList<>();
        this.f311282y = new ArrayList<>();
        this.f311283z = new ArrayList<>();
        this.f311265A = new ArrayList<>();
        this.f311266B = new ArrayList<>();
        this.f311267C = new ArrayList<>();
        this.f311268D = new ArrayList<>();
        this.f311269E = new ArrayList<>();
        this.f311270F = new ArrayList<>();
        this.f311271G = new ArrayList<>();
        this.f311272H = new ArrayList<>();
        this.f311273I = new ArrayList<>();
        this.f311274J = new ArrayList<>();
        this.f311275K = new ArrayList<>();
        this.f311276L = false;
    }

    /* renamed from: G */
    private void m140448G(RecyclerView.C16631z zVar) {
        zVar.f44854d.animate().setInterpolator(new ValueAnimator().getInterpolator());
        mo17321j(zVar);
        View view = zVar.f44854d;
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        view.setTranslationY(0.0f);
        C107207u.m145169j(zVar.f44854d, 1.0f);
    }

    /* renamed from: B */
    public void mo91174B(RecyclerView.C16631z zVar) {
        if (!this.f311271G.contains(zVar)) {
            this.f311276L = true;
        }
    }

    /* renamed from: H */
    public void mo148686H(RecyclerView.C16616j.C16618a aVar) {
        if (aVar != null) {
            synchronized (this.f311280w) {
                ((HashSet) this.f311280w).add(aVar);
            }
        }
    }

    /* renamed from: I */
    public void mo148687I(RecyclerView.C16616j.C16618a aVar) {
        if (aVar != null) {
            synchronized (this.f311280w) {
                ((HashSet) this.f311280w).remove(aVar);
            }
        }
    }

    /* renamed from: a */
    public boolean mo17313a(RecyclerView.C16631z zVar, RecyclerView.C16616j.C16619c cVar, RecyclerView.C16616j.C16619c cVar2) {
        int i;
        int i2;
        if (!this.f311278u) {
            m140448G(zVar);
            mo17319h(zVar);
            return false;
        } else if (cVar == null || ((i = cVar.f44811a) == (i2 = cVar2.f44811a) && cVar.f44812b == cVar2.f44812b)) {
            if (this.f311277t && (zVar.f44854d.getParent() instanceof RecyclerView) && (zVar instanceof AppBrandLauncherRecentsList.C84609n)) {
                RecyclerView recyclerView = (RecyclerView) zVar.f44854d.getParent();
                if (recyclerView.getHeight() > 0) {
                    if (cVar2.f44813c >= recyclerView.getHeight()) {
                        AppBrandLauncherRecentsList.C84609n nVar = (AppBrandLauncherRecentsList.C84609n) zVar;
                        View view = nVar.f44854d;
                        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                        view.setTranslationY((float) view.getHeight());
                        this.f311273I.add(nVar);
                        return true;
                    } else if (cVar2.f44812b <= 0) {
                        AppBrandLauncherRecentsList.C84609n nVar2 = (AppBrandLauncherRecentsList.C84609n) zVar;
                        View view2 = nVar2.f44854d;
                        WeakHashMap<View, C107168a0> weakHashMap2 = C107207u.f320808a;
                        view2.setTranslationY((float) (-view2.getHeight()));
                        this.f311273I.add(nVar2);
                        return true;
                    }
                }
            }
            m140448G(zVar);
            mo17319h(zVar);
            return false;
        } else {
            return super.mo75019u(zVar, i, cVar.f44812b, i2, cVar2.f44812b);
        }
    }

    /* renamed from: b */
    public boolean mo17314b(RecyclerView.C16631z zVar, RecyclerView.C16631z zVar2, RecyclerView.C16616j.C16619c cVar, RecyclerView.C16616j.C16619c cVar2) {
        if (this.f311278u) {
            return super.mo17314b(zVar, zVar2, cVar, cVar2);
        }
        mo17319h(zVar);
        mo17319h(zVar2);
        return false;
    }

    /* renamed from: c */
    public boolean mo17315c(RecyclerView.C16631z zVar, RecyclerView.C16616j.C16619c cVar, RecyclerView.C16616j.C16619c cVar2) {
        boolean z = false;
        if (!this.f311278u) {
            m140448G(zVar);
            mo91176x(zVar);
            return false;
        } else if (cVar instanceof C104809h) {
            m140448G(zVar);
            return true;
        } else if (cVar instanceof C104811j) {
            m140448G(zVar);
            return true;
        } else {
            if ((cVar.f44814d & 2048) > 0 && (zVar instanceof AppBrandLauncherRecentsList.C84609n) && cVar2 == null) {
                try {
                    z = ((AppBrandLauncherRecentsList.C84609n) zVar).mo117305y().f239036y;
                } catch (Exception unused) {
                }
                if (!z) {
                    m140448G(zVar);
                    this.f311270F.add(new C104812k((AppBrandLauncherRecentsList.C84609n) zVar, cVar.f44811a, cVar.f44812b, (C104802a) null));
                    return true;
                }
            }
            return super.mo17315c(zVar, cVar, cVar2);
        }
    }

    /* renamed from: d */
    public boolean mo17316d(RecyclerView.C16631z zVar, RecyclerView.C16616j.C16619c cVar, RecyclerView.C16616j.C16619c cVar2) {
        if (this.f311278u) {
            return super.mo17316d(zVar, cVar, cVar2);
        }
        m140448G(zVar);
        mo91175w(zVar);
        return false;
    }

    /* renamed from: g */
    public boolean mo17318g(RecyclerView.C16631z zVar, List<Object> list) {
        return (zVar instanceof AppBrandLauncherRecentsList.C84609n) || super.mo17318g(zVar, list);
    }

    /* renamed from: j */
    public void mo17321j(RecyclerView.C16631z zVar) {
        if ((zVar instanceof AppBrandLauncherRecentsList.C84609n) && this.f311273I.remove(zVar)) {
            View view = zVar.f44854d;
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            view.setTranslationY(0.0f);
            mo17319h(zVar);
        }
        super.mo17321j(zVar);
    }

    /* renamed from: n */
    public boolean mo17325n() {
        return !this.f311281x.isEmpty() || !this.f311282y.isEmpty() || !this.f311283z.isEmpty() || !this.f311265A.isEmpty() || !this.f311266B.isEmpty() || !this.f311267C.isEmpty() || !this.f311268D.isEmpty() || !this.f311269E.isEmpty() || !this.f311270F.isEmpty() || !this.f311271G.isEmpty() || !this.f311273I.isEmpty() || !this.f311274J.isEmpty() || !this.f311275K.isEmpty() || super.mo17325n();
    }

    /* renamed from: p */
    public void mo17327p(RecyclerView.C16631z zVar) {
        ViewParent parent = zVar.f44854d.getParent();
        if (parent instanceof RecentsRecyclerView) {
            RecentsRecyclerView recentsRecyclerView = (RecentsRecyclerView) parent;
            View view = zVar.f44854d;
            recentsRecyclerView.getClass();
            if (view.getParent() == recentsRecyclerView) {
                view.setZ(0.0f);
            }
        }
    }

    /* renamed from: q */
    public RecyclerView.C16616j.C16619c mo17328q(RecyclerView.C16628w wVar, RecyclerView.C16631z zVar, int i, List<Object> list) {
        if ((i & 2) > 0) {
            for (Object next : list) {
                if (next instanceof Bundle) {
                    Boolean bool = (Boolean) ((Bundle) next).get("star");
                    if (bool != null && bool.booleanValue()) {
                        C104809h hVar = new C104809h((C104802a) null);
                        hVar.mo17331a(zVar, i);
                        return hVar;
                    } else if (bool != null && !bool.booleanValue()) {
                        C104811j jVar = new C104811j((C104802a) null);
                        jVar.mo17331a(zVar, i);
                        return jVar;
                    }
                }
            }
        }
        RecyclerView.C16616j.C16619c cVar = new RecyclerView.C16616j.C16619c();
        cVar.mo17331a(zVar, 0);
        cVar.f44814d = i;
        return cVar;
    }

    /* renamed from: r */
    public void mo17329r() {
        float f;
        mo17326o(this.f311279v);
        if (!this.f311281x.isEmpty()) {
            Iterator<C104808g> it = this.f311281x.iterator();
            if (!it.hasNext()) {
                this.f311281x.clear();
            } else {
                ArrayList<RecyclerView.C16631z> arrayList = this.f311282y;
                it.next().getClass();
                arrayList.add((Object) null);
                throw null;
            }
        }
        if (!this.f311283z.isEmpty()) {
            Iterator<C104810i> it4 = this.f311283z.iterator();
            if (!it4.hasNext()) {
                this.f311283z.clear();
            } else {
                ArrayList<RecyclerView.C16631z> arrayList2 = this.f311265A;
                it4.next().getClass();
                arrayList2.add((Object) null);
                throw null;
            }
        }
        float f2 = 0.1f;
        if (!this.f311266B.isEmpty()) {
            Iterator<AppBrandLauncherRecentsList.C84609n> it5 = this.f311266B.iterator();
            while (it5.hasNext()) {
                AppBrandLauncherRecentsList.C84609n next = it5.next();
                this.f311267C.add(next);
                View view = next.f246881F;
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                view.setScaleX(f2);
                next.f246881F.setScaleY(f2);
                C107207u.m145169j(next.f246881F, 0.0f);
                View view2 = next.f246881F;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view3 = view2;
                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/recents/RecentsItemAnimator", "runPendingAnimations", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/appbrand/ui/recents/RecentsItemAnimator", "runPendingAnimations", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C107168a0 a = C107207u.m145160a(next.f246881F);
                a.mo157607c(this.f44810f);
                a.mo157608d(new C104803b(next, a));
                a.mo157605a(1.0f);
                View view4 = a.f320755a.get();
                if (view4 != null) {
                    view4.animate().scaleX(1.0f);
                }
                View view5 = a.f320755a.get();
                if (view5 != null) {
                    view5.animate().scaleY(1.0f);
                }
                a.mo157610f();
                f2 = 0.1f;
            }
            this.f311266B.clear();
        }
        if (!this.f311268D.isEmpty()) {
            Iterator<AppBrandLauncherRecentsList.C84609n> it6 = this.f311268D.iterator();
            while (it6.hasNext()) {
                AppBrandLauncherRecentsList.C84609n next2 = it6.next();
                this.f311269E.add(next2);
                View view6 = next2.f246881F;
                WeakHashMap<View, C107168a0> weakHashMap2 = C107207u.f320808a;
                view6.setScaleX(1.0f);
                next2.f246881F.setScaleY(1.0f);
                C107207u.m145169j(next2.f246881F, 1.0f);
                View view7 = next2.f246881F;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                C117292a.m165358d(view7, aVar2.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/recents/RecentsItemAnimator", "runPendingAnimations", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view7, "com/tencent/mm/plugin/appbrand/ui/recents/RecentsItemAnimator", "runPendingAnimations", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C107168a0 a2 = C107207u.m145160a(next2.f246881F);
                a2.mo157607c(this.f44810f);
                a2.mo157608d(new C104804c(next2));
                a2.mo157605a(0.0f);
                View view8 = a2.f320755a.get();
                if (view8 != null) {
                    f = 0.1f;
                    view8.animate().scaleX(0.1f);
                } else {
                    f = 0.1f;
                }
                View view9 = a2.f320755a.get();
                if (view9 != null) {
                    view9.animate().scaleY(f);
                }
                a2.mo157610f();
            }
            this.f311268D.clear();
        }
        if (!this.f311270F.isEmpty()) {
            Iterator<C104812k> it7 = this.f311270F.iterator();
            while (it7.hasNext()) {
                C104812k next3 = it7.next();
                this.f311271G.add(next3.f311293a);
                View view10 = next3.f311293a.f44854d;
                WeakHashMap<View, C107168a0> weakHashMap3 = C107207u.f320808a;
                view10.setTranslationY(0.0f);
                C107207u.m145169j(view10, 1.0f);
                AppBrandLauncherRecentsList.C84609n nVar = next3.f311293a;
                C107168a0 a3 = C107207u.m145160a(view10);
                a3.mo157607c(this.f44809e);
                a3.mo157608d(new C104805d(nVar));
                a3.mo157605a(0.0f);
                a3.mo157611g((float) (-view10.getHeight()));
                a3.mo157610f();
            }
            this.f311270F.clear();
        }
        super.mo17329r();
        if (!this.f311273I.isEmpty()) {
            this.f311274J.addAll(this.f311273I);
            C104806e eVar = new C104806e();
            this.f311273I.clear();
            if (this.f311276L) {
                View view11 = this.f311274J.get(0).f44854d;
                long j = this.f44808d;
                WeakHashMap<View, C107168a0> weakHashMap4 = C107207u.f320808a;
                C107207u.C107208b.m145186n(view11, eVar, j);
                return;
            }
            eVar.run();
        }
    }

    /* renamed from: s */
    public boolean mo75017s(RecyclerView.C16631z zVar) {
        m140448G(zVar);
        mo17319h(zVar);
        return false;
    }

    /* renamed from: t */
    public boolean mo75018t(RecyclerView.C16631z zVar, RecyclerView.C16631z zVar2, int i, int i2, int i3, int i4) {
        C107207u.m145160a(zVar.f44854d);
        C107207u.m145160a(zVar2.f44854d);
        mo17319h(zVar);
        mo17319h(zVar2);
        return false;
    }

    /* renamed from: u */
    public boolean mo75019u(RecyclerView.C16631z zVar, int i, int i2, int i3, int i4) {
        if (this.f311278u) {
            return super.mo75019u(zVar, i, i2, i3, i4);
        }
        m140448G(zVar);
        mo91175w(zVar);
        return false;
    }

    /* renamed from: v */
    public boolean mo75020v(RecyclerView.C16631z zVar) {
        if (!this.f311278u) {
            m140448G(zVar);
            mo91176x(zVar);
            return false;
        }
        super.mo75020v(zVar);
        return true;
    }

    /* renamed from: y */
    public void mo91177y(RecyclerView.C16631z zVar) {
        if (this.f311272H.contains(zVar)) {
            this.f311272H.remove(zVar);
            RecentsRecyclerView recentsRecyclerView = (RecentsRecyclerView) zVar.f44854d.getParent();
            View view = zVar.f44854d;
            recentsRecyclerView.getClass();
            if (view.getParent() == recentsRecyclerView) {
                view.setZ(0.0f);
            }
        }
    }

    /* renamed from: z */
    public void mo91178z(RecyclerView.C16631z zVar) {
        if (this.f311272H.contains(zVar)) {
            RecentsRecyclerView recentsRecyclerView = (RecentsRecyclerView) zVar.f44854d.getParent();
            View view = zVar.f44854d;
            recentsRecyclerView.getClass();
            if (view.getParent() == recentsRecyclerView) {
                view.setZ(1.0f);
            }
        }
    }
}
