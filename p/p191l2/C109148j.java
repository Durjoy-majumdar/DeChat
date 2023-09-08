package p191l2;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.p002ui.platform.AbstractComposeView;
import fy3.C32224a;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import iy3.C60641c;
import p1166z0.C112539e;
import p175j0.C108491a0;
import p175j0.C108494d2;
import p175j0.C108499f1;
import p175j0.C108504h;
import p175j0.C24661b2;
import p175j0.C24665d;
import p175j0.C24715p;
import p175j0.C24721r;
import p175j0.C24724t1;
import p175j0.C33487v1;
import p175j0.C60667k2;
import p175j0.C60690y0;
import p560i2.C108329n;
import p560i2.C33177j;
import p560i2.C33179k;
import p560i2.C33180l;
import p560i2.C33181m;
import p560i2.C33183o;
import p631o1.C109857o;
import rx3.C13598b0;
import rx3.C13603j;

/* renamed from: l2.j */
public final class C109148j extends AbstractComposeView {

    /* renamed from: A */
    public final Rect f326806A;

    /* renamed from: B */
    public final C60690y0 f326807B;

    /* renamed from: C */
    public boolean f326808C;

    /* renamed from: D */
    public final int[] f326809D;

    /* renamed from: n */
    public C32224a<C13598b0> f326810n;

    /* renamed from: o */
    public C109153p f326811o;

    /* renamed from: p */
    public String f326812p;

    /* renamed from: q */
    public final View f326813q;

    /* renamed from: r */
    public final C109150l f326814r;

    /* renamed from: s */
    public final WindowManager f326815s;

    /* renamed from: t */
    public final WindowManager.LayoutParams f326816t;

    /* renamed from: u */
    public C34165o f326817u;

    /* renamed from: v */
    public C33183o f326818v;

    /* renamed from: w */
    public final C60690y0 f326819w;

    /* renamed from: x */
    public final C60690y0 f326820x;

    /* renamed from: y */
    public C33180l f326821y;

    /* renamed from: z */
    public final C60667k2 f326822z;

    /* renamed from: l2.j$a */
    public static final class C61195a extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C109148j f174213d;

        /* renamed from: e */
        public final /* synthetic */ int f174214e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61195a(C109148j jVar, int i) {
            super(2);
            this.f174213d = jVar;
            this.f174214e = i;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            this.f174213d.mo76628a((C108504h) obj, this.f174214e | 1);
            return C13598b0.f38549a;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C109148j(fy3.C32224a r15, p191l2.C109153p r16, java.lang.String r17, android.view.View r18, p560i2.C108322d r19, p191l2.C34165o r20, java.util.UUID r21, p191l2.C109150l r22, int r23, gy3.C8480h r24) {
        /*
            r14 = this;
            r6 = r14
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            r11 = r20
            r12 = r21
            r0 = r23
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0026
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L_0x001f
            l2.m r0 = new l2.m
            r0.<init>()
            goto L_0x0024
        L_0x001f:
            l2.n r0 = new l2.n
            r0.<init>()
        L_0x0024:
            r13 = r0
            goto L_0x0028
        L_0x0026:
            r13 = r22
        L_0x0028:
            java.lang.String r0 = "properties"
            gy3.C87412m.m108594g(r7, r0)
            java.lang.String r0 = "testTag"
            gy3.C87412m.m108594g(r8, r0)
            java.lang.String r0 = "composeView"
            gy3.C87412m.m108594g(r9, r0)
            java.lang.String r0 = "density"
            gy3.C87412m.m108594g(r10, r0)
            java.lang.String r0 = "initialPositionProvider"
            gy3.C87412m.m108594g(r11, r0)
            java.lang.String r0 = "popupId"
            gy3.C87412m.m108594g(r12, r0)
            java.lang.String r0 = "popupLayoutHelper"
            gy3.C87412m.m108594g(r13, r0)
            android.content.Context r1 = r18.getContext()
            java.lang.String r0 = "composeView.context"
            gy3.C87412m.m108593f(r1, r0)
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            r0 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = r15
            r6.f326810n = r0
            r6.f326811o = r7
            r6.f326812p = r8
            r6.f326813q = r9
            r6.f326814r = r13
            android.content.Context r0 = r18.getContext()
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            if (r0 == 0) goto L_0x0133
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            r6.f326815s = r0
            android.view.WindowManager$LayoutParams r0 = new android.view.WindowManager$LayoutParams
            r0.<init>()
            r1 = 8388659(0x800033, float:1.1755015E-38)
            r0.gravity = r1
            int r1 = r0.flags
            r2 = -8552473(0xffffffffff7d7fe7, float:-3.369588E38)
            r1 = r1 & r2
            r2 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 | r2
            r0.flags = r1
            r1 = 1002(0x3ea, float:1.404E-42)
            r0.type = r1
            android.os.IBinder r1 = r18.getApplicationWindowToken()
            r0.token = r1
            r1 = -2
            r0.width = r1
            r0.height = r1
            r1 = -3
            r0.format = r1
            android.content.Context r1 = r18.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131824578(0x7f110fc2, float:1.9281988E38)
            java.lang.String r1 = r1.getString(r2)
            r0.setTitle(r1)
            r6.f326816t = r0
            r6.f326817u = r11
            i2.o r0 = p560i2.C33183o.Ltr
            r6.f326818v = r0
            r0 = 0
            r1 = 2
            j0.y0 r2 = p175j0.C108500f2.m146996c(r0, r0, r1, r0)
            r6.f326819w = r2
            j0.y0 r2 = p175j0.C108500f2.m146996c(r0, r0, r1, r0)
            r6.f326820x = r2
            l2.k r2 = new l2.k
            r2.<init>(r14)
            j0.k2 r2 = p175j0.C108500f2.m146994a(r2)
            r6.f326822z = r2
            r2 = 30
            float r2 = (float) r2
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r6.f326806A = r3
            r3 = 16908290(0x1020002, float:2.3877235E-38)
            r14.setId(r3)
            androidx.lifecycle.s r3 = androidx.lifecycle.C54216o0.m60904a(r18)
            r4 = 2131316289(0x7f094e41, float:1.8251055E38)
            r14.setTag(r4, r3)
            androidx.lifecycle.n0 r3 = androidx.lifecycle.C103765p0.m138169a(r18)
            r4 = 2131316291(0x7f094e43, float:1.825106E38)
            r14.setTag(r4, r3)
            c4.c r3 = p1094c4.C104293d.m139244a(r18)
            p1094c4.C104293d.m139245b(r14, r3)
            r3 = 2131300058(0x7f090eda, float:1.8218135E38)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Popup:"
            r4.append(r5)
            r4.append(r12)
            java.lang.String r4 = r4.toString()
            r14.setTag(r3, r4)
            r3 = 0
            r14.setClipChildren(r3)
            float r2 = r10.mo143034T(r2)
            r14.setElevation(r2)
            l2.i r2 = new l2.i
            r2.<init>()
            r14.setOutlineProvider(r2)
            fy3.p<j0.h, java.lang.Integer, rx3.b0> r2 = p191l2.C61193h.f174211a
            j0.y0 r0 = p175j0.C108500f2.m146996c(r2, r0, r1, r0)
            r6.f326807B = r0
            int[] r0 = new int[r1]
            r6.f326809D = r0
            return
        L_0x0133:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type android.view.WindowManager"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p191l2.C109148j.<init>(fy3.a, l2.p, java.lang.String, android.view.View, i2.d, l2.o, java.util.UUID, l2.l, int, gy3.h):void");
    }

    private final C32227p<C108504h, Integer, C13598b0> getContent() {
        return (C32227p) this.f326807B.getValue();
    }

    private final int getDisplayHeight() {
        return C60641c.m70921b(((float) getContext().getResources().getConfiguration().screenHeightDp) * getContext().getResources().getDisplayMetrics().density);
    }

    private final int getDisplayWidth() {
        return C60641c.m70921b(((float) getContext().getResources().getConfiguration().screenWidthDp) * getContext().getResources().getDisplayMetrics().density);
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    /* access modifiers changed from: private */
    public final C109857o getParentLayoutCoordinates() {
        return (C109857o) this.f326820x.getValue();
    }

    private final void setClippingEnabled(boolean z) {
        int i = z ? this.f326816t.flags & -513 : this.f326816t.flags | 512;
        WindowManager.LayoutParams layoutParams = this.f326816t;
        layoutParams.flags = i;
        this.f326814r.mo160390a(this.f326815s, this, layoutParams);
    }

    private final void setContent(C32227p<? super C108504h, ? super Integer, C13598b0> pVar) {
        ((C108494d2) this.f326807B).setValue(pVar);
    }

    private final void setIsFocusable(boolean z) {
        int i = !z ? this.f326816t.flags | 8 : this.f326816t.flags & -9;
        WindowManager.LayoutParams layoutParams = this.f326816t;
        layoutParams.flags = i;
        this.f326814r.mo160390a(this.f326815s, this, layoutParams);
    }

    private final void setParentLayoutCoordinates(C109857o oVar) {
        ((C108494d2) this.f326820x).setValue(oVar);
    }

    private final void setSecurePolicy(C10450q qVar) {
        View view = this.f326813q;
        C108499f1<String> f1Var = C109132a.f326780a;
        C87412m.m108594g(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        boolean z = false;
        boolean z2 = (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
        C87412m.m108594g(qVar, "<this>");
        int ordinal = qVar.ordinal();
        if (ordinal == 0) {
            z = z2;
        } else if (ordinal == 1) {
            z = true;
        } else if (ordinal != 2) {
            throw new C13603j();
        }
        int i = z ? this.f326816t.flags | 8192 : this.f326816t.flags & -8193;
        WindowManager.LayoutParams layoutParams3 = this.f326816t;
        layoutParams3.flags = i;
        this.f326814r.mo160390a(this.f326815s, this, layoutParams3);
    }

    /* renamed from: a */
    public void mo76628a(C108504h hVar, int i) {
        C32228q<C24665d<?>, C24661b2, C24724t1, C13598b0> qVar = C24715p.f70494a;
        C108504h z = hVar.mo51623z(-857613600);
        getContent().invoke(z, 0);
        C33487v1 l = z.mo51596l();
        if (l != null) {
            l.mo51650a(new C61195a(this, i));
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        C87412m.m108594g(keyEvent, "event");
        if (keyEvent.getKeyCode() == 4 && this.f326811o.f326825b) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                }
                return true;
            } else if (keyEvent.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                C32224a<C13598b0> aVar = this.f326810n;
                if (aVar != null) {
                    aVar.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* renamed from: e */
    public void mo144595e(boolean z, int i, int i2, int i3, int i4) {
        super.mo144595e(z, i, i2, i3, i4);
        View childAt = getChildAt(0);
        if (childAt != null) {
            this.f326816t.width = childAt.getMeasuredWidth();
            this.f326816t.height = childAt.getMeasuredHeight();
            this.f326814r.mo160390a(this.f326815s, this, this.f326816t);
        }
    }

    /* renamed from: f */
    public void mo144596f(int i, int i2) {
        if (this.f326811o.f326830g) {
            super.mo144596f(i, i2);
        } else {
            super.mo144596f(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Integer.MIN_VALUE));
        }
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) ((C108491a0) this.f326822z).getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.f326816t;
    }

    public final C33183o getParentLayoutDirection() {
        return this.f326818v;
    }

    /* renamed from: getPopupContentSize-bOM6tXw  reason: not valid java name */
    public final C33181m m168901getPopupContentSizebOM6tXw() {
        return (C33181m) this.f326819w.getValue();
    }

    public final C34165o getPositionProvider() {
        return this.f326817u;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f326808C;
    }

    public AbstractComposeView getSubCompositionView() {
        return this;
    }

    public final String getTestTag() {
        return this.f326812p;
    }

    public View getViewRoot() {
        return null;
    }

    /* renamed from: j */
    public final void mo160379j(C24721r rVar, C32227p<? super C108504h, ? super Integer, C13598b0> pVar) {
        C87412m.m108594g(rVar, "parent");
        C87412m.m108594g(pVar, "content");
        setParentCompositionContext(rVar);
        setContent(pVar);
        this.f326808C = true;
    }

    /* renamed from: k */
    public final void mo160380k(C32224a<C13598b0> aVar, C109153p pVar, String str, C33183o oVar) {
        C87412m.m108594g(pVar, "properties");
        C87412m.m108594g(str, "testTag");
        C87412m.m108594g(oVar, "layoutDirection");
        this.f326810n = aVar;
        this.f326811o = pVar;
        this.f326812p = str;
        setIsFocusable(pVar.f326824a);
        setSecurePolicy(pVar.f326827d);
        setClippingEnabled(pVar.f326829f);
        int ordinal = oVar.ordinal();
        int i = 1;
        if (ordinal == 0) {
            i = 0;
        } else if (ordinal != 1) {
            throw new C13603j();
        }
        super.setLayoutDirection(i);
    }

    /* renamed from: l */
    public final void mo160381l() {
        C109857o parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            long b = parentLayoutCoordinates.mo161181b();
            long Q = parentLayoutCoordinates.mo161177Q(C112539e.f336955b);
            long a = C33179k.m39964a(C60641c.m70921b(C112539e.m153738c(Q)), C60641c.m70921b(C112539e.m153739d(Q)));
            int i = (int) (a >> 32);
            C33180l lVar = new C33180l(i, C33177j.m39962a(a), ((int) (b >> 32)) + i, C33177j.m39962a(a) + C33181m.m39966b(b));
            if (!C87412m.m108589b(lVar, this.f326821y)) {
                this.f326821y = lVar;
                mo160383n();
            }
        }
    }

    /* renamed from: m */
    public final void mo160382m(C109857o oVar) {
        C87412m.m108594g(oVar, "parentLayoutCoordinates");
        setParentLayoutCoordinates(oVar);
        mo160381l();
    }

    /* renamed from: n */
    public final void mo160383n() {
        C33181m r0;
        C33180l lVar = this.f326821y;
        if (lVar != null && (r0 = m168901getPopupContentSizebOM6tXw()) != null) {
            long j = r0.f90057a;
            Rect rect = this.f326806A;
            this.f326814r.mo160392c(this.f326813q, rect);
            C108499f1<String> f1Var = C109132a.f326780a;
            int i = rect.left;
            int i2 = rect.top;
            long a = C108329n.m146743a(rect.right - i, rect.bottom - i2);
            long a2 = this.f326817u.mo58546a(lVar, a, this.f326818v, j);
            WindowManager.LayoutParams layoutParams = this.f326816t;
            int i3 = C33177j.f90051c;
            layoutParams.x = (int) (a2 >> 32);
            layoutParams.y = C33177j.m39962a(a2);
            if (this.f326811o.f326828e) {
                this.f326814r.mo160391b(this, (int) (a >> 32), C33181m.m39966b(a));
            }
            this.f326814r.mo160390a(this.f326815s, this, this.f326816t);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f326811o.f326826c) {
            return super.onTouchEvent(motionEvent);
        }
        boolean z = false;
        if (!(motionEvent != null && motionEvent.getAction() == 0) || (motionEvent.getX() >= 0.0f && motionEvent.getX() < ((float) getWidth()) && motionEvent.getY() >= 0.0f && motionEvent.getY() < ((float) getHeight()))) {
            if (motionEvent != null && motionEvent.getAction() == 4) {
                z = true;
            }
            if (!z) {
                return super.onTouchEvent(motionEvent);
            }
            C32224a<C13598b0> aVar = this.f326810n;
            if (aVar != null) {
                aVar.invoke();
            }
            return true;
        }
        C32224a<C13598b0> aVar2 = this.f326810n;
        if (aVar2 != null) {
            aVar2.invoke();
        }
        return true;
    }

    public void setLayoutDirection(int i) {
    }

    public final void setParentLayoutDirection(C33183o oVar) {
        C87412m.m108594g(oVar, "<set-?>");
        this.f326818v = oVar;
    }

    /* renamed from: setPopupContentSize-fhxjrPA  reason: not valid java name */
    public final void m168902setPopupContentSizefhxjrPA(C33181m mVar) {
        ((C108494d2) this.f326819w).setValue(mVar);
    }

    public final void setPositionProvider(C34165o oVar) {
        C87412m.m108594g(oVar, "<set-?>");
        this.f326817u = oVar;
    }

    public final void setTestTag(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f326812p = str;
    }
}
