package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet.balance.p119ui.WalletBalanceFetchResultItemView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import ob0.C117747y;
import te3.C78014xp3;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchFinishProgressNewUI;", "Lcom/tencent/mm/wallet_core/ui/WalletBaseUI;", "<init>", "()V", "plugin-wxpay_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchFinishProgressNewUI */
public final class WalletLqtSaveFetchFinishProgressNewUI extends WalletBaseUI {

    /* renamed from: d */
    public TextView f208115d;

    /* renamed from: e */
    public View f208116e;

    /* renamed from: f */
    public LinearLayout f208117f;

    /* renamed from: g */
    public C78014xp3 f208118g;

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchFinishProgressNewUI$a */
    public static final class C71757a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ WalletLqtSaveFetchFinishProgressNewUI f208119d;

        public C71757a(WalletLqtSaveFetchFinishProgressNewUI walletLqtSaveFetchFinishProgressNewUI) {
            this.f208119d = walletLqtSaveFetchFinishProgressNewUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchFinishProgressNewUI$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f208119d.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchFinishProgressNewUI$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359868b93;
    }

    public void initView() {
        View findViewById = findViewById(C0966R.C0970id.gaa);
        C87412m.m108593f(findViewById, "findViewById(R.id.lqt_fetch_result_finish_title)");
        this.f208115d = (TextView) findViewById;
        C78014xp3 xp32 = this.f208118g;
        if (xp32 != null) {
            if (!Util.isNullOrNil(xp32.f228532r)) {
                Object[] objArr = new Object[1];
                C78014xp3 xp33 = this.f208118g;
                if (xp33 != null) {
                    objArr[0] = xp33.f228532r;
                    Log.m105925i("MicroMsg.WalletLqtSaveFetchFinishProgressNewUI", "redeemFundRes.pre_arrival_time_headline: %s", objArr);
                    TextView textView = this.f208115d;
                    if (textView != null) {
                        C78014xp3 xp34 = this.f208118g;
                        if (xp34 != null) {
                            textView.setText(xp34.f228532r);
                        } else {
                            C87412m.m108603p("redeemFundRes");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                        throw null;
                    }
                } else {
                    C87412m.m108603p("redeemFundRes");
                    throw null;
                }
            } else {
                TextView textView2 = this.f208115d;
                if (textView2 != null) {
                    textView2.setText(getString(C0966R.string.bgm));
                } else {
                    C87412m.m108603p(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                    throw null;
                }
            }
            View findViewById2 = findViewById(C0966R.C0970id.ga8);
            C87412m.m108593f(findViewById2, "findViewById(R.id.lqt_fe…lt_finish_content_layout)");
            this.f208117f = (LinearLayout) findViewById2;
            WalletBalanceFetchResultItemView walletBalanceFetchResultItemView = new WalletBalanceFetchResultItemView((Context) this, true);
            C78014xp3 xp35 = this.f208118g;
            if (xp35 != null) {
                walletBalanceFetchResultItemView.mo67533b(C0966R.string.kyl, C75228t.m90256l((double) (((float) xp35.f228528n) / 100.0f)));
                LinearLayout linearLayout = this.f208117f;
                if (linearLayout != null) {
                    linearLayout.addView(walletBalanceFetchResultItemView);
                    C78014xp3 xp36 = this.f208118g;
                    if (xp36 != null) {
                        if (!Util.isNullOrNil(xp36.f228529o)) {
                            C78014xp3 xp37 = this.f208118g;
                            if (xp37 != null) {
                                String str = xp37.f228529o;
                                if (xp37 != null) {
                                    if (!Util.isNullOrNil(xp37.f228530p)) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(str);
                                        sb.append(" (");
                                        C78014xp3 xp38 = this.f208118g;
                                        if (xp38 != null) {
                                            sb.append(xp38.f228530p);
                                            sb.append(')');
                                            str = sb.toString();
                                        } else {
                                            C87412m.m108603p("redeemFundRes");
                                            throw null;
                                        }
                                    }
                                    WalletBalanceFetchResultItemView walletBalanceFetchResultItemView2 = new WalletBalanceFetchResultItemView((Context) this, false);
                                    walletBalanceFetchResultItemView2.mo67533b(C0966R.string.f361573kx2, str);
                                    LinearLayout linearLayout2 = this.f208117f;
                                    if (linearLayout2 != null) {
                                        linearLayout2.addView(walletBalanceFetchResultItemView2);
                                    } else {
                                        C87412m.m108603p("contentLayout");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("redeemFundRes");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("redeemFundRes");
                                throw null;
                            }
                        }
                        View findViewById3 = findViewById(C0966R.C0970id.ga7);
                        C87412m.m108593f(findViewById3, "findViewById(R.id.lqt_fetch_result_finish_btn)");
                        this.f208116e = findViewById3;
                        findViewById3.setOnClickListener(new C71757a(this));
                        return;
                    }
                    C87412m.m108603p("redeemFundRes");
                    throw null;
                }
                C87412m.m108603p("contentLayout");
                throw null;
            }
            C87412m.m108603p("redeemFundRes");
            throw null;
        }
        C87412m.m108603p("redeemFundRes");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(1024, 1024);
        ActionBar supportActionBar = getSupportActionBar();
        C87412m.m108591d(supportActionBar);
        supportActionBar.mo91104o();
        showHomeBtn(false);
        enableBackMenu(false);
        setBackBtnVisible(false);
        this.mController.mo177105z0(getResources().getColor(C0966R.color.al6));
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("key_redeem_res");
        C78014xp3 xp32 = new C78014xp3();
        this.f208118g = xp32;
        try {
            xp32.parseFrom(byteArrayExtra);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WalletLqtSaveFetchFinishProgressNewUI", e, "parse redeemFundRes error!", new Object[0]);
            finish();
        }
        Object[] objArr = new Object[1];
        C78014xp3 xp33 = this.f208118g;
        if (xp33 != null) {
            String format = String.format("status:%s, wording_for_status2:%s, pre_arrive_time_wording:%s, redeem_fee:%s, bank_name:%s, card_tail:%s, failure_wording:%s", Arrays.copyOf(new Object[]{Integer.valueOf(xp33.f228525h), xp33.f228526i, xp33.f228527j, Integer.valueOf(xp33.f228528n), xp33.f228529o, xp33.f228530p, xp33.f228531q}, 7));
            C87412m.m108593f(format, "format(format, *args)");
            objArr[0] = format;
            Log.m105925i("MicroMsg.WalletLqtSaveFetchFinishProgressNewUI", "onCreate, redeemRes: %s", objArr);
            initView();
            C115669n.INSTANCE.mo160131h(20287, 8);
            return;
        }
        C87412m.m108603p("redeemFundRes");
        throw null;
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        return false;
    }
}
