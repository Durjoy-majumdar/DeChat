package eq3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import cp3.C45142d;
import me3.C109610a;
import me3.C109612c;
import me3.C109623f;
import p1093bh.C104085b;
import p248ug.C111167t;

/* renamed from: eq3.a */
public abstract class C107283a extends View {

    /* renamed from: D */
    public static final int[] f320962D = {-1, -16777216, -707825, -17592, -16535286, -15172610, -7054596, -449092};

    /* renamed from: A */
    public int f320963A = -1;

    /* renamed from: B */
    public int f320964B = -1;

    /* renamed from: C */
    public boolean f320965C = true;

    /* renamed from: d */
    public final float f320966d = getResources().getDimension(C0966R.dimen.a5o);

    /* renamed from: e */
    public C109623f f320967e;

    /* renamed from: f */
    public Bitmap f320968f;

    /* renamed from: g */
    public Bitmap f320969g;

    /* renamed from: h */
    public Bitmap f320970h;

    /* renamed from: i */
    public Bitmap f320971i;

    /* renamed from: j */
    public Bitmap f320972j;

    /* renamed from: n */
    public Bitmap f320973n;

    /* renamed from: o */
    public Bitmap f320974o;

    /* renamed from: p */
    public Bitmap f320975p;

    /* renamed from: q */
    public int f320976q = -1;

    /* renamed from: r */
    public int f320977r = -1;

    /* renamed from: s */
    public int f320978s = -1;

    /* renamed from: t */
    public Rect[] f320979t;

    /* renamed from: u */
    public Rect[] f320980u;

    /* renamed from: v */
    public Rect f320981v;

    /* renamed from: w */
    public boolean f320982w;

    /* renamed from: x */
    public Paint f320983x;

    /* renamed from: y */
    public Paint f320984y;

    /* renamed from: z */
    public boolean f320985z = false;

    /* renamed from: eq3.a$a */
    public class C107284a implements Animation.AnimationListener {
        public C107284a() {
        }

        public void onAnimationEnd(Animation animation) {
            C107283a.this.setVisibility(0);
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: eq3.a$b */
    public class C107285b implements Animation.AnimationListener {
        public C107285b() {
        }

        public void onAnimationEnd(Animation animation) {
            C107283a.this.setVisibility(8);
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    public C107283a(Context context, C109623f fVar) {
        super(context);
        setId(C0966R.C0970id.a7p);
        this.f320967e = fVar;
        mo157769g();
    }

    /* renamed from: a */
    public void mo157762a() {
        if (this.f320979t == null) {
            this.f320979t = new Rect[getFeatureCount()];
        }
        int iconWidth = (int) (this.f320966d + (getIconWidth() / 2.0f));
        int iconWidth2 = (int) getIconWidth();
        for (int i = 0; i < getFeatureCount(); i++) {
            this.f320979t[i] = new Rect(iconWidth - iconWidth2, getDetailHeight(), iconWidth + iconWidth2, getDetailHeight() + getMeasuredHeight());
            iconWidth = (int) (((float) iconWidth) + getWidthSpacing() + getIconWidth());
        }
        if (mo157768f(this.f320976q) == C111167t.DOODLE) {
            if (this.f320980u == null) {
                this.f320980u = new Rect[8];
            }
            if (this.f320981v == null) {
                this.f320981v = new Rect();
            }
            float dimension = getResources().getDimension(C0966R.dimen.a26);
            float f = dimension * 2.0f;
            float f2 = (float) 8;
            float measuredWidth = (((float) ((getMeasuredWidth() - getPaddingLeftAndRight()) - this.f320974o.getWidth())) - (f * f2)) / f2;
            int i2 = (int) f;
            int paddingLeftAndRight = (int) (((float) (getPaddingLeftAndRight() / 2)) + dimension + 5.0f);
            int detailHeight = (int) (((((float) getDetailHeight()) - f) / 2.0f) + dimension);
            for (int i3 = 0; i3 < 8; i3++) {
                this.f320980u[i3] = new Rect(paddingLeftAndRight - i2, detailHeight - i2, paddingLeftAndRight + i2, detailHeight + i2);
                paddingLeftAndRight = (int) (((float) paddingLeftAndRight) + measuredWidth + f);
            }
            int measuredWidth2 = (getMeasuredWidth() - (getPaddingLeftAndRight() / 2)) - (this.f320974o.getWidth() / 2);
            this.f320981v.set(measuredWidth2 - this.f320974o.getWidth(), 0, measuredWidth2 + this.f320974o.getWidth(), getDetailHeight());
        }
    }

    /* renamed from: b */
    public abstract Bitmap mo157763b(C111167t tVar, boolean z);

    /* renamed from: c */
    public void mo157764c(Canvas canvas) {
        Canvas canvas2 = canvas;
        if (mo157768f(this.f320976q) == C111167t.DOODLE) {
            float dimension = getResources().getDimension(C0966R.dimen.a26);
            float f = 2.0f;
            float f2 = dimension * 2.0f;
            float f3 = (float) 8;
            float measuredWidth = (((float) ((getMeasuredWidth() - getPaddingLeftAndRight()) - this.f320974o.getWidth())) - (f2 * f3)) / f3;
            float paddingLeftAndRight = ((float) (getPaddingLeftAndRight() / 2)) + dimension + ((float) C45142d.m49971b(1.5f));
            float detailHeight = ((((float) getDetailHeight()) - f2) / 2.0f) + dimension;
            int i = 0;
            while (true) {
                int[] iArr = f320962D;
                if (i >= 8) {
                    break;
                }
                float f4 = 0.0f;
                if (this.f320964B == i) {
                    f4 = (float) C45142d.m49971b(f);
                    this.f320965C = false;
                } else if (this.f320965C && i == 2) {
                    f4 = (float) C45142d.m49971b(f);
                }
                this.f320984y.setColor(-1);
                canvas2.drawCircle(paddingLeftAndRight, detailHeight, ((float) C45142d.m49971b(1.5f)) + dimension + f4, this.f320984y);
                this.f320984y.setColor(iArr[i]);
                canvas2.drawCircle(paddingLeftAndRight, detailHeight, f4 + dimension, this.f320984y);
                paddingLeftAndRight += measuredWidth + f2;
                i++;
                f = 2.0f;
            }
            Paint paint = new Paint();
            if (mo157779i()) {
                paint.setAlpha(255);
            } else {
                paint.setAlpha(160);
            }
            canvas2.drawBitmap((!this.f320982w || !mo157779i()) ? this.f320974o : this.f320975p, (float) ((getMeasuredWidth() - (getPaddingLeftAndRight() / 2)) - this.f320974o.getWidth()), (float) ((getDetailHeight() - this.f320974o.getHeight()) / 2), paint);
        }
    }

    /* renamed from: d */
    public Bitmap mo157765d(C111167t tVar, boolean z) {
        int ordinal = tVar.ordinal();
        Bitmap bitmap = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : z ? this.f320973n : this.f320972j : z ? this.f320971i : this.f320970h : z ? this.f320969g : this.f320968f;
        return bitmap == null ? mo157763b(tVar, z) : bitmap;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i = 0;
            while (true) {
                if (i >= getFeatureCount()) {
                    break;
                } else if (this.f320979t[i].contains(x, y)) {
                    this.f320963A = i;
                    postInvalidate();
                    break;
                } else {
                    if (getDetailHeight() > 0) {
                        Rect rect = this.f320981v;
                        if (rect == null || !rect.contains(x, y)) {
                            mo157781k(x, y);
                        } else {
                            this.f320982w = true;
                            postInvalidate();
                        }
                    }
                    i++;
                }
            }
        } else if (action == 1 || action == 3) {
            int i2 = 0;
            while (true) {
                if (i2 >= getFeatureCount()) {
                    break;
                }
                if (this.f320979t[i2].contains(x, y) && this.f320963A == i2) {
                    if (mo157780j(i2)) {
                        int i3 = this.f320963A;
                        if (i3 != this.f320976q) {
                            this.f320976q = i3;
                        } else {
                            this.f320976q = -1;
                        }
                    }
                    if (!this.f320985z) {
                        this.f320978s = this.f320977r;
                        if (mo157780j(i2)) {
                            this.f320977r = this.f320976q;
                            C109612c cVar = (C109612c) getPresenter();
                            cVar.getClass();
                            new C109610a(cVar).mo150361a(mo157768f(this.f320976q));
                        } else {
                            this.f320977r = i2;
                            C109612c cVar2 = (C109612c) getPresenter();
                            cVar2.getClass();
                            new C109610a(cVar2).mo150361a(mo157768f(i2));
                        }
                    }
                }
                i2++;
            }
            if (getDetailHeight() > 0) {
                Rect rect2 = this.f320981v;
                if (rect2 == null || !rect2.contains(x, y) || !this.f320982w) {
                    mo157782l(x, y);
                } else {
                    C109612c cVar3 = (C109612c) getPresenter();
                    cVar3.getClass();
                    new C109610a(cVar3).mo150363c(mo157768f(this.f320976q), -1, (Object) null);
                }
            }
            this.f320982w = false;
            this.f320963A = -1;
            requestLayout();
            postInvalidate();
        }
        return true;
    }

    /* renamed from: e */
    public int mo157767e(int i) {
        if (i < 0) {
            return -65536;
        }
        int[] iArr = f320962D;
        if (i < 8) {
            return iArr[i];
        }
        return -65536;
    }

    /* renamed from: f */
    public C111167t mo157768f(int i) {
        return (i < 0 || i >= getFeatureCount()) ? C111167t.DEFAULT : ((C109612c) getPresenter()).f328158a.getFeatures()[i];
    }

    /* renamed from: g */
    public void mo157769g() {
        new Paint(1).setColor(-16711936);
        Paint paint = new Paint(1);
        this.f320983x = paint;
        paint.setColor(getResources().getColor(C0966R.color.f3312nf));
        this.f320983x.setStrokeWidth(0.6f);
        Paint paint2 = new Paint(1);
        this.f320984y = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f320984y.setStrokeCap(Paint.Cap.ROUND);
        this.f320975p = BitmapUtil.transformDrawableToBitmap(getResources().getDrawable(C0966R.raw.undo_press));
        this.f320974o = BitmapUtil.transformDrawableToBitmap(getResources().getDrawable(C0966R.raw.undo_normal));
        this.f320968f = BitmapUtil.transformDrawableToBitmap(getResources().getDrawable(C0966R.raw.doodle_unselected));
        this.f320969g = BitmapUtil.transformDrawableToBitmap(getResources().getDrawable(C0966R.raw.doodle_selected));
        this.f320970h = BitmapUtil.transformDrawableToBitmap(getResources().getDrawable(C0966R.raw.text_unselected));
        this.f320971i = BitmapUtil.transformDrawableToBitmap(getResources().getDrawable(C0966R.raw.text_selected));
        this.f320972j = BitmapFactory.decodeResource(getResources(), C0966R.C0969drawable.emoji_unselected);
        this.f320973n = BitmapFactory.decodeResource(getResources(), C0966R.C0969drawable.emoji_selected);
    }

    public C111167t getCurFeatureType() {
        return mo157768f(this.f320977r);
    }

    public int getDetailHeight() {
        if (mo157768f(this.f320976q) == C111167t.DOODLE) {
            return (int) getResources().getDimension(C0966R.dimen.a5q);
        }
        return 0;
    }

    public int getFeatureCount() {
        return ((C109612c) getPresenter()).f328158a.getFeatures().length;
    }

    public float getHeightSpacing() {
        return (((float) (getMeasuredHeight() - getDetailHeight())) - getIconWidth()) / 2.0f;
    }

    public float getIconWidth() {
        Bitmap d = mo157765d(C111167t.DOODLE, false);
        if (d == null) {
            return 0.0f;
        }
        return (float) d.getWidth();
    }

    public int getPaddingLeftAndRight() {
        return (int) (this.f320966d * 2.0f);
    }

    public C109623f getPresenter() {
        return this.f320967e;
    }

    public float getWidthSpacing() {
        return ((((float) getMeasuredWidth()) - (((float) getFeatureCount()) * getIconWidth())) - ((float) getPaddingLeftAndRight())) / ((float) (getFeatureCount() - 1));
    }

    /* renamed from: h */
    public void mo157778h(Canvas canvas) {
        if (getDetailHeight() > 0) {
            canvas.drawLine(0.0f, (float) getDetailHeight(), (float) getMeasuredWidth(), (float) getDetailHeight(), this.f320983x);
            mo157764c(canvas);
        }
        float f = this.f320966d;
        float heightSpacing = getHeightSpacing() + ((float) getDetailHeight());
        int i = 0;
        while (i < getFeatureCount()) {
            Bitmap d = mo157765d(((C109612c) getPresenter()).f328158a.getFeatures()[i], this.f320963A == i || i == this.f320976q);
            if (d != null) {
                canvas.drawBitmap(d, f, heightSpacing, (Paint) null);
            }
            f += getWidthSpacing() + getIconWidth();
            i++;
        }
    }

    /* renamed from: i */
    public boolean mo157779i() {
        C104085b b = ((C109612c) getPresenter()).mo160818b(getCurFeatureType());
        if (b == null) {
            return false;
        }
        return b.mo145701l();
    }

    /* renamed from: j */
    public boolean mo157780j(int i) {
        int ordinal = mo157768f(i).ordinal();
        if (ordinal == 1) {
            return true;
        }
        if (ordinal != 2) {
        }
        return false;
    }

    /* renamed from: k */
    public void mo157781k(int i, int i2) {
        if (mo157768f(this.f320976q).ordinal() == 1 && this.f320980u != null) {
            int i3 = 0;
            while (true) {
                Rect[] rectArr = this.f320980u;
                if (i3 >= rectArr.length) {
                    return;
                }
                if (rectArr[i3].contains(i, i2)) {
                    this.f320964B = i3;
                    this.f320965C = false;
                    return;
                }
                i3++;
            }
        }
    }

    /* renamed from: l */
    public void mo157782l(int i, int i2) {
        if (mo157768f(this.f320976q).ordinal() == 1) {
            int i3 = 0;
            while (true) {
                Rect[] rectArr = this.f320980u;
                if (rectArr != null && i3 < rectArr.length) {
                    if (!rectArr[i3].contains(i, i2) || i3 != this.f320964B) {
                        i3++;
                    } else {
                        C109612c cVar = (C109612c) getPresenter();
                        cVar.getClass();
                        new C109610a(cVar).mo150363c(C111167t.DOODLE, i3, (Object) null);
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(0);
        mo157778h(canvas);
    }

    public void onMeasure(int i, int i2) {
        int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        int dimension = (int) getResources().getDimension(C0966R.dimen.a5r);
        if (getDetailHeight() > 0) {
            dimension += getDetailHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(dimension, 1073741824));
        mo157762a();
    }

    public void setCurFeatureType(C111167t tVar) {
        int i = 0;
        while (true) {
            if (i >= getFeatureCount()) {
                i = -1;
                break;
            } else if (((C109612c) getPresenter()).f328158a.getFeatures()[i] == tVar) {
                break;
            } else {
                i++;
            }
        }
        if (mo157780j(i)) {
            this.f320976q = i;
        } else {
            this.f320976q = -1;
        }
        this.f320977r = i;
        requestLayout();
        invalidate();
    }

    public void setFooterVisible(boolean z) {
        if (z) {
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2328p);
            loadAnimation.setAnimationListener(new C107284a());
            startAnimation(loadAnimation);
            return;
        }
        Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2329q);
        loadAnimation2.setAnimationListener(new C107285b());
        startAnimation(loadAnimation2);
    }

    public void setHideFooter(boolean z) {
        this.f320985z = z;
    }
}
