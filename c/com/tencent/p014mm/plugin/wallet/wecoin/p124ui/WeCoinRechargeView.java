package com.tencent.p014mm.plugin.wallet.wecoin.p124ui;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Display;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C39623j;
import androidx.lifecycle.C39629l0;
import androidx.lifecycle.C54209k0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.wallet_core.p125ui.view.WcPayMoneyLoadingView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import f40.C86709a0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import kg3.C76577a;
import kotlin.Metadata;
import m53.C10756c;
import m53.C10761g;
import n53.C11127j;
import o40.C61926c;
import p53.C11831b0;
import p53.C11835d0;
import p53.C11837e0;
import p53.C11842j;
import p53.C11862y;
import q53.C12055c2;
import q53.C12060d2;
import q53.C12065e2;
import q53.C12069f2;
import q53.C12072g2;
import q53.C12076h2;
import q53.C12080i2;
import q53.C12084j2;
import q53.C12088k2;
import q53.C12092l2;
import q53.C12096m2;
import q53.C12100n2;
import q53.C12107p2;
import q53.C12112q2;
import q53.C12116r2;
import qo3.C101218e0;
import qo3.C77407n;
import qo3.C89779i0;
import r53.C12953c;
import r53.C12958e;
import te3.C51224sc2;
import te3.d35;
import z04.C119027c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-wxpay_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView */
public final class WeCoinRechargeView extends MMActivity {

    /* renamed from: u */
    public static final /* synthetic */ int f21863u = 0;

    /* renamed from: d */
    public C11831b0 f21864d;

    /* renamed from: e */
    public LinearLayout f21865e;

    /* renamed from: f */
    public TextView f21866f;

    /* renamed from: g */
    public View f21867g;

    /* renamed from: h */
    public LinearLayout f21868h;

    /* renamed from: i */
    public LinearLayout f21869i;

    /* renamed from: j */
    public TextView f21870j;

    /* renamed from: n */
    public LinearLayout f21871n;

    /* renamed from: o */
    public TextView f21872o;

    /* renamed from: p */
    public WcPayMoneyLoadingView f21873p;

    /* renamed from: q */
    public TextView f21874q;

    /* renamed from: r */
    public Button f21875r;

    /* renamed from: s */
    public TextView f21876s;

    /* renamed from: t */
    public C89779i0 f21877t;

    /* renamed from: com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView$a */
    public static final class C5767a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ WeCoinRechargeView f21878d;

        public C5767a(WeCoinRechargeView weCoinRechargeView) {
            this.f21878d = weCoinRechargeView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WeCoinRechargeView.m5533I7(this.f21878d);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView$b */
    public static final class C5768b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ WeCoinRechargeView f21879d;

        public C5768b(WeCoinRechargeView weCoinRechargeView) {
            this.f21879d = weCoinRechargeView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WeCoinRechargeView weCoinRechargeView = this.f21879d;
            int i = WeCoinRechargeView.f21863u;
            weCoinRechargeView.getClass();
            C77407n nVar = new C77407n((Context) weCoinRechargeView, 1, true);
            nVar.mo107568m(weCoinRechargeView.getString(C0966R.string.m0n), 17, 0);
            nVar.f225771i = new C12096m2(weCoinRechargeView);
            nVar.f225780o = new C12100n2(weCoinRechargeView);
            nVar.mo107559d(false);
            nVar.f225782p = new C12107p2(weCoinRechargeView, weCoinRechargeView);
            nVar.mo107573q();
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView$c */
    public static final class C5769c implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ WeCoinRechargeView f21880d;

        public C5769c(WeCoinRechargeView weCoinRechargeView) {
            this.f21880d = weCoinRechargeView;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            C11831b0 b0Var = this.f21880d.f21864d;
            if (b0Var != null) {
                b0Var.mo11721d3(8);
                this.f21880d.finish();
                return false;
            }
            C87412m.m108603p("mViewModel");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView$d */
    public static final class C5770d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WeCoinRechargeView f21881d;

        public C5770d(WeCoinRechargeView weCoinRechargeView) {
            this.f21881d = weCoinRechargeView;
        }

        public final void run() {
            WeCoinRechargeView weCoinRechargeView = this.f21881d;
            int i = WeCoinRechargeView.f21863u;
            weCoinRechargeView.getClass();
            int i2 = C85875k4.m106184h(weCoinRechargeView).y;
            Object systemService = weCoinRechargeView.getSystemService("window");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            Point h = C85875k4.m106184h(weCoinRechargeView);
            Math.max(point.y, point.x);
            int max = Math.max(h.y, h.x);
            Rect rect = new Rect();
            weCoinRechargeView.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            int max2 = (max - Math.max(rect.bottom - rect.top, rect.right - rect.left)) - C85875k4.m106198o(weCoinRechargeView);
            if (max2 > 0) {
                i2 -= C85875k4.m106188j(weCoinRechargeView);
            }
            int i3 = 0;
            ActionBar supportActionBar = weCoinRechargeView.getSupportActionBar();
            if (supportActionBar != null && (i3 = supportActionBar.mo91101l()) <= 0) {
                i3 = weCoinRechargeView.getResources().getDimensionPixelSize(C0966R.dimen.f3679b9);
            }
            int o = ((i2 - i3) - C85875k4.m106198o(weCoinRechargeView)) - weCoinRechargeView.getResources().getDimensionPixelSize(C0966R.dimen.f3727cg);
            int b = C76577a.m92151b(weCoinRechargeView, 520);
            Log.m105924i("MicroMsg.WeCoinRechargeView", "updateMainContentView, [contentViewHeight] " + o + ", [maxSpaceSize] " + b + ", [bottomHeight] " + max2);
            if (o > b) {
                o = b;
            }
            View findViewById = weCoinRechargeView.findViewById(C0966R.C0970id.lo4);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = o;
                findViewById.setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView$e */
    public static final class C5771e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ WeCoinRechargeView f21882d;

        public C5771e(WeCoinRechargeView weCoinRechargeView) {
            this.f21882d = weCoinRechargeView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView$updateRechargeButtonState$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!C12953c.m12399h()) {
                C11831b0 b0Var = this.f21882d.f21864d;
                if (b0Var != null) {
                    b0Var.mo11721d3(4);
                    WeCoinRechargeView.m5532H7(this.f21882d);
                } else {
                    C87412m.m108603p("mViewModel");
                    throw null;
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView$updateRechargeButtonState$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: H7 */
    public static final void m5532H7(WeCoinRechargeView weCoinRechargeView) {
        C11831b0 b0Var = weCoinRechargeView.f21864d;
        if (b0Var != null) {
            b0Var.f34599q = true;
            C10761g gVar = new C10761g();
            gVar.f32222a = 0;
            gVar.f32225d = new C12112q2(weCoinRechargeView);
            ((C10756c) C86709a0.m107533q(C10756c.class)).q10(weCoinRechargeView.getContext(), gVar);
            return;
        }
        C87412m.m108603p("mViewModel");
        throw null;
    }

    /* renamed from: I7 */
    public static final void m5533I7(WeCoinRechargeView weCoinRechargeView) {
        d35 d35;
        C11831b0 b0Var = weCoinRechargeView.f21864d;
        if (b0Var != null) {
            C11831b0.C11832a value = b0Var.f34596n.getValue();
            if (value != null && (d35 = value.f34601a) != null) {
                C11831b0 b0Var2 = weCoinRechargeView.f21864d;
                if (b0Var2 != null) {
                    b0Var2.mo11721d3(9);
                    C101218e0 e0Var = new C101218e0(weCoinRechargeView.getContext(), 2, 0);
                    LinearLayout linearLayout = new LinearLayout(weCoinRechargeView.getContext());
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(weCoinRechargeView.getContext());
                    linearLayout.addView(textView);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(textView.getLayoutParams());
                    layoutParams.width = -1;
                    layoutParams.height = -2;
                    layoutParams.topMargin = C76577a.m92155f(weCoinRechargeView.getContext(), C0966R.dimen.f3753d4);
                    layoutParams.bottomMargin = C76577a.m92155f(weCoinRechargeView.getContext(), C0966R.dimen.f3743cv);
                    textView.setTextColor(weCoinRechargeView.getResources().getColor(C0966R.color.f3139gn));
                    textView.setTextSize(1, 17.0f);
                    C85875k4.m106189j0(textView.getPaint(), 0.8f);
                    textView.setText(d35.f132099d);
                    textView.setLayoutParams(layoutParams);
                    Iterator<String> it = d35.f132100e.iterator();
                    while (it.hasNext()) {
                        TextView textView2 = new TextView(weCoinRechargeView.getContext());
                        linearLayout.addView(textView2);
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(textView2.getLayoutParams());
                        layoutParams2.width = -1;
                        layoutParams2.height = -2;
                        layoutParams2.bottomMargin = C76577a.m92155f(weCoinRechargeView.getContext(), C0966R.dimen.f3766df);
                        textView2.setTextColor(weCoinRechargeView.getResources().getColor(C0966R.color.f3287m_));
                        textView2.setTextSize(1, 17.0f);
                        textView2.setText(it.next());
                        textView2.setLayoutParams(layoutParams2);
                    }
                    e0Var.mo140663j(linearLayout);
                    e0Var.mo140677w(weCoinRechargeView.getString(C0966R.string.f361647lk3));
                    e0Var.mo140676v(1);
                    e0Var.f296375F = new C12116r2(weCoinRechargeView, e0Var);
                    e0Var.mo140655A();
                    return;
                }
                C87412m.m108603p("mViewModel");
                throw null;
            }
            return;
        }
        C87412m.m108603p("mViewModel");
        throw null;
    }

    /* renamed from: J7 */
    public final void mo6823J7(Boolean bool) {
        Button button = this.f21875r;
        if (button != null) {
            button.setEnabled(true);
            Button button2 = this.f21875r;
            if (button2 != null) {
                button2.setOnClickListener(new C5771e(this));
            } else {
                C87412m.m108603p("mWeCoinRechargeButton");
                throw null;
            }
        } else {
            C87412m.m108603p("mWeCoinRechargeButton");
            throw null;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6335c1;
    }

    public void initView() {
        setContentViewVisibility(0);
        setActionbarColor(getResources().getColor(C0966R.color.f2969az));
        View findViewById = findViewById(C0966R.C0970id.f359583lo2);
        C87412m.m108593f(findViewById, "findViewById(R.id.wecoin_balance_account_ll)");
        this.f21865e = (LinearLayout) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.llp);
        C87412m.m108593f(findViewById2, "findViewById(R.id.we_coin_no_balance_tips_tv)");
        this.f21866f = (TextView) findViewById2;
        View findViewById3 = findViewById(C0966R.C0970id.loj);
        C87412m.m108593f(findViewById3, "findViewById(R.id.wecoin_recharge_banner_ll)");
        this.f21867g = findViewById3;
        View findViewById4 = findViewById(C0966R.C0970id.lln);
        C87412m.m108593f(findViewById4, "findViewById(R.id.we_coin_balance_tv)");
        this.f21874q = (TextView) findViewById4;
        View findViewById5 = findViewById(C0966R.C0970id.lom);
        C87412m.m108593f(findViewById5, "findViewById(R.id.wecoin_switch_device_tips)");
        this.f21876s = (TextView) findViewById5;
        String v = C75228t.m90273v(0);
        try {
            TextView textView = this.f21874q;
            if (textView != null) {
                textView.setTypeface(Typeface.createFromAsset(getContext().getAssets(), v));
                View findViewById6 = findViewById(C0966R.C0970id.ler);
                C87412m.m108593f(findViewById6, "findViewById(R.id.wallet_balance_view)");
                this.f21873p = (WcPayMoneyLoadingView) findViewById6;
                View findViewById7 = findViewById(C0966R.C0970id.lhb);
                C87412m.m108593f(findViewById7, "findViewById(R.id.wallet_money_load_pb)");
                ProgressBar progressBar = (ProgressBar) findViewById7;
                WcPayMoneyLoadingView wcPayMoneyLoadingView = this.f21873p;
                if (wcPayMoneyLoadingView != null) {
                    wcPayMoneyLoadingView.setLoadingPb(progressBar);
                    WcPayMoneyLoadingView wcPayMoneyLoadingView2 = this.f21873p;
                    if (wcPayMoneyLoadingView2 != null) {
                        wcPayMoneyLoadingView2.setPrefixSymbol(getString(C0966R.string.l7o));
                        C39623j lifecycle = getLifecycle();
                        WcPayMoneyLoadingView wcPayMoneyLoadingView3 = this.f21873p;
                        if (wcPayMoneyLoadingView3 != null) {
                            lifecycle.addObserver(wcPayMoneyLoadingView3);
                            View findViewById8 = findViewById(C0966R.C0970id.lo6);
                            C87412m.m108593f(findViewById8, "findViewById(R.id.wecoin_detail_faq_link_ll)");
                            this.f21868h = (LinearLayout) findViewById8;
                            View findViewById9 = findViewById(C0966R.C0970id.lo7);
                            C87412m.m108593f(findViewById9, "findViewById(R.id.wecoin_detail_faq_link_tv)");
                            C85875k4.m106189j0(((TextView) findViewById9).getPaint(), 0.8f);
                            View findViewById10 = findViewById(C0966R.C0970id.lo8);
                            C87412m.m108593f(findViewById10, "findViewById(R.id.wecoin_detail_known_tutorial_LL)");
                            this.f21869i = (LinearLayout) findViewById10;
                            View findViewById11 = findViewById(C0966R.C0970id.lo9);
                            C87412m.m108593f(findViewById11, "findViewById(R.id.wecoin_detail_known_tutorial_tv)");
                            this.f21870j = (TextView) findViewById11;
                            LinearLayout linearLayout = this.f21869i;
                            if (linearLayout != null) {
                                linearLayout.setOnClickListener(new C5767a(this));
                                TextView textView2 = this.f21870j;
                                if (textView2 != null) {
                                    C85875k4.m106189j0(textView2.getPaint(), 0.8f);
                                    View findViewById12 = findViewById(C0966R.C0970id.m96);
                                    C87412m.m108593f(findViewById12, "findViewById<LinearLayou…n_faq_close_info_test_ll)");
                                    this.f21871n = (LinearLayout) findViewById12;
                                    View findViewById13 = findViewById(C0966R.C0970id.m97);
                                    C87412m.m108593f(findViewById13, "findViewById<TextView>(R…n_faq_close_info_test_tv)");
                                    this.f21872o = (TextView) findViewById13;
                                    LinearLayout linearLayout2 = this.f21871n;
                                    if (linearLayout2 != null) {
                                        linearLayout2.setOnClickListener(new C5768b(this));
                                        TextView textView3 = this.f21872o;
                                        if (textView3 != null) {
                                            C85875k4.m106189j0(textView3.getPaint(), 0.8f);
                                            hideActionbarLine();
                                            setBackBtn(new C5769c(this));
                                            setMMTitle("");
                                            View findViewById14 = findViewById(C0966R.C0970id.lok);
                                            C87412m.m108593f(findViewById14, "findViewById(R.id.wecoin_recharge_btn)");
                                            this.f21875r = (Button) findViewById14;
                                            getWindow().getDecorView().post(new C5770d(this));
                                            WcPayMoneyLoadingView wcPayMoneyLoadingView4 = this.f21873p;
                                            if (wcPayMoneyLoadingView4 != null) {
                                                wcPayMoneyLoadingView4.mo99856e("0", false, false);
                                                mo6823J7(Boolean.FALSE);
                                                return;
                                            }
                                            C87412m.m108603p("mBalanceView");
                                            throw null;
                                        }
                                        C87412m.m108603p("mCloseClickTv");
                                        throw null;
                                    }
                                    C87412m.m108603p("mCloseClickLl");
                                    throw null;
                                }
                                C87412m.m108603p("mTutorialClickTv");
                                throw null;
                            }
                            C87412m.m108603p("mTutorialClickLl");
                            throw null;
                        }
                        C87412m.m108603p("mBalanceView");
                        throw null;
                    }
                    C87412m.m108603p("mBalanceView");
                    throw null;
                }
                C87412m.m108603p("mBalanceView");
                throw null;
            }
            C87412m.m108603p("mWeCoinBalanceView");
            throw null;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.WeCoinRechargeView", "setTypeface() Exception:%s", e.getMessage());
        }
    }

    public void onBackPressed() {
        C11831b0 b0Var = this.f21864d;
        if (b0Var != null) {
            b0Var.mo11721d3(8);
            super.onBackPressed();
            return;
        }
        C87412m.m108603p("mViewModel");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
        C51224sc2 sc22 = null;
        C39622i0 a = C39629l0.m42233a(this, (C54209k0.C54210b) null).mo75002a(C11831b0.class);
        C87412m.m108593f(a, "of(this).get(WeCoinRechargeViewModel::class.java)");
        C11831b0 b0Var = (C11831b0) a;
        this.f21864d = b0Var;
        b0Var.f34589d.observe(this, new C12060d2(this));
        C11831b0 b0Var2 = this.f21864d;
        if (b0Var2 != null) {
            b0Var2.f34591f.observe(this, new C12065e2(this));
            C11831b0 b0Var3 = this.f21864d;
            if (b0Var3 != null) {
                b0Var3.f34590e.observe(this, new C12069f2(this));
                C11831b0 b0Var4 = this.f21864d;
                if (b0Var4 != null) {
                    b0Var4.f34593h.observe(this, new C12072g2(this));
                    C11831b0 b0Var5 = this.f21864d;
                    if (b0Var5 != null) {
                        b0Var5.f34592g.observe(this, new C12076h2(this));
                        C11831b0 b0Var6 = this.f21864d;
                        if (b0Var6 != null) {
                            b0Var6.f34595j.observe(this, new C12080i2(this));
                            C11831b0 b0Var7 = this.f21864d;
                            if (b0Var7 != null) {
                                b0Var7.f34594i.observe(this, new C12084j2(this));
                                C11831b0 b0Var8 = this.f21864d;
                                if (b0Var8 != null) {
                                    b0Var8.f34596n.observe(this, new C12088k2(this));
                                    C11831b0 b0Var9 = this.f21864d;
                                    if (b0Var9 != null) {
                                        b0Var9.f34598p.observe(this, new C12092l2(this));
                                        C11831b0 b0Var10 = this.f21864d;
                                        if (b0Var10 != null) {
                                            b0Var10.f34600r.observe(this, new C12055c2(this));
                                            C11831b0 b0Var11 = this.f21864d;
                                            if (b0Var11 != null) {
                                                Log.m105918d("MicroMsg.WeCoinUtils", "load WecoinPageInfoResponse snapshot");
                                                String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WECOIN_PAGE_INFO_RESPONSE_STRING_SYNC, "");
                                                if (!(str == null || str.length() == 0)) {
                                                    C51224sc2 sc23 = new C51224sc2();
                                                    byte[] bytes = str.getBytes(C119027c.f356489b);
                                                    C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
                                                    try {
                                                        sc23.parseFrom(bytes);
                                                        sc22 = sc23;
                                                    } catch (Exception e) {
                                                        Log.printDebugStack("safeParser", "", e);
                                                    }
                                                }
                                                if (sc22 != null) {
                                                    Log.m105924i("MicroMsg.WeCoinRechargeViewModel", "load wecoin page info snapshot");
                                                    C12953c.m12402k("MicroMsg.WeCoinRechargeViewModel", sc22);
                                                    b0Var11.f34591f.postValue(new C11842j(sc22.f141435h, sc22.f141432e));
                                                    b0Var11.f34590e.postValue(Long.valueOf(sc22.f141431d));
                                                    b0Var11.f34592g.postValue(sc22.f141436i);
                                                    b0Var11.f34593h.postValue(sc22.f141433f);
                                                    b0Var11.f34596n.postValue(new C11831b0.C11832a(sc22.f141438n, sc22.f141439o));
                                                    b0Var11.f34594i.postValue(sc22.f141437j);
                                                    b0Var11.f34597o = sc22;
                                                    b0Var11.f34598p.postValue(Boolean.valueOf(((C10756c) C86709a0.m107533q(C10756c.class)).mo10998j3()));
                                                    return;
                                                }
                                                return;
                                            }
                                            C87412m.m108603p("mViewModel");
                                            throw null;
                                        }
                                        C87412m.m108603p("mViewModel");
                                        throw null;
                                    }
                                    C87412m.m108603p("mViewModel");
                                    throw null;
                                }
                                C87412m.m108603p("mViewModel");
                                throw null;
                            }
                            C87412m.m108603p("mViewModel");
                            throw null;
                        }
                        C87412m.m108603p("mViewModel");
                        throw null;
                    }
                    C87412m.m108603p("mViewModel");
                    throw null;
                }
                C87412m.m108603p("mViewModel");
                throw null;
            }
            C87412m.m108603p("mViewModel");
            throw null;
        }
        C87412m.m108603p("mViewModel");
        throw null;
    }

    public void onDestroy() {
        super.onDestroy();
        C11831b0 b0Var = this.f21864d;
        if (b0Var != null) {
            C51224sc2 sc22 = b0Var.f34597o;
            if (sc22 != null) {
                Log.m105918d("MicroMsg.WeCoinUtils", "save WecoinPageInfoResponse snapshot");
                C61926c.m72656A((String) null, new C12958e(sc22));
                return;
            }
            return;
        }
        C87412m.m108603p("mViewModel");
        throw null;
    }

    public void onResume() {
        super.onResume();
        if (this.f21864d != null) {
            Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WECOIN_PAGE_HAS_SHOW_TUTORIAL_BOOLEAN_SYNC, Boolean.FALSE);
            C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.Boolean");
            ((Boolean) f).booleanValue();
            C11831b0 b0Var = this.f21864d;
            if (b0Var != null) {
                C11862y.f34681e.mo11737c(this, new C11837e0(b0Var));
                C11831b0 b0Var2 = this.f21864d;
                if (b0Var2 != null) {
                    b0Var2.mo11720c3(1, 0, "");
                    new C11127j().mo9225i().mo123062e(new C11835d0(b0Var2)).mo11397F(this);
                    return;
                }
                C87412m.m108603p("mViewModel");
                throw null;
            }
            C87412m.m108603p("mViewModel");
            throw null;
        }
        C87412m.m108603p("mViewModel");
        throw null;
    }
}
