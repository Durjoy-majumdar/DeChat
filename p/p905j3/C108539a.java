package p905j3;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p1042u.C111060j;
import p1108f3.C107453d;
import p1108f3.C107457e;
import p849e3.C107166a;
import p849e3.C107168a0;
import p849e3.C107207u;
import p905j3.C108543b;

/* renamed from: j3.a */
public abstract class C108539a extends C107166a {
    private static final String DEFAULT_CLASS_NAME = "android.view.View";
    public static final int HOST_ID = -1;
    public static final int INVALID_ID = Integer.MIN_VALUE;
    private static final Rect INVALID_PARENT_BOUNDS = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    private static final C108543b.C108544a<C107453d> NODE_ADAPTER = new C108540a();
    private static final C108543b.C108545b<C111060j<C107453d>, C107453d> SPARSE_VALUES_ADAPTER = new C108541b();
    public int mAccessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
    private final View mHost;
    private int mHoveredVirtualViewId = Integer.MIN_VALUE;
    public int mKeyboardFocusedVirtualViewId = Integer.MIN_VALUE;
    private final AccessibilityManager mManager;
    private C108542c mNodeProvider;
    private final int[] mTempGlobalRect = new int[2];
    private final Rect mTempParentRect = new Rect();
    private final Rect mTempScreenRect = new Rect();
    private final Rect mTempVisibleRect = new Rect();

    /* renamed from: j3.a$a */
    public static class C108540a implements C108543b.C108544a<C107453d> {
    }

    /* renamed from: j3.a$b */
    public static class C108541b implements C108543b.C108545b<C111060j<C107453d>, C107453d> {
    }

    /* renamed from: j3.a$c */
    public class C108542c extends C107457e {
        public C108542c() {
        }

        /* renamed from: a */
        public C107453d mo157869a(int i) {
            return new C107453d(AccessibilityNodeInfo.obtain(C108539a.this.obtainAccessibilityNodeInfo(i).f321473a));
        }

        /* renamed from: b */
        public C107453d mo157870b(int i) {
            int i2 = i == 2 ? C108539a.this.mAccessibilityFocusedVirtualViewId : C108539a.this.mKeyboardFocusedVirtualViewId;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return mo157869a(i2);
        }

        /* renamed from: c */
        public boolean mo157871c(int i, int i2, Bundle bundle) {
            return C108539a.this.performAction(i, i2, bundle);
        }
    }

    public C108539a(View view) {
        if (view != null) {
            this.mHost = view;
            this.mManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            if (C107207u.C107208b.m145175c(view) == 0) {
                C107207u.C107208b.m145191s(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    private boolean clearAccessibilityFocus(int i) {
        if (this.mAccessibilityFocusedVirtualViewId != i) {
            return false;
        }
        this.mAccessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
        this.mHost.invalidate();
        sendEventForVirtualView(i, 65536);
        return true;
    }

    private boolean clickKeyboardFocusedVirtualView() {
        int i = this.mKeyboardFocusedVirtualViewId;
        return i != Integer.MIN_VALUE && onPerformActionForVirtualView(i, 16, (Bundle) null);
    }

    private AccessibilityEvent createEvent(int i, int i2) {
        return i != -1 ? createEventForChild(i, i2) : createEventForHost(i2);
    }

    private AccessibilityEvent createEventForChild(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        C107453d obtainAccessibilityNodeInfo = obtainAccessibilityNodeInfo(i);
        obtain.getText().add(obtainAccessibilityNodeInfo.mo157845f());
        obtain.setContentDescription(obtainAccessibilityNodeInfo.f321473a.getContentDescription());
        obtain.setScrollable(obtainAccessibilityNodeInfo.f321473a.isScrollable());
        obtain.setPassword(obtainAccessibilityNodeInfo.f321473a.isPassword());
        obtain.setEnabled(obtainAccessibilityNodeInfo.f321473a.isEnabled());
        obtain.setChecked(obtainAccessibilityNodeInfo.f321473a.isChecked());
        onPopulateEventForVirtualView(i, obtain);
        if (!obtain.getText().isEmpty() || obtain.getContentDescription() != null) {
            obtain.setClassName(obtainAccessibilityNodeInfo.f321473a.getClassName());
            obtain.setSource(this.mHost, i);
            obtain.setPackageName(this.mHost.getContext().getPackageName());
            return obtain;
        }
        throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
    }

    private AccessibilityEvent createEventForHost(int i) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
        this.mHost.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    private C107453d createNodeForChild(int i) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        C107453d dVar = new C107453d(obtain);
        dVar.mo157855o(true);
        dVar.mo157856p(true);
        dVar.mo157852l(DEFAULT_CLASS_NAME);
        Rect rect = INVALID_PARENT_BOUNDS;
        dVar.mo157849i(rect);
        dVar.mo157850j(rect);
        View view = this.mHost;
        dVar.f321474b = -1;
        obtain.setParent(view);
        onPopulateNodeForVirtualView(i, dVar);
        if (dVar.mo157845f() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        dVar.mo157842d(this.mTempParentRect);
        if (!this.mTempParentRect.equals(rect)) {
            int actions = obtain.getActions();
            if ((actions & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((actions & 128) == 0) {
                obtain.setPackageName(this.mHost.getContext().getPackageName());
                View view2 = this.mHost;
                dVar.f321475c = i;
                obtain.setSource(view2, i);
                if (this.mAccessibilityFocusedVirtualViewId == i) {
                    dVar.mo157846g(true);
                    dVar.mo157839a(128);
                } else {
                    dVar.mo157846g(false);
                    dVar.mo157839a(64);
                }
                boolean z = this.mKeyboardFocusedVirtualViewId == i;
                if (z) {
                    dVar.mo157839a(2);
                } else if (obtain.isFocusable()) {
                    dVar.mo157839a(1);
                }
                obtain.setFocused(z);
                this.mHost.getLocationOnScreen(this.mTempGlobalRect);
                obtain.getBoundsInScreen(this.mTempScreenRect);
                if (this.mTempScreenRect.equals(rect)) {
                    dVar.mo157842d(this.mTempScreenRect);
                    if (dVar.f321474b != -1) {
                        C107453d dVar2 = new C107453d(AccessibilityNodeInfo.obtain());
                        for (int i2 = dVar.f321474b; i2 != -1; i2 = dVar2.f321474b) {
                            View view3 = this.mHost;
                            dVar2.f321474b = -1;
                            dVar2.f321473a.setParent(view3, -1);
                            dVar2.mo157849i(INVALID_PARENT_BOUNDS);
                            onPopulateNodeForVirtualView(i2, dVar2);
                            dVar2.mo157842d(this.mTempParentRect);
                            Rect rect2 = this.mTempScreenRect;
                            Rect rect3 = this.mTempParentRect;
                            rect2.offset(rect3.left, rect3.top);
                        }
                        dVar2.f321473a.recycle();
                    }
                    this.mTempScreenRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
                }
                if (this.mHost.getLocalVisibleRect(this.mTempVisibleRect)) {
                    this.mTempVisibleRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
                    if (this.mTempScreenRect.intersect(this.mTempVisibleRect)) {
                        dVar.mo157850j(this.mTempScreenRect);
                        if (isVisibleToUser(this.mTempScreenRect)) {
                            dVar.f321473a.setVisibleToUser(true);
                        }
                    }
                }
                return dVar;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    private C107453d createNodeForHost() {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.mHost);
        C107453d dVar = new C107453d(obtain);
        View view = this.mHost;
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        view.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        if (obtain.getChildCount() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                dVar.f321473a.addChild(this.mHost, ((Integer) arrayList.get(i)).intValue());
            }
            return dVar;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    private C111060j<C107453d> getAllNodes() {
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        C111060j<C107453d> jVar = new C111060j<>();
        for (int i = 0; i < arrayList.size(); i++) {
            jVar.mo162807g(i, createNodeForChild(i));
        }
        return jVar;
    }

    private void getBoundsInParent(int i, Rect rect) {
        obtainAccessibilityNodeInfo(i).mo157842d(rect);
    }

    private static Rect guessPreviouslyFocusedRect(View view, int i, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i == 17) {
            rect.set(width, 0, width, height);
        } else if (i == 33) {
            rect.set(0, height, width, height);
        } else if (i == 66) {
            rect.set(-1, 0, -1, height);
        } else if (i == 130) {
            rect.set(0, -1, width, -1);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return rect;
    }

    private boolean isVisibleToUser(Rect rect) {
        if (rect == null || rect.isEmpty() || this.mHost.getWindowVisibility() != 0) {
            return false;
        }
        ViewParent parent = this.mHost.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    private static int keyToDirection(int i) {
        if (i == 19) {
            return 33;
        }
        if (i != 21) {
            return i != 22 ? 130 : 66;
        }
        return 17;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ef, code lost:
        if (r13 < (((r16 * 13) * r16) + (r17 * r17))) goto L_0x00f1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x00fa A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean moveFocus(int r20, android.graphics.Rect r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            u.j r3 = r19.getAllNodes()
            int r4 = r0.mKeyboardFocusedVirtualViewId
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 0
            if (r4 != r5) goto L_0x0013
            r4 = r6
            goto L_0x0019
        L_0x0013:
            java.lang.Object r4 = r3.mo162805e(r4, r6)
            f3.d r4 = (p1108f3.C107453d) r4
        L_0x0019:
            r7 = 2
            r8 = -1
            r9 = 0
            r10 = 1
            if (r1 == r10) goto L_0x0102
            if (r1 == r7) goto L_0x0102
            r7 = 130(0x82, float:1.82E-43)
            r11 = 66
            r12 = 33
            r13 = 17
            if (r1 == r13) goto L_0x003a
            if (r1 == r12) goto L_0x003a
            if (r1 == r11) goto L_0x003a
            if (r1 != r7) goto L_0x0032
            goto L_0x003a
        L_0x0032:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1.<init>(r2)
            throw r1
        L_0x003a:
            android.graphics.Rect r14 = new android.graphics.Rect
            r14.<init>()
            int r15 = r0.mKeyboardFocusedVirtualViewId
            if (r15 == r5) goto L_0x0047
            r0.getBoundsInParent(r15, r14)
            goto L_0x0052
        L_0x0047:
            if (r2 == 0) goto L_0x004d
            r14.set(r2)
            goto L_0x0052
        L_0x004d:
            android.view.View r2 = r0.mHost
            guessPreviouslyFocusedRect(r2, r1, r14)
        L_0x0052:
            j3.b$b<u.j<f3.d>, f3.d> r2 = SPARSE_VALUES_ADAPTER
            j3.b$a<f3.d> r15 = NODE_ADAPTER
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>(r14)
            if (r1 == r13) goto L_0x0088
            if (r1 == r12) goto L_0x007f
            if (r1 == r11) goto L_0x0075
            if (r1 != r7) goto L_0x006d
            int r7 = r14.height()
            int r7 = r7 + r10
            int r7 = -r7
            r5.offset(r9, r7)
            goto L_0x0090
        L_0x006d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1.<init>(r2)
            throw r1
        L_0x0075:
            int r7 = r14.width()
            int r7 = r7 + r10
            int r7 = -r7
            r5.offset(r7, r9)
            goto L_0x0090
        L_0x007f:
            int r7 = r14.height()
            int r7 = r7 + r10
            r5.offset(r9, r7)
            goto L_0x0090
        L_0x0088:
            int r7 = r14.width()
            int r7 = r7 + r10
            r5.offset(r7, r9)
        L_0x0090:
            j3.a$b r2 = (p905j3.C108539a.C108541b) r2
            r2.getClass()
            int r2 = r3.mo162808h()
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            r11 = 0
        L_0x009f:
            if (r11 >= r2) goto L_0x00fe
            java.lang.Object r12 = r3.mo162809j(r11)
            f3.d r12 = (p1108f3.C107453d) r12
            if (r12 != r4) goto L_0x00aa
            goto L_0x00fa
        L_0x00aa:
            r13 = r15
            j3.a$a r13 = (p905j3.C108539a.C108540a) r13
            r13.getClass()
            r12.mo157842d(r7)
            boolean r13 = p905j3.C108543b.m147108c(r14, r7, r1)
            if (r13 != 0) goto L_0x00ba
            goto L_0x00f3
        L_0x00ba:
            boolean r13 = p905j3.C108543b.m147108c(r14, r5, r1)
            if (r13 != 0) goto L_0x00c1
            goto L_0x00f1
        L_0x00c1:
            boolean r13 = p905j3.C108543b.m147106a(r1, r14, r7, r5)
            if (r13 == 0) goto L_0x00c8
            goto L_0x00f1
        L_0x00c8:
            boolean r13 = p905j3.C108543b.m147106a(r1, r14, r5, r7)
            if (r13 == 0) goto L_0x00cf
            goto L_0x00f3
        L_0x00cf:
            int r13 = p905j3.C108543b.m147109d(r1, r14, r7)
            int r16 = p905j3.C108543b.m147110e(r1, r14, r7)
            int r17 = r13 * 13
            int r17 = r17 * r13
            int r16 = r16 * r16
            int r13 = r17 + r16
            int r16 = p905j3.C108543b.m147109d(r1, r14, r5)
            int r17 = p905j3.C108543b.m147110e(r1, r14, r5)
            int r18 = r16 * 13
            int r18 = r18 * r16
            int r17 = r17 * r17
            int r9 = r18 + r17
            if (r13 >= r9) goto L_0x00f3
        L_0x00f1:
            r9 = 1
            goto L_0x00f4
        L_0x00f3:
            r9 = 0
        L_0x00f4:
            if (r9 == 0) goto L_0x00fa
            r5.set(r7)
            r6 = r12
        L_0x00fa:
            int r11 = r11 + 1
            r9 = 0
            goto L_0x009f
        L_0x00fe:
            f3.d r6 = (p1108f3.C107453d) r6
            goto L_0x016d
        L_0x0102:
            android.view.View r2 = r0.mHost
            java.util.WeakHashMap<android.view.View, e3.a0> r5 = p849e3.C107207u.f320808a
            int r2 = p849e3.C107207u.C107209c.m145195d(r2)
            if (r2 != r10) goto L_0x010e
            r2 = 1
            goto L_0x010f
        L_0x010e:
            r2 = 0
        L_0x010f:
            j3.b$b<u.j<f3.d>, f3.d> r5 = SPARSE_VALUES_ADAPTER
            j3.b$a<f3.d> r9 = NODE_ADAPTER
            j3.a$b r5 = (p905j3.C108539a.C108541b) r5
            r5.getClass()
            int r5 = r3.mo162808h()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r5)
            r12 = 0
        L_0x0122:
            if (r12 >= r5) goto L_0x0130
            java.lang.Object r13 = r3.mo162809j(r12)
            f3.d r13 = (p1108f3.C107453d) r13
            r11.add(r13)
            int r12 = r12 + 1
            goto L_0x0122
        L_0x0130:
            j3.b$c r5 = new j3.b$c
            r5.<init>(r2, r9)
            java.util.Collections.sort(r11, r5)
            if (r1 == r10) goto L_0x0159
            if (r1 != r7) goto L_0x0151
            int r1 = r11.size()
            if (r4 != 0) goto L_0x0144
            r2 = -1
            goto L_0x0148
        L_0x0144:
            int r2 = r11.lastIndexOf(r4)
        L_0x0148:
            int r2 = r2 + r10
            if (r2 >= r1) goto L_0x016b
            java.lang.Object r1 = r11.get(r2)
            r6 = r1
            goto L_0x016b
        L_0x0151:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}."
            r1.<init>(r2)
            throw r1
        L_0x0159:
            int r1 = r11.size()
            if (r4 != 0) goto L_0x0160
            goto L_0x0164
        L_0x0160:
            int r1 = r11.indexOf(r4)
        L_0x0164:
            int r1 = r1 + r8
            if (r1 < 0) goto L_0x016b
            java.lang.Object r6 = r11.get(r1)
        L_0x016b:
            f3.d r6 = (p1108f3.C107453d) r6
        L_0x016d:
            if (r6 != 0) goto L_0x0172
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x018d
        L_0x0172:
            boolean r1 = r3.f332585d
            if (r1 == 0) goto L_0x0179
            r3.mo162804d()
        L_0x0179:
            r9 = 0
        L_0x017a:
            int r1 = r3.f332588g
            if (r9 >= r1) goto L_0x0189
            java.lang.Object[] r1 = r3.f332587f
            r1 = r1[r9]
            if (r1 != r6) goto L_0x0186
            r8 = r9
            goto L_0x0189
        L_0x0186:
            int r9 = r9 + 1
            goto L_0x017a
        L_0x0189:
            int r5 = r3.mo162806f(r8)
        L_0x018d:
            boolean r1 = r0.requestKeyboardFocusForVirtualView(r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p905j3.C108539a.moveFocus(int, android.graphics.Rect):boolean");
    }

    private boolean performActionForChild(int i, int i2, Bundle bundle) {
        return i2 != 1 ? i2 != 2 ? i2 != 64 ? i2 != 128 ? onPerformActionForVirtualView(i, i2, bundle) : clearAccessibilityFocus(i) : requestAccessibilityFocus(i) : clearKeyboardFocusForVirtualView(i) : requestKeyboardFocusForVirtualView(i);
    }

    private boolean performActionForHost(int i, Bundle bundle) {
        View view = this.mHost;
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        return C107207u.C107208b.m145182j(view, i, bundle);
    }

    private boolean requestAccessibilityFocus(int i) {
        int i2;
        if (!this.mManager.isEnabled() || !this.mManager.isTouchExplorationEnabled() || (i2 = this.mAccessibilityFocusedVirtualViewId) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            clearAccessibilityFocus(i2);
        }
        this.mAccessibilityFocusedVirtualViewId = i;
        this.mHost.invalidate();
        sendEventForVirtualView(i, 32768);
        return true;
    }

    private void updateHoveredVirtualView(int i) {
        int i2 = this.mHoveredVirtualViewId;
        if (i2 != i) {
            this.mHoveredVirtualViewId = i;
            sendEventForVirtualView(i, 128);
            sendEventForVirtualView(i2, 256);
        }
    }

    public final boolean clearKeyboardFocusForVirtualView(int i) {
        if (this.mKeyboardFocusedVirtualViewId != i) {
            return false;
        }
        this.mKeyboardFocusedVirtualViewId = Integer.MIN_VALUE;
        onVirtualViewKeyboardFocusChanged(i, false);
        sendEventForVirtualView(i, 8);
        return true;
    }

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (!this.mManager.isEnabled() || !this.mManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int virtualViewAt = getVirtualViewAt(motionEvent.getX(), motionEvent.getY());
            updateHoveredVirtualView(virtualViewAt);
            return virtualViewAt != Integer.MIN_VALUE;
        } else if (action != 10 || this.mHoveredVirtualViewId == Integer.MIN_VALUE) {
            return false;
        } else {
            updateHoveredVirtualView(Integer.MIN_VALUE);
            return true;
        }
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 61) {
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (!keyEvent.hasNoModifiers()) {
                            return false;
                        }
                        int keyToDirection = keyToDirection(keyCode);
                        int repeatCount = keyEvent.getRepeatCount() + 1;
                        boolean z = false;
                        while (i < repeatCount && moveFocus(keyToDirection, (Rect) null)) {
                            i++;
                            z = true;
                        }
                        return z;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
                return false;
            }
            clickKeyboardFocusedVirtualView();
            return true;
        } else if (keyEvent.hasNoModifiers()) {
            return moveFocus(2, (Rect) null);
        } else {
            if (keyEvent.hasModifiers(1)) {
                return moveFocus(1, (Rect) null);
            }
            return false;
        }
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.mAccessibilityFocusedVirtualViewId;
    }

    public C107457e getAccessibilityNodeProvider(View view) {
        if (this.mNodeProvider == null) {
            this.mNodeProvider = new C108542c();
        }
        return this.mNodeProvider;
    }

    @Deprecated
    public int getFocusedVirtualView() {
        return getAccessibilityFocusedVirtualViewId();
    }

    public final int getKeyboardFocusedVirtualViewId() {
        return this.mKeyboardFocusedVirtualViewId;
    }

    public abstract int getVirtualViewAt(float f, float f2);

    public abstract void getVisibleVirtualViews(List<Integer> list);

    public final void invalidateRoot() {
        invalidateVirtualView(-1, 1);
    }

    public final void invalidateVirtualView(int i) {
        invalidateVirtualView(i, 0);
    }

    public C107453d obtainAccessibilityNodeInfo(int i) {
        return i == -1 ? createNodeForHost() : createNodeForChild(i);
    }

    public final void onFocusChanged(boolean z, int i, Rect rect) {
        int i2 = this.mKeyboardFocusedVirtualViewId;
        if (i2 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i2);
        }
        if (z) {
            moveFocus(i, rect);
        }
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        onPopulateEventForHost(accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(View view, C107453d dVar) {
        super.onInitializeAccessibilityNodeInfo(view, dVar);
        onPopulateNodeForHost(dVar);
    }

    public abstract boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle);

    public void onPopulateEventForHost(AccessibilityEvent accessibilityEvent) {
    }

    public void onPopulateEventForVirtualView(int i, AccessibilityEvent accessibilityEvent) {
    }

    public void onPopulateNodeForHost(C107453d dVar) {
    }

    public abstract void onPopulateNodeForVirtualView(int i, C107453d dVar);

    public void onVirtualViewKeyboardFocusChanged(int i, boolean z) {
    }

    public boolean performAction(int i, int i2, Bundle bundle) {
        return i != -1 ? performActionForChild(i, i2, bundle) : performActionForHost(i2, bundle);
    }

    public final boolean requestKeyboardFocusForVirtualView(int i) {
        int i2;
        if ((!this.mHost.isFocused() && !this.mHost.requestFocus()) || (i2 = this.mKeyboardFocusedVirtualViewId) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i2);
        }
        this.mKeyboardFocusedVirtualViewId = i;
        onVirtualViewKeyboardFocusChanged(i, true);
        sendEventForVirtualView(i, 8);
        return true;
    }

    public final boolean sendEventForVirtualView(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.mManager.isEnabled() || (parent = this.mHost.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.mHost, createEvent(i, i2));
    }

    public final void invalidateVirtualView(int i, int i2) {
        ViewParent parent;
        if (i != Integer.MIN_VALUE && this.mManager.isEnabled() && (parent = this.mHost.getParent()) != null) {
            AccessibilityEvent createEvent = createEvent(i, 2048);
            createEvent.setContentChangeTypes(i2);
            parent.requestSendAccessibilityEvent(this.mHost, createEvent);
        }
    }
}
