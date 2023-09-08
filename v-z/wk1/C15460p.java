package wk1;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import er1.C58739j4;
import ft1.C59319a;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import o40.C11348f;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: wk1.p */
public final class C15460p extends C15422a {

    /* renamed from: f */
    public static final /* synthetic */ int f41933f = 0;

    /* renamed from: d */
    public final C13601g f41934d = C36568h.m40985a(C15462b.f41937d);

    /* renamed from: e */
    public C15463c f41935e = new C15463c((CharSequence) null, (CharSequence) null, 0, 0, false, 0, 0, false, 0, 0, 0, 0, 0, 0, 0.0f, 32767, (C8480h) null);

    /* renamed from: wk1.p$a */
    public static final class C15461a {

        /* renamed from: a */
        public C15463c f41936a;

        public C15461a() {
            C15463c cVar = r0;
            C15463c cVar2 = new C15463c((CharSequence) null, (CharSequence) null, 0, 0, false, 0, 0, false, 0, 0, 0, 0, 0, 0, 0.0f, 32767, (C8480h) null);
            this.f41936a = cVar;
        }

        /* renamed from: a */
        public final C15460p mo14274a() {
            C15463c cVar = this.f41936a;
            C15440n nVar = C15440n.f41895a;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f41936a.f41938a);
            sb.append(this.f41936a.f41939b);
            float o = ((float) cVar.f41947j) + nVar.mo14266o(sb.toString(), (float) this.f41936a.f41941d);
            C15463c cVar2 = this.f41936a;
            cVar.f41953p = (int) (o + ((float) cVar2.f41949l) + ((float) cVar2.f41948k));
            cVar2.f41954q = cVar2.f41943f + cVar2.f41953p + cVar2.f41946i;
            C15460p pVar = new C15460p(C15440n.m14439b(nVar, this.f41936a.f41954q, 0, 2, (Object) null));
            C15463c cVar3 = this.f41936a;
            C87412m.m108594g(cVar3, "<set-?>");
            pVar.f41935e = cVar3;
            return pVar;
        }

        /* renamed from: b */
        public final C15461a mo14275b(int i, C15482w<Integer> wVar) {
            C87412m.m108594g(wVar, "config");
            this.f41936a.f41950m = wVar.mo14222g(Integer.valueOf(i));
            this.f41936a.f41951n = wVar.mo14217b(Integer.valueOf(i));
            this.f41936a.f41940c = wVar.mo14216a(Integer.valueOf(i));
            C15463c cVar = this.f41936a;
            int c = wVar.mo14218c(Integer.valueOf(i));
            boolean z = true;
            if (c != 1) {
                z = false;
            }
            cVar.f41942e = z;
            return this;
        }

        /* renamed from: c */
        public final C15461a mo14276c(int i) {
            C15463c cVar = this.f41936a;
            cVar.f41948k = i;
            cVar.f41947j = i;
            return this;
        }

        /* renamed from: d */
        public final C15461a mo14277d(String str) {
            if (!(str == null || str.length() == 0)) {
                try {
                    this.f41936a.f41950m = Color.parseColor(str);
                } catch (Exception e) {
                    Log.m105920e("FinderLiveLevelImageSpan", e + ",serverColor:" + str);
                }
            } else {
                this.f41936a.f41950m = 0;
            }
            return this;
        }

        /* renamed from: e */
        public final C15461a mo14278e(CharSequence charSequence) {
            C87412m.m108594g(charSequence, "content");
            C15463c cVar = this.f41936a;
            cVar.getClass();
            cVar.f41938a = charSequence;
            return this;
        }
    }

    /* renamed from: wk1.p$b */
    public static final class C15462b extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C15462b f41937d = new C15462b();

        public C15462b() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(MMApplicationContext.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3698c1));
        }
    }

    /* renamed from: wk1.p$c */
    public static final class C15463c {

        /* renamed from: a */
        public CharSequence f41938a;

        /* renamed from: b */
        public CharSequence f41939b;

        /* renamed from: c */
        public int f41940c;

        /* renamed from: d */
        public int f41941d;

        /* renamed from: e */
        public boolean f41942e;

        /* renamed from: f */
        public int f41943f;

        /* renamed from: g */
        public int f41944g;

        /* renamed from: h */
        public boolean f41945h;

        /* renamed from: i */
        public int f41946i;

        /* renamed from: j */
        public int f41947j;

        /* renamed from: k */
        public int f41948k;

        /* renamed from: l */
        public int f41949l;

        /* renamed from: m */
        public int f41950m;

        /* renamed from: n */
        public int f41951n;

        /* renamed from: o */
        public float f41952o;

        /* renamed from: p */
        public int f41953p;

        /* renamed from: q */
        public int f41954q;

        public C15463c() {
            this((CharSequence) null, (CharSequence) null, 0, 0, false, 0, 0, false, 0, 0, 0, 0, 0, 0, 0.0f, 32767, (C8480h) null);
        }

        public C15463c(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, int i3, int i4, boolean z2, int i5, int i6, int i7, int i8, int i9, int i15, float f, int i16, C8480h hVar) {
            int i17 = i16;
            CharSequence charSequence3 = "";
            CharSequence charSequence4 = (i17 & 1) != 0 ? charSequence3 : charSequence;
            charSequence3 = (i17 & 2) == 0 ? charSequence2 : charSequence3;
            int color = (i17 & 4) != 0 ? MMApplicationContext.getContext().getResources().getColor(C0966R.color.al_) : i;
            int e = (i17 & 8) != 0 ? C15440n.f41895a.mo14256e() : i2;
            int i18 = 0;
            boolean z3 = (i17 & 16) != 0 ? false : z;
            int i19 = (i17 & 32) != 0 ? 0 : i3;
            int i25 = (i17 & 64) != 0 ? 255 : i4;
            boolean z4 = (i17 & 128) != 0 ? false : z2;
            int j = (i17 & 256) != 0 ? C15440n.f41895a.mo14261j() : i5;
            int m = (i17 & 512) != 0 ? C15440n.f41895a.mo14264m() : i6;
            int m2 = (i17 & 1024) != 0 ? C15440n.f41895a.mo14264m() : i7;
            int i26 = (i17 & 2048) != 0 ? 0 : i8;
            i18 = (i17 & 4096) == 0 ? i9 : i18;
            int g = (i17 & 8192) != 0 ? C15440n.f41895a.mo14258g() : i15;
            float f2 = (i17 & 16384) != 0 ? 0.0f : f;
            C87412m.m108594g(charSequence4, "textContent");
            C87412m.m108594g(charSequence3, "number");
            this.f41938a = charSequence4;
            this.f41939b = charSequence3;
            this.f41940c = color;
            this.f41941d = e;
            this.f41942e = z3;
            this.f41943f = i19;
            this.f41944g = i25;
            this.f41945h = z4;
            this.f41946i = j;
            this.f41947j = m;
            this.f41948k = m2;
            this.f41949l = i26;
            this.f41950m = i18;
            this.f41951n = g;
            this.f41952o = f2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C15463c)) {
                return false;
            }
            C15463c cVar = (C15463c) obj;
            return C87412m.m108589b(this.f41938a, cVar.f41938a) && C87412m.m108589b(this.f41939b, cVar.f41939b) && this.f41940c == cVar.f41940c && this.f41941d == cVar.f41941d && this.f41942e == cVar.f41942e && this.f41943f == cVar.f41943f && this.f41944g == cVar.f41944g && this.f41945h == cVar.f41945h && this.f41946i == cVar.f41946i && this.f41947j == cVar.f41947j && this.f41948k == cVar.f41948k && this.f41949l == cVar.f41949l && this.f41950m == cVar.f41950m && this.f41951n == cVar.f41951n && C87412m.m108589b(Float.valueOf(this.f41952o), Float.valueOf(cVar.f41952o));
        }

        public int hashCode() {
            int hashCode = ((((((this.f41938a.hashCode() * 31) + this.f41939b.hashCode()) * 31) + this.f41940c) * 31) + this.f41941d) * 31;
            boolean z = this.f41942e;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (((((hashCode + (z ? 1 : 0)) * 31) + this.f41943f) * 31) + this.f41944g) * 31;
            boolean z3 = this.f41945h;
            if (!z3) {
                z2 = z3;
            }
            return ((((((((((((((i + (z2 ? 1 : 0)) * 31) + this.f41946i) * 31) + this.f41947j) * 31) + this.f41948k) * 31) + this.f41949l) * 31) + this.f41950m) * 31) + this.f41951n) * 31) + Float.floatToIntBits(this.f41952o);
        }

        public String toString() {
            return "FinderLiveTagImageSpanConfig(textContent=" + this.f41938a + ", number=" + this.f41939b + ", textColor=" + this.f41940c + ", textSize=" + this.f41941d + ", textBold=" + this.f41942e + ", leftMargin=" + this.f41943f + ", alpha=" + this.f41944g + ", hasFrame=" + this.f41945h + ", rightMargin=" + this.f41946i + ", leftPading=" + this.f41947j + ", rightPading=" + this.f41948k + ", centerPading=" + this.f41949l + ", bgColor=" + this.f41950m + ", bgHeight=" + this.f41951n + ", radius=" + this.f41952o + ')';
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15460p(Drawable drawable) {
        super(drawable);
        C87412m.m108594g(drawable, "drawable");
    }

    /* renamed from: a */
    public int mo14226a() {
        return this.f41935e.f41954q;
    }

    /* renamed from: b */
    public final void mo14270b(Canvas canvas, float f, int i, int i2, int i3, Paint paint) {
        paint.setColor(this.f41935e.f41950m);
        paint.setTextSize((float) this.f41935e.f41941d);
        if (this.f41935e.f41953p <= 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f41935e.f41938a);
            sb.append(this.f41935e.f41939b);
            String sb4 = sb.toString();
            C15463c cVar = this.f41935e;
            float measureText = ((float) cVar.f41947j) + paint.measureText(sb4, 0, sb4.length());
            C15463c cVar2 = this.f41935e;
            cVar.f41953p = (int) (measureText + ((float) cVar2.f41949l) + ((float) cVar2.f41948k));
        }
        C15463c cVar3 = this.f41935e;
        float f2 = (float) 2;
        float f3 = ((float) cVar3.f41951n) / f2;
        float f4 = (((float) i3) - ((float) i)) / f2;
        float f5 = ((float) cVar3.f41943f) + f;
        float f6 = f4 - f3;
        float f7 = ((float) cVar3.f41953p) + f5;
        float f8 = f4 + f3;
        float f9 = cVar3.f41952o;
        if (f9 > 0.0f) {
            f3 = f9;
        }
        canvas.drawRoundRect(new RectF(f5, f6, f7, f8), f3, f3, paint);
    }

    /* renamed from: c */
    public final void mo14271c(Canvas canvas, float f, int i, int i2, int i3, Paint paint) {
        C15463c cVar = this.f41935e;
        if (cVar.f41945h) {
            float measureText = paint.measureText(cVar.f41938a.toString());
            float intValue = (float) ((Number) ((C36570n) this.f41934d).getValue()).intValue();
            float intValue2 = (float) ((Number) ((C36570n) this.f41934d).getValue()).intValue();
            C15463c cVar2 = this.f41935e;
            float f2 = ((float) cVar2.f41943f) + f + intValue;
            float f3 = ((float) cVar2.f41947j) + f2 + measureText + ((float) cVar2.f41948k) + intValue;
            int i4 = (i3 - i) - ((int) (((float) 2) * intValue2));
            int i5 = cVar2.f41951n;
            float f4 = ((float) (i + (i4 > i5 ? (i4 - i5) / 2 : 0))) + intValue2;
            Paint paint2 = new Paint();
            paint2.setColor(MMApplicationContext.getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_1));
            paint2.setStrokeWidth((float) ((Number) ((C36570n) this.f41934d).getValue()).intValue());
            paint2.setStyle(Paint.Style.STROKE);
            canvas.drawRoundRect(new RectF(f2, f4, f3, ((float) i5) + f4), (float) MMApplicationContext.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3702cb), (float) MMApplicationContext.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3702cb), paint2);
        }
    }

    /* renamed from: d */
    public final void mo14272d(Canvas canvas, float f, int i, int i2, int i3, Paint paint) {
        if (this.f41935e.f41942e) {
            C85875k4.m106189j0(paint, 0.8f);
        }
        paint.setColor(this.f41935e.f41940c);
        paint.setAlpha(this.f41935e.f41944g);
        paint.setTextSize((float) this.f41935e.f41941d);
        float abs = (Math.abs(paint.ascent() + paint.descent()) / ((float) 2)) + ((float) ((i3 - i) / 2));
        C15463c cVar = this.f41935e;
        float f2 = f + ((float) cVar.f41943f) + ((float) cVar.f41947j);
        canvas.drawText(cVar.f41938a.toString(), f2, abs, paint);
        if (this.f41935e.f41939b.length() > 0) {
            CharSequence charSequence = this.f41935e.f41938a;
            float measureText = f2 + paint.measureText(charSequence, 0, charSequence.length());
            C15463c cVar2 = this.f41935e;
            canvas.drawText(cVar2.f41939b.toString(), measureText + ((float) cVar2.f41949l), abs, paint);
        }
        if (this.f41935e.f41942e) {
            C85875k4.m106193l0(paint);
        }
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Paint paint2 = paint;
        Canvas canvas2 = canvas;
        C87412m.m108594g(canvas, "canvas");
        C87412m.m108594g(paint2, "paint");
        try {
            int color = paint.getColor();
            float textSize = paint.getTextSize();
            Typeface typeface = paint.getTypeface();
            mo14270b(canvas, f, i3, i4, i5, paint);
            mo14272d(canvas, f, i3, i4, i5, paint);
            mo14271c(canvas, f, i3, i4, i5, paint);
            paint2.setColor(color);
            paint2.setTextSize(textSize);
            paint2.setTypeface(typeface);
        } catch (Exception e) {
            C11348f.C11349a.m11178b(C59319a.f169618b, "liveInvalidBadgeTag", false, (C11348f.C11352b) null, false, false, (C32224a) null, 60, (Object) null);
            C58739j4.f168176a.mo83712h0(e, "FinderLiveTagImageSpan.draw");
        }
    }
}
