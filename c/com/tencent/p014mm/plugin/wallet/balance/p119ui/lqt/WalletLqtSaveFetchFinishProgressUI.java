package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet.balance.p119ui.WalletBalanceFetchResultItemView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import ob0.C117747y;
import te3.C78014xp3;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchFinishProgressUI */
public class WalletLqtSaveFetchFinishProgressUI extends WalletBaseUI {

    /* renamed from: d */
    public ImageView f208120d;

    /* renamed from: e */
    public ImageView f208121e;

    /* renamed from: f */
    public ImageView f208122f;

    /* renamed from: g */
    public TextView f208123g;

    /* renamed from: h */
    public TextView f208124h;

    /* renamed from: i */
    public TextView f208125i;

    /* renamed from: j */
    public TextView f208126j;

    /* renamed from: n */
    public TextView f208127n;

    /* renamed from: o */
    public TextView f208128o;

    /* renamed from: p */
    public LinearLayout f208129p;

    /* renamed from: q */
    public C78014xp3 f208130q;

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchFinishProgressUI$a */
    public class C71758a implements MenuItem.OnMenuItemClickListener {
        public C71758a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            WalletLqtSaveFetchFinishProgressUI.this.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchFinishProgressUI$b */
    public class C71759b implements View.OnClickListener {
        public C71759b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchFinishProgressUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WalletLqtSaveFetchFinishProgressUI.this.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchFinishProgressUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6553i3;
    }

    public void initView() {
        this.f208120d = (ImageView) findViewById(C0966R.C0970id.aj8);
        this.f208121e = (ImageView) findViewById(C0966R.C0970id.aj9);
        this.f208122f = (ImageView) findViewById(C0966R.C0970id.aj_);
        this.f208120d.setImageResource(C0966R.C0969drawable.f4506ej);
        this.f208121e.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f208121e.setImageResource(C0966R.raw.remittance_wait);
        this.f208122f.setImageResource(C0966R.C0969drawable.f4507ek);
        this.f208123g = (TextView) findViewById(C0966R.C0970id.aji);
        this.f208124h = (TextView) findViewById(C0966R.C0970id.ajj);
        this.f208125i = (TextView) findViewById(C0966R.C0970id.ajk);
        this.f208123g.setText(C0966R.string.kxg);
        this.f208124h.setText(this.f208130q.f228526i);
        this.f208124h.setTextColor(getResources().getColor(C0966R.color.a7f));
        this.f208125i.setText(C0966R.string.kl8);
        this.f208126j = (TextView) findViewById(C0966R.C0970id.aj5);
        this.f208127n = (TextView) findViewById(C0966R.C0970id.aj6);
        this.f208128o = (TextView) findViewById(C0966R.C0970id.aj7);
        this.f208126j.setVisibility(8);
        this.f208127n.setText(this.f208130q.f228527j);
        this.f208127n.setVisibility(0);
        this.f208128o.setVisibility(8);
        LinearLayout linearLayout = (LinearLayout) findViewById(C0966R.C0970id.aiz);
        this.f208129p = linearLayout;
        linearLayout.setBackgroundResource(C0966R.C0969drawable.f4505ei);
        WalletBalanceFetchResultItemView walletBalanceFetchResultItemView = new WalletBalanceFetchResultItemView((Context) this, true);
        walletBalanceFetchResultItemView.mo67533b(C0966R.string.kyl, C75228t.m90256l((double) (((float) this.f208130q.f228528n) / 100.0f)));
        this.f208129p.addView(walletBalanceFetchResultItemView);
        if (!Util.isNullOrNil(this.f208130q.f228529o)) {
            C78014xp3 xp32 = this.f208130q;
            String str = xp32.f228529o;
            if (!Util.isNullOrNil(xp32.f228530p)) {
                str = str + " " + getString(C0966R.string.f361600l43) + this.f208130q.f228530p;
            }
            WalletBalanceFetchResultItemView walletBalanceFetchResultItemView2 = new WalletBalanceFetchResultItemView((Context) this, false);
            walletBalanceFetchResultItemView2.mo67533b(C0966R.string.f361572kx1, str);
            this.f208129p.addView(walletBalanceFetchResultItemView2);
        }
        if (!Util.isNullOrNil(this.f208130q.f228531q)) {
            WalletBalanceFetchResultItemView walletBalanceFetchResultItemView3 = new WalletBalanceFetchResultItemView((Context) this, false);
            walletBalanceFetchResultItemView3.mo67533b(C0966R.string.kwx, this.f208130q.f228531q);
            this.f208129p.addView(walletBalanceFetchResultItemView3);
        }
        ((Button) findViewById(C0966R.C0970id.f357572aj2)).setOnClickListener(new C71759b());
        View findViewById = findViewById(C0966R.C0970id.ajm);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view = findViewById;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchFinishProgressUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchFinishProgressUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View findViewById2 = findViewById(C0966R.C0970id.f357570aj0);
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        View view2 = findViewById2;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchFinishProgressUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchFinishProgressUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("key_redeem_res");
        C78014xp3 xp32 = new C78014xp3();
        this.f208130q = xp32;
        try {
            xp32.parseFrom(byteArrayExtra);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WalletLqtSaveFetchFinishProgressUI", e, "parse redeemFundRes error!", new Object[0]);
            finish();
        }
        Object[] objArr = new Object[1];
        C78014xp3 xp33 = this.f208130q;
        if (xp33 != null) {
            str = String.format("status:%s, wording_for_status2:%s, pre_arrive_time_wording:%s, redeem_fee:%s, bank_name:%s, card_tail:%s, failure_wording:%s", new Object[]{Integer.valueOf(xp33.f228525h), xp33.f228526i, xp33.f228527j, Integer.valueOf(xp33.f228528n), xp33.f228529o, xp33.f228530p, xp33.f228531q});
        } else {
            str = "";
        }
        objArr[0] = str;
        Log.m105925i("MicroMsg.WalletLqtSaveFetchFinishProgressUI", "onCreate, redeemRes: %s", objArr);
        getSupportActionBar().mo91112w(new ColorDrawable(getResources().getColor(C0966R.color.al6)));
        View j = getSupportActionBar().mo91099j();
        if (j != null) {
            View findViewById = j.findViewById(C0966R.C0970id.c7p);
            if (findViewById != null) {
                findViewById.setBackgroundColor(getResources().getColor(C0966R.color.f3553xj));
            }
            View findViewById2 = j.findViewById(16908308);
            if (findViewById2 != null && (findViewById2 instanceof TextView)) {
                ((TextView) findViewById2).setTextColor(getResources().getColor(C0966R.color.a7f));
            }
        }
        int i = Build.VERSION.SDK_INT;
        Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(getResources().getColor(C0966R.color.al6));
        if (i >= 23) {
            getWindow().getDecorView().setSystemUiVisibility(8192);
        }
        getContentView().setFitsSystemWindows(true);
        initView();
        showHomeBtn(false);
        enableBackMenu(false);
        setBackBtnVisible(false);
        setMMTitle((int) C0966R.string.f361574kx3);
        setBackBtn(new C71758a());
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        return false;
    }
}
