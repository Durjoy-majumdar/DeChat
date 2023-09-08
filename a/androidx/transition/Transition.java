package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.WeakHashMap;
import p1042u.C111055b;
import p1042u.C111056e;
import p1042u.C111057f;
import p1050v2.C111331h;
import p849e3.C107168a0;
import p849e3.C107207u;
import p853i4.C108338b0;
import p853i4.C108340c0;
import p853i4.C108342d0;
import p853i4.C108348j;
import p853i4.C108349k;
import p853i4.C108350l;
import p853i4.C108352n;
import p853i4.C108353o;
import p853i4.C108354p;
import p853i4.C108360v;
import p853i4.C108366z;

public abstract class Transition implements Cloneable {

    /* renamed from: H */
    public static final int[] f306703H = {2, 1, 3, 4};

    /* renamed from: I */
    public static final PathMotion f306704I = new C103821a();

    /* renamed from: J */
    public static ThreadLocal<C111055b<Animator, C103822b>> f306705J = new ThreadLocal<>();

    /* renamed from: A */
    public boolean f306706A = false;

    /* renamed from: B */
    public boolean f306707B = false;

    /* renamed from: C */
    public ArrayList<C103824e> f306708C = null;

    /* renamed from: D */
    public ArrayList<Animator> f306709D = new ArrayList<>();

    /* renamed from: E */
    public C108352n f306710E;

    /* renamed from: F */
    public C103823d f306711F;

    /* renamed from: G */
    public PathMotion f306712G = f306704I;

    /* renamed from: d */
    public String f306713d = getClass().getName();

    /* renamed from: e */
    public long f306714e = -1;

    /* renamed from: f */
    public long f306715f = -1;

    /* renamed from: g */
    public TimeInterpolator f306716g = null;

    /* renamed from: h */
    public ArrayList<Integer> f306717h = new ArrayList<>();

    /* renamed from: i */
    public ArrayList<View> f306718i = new ArrayList<>();

    /* renamed from: j */
    public ArrayList<String> f306719j = null;

    /* renamed from: n */
    public ArrayList<Class> f306720n = null;

    /* renamed from: o */
    public ArrayList<Integer> f306721o = null;

    /* renamed from: p */
    public ArrayList<Class> f306722p = null;

    /* renamed from: q */
    public ArrayList<String> f306723q = null;

    /* renamed from: r */
    public C108354p f306724r = new C108354p();

    /* renamed from: s */
    public C108354p f306725s = new C108354p();

    /* renamed from: t */
    public TransitionSet f306726t = null;

    /* renamed from: u */
    public int[] f306727u = f306703H;

    /* renamed from: v */
    public ArrayList<C108353o> f306728v;

    /* renamed from: w */
    public ArrayList<C108353o> f306729w;

    /* renamed from: x */
    public boolean f306730x = false;

    /* renamed from: y */
    public ArrayList<Animator> f306731y = new ArrayList<>();

    /* renamed from: z */
    public int f306732z = 0;

    /* renamed from: androidx.transition.Transition$c */
    public static class C67093c {
        /* renamed from: a */
        public static <T> ArrayList<T> m79350a(ArrayList<T> arrayList, T t) {
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            if (!arrayList.contains(t)) {
                arrayList.add(t);
            }
            return arrayList;
        }
    }

    /* renamed from: androidx.transition.Transition$a */
    public static class C103821a extends PathMotion {
        /* renamed from: a */
        public Path mo145263a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* renamed from: androidx.transition.Transition$b */
    public static class C103822b {

        /* renamed from: a */
        public View f306733a;

        /* renamed from: b */
        public String f306734b;

        /* renamed from: c */
        public C108353o f306735c;

        /* renamed from: d */
        public C108342d0 f306736d;

        /* renamed from: e */
        public Transition f306737e;

        public C103822b(View view, String str, Transition transition, C108342d0 d0Var, C108353o oVar) {
            this.f306733a = view;
            this.f306734b = str;
            this.f306735c = oVar;
            this.f306736d = d0Var;
            this.f306737e = transition;
        }
    }

    /* renamed from: androidx.transition.Transition$d */
    public static abstract class C103823d {
        /* renamed from: a */
        public abstract Rect mo145345a(Transition transition);
    }

    /* renamed from: androidx.transition.Transition$e */
    public interface C103824e {
        /* renamed from: a */
        void mo91179a(Transition transition);

        /* renamed from: b */
        void mo77557b(Transition transition);

        /* renamed from: c */
        void mo91180c(Transition transition);

        /* renamed from: d */
        void mo91181d(Transition transition);
    }

    public Transition() {
    }

    /* renamed from: A */
    public static boolean m138287A(C108353o oVar, C108353o oVar2, String str) {
        Object obj = ((HashMap) oVar.f324391a).get(str);
        Object obj2 = ((HashMap) oVar2.f324391a).get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    /* renamed from: f */
    public static void m138288f(C108354p pVar, View view, C108353o oVar) {
        pVar.f324394a.put(view, oVar);
        int id = view.getId();
        if (id >= 0) {
            if (pVar.f324395b.indexOfKey(id) >= 0) {
                pVar.f324395b.put(id, (Object) null);
            } else {
                pVar.f324395b.put(id, view);
            }
        }
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        String k = C107207u.C107213g.m145226k(view);
        if (k != null) {
            if (pVar.f324397d.containsKey(k)) {
                pVar.f324397d.put(k, null);
            } else {
                pVar.f324397d.put(k, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                C111057f<View> fVar = pVar.f324396c;
                if (fVar.f332573d) {
                    fVar.mo162752c();
                }
                if (C111056e.m151430b(fVar.f332574e, fVar.f332576g, itemIdAtPosition) >= 0) {
                    View d = pVar.f324396c.mo162755d(itemIdAtPosition, null);
                    if (d != null) {
                        C107207u.C107208b.m145190r(d, false);
                        pVar.f324396c.mo162756e(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                C107207u.C107208b.m145190r(view, true);
                pVar.f324396c.mo162756e(itemIdAtPosition, view);
            }
        }
    }

    /* renamed from: v */
    public static C111055b<Animator, C103822b> m138289v() {
        C111055b<Animator, C103822b> bVar = f306705J.get();
        if (bVar != null) {
            return bVar;
        }
        C111055b<Animator, C103822b> bVar2 = new C111055b<>();
        f306705J.set(bVar2);
        return bVar2;
    }

    /* renamed from: B */
    public void mo145309B(View view) {
        int i;
        if (!this.f306707B) {
            C111055b<Animator, C103822b> v = m138289v();
            int i2 = v.f332583f;
            C108366z zVar = C108360v.f324401a;
            WindowId windowId = view.getWindowId();
            int i3 = i2 - 1;
            while (true) {
                i = 0;
                if (i3 < 0) {
                    break;
                }
                C103822b l = v.mo162791l(i3);
                if (l.f306733a != null) {
                    C108342d0 d0Var = l.f306736d;
                    if ((d0Var instanceof C108340c0) && ((C108340c0) d0Var).f324369a.equals(windowId)) {
                        i = 1;
                    }
                    if (i != 0) {
                        v.mo162789j(i3).pause();
                    }
                }
                i3--;
            }
            ArrayList<C103824e> arrayList = this.f306708C;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f306708C.clone();
                int size = arrayList2.size();
                while (i < size) {
                    ((C103824e) arrayList2.get(i)).mo91181d(this);
                    i++;
                }
            }
            this.f306706A = true;
        }
    }

    /* renamed from: C */
    public Transition mo145310C(C103824e eVar) {
        ArrayList<C103824e> arrayList = this.f306708C;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(eVar);
        if (this.f306708C.size() == 0) {
            this.f306708C = null;
        }
        return this;
    }

    /* renamed from: E */
    public Transition mo145311E(View view) {
        this.f306718i.remove(view);
        return this;
    }

    /* renamed from: F */
    public void mo145312F(View view) {
        if (this.f306706A) {
            if (!this.f306707B) {
                C111055b<Animator, C103822b> v = m138289v();
                int i = v.f332583f;
                C108366z zVar = C108360v.f324401a;
                WindowId windowId = view.getWindowId();
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    C103822b l = v.mo162791l(i2);
                    if (l.f306733a != null) {
                        C108342d0 d0Var = l.f306736d;
                        if ((d0Var instanceof C108340c0) && ((C108340c0) d0Var).f324369a.equals(windowId)) {
                            v.mo162789j(i2).resume();
                        }
                    }
                }
                ArrayList<C103824e> arrayList = this.f306708C;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f306708C.clone();
                    int size = arrayList2.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        ((C103824e) arrayList2.get(i3)).mo91180c(this);
                    }
                }
            }
            this.f306706A = false;
        }
    }

    /* renamed from: G */
    public void mo145313G() {
        mo145322Q();
        C111055b<Animator, C103822b> v = m138289v();
        Iterator<Animator> it = this.f306709D.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (v.containsKey(next)) {
                mo145322Q();
                if (next != null) {
                    next.addListener(new C108349k(this, v));
                    long j = this.f306715f;
                    if (j >= 0) {
                        next.setDuration(j);
                    }
                    long j2 = this.f306714e;
                    if (j2 >= 0) {
                        next.setStartDelay(j2);
                    }
                    TimeInterpolator timeInterpolator = this.f306716g;
                    if (timeInterpolator != null) {
                        next.setInterpolator(timeInterpolator);
                    }
                    next.addListener(new C108350l(this));
                    next.start();
                }
            }
        }
        this.f306709D.clear();
        mo145336q();
    }

    /* renamed from: H */
    public void mo145314H(boolean z) {
        this.f306730x = z;
    }

    /* renamed from: I */
    public Transition mo145315I(long j) {
        this.f306715f = j;
        return this;
    }

    /* renamed from: J */
    public void mo145316J(C103823d dVar) {
        this.f306711F = dVar;
    }

    /* renamed from: K */
    public Transition mo145317K(TimeInterpolator timeInterpolator) {
        this.f306716g = timeInterpolator;
        return this;
    }

    /* renamed from: L */
    public void mo145318L(PathMotion pathMotion) {
        if (pathMotion == null) {
            this.f306712G = f306704I;
        } else {
            this.f306712G = pathMotion;
        }
    }

    /* renamed from: N */
    public void mo145319N(C108352n nVar) {
        this.f306710E = nVar;
    }

    /* renamed from: O */
    public Transition mo145320O(ViewGroup viewGroup) {
        return this;
    }

    /* renamed from: P */
    public Transition mo145321P(long j) {
        this.f306714e = j;
        return this;
    }

    /* renamed from: Q */
    public void mo145322Q() {
        if (this.f306732z == 0) {
            ArrayList<C103824e> arrayList = this.f306708C;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f306708C.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((C103824e) arrayList2.get(i)).mo91179a(this);
                }
            }
            this.f306707B = false;
        }
        this.f306732z++;
    }

    /* renamed from: R */
    public String mo145323R(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f306715f != -1) {
            str2 = str2 + "dur(" + this.f306715f + ") ";
        }
        if (this.f306714e != -1) {
            str2 = str2 + "dly(" + this.f306714e + ") ";
        }
        if (this.f306716g != null) {
            str2 = str2 + "interp(" + this.f306716g + ") ";
        }
        if (this.f306717h.size() <= 0 && this.f306718i.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f306717h.size() > 0) {
            for (int i = 0; i < this.f306717h.size(); i++) {
                if (i > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f306717h.get(i);
            }
        }
        if (this.f306718i.size() > 0) {
            for (int i2 = 0; i2 < this.f306718i.size(); i2++) {
                if (i2 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f306718i.get(i2);
            }
        }
        return str3 + ")";
    }

    /* renamed from: a */
    public Transition mo145324a(C103824e eVar) {
        if (this.f306708C == null) {
            this.f306708C = new ArrayList<>();
        }
        this.f306708C.add(eVar);
        return this;
    }

    /* renamed from: b */
    public Transition mo145325b(int i) {
        if (i != 0) {
            this.f306717h.add(Integer.valueOf(i));
        }
        return this;
    }

    /* renamed from: c */
    public Transition mo145326c(View view) {
        this.f306718i.add(view);
        return this;
    }

    /* renamed from: d */
    public Transition mo145328d(Class cls) {
        if (this.f306720n == null) {
            this.f306720n = new ArrayList<>();
        }
        this.f306720n.add(cls);
        return this;
    }

    /* renamed from: e */
    public Transition mo145329e(String str) {
        if (this.f306719j == null) {
            this.f306719j = new ArrayList<>();
        }
        this.f306719j.add(str);
        return this;
    }

    /* renamed from: g */
    public abstract void mo145266g(C108353o oVar);

    /* renamed from: h */
    public final void mo145330h(View view, boolean z) {
        if (view != null) {
            int id = view.getId();
            ArrayList<Integer> arrayList = this.f306721o;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
                ArrayList<Class> arrayList2 = this.f306722p;
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    int i = 0;
                    while (i < size) {
                        if (!this.f306722p.get(i).isInstance(view)) {
                            i++;
                        } else {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    C108353o oVar = new C108353o();
                    oVar.f324392b = view;
                    if (z) {
                        mo145267k(oVar);
                    } else {
                        mo145266g(oVar);
                    }
                    oVar.f324393c.add(this);
                    mo145331j(oVar);
                    if (z) {
                        m138288f(this.f306724r, view, oVar);
                    } else {
                        m138288f(this.f306725s, view, oVar);
                    }
                }
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                        mo145330h(viewGroup.getChildAt(i2), z);
                    }
                }
            }
        }
    }

    /* renamed from: j */
    public void mo145331j(C108353o oVar) {
        boolean z;
        if (this.f306710E != null && !((HashMap) oVar.f324391a).isEmpty()) {
            this.f306710E.getClass();
            String[] strArr = C108338b0.f324361a;
            int i = 0;
            while (true) {
                if (i >= 2) {
                    z = true;
                    break;
                }
                if (!((HashMap) oVar.f324391a).containsKey(strArr[i])) {
                    z = false;
                    break;
                }
                i++;
            }
            if (!z) {
                ((C108338b0) this.f306710E).getClass();
                View view = oVar.f324392b;
                Integer num = (Integer) ((HashMap) oVar.f324391a).get("android:visibility:visibility");
                if (num == null) {
                    num = Integer.valueOf(view.getVisibility());
                }
                ((HashMap) oVar.f324391a).put("android:visibilityPropagation:visibility", num);
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                int round = iArr[0] + Math.round(view.getTranslationX());
                iArr[0] = round;
                iArr[0] = round + (view.getWidth() / 2);
                int round2 = iArr[1] + Math.round(view.getTranslationY());
                iArr[1] = round2;
                iArr[1] = round2 + (view.getHeight() / 2);
                ((HashMap) oVar.f324391a).put("android:visibilityPropagation:center", iArr);
            }
        }
    }

    /* renamed from: k */
    public abstract void mo145267k(C108353o oVar);

    /* renamed from: l */
    public void mo145332l(ViewGroup viewGroup, boolean z) {
        ArrayList<String> arrayList;
        ArrayList<Class> arrayList2;
        mo145333m(z);
        if ((this.f306717h.size() > 0 || this.f306718i.size() > 0) && (((arrayList = this.f306719j) == null || arrayList.isEmpty()) && ((arrayList2 = this.f306720n) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.f306717h.size(); i++) {
                View findViewById = viewGroup.findViewById(this.f306717h.get(i).intValue());
                if (findViewById != null) {
                    C108353o oVar = new C108353o();
                    oVar.f324392b = findViewById;
                    if (z) {
                        mo145267k(oVar);
                    } else {
                        mo145266g(oVar);
                    }
                    oVar.f324393c.add(this);
                    mo145331j(oVar);
                    if (z) {
                        m138288f(this.f306724r, findViewById, oVar);
                    } else {
                        m138288f(this.f306725s, findViewById, oVar);
                    }
                }
            }
            for (int i2 = 0; i2 < this.f306718i.size(); i2++) {
                View view = this.f306718i.get(i2);
                C108353o oVar2 = new C108353o();
                oVar2.f324392b = view;
                if (z) {
                    mo145267k(oVar2);
                } else {
                    mo145266g(oVar2);
                }
                oVar2.f324393c.add(this);
                mo145331j(oVar2);
                if (z) {
                    m138288f(this.f306724r, view, oVar2);
                } else {
                    m138288f(this.f306725s, view, oVar2);
                }
            }
            return;
        }
        mo145330h(viewGroup, z);
    }

    /* renamed from: m */
    public void mo145333m(boolean z) {
        if (z) {
            this.f306724r.f324394a.clear();
            this.f306724r.f324395b.clear();
            this.f306724r.f324396c.clear();
            return;
        }
        this.f306725s.f324394a.clear();
        this.f306725s.f324395b.clear();
        this.f306725s.f324396c.clear();
    }

    /* renamed from: n */
    public Transition clone() {
        try {
            Transition transition = (Transition) super.clone();
            transition.f306709D = new ArrayList<>();
            transition.f306724r = new C108354p();
            transition.f306725s = new C108354p();
            transition.f306728v = null;
            transition.f306729w = null;
            return transition;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: o */
    public Animator mo145268o(ViewGroup viewGroup, C108353o oVar, C108353o oVar2) {
        return null;
    }

    /* renamed from: p */
    public void mo145335p(ViewGroup viewGroup, C108354p pVar, C108354p pVar2, ArrayList<C108353o> arrayList, ArrayList<C108353o> arrayList2) {
        int i;
        Animator o;
        View view;
        Animator animator;
        C108353o oVar;
        C108353o oVar2;
        Animator animator2;
        ViewGroup viewGroup2 = viewGroup;
        C111055b<Animator, C103822b> v = m138289v();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j = MAlarmHandler.NEXT_FIRE_INTERVAL;
        int i2 = 0;
        while (i2 < size) {
            C108353o oVar3 = arrayList.get(i2);
            C108353o oVar4 = arrayList2.get(i2);
            if (oVar3 != null && !oVar3.f324393c.contains(this)) {
                oVar3 = null;
            }
            if (oVar4 != null && !oVar4.f324393c.contains(this)) {
                oVar4 = null;
            }
            if (!(oVar3 == null && oVar4 == null)) {
                if ((oVar3 == null || oVar4 == null || mo145343y(oVar3, oVar4)) && (o = mo145268o(viewGroup2, oVar3, oVar4)) != null) {
                    if (oVar4 != null) {
                        view = oVar4.f324392b;
                        String[] w = mo145269w();
                        if (view != null && w != null && w.length > 0) {
                            C108353o oVar5 = new C108353o();
                            oVar5.f324392b = view;
                            Animator animator3 = o;
                            i = size;
                            C108353o orDefault = pVar2.f324394a.getOrDefault(view, null);
                            if (orDefault != null) {
                                int i3 = 0;
                                while (i3 < w.length) {
                                    Map<String, Object> map = oVar5.f324391a;
                                    String str = w[i3];
                                    ((HashMap) map).put(str, ((HashMap) orDefault.f324391a).get(str));
                                    i3++;
                                    ArrayList<C108353o> arrayList3 = arrayList2;
                                    w = w;
                                }
                            }
                            int i4 = v.f332583f;
                            int i5 = 0;
                            while (true) {
                                if (i5 >= i4) {
                                    oVar2 = oVar5;
                                    animator2 = animator3;
                                    break;
                                }
                                C103822b orDefault2 = v.getOrDefault(v.mo162789j(i5), null);
                                if (orDefault2.f306735c != null && orDefault2.f306733a == view && orDefault2.f306734b.equals(this.f306713d) && orDefault2.f306735c.equals(oVar5)) {
                                    oVar2 = oVar5;
                                    animator2 = null;
                                    break;
                                }
                                i5++;
                            }
                        } else {
                            i = size;
                            animator2 = o;
                            oVar2 = null;
                        }
                        animator = animator2;
                        oVar = oVar2;
                    } else {
                        i = size;
                        view = oVar3.f324392b;
                        animator = o;
                        oVar = null;
                    }
                    if (animator != null) {
                        C108352n nVar = this.f306710E;
                        if (nVar != null) {
                            long a = nVar.mo158802a(viewGroup2, this, oVar3, oVar4);
                            sparseIntArray.put(this.f306709D.size(), (int) a);
                            j = Math.min(a, j);
                        }
                        long j2 = j;
                        String str2 = this.f306713d;
                        C108366z zVar = C108360v.f324401a;
                        v.put(animator, new C103822b(view, str2, this, new C108340c0(viewGroup2), oVar));
                        this.f306709D.add(animator);
                        j = j2;
                    }
                    i2++;
                    size = i;
                }
            }
            i = size;
            i2++;
            size = i;
        }
        if (j != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                Animator animator4 = this.f306709D.get(sparseIntArray.keyAt(i6));
                animator4.setStartDelay((((long) sparseIntArray.valueAt(i6)) - j) + animator4.getStartDelay());
            }
        }
    }

    /* renamed from: q */
    public void mo145336q() {
        int i = this.f306732z - 1;
        this.f306732z = i;
        if (i == 0) {
            ArrayList<C103824e> arrayList = this.f306708C;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f306708C.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((C103824e) arrayList2.get(i2)).mo77557b(this);
                }
            }
            for (int i3 = 0; i3 < this.f306724r.f324396c.mo162757f(); i3++) {
                View g = this.f306724r.f324396c.mo162758g(i3);
                if (g != null) {
                    WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                    C107207u.C107208b.m145190r(g, false);
                }
            }
            for (int i4 = 0; i4 < this.f306725s.f324396c.mo162757f(); i4++) {
                View g2 = this.f306725s.f324396c.mo162758g(i4);
                if (g2 != null) {
                    WeakHashMap<View, C107168a0> weakHashMap2 = C107207u.f320808a;
                    C107207u.C107208b.m145190r(g2, false);
                }
            }
            this.f306707B = true;
        }
    }

    /* renamed from: r */
    public Transition mo145337r(int i, boolean z) {
        ArrayList arrayList = this.f306721o;
        if (i > 0) {
            if (z) {
                arrayList = C67093c.m79350a(arrayList, Integer.valueOf(i));
            } else {
                Integer valueOf = Integer.valueOf(i);
                if (arrayList != null) {
                    arrayList.remove(valueOf);
                    if (arrayList.isEmpty()) {
                        arrayList = null;
                    }
                }
            }
        }
        this.f306721o = arrayList;
        return this;
    }

    /* renamed from: s */
    public Transition mo145338s(Class cls, boolean z) {
        ArrayList arrayList = this.f306722p;
        if (cls != null) {
            if (z) {
                arrayList = C67093c.m79350a(arrayList, cls);
            } else if (arrayList != null) {
                arrayList.remove(cls);
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
            }
        }
        this.f306722p = arrayList;
        return this;
    }

    /* renamed from: t */
    public Transition mo145339t(String str, boolean z) {
        ArrayList arrayList = this.f306723q;
        if (str != null) {
            if (z) {
                arrayList = C67093c.m79350a(arrayList, str);
            } else if (arrayList != null) {
                arrayList.remove(str);
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
            }
        }
        this.f306723q = arrayList;
        return this;
    }

    public String toString() {
        return mo145323R("");
    }

    /* renamed from: u */
    public C108353o mo145341u(View view, boolean z) {
        TransitionSet transitionSet = this.f306726t;
        if (transitionSet != null) {
            return transitionSet.mo145341u(view, z);
        }
        ArrayList<C108353o> arrayList = z ? this.f306728v : this.f306729w;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            C108353o oVar = arrayList.get(i2);
            if (oVar == null) {
                return null;
            }
            if (oVar.f324392b == view) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i < 0) {
            return null;
        }
        return (z ? this.f306729w : this.f306728v).get(i);
    }

    /* renamed from: w */
    public String[] mo145269w() {
        return null;
    }

    /* renamed from: x */
    public C108353o mo145342x(View view, boolean z) {
        TransitionSet transitionSet = this.f306726t;
        if (transitionSet != null) {
            return transitionSet.mo145342x(view, z);
        }
        return (z ? this.f306724r : this.f306725s).f324394a.getOrDefault(view, null);
    }

    /* renamed from: y */
    public boolean mo145343y(C108353o oVar, C108353o oVar2) {
        if (oVar == null || oVar2 == null) {
            return false;
        }
        String[] w = mo145269w();
        if (w != null) {
            int length = w.length;
            int i = 0;
            while (i < length) {
                if (!m138287A(oVar, oVar2, w[i])) {
                    i++;
                }
            }
            return false;
        }
        for (String A : ((HashMap) oVar.f324391a).keySet()) {
            if (m138287A(oVar, oVar2, A)) {
            }
        }
        return false;
        return true;
    }

    /* renamed from: z */
    public boolean mo145344z(View view) {
        ArrayList<Class> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.f306721o;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<Class> arrayList4 = this.f306722p;
        if (arrayList4 != null) {
            int size = arrayList4.size();
            for (int i = 0; i < size; i++) {
                if (this.f306722p.get(i).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f306723q != null) {
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            if (C107207u.C107213g.m145226k(view) != null && this.f306723q.contains(C107207u.C107213g.m145226k(view))) {
                return false;
            }
        }
        if ((this.f306717h.size() == 0 && this.f306718i.size() == 0 && (((arrayList = this.f306720n) == null || arrayList.isEmpty()) && ((arrayList2 = this.f306719j) == null || arrayList2.isEmpty()))) || this.f306717h.contains(Integer.valueOf(id)) || this.f306718i.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList5 = this.f306719j;
        if (arrayList5 != null) {
            WeakHashMap<View, C107168a0> weakHashMap2 = C107207u.f320808a;
            if (arrayList5.contains(C107207u.C107213g.m145226k(view))) {
                return true;
            }
        }
        if (this.f306720n != null) {
            for (int i2 = 0; i2 < this.f306720n.size(); i2++) {
                if (this.f306720n.get(i2).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public Transition(Context context, AttributeSet attributeSet) {
        boolean z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C108348j.f324376b);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long d = (long) C111331h.m151817d(obtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (d >= 0) {
            mo145315I(d);
        }
        long d2 = (long) C111331h.m151817d(obtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (d2 > 0) {
            mo145321P(d2);
        }
        int e = C111331h.m151818e(obtainStyledAttributes, xmlResourceParser, "interpolator", 0, 0);
        if (e > 0) {
            mo145317K(AnimationUtils.loadInterpolator(context, e));
        }
        String f = C111331h.m151819f(obtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (f != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(f, ",");
            int[] iArr = new int[stringTokenizer.countTokens()];
            int i = 0;
            while (stringTokenizer.hasMoreTokens()) {
                String trim = stringTokenizer.nextToken().trim();
                if ("id".equalsIgnoreCase(trim)) {
                    iArr[i] = 3;
                } else if ("instance".equalsIgnoreCase(trim)) {
                    iArr[i] = 1;
                } else if ("name".equalsIgnoreCase(trim)) {
                    iArr[i] = 2;
                } else if ("itemId".equalsIgnoreCase(trim)) {
                    iArr[i] = 4;
                } else if (trim.isEmpty()) {
                    int[] iArr2 = new int[(iArr.length - 1)];
                    System.arraycopy(iArr, 0, iArr2, 0, i);
                    i--;
                    iArr = iArr2;
                } else {
                    throw new InflateException("Unknown match type in matchOrder: '" + trim + "'");
                }
                i++;
            }
            if (iArr.length == 0) {
                this.f306727u = f306703H;
            } else {
                int i2 = 0;
                while (i2 < iArr.length) {
                    int i3 = iArr[i2];
                    if (i3 >= 1 && i3 <= 4) {
                        int i4 = 0;
                        while (true) {
                            if (i4 >= i2) {
                                z = false;
                                break;
                            } else if (iArr[i4] == i3) {
                                z = true;
                                break;
                            } else {
                                i4++;
                            }
                        }
                        if (!z) {
                            i2++;
                        } else {
                            throw new IllegalArgumentException("matches contains a duplicate value");
                        }
                    } else {
                        throw new IllegalArgumentException("matches contains invalid value");
                    }
                }
                this.f306727u = (int[]) iArr.clone();
            }
        }
        obtainStyledAttributes.recycle();
    }
}
