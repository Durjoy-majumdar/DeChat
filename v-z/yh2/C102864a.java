package yh2;

import ai2.C92007a;
import ai2.C92010c;
import ai2.C92011d;
import ai2.C92015i;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import bi2.C92262a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.widget.cropview.TouchEventLayout;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.PhotoTextView;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.item.EditorItemContainer;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C86013q1;
import fi2.C107554b;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gi2.C107818f;
import gi2.C98129b;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.Iterator;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import p213oh.C11412b;
import pe3.C89349b;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C64368fm;
import zg2.C103020m;

/* renamed from: yh2.a */
public final class C102864a extends TouchEventLayout implements C92015i, C107818f {

    /* renamed from: A */
    public final C13601g f303626A;

    /* renamed from: B */
    public final C13601g f303627B;

    /* renamed from: C */
    public final C13601g f303628C;

    /* renamed from: D */
    public final C13601g f303629D;

    /* renamed from: E */
    public final View f303630E;

    /* renamed from: F */
    public final int f303631F;

    /* renamed from: G */
    public long f303632G;

    /* renamed from: H */
    public C32226l<? super View, C13598b0> f303633H;

    /* renamed from: I */
    public boolean f303634I;

    /* renamed from: J */
    public final float[] f303635J;

    /* renamed from: K */
    public final Runnable f303636K;

    /* renamed from: n */
    public C92010c f303637n;

    /* renamed from: o */
    public final C107554b f303638o = new C107554b();

    /* renamed from: p */
    public final Rect f303639p = new Rect(0, 0, C75044y4.m89990b(MMApplicationContext.getContext()).x, C75044y4.m89990b(MMApplicationContext.getContext()).y);

    /* renamed from: q */
    public final Rect f303640q = new Rect(0, 0, C75044y4.m89990b(MMApplicationContext.getContext()).x, C75044y4.m89990b(MMApplicationContext.getContext()).y);

    /* renamed from: r */
    public EditorItemContainer.C94437a f303641r;

    /* renamed from: s */
    public final RectF f303642s = new RectF();

    /* renamed from: t */
    public final RectF f303643t = new RectF();

    /* renamed from: u */
    public final Matrix f303644u = new Matrix();

    /* renamed from: v */
    public float f303645v;

    /* renamed from: w */
    public float f303646w;

    /* renamed from: x */
    public boolean f303647x;

    /* renamed from: y */
    public boolean f303648y;

    /* renamed from: z */
    public final int f303649z;

    /* renamed from: yh2.a$a */
    public static final class C53523a extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ C102864a f150490d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53523a(C102864a aVar) {
            super(0);
            this.f150490d = aVar;
        }

        public Object invoke() {
            return (LinearLayout) this.f150490d.findViewById(C0966R.C0970id.aqi);
        }
    }

    /* renamed from: yh2.a$b */
    public static final class C53524b extends C87413o implements C32224a<RelativeLayout> {

        /* renamed from: d */
        public final /* synthetic */ C102864a f150491d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53524b(C102864a aVar) {
            super(0);
            this.f150491d = aVar;
        }

        public Object invoke() {
            return (RelativeLayout) this.f150491d.findViewById(C0966R.C0970id.aql);
        }
    }

    /* renamed from: yh2.a$c */
    public static final class C53525c extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ C102864a f150492d;

        /* renamed from: e */
        public final /* synthetic */ Context f150493e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53525c(C102864a aVar, Context context) {
            super(0);
            this.f150492d = aVar;
            this.f150493e = context;
        }

        public Object invoke() {
            LinearLayout linearLayout = (LinearLayout) this.f150492d.findViewById(C0966R.C0970id.aqp);
            ((TextView) linearLayout.findViewById(C0966R.C0970id.aqq)).setText(C76577a.m92166q(this.f150493e, C0966R.string.k_g));
            View findViewById = linearLayout.findViewById(C0966R.C0970id.aqo);
            Context context = this.f150493e;
            C102864a aVar = this.f150492d;
            TextView textView = (TextView) findViewById;
            textView.setText(C76577a.m92166q(context, C0966R.string.k_d));
            textView.setOnClickListener(new C53527b(aVar));
            return linearLayout;
        }
    }

    /* renamed from: yh2.a$d */
    public static final class C53526d extends C87413o implements C32224a<PhotoTextView> {

        /* renamed from: d */
        public final /* synthetic */ C102864a f150494d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53526d(C102864a aVar) {
            super(0);
            this.f150494d = aVar;
        }

        public Object invoke() {
            return (PhotoTextView) this.f150494d.findViewById(C0966R.C0970id.aqt);
        }
    }

    /* renamed from: yh2.a$e */
    public static final class C102865e extends C87413o implements C32227p<Matrix, Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C102864a f303650d;

        /* renamed from: e */
        public final /* synthetic */ MotionEvent f303651e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C102865e(C102864a aVar, MotionEvent motionEvent) {
            super(2);
            this.f303650d = aVar;
            this.f303651e = motionEvent;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x001c, code lost:
            r2 = r1.f303650d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            /*
                r1 = this;
                android.graphics.Matrix r2 = (android.graphics.Matrix) r2
                java.lang.Boolean r3 = (java.lang.Boolean) r3
                boolean r3 = r3.booleanValue()
                java.lang.String r0 = "m"
                gy3.C87412m.m108594g(r2, r0)
                yh2.a r0 = r1.f303650d
                android.graphics.Matrix r0 = r0.f303644u
                r0.set(r2)
                yh2.a r2 = r1.f303650d
                r2.mo142574j()
                if (r3 == 0) goto L_0x0027
                yh2.a r2 = r1.f303650d
                com.tencent.mm.plugin.recordvideo.ui.editor.item.EditorItemContainer$a r3 = r2.f303641r
                if (r3 == 0) goto L_0x0027
                android.view.MotionEvent r0 = r1.f303651e
                r3.mo129926a(r2, r0)
            L_0x0027:
                rx3.b0 r2 = rx3.C13598b0.f38549a
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: yh2.C102864a.C102865e.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: yh2.a$f */
    public static final class C102866f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C102864a f303652d;

        public C102866f(C102864a aVar) {
            this.f303652d = aVar;
        }

        public final void run() {
            this.f303652d.getCaptionView().setBackgroundDrawable((Drawable) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102864a(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        C76577a.m92151b(context, 4);
        this.f303649z = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f303626A = C36568h.m40985a(new C53526d(this));
        this.f303627B = C36568h.m40985a(new C53524b(this));
        this.f303628C = C36568h.m40985a(new C53523a(this));
        this.f303629D = C36568h.m40985a(new C53525c(this, context));
        this.f303631F = C76577a.m92151b(getContext(), 32);
        C76577a.m92145A(context);
        C76577a.m92157h(context, C0966R.dimen.f3717c9);
        this.f303635J = new float[2];
        this.f303636K = new C102866f(this);
        setEnableFling(false);
        if (C87412m.m108589b(Looper.myLooper(), Looper.getMainLooper())) {
            getTouchDetector().setIsLongpressEnabled(false);
        }
        LayoutInflater.from(context).inflate(C0966R.C0971layout.cbi, this, true);
        LayoutInflater.from(context).inflate(C0966R.C0971layout.cbh, this, true);
        View findViewById = findViewById(C0966R.C0970id.aqk);
        C87412m.m108593f(findViewById, "findViewById(R.id.caption_float_comment)");
        this.f303630E = findViewById;
        getCaptionView().setText(C76577a.m92166q(context, C0966R.string.k_g));
        setOnTouchListener(this);
    }

    private final LinearLayout getCaptionContentLayout() {
        return (LinearLayout) ((C36570n) this.f303628C).getValue();
    }

    private final RelativeLayout getCaptionLayout() {
        return (RelativeLayout) ((C36570n) this.f303627B).getValue();
    }

    private final LinearLayout getCaptionLoadingLayout() {
        return (LinearLayout) ((C36570n) this.f303629D).getValue();
    }

    /* access modifiers changed from: private */
    public final PhotoTextView getCaptionView() {
        return (PhotoTextView) ((C36570n) this.f303626A).getValue();
    }

    /* renamed from: a */
    public boolean mo53770a(long j) {
        C89349b bVar;
        this.f303632G = j;
        C92010c cVar = this.f303637n;
        C64368fm i = cVar != null ? cVar.mo125902i(j) : null;
        String g = (i == null || (bVar = i.f183148d) == null) ? null : bVar.mo123704g("UTF-8");
        if (!TextUtils.isEmpty(g)) {
            setVisibility(0);
            getCaptionView().setAutoSizeTextTypeWithDefaults(0);
            getCaptionView().setText("");
            getCaptionView().setTextSize(0, (float) C76577a.m92157h(getContext(), C0966R.dimen.f3882hr));
            getCaptionView().setAutoSizeTextTypeWithDefaults(1);
            getCaptionView().setVisibility(0);
            getCaptionView().setText(g);
            C87412m.m108591d(i);
            boolean z = !i.f183151g;
            this.f303634I = z;
            if (!z) {
                getCaptionView().setBackgroundDrawable((Drawable) null);
                int i2 = C11412b.f33577a;
                Log.m105919d("MicroMsg.CaptionItemView", "text it not empty, not enableEdit, set INVISIBLE", (Object[]) null);
                getCaptionContentLayout().setVisibility(4);
                getCaptionLoadingLayout().setVisibility(0);
                return true;
            }
            int i3 = C11412b.f33577a;
            Log.m105919d("MicroMsg.CaptionItemView", "text it not empty, not enableEdit, set VISIBLE", (Object[]) null);
            getCaptionContentLayout().setVisibility(0);
            getCaptionLoadingLayout().setVisibility(4);
            return true;
        }
        int i4 = C11412b.f33577a;
        Log.m105919d("MicroMsg.CaptionItemView", "text it empty, set INVISIBLE", (Object[]) null);
        setVisibility(4);
        return false;
    }

    /* renamed from: d */
    public C92007a mo53771d() {
        C92010c cVar = this.f303637n;
        if (cVar == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(getCaptionLayout().getScaleX(), getCaptionLayout().getScaleY());
        int[] iArr = new int[2];
        getCaptionLayout().getLocationOnScreen(iArr);
        matrix.postTranslate(0.0f, (float) iArr[1]);
        C92010c cVar2 = new C92010c(cVar.f263402a, cVar.f263432g, matrix);
        cVar2.f263435j = cVar.f263435j;
        cVar2.f263433h = cVar.f263433h;
        cVar2.f263434i = cVar.f263434i;
        return cVar2;
    }

    public void dispatchDraw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        canvas.save();
        canvas.clipRect(this.f303639p);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    /* renamed from: e */
    public boolean mo53772e(String str) {
        return C107818f.C107819a.m146078b(this, str);
    }

    /* renamed from: f */
    public void mo53773f(Rect rect, float f) {
        C87412m.m108594g(rect, "displayRect");
        this.f303640q.set(rect);
        this.f303638o.f321815p = rect.width();
        this.f303642s.right = (float) rect.width();
        measure(0, 0);
        C103020m mVar = C103020m.f303985a;
        float measuredHeight = (((float) C103020m.f303989e.bottom) - (((float) (getCaptionLayout().getMeasuredHeight() + getCaptionContentLayout().getMeasuredHeight())) / 2.0f)) - ((float) this.f303631F);
        C107554b bVar = this.f303638o;
        int i = bVar.f321815p;
        int i2 = bVar.f321814o;
        bVar.getClass();
        bVar.f321811l = new float[]{0.0f, 0.0f, (float) i, 0.0f, 0.0f, (float) i2, (float) i, (float) i2};
        this.f303644u.postTranslate(0.0f, measuredHeight);
        mo142574j();
        int i3 = C11412b.f33577a;
        Log.m105925i("MicroMsg.CaptionItemView", "topMargin:" + measuredHeight + " width:" + rect.width(), (Object[]) null);
    }

    public final C32226l<View, C13598b0> getClearCaptionListener() {
        return this.f303633H;
    }

    public float[] getContentBoundary() {
        return (float[]) this.f303638o.f321813n.clone();
    }

    public final C64368fm getCurrentCaption() {
        C92010c cVar = this.f303637n;
        if (cVar == null) {
            return null;
        }
        long j = this.f303632G;
        Iterator<C64368fm> it = cVar.f263432g.iterator();
        while (it.hasNext()) {
            C64368fm next = it.next();
            if (next.f183149e <= j && next.f183150f >= j) {
                return next;
            }
        }
        return null;
    }

    public RectF getDrawRect() {
        return this.f303643t;
    }

    public C92007a getEditorData() {
        return this.f303637n;
    }

    public final boolean getEnableEdit() {
        return this.f303634I;
    }

    public Rect getSafeArea() {
        Rect rect = this.f303638o.f321807h;
        return rect == null ? new Rect(0, 0, getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels) : rect;
    }

    public final int getTouchSlop() {
        return this.f303649z;
    }

    public final C107554b getTouchTracker() {
        return this.f303638o;
    }

    public C98129b getType() {
        C92011d dVar = C92011d.RECORD_CAPTION;
        C92010c cVar = this.f303637n;
        return (cVar != null ? cVar.f263402a : null) == dVar ? C98129b.EditItemTypeRecordCaption : C98129b.EditItemTypeCaption;
    }

    /* renamed from: h */
    public boolean mo53780h() {
        return true;
    }

    /* renamed from: i */
    public C92262a mo53781i(Matrix matrix) {
        return null;
    }

    /* renamed from: j */
    public final void mo142574j() {
        this.f303644u.mapRect(this.f303643t, this.f303642s);
        float[] fArr = new float[9];
        this.f303644u.getValues(fArr);
        Matrix matrix = this.f303644u;
        C87412m.m108594g(matrix, "matrix");
        float[] fArr2 = new float[9];
        matrix.getValues(fArr2);
        double d = (double) fArr2[0];
        double d2 = (double) fArr2[3];
        float sqrt = (float) Math.sqrt((d * d) + (d2 * d2));
        getCaptionLayout().setPivotX(0.0f);
        getCaptionLayout().setPivotY(0.0f);
        getCaptionLayout().setScaleX(sqrt);
        getCaptionLayout().setScaleY(sqrt);
        getCaptionLayout().setTranslationX(fArr[2]);
        getCaptionLayout().setTranslationY(fArr[5]);
    }

    /* renamed from: k */
    public final void mo142575k() {
        float[] fArr = {this.f303642s.right, (float) getCaptionContentLayout().getBottom()};
        this.f303644u.mapPoints(fArr);
        float f = ((float) (this.f303639p.bottom - this.f303631F)) - fArr[1];
        if (f < 0.0f) {
            this.f303644u.postTranslate(0.0f, f);
            View view = this.f303630E;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/recordvideo/ui/editor/CaptionItemView", "checkMatrix", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/recordvideo/ui/editor/CaptionItemView", "checkMatrix", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: l */
    public final void mo142576l(C92010c cVar) {
        C87412m.m108594g(cVar, "captionItem");
        this.f303637n = cVar;
        if (cVar.f263433h != 0) {
            getCaptionView().setTextColor(cVar.f263433h);
        }
        getCaptionView().setTextBackground(cVar.f263434i);
        if (TextUtils.isEmpty(cVar.f263435j)) {
            getCaptionView().setTypeface(getCaptionView().getTypeface(), 1);
        } else if (C86013q1.m106450k(cVar.f263435j)) {
            getCaptionView().setTypeface(Typeface.createFromFile(cVar.f263435j));
        } else {
            getCaptionView().setTypeface(Typeface.DEFAULT);
        }
        int i = C11412b.f33577a;
        Log.m105925i("MicroMsg.CaptionItemView", "updateCaptionItem caption:" + cVar, (Object[]) null);
    }

    /* renamed from: m */
    public void mo53782m(Rect rect, int i) {
        C87412m.m108594g(rect, "safeRect");
        C107554b bVar = this.f303638o;
        bVar.f321807h = rect;
        bVar.f321808i = C76577a.m92151b(getContext(), i);
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        C87412m.m108594g(scaleGestureDetector, "detector");
        float focusY = scaleGestureDetector.getFocusY();
        float scaleFactor = ((float) 1) - scaleGestureDetector.getScaleFactor();
        this.f303644u.postScale(scaleGestureDetector.getScaleFactor(), scaleGestureDetector.getScaleFactor());
        this.f303644u.postTranslate(this.f303642s.centerX() * scaleFactor, focusY * scaleFactor);
        mo142575k();
        mo142574j();
        return true;
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C87412m.m108594g(motionEvent, "e1");
        C87412m.m108594g(motionEvent2, "e2");
        this.f303644u.postTranslate(0.0f, -f2);
        mo142575k();
        mo142574j();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
        if (r2 != 3) goto L_0x0149;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r19, android.view.MotionEvent r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            java.lang.String r2 = "v"
            r3 = r19
            gy3.C87412m.m108594g(r3, r2)
            java.lang.String r2 = "event"
            gy3.C87412m.m108594g(r1, r2)
            int r2 = r20.getActionMasked()
            r4 = 3
            r5 = 1073741824(0x40000000, float:2.0)
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L_0x0112
            r8 = 2
            if (r2 == r6) goto L_0x0051
            if (r2 == r8) goto L_0x0025
            if (r2 == r4) goto L_0x0051
            goto L_0x0149
        L_0x0025:
            float r2 = r20.getX()
            float r5 = r0.f303645v
            float r2 = r2 - r5
            float r2 = java.lang.Math.abs(r2)
            float r5 = r20.getY()
            float r8 = r0.f303646w
            float r5 = r5 - r8
            float r5 = java.lang.Math.abs(r5)
            float r2 = java.lang.Math.max(r2, r5)
            boolean r5 = r0.f303648y
            if (r5 != 0) goto L_0x0149
            int r5 = r0.f303649z
            float r5 = (float) r5
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x004c
            r2 = 1
            goto L_0x004d
        L_0x004c:
            r2 = 0
        L_0x004d:
            r0.f303648y = r2
            goto L_0x0149
        L_0x0051:
            r0.f303647x = r7
            android.view.View r2 = r0.f303630E
            r9 = 4
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r15.mo10233c(r9)
            java.lang.Object[] r10 = r15.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/recordvideo/ui/editor/CaptionItemView"
            java.lang.String r12 = "onTouch"
            java.lang.String r13 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r9 = r2
            r4 = r15
            r15 = r16
            r16 = r17
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r4 = r4.mo10231a(r7)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.setVisibility(r4)
            java.lang.String r10 = "com/tencent/mm/plugin/recordvideo/ui/editor/CaptionItemView"
            java.lang.String r11 = "onTouch"
            java.lang.String r12 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            fi2.a r2 = new fi2.a
            r2.<init>()
            android.graphics.Rect r4 = r0.f303639p
            r9 = 1056964608(0x3f000000, float:0.5)
            r2.f321789c = r9
            r9 = 1077936128(0x40400000, float:3.0)
            r2.f321790d = r9
            float[] r9 = new float[r8]
            android.graphics.RectF r10 = r0.f303642s
            float r10 = r10.width()
            float r10 = r10 / r5
            r9[r7] = r10
            android.graphics.RectF r10 = r0.f303642s
            float r10 = r10.height()
            float r10 = r10 / r5
            r9[r6] = r10
            r2.f321788b = r9
            android.graphics.RectF r9 = new android.graphics.RectF
            int r10 = r4.left
            float r10 = (float) r10
            int r11 = r4.top
            float r11 = (float) r11
            int r12 = r4.right
            float r12 = (float) r12
            int r4 = r4.bottom
            float r4 = (float) r4
            r9.<init>(r10, r11, r12, r4)
            r2.f321787a = r9
            float[] r4 = new float[r8]
            android.graphics.RectF r8 = r0.f303642s
            float r8 = r8.width()
            float r8 = r8 / r5
            r4[r7] = r8
            android.graphics.RectF r8 = r0.f303642s
            float r8 = r8.height()
            float r8 = r8 / r5
            r4[r6] = r8
            android.graphics.Matrix r5 = r0.f303644u
            r5.mapPoints(r4)
            android.graphics.RectF r5 = r2.f321787a
            r8 = r4[r7]
            r4 = r4[r6]
            boolean r4 = r5.contains(r8, r4)
            if (r4 != 0) goto L_0x0107
            android.graphics.RectF r4 = new android.graphics.RectF
            float[] r5 = r0.f303635J
            r8 = r5[r7]
            r5 = r5[r6]
            r4.<init>(r8, r5, r8, r5)
            r2.f321787a = r4
        L_0x0107:
            android.graphics.Matrix r4 = r0.f303644u
            yh2.a$e r5 = new yh2.a$e
            r5.<init>(r0, r1)
            r2.mo157995a(r4, r5)
            goto L_0x0149
        L_0x0112:
            float r2 = r20.getX()
            r0.f303645v = r2
            float r2 = r20.getY()
            r0.f303646w = r2
            android.graphics.RectF r4 = r0.f303643t
            float r8 = r0.f303645v
            boolean r2 = r4.contains(r8, r2)
            if (r2 == 0) goto L_0x012a
            r0.f303647x = r6
        L_0x012a:
            r0.f303648y = r7
            float[] r2 = r0.f303635J
            android.graphics.RectF r4 = r0.f303642s
            float r4 = r4.width()
            float r4 = r4 / r5
            r2[r7] = r4
            float[] r2 = r0.f303635J
            android.graphics.RectF r4 = r0.f303642s
            float r4 = r4.height()
            float r4 = r4 / r5
            r2[r6] = r4
            android.graphics.Matrix r2 = r0.f303644u
            float[] r4 = r0.f303635J
            r2.mapPoints(r4)
        L_0x0149:
            boolean r2 = r0.f303647x
            if (r2 == 0) goto L_0x018b
            int r2 = r20.getAction()
            r4 = 3
            if (r2 != r4) goto L_0x015a
            int r2 = r20.getAction()
            if (r2 == r6) goto L_0x0186
        L_0x015a:
            r18.bringToFront()
            boolean r2 = r0.f303634I
            if (r2 == 0) goto L_0x0173
            com.tencent.mm.plugin.recordvideo.ui.editor.PhotoTextView r2 = r18.getCaptionView()
            android.content.Context r4 = r18.getContext()
            r5 = 2131231147(0x7f0801ab, float:1.8078367E38)
            android.graphics.drawable.Drawable r4 = kg3.C76577a.m92158i(r4, r5)
            r2.setBackgroundDrawable(r4)
        L_0x0173:
            com.tencent.mm.plugin.recordvideo.ui.editor.item.EditorItemContainer$a r2 = r0.f303641r
            if (r2 == 0) goto L_0x017a
            r2.mo129926a(r0, r1)
        L_0x017a:
            java.lang.Runnable r2 = r0.f303636K
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.removeRunnable(r2)
            java.lang.Runnable r2 = r0.f303636K
            r4 = 1500(0x5dc, double:7.41E-321)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(r2, r4)
        L_0x0186:
            boolean r1 = super.onTouch(r19, r20)
            return r1
        L_0x018b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: yh2.C102864a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public final void setCaptionItem(C92010c cVar) {
        C87412m.m108594g(cVar, "captionItem");
        this.f303637n = cVar;
        getCaptionLayout().measure(0, 0);
        this.f303638o.f321814o = getCaptionLayout().getMeasuredHeight();
        this.f303642s.bottom = (float) getCaptionLayout().getMeasuredHeight();
        mo142574j();
        if (cVar.f263433h != 0) {
            getCaptionView().setTextColor(cVar.f263433h);
        }
        getCaptionView().setTextBackground(cVar.f263434i);
        if (TextUtils.isEmpty(cVar.f263435j)) {
            getCaptionView().setTypeface(getCaptionView().getTypeface(), 1);
        } else if (C86013q1.m106450k(cVar.f263435j)) {
            getCaptionView().setTypeface(Typeface.createFromFile(cVar.f263435j));
        } else {
            getCaptionView().setTypeface(Typeface.DEFAULT);
        }
        int i = C11412b.f33577a;
        Log.m105925i("MicroMsg.CaptionItemView", "height:" + getCaptionView().getMeasuredHeight() + " caption:" + cVar, (Object[]) null);
    }

    public final void setClearCaptionListener(C32226l<? super View, C13598b0> lVar) {
        this.f303633H = lVar;
    }

    public final void setEnableEdit(boolean z) {
        this.f303634I = z;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
    }

    public final void setStateResolve(EditorItemContainer.C94437a aVar) {
        C87412m.m108594g(aVar, "stateResolve");
        this.f303641r = aVar;
    }

    public void setValidArea(Rect rect) {
        C87412m.m108594g(rect, "validRect");
        this.f303639p.set(rect);
        mo142575k();
        mo142574j();
        ViewGroup.LayoutParams layoutParams = this.f303630E.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i = marginLayoutParams.topMargin;
        int i2 = rect.bottom;
        int i3 = this.f303631F;
        if (i != i2 - i3) {
            marginLayoutParams.topMargin = i2 - i3;
            this.f303630E.setLayoutParams(marginLayoutParams);
        }
    }
}
