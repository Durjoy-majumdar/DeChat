package wk1;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.LruCache;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import er1.C58739j4;
import ft1.C59319a;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import hi3.C87515a;
import o40.C11348f;
import rx3.C13598b0;
import rx3.C36570n;

/* renamed from: wk1.i */
public class C15432i extends C15422a {

    /* renamed from: e */
    public static final C15433a f41854e = new C15433a((C8480h) null);

    /* renamed from: f */
    public static final LruCache<Integer, Drawable> f41855f = new LruCache<>(10);

    /* renamed from: d */
    public C15433a.C15434a f41856d = new C15433a.C15434a(0, 0, 0, 0, 0, 0, 0, 0, 0, (CharSequence) null, 0, 0, false, (Drawable) null, 0, 0, 0, false, 262143, (C8480h) null);

    /* renamed from: wk1.i$a */
    public static final class C15433a {

        /* renamed from: wk1.i$a$a */
        public static final class C15434a {

            /* renamed from: a */
            public int f41857a;

            /* renamed from: b */
            public int f41858b;

            /* renamed from: c */
            public int f41859c;

            /* renamed from: d */
            public int f41860d;

            /* renamed from: e */
            public int f41861e;

            /* renamed from: f */
            public int f41862f;

            /* renamed from: g */
            public int f41863g;

            /* renamed from: h */
            public int f41864h;

            /* renamed from: i */
            public int f41865i;

            /* renamed from: j */
            public CharSequence f41866j;

            /* renamed from: k */
            public int f41867k;

            /* renamed from: l */
            public int f41868l;

            /* renamed from: m */
            public boolean f41869m;

            /* renamed from: n */
            public Drawable f41870n;

            /* renamed from: o */
            public int f41871o;

            /* renamed from: p */
            public int f41872p;

            /* renamed from: q */
            public int f41873q;

            /* renamed from: r */
            public boolean f41874r;

            /* renamed from: s */
            public int f41875s;

            public C15434a() {
                this(0, 0, 0, 0, 0, 0, 0, 0, 0, (CharSequence) null, 0, 0, false, (Drawable) null, 0, 0, 0, false, 262143, (C8480h) null);
            }

            public C15434a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, CharSequence charSequence, int i15, int i16, boolean z, Drawable drawable, int i17, int i18, int i19, boolean z2, int i25, C8480h hVar) {
                int i26;
                int i27;
                int i28 = i25;
                int i29 = (i28 & 1) != 0 ? 0 : i;
                int j = (i28 & 2) != 0 ? C15440n.f41895a.mo14261j() : i2;
                int j2 = (i28 & 4) != 0 ? C15440n.f41895a.mo14261j() : i3;
                int m = (i28 & 8) != 0 ? C15440n.f41895a.mo14264m() : i4;
                if ((i28 & 16) != 0) {
                    C15440n nVar = C15440n.f41895a;
                    i26 = ((Number) ((C36570n) C15440n.f41899e).getValue()).intValue();
                } else {
                    i26 = i5;
                }
                int i35 = (i28 & 32) != 0 ? 0 : i6;
                int i36 = (i28 & 64) != 0 ? 0 : i7;
                int g = (i28 & 128) != 0 ? C15440n.f41895a.mo14258g() : i8;
                if ((i28 & 256) != 0) {
                    C15440n nVar2 = C15440n.f41895a;
                    i27 = ((Number) ((C36570n) C15440n.f41903i).getValue()).intValue();
                } else {
                    i27 = i9;
                }
                String str = (i28 & 512) != 0 ? "" : charSequence;
                int i37 = (i28 & 1024) != 0 ? 0 : i15;
                int e = (i28 & 2048) != 0 ? C15440n.f41895a.mo14256e() : i16;
                boolean z3 = (i28 & 4096) != 0 ? false : z;
                Drawable drawable2 = (i28 & 8192) != 0 ? null : drawable;
                int f = (i28 & 16384) != 0 ? C15440n.f41895a.mo14257f() : i17;
                int f2 = (i28 & 32768) != 0 ? C15440n.f41895a.mo14257f() : i18;
                int i38 = (i28 & 65536) != 0 ? 0 : i19;
                boolean z4 = (i28 & 131072) != 0 ? true : z2;
                C87412m.m108594g(str, MimeTypes.BASE_TYPE_TEXT);
                this.f41857a = i29;
                this.f41858b = j;
                this.f41859c = j2;
                this.f41860d = m;
                this.f41861e = i26;
                this.f41862f = i35;
                this.f41863g = i36;
                this.f41864h = g;
                this.f41865i = i27;
                this.f41866j = str;
                this.f41867k = i37;
                this.f41868l = e;
                this.f41869m = z3;
                this.f41870n = drawable2;
                this.f41871o = f;
                this.f41872p = f2;
                this.f41873q = i38;
                this.f41874r = z4;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C15434a)) {
                    return false;
                }
                C15434a aVar = (C15434a) obj;
                return this.f41857a == aVar.f41857a && this.f41858b == aVar.f41858b && this.f41859c == aVar.f41859c && this.f41860d == aVar.f41860d && this.f41861e == aVar.f41861e && this.f41862f == aVar.f41862f && this.f41863g == aVar.f41863g && this.f41864h == aVar.f41864h && this.f41865i == aVar.f41865i && C87412m.m108589b(this.f41866j, aVar.f41866j) && this.f41867k == aVar.f41867k && this.f41868l == aVar.f41868l && this.f41869m == aVar.f41869m && C87412m.m108589b(this.f41870n, aVar.f41870n) && this.f41871o == aVar.f41871o && this.f41872p == aVar.f41872p && this.f41873q == aVar.f41873q && this.f41874r == aVar.f41874r;
            }

            public int hashCode() {
                int hashCode = ((((((((((((((((((((((this.f41857a * 31) + this.f41858b) * 31) + this.f41859c) * 31) + this.f41860d) * 31) + this.f41861e) * 31) + this.f41862f) * 31) + this.f41863g) * 31) + this.f41864h) * 31) + this.f41865i) * 31) + this.f41866j.hashCode()) * 31) + this.f41867k) * 31) + this.f41868l) * 31;
                boolean z = this.f41869m;
                boolean z2 = true;
                if (z) {
                    z = true;
                }
                int i = (hashCode + (z ? 1 : 0)) * 31;
                Drawable drawable = this.f41870n;
                int hashCode2 = (((((((i + (drawable == null ? 0 : drawable.hashCode())) * 31) + this.f41871o) * 31) + this.f41872p) * 31) + this.f41873q) * 31;
                boolean z3 = this.f41874r;
                if (!z3) {
                    z2 = z3;
                }
                return hashCode2 + (z2 ? 1 : 0);
            }

            public String toString() {
                return "FinderLiveImageSpanParams(leftMargin=" + this.f41857a + ", rightMargin=" + this.f41858b + ", leftPading=" + this.f41859c + ", rightPading=" + this.f41860d + ", itemPading=" + this.f41861e + ", bgColor=" + this.f41862f + ", bgDrawableId=" + this.f41863g + ", bgHeight=" + this.f41864h + ", bgRadius=" + this.f41865i + ", text=" + this.f41866j + ", textColor=" + this.f41867k + ", textSize=" + this.f41868l + ", textBold=" + this.f41869m + ", leftIcon=" + this.f41870n + ", leftIconWidth=" + this.f41871o + ", leftIconHeight=" + this.f41872p + ", leftIconColor=" + this.f41873q + ", drawBg=" + this.f41874r + ')';
            }
        }

        public C15433a(C8480h hVar) {
        }

        /* renamed from: a */
        public final Drawable mo14246a(int i, float f) {
            LruCache lruCache = C15432i.f41855f;
            Object obj = lruCache.get(Integer.valueOf(i));
            if (obj == null) {
                synchronized (lruCache) {
                    obj = lruCache.get(Integer.valueOf(i));
                    if (obj == null) {
                        Resources resources = MMApplicationContext.getResources();
                        float f2 = 1.0f;
                        if (f > 1.0f) {
                            f2 = f;
                        }
                        obj = C87515a.m108835e(resources, i, f2);
                        lruCache.put(Integer.valueOf(i), obj);
                        Log.m105924i("FinderLiveLevelImageSpan", "getLevelIcon resId:" + i + ",scale:" + f);
                    }
                    C13598b0 b0Var = C13598b0.f38549a;
                }
            }
            C87412m.m108593f(obj, "icon");
            return (Drawable) obj;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15432i(Drawable drawable) {
        super(drawable);
        C87412m.m108594g(drawable, "drawable");
    }

    /* renamed from: a */
    public int mo14226a() {
        return this.f41856d.f41875s;
    }

    /* renamed from: b */
    public void mo14242b(Canvas canvas, float f, int i, int i2, int i3, Paint paint) {
        C87412m.m108594g(canvas, "canvas");
        C87412m.m108594g(paint, "paint");
        float measureText = paint.measureText(this.f41856d.f41866j.toString());
        C15433a.C15434a aVar = this.f41856d;
        float f2 = ((float) aVar.f41857a) + f;
        float f3 = ((float) aVar.f41859c) + f2 + ((float) aVar.f41871o) + ((float) aVar.f41861e) + measureText + ((float) aVar.f41860d);
        int i4 = i3 - i;
        int i5 = aVar.f41864h;
        float f4 = (float) (i + (i4 > i5 ? (i4 - i5) / 2 : 0));
        float f5 = ((float) i5) + f4;
        int i6 = aVar.f41862f;
        if (i6 != 0 || aVar.f41863g == 0) {
            paint.setColor(i6);
            RectF rectF = new RectF(f2, f4, f3, f5);
            int i7 = this.f41856d.f41865i;
            canvas.drawRoundRect(rectF, (float) i7, (float) i7, paint);
            return;
        }
        try {
            Drawable drawable = MMApplicationContext.getContext().getResources().getDrawable(this.f41856d.f41863g, (Resources.Theme) null);
            drawable.setBounds(new Rect((int) f2, (int) f4, (int) f3, (int) f5));
            drawable.draw(canvas);
        } catch (Throwable th) {
            Log.printErrStackTrace("FinderLiveLevelImageSpan", th, "invalid bgDrawableId:" + this.f41856d.f41863g, new Object[0]);
        }
    }

    /* renamed from: c */
    public final void mo14243c(Canvas canvas, float f, int i, int i2, int i3, Paint paint) {
        C13598b0 b0Var;
        Drawable drawable = this.f41856d.f41870n;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(this.f41856d.f41873q, PorterDuff.Mode.SRC_ATOP));
            C15433a.C15434a aVar = this.f41856d;
            float f2 = f + ((float) aVar.f41857a) + ((float) aVar.f41859c);
            float f3 = ((float) aVar.f41871o) + f2;
            int i4 = i3 - i;
            int i5 = aVar.f41872p;
            int i6 = (i4 - i5) / 2;
            drawable.setBounds(new Rect((int) f2, i6, (int) f3, i5 + i6));
            canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
            drawable.draw(canvas);
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            Log.m105920e("FinderLiveLevelImageSpan", "drawLeftIcon bitmap is empty!");
        }
    }

    /* renamed from: d */
    public final void mo14244d(Canvas canvas, float f, int i, int i2, int i3, Paint paint) {
        if (this.f41856d.f41866j.length() == 0) {
            Log.m105920e("FinderLiveLevelImageSpan", "drawRightText text is empty!");
            return;
        }
        if (this.f41856d.f41869m) {
            C85875k4.m106189j0(paint, 0.8f);
        }
        paint.setColor(this.f41856d.f41867k);
        float abs = (Math.abs(paint.ascent() + paint.descent()) / ((float) 2)) + ((float) ((i3 - i) / 2));
        C15433a.C15434a aVar = this.f41856d;
        canvas.drawText(aVar.f41866j.toString(), f + ((float) aVar.f41857a) + ((float) aVar.f41859c) + ((float) aVar.f41871o) + ((float) aVar.f41861e), abs, paint);
        if (this.f41856d.f41869m) {
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
            paint2.setTextSize((float) this.f41856d.f41868l);
            if (this.f41856d.f41874r) {
                mo14242b(canvas, f, i3, i4, i5, paint);
            }
            mo14243c(canvas, f, i3, i4, i5, paint);
            mo14244d(canvas, f, i3, i4, i5, paint);
            paint2.setColor(color);
            paint2.setTextSize(textSize);
            paint2.setTypeface(typeface);
        } catch (Exception e) {
            C11348f.C11349a.m11178b(C59319a.f169618b, "liveInvalidBadgeTag", false, (C11348f.C11352b) null, false, false, (C32224a) null, 60, (Object) null);
            C58739j4.f168176a.mo83712h0(e, "FinderLiveLevelImageSpan.draw");
        }
    }
}
