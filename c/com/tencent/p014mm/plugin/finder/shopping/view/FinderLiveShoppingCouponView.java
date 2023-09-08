package com.tencent.p014mm.plugin.finder.shopping.view;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58739j4;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import kotlin.Metadata;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sk1.C13696v;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001)B\u001d\b\u0007\u0012\u0006\u0010$\u001a\u00020#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(R\u001b\u0010\u0007\u001a\u00020\u00028BX\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R#\u0010\r\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\fR#\u0010\u0010\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\fR#\u0010\u0013\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\fR#\u0010\u0016\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\fR#\u0010\u0019\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\fR.\u0010\"\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006*"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingCouponView;", "Landroid/widget/FrameLayout;", "", "e", "Lrx3/g;", "getDescSize", "()F", "descSize", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "f", "getDiscount", "()Landroid/widget/TextView;", "discount", "g", "getDiscountDesc", "discountDesc", "h", "getTitle", "title", "i", "getRemain", "remain", "j", "getDesc", "desc", "Lcom/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingCouponView$a;", "value", "o", "Lcom/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingCouponView$a;", "getCallback", "()Lcom/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingCouponView$a;", "setCallback", "(Lcom/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingCouponView$a;)V", "callback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingCouponView */
public final class FinderLiveShoppingCouponView extends FrameLayout {

    /* renamed from: d */
    public final View f16687d;

    /* renamed from: e */
    public final C13601g f16688e;

    /* renamed from: f */
    public final C13601g f16689f = C36568h.m40985a(new C3613e(this));

    /* renamed from: g */
    public final C13601g f16690g = C36568h.m40985a(new C3614f(this));

    /* renamed from: h */
    public final C13601g f16691h;

    /* renamed from: i */
    public final C13601g f16692i;

    /* renamed from: j */
    public final C13601g f16693j;

    /* renamed from: n */
    public C13696v f16694n;

    /* renamed from: o */
    public C3609a f16695o;

    /* renamed from: com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingCouponView$a */
    public interface C3609a {
        /* renamed from: a */
        void mo4000a(C13696v vVar, FinderLiveShoppingCouponView finderLiveShoppingCouponView);
    }

    /* renamed from: com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingCouponView$b */
    public static final class C3610b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveShoppingCouponView f16696d;

        public C3610b(FinderLiveShoppingCouponView finderLiveShoppingCouponView) {
            this.f16696d = finderLiveShoppingCouponView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingCouponView$callback$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (C58739j4.f168176a.mo83683L()) {
                Log.m105920e("MicroMsg.FinderLiveShoppingCouponView", "coupon action clicked too fast!");
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingCouponView$callback$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            Log.m105924i("MicroMsg.FinderLiveShoppingCouponView", "coupon action clicked: " + this.f16696d.f16694n);
            C3609a callback = this.f16696d.getCallback();
            if (callback != null) {
                C13696v vVar = this.f16696d.f16694n;
                C87412m.m108591d(vVar);
                callback.mo4000a(vVar, this.f16696d);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingCouponView$callback$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingCouponView$c */
    public static final class C3611c extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveShoppingCouponView f16697d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3611c(FinderLiveShoppingCouponView finderLiveShoppingCouponView) {
            super(0);
            this.f16697d = finderLiveShoppingCouponView;
        }

        public Object invoke() {
            TextView textView = (TextView) this.f16697d.findViewById(C0966R.C0970id.f357845c22);
            textView.setTextSize(1, this.f16697d.getDescSize());
            return textView;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingCouponView$d */
    public static final class C3612d extends C87413o implements C32224a<Float> {

        /* renamed from: d */
        public final /* synthetic */ Context f16698d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3612d(Context context) {
            super(0);
            this.f16698d = context;
        }

        public Object invoke() {
            Context context = this.f16698d;
            C87412m.m108594g(context, "context");
            Object systemService = context.getSystemService("window");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            if (defaultDisplay != null) {
                defaultDisplay.getMetrics(displayMetrics);
            }
            return Float.valueOf((displayMetrics.density * 12.0f) / context.getResources().getDisplayMetrics().density);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingCouponView$e */
    public static final class C3613e extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveShoppingCouponView f16699d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3613e(FinderLiveShoppingCouponView finderLiveShoppingCouponView) {
            super(0);
            this.f16699d = finderLiveShoppingCouponView;
        }

        public Object invoke() {
            TextView textView = (TextView) this.f16699d.findViewById(C0966R.C0970id.c7_);
            C58739j4 j4Var = C58739j4.f168176a;
            C87412m.m108593f(textView, "this");
            j4Var.mo83703c0(textView, true);
            return textView;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingCouponView$f */
    public static final class C3614f extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveShoppingCouponView f16700d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3614f(FinderLiveShoppingCouponView finderLiveShoppingCouponView) {
            super(0);
            this.f16700d = finderLiveShoppingCouponView;
        }

        public Object invoke() {
            TextView textView = (TextView) this.f16700d.findViewById(C0966R.C0970id.c7a);
            C58739j4 j4Var = C58739j4.f168176a;
            C87412m.m108593f(textView, "this");
            j4Var.mo83703c0(textView, false);
            return textView;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingCouponView$g */
    public static final class C3615g extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveShoppingCouponView f16701d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3615g(FinderLiveShoppingCouponView finderLiveShoppingCouponView) {
            super(0);
            this.f16701d = finderLiveShoppingCouponView;
        }

        public Object invoke() {
            TextView textView = (TextView) this.f16701d.findViewById(C0966R.C0970id.ikw);
            textView.setTextSize(1, this.f16701d.getDescSize());
            return textView;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingCouponView$h */
    public static final class C3616h extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveShoppingCouponView f16702d;

        /* renamed from: e */
        public final /* synthetic */ Context f16703e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3616h(FinderLiveShoppingCouponView finderLiveShoppingCouponView, Context context) {
            super(0);
            this.f16702d = finderLiveShoppingCouponView;
            this.f16703e = context;
        }

        public Object invoke() {
            View findViewById = this.f16702d.findViewById(C0966R.C0970id.knx);
            Context context = this.f16703e;
            TextView textView = (TextView) findViewById;
            C87412m.m108594g(context, "context");
            Object systemService = context.getSystemService("window");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            if (defaultDisplay != null) {
                defaultDisplay.getMetrics(displayMetrics);
            }
            textView.setTextSize(1, (displayMetrics.density * 14.0f) / context.getResources().getDisplayMetrics().density);
            return textView;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveShoppingCouponView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.ajt, this, false);
        this.f16687d = inflate;
        this.f16688e = C36568h.m40985a(new C3612d(context));
        addView(inflate, -1, -1);
        this.f16691h = C36568h.m40985a(new C3616h(this, context));
        this.f16692i = C36568h.m40985a(new C3615g(this));
        this.f16693j = C36568h.m40985a(new C3611c(this));
    }

    private final TextView getDesc() {
        return (TextView) ((C36570n) this.f16693j).getValue();
    }

    /* access modifiers changed from: private */
    public final float getDescSize() {
        return ((Number) ((C36570n) this.f16688e).getValue()).floatValue();
    }

    private final TextView getDiscount() {
        return (TextView) ((C36570n) this.f16689f).getValue();
    }

    private final TextView getDiscountDesc() {
        return (TextView) ((C36570n) this.f16690g).getValue();
    }

    private final TextView getRemain() {
        return (TextView) ((C36570n) this.f16692i).getValue();
    }

    private final TextView getTitle() {
        return (TextView) ((C36570n) this.f16691h).getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0204  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3995b(sk1.C13696v r17, boolean r18, boolean r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.lang.String r2 = "item"
            gy3.C87412m.m108594g(r1, r2)
            r0.f16694n = r1
            android.widget.TextView r2 = r16.getDiscountDesc()
            r3 = 8
            r4 = 0
            if (r18 == 0) goto L_0x0016
            r5 = 0
            goto L_0x0018
        L_0x0016:
            r5 = 8
        L_0x0018:
            r2.setVisibility(r5)
            int r2 = r1.f38764v
            r5 = 4
            java.lang.String r6 = "format(format, *args)"
            r7 = 1
            if (r2 == r7) goto L_0x0090
            r8 = 2
            if (r2 == r8) goto L_0x003f
            r8 = 3
            if (r2 == r8) goto L_0x0090
            if (r2 == r5) goto L_0x0090
            r8 = 5
            if (r2 == r8) goto L_0x0030
            goto L_0x00b8
        L_0x0030:
            android.widget.TextView r2 = r16.getDiscount()
            java.lang.String r8 = r1.f38765w
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r2.setText(r8)
            goto L_0x00b8
        L_0x003f:
            android.content.Context r2 = r16.getContext()
            r8 = 2131828791(0x7f112037, float:1.9290533E38)
            java.lang.String r2 = kg3.C76577a.m92166q(r2, r8)
            java.lang.String r8 = "getString(context, com.t…g_coupon_discount_subfix)"
            gy3.C87412m.m108593f(r2, r8)
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.String r9 = r1.f38765w
            r8[r4] = r9
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r7)
            java.lang.String r2 = java.lang.String.format(r2, r8)
            gy3.C87412m.m108593f(r2, r6)
            android.text.SpannableString r8 = new android.text.SpannableString
            r8.<init>(r2)
            android.text.style.AbsoluteSizeSpan r9 = new android.text.style.AbsoluteSizeSpan
            android.content.Context r10 = r16.getContext()
            r11 = 2131165645(0x7f0701cd, float:1.7945513E38)
            int r10 = kg3.C76577a.m92155f(r10, r11)
            r9.<init>(r10)
            java.lang.String r10 = r1.f38765w
            if (r10 == 0) goto L_0x007e
            int r10 = r10.length()
            goto L_0x007f
        L_0x007e:
            r10 = 0
        L_0x007f:
            int r2 = r2.length()
            r11 = 18
            r8.setSpan(r9, r10, r2, r11)
            android.widget.TextView r2 = r16.getDiscount()
            r2.setText(r8)
            goto L_0x00b8
        L_0x0090:
            android.widget.TextView r2 = r16.getDiscount()
            android.content.Context r8 = r16.getContext()
            r9 = 2131828795(0x7f11203b, float:1.929054E38)
            java.lang.String r8 = kg3.C76577a.m92166q(r8, r9)
            java.lang.String r9 = "getString(context, com.t…ping_coupon_money_prefix)"
            gy3.C87412m.m108593f(r8, r9)
            java.lang.Object[] r9 = new java.lang.Object[r7]
            java.lang.String r10 = r1.f38765w
            r9[r4] = r10
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r7)
            java.lang.String r8 = java.lang.String.format(r8, r9)
            gy3.C87412m.m108593f(r8, r6)
            r2.setText(r8)
        L_0x00b8:
            android.widget.TextView r2 = r16.getDiscountDesc()
            java.lang.String r8 = r1.f38766x
            r2.setText(r8)
            android.widget.TextView r2 = r16.getDiscount()
            java.lang.String r8 = "discount"
            gy3.C87412m.m108593f(r2, r8)
            android.content.Context r8 = r16.getContext()
            r9 = 2131166518(0x7f070536, float:1.7947284E38)
            int r8 = kg3.C76577a.m92155f(r8, r9)
            android.content.Context r10 = r16.getContext()
            if (r18 == 0) goto L_0x00de
            r11 = 1107296256(0x42000000, float:32.0)
            goto L_0x00e0
        L_0x00de:
            r11 = 1104150528(0x41d00000, float:26.0)
        L_0x00e0:
            int r10 = kg3.C76577a.m92150a(r10, r11)
            r0.mo3997d(r2, r8, r10)
            android.widget.TextView r2 = r16.getDiscountDesc()
            java.lang.String r8 = "discountDesc"
            gy3.C87412m.m108593f(r2, r8)
            android.content.Context r8 = r16.getContext()
            int r8 = kg3.C76577a.m92155f(r8, r9)
            android.content.Context r9 = r16.getContext()
            r10 = 12
            int r9 = kg3.C76577a.m92151b(r9, r10)
            r0.mo3997d(r2, r8, r9)
            android.widget.TextView r2 = r16.getTitle()
            if (r18 == 0) goto L_0x010e
            java.lang.String r8 = r1.f38767y
            goto L_0x0110
        L_0x010e:
            java.lang.String r8 = r1.f38757D
        L_0x0110:
            r2.setText(r8)
            if (r18 == 0) goto L_0x017b
            long r2 = r1.f38768z
            java.lang.String r2 = java.lang.String.valueOf(r2)
            android.text.SpannableString r3 = new android.text.SpannableString
            android.content.Context r8 = r16.getContext()
            r9 = 2131828800(0x7f112040, float:1.9290551E38)
            java.lang.String r8 = kg3.C76577a.m92166q(r8, r9)
            java.lang.String r9 = "getString(context, R.str…e_shopping_coupon_remain)"
            gy3.C87412m.m108593f(r8, r9)
            java.lang.Object[] r9 = new java.lang.Object[r7]
            r9[r4] = r2
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r7)
            java.lang.String r8 = java.lang.String.format(r8, r9)
            gy3.C87412m.m108593f(r8, r6)
            r3.<init>(r8)
            r10 = 0
            r11 = 0
            r12 = 6
            r13 = 0
            r8 = r3
            r9 = r2
            int r6 = z04.C112550d0.m153769E(r8, r9, r10, r11, r12, r13)
            android.text.style.ForegroundColorSpan r8 = new android.text.style.ForegroundColorSpan
            android.content.Context r9 = r16.getContext()
            r10 = 2131100709(0x7f060425, float:1.7813807E38)
            int r9 = kg3.C76577a.m92153d(r9, r10)
            r8.<init>(r9)
            int r2 = r2.length()
            int r2 = r2 + r6
            r9 = 33
            r3.setSpan(r8, r6, r2, r9)
            android.widget.TextView r2 = r16.getRemain()
            r2.setText(r3)
            android.widget.TextView r2 = r16.getRemain()
            r2.setVisibility(r4)
            android.widget.TextView r2 = r16.getDesc()
            java.lang.String r3 = r1.f38754A
            r2.setText(r3)
            goto L_0x018b
        L_0x017b:
            android.widget.TextView r2 = r16.getRemain()
            r2.setVisibility(r3)
            android.widget.TextView r2 = r16.getDesc()
            java.lang.String r3 = r1.f38756C
            r2.setText(r3)
        L_0x018b:
            r2 = 2131296446(0x7f0900be, float:1.8210809E38)
            android.view.View r2 = r0.findViewById(r2)
            if (r19 == 0) goto L_0x0195
            goto L_0x0196
        L_0x0195:
            r5 = 0
        L_0x0196:
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3.mo10233c(r5)
            java.lang.Object[] r9 = r3.mo10232b()
            java.lang.String r10 = "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingCouponView"
            java.lang.String r11 = "fillWithCouponItem"
            java.lang.String r12 = "(Lcom/tencent/mm/plugin/finder/live/view/convert/ShopWindowCouponItem;ZZ)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            r8 = r2
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r9 = "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingCouponView"
            java.lang.String r10 = "fillWithCouponItem"
            java.lang.String r11 = "(Lcom/tencent/mm/plugin/finder/live/view/convert/ShopWindowCouponItem;ZZ)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
            if (r18 == 0) goto L_0x0204
            boolean r1 = r1.f38758E
            if (r1 == 0) goto L_0x01f0
            android.content.Context r1 = r16.getContext()
            r2 = 2131828782(0x7f11202e, float:1.9290515E38)
            java.lang.String r1 = r1.getString(r2)
            java.lang.String r2 = "context.getString(R.stri…g_coupon_anchor_end_send)"
            gy3.C87412m.m108593f(r1, r2)
            r0.mo3996c(r1, r7, r4)
            goto L_0x0215
        L_0x01f0:
            android.content.Context r1 = r16.getContext()
            r2 = 2131828784(0x7f112030, float:1.9290519E38)
            java.lang.String r1 = r1.getString(r2)
            java.lang.String r2 = "context.getString(R.stri…pping_coupon_anchor_send)"
            gy3.C87412m.m108593f(r1, r2)
            r0.mo3996c(r1, r7, r7)
            goto L_0x0215
        L_0x0204:
            te3.uk1 r2 = r1.f38761s
            int r2 = r2.f142892B
            if (r2 != 0) goto L_0x0210
            java.lang.String r1 = r1.f38760G
            r0.mo3996c(r1, r4, r4)
            goto L_0x0215
        L_0x0210:
            java.lang.String r1 = r1.f38760G
            r0.mo3996c(r1, r7, r7)
        L_0x0215:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShoppingCouponView.mo3995b(sk1.v, boolean, boolean):void");
    }

    /* renamed from: c */
    public final void mo3996c(String str, boolean z, boolean z2) {
        TextView textView = (TextView) findViewById(C0966R.C0970id.f5393dy);
        textView.setText(str);
        textView.setEnabled(z);
        if (!z) {
            textView.setTextColor(textView.getContext().getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_1));
            textView.setBackgroundResource(C0966R.C0969drawable.a1z);
        } else if (z2) {
            textView.setTextColor(textView.getContext().getResources().getColor(C0966R.color.f2975b6));
            textView.setBackgroundResource(C0966R.C0969drawable.f357186b92);
        } else {
            textView.setTextColor(textView.getContext().getResources().getColor(C0966R.color.f3445zo));
            textView.setBackgroundResource(C0966R.C0969drawable.a1z);
        }
    }

    /* renamed from: d */
    public final void mo3997d(TextView textView, int i, int i2) {
        CharSequence text = textView.getText();
        Paint paint = new Paint();
        paint.setTypeface(textView.getTypeface());
        paint.setTextSize((float) i2);
        while (paint.measureText(text.toString()) > ((float) i)) {
            paint.setTextSize(paint.getTextSize() - ((float) C76577a.m92150a(getContext(), 0.5f)));
        }
        textView.setTextSize(0, paint.getTextSize());
    }

    public final C3609a getCallback() {
        return this.f16695o;
    }

    public final void setCallback(C3609a aVar) {
        this.f16695o = aVar;
        findViewById(C0966R.C0970id.f5393dy).setOnClickListener(new C3610b(this));
    }
}
