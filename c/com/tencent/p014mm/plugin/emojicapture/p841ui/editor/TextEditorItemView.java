package com.tencent.p014mm.plugin.emojicapture.p841ui.editor;

import ai2.C92007a;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import bi2.C92262a;
import bi2.C92263b;
import e71.C97607d;
import fi2.C107552a;
import fi2.C107554b;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import i71.C108374c;
import kotlin.Metadata;
import rx3.C13598b0;
import sx3.C110821n;
import y61.C112395f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013B\u001d\b\u0016\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0014J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\n\u001a\u00020\tJ\n\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\u0015"}, mo182094d2 = {"Lcom/tencent/mm/plugin/emojicapture/ui/editor/TextEditorItemView;", "Landroid/view/View;", "Ly61/f;", "", "editing", "Lrx3/b0;", "setEditing", "", "getText", "", "getTextColor", "Lcom/tencent/mm/plugin/emojicapture/ui/editor/EditorItemContainer;", "getItemContainer", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-emojicapture_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.emojicapture.ui.editor.TextEditorItemView */
public final class TextEditorItemView extends View implements C112395f {

    /* renamed from: N */
    public static final /* synthetic */ int f312530N = 0;

    /* renamed from: A */
    public float f312531A;

    /* renamed from: B */
    public final float f312532B;

    /* renamed from: C */
    public boolean f312533C;

    /* renamed from: D */
    public final float f312534D;

    /* renamed from: E */
    public final PointF f312535E;

    /* renamed from: F */
    public final PointF f312536F;

    /* renamed from: G */
    public final C107554b f312537G;

    /* renamed from: H */
    public boolean f312538H;

    /* renamed from: I */
    public boolean f312539I;

    /* renamed from: J */
    public final Path f312540J;

    /* renamed from: K */
    public float f312541K;

    /* renamed from: L */
    public float f312542L;

    /* renamed from: M */
    public final float[] f312543M;

    /* renamed from: d */
    public boolean f312544d;

    /* renamed from: e */
    public String[] f312545e;

    /* renamed from: f */
    public Typeface[] f312546f;

    /* renamed from: g */
    public int f312547g;

    /* renamed from: h */
    public final Runnable f312548h;

    /* renamed from: i */
    public final Paint f312549i;

    /* renamed from: j */
    public final float f312550j;

    /* renamed from: n */
    public final Path f312551n;

    /* renamed from: o */
    public final RectF f312552o;

    /* renamed from: p */
    public CharSequence f312553p;

    /* renamed from: q */
    public final int f312554q;

    /* renamed from: r */
    public int f312555r;

    /* renamed from: s */
    public final Bitmap[] f312556s;

    /* renamed from: t */
    public RectF f312557t;

    /* renamed from: u */
    public final float f312558u;

    /* renamed from: v */
    public C108374c f312559v;

    /* renamed from: w */
    public int f312560w;

    /* renamed from: x */
    public int f312561x;

    /* renamed from: y */
    public boolean f312562y;

    /* renamed from: z */
    public float f312563z;

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.editor.TextEditorItemView$a */
    public static final class C93346a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ TextEditorItemView f269373d;

        public C93346a(TextEditorItemView textEditorItemView) {
            this.f269373d = textEditorItemView;
        }

        public final void run() {
            EditorItemContainer itemContainer = this.f269373d.getItemContainer();
            if (itemContainer != null) {
                itemContainer.setEditing(this.f269373d);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.editor.TextEditorItemView$b */
    public static final class C105219b extends C87413o implements C32227p<Matrix, Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ TextEditorItemView f312564d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105219b(TextEditorItemView textEditorItemView) {
            super(2);
            this.f312564d = textEditorItemView;
        }

        public Object invoke(Object obj, Object obj2) {
            Matrix matrix = (Matrix) obj;
            ((Boolean) obj2).booleanValue();
            C87412m.m108594g(matrix, "m");
            TextEditorItemView textEditorItemView = this.f312564d;
            if (textEditorItemView.f312544d) {
                textEditorItemView.f312537G.f321806g.set(matrix);
                this.f312564d.invalidate();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.editor.TextEditorItemView$c */
    public static final class C105220c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ TextEditorItemView f312565d;

        public C105220c(TextEditorItemView textEditorItemView) {
            this.f312565d = textEditorItemView;
        }

        public final void run() {
            TextEditorItemView textEditorItemView = this.f312565d;
            int i = TextEditorItemView.f312530N;
            textEditorItemView.mo149558e();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x00e2 A[LOOP:1: B:14:0x00e0->B:15:0x00e2, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextEditorItemView(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            r7.<init>(r8, r9, r10)
            com.tencent.mm.plugin.emojicapture.ui.editor.TextEditorItemView$c r9 = new com.tencent.mm.plugin.emojicapture.ui.editor.TextEditorItemView$c
            r9.<init>(r7)
            r7.f312548h = r9
            android.graphics.Paint r9 = new android.graphics.Paint
            r10 = 1
            r9.<init>(r10)
            r7.f312549i = r9
            android.graphics.Path r9 = new android.graphics.Path
            r9.<init>()
            r7.f312551n = r9
            android.graphics.RectF r9 = new android.graphics.RectF
            r9.<init>()
            r7.f312552o = r9
            android.graphics.RectF r9 = new android.graphics.RectF
            r9.<init>()
            r7.f312557t = r9
            r9 = -1
            r7.f312560w = r9
            r7.f312561x = r9
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>()
            r7.f312535E = r0
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>()
            r7.f312536F = r0
            fi2.b r0 = new fi2.b
            r0.<init>()
            r7.f312537G = r0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r7.f312540J = r0
            r0 = 1073741824(0x40000000, float:2.0)
            r7.f312541K = r0
            r0 = 1048576000(0x3e800000, float:0.25)
            r7.f312542L = r0
            r0 = 2
            float[] r1 = new float[r0]
            r7.f312543M = r1
            gy3.C87412m.m108591d(r8)
            android.content.res.Resources r1 = r8.getResources()
            r2 = 2131166305(0x7f070461, float:1.7946852E38)
            float r1 = r1.getDimension(r2)
            zb0.f r2 = zb0.C39332f.m42087b()
            boolean r2 = r2.mo62022a()
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L_0x00bb
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getApplicationLanguage()
            java.lang.String r5 = "zh_TW"
            boolean r5 = gy3.C87412m.m108589b(r2, r5)
            if (r5 == 0) goto L_0x007e
            r2 = 1
            goto L_0x0085
        L_0x007e:
            java.lang.String r5 = "zh_HK"
            boolean r2 = gy3.C87412m.m108589b(r2, r5)
        L_0x0085:
            r2 = r2 ^ r10
            if (r2 == 0) goto L_0x00bb
            zb0.f r2 = zb0.C39332f.m42087b()
            r2.getClass()
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r2 = zb0.C39332f.f105731e
            r0[r3] = r2
            java.lang.String r2 = zb0.C39332f.f105730d
            r0[r10] = r2
            r7.f312545e = r0
            i71.b r10 = new i71.b
            int r1 = (int) r1
            r10.<init>(r0, r1)
            r7.f312559v = r10
            java.lang.String[] r10 = r7.f312545e
            int r10 = r10.length
            android.graphics.Typeface[] r0 = new android.graphics.Typeface[r10]
            r1 = 0
        L_0x00a9:
            if (r1 >= r10) goto L_0x00b8
            java.lang.String[] r2 = r7.f312545e
            r2 = r2[r1]
            android.graphics.Typeface r2 = android.graphics.Typeface.createFromFile(r2)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L_0x00a9
        L_0x00b8:
            r7.f312546f = r0
            goto L_0x00d9
        L_0x00bb:
            java.lang.String r0 = ""
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r7.f312545e = r0
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 933(0x3a5, double:4.61E-321)
            r5 = 3
            r0.mo175912v(r1, r5)
            i71.a r0 = new i71.a
            r0.<init>()
            r7.f312559v = r0
            android.graphics.Typeface[] r10 = new android.graphics.Typeface[r10]
            r10[r3] = r4
            r7.f312546f = r10
        L_0x00d9:
            android.graphics.Typeface[] r10 = r7.f312546f
            int r10 = r10.length
            r7.f312554q = r10
            android.graphics.Bitmap[] r0 = new android.graphics.Bitmap[r10]
        L_0x00e0:
            if (r3 >= r10) goto L_0x00e7
            r0[r3] = r4
            int r3 = r3 + 1
            goto L_0x00e0
        L_0x00e7:
            r7.f312556s = r0
            r7.mo149558e()
            android.content.res.Resources r10 = r7.getResources()
            r0 = 2131166302(0x7f07045e, float:1.7946846E38)
            float r10 = r10.getDimension(r0)
            r7.f312550j = r10
            android.content.res.Resources r0 = r7.getResources()
            r1 = 2131166303(0x7f07045f, float:1.7946848E38)
            float r0 = r0.getDimension(r1)
            android.graphics.Paint r1 = r7.f312549i
            r1.setColor(r9)
            android.graphics.Paint r9 = r7.f312549i
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            r9.setStyle(r1)
            android.graphics.Paint r9 = r7.f312549i
            r9.setStrokeWidth(r0)
            android.graphics.PointF r9 = r7.f312536F
            r9.set(r10, r10)
            android.content.res.Resources r9 = r7.getResources()
            r10 = 2131166301(0x7f07045d, float:1.7946843E38)
            float r9 = r9.getDimension(r10)
            r7.f312534D = r9
            android.content.res.Resources r9 = r7.getResources()
            r10 = 2131166304(0x7f070460, float:1.794685E38)
            float r9 = r9.getDimension(r10)
            r7.f312558u = r9
            android.view.ViewConfiguration r8 = android.view.ViewConfiguration.get(r8)
            int r8 = r8.getScaledTouchSlop()
            float r8 = (float) r8
            r7.f312532B = r8
            fi2.b r8 = r7.f312537G
            float r9 = r7.f312541K
            r8.f321816q = r9
            float r9 = r7.f312542L
            r8.f321817r = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.emojicapture.p841ui.editor.TextEditorItemView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* renamed from: a */
    public final Bitmap mo149556a(Typeface typeface) {
        FontTextView fontTextView = new FontTextView(getContext(), (AttributeSet) null);
        fontTextView.setMaxWidth(this.f312557t.width());
        fontTextView.setTextDrawer(this.f312559v);
        fontTextView.setTypeface(typeface);
        fontTextView.mo149547b(this.f312553p, this.f312560w, this.f312561x, true);
        fontTextView.measure(View.MeasureSpec.makeMeasureSpec((int) (this.f312557t.width() - (((float) 2) * this.f312558u)), Integer.MIN_VALUE), 0);
        Bitmap createBitmap = Bitmap.createBitmap(fontTextView.getMeasuredWidth(), fontTextView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.save();
        fontTextView.draw(canvas);
        canvas.restore();
        C87412m.m108593f(createBitmap, "bitmap");
        return createBitmap;
    }

    /* renamed from: b */
    public void mo137605b(RectF rectF, float f) {
        C87412m.m108594g(rectF, "bounds");
        this.f312557t.set(rectF);
        this.f312540J.addRoundRect(new RectF(rectF.left, rectF.top, rectF.right, rectF.bottom), f, f, Path.Direction.CW);
        float f2 = (float) 2;
        this.f312535E.set((rectF.left + (rectF.width() / f2)) - (this.f312552o.width() / f2), (rectF.bottom - this.f312534D) - this.f312552o.height());
        Matrix matrix = this.f312537G.f321806g;
        PointF pointF = this.f312535E;
        matrix.setTranslate(pointF.x, pointF.y);
    }

    /* renamed from: c */
    public final void mo149557c(int i, int i2) {
        float f = (float) 2;
        float f2 = this.f312550j * f;
        float f3 = ((float) i) + f2;
        float f4 = ((float) i2) + f2;
        float width = this.f312552o.width();
        float height = this.f312552o.height();
        if (this.f312552o.isEmpty()) {
            this.f312535E.offset(f3 / f, -f4);
        } else {
            this.f312535E.offset((width - f3) / f, (height - f4) / f);
        }
        this.f312552o.set(0.0f, 0.0f, f3, f4);
        this.f312551n.reset();
        Path path = this.f312551n;
        RectF rectF = this.f312552o;
        float f5 = this.f312550j;
        path.addRoundRect(rectF, f5, f5, Path.Direction.CW);
        C107554b bVar = this.f312537G;
        bVar.f321806g.preTranslate((((float) bVar.f321815p) - f3) / f, ((float) bVar.f321814o) - f4);
        if (!this.f312544d) {
            Matrix matrix = this.f312537G.f321806g;
            PointF pointF = this.f312535E;
            matrix.setTranslate(pointF.x, pointF.y);
        }
        C107554b bVar2 = this.f312537G;
        bVar2.f321815p = (int) f3;
        bVar2.f321814o = (int) f4;
    }

    /* renamed from: d */
    public C92007a mo53771d() {
        return null;
    }

    /* renamed from: e */
    public final void mo149558e() {
        if (this.f312544d) {
            int i = this.f312555r + 1;
            this.f312555r = i;
            this.f312555r = i % this.f312554q;
            Typeface[] typefaceArr = this.f312546f;
            int i2 = this.f312547g;
            Typeface typeface = typefaceArr[i2];
            this.f312559v.mo158886b(this.f312545e[i2]);
            int i3 = this.f312547g + 1;
            this.f312547g = i3;
            this.f312547g = i3 % this.f312546f.length;
            if (this.f312556s[this.f312555r] == null) {
                Bitmap a = mo149556a(typeface);
                this.f312556s[this.f312555r] = a;
                mo149557c(a.getWidth(), a.getHeight());
            }
            removeCallbacks(this.f312548h);
            postDelayed(this.f312548h, 100);
        } else if (this.f312556s[this.f312555r] == null) {
            Typeface typeface2 = this.f312546f[0];
            this.f312559v.mo158886b(this.f312545e[this.f312547g]);
            Bitmap a2 = mo149556a(typeface2);
            this.f312556s[this.f312555r] = a2;
            mo149557c(a2.getWidth(), a2.getHeight());
        }
        invalidate();
    }

    /* renamed from: f */
    public final void mo149559f(CharSequence charSequence, int i, boolean z) {
        setContentDescription(charSequence);
        if (z) {
            this.f312553p = charSequence;
            this.f312560w = i;
            this.f312561x = C97607d.m125781a(i);
            this.f312544d = !(charSequence == null || charSequence.length() == 0);
            C110821n.m150969p(this.f312556s, (Object) null, 0, 0, 6, (Object) null);
            this.f312555r = 0;
            this.f312547g = 0;
            mo149558e();
        }
    }

    public EditorItemContainer getItemContainer() {
        if (!(getParent().getParent() instanceof EditorItemContainer)) {
            return null;
        }
        ViewParent parent = getParent().getParent();
        C87412m.m108592e(parent, "null cannot be cast to non-null type com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer");
        return (EditorItemContainer) parent;
    }

    public final CharSequence getText() {
        if (this.f312544d) {
            return this.f312553p;
        }
        return null;
    }

    public final int getTextColor() {
        if (this.f312544d) {
            return this.f312560w;
        }
        return 0;
    }

    /* renamed from: i */
    public C92262a mo53781i(Matrix matrix) {
        if (!this.f312544d) {
            return null;
        }
        Matrix matrix2 = new Matrix();
        matrix2.postConcat(this.f312537G.f321806g);
        PointF pointF = this.f312536F;
        matrix2.postTranslate(pointF.x, pointF.y);
        if (matrix != null) {
            matrix2.postConcat(matrix);
        }
        return new C92263b(this.f312556s, 100, matrix2);
    }

    /* renamed from: n */
    public boolean mo137606n() {
        mo149559f("", 0, true);
        post(new C93346a(this));
        return true;
    }

    public void onDraw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        if (this.f312539I) {
            canvas.clipPath(this.f312540J);
        }
        canvas.save();
        canvas.concat(this.f312537G.f321806g);
        if (this.f312538H) {
            canvas.drawPath(this.f312551n, this.f312549i);
        }
        Bitmap bitmap = this.f312556s[this.f312555r];
        if (bitmap != null) {
            PointF pointF = this.f312536F;
            canvas.drawBitmap(bitmap, pointF.x, pointF.y, (Paint) null);
        }
        canvas.restore();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "event");
        boolean a = this.f312537G.mo157997a(motionEvent);
        if (!a) {
            return false;
        }
        postInvalidate();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    this.f312539I = false;
                    if (Math.abs(motionEvent.getX() - this.f312563z) > this.f312532B || Math.abs(motionEvent.getY() - this.f312531A) > this.f312532B) {
                        this.f312533C = true;
                    }
                } else if (actionMasked != 3) {
                    if ((actionMasked == 5 || actionMasked == 6) && !this.f312544d) {
                        return false;
                    }
                }
            }
            this.f312539I = true;
            if ((!this.f312544d || this.f312562y) && !this.f312533C) {
                performClick();
            }
            C107552a aVar = new C107552a();
            aVar.f321789c = this.f312542L;
            aVar.f321790d = this.f312541K;
            aVar.f321788b = new float[]{this.f312552o.width() / 2.0f, this.f312552o.height() / 2.0f};
            RectF rectF = this.f312557t;
            aVar.f321787a = new RectF(rectF.left, rectF.top, rectF.right, rectF.bottom);
            C107554b bVar = this.f312537G;
            float[] fArr = {((float) bVar.f321815p) / 2.0f, ((float) bVar.f321814o) / 2.0f};
            bVar.f321806g.mapPoints(fArr);
            if (!aVar.f321787a.contains(fArr[0], fArr[1])) {
                float[] fArr2 = this.f312543M;
                float f = fArr2[0];
                float f2 = fArr2[1];
                aVar.f321787a = new RectF(f, f2, f, f2);
            }
            aVar.mo157995a(this.f312537G.f321806g, new C105219b(this));
        } else {
            this.f312562y = this.f312538H;
            this.f312533C = false;
            this.f312563z = motionEvent.getX();
            this.f312531A = motionEvent.getY();
            this.f312539I = true;
            float[] fArr3 = this.f312543M;
            C107554b bVar2 = this.f312537G;
            fArr3[0] = ((float) bVar2.f321815p) / 2.0f;
            fArr3[1] = ((float) bVar2.f321814o) / 2.0f;
            bVar2.f321806g.mapPoints(fArr3);
        }
        if (!this.f312544d) {
            Matrix matrix = this.f312537G.f321806g;
            PointF pointF = this.f312535E;
            matrix.setTranslate(pointF.x, pointF.y);
        } else {
            EditorItemContainer itemContainer = getItemContainer();
            if (itemContainer != null) {
                itemContainer.mo128120a(this, motionEvent);
            }
        }
        return a;
    }

    public void pause() {
        removeCallbacks(this.f312548h);
    }

    public void resume() {
        mo149558e();
    }

    public void setEditing(boolean z) {
        this.f312538H = z;
        postInvalidate();
    }

    public TextEditorItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
