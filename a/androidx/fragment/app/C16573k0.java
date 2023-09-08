package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import p834a3.C112741b;

/* renamed from: androidx.fragment.app.k0 */
public class C16573k0 extends C112941l0 {

    /* renamed from: androidx.fragment.app.k0$a */
    public class C16574a extends Transition.EpicenterCallback {

        /* renamed from: a */
        public final /* synthetic */ Rect f44570a;

        public C16574a(C16573k0 k0Var, Rect rect) {
            this.f44570a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            return this.f44570a;
        }
    }

    /* renamed from: androidx.fragment.app.k0$b */
    public class C16575b implements Transition.TransitionListener {

        /* renamed from: a */
        public final /* synthetic */ View f44571a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f44572b;

        public C16575b(C16573k0 k0Var, View view, ArrayList arrayList) {
            this.f44571a = view;
            this.f44572b = arrayList;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            View view = this.f44571a;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "androidx/fragment/app/FragmentTransitionCompat21$2", "onTransitionEnd", "(Landroid/transition/Transition;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "androidx/fragment/app/FragmentTransitionCompat21$2", "onTransitionEnd", "(Landroid/transition/Transition;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int size = this.f44572b.size();
            for (int i = 0; i < size; i++) {
                View view2 = (View) this.f44572b.get(i);
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(0);
                View view3 = view2;
                C117292a.m165358d(view3, aVar2.mo10232b(), "androidx/fragment/app/FragmentTransitionCompat21$2", "onTransitionEnd", "(Landroid/transition/Transition;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "androidx/fragment/app/FragmentTransitionCompat21$2", "onTransitionEnd", "(Landroid/transition/Transition;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }
    }

    /* renamed from: androidx.fragment.app.k0$c */
    public class C16576c implements Transition.TransitionListener {

        /* renamed from: a */
        public final /* synthetic */ Object f44573a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f44574b;

        /* renamed from: c */
        public final /* synthetic */ Object f44575c;

        /* renamed from: d */
        public final /* synthetic */ ArrayList f44576d;

        /* renamed from: e */
        public final /* synthetic */ Object f44577e;

        /* renamed from: f */
        public final /* synthetic */ ArrayList f44578f;

        public C16576c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f44573a = obj;
            this.f44574b = arrayList;
            this.f44575c = obj2;
            this.f44576d = arrayList2;
            this.f44577e = obj3;
            this.f44578f = arrayList3;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
            Object obj = this.f44573a;
            if (obj != null) {
                C16573k0.this.mo16819o(obj, this.f44574b, (ArrayList<View>) null);
            }
            Object obj2 = this.f44575c;
            if (obj2 != null) {
                C16573k0.this.mo16819o(obj2, this.f44576d, (ArrayList<View>) null);
            }
            Object obj3 = this.f44577e;
            if (obj3 != null) {
                C16573k0.this.mo16819o(obj3, this.f44578f, (ArrayList<View>) null);
            }
        }
    }

    /* renamed from: androidx.fragment.app.k0$d */
    public class C16577d implements Transition.TransitionListener {

        /* renamed from: a */
        public final /* synthetic */ Runnable f44580a;

        public C16577d(C16573k0 k0Var, Runnable runnable) {
            this.f44580a = runnable;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            this.f44580a.run();
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: androidx.fragment.app.k0$e */
    public class C16578e extends Transition.EpicenterCallback {

        /* renamed from: a */
        public final /* synthetic */ Rect f44581a;

        public C16578e(C16573k0 k0Var, Rect rect) {
            this.f44581a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f44581a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f44581a;
        }
    }

    /* renamed from: y */
    public static boolean m15647y(Transition transition) {
        return !C112941l0.m154519j(transition.getTargetIds()) || !C112941l0.m154519j(transition.getTargetNames()) || !C112941l0.m154519j(transition.getTargetTypes());
    }

    /* renamed from: a */
    public void mo16811a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    /* renamed from: b */
    public void mo16812b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i < transitionCount) {
                    mo16812b(transitionSet.getTransitionAt(i), arrayList);
                    i++;
                }
            } else if (!m15647y(transition) && C112941l0.m154519j(transition.getTargets())) {
                int size = arrayList.size();
                while (i < size) {
                    transition.addTarget(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: c */
    public void mo16813c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    /* renamed from: e */
    public boolean mo16814e(Object obj) {
        return obj instanceof Transition;
    }

    /* renamed from: g */
    public Object mo16815g(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    /* renamed from: k */
    public Object mo16816k(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    /* renamed from: l */
    public Object mo16817l(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    /* renamed from: n */
    public void mo16818n(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    /* renamed from: o */
    public void mo16819o(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo16819o(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
        } else if (!m15647y(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i < size) {
                transition.addTarget(arrayList2.get(i));
                i++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.removeTarget(arrayList.get(size2));
            }
        }
    }

    /* renamed from: p */
    public void mo16820p(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new C16575b(this, view, arrayList));
    }

    /* renamed from: q */
    public void mo16821q(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new C16576c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    /* renamed from: r */
    public void mo16822r(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new C16578e(this, rect));
        }
    }

    /* renamed from: s */
    public void mo16823s(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            mo165222i(view, rect);
            ((Transition) obj).setEpicenterCallback(new C16574a(this, rect));
        }
    }

    /* renamed from: t */
    public void mo16824t(Fragment fragment, Object obj, C112741b bVar, Runnable runnable) {
        ((Transition) obj).addListener(new C16577d(this, runnable));
    }

    /* renamed from: v */
    public void mo16825v(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C112941l0.m154518d(targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        mo16812b(transitionSet, arrayList);
    }

    /* renamed from: w */
    public void mo16826w(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            mo16819o(transitionSet, arrayList, arrayList2);
        }
    }

    /* renamed from: x */
    public Object mo16827x(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }
}
