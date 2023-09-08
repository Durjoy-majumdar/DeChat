package as1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import bs1.C0375d;
import bs1.C0376e;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import com.tencent.p014mm.plugin.finder.view.drawer.FinderDraggableLayout;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import fy3.C32230s;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import rx3.C13598b0;
import zp3.C79406f;

/* renamed from: as1.a */
public class C0201a extends FinderDraggableLayout {

    /* renamed from: A */
    public C32227p<? super C0201a, ? super Float, C13598b0> f675A;

    /* renamed from: B */
    public C32227p<? super C0201a, ? super MotionEvent, Boolean> f676B = C0212k.f728d;

    /* renamed from: C */
    public C32228q<? super C0201a, ? super Boolean, ? super Float, Boolean> f677C = C0211j.f727d;

    /* renamed from: D */
    public C32230s<? super C0201a, ? super MotionEvent, ? super MotionEvent, ? super Float, ? super Float, Boolean> f678D = C0210i.f726d;

    /* renamed from: E */
    public View f679E;

    /* renamed from: F */
    public FrameLayout f680F;

    /* renamed from: G */
    public FrameLayout f681G;

    /* renamed from: H */
    public FrameLayout f682H;

    /* renamed from: I */
    public FrameLayout f683I;

    /* renamed from: J */
    public boolean f684J;

    /* renamed from: K */
    public C0376e f685K;

    /* renamed from: L */
    public C0376e f686L;

    /* renamed from: M */
    public C0376e f687M;

    /* renamed from: N */
    public C0376e f688N;

    /* renamed from: P */
    public Set<C0375d> f689P = new HashSet();

    /* renamed from: Q */
    public float f690Q = -1.0f;

    /* renamed from: Q0 */
    public int f691Q0;

    /* renamed from: R */
    public float f692R;

    /* renamed from: R0 */
    public int f693R0;

    /* renamed from: S */
    public List<C0203b> f694S = new ArrayList();

    /* renamed from: S0 */
    public boolean f695S0;

    /* renamed from: T */
    public boolean f696T;

    /* renamed from: U */
    public boolean f697U;

    /* renamed from: V */
    public final C0205d f698V = new C0205d();

    /* renamed from: W */
    public Paint f699W;

    /* renamed from: p0 */
    public Paint f700p0;

    /* renamed from: u */
    public C32224a<Boolean> f701u = C0204c.f721d;

    /* renamed from: v */
    public C32226l<? super C0201a, C13598b0> f702v;

    /* renamed from: w */
    public C32226l<? super C0201a, C13598b0> f703w;

    /* renamed from: x */
    public C32226l<? super C0201a, C13598b0> f704x;

    /* renamed from: x0 */
    public final float[] f705x0 = {0.0f, 1.0f};

    /* renamed from: y */
    public C32226l<? super C0201a, C13598b0> f706y;

    /* renamed from: y0 */
    public float f707y0 = ((float) C79406f.m96347a(getContext(), 60.0f));

    /* renamed from: z */
    public C32226l<? super C0201a, C13598b0> f708z;

    /* renamed from: as1.a$a */
    public static final class C0202a {

        /* renamed from: a */
        public float f709a = -1.0f;

        /* renamed from: b */
        public boolean f710b;

        /* renamed from: c */
        public boolean f711c;

        /* renamed from: d */
        public float f712d;

        /* renamed from: e */
        public C0376e f713e;

        /* renamed from: f */
        public C0376e f714f;

        /* renamed from: g */
        public C0376e f715g;

        /* renamed from: h */
        public Set<C0375d> f716h = new HashSet();

        /* renamed from: i */
        public FrameLayout.LayoutParams f717i = new FrameLayout.LayoutParams(-1, -1);

        /* renamed from: j */
        public List<C0203b> f718j = new ArrayList();

        /* renamed from: k */
        public int f719k = 2;

        /* renamed from: l */
        public int f720l;

        /* renamed from: a */
        public final C0201a mo235a(ViewGroup viewGroup) {
            C87412m.m108594g(viewGroup, "root");
            Context context = viewGroup.getContext();
            C87412m.m108593f(context, "root.context");
            if (!(this.f712d == 0.0f)) {
                C0201a aVar = new C0201a(context, this);
                viewGroup.removeView(aVar);
                viewGroup.addView(aVar);
                return aVar;
            }
            throw new IllegalStateException("expandHeight should not be zero");
        }
    }

    /* renamed from: as1.a$b */
    public interface C0203b {
        /* renamed from: g */
        Rect mo236g(C0201a aVar);
    }

    /* renamed from: as1.a$c */
    public static final class C0204c extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C0204c f721d = new C0204c();

        public C0204c() {
            super(0);
        }

        public Object invoke() {
            return Boolean.TRUE;
        }
    }

    /* renamed from: as1.a$d */
    public static final class C0205d implements C0203b {
        /* renamed from: g */
        public Rect mo236g(C0201a aVar) {
            View a;
            C87412m.m108594g(aVar, "drawer");
            Rect rect = new Rect();
            C0376e headerComponent = aVar.getHeaderComponent();
            if (!(headerComponent == null || (a = headerComponent.mo408a()) == null)) {
                a.getGlobalVisibleRect(rect);
            }
            return rect;
        }
    }

    /* renamed from: as1.a$e */
    public static final class C0206e extends C87413o implements C32226l<C0376e, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C0201a f722d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0206e(C0201a aVar) {
            super(1);
            this.f722d = aVar;
        }

        public Object invoke(Object obj) {
            C0376e eVar = (C0376e) obj;
            C87412m.m108594g(eVar, LocaleUtil.ITALIAN);
            eVar.mo412b(this.f722d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: as1.a$f */
    public static final class C0207f extends C87413o implements C32226l<C0376e, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C0201a f723d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0207f(C0201a aVar) {
            super(1);
            this.f723d = aVar;
        }

        public Object invoke(Object obj) {
            C0376e eVar = (C0376e) obj;
            C87412m.m108594g(eVar, LocaleUtil.ITALIAN);
            eVar.mo413c(this.f723d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: as1.a$g */
    public static final class C0208g extends C87413o implements C32226l<C0376e, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C0201a f724d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0208g(C0201a aVar) {
            super(1);
            this.f724d = aVar;
        }

        public Object invoke(Object obj) {
            C0376e eVar = (C0376e) obj;
            C87412m.m108594g(eVar, LocaleUtil.ITALIAN);
            eVar.mo414d(this.f724d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: as1.a$h */
    public static final class C0209h extends C87413o implements C32226l<C0376e, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C0201a f725d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0209h(C0201a aVar) {
            super(1);
            this.f725d = aVar;
        }

        public Object invoke(Object obj) {
            C0376e eVar = (C0376e) obj;
            C87412m.m108594g(eVar, LocaleUtil.ITALIAN);
            eVar.mo411e(this.f725d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: as1.a$i */
    public static final class C0210i extends C87413o implements C32230s<C0201a, MotionEvent, MotionEvent, Float, Float, Boolean> {

        /* renamed from: d */
        public static final C0210i f726d = new C0210i();

        public C0210i() {
            super(5);
        }

        /* renamed from: D */
        public Object mo237D(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            ((Number) obj4).floatValue();
            ((Number) obj5).floatValue();
            C87412m.m108594g((C0201a) obj, "<anonymous parameter 0>");
            C87412m.m108594g((MotionEvent) obj2, "<anonymous parameter 1>");
            C87412m.m108594g((MotionEvent) obj3, "<anonymous parameter 2>");
            return Boolean.TRUE;
        }
    }

    /* renamed from: as1.a$j */
    public static final class C0211j extends C87413o implements C32228q<C0201a, Boolean, Float, Boolean> {

        /* renamed from: d */
        public static final C0211j f727d = new C0211j();

        public C0211j() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            ((Boolean) obj2).booleanValue();
            ((Number) obj3).floatValue();
            C87412m.m108594g((C0201a) obj, "<anonymous parameter 0>");
            return Boolean.TRUE;
        }
    }

    /* renamed from: as1.a$k */
    public static final class C0212k extends C87413o implements C32227p<C0201a, MotionEvent, Boolean> {

        /* renamed from: d */
        public static final C0212k f728d = new C0212k();

        public C0212k() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            C87412m.m108594g((C0201a) obj, "<anonymous parameter 0>");
            C87412m.m108594g((MotionEvent) obj2, "<anonymous parameter 1>");
            return Boolean.TRUE;
        }
    }

    /* renamed from: as1.a$l */
    public static final class C0213l extends C87413o implements C32226l<C0376e, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C0201a f729d;

        /* renamed from: e */
        public final /* synthetic */ float f730e;

        /* renamed from: f */
        public final /* synthetic */ String f731f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0213l(C0201a aVar, float f, String str) {
            super(1);
            this.f729d = aVar;
            this.f730e = f;
            this.f731f = str;
        }

        public Object invoke(Object obj) {
            C0376e eVar = (C0376e) obj;
            C87412m.m108594g(eVar, LocaleUtil.ITALIAN);
            eVar.mo409f(this.f729d, this.f730e, this.f731f);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0201a(Context context, C0202a aVar) {
        super(context);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(aVar, "builder");
        this.f690Q = aVar.f709a;
        this.f692R = aVar.f712d;
        boolean z = aVar.f710b;
        this.f696T = z;
        setCancelSettleOnDown(!z);
        this.f697U = aVar.f711c;
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f683I = frameLayout;
        View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.csc, (ViewGroup) null);
        C87412m.m108593f(inflate, "getInflater(context).inf…nder_drawer_layout, null)");
        setContainer(inflate);
        View findViewById = getContainer().findViewById(C0966R.C0970id.f357884mp2);
        C87412m.m108593f(findViewById, "container.findViewById(R.id.drawerLayoutHeader)");
        setHeaderContainer((FrameLayout) findViewById);
        View findViewById2 = getContainer().findViewById(C0966R.C0970id.f357882mp0);
        C87412m.m108593f(findViewById2, "container.findViewById(R.id.drawerLayoutCenter)");
        setCenterContainer((FrameLayout) findViewById2);
        View findViewById3 = getContainer().findViewById(C0966R.C0970id.f357883mp1);
        C87412m.m108593f(findViewById3, "container.findViewById(R.id.drawerLayoutFooter)");
        this.f682H = (FrameLayout) findViewById3;
        getHeaderContainer().setOnClickListener(C0214b.f732d);
        getCenterContainer().setOnClickListener(C0215c.f733d);
        FrameLayout frameLayout2 = this.f682H;
        if (frameLayout2 != null) {
            frameLayout2.setOnClickListener(C0216d.f734d);
            View container = getContainer();
            RoundedCornerFrameLayout roundedCornerFrameLayout = container instanceof RoundedCornerFrameLayout ? (RoundedCornerFrameLayout) container : null;
            if (roundedCornerFrameLayout != null) {
                float dimension = roundedCornerFrameLayout.getContext().getResources().getDimension(C0966R.dimen.f3723cd);
                roundedCornerFrameLayout.mo153905b(dimension, dimension, 0.0f, 0.0f);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) this.f692R);
                layoutParams.gravity = 80;
                roundedCornerFrameLayout.setLayoutParams(layoutParams);
            }
            FrameLayout frameLayout3 = this.f683I;
            if (frameLayout3 != null) {
                addView(frameLayout3);
                addView(getContainer());
                C0376e eVar = aVar.f713e;
                if (eVar != null) {
                    setHeaderComponent(eVar);
                }
                C0376e eVar2 = aVar.f714f;
                if (eVar2 != null) {
                    setCenterComponent(eVar2);
                }
                C0376e eVar3 = aVar.f715g;
                if (eVar3 != null) {
                    setBackgroundComponent(eVar3);
                }
                Iterator it = ((HashSet) aVar.f716h).iterator();
                while (it.hasNext()) {
                    C0375d dVar = (C0375d) it.next();
                    C87412m.m108594g(dVar, "callbackComponent");
                    dVar.f978a = this;
                    ((HashSet) this.f689P).add(dVar);
                }
                if (aVar.f720l != 0) {
                    getContainer().setBackgroundColor(aVar.f720l);
                }
                C0205d dVar2 = this.f698V;
                C87412m.m108594g(dVar2, "area");
                ((ArrayList) this.f694S).add(dVar2);
                Iterator it4 = ((ArrayList) aVar.f718j).iterator();
                while (it4.hasNext()) {
                    C0203b bVar = (C0203b) it4.next();
                    C87412m.m108594g(bVar, "area");
                    ((ArrayList) this.f694S).add(bVar);
                }
                setLayoutParams(aVar.f717i);
                setContentView(getContainer());
                int i = aVar.f719k;
                if (i >= 0 && Math.abs(i) <= 2) {
                    this.f18132i = i;
                }
                setPeekHeight(this.f690Q);
                setExpandHeight(this.f692R);
                return;
            }
            C87412m.m108603p("backgroundContainer");
            throw null;
        }
        C87412m.m108603p("footerContainer");
        throw null;
    }

    /* renamed from: c */
    public void mo181c() {
        C32226l<? super C0201a, C13598b0> lVar = this.f703w;
        if (lVar != null) {
            lVar.invoke(this);
        }
        mo209n(new C0206e(this));
    }

    /* renamed from: d */
    public void mo182d() {
        mo208m((int) this.f690Q, (int) this.f692R);
        C32226l<? super C0201a, C13598b0> lVar = this.f706y;
        if (lVar != null) {
            lVar.invoke(this);
        }
        mo209n(new C0207f(this));
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        Canvas canvas2 = canvas;
        C87412m.m108594g(canvas, "canvas");
        View view2 = view;
        C87412m.m108594g(view, "child");
        if (!this.f695S0) {
            return super.drawChild(canvas, view, j);
        }
        int save = canvas.save();
        canvas.rotate(180.0f, ((float) this.f691Q0) / 2.0f, ((float) this.f693R0) / 2.0f);
        float f = (float) this.f691Q0;
        float f2 = this.f707y0;
        Paint paint = this.f700p0;
        C87412m.m108591d(paint);
        canvas.drawRect(0.0f, 0.0f, f, f2, paint);
        canvas.restoreToCount(save);
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), (Paint) null);
        boolean drawChild = super.drawChild(canvas, view, j);
        int save2 = canvas.save();
        canvas.rotate(180.0f, ((float) this.f691Q0) / 2.0f, ((float) this.f693R0) / 2.0f);
        float f3 = (float) this.f691Q0;
        float f4 = this.f707y0;
        Paint paint2 = this.f699W;
        C87412m.m108591d(paint2);
        canvas.drawRect(0.0f, 0.0f, f3, f4, paint2);
        canvas.restoreToCount(save2);
        canvas.restoreToCount(saveLayer);
        return drawChild;
    }

    /* renamed from: e */
    public void mo184e() {
        C32226l<? super C0201a, C13598b0> lVar = this.f702v;
        if (lVar != null) {
            lVar.invoke(this);
        }
        mo209n(new C0208g(this));
    }

    /* renamed from: f */
    public void mo185f() {
        if (!this.f697U) {
            mo208m((int) this.f692R, (int) this.f690Q);
        }
        C32226l<? super C0201a, C13598b0> lVar = this.f704x;
        if (lVar != null) {
            lVar.invoke(this);
        }
        mo209n(new C0209h(this));
    }

    /* renamed from: g */
    public boolean mo186g(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C87412m.m108594g(motionEvent, "e1");
        C87412m.m108594g(motionEvent2, "e2");
        boolean booleanValue = this.f701u.invoke().booleanValue();
        if (!this.f684J) {
            if (booleanValue && f2 > 0.0f) {
                if (this.f678D.mo237D(this, motionEvent, motionEvent2, Float.valueOf(f), Float.valueOf(f2)).booleanValue()) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final C0376e getBackgroundComponent() {
        return this.f688N;
    }

    public final C0376e getCenterComponent() {
        return this.f686L;
    }

    public final FrameLayout getCenterContainer() {
        FrameLayout frameLayout = this.f681G;
        if (frameLayout != null) {
            return frameLayout;
        }
        C87412m.m108603p("centerContainer");
        throw null;
    }

    public final View getContainer() {
        View view = this.f679E;
        if (view != null) {
            return view;
        }
        C87412m.m108603p("container");
        throw null;
    }

    public final C32224a<Boolean> getContentReachTop() {
        return this.f701u;
    }

    public final boolean getEnableFading() {
        return this.f695S0;
    }

    public final C0376e getFooterComponent() {
        return this.f687M;
    }

    public final C0376e getHeaderComponent() {
        return this.f685K;
    }

    public final FrameLayout getHeaderContainer() {
        FrameLayout frameLayout = this.f680F;
        if (frameLayout != null) {
            return frameLayout;
        }
        C87412m.m108603p("headerContainer");
        throw null;
    }

    public final C32226l<C0201a, C13598b0> getOnDrawerClose() {
        return this.f703w;
    }

    public final C32226l<C0201a, C13598b0> getOnDrawerDetach() {
        return this.f708z;
    }

    public final C32226l<C0201a, C13598b0> getOnDrawerExpand() {
        return this.f706y;
    }

    public final C32226l<C0201a, C13598b0> getOnDrawerOpen() {
        return this.f702v;
    }

    public final C32226l<C0201a, C13598b0> getOnDrawerPeek() {
        return this.f704x;
    }

    public final C32230s<C0201a, MotionEvent, MotionEvent, Float, Float, Boolean> getOnInterceptFling() {
        return this.f678D;
    }

    public final C32228q<C0201a, Boolean, Float, Boolean> getOnInterceptScroll() {
        return this.f677C;
    }

    public final C32227p<C0201a, MotionEvent, Boolean> getOnInterceptTouch() {
        return this.f676B;
    }

    public final C32227p<C0201a, Float, C13598b0> getOnTranslationChange() {
        return this.f675A;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0056, code lost:
        if (r0 != false) goto L_0x005a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0077  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo205h(boolean r5, float r6) {
        /*
            r4 = this;
            fy3.a<java.lang.Boolean> r0 = r4.f701u
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            if (r5 != 0) goto L_0x005a
            boolean r3 = r4.f18137q
            if (r3 == 0) goto L_0x0018
            boolean r3 = r4.f684J
            if (r3 != 0) goto L_0x0058
        L_0x0018:
            if (r0 == 0) goto L_0x005a
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0058
            float r0 = r4.getTranslation()
            float r3 = r4.getBorderLow()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x002d
            r0 = 1
            goto L_0x002e
        L_0x002d:
            r0 = 0
        L_0x002e:
            if (r0 != 0) goto L_0x0055
            float r0 = r4.getTranslation()
            float r3 = r4.getBorderHigh()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x003e
            r0 = 1
            goto L_0x003f
        L_0x003e:
            r0 = 0
        L_0x003f:
            if (r0 != 0) goto L_0x0055
            float r0 = r4.getTranslation()
            float r3 = r4.getBorderPeek()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x004f
            r0 = 1
            goto L_0x0050
        L_0x004f:
            r0 = 0
        L_0x0050:
            if (r0 == 0) goto L_0x0053
            goto L_0x0055
        L_0x0053:
            r0 = 0
            goto L_0x0056
        L_0x0055:
            r0 = 1
        L_0x0056:
            if (r0 != 0) goto L_0x005a
        L_0x0058:
            r0 = 1
            goto L_0x005b
        L_0x005a:
            r0 = 0
        L_0x005b:
            if (r0 == 0) goto L_0x0074
            fy3.q<? super as1.a, ? super java.lang.Boolean, ? super java.lang.Float, java.lang.Boolean> r0 = r4.f677C
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            java.lang.Object r5 = r0.invoke(r4, r5, r6)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0074
            goto L_0x0075
        L_0x0074:
            r1 = 0
        L_0x0075:
            if (r1 == 0) goto L_0x0080
            float r5 = r4.f690Q
            int r5 = (int) r5
            float r6 = r4.f692R
            int r6 = (int) r6
            r4.mo208m(r5, r6)
        L_0x0080:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: as1.C0201a.mo205h(boolean, float):boolean");
    }

    /* renamed from: i */
    public boolean mo206i(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "e");
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 0) {
            this.f684J = false;
            Iterator<T> it = this.f694S.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C0203b) it.next()).mo236g(this).contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        this.f684J = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        } else if (action == 1 || action == 3) {
            this.f684J = false;
        }
        if (!this.f18137q || !this.f676B.invoke(this, motionEvent).booleanValue()) {
            z = false;
        }
        if (!z) {
            this.f684J = false;
        }
        return z;
    }

    /* renamed from: j */
    public void mo207j(float f, String str) {
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
        C32227p<? super C0201a, ? super Float, C13598b0> pVar = this.f675A;
        if (pVar != null) {
            pVar.invoke(this, Float.valueOf(f));
        }
        mo209n(new C0213l(this, f, str));
    }

    /* renamed from: m */
    public final void mo208m(int i, int i2) {
        if (getContainer().getLayoutParams().height == i) {
            View container = getContainer();
            ViewGroup.LayoutParams layoutParams = getContainer().getLayoutParams();
            layoutParams.height = i2;
            container.setLayoutParams(layoutParams);
            View container2 = getContainer();
            float f = (float) (i - i2);
            container2.setTranslationY(container2.getTranslationY() - f);
            setOriginalTranslationY(getOriginalTranslationY() - f);
        }
    }

    /* renamed from: n */
    public final void mo209n(C32226l<? super C0376e, C13598b0> lVar) {
        C0376e eVar = this.f685K;
        if (eVar != null) {
            lVar.invoke(eVar);
        }
        C0376e eVar2 = this.f686L;
        if (eVar2 != null) {
            lVar.invoke(eVar2);
        }
        C0376e eVar3 = this.f687M;
        if (eVar3 != null) {
            lVar.invoke(eVar3);
        }
        C0376e eVar4 = this.f688N;
        if (eVar4 != null) {
            lVar.invoke(eVar4);
        }
        for (C0375d invoke : this.f689P) {
            lVar.invoke(invoke);
        }
    }

    /* renamed from: o */
    public final void mo210o() {
        Paint paint = new Paint(1);
        this.f699W = paint;
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = this.f699W;
        C87412m.m108591d(paint2);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        int[] iArr = {MMApplicationContext.getColor(C0966R.color.al6), 0};
        Paint paint3 = this.f699W;
        C87412m.m108591d(paint3);
        paint3.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, this.f707y0, iArr, this.f705x0, Shader.TileMode.CLAMP));
        Paint paint4 = new Paint();
        this.f700p0 = paint4;
        paint4.setColor(MMApplicationContext.getColor(C0966R.color.al6));
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C32226l<? super C0201a, C13598b0> lVar = this.f708z;
        if (lVar != null) {
            lVar.invoke(this);
        }
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "e");
        if (this.f696T) {
            Rect g = this.f698V.mo236g(this);
            int i = g.top;
            int i2 = g.bottom;
            if (i != i2) {
                g.bottom = i2 + C79406f.m96347a(getContext(), 16.0f);
            }
            if (g.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                if (getTranslation() == getBorderExpand()) {
                    mo4919k(2, !getCanPeek());
                } else {
                    if (getTranslation() == getBorderPeek()) {
                        mo4919k(-2, true);
                    } else {
                        FinderDraggableLayout.m4280l(this, 0, false, 3, (Object) null);
                    }
                }
            }
        }
        super.onSingleTapUp(motionEvent);
        return false;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        mo210o();
        this.f691Q0 = getWidth();
        this.f693R0 = getHeight();
    }

    /* renamed from: p */
    public final void mo214p(boolean z) {
        if (z && this.f699W == null) {
            mo210o();
        }
        if (this.f695S0 != z) {
            postInvalidate();
        }
        this.f695S0 = z;
    }

    /* renamed from: q */
    public final void mo215q(ViewGroup viewGroup, View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup2 != null) {
            viewGroup2.removeView(view);
        }
        viewGroup.removeAllViews();
        viewGroup.addView(view);
    }

    public final void setBackgroundComponent(C0376e eVar) {
        C87412m.m108594g(eVar, "component");
        this.f688N = eVar;
        eVar.f978a = this;
        View a = eVar.mo408a();
        if (a != null) {
            FrameLayout frameLayout = this.f683I;
            if (frameLayout != null) {
                mo215q(frameLayout, a);
            } else {
                C87412m.m108603p("backgroundContainer");
                throw null;
            }
        }
    }

    public final void setCenterComponent(C0376e eVar) {
        C87412m.m108594g(eVar, "component");
        this.f686L = eVar;
        eVar.f978a = this;
        View a = eVar.mo408a();
        if (a != null) {
            mo215q(getCenterContainer(), a);
        }
    }

    public final void setCenterContainer(FrameLayout frameLayout) {
        C87412m.m108594g(frameLayout, "<set-?>");
        this.f681G = frameLayout;
    }

    public final void setContainer(View view) {
        C87412m.m108594g(view, "<set-?>");
        this.f679E = view;
    }

    public final void setContentReachTop(C32224a<Boolean> aVar) {
        C87412m.m108594g(aVar, "<set-?>");
        this.f701u = aVar;
    }

    public final void setEnableFading(boolean z) {
        this.f695S0 = z;
    }

    public void setExpandHeight(float f) {
        super.setExpandHeight(f);
        if (!(this.f692R == f)) {
            this.f692R = f;
            View container = getContainer();
            RoundedCornerFrameLayout roundedCornerFrameLayout = container instanceof RoundedCornerFrameLayout ? (RoundedCornerFrameLayout) container : null;
            if (roundedCornerFrameLayout != null) {
                roundedCornerFrameLayout.getLayoutParams().height = (int) this.f692R;
                roundedCornerFrameLayout.requestLayout();
            }
        }
    }

    public final void setFooterComponent(C0376e eVar) {
        C87412m.m108594g(eVar, "component");
        this.f687M = eVar;
        eVar.f978a = this;
        View a = eVar.mo408a();
        if (a != null) {
            FrameLayout frameLayout = this.f682H;
            if (frameLayout != null) {
                mo215q(frameLayout, a);
            } else {
                C87412m.m108603p("footerContainer");
                throw null;
            }
        }
    }

    public final void setHeaderComponent(C0376e eVar) {
        C87412m.m108594g(eVar, "component");
        this.f685K = eVar;
        eVar.f978a = this;
        View a = eVar.mo408a();
        if (a != null) {
            mo215q(getHeaderContainer(), a);
        }
    }

    public final void setHeaderContainer(FrameLayout frameLayout) {
        C87412m.m108594g(frameLayout, "<set-?>");
        this.f680F = frameLayout;
    }

    public final void setOnDrawerClose(C32226l<? super C0201a, C13598b0> lVar) {
        this.f703w = lVar;
    }

    public final void setOnDrawerDetach(C32226l<? super C0201a, C13598b0> lVar) {
        this.f708z = lVar;
    }

    public final void setOnDrawerExpand(C32226l<? super C0201a, C13598b0> lVar) {
        this.f706y = lVar;
    }

    public final void setOnDrawerOpen(C32226l<? super C0201a, C13598b0> lVar) {
        this.f702v = lVar;
    }

    public final void setOnDrawerPeek(C32226l<? super C0201a, C13598b0> lVar) {
        this.f704x = lVar;
    }

    public final void setOnInterceptFling(C32230s<? super C0201a, ? super MotionEvent, ? super MotionEvent, ? super Float, ? super Float, Boolean> sVar) {
        C87412m.m108594g(sVar, "<set-?>");
        this.f678D = sVar;
    }

    public final void setOnInterceptScroll(C32228q<? super C0201a, ? super Boolean, ? super Float, Boolean> qVar) {
        C87412m.m108594g(qVar, "<set-?>");
        this.f677C = qVar;
    }

    public final void setOnInterceptTouch(C32227p<? super C0201a, ? super MotionEvent, Boolean> pVar) {
        C87412m.m108594g(pVar, "<set-?>");
        this.f676B = pVar;
    }

    public final void setOnTranslationChange(C32227p<? super C0201a, ? super Float, C13598b0> pVar) {
        this.f675A = pVar;
    }
}
