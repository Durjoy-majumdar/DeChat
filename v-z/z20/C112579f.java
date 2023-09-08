package z20;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.view.PhotoEditText;
import di3.C86312j;
import kg3.C76577a;
import p629ny.C76979h;

/* renamed from: z20.f */
public class C112579f extends C112573c {

    /* renamed from: G */
    public static final float f337102G;

    /* renamed from: H */
    public static TextPaint f337103H;

    /* renamed from: A */
    public boolean f337104A = false;

    /* renamed from: B */
    public boolean f337105B = true;

    /* renamed from: C */
    public SpannableString f337106C;

    /* renamed from: D */
    public String f337107D;

    /* renamed from: E */
    public float f337108E = f337102G;

    /* renamed from: F */
    public int f337109F = 0;

    /* renamed from: y */
    public int f337110y;

    /* renamed from: z */
    public int f337111z;

    static {
        float dimension = MMApplicationContext.getResources().getDimension(C0966R.dimen.a2a);
        f337102G = dimension;
        MMApplicationContext.getResources().getDimension(C0966R.dimen.f357041ad1);
        MMApplicationContext.getResources().getDimension(C0966R.dimen.aj6);
        TextPaint textPaint = new TextPaint(1);
        f337103H = textPaint;
        textPaint.setStrokeCap(Paint.Cap.ROUND);
        f337103H.setStyle(Paint.Style.FILL);
        f337103H.setDither(true);
        f337103H.setTextSize(dimension);
    }

    public C112579f(Context context, Matrix matrix, String str, Rect rect, SpannableString spannableString, int i, int i2, String str2) {
        super(context, matrix, str, rect);
        this.f337110y = i;
        this.f337106C = spannableString;
        this.f337111z = i2;
        this.f337107D = str2;
    }

    /* renamed from: g */
    public Bitmap mo164314g() {
        f337103H.setColor(this.f337110y);
        if (this.f337106C == null) {
            return null;
        }
        PhotoEditText photoEditText = new PhotoEditText(this.f337064d);
        int h = C76577a.m92157h(this.f337064d, C0966R.dimen.a29);
        photoEditText.setPadding(h, 0, h, 0);
        photoEditText.setTextBackground(this.f337111z);
        photoEditText.setTextColor(this.f337110y);
        photoEditText.setTextSize((float) Math.round(this.f337108E / this.f337064d.getResources().getDisplayMetrics().density));
        photoEditText.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(this.f337064d, this.f337106C, f337102G / 1.3f));
        photoEditText.setSingleLine(false);
        if (TextUtils.isEmpty(this.f337107D)) {
            photoEditText.setTypeface(photoEditText.getTypeface(), 1);
        } else if (C86013q1.m106450k(this.f337107D)) {
            photoEditText.setTypeface(Typeface.createFromFile(this.f337107D));
        } else {
            photoEditText.setTypeface(Typeface.DEFAULT);
        }
        int i = this.f337109F;
        if (i != 0) {
            photoEditText.setMaxWidth(i);
        } else {
            photoEditText.setMaxWidth((int) (((float) this.f337064d.getResources().getDisplayMetrics().widthPixels) - (this.f337064d.getResources().getDimension(C0966R.dimen.a29) * 2.0f)));
        }
        if (this.f337111z == 0 && this.f337110y != -16777216 && this.f337105B) {
            photoEditText.setShadowLayer((float) C76577a.m92151b(photoEditText.getContext(), 3), 0.0f, (float) C76577a.m92151b(photoEditText.getContext(), 1), Integer.MIN_VALUE);
        }
        photoEditText.measure(0, 0);
        if (this.f337104A) {
            photoEditText.f319852g.layout(0, 0, photoEditText.getMeasuredWidth(), photoEditText.getMeasuredHeight());
        }
        photoEditText.setEnableStoke(this.f337104A);
        Bitmap createBitmap = Bitmap.createBitmap(photoEditText.getMeasuredWidth() - h, photoEditText.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        photoEditText.getLayout().getPaint().setColor(this.f337110y);
        canvas.save();
        float f = (float) h;
        canvas.translate(-0.5f * f, 0.0f);
        photoEditText.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(f * 0.5f, 0.0f);
        photoEditText.getLayout().draw(canvas);
        canvas.restore();
        return createBitmap;
    }

    /* renamed from: m */
    public void mo164319m(boolean z) {
        this.f337073p = z;
        if (!z) {
            this.f337077t = false;
        }
    }
}
