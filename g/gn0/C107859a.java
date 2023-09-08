package gn0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import kg3.C76577a;

/* renamed from: gn0.a */
public class C107859a implements C107865g {

    /* renamed from: l */
    public static int f322983l;

    /* renamed from: m */
    public static int f322984m;

    /* renamed from: a */
    public Context f322985a;

    /* renamed from: b */
    public SpannableString f322986b;

    /* renamed from: c */
    public int f322987c;

    /* renamed from: d */
    public int f322988d;

    /* renamed from: e */
    public StaticLayout f322989e;

    /* renamed from: f */
    public int f322990f;

    /* renamed from: g */
    public int f322991g = -1;

    /* renamed from: h */
    public int f322992h;

    /* renamed from: i */
    public int f322993i;

    /* renamed from: j */
    public int f322994j = -1;

    /* renamed from: k */
    public float f322995k;

    public C107859a(Context context, SpannableString spannableString, int i, int i2, float f, int i3) {
        this.f322985a = context;
        this.f322986b = spannableString;
        if (i2 > 0) {
            this.f322992h = C76577a.m92151b(context, i2);
        } else {
            this.f322992h = C76577a.m92151b(context, 18);
        }
        this.f322994j = i;
        this.f322995k = f;
        this.f322993i = i3;
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setColor(this.f322994j);
        textPaint.setTextSize((float) this.f322992h);
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        Math.ceil((double) (fontMetrics.descent - fontMetrics.top));
        SpannableString spannableString2 = this.f322986b;
        StaticLayout staticLayout = new StaticLayout(spannableString2, textPaint, ((int) Layout.getDesiredWidth(spannableString2, 0, spannableString2.length(), textPaint)) + 1, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f322989e = staticLayout;
        this.f322990f = staticLayout.getWidth();
    }

    /* renamed from: a */
    public float mo158275a() {
        return this.f322995k;
    }

    /* renamed from: b */
    public void mo158276b(Canvas canvas, boolean z) {
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        if (!(width == f322983l && height == f322984m)) {
            f322983l = width;
            f322984m = height;
        }
        canvas.save();
        canvas.translate((float) this.f322987c, (float) this.f322988d);
        this.f322989e.draw(canvas);
        canvas.restore();
        if (!z) {
            this.f322987c = (int) (((float) this.f322987c) - (((float) 3) * this.f322995k));
        }
    }

    /* renamed from: c */
    public boolean mo158277c(int i) {
        int i2 = this.f322993i;
        return i >= i2 && i - i2 <= 10;
    }

    /* renamed from: d */
    public boolean mo158278d() {
        int i = this.f322987c;
        return i < 0 && Math.abs(i) > this.f322990f;
    }

    /* renamed from: e */
    public boolean mo158279e(C107865g gVar) {
        if (gVar.getWidth() + gVar.mo158280f() > f322983l) {
            return true;
        }
        if (this.f322991g < 0) {
            this.f322991g = C76577a.m92151b(this.f322985a, 20);
        }
        if (gVar.mo158275a() >= this.f322995k) {
            return gVar.mo158275a() == this.f322995k && ((float) (f322983l - (gVar.mo158280f() + gVar.getWidth()))) < ((float) this.f322991g);
        }
        float f = (float) 3;
        return ((double) (((((float) (gVar.mo158280f() + gVar.getWidth())) / (gVar.mo158275a() * f)) * this.f322995k) * f)) > ((double) f322983l) - (((double) this.f322991g) * 1.5d);
    }

    /* renamed from: f */
    public int mo158280f() {
        return this.f322987c;
    }

    /* renamed from: g */
    public int mo158281g() {
        return this.f322993i;
    }

    public int getWidth() {
        return this.f322990f;
    }

    /* renamed from: h */
    public boolean mo158283h(int i) {
        return i - this.f322993i > 10;
    }

    /* renamed from: i */
    public void mo158284i(int i, int i2) {
        this.f322987c = i;
        this.f322988d = i2;
    }
}
