package wk1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.LruCache;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import er1.C58739j4;
import gy3.C8480h;
import gy3.C87412m;
import ok1.C62042e;
import p1028re.C89928a;
import p1028re.C89931d;
import rx3.C13598b0;

/* renamed from: wk1.e */
public final class C15426e extends C15422a {

    /* renamed from: e */
    public static final C15429c f41832e = new C15429c((C8480h) null);

    /* renamed from: f */
    public static final LruCache<Integer, Bitmap> f41833f = new LruCache<>(10);

    /* renamed from: d */
    public C15430d f41834d = new C15430d((String) null, 0, 0, (String) null, 0, 0, (Drawable) null, 0, 0, (Drawable) null, 0, 0, 0, 0, 0, 0, 65535, (C8480h) null);

    /* renamed from: wk1.e$a */
    public static final class C15427a {

        /* renamed from: a */
        public C15430d f41835a;

        public C15427a() {
            C15430d dVar = r0;
            C15430d dVar2 = new C15430d((String) null, 0, 0, (String) null, 0, 0, (Drawable) null, 0, 0, (Drawable) null, 0, 0, 0, 0, 0, 0, 65535, (C8480h) null);
            this.f41835a = dVar;
        }

        /* renamed from: a */
        public final C15426e mo14234a() {
            C15440n nVar = C15440n.f41895a;
            C15430d dVar = this.f41835a;
            C15426e eVar = new C15426e(C15440n.m14439b(nVar, dVar.mo14238a() + dVar.f41850o + dVar.f41851p, 0, 2, (Object) null));
            C15430d dVar2 = this.f41835a;
            C87412m.m108594g(dVar2, "<set-?>");
            eVar.f41834d = dVar2;
            return eVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x00bf  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x00cf  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x00da  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00f2  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x0107  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x0161  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x016f  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final wk1.C15426e.C15427a mo14235b(int r11, wk1.C15425d r12) {
            /*
                r10 = this;
                java.lang.String r0 = "config"
                gy3.C87412m.m108594g(r12, r0)
                wk1.e$d r0 = r10.f41835a
                java.lang.String r1 = java.lang.String.valueOf(r11)
                r0.getClass()
                java.lang.String r2 = "<set-?>"
                gy3.C87412m.m108594g(r1, r2)
                r0.f41836a = r1
                wk1.e$d r0 = r10.f41835a
                android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.content.res.Resources r1 = r1.getResources()
                r2 = 2131101837(0x7f06088d, float:1.7816095E38)
                int r1 = r1.getColor(r2)
                r0.f41837b = r1
                wk1.e$d r0 = r10.f41835a
                wk1.y r1 = r12.f41831b
                int r1 = r1.ordinal()
                r2 = 2
                r3 = 1
                if (r1 == r3) goto L_0x004e
                if (r1 == r2) goto L_0x003d
                wk1.n r1 = wk1.C15440n.f41895a
                int r1 = r1.mo14255d()
                goto L_0x005c
            L_0x003d:
                wk1.n r1 = wk1.C15440n.f41895a
                rx3.g r1 = wk1.C15440n.f41901g
                rx3.n r1 = (rx3.C36570n) r1
                java.lang.Object r1 = r1.getValue()
                java.lang.Number r1 = (java.lang.Number) r1
                int r1 = r1.intValue()
                goto L_0x005c
            L_0x004e:
                rx3.g r1 = wk1.C15440n.f41906l
                rx3.n r1 = (rx3.C36570n) r1
                java.lang.Object r1 = r1.getValue()
                java.lang.Number r1 = (java.lang.Number) r1
                int r1 = r1.intValue()
            L_0x005c:
                r0.f41838c = r1
                wk1.e$d r0 = r10.f41835a
                wk1.x r1 = r12.f41830a
                int r1 = r1.ordinal()
                r4 = 2131099704(0x7f060038, float:1.7811769E38)
                if (r1 == 0) goto L_0x00a0
                r5 = 2131099922(0x7f060112, float:1.781221E38)
                if (r1 == r2) goto L_0x0080
                r6 = 3
                if (r1 == r6) goto L_0x00a0
                android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.content.res.Resources r1 = r1.getResources()
                int r1 = r1.getColor(r5)
                goto L_0x00ac
            L_0x0080:
                boolean r1 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
                if (r1 == 0) goto L_0x0093
                android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.content.res.Resources r1 = r1.getResources()
                int r1 = r1.getColor(r4)
                goto L_0x00ac
            L_0x0093:
                android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.content.res.Resources r1 = r1.getResources()
                int r1 = r1.getColor(r5)
                goto L_0x00ac
            L_0x00a0:
                android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.content.res.Resources r1 = r1.getResources()
                int r1 = r1.getColor(r4)
            L_0x00ac:
                r0.f41840e = r1
                wk1.e$d r0 = r10.f41835a
                int r1 = r12.mo14232o(r11)
                r0.f41841f = r1
                int r0 = r12.mo14230m(r11)
                wk1.e$d r1 = r10.f41835a
                r4 = 0
                if (r0 == 0) goto L_0x00cf
                android.graphics.drawable.BitmapDrawable r5 = new android.graphics.drawable.BitmapDrawable
                android.content.res.Resources r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getResources()
                wk1.e$c r7 = wk1.C15426e.f41832e
                android.graphics.Bitmap r0 = r7.mo14237b(r0)
                r5.<init>(r6, r0)
                goto L_0x00d0
            L_0x00cf:
                r5 = r4
            L_0x00d0:
                r1.f41842g = r5
                int[] r0 = r12.mo14231n(r11)
                int r1 = r0.length
                r5 = 0
                if (r1 != r2) goto L_0x00e4
                wk1.e$d r1 = r10.f41835a
                r6 = r0[r5]
                r1.f41843h = r6
                r6 = r0[r3]
                r1.f41844i = r6
            L_0x00e4:
                r1 = 18
                r6 = 13
                if (r6 > r11) goto L_0x00ee
                if (r11 >= r1) goto L_0x00ee
                r6 = 1
                goto L_0x00ef
            L_0x00ee:
                r6 = 0
            L_0x00ef:
                if (r6 == 0) goto L_0x00f2
                goto L_0x00fe
            L_0x00f2:
                if (r1 > r11) goto L_0x00fb
                r1 = 2147483647(0x7fffffff, float:NaN)
                if (r11 > r1) goto L_0x00fb
                r1 = 1
                goto L_0x00fc
            L_0x00fb:
                r1 = 0
            L_0x00fc:
                if (r1 == 0) goto L_0x0102
            L_0x00fe:
                r1 = 2131232602(0x7f08075a, float:1.8081318E38)
                goto L_0x0103
            L_0x0102:
                r1 = 0
            L_0x0103:
                wk1.e$d r6 = r10.f41835a
                if (r1 == 0) goto L_0x0116
                android.graphics.drawable.BitmapDrawable r4 = new android.graphics.drawable.BitmapDrawable
                android.content.res.Resources r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getResources()
                wk1.e$c r8 = wk1.C15426e.f41832e
                android.graphics.Bitmap r1 = r8.mo14237b(r1)
                r4.<init>(r7, r1)
            L_0x0116:
                r6.f41845j = r4
                wk1.e$d r1 = r10.f41835a
                android.graphics.drawable.Drawable r1 = r1.f41845j
                if (r1 == 0) goto L_0x0180
                int r0 = r0.length
                if (r0 != r2) goto L_0x0180
                wk1.n r0 = wk1.C15440n.f41895a
                int r1 = r0.mo14259h()
                int r4 = r0.mo14255d()
                rx3.g r6 = wk1.C15440n.f41911q
                rx3.n r6 = (rx3.C36570n) r6
                java.lang.Object r6 = r6.getValue()
                java.lang.Number r6 = (java.lang.Number) r6
                int r6 = r6.intValue()
                int r0 = r0.mo14256e()
                rx3.g r7 = wk1.C15440n.f41907m
                rx3.n r7 = (rx3.C36570n) r7
                java.lang.Object r7 = r7.getValue()
                java.lang.Number r7 = (java.lang.Number) r7
                int r7 = r7.intValue()
                rx3.g r8 = wk1.C15440n.f41901g
                rx3.n r8 = (rx3.C36570n) r8
                java.lang.Object r8 = r8.getValue()
                java.lang.Number r8 = (java.lang.Number) r8
                int r8 = r8.intValue()
                wk1.y r9 = r12.f41831b
                int r9 = r9.ordinal()
                if (r9 == 0) goto L_0x016f
                int[] r1 = new int[r2]
                if (r9 == r2) goto L_0x016a
                r1[r5] = r0
                r1[r3] = r6
                goto L_0x0176
            L_0x016a:
                r1[r5] = r8
                r1[r3] = r7
                goto L_0x0176
            L_0x016f:
                int[] r0 = new int[r2]
                r0[r5] = r4
                r0[r3] = r1
                r1 = r0
            L_0x0176:
                wk1.e$d r0 = r10.f41835a
                r2 = r1[r5]
                r0.f41846k = r2
                r1 = r1[r3]
                r0.f41847l = r1
            L_0x0180:
                wk1.e$d r0 = r10.f41835a
                int r1 = r12.mo14229l(r11)
                r0.f41849n = r1
                wk1.e$d r0 = r10.f41835a
                int r11 = r12.mo14228k(r11)
                r0.f41848m = r11
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: wk1.C15426e.C15427a.mo14235b(int, wk1.d):wk1.e$a");
        }

        /* renamed from: c */
        public final C15427a mo14236c(String str) {
            if (!(str == null || str.length() == 0)) {
                try {
                    this.f41835a.f41848m = Color.parseColor(str);
                } catch (Exception e) {
                    this.f41835a.f41848m = 0;
                    Log.m105920e("FinderLiveFansSpan", e + ",serverColor:" + str);
                }
            }
            return this;
        }
    }

    /* renamed from: wk1.e$b */
    public static final class C15428b implements C89928a {
        /* renamed from: a */
        public void mo391a(int i) {
            C15429c.m14406a(C15426e.f41832e, "systemTrim");
        }

        /* renamed from: b */
        public void mo392b() {
            C15429c.m14406a(C15426e.f41832e, "backgroundTrim");
        }
    }

    /* renamed from: wk1.e$c */
    public static final class C15429c {
        public C15429c(C8480h hVar) {
        }

        /* renamed from: a */
        public static final void m14406a(C15429c cVar, String str) {
            cVar.getClass();
            try {
                LruCache<Integer, Bitmap> lruCache = C15426e.f41833f;
                int size = lruCache.size();
                C62042e eVar = C62042e.f176370a;
                eVar.mo86998D1("FinderLiveFansSpan", str + " cache Size:" + size);
                if (size > 0) {
                    lruCache.evictAll();
                }
            } catch (Exception e) {
                C58739j4.f168176a.mo83712h0(e, "FinderLiveFansSpan-memoryTrim");
            }
        }

        /* renamed from: b */
        public final Bitmap mo14237b(int i) {
            LruCache lruCache = C15426e.f41833f;
            Object obj = lruCache.get(Integer.valueOf(i));
            if (obj == null) {
                synchronized (lruCache) {
                    obj = lruCache.get(Integer.valueOf(i));
                    if (obj == null) {
                        obj = BitmapUtil.getBitmapNative(i);
                        lruCache.put(Integer.valueOf(i), obj);
                        Log.m105924i("FinderLiveFansSpan", "getFansIcon resId:" + i);
                    }
                    C13598b0 b0Var = C13598b0.f38549a;
                }
            }
            C87412m.m108593f(obj, "icon");
            return (Bitmap) obj;
        }
    }

    /* renamed from: wk1.e$d */
    public static final class C15430d {

        /* renamed from: a */
        public String f41836a;

        /* renamed from: b */
        public int f41837b;

        /* renamed from: c */
        public int f41838c;

        /* renamed from: d */
        public String f41839d;

        /* renamed from: e */
        public int f41840e;

        /* renamed from: f */
        public int f41841f;

        /* renamed from: g */
        public Drawable f41842g;

        /* renamed from: h */
        public int f41843h;

        /* renamed from: i */
        public int f41844i;

        /* renamed from: j */
        public Drawable f41845j;

        /* renamed from: k */
        public int f41846k;

        /* renamed from: l */
        public int f41847l;

        /* renamed from: m */
        public int f41848m;

        /* renamed from: n */
        public int f41849n;

        /* renamed from: o */
        public int f41850o;

        /* renamed from: p */
        public int f41851p;

        /* renamed from: q */
        public final int f41852q;

        public C15430d() {
            this((String) null, 0, 0, (String) null, 0, 0, (Drawable) null, 0, 0, (Drawable) null, 0, 0, 0, 0, 0, 0, 65535, (C8480h) null);
        }

        public C15430d(String str, int i, int i2, String str2, int i3, int i4, Drawable drawable, int i5, int i6, Drawable drawable2, int i7, int i8, int i9, int i15, int i16, int i17, int i18, C8480h hVar) {
            int i19 = i18;
            String str3 = "";
            String str4 = (i19 & 1) != 0 ? str3 : str;
            int color = (i19 & 2) != 0 ? MMApplicationContext.getContext().getResources().getColor(C0966R.color.f2975b6) : i;
            int d = (i19 & 4) != 0 ? C15440n.f41895a.mo14255d() : i2;
            str3 = (i19 & 8) == 0 ? str2 : str3;
            int color2 = (i19 & 16) != 0 ? MMApplicationContext.getContext().getResources().getColor(C0966R.color.f2975b6) : i3;
            int e = (i19 & 32) != 0 ? C15440n.f41895a.mo14256e() : i4;
            Drawable drawable3 = null;
            Drawable drawable4 = (i19 & 64) != 0 ? null : drawable;
            int h = (i19 & 128) != 0 ? C15440n.f41895a.mo14259h() : i5;
            int h2 = (i19 & 256) != 0 ? C15440n.f41895a.mo14259h() : i6;
            drawable3 = (i19 & 512) == 0 ? drawable2 : drawable3;
            int d2 = (i19 & 1024) != 0 ? C15440n.f41895a.mo14255d() : i7;
            int h3 = (i19 & 2048) != 0 ? C15440n.f41895a.mo14259h() : i8;
            int color3 = (i19 & 4096) != 0 ? MMApplicationContext.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_3) : i9;
            int g = (i19 & 8192) != 0 ? C15440n.f41895a.mo14258g() : i15;
            int j = (i19 & 16384) != 0 ? C15440n.f41895a.mo14261j() : i16;
            int j2 = (i19 & 32768) != 0 ? C15440n.f41895a.mo14261j() : i17;
            C87412m.m108594g(str4, FirebaseAnalytics.C113379b.LEVEL);
            C87412m.m108594g(str3, "fansName");
            this.f41836a = str4;
            this.f41837b = color;
            this.f41838c = d;
            this.f41839d = str3;
            this.f41840e = color2;
            this.f41841f = e;
            this.f41842g = drawable4;
            this.f41843h = h;
            this.f41844i = h2;
            this.f41845j = drawable3;
            this.f41846k = d2;
            this.f41847l = h3;
            this.f41848m = color3;
            this.f41849n = g;
            this.f41850o = j;
            this.f41851p = j2;
            this.f41852q = MMApplicationContext.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3766df);
        }

        /* renamed from: a */
        public final int mo14238a() {
            return (int) (((float) (this.f41842g == null ? this.f41852q : this.f41843h)) + C15440n.f41895a.mo14266o(this.f41839d, (float) this.f41841f) + ((float) (this.f41845j == null ? this.f41852q : this.f41846k)));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C15430d)) {
                return false;
            }
            C15430d dVar = (C15430d) obj;
            return C87412m.m108589b(this.f41836a, dVar.f41836a) && this.f41837b == dVar.f41837b && this.f41838c == dVar.f41838c && C87412m.m108589b(this.f41839d, dVar.f41839d) && this.f41840e == dVar.f41840e && this.f41841f == dVar.f41841f && C87412m.m108589b(this.f41842g, dVar.f41842g) && this.f41843h == dVar.f41843h && this.f41844i == dVar.f41844i && C87412m.m108589b(this.f41845j, dVar.f41845j) && this.f41846k == dVar.f41846k && this.f41847l == dVar.f41847l && this.f41848m == dVar.f41848m && this.f41849n == dVar.f41849n && this.f41850o == dVar.f41850o && this.f41851p == dVar.f41851p;
        }

        public int hashCode() {
            int hashCode = ((((((((((this.f41836a.hashCode() * 31) + this.f41837b) * 31) + this.f41838c) * 31) + this.f41839d.hashCode()) * 31) + this.f41840e) * 31) + this.f41841f) * 31;
            Drawable drawable = this.f41842g;
            int i = 0;
            int hashCode2 = (((((hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31) + this.f41843h) * 31) + this.f41844i) * 31;
            Drawable drawable2 = this.f41845j;
            if (drawable2 != null) {
                i = drawable2.hashCode();
            }
            return ((((((((((((hashCode2 + i) * 31) + this.f41846k) * 31) + this.f41847l) * 31) + this.f41848m) * 31) + this.f41849n) * 31) + this.f41850o) * 31) + this.f41851p;
        }

        public String toString() {
            return "FinderLiveFansSpanParams(level=" + this.f41836a + ", levelColor=" + this.f41837b + ", levelSize=" + this.f41838c + ", fansName=" + this.f41839d + ", fansNameColor=" + this.f41840e + ", fansNameSize=" + this.f41841f + ", leftIcon=" + this.f41842g + ", leftIconWidth=" + this.f41843h + ", leftIconHeight=" + this.f41844i + ", rightIcon=" + this.f41845j + ", rightIconWidth=" + this.f41846k + ", rightIconHeight=" + this.f41847l + ", bgColor=" + this.f41848m + ", bgHeight=" + this.f41849n + ", leftMargin=" + this.f41850o + ", rightMargin=" + this.f41851p + ')';
        }
    }

    static {
        Log.m105924i("FinderLiveFansSpan", "initMemoryTrim");
        C89931d.f258426c.mo124253c(new C15428b());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15426e(Drawable drawable) {
        super(drawable);
        C87412m.m108594g(drawable, "drawable");
    }

    /* renamed from: a */
    public int mo14226a() {
        C15430d dVar = this.f41834d;
        return dVar.mo14238a() + dVar.f41850o + dVar.f41851p;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Canvas canvas2 = canvas;
        Paint paint2 = paint;
        C87412m.m108594g(canvas2, "canvas");
        C87412m.m108594g(paint2, "paint");
        int color = paint.getColor();
        float textSize = paint.getTextSize();
        int i6 = i5 - i3;
        C15430d dVar = this.f41834d;
        float f2 = f + ((float) dVar.f41850o);
        paint2.setColor(dVar.f41848m);
        int i7 = this.f41834d.f41849n;
        float f3 = (float) (i3 + (i6 > i7 ? (i6 - i7) / 2 : 0));
        canvas2.drawRoundRect(new RectF(f2, f3, ((float) this.f41834d.mo14238a()) + f2, ((float) i7) + f3), 45.0f, 45.0f, paint2);
        C15430d dVar2 = this.f41834d;
        Drawable drawable = dVar2.f41842g;
        if (drawable != null) {
            int i8 = i3 + ((i6 - dVar2.f41844i) / 2);
            C15430d dVar3 = this.f41834d;
            drawable.setBounds(new Rect((int) f2, i8, (int) (((float) dVar3.f41843h) + f2), dVar3.f41844i + i8));
            drawable.draw(canvas2);
        }
        C85875k4.m106189j0(paint2, 0.8f);
        paint2.setColor(this.f41834d.f41837b);
        paint2.setTextSize((float) this.f41834d.f41838c);
        float f4 = (float) 2;
        float abs = (Math.abs(paint.ascent() + paint.descent()) / f4) + ((float) (i6 / 2));
        String str = this.f41834d.f41836a;
        float measureText = paint2.measureText(str, 0, str.length());
        C15430d dVar4 = this.f41834d;
        float f5 = (float) dVar4.f41843h;
        canvas2.drawText(dVar4.f41836a, (f5 > measureText ? (f5 - measureText) / f4 : 0.0f) + f2, abs, paint2);
        C85875k4.m106193l0(paint);
        C85875k4.m106189j0(paint2, 0.8f);
        paint2.setColor(this.f41834d.f41840e);
        paint2.setTextSize((float) this.f41834d.f41841f);
        int i9 = this.f41834d.f41849n;
        int i15 = i6 > i9 ? (i6 - i9) / 2 : 0;
        float abs2 = Math.abs(paint.ascent() + paint.descent()) / f4;
        C15430d dVar5 = this.f41834d;
        canvas2.drawText(dVar5.f41839d, ((float) (dVar5.f41843h + 1)) + f2, abs2 + ((float) (dVar5.f41849n / 2)) + ((float) i15), paint2);
        C85875k4.m106193l0(paint);
        C15430d dVar6 = this.f41834d;
        Drawable drawable2 = dVar6.f41845j;
        if (drawable2 != null) {
            paint2.setTextSize((float) dVar6.f41841f);
            String str2 = this.f41834d.f41839d;
            float measureText2 = paint2.measureText(str2, 0, str2.length());
            C15430d dVar7 = this.f41834d;
            float f6 = f2 + ((float) dVar7.f41843h) + ((float) 1) + measureText2;
            int i16 = i3 + ((i6 - dVar7.f41847l) / 2);
            C15430d dVar8 = this.f41834d;
            drawable2.setBounds(new Rect((int) f6, i16, (int) (f6 + ((float) dVar8.f41846k)), dVar8.f41847l + i16));
            drawable2.draw(canvas2);
        }
        paint2.setColor(color);
        paint2.setTextSize(textSize);
    }
}
