package d71;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.tencent.p014mm.C0966R;
import fi2.C107554b;
import gy3.C87412m;
import y61.C112394e;
import y61.C112395f;

/* renamed from: d71.d */
public final class C107004d implements C112394e {

    /* renamed from: a */
    public final C112395f f320308a;

    /* renamed from: b */
    public final C107554b f320309b;

    /* renamed from: c */
    public final RectF f320310c = new RectF();

    /* renamed from: d */
    public final Path f320311d = new Path();

    /* renamed from: e */
    public final Rect f320312e = new Rect();

    /* renamed from: f */
    public final Paint f320313f;

    /* renamed from: g */
    public boolean f320314g;

    /* renamed from: h */
    public boolean f320315h;

    /* renamed from: i */
    public float f320316i;

    /* renamed from: j */
    public float f320317j;

    /* renamed from: k */
    public float f320318k;

    /* renamed from: l */
    public final float f320319l;

    /* renamed from: m */
    public final float f320320m;

    /* renamed from: n */
    public final float f320321n;

    /* renamed from: o */
    public final float[] f320322o;

    public C107004d(C112395f fVar) {
        C87412m.m108594g(fVar, "view");
        this.f320308a = fVar;
        C107554b bVar = new C107554b();
        this.f320309b = bVar;
        Paint paint = new Paint();
        this.f320313f = paint;
        this.f320315h = true;
        this.f320316i = 1.0f;
        this.f320317j = 2.0f;
        this.f320318k = 0.25f;
        this.f320322o = new float[2];
        Resources resources = ((View) fVar).getContext().getResources();
        bVar.f321816q = this.f320317j;
        bVar.f321817r = this.f320318k;
        paint.setColor(-1);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(resources.getDimension(C0966R.dimen.a2v));
        paint.setStyle(Paint.Style.FILL);
        this.f320319l = resources.getDimension(C0966R.dimen.a2v);
        this.f320320m = resources.getDimension(C0966R.dimen.a2t);
        this.f320321n = resources.getDimension(C0966R.dimen.a2u);
    }

    /* renamed from: a */
    public final void mo157448a() {
        this.f320309b.f321806g.reset();
        this.f320309b.f321806g.postTranslate(((float) (-this.f320312e.width())) / 2.0f, ((float) (-this.f320312e.height())) / 2.0f);
        if (!this.f320310c.isEmpty() && !this.f320312e.isEmpty()) {
            float width = this.f320310c.width() / ((float) Math.max(this.f320312e.width(), this.f320312e.height()));
            this.f320316i = width;
            float f = 0.5f * width;
            float f2 = 2.0f * width;
            this.f320317j = f2;
            float f3 = width * 0.25f;
            this.f320318k = f3;
            C107554b bVar = this.f320309b;
            bVar.f321816q = f2;
            bVar.f321817r = f3;
            bVar.f321806g.postScale(f, f);
        }
        Matrix matrix = this.f320309b.f321806g;
        RectF rectF = this.f320310c;
        float f4 = (float) 2;
        matrix.postTranslate((rectF.left + rectF.right) / f4, (rectF.top + rectF.bottom) / f4);
    }
}
