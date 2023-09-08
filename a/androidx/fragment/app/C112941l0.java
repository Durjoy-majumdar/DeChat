package androidx.fragment.app;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import p834a3.C112741b;
import p849e3.C107168a0;
import p849e3.C107207u;
import p849e3.C58525r;

/* renamed from: androidx.fragment.app.l0 */
public abstract class C112941l0 {

    /* renamed from: androidx.fragment.app.l0$a */
    public class C103745a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f306482d;

        /* renamed from: e */
        public final /* synthetic */ ArrayList f306483e;

        /* renamed from: f */
        public final /* synthetic */ ArrayList f306484f;

        /* renamed from: g */
        public final /* synthetic */ ArrayList f306485g;

        /* renamed from: h */
        public final /* synthetic */ ArrayList f306486h;

        public C103745a(C112941l0 l0Var, int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f306482d = i;
            this.f306483e = arrayList;
            this.f306484f = arrayList2;
            this.f306485g = arrayList3;
            this.f306486h = arrayList4;
        }

        public void run() {
            for (int i = 0; i < this.f306482d; i++) {
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                C107207u.C107213g.m145237v((View) this.f306483e.get(i), (String) this.f306484f.get(i));
                C107207u.C107213g.m145237v((View) this.f306485g.get(i), (String) this.f306486h.get(i));
            }
        }
    }

    /* renamed from: d */
    public static void m154518d(List<View> list, View view) {
        boolean z;
        boolean z2;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = false;
                break;
            } else if (list.get(i) == view) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (!z) {
            list.add(view);
            for (int i2 = size; i2 < list.size(); i2++) {
                View view2 = list.get(i2);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        View childAt = viewGroup.getChildAt(i3);
                        int i4 = 0;
                        while (true) {
                            if (i4 >= size) {
                                z2 = false;
                                break;
                            } else if (list.get(i4) == childAt) {
                                z2 = true;
                                break;
                            } else {
                                i4++;
                            }
                        }
                        if (!z2) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: j */
    public static boolean m154519j(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: a */
    public abstract void mo16811a(Object obj, View view);

    /* renamed from: b */
    public abstract void mo16812b(Object obj, ArrayList<View> arrayList);

    /* renamed from: c */
    public abstract void mo16813c(ViewGroup viewGroup, Object obj);

    /* renamed from: e */
    public abstract boolean mo16814e(Object obj);

    /* renamed from: f */
    public void mo165220f(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.isTransitionGroup()) {
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                mo165220f(arrayList, viewGroup.getChildAt(i));
            }
            return;
        }
        arrayList.add(view);
    }

    /* renamed from: g */
    public abstract Object mo16815g(Object obj);

    /* renamed from: h */
    public void mo165221h(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            String k = C107207u.C107213g.m145226k(view);
            if (k != null) {
                map.put(k, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    mo165221h(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* renamed from: i */
    public void mo165222i(View view, Rect rect) {
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        if (C107207u.C107211e.m145207b(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset((float) view.getLeft(), (float) view.getTop());
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
                view2.getMatrix().mapRect(rectF);
                rectF.offset((float) view2.getLeft(), (float) view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset((float) iArr[0], (float) iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    /* renamed from: k */
    public abstract Object mo16816k(Object obj, Object obj2, Object obj3);

    /* renamed from: l */
    public abstract Object mo16817l(Object obj, Object obj2, Object obj3);

    /* renamed from: m */
    public ArrayList<String> mo165223m(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            arrayList2.add(C107207u.C107213g.m145226k(view));
            C107207u.C107213g.m145237v(view, (String) null);
        }
        return arrayList2;
    }

    /* renamed from: n */
    public abstract void mo16818n(Object obj, View view);

    /* renamed from: o */
    public abstract void mo16819o(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: p */
    public abstract void mo16820p(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: q */
    public abstract void mo16821q(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: r */
    public abstract void mo16822r(Object obj, Rect rect);

    /* renamed from: s */
    public abstract void mo16823s(Object obj, View view);

    /* renamed from: t */
    public void mo16824t(Fragment fragment, Object obj, C112741b bVar, Runnable runnable) {
        runnable.run();
    }

    /* renamed from: u */
    public void mo165224u(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            String k = C107207u.C107213g.m145226k(view2);
            arrayList4.add(k);
            if (k != null) {
                C107207u.C107213g.m145237v(view2, (String) null);
                String str = map.get(k);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i2))) {
                        C107207u.C107213g.m145237v(arrayList2.get(i2), k);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        C58525r.m67941a(view, new C103745a(this, size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    /* renamed from: v */
    public abstract void mo16825v(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: w */
    public abstract void mo16826w(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: x */
    public abstract Object mo16827x(Object obj);
}
