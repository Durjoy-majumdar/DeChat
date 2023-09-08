package com.tencent.p014mm.plugin.wallet.pay.p121ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import b63.C67188h0;
import b63.C67205s0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C44701a2;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72407o;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72478z;
import com.tencent.p014mm.plugin.wallet_core.utils.C43423i0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.p137ui.C75197d0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletTextView;
import di3.C86312j;
import f40.C86709a0;
import j20.C117292a;
import j53.C46430l;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p206nj.C11171e;
import p281yz.C79173v;
import p629ny.C76979h;
import pj3.C47511g;
import y43.C79029b0;

/* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletPayDeductUI */
public class WalletPayDeductUI extends MMPreference implements View.OnClickListener, C11385n {

    /* renamed from: d */
    public C47511g f208592d;

    /* renamed from: e */
    public Orders f208593e;

    /* renamed from: f */
    public MMSwitchBtn f208594f;

    /* renamed from: g */
    public ArrayList<Preference> f208595g;

    /* renamed from: h */
    public Button f208596h;

    /* renamed from: i */
    public TextView f208597i;

    /* renamed from: j */
    public TextView f208598j;

    /* renamed from: n */
    public TextView f208599n;

    /* renamed from: o */
    public Dialog f208600o = null;

    /* renamed from: p */
    public String f208601p;

    /* renamed from: q */
    public String f208602q;

    /* renamed from: r */
    public Bankcard f208603r;

    /* renamed from: s */
    public LinearLayout f208604s;

    /* renamed from: t */
    public boolean f208605t = false;

    /* renamed from: u */
    public int f208606u = 0;

    /* renamed from: v */
    public String f208607v;

    /* renamed from: w */
    public String f208608w;

    /* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletPayDeductUI$a */
    public class C71912a extends C44701a2 {
        public C71912a() {
        }

        /* renamed from: a */
        public void mo62772a(MenuItem menuItem) {
            WalletPayDeductUI.this.setResult(0);
            WalletPayDeductUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletPayDeductUI$b */
    public class C71913b implements MMSwitchBtn.C7041b {
        public C71913b() {
        }

        public void onStatusChange(boolean z) {
            WalletPayDeductUI.this.mo99109I7(z);
            if (WalletPayDeductUI.this.f208593e != null) {
                C115669n nVar = C115669n.INSTANCE;
                int i = 2;
                Object[] objArr = new Object[2];
                if (z) {
                    i = 1;
                }
                objArr[0] = Integer.valueOf(i);
                objArr[1] = WalletPayDeductUI.this.f208593e.f209563e;
                nVar.mo160131h(15379, objArr);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletPayDeductUI$c */
    public class C71914c implements C72478z.C72479a {

        /* renamed from: a */
        public final /* synthetic */ List f208611a;

        /* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletPayDeductUI$c$a */
        public class C71915a implements C76879j.C76886k {
            public C71915a() {
            }

            /* renamed from: a */
            public void mo97047a(int i) {
                C71914c cVar = C71914c.this;
                WalletPayDeductUI.this.f208603r = (Bankcard) cVar.f208611a.get(i);
                WalletPayDeductUI.this.mo99110J7();
            }
        }

        public C71914c(List list) {
            this.f208611a = list;
        }

        public void onClick(View view) {
            AppCompatActivity context = WalletPayDeductUI.this.getContext();
            List<Bankcard> list = this.f208611a;
            WalletPayDeductUI walletPayDeductUI = WalletPayDeductUI.this;
            String str = walletPayDeductUI.f208601p;
            Bankcard bankcard = walletPayDeductUI.f208603r;
            C71915a aVar = new C71915a();
            LinkedList linkedList = new LinkedList();
            if ((list == null || list.size() == 0) && Util.isNullOrNil((String) null)) {
                Log.m105928w("MicroMsg.WalletDialogHelper", "hy: bankcard list is null and should not show new");
                return;
            }
            int i = 0;
            if (list == null || list.size() == 0) {
                Log.m105924i("MicroMsg.WalletDialogHelper", "hy: no bankcard show new only");
                linkedList.add((Object) null);
            } else {
                int i2 = 0;
                for (Bankcard bankcard2 : list) {
                    linkedList.add(bankcard2.field_desc);
                    if (bankcard != null && bankcard.equals(bankcard2)) {
                        i = i2;
                    }
                    i2++;
                }
                if (!Util.isNullOrNil((String) null)) {
                    linkedList.add((Object) null);
                    if (bankcard == null) {
                        i = i2;
                    }
                }
            }
            C76879j.m92725S(context, str, linkedList, i, (String) null, aVar);
        }
    }

    /* renamed from: H7 */
    public void mo99108H7() {
        ArrayList<Preference> arrayList = this.f208595g;
        if (arrayList != null && arrayList.size() > 0) {
            int size = this.f208595g.size();
            for (int i = 0; i < size; i++) {
                this.f208592d.mo72529n(this.f208595g.get(i).f121285r, false);
            }
            this.f208592d.notifyDataSetChanged();
        }
    }

    /* renamed from: I7 */
    public void mo99109I7(boolean z) {
        if (z) {
            View findViewById = findViewById(16908298);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/wallet/pay/ui/WalletPayDeductUI", "updateCheckBox", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/wallet/pay/ui/WalletPayDeductUI", "updateCheckBox", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (this.f208593e.f209549S.f209620i == 1) {
                this.f208604s.setVisibility(0);
            } else {
                this.f208604s.setVisibility(8);
            }
            mo99108H7();
            if (((C79173v) C86312j.m106911c(C79173v.class)).Ex0().mo91341w()) {
                this.f208597i.setVisibility(8);
                this.f208596h.setText(C0966R.string.krw);
            } else {
                this.f208597i.setVisibility(0);
                this.f208597i.setText(C0966R.string.krv);
                this.f208596h.setText(C0966R.string.krt);
            }
        } else {
            ArrayList<Preference> arrayList = this.f208595g;
            if (arrayList != null && arrayList.size() > 0) {
                int size = this.f208595g.size();
                for (int i = 0; i < size; i++) {
                    this.f208592d.mo72529n(this.f208595g.get(i).f121285r, true);
                }
            }
            View findViewById2 = findViewById(16908298);
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view2 = findViewById2;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/wallet/pay/ui/WalletPayDeductUI", "updateCheckBox", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/wallet/pay/ui/WalletPayDeductUI", "updateCheckBox", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f208604s.setVisibility(8);
            this.f208597i.setVisibility(8);
            this.f208596h.setText(C0966R.string.kru);
        }
        Log.m105924i("MicroMsg.WalletPayDeductUI", "isCheck=" + this.f208594f.f220433y);
    }

    /* renamed from: J7 */
    public final void mo99110J7() {
        C67205s0 wx02 = C79029b0.vx0().wx0();
        if (this.f208603r == null) {
            this.f208603r = wx02.mo91330l((ArrayList<Bankcard>) null, (String) null, true, true, true);
        }
        if (this.f208603r == null) {
            Log.m105924i("MicroMsg.WalletPayDeductUI", "no bank card!");
            finish();
            return;
        }
        SpannableString spannableString = new SpannableString(this.f208603r.field_desc);
        C72478z zVar = new C72478z(getContext());
        zVar.f210835d = new C71914c(C67188h0.m79466a(false));
        spannableString.setSpan(zVar, 0, spannableString.length(), 18);
        this.f208598j.setText(spannableString);
        this.f208598j.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cfv;
    }

    public int getResourceId() {
        return -1;
    }

    public void initView() {
        this.f208597i = (TextView) getContentView().findViewById(C0966R.C0970id.a_c);
        this.f208596h = (Button) getContentView().findViewById(C0966R.C0970id.hfe);
        this.f208604s = (LinearLayout) findViewById(C0966R.C0970id.hsf);
        ((TextView) findViewById(C0966R.C0970id.bzv)).setText(this.f208593e.f209549S.f209615d);
        ((TextView) findViewById(C0966R.C0970id.knx)).setText(((Orders.Commodity) ((ArrayList) this.f208593e.f209542M).get(0)).f209599h);
        WalletTextView walletTextView = (WalletTextView) findViewById(C0966R.C0970id.cy6);
        walletTextView.setTypeface(0);
        walletTextView.setText(C75228t.m90254k(this.f208593e.f209568j));
        ((TextView) findViewById(C0966R.C0970id.cy4)).setText(((Orders.Commodity) ((ArrayList) this.f208593e.f209542M).get(0)).f209601j + "");
        TextView textView = (TextView) findViewById(C0966R.C0970id.edi);
        TextView textView2 = (TextView) findViewById(C0966R.C0970id.bzu);
        if (!Util.isNullOrNil(this.f208593e.f209549S.f209624p)) {
            textView2.setText(this.f208593e.f209549S.f209624p);
            if (!Util.isNullOrNil(this.f208593e.f209549S.f209625q)) {
                textView2.setTextColor(C43423i0.m46931b(this.f208593e.f209549S.f209625q, true));
            }
        } else {
            textView2.setVisibility(8);
        }
        this.f208598j = (TextView) findViewById(C0966R.C0970id.bzx);
        this.f208599n = (TextView) findViewById(C0966R.C0970id.a5m);
        Orders.DeductInfo deductInfo = this.f208593e.f209549S;
        boolean z = deductInfo.f209617f == 1;
        this.f208605t = z;
        this.f208606u = deductInfo.f209621j;
        this.f208607v = deductInfo.f209622n;
        this.f208608w = deductInfo.f209623o;
        Log.m105925i("MicroMsg.WalletPayDeductUI", "open: %s, show_type: %s", Boolean.valueOf(z), Integer.valueOf(this.f208606u));
        if (this.f208606u == 0) {
            MMSwitchBtn mMSwitchBtn = (MMSwitchBtn) findViewById(C0966R.C0970id.bab);
            this.f208594f = mMSwitchBtn;
            mMSwitchBtn.setCheck(this.f208605t);
            this.f208594f.setSwitchListener(new C71913b());
            mo99109I7(this.f208605t);
        } else {
            if (!Util.isNullOrNil(this.f208607v)) {
                this.f208596h.setText(this.f208607v);
            }
            if (!Util.isNullOrNil(this.f208608w)) {
                this.f208597i.setText(this.f208608w);
                this.f208597i.setVisibility(0);
            }
            View findViewById = findViewById(C0966R.C0970id.bzt);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/wallet/pay/ui/WalletPayDeductUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/wallet/pay/ui/WalletPayDeductUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo99108H7();
        }
        Log.m105919d("MicroMsg.WalletPayDeductUI", "show pay way layout: %d", Integer.valueOf(this.f208593e.f209549S.f209620i));
        if (this.f208593e.f209549S.f209620i == 1) {
            C86709a0.m107528h();
            this.f208602q = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_DEDUCT_CHANGE_WORDING_STRING, "");
            C86709a0.m107528h();
            String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_DEDUCT_SELECT_WORDING_STRING, "");
            this.f208601p = str;
            if (Util.isNullOrNil(str) || Util.isNullOrNil(this.f208601p)) {
                Log.m105924i("MicroMsg.WalletPayDeductUI", "need do pay manager");
                this.f208600o = C75197d0.m90164e(getContext(), false, (DialogInterface.OnCancelListener) null);
                C46430l lVar = new C46430l();
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123460f(lVar);
            } else {
                this.f208599n.setText(this.f208602q);
                mo99110J7();
            }
        } else {
            this.f208604s.setVisibility(8);
        }
        if (!Util.isNullOrNil(this.f208593e.f209549S.f209618g)) {
            String string = getString(C0966R.string.krr);
            String string2 = getString(C0966R.string.krs);
            SpannableString T1 = ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(this, getString(C0966R.string.krq, new Object[]{string, string2}));
            C72478z zVar = new C72478z(getContext());
            SpannableString spannableString = new SpannableString(T1);
            spannableString.setSpan(zVar, T1.length() - string2.length(), T1.length(), 33);
            textView.setTextColor(getResources().getColor(C0966R.color.f3563xt));
            textView.setText(spannableString);
            textView.setOnClickListener(this);
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        this.f208596h.setOnClickListener(this);
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet/pay/ui/WalletPayDeductUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int id = view.getId();
        if (id == C0966R.C0970id.hfe) {
            Intent intent = new Intent();
            if (this.f208606u == 0) {
                intent.putExtra("auto_deduct_flag", this.f208594f.f220433y ? 1 : 0);
            } else {
                intent.putExtra("auto_deduct_flag", this.f208593e.f209549S.f209617f);
            }
            Bankcard bankcard = this.f208603r;
            if (bankcard != null) {
                intent.putExtra("deduct_bank_type", bankcard.field_bankcardType);
                intent.putExtra("deduct_bind_serial", this.f208603r.field_bindSerial);
                Log.m105925i("MicroMsg.WalletPayDeductUI", "deduct bankType: %s", this.f208603r.field_bankcardType);
            }
            setResult(-1, intent);
            finish();
        } else if (id == C0966R.C0970id.edi && !Util.isNullOrNil(this.f208593e.f209549S.f209618g)) {
            Intent intent2 = new Intent();
            intent2.putExtra("rawUrl", this.f208593e.f209549S.f209618g);
            intent2.putExtra("showShare", false);
            C75228t.m90217J(getContext(), intent2);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/pay/ui/WalletPayDeductUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f208592d = getPreferenceScreen();
        getSupportActionBar().mo91112w(new ColorDrawable(getResources().getColor(C0966R.color.al6)));
        View j = getSupportActionBar().mo91099j();
        if (j != null) {
            View findViewById = j.findViewById(C0966R.C0970id.c7p);
            if (findViewById != null) {
                findViewById.setBackgroundColor(getResources().getColor(C0966R.color.ahf));
            }
            View findViewById2 = j.findViewById(16908309);
            if (findViewById2 != null && (findViewById2 instanceof TextView)) {
                ((TextView) findViewById2).setTextColor(getResources().getColor(C0966R.color.al6));
            }
        }
        getWindow().addFlags(Integer.MIN_VALUE);
        if (C11171e.m11046c(23)) {
            getWindow().setStatusBarColor(getResources().getColor(C0966R.color.al6));
        } else {
            getWindow().setStatusBarColor(getResources().getColor(C0966R.color.BW_90));
        }
        Intent intent = getIntent();
        if (intent == null) {
            Log.m105920e("MicroMsg.WalletPayDeductUI", "intent is null");
            finish();
            return;
        }
        Orders orders = (Orders) intent.getParcelableExtra("orders");
        this.f208593e = orders;
        if (orders == null || orders.f209549S == null) {
            Log.m105920e("MicroMsg.WalletPayDeductUI", "Orders data or deductInfo is null   : " + this.f208593e);
            finish();
        }
        List<Orders.DeductShowInfo> list = this.f208593e.f209549S.f209619h;
        if (list != null) {
            ArrayList arrayList = (ArrayList) list;
            if (arrayList.size() != 0) {
                if (this.f208595g == null) {
                    int size = arrayList.size();
                    this.f208595g = new ArrayList<>();
                    for (int i = 0; i < size; i++) {
                        Orders.DeductShowInfo deductShowInfo = (Orders.DeductShowInfo) arrayList.get(i);
                        if (deductShowInfo != null && !Util.isNullOrNil(deductShowInfo.f209626d)) {
                            C72407o oVar = new C72407o(this);
                            oVar.mo69924H(deductShowInfo.f209626d);
                            if (deductShowInfo.f209628f > 0) {
                                oVar.f210643L = getResources().getColor(C0966R.color.a1d);
                                String str = deductShowInfo.f209627e;
                                C71958g gVar = new C71958g(this, deductShowInfo);
                                oVar.f210642K = str;
                                oVar.f210644M = true;
                                oVar.f210647Q = gVar;
                            } else {
                                oVar.f210642K = deductShowInfo.f209627e;
                                oVar.f210644M = false;
                            }
                            oVar.mo26273A("deduct_info_" + i);
                            this.f208595g.add(oVar);
                            this.f208592d.mo72527k(oVar);
                            this.f208592d.mo72529n(oVar.f121285r, true);
                        }
                    }
                }
                setResult(0);
                setBackBtn(new C71912a(), C0966R.raw.actionbar_icon_dark_back);
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123455a(385, this);
                initView();
            }
        }
        Log.m105920e("MicroMsg.WalletPayDeductUI", "showinfos is null or length is 0");
        setResult(0);
        setBackBtn(new C71912a(), C0966R.raw.actionbar_icon_dark_back);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(385, this);
        initView();
    }

    public void onDestroy() {
        super.onDestroy();
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(385, this);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        return false;
    }

    public void onResume() {
        super.onResume();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.WalletPayDeductUI", "errType: %d, errCode: %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (!(yVar instanceof C46430l)) {
            Log.m105918d("MicroMsg.WalletPayDeductUI", "other tenpay scene");
        } else if (i == 0 && i2 == 0) {
            C86709a0.m107528h();
            this.f208602q = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_DEDUCT_CHANGE_WORDING_STRING, getString(C0966R.string.l44));
            C86709a0.m107528h();
            this.f208601p = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_DEDUCT_SELECT_WORDING_STRING, getString(C0966R.string.l47));
            this.f208599n.setText(this.f208602q);
            mo99110J7();
        }
        Dialog dialog = this.f208600o;
        if (dialog != null) {
            dialog.dismiss();
        }
    }
}
