package com.tencent.p014mm.plugin.remittance.p098ui;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import nj3.C88989a;
import ob0.C117747y;
import oi2.C77010f;
import p629ny.C76979h;
import st1.C77781t;
import yq3.C79148e;

@C88989a(19)
/* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceResultOldUI */
public class RemittanceResultOldUI extends RemittanceResultUI {

    /* renamed from: i */
    public static final /* synthetic */ int f205188i = 0;

    /* renamed from: e */
    public Orders f205189e;

    /* renamed from: f */
    public int f205190f;

    /* renamed from: g */
    public String f205191g;

    /* renamed from: h */
    public boolean f205192h;

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceResultOldUI$a */
    public class C70844a implements View.OnClickListener {
        public C70844a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/remittance/ui/RemittanceResultOldUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            RemittanceResultOldUI remittanceResultOldUI = RemittanceResultOldUI.this;
            int i = RemittanceResultOldUI.f205188i;
            remittanceResultOldUI.mo97510J7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/remittance/ui/RemittanceResultOldUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceResultOldUI$b */
    public class C70845b implements DialogInterface.OnClickListener {
        public C70845b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            RemittanceResultOldUI remittanceResultOldUI = RemittanceResultOldUI.this;
            int i2 = RemittanceResultOldUI.f205188i;
            remittanceResultOldUI.getProcess().mo91259f(remittanceResultOldUI, remittanceResultOldUI.getInput());
            new MMHandler().postDelayed(new C70938q1(remittanceResultOldUI), 100);
        }
    }

    /* renamed from: H7 */
    public boolean mo97509H7() {
        return false;
    }

    /* renamed from: J7 */
    public final void mo97510J7() {
        if (getInput().containsKey("key_realname_guide_helper")) {
            RealnameGuideHelper realnameGuideHelper = (RealnameGuideHelper) getInput().getParcelable("key_realname_guide_helper");
            if (realnameGuideHelper != null) {
                Bundle bundle = new Bundle();
                bundle.putString("realname_verify_process_jump_activity", ".ui.RemittanceResultUI");
                bundle.putString("realname_verify_process_jump_plugin", "remittance");
                realnameGuideHelper.mo99370a(this, bundle, new C70845b(), (C79148e.C79149a) null);
                getInput().remove("key_realname_guide_helper");
                return;
            }
            return;
        }
        getProcess().mo91259f(this, getInput());
        new MMHandler().postDelayed(new C70938q1(this), 100);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.brv;
    }

    public void initView() {
        String str;
        boolean z;
        List<Orders.Commodity> list;
        Class cls = C76979h.class;
        setMMTitle(getString(C0966R.string.i2z));
        setBackBtn((MenuItem.OnMenuItemClickListener) null);
        showHomeBtn(false);
        enableBackMenu(false);
        TextView textView = (TextView) findViewById(C0966R.C0970id.f356908int);
        Orders orders = this.f205189e;
        if (orders != null) {
            textView.setText(C75228t.m90258m(orders.f209566h, orders.f209568j));
        }
        PayInfo payInfo = (PayInfo) getInput().getParcelable("key_pay_info");
        if (payInfo == null) {
            Log.m105920e("MicroMsg.RemittanceResultOldUI", "payInfo is null!!!");
            finish();
            return;
        }
        Bundle bundle = payInfo.f212600u;
        String str2 = "";
        if (bundle != null) {
            this.f205192h = bundle.getBoolean("extinfo_key_4");
            str = payInfo.f212600u.getString("extinfo_key_1");
        } else {
            str = str2;
        }
        int i = payInfo.f212587e;
        this.f205190f = i;
        this.f205191g = str;
        String r = C75228t.m90268r(str);
        boolean z2 = true;
        if (i == 31) {
            TextView textView2 = (TextView) findViewById(C0966R.C0970id.inv);
            String string = getString(C0966R.string.i2y, new Object[]{r});
            if (!Util.isNullOrNil(string)) {
                textView2.setText(((C76979h) C86312j.m106911c(cls)).yp0(this, string, textView2.getTextSize()));
                textView2.setVisibility(0);
            } else {
                textView2.setVisibility(8);
            }
            View findViewById = findViewById(C0966R.C0970id.inm);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceResultOldUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/remittance/ui/RemittanceResultOldUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (this.f205189e.f209569n > 0.0d) {
                Resources resources = getResources();
                Orders orders2 = this.f205189e;
                ((TextView) findViewById(C0966R.C0970id.azo)).setText(resources.getString(C0966R.string.i2w, new Object[]{C75228t.m90258m(orders2.f209569n, orders2.f209568j)}));
                View findViewById2 = findViewById(C0966R.C0970id.azp);
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(0);
                View view2 = findViewById2;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceResultOldUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/remittance/ui/RemittanceResultOldUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            Bundle bundle2 = payInfo.f212600u;
            if (bundle2 != null) {
                str2 = bundle2.getString("extinfo_key_2");
            }
            if (!(i == 32 || i == 33)) {
                if (!Util.isNullOrNil(str2)) {
                    r = r + "（" + C75228t.m90270s(str2) + "）";
                } else {
                    r = r + getString(C0966R.string.i3h);
                }
            }
            TextView textView3 = (TextView) findViewById(C0966R.C0970id.inv);
            if (!Util.isNullOrNil(r)) {
                textView3.setText(((C76979h) C86312j.m106911c(cls)).yp0(this, getString(C0966R.string.i2x, new Object[]{r}), textView3.getTextSize()));
                textView3.setVisibility(0);
            } else {
                textView3.setVisibility(8);
            }
            if (i == 33 || i == 32) {
                View findViewById3 = findViewById(C0966R.C0970id.inr);
                TextView textView4 = (TextView) findViewById(C0966R.C0970id.ins);
                TextView textView5 = (TextView) findViewById(C0966R.C0970id.inq);
                String string2 = payInfo.f212600u.getString("extinfo_key_3");
                String string3 = payInfo.f212600u.getString("extinfo_key_8");
                if (!Util.isNullOrNil(string2)) {
                    textView5.setText(((C76979h) C86312j.m106911c(cls)).yp0(this, string2, textView5.getTextSize()));
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar3.mo10233c(0);
                    View view3 = findViewById3;
                    C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceResultOldUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/remittance/ui/RemittanceResultOldUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    if (!Util.isNullOrNil(string3)) {
                        textView4.setText(string3);
                    }
                    z = true;
                } else {
                    C9556a aVar4 = new C9556a();
                    ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                    aVar4.mo10233c(8);
                    View view4 = findViewById3;
                    C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceResultOldUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById3.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/remittance/ui/RemittanceResultOldUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    z = false;
                }
                View findViewById4 = findViewById(C0966R.C0970id.ino);
                TextView textView6 = (TextView) findViewById(C0966R.C0970id.inp);
                TextView textView7 = (TextView) findViewById(C0966R.C0970id.inn);
                String string4 = payInfo.f212600u.getString("extinfo_key_6");
                String string5 = payInfo.f212600u.getString("extinfo_key_7");
                if (!Util.isNullOrNil(string5)) {
                    textView7.setText(((C76979h) C86312j.m106911c(cls)).yp0(this, string5, textView7.getTextSize()));
                    textView7.setVisibility(0);
                    if (!Util.isNullOrNil(string4)) {
                        textView6.setText(((C76979h) C86312j.m106911c(cls)).yp0(this, string4, textView6.getTextSize()));
                    }
                } else {
                    C9556a aVar5 = new C9556a();
                    aVar5.mo10233c(8);
                    View view5 = findViewById4;
                    C117292a.m165358d(view5, aVar5.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceResultOldUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById4.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                    C117292a.m165359e(view5, "com/tencent/mm/plugin/remittance/ui/RemittanceResultOldUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    z2 = false;
                }
                if (!z && !z2) {
                    View findViewById5 = findViewById(C0966R.C0970id.inm);
                    C9556a aVar6 = new C9556a();
                    aVar6.mo10233c(8);
                    View view6 = findViewById5;
                    C117292a.m165358d(view6, aVar6.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceResultOldUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById5.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                    C117292a.m165359e(view6, "com/tencent/mm/plugin/remittance/ui/RemittanceResultOldUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else if (i == 5 && (list = this.f205189e.f209542M) != null && ((ArrayList) list).get(0) != null && !TextUtils.isEmpty(((Orders.Commodity) ((ArrayList) this.f205189e.f209542M).get(0)).f209598g)) {
                textView3.setText(((Orders.Commodity) ((ArrayList) this.f205189e.f209542M).get(0)).f209598g);
            }
        }
        ((Button) findViewById(C0966R.C0970id.inu)).setOnClickListener(new C70844a());
        ((C77781t) C86312j.m106911c(C77781t.class)).mo107897LJ(this);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f205189e = (Orders) getInput().getParcelable("key_orders");
        initView();
        if (this.f205190f == 31) {
            String str = ((ArrayList) this.f205189e.f209542M).size() > 0 ? ((Orders.Commodity) ((ArrayList) this.f205189e.f209542M).get(0)).f209606r : "";
            Log.m105925i("MicroMsg.RemittanceResultOldUI", "transId: %s", str);
            C77010f.vx0().xx0().mo97262d(str, this.f205191g, "");
        }
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4) {
            mo97510J7();
        }
        return super.onKeyUp(i, keyEvent);
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        return false;
    }
}
