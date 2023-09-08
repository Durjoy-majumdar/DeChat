package androidx.transition;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C112941l0;
import androidx.transition.Transition;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;

/* renamed from: androidx.transition.b */
public class C103830b extends C112941l0 {

    /* renamed from: androidx.transition.b$b */
    public class C67094b implements Transition.C103824e {

        /* renamed from: d */
        public final /* synthetic */ View f192683d;

        /* renamed from: e */
        public final /* synthetic */ ArrayList f192684e;

        public C67094b(C103830b bVar, View view, ArrayList arrayList) {
            this.f192683d = view;
            this.f192684e = arrayList;
        }

        /* renamed from: a */
        public void mo91179a(Transition transition) {
        }

        /* renamed from: b */
        public void mo77557b(Transition transition) {
            transition.mo145310C(this);
            View view = this.f192683d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "androidx/transition/FragmentTransitionSupport$2", "onTransitionEnd", "(Landroidx/transition/Transition;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "androidx/transition/FragmentTransitionSupport$2", "onTransitionEnd", "(Landroidx/transition/Transition;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int size = this.f192684e.size();
            for (int i = 0; i < size; i++) {
                View view2 = (View) this.f192684e.get(i);
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(0);
                View view3 = view2;
                C117292a.m165358d(view3, aVar2.mo10232b(), "androidx/transition/FragmentTransitionSupport$2", "onTransitionEnd", "(Landroidx/transition/Transition;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "androidx/transition/FragmentTransitionSupport$2", "onTransitionEnd", "(Landroidx/transition/Transition;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }

        /* renamed from: c */
        public void mo91180c(Transition transition) {
        }

        /* renamed from: d */
        public void mo91181d(Transition transition) {
        }
    }

    /* renamed from: androidx.transition.b$a */
    public class C103831a extends Transition.C103823d {

        /* renamed from: a */
        public final /* synthetic */ Rect f306767a;

        public C103831a(C103830b bVar, Rect rect) {
            this.f306767a = rect;
        }

        /* renamed from: a */
        public Rect mo145345a(Transition transition) {
            return this.f306767a;
        }
    }

    /* renamed from: androidx.transition.b$c */
    public class C103832c implements Transition.C103824e {

        /* renamed from: d */
        public final /* synthetic */ Object f306768d;

        /* renamed from: e */
        public final /* synthetic */ ArrayList f306769e;

        /* renamed from: f */
        public final /* synthetic */ Object f306770f;

        /* renamed from: g */
        public final /* synthetic */ ArrayList f306771g;

        /* renamed from: h */
        public final /* synthetic */ Object f306772h;

        /* renamed from: i */
        public final /* synthetic */ ArrayList f306773i;

        public C103832c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f306768d = obj;
            this.f306769e = arrayList;
            this.f306770f = obj2;
            this.f306771g = arrayList2;
            this.f306772h = obj3;
            this.f306773i = arrayList3;
        }

        /* renamed from: a */
        public void mo91179a(Transition transition) {
            Object obj = this.f306768d;
            if (obj != null) {
                C103830b.this.mo16819o(obj, this.f306769e, (ArrayList<View>) null);
            }
            Object obj2 = this.f306770f;
            if (obj2 != null) {
                C103830b.this.mo16819o(obj2, this.f306771g, (ArrayList<View>) null);
            }
            Object obj3 = this.f306772h;
            if (obj3 != null) {
                C103830b.this.mo16819o(obj3, this.f306773i, (ArrayList<View>) null);
            }
        }

        /* renamed from: b */
        public void mo77557b(Transition transition) {
        }

        /* renamed from: c */
        public void mo91180c(Transition transition) {
        }

        /* renamed from: d */
        public void mo91181d(Transition transition) {
        }
    }

    /* renamed from: androidx.transition.b$d */
    public class C103833d extends Transition.C103823d {

        /* renamed from: a */
        public final /* synthetic */ Rect f306775a;

        public C103833d(C103830b bVar, Rect rect) {
            this.f306775a = rect;
        }

        /* renamed from: a */
        public Rect mo145345a(Transition transition) {
            Rect rect = this.f306775a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f306775a;
        }
    }

    /* renamed from: y */
    public static boolean m138384y(Transition transition) {
        return !C112941l0.m154519j(transition.f306717h) || !C112941l0.m154519j(transition.f306719j) || !C112941l0.m154519j(transition.f306720n);
    }

    /* renamed from: a */
    public void mo16811a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).mo145326c(view);
        }
    }

    /* renamed from: b */
    public void mo16812b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int size = transitionSet.f306738K.size();
                while (i < size) {
                    mo16812b((i < 0 || i >= transitionSet.f306738K.size()) ? null : transitionSet.f306738K.get(i), arrayList);
                    i++;
                }
            } else if (!m138384y(transition) && C112941l0.m154519j(transition.f306718i)) {
                int size2 = arrayList.size();
                while (i < size2) {
                    transition.mo145326c(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: c */
    public void mo16813c(ViewGroup viewGroup, Object obj) {
        C103834d.m138407a(viewGroup, (Transition) obj);
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
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.mo145348U(transition);
            transitionSet.mo145348U(transition2);
            transitionSet.mo145351X(1);
            transition = transitionSet;
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet2 = new TransitionSet();
        if (transition != null) {
            transitionSet2.mo145348U(transition);
        }
        transitionSet2.mo145348U(transition3);
        return transitionSet2;
    }

    /* renamed from: l */
    public Object mo16817l(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.mo145348U((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.mo145348U((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.mo145348U((Transition) obj3);
        }
        return transitionSet;
    }

    /* renamed from: n */
    public void mo16818n(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).mo145311E(view);
        }
    }

    /* renamed from: o */
    public void mo16819o(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int size = transitionSet.f306738K.size();
            while (i < size) {
                mo16819o((i < 0 || i >= transitionSet.f306738K.size()) ? null : transitionSet.f306738K.get(i), arrayList, arrayList2);
                i++;
            }
        } else if (!m138384y(transition)) {
            ArrayList<View> arrayList3 = transition.f306718i;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size2) {
                    transition.mo145326c(arrayList2.get(i));
                    i++;
                }
                int size3 = arrayList.size();
                while (true) {
                    size3--;
                    if (size3 >= 0) {
                        transition.mo145311E(arrayList.get(size3));
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: p */
    public void mo16820p(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).mo145324a(new C67094b(this, view, arrayList));
    }

    /* renamed from: q */
    public void mo16821q(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).mo145324a(new C103832c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    /* renamed from: r */
    public void mo16822r(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).mo145316J(new C103833d(this, rect));
        }
    }

    /* renamed from: s */
    public void mo16823s(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            mo165222i(view, rect);
            ((Transition) obj).mo145316J(new C103831a(this, rect));
        }
    }

    /* renamed from: v */
    public void mo16825v(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        ArrayList<View> arrayList2 = transitionSet.f306718i;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C112941l0.m154518d(arrayList2, arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        mo16812b(transitionSet, arrayList);
    }

    /* renamed from: w */
    public void mo16826w(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.f306718i.clear();
            transitionSet.f306718i.addAll(arrayList2);
            mo16819o(transitionSet, arrayList, arrayList2);
        }
    }

    /* renamed from: x */
    public Object mo16827x(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.mo145348U((Transition) obj);
        return transitionSet;
    }
}
