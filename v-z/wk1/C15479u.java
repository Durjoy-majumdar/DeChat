package wk1;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import eb0.C31543z5;
import gy3.C87412m;
import wk1.C15432i;

/* renamed from: wk1.u */
public final class C15479u extends C15432i {

    /* renamed from: g */
    public C15477s f41992g;

    /* renamed from: h */
    public C15478t f41993h;

    /* renamed from: i */
    public float f41994i;

    /* renamed from: j */
    public long f41995j;

    /* renamed from: n */
    public long f41996n;

    /* renamed from: o */
    public View f41997o;

    /* renamed from: wk1.u$a */
    public static final class C15480a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f41998d;

        public C15480a(View view) {
            this.f41998d = view;
        }

        public final void run() {
            this.f41998d.invalidate();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15479u(Drawable drawable) {
        super(drawable);
        C87412m.m108594g(drawable, "drawable");
    }

    /* renamed from: b */
    public void mo14242b(Canvas canvas, float f, int i, int i2, int i3, Paint paint) {
        Canvas canvas2 = canvas;
        Paint paint2 = paint;
        C87412m.m108594g(canvas2, "canvas");
        C87412m.m108594g(paint2, "paint");
        long c = C31543z5.m39453c();
        long j = this.f41996n;
        long j2 = 0;
        if (j != 0) {
            j2 = c - j;
        }
        this.f41996n = c;
        int i4 = mo14291f().f41987a;
        long j3 = this.f41995j + j2;
        this.f41995j = j3;
        long j4 = j3 % ((long) (mo14291f().f41988b + i4));
        if (j4 < ((long) i4)) {
            this.f41994i = ((float) j4) / ((float) i4);
        } else {
            this.f41994i = 0.0f;
        }
        if (this.f41994i > 1.0f) {
            this.f41994i = 1.0f;
        }
        float measureText = paint2.measureText(this.f41856d.f41866j.toString());
        C15432i.C15433a.C15434a aVar = this.f41856d;
        float f2 = ((float) aVar.f41857a) + f;
        float f3 = ((float) aVar.f41860d) + ((float) aVar.f41859c) + f2 + ((float) aVar.f41871o) + ((float) aVar.f41861e) + measureText;
        int i5 = i3 - i;
        int i6 = aVar.f41864h;
        float f4 = (float) (i + (i5 > i6 ? (i5 - i6) / 2 : 0));
        float f5 = ((float) i6) + f4;
        float f6 = f3 - f2;
        float f7 = f5 - f4;
        boolean isAntiAlias = paint.isAntiAlias();
        boolean isDither = paint.isDither();
        int alpha = paint.getAlpha();
        paint2.setAntiAlias(true);
        paint2.setDither(true);
        LinearGradient linearGradient = r7;
        int i7 = alpha;
        boolean z = isDither;
        boolean z2 = isAntiAlias;
        float f8 = f4;
        LinearGradient linearGradient2 = new LinearGradient(f2, f4, f3, f5, mo14290e().f41982b, mo14290e().f41983c, Shader.TileMode.CLAMP);
        paint2.setShader(linearGradient);
        canvas2.drawRoundRect(new RectF(f2, f8, f3, f5), mo14290e().f41981a, mo14290e().f41981a, paint2);
        paint2.setShader((Shader) null);
        paint2.setColor(mo14290e().f41984d);
        canvas2.drawRoundRect(new RectF(f2, f8, f3, f5), mo14290e().f41981a, mo14290e().f41981a, paint2);
        paint2.setColor(mo14290e().f41985e);
        paint2.setStrokeWidth(mo14290e().f41986f);
        paint2.setStyle(Paint.Style.STROKE);
        canvas2.drawRoundRect(new RectF(f2, f8, f3, f5), mo14290e().f41981a, mo14290e().f41981a, paint2);
        if (this.f41994i > 0.0f) {
            canvas.save();
            Path path = new Path();
            path.addRoundRect(new RectF(f2, f8, f3, f5), mo14290e().f41981a, mo14290e().f41981a, Path.Direction.CW);
            canvas2.clipPath(path);
            Path path2 = new Path();
            path2.addRoundRect(new RectF(mo14290e().f41986f + f2, f8 + mo14290e().f41986f, f3 - mo14290e().f41986f, f5 - mo14290e().f41986f), mo14290e().f41981a, mo14290e().f41981a, Path.Direction.CW);
            canvas2.clipPath(path2, Region.Op.DIFFERENCE);
            Matrix matrix = new Matrix();
            matrix.postRotate(36.0f, ((float) mo14291f().f41989c.getWidth()) / 2.0f, ((float) mo14291f().f41989c.getHeight()) / 2.0f);
            matrix.postTranslate((f2 - (((float) mo14291f().f41989c.getWidth()) / 2.0f)) + (this.f41994i * f6), (f8 - (((float) mo14291f().f41989c.getHeight()) / 2.0f)) + (this.f41994i * f7));
            canvas2.drawBitmap(mo14291f().f41989c, matrix, paint2);
            canvas.restore();
        }
        float f9 = f6 - (mo14290e().f41981a * ((float) 2));
        float f15 = f9 / 7.0f;
        float f16 = f2 + mo14290e().f41981a;
        Matrix matrix2 = new Matrix();
        float f17 = this.f41994i;
        if (f17 < 0.5f) {
            float f18 = f17 / 0.5f;
            paint2.setAlpha((int) (((float) 255) * f18));
            matrix2.setTranslate((f16 + (f18 * f15)) - ((float) (mo14291f().f41990d.getWidth() / 2)), f8 - (((float) mo14291f().f41990d.getHeight()) / 2.0f));
        } else {
            float f19 = (f17 - 0.5f) / 0.5f;
            paint2.setAlpha(255 - ((int) (((float) 255) * f19)));
            matrix2.setTranslate(((f16 + f15) + ((f9 - f15) * f19)) - ((float) (mo14291f().f41990d.getWidth() / 2)), f8 - (((float) mo14291f().f41990d.getHeight()) / 2.0f));
        }
        canvas2.drawBitmap(mo14291f().f41990d, matrix2, paint2);
        paint2.setAlpha(255);
        float f25 = f3 - mo14290e().f41981a;
        Matrix matrix3 = new Matrix();
        float f26 = this.f41994i;
        if (f26 < 0.5f) {
            float f27 = f26 / 0.5f;
            paint2.setAlpha((int) (((float) 255) * f27));
            matrix3.setTranslate((f25 - (f15 * f27)) - ((float) (mo14291f().f41990d.getWidth() / 2)), f5 - (((float) mo14291f().f41991e.getHeight()) / 2.0f));
        } else {
            float f28 = (f26 - 0.5f) / 0.5f;
            paint2.setAlpha(255 - ((int) (((float) 255) * f28)));
            matrix3.setTranslate(((f25 - f15) - ((f9 - f15) * f28)) - ((float) (mo14291f().f41990d.getWidth() / 2)), f5 - (((float) mo14291f().f41991e.getHeight()) / 2.0f));
        }
        canvas2.drawBitmap(mo14291f().f41991e, matrix3, paint2);
        paint2.setAlpha(i7);
        paint2.setAntiAlias(z2);
        paint2.setDither(z);
        View view = this.f41997o;
        if (view != null) {
            int i8 = mo14291f().f41987a;
            int i9 = mo14291f().f41988b;
            long j5 = this.f41995j % ((long) (i8 + i9));
            view.postDelayed(new C15480a(view), (long) Math.max(j5 > ((long) i8) ? (int) (((long) i9) - j5) : 0, 0));
        }
    }

    /* renamed from: e */
    public final C15477s mo14290e() {
        C15477s sVar = this.f41992g;
        if (sVar != null) {
            return sVar;
        }
        C87412m.m108603p("bgParams");
        throw null;
    }

    /* renamed from: f */
    public final C15478t mo14291f() {
        C15478t tVar = this.f41993h;
        if (tVar != null) {
            return tVar;
        }
        C87412m.m108603p("fgParams");
        throw null;
    }
}
