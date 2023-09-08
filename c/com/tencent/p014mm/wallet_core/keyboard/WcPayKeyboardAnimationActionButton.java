package com.tencent.p014mm.wallet_core.keyboard;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.RelativeLayout;
import br3.C67317g;
import br3.C67318h;
import br3.C67319i;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import kg3.C76577a;

/* renamed from: com.tencent.mm.wallet_core.keyboard.WcPayKeyboardAnimationActionButton */
public class WcPayKeyboardAnimationActionButton extends View {

    /* renamed from: A */
    public boolean f220936A = false;

    /* renamed from: B */
    public int f220937B;

    /* renamed from: C */
    public int f220938C;

    /* renamed from: D */
    public int f220939D;

    /* renamed from: E */
    public int f220940E;

    /* renamed from: F */
    public Paint f220941F;

    /* renamed from: G */
    public Paint f220942G;

    /* renamed from: H */
    public RectF f220943H = new RectF();

    /* renamed from: I */
    public Rect f220944I = new Rect();

    /* renamed from: J */
    public ObjectAnimator f220945J;

    /* renamed from: K */
    public ValueAnimator f220946K;

    /* renamed from: L */
    public ValueAnimator f220947L;

    /* renamed from: M */
    public AnimatorSet f220948M = new AnimatorSet();

    /* renamed from: N */
    public ObjectAnimator f220949N;

    /* renamed from: P */
    public ValueAnimator f220950P;

    /* renamed from: Q */
    public AnimatorSet f220951Q = new AnimatorSet();

    /* renamed from: d */
    public Context f220952d;

    /* renamed from: e */
    public int f220953e = getResources().getColor(C0966R.color.akw);

    /* renamed from: f */
    public int f220954f = getResources().getColor(C0966R.color.alc);

    /* renamed from: g */
    public ColorStateList f220955g;

    /* renamed from: h */
    public ColorStateList f220956h;

    /* renamed from: i */
    public int f220957i = 17;

    /* renamed from: j */
    public int f220958j;

    /* renamed from: n */
    public int f220959n;

    /* renamed from: o */
    public int f220960o;

    /* renamed from: p */
    public int f220961p;

    /* renamed from: q */
    public int f220962q;

    /* renamed from: r */
    public int f220963r;

    /* renamed from: s */
    public int f220964s;

    /* renamed from: t */
    public int f220965t;

    /* renamed from: u */
    public int f220966u = 300;

    /* renamed from: v */
    public int f220967v = 300;

    /* renamed from: w */
    public String f220968w = "";

    /* renamed from: x */
    public float f220969x;

    /* renamed from: y */
    public float f220970y;

    /* renamed from: z */
    public boolean f220971z = true;

    public WcPayKeyboardAnimationActionButton(Context context) {
        super(context);
        mo104775a();
    }

    /* renamed from: a */
    public final void mo104775a() {
        Context context = MMApplicationContext.getContext();
        this.f220952d = context;
        this.f220960o = C76577a.m92151b(context, 4);
        this.f220961p = C76577a.m92151b(this.f220952d, 16);
        this.f220962q = C76577a.m92151b(this.f220952d, 64);
        this.f220963r = C76577a.m92151b(this.f220952d, 96);
        this.f220955g = getResources().getColorStateList(C0966R.color.akw);
        this.f220956h = getResources().getColorStateList(C0966R.color.alc);
        Paint paint = new Paint();
        this.f220941F = paint;
        paint.setStrokeWidth(4.0f);
        this.f220941F.setStyle(Paint.Style.FILL);
        this.f220941F.setAntiAlias(true);
        this.f220941F.setColor(this.f220953e);
        Paint paint2 = new Paint(1);
        this.f220942G = paint2;
        paint2.setTextSize(((float) C76577a.m92151b(this.f220952d, this.f220957i)) * C76577a.m92165p(this.f220952d));
        this.f220942G.setColor(this.f220954f);
        this.f220942G.setTextAlign(Paint.Align.CENTER);
        this.f220942G.setAntiAlias(true);
        this.f220942G.setFakeBoldText(true);
    }

    /* renamed from: b */
    public void mo104776b(int i, int i2, int i3, int i4) {
        if (this.f220971z) {
            this.f220971z = false;
            this.f220937B = i;
            this.f220938C = i2;
            this.f220939D = i3;
            this.f220940E = i4;
            float translationX = getTranslationX();
            this.f220970y = translationX;
            this.f220969x = translationX - ((float) this.f220961p);
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        layoutParams.bottomMargin = i3;
        setLayoutParams(layoutParams);
        this.f220958j = i;
        this.f220959n = i2;
        Log.m105919d("MicroMsg.WcPayKeyBoard.WcPayKeyboardAnimationActionButton", "initialLayoutParams() width:%s height:%s", Integer.valueOf(i), Integer.valueOf(this.f220959n));
        this.f220965t = i;
        if (this.f220945J == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "translationX", new float[]{this.f220970y, this.f220969x});
            this.f220945J = ofFloat;
            ofFloat.setDuration((long) this.f220966u);
            this.f220945J.setInterpolator(new AccelerateDecelerateInterpolator());
        }
        int i5 = this.f220959n;
        this.f220964s = i5;
        if (this.f220947L == null) {
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i5, this.f220962q});
            this.f220947L = ofInt;
            ofInt.setDuration((long) this.f220967v);
            this.f220947L.addUpdateListener(new C67317g(this));
            this.f220947L.addListener(new C67318h(this));
        }
        int i6 = this.f220958j;
        this.f220965t = i6;
        if (this.f220946K == null) {
            ValueAnimator ofInt2 = ValueAnimator.ofInt(new int[]{i6, this.f220963r});
            this.f220946K = ofInt2;
            ofInt2.setDuration((long) this.f220967v);
            this.f220946K.addUpdateListener(new C67319i(this));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        this.f220948M = animatorSet;
        animatorSet.play(this.f220947L).with(this.f220945J);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int[] drawableState = getDrawableState();
        int colorForState = this.f220956h.getColorForState(drawableState, this.f220954f);
        int colorForState2 = this.f220955g.getColorForState(drawableState, this.f220953e);
        this.f220942G.setColor(colorForState);
        this.f220941F.setColor(colorForState2);
        if (this.f220936A) {
            RectF rectF = this.f220943H;
            rectF.left = 0.0f;
            rectF.top = 0.0f;
            rectF.right = (float) this.f220965t;
            rectF.bottom = (float) this.f220964s;
        } else {
            RectF rectF2 = this.f220943H;
            rectF2.left = 0.0f;
            int i = this.f220959n;
            int i2 = this.f220964s;
            rectF2.top = (float) ((i - i2) / 2);
            rectF2.right = (float) this.f220965t;
            rectF2.bottom = (float) ((i + i2) / 2);
        }
        Log.m105927v("MicroMsg.WcPayKeyBoard.WcPayKeyboardAnimationActionButton", "draw_oval_to_circle() left:%s top:%s right:%s bottom:%s circleAngle:%s", Float.valueOf(this.f220943H.left), Float.valueOf(this.f220943H.top), Float.valueOf(this.f220943H.right), Float.valueOf(this.f220943H.bottom), Integer.valueOf(this.f220960o));
        RectF rectF3 = this.f220943H;
        float f = (float) this.f220960o;
        canvas.drawRoundRect(rectF3, f, f, this.f220941F);
        if (this.f220936A) {
            Rect rect = this.f220944I;
            rect.left = 0;
            rect.top = 0;
            rect.right = this.f220965t;
            rect.bottom = this.f220962q;
        } else {
            Rect rect2 = this.f220944I;
            rect2.left = 0;
            rect2.top = 0;
            rect2.right = this.f220965t;
            rect2.bottom = this.f220959n;
        }
        Paint.FontMetricsInt fontMetricsInt = this.f220942G.getFontMetricsInt();
        Rect rect3 = this.f220944I;
        canvas.drawText(this.f220968w, (float) rect3.centerX(), (float) ((((rect3.bottom + rect3.top) - fontMetricsInt.bottom) - fontMetricsInt.top) / 2), this.f220942G);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    public WcPayKeyboardAnimationActionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo104775a();
    }

    public WcPayKeyboardAnimationActionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo104775a();
    }
}
