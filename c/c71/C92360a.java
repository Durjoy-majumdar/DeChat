package c71;

import a71.C91977i;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import bi2.C92262a;
import ei2.C58605a;
import ei2.C97648b;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import yh2.C102867i;

/* renamed from: c71.a */
public final class C92360a implements C97648b {

    /* renamed from: a */
    public int f264290a;

    /* renamed from: b */
    public int f264291b;

    /* renamed from: c */
    public List<C92262a> f264292c = new ArrayList();

    /* renamed from: d */
    public long f264293d;

    /* renamed from: e */
    public final Matrix f264294e;

    /* renamed from: f */
    public final Paint f264295f;

    /* renamed from: g */
    public final Canvas f264296g;

    /* renamed from: h */
    public final Bitmap f264297h;

    /* renamed from: i */
    public final C102867i f264298i;

    public C92360a(RectF rectF) {
        C87412m.m108594g(rectF, "preViewRect");
        int i = C91977i.f263324c;
        this.f264290a = i;
        this.f264291b = i;
        Matrix matrix = new Matrix();
        this.f264294e = matrix;
        Paint paint = new Paint();
        this.f264295f = paint;
        this.f264298i = new C102867i(this.f264292c);
        matrix.setPolyToPoly(new float[]{rectF.left, rectF.top, rectF.right, rectF.bottom}, 0, new float[]{0.0f, 0.0f, (float) this.f264290a, (float) this.f264291b}, 0, 2);
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        Bitmap createBitmap = Bitmap.createBitmap(this.f264290a, this.f264291b, Bitmap.Config.ARGB_8888);
        C87412m.m108593f(createBitmap, "createBitmap(width, heig… Bitmap.Config.ARGB_8888)");
        this.f264297h = createBitmap;
        this.f264296g = new Canvas(createBitmap);
    }

    /* renamed from: a */
    public C58605a mo126334a() {
        if (((ArrayList) this.f264292c).size() <= 0) {
            return null;
        }
        int save = this.f264296g.save();
        this.f264296g.drawColor(0, PorterDuff.Mode.MULTIPLY);
        this.f264296g.concat(this.f264294e);
        this.f264293d = this.f264298i.mo142583a(this.f264296g, this.f264295f);
        this.f264296g.restoreToCount(save);
        return new C58605a(this.f264297h, this.f264293d);
    }
}
