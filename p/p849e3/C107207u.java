package p849e3;

import android.content.ClipData;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import k20.C60958c;
import k20.C9556a;
import p1042u.C111059i;
import p1057w2.C111711b;
import p849e3.C107166a;
import p849e3.C107179f0;

/* renamed from: e3.u */
public class C107207u {

    /* renamed from: a */
    public static WeakHashMap<View, C107168a0> f320808a = null;

    /* renamed from: b */
    public static Field f320809b;

    /* renamed from: c */
    public static boolean f320810c = false;

    /* renamed from: d */
    public static ThreadLocal<Rect> f320811d;

    /* renamed from: e3.u$a */
    public static class C86421a {
        /* renamed from: a */
        public static boolean m107088a(View view) {
            return view.hasOnClickListeners();
        }
    }

    /* renamed from: e3.u$m */
    public static class C97600m {
        /* renamed from: a */
        public static CharSequence m125777a(View view) {
            return view.getStateDescription();
        }

        /* renamed from: b */
        public static C107192g0 m125778b(View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return new C107192g0(windowInsetsController);
            }
            return null;
        }

        /* renamed from: c */
        public static void m125779c(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* renamed from: e3.u$b */
    public static class C107208b {
        /* renamed from: a */
        public static AccessibilityNodeProvider m145173a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        /* renamed from: b */
        public static boolean m145174b(View view) {
            return view.getFitsSystemWindows();
        }

        /* renamed from: c */
        public static int m145175c(View view) {
            return view.getImportantForAccessibility();
        }

        /* renamed from: d */
        public static int m145176d(View view) {
            return view.getMinimumHeight();
        }

        /* renamed from: e */
        public static int m145177e(View view) {
            return view.getMinimumWidth();
        }

        /* renamed from: f */
        public static ViewParent m145178f(View view) {
            return view.getParentForAccessibility();
        }

        /* renamed from: g */
        public static int m145179g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        /* renamed from: h */
        public static boolean m145180h(View view) {
            return view.hasOverlappingRendering();
        }

        /* renamed from: i */
        public static boolean m145181i(View view) {
            return view.hasTransientState();
        }

        /* renamed from: j */
        public static boolean m145182j(View view, int i, Bundle bundle) {
            return view.performAccessibilityAction(i, bundle);
        }

        /* renamed from: k */
        public static void m145183k(View view) {
            view.postInvalidateOnAnimation();
        }

        /* renamed from: l */
        public static void m145184l(View view, int i, int i2, int i3, int i4) {
            view.postInvalidateOnAnimation(i, i2, i3, i4);
        }

        /* renamed from: m */
        public static void m145185m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        /* renamed from: n */
        public static void m145186n(View view, Runnable runnable, long j) {
            view.postOnAnimationDelayed(runnable, j);
        }

        /* renamed from: o */
        public static void m145187o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        /* renamed from: p */
        public static void m145188p(View view) {
            view.requestFitSystemWindows();
        }

        /* renamed from: q */
        public static void m145189q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        /* renamed from: r */
        public static void m145190r(View view, boolean z) {
            view.setHasTransientState(z);
        }

        /* renamed from: s */
        public static void m145191s(View view, int i) {
            view.setImportantForAccessibility(i);
        }
    }

    /* renamed from: e3.u$c */
    public static class C107209c {
        /* renamed from: a */
        public static int m145192a() {
            return View.generateViewId();
        }

        /* renamed from: b */
        public static Display m145193b(View view) {
            return view.getDisplay();
        }

        /* renamed from: c */
        public static int m145194c(View view) {
            return view.getLabelFor();
        }

        /* renamed from: d */
        public static int m145195d(View view) {
            return view.getLayoutDirection();
        }

        /* renamed from: e */
        public static int m145196e(View view) {
            return view.getPaddingEnd();
        }

        /* renamed from: f */
        public static int m145197f(View view) {
            return view.getPaddingStart();
        }

        /* renamed from: g */
        public static boolean m145198g(View view) {
            return view.isPaddingRelative();
        }

        /* renamed from: h */
        public static void m145199h(View view, int i) {
            view.setLabelFor(i);
        }

        /* renamed from: i */
        public static void m145200i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        /* renamed from: j */
        public static void m145201j(View view, int i) {
            view.setLayoutDirection(i);
        }

        /* renamed from: k */
        public static void m145202k(View view, int i, int i2, int i3, int i4) {
            view.setPaddingRelative(i, i2, i3, i4);
        }
    }

    /* renamed from: e3.u$d */
    public static class C107210d {
        /* renamed from: a */
        public static Rect m145203a(View view) {
            return view.getClipBounds();
        }

        /* renamed from: b */
        public static boolean m145204b(View view) {
            return view.isInLayout();
        }

        /* renamed from: c */
        public static void m145205c(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    /* renamed from: e3.u$e */
    public static class C107211e {
        /* renamed from: a */
        public static int m145206a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        /* renamed from: b */
        public static boolean m145207b(View view) {
            return view.isAttachedToWindow();
        }

        /* renamed from: c */
        public static boolean m145208c(View view) {
            return view.isLaidOut();
        }

        /* renamed from: d */
        public static boolean m145209d(View view) {
            return view.isLayoutDirectionResolved();
        }

        /* renamed from: e */
        public static void m145210e(ViewParent viewParent, View view, View view2, int i) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i);
        }

        /* renamed from: f */
        public static void m145211f(View view, int i) {
            view.setAccessibilityLiveRegion(i);
        }

        /* renamed from: g */
        public static void m145212g(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    /* renamed from: e3.u$f */
    public static class C107212f {
        /* renamed from: a */
        public static WindowInsets m145213a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        /* renamed from: b */
        public static WindowInsets m145214b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        /* renamed from: c */
        public static void m145215c(View view) {
            view.requestApplyInsets();
        }
    }

    /* renamed from: e3.u$g */
    public static class C107213g {

        /* renamed from: e3.u$g$a */
        public class C107214a implements View.OnApplyWindowInsetsListener {

            /* renamed from: d */
            public C107179f0 f320812d = null;

            /* renamed from: e */
            public final /* synthetic */ View f320813e;

            /* renamed from: f */
            public final /* synthetic */ C107204q f320814f;

            public C107214a(View view, C107204q qVar) {
                this.f320813e = view;
                this.f320814f = qVar;
            }

            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                C107179f0 g = C107179f0.m145061g(windowInsets, view);
                int i = Build.VERSION.SDK_INT;
                if (i < 30) {
                    C107213g.m145216a(windowInsets, this.f320813e);
                    if (g.equals(this.f320812d)) {
                        return this.f320814f.mo12075a(view, g).mo157635f();
                    }
                }
                this.f320812d = g;
                C107179f0 a = this.f320814f.mo12075a(view, g);
                if (i >= 30) {
                    return a.mo157635f();
                }
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                C107212f.m145215c(view);
                return a.mo157635f();
            }
        }

        /* renamed from: a */
        public static void m145216a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(C0966R.C0970id.keu);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        /* renamed from: b */
        public static C107179f0 m145217b(View view, C107179f0 f0Var, Rect rect) {
            WindowInsets f = f0Var.mo157635f();
            if (f != null) {
                return C107179f0.m145061g(view.computeSystemWindowInsets(f, rect), view);
            }
            rect.setEmpty();
            return f0Var;
        }

        /* renamed from: c */
        public static boolean m145218c(View view, float f, float f2, boolean z) {
            return view.dispatchNestedFling(f, f2, z);
        }

        /* renamed from: d */
        public static boolean m145219d(View view, float f, float f2) {
            return view.dispatchNestedPreFling(f, f2);
        }

        /* renamed from: e */
        public static boolean m145220e(View view, int i, int i2, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
        }

        /* renamed from: f */
        public static boolean m145221f(View view, int i, int i2, int i3, int i4, int[] iArr) {
            return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
        }

        /* renamed from: g */
        public static ColorStateList m145222g(View view) {
            return view.getBackgroundTintList();
        }

        /* renamed from: h */
        public static PorterDuff.Mode m145223h(View view) {
            return view.getBackgroundTintMode();
        }

        /* renamed from: i */
        public static float m145224i(View view) {
            return view.getElevation();
        }

        /* renamed from: j */
        public static C107179f0 m145225j(View view) {
            if (C107179f0.C107180a.f320770d && view.isAttachedToWindow()) {
                try {
                    Object obj = C107179f0.C107180a.f320767a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) C107179f0.C107180a.f320768b.get(obj);
                        Rect rect2 = (Rect) C107179f0.C107180a.f320769c.get(obj);
                        if (!(rect == null || rect2 == null)) {
                            int i = Build.VERSION.SDK_INT;
                            C107179f0.C107184e dVar = i >= 30 ? new C107179f0.C107183d() : i >= 29 ? new C107179f0.C107182c() : new C107179f0.C107181b();
                            dVar.mo157638c(C111711b.m152275a(rect.left, rect.top, rect.right, rect.bottom));
                            dVar.mo157639d(C111711b.m152275a(rect2.left, rect2.top, rect2.right, rect2.bottom));
                            C107179f0 b = dVar.mo157637b();
                            b.f320766a.mo157650r(b);
                            b.f320766a.mo157641d(view.getRootView());
                            return b;
                        }
                    }
                } catch (IllegalAccessException e) {
                    e.getMessage();
                }
            }
            return null;
        }

        /* renamed from: k */
        public static String m145226k(View view) {
            return view.getTransitionName();
        }

        /* renamed from: l */
        public static float m145227l(View view) {
            return view.getTranslationZ();
        }

        /* renamed from: m */
        public static float m145228m(View view) {
            return view.getZ();
        }

        /* renamed from: n */
        public static boolean m145229n(View view) {
            return view.hasNestedScrollingParent();
        }

        /* renamed from: o */
        public static boolean m145230o(View view) {
            return view.isImportantForAccessibility();
        }

        /* renamed from: p */
        public static boolean m145231p(View view) {
            return view.isNestedScrollingEnabled();
        }

        /* renamed from: q */
        public static void m145232q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        /* renamed from: r */
        public static void m145233r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        /* renamed from: s */
        public static void m145234s(View view, float f) {
            view.setElevation(f);
        }

        /* renamed from: t */
        public static void m145235t(View view, boolean z) {
            view.setNestedScrollingEnabled(z);
        }

        /* renamed from: u */
        public static void m145236u(View view, C107204q qVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(C0966R.C0970id.kef, qVar);
            }
            if (qVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(C0966R.C0970id.keu));
            } else {
                view.setOnApplyWindowInsetsListener(new C107214a(view, qVar));
            }
        }

        /* renamed from: v */
        public static void m145237v(View view, String str) {
            view.setTransitionName(str);
        }

        /* renamed from: w */
        public static void m145238w(View view, float f) {
            view.setTranslationZ(f);
        }

        /* renamed from: x */
        public static void m145239x(View view, float f) {
            view.setZ(f);
        }

        /* renamed from: y */
        public static boolean m145240y(View view, int i) {
            return view.startNestedScroll(i);
        }

        /* renamed from: z */
        public static void m145241z(View view) {
            view.stopNestedScroll();
        }
    }

    /* renamed from: e3.u$h */
    public static class C107215h {
        /* renamed from: a */
        public static C107179f0 m145242a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            C107179f0 g = C107179f0.m145061g(rootWindowInsets, (View) null);
            g.f320766a.mo157650r(g);
            g.f320766a.mo157641d(view.getRootView());
            return g;
        }

        /* renamed from: b */
        public static int m145243b(View view) {
            return view.getScrollIndicators();
        }

        /* renamed from: c */
        public static void m145244c(View view, int i) {
            view.setScrollIndicators(i);
        }

        /* renamed from: d */
        public static void m145245d(View view, int i, int i2) {
            view.setScrollIndicators(i, i2);
        }
    }

    /* renamed from: e3.u$i */
    public static class C107216i {
        /* renamed from: a */
        public static void m145246a(View view) {
            view.cancelDragAndDrop();
        }

        /* renamed from: b */
        public static void m145247b(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        /* renamed from: c */
        public static void m145248c(View view) {
            view.dispatchStartTemporaryDetach();
        }

        /* renamed from: d */
        public static void m145249d(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        /* renamed from: e */
        public static boolean m145250e(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i);
        }

        /* renamed from: f */
        public static void m145251f(View view, View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    /* renamed from: e3.u$j */
    public static class C107217j {
        /* renamed from: a */
        public static void m145252a(View view, Collection<View> collection, int i) {
            view.addKeyboardNavigationClusters(collection, i);
        }

        /* renamed from: b */
        public static int m145253b(View view) {
            return view.getImportantForAutofill();
        }

        /* renamed from: c */
        public static int m145254c(View view) {
            return view.getNextClusterForwardId();
        }

        /* renamed from: d */
        public static boolean m145255d(View view) {
            return view.hasExplicitFocusable();
        }

        /* renamed from: e */
        public static boolean m145256e(View view) {
            return view.isFocusedByDefault();
        }

        /* renamed from: f */
        public static boolean m145257f(View view) {
            return view.isImportantForAutofill();
        }

        /* renamed from: g */
        public static boolean m145258g(View view) {
            return view.isKeyboardNavigationCluster();
        }

        /* renamed from: h */
        public static View m145259h(View view, View view2, int i) {
            return view.keyboardNavigationClusterSearch(view2, i);
        }

        /* renamed from: i */
        public static boolean m145260i(View view) {
            return view.restoreDefaultFocus();
        }

        /* renamed from: j */
        public static void m145261j(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        /* renamed from: k */
        public static void m145262k(View view, boolean z) {
            view.setFocusedByDefault(z);
        }

        /* renamed from: l */
        public static void m145263l(View view, int i) {
            view.setImportantForAutofill(i);
        }

        /* renamed from: m */
        public static void m145264m(View view, boolean z) {
            view.setKeyboardNavigationCluster(z);
        }

        /* renamed from: n */
        public static void m145265n(View view, int i) {
            view.setNextClusterForwardId(i);
        }

        /* renamed from: o */
        public static void m145266o(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* renamed from: e3.u$k */
    public static class C107218k {
        /* renamed from: a */
        public static void m145267a(View view, C107220n nVar) {
            C111059i iVar = (C111059i) view.getTag(C0966R.C0970id.kes);
            if (iVar == null) {
                iVar = new C111059i();
                view.setTag(C0966R.C0970id.kes, iVar);
            }
            Objects.requireNonNull(nVar);
            u$k$$a u_k__a = new u$k$$a(nVar);
            iVar.put(nVar, u_k__a);
            view.addOnUnhandledKeyEventListener(u_k__a);
        }

        /* renamed from: b */
        public static CharSequence m145268b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        /* renamed from: c */
        public static boolean m145269c(View view) {
            return view.isAccessibilityHeading();
        }

        /* renamed from: d */
        public static boolean m145270d(View view) {
            return view.isScreenReaderFocusable();
        }

        /* renamed from: e */
        public static void m145271e(View view, C107220n nVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            C111059i iVar = (C111059i) view.getTag(C0966R.C0970id.kes);
            if (iVar != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) iVar.getOrDefault(nVar, null)) != null) {
                view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
            }
        }

        /* renamed from: f */
        public static <T> T m145272f(View view, int i) {
            return view.requireViewById(i);
        }

        /* renamed from: g */
        public static void m145273g(View view, boolean z) {
            view.setAccessibilityHeading(z);
        }

        /* renamed from: h */
        public static void m145274h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        /* renamed from: i */
        public static void m145275i(View view, boolean z) {
            view.setScreenReaderFocusable(z);
        }
    }

    /* renamed from: e3.u$l */
    public static class C107219l {
        /* renamed from: a */
        public static View.AccessibilityDelegate m145276a(View view) {
            return view.getAccessibilityDelegate();
        }

        /* renamed from: b */
        public static List<Rect> m145277b(View view) {
            return view.getSystemGestureExclusionRects();
        }

        /* renamed from: c */
        public static void m145278c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }

        /* renamed from: d */
        public static void m145279d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* renamed from: e3.u$n */
    public interface C107220n {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    /* renamed from: e3.u$o */
    public static class C107221o {

        /* renamed from: d */
        public static final ArrayList<WeakReference<View>> f320815d = new ArrayList<>();

        /* renamed from: a */
        public WeakHashMap<View, Boolean> f320816a = null;

        /* renamed from: b */
        public SparseArray<WeakReference<View>> f320817b = null;

        /* renamed from: c */
        public WeakReference<KeyEvent> f320818c = null;

        /* renamed from: a */
        public final View mo157679a(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f320816a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View a = mo157679a(viewGroup.getChildAt(childCount), keyEvent);
                        if (a != null) {
                            return a;
                        }
                    }
                }
                if (mo157680b(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* renamed from: b */
        public final boolean mo157680b(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(C0966R.C0970id.kes);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((C107220n) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }
    }

    static {
        new AtomicInteger(1);
        new WeakHashMap();
    }

    /* renamed from: a */
    public static C107168a0 m145160a(View view) {
        if (f320808a == null) {
            f320808a = new WeakHashMap<>();
        }
        C107168a0 a0Var = f320808a.get(view);
        if (a0Var != null) {
            return a0Var;
        }
        C107168a0 a0Var2 = new C107168a0(view);
        f320808a.put(view, a0Var2);
        return a0Var2;
    }

    /* renamed from: b */
    public static boolean m145161b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList<WeakReference<View>> arrayList = C107221o.f320815d;
        C107221o oVar = (C107221o) view.getTag(C0966R.C0970id.ker);
        if (oVar == null) {
            oVar = new C107221o();
            view.setTag(C0966R.C0970id.ker, oVar);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap<View, Boolean> weakHashMap = oVar.f320816a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList2 = C107221o.f320815d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    if (oVar.f320816a == null) {
                        oVar.f320816a = new WeakHashMap<>();
                    }
                    int size = arrayList2.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        ArrayList<WeakReference<View>> arrayList3 = C107221o.f320815d;
                        View view2 = (View) arrayList3.get(size).get();
                        if (view2 == null) {
                            arrayList3.remove(size);
                        } else {
                            oVar.f320816a.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                oVar.f320816a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View a = oVar.mo157679a(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a != null && !KeyEvent.isModifierKey(keyCode)) {
                if (oVar.f320817b == null) {
                    oVar.f320817b = new SparseArray<>();
                }
                oVar.f320817b.put(keyCode, new WeakReference(a));
            }
        }
        return a != null;
    }

    /* renamed from: c */
    public static View.AccessibilityDelegate m145162c(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return C107219l.m145276a(view);
        }
        if (f320810c) {
            return null;
        }
        if (f320809b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f320809b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f320810c = true;
                return null;
            }
        }
        try {
            Object obj = f320809b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f320810c = true;
            return null;
        }
    }

    /* renamed from: d */
    public static Rect m145163d() {
        if (f320811d == null) {
            f320811d = new ThreadLocal<>();
        }
        Rect rect = f320811d.get();
        if (rect == null) {
            rect = new Rect();
            f320811d.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    /* renamed from: e */
    public static C107179f0 m145164e(View view) {
        return Build.VERSION.SDK_INT >= 23 ? C107215h.m145242a(view) : C107213g.m145225j(view);
    }

    /* renamed from: f */
    public static void m145165f(View view, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i);
            return;
        }
        Rect d = m145163d();
        boolean z = false;
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            d.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !d.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            m145172m(view);
            ViewParent parent2 = view.getParent();
            if (parent2 instanceof View) {
                m145172m((View) parent2);
            }
        }
        if (z && d.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(d);
        }
    }

    /* renamed from: g */
    public static void m145166g(View view, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i);
            return;
        }
        Rect d = m145163d();
        boolean z = false;
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            d.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !d.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            m145172m(view);
            ViewParent parent2 = view.getParent();
            if (parent2 instanceof View) {
                m145172m((View) parent2);
            }
        }
        if (z && d.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(d);
        }
    }

    /* renamed from: h */
    public static C107179f0 m145167h(View view, C107179f0 f0Var) {
        WindowInsets f = f0Var.mo157635f();
        if (f != null) {
            WindowInsets b = C107212f.m145214b(view, f);
            if (!b.equals(f)) {
                return C107179f0.m145061g(b, view);
            }
        }
        return f0Var;
    }

    /* renamed from: i */
    public static void m145168i(View view, C107166a aVar) {
        if (aVar == null && (m145162c(view) instanceof C107166a.C107167a)) {
            aVar = new C107166a();
        }
        view.setAccessibilityDelegate(aVar == null ? null : aVar.getBridge());
    }

    @Deprecated
    /* renamed from: j */
    public static void m145169j(View view, float f) {
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(f));
        C117292a.m165358d(view, aVar.mo10232b(), "androidx/core/view/ViewCompat", "setAlpha", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "androidx/core/view/ViewCompat", "setAlpha", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    /* renamed from: k */
    public static void m145170k(View view, C107205s sVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            C107216i.m145249d(view, (PointerIcon) (sVar != null ? sVar.f320807a : null));
        }
    }

    /* renamed from: l */
    public static void m145171l(View view, int i) {
        if (view instanceof C107198j) {
            ((C107198j) view).mo17026L(i);
        } else if (i == 0) {
            C107213g.m145241z(view);
        }
    }

    /* renamed from: m */
    public static void m145172m(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }
}
