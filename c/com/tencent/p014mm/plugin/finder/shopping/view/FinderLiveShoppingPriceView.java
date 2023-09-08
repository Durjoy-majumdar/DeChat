package com.tencent.p014mm.plugin.finder.shopping.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import er1.C58739j4;
import er1.C7919x;
import gy3.C8480h;
import gy3.C87412m;
import kg3.C76577a;
import kotlin.Metadata;
import sk1.C63965x;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingPriceView;", "Landroid/widget/FrameLayout;", "Landroid/widget/TextView;", "i", "Landroid/widget/TextView;", "getSellPrice", "()Landroid/widget/TextView;", "sellPrice", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "b", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPriceView */
public final class FinderLiveShoppingPriceView extends FrameLayout {

    /* renamed from: j */
    public static final C3617a f160994j = new C3617a((C8480h) null);

    /* renamed from: n */
    public static final float f160995n;

    /* renamed from: o */
    public static final int f160996o = MMApplicationContext.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3703bv);

    /* renamed from: p */
    public static final C56321b f160997p;

    /* renamed from: q */
    public static final C56321b f160998q;

    /* renamed from: d */
    public final ViewGroup f160999d;

    /* renamed from: e */
    public final TextView f161000e;

    /* renamed from: f */
    public final ViewGroup f161001f;

    /* renamed from: g */
    public final TextView f161002g;

    /* renamed from: h */
    public final TextView f161003h;

    /* renamed from: i */
    public final TextView f161004i;

    /* renamed from: com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPriceView$a */
    public static final class C3617a {
        public C3617a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo4002a(TextView textView, int i, int i2) {
            C87412m.m108594g(textView, "priceTv");
            textView.setText(MMApplicationContext.getContext().getResources().getString(C0966R.string.e88, new Object[]{C58739j4.f168176a.mo83699a0(i2)}));
            if (i2 > i || i2 < 0) {
                Log.m105924i("Finder.LiveShoppingListAdapter", "invalid price,min:" + i2 + ",max:" + i);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPriceView$b */
    public static final class C56321b {

        /* renamed from: a */
        public final float f161005a;

        /* renamed from: b */
        public final float f161006b;

        /* renamed from: c */
        public boolean f161007c;

        /* renamed from: d */
        public boolean f161008d;

        /* renamed from: e */
        public final float f161009e;

        /* renamed from: f */
        public boolean f161010f;

        /* renamed from: g */
        public final float f161011g;

        /* renamed from: h */
        public boolean f161012h;

        public C56321b(float f, float f2, boolean z, boolean z2, float f3, boolean z3, float f4, boolean z4) {
            this.f161005a = f;
            this.f161006b = f2;
            this.f161007c = z;
            this.f161008d = z2;
            this.f161009e = f3;
            this.f161010f = z3;
            this.f161011g = f4;
            this.f161012h = z4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C56321b)) {
                return false;
            }
            C56321b bVar = (C56321b) obj;
            return C87412m.m108589b(Float.valueOf(this.f161005a), Float.valueOf(bVar.f161005a)) && C87412m.m108589b(Float.valueOf(this.f161006b), Float.valueOf(bVar.f161006b)) && this.f161007c == bVar.f161007c && this.f161008d == bVar.f161008d && C87412m.m108589b(Float.valueOf(this.f161009e), Float.valueOf(bVar.f161009e)) && this.f161010f == bVar.f161010f && C87412m.m108589b(Float.valueOf(this.f161011g), Float.valueOf(bVar.f161011g)) && this.f161012h == bVar.f161012h;
        }

        public int hashCode() {
            int floatToIntBits = ((Float.floatToIntBits(this.f161005a) * 31) + Float.floatToIntBits(this.f161006b)) * 31;
            boolean z = this.f161007c;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (floatToIntBits + (z ? 1 : 0)) * 31;
            boolean z3 = this.f161008d;
            if (z3) {
                z3 = true;
            }
            int floatToIntBits2 = (((i + (z3 ? 1 : 0)) * 31) + Float.floatToIntBits(this.f161009e)) * 31;
            boolean z4 = this.f161010f;
            if (z4) {
                z4 = true;
            }
            int floatToIntBits3 = (((floatToIntBits2 + (z4 ? 1 : 0)) * 31) + Float.floatToIntBits(this.f161011g)) * 31;
            boolean z5 = this.f161012h;
            if (!z5) {
                z2 = z5;
            }
            return floatToIntBits3 + (z2 ? 1 : 0);
        }

        public String toString() {
            return "Config(sellPriceSizePx=" + this.f161005a + ", sellWordingSizePx=" + this.f161006b + ", showSellWording=" + this.f161007c + ", showSellWordingBg=" + this.f161008d + ", marketPriceSizePx=" + this.f161009e + ", showMarketPrice=" + this.f161010f + ", maxWidth=" + this.f161011g + ", showBeginPrice=" + this.f161012h + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C56321b(float f, float f2, boolean z, boolean z2, float f3, boolean z3, float f4, boolean z4, int i, C8480h hVar) {
            this(f, f2, z, z2, f3, z3, f4, (i & 128) != 0 ? false : z4);
        }
    }

    static {
        float a = (float) C76577a.m92150a(MMApplicationContext.getContext(), 17.0f);
        C76577a.m92150a(MMApplicationContext.getContext(), 17.0f);
        float a2 = (float) C76577a.m92150a(MMApplicationContext.getContext(), 12.0f);
        f160995n = a2;
        C76577a.m92150a(MMApplicationContext.getContext(), 12.0f);
        f160997p = new C56321b(a, a2, true, true, a2, true, (float) C76577a.m92145A(MMApplicationContext.getContext()), false, 128, (C8480h) null);
        f160998q = new C56321b(a2, 0.0f, false, false, 0.0f, false, (float) C76577a.m92145A(MMApplicationContext.getContext()), false, 128, (C8480h) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveShoppingPriceView(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        addView(LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.f359752ak0, this, false), -2, -2);
        View findViewById = findViewById(C0966R.C0970id.i2f);
        C87412m.m108593f(findViewById, "findViewById(R.id.price_container)");
        this.f160999d = (ViewGroup) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.i3x);
        C87412m.m108593f(findViewById2, "findViewById(R.id.product_price)");
        TextView textView = (TextView) findViewById2;
        this.f161004i = textView;
        View findViewById3 = findViewById(C0966R.C0970id.clw);
        C87412m.m108593f(findViewById3, "findViewById(R.id.exclusive_label)");
        TextView textView2 = (TextView) findViewById3;
        this.f161000e = textView2;
        View findViewById4 = findViewById(C0966R.C0970id.ocg);
        C87412m.m108593f(findViewById4, "findViewById(R.id.exclusive_label_contianer)");
        this.f161001f = (ViewGroup) findViewById4;
        View findViewById5 = findViewById(C0966R.C0970id.hpc);
        C87412m.m108593f(findViewById5, "findViewById(R.id.original_price)");
        TextView textView3 = (TextView) findViewById5;
        this.f161002g = textView3;
        View findViewById6 = findViewById(C0966R.C0970id.oho);
        C87412m.m108593f(findViewById6, "findViewById(R.id.product_price_begin)");
        TextView textView4 = (TextView) findViewById6;
        this.f161003h = textView4;
        C7919x.m8091a(textView4);
        C7919x.m8091a(textView2);
        C58739j4 j4Var = C58739j4.f168176a;
        j4Var.mo83703c0(textView, false);
        j4Var.mo83705d0(textView3);
        textView3.getPaint().setFlags(16);
    }

    /* renamed from: a */
    public final C56321b mo78823a(Context context, C63965x xVar, float f, boolean z, boolean z2, boolean z3, boolean z4, float f2) {
        Context context2 = context;
        C63965x xVar2 = xVar;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(xVar2, "item");
        FinderLiveShoppingPriceView finderLiveShoppingPriceView = new FinderLiveShoppingPriceView(context);
        float f3 = f160995n;
        C56321b bVar = new C56321b(f2, f3, z, z2, f3, z3, f, z4);
        finderLiveShoppingPriceView.mo78824b(0, xVar2, bVar);
        finderLiveShoppingPriceView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        if (((float) finderLiveShoppingPriceView.getMeasuredWidth()) <= f) {
            return bVar;
        }
        if (z3) {
            Log.m105918d("MicroMsg.FinderLiveShoppingPriceView", "get config for item " + xVar2.f181346s.f183177e + ", hide market price");
            return mo78823a(context, xVar, f, z, z2, false, z4, f2);
        } else if (z) {
            Log.m105918d("MicroMsg.FinderLiveShoppingPriceView", "get config for item " + xVar2.f181346s.f183177e + ", hide sell wording");
            return mo78823a(context, xVar, f, false, false, false, z4, f2);
        } else if (f2 > f3) {
            Log.m105918d("MicroMsg.FinderLiveShoppingPriceView", "get config for item " + xVar2.f181346s.f183177e + ", change font");
            return mo78823a(context, xVar, f, false, false, false, z4, f3);
        } else {
            Log.m105918d("MicroMsg.FinderLiveShoppingPriceView", "get config for item " + xVar2.f181346s.f183177e + ", hide begin");
            return new C56321b(f2, 0.0f, bVar.f161007c, bVar.f161008d, 0.0f, bVar.f161010f, f, false);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0155  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo78824b(int r10, sk1.C63965x r11, com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShoppingPriceView.C56321b r12) {
        /*
            r9 = this;
            java.lang.String r0 = "item"
            gy3.C87412m.m108594g(r11, r0)
            java.lang.String r0 = "config"
            gy3.C87412m.m108594g(r12, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r11.f181348u
            r1.append(r2)
            java.lang.String r2 = "(id:"
            r1.append(r2)
            long r2 = r11.f181347t
            r1.append(r2)
            java.lang.String r2 = "),source:"
            r1.append(r2)
            r1.append(r10)
            java.lang.String r10 = ",sellPrice:"
            r1.append(r10)
            int r10 = r11.f181352y
            r1.append(r10)
            java.lang.String r10 = ",wording:"
            r1.append(r10)
            te3.fp1 r10 = r11.f181346s
            java.lang.String r10 = r10.f183167L
            r1.append(r10)
            java.lang.String r10 = ",marketPrice:"
            r1.append(r10)
            int r10 = r11.f181351x
            r1.append(r10)
            java.lang.String r10 = ",config:"
            r1.append(r10)
            r1.append(r12)
            java.lang.String r10 = r1.toString()
            r0.<init>(r10)
            android.widget.TextView r10 = r9.f161004i
            float r1 = r12.f161005a
            r2 = 0
            r10.setTextSize(r2, r1)
            android.widget.TextView r10 = r9.f161000e
            float r1 = r12.f161006b
            r10.setTextSize(r2, r1)
            android.widget.TextView r10 = r9.f161002g
            float r1 = r12.f161009e
            r10.setTextSize(r2, r1)
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPriceView$a r10 = f160994j
            android.widget.TextView r1 = r9.f161004i
            int r3 = r11.f181351x
            int r4 = r11.f181352y
            r10.mo4002a(r1, r3, r4)
            boolean r1 = r12.f161007c
            r3 = 1
            r4 = 0
            r5 = 8
            if (r1 == 0) goto L_0x00c4
            te3.fp1 r1 = r11.f181346s
            java.lang.String r1 = r1.f183167L
            if (r1 == 0) goto L_0x008f
            int r1 = r1.length()
            if (r1 != 0) goto L_0x008d
            goto L_0x008f
        L_0x008d:
            r1 = 0
            goto L_0x0090
        L_0x008f:
            r1 = 1
        L_0x0090:
            if (r1 != 0) goto L_0x00c4
            android.view.ViewGroup r1 = r9.f161001f
            r1.setVisibility(r2)
            android.widget.TextView r1 = r9.f161000e
            te3.fp1 r6 = r11.f181346s
            java.lang.String r6 = r6.f183167L
            r1.setText(r6)
            boolean r1 = r12.f161008d
            if (r1 == 0) goto L_0x00be
            android.view.ViewGroup r1 = r9.f160999d
            int r6 = r1.getPaddingLeft()
            int r7 = f160996o
            android.view.ViewGroup r8 = r9.f160999d
            int r8 = r8.getPaddingRight()
            r1.setPadding(r6, r7, r8, r7)
            android.view.ViewGroup r1 = r9.f160999d
            r6 = 2131232842(0x7f08084a, float:1.8081805E38)
            r1.setBackgroundResource(r6)
            goto L_0x00ce
        L_0x00be:
            android.view.ViewGroup r1 = r9.f160999d
            r1.setBackground(r4)
            goto L_0x00ce
        L_0x00c4:
            android.view.ViewGroup r1 = r9.f160999d
            r1.setBackground(r4)
            android.view.ViewGroup r1 = r9.f161001f
            r1.setVisibility(r5)
        L_0x00ce:
            boolean r1 = r12.f161010f
            if (r1 == 0) goto L_0x012d
            android.widget.TextView r1 = r9.f161002g
            android.text.TextPaint r1 = r1.getPaint()
            r6 = 16
            r1.setFlags(r6)
            android.widget.TextView r1 = r9.f161002g
            r1.setVisibility(r2)
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r1.getClass()
            fj1.b r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159348A
            te3.bs4 r6 = r11.f181343K
            if (r6 == 0) goto L_0x0125
            if (r6 == 0) goto L_0x00f1
            java.lang.String r4 = r6.f131295f
        L_0x00f1:
            if (r4 == 0) goto L_0x00fb
            int r4 = r4.length()
            if (r4 != 0) goto L_0x00fa
            goto L_0x00fb
        L_0x00fa:
            r3 = 0
        L_0x00fb:
            if (r3 != 0) goto L_0x0125
            if (r1 == 0) goto L_0x011f
            ok1.e r10 = ok1.C62042e.f176370a
            boolean r10 = r10.mo87032P0(r1)
            if (r10 == 0) goto L_0x011f
            te3.bs4 r10 = r11.f181343K
            if (r10 == 0) goto L_0x0132
            android.widget.TextView r11 = r9.f161002g
            java.lang.String r1 = "priceTv"
            gy3.C87412m.m108594g(r11, r1)
            android.text.TextPaint r1 = r11.getPaint()
            r1.setFlags(r2)
            java.lang.String r10 = r10.f131295f
            r11.setText(r10)
            goto L_0x0132
        L_0x011f:
            android.widget.TextView r10 = r9.f161002g
            r10.setVisibility(r5)
            goto L_0x0132
        L_0x0125:
            android.widget.TextView r1 = r9.f161002g
            int r11 = r11.f181351x
            r10.mo4002a(r1, r11, r11)
            goto L_0x0132
        L_0x012d:
            android.widget.TextView r10 = r9.f161002g
            r10.setVisibility(r5)
        L_0x0132:
            boolean r10 = r12.f161012h
            if (r10 == 0) goto L_0x013c
            android.widget.TextView r10 = r9.f161003h
            r10.setVisibility(r2)
            goto L_0x0141
        L_0x013c:
            android.widget.TextView r10 = r9.f161003h
            r10.setVisibility(r5)
        L_0x0141:
            er1.j4 r10 = er1.C58739j4.f168176a
            boolean r10 = r10.mo83692U()
            java.lang.String r11 = "MicroMsg.FinderLiveShoppingPriceView"
            if (r10 == 0) goto L_0x0155
            java.lang.String r10 = r0.toString()
            java.lang.Object[] r12 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printInfoStack(r11, r10, r12)
            goto L_0x015c
        L_0x0155:
            java.lang.String r10 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r10)
        L_0x015c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShoppingPriceView.mo78824b(int, sk1.x, com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPriceView$b):void");
    }

    public final TextView getSellPrice() {
        return this.f161004i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveShoppingPriceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        addView(LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.f359752ak0, this, false), -2, -2);
        View findViewById = findViewById(C0966R.C0970id.i2f);
        C87412m.m108593f(findViewById, "findViewById(R.id.price_container)");
        this.f160999d = (ViewGroup) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.i3x);
        C87412m.m108593f(findViewById2, "findViewById(R.id.product_price)");
        TextView textView = (TextView) findViewById2;
        this.f161004i = textView;
        View findViewById3 = findViewById(C0966R.C0970id.clw);
        C87412m.m108593f(findViewById3, "findViewById(R.id.exclusive_label)");
        TextView textView2 = (TextView) findViewById3;
        this.f161000e = textView2;
        View findViewById4 = findViewById(C0966R.C0970id.ocg);
        C87412m.m108593f(findViewById4, "findViewById(R.id.exclusive_label_contianer)");
        this.f161001f = (ViewGroup) findViewById4;
        View findViewById5 = findViewById(C0966R.C0970id.hpc);
        C87412m.m108593f(findViewById5, "findViewById(R.id.original_price)");
        TextView textView3 = (TextView) findViewById5;
        this.f161002g = textView3;
        View findViewById6 = findViewById(C0966R.C0970id.oho);
        C87412m.m108593f(findViewById6, "findViewById(R.id.product_price_begin)");
        TextView textView4 = (TextView) findViewById6;
        this.f161003h = textView4;
        C7919x.m8091a(textView4);
        C7919x.m8091a(textView2);
        C58739j4 j4Var = C58739j4.f168176a;
        j4Var.mo83703c0(textView, false);
        j4Var.mo83705d0(textView3);
        textView3.getPaint().setFlags(16);
    }
}
