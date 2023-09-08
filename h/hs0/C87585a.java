package hs0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.tencent.p014mm.memory.C92712l;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import lb0.C88394b;

/* renamed from: hs0.a */
public final class C87585a implements C88394b.C88408j {

    /* renamed from: d */
    public final int f253671d;

    /* renamed from: e */
    public final int f253672e;

    /* renamed from: f */
    public final int f253673f;

    public C87585a(int i, int i2, int i3) {
        this.f253671d = i;
        this.f253672e = i2;
        this.f253673f = i3;
    }

    /* renamed from: c */
    public Bitmap mo5830c(Bitmap bitmap) {
        Bitmap roundedCornerBitmap = BitmapUtil.getRoundedCornerBitmap(bitmap, false, (float) (bitmap.getWidth() / 2), false);
        int i = this.f253671d;
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(roundedCornerBitmap, i, i, false);
        if (roundedCornerBitmap != createScaledBitmap) {
            C92712l.m116840c().mo126912d(roundedCornerBitmap);
        }
        int i2 = this.f253671d;
        int i3 = this.f253672e;
        Bitmap createBitmap = Bitmap.createBitmap((i3 * 2) + i2, i2 + (i3 * 2), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i4 = this.f253672e;
        canvas.drawBitmap(createScaledBitmap, (float) i4, (float) i4, new Paint());
        C92712l.m116840c().mo126912d(createScaledBitmap);
        Paint paint = new Paint();
        paint.setColor(this.f253673f);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth((float) this.f253672e);
        int i5 = this.f253671d;
        int i6 = this.f253672e;
        canvas.drawCircle((float) ((i5 / 2) + i6), (float) ((i5 / 2) + i6), (float) (i5 / 2), paint);
        return createBitmap;
    }

    public String key() {
        return "WxaNearbyShowcaseIcon";
    }
}
