package com.tencent.p014mm.plugin.wallet.balance.p119ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.p014mm.plugin.wallet_core.model.C72192a;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import j20.C117292a;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import nj3.C88989a;
import ob0.C117747y;
import org.json.JSONArray;
import org.json.JSONException;
import yq3.C79148e;

@C88989a(19)
/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchResultUI */
public class WalletBalanceFetchResultUI extends WalletBaseUI {

    /* renamed from: d */
    public ImageView f207690d;

    /* renamed from: e */
    public ImageView f207691e;

    /* renamed from: f */
    public ImageView f207692f;

    /* renamed from: g */
    public TextView f207693g;

    /* renamed from: h */
    public TextView f207694h;

    /* renamed from: i */
    public TextView f207695i;

    /* renamed from: j */
    public TextView f207696j;

    /* renamed from: n */
    public TextView f207697n;

    /* renamed from: o */
    public TextView f207698o;

    /* renamed from: p */
    public LinearLayout f207699p;

    /* renamed from: q */
    public Orders f207700q;

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchResultUI$a */
    public class C71663a implements MenuItem.OnMenuItemClickListener {
        public C71663a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            WalletBalanceFetchResultUI.m84140H7(WalletBalanceFetchResultUI.this);
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchResultUI$b */
    public class C71664b implements View.OnClickListener {
        public C71664b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceFetchResultUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WalletBalanceFetchResultUI.m84140H7(WalletBalanceFetchResultUI.this);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceFetchResultUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: H7 */
    public static void m84140H7(WalletBalanceFetchResultUI walletBalanceFetchResultUI) {
        if (walletBalanceFetchResultUI.getInput().containsKey("key_realname_guide_helper")) {
            RealnameGuideHelper realnameGuideHelper = (RealnameGuideHelper) walletBalanceFetchResultUI.getInput().getParcelable("key_realname_guide_helper");
            if (realnameGuideHelper != null) {
                Bundle bundle = new Bundle();
                bundle.putString("realname_verify_process_jump_activity", ".balance.ui.WalletBalanceResultUI");
                bundle.putString("realname_verify_process_jump_plugin", "wallet");
                realnameGuideHelper.mo99370a(walletBalanceFetchResultUI, bundle, new C71698a(walletBalanceFetchResultUI), (C79148e.C79149a) null);
                walletBalanceFetchResultUI.getInput().remove("key_realname_guide_helper");
                return;
            }
            return;
        }
        walletBalanceFetchResultUI.getProcess().mo91264o(walletBalanceFetchResultUI, 0, walletBalanceFetchResultUI.getInput());
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6553i3;
    }

    public void initView() {
        this.f207690d = (ImageView) findViewById(C0966R.C0970id.aj8);
        this.f207691e = (ImageView) findViewById(C0966R.C0970id.aj9);
        this.f207692f = (ImageView) findViewById(C0966R.C0970id.aj_);
        this.f207690d.setImageResource(C0966R.C0969drawable.f4506ej);
        this.f207691e.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f207691e.setImageResource(C0966R.raw.remittance_wait);
        this.f207692f.setImageResource(C0966R.C0969drawable.f4507ek);
        this.f207693g = (TextView) findViewById(C0966R.C0970id.aji);
        this.f207694h = (TextView) findViewById(C0966R.C0970id.ajj);
        this.f207695i = (TextView) findViewById(C0966R.C0970id.ajk);
        this.f207693g.setText(C0966R.string.klc);
        this.f207694h.setText(C0966R.string.kla);
        this.f207694h.setTextColor(getResources().getColor(C0966R.color.a7f));
        this.f207695i.setText(C0966R.string.kl8);
        this.f207696j = (TextView) findViewById(C0966R.C0970id.aj5);
        this.f207697n = (TextView) findViewById(C0966R.C0970id.aj6);
        this.f207698o = (TextView) findViewById(C0966R.C0970id.aj7);
        this.f207696j.setVisibility(8);
        this.f207697n.setText(getString(C0966R.string.kkz, new Object[]{new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date(this.f207700q.f209534E))}));
        this.f207697n.setVisibility(0);
        this.f207698o.setVisibility(8);
        LinearLayout linearLayout = (LinearLayout) findViewById(C0966R.C0970id.aiz);
        this.f207699p = linearLayout;
        linearLayout.setBackgroundResource(C0966R.C0969drawable.f4505ei);
        String string = getInput().getString("key_fetch_result_show_info");
        ArrayList arrayList = new ArrayList();
        if (!Util.isNullOrNil(string)) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                for (int i = 0; i < jSONArray.length(); i++) {
                    C72192a a = C72192a.m84570a(jSONArray.optJSONObject(i));
                    if (a != null) {
                        arrayList.add(a);
                    }
                }
            } catch (JSONException e) {
                Log.printErrStackTrace("MicroMsg.WalletBalanceFetchResultUI", e, "", new Object[0]);
            }
        }
        Log.m105919d("MicroMsg.WalletBalanceFetchResultUI", "show info: %s", Integer.valueOf(arrayList.size()));
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C72192a aVar = (C72192a) it.next();
                if (aVar.f209713b != null) {
                    WalletBalanceFetchResultItemView walletBalanceFetchResultItemView = new WalletBalanceFetchResultItemView((Context) this, aVar.f209712a != 3);
                    Orders.ShowInfo showInfo = aVar.f209713b;
                    walletBalanceFetchResultItemView.mo67534c(showInfo.f209698d, showInfo.f209699e, showInfo.f209700f, showInfo.f209701g, aVar.f209712a == 3);
                    this.f207699p.addView(walletBalanceFetchResultItemView);
                }
            }
        } else {
            WalletBalanceFetchResultItemView walletBalanceFetchResultItemView2 = new WalletBalanceFetchResultItemView((Context) this, true);
            Orders orders = this.f207700q;
            walletBalanceFetchResultItemView2.mo67533b(C0966R.string.f361536km3, C75228t.m90258m(orders.f209566h, orders.f209568j));
            this.f207699p.addView(walletBalanceFetchResultItemView2);
            if (this.f207700q.f209569n > 0.0d) {
                WalletBalanceFetchResultItemView walletBalanceFetchResultItemView3 = new WalletBalanceFetchResultItemView((Context) this, true);
                Orders orders2 = this.f207700q;
                walletBalanceFetchResultItemView3.mo67533b(C0966R.string.klv, C75228t.m90258m(orders2.f209569n, orders2.f209568j));
                this.f207699p.addView(walletBalanceFetchResultItemView3);
            }
            List<Orders.Commodity> list = this.f207700q.f209542M;
            if (list != null && ((ArrayList) list).size() > 0) {
                Orders.Commodity commodity = (Orders.Commodity) ((ArrayList) this.f207700q.f209542M).get(0);
                String str = commodity.f209607s;
                if (!Util.isNullOrNil(commodity.f209612x)) {
                    str = str + " " + getString(C0966R.string.f361600l43) + commodity.f209612x;
                }
                WalletBalanceFetchResultItemView walletBalanceFetchResultItemView4 = new WalletBalanceFetchResultItemView((Context) this, false);
                walletBalanceFetchResultItemView4.mo67533b(C0966R.string.kkv, str);
                this.f207699p.addView(walletBalanceFetchResultItemView4);
            }
        }
        ((Button) findViewById(C0966R.C0970id.f357572aj2)).setOnClickListener(new C71664b());
        View findViewById = findViewById(C0966R.C0970id.ajm);
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar2.mo10233c(8);
        View view = findViewById;
        C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceFetchResultUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceFetchResultUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View findViewById2 = findViewById(C0966R.C0970id.f357570aj0);
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(8);
        View view2 = findViewById2;
        C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceFetchResultUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceFetchResultUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
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
        Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(getResources().getColor(C0966R.color.al6));
        getContentView().setFitsSystemWindows(true);
        Orders orders = (Orders) getInput().getParcelable("key_orders");
        this.f207700q = orders;
        if (orders == null) {
            Log.m105928w("MicroMsg.WalletBalanceFetchResultUI", "order is null!");
            finish();
            return;
        }
        initView();
        setMMTitle((String) getNetController().mo91282a(0));
        setBackBtn(new C71663a());
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        return false;
    }
}
