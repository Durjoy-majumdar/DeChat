package androidx.compose.p002ui.platform;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import d14.C58052j1;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import p1120i3.C108332a;
import p175j0.C108504h;
import p175j0.C108509q;
import p175j0.C24721r;
import p175j0.C60661k1;
import p415q0.C110261c;
import p658q1.C110282c0;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010$\u001a\u00020#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\b\b\u0002\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R(\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@BX\u000e¢\u0006\f\n\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR(\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00028\u0002@BX\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R0\u0010\u001e\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00158F@FX\u000e¢\u0006\u0018\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u00158TX\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0019R\u0011\u0010\"\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b!\u0010\u0019¨\u0006+"}, mo182094d2 = {"Landroidx/compose/ui/platform/AbstractComposeView;", "Landroid/view/ViewGroup;", "Lj0/r;", "parent", "Lrx3/b0;", "setParentCompositionContext", "Landroidx/compose/ui/platform/h2;", "strategy", "setViewCompositionStrategy", "Landroid/os/IBinder;", "value", "e", "Landroid/os/IBinder;", "setPreviousAttachedWindowToken", "(Landroid/os/IBinder;)V", "previousAttachedWindowToken", "g", "Lj0/r;", "setParentContext", "(Lj0/r;)V", "parentContext", "", "i", "Z", "getShowLayoutBounds", "()Z", "setShowLayoutBounds", "(Z)V", "getShowLayoutBounds$annotations", "()V", "showLayoutBounds", "getShouldCreateCompositionOnAttachedToWindow", "shouldCreateCompositionOnAttachedToWindow", "getHasComposition", "hasComposition", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui_release"}, mo182095k = 1, mo182096mv = {1, 6, 0})
/* renamed from: androidx.compose.ui.platform.AbstractComposeView */
public abstract class AbstractComposeView extends ViewGroup {

    /* renamed from: d */
    public WeakReference<C24721r> f305946d;

    /* renamed from: e */
    public IBinder f305947e;

    /* renamed from: f */
    public C108509q f305948f;

    /* renamed from: g */
    public C24721r f305949g;

    /* renamed from: h */
    public C32224a<C13598b0> f305950h;

    /* renamed from: i */
    public boolean f305951i;

    /* renamed from: j */
    public boolean f305952j;

    /* renamed from: androidx.compose.ui.platform.AbstractComposeView$a */
    public static final class C103602a extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ AbstractComposeView f305953d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C103602a(AbstractComposeView abstractComposeView) {
            super(2);
            this.f305953d = abstractComposeView;
        }

        public Object invoke(Object obj, Object obj2) {
            C108504h hVar = (C108504h) obj;
            if ((((Number) obj2).intValue() & 11) != 2 || !hVar.mo51575a()) {
                this.f305953d.mo76628a(hVar, 8);
            } else {
                hVar.mo51581d();
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AbstractComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (C8480h) null);
        C87412m.m108594g(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractComposeView(Context context, AttributeSet attributeSet, int i, int i2, C8480h hVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final void setParentContext(C24721r rVar) {
        if (this.f305949g != rVar) {
            this.f305949g = rVar;
            if (rVar != null) {
                this.f305946d = null;
            }
            C108509q qVar = this.f305948f;
            if (qVar != null) {
                qVar.dispose();
                this.f305948f = null;
                if (isAttachedToWindow()) {
                    mo144594d();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f305947e != iBinder) {
            this.f305947e = iBinder;
            this.f305946d = null;
        }
    }

    /* renamed from: a */
    public abstract void mo76628a(C108504h hVar, int i);

    public void addView(View view) {
        mo144592b();
        super.addView(view);
    }

    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        mo144592b();
        return super.addViewInLayout(view, i, layoutParams);
    }

    /* renamed from: b */
    public final void mo144592b() {
        if (!this.f305952j) {
            throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
        }
    }

    /* renamed from: c */
    public final void mo144593c() {
        if (this.f305949g != null || isAttachedToWindow()) {
            mo144594d();
            return;
        }
        throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.".toString());
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: d */
    public final void mo144594d() {
        if (this.f305948f == null) {
            try {
                this.f305952j = true;
                this.f305948f = C103620e3.m137799a(this, mo144600h(), C110261c.m149879c(-656146368, true, new C103602a(this)));
                this.f305952j = false;
            } catch (Throwable th) {
                this.f305952j = false;
                throw th;
            }
        }
    }

    /* renamed from: e */
    public void mo144595e(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    /* renamed from: f */
    public void mo144596f(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(childAt.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
    }

    /* renamed from: g */
    public final boolean mo144597g(C24721r rVar) {
        return !(rVar instanceof C60661k1) || ((C60661k1.C60664c) ((C58052j1) ((C60661k1) rVar).f172798o).getValue()).compareTo(C60661k1.C60664c.ShuttingDown) > 0;
    }

    public final boolean getHasComposition() {
        return this.f305948f != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f305951i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004a, code lost:
        if (r2 != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0021, code lost:
        r0 = r0;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p175j0.C24721r mo144600h() {
        /*
            r11 = this;
            j0.r r0 = r11.f305949g
            if (r0 != 0) goto L_0x00fa
            j0.r r0 = androidx.compose.p002ui.platform.C54196x2.m60894b(r11)
            if (r0 == 0) goto L_0x000b
            goto L_0x0021
        L_0x000b:
            android.view.ViewParent r1 = r11.getParent()
        L_0x000f:
            if (r0 != 0) goto L_0x0021
            boolean r2 = r1 instanceof android.view.View
            if (r2 == 0) goto L_0x0021
            r0 = r1
            android.view.View r0 = (android.view.View) r0
            j0.r r0 = androidx.compose.p002ui.platform.C54196x2.m60894b(r0)
            android.view.ViewParent r1 = r1.getParent()
            goto L_0x000f
        L_0x0021:
            r1 = 0
            if (r0 == 0) goto L_0x0037
            boolean r2 = r11.mo144597g(r0)
            if (r2 == 0) goto L_0x002c
            r2 = r0
            goto L_0x002d
        L_0x002c:
            r2 = r1
        L_0x002d:
            if (r2 == 0) goto L_0x0038
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r2)
            r11.f305946d = r3
            goto L_0x0038
        L_0x0037:
            r0 = r1
        L_0x0038:
            if (r0 != 0) goto L_0x00fa
            java.lang.ref.WeakReference<j0.r> r0 = r11.f305946d
            if (r0 == 0) goto L_0x004d
            java.lang.Object r0 = r0.get()
            j0.r r0 = (p175j0.C24721r) r0
            if (r0 == 0) goto L_0x004d
            boolean r2 = r11.mo144597g(r0)
            if (r2 == 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r0 = r1
        L_0x004e:
            if (r0 != 0) goto L_0x00fa
            boolean r0 = r11.isAttachedToWindow()
            if (r0 == 0) goto L_0x00da
            android.view.ViewParent r0 = r11.getParent()
            r2 = r11
        L_0x005b:
            boolean r3 = r0 instanceof android.view.View
            if (r3 == 0) goto L_0x0073
            android.view.View r0 = (android.view.View) r0
            int r3 = r0.getId()
            r4 = 16908290(0x1020002, float:2.3877235E-38)
            if (r3 != r4) goto L_0x006b
            goto L_0x0073
        L_0x006b:
            android.view.ViewParent r2 = r0.getParent()
            r10 = r2
            r2 = r0
            r0 = r10
            goto L_0x005b
        L_0x0073:
            j0.r r0 = androidx.compose.p002ui.platform.C54196x2.m60894b(r2)
            if (r0 != 0) goto L_0x00b7
            java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.platform.q2> r0 = androidx.compose.p002ui.platform.C54187t2.f152138a
            java.lang.Object r0 = r0.get()
            androidx.compose.ui.platform.q2 r0 = (androidx.compose.p002ui.platform.C54181q2) r0
            j0.k1 r0 = r0.mo74979a(r2)
            r3 = 2131296979(0x7f0902d3, float:1.821189E38)
            r2.setTag(r3, r0)
            a14.s1 r4 = a14.C0001s1.f0d
            android.os.Handler r3 = r2.getHandler()
            java.lang.String r5 = "rootView.handler"
            gy3.C87412m.m108593f(r3, r5)
            int r5 = b14.C54394c.f152601a
            b14.a r5 = new b14.a
            r6 = 0
            java.lang.String r7 = "windowRecomposer cleanup"
            r5.<init>(r3, r7, r6)
            b14.a r5 = r5.f152594h
            r6 = 0
            androidx.compose.ui.platform.s2 r7 = new androidx.compose.ui.platform.s2
            r7.<init>(r0, r2, r1)
            r8 = 2
            r9 = 0
            a14.z1 r3 = a14.C53895h.m60466d(r4, r5, r6, r7, r8, r9)
            androidx.compose.ui.platform.r2 r4 = new androidx.compose.ui.platform.r2
            r4.<init>(r3)
            r2.addOnAttachStateChangeListener(r4)
            goto L_0x00bd
        L_0x00b7:
            boolean r2 = r0 instanceof p175j0.C60661k1
            if (r2 == 0) goto L_0x00ce
            j0.k1 r0 = (p175j0.C60661k1) r0
        L_0x00bd:
            boolean r2 = r11.mo144597g(r0)
            if (r2 == 0) goto L_0x00c4
            r1 = r0
        L_0x00c4:
            if (r1 == 0) goto L_0x00fa
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r1)
            r11.f305946d = r2
            goto L_0x00fa
        L_0x00ce:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "root viewTreeParentCompositionContext is not a Recomposer"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00da:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot locate windowRecomposer; View "
            r0.append(r1)
            r0.append(r11)
            java.lang.String r1 = " is not attached to a window"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x00fa:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.platform.AbstractComposeView.mo144600h():j0.r");
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            mo144594d();
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        mo144595e(z, i, i2, i3, i4);
    }

    public final void onMeasure(int i, int i2) {
        mo144594d();
        mo144596f(i, i2);
    }

    public void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    public final void setParentCompositionContext(C24721r rVar) {
        setParentContext(rVar);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.f305951i = z;
        View childAt = getChildAt(0);
        if (childAt != null) {
            ((C110282c0) childAt).setShowLayoutBounds(z);
        }
    }

    public final void setViewCompositionStrategy(C103629h2 h2Var) {
        C87412m.m108594g(h2Var, "strategy");
        C32224a<C13598b0> aVar = this.f305950h;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f305950h = h2Var.mo144730a(this);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        setClipChildren(false);
        setClipToPadding(false);
        int i2 = C103629h2.f306082a;
        C103622f2 f2Var = new C103622f2(this);
        addOnAttachStateChangeListener(f2Var);
        C103626g2 g2Var = new C103626g2(this);
        C108332a.m146751a(this).f324357a.add(g2Var);
        this.f305950h = new C103619e2(this, f2Var, g2Var);
    }

    public void addView(View view, int i) {
        mo144592b();
        super.addView(view, i);
    }

    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        mo144592b();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    public void addView(View view, int i, int i2) {
        mo144592b();
        super.addView(view, i, i2);
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        mo144592b();
        super.addView(view, layoutParams);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        mo144592b();
        super.addView(view, i, layoutParams);
    }
}
