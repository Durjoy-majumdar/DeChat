package com.tencent.p014mm.plugin.finder.view.drawer;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import de1.C7290r;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import k20.C9556a;
import kotlin.Metadata;
import sn0.C90259e;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b/\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010d\u001a\u00020c\u0012\b\u0010f\u001a\u0004\u0018\u00010e¢\u0006\u0004\bg\u0010hB#\b\u0016\u0012\u0006\u0010d\u001a\u00020c\u0012\b\u0010f\u001a\u0004\u0018\u00010e\u0012\u0006\u0010i\u001a\u00020\u001a¢\u0006\u0004\bg\u0010jJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0006\u0010\b\u001a\u00020\u0003J\u0006\u0010\t\u001a\u00020\u0003J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0003R\"\u0010\u0012\u001a\u00020\u000f8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0019\u001a\u00020\u000f8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\"\u0010!\u001a\u00020\u001a8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010(\u001a\u00020\u00038\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010,\u001a\u00020\u00038\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b)\u0010#\u001a\u0004\b*\u0010%\"\u0004\b+\u0010'R\u001a\u00102\u001a\u00020-8\u0004X\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R \u00108\u001a\b\u0012\u0004\u0012\u00020\n038\u0004X\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R*\u0010;\u001a\u00020\u000f2\u0006\u00109\u001a\u00020\u000f8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b:\u0010\u0011\u001a\u0004\b;\u0010\u0013\"\u0004\b<\u0010\u0015R\"\u0010@\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b=\u0010#\u001a\u0004\b>\u0010%\"\u0004\b?\u0010'R\"\u0010D\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bA\u0010#\u001a\u0004\bB\u0010%\"\u0004\bC\u0010'R\"\u0010H\u001a\u00020\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bE\u0010\u0011\u001a\u0004\bF\u0010\u0013\"\u0004\bG\u0010\u0015R\u0014\u0010J\u001a\u00020\u00038DX\u0004¢\u0006\u0006\u001a\u0004\bI\u0010%R\u0014\u0010L\u001a\u00020\u00038DX\u0004¢\u0006\u0006\u001a\u0004\bK\u0010%R\u0014\u0010N\u001a\u00020\u00038DX\u0004¢\u0006\u0006\u001a\u0004\bM\u0010%R\u0014\u0010P\u001a\u00020\u00038DX\u0004¢\u0006\u0006\u001a\u0004\bO\u0010%R\u0014\u0010R\u001a\u00020\u001a8DX\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010\u001eR\u0014\u0010T\u001a\u00020\u001a8DX\u0004¢\u0006\u0006\u001a\u0004\bS\u0010\u001eR\u0011\u0010V\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bU\u0010%R\u0011\u0010X\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bW\u0010%R\u0011\u0010Z\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bY\u0010%R\u0011\u0010\\\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b[\u0010%R\u0011\u0010^\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b]\u0010%R\u0011\u0010`\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b_\u0010\u0013R$\u0010\r\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u00038F@FX\u000e¢\u0006\f\u001a\u0004\ba\u0010%\"\u0004\bb\u0010'¨\u0006k"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/drawer/FinderDraggableLayout;", "Landroid/widget/FrameLayout;", "Landroid/view/GestureDetector$OnGestureListener;", "", "height", "Lrx3/b0;", "setPeekHeight", "setExpandHeight", "getPeekHeight", "getExpandHeight", "Landroid/view/View;", "view", "setContentView", "translation", "setTran", "", "g", "Z", "isSettling", "()Z", "setSettling", "(Z)V", "h", "getHasResetTranslation", "setHasResetTranslation", "hasResetTranslation", "", "i", "I", "getEdgeAttached", "()I", "setEdgeAttached", "(I)V", "edgeAttached", "j", "F", "getDownX", "()F", "setDownX", "(F)V", "downX", "n", "getDownY", "setDownY", "downY", "Landroid/view/GestureDetector;", "o", "Landroid/view/GestureDetector;", "getGestureDetector", "()Landroid/view/GestureDetector;", "gestureDetector", "", "p", "Ljava/util/Set;", "getAttachedViews", "()Ljava/util/Set;", "attachedViews", "value", "q", "isDrawerOpen", "setDrawerOpen", "r", "getOriginalTranslationX", "setOriginalTranslationX", "originalTranslationX", "s", "getOriginalTranslationY", "setOriginalTranslationY", "originalTranslationY", "t", "getCancelSettleOnDown", "setCancelSettleOnDown", "cancelSettleOnDown", "getBorderLeft", "borderLeft", "getBorderRight", "borderRight", "getBorderTop", "borderTop", "getBorderBottom", "borderBottom", "getEdgeLow", "edgeLow", "getEdgeHigh", "edgeHigh", "getBorderLow", "borderLow", "getBorderHigh", "borderHigh", "getBorderPeek", "borderPeek", "getBorderClose", "borderClose", "getBorderExpand", "borderExpand", "getCanPeek", "canPeek", "getTranslation", "setTranslation", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout */
public abstract class FinderDraggableLayout extends FrameLayout implements GestureDetector.OnGestureListener {

    /* renamed from: d */
    public View f18127d;

    /* renamed from: e */
    public float f18128e;

    /* renamed from: f */
    public float f18129f = -1.0f;

    /* renamed from: g */
    public boolean f18130g;

    /* renamed from: h */
    public boolean f18131h;

    /* renamed from: i */
    public int f18132i = 2;

    /* renamed from: j */
    public float f18133j;

    /* renamed from: n */
    public float f18134n;

    /* renamed from: o */
    public final GestureDetector f18135o = new GestureDetector(getContext(), this);

    /* renamed from: p */
    public final Set<View> f18136p = new LinkedHashSet();

    /* renamed from: q */
    public boolean f18137q;

    /* renamed from: r */
    public float f18138r;

    /* renamed from: s */
    public float f18139s;

    /* renamed from: t */
    public boolean f18140t = true;

    /* renamed from: com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout$a */
    public static final class C4043a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ FinderDraggableLayout f18141d;

        /* renamed from: e */
        public final /* synthetic */ float f18142e;

        public C4043a(FinderDraggableLayout finderDraggableLayout, float f) {
            this.f18141d = finderDraggableLayout;
            this.f18142e = f;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f18141d.mo207j(this.f18142e, "settle");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout$b */
    public static final class C4044b extends C7290r {

        /* renamed from: d */
        public final /* synthetic */ FinderDraggableLayout f18143d;

        public C4044b(FinderDraggableLayout finderDraggableLayout) {
            this.f18143d = finderDraggableLayout;
        }

        public void onAnimationCancel(Animator animator) {
            this.f18143d.setSettling(false);
        }

        public void onAnimationEnd(Animator animator) {
            this.f18143d.setSettling(false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout$c */
    public static final class C4045c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ FinderDraggableLayout f18144d;

        public C4045c(FinderDraggableLayout finderDraggableLayout) {
            this.f18144d = finderDraggableLayout;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            FinderDraggableLayout finderDraggableLayout = this.f18144d;
            finderDraggableLayout.mo207j(finderDraggableLayout.getTranslation(), "settle");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout$d */
    public static final class C4046d extends C7290r {

        /* renamed from: d */
        public final /* synthetic */ FinderDraggableLayout f18145d;

        /* renamed from: e */
        public final /* synthetic */ int f18146e;

        public C4046d(FinderDraggableLayout finderDraggableLayout, int i) {
            this.f18145d = finderDraggableLayout;
            this.f18146e = i;
        }

        public void onAnimationCancel(Animator animator) {
            this.f18145d.setSettling(false);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x003a, code lost:
            if ((r3.f18145d.getTranslation() == r3.f18145d.getBorderExpand()) != false) goto L_0x003c;
         */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0076  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0078  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x007b  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0081  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onAnimationEnd(android.animation.Animator r4) {
            /*
                r3 = this;
                com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout r4 = r3.f18145d
                r0 = 0
                r4.setSettling(r0)
                int r4 = r3.f18146e
                com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout r1 = r3.f18145d
                int r1 = r1.getEdgeAttached()
                int r1 = -r1
                r2 = 1
                if (r4 != r1) goto L_0x0042
                com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout r4 = r3.f18145d
                float r4 = r4.getTranslation()
                com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout r1 = r3.f18145d
                float r1 = r1.getBorderPeek()
                int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                if (r4 != 0) goto L_0x0024
                r4 = 1
                goto L_0x0025
            L_0x0024:
                r4 = 0
            L_0x0025:
                if (r4 != 0) goto L_0x003c
                com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout r4 = r3.f18145d
                float r4 = r4.getTranslation()
                com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout r1 = r3.f18145d
                float r1 = r1.getBorderExpand()
                int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                if (r4 != 0) goto L_0x0039
                r4 = 1
                goto L_0x003a
            L_0x0039:
                r4 = 0
            L_0x003a:
                if (r4 == 0) goto L_0x0042
            L_0x003c:
                com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout r4 = r3.f18145d
                r4.setDrawerOpen(r2)
                goto L_0x0066
            L_0x0042:
                int r4 = r3.f18146e
                com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout r1 = r3.f18145d
                int r1 = r1.getEdgeAttached()
                if (r4 != r1) goto L_0x0066
                com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout r4 = r3.f18145d
                float r4 = r4.getTranslation()
                com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout r1 = r3.f18145d
                float r1 = r1.getBorderClose()
                int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                if (r4 != 0) goto L_0x005e
                r4 = 1
                goto L_0x005f
            L_0x005e:
                r4 = 0
            L_0x005f:
                if (r4 == 0) goto L_0x0066
                com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout r4 = r3.f18145d
                r4.setDrawerOpen(r0)
            L_0x0066:
                com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout r4 = r3.f18145d
                float r4 = r4.getTranslation()
                com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout r1 = r3.f18145d
                float r1 = r1.getBorderExpand()
                int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                if (r1 != 0) goto L_0x0078
                r1 = 1
                goto L_0x0079
            L_0x0078:
                r1 = 0
            L_0x0079:
                if (r1 == 0) goto L_0x0081
                com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout r4 = r3.f18145d
                r4.mo182d()
                goto L_0x0093
            L_0x0081:
                com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout r1 = r3.f18145d
                float r1 = r1.getBorderPeek()
                int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                if (r4 != 0) goto L_0x008c
                r0 = 1
            L_0x008c:
                if (r0 == 0) goto L_0x0093
                com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout r4 = r3.f18145d
                r4.mo185f()
            L_0x0093:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.drawer.FinderDraggableLayout.C4046d.onAnimationEnd(android.animation.Animator):void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderDraggableLayout(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: a */
    public static void m4279a(FinderDraggableLayout finderDraggableLayout, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = true;
            }
            finderDraggableLayout.mo4919k(finderDraggableLayout.f18132i, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
    }

    /* renamed from: l */
    public static /* synthetic */ void m4280l(FinderDraggableLayout finderDraggableLayout, int i, boolean z, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                z = false;
            }
            finderDraggableLayout.mo4919k(i, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: settle");
    }

    /* renamed from: b */
    public final boolean mo4894b() {
        int i = this.f18132i;
        return i == -1 || i == 1;
    }

    /* renamed from: c */
    public abstract void mo181c();

    /* renamed from: d */
    public abstract void mo182d();

    /* renamed from: e */
    public abstract void mo184e();

    /* renamed from: f */
    public abstract void mo185f();

    /* renamed from: g */
    public abstract boolean mo186g(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2);

    public final Set<View> getAttachedViews() {
        return this.f18136p;
    }

    public final float getBorderBottom() {
        return this.f18132i == 2 ? this.f18139s : this.f18139s + this.f18128e;
    }

    public final float getBorderClose() {
        return this.f18132i == getEdgeLow() ? getBorderLow() : getBorderHigh();
    }

    public final float getBorderExpand() {
        return this.f18132i == getEdgeLow() ? getBorderHigh() : getBorderLow();
    }

    public final float getBorderHigh() {
        return mo4894b() ? getBorderRight() : getBorderBottom();
    }

    public final float getBorderLeft() {
        return this.f18132i == 1 ? this.f18138r - this.f18128e : this.f18138r;
    }

    public final float getBorderLow() {
        return mo4894b() ? getBorderLeft() : getBorderTop();
    }

    public final float getBorderPeek() {
        float f;
        float f2;
        int i = this.f18132i;
        if (i == -2 || i == -1) {
            f2 = getBorderLow();
            f = this.f18129f;
        } else if (i == 1 || i == 2) {
            return getBorderHigh() - this.f18129f;
        } else {
            f2 = getBorderLow();
            f = this.f18129f;
        }
        return f2 + f;
    }

    public final float getBorderRight() {
        return this.f18132i == 1 ? this.f18138r : this.f18138r + this.f18128e;
    }

    public final float getBorderTop() {
        return this.f18132i == 2 ? this.f18139s - this.f18128e : this.f18139s;
    }

    public final boolean getCanPeek() {
        return !(this.f18129f == -1.0f);
    }

    public final boolean getCancelSettleOnDown() {
        return this.f18140t;
    }

    public final float getDownX() {
        return this.f18133j;
    }

    public final float getDownY() {
        return this.f18134n;
    }

    public final int getEdgeAttached() {
        return this.f18132i;
    }

    public final int getEdgeHigh() {
        return mo4894b() ? 1 : 2;
    }

    public final int getEdgeLow() {
        return mo4894b() ? -1 : -2;
    }

    public final float getExpandHeight() {
        return this.f18128e;
    }

    public final GestureDetector getGestureDetector() {
        return this.f18135o;
    }

    public final boolean getHasResetTranslation() {
        return this.f18131h;
    }

    public final float getOriginalTranslationX() {
        return this.f18138r;
    }

    public final float getOriginalTranslationY() {
        return this.f18139s;
    }

    public final float getPeekHeight() {
        return this.f18129f;
    }

    public final float getTranslation() {
        if (mo4894b()) {
            View view = this.f18127d;
            if (view != null) {
                return view.getTranslationX();
            }
            C87412m.m108603p("contentView");
            throw null;
        }
        View view2 = this.f18127d;
        if (view2 != null) {
            return view2.getTranslationY();
        }
        C87412m.m108603p("contentView");
        throw null;
    }

    /* renamed from: h */
    public abstract boolean mo205h(boolean z, float f);

    /* renamed from: i */
    public abstract boolean mo206i(MotionEvent motionEvent);

    /* renamed from: j */
    public abstract void mo207j(float f, String str);

    /* renamed from: k */
    public final void mo4919k(int i, boolean z) {
        Log.m105924i("Finder.DrawerLayout", "settle isSettling = " + this.f18130g + ", dir=" + i + ", isTotally=" + z);
        if (this.f18131h && !this.f18130g) {
            this.f18130g = true;
            float borderLow = getBorderLow();
            float borderHigh = getBorderHigh();
            if (getCanPeek() && !z) {
                borderLow = getBorderLow();
                borderHigh = getBorderPeek();
            }
            float translation = (borderHigh - getTranslation()) / (borderHigh - borderLow);
            if (i == 0) {
                i = Float.compare(translation, 0.5f) > 0 ? getEdgeLow() : getEdgeHigh();
            }
            if (i != getEdgeLow()) {
                borderLow = borderHigh;
            }
            Log.m105924i("Finder.DrawerLayout", "settle percent = " + translation);
            Interpolator loadInterpolator = AnimationUtils.loadInterpolator(getContext(), C0966R.C0968anim.f2435cy);
            float translation2 = borderLow - getTranslation();
            View view = this.f18127d;
            if (view != null) {
                (mo4894b() ? view.animate().translationX(borderLow) : view.animate().translationY(borderLow)).setDuration(200).setInterpolator(loadInterpolator).setUpdateListener(new C4045c(this)).setListener(new C4046d(this, i)).start();
                for (View view2 : this.f18136p) {
                    (mo4894b() ? view2.animate().translationXBy(translation2) : view2.animate().translationYBy(translation2)).setDuration(200).setInterpolator(loadInterpolator).start();
                }
                return;
            }
            C87412m.m108603p("contentView");
            throw null;
        }
    }

    public boolean onDown(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "e");
        return false;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C87412m.m108594g(motionEvent, "e1");
        C87412m.m108594g(motionEvent2, "e2");
        Log.m105924i("Finder.DrawerLayout", "onFling vx = " + f + ", vy = " + f2);
        if (!mo186g(motionEvent, motionEvent2, f, f2)) {
            return false;
        }
        if (mo4894b() && Math.abs(f) > 400.0f) {
            mo4919k(f > 0.0f ? 1 : -1, !getCanPeek());
        } else if (!mo4894b() && Math.abs(f2) > 800.0f) {
            mo4919k(f2 > 0.0f ? 2 : -2, !getCanPeek());
        }
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "e");
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f18133j = motionEvent.getX();
            this.f18134n = motionEvent.getY();
            if (this.f18130g && this.f18140t) {
                this.f18130g = false;
                View view = this.f18127d;
                if (view != null) {
                    ViewPropertyAnimator animate = view.animate();
                    if (animate != null) {
                        animate.cancel();
                    }
                    for (View animate2 : this.f18136p) {
                        animate2.animate().cancel();
                    }
                } else {
                    C87412m.m108603p("contentView");
                    throw null;
                }
            }
        } else if (action == 1) {
            this.f18133j = 0.0f;
            this.f18134n = 0.0f;
        } else if (action == 3) {
            this.f18133j = 0.0f;
            this.f18134n = 0.0f;
        }
        if (mo206i(motionEvent)) {
            GestureDetector gestureDetector = this.f18135o;
            C9556a aVar = new C9556a();
            aVar.mo10233c(motionEvent);
            GestureDetector gestureDetector2 = gestureDetector;
            C117292a.m165358d(gestureDetector2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/drawer/FinderDraggableLayout", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            boolean onTouchEvent = gestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0));
            C117292a.m165360f(gestureDetector2, onTouchEvent, "com/tencent/mm/plugin/finder/view/drawer/FinderDraggableLayout", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            if (onTouchEvent) {
                return true;
            }
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        Log.m105924i("Finder.DrawerLayout", "onInterceptTouchEvent e.action=" + motionEvent.getAction() + " ret=" + onInterceptTouchEvent);
        return onInterceptTouchEvent;
    }

    public void onLongPress(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/drawer/FinderDraggableLayout", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        C87412m.m108594g(motionEvent, "e");
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/drawer/FinderDraggableLayout", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C87412m.m108594g(motionEvent, "e1");
        C87412m.m108594g(motionEvent2, "e2");
        float f3 = mo4894b() ? f : f2;
        boolean z = Math.abs(f) > Math.abs(f2);
        if (mo205h(z, f3) && mo4894b() == z) {
            float translation = getTranslation() - Math.min(getCanPeek() ? getBorderPeek() : getBorderHigh(), Math.max(getBorderLow(), getTranslation() - f3));
            Log.m105924i("Finder.DrawerLayout", "onScroll isHorizontal = " + z + " exactlyMoved = " + translation);
            if (Float.compare(Math.abs(translation), 0.01f) > 0) {
                setTranslation(getTranslation() - translation);
                if (mo4894b()) {
                    for (View view : this.f18136p) {
                        view.setTranslationX(view.getTranslationX() - translation);
                    }
                } else {
                    for (View view2 : this.f18136p) {
                        view2.setTranslationY(view2.getTranslationY() - translation);
                    }
                }
                mo207j(getTranslation(), "onScroll");
                return true;
            }
        }
        return false;
    }

    public void onShowPress(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "e");
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/drawer/FinderDraggableLayout", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        C87412m.m108594g(motionEvent, "e");
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/finder/view/drawer/FinderDraggableLayout", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "e");
        GestureDetector gestureDetector = this.f18135o;
        C9556a aVar = new C9556a();
        aVar.mo10233c(motionEvent);
        C117292a.m165358d(gestureDetector, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/drawer/FinderDraggableLayout", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        boolean onTouchEvent = gestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0));
        C117292a.m165360f(gestureDetector, onTouchEvent, "com/tencent/mm/plugin/finder/view/drawer/FinderDraggableLayout", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            m4280l(this, 0, false, 3, (Object) null);
        }
        return onTouchEvent;
    }

    public final void setCancelSettleOnDown(boolean z) {
        this.f18140t = z;
    }

    public final void setContentView(View view) {
        C87412m.m108594g(view, "view");
        if (!C87412m.m108589b(view.getParent(), this)) {
            if (!BuildInfo.DEBUG) {
                Log.m105920e("Finder.DrawerLayout", "setContentView contentView should be child of FinderDrawerLayout");
            } else {
                throw new IllegalArgumentException("contentView should be child of FinderDrawerLayout");
            }
        }
        this.f18127d = view;
    }

    public final void setDownX(float f) {
        this.f18133j = f;
    }

    public final void setDownY(float f) {
        this.f18134n = f;
    }

    public final void setDrawerOpen(boolean z) {
        boolean z2 = this.f18137q != z;
        this.f18137q = z;
        if (!z2) {
            return;
        }
        if (z) {
            mo184e();
        } else {
            mo181c();
        }
    }

    public final void setEdgeAttached(int i) {
        this.f18132i = i;
    }

    public void setExpandHeight(float f) {
        this.f18128e = f;
        View view = this.f18127d;
        if (view != null) {
            view.setTranslationX(0.0f);
            View view2 = this.f18127d;
            if (view2 != null) {
                view2.setTranslationY(0.0f);
                int i = this.f18132i;
                if (i == -2) {
                    View view3 = this.f18127d;
                    if (view3 != null) {
                        view3.setTranslationY(view3.getTranslationY() - this.f18128e);
                    } else {
                        C87412m.m108603p("contentView");
                        throw null;
                    }
                } else if (i == -1) {
                    View view4 = this.f18127d;
                    if (view4 != null) {
                        view4.setTranslationX(view4.getTranslationX() - this.f18128e);
                    } else {
                        C87412m.m108603p("contentView");
                        throw null;
                    }
                } else if (i == 1) {
                    View view5 = this.f18127d;
                    if (view5 != null) {
                        view5.setTranslationX(view5.getTranslationX() + this.f18128e);
                    } else {
                        C87412m.m108603p("contentView");
                        throw null;
                    }
                } else if (i == 2) {
                    View view6 = this.f18127d;
                    if (view6 != null) {
                        view6.setTranslationY(view6.getTranslationY() + this.f18128e);
                    } else {
                        C87412m.m108603p("contentView");
                        throw null;
                    }
                }
                View view7 = this.f18127d;
                if (view7 != null) {
                    this.f18138r = view7.getTranslationX();
                    View view8 = this.f18127d;
                    if (view8 != null) {
                        this.f18139s = view8.getTranslationY();
                        this.f18131h = true;
                        mo207j(getTranslation(), "resetTranslation");
                        return;
                    }
                    C87412m.m108603p("contentView");
                    throw null;
                }
                C87412m.m108603p("contentView");
                throw null;
            }
            C87412m.m108603p("contentView");
            throw null;
        }
        C87412m.m108603p("contentView");
        throw null;
    }

    public final void setHasResetTranslation(boolean z) {
        this.f18131h = z;
    }

    public final void setOriginalTranslationX(float f) {
        this.f18138r = f;
    }

    public final void setOriginalTranslationY(float f) {
        this.f18139s = f;
    }

    public final void setPeekHeight(float f) {
        this.f18129f = f;
    }

    public final void setSettling(boolean z) {
        this.f18130g = z;
    }

    public final void setTran(float f) {
        this.f18130g = true;
        Interpolator loadInterpolator = AnimationUtils.loadInterpolator(getContext(), C0966R.C0968anim.f2435cy);
        View view = this.f18127d;
        if (view != null) {
            (mo4894b() ? view.animate().translationX(f) : view.animate().translationY(f)).setDuration(200).setInterpolator(loadInterpolator).setUpdateListener(new C4043a(this, f)).setListener(new C4044b(this)).start();
        } else {
            C87412m.m108603p("contentView");
            throw null;
        }
    }

    public final void setTranslation(float f) {
        if (mo4894b()) {
            View view = this.f18127d;
            if (view != null) {
                view.setTranslationX(f);
            } else {
                C87412m.m108603p("contentView");
                throw null;
            }
        } else {
            View view2 = this.f18127d;
            if (view2 != null) {
                view2.setTranslationY(f);
            } else {
                C87412m.m108603p("contentView");
                throw null;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderDraggableLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderDraggableLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}
