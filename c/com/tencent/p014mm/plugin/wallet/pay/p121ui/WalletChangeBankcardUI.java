package com.tencent.p014mm.plugin.wallet.pay.p121ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import b63.C67185g;
import b63.C67188h0;
import c53.C67341a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.WalletGetUserInfoEvent;
import com.tencent.p014mm.autogen.events.WalletOfflineSetCardSerialEvent;
import com.tencent.p014mm.autogen.events.WalletRealNameResultNotifyEvent;
import com.tencent.p014mm.autogen.events.WalletRealNameResultNotifyMoreEvent;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet.pay.p121ui.C71950a;
import com.tencent.p014mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.p014mm.plugin.wallet_core.model.Authen;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72379f1;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72404n;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72473y;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75136r0;
import com.tencent.p014mm.wallet_core.model.C75155x0;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import d53.C75326b;
import f40.C86709a0;
import f53.C75687f;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C117747y;
import vt1.C78473a;
import y43.C79029b0;
import y43.C79033l;
import yq3.C79143a;
import yq3.C79148e;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletChangeBankcardUI */
public class WalletChangeBankcardUI extends WalletBaseUI implements C71950a.C71952b {

    /* renamed from: z */
    public static final /* synthetic */ int f208532z = 0;

    /* renamed from: d */
    public ListView f208533d;

    /* renamed from: e */
    public TextView f208534e;

    /* renamed from: f */
    public Button f208535f;

    /* renamed from: g */
    public C72379f1 f208536g;

    /* renamed from: h */
    public ArrayList<Bankcard> f208537h;

    /* renamed from: i */
    public int f208538i = 0;

    /* renamed from: j */
    public int f208539j;

    /* renamed from: n */
    public Bankcard f208540n = null;

    /* renamed from: o */
    public C72473y f208541o = null;

    /* renamed from: p */
    public Authen f208542p = null;

    /* renamed from: q */
    public Orders f208543q = null;

    /* renamed from: r */
    public PayInfo f208544r = null;

    /* renamed from: s */
    public String f208545s = null;

    /* renamed from: t */
    public String f208546t;

    /* renamed from: u */
    public FavorPayInfo f208547u;

    /* renamed from: v */
    public C71950a f208548v;

    /* renamed from: w */
    public C72404n f208549w = null;

    /* renamed from: x */
    public IListener f208550x = new IListener<WalletRealNameResultNotifyEvent>(C40008f.f107254d) {
        {
            this.__eventId = 323604482;
        }

        public boolean callback(IEvent iEvent) {
            WalletRealNameResultNotifyEvent walletRealNameResultNotifyEvent = (WalletRealNameResultNotifyEvent) iEvent;
            Log.m105925i("MicroMsg.WalletChangeBankcardUI", "realnameNotifyListener %s", Integer.valueOf(walletRealNameResultNotifyEvent.f9603d.f9604a));
            WalletGetUserInfoEvent walletGetUserInfoEvent = new WalletGetUserInfoEvent();
            int i = walletRealNameResultNotifyEvent.f9603d.f9604a;
            if (i == -1) {
                walletGetUserInfoEvent.f194038d.f194040a = 17;
            } else if (i == 0) {
                walletGetUserInfoEvent.f194038d.f194040a = 18;
            } else {
                walletGetUserInfoEvent.f194038d.f194040a = 0;
            }
            walletGetUserInfoEvent.f194039e.f194055a = new C71954c(this, walletRealNameResultNotifyEvent);
            walletGetUserInfoEvent.publish();
            return false;
        }
    };

    /* renamed from: y */
    public boolean f208551y = false;

    /* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletChangeBankcardUI$a */
    public class C71896a implements View.OnClickListener {
        public C71896a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/pay/ui/WalletChangeBankcardUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WalletChangeBankcardUI.this.mo99093M7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/pay/ui/WalletChangeBankcardUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletChangeBankcardUI$b */
    public class C71897b implements AdapterView.OnItemClickListener {
        public C71897b() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/pay/ui/WalletChangeBankcardUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            WalletChangeBankcardUI.this.mo99092L7(i);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/pay/ui/WalletChangeBankcardUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletChangeBankcardUI$c */
    public class C71898c implements View.OnClickListener {
        public C71898c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/pay/ui/WalletChangeBankcardUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WalletChangeBankcardUI.this.dispatchKeyEvent(new KeyEvent(1, 4));
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/pay/ui/WalletChangeBankcardUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletChangeBankcardUI$d */
    public class C71899d implements C72379f1.C72388f {
        public C71899d() {
        }

        /* renamed from: a */
        public void mo96337a(String str, FavorPayInfo favorPayInfo, boolean z) {
            WalletChangeBankcardUI walletChangeBankcardUI = WalletChangeBankcardUI.this;
            if (walletChangeBankcardUI.f208551y) {
                Log.m105928w("MicroMsg.WalletChangeBankcardUI", "has receive cancel");
                C115669n.INSTANCE.mo175913w(965, 3, 1);
                return;
            }
            walletChangeBankcardUI.f208547u = favorPayInfo;
            walletChangeBankcardUI.getInput().putParcelable("key_favor_pay_info", WalletChangeBankcardUI.this.f208547u);
            WalletChangeBankcardUI walletChangeBankcardUI2 = WalletChangeBankcardUI.this;
            FavorPayInfo favorPayInfo2 = walletChangeBankcardUI2.f208547u;
            if (favorPayInfo2 == null || !z) {
                walletChangeBankcardUI2.f208546t = str;
                walletChangeBankcardUI2.hideVKB();
                WalletChangeBankcardUI.this.mo99088H7(str);
                WalletChangeBankcardUI.this.f208549w = null;
                return;
            }
            if (favorPayInfo2 != null) {
                walletChangeBankcardUI2.mo99089I7(true);
                WalletChangeBankcardUI walletChangeBankcardUI3 = WalletChangeBankcardUI.this;
                walletChangeBankcardUI3.f208541o.mo99881b(walletChangeBankcardUI3.f208537h, false);
            }
            C72379f1 f1Var = WalletChangeBankcardUI.this.f208536g;
            if (f1Var != null) {
                f1Var.dismiss();
            }
            WalletChangeBankcardUI.this.mo99095O7();
            WalletChangeBankcardUI.this.setContentViewVisibility(0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletChangeBankcardUI$e */
    public class C71900e extends C7089c0 {
        public C71900e() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            C72379f1 f1Var = WalletChangeBankcardUI.this.f208536g;
            if (f1Var != null) {
                f1Var.dismiss();
            }
            WalletChangeBankcardUI.this.mo99089I7(false);
            WalletChangeBankcardUI walletChangeBankcardUI = WalletChangeBankcardUI.this;
            walletChangeBankcardUI.f208541o.mo99881b(walletChangeBankcardUI.f208537h, true);
            WalletChangeBankcardUI.this.f208547u = (FavorPayInfo) view.getTag();
            WalletChangeBankcardUI walletChangeBankcardUI2 = WalletChangeBankcardUI.this;
            FavorPayInfo favorPayInfo = walletChangeBankcardUI2.f208547u;
            if (favorPayInfo != null) {
                favorPayInfo.f209528h = "";
            }
            walletChangeBankcardUI2.getInput().putParcelable("key_favor_pay_info", WalletChangeBankcardUI.this.f208547u);
            WalletChangeBankcardUI.this.mo99095O7();
            WalletChangeBankcardUI.this.setContentViewVisibility(0);
            WalletChangeBankcardUI.this.f208549w = null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletChangeBankcardUI$f */
    public class C71901f implements DialogInterface.OnCancelListener {
        public C71901f() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            Log.m105925i("MicroMsg.WalletChangeBankcardUI", "WalletPwdDialog event2 %s", Util.getStack().toString());
            WalletChangeBankcardUI.this.f208551y = true;
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
            WalletChangeBankcardUI walletChangeBankcardUI = WalletChangeBankcardUI.this;
            walletChangeBankcardUI.f208546t = null;
            if (walletChangeBankcardUI.getContentView().getVisibility() != 0) {
                WalletChangeBankcardUI walletChangeBankcardUI2 = WalletChangeBankcardUI.this;
                walletChangeBankcardUI2.cancelQRPay();
                C79148e g = C79143a.m95768g(walletChangeBankcardUI2);
                if (g != null) {
                    g.mo91259f(walletChangeBankcardUI2, walletChangeBankcardUI2.getInput());
                } else {
                    walletChangeBankcardUI2.finish();
                }
            }
            WalletChangeBankcardUI.this.f208549w = null;
        }
    }

    /* renamed from: C4 */
    public void mo99087C4(boolean z, String str, String str2) {
        Log.m105924i("MicroMsg.WalletChangeBankcardUI", "onGenFinish callback");
        if (z) {
            Log.m105924i("MicroMsg.WalletChangeBankcardUI", "onGenFinish callback, result.isSuccess is true");
            PayInfo payInfo = this.f208544r;
            payInfo.f212570A = str;
            payInfo.f212571B = str2;
            mo99088H7(this.f208546t);
            return;
        }
        Log.m105920e("MicroMsg.WalletChangeBankcardUI", "onGenFinish callback, result.isSuccess is false");
        mo99088H7(this.f208546t);
    }

    /* renamed from: H7 */
    public void mo99088H7(String str) {
        this.f208542p.f209369f = str;
        boolean z = getInput().getBoolean("key_has_click_bind_new_card", false);
        int i = getInput().getInt("key_pay_flag");
        if (z && i == 3) {
            Log.m105924i("MicroMsg.WalletChangeBankcardUI", "fix authen flag after bind card fail");
            this.f208542p.f209367d = 3;
        }
        if (this.f208540n != null) {
            getInput().putString("key_mobile", this.f208540n.field_mobile);
            getInput().putParcelable("key_bankcard", this.f208540n);
            Authen authen = this.f208542p;
            Bankcard bankcard = this.f208540n;
            authen.f209371h = bankcard.field_bindSerial;
            authen.f209370g = bankcard.field_bankcardType;
            FavorPayInfo favorPayInfo = this.f208547u;
            if (favorPayInfo != null) {
                authen.f209355H = favorPayInfo.f209524d;
            } else {
                authen.f209355H = null;
            }
            Orders orders = this.f208543q;
            C79033l lVar = orders.f209543N;
            if (lVar != null) {
                authen.f209354G = lVar.f232071g;
            }
            if (orders != null && orders.f209567i == 3) {
                if (bankcard.mo99390p2()) {
                    this.f208542p.f209367d = 3;
                } else {
                    this.f208542p.f209367d = 6;
                }
                getInput().putBoolean("key_is_oversea", !this.f208540n.mo99390p2());
            }
        }
        getInput().putString("key_pwd1", str);
        getInput().putParcelable("key_authen", this.f208542p);
        C75326b a = C67341a.m79678a(this.f208542p, this.f208543q, false);
        if (a != null) {
            a.setProcessName("PayProcess");
            a.setProcessBundle(getInput());
            PayInfo payInfo = this.f208544r;
            int i2 = payInfo.f212587e;
            if (i2 == 6 && payInfo.f212588f == 100) {
                a.setScene(100);
            } else {
                a.setScene(i2);
            }
            doSceneProgress(a);
        }
    }

    /* renamed from: I7 */
    public void mo99089I7(boolean z) {
        PayInfo payInfo = this.f208544r;
        boolean z2 = true;
        this.f208537h = mo99091K7((payInfo == null || payInfo.f212587e == 11) ? false : true);
        FavorPayInfo favorPayInfo = this.f208547u;
        if (favorPayInfo != null) {
            if (favorPayInfo.f209525e == 0) {
                z2 = false;
            }
            if (z2 && z) {
                String str = favorPayInfo.f209526f;
                ArrayList<Bankcard> arrayList = new ArrayList<>();
                for (int i = 0; i < this.f208537h.size(); i++) {
                    Bankcard bankcard = this.f208537h.get(i);
                    if (Util.isNullOrNil(str)) {
                        if (!bankcard.field_bankcardType.equalsIgnoreCase("CFT")) {
                            arrayList.add(bankcard);
                        }
                    } else if (bankcard.field_bankcardType.equals(str)) {
                        arrayList.add(bankcard);
                    }
                }
                this.f208537h = arrayList;
            }
        }
    }

    /* renamed from: J7 */
    public C72473y mo99090J7() {
        return new C72473y(this, this.f208537h, this.f208539j, this.f208543q);
    }

    /* renamed from: K7 */
    public ArrayList<Bankcard> mo99091K7(boolean z) {
        return this.f208538i == 8 ? C67188h0.m79466a(true) : C67188h0.m79466a(false);
    }

    /* renamed from: L7 */
    public void mo99092L7(int i) {
        ArrayList<Bankcard> arrayList = this.f208537h;
        int i2 = 0;
        int size = arrayList != null ? arrayList.size() : 0;
        Log.m105925i("MicroMsg.WalletChangeBankcardUI", "on select bankcard: %s, %s", Integer.valueOf(i), Integer.valueOf(size));
        ArrayList<Bankcard> arrayList2 = this.f208537h;
        String str = "";
        if (arrayList2 != null && i < size) {
            Bankcard bankcard = arrayList2.get(i);
            this.f208540n = bankcard;
            PayInfo payInfo = this.f208544r;
            if (payInfo != null) {
                i2 = payInfo.f212587e;
            }
            if (payInfo != null) {
                str = payInfo.f212592j;
            }
            C75155x0.m90135a(i2, str, 13, bankcard.field_bindSerial);
            this.f208541o.f210821h = bankcard.field_bindSerial;
            this.f208535f.setEnabled(true);
            this.f208541o.notifyDataSetChanged();
            mo99093M7();
        } else if (size == i) {
            C67185g a = C67185g.m79463a();
            if (a.mo91288b()) {
                C76879j.m92748s(this, a.f192891b, getString(C0966R.string.a3h));
                return;
            }
            PayInfo payInfo2 = this.f208544r;
            if (payInfo2 != null) {
                i2 = payInfo2.f212587e;
            }
            C75155x0.m90135a(i2, payInfo2 == null ? str : payInfo2.f212592j, 14, str);
            getInput().putInt("key_err_code", -1003);
            getInput().putBoolean("key_has_click_bind_new_card", true);
            C79143a.m95765d(this, getInput());
        }
    }

    /* renamed from: M7 */
    public void mo99093M7() {
        Log.m105924i("MicroMsg.WalletChangeBankcardUI", "pay with old bankcard!");
        getInput().getString("key_pwd1");
        this.f208551y = false;
        setContentViewVisibility(4);
        C72379f1 t = C72379f1.m84719t(this, true, this.f208543q, this.f208547u, this.f208540n, this.f208544r, (String) null, new C71899d(), new C71900e(), new C71901f());
        this.f208536g = t;
        this.f208549w = t;
    }

    /* renamed from: N7 */
    public final void mo99094N7(int i) {
        if (-1 == i) {
            C79148e g = C79143a.m95768g(this);
            if (g != null) {
                g.mo91257c(this, 1);
            } else {
                finish();
            }
            WalletRealNameResultNotifyMoreEvent walletRealNameResultNotifyMoreEvent = new WalletRealNameResultNotifyMoreEvent();
            walletRealNameResultNotifyMoreEvent.f9605d.f9606a = i;
            walletRealNameResultNotifyMoreEvent.publish();
        }
    }

    /* renamed from: O7 */
    public void mo99095O7() {
        this.f208534e = (TextView) findViewById(C0966R.C0970id.f7w);
        FavorPayInfo favorPayInfo = this.f208547u;
        if (favorPayInfo != null && !Util.isNullOrNil(favorPayInfo.f209528h)) {
            this.f208534e.setVisibility(0);
            this.f208534e.setText(this.f208547u.f209528h);
        } else if (getInput().getInt("key_main_bankcard_state", 0) != 0) {
            this.f208534e.setVisibility(0);
            this.f208534e.setText(this.f208545s);
        } else {
            this.f208534e.setVisibility(8);
        }
    }

    public void cleanUiData(int i) {
        if (i == 0) {
            cancelQRPay();
            C79148e g = C79143a.m95768g(this);
            if (g != null) {
                g.mo91259f(this, getInput());
            } else {
                finish();
            }
        } else if (i == 1) {
            getInput().putString("key_pwd1", "");
            mo99093M7();
        } else {
            Log.m105928w("MicroMsg.WalletChangeBankcardUI", "hy: clean ui data not handled");
        }
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ce_;
    }

    public void initView() {
        Button button = (Button) findViewById(C0966R.C0970id.f358908hs0);
        this.f208535f = button;
        button.setEnabled(false);
        this.f208535f.setOnClickListener(new C71896a());
        if (Util.isNullOrNil(getInput().getString("key_pwd1"))) {
            this.f208535f.setText(C0966R.string.a18);
        } else {
            this.f208535f.setText(C0966R.string.l5u);
        }
        this.f208533d = (ListView) findViewById(C0966R.C0970id.jeo);
        C72473y J7 = mo99090J7();
        this.f208541o = J7;
        this.f208533d.setAdapter(J7);
        this.f208533d.setOnItemClickListener(new C71897b());
        ImageView imageView = (ImageView) findViewById(C0966R.C0970id.lei);
        imageView.setClickable(true);
        imageView.setOnClickListener(new C71898c());
        C85875k4.m106189j0(((TextView) findViewById(C0966R.C0970id.ljj)).getPaint(), 0.8f);
        mo99095O7();
    }

    public boolean isTransparent() {
        boolean z;
        if (super.isTransparent()) {
            return true;
        }
        PayInfo payInfo = this.f208544r;
        if (payInfo != null && (z = payInfo.f212590h)) {
            if (z) {
                return true;
            }
            C79029b0.vx0().wx0().mo91341w();
        }
        return false;
    }

    public boolean needConfirmFinish() {
        return true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Log.m105925i("MicroMsg.WalletChangeBankcardUI", "onActivityResult %d %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i == 1) {
            mo99094N7(-1);
        }
    }

    public void onCreate(Bundle bundle) {
        C72473y yVar;
        List<Orders.Commodity> list;
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.f361615l93);
        Bundle input = getInput();
        input.putInt("key_err_code", 0);
        this.f208539j = input.getInt("key_support_bankcard", 1);
        this.f208542p = (Authen) input.getParcelable("key_authen");
        this.f208543q = (Orders) input.getParcelable("key_orders");
        this.f208544r = (PayInfo) input.getParcelable("key_pay_info");
        this.f208547u = (FavorPayInfo) input.getParcelable("key_favor_pay_info");
        PayInfo payInfo = this.f208544r;
        int i = payInfo == null ? 0 : payInfo.f212587e;
        this.f208538i = i;
        Log.m105925i("MicroMsg.WalletChangeBankcardUI", "pay_scene %d", Integer.valueOf(i));
        if (getInput().getBoolean("key_is_filter_bank_type")) {
            mo99089I7(true);
        } else {
            PayInfo payInfo2 = this.f208544r;
            this.f208537h = mo99091K7((payInfo2 == null || payInfo2.f212587e == 11) ? false : true);
        }
        Orders orders = this.f208543q;
        if (!(orders == null || (list = orders.f209542M) == null || ((ArrayList) list).size() <= 0)) {
            Orders orders2 = this.f208543q;
            this.f208545s = getString(C0966R.string.kqn, new Object[]{C75228t.m90258m(orders2.f209566h, orders2.f209568j), ((Orders.Commodity) ((ArrayList) this.f208543q.f209542M).get(0)).f209599h});
        }
        initView();
        C75136r0.m90122d(7, 0);
        this.f208550x.alive();
        if (getInput().getBoolean("key_is_filter_bank_type") && (yVar = this.f208541o) != null) {
            yVar.f210823j = false;
        }
    }

    public void onDestroy() {
        C71950a aVar = this.f208548v;
        if (aVar != null) {
            aVar.mo99166a();
            C71950a aVar2 = this.f208548v;
            aVar2.f208718c = null;
            aVar2.f208717b = null;
        }
        this.f208550x.dead();
        this.f208549w = null;
        super.onDestroy();
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4 && this.f208547u != null && this.f208537h.size() == 0) {
            FavorPayInfo favorPayInfo = this.f208547u;
            int i2 = 0;
            if ((favorPayInfo == null || favorPayInfo.f209525e == 0) ? false : true) {
                Log.m105924i("MicroMsg.WalletChangeBankcardUI", "favor need bankcard bind but usr cancel");
                String string = getInput().getString("key_is_cur_bankcard_bind_serial");
                if (Util.isNullOrNil(string)) {
                    Log.m105920e("MicroMsg.WalletChangeBankcardUI", "curBankcardBindSerial null & finish");
                    return super.onKeyUp(i, keyEvent);
                }
                ArrayList<Bankcard> K7 = mo99091K7(true);
                if (this.f208540n == null) {
                    while (true) {
                        if (i2 >= K7.size()) {
                            break;
                        } else if (string.equals(K7.get(i2).field_bindSerial)) {
                            Log.m105924i("MicroMsg.WalletChangeBankcardUI", "get cur bankcard, bind_serial:" + string);
                            this.f208540n = K7.get(i2);
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (this.f208540n == null) {
                        Log.m105920e("MicroMsg.WalletChangeBankcardUI", "mDefaultBankcard still null & finish");
                        return super.onKeyUp(i, keyEvent);
                    }
                }
                mo99093M7();
                return true;
            }
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void onPause() {
        super.onPause();
        C72404n nVar = this.f208549w;
        if (nVar != null) {
            nVar.onActivityPause();
        }
    }

    public boolean onProgressFinish() {
        return true;
    }

    public void onResume() {
        getInput().putInt("key_err_code", 0);
        super.onResume();
        C72404n nVar = this.f208549w;
        if (nVar != null) {
            nVar.mo99670a();
        }
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Class cls = C78473a.class;
        boolean z = false;
        if (i != 0 || i2 != 0) {
            Bundle bundle = new Bundle();
            bundle.putString("pwd", this.f208546t);
            getInput().putBoolean("key_need_verify_sms", false);
            ((C78473a) C86709a0.m107533q(cls)).mo107920vu(this.f208542p.f209382v.f212603x == 1, true, bundle);
            switch (i2) {
                case 100000:
                case 100001:
                case 100102:
                    this.f208544r.f212574E = i2;
                    mo99093M7();
                    return true;
                case 100100:
                case 100101:
                    PayInfo payInfo = this.f208544r;
                    payInfo.f212574E = i2;
                    if (i2 == 100100) {
                        z = true;
                    }
                    if (this.f208548v == null) {
                        this.f208548v = new C71950a(this, this);
                    }
                    this.f208548v.mo99167b(z, payInfo.f212572C, payInfo.f212592j);
                    Log.m105924i("MicroMsg.WalletChangeBankcardUI", "mRegenFingerPrintRsaKey.genRsaKey isGenRsa is " + z);
                    return true;
            }
        } else if (yVar instanceof C75687f) {
            return true;
        } else {
            if (yVar instanceof C75326b) {
                Bundle input = getInput();
                C75326b bVar = (C75326b) yVar;
                if (!Util.isNullOrNil(this.f208546t)) {
                    input.putString("key_pwd1", this.f208546t);
                }
                input.putString("kreq_token", bVar.f221494D);
                input.putParcelable("key_authen", bVar.f221493C);
                input.putBoolean("key_need_verify_sms", !bVar.f221491A);
                input.putParcelable("key_pay_info", this.f208544r);
                input.putInt("key_pay_flag", 3);
                input.putInt("key_can_verify_tail", bVar.f221497G);
                input.putString("key_verify_tail_wording", bVar.f221498H);
                RealnameGuideHelper realnameGuideHelper = bVar.f222394s;
                getInput().putBoolean("key_block_bind_new_card", bVar.f221499I == 1);
                if (Util.isNullOrNil(bVar.f221495E)) {
                    input.putString("key_mobile", this.f208540n.field_mobile);
                } else {
                    input.putString("key_mobile", bVar.f221495E);
                }
                input.putString("key_QADNA_URL", bVar.f221496F);
                if (realnameGuideHelper != null) {
                    input.putParcelable("key_realname_guide_helper", realnameGuideHelper);
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("pwd", this.f208546t);
                C78473a aVar = (C78473a) C86709a0.m107533q(cls);
                bundle2.putInt("key_open_biometric_type", aVar.mo107880J3() ? 1 : aVar.mo107883Zi() ? 2 : 0);
                if (bVar.f221493C.f209382v.f212603x == 1) {
                    z = true;
                }
                aVar.mo107920vu(z, true, bundle2);
                if (bVar.isPaySuccess) {
                    input.putParcelable("key_orders", bVar.f221492B);
                    PayInfo payInfo2 = this.f208544r;
                    if (payInfo2 != null && payInfo2.f212587e == 8) {
                        WalletOfflineSetCardSerialEvent walletOfflineSetCardSerialEvent = new WalletOfflineSetCardSerialEvent();
                        walletOfflineSetCardSerialEvent.f79051d.f79052a = this.f208542p.f209371h;
                        walletOfflineSetCardSerialEvent.publish();
                    }
                }
                C79143a.m95765d(this, input);
                return true;
            }
        }
        return false;
    }
}
