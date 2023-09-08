package q53;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C39629l0;
import androidx.recyclerview.widget.C0132m;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.wallet.wecoin.p124ui.BuyGoodsBottomDialog$initCustomView$layoutManager$1;
import com.tencent.p014mm.plugin.wallet.wecoin.p124ui.BuyGoodsBottomDialog$initCustomView$secondLayoutManager$1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import j20.C117292a;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.UUID;
import k20.C60958c;
import k20.C9556a;
import l31.C10460a;
import l31.C61212e;
import m53.C10753a;
import m53.C10757d;
import m53.C10761g;
import m53.C10765k;
import m53.C10766l;
import n53.C11125h;
import n53.C11128k;
import nr3.C89059e;
import p217oq.C11717f;
import p53.C11838f;
import p53.C11839g;
import p53.C11840h;
import p53.C11841i;
import p53.C11862y;
import qo3.C12925w;
import qo3.C89779i0;
import r53.C12953c;
import rx3.C13604l;
import sx3.C90364q0;
import te3.C51526uc2;
import te3.e35;
import z04.C119027c;

/* renamed from: q53.a */
public final class C12041a implements C10757d {

    /* renamed from: a */
    public final FragmentActivity f35061a;

    /* renamed from: b */
    public final C10761g f35062b;

    /* renamed from: c */
    public C12925w f35063c;

    /* renamed from: d */
    public C12119t f35064d;

    /* renamed from: e */
    public final C11840h f35065e;

    /* renamed from: f */
    public final boolean f35066f = false;

    /* renamed from: g */
    public C12042a f35067g;

    /* renamed from: h */
    public C12042a f35068h;

    /* renamed from: i */
    public View f35069i;

    /* renamed from: j */
    public TextView f35070j;

    /* renamed from: k */
    public C89779i0 f35071k;

    /* renamed from: l */
    public boolean f35072l;

    /* renamed from: m */
    public C10757d.C10758a f35073m;

    /* renamed from: n */
    public C10753a f35074n;

    /* renamed from: q53.a$a */
    public final class C12042a extends RecyclerView.C16613e<C12043a> {

        /* renamed from: d */
        public ArrayList<e35> f35075d;

        /* renamed from: e */
        public int f35076e;

        /* renamed from: f */
        public boolean f35077f;

        /* renamed from: g */
        public long f35078g;

        /* renamed from: h */
        public AdapterView.OnItemClickListener f35079h;

        /* renamed from: q53.a$a$a */
        public final class C12043a extends RecyclerView.C16631z implements View.OnClickListener {

            /* renamed from: A */
            public final View f35081A;

            /* renamed from: B */
            public TextView f35082B;

            /* renamed from: C */
            public TextView f35083C;

            /* renamed from: D */
            public final WeImageView f35084D;

            /* renamed from: E */
            public final View f35085E;

            /* renamed from: F */
            public final /* synthetic */ C12042a f35086F;

            /* renamed from: z */
            public View f35087z;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C12043a(C12042a aVar, View view) {
                super(view);
                C87412m.m108594g(view, "itemView");
                this.f35086F = aVar;
                view.setOnClickListener(this);
                View findViewById = view.findViewById(C0966R.C0970id.igh);
                C87412m.m108593f(findViewById, "itemView.findViewById(R.…product_balance_count_tv)");
                TextView textView = (TextView) findViewById;
                this.f35082B = textView;
                C85875k4.m106189j0(textView.getPaint(), 0.8f);
                C12953c.m12404m(this.f35082B, 24);
                View findViewById2 = view.findViewById(C0966R.C0970id.igj);
                C87412m.m108593f(findViewById2, "itemView.findViewById(R.…product_total_balance_tv)");
                TextView textView2 = (TextView) findViewById2;
                this.f35083C = textView2;
                C12953c.m12404m(textView2, 14);
                View findViewById3 = view.findViewById(C0966R.C0970id.iwc);
                C87412m.m108593f(findViewById3, "itemView.findViewById(R.id.root)");
                this.f35087z = findViewById3;
                if (C12041a.this.f35066f || C85875k4.m106211z()) {
                    this.f35087z.setBackground(C12041a.this.f35061a.getResources().getDrawable(C0966R.C0969drawable.b2x, (Resources.Theme) null));
                }
                View findViewById4 = view.findViewById(C0966R.C0970id.lol);
                C87412m.m108593f(findViewById4, "itemView.findViewById(R.…oin_show_product_icon_iv)");
                this.f35084D = (WeImageView) findViewById4;
                View findViewById5 = view.findViewById(C0966R.C0970id.f359407kr3);
                C87412m.m108593f(findViewById5, "itemView.findViewById(R.id.top_area)");
                this.f35081A = findViewById5;
                View findViewById6 = view.findViewById(C0966R.C0970id.f357873mc0);
                C87412m.m108593f(findViewById6, "itemView.findViewById(R.id.discount_area)");
                this.f35085E = findViewById6;
                View findViewById7 = view.findViewById(C0966R.C0970id.f357874mc1);
                C87412m.m108593f(findViewById7, "itemView.findViewById(R.id.discount_tips_text)");
                ((TextView) findViewById7).setTextSize(1, 10.0f);
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/wallet/wecoin/ui/BuyGoodsBottomDialog$RecycleViewAdapter$ViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C87412m.m108594g(view, "v");
                AdapterView.OnItemClickListener onItemClickListener = this.f35086F.f35079h;
                if (onItemClickListener != null) {
                    onItemClickListener.onItemClick((AdapterView) null, view, mo17365l(), (long) mo17365l());
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/wecoin/ui/BuyGoodsBottomDialog$RecycleViewAdapter$ViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C12042a() {
        }

        public int getItemCount() {
            ArrayList<e35> arrayList = this.f35075d;
            if (arrayList != null) {
                return arrayList.size();
            }
            return 0;
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            int i2 = i;
            C12043a aVar = (C12043a) zVar;
            C87412m.m108594g(aVar, "holder");
            ArrayList<e35> arrayList = this.f35075d;
            if (arrayList != null) {
                C12041a aVar2 = C12041a.this;
                if (i2 < arrayList.size()) {
                    e35 e35 = arrayList.get(i2);
                    C87412m.m108593f(e35, "this[position]");
                    e35 e352 = e35;
                    if (aVar2.f35066f) {
                        aVar.f35082B.setTextColor(aVar2.f35061a.getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
                        aVar.f35083C.setTextColor(aVar2.f35061a.getResources().getColor(C0966R.color.BW_100_Alpha_0_5));
                    }
                    String str = "";
                    if (!this.f35077f || i2 != 2) {
                        aVar.f35084D.setVisibility(0);
                        aVar.f35082B.setTextSize(1, 24.0f);
                        ViewGroup.LayoutParams layoutParams = aVar.f35081A.getLayoutParams();
                        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout.LayoutParams");
                        ((FlexboxLayout.LayoutParams) layoutParams).topMargin = (int) C12041a.this.f35061a.getResources().getDimension(C0966R.dimen.f3723cd);
                        aVar.f35082B.setText(String.valueOf(e352.f132670e));
                        aVar.f35082B.setContentDescription(aVar2.f35061a.getString(C0966R.string.lje, new Object[]{String.valueOf(e352.f132670e)}));
                        long longValue = C75228t.m90248h(str + e352.f132671f, "100", 0, RoundingMode.CEILING).longValue();
                        String string = aVar2.f35061a.getString(C0966R.string.ljv, new Object[]{String.valueOf(longValue)});
                        C87412m.m108593f(string, "context.getString(R.stri…_yuan, amount.toString())");
                        aVar.f35083C.setText(string);
                        e352.f132673h = false;
                        View view = aVar.f35085E;
                        C9556a aVar3 = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar3.mo10233c(4);
                        View view2 = view;
                        C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/wallet/wecoin/ui/BuyGoodsBottomDialog$RecycleViewAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/wallet/wecoin/ui/BuyGoodsBottomDialog$RecycleViewAdapter$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/wallet/wecoin/ui/BuyGoodsBottomDialog$RecycleViewAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/wallet/wecoin/ui/BuyGoodsBottomDialog$RecycleViewAdapter$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    } else {
                        aVar.f35084D.setVisibility(8);
                        aVar.f35082B.setTextSize(1, 17.0f);
                        ViewGroup.LayoutParams layoutParams2 = aVar.f35081A.getLayoutParams();
                        C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout.LayoutParams");
                        ((FlexboxLayout.LayoutParams) layoutParams2).topMargin = (int) C12041a.this.f35061a.getResources().getDimension(C0966R.dimen.f3736cp);
                        String string2 = aVar2.f35061a.getString(C0966R.string.m0u);
                        C87412m.m108593f(string2, "context.getString(R.string.wecoin_other_amount)");
                        String string3 = aVar2.f35061a.getString(C0966R.string.m0t, new Object[]{String.valueOf(this.f35078g / ((long) 100))});
                        C87412m.m108593f(string3, "context.getString(R.stri…putUpper/100).toString())");
                        aVar.f35082B.setText(string2);
                        aVar.f35082B.setContentDescription(string2);
                        aVar.f35083C.setText(string3);
                        View view3 = aVar.f35085E;
                        C9556a aVar4 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar4.mo10233c(4);
                        View view4 = view3;
                        C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/wallet/wecoin/ui/BuyGoodsBottomDialog$RecycleViewAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/wallet/wecoin/ui/BuyGoodsBottomDialog$RecycleViewAdapter$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                        C117292a.m165359e(view4, "com/tencent/mm/plugin/wallet/wecoin/ui/BuyGoodsBottomDialog$RecycleViewAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/wallet/wecoin/ui/BuyGoodsBottomDialog$RecycleViewAdapter$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    View view5 = aVar.f35087z;
                    C87412m.m108594g(view5, "<this>");
                    ((C61212e) C86312j.m106911c(C61212e.class)).se0(view5);
                    C10460a.m10392a(aVar.f35087z, "pay_coin_view");
                    View view6 = aVar.f35087z;
                    C13604l[] lVarArr = new C13604l[7];
                    String str2 = e352.f132669d;
                    if (str2 != null) {
                        str = str2;
                    }
                    lVarArr[0] = new C13604l("product_id", str);
                    lVarArr[1] = new C13604l("wecoin_count", Integer.valueOf(e352.f132670e));
                    lVarArr[2] = new C13604l(FirebaseAnalytics.C113379b.PRICE, Integer.valueOf(e352.f132671f));
                    lVarArr[3] = new C13604l("discount_wecoin_count", Integer.valueOf(e352.f132672g));
                    lVarArr[4] = new C13604l("new_user_discount", Boolean.valueOf(e352.f132673h));
                    lVarArr[5] = new C13604l("coin_report_session_id", C10765k.f32240b);
                    lVarArr[6] = new C13604l("coin_business_id", Integer.valueOf(C10765k.f32239a));
                    C10460a.m10393b(view6, C90364q0.m113148g(lVarArr));
                    C10460a.m10394c(aVar.f35087z, 40, 25955);
                }
                C12052c cVar = new C12052c(aVar2, this, aVar);
                if (this.f35076e <= 0) {
                    View view7 = aVar2.f35069i;
                    if (view7 == null) {
                        C87412m.m108603p("mCustomView");
                        throw null;
                    } else if (view7.getWidth() <= 0) {
                        View view8 = aVar2.f35069i;
                        if (view8 != null) {
                            view8.post(new C12048b(cVar));
                            return;
                        } else {
                            C87412m.m108603p("mCustomView");
                            throw null;
                        }
                    }
                }
                cVar.invoke();
            }
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            View inflate = LayoutInflater.from(C12041a.this.f35061a).inflate(C0966R.C0971layout.f6671lf, viewGroup, false);
            C87412m.m108593f(inflate, "itemView");
            return new C12043a(this, inflate);
        }
    }

    /* renamed from: q53.a$b */
    public static final class C12044b implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C12041a f35088d;

        public C12044b(C12041a aVar) {
            this.f35088d = aVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            if (!this.f35088d.f35061a.isFinishing() && !this.f35088d.f35061a.isDestroyed()) {
                C11840h hVar = this.f35088d.f35065e;
                hVar.getClass();
                Log.m105924i("MicroMsg.RechargeProductsDialogViewModel", "cancelGetPriceListRequest, mGetPriceListCgi: " + hVar.f34618n);
                C11128k kVar = hVar.f34618n;
                if (kVar != null) {
                    kVar.mo85581g();
                }
                hVar.mo11723c3(8, 2, 0, "");
                this.f35088d.f35061a.finish();
            }
            C12041a aVar = this.f35088d;
            C89779i0 i0Var = aVar.f35071k;
            if (i0Var != null && i0Var.isShowing()) {
                i0Var.dismiss();
                aVar.f35071k = null;
            }
        }
    }

    public C12041a(FragmentActivity fragmentActivity, C10761g gVar) {
        C87412m.m108594g(fragmentActivity, "context");
        C87412m.m108594g(gVar, "params");
        this.f35061a = fragmentActivity;
        this.f35062b = gVar;
        C39622i0 a = C39629l0.m42233a(fragmentActivity, new C11841i(gVar)).mo75002a(C11840h.class);
        C87412m.m108593f(a, "of(context,factory).get(…logViewModel::class.java)");
        C11840h hVar = (C11840h) a;
        this.f35065e = hVar;
        hVar.f34621q = C12953c.m12394c(gVar.f32222a);
        String uuid = UUID.randomUUID().toString();
        C87412m.m108593f(uuid, "uuid.toString()");
        hVar.f34623s = uuid;
        int i = gVar.f32222a;
        if (i != 0 && (!(i == 1 || i == 2) || (uuid = gVar.f32224c) == null)) {
            uuid = "";
        }
        hVar.f34622r = uuid;
        hVar.f34615h.removeObservers(fragmentActivity);
        hVar.f34616i.removeObservers(fragmentActivity);
        hVar.f34612e.removeObservers(fragmentActivity);
        hVar.f34613f.removeObservers(fragmentActivity);
        hVar.f34614g.removeObservers(fragmentActivity);
        hVar.f34617j.removeObservers(fragmentActivity);
        C12925w wVar = gVar.f32230i;
        this.f35063c = wVar == null ? new C12925w(fragmentActivity, 0, false, true) : wVar;
        C51526uc2 uc22 = null;
        if (fragmentActivity.getResources().getConfiguration().orientation == 2) {
            C12925w wVar2 = this.f35063c;
            if (wVar2 != null) {
                wVar2.mo12472l(Boolean.TRUE);
            } else {
                C87412m.m108603p("mBottomSheet");
                throw null;
            }
        }
        C12925w wVar3 = this.f35063c;
        if (wVar3 != null) {
            wVar3.mo12473m(false);
            C12925w wVar4 = this.f35063c;
            if (wVar4 != null) {
                wVar4.f36937s = new C12089l(this);
                C12093m mVar = new C12093m(this);
                Dialog dialog = wVar4.f36925d;
                if (dialog != null) {
                    dialog.setOnCancelListener(mVar);
                }
                C0132m mVar2 = new C0132m(fragmentActivity, 0);
                mVar2.mo128j(fragmentActivity.getResources().getDrawable(C0966R.C0969drawable.f357430b30, (Resources.Theme) null));
                View inflate = View.inflate(fragmentActivity, C0966R.C0971layout.f6670ld, (ViewGroup) null);
                C87412m.m108593f(inflate, "inflate(context, R.layou…dialog_custom_view, null)");
                this.f35069i = inflate;
                View findViewById = inflate.findViewById(C0966R.C0970id.eun);
                C87412m.m108593f(findViewById, "mCustomView.findViewById(R.id.header_desc)");
                this.f35070j = (TextView) findViewById;
                View view = this.f35069i;
                if (view != null) {
                    View findViewById2 = view.findViewById(C0966R.C0970id.ap8);
                    C87412m.m108593f(findViewById2, "mCustomView.findViewById…ods_half_dialog_title_tv)");
                    TextView textView = (TextView) findViewById2;
                    View view2 = this.f35069i;
                    if (view2 != null) {
                        View findViewById3 = view2.findViewById(C0966R.C0970id.lo_);
                        C87412m.m108593f(findViewById3, "mCustomView.findViewById…coin_header_back_icon_iv)");
                        WeImageView weImageView = (WeImageView) findViewById3;
                        C85875k4.m106189j0(textView.getPaint(), 0.8f);
                        C12953c.m12404m(textView, 15);
                        TextView textView2 = this.f35070j;
                        if (textView2 != null) {
                            C12953c.m12404m(textView2, 10);
                            if (gVar.f32230i != null) {
                                weImageView.setImageResource(C0966R.raw.icons_outlined_back);
                            } else {
                                weImageView.setImageResource(C0966R.raw.icons_outlined_close);
                            }
                            int i2 = gVar.f32222a;
                            if (i2 == 2 || i2 == 4 || i2 == 8 || i2 == 10 || i2 == 12 || i2 == 14 || i2 == 16 || i2 == 18 || i2 == 20) {
                                textView.setText(C0966R.string.ljc);
                            }
                            weImageView.setOnClickListener(new C12085k(this));
                            View view3 = this.f35069i;
                            if (view3 != null) {
                                View findViewById4 = view3.findViewById(C0966R.C0970id.ahh);
                                C87412m.m108593f(findViewById4, "mCustomView.findViewById…_sheet_menu_reccycleview)");
                                RecyclerView recyclerView = (RecyclerView) findViewById4;
                                BuyGoodsBottomDialog$initCustomView$layoutManager$1 buyGoodsBottomDialog$initCustomView$layoutManager$1 = new BuyGoodsBottomDialog$initCustomView$layoutManager$1(fragmentActivity);
                                buyGoodsBottomDialog$initCustomView$layoutManager$1.mo16974W(0);
                                recyclerView.setLayoutManager(buyGoodsBottomDialog$initCustomView$layoutManager$1);
                                recyclerView.mo17085h0(mVar2);
                                C12042a aVar = new C12042a();
                                this.f35067g = aVar;
                                recyclerView.setAdapter(aVar);
                                BuyGoodsBottomDialog$initCustomView$secondLayoutManager$1 buyGoodsBottomDialog$initCustomView$secondLayoutManager$1 = new BuyGoodsBottomDialog$initCustomView$secondLayoutManager$1(fragmentActivity);
                                buyGoodsBottomDialog$initCustomView$secondLayoutManager$1.mo16974W(0);
                                View view4 = this.f35069i;
                                if (view4 != null) {
                                    View findViewById5 = view4.findViewById(C0966R.C0970id.ahk);
                                    C87412m.m108593f(findViewById5, "mCustomView.findViewById…heet_second_reccycleview)");
                                    RecyclerView recyclerView2 = (RecyclerView) findViewById5;
                                    recyclerView2.setLayoutManager(buyGoodsBottomDialog$initCustomView$secondLayoutManager$1);
                                    recyclerView2.mo17085h0(mVar2);
                                    C12042a aVar2 = new C12042a();
                                    this.f35068h = aVar2;
                                    recyclerView2.setAdapter(aVar2);
                                    View view5 = this.f35069i;
                                    if (view5 != null) {
                                        C10460a.m10392a(view5, "buy_coin_view");
                                        View view6 = this.f35069i;
                                        if (view6 != null) {
                                            C10460a.m10393b(view6, C90364q0.m113148g(new C13604l("coin_report_session_id", C10765k.f32240b), new C13604l("coin_business_id", Integer.valueOf(C10765k.f32239a))));
                                            View view7 = this.f35069i;
                                            if (view7 != null) {
                                                C10460a.m10394c(view7, 32, 25955);
                                                mo11896f(Boolean.TRUE);
                                                hVar.f34612e.observe(fragmentActivity, new C12056d(this));
                                                hVar.f34613f.observe(fragmentActivity, new C12061e(this));
                                                hVar.f34614g.observe(fragmentActivity, new C12066f(this));
                                                hVar.f34615h.observe(fragmentActivity, new C12070g(this));
                                                hVar.f34616i.observe(fragmentActivity, new C12073h(this));
                                                hVar.f34617j.observe(fragmentActivity, new C12077i(this));
                                                Log.m105925i("MicroMsg.RechargeProductsDialogViewModel", "getCacheData, isCacheDataLoaded: %s", Boolean.valueOf(hVar.f34620p));
                                                if (!hVar.f34620p) {
                                                    hVar.f34620p = true;
                                                    int a2 = C10766l.m10744a(hVar.f34611d.f32222a);
                                                    Log.m105918d("MicroMsg.WeCoinUtils", "load WecoinPriceListResponse snapshot");
                                                    C85801v1 i3 = C86709a0.m107535s().mo121142i();
                                                    String str = (String) i3.mo119687h(a2 + "USERINFO_WECOIN_PRICE_LIST_RESPONSE_STRING_SYNC", "");
                                                    if (!(str == null || str.length() == 0)) {
                                                        C51526uc2 uc23 = new C51526uc2();
                                                        byte[] bytes = str.getBytes(C119027c.f356489b);
                                                        C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
                                                        try {
                                                            uc23.parseFrom(bytes);
                                                            uc22 = uc23;
                                                        } catch (Exception e) {
                                                            Log.printDebugStack("safeParser", "", e);
                                                        }
                                                    }
                                                    if (uc22 != null) {
                                                        hVar.f34617j.postValue(uc22);
                                                    }
                                                    C51526uc2 value = hVar.f34617j.getValue();
                                                    if (value != null) {
                                                        hVar.f34612e.postValue(value.f142740e);
                                                        hVar.f34613f.postValue(Integer.valueOf(value.f142741f));
                                                        hVar.f34619o = value.f142742g;
                                                    }
                                                    long i4 = C12953c.m12400i();
                                                    if (i4 > 0) {
                                                        hVar.f34615h.postValue(Long.valueOf(i4));
                                                    }
                                                }
                                                C11840h hVar2 = this.f35065e;
                                                C10761g gVar2 = this.f35062b;
                                                int i5 = gVar2.f32222a;
                                                int i6 = gVar2.f32223b;
                                                hVar2.mo11723c3(8, 1, 0, "");
                                                C11128k kVar = new C11128k(i6 >= 1 ? i6 : C10766l.m10744a(i5), i5);
                                                hVar2.f34618n = kVar;
                                                C89059e i7 = kVar.mo9225i();
                                                if (i7 != null) {
                                                    i7.mo123062e(new C11839g(hVar2, i6));
                                                }
                                                C11840h hVar3 = this.f35065e;
                                                hVar3.getClass();
                                                new C11125h().mo9225i().mo123062e(new C11838f(hVar3));
                                                return;
                                            }
                                            C87412m.m108603p("mCustomView");
                                            throw null;
                                        }
                                        C87412m.m108603p("mCustomView");
                                        throw null;
                                    }
                                    C87412m.m108603p("mCustomView");
                                    throw null;
                                }
                                C87412m.m108603p("mCustomView");
                                throw null;
                            }
                            C87412m.m108603p("mCustomView");
                            throw null;
                        }
                        C87412m.m108603p("headerDesc");
                        throw null;
                    }
                    C87412m.m108603p("mCustomView");
                    throw null;
                }
                C87412m.m108603p("mCustomView");
                throw null;
            }
            C87412m.m108603p("mBottomSheet");
            throw null;
        }
        C87412m.m108603p("mBottomSheet");
        throw null;
    }

    /* renamed from: d */
    public static final void m11742d(C12041a aVar, e35 e35) {
        View view = aVar.f35069i;
        if (view != null) {
            if (((CheckBox) view.findViewById(C0966R.C0970id.ifq)).isChecked()) {
                aVar.f35072l = true;
                C10757d.C10758a aVar2 = aVar.f35073m;
                if (aVar2 != null) {
                    aVar2.mo9998a(aVar, Boolean.FALSE);
                }
                C10753a aVar3 = aVar.f35074n;
                if (aVar3 != null) {
                    aVar3.mo10987a();
                }
                C12925w wVar = aVar.f35063c;
                if (wVar != null) {
                    wVar.mo5085n();
                    ((C11717f) C86312j.m106911c(C11717f.class)).mo11557h5();
                    C11840h hVar = aVar.f35065e;
                    FragmentActivity fragmentActivity = aVar.f35061a;
                    int i = aVar.f35062b.f32222a;
                    hVar.getClass();
                    C87412m.m108594g(fragmentActivity, "context");
                    C87412m.m108594g(e35, "info");
                    C10761g gVar = new C10761g();
                    gVar.f32227f = e35.f132669d;
                    gVar.f32226e = hVar.f34619o;
                    gVar.f32222a = i;
                    String str = hVar.f34622r;
                    if (str != null) {
                        gVar.f32224c = str;
                        C10761g gVar2 = hVar.f34611d;
                        gVar.f32225d = gVar2.f32225d;
                        gVar.f32223b = gVar2.f32223b;
                        gVar.f32232k = gVar2.f32232k;
                        gVar.f32233l = hVar.f34617j.getValue();
                        C11862y.f34681e.mo11738d(fragmentActivity, gVar);
                    } else {
                        C87412m.m108603p("mSceneSessionID");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("mBottomSheet");
                    throw null;
                }
            } else {
                aVar.mo11895e();
            }
            aVar.f35065e.mo11724d3(5);
            return;
        }
        C87412m.m108603p("mCustomView");
        throw null;
    }

    /* renamed from: a */
    public void mo11002a(C10757d.C10758a aVar) {
        this.f35073m = aVar;
    }

    /* renamed from: b */
    public void mo11003b() {
        C12925w wVar = this.f35063c;
        if (wVar != null) {
            wVar.mo5085n();
        } else {
            C87412m.m108603p("mBottomSheet");
            throw null;
        }
    }

    /* renamed from: c */
    public void mo11004c(C10753a aVar) {
        this.f35074n = aVar;
    }

    /* renamed from: e */
    public final void mo11895e() {
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f35061a, C0966R.C0968anim.f2342a7);
        View view = this.f35069i;
        if (view != null) {
            ((LinearLayout) view.findViewById(C0966R.C0970id.ifr)).startAnimation(loadAnimation);
        } else {
            C87412m.m108603p("mCustomView");
            throw null;
        }
    }

    /* renamed from: f */
    public final void mo11896f(Boolean bool) {
        C89779i0 i0Var;
        Log.m105918d("MicroMsg.BuyGoodsBottomDialog", "showProgressDialog: " + bool);
        if (bool != null) {
            if (bool.booleanValue()) {
                FragmentActivity fragmentActivity = this.f35061a;
                i0Var = C89779i0.m112248e(fragmentActivity, fragmentActivity.getString(C0966R.string.gas), true, 3, new C12044b(this));
            } else {
                C89779i0 i0Var2 = this.f35071k;
                if (i0Var2 != null) {
                    i0Var2.dismiss();
                }
                i0Var = null;
            }
            this.f35071k = i0Var;
        }
    }
}
