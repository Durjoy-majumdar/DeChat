package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import k20.C60958c;
import k20.C9556a;
import p834a3.C112741b;
import p849e3.C107168a0;
import p849e3.C107207u;

/* renamed from: androidx.fragment.app.q0 */
public abstract class C112950q0 {

    /* renamed from: a */
    public final ViewGroup f338132a;

    /* renamed from: b */
    public final ArrayList<C112954d> f338133b = new ArrayList<>();

    /* renamed from: c */
    public final ArrayList<C112954d> f338134c = new ArrayList<>();

    /* renamed from: d */
    public boolean f338135d = false;

    /* renamed from: e */
    public boolean f338136e = false;

    /* renamed from: androidx.fragment.app.q0$a */
    public class C112951a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C112953c f338137d;

        public C112951a(C112953c cVar) {
            this.f338137d = cVar;
        }

        public void run() {
            if (C112950q0.this.f338133b.contains(this.f338137d)) {
                C112953c cVar = this.f338137d;
                cVar.f338142a.mo165245a(cVar.f338144c.mView);
            }
        }
    }

    /* renamed from: androidx.fragment.app.q0$b */
    public class C112952b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C112953c f338139d;

        public C112952b(C112953c cVar) {
            this.f338139d = cVar;
        }

        public void run() {
            C112950q0.this.f338133b.remove(this.f338139d);
            C112950q0.this.f338134c.remove(this.f338139d);
        }
    }

    /* renamed from: androidx.fragment.app.q0$c */
    public static class C112953c extends C112954d {

        /* renamed from: h */
        public final C112970z f338141h;

        public C112953c(C112954d.C112957c cVar, C112954d.C112956b bVar, C112970z zVar, C112741b bVar2) {
            super(cVar, bVar, zVar.f338187c, bVar2);
            this.f338141h = zVar;
        }

        /* renamed from: b */
        public void mo165240b() {
            super.mo165240b();
            this.f338141h.mo165284k();
        }

        /* renamed from: d */
        public void mo165241d() {
            if (this.f338143b == C112954d.C112956b.ADDING) {
                Fragment fragment = this.f338141h.f338187c;
                View findFocus = fragment.mView.findFocus();
                if (findFocus != null) {
                    fragment.setFocusedView(findFocus);
                    if (FragmentManager.isLoggingEnabled(2)) {
                        findFocus.toString();
                        fragment.toString();
                    }
                }
                View requireView = this.f338144c.requireView();
                if (requireView.getParent() == null) {
                    this.f338141h.mo165275b();
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(Float.valueOf(0.0f));
                    C117292a.m165358d(requireView, aVar.mo10232b(), "androidx/fragment/app/SpecialEffectsController$FragmentStateManagerOperation", "onStart", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    requireView.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                    C117292a.m165359e(requireView, "androidx/fragment/app/SpecialEffectsController$FragmentStateManagerOperation", "onStart", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
                if (requireView.getAlpha() == 0.0f && requireView.getVisibility() == 0) {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(4);
                    C117292a.m165358d(requireView, aVar2.mo10232b(), "androidx/fragment/app/SpecialEffectsController$FragmentStateManagerOperation", "onStart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    requireView.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(requireView, "androidx/fragment/app/SpecialEffectsController$FragmentStateManagerOperation", "onStart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                float postOnViewCreatedAlpha = fragment.getPostOnViewCreatedAlpha();
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(Float.valueOf(postOnViewCreatedAlpha));
                View view = requireView;
                C117292a.m165358d(view, aVar3.mo10232b(), "androidx/fragment/app/SpecialEffectsController$FragmentStateManagerOperation", "onStart", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                requireView.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
                C117292a.m165359e(view, "androidx/fragment/app/SpecialEffectsController$FragmentStateManagerOperation", "onStart", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        }
    }

    /* renamed from: androidx.fragment.app.q0$d */
    public static class C112954d {

        /* renamed from: a */
        public C112957c f338142a;

        /* renamed from: b */
        public C112956b f338143b;

        /* renamed from: c */
        public final Fragment f338144c;

        /* renamed from: d */
        public final List<Runnable> f338145d = new ArrayList();

        /* renamed from: e */
        public final HashSet<C112741b> f338146e = new HashSet<>();

        /* renamed from: f */
        public boolean f338147f = false;

        /* renamed from: g */
        public boolean f338148g = false;

        /* renamed from: androidx.fragment.app.q0$d$a */
        public class C112955a implements C112741b.C112742a {
            public C112955a() {
            }

            public void onCancel() {
                C112954d.this.mo165242a();
            }
        }

        /* renamed from: androidx.fragment.app.q0$d$b */
        public enum C112956b {
            NONE,
            ADDING,
            REMOVING
        }

        /* renamed from: androidx.fragment.app.q0$d$c */
        public enum C112957c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            /* renamed from: b */
            public static C112957c m154566b(int i) {
                if (i == 0) {
                    return VISIBLE;
                }
                if (i == 4) {
                    return INVISIBLE;
                }
                if (i == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException("Unknown visibility " + i);
            }

            /* renamed from: c */
            public static C112957c m154567c(View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : m154566b(view.getVisibility());
            }

            /* renamed from: a */
            public void mo165245a(View view) {
                int ordinal = ordinal();
                if (ordinal == 0) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            view.toString();
                            viewGroup.toString();
                        }
                        viewGroup.removeView(view);
                    }
                } else if (ordinal == 1) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Objects.toString(view);
                    }
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    C117292a.m165358d(view, aVar.mo10232b(), "androidx/fragment/app/SpecialEffectsController$Operation$State", "applyState", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "androidx/fragment/app/SpecialEffectsController$Operation$State", "applyState", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else if (ordinal == 2) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Objects.toString(view);
                    }
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(8);
                    C117292a.m165358d(view, aVar2.mo10232b(), "androidx/fragment/app/SpecialEffectsController$Operation$State", "applyState", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "androidx/fragment/app/SpecialEffectsController$Operation$State", "applyState", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else if (ordinal == 3) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Objects.toString(view);
                    }
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                    aVar3.mo10233c(4);
                    C117292a.m165358d(view, aVar3.mo10232b(), "androidx/fragment/app/SpecialEffectsController$Operation$State", "applyState", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "androidx/fragment/app/SpecialEffectsController$Operation$State", "applyState", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }

        public C112954d(C112957c cVar, C112956b bVar, Fragment fragment, C112741b bVar2) {
            this.f338142a = cVar;
            this.f338143b = bVar;
            this.f338144c = fragment;
            bVar2.mo164501b(new C112955a());
        }

        /* renamed from: a */
        public final void mo165242a() {
            if (!this.f338147f) {
                this.f338147f = true;
                if (this.f338146e.isEmpty()) {
                    mo165240b();
                    return;
                }
                Iterator it = new ArrayList(this.f338146e).iterator();
                while (it.hasNext()) {
                    ((C112741b) it.next()).mo164500a();
                }
            }
        }

        /* renamed from: b */
        public void mo165240b() {
            if (!this.f338148g) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    toString();
                }
                this.f338148g = true;
                for (Runnable run : this.f338145d) {
                    run.run();
                }
            }
        }

        /* renamed from: c */
        public final void mo165243c(C112957c cVar, C112956b bVar) {
            C112957c cVar2 = C112957c.REMOVED;
            int ordinal = bVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Objects.toString(this.f338144c);
                            Objects.toString(this.f338142a);
                            Objects.toString(this.f338143b);
                        }
                        this.f338142a = cVar2;
                        this.f338143b = C112956b.REMOVING;
                    }
                } else if (this.f338142a == cVar2) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Objects.toString(this.f338144c);
                        Objects.toString(this.f338143b);
                    }
                    this.f338142a = C112957c.VISIBLE;
                    this.f338143b = C112956b.ADDING;
                }
            } else if (this.f338142a != cVar2) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    Objects.toString(this.f338144c);
                    Objects.toString(this.f338142a);
                    Objects.toString(cVar);
                }
                this.f338142a = cVar;
            }
        }

        /* renamed from: d */
        public void mo165241d() {
        }

        public String toString() {
            return "Operation " + "{" + Integer.toHexString(System.identityHashCode(this)) + "} " + "{" + "mFinalState = " + this.f338142a + "} " + "{" + "mLifecycleImpact = " + this.f338143b + "} " + "{" + "mFragment = " + this.f338144c + "}";
        }
    }

    public C112950q0(ViewGroup viewGroup) {
        this.f338132a = viewGroup;
    }

    /* renamed from: f */
    public static C112950q0 m154551f(ViewGroup viewGroup, FragmentManager fragmentManager) {
        return m154552g(viewGroup, fragmentManager.getSpecialEffectsControllerFactory());
    }

    /* renamed from: g */
    public static C112950q0 m154552g(ViewGroup viewGroup, C112959r0 r0Var) {
        Object tag = viewGroup.getTag(C0966R.C0970id.f359282jz3);
        if (tag instanceof C112950q0) {
            return (C112950q0) tag;
        }
        ((FragmentManager.C112896f) r0Var).getClass();
        C112912b bVar = new C112912b(viewGroup);
        viewGroup.setTag(C0966R.C0970id.f359282jz3, bVar);
        return bVar;
    }

    /* renamed from: a */
    public final void mo165232a(C112954d.C112957c cVar, C112954d.C112956b bVar, C112970z zVar) {
        synchronized (this.f338133b) {
            C112741b bVar2 = new C112741b();
            C112954d d = mo165234d(zVar.f338187c);
            if (d != null) {
                d.mo165243c(cVar, bVar);
                return;
            }
            C112953c cVar2 = new C112953c(cVar, bVar, zVar, bVar2);
            this.f338133b.add(cVar2);
            ((ArrayList) cVar2.f338145d).add(new C112951a(cVar2));
            ((ArrayList) cVar2.f338145d).add(new C112952b(cVar2));
        }
    }

    /* renamed from: b */
    public abstract void mo165180b(List<C112954d> list, boolean z);

    /* renamed from: c */
    public void mo165233c() {
        if (!this.f338136e) {
            ViewGroup viewGroup = this.f338132a;
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            if (!C107207u.C107211e.m145207b(viewGroup)) {
                mo165235e();
                this.f338135d = false;
                return;
            }
            synchronized (this.f338133b) {
                if (!this.f338133b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f338134c);
                    this.f338134c.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C112954d dVar = (C112954d) it.next();
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Objects.toString(dVar);
                        }
                        dVar.mo165242a();
                        if (!dVar.f338148g) {
                            this.f338134c.add(dVar);
                        }
                    }
                    mo165237i();
                    ArrayList arrayList2 = new ArrayList(this.f338133b);
                    this.f338133b.clear();
                    this.f338134c.addAll(arrayList2);
                    Iterator it4 = arrayList2.iterator();
                    while (it4.hasNext()) {
                        ((C112954d) it4.next()).mo165241d();
                    }
                    mo165180b(arrayList2, this.f338135d);
                    this.f338135d = false;
                }
            }
        }
    }

    /* renamed from: d */
    public final C112954d mo165234d(Fragment fragment) {
        Iterator<C112954d> it = this.f338133b.iterator();
        while (it.hasNext()) {
            C112954d next = it.next();
            if (next.f338144c.equals(fragment) && !next.f338147f) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: e */
    public void mo165235e() {
        ViewGroup viewGroup = this.f338132a;
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        boolean b = C107207u.C107211e.m145207b(viewGroup);
        synchronized (this.f338133b) {
            mo165237i();
            Iterator<C112954d> it = this.f338133b.iterator();
            while (it.hasNext()) {
                it.next().mo165241d();
            }
            Iterator it4 = new ArrayList(this.f338134c).iterator();
            while (it4.hasNext()) {
                C112954d dVar = (C112954d) it4.next();
                if (FragmentManager.isLoggingEnabled(2)) {
                    if (!b) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Container ");
                        sb.append(this.f338132a);
                        sb.append(" is not attached to window. ");
                    }
                    Objects.toString(dVar);
                }
                dVar.mo165242a();
            }
            Iterator it5 = new ArrayList(this.f338133b).iterator();
            while (it5.hasNext()) {
                C112954d dVar2 = (C112954d) it5.next();
                if (FragmentManager.isLoggingEnabled(2)) {
                    if (!b) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Container ");
                        sb4.append(this.f338132a);
                        sb4.append(" is not attached to window. ");
                    }
                    Objects.toString(dVar2);
                }
                dVar2.mo165242a();
            }
        }
    }

    /* renamed from: h */
    public void mo165236h() {
        synchronized (this.f338133b) {
            mo165237i();
            this.f338136e = false;
            int size = this.f338133b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                C112954d dVar = this.f338133b.get(size);
                C112954d.C112957c c = C112954d.C112957c.m154567c(dVar.f338144c.mView);
                C112954d.C112957c cVar = dVar.f338142a;
                C112954d.C112957c cVar2 = C112954d.C112957c.VISIBLE;
                if (cVar == cVar2 && c != cVar2) {
                    this.f338136e = dVar.f338144c.isPostponed();
                    break;
                }
                size--;
            }
        }
    }

    /* renamed from: i */
    public final void mo165237i() {
        Iterator<C112954d> it = this.f338133b.iterator();
        while (it.hasNext()) {
            C112954d next = it.next();
            if (next.f338143b == C112954d.C112956b.ADDING) {
                next.mo165243c(C112954d.C112957c.m154566b(next.f338144c.requireView().getVisibility()), C112954d.C112956b.NONE);
            }
        }
    }
}
