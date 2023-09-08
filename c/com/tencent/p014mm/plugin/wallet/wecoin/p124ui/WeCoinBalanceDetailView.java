package com.tencent.p014mm.plugin.wallet.wecoin.p124ui;

import android.os.Parcelable;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet.wecoin.model.WecoinEncashKVData;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/wallet/wecoin/ui/WeCoinBalanceDetailView;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-wxpay_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinBalanceDetailView */
public final class WeCoinBalanceDetailView extends MMActivity {

    /* renamed from: s */
    public static final /* synthetic */ int f117250s = 0;

    /* renamed from: d */
    public ImageView f117251d;

    /* renamed from: e */
    public ImageView f117252e;

    /* renamed from: f */
    public ImageView f117253f;

    /* renamed from: g */
    public TextView f117254g;

    /* renamed from: h */
    public TextView f117255h;

    /* renamed from: i */
    public TextView f117256i;

    /* renamed from: j */
    public TextView f117257j;

    /* renamed from: n */
    public TextView f117258n;

    /* renamed from: o */
    public TextView f117259o;

    /* renamed from: p */
    public LinearLayout f117260p;

    /* renamed from: q */
    public Orders f117261q;

    /* renamed from: r */
    public WecoinEncashKVData f117262r;

    /* renamed from: com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinBalanceDetailView$a */
    public static final class C43363a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ WeCoinBalanceDetailView f117263d;

        public C43363a(WeCoinBalanceDetailView weCoinBalanceDetailView) {
            this.f117263d = weCoinBalanceDetailView;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            WeCoinBalanceDetailView weCoinBalanceDetailView = this.f117263d;
            int i = WeCoinBalanceDetailView.f117250s;
            weCoinBalanceDetailView.mo67559H7(23);
            this.f117263d.finish();
            return false;
        }
    }

    /* renamed from: H7 */
    public final void mo67559H7(int i) {
        String str;
        String str2;
        WecoinEncashKVData wecoinEncashKVData = this.f117262r;
        int i2 = wecoinEncashKVData != null ? wecoinEncashKVData.f21837d : 1;
        String str3 = "";
        if (wecoinEncashKVData == null || (str = wecoinEncashKVData.f21838e) == null) {
            str = str3;
        }
        if (!(wecoinEncashKVData == null || (str2 = wecoinEncashKVData.f21839f) == null)) {
            str3 = str2;
        }
        C115669n.INSTANCE.mo160131h(21655, Integer.valueOf(i2), str, Integer.valueOf(i), str3);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6553i3;
    }

    public void initView() {
        Parcelable parcelableExtra = getIntent().getParcelableExtra("key_orders");
        C87412m.m108591d(parcelableExtra);
        this.f117261q = (Orders) parcelableExtra;
        this.f117262r = (WecoinEncashKVData) getIntent().getParcelableExtra("wecoin_fetch_result_kv_data");
        if (this.f117261q != null) {
            View findViewById = findViewById(C0966R.C0970id.aj8);
            C87412m.m108593f(findViewById, "findViewById(R.id.brdu_state_iv_1)");
            this.f117251d = (ImageView) findViewById;
            View findViewById2 = findViewById(C0966R.C0970id.aj9);
            C87412m.m108593f(findViewById2, "findViewById(R.id.brdu_state_iv_2)");
            this.f117252e = (ImageView) findViewById2;
            View findViewById3 = findViewById(C0966R.C0970id.aj_);
            C87412m.m108593f(findViewById3, "findViewById(R.id.brdu_state_iv_3)");
            this.f117253f = (ImageView) findViewById3;
            ImageView imageView = this.f117251d;
            if (imageView != null) {
                imageView.setImageResource(C0966R.C0969drawable.f4506ej);
                ImageView imageView2 = this.f117252e;
                if (imageView2 != null) {
                    imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    ImageView imageView3 = this.f117252e;
                    if (imageView3 != null) {
                        imageView3.setImageResource(C0966R.raw.remittance_wait);
                        ImageView imageView4 = this.f117253f;
                        if (imageView4 != null) {
                            imageView4.setImageResource(C0966R.C0969drawable.f4507ek);
                            View findViewById4 = findViewById(C0966R.C0970id.aji);
                            C87412m.m108593f(findViewById4, "findViewById(R.id.brdu_state_title_tv_1)");
                            this.f117254g = (TextView) findViewById4;
                            View findViewById5 = findViewById(C0966R.C0970id.ajj);
                            C87412m.m108593f(findViewById5, "findViewById(R.id.brdu_state_title_tv_2)");
                            this.f117255h = (TextView) findViewById5;
                            View findViewById6 = findViewById(C0966R.C0970id.ajk);
                            C87412m.m108593f(findViewById6, "findViewById(R.id.brdu_state_title_tv_3)");
                            this.f117256i = (TextView) findViewById6;
                            TextView textView = this.f117254g;
                            if (textView != null) {
                                textView.setText(C0966R.string.klc);
                                TextView textView2 = this.f117255h;
                                if (textView2 != null) {
                                    textView2.setText(C0966R.string.lj8);
                                    TextView textView3 = this.f117255h;
                                    if (textView3 != null) {
                                        textView3.setTextColor(getResources().getColor(C0966R.color.a7f));
                                        TextView textView4 = this.f117256i;
                                        if (textView4 != null) {
                                            textView4.setText(C0966R.string.lja);
                                            View findViewById7 = findViewById(C0966R.C0970id.aj5);
                                            C87412m.m108593f(findViewById7, "findViewById(R.id.brdu_state_desc_tv_1)");
                                            this.f117257j = (TextView) findViewById7;
                                            View findViewById8 = findViewById(C0966R.C0970id.aj6);
                                            C87412m.m108593f(findViewById8, "findViewById(R.id.brdu_state_desc_tv_2)");
                                            this.f117258n = (TextView) findViewById8;
                                            View findViewById9 = findViewById(C0966R.C0970id.aj7);
                                            C87412m.m108593f(findViewById9, "findViewById(R.id.brdu_state_desc_tv_3)");
                                            this.f117259o = (TextView) findViewById9;
                                            View findViewById10 = findViewById(C0966R.C0970id.aiz);
                                            C87412m.m108593f(findViewById10, "findViewById(R.id.brdu_content_layout)");
                                            this.f117260p = (LinearLayout) findViewById10;
                                            TextView textView5 = this.f117257j;
                                            if (textView5 != null) {
                                                textView5.setVisibility(8);
                                                setActionbarColor(getResources().getColor(C0966R.color.al6));
                                                hideActionbarLine();
                                                setMMTitle((int) C0966R.string.lji);
                                                setBackBtn(new C43363a(this));
                                                return;
                                            }
                                            C87412m.m108603p("mPaymentStateDescTv");
                                            throw null;
                                        }
                                        C87412m.m108603p("mArrivalStateTitleTv");
                                        throw null;
                                    }
                                    C87412m.m108603p("mCftHandleStateTitleTv");
                                    throw null;
                                }
                                C87412m.m108603p("mCftHandleStateTitleTv");
                                throw null;
                            }
                            C87412m.m108603p("mPaymentStateTitleTv");
                            throw null;
                        }
                        C87412m.m108603p("mArrivalState");
                        throw null;
                    }
                    C87412m.m108603p("mCftHandleStateIv");
                    throw null;
                }
                C87412m.m108603p("mCftHandleStateIv");
                throw null;
            }
            C87412m.m108603p("mPaymentStateIv");
            throw null;
        }
        C87412m.m108603p("mOrders");
        throw null;
    }

    public void onBackPressed() {
        mo67559H7(23);
        super.onBackPressed();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r21) {
        /*
            r20 = this;
            r1 = r20
            super.onCreate(r21)
            r20.initView()
            android.widget.TextView r0 = r1.f117258n
            r2 = 0
            java.lang.String r3 = "mCftHandleStateDescTv"
            if (r0 == 0) goto L_0x0209
            com.tencent.mm.plugin.wallet_core.model.Orders r4 = r1.f117261q
            java.lang.String r5 = "mOrders"
            if (r4 == 0) goto L_0x0205
            java.lang.String r4 = r4.f209535F
            r0.setText(r4)
            android.widget.TextView r0 = r1.f117258n
            if (r0 == 0) goto L_0x0201
            r3 = 0
            r0.setVisibility(r3)
            android.widget.TextView r0 = r1.f117259o
            if (r0 == 0) goto L_0x01fb
            r4 = 8
            r0.setVisibility(r4)
            android.widget.LinearLayout r0 = r1.f117260p
            java.lang.String r6 = "mContentLayout"
            if (r0 == 0) goto L_0x01f7
            r7 = 2131231124(0x7f080194, float:1.807832E38)
            r0.setBackgroundResource(r7)
            te3.u80 r0 = new te3.u80
            r0.<init>()
            android.content.Intent r7 = r20.getIntent()
            java.lang.String r8 = "WECOIN_ENCASH_RESULT_PAGE_INFO"
            byte[] r7 = r7.getByteArrayExtra(r8)
            java.lang.String r8 = ""
            r9 = 1
            if (r7 != 0) goto L_0x004c
            goto L_0x005b
        L_0x004c:
            r0.parseFrom(r7)     // Catch:{ Exception -> 0x0050 }
            goto L_0x005c
        L_0x0050:
            r0 = move-exception
            r7 = r0
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r3] = r7
            java.lang.String r7 = "safeParser"
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r7, r8, r0)
        L_0x005b:
            r0 = r2
        L_0x005c:
            if (r0 == 0) goto L_0x0061
            java.util.LinkedList<te3.t80> r7 = r0.f142659f
            goto L_0x0062
        L_0x0061:
            r7 = r2
        L_0x0062:
            if (r7 == 0) goto L_0x009c
            java.util.LinkedList<te3.t80> r7 = r0.f142659f
            int r7 = r7.size()
            if (r7 <= 0) goto L_0x009c
            java.util.LinkedList<te3.t80> r0 = r0.f142659f
            java.util.Iterator r0 = r0.iterator()
        L_0x0072:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0145
            java.lang.Object r5 = r0.next()
            te3.t80 r5 = (te3.C51357t80) r5
            com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchResultItemView r7 = new com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchResultItemView
            r7.<init>((android.content.Context) r1, (boolean) r9)
            java.lang.String r11 = r5.f142028d
            java.lang.String r12 = r5.f142029e
            r15 = 0
            java.lang.String r13 = ""
            java.lang.String r14 = ""
            r10 = r7
            r10.mo67534c(r11, r12, r13, r14, r15)
            android.widget.LinearLayout r5 = r1.f117260p
            if (r5 == 0) goto L_0x0098
            r5.addView(r7)
            goto L_0x0072
        L_0x0098:
            gy3.C87412m.m108603p(r6)
            throw r2
        L_0x009c:
            com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchResultItemView r0 = new com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchResultItemView
            r0.<init>((android.content.Context) r1, (boolean) r9)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r8)
            com.tencent.mm.plugin.wallet_core.model.Orders r8 = r1.f117261q
            if (r8 == 0) goto L_0x01f3
            double r8 = r8.f209566h
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r8 = 2
            java.math.RoundingMode r9 = java.math.RoundingMode.HALF_UP
            java.lang.String r10 = "100"
            java.math.BigDecimal r7 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90248h(r7, r10, r8, r9)
            double r7 = r7.doubleValue()
            r9 = 2131838834(0x7f114772, float:1.9310902E38)
            com.tencent.mm.plugin.wallet_core.model.Orders r10 = r1.f117261q
            if (r10 == 0) goto L_0x01ef
            java.lang.String r5 = r10.f209568j
            java.lang.String r5 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90258m(r7, r5)
            r0.mo67533b(r9, r5)
            android.widget.LinearLayout r5 = r1.f117260p
            if (r5 == 0) goto L_0x01eb
            r5.addView(r0)
            com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchResultItemView r0 = new com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchResultItemView
            r0.<init>((android.content.Context) r1, (boolean) r3)
            r5 = 2131840135(0x7f114c87, float:1.9313541E38)
            java.lang.String r8 = r1.getString(r5)
            r5 = 2131840138(0x7f114c8a, float:1.9313547E38)
            java.lang.String r9 = r1.getString(r5)
            r10 = -1
            android.content.res.Resources r7 = r20.getResources()
            r13 = 2131101248(0x7f060640, float:1.78149E38)
            int r11 = r7.getColor(r13)
            r12 = 0
            r7 = r0
            r7.mo67535d(r8, r9, r10, r11, r12)
            android.widget.LinearLayout r7 = r1.f117260p
            if (r7 == 0) goto L_0x01e7
            r7.addView(r0)
            com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchResultItemView r0 = new com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchResultItemView
            r0.<init>((android.content.Context) r1, (boolean) r3)
            r7 = 2131840139(0x7f114c8b, float:1.931355E38)
            java.lang.String r15 = r1.getString(r7)
            java.lang.String r16 = r1.getString(r5)
            r17 = -1
            android.content.res.Resources r5 = r20.getResources()
            int r18 = r5.getColor(r13)
            r19 = 0
            r14 = r0
            r14.mo67535d(r15, r16, r17, r18, r19)
            android.widget.LinearLayout r5 = r1.f117260p
            if (r5 == 0) goto L_0x01e3
            r5.addView(r0)
            com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchResultItemView r0 = new com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchResultItemView
            r0.<init>((android.content.Context) r1, (boolean) r3)
            r5 = 2131840136(0x7f114c88, float:1.9313543E38)
            r7 = 2131838780(0x7f11473c, float:1.9310793E38)
            java.lang.String r7 = r1.getString(r7)
            r0.mo67533b(r5, r7)
            android.widget.LinearLayout r5 = r1.f117260p
            if (r5 == 0) goto L_0x01df
            r5.addView(r0)
        L_0x0145:
            r0 = 2131298326(0x7f090816, float:1.8214622E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            q53.s r2 = new q53.s
            r2.<init>(r1)
            r0.setOnClickListener(r2)
            r0 = 2131298347(0x7f09082b, float:1.8214665E38)
            android.view.View r0 = r1.findViewById(r0)
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r2.mo10233c(r5)
            java.lang.Object[] r6 = r2.mo10232b()
            java.lang.String r7 = "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinBalanceDetailView"
            java.lang.String r8 = "updateData"
            java.lang.String r9 = "()V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            r5 = r0
            j20.C117292a.m165358d(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setVisibility(r2)
            java.lang.String r6 = "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinBalanceDetailView"
            java.lang.String r7 = "updateData"
            java.lang.String r8 = "()V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
            r0 = 2131298324(0x7f090814, float:1.8214618E38)
            android.view.View r0 = r1.findViewById(r0)
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.mo10233c(r4)
            java.lang.Object[] r6 = r2.mo10232b()
            java.lang.String r7 = "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinBalanceDetailView"
            java.lang.String r8 = "updateData"
            java.lang.String r9 = "()V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            r5 = r0
            j20.C117292a.m165358d(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setVisibility(r2)
            java.lang.String r6 = "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinBalanceDetailView"
            java.lang.String r7 = "updateData"
            java.lang.String r8 = "()V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x01df:
            gy3.C87412m.m108603p(r6)
            throw r2
        L_0x01e3:
            gy3.C87412m.m108603p(r6)
            throw r2
        L_0x01e7:
            gy3.C87412m.m108603p(r6)
            throw r2
        L_0x01eb:
            gy3.C87412m.m108603p(r6)
            throw r2
        L_0x01ef:
            gy3.C87412m.m108603p(r5)
            throw r2
        L_0x01f3:
            gy3.C87412m.m108603p(r5)
            throw r2
        L_0x01f7:
            gy3.C87412m.m108603p(r6)
            throw r2
        L_0x01fb:
            java.lang.String r0 = "mArrivalAccountStateDescTv"
            gy3.C87412m.m108603p(r0)
            throw r2
        L_0x0201:
            gy3.C87412m.m108603p(r3)
            throw r2
        L_0x0205:
            gy3.C87412m.m108603p(r5)
            throw r2
        L_0x0209:
            gy3.C87412m.m108603p(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet.wecoin.p124ui.WeCoinBalanceDetailView.onCreate(android.os.Bundle):void");
    }
}
