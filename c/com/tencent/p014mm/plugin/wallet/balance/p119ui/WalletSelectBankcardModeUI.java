package com.tencent.p014mm.plugin.wallet.balance.p119ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import b63.C67176b;
import b63.C67205s0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import ob0.C117747y;
import y43.C79029b0;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletSelectBankcardModeUI */
public class WalletSelectBankcardModeUI extends WalletBaseUI {

    /* renamed from: d */
    public ListView f207866d;

    /* renamed from: e */
    public C71697d f207867e;

    /* renamed from: f */
    public int f207868f = 0;

    /* renamed from: g */
    public int f207869g = 0;

    /* renamed from: h */
    public ArrayList<C71696c> f207870h = new ArrayList<>();

    /* renamed from: i */
    public int f207871i = -1;

    /* renamed from: j */
    public ArrayList<Bankcard> f207872j;

    /* renamed from: n */
    public Bankcard f207873n;

    /* renamed from: o */
    public String f207874o;

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletSelectBankcardModeUI$a */
    public class C71694a implements MenuItem.OnMenuItemClickListener {
        public C71694a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            WalletSelectBankcardModeUI.this.setResult(0);
            WalletSelectBankcardModeUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletSelectBankcardModeUI$b */
    public class C71695b implements AdapterView.OnItemClickListener {
        public C71695b() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/balance/ui/WalletSelectBankcardModeUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            WalletSelectBankcardModeUI walletSelectBankcardModeUI = WalletSelectBankcardModeUI.this;
            walletSelectBankcardModeUI.f207871i = i;
            walletSelectBankcardModeUI.f207867e.notifyDataSetChanged();
            Intent intent = new Intent();
            intent.putExtra("key_select_index", i);
            WalletSelectBankcardModeUI.this.setResult(-1, intent);
            Log.m105924i("MicroMsg.WalletSelectBankcardModeUI", "onItemClick pos is " + i);
            WalletSelectBankcardModeUI.this.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/balance/ui/WalletSelectBankcardModeUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletSelectBankcardModeUI$c */
    public static class C71696c {

        /* renamed from: a */
        public String f207877a = "";

        /* renamed from: b */
        public String f207878b = "";
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletSelectBankcardModeUI$d */
    public class C71697d extends BaseAdapter {
        public C71697d() {
        }

        public int getCount() {
            return WalletSelectBankcardModeUI.this.f207870h.size();
        }

        public Object getItem(int i) {
            return WalletSelectBankcardModeUI.this.f207870h.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View inflate = View.inflate(WalletSelectBankcardModeUI.this, C0966R.C0971layout.cge, (ViewGroup) null);
            C71696c cVar = WalletSelectBankcardModeUI.this.f207870h.get(i);
            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.a7a);
            ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.ja4);
            ((TextView) inflate.findViewById(C0966R.C0970id.a7b)).setText(cVar.f207877a);
            if (!TextUtils.isEmpty(cVar.f207878b)) {
                textView.setVisibility(0);
                textView.setText(cVar.f207878b);
            } else {
                textView.setVisibility(8);
            }
            if (WalletSelectBankcardModeUI.this.f207871i == i) {
                imageView.setImageResource(C0966R.raw.radio_on);
            } else {
                imageView.setImageResource(C0966R.raw.radio_off);
            }
            return inflate;
        }
    }

    public boolean checkProcLife() {
        return false;
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cgd;
    }

    public void initView() {
        Bankcard bankcard;
        setMMTitle((int) C0966R.string.kmg);
        setBackBtn(new C71694a());
        TextView textView = (TextView) findViewById(C0966R.C0970id.lji);
        int i = this.f207868f;
        if (i == 0) {
            textView.setText(C0966R.string.f361613l91);
        } else if (i == 1) {
            textView.setText(C0966R.string.f361614l92);
        }
        this.f207866d = (ListView) findViewById(C0966R.C0970id.lfb);
        C71697d dVar = new C71697d();
        this.f207867e = dVar;
        this.f207866d.setAdapter(dVar);
        this.f207866d.setOnItemClickListener(new C71695b());
        this.f207870h.clear();
        this.f207874o = getString(C0966R.string.km7);
        if (this.f207868f == 0) {
            C67205s0 wx02 = C79029b0.vx0().wx0();
            ArrayList<Bankcard> j = wx02.mo91328j();
            this.f207872j = j;
            int i2 = 0;
            this.f207873n = wx02.mo91329k(j, (String) null, false, true);
            C67176b bVar = wx02.f192958k;
            if (bVar != null) {
                this.f207869g = bVar.f192850c;
                Log.m105920e("MicroMsg.WalletSelectBankcardModeUI", "is_show_charge is " + this.f207869g);
            } else {
                this.f207869g = 0;
                Log.m105920e("MicroMsg.WalletSelectBankcardModeUI", "userInfo.getBalanceFetchInfo() is null");
            }
            ArrayList<Bankcard> arrayList = this.f207872j;
            if (arrayList == null || arrayList.size() <= 0) {
                Log.m105924i("MicroMsg.WalletSelectBankcardModeUI", "hy: no bankcard show new only");
            } else {
                Log.m105924i("MicroMsg.WalletSelectBankcardModeUI", "mBankcardList size is " + this.f207872j.size());
                Iterator<Bankcard> it = this.f207872j.iterator();
                while (it.hasNext()) {
                    Bankcard next = it.next();
                    C71696c cVar = new C71696c();
                    cVar.f207877a = next.field_desc;
                    if (next.field_fetch_charge_rate <= 0.0d || this.f207869g != 1) {
                        Log.m105924i("MicroMsg.WalletSelectBankcardModeUI", "the bank " + next.field_desc + " field_fetch_charge_rate is " + next.field_fetch_charge_rate + " is_show_charge is " + this.f207869g);
                    } else if (!TextUtils.isEmpty(next.field_fetch_charge_info)) {
                        cVar.f207878b = next.field_fetch_charge_info;
                    } else {
                        cVar.f207878b = getString(C0966R.string.kkx) + "" + (next.field_fetch_charge_rate * 100.0d) + "%";
                    }
                    this.f207870h.add(cVar);
                    if (this.f207871i == -1 && (bankcard = this.f207873n) != null && bankcard.equals(next)) {
                        this.f207871i = i2;
                    }
                    i2++;
                }
                if (this.f207871i == -1 && this.f207873n == null) {
                    this.f207871i = i2;
                }
            }
            C71696c cVar2 = new C71696c();
            cVar2.f207877a = this.f207874o;
            cVar2.f207878b = "";
            this.f207870h.add(cVar2);
        }
        this.f207867e.notifyDataSetChanged();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setResult(0);
        this.f207868f = getIntent().getIntExtra("key_scene_select_bankcard_mode_ui", 0);
        this.f207871i = getIntent().getIntExtra("key_select_index", -1);
        Log.m105924i("MicroMsg.WalletSelectBankcardModeUI", "onCreate() mFromScene is " + this.f207868f);
        initView();
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4) {
            setResult(0);
            finish();
        }
        return super.onKeyUp(i, keyEvent);
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        return false;
    }
}
