package com.tencent.p014mm.accessibility.core.area;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.tencent.p014mm.accessibility.base.ViewTag;
import com.tencent.p014mm.accessibility.core.ViewTagManager;
import com.tencent.p014mm.accessibility.uitl.IdUtil;
import com.tencent.p014mm.accessibility.uitl.TimeBlocker;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b \u0010!J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\u0016\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0004J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R&\u0010\u001b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001a\u0012\u0004\u0012\u00020\u00040\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006#"}, mo182094d2 = {"Lcom/tencent/mm/accessibility/core/area/ExpandTouchDelegate;", "Landroid/view/TouchDelegate;", "Landroid/view/View;", "view", "Landroid/graphics/Rect;", "rectKey", "Lrx3/b0;", "putRect", "reset", "rect", "addDelegateChild", "Landroid/view/MotionEvent;", "event", "", "onTouchEvent", "onTouchExplorationHoverEvent", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/ViewGroup;", "mDelegateTargeted", "Z", "mTargetedRect", "Landroid/graphics/Rect;", "mTargetedView", "Landroid/view/View;", "", "Ljava/lang/ref/WeakReference;", "viewRectMap", "Ljava/util/Map;", "", "lastEventCode", "Ljava/lang/Integer;", "<init>", "(Landroid/view/ViewGroup;)V", "Companion", "plugin-autoaccessibility_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.accessibility.core.area.ExpandTouchDelegate */
public final class ExpandTouchDelegate extends TouchDelegate {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((C8480h) null);
    public static final String TAG = "MicroMsg.Acc.ExpandTouchDelegate";
    /* access modifiers changed from: private */
    public static Method getListenerInfoMethod;
    /* access modifiers changed from: private */
    public static final ExpandTouchDelegate$Companion$layoutChangeListener$1 layoutChangeListener = new ExpandTouchDelegate$Companion$layoutChangeListener$1();
    /* access modifiers changed from: private */
    public static Field mOnTouchListenerField;
    /* access modifiers changed from: private */
    public static boolean successReflect;
    /* access modifiers changed from: private */
    public static boolean tryReflect;
    private Integer lastEventCode;
    private boolean mDelegateTargeted;
    private Rect mTargetedRect;
    private View mTargetedView;
    private final ViewGroup parentView;
    private final Map<WeakReference<View>, Rect> viewRectMap = new LinkedHashMap();

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ExpandTouchDelegate(android.view.ViewGroup r2) {
        /*
            r1 = this;
            java.lang.String r0 = "parentView"
            gy3.C87412m.m108594g(r2, r0)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.getHitRect(r0)
            r1.<init>(r0, r2)
            r1.parentView = r2
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            r1.viewRectMap = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.accessibility.core.area.ExpandTouchDelegate.<init>(android.view.ViewGroup):void");
    }

    private final synchronized void putRect(View view, Rect rect) {
        for (WeakReference next : this.viewRectMap.keySet()) {
            View view2 = (View) next.get();
            boolean z = false;
            if (view2 != null && view2.hashCode() == view.hashCode()) {
                z = true;
                continue;
            }
            if (z) {
                this.viewRectMap.put(next, rect);
                return;
            }
        }
        this.viewRectMap.put(new WeakReference(view), rect);
    }

    private final void reset() {
        this.mTargetedRect = null;
        this.mTargetedView = null;
        this.mDelegateTargeted = false;
    }

    public final void addDelegateChild(View view, Rect rect) {
        C87412m.m108594g(view, "view");
        C87412m.m108594g(rect, "rect");
        putRect(view, new Rect(rect));
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        C87412m.m108594g(motionEvent, "event");
        int hashCode = motionEvent.hashCode();
        Integer num = this.lastEventCode;
        boolean z2 = false;
        if (num != null && hashCode == num.intValue()) {
            return false;
        }
        this.lastEventCode = Integer.valueOf(motionEvent.hashCode());
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (!(actionMasked == 1 || actionMasked == 2)) {
                if (actionMasked == 3) {
                    z = this.mDelegateTargeted;
                } else if (!(actionMasked == 5 || actionMasked == 6)) {
                    z = false;
                }
            }
            z = this.mDelegateTargeted;
        } else {
            boolean z3 = false;
            for (Map.Entry entry : this.viewRectMap.entrySet()) {
                if (((Rect) entry.getValue()).contains(x, y)) {
                    View view = (View) ((WeakReference) entry.getKey()).get();
                    if (view == null) {
                        return false;
                    }
                    if (view.getVisibility() == 0 && view.isShown()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("hit view ");
                        IdUtil idUtil = IdUtil.INSTANCE;
                        View view2 = (View) ((WeakReference) entry.getKey()).get();
                        sb.append(idUtil.getName(view2 != null ? view2.getId() : 0));
                        sb.append(" in parent ");
                        sb.append(idUtil.getName(this.parentView.getId()));
                        sb.append(", parent isClickable:");
                        sb.append(this.parentView.isClickable());
                        sb.append(", isLongClickable: ");
                        sb.append(this.parentView.isLongClickable());
                        Log.m105918d(TAG, sb.toString());
                        this.mTargetedRect = (Rect) entry.getValue();
                        this.mTargetedView = (View) ((WeakReference) entry.getKey()).get();
                        this.mDelegateTargeted = true;
                        z3 = true;
                    }
                }
            }
            if (!z3) {
                reset();
            }
            z = this.mDelegateTargeted;
        }
        View view3 = this.mTargetedView;
        Rect rect = this.mTargetedRect;
        if (!(!z || view3 == null || rect == null)) {
            motionEvent.setLocation(((float) view3.getWidth()) / 2.0f, ((float) view3.getHeight()) / 2.0f);
            z2 = view3.dispatchTouchEvent(motionEvent);
        }
        this.lastEventCode = null;
        if (3 == motionEvent.getActionMasked()) {
            reset();
        }
        return z2;
    }

    public boolean onTouchExplorationHoverEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "event");
        return false;
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000O\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u001e\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b'\u0010(J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0012\u0010\f\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J.\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000fJ.\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000fJ8\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000fR\u0014\u0010\u0019\u001a\u00020\u00188\u0006XT¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b&\u0010%¨\u0006)"}, mo182094d2 = {"Lcom/tencent/mm/accessibility/core/area/ExpandTouchDelegate$Companion;", "", "Landroid/view/View;", "view", "Lrx3/b0;", "setDelegate", "Landroid/view/ViewGroup;", "parent", "Landroid/graphics/Rect;", "rectInParent", "", "isOutBound", "checkHasTouchListener", "getParentCached", "saveParent", "", "eLeft", "eTop", "eRight", "eBottom", "expand", "v", "outRectInParent", "findLargeParentPath", "", "TAG", "Ljava/lang/String;", "Ljava/lang/reflect/Method;", "getListenerInfoMethod", "Ljava/lang/reflect/Method;", "com/tencent/mm/accessibility/core/area/ExpandTouchDelegate$Companion$layoutChangeListener$1", "layoutChangeListener", "Lcom/tencent/mm/accessibility/core/area/ExpandTouchDelegate$Companion$layoutChangeListener$1;", "Ljava/lang/reflect/Field;", "mOnTouchListenerField", "Ljava/lang/reflect/Field;", "successReflect", "Z", "tryReflect", "<init>", "()V", "plugin-autoaccessibility_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.accessibility.core.area.ExpandTouchDelegate$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }

        private final boolean checkHasTouchListener(View view) {
            if (view == null) {
                return false;
            }
            if (ExpandTouchDelegate.tryReflect && !ExpandTouchDelegate.successReflect) {
                return false;
            }
            if (!ExpandTouchDelegate.tryReflect) {
                try {
                    ExpandTouchDelegate.getListenerInfoMethod = View.class.getDeclaredMethod("getListenerInfo", new Class[0]);
                    Method access$getGetListenerInfoMethod$cp = ExpandTouchDelegate.getListenerInfoMethod;
                    if (access$getGetListenerInfoMethod$cp != null) {
                        access$getGetListenerInfoMethod$cp.setAccessible(true);
                    }
                    ExpandTouchDelegate.mOnTouchListenerField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener");
                    Field access$getMOnTouchListenerField$cp = ExpandTouchDelegate.mOnTouchListenerField;
                    if (access$getMOnTouchListenerField$cp != null) {
                        access$getMOnTouchListenerField$cp.setAccessible(true);
                    }
                    ExpandTouchDelegate.successReflect = true;
                } catch (Throwable th) {
                    Log.printErrStackTrace(ExpandTouchDelegate.TAG, th, "tryReflect error in checkHasTouchListener", new Object[0]);
                }
                ExpandTouchDelegate.tryReflect = true;
            }
            if (!(!ExpandTouchDelegate.successReflect || ExpandTouchDelegate.getListenerInfoMethod == null || ExpandTouchDelegate.mOnTouchListenerField == null)) {
                try {
                    Field access$getMOnTouchListenerField$cp2 = ExpandTouchDelegate.mOnTouchListenerField;
                    Method access$getGetListenerInfoMethod$cp2 = ExpandTouchDelegate.getListenerInfoMethod;
                    if (!(access$getMOnTouchListenerField$cp2 == null || access$getGetListenerInfoMethod$cp2 == null || access$getMOnTouchListenerField$cp2.get(access$getGetListenerInfoMethod$cp2.invoke(view, new Object[0])) == null)) {
                        Log.m105918d(ExpandTouchDelegate.TAG, "checkHasTouchListener return true with view(" + IdUtil.INSTANCE.getName(view.getId()) + ')');
                        return true;
                    }
                } catch (Throwable th4) {
                    Log.printErrStackTrace(ExpandTouchDelegate.TAG, th4, "successReflect but invoke error in checkHasTouchListener", new Object[0]);
                }
            }
            return false;
        }

        private final ViewGroup getParentCached(View view) {
            ViewTag tagData = ViewTagManager.INSTANCE.getTagData(view);
            WeakReference<ViewGroup> touchDelegateParent = tagData != null ? tagData.getTouchDelegateParent() : null;
            if (!(touchDelegateParent instanceof WeakReference)) {
                touchDelegateParent = null;
            }
            if (touchDelegateParent == null) {
                return null;
            }
            ViewGroup viewGroup = touchDelegateParent.get();
            if (viewGroup instanceof ViewGroup) {
                return viewGroup;
            }
            return null;
        }

        private final boolean isOutBound(ViewGroup viewGroup, Rect rect) {
            return viewGroup.getHeight() < rect.bottom || viewGroup.getWidth() < rect.right || rect.top < 0 || rect.left < 0;
        }

        private final void saveParent(View view, ViewGroup viewGroup) {
            ViewTag tagData = ViewTagManager.INSTANCE.getTagData(view);
            if (tagData != null) {
                tagData.setTouchDelegateParent(viewGroup != null ? new WeakReference(viewGroup) : null);
            }
        }

        /* access modifiers changed from: private */
        public final void setDelegate(View view) {
            ViewTag tagData = ViewTagManager.INSTANCE.getTagData(view);
            if (tagData != null) {
                Integer eLeft = tagData.getELeft();
                Integer eTop = tagData.getETop();
                Integer eRight = tagData.getERight();
                Integer eBottom = tagData.getEBottom();
                if (eLeft != null && eTop != null && eRight != null && eBottom != null) {
                    int intValue = eBottom.intValue();
                    int intValue2 = eRight.intValue();
                    int intValue3 = eTop.intValue();
                    ExpandTouchDelegate.Companion.setDelegate(view, eLeft.intValue(), intValue3, intValue2, intValue);
                }
            }
        }

        public final void expand(View view, int i, int i2, int i3, int i4) {
            C87412m.m108594g(view, "view");
            ViewTag tagData = ViewTagManager.INSTANCE.getTagData(view);
            if (tagData != null) {
                tagData.setELeft(Integer.valueOf(i));
                tagData.setETop(Integer.valueOf(i2));
                tagData.setERight(Integer.valueOf(i3));
                tagData.setEBottom(Integer.valueOf(i4));
            }
            TimeBlocker.INSTANCE.pendingExcu(view, "addOnLayoutChangeListener", new ExpandTouchDelegate$Companion$expand$2(view));
            setDelegate(view);
        }

        public final ViewGroup findLargeParentPath(View view, Rect rect, int i, int i2, int i3, int i4) {
            C87412m.m108594g(view, "view");
            C87412m.m108594g(rect, "outRectInParent");
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup == null) {
                return null;
            }
            view.getHitRect(rect);
            rect.left -= i;
            rect.top -= i2;
            rect.right += i3;
            rect.bottom += i4;
            ViewGroup parentCached = getParentCached(view);
            if (parentCached != null) {
                try {
                    parentCached.offsetDescendantRectToMyCoords(viewGroup, rect);
                    return parentCached;
                } catch (IllegalArgumentException e) {
                    Log.m105920e(ExpandTouchDelegate.TAG, "getParentCached: throw " + e.getMessage());
                    ExpandTouchDelegate.Companion.saveParent(view, (ViewGroup) null);
                }
            }
            while (viewGroup != null) {
                if (!isOutBound(viewGroup, rect) || viewGroup.isClickable() || viewGroup.isLongClickable() || checkHasTouchListener(viewGroup)) {
                    saveParent(view, viewGroup);
                    return viewGroup;
                } else if (!(viewGroup.getParent() instanceof ViewGroup)) {
                    return null;
                } else {
                    ViewParent parent2 = viewGroup.getParent();
                    ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
                    if (viewGroup2 != null) {
                        try {
                            viewGroup2.offsetDescendantRectToMyCoords(viewGroup, rect);
                        } catch (IllegalArgumentException e2) {
                            Log.m105920e(ExpandTouchDelegate.TAG, "findLargeParentPath: throw " + e2.getMessage());
                            return null;
                        }
                    }
                    viewGroup = viewGroup2;
                }
            }
            return null;
        }

        /* JADX WARNING: type inference failed for: r11v7, types: [rx3.b0] */
        /* JADX WARNING: type inference failed for: r12v5, types: [android.view.TouchDelegate] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void setDelegate(android.view.View r9, int r10, int r11, int r12, int r13) {
            /*
                r8 = this;
                java.lang.String r0 = "v"
                gy3.C87412m.m108594g(r9, r0)
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                r1 = r8
                r2 = r9
                r3 = r0
                r4 = r10
                r5 = r11
                r6 = r12
                r7 = r13
                android.view.ViewGroup r10 = r1.findLargeParentPath(r2, r3, r4, r5, r6, r7)
                r11 = 0
                if (r10 == 0) goto L_0x0059
                android.view.TouchDelegate r12 = r10.getTouchDelegate()
                boolean r13 = r12 instanceof com.tencent.p014mm.accessibility.core.area.ExpandTouchDelegate
                if (r13 == 0) goto L_0x0023
                com.tencent.mm.accessibility.core.area.ExpandTouchDelegate r12 = (com.tencent.p014mm.accessibility.core.area.ExpandTouchDelegate) r12
                goto L_0x0024
            L_0x0023:
                r12 = r11
            L_0x0024:
                if (r12 == 0) goto L_0x002a
                r12.addDelegateChild(r9, r0)
                goto L_0x0042
            L_0x002a:
                com.tencent.mm.accessibility.core.area.ExpandTouchDelegate r12 = new com.tencent.mm.accessibility.core.area.ExpandTouchDelegate
                r12.<init>(r10)
                r10.setTouchDelegate(r12)
                android.view.TouchDelegate r12 = r10.getTouchDelegate()
                boolean r13 = r12 instanceof com.tencent.p014mm.accessibility.core.area.ExpandTouchDelegate
                if (r13 == 0) goto L_0x003d
                r11 = r12
                com.tencent.mm.accessibility.core.area.ExpandTouchDelegate r11 = (com.tencent.p014mm.accessibility.core.area.ExpandTouchDelegate) r11
            L_0x003d:
                if (r11 == 0) goto L_0x0042
                r11.addDelegateChild(r9, r0)
            L_0x0042:
                com.tencent.mm.accessibility.core.ViewTagManager r11 = com.tencent.p014mm.accessibility.core.ViewTagManager.INSTANCE
                com.tencent.mm.accessibility.base.ViewTag r11 = r11.getTagData(r9)
                if (r11 != 0) goto L_0x004b
                goto L_0x0057
            L_0x004b:
                java.lang.ref.WeakReference r12 = new java.lang.ref.WeakReference
                android.view.TouchDelegate r10 = r10.getTouchDelegate()
                r12.<init>(r10)
                r11.setTouchDelegate(r12)
            L_0x0057:
                rx3.b0 r11 = rx3.C13598b0.f38549a
            L_0x0059:
                if (r11 != 0) goto L_0x007b
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "expand parent null? "
                r10.append(r11)
                com.tencent.mm.accessibility.uitl.IdUtil r11 = com.tencent.p014mm.accessibility.uitl.IdUtil.INSTANCE
                int r9 = r9.getId()
                java.lang.String r9 = r11.getName(r9)
                r10.append(r9)
                java.lang.String r9 = r10.toString()
                java.lang.String r10 = "MicroMsg.Acc.ExpandTouchDelegate"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r9)
            L_0x007b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.accessibility.core.area.ExpandTouchDelegate.Companion.setDelegate(android.view.View, int, int, int, int):void");
        }
    }
}
