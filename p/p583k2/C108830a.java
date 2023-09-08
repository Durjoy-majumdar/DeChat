package p583k2;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.p002ui.platform.AndroidComposeView;
import androidx.compose.p002ui.platform.C103644l;
import androidx.compose.p002ui.platform.C103660l1;
import androidx.compose.p002ui.platform.C54196x2;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import d14.C58050i1;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C24564k0;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.ResultKt;
import my3.C61595o;
import p1094c4.C104292c;
import p1094c4.C104293d;
import p1166z0.C112539e;
import p1166z0.C112540f;
import p175j0.C24721r;
import p190l1.C109078a0;
import p190l1.C109084b0;
import p190l1.C109091e0;
import p241t0.C110879z;
import p241t0.C64198e;
import p241t0.C64199g;
import p436a1.C103223b;
import p436a1.C103226c;
import p436a1.C103262s;
import p560i2.C108319b;
import p560i2.C108322d;
import p560i2.C108324e;
import p560i2.C108330s;
import p560i2.C108331t;
import p582k1.C108796a;
import p582k1.C108797b;
import p631o1.C109827a0;
import p631o1.C109845i0;
import p631o1.C109846j;
import p631o1.C109848k;
import p631o1.C109854n0;
import p631o1.C109857o;
import p631o1.C109893x;
import p631o1.C109895y;
import p631o1.C109899z;
import p658q1.C110282c0;
import p658q1.C110301j;
import p721v0.C65503j;
import p835c1.C104231f;
import p849e3.C107168a0;
import p849e3.C107202n;
import p849e3.C107203p;
import p849e3.C107207u;
import p868x0.C111983i;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: k2.a */
public abstract class C108830a extends ViewGroup implements C107202n {

    /* renamed from: d */
    public final C108797b f325925d;

    /* renamed from: e */
    public View f325926e;

    /* renamed from: f */
    public C32224a<C13598b0> f325927f;

    /* renamed from: g */
    public boolean f325928g;

    /* renamed from: h */
    public C65503j f325929h;

    /* renamed from: i */
    public C32226l<? super C65503j, C13598b0> f325930i;

    /* renamed from: j */
    public C108322d f325931j;

    /* renamed from: n */
    public C32226l<? super C108322d, C13598b0> f325932n;

    /* renamed from: o */
    public C0125s f325933o;

    /* renamed from: p */
    public C104292c f325934p;

    /* renamed from: q */
    public final C110879z f325935q;

    /* renamed from: r */
    public final C32226l<C108830a, C13598b0> f325936r;

    /* renamed from: s */
    public final C32224a<C13598b0> f325937s;

    /* renamed from: t */
    public C32226l<? super Boolean, C13598b0> f325938t;

    /* renamed from: u */
    public final int[] f325939u;

    /* renamed from: v */
    public int f325940v;

    /* renamed from: w */
    public int f325941w;

    /* renamed from: x */
    public final C107203p f325942x;

    /* renamed from: y */
    public final C110301j f325943y;

    /* renamed from: k2.a$a */
    public static final class C108831a extends C87413o implements C32226l<C65503j, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C110301j f325944d;

        /* renamed from: e */
        public final /* synthetic */ C65503j f325945e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108831a(C110301j jVar, C65503j jVar2) {
            super(1);
            this.f325944d = jVar;
            this.f325945e = jVar2;
        }

        public Object invoke(Object obj) {
            C65503j jVar = (C65503j) obj;
            C87412m.m108594g(jVar, LocaleUtil.ITALIAN);
            this.f325944d.mo161675a(jVar.mo74972i0(this.f325945e));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k2.a$b */
    public static final class C108832b extends C87413o implements C32226l<C108322d, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C110301j f325946d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108832b(C110301j jVar) {
            super(1);
            this.f325946d = jVar;
        }

        public Object invoke(Object obj) {
            C108322d dVar = (C108322d) obj;
            C87412m.m108594g(dVar, LocaleUtil.ITALIAN);
            this.f325946d.mo161678g(dVar);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k2.a$c */
    public static final class C108833c extends C87413o implements C32226l<C110282c0, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C108830a f325947d;

        /* renamed from: e */
        public final /* synthetic */ C110301j f325948e;

        /* renamed from: f */
        public final /* synthetic */ C8479f0<View> f325949f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108833c(C108830a aVar, C110301j jVar, C8479f0<View> f0Var) {
            super(1);
            this.f325947d = aVar;
            this.f325948e = jVar;
            this.f325949f = f0Var;
        }

        public Object invoke(Object obj) {
            C110282c0 c0Var = (C110282c0) obj;
            C87412m.m108594g(c0Var, "owner");
            AndroidComposeView androidComposeView = c0Var instanceof AndroidComposeView ? (AndroidComposeView) c0Var : null;
            if (androidComposeView != null) {
                C108830a aVar = this.f325947d;
                C110301j jVar = this.f325948e;
                C87412m.m108594g(aVar, "view");
                C87412m.m108594g(jVar, "layoutNode");
                androidComposeView.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().put(aVar, jVar);
                androidComposeView.getAndroidViewsHandler$ui_release().addView(aVar);
                androidComposeView.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(jVar, aVar);
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                C107207u.C107208b.m145191s(aVar, 1);
                C107207u.m145168i(aVar, new C103644l(jVar, androidComposeView, androidComposeView));
            }
            T t = this.f325949f.f27484d;
            if (t != null) {
                this.f325947d.setView$ui_release((View) t);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k2.a$d */
    public static final class C108834d extends C87413o implements C32226l<C110282c0, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C108830a f325950d;

        /* renamed from: e */
        public final /* synthetic */ C8479f0<View> f325951e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108834d(C108830a aVar, C8479f0<View> f0Var) {
            super(1);
            this.f325950d = aVar;
            this.f325951e = f0Var;
        }

        public Object invoke(Object obj) {
            C110282c0 c0Var = (C110282c0) obj;
            C87412m.m108594g(c0Var, "owner");
            AndroidComposeView androidComposeView = c0Var instanceof AndroidComposeView ? (AndroidComposeView) c0Var : null;
            if (androidComposeView != null) {
                C108830a aVar = this.f325950d;
                C87412m.m108594g(aVar, "view");
                androidComposeView.getAndroidViewsHandler$ui_release().removeView(aVar);
                C24564k0.m30739c(androidComposeView.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder()).remove(androidComposeView.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(aVar));
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                C107207u.C107208b.m145191s(aVar, 0);
            }
            this.f325951e.f27484d = this.f325950d.getView();
            this.f325950d.setView$ui_release((View) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k2.a$e */
    public static final class C108835e implements C109895y {

        /* renamed from: a */
        public final /* synthetic */ C108830a f325952a;

        /* renamed from: b */
        public final /* synthetic */ C110301j f325953b;

        /* renamed from: k2.a$e$a */
        public static final class C108836a extends C87413o implements C32226l<C109854n0.C109855a, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C108830a f325954d;

            /* renamed from: e */
            public final /* synthetic */ C110301j f325955e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C108836a(C108830a aVar, C110301j jVar) {
                super(1);
                this.f325954d = aVar;
                this.f325955e = jVar;
            }

            public Object invoke(Object obj) {
                C87412m.m108594g((C109854n0.C109855a) obj, "$this$layout");
                C108845b.m147712a(this.f325954d, this.f325955e);
                return C13598b0.f38549a;
            }
        }

        public C108835e(C108830a aVar, C110301j jVar) {
            this.f325952a = aVar;
            this.f325953b = jVar;
        }

        /* renamed from: a */
        public int mo142884a(C109848k kVar, List<? extends C109846j> list, int i) {
            C87412m.m108594g(kVar, "<this>");
            C87412m.m108594g(list, "measurables");
            return mo159974f(i);
        }

        /* renamed from: b */
        public int mo142885b(C109848k kVar, List<? extends C109846j> list, int i) {
            C87412m.m108594g(kVar, "<this>");
            C87412m.m108594g(list, "measurables");
            return mo159975g(i);
        }

        /* renamed from: c */
        public int mo142886c(C109848k kVar, List<? extends C109846j> list, int i) {
            C87412m.m108594g(kVar, "<this>");
            C87412m.m108594g(list, "measurables");
            return mo159974f(i);
        }

        /* renamed from: d */
        public C109899z mo142887d(C109827a0 a0Var, List<? extends C109893x> list, long j) {
            C87412m.m108594g(a0Var, "$this$measure");
            C87412m.m108594g(list, "measurables");
            if (C108319b.m146699j(j) != 0) {
                this.f325952a.getChildAt(0).setMinimumWidth(C108319b.m146699j(j));
            }
            if (C108319b.m146698i(j) != 0) {
                this.f325952a.getChildAt(0).setMinimumHeight(C108319b.m146698i(j));
            }
            C108830a aVar = this.f325952a;
            int j2 = C108319b.m146699j(j);
            int h = C108319b.m146697h(j);
            ViewGroup.LayoutParams layoutParams = this.f325952a.getLayoutParams();
            C87412m.m108591d(layoutParams);
            int a = C108830a.m147698a(aVar, j2, h, layoutParams.width);
            C108830a aVar2 = this.f325952a;
            int i = C108319b.m146698i(j);
            int g = C108319b.m146696g(j);
            ViewGroup.LayoutParams layoutParams2 = this.f325952a.getLayoutParams();
            C87412m.m108591d(layoutParams2);
            aVar.measure(a, C108830a.m147698a(aVar2, i, g, layoutParams2.height));
            return C109827a0.C109828a.m149247b(a0Var, this.f325952a.getMeasuredWidth(), this.f325952a.getMeasuredHeight(), (Map) null, new C108836a(this.f325952a, this.f325953b), 4, (Object) null);
        }

        /* renamed from: e */
        public int mo142888e(C109848k kVar, List<? extends C109846j> list, int i) {
            C87412m.m108594g(kVar, "<this>");
            C87412m.m108594g(list, "measurables");
            return mo159975g(i);
        }

        /* renamed from: f */
        public final int mo159974f(int i) {
            C108830a aVar = this.f325952a;
            ViewGroup.LayoutParams layoutParams = aVar.getLayoutParams();
            C87412m.m108591d(layoutParams);
            aVar.measure(C108830a.m147698a(aVar, 0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
            return this.f325952a.getMeasuredHeight();
        }

        /* renamed from: g */
        public final int mo159975g(int i) {
            C108830a aVar = this.f325952a;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            C108830a aVar2 = this.f325952a;
            ViewGroup.LayoutParams layoutParams = aVar2.getLayoutParams();
            C87412m.m108591d(layoutParams);
            aVar.measure(makeMeasureSpec, C108830a.m147698a(aVar2, 0, i, layoutParams.height));
            return this.f325952a.getMeasuredWidth();
        }
    }

    /* renamed from: k2.a$f */
    public static final class C108837f extends C87413o implements C32226l<C104231f, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C110301j f325956d;

        /* renamed from: e */
        public final /* synthetic */ C108830a f325957e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108837f(C110301j jVar, C108830a aVar) {
            super(1);
            this.f325956d = jVar;
            this.f325957e = aVar;
        }

        public Object invoke(Object obj) {
            C104231f fVar = (C104231f) obj;
            C87412m.m108594g(fVar, "$this$drawBehind");
            C110301j jVar = this.f325956d;
            C108830a aVar = this.f325957e;
            C103262s i = fVar.mo145815B().mo145835i();
            C110282c0 c0Var = jVar.f329918j;
            AndroidComposeView androidComposeView = c0Var instanceof AndroidComposeView ? (AndroidComposeView) c0Var : null;
            if (androidComposeView != null) {
                Canvas canvas = C103226c.f304431a;
                C87412m.m108594g(i, "<this>");
                Canvas canvas2 = ((C103223b) i).f304427a;
                C87412m.m108594g(aVar, "view");
                C87412m.m108594g(canvas2, "canvas");
                androidComposeView.getAndroidViewsHandler$ui_release().getClass();
                aVar.draw(canvas2);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k2.a$g */
    public static final class C108838g extends C87413o implements C32226l<C109857o, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C108830a f325958d;

        /* renamed from: e */
        public final /* synthetic */ C110301j f325959e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108838g(C108830a aVar, C110301j jVar) {
            super(1);
            this.f325958d = aVar;
            this.f325959e = jVar;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C109857o) obj, LocaleUtil.ITALIAN);
            C108845b.m147712a(this.f325958d, this.f325959e);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k2.a$h */
    public static final class C108839h extends C87413o implements C32226l<C108830a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C108830a f325960d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108839h(C108830a aVar) {
            super(1);
            this.f325960d = aVar;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C108830a) obj, LocaleUtil.ITALIAN);
            this.f325960d.getHandler().post(new a$h$$a(this.f325960d.f325937s));
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1", mo125469f = "AndroidViewHolder.android.kt", mo125470l = {470, 475}, mo125471m = "invokeSuspend")
    /* renamed from: k2.a$i */
    public static final class C108840i extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f325961d;

        /* renamed from: e */
        public final /* synthetic */ boolean f325962e;

        /* renamed from: f */
        public final /* synthetic */ C108830a f325963f;

        /* renamed from: g */
        public final /* synthetic */ long f325964g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108840i(boolean z, C108830a aVar, long j, C15601d<? super C108840i> dVar) {
            super(2, dVar);
            this.f325962e = z;
            this.f325963f = aVar;
            this.f325964g = j;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C108840i(this.f325962e, this.f325963f, this.f325964g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C108840i) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f325961d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (!this.f325962e) {
                    C108797b bVar = this.f325963f.f325925d;
                    int i2 = C108330s.f324355c;
                    long j = C108330s.f324354b;
                    long j2 = this.f325964g;
                    this.f325961d = 1;
                    if (bVar.mo159900a(j, j2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    C108797b bVar2 = this.f325963f.f325925d;
                    long j3 = this.f325964g;
                    int i3 = C108330s.f324355c;
                    long j4 = C108330s.f324354b;
                    this.f325961d = 2;
                    if (bVar2.mo159900a(j3, j4, this) == aVar) {
                        return aVar;
                    }
                }
            } else if (i == 1 || i == 2) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1", mo125469f = "AndroidViewHolder.android.kt", mo125470l = {488}, mo125471m = "invokeSuspend")
    /* renamed from: k2.a$j */
    public static final class C108841j extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f325965d;

        /* renamed from: e */
        public final /* synthetic */ C108830a f325966e;

        /* renamed from: f */
        public final /* synthetic */ long f325967f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108841j(C108830a aVar, long j, C15601d<? super C108841j> dVar) {
            super(2, dVar);
            this.f325966e = aVar;
            this.f325967f = j;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C108841j(this.f325966e, this.f325967f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C108841j) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f325965d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C108797b bVar = this.f325966e.f325925d;
                long j = this.f325967f;
                this.f325965d = 1;
                if (bVar.mo159902c(j, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k2.a$k */
    public static final class C108842k extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C108830a f325968d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108842k(C108830a aVar) {
            super(0);
            this.f325968d = aVar;
        }

        public Object invoke() {
            C108830a aVar = this.f325968d;
            if (aVar.f325928g) {
                aVar.f325935q.mo162585b(aVar, aVar.f325936r, aVar.getUpdate());
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k2.a$l */
    public static final class C108843l extends C87413o implements C32226l<C32224a<? extends C13598b0>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C108830a f325969d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108843l(C108830a aVar) {
            super(1);
            this.f325969d = aVar;
        }

        public Object invoke(Object obj) {
            C32224a aVar = (C32224a) obj;
            C87412m.m108594g(aVar, "command");
            if (this.f325969d.getHandler().getLooper() == Looper.myLooper()) {
                aVar.invoke();
            } else {
                this.f325969d.getHandler().post(new a$l$$a(aVar));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k2.a$m */
    public static final class C108844m extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C108844m f325970d = new C108844m();

        public C108844m() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108830a(Context context, C24721r rVar, C108797b bVar) {
        super(context);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bVar, "dispatcher");
        this.f325925d = bVar;
        if (rVar != null) {
            Map<Context, C58050i1<Float>> map = C54196x2.f152157a;
            setTag(C0966R.C0970id.f5839q1, rVar);
        }
        setSaveFromParentEnabled(false);
        this.f325927f = C108844m.f325970d;
        this.f325929h = C65503j.C65504a.f188490d;
        this.f325931j = new C108324e(1.0f, 1.0f);
        this.f325935q = new C110879z(new C108843l(this));
        this.f325936r = new C108839h(this);
        this.f325937s = new C108842k(this);
        this.f325939u = new int[2];
        this.f325940v = Integer.MIN_VALUE;
        this.f325941w = Integer.MIN_VALUE;
        this.f325942x = new C107203p(this);
        C110301j jVar = new C110301j(false, 1, (C8480h) null);
        C109078a0 a0Var = new C109078a0();
        a0Var.f326639d = new C109084b0(this);
        C109091e0 e0Var = new C109091e0();
        C109091e0 e0Var2 = a0Var.f326640e;
        if (e0Var2 != null) {
            e0Var2.f326658d = null;
        }
        a0Var.f326640e = e0Var;
        e0Var.f326658d = a0Var;
        setOnRequestDisallowInterceptTouchEvent$ui_release(e0Var);
        C65503j a = C109845i0.m149273a(C111983i.m152700a(a0Var, new C108837f(jVar, this)), new C108838g(this, jVar));
        jVar.mo161675a(this.f325929h.mo74972i0(a));
        this.f325930i = new C108831a(jVar, a);
        jVar.mo161678g(this.f325931j);
        this.f325932n = new C108832b(jVar);
        C8479f0 f0Var = new C8479f0();
        jVar.f329904S = new C108833c(this, jVar, f0Var);
        jVar.f329905T = new C108834d(this, f0Var);
        jVar.mo161677e(new C108835e(this, jVar));
        this.f325943y = jVar;
    }

    /* renamed from: a */
    public static final int m147698a(C108830a aVar, int i, int i2, int i3) {
        aVar.getClass();
        return (i3 >= 0 || i == i2) ? View.MeasureSpec.makeMeasureSpec(C61595o.m72297e(i3, i, i2), 1073741824) : (i3 != -2 || i2 == Integer.MAX_VALUE) ? (i3 != -1 || i2 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i2, 1073741824) : View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
    }

    /* renamed from: Z */
    public boolean mo77716Z(View view, View view2, int i, int i2) {
        C87412m.m108594g(view, "child");
        C87412m.m108594g(view2, "target");
        return ((i & 2) == 0 && (i & 1) == 0) ? false : true;
    }

    /* renamed from: g */
    public void mo77725g(View view, View view2, int i, int i2) {
        C87412m.m108594g(view, "child");
        C87412m.m108594g(view2, "target");
        this.f325942x.mo157675a(view, view2, i, i2);
    }

    public boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(this.f325939u);
        int[] iArr = this.f325939u;
        int i = iArr[0];
        region.op(i, iArr[1], i + getWidth(), this.f325939u[1] + getHeight(), Region.Op.DIFFERENCE);
        return true;
    }

    public final C108322d getDensity() {
        return this.f325931j;
    }

    public final C110301j getLayoutNode() {
        return this.f325943y;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.getLayoutParams();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.ViewGroup.LayoutParams getLayoutParams() {
        /*
            r2 = this;
            android.view.View r0 = r2.f325926e
            if (r0 == 0) goto L_0x000a
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            if (r0 != 0) goto L_0x0010
        L_0x000a:
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -1
            r0.<init>(r1, r1)
        L_0x0010:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p583k2.C108830a.getLayoutParams():android.view.ViewGroup$LayoutParams");
    }

    public final C0125s getLifecycleOwner() {
        return this.f325933o;
    }

    public final C65503j getModifier() {
        return this.f325929h;
    }

    public int getNestedScrollAxes() {
        C107203p pVar = this.f325942x;
        return pVar.f320806b | pVar.f320805a;
    }

    public final C32226l<C108322d, C13598b0> getOnDensityChanged$ui_release() {
        return this.f325932n;
    }

    public final C32226l<C65503j, C13598b0> getOnModifierChanged$ui_release() {
        return this.f325930i;
    }

    public final C32226l<Boolean, C13598b0> getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.f325938t;
    }

    public final C104292c getSavedStateRegistryOwner() {
        return this.f325934p;
    }

    public final C32224a<C13598b0> getUpdate() {
        return this.f325927f;
    }

    public final View getView() {
        return this.f325926e;
    }

    /* renamed from: i */
    public void mo77718i(View view, int i) {
        C87412m.m108594g(view, "target");
        this.f325942x.mo157676b(view, i);
    }

    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        this.f325943y.mo161729x();
        return null;
    }

    public boolean isNestedScrollingEnabled() {
        View view = this.f325926e;
        return view != null ? view.isNestedScrollingEnabled() : super.isNestedScrollingEnabled();
    }

    /* renamed from: j */
    public void mo77727j(View view, int i, int i2, int i3, int i4, int i5) {
        C87412m.m108594g(view, "target");
        if (isNestedScrollingEnabled()) {
            float f = (float) i;
            float f2 = (float) -1;
            this.f325925d.mo159901b(C112540f.m153745a(f * f2, ((float) i2) * f2), C112540f.m153745a(((float) i3) * f2, ((float) i4) * f2), i5 == 0 ? 1 : 2);
        }
    }

    /* renamed from: n */
    public void mo77719n(View view, int i, int i2, int[] iArr, int i3) {
        C87412m.m108594g(view, "target");
        C87412m.m108594g(iArr, "consumed");
        if (isNestedScrollingEnabled()) {
            C108797b bVar = this.f325925d;
            float f = (float) -1;
            long a = C112540f.m153745a(((float) i) * f, ((float) i2) * f);
            int i4 = i3 == 0 ? 1 : 2;
            C108796a aVar = bVar.f325790c;
            long e = aVar != null ? aVar.mo159898e(a, i4) : C112539e.f336955b;
            iArr[0] = C103660l1.m137840a(C112539e.m153738c(e));
            iArr[1] = C103660l1.m137840a(C112539e.m153739d(e));
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f325935q.mo162586c();
    }

    public void onDescendantInvalidated(View view, View view2) {
        C87412m.m108594g(view, "child");
        C87412m.m108594g(view2, "target");
        super.onDescendantInvalidated(view, view2);
        this.f325943y.mo161729x();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C64198e eVar = this.f325935q.f331676e;
        if (eVar != null) {
            ((C64199g) eVar).dispose();
        }
        this.f325935q.mo162584a();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view = this.f325926e;
        if (view != null) {
            view.layout(0, 0, i3 - i, i4 - i2);
        }
    }

    public void onMeasure(int i, int i2) {
        View view = this.f325926e;
        if (view != null) {
            view.measure(i, i2);
        }
        View view2 = this.f325926e;
        int i3 = 0;
        int measuredWidth = view2 != null ? view2.getMeasuredWidth() : 0;
        View view3 = this.f325926e;
        if (view3 != null) {
            i3 = view3.getMeasuredHeight();
        }
        setMeasuredDimension(measuredWidth, i3);
        this.f325940v = i;
        this.f325941w = i2;
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        View view2 = view;
        C87412m.m108594g(view, "target");
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        long a = C108331t.m146750a(f * -1.0f, -1.0f * f2);
        C53895h.m60466d(this.f325925d.mo159903d(), (C66212f) null, (C53934p0) null, new C108840i(z, this, a, (C15601d<? super C108840i>) null), 3, (Object) null);
        return false;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        C87412m.m108594g(view, "target");
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        C53895h.m60466d(this.f325925d.mo159903d(), (C66212f) null, (C53934p0) null, new C108841j(this, C108331t.m146750a(f * -1.0f, f2 * -1.0f), (C15601d<? super C108841j>) null), 3, (Object) null);
        return false;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        C32226l<? super Boolean, C13598b0> lVar = this.f325938t;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setDensity(C108322d dVar) {
        C87412m.m108594g(dVar, "value");
        if (dVar != this.f325931j) {
            this.f325931j = dVar;
            C32226l<? super C108322d, C13598b0> lVar = this.f325932n;
            if (lVar != null) {
                lVar.invoke(dVar);
            }
        }
    }

    public final void setLifecycleOwner(C0125s sVar) {
        if (sVar != this.f325933o) {
            this.f325933o = sVar;
            setTag(C0966R.C0970id.l8r, sVar);
        }
    }

    public final void setModifier(C65503j jVar) {
        C87412m.m108594g(jVar, "value");
        if (jVar != this.f325929h) {
            this.f325929h = jVar;
            C32226l<? super C65503j, C13598b0> lVar = this.f325930i;
            if (lVar != null) {
                lVar.invoke(jVar);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(C32226l<? super C108322d, C13598b0> lVar) {
        this.f325932n = lVar;
    }

    public final void setOnModifierChanged$ui_release(C32226l<? super C65503j, C13598b0> lVar) {
        this.f325930i = lVar;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(C32226l<? super Boolean, C13598b0> lVar) {
        this.f325938t = lVar;
    }

    public final void setSavedStateRegistryOwner(C104292c cVar) {
        if (cVar != this.f325934p) {
            this.f325934p = cVar;
            C104293d.m139245b(this, cVar);
        }
    }

    public final void setUpdate(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "value");
        this.f325927f = aVar;
        this.f325928g = true;
        ((C108842k) this.f325937s).invoke();
    }

    public final void setView$ui_release(View view) {
        if (view != this.f325926e) {
            this.f325926e = view;
            removeAllViews();
            if (view != null) {
                addView(view);
                this.f325937s.invoke();
            }
        }
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    /* renamed from: v */
    public void mo145018v(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        C87412m.m108594g(view, "target");
        C87412m.m108594g(iArr, "consumed");
        if (isNestedScrollingEnabled()) {
            float f = (float) i;
            float f2 = (float) -1;
            long b = this.f325925d.mo159901b(C112540f.m153745a(f * f2, ((float) i2) * f2), C112540f.m153745a(((float) i3) * f2, ((float) i4) * f2), i5 == 0 ? 1 : 2);
            iArr[0] = C103660l1.m137840a(C112539e.m153738c(b));
            iArr[1] = C103660l1.m137840a(C112539e.m153739d(b));
        }
    }
}
