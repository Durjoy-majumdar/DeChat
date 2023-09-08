package com.tencent.p014mm.plugin.card.p031ui.p033v3;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.card.p031ui.CardDetailUI;
import com.tencent.p014mm.plugin.card.p031ui.p032v2.CardNewBaseUI;
import com.tencent.p014mm.plugin.card.widget.CardTagTextView;
import com.tencent.p014mm.plugin.card.widget.MemberCardTopCropImageView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import de3.C45336q;
import de3.C75355a0;
import de3.C75359b0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import kz0.C10441b;
import kz0.C117431d;
import kz0.C46823m;
import lz0.C46915a;
import nr3.C89059e;
import o40.C61926c;
import ob0.C89132b;
import qo3.C77407n;
import rx3.C13598b0;
import te3.C118431fo;
import te3.C118435go;
import te3.C22502jn;
import te3.C22514mn;
import te3.C22523py1;
import te3.C49871in;
import te3.C49966ja;
import te3.C50983qn;
import te3.C51163rv3;
import te3.C51997xn;
import tz0.C22562b;
import tz0.C22563c;
import tz0.C22564d;
import tz0.C22566e;
import wd3.C53155r0;
import wz0.C102526o;
import wz0.C22945n;
import wz0.C53246b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/card/ui/v3/CouponCardListUI;", "Lcom/tencent/mm/plugin/card/ui/v2/CardNewBaseUI;", "<init>", "()V", "a", "b", "c", "plugin-card_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.card.ui.v3.CouponCardListUI */
public final class CouponCardListUI extends CardNewBaseUI {

    /* renamed from: L */
    public static final /* synthetic */ int f52123L = 0;

    /* renamed from: A */
    public C51997xn f52124A;

    /* renamed from: B */
    public String f52125B;

    /* renamed from: C */
    public C118435go f52126C;

    /* renamed from: D */
    public String f52127D = "";

    /* renamed from: E */
    public int f52128E;

    /* renamed from: F */
    public int f52129F;

    /* renamed from: G */
    public boolean f52130G;

    /* renamed from: H */
    public int f52131H;

    /* renamed from: I */
    public int f52132I;

    /* renamed from: J */
    public boolean f52133J = true;

    /* renamed from: K */
    public int f52134K;

    /* renamed from: i */
    public final String f52135i = "MicroMsg.CouponCardListUI";

    /* renamed from: j */
    public WxRecyclerView f52136j;

    /* renamed from: n */
    public RefreshLoadMoreLayout f52137n;

    /* renamed from: o */
    public ViewGroup f52138o;

    /* renamed from: p */
    public ViewGroup f52139p;

    /* renamed from: q */
    public TextView f52140q;

    /* renamed from: r */
    public WxRecyclerAdapter<C18653b> f52141r;

    /* renamed from: s */
    public final ArrayList<C18653b> f52142s = new ArrayList<>();

    /* renamed from: t */
    public int f52143t;

    /* renamed from: u */
    public boolean f52144u;

    /* renamed from: v */
    public int f52145v = 10;

    /* renamed from: w */
    public boolean f52146w;

    /* renamed from: x */
    public boolean f52147x;

    /* renamed from: y */
    public String f52148y = "";

    /* renamed from: z */
    public long f52149z;

    /* renamed from: com.tencent.mm.plugin.card.ui.v3.CouponCardListUI$b */
    public final class C18653b implements C9493c {

        /* renamed from: d */
        public C22514mn f52150d;

        /* renamed from: e */
        public boolean f52151e;

        /* renamed from: f */
        public boolean f52152f;

        public C18653b(CouponCardListUI couponCardListUI) {
        }

        /* renamed from: a */
        public final C22514mn mo23479a() {
            C22514mn mnVar = this.f52150d;
            if (mnVar != null) {
                return mnVar;
            }
            C87412m.m108603p("couponCardInfo");
            throw null;
        }

        /* renamed from: c */
        public int mo75c() {
            return 1;
        }

        public long getItemId() {
            return (long) mo23479a().f64246d.hashCode();
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.v3.CouponCardListUI$c */
    public final class C18654c extends C60896i<C18653b> {

        /* renamed from: com.tencent.mm.plugin.card.ui.v3.CouponCardListUI$c$a */
        public static final class C18655a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ CouponCardListUI f52154d;

            /* renamed from: e */
            public final /* synthetic */ C22514mn f52155e;

            /* renamed from: f */
            public final /* synthetic */ C22502jn f52156f;

            /* renamed from: g */
            public final /* synthetic */ int f52157g;

            /* renamed from: h */
            public final /* synthetic */ int f52158h;

            public C18655a(CouponCardListUI couponCardListUI, C22514mn mnVar, C22502jn jnVar, int i, int i2) {
                this.f52154d = couponCardListUI;
                this.f52155e = mnVar;
                this.f52156f = jnVar;
                this.f52157g = i;
                this.f52158h = i2;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/card/ui/v3/CouponCardListUI$CouponCardConverter$appendCouponView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                CouponCardListUI couponCardListUI = this.f52154d;
                couponCardListUI.f52147x = true;
                String str = this.f52155e.f64246d;
                C87412m.m108593f(str, "el.card_pack_merchant_id");
                couponCardListUI.f52148y = str;
                CouponCardListUI couponCardListUI2 = this.f52154d;
                couponCardListUI2.f52149z = this.f52155e.f64263x;
                String str2 = this.f52156f.f64049d;
                C87412m.m108593f(str2, "coupon.user_card_id");
                CouponCardListUI.m19423L7(couponCardListUI2, str2);
                C115669n.INSTANCE.mo160131h(19748, 1, Long.valueOf(System.currentTimeMillis() / ((long) 1000)), this.f52156f.f64049d, Integer.valueOf(this.f52157g), Integer.valueOf(this.f52158h));
                C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/v3/CouponCardListUI$CouponCardConverter$appendCouponView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.card.ui.v3.CouponCardListUI$c$b */
        public static final class C18656b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ CouponCardListUI f52159d;

            /* renamed from: e */
            public final /* synthetic */ C8479f0<ViewGroup> f52160e;

            /* renamed from: f */
            public final /* synthetic */ C32224a<C13598b0> f52161f;

            public C18656b(CouponCardListUI couponCardListUI, C8479f0<ViewGroup> f0Var, C32224a<C13598b0> aVar) {
                this.f52159d = couponCardListUI;
                this.f52160e = f0Var;
                this.f52161f = aVar;
            }

            public final void run() {
                this.f52159d.f52131H = ((ViewGroup) this.f52160e.f27484d).getHeight();
                this.f52159d.f52132I = ((ViewGroup) this.f52160e.f27484d).getWidth();
                this.f52161f.invoke();
            }
        }

        /* renamed from: com.tencent.mm.plugin.card.ui.v3.CouponCardListUI$c$c */
        public static final class C18657c implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ CouponCardListUI f52162d;

            /* renamed from: e */
            public final /* synthetic */ C22514mn f52163e;

            /* renamed from: f */
            public final /* synthetic */ C22502jn f52164f;

            public C18657c(CouponCardListUI couponCardListUI, C22514mn mnVar, C22502jn jnVar) {
                this.f52162d = couponCardListUI;
                this.f52163e = mnVar;
                this.f52164f = jnVar;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/card/ui/v3/CouponCardListUI$CouponCardConverter$appendCouponView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                CouponCardListUI couponCardListUI = this.f52162d;
                couponCardListUI.f52147x = true;
                String str = this.f52163e.f64246d;
                C87412m.m108593f(str, "el.card_pack_merchant_id");
                couponCardListUI.f52148y = str;
                CouponCardListUI couponCardListUI2 = this.f52162d;
                couponCardListUI2.f52149z = this.f52163e.f64263x;
                String str2 = this.f52164f.f64049d;
                C87412m.m108593f(str2, "coupon.user_card_id");
                CouponCardListUI.m19423L7(couponCardListUI2, str2);
                C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/v3/CouponCardListUI$CouponCardConverter$appendCouponView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.card.ui.v3.CouponCardListUI$c$d */
        public static final class C18658d extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ CouponCardListUI f52165d;

            /* renamed from: e */
            public final /* synthetic */ MemberCardTopCropImageView f52166e;

            /* renamed from: f */
            public final /* synthetic */ C22502jn f52167f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C18658d(CouponCardListUI couponCardListUI, MemberCardTopCropImageView memberCardTopCropImageView, C22502jn jnVar) {
                super(0);
                this.f52165d = couponCardListUI;
                this.f52166e = memberCardTopCropImageView;
                this.f52167f = jnVar;
            }

            public Object invoke() {
                String str = this.f52165d.f52135i;
                Log.m105924i(str, "view height: " + this.f52165d.f52131H + ", view width: " + this.f52165d.f52132I);
                this.f52166e.f312094e = this.f52165d.getResources().getDimensionPixelSize(C0966R.dimen.f3749d0);
                MemberCardTopCropImageView memberCardTopCropImageView = this.f52166e;
                CouponCardListUI couponCardListUI = this.f52165d;
                memberCardTopCropImageView.f312093d = couponCardListUI.f52131H;
                memberCardTopCropImageView.setRadius((float) couponCardListUI.getResources().getDimensionPixelSize(C0966R.dimen.f3703bv));
                ViewGroup.LayoutParams layoutParams = this.f52166e.getLayoutParams();
                CouponCardListUI couponCardListUI2 = this.f52165d;
                int i = couponCardListUI2.f52131H;
                layoutParams.height = i;
                String str2 = this.f52167f.f64054i;
                if (str2 == null) {
                    return null;
                }
                C102526o.m135343c(this.f52166e, str2, 0.0f, false, 0, couponCardListUI2.f52132I, i, 28, (Object) null);
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.card.ui.v3.CouponCardListUI$c$e */
        public static final class C18659e implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C18654c f52168d;

            /* renamed from: e */
            public final /* synthetic */ C60905o f52169e;

            /* renamed from: f */
            public final /* synthetic */ C18653b f52170f;

            /* renamed from: g */
            public final /* synthetic */ int f52171g;

            public C18659e(C18654c cVar, C60905o oVar, C18653b bVar, int i) {
                this.f52168d = cVar;
                this.f52169e = oVar;
                this.f52170f = bVar;
                this.f52171g = i;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/card/ui/v3/CouponCardListUI$CouponCardConverter$showCollapseLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                Log.m105918d("MicroMsg.CardHomePageNewUI", "do collapse coupon layout");
                C18654c cVar = this.f52168d;
                C60905o oVar = this.f52169e;
                C18653b bVar = this.f52170f;
                int i = this.f52171g;
                cVar.getClass();
                C22514mn a = bVar.mo23479a();
                ViewGroup viewGroup = (ViewGroup) oVar.mo85812D(C0966R.C0970id.bbu);
                if (viewGroup.getChildCount() > a.f64262w) {
                    Log.m105919d(CouponCardListUI.this.f52135i, "collapse count: %s, limit: %s", Integer.valueOf(viewGroup.getChildCount()), Integer.valueOf(a.f64262w));
                    int childCount = viewGroup.getChildCount() - 1;
                    int i2 = a.f64262w;
                    if (i2 <= childCount) {
                        while (true) {
                            viewGroup.removeViewAt(childCount);
                            if (childCount == i2) {
                                break;
                            }
                            childCount--;
                        }
                    }
                }
                bVar.mo23479a();
                cVar.mo23483m(oVar, bVar, i);
                this.f52170f.f52151e = false;
                C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/v3/CouponCardListUI$CouponCardConverter$showCollapseLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.card.ui.v3.CouponCardListUI$c$f */
        public static final class C18660f implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ CouponCardListUI f52172d;

            /* renamed from: e */
            public final /* synthetic */ C18654c f52173e;

            /* renamed from: f */
            public final /* synthetic */ C60905o f52174f;

            /* renamed from: g */
            public final /* synthetic */ C18653b f52175g;

            /* renamed from: h */
            public final /* synthetic */ int f52176h;

            public C18660f(CouponCardListUI couponCardListUI, C18654c cVar, C60905o oVar, C18653b bVar, int i) {
                this.f52172d = couponCardListUI;
                this.f52173e = cVar;
                this.f52174f = oVar;
                this.f52175g = bVar;
                this.f52176h = i;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/card/ui/v3/CouponCardListUI$CouponCardConverter$showExpandLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                Log.m105918d(this.f52172d.f52135i, "do expand coupon layout");
                C18654c cVar = this.f52173e;
                C60905o oVar = this.f52174f;
                C18653b bVar = this.f52175g;
                int i = this.f52176h;
                cVar.getClass();
                C22514mn a = bVar.mo23479a();
                TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.bby);
                ImageView imageView = (ImageView) oVar.mo85812D(C0966R.C0970id.bbw);
                ViewGroup viewGroup = (ViewGroup) oVar.mo85812D(C0966R.C0970id.bbx);
                if (((ViewGroup) oVar.mo85812D(C0966R.C0970id.bbu)).getChildCount() < a.f64261v) {
                    cVar.mo23481k(a.f64262w, -1, oVar, bVar, i);
                    if (a.f64262w >= a.f64261v) {
                        viewGroup.setVisibility(8);
                    } else if (!Util.isNullOrNil(bVar.mo23479a().f64256q)) {
                        cVar.mo23484n(oVar, bVar, i);
                    } else {
                        cVar.mo23482l(oVar, bVar, i);
                    }
                }
                this.f52175g.f52151e = true;
                C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/v3/CouponCardListUI$CouponCardConverter$showExpandLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.card.ui.v3.CouponCardListUI$c$g */
        public static final class C18661g implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C22514mn f52177d;

            public C18661g(C22514mn mnVar) {
                this.f52177d = mnVar;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/card/ui/v3/CouponCardListUI$CouponCardConverter$showMiniAppLayout$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C51997xn xnVar = this.f52177d.f64258s;
                if (xnVar != null) {
                    boolean z = true;
                    Object[] objArr = new Object[1];
                    if (xnVar == null) {
                        z = false;
                    }
                    objArr[0] = Boolean.valueOf(z);
                    Log.m105925i("MicroMsg.CardHomePageNewUI", "detail goto mini app %s", objArr);
                    C51997xn xnVar2 = this.f52177d.f64258s;
                    C53246b.m59674f(xnVar2.f144755d, xnVar2.f144756e, xnVar2.f144757f);
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/v3/CouponCardListUI$CouponCardConverter$showMiniAppLayout$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C18654c() {
        }

        /* renamed from: c */
        public int mo43c() {
            return C0966R.C0971layout.f6733n2;
        }

        /* renamed from: e */
        public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
            C60905o oVar2 = oVar;
            int i3 = i;
            C18653b bVar = (C18653b) cVar;
            C87412m.m108594g(oVar2, "holder");
            C87412m.m108594g(bVar, "item");
            C22514mn a = bVar.mo23479a();
            String str = a.f64247e;
            if (!(str == null || str.length() == 0)) {
                View D = oVar2.mo85812D(C0966R.C0970id.f357705bc1);
                C87412m.m108593f(D, "holder.getView(R.id.chpi_logo_iv)");
                String str2 = a.f64247e;
                C87412m.m108593f(str2, "couponCardInfo.card_element_mch_icon");
                C102526o.m135343c((ImageView) D, str2, 0.0f, true, C0966R.raw.card_default_merchant_icon, 0, 0, 100, (Object) null);
            } else {
                ((ImageView) oVar2.mo85812D(C0966R.C0970id.f357705bc1)).setImageResource(C0966R.raw.card_default_merchant_icon);
            }
            C18686e eVar = new C18686e(CouponCardListUI.this, oVar2);
            ((ImageView) oVar2.mo85812D(C0966R.C0970id.f357705bc1)).setOnClickListener(eVar);
            TextView textView = (TextView) oVar2.mo85812D(C0966R.C0970id.bc5);
            String str3 = a.f64248f;
            if (!(str3 == null || str3.length() == 0)) {
                CouponCardListUI couponCardListUI = CouponCardListUI.this;
                C18667a aVar = new C18667a(couponCardListUI, couponCardListUI.getContext().getResources().getColor(C0966R.color.a7f), CouponCardListUI.this.getContext().getResources().getColor(C0966R.color.ad7), new C40885f(eVar));
                SpannableString spannableString = new SpannableString(a.f64248f);
                spannableString.setSpan(aVar, 0, spannableString.length(), 18);
                textView.setClickable(true);
                textView.setOnTouchListener(new C75355a0(CouponCardListUI.this.getContext()));
                textView.setText(spannableString);
            } else {
                textView.setText("");
            }
            boolean z2 = !bVar.f52152f ? a.f64260u == 1 : bVar.f52151e;
            ViewGroup viewGroup = (ViewGroup) oVar2.mo85812D(C0966R.C0970id.bbu);
            ViewGroup viewGroup2 = (ViewGroup) oVar2.mo85812D(C0966R.C0970id.bbx);
            viewGroup.removeAllViews();
            if (z2) {
                LinkedList<C22502jn> linkedList = a.f64255p;
                C87412m.m108593f(linkedList, "couponCardInfo.card_element_coupon_list");
                if (!linkedList.isEmpty()) {
                    mo23481k(-1, a.f64255p.size(), oVar, bVar, i);
                    viewGroup.setVisibility(0);
                    bVar.f52151e = true;
                } else {
                    viewGroup.setVisibility(8);
                }
                String str4 = a.f64256q;
                if (!(str4 == null || str4.length() == 0)) {
                    mo23484n(oVar2, bVar, i3);
                    viewGroup2.setVisibility(0);
                } else if (a.f64262w < a.f64255p.size()) {
                    mo23482l(oVar2, bVar, i3);
                } else {
                    viewGroup2.setVisibility(8);
                }
            } else {
                LinkedList<C22502jn> linkedList2 = a.f64255p;
                C87412m.m108593f(linkedList2, "couponCardInfo.card_element_coupon_list");
                if (!linkedList2.isEmpty()) {
                    mo23481k(-1, a.f64262w, oVar, bVar, i);
                    viewGroup.setVisibility(0);
                    bVar.f52151e = false;
                } else {
                    viewGroup.setVisibility(8);
                }
                if (a.f64262w >= a.f64255p.size()) {
                    String str5 = a.f64256q;
                    if (!(str5 == null || str5.length() == 0)) {
                        mo23484n(oVar2, bVar, i3);
                        viewGroup2.setVisibility(0);
                    } else {
                        viewGroup2.setVisibility(8);
                    }
                } else {
                    mo23483m(oVar2, bVar, i3);
                    viewGroup2.setVisibility(0);
                }
            }
            bVar.f52152f = true;
        }

        /* renamed from: f */
        public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
            C87412m.m108594g(recyclerView, "recyclerView");
            C87412m.m108594g(oVar, "holder");
        }

        /* renamed from: j */
        public final void mo23480j(View view, ViewGroup viewGroup) {
            if (viewGroup.getChildCount() == 0) {
                viewGroup.addView(view);
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, C76577a.m92151b(viewGroup.getContext(), 84));
            marginLayoutParams.topMargin = C76577a.m92151b(viewGroup.getContext(), 8);
            viewGroup.addView(view, new LinearLayout.LayoutParams(marginLayoutParams));
        }

        /* JADX WARNING: Removed duplicated region for block: B:41:0x023f  */
        /* renamed from: k */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo23481k(int r20, int r21, jq3.C60905o r22, com.tencent.p014mm.plugin.card.p031ui.p033v3.CouponCardListUI.C18653b r23, int r24) {
            /*
                r19 = this;
                r0 = r19
                r1 = r21
                r2 = r22
                te3.mn r9 = r23.mo23479a()
                r3 = 2131299584(0x7f090d00, float:1.8217174E38)
                android.view.View r3 = r2.mo85812D(r3)
                r10 = r3
                android.view.ViewGroup r10 = (android.view.ViewGroup) r10
                java.util.LinkedList<te3.jn> r3 = r9.f64255p
                java.util.Iterator r11 = r3.iterator()
                r7 = 0
                r13 = 0
            L_0x001c:
                boolean r3 = r11.hasNext()
                if (r3 == 0) goto L_0x0252
                int r14 = r7 + 1
                java.lang.Object r3 = r11.next()
                r15 = r3
                te3.jn r15 = (te3.C22502jn) r15
                r8 = r20
                if (r7 >= r8) goto L_0x0038
                r16 = r11
                r18 = r13
                r17 = r14
                r3 = 0
                goto L_0x024a
            L_0x0038:
                gy3.f0 r6 = new gy3.f0
                r6.<init>()
                int r3 = r15.f64056n
                java.lang.String r4 = "labelLayout"
                java.lang.String r5 = "coupon.coupon_label"
                java.lang.String r12 = "null cannot be cast to non-null type android.view.ViewGroup"
                r8 = 1
                if (r3 != r8) goto L_0x0105
                android.content.Context r3 = r10.getContext()
                android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
                r8 = 2131493488(0x7f0c0270, float:1.8610458E38)
                r16 = r11
                r11 = 0
                android.view.View r3 = r3.inflate(r8, r10, r11)
                gy3.C87412m.m108592e(r3, r12)
                android.view.ViewGroup r3 = (android.view.ViewGroup) r3
                r6.f27484d = r3
                r8 = r3
                android.view.ViewGroup r8 = (android.view.ViewGroup) r8
                r8 = 2131299569(0x7f090cf1, float:1.8217143E38)
                android.view.View r3 = r3.findViewById(r8)
                android.widget.TextView r3 = (android.widget.TextView) r3
                T r8 = r6.f27484d
                android.view.ViewGroup r8 = (android.view.ViewGroup) r8
                r11 = 2131299566(0x7f090cee, float:1.8217137E38)
                android.view.View r8 = r8.findViewById(r11)
                com.tencent.mm.pluginsdk.ui.applet.CdnImageView r8 = (com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView) r8
                T r11 = r6.f27484d
                android.view.ViewGroup r11 = (android.view.ViewGroup) r11
                r12 = 2131299567(0x7f090cef, float:1.821714E38)
                android.view.View r11 = r11.findViewById(r12)
                android.widget.TextView r11 = (android.widget.TextView) r11
                T r12 = r6.f27484d
                android.view.ViewGroup r12 = (android.view.ViewGroup) r12
                r17 = r14
                r14 = 2131299568(0x7f090cf0, float:1.8217141E38)
                android.view.View r12 = r12.findViewById(r14)
                android.widget.LinearLayout r12 = (android.widget.LinearLayout) r12
                java.lang.String r14 = r15.f64059q
                boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
                if (r14 != 0) goto L_0x00ac
                java.lang.String r14 = r15.f64059q
                r18 = r13
                int r13 = r15.f64060r
                int r13 = wz0.C22945n.m27002b(r14, r13)
                r3.setTextColor(r13)
                goto L_0x00ae
            L_0x00ac:
                r18 = r13
            L_0x00ae:
                java.lang.String r13 = r15.f64050e
                r3.setText(r13)
                java.lang.String r3 = r15.f64057o
                r8.setUrl(r3)
                java.lang.String r3 = r15.f64061s
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
                if (r3 != 0) goto L_0x00cb
                java.lang.String r3 = r15.f64061s
                int r8 = r15.f64062t
                int r3 = wz0.C22945n.m27002b(r3, r8)
                r11.setTextColor(r3)
            L_0x00cb:
                java.lang.String r3 = r15.f64051f
                r11.setText(r3)
                java.util.LinkedList<te3.in> r3 = r15.f64055j
                gy3.C87412m.m108593f(r3, r5)
                gy3.C87412m.m108593f(r12, r4)
                r0.mo23485o(r3, r12)
                r10.getChildCount()
                T r3 = r6.f27484d
                r11 = r3
                android.view.ViewGroup r11 = (android.view.ViewGroup) r11
                com.tencent.mm.plugin.card.ui.v3.CouponCardListUI$c$a r12 = new com.tencent.mm.plugin.card.ui.v3.CouponCardListUI$c$a
                com.tencent.mm.plugin.card.ui.v3.CouponCardListUI r4 = com.tencent.p014mm.plugin.card.p031ui.p033v3.CouponCardListUI.this
                r3 = r12
                r5 = r9
                r13 = r6
                r6 = r15
                r8 = r24
                r3.<init>(r4, r5, r6, r7, r8)
                r11.setOnClickListener(r12)
                T r3 = r13.f27484d
                android.view.ViewGroup r3 = (android.view.ViewGroup) r3
                java.lang.String r4 = r15.f64049d
                r3.setTag(r4)
                T r3 = r13.f27484d
                android.view.View r3 = (android.view.View) r3
                r0.mo23480j(r3, r10)
                goto L_0x023c
            L_0x0105:
                r16 = r11
                r18 = r13
                r17 = r14
                r13 = r6
                r6 = 2
                if (r3 != r6) goto L_0x023c
                android.content.Context r3 = r10.getContext()
                android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
                r7 = 2131493487(0x7f0c026f, float:1.8610456E38)
                r8 = 0
                android.view.View r3 = r3.inflate(r7, r10, r8)
                gy3.C87412m.m108592e(r3, r12)
                android.view.ViewGroup r3 = (android.view.ViewGroup) r3
                r13.f27484d = r3
                r7 = r3
                android.view.ViewGroup r7 = (android.view.ViewGroup) r7
                r7 = 2131299569(0x7f090cf1, float:1.8217143E38)
                android.view.View r3 = r3.findViewById(r7)
                android.widget.TextView r3 = (android.widget.TextView) r3
                T r7 = r13.f27484d
                android.view.ViewGroup r7 = (android.view.ViewGroup) r7
                r8 = 2131299567(0x7f090cef, float:1.821714E38)
                android.view.View r7 = r7.findViewById(r8)
                android.widget.TextView r7 = (android.widget.TextView) r7
                T r8 = r13.f27484d
                android.view.ViewGroup r8 = (android.view.ViewGroup) r8
                r11 = 2131299568(0x7f090cf0, float:1.8217141E38)
                android.view.View r8 = r8.findViewById(r11)
                android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
                T r11 = r13.f27484d
                android.view.ViewGroup r11 = (android.view.ViewGroup) r11
                r12 = 2131299564(0x7f090cec, float:1.8217133E38)
                android.view.View r11 = r11.findViewById(r12)
                com.tencent.mm.plugin.card.widget.MemberCardTopCropImageView r11 = (com.tencent.p014mm.plugin.card.widget.MemberCardTopCropImageView) r11
                T r14 = r13.f27484d
                android.view.ViewGroup r14 = (android.view.ViewGroup) r14
                r12 = 2131299565(0x7f090ced, float:1.8217135E38)
                android.view.View r12 = r14.findViewById(r12)
                android.widget.ImageView r12 = (android.widget.ImageView) r12
                java.lang.String r14 = r15.f64059q
                boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
                if (r14 != 0) goto L_0x0179
                java.lang.String r14 = r15.f64059q
                int r6 = r15.f64060r
                int r6 = wz0.C22945n.m27002b(r14, r6)
                r3.setTextColor(r6)
            L_0x0179:
                java.lang.String r6 = r15.f64050e
                r3.setText(r6)
                java.lang.String r3 = r15.f64051f
                r7.setText(r3)
                android.content.Context r3 = r11.getContext()
                r6 = 2
                int r3 = kg3.C76577a.m92151b(r3, r6)
                float r3 = (float) r3
                r11.setRadius(r3)
                java.lang.String r3 = r15.f64054i
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
                if (r3 != 0) goto L_0x01f5
                T r3 = r13.f27484d
                android.view.ViewGroup r3 = (android.view.ViewGroup) r3
                r6 = 2131299564(0x7f090cec, float:1.8217133E38)
                android.view.View r3 = r3.findViewById(r6)
                java.lang.String r6 = "view.findViewById(R.id.chpc_bg_iv)"
                gy3.C87412m.m108593f(r3, r6)
                com.tencent.mm.plugin.card.widget.MemberCardTopCropImageView r3 = (com.tencent.p014mm.plugin.card.widget.MemberCardTopCropImageView) r3
                com.tencent.mm.plugin.card.ui.v3.CouponCardListUI$c$d r6 = new com.tencent.mm.plugin.card.ui.v3.CouponCardListUI$c$d
                com.tencent.mm.plugin.card.ui.v3.CouponCardListUI r7 = com.tencent.p014mm.plugin.card.p031ui.p033v3.CouponCardListUI.this
                r6.<init>(r7, r3, r15)
                com.tencent.mm.plugin.card.ui.v3.CouponCardListUI r3 = com.tencent.p014mm.plugin.card.p031ui.p033v3.CouponCardListUI.this
                int r7 = r3.f52131H
                if (r7 <= 0) goto L_0x01c1
                int r7 = r3.f52132I
                if (r7 > 0) goto L_0x01bd
                goto L_0x01c1
            L_0x01bd:
                r6.invoke()
                goto L_0x01f0
            L_0x01c1:
                T r7 = r13.f27484d
                android.view.ViewGroup r7 = (android.view.ViewGroup) r7
                int r7 = r7.getHeight()
                r3.f52131H = r7
                com.tencent.mm.plugin.card.ui.v3.CouponCardListUI r3 = com.tencent.p014mm.plugin.card.p031ui.p033v3.CouponCardListUI.this
                T r7 = r13.f27484d
                android.view.ViewGroup r7 = (android.view.ViewGroup) r7
                int r7 = r7.getWidth()
                r3.f52132I = r7
                com.tencent.mm.plugin.card.ui.v3.CouponCardListUI r3 = com.tencent.p014mm.plugin.card.p031ui.p033v3.CouponCardListUI.this
                int r7 = r3.f52131H
                if (r7 <= 0) goto L_0x01e6
                int r7 = r3.f52132I
                if (r7 > 0) goto L_0x01e2
                goto L_0x01e6
            L_0x01e2:
                r6.invoke()
                goto L_0x01f0
            L_0x01e6:
                android.view.View r7 = r2.f44854d
                com.tencent.mm.plugin.card.ui.v3.CouponCardListUI$c$b r11 = new com.tencent.mm.plugin.card.ui.v3.CouponCardListUI$c$b
                r11.<init>(r3, r13, r6)
                r7.post(r11)
            L_0x01f0:
                r3 = 0
                r12.setVisibility(r3)
                goto L_0x020f
            L_0x01f5:
                r3 = 0
                java.lang.String r6 = r15.f64053h
                boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
                if (r6 != 0) goto L_0x020f
                android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
                java.lang.String r7 = r15.f64053h
                int r7 = android.graphics.Color.parseColor(r7)
                r6.<init>(r7)
                r11.setImageDrawable(r6)
                r12.setVisibility(r3)
            L_0x020f:
                java.util.LinkedList<te3.in> r6 = r15.f64055j
                gy3.C87412m.m108593f(r6, r5)
                gy3.C87412m.m108593f(r8, r4)
                r0.mo23485o(r6, r8)
                r10.getChildCount()
                T r4 = r13.f27484d
                android.view.ViewGroup r4 = (android.view.ViewGroup) r4
                com.tencent.mm.plugin.card.ui.v3.CouponCardListUI$c$c r5 = new com.tencent.mm.plugin.card.ui.v3.CouponCardListUI$c$c
                com.tencent.mm.plugin.card.ui.v3.CouponCardListUI r6 = com.tencent.p014mm.plugin.card.p031ui.p033v3.CouponCardListUI.this
                r5.<init>(r6, r9, r15)
                r4.setOnClickListener(r5)
                T r4 = r13.f27484d
                android.view.ViewGroup r4 = (android.view.ViewGroup) r4
                java.lang.String r5 = r15.f64049d
                r4.setTag(r5)
                T r4 = r13.f27484d
                android.view.View r4 = (android.view.View) r4
                r0.mo23480j(r4, r10)
                goto L_0x023d
            L_0x023c:
                r3 = 0
            L_0x023d:
                if (r1 <= 0) goto L_0x024a
                int r13 = r18 + 1
                if (r13 < r1) goto L_0x0244
                goto L_0x0252
            L_0x0244:
                r11 = r16
                r7 = r17
                goto L_0x001c
            L_0x024a:
                r11 = r16
                r7 = r17
                r13 = r18
                goto L_0x001c
            L_0x0252:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.card.p031ui.p033v3.CouponCardListUI.C18654c.mo23481k(int, int, jq3.o, com.tencent.mm.plugin.card.ui.v3.CouponCardListUI$b, int):void");
        }

        /* renamed from: l */
        public final void mo23482l(C60905o oVar, C18653b bVar, int i) {
            bVar.mo23479a();
            ImageView imageView = (ImageView) oVar.mo85812D(C0966R.C0970id.bbw);
            ((TextView) oVar.mo85812D(C0966R.C0970id.bby)).setText(MMApplicationContext.getResources().getString(C0966R.string.f360221ay2));
            ((ViewGroup) oVar.mo85812D(C0966R.C0970id.bbx)).setOnClickListener(new C18659e(this, oVar, bVar, i));
            imageView.setImageResource(C0966R.C0969drawable.bxg);
            imageView.setVisibility(0);
        }

        /* renamed from: m */
        public final void mo23483m(C60905o oVar, C18653b bVar, int i) {
            C22514mn a = bVar.mo23479a();
            ImageView imageView = (ImageView) oVar.mo85812D(C0966R.C0970id.bbw);
            ((TextView) oVar.mo85812D(C0966R.C0970id.bby)).setText(MMApplicationContext.getResources().getString(C0966R.string.ay4, new Object[]{Integer.valueOf(a.f64261v - a.f64262w)}));
            ((ViewGroup) oVar.mo85812D(C0966R.C0970id.bbx)).setOnClickListener(new C18660f(CouponCardListUI.this, this, oVar, bVar, i));
            imageView.setImageResource(C0966R.C0969drawable.bxf);
            imageView.setVisibility(0);
        }

        /* renamed from: n */
        public final void mo23484n(C60905o oVar, C18653b bVar, int i) {
            C22514mn a = bVar.mo23479a();
            TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.bby);
            ImageView imageView = (ImageView) oVar.mo85812D(C0966R.C0970id.bbw);
            ViewGroup viewGroup = (ViewGroup) oVar.mo85812D(C0966R.C0970id.bbx);
            if (!Util.isNullOrNil(a.f64256q)) {
                if (!Util.isNullOrNil(a.f64257r)) {
                    textView.setTextColor(Color.parseColor(a.f64257r));
                }
                textView.setText(a.f64256q);
                imageView.setImageResource(C0966R.C0969drawable.bwx);
                viewGroup.setOnClickListener(new C18661g(a));
            }
        }

        /* renamed from: o */
        public final void mo23485o(List<? extends C49871in> list, LinearLayout linearLayout) {
            for (C49871in inVar : list) {
                CardTagTextView cardTagTextView = new CardTagTextView(CouponCardListUI.this.getContext());
                AppCompatActivity context = CouponCardListUI.this.getContext();
                cardTagTextView.setMinHeight(C76577a.m92151b(context, 18));
                cardTagTextView.setMinWidth(C76577a.m92151b(context, 56));
                int b = C76577a.m92151b(context, 8);
                int b2 = C76577a.m92151b(context, 4);
                cardTagTextView.setPadding(b, b2, b, b2);
                cardTagTextView.setText(inVar.f135509d);
                cardTagTextView.setTextSize(1, 10.0f);
                if (!Util.isNullOrNil(inVar.f135510e)) {
                    cardTagTextView.setTextColor(Color.parseColor(inVar.f135510e));
                } else {
                    cardTagTextView.setTextColor(-1);
                }
                if (!Util.isNullOrNil(inVar.f135511f)) {
                    cardTagTextView.setFillColor(C22945n.m27002b(inVar.f135511f, inVar.f135514i));
                } else {
                    cardTagTextView.setFillColor(C22945n.m27001a(-16777216, 26));
                }
                linearLayout.addView(cardTagTextView);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.v3.CouponCardListUI$d */
    public static final class C18662d extends C87413o implements C32226l<C89132b.C89134c<C22523py1>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ CouponCardListUI f52178d;

        /* renamed from: e */
        public final /* synthetic */ boolean f52179e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18662d(CouponCardListUI couponCardListUI, boolean z) {
            super(1);
            this.f52178d = couponCardListUI;
            this.f52179e = z;
        }

        public Object invoke(Object obj) {
            T t;
            boolean z;
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            if (cVar != null) {
                CouponCardListUI couponCardListUI = this.f52178d;
                boolean z2 = this.f52179e;
                Log.m105924i(couponCardListUI.f52135i, "errType: " + cVar.f256793a + ", errCode: " + cVar.f256794b + ", errMsg: " + cVar.f256795c);
                if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                    C22523py1 py12 = (C22523py1) cVar.f256796d;
                    if (py12 != null) {
                        Log.m105924i(couponCardListUI.f52135i, "retcode: " + py12.f64453d + ", retmsg: " + py12.f64454e);
                        if (py12.f64453d == 0) {
                            couponCardListUI.f52143t = py12.f64455f;
                            couponCardListUI.f52144u = py12.f64456g >= 1;
                            couponCardListUI.f52146w = true;
                            C118435go goVar = py12.f64462p;
                            couponCardListUI.f52126C = goVar;
                            if (goVar != null) {
                                if (py12.f64460n == 1) {
                                    LinkedList<C118431fo> linkedList = goVar.f354035d;
                                    C87412m.m108593f(linkedList, "card_sort_info");
                                    Iterator<T> it = linkedList.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            t = null;
                                            break;
                                        }
                                        t = it.next();
                                        if (((C118431fo) t).f354004d == py12.f64461o) {
                                            z = true;
                                            continue;
                                        } else {
                                            z = false;
                                            continue;
                                        }
                                        if (z) {
                                            break;
                                        }
                                    }
                                    C118431fo foVar = (C118431fo) t;
                                    if (foVar != null) {
                                        couponCardListUI.f52128E = foVar.f354004d;
                                        String str = foVar.f354006f;
                                        C87412m.m108593f(str, "find.sort_wording");
                                        couponCardListUI.f52127D = str;
                                        couponCardListUI.f52145v = foVar.f354005e;
                                    }
                                } else if (couponCardListUI.f52128E == 0) {
                                    C118431fo first = goVar.f354035d.getFirst();
                                    couponCardListUI.f52128E = first.f354004d;
                                    String str2 = first.f354006f;
                                    C87412m.m108593f(str2, "first.sort_wording");
                                    couponCardListUI.f52127D = str2;
                                    couponCardListUI.f52145v = first.f354005e;
                                }
                            }
                            couponCardListUI.mo23477N7();
                            C51997xn xnVar = py12.f64458i;
                            couponCardListUI.f52124A = xnVar;
                            couponCardListUI.f52125B = py12.f64459j;
                            if (xnVar != null) {
                                couponCardListUI.removeAllOptionMenu();
                                couponCardListUI.addIconOptionMenu(0, 0, (int) C0966R.raw.icons_outlined_more, (MenuItem.OnMenuItemClickListener) new C22566e(couponCardListUI, xnVar));
                            }
                            if (z2) {
                                couponCardListUI.f52142s.clear();
                            }
                            couponCardListUI.mo23478O7(py12);
                        } else {
                            C22945n.m27018r(couponCardListUI.getContext(), py12.f64454e);
                            couponCardListUI.f52128E = couponCardListUI.f52129F;
                        }
                    }
                    if (couponCardListUI.f52133J) {
                        couponCardListUI.f52133J = false;
                    }
                } else {
                    C22945n.m27017q(couponCardListUI.getContext(), "");
                    couponCardListUI.f52128E = couponCardListUI.f52129F;
                }
                couponCardListUI.mo23477N7();
            }
            CouponCardListUI couponCardListUI2 = this.f52178d;
            couponCardListUI2.f52130G = false;
            RefreshLoadMoreLayout refreshLoadMoreLayout = couponCardListUI2.f52137n;
            if (refreshLoadMoreLayout != null) {
                refreshLoadMoreLayout.mo82440F(0);
                return C13598b0.f38549a;
            }
            C87412m.m108603p("mRefreshLayout");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.v3.CouponCardListUI$e */
    public static final class C18663e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ CouponCardListUI f52180d;

        public C18663e(CouponCardListUI couponCardListUI) {
            this.f52180d = couponCardListUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/card/ui/v3/CouponCardListUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105918d(this.f52180d.f52135i, "click header view");
            CouponCardListUI couponCardListUI = this.f52180d;
            Log.m105924i(couponCardListUI.f52135i, "show sort dialog");
            if (couponCardListUI.f52126C != null) {
                C77407n nVar = new C77407n((Context) couponCardListUI.getContext(), 1, false);
                nVar.f225771i = new C22563c(couponCardListUI);
                nVar.f225782p = new C22564d(couponCardListUI);
                nVar.mo107573q();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/v3/CouponCardListUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.v3.CouponCardListUI$f */
    public static final class C18664f extends RefreshLoadMoreLayout.C57879a {

        /* renamed from: a */
        public final /* synthetic */ CouponCardListUI f52181a;

        /* renamed from: com.tencent.mm.plugin.card.ui.v3.CouponCardListUI$f$a */
        public static final class C18665a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ CouponCardListUI f52182d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C18665a(CouponCardListUI couponCardListUI) {
                super(0);
                this.f52182d = couponCardListUI;
            }

            public Object invoke() {
                CouponCardListUI couponCardListUI = this.f52182d;
                int i = CouponCardListUI.f52123L;
                couponCardListUI.mo23476M7(false);
                return C13598b0.f38549a;
            }
        }

        public C18664f(CouponCardListUI couponCardListUI) {
            this.f52181a = couponCardListUI;
        }

        /* renamed from: b */
        public void mo2561b(int i) {
            Log.m105918d(this.f52181a.f52135i, "on load more");
            C61926c.m72668M(new C18665a(this.f52181a));
        }

        /* renamed from: c */
        public void mo2562c(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            CouponCardListUI couponCardListUI = this.f52181a;
            String str = couponCardListUI.f52135i;
            couponCardListUI.getClass();
            Log.m105918d(str, "on load more end: 0");
            CouponCardListUI couponCardListUI2 = this.f52181a;
            if (couponCardListUI2.f52144u) {
                RefreshLoadMoreLayout refreshLoadMoreLayout = couponCardListUI2.f52137n;
                if (refreshLoadMoreLayout != null) {
                    refreshLoadMoreLayout.mo82437B((RefreshLoadMoreLayout.C7080c<Object>) null);
                } else {
                    C87412m.m108603p("mRefreshLayout");
                    throw null;
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.v3.CouponCardListUI$g */
    public static final class C18666g implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ CouponCardListUI f52183d;

        public C18666g(CouponCardListUI couponCardListUI) {
            this.f52183d = couponCardListUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f52183d.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.v3.CouponCardListUI$a */
    public final class C18667a extends C75359b0 {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18667a(CouponCardListUI couponCardListUI, int i, int i2, C45336q qVar) {
            super(i, i2);
            C87412m.m108594g(qVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            this.mClickListener = qVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/card/ui/v3/CouponCardListUI$CardSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
            C87412m.m108594g(view, "widget");
            C45336q qVar = this.mClickListener;
            if (qVar != null) {
                qVar.mo23448a(view, (C53155r0) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/v3/CouponCardListUI$CardSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: L7 */
    public static final void m19423L7(CouponCardListUI couponCardListUI, String str) {
        Log.m105924i(couponCardListUI.f52135i, "go to card detail ui");
        Intent intent = new Intent(couponCardListUI.getContext(), CardDetailUI.class);
        intent.putExtra("key_card_id", str);
        intent.addFlags(131072);
        intent.putExtra("key_from_scene", 3);
        AppCompatActivity context = couponCardListUI.getContext();
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        AppCompatActivity appCompatActivity = context;
        C117292a.m165358d(appCompatActivity, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/v3/CouponCardListUI", "gotoCardDetailUI", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(appCompatActivity, "com/tencent/mm/plugin/card/ui/v3/CouponCardListUI", "gotoCardDetailUI", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: H7 */
    public void mo23418H7(int i, boolean z) {
        if (this.f52133J && this.f52128E == 1) {
            mo23476M7(true);
        } else if (!z) {
            mo23460K7();
        }
    }

    /* renamed from: M7 */
    public final void mo23476M7(boolean z) {
        int i;
        String str = this.f52135i;
        Log.m105924i(str, "do load vip card list: " + this.f52130G + ", " + this.f52143t + ", " + this.f52128E);
        if (this.f52144u && !z) {
            Log.m105928w(this.f52135i, "already load complete");
            RefreshLoadMoreLayout refreshLoadMoreLayout = this.f52137n;
            if (refreshLoadMoreLayout != null) {
                refreshLoadMoreLayout.mo82440F(0);
            } else {
                C87412m.m108603p("mRefreshLayout");
                throw null;
            }
        } else if (this.f52130G) {
            Log.m105928w(this.f52135i, "is loading");
        } else {
            this.f52130G = true;
            int i2 = this.f52143t;
            if (z) {
                RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f52137n;
                if (refreshLoadMoreLayout2 != null) {
                    refreshLoadMoreLayout2.setHasBottomMore(true);
                    i = 0;
                } else {
                    C87412m.m108603p("mRefreshLayout");
                    throw null;
                }
            } else {
                i = i2;
            }
            C46915a aVar = new C46915a(i, this.f52145v, (double) this.f52073d, (double) this.f52074e, 1, this.f52128E);
            aVar.f256791h = true;
            C89059e i3 = aVar.mo9225i();
            C87412m.m108593f(i3, "CgiGetCouponHomePage(off…ntCancelAfterDead().run()");
            C61926c.m72665J(i3, new C18662d(this, z)).mo11397F(this);
        }
    }

    /* renamed from: N7 */
    public final void mo23477N7() {
        if (this.f52128E <= 0 || !(!this.f52142s.isEmpty())) {
            WxRecyclerAdapter<C18653b> wxRecyclerAdapter = this.f52141r;
            if (wxRecyclerAdapter != null) {
                ViewGroup viewGroup = this.f52139p;
                if (viewGroup != null) {
                    wxRecyclerAdapter.mo85802j6((long) viewGroup.hashCode(), false);
                } else {
                    C87412m.m108603p("mHeaderView");
                    throw null;
                }
            } else {
                C87412m.m108603p("mCouponCardListAdapter");
                throw null;
            }
        } else {
            TextView textView = this.f52140q;
            if (textView != null) {
                textView.setText(this.f52127D);
                WxRecyclerAdapter<C18653b> wxRecyclerAdapter2 = this.f52141r;
                if (wxRecyclerAdapter2 != null) {
                    ViewGroup viewGroup2 = this.f52139p;
                    if (viewGroup2 != null) {
                        wxRecyclerAdapter2.mo85794V5(viewGroup2, 2, false);
                    } else {
                        C87412m.m108603p("mHeaderView");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("mCouponCardListAdapter");
                    throw null;
                }
            } else {
                C87412m.m108603p("mSortTv");
                throw null;
            }
        }
        WxRecyclerAdapter<C18653b> wxRecyclerAdapter3 = this.f52141r;
        if (wxRecyclerAdapter3 != null) {
            wxRecyclerAdapter3.notifyDataSetChanged();
        } else {
            C87412m.m108603p("mCouponCardListAdapter");
            throw null;
        }
    }

    /* renamed from: O7 */
    public final void mo23478O7(C22523py1 py12) {
        C50983qn qnVar = py12.f64457h;
        if (qnVar != null && !qnVar.f140399d.isEmpty()) {
            Iterator<C22514mn> it = py12.f64457h.f140399d.iterator();
            while (it.hasNext()) {
                C22514mn next = it.next();
                C18653b bVar = new C18653b(this);
                C87412m.m108593f(next, "cardInfo");
                bVar.f52150d = next;
                this.f52142s.add(bVar);
            }
            if (this.f52142s.isEmpty()) {
                ViewGroup viewGroup = this.f52138o;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                } else {
                    C87412m.m108603p("mEmptyView");
                    throw null;
                }
            } else {
                ViewGroup viewGroup2 = this.f52138o;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(8);
                } else {
                    C87412m.m108603p("mEmptyView");
                    throw null;
                }
            }
            WxRecyclerAdapter<C18653b> wxRecyclerAdapter = this.f52141r;
            if (wxRecyclerAdapter != null) {
                wxRecyclerAdapter.notifyDataSetChanged();
            } else {
                C87412m.m108603p("mCouponCardListAdapter");
                throw null;
            }
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6734n3;
    }

    public void initView() {
        View findViewById = findViewById(C0966R.C0970id.bcq);
        C87412m.m108593f(findViewById, "findViewById(R.id.chpvv3_rv)");
        this.f52136j = (WxRecyclerView) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.bco);
        C87412m.m108593f(findViewById2, "findViewById(R.id.chpvv3_refresh_layout)");
        this.f52137n = (RefreshLoadMoreLayout) findViewById2;
        View findViewById3 = findViewById(C0966R.C0970id.bcm);
        C87412m.m108593f(findViewById3, "findViewById(R.id.chpvv3_empty_layout)");
        this.f52138o = (ViewGroup) findViewById3;
        WxRecyclerView wxRecyclerView = this.f52136j;
        if (wxRecyclerView != null) {
            wxRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
            WxRecyclerAdapter<C18653b> wxRecyclerAdapter = new WxRecyclerAdapter<>(new CouponCardListUI$initView$1(this), this.f52142s, false);
            this.f52141r = wxRecyclerAdapter;
            WxRecyclerView wxRecyclerView2 = this.f52136j;
            if (wxRecyclerView2 != null) {
                wxRecyclerView2.setAdapter(wxRecyclerAdapter);
                LayoutInflater layoutInflater = getLayoutInflater();
                WxRecyclerView wxRecyclerView3 = this.f52136j;
                if (wxRecyclerView3 != null) {
                    View inflate = layoutInflater.inflate(C0966R.C0971layout.f6739n8, wxRecyclerView3, false);
                    C87412m.m108592e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
                    ViewGroup viewGroup = (ViewGroup) inflate;
                    this.f52139p = viewGroup;
                    viewGroup.setPadding(0, viewGroup.getPaddingTop(), 0, C76577a.m92151b(getContext(), 12));
                    ViewGroup viewGroup2 = this.f52139p;
                    if (viewGroup2 != null) {
                        View findViewById4 = viewGroup2.findViewById(C0966R.C0970id.bcs);
                        C87412m.m108593f(findViewById4, "mHeaderView.findViewById(R.id.chpvv3_sort_tv)");
                        this.f52140q = (TextView) findViewById4;
                        ViewGroup viewGroup3 = this.f52139p;
                        if (viewGroup3 != null) {
                            viewGroup3.setOnClickListener(new C18663e(this));
                            WxRecyclerAdapter<C18653b> wxRecyclerAdapter2 = this.f52141r;
                            if (wxRecyclerAdapter2 != null) {
                                ViewGroup viewGroup4 = this.f52139p;
                                if (viewGroup4 != null) {
                                    wxRecyclerAdapter2.mo85794V5(viewGroup4, 2, false);
                                    RefreshLoadMoreLayout refreshLoadMoreLayout = this.f52137n;
                                    if (refreshLoadMoreLayout != null) {
                                        refreshLoadMoreLayout.setEnableRefresh(false);
                                        RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f52137n;
                                        if (refreshLoadMoreLayout2 != null) {
                                            refreshLoadMoreLayout2.setActionCallback(new C18664f(this));
                                        } else {
                                            C87412m.m108603p("mRefreshLayout");
                                            throw null;
                                        }
                                    } else {
                                        C87412m.m108603p("mRefreshLayout");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("mHeaderView");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("mCouponCardListAdapter");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("mHeaderView");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("mHeaderView");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("mCouponCardListRv");
                    throw null;
                }
            } else {
                C87412m.m108603p("mCouponCardListRv");
                throw null;
            }
        } else {
            C87412m.m108603p("mCouponCardListRv");
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r12) {
        /*
            r11 = this;
            super.onCreate(r12)
            r11.initView()
            android.content.Intent r12 = r11.getIntent()
            java.lang.String r0 = "title"
            java.lang.String r12 = r12.getStringExtra(r0)
            r0 = 1
            r1 = 0
            if (r12 == 0) goto L_0x001e
            int r2 = r12.length()
            if (r2 != 0) goto L_0x001c
            goto L_0x001e
        L_0x001c:
            r2 = 0
            goto L_0x001f
        L_0x001e:
            r2 = 1
        L_0x001f:
            if (r2 != 0) goto L_0x0025
            r11.setMMTitle((java.lang.String) r12)
            goto L_0x002b
        L_0x0025:
            r12 = 2131823025(0x7f1109b1, float:1.9278838E38)
            r11.setMMTitle((int) r12)
        L_0x002b:
            android.content.res.Resources r12 = r11.getResources()
            r2 = 2131099648(0x7f060000, float:1.7811655E38)
            int r12 = r12.getColor(r2)
            r11.setActionbarColor(r12)
            r11.hideActionbarLine()
            com.tencent.mm.plugin.card.ui.v3.CouponCardListUI$g r12 = new com.tencent.mm.plugin.card.ui.v3.CouponCardListUI$g
            r12.<init>(r11)
            r11.setBackBtn(r12)
            android.content.Intent r12 = r11.getIntent()
            java.lang.String r2 = "scene"
            int r12 = r12.getIntExtra(r2, r1)
            r11.f52134K = r12
            java.lang.String r12 = "MicroMsg.CardSnapshotMgr"
            java.lang.String r2 = "load vip card list snapshot"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r12, r2)
            f40.o r3 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r3 = r3.mo121142i()
            com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_CARD_COUPON_LIST_STRING_SYNC
            java.lang.String r5 = ""
            java.lang.Object r3 = r3.mo119685f(r4, r5)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x0074
            int r4 = r3.length()
            if (r4 != 0) goto L_0x0072
            goto L_0x0074
        L_0x0072:
            r4 = 0
            goto L_0x0075
        L_0x0074:
            r4 = 1
        L_0x0075:
            java.lang.String r6 = "safeParser"
            java.lang.String r7 = "this as java.lang.String).getBytes(charset)"
            r8 = 0
            if (r4 == 0) goto L_0x007f
            goto L_0x0099
        L_0x007f:
            te3.py1 r4 = new te3.py1
            r4.<init>()
            java.nio.charset.Charset r9 = z04.C119027c.f356489b
            byte[] r3 = r3.getBytes(r9)
            gy3.C87412m.m108593f(r3, r7)
            r4.parseFrom(r3)     // Catch:{ Exception -> 0x0091 }
            goto L_0x009a
        L_0x0091:
            r3 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r4[r1] = r3
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r6, r5, r4)
        L_0x0099:
            r4 = r8
        L_0x009a:
            if (r4 == 0) goto L_0x00bf
            int r3 = r4.f64455f
            r11.f52143t = r3
            te3.go r3 = r4.f64462p
            r11.f52126C = r3
            te3.xn r3 = r4.f64458i
            r11.f52124A = r3
            java.lang.String r9 = r4.f64459j
            r11.f52125B = r9
            if (r3 == 0) goto L_0x00bc
            r11.removeAllOptionMenu()
            r9 = 2131756370(0x7f100552, float:1.9143646E38)
            tz0.e r10 = new tz0.e
            r10.<init>(r11, r3)
            r11.addIconOptionMenu((int) r1, (int) r1, (int) r9, (android.view.MenuItem.OnMenuItemClickListener) r10)
        L_0x00bc:
            r11.mo23478O7(r4)
        L_0x00bf:
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r12, r2)
            f40.o r12 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r12 = r12.mo121142i()
            com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_CARD_COUPON_LIST_SORTINFO_STRING_SYNC
            java.lang.Object r12 = r12.mo119685f(r2, r5)
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L_0x00dd
            int r2 = r12.length()
            if (r2 != 0) goto L_0x00db
            goto L_0x00dd
        L_0x00db:
            r2 = 0
            goto L_0x00de
        L_0x00dd:
            r2 = 1
        L_0x00de:
            if (r2 == 0) goto L_0x00e1
            goto L_0x00fc
        L_0x00e1:
            te3.fo r2 = new te3.fo
            r2.<init>()
            java.nio.charset.Charset r3 = z04.C119027c.f356489b
            byte[] r12 = r12.getBytes(r3)
            gy3.C87412m.m108593f(r12, r7)
            r2.parseFrom(r12)     // Catch:{ Exception -> 0x00f4 }
            r8 = r2
            goto L_0x00fc
        L_0x00f4:
            r12 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r2[r1] = r12
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r6, r5, r2)
        L_0x00fc:
            if (r8 == 0) goto L_0x0113
            int r12 = r8.f354004d
            r11.f52128E = r12
            java.lang.String r12 = r8.f354006f
            java.lang.String r1 = "cardSortInfo.sort_wording"
            gy3.C87412m.m108593f(r12, r1)
            r11.f52127D = r12
            int r12 = r8.f354005e
            r11.f52145v = r12
            int r12 = r11.f52128E
            r11.f52129F = r12
        L_0x0113:
            te3.go r12 = r11.f52126C
            if (r12 == 0) goto L_0x013f
            int r1 = r11.f52134K
            if (r1 != r0) goto L_0x013f
            java.util.LinkedList<te3.fo> r12 = r12.f354035d
            java.util.Iterator r12 = r12.iterator()
        L_0x0121:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x013f
            java.lang.Object r1 = r12.next()
            te3.fo r1 = (te3.C118431fo) r1
            int r2 = r1.f354004d
            r3 = 2
            if (r2 != r3) goto L_0x0121
            r11.f52128E = r3
            java.lang.String r1 = r1.f354006f
            java.lang.String r2 = "sortInfo.sort_wording"
            gy3.C87412m.m108593f(r1, r2)
            r11.f52127D = r1
            goto L_0x0121
        L_0x013f:
            r11.mo23477N7()
            r11.mo23477N7()
            int r12 = r11.f52128E
            if (r12 == r0) goto L_0x014c
            r11.mo23476M7(r0)
        L_0x014c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.card.p031ui.p033v3.CouponCardListUI.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        if (!this.f52146w) {
            Log.m105924i(this.f52135i, "no data to save snapshot");
            return;
        }
        C22523py1 py12 = new C22523py1();
        C49966ja jaVar = new C49966ja();
        py12.BaseResponse = jaVar;
        jaVar.f135956e = new C51163rv3();
        py12.f64457h = new C50983qn();
        Iterator<C18653b> it = this.f52142s.iterator();
        while (it.hasNext()) {
            py12.f64457h.f140399d.add(it.next().mo23479a());
        }
        py12.f64462p = this.f52126C;
        py12.f64455f = this.f52143t;
        py12.f64459j = this.f52125B;
        py12.f64458i = this.f52124A;
        Log.m105918d("MicroMsg.CardSnapshotMgr", "save vip card list snapshot");
        C61926c.m72656A((String) null, new C10441b(py12));
        C118431fo foVar = new C118431fo();
        foVar.f354004d = this.f52128E;
        foVar.f354006f = this.f52127D;
        foVar.f354005e = this.f52145v;
        Log.m105918d("MicroMsg.CardSnapshotMgr", "save vip card list snapshot");
        C61926c.m72656A((String) null, new C117431d(foVar));
    }

    public void onResume() {
        super.onResume();
        Log.m105925i(this.f52135i, "do get mch infoset: %s", Boolean.valueOf(this.f52147x));
        if (this.f52147x) {
            C46823m mVar = new C46823m(this.f52148y, this.f52149z, (double) this.f52073d, (double) this.f52074e, this.f52128E, 1);
            mVar.f256791h = true;
            mVar.mo9225i().mo123062e(new C22562b(this)).mo11397F(this);
        }
    }
}
