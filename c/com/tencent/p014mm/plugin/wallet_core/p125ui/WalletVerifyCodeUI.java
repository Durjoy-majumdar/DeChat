package com.tencent.p014mm.plugin.wallet_core.p125ui;

import al3.C0086a;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import b63.C67189i;
import b63.C67210w;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.model.Authen;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;
import com.tencent.p014mm.plugin.wallet_core.utils.C72517z;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75102b0;
import com.tencent.p014mm.wallet_core.model.C75140t0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;
import com.tencent.thumbplayer.tmediacodec.codec.CodecError;
import eb0.C75592q0;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76879j;
import nj3.C76912y0;
import nj3.C88989a;
import ob0.C117747y;
import qo3.C77389a;
import qo3.C77398g;
import yq3.C79143a;
import yq3.C79148e;

@C88989a(19)
/* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI */
public class WalletVerifyCodeUI extends WalletBaseUI implements WalletFormView.C75209c {

    /* renamed from: d */
    public int f210304d = CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;

    /* renamed from: e */
    public WalletFormView f210305e = null;

    /* renamed from: f */
    public Button f210306f;

    /* renamed from: g */
    public Button f210307g;

    /* renamed from: h */
    public PayInfo f210308h;

    /* renamed from: i */
    public String f210309i;

    /* renamed from: j */
    public Authen f210310j;

    /* renamed from: n */
    public String f210311n;

    /* renamed from: o */
    public boolean f210312o = false;

    /* renamed from: p */
    public C5788k f210313p = null;

    /* renamed from: q */
    public TextView f210314q;

    /* renamed from: r */
    public TextView f210315r;

    /* renamed from: s */
    public boolean f210316s = false;

    /* renamed from: t */
    public boolean f210317t = true;

    /* renamed from: u */
    public C67189i f210318u = new C67189i();

    /* renamed from: v */
    public C75102b0.C75103a f210319v = new C72329j();

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI$k */
    public class C5788k extends CountDownTimer {
        public C5788k(long j, long j2) {
            super(j, j2);
        }

        public void onFinish() {
            WalletVerifyCodeUI.this.f210306f.setClickable(true);
            WalletVerifyCodeUI.this.f210306f.setEnabled(true);
            WalletVerifyCodeUI walletVerifyCodeUI = WalletVerifyCodeUI.this;
            walletVerifyCodeUI.f210306f.setText(walletVerifyCodeUI.getString(C0966R.string.l_q));
        }

        public void onTick(long j) {
            Button button = WalletVerifyCodeUI.this.f210306f;
            button.setText(WalletVerifyCodeUI.this.getString(C0966R.string.l_q) + "(" + (j / 1000) + ")");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI$a */
    public class C72317a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Bankcard f210320d;

        /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI$a$a */
        public class C72318a implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ int f210322d;

            public C72318a(int i) {
                this.f210322d = i;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                WalletVerifyCodeUI.this.mo99649J7();
                C115669n.INSTANCE.mo160131h(15443, 2, 1, Integer.valueOf(this.f210322d));
            }
        }

        /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI$a$b */
        public class C72319b implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ int f210324d;

            public C72319b(int i) {
                this.f210324d = i;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Bundle input = WalletVerifyCodeUI.this.getInput();
                input.putInt("key_err_code", 417);
                input.putBoolean("key_need_show_switch_phone", true);
                Bankcard bankcard = C72317a.this.f210320d;
                input.putBoolean("key_isbalance", bankcard == null || bankcard.mo99388n2());
                C79143a.m95765d(WalletVerifyCodeUI.this, input);
                C115669n.INSTANCE.mo160131h(15443, 2, 2, Integer.valueOf(this.f210324d));
            }
        }

        public C72317a(Bankcard bankcard) {
            this.f210320d = bankcard;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletVerifyCodeUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C79148e process = WalletVerifyCodeUI.this.getProcess();
            if (!WalletVerifyCodeUI.this.f210317t || process == null || !"PayProcess".equals(process.mo91258e())) {
                WalletVerifyCodeUI.this.mo99649J7();
            } else {
                Bankcard bankcard = this.f210320d;
                int i = bankcard != null ? bankcard.mo99388n2() ? 1 : this.f210320d.mo99393s2() ? 3 : 2 : 0;
                AppCompatActivity context = WalletVerifyCodeUI.this.getContext();
                C77389a aVar = new C77389a();
                aVar.f225644a = C0086a.m38a(context).getString(C0966R.string.l_a);
                WalletVerifyCodeUI walletVerifyCodeUI = WalletVerifyCodeUI.this;
                aVar.f225660q = walletVerifyCodeUI.getString(C0966R.string.l__, new Object[]{walletVerifyCodeUI.mo99648I7()});
                aVar.f225668y = true;
                aVar.f225663t = C0086a.m38a(context).getString(C0966R.string.l_9);
                aVar.f225664u = C0086a.m38a(context).getString(C0966R.string.l_8);
                aVar.f225620C = new C72318a(i);
                aVar.f225621D = new C72319b(i);
                C77398g gVar = new C77398g(context, C0966R.style.a66);
                gVar.mo107525e(aVar);
                gVar.show();
                C115669n.INSTANCE.mo160131h(15443, 1);
                WalletVerifyCodeUI.this.f210317t = false;
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletVerifyCodeUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI$b */
    public class C72320b implements DialogInterface.OnClickListener {
        public C72320b(WalletVerifyCodeUI walletVerifyCodeUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI$c */
    public class C72321c implements View.OnClickListener {
        public C72321c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletVerifyCodeUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WalletVerifyCodeUI.this.hideVKB();
            WalletVerifyCodeUI walletVerifyCodeUI = WalletVerifyCodeUI.this;
            C75102b0.C75103a aVar = walletVerifyCodeUI.f210319v;
            boolean z = false;
            if (walletVerifyCodeUI.f210316s) {
                Log.m105924i("MicroMsg.WalletVertifyCodeUI", "isCertInstalled passed");
            } else {
                C67189i iVar = walletVerifyCodeUI.f210318u;
                int i = iVar.f192900a;
                if ((i == 1) && iVar.f192903d == 0) {
                    Log.m105925i("MicroMsg.WalletVertifyCodeUI", "tryToinstallCert isBlockInstall %s", aVar);
                    if (!Util.isNullOrNil(walletVerifyCodeUI.f210305e.getText())) {
                        C115669n.INSTANCE.mo160131h(13731, 6);
                        walletVerifyCodeUI.doSceneProgress(new C75102b0(walletVerifyCodeUI.f210305e.getText(), walletVerifyCodeUI.getPayReqKey(), aVar, true, C75140t0.m90124c().f221094f));
                    } else {
                        Log.m105925i("MicroMsg.WalletVertifyCodeUI", "tryToinstallCert isBlockInstall sms error %s", aVar);
                    }
                } else {
                    if (i == 1) {
                        Log.m105925i("MicroMsg.WalletVertifyCodeUI", "tryToinstallCert isNeedInstall %s", aVar);
                        C115669n.INSTANCE.mo160131h(13731, 6);
                        walletVerifyCodeUI.doSceneProgress(new C75102b0(walletVerifyCodeUI.f210305e.getText(), walletVerifyCodeUI.getPayReqKey(), aVar, false, C75140t0.m90124c().f221094f));
                    } else {
                        Log.m105924i("MicroMsg.WalletVertifyCodeUI", "no need installcert");
                    }
                }
                z = true;
            }
            if (z) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletVerifyCodeUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            WalletVerifyCodeUI.this.mo99647H7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletVerifyCodeUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI$d */
    public class C72322d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Bankcard f210327d;

        public C72322d(Bankcard bankcard) {
            this.f210327d = bankcard;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletVerifyCodeUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("MicroMsg.WalletVertifyCodeUI", "hy: user clicked on the reset info tv and is balance. ");
            Log.m105924i("MicroMsg.WalletVertifyCodeUI", "forwardProcess and finish!");
            Bundle input = WalletVerifyCodeUI.this.getInput();
            input.putInt("key_err_code", 417);
            boolean z = true;
            input.putBoolean("key_need_show_switch_phone", true);
            WalletVerifyCodeUI.this.getInput().putBoolean("key_block_bind_new_card", true);
            Bankcard bankcard = this.f210327d;
            if (bankcard != null && !bankcard.mo99388n2()) {
                z = false;
            }
            input.putBoolean("key_isbalance", z);
            C79143a.m95765d(WalletVerifyCodeUI.this, input);
            WalletVerifyCodeUI.this.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletVerifyCodeUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI$e */
    public class C72323e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Bankcard f210329d;

        /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI$e$a */
        public class C72324a implements DialogInterface.OnClickListener {
            public C72324a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Log.m105924i("MicroMsg.WalletVertifyCodeUI", "forwardProcess2 and finish to reset mobile num!");
                Bundle input = WalletVerifyCodeUI.this.getInput();
                input.putInt("key_err_code", 408);
                C79143a.m95765d(WalletVerifyCodeUI.this, input);
                WalletVerifyCodeUI.this.finish();
            }
        }

        public C72323e(Bankcard bankcard) {
            this.f210329d = bankcard;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletVerifyCodeUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WalletVerifyCodeUI walletVerifyCodeUI = WalletVerifyCodeUI.this;
            Bankcard bankcard = this.f210329d;
            C76879j.m92707A(walletVerifyCodeUI, walletVerifyCodeUI.getString(C0966R.string.l4r, new Object[]{bankcard.field_desc, bankcard.field_mobile}), "", WalletVerifyCodeUI.this.getString(C0966R.string.l4q), WalletVerifyCodeUI.this.getString(C0966R.string.f7926wf), new C72324a(), (DialogInterface.OnClickListener) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletVerifyCodeUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI$f */
    public class C72325f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Bankcard f210332d;

        public C72325f(Bankcard bankcard) {
            this.f210332d = bankcard;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletVerifyCodeUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("MicroMsg.WalletVertifyCodeUI", "hy: user clicked on the reset info tv and is balance. ");
            Log.m105924i("MicroMsg.WalletVertifyCodeUI", "forwardProcess3 and finish!");
            C67189i iVar = WalletVerifyCodeUI.this.f210318u;
            boolean z = false;
            if (iVar != null) {
                if (iVar.f192901b != 0 && !Util.isNullOrNil(iVar.f192902c)) {
                    C115669n.INSTANCE.mo160131h(13731, 9);
                }
            }
            Bundle input = WalletVerifyCodeUI.this.getInput();
            input.putInt("key_err_code", 417);
            input.putBoolean("key_need_show_switch_phone", true);
            Bankcard bankcard = this.f210332d;
            if (bankcard == null || bankcard.mo99388n2()) {
                z = true;
            }
            input.putBoolean("key_isbalance", z);
            C79143a.m95765d(WalletVerifyCodeUI.this, input);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletVerifyCodeUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI$g */
    public class C72326g implements View.OnClickListener {
        public C72326g() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletVerifyCodeUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WalletVerifyCodeUI walletVerifyCodeUI = WalletVerifyCodeUI.this;
            if (walletVerifyCodeUI.f210311n == null) {
                walletVerifyCodeUI.f210311n = "";
            }
            String format = String.format(C75592q0.m90763K() ? walletVerifyCodeUI.getString(C0966R.string.l_g) : walletVerifyCodeUI.getString(C0966R.string.l_f), new Object[]{walletVerifyCodeUI.f210311n});
            LayoutInflater layoutInflater = (LayoutInflater) walletVerifyCodeUI.getContext().getSystemService("layout_inflater");
            TextView textView = (TextView) layoutInflater.inflate(C0966R.C0971layout.azz, (ViewGroup) null);
            int dimensionPixelSize = layoutInflater.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3895i6);
            textView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            textView.setText(format);
            C76879j.m92752w(walletVerifyCodeUI.getContext(), walletVerifyCodeUI.getString(C0966R.string.l_h), walletVerifyCodeUI.getString(C0966R.string.ktq), textView, new C72425r1(walletVerifyCodeUI));
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletVerifyCodeUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI$h */
    public class C72327h implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f210335d;

        public C72327h(String str) {
            this.f210335d = str;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C75228t.m90219L(WalletVerifyCodeUI.this.getContext(), this.f210335d, false);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI$i */
    public class C72328i implements MenuItem.OnMenuItemClickListener {
        public C72328i() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            WalletVerifyCodeUI.this.hideVKB();
            if (WalletVerifyCodeUI.this.needConfirmFinish()) {
                WalletVerifyCodeUI.this.showDialog(1000);
                return false;
            }
            WalletVerifyCodeUI.this.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI$j */
    public class C72329j implements C75102b0.C75103a {
        public C72329j() {
        }

        /* renamed from: a */
        public void mo99663a(C117747y yVar, boolean z) {
            if (z) {
                WalletVerifyCodeUI.this.mo99647H7();
            }
        }
    }

    /* renamed from: H7 */
    public void mo99647H7() {
        Bundle input = getInput();
        String string = getInput().getString("key_pwd1");
        this.f210309i = this.f210305e.getText();
        C67210w wVar = new C67210w();
        wVar.f192984b = string;
        wVar.f192996n = this.f210308h;
        wVar.f192985c = this.f210309i;
        wVar.f192986d = Util.nullAs(getInput().getString("kreq_token"), "");
        Bankcard bankcard = (Bankcard) input.getParcelable("key_bankcard");
        if (bankcard != null) {
            wVar.f192987e = bankcard.field_bankcardType;
            wVar.f192988f = bankcard.field_bindSerial;
            wVar.f192990h = Util.nullAs(bankcard.field_arrive_type, "");
        } else {
            String string2 = getInput().getString("key_bank_type");
            wVar.f192987e = string2;
            if (Util.isNullOrNil(string2)) {
                wVar.f192987e = getInput().getString("key_bind_card_type", "");
            }
        }
        String string3 = input.getString("key_bind_card_user_token", (String) null);
        if (!Util.isNullOrNil(string3)) {
            wVar.f192997o = 1;
            wVar.f192998p = string3;
        }
        Log.m105918d("MicroMsg.WalletVertifyCodeUI", "payInfo " + wVar.f192996n + " mVerifyCode: " + this.f210309i);
        input.putString("key_verify_code", this.f210309i);
        C79143a.m95768g(this);
        boolean d = getNetController().mo91271d(this.f210309i, wVar);
        Log.m105924i("MicroMsg.WalletVertifyCodeUI", "do verify result : " + d);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0016, code lost:
        r1 = (com.tencent.p014mm.plugin.wallet_core.model.Bankcard) getInput().getParcelable("key_bankcard");
     */
    /* renamed from: I7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo99648I7() {
        /*
            r3 = this;
            android.os.Bundle r0 = r3.getInput()
            java.lang.String r1 = "key_mobile"
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r1 = ""
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r1)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 == 0) goto L_0x0026
            android.os.Bundle r1 = r3.getInput()
            java.lang.String r2 = "key_bankcard"
            android.os.Parcelable r1 = r1.getParcelable(r2)
            com.tencent.mm.plugin.wallet_core.model.Bankcard r1 = (com.tencent.p014mm.plugin.wallet_core.model.Bankcard) r1
            if (r1 == 0) goto L_0x0026
            java.lang.String r0 = r1.field_mobile
        L_0x0026:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet_core.p125ui.WalletVerifyCodeUI.mo99648I7():java.lang.String");
    }

    /* renamed from: J7 */
    public void mo99649J7() {
        Log.m105924i("MicroMsg.WalletVertifyCodeUI", "get verify code!");
        C115669n nVar = C115669n.INSTANCE;
        int i = 2;
        Object[] objArr = new Object[2];
        PayInfo payInfo = this.f210308h;
        objArr[0] = Integer.valueOf((payInfo == null || payInfo.f212587e == 0) ? 2 : 1);
        if (!this.f210312o) {
            i = 1;
        }
        objArr[1] = Integer.valueOf(i);
        nVar.mo160131h(10706, objArr);
        this.f210312o = true;
        this.f210306f.setClickable(false);
        this.f210306f.setEnabled(false);
        C5788k kVar = this.f210313p;
        if (kVar != null) {
            kVar.cancel();
            this.f210313p = null;
        }
        C5788k kVar2 = new C5788k((long) this.f210304d, 1000);
        this.f210313p = kVar2;
        kVar2.start();
        if (!getNetController().mo91281f(this.f210309i) && !resend(false)) {
            Authen authen = (Authen) getInput().getParcelable("key_authen");
            this.f210310j = authen;
            if (authen == null) {
                Log.m105928w("MicroMsg.WalletVertifyCodeUI", "error authen is null");
            } else {
                C72517z.m84857e();
            }
        }
    }

    /* renamed from: K7 */
    public final void mo99650K7() {
        Bankcard bankcard = (Bankcard) getInput().getParcelable("key_bankcard");
        String I7 = mo99648I7();
        if (Util.isNullOrNil(I7) && bankcard != null) {
            I7 = bankcard.field_mobile;
            getInput().putString("key_mobile", I7);
        }
        this.f210315r.setText(getString(C0966R.string.l6e, new Object[]{I7}));
        CharSequence tips = getTips(0);
        if (!Util.isNullOrNil(tips)) {
            this.f210314q.setText(tips);
            return;
        }
        this.f210314q.setText(String.format(getString(C0966R.string.l_b), new Object[]{I7}));
    }

    public void finish() {
        Log.m105925i("MicroMsg.WalletVertifyCodeUI", "do finish: %s", Util.getStack());
        super.finish();
    }

    public boolean getCancelable() {
        return false;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cgq;
    }

    public void initView() {
        C79148e g = C79143a.m95768g(this);
        Bankcard bankcard = (Bankcard) getInput().getParcelable("key_bankcard");
        this.f210314q = (TextView) findViewById(C0966R.C0970id.a__);
        this.f210315r = (TextView) findViewById(C0966R.C0970id.a_a);
        WalletFormView walletFormView = (WalletFormView) findViewById(C0966R.C0970id.a9x);
        this.f210305e = walletFormView;
        walletFormView.setOnInputValidChangeListener(this);
        Button button = (Button) findViewById(C0966R.C0970id.epb);
        this.f210306f = button;
        button.setOnClickListener(new C72317a(bankcard));
        Button button2 = (Button) findViewById(C0966R.C0970id.a9u);
        this.f210307g = button2;
        button2.setOnClickListener(new C72321c());
        mo99650K7();
        this.f210306f.setClickable(false);
        this.f210306f.setEnabled(false);
        C5788k kVar = this.f210313p;
        if (kVar != null) {
            kVar.cancel();
            this.f210313p = null;
        }
        C5788k kVar2 = new C5788k((long) this.f210304d, 1000);
        this.f210313p = kVar2;
        kVar2.start();
        TextView textView = (TextView) findViewById(C0966R.C0970id.a_9);
        boolean z = getInput().getBoolean("key_is_changing_balance_phone_num");
        boolean z2 = getInput().getBoolean("key_need_show_switch_phone", false);
        if (!z || z2) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        PayInfo payInfo = (PayInfo) getInput().getParcelable("key_pay_info");
        int i = payInfo != null ? payInfo.f212587e : 0;
        if (z2) {
            textView.setText(C0966R.string.l_h);
            textView.setOnClickListener(new C72322d(bankcard));
        } else {
            if (g != null) {
                if (!(!(g.f232423c.getInt("key_pay_flag", 0) == 3) || i == 11 || i == 21)) {
                    if (bankcard.mo99388n2() || bankcard.mo99393s2()) {
                        String string = getInput().getString("key_verify_tail_wording", getString(C0966R.string.l_h));
                        if (Util.isNullOrNil(string)) {
                            string = getString(C0966R.string.l_h);
                        }
                        textView.setText(string);
                        textView.setOnClickListener(new C72325f(bankcard));
                    } else {
                        textView.setOnClickListener(new C72323e(bankcard));
                    }
                }
            }
            textView.setText(C75592q0.m90763K() ? getString(C0966R.string.l_e) : getString(C0966R.string.l_d));
            textView.setOnClickListener(new C72326g());
        }
        this.f210305e.requestFocus();
        String string2 = getInput().getString("key_QADNA_URL");
        if (!Util.isNullOrNil(string2)) {
            addIconOptionMenu(0, C0966R.C0969drawable.cf_, new C72327h(string2));
        }
        setBackBtn(new C72328i());
    }

    public boolean needConfirmFinish() {
        boolean booleanExtra = getIntent().getBooleanExtra("key_need_confirm_finish", false);
        PayInfo payInfo = this.f210308h;
        if ((payInfo == null || !payInfo.f212590h) && !booleanExtra) {
            return super.needConfirmFinish();
        }
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105924i("MicroMsg.WalletVertifyCodeUI", "on create");
        setMMTitle((int) C0966R.string.l_t);
        this.f210308h = (PayInfo) getInput().getParcelable("key_pay_info");
        Orders orders = (Orders) getInput().getParcelable("key_orders");
        this.f210311n = getInput().getString("key_bank_phone");
        this.f210318u = new C67189i(getInput());
        this.f210312o = false;
        initView();
        C115669n nVar = C115669n.INSTANCE;
        int i = 2;
        Object[] objArr = new Object[2];
        PayInfo payInfo = this.f210308h;
        objArr[0] = Integer.valueOf((payInfo == null || payInfo.f212587e == 0) ? 2 : 1);
        if (!this.f210312o) {
            i = 1;
        }
        objArr[1] = Integer.valueOf(i);
        nVar.mo160131h(10706, objArr);
        C72517z.m84857e();
        C72517z.m84856d(this, getInput(), 4);
        C67189i iVar = this.f210318u;
        if (iVar.f192901b != 0 && !Util.isNullOrNil(iVar.f192902c)) {
            nVar.mo160131h(13731, 5);
            if (!Util.isNullOrNil(this.f210318u.f192904e.f221048a)) {
                setMMTitle(this.f210318u.f192904e.f221048a);
            }
            TextView textView = this.f210314q;
            if (textView != null) {
                textView.setText(getString(C0966R.string.l_j));
            }
            if (this.f210307g != null && !Util.isNullOrNil(this.f210318u.f192904e.f221049b)) {
                this.f210307g.setText(this.f210318u.f192904e.f221049b);
            }
        }
        this.mNetSceneMgr.mo105624c(1580);
    }

    public void onDestroy() {
        this.mNetSceneMgr.mo105630i(1580);
        super.onDestroy();
    }

    public void onInputValidChange(boolean z) {
        if (this.f210305e.mo105070b((View) null)) {
            this.f210307g.setEnabled(true);
            this.f210307g.setClickable(true);
            return;
        }
        this.f210307g.setEnabled(false);
        this.f210307g.setClickable(false);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return super.onKeyUp(i, keyEvent);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        mo99650K7();
    }

    public boolean onPreSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.WalletVertifyCodeUI", "onPreSceneEnd %s %s", Integer.valueOf(i2), yVar);
        if ((yVar instanceof C75102b0) && i2 == 0) {
            this.f210316s = true;
            C76912y0.makeText((Context) this, (int) C0966R.string.l2c, 0).show();
            Log.m105924i("MicroMsg.WalletVertifyCodeUI", "tag it isCertInstalled ok");
        }
        return true;
    }

    public void onResume() {
        super.onResume();
        mo99650K7();
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onSceneEnd(int r11, int r12, java.lang.String r13, ob0.C117747y r14) {
        /*
            r10 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = " errCode: "
            r0.append(r1)
            r0.append(r12)
            java.lang.String r1 = " errMsg :"
            r0.append(r1)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.WalletVertifyCodeUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r0)
            boolean r0 = r14 instanceof com.tencent.p014mm.wallet_core.model.C75102b0
            r2 = 1
            r3 = 0
            r4 = 0
            if (r0 == 0) goto L_0x003a
            if (r12 == 0) goto L_0x0039
            com.tencent.mm.wallet_core.model.b0 r14 = (com.tencent.p014mm.wallet_core.model.C75102b0) r14
            boolean r11 = r14.f221014f
            if (r11 == 0) goto L_0x0039
            androidx.appcompat.app.AppCompatActivity r11 = r10.getContext()
            com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI$b r12 = new com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI$b
            r12.<init>(r10)
            nj3.C76879j.m92713G(r11, r13, r4, r3, r12)
        L_0x0039:
            return r2
        L_0x003a:
            if (r11 != 0) goto L_0x00f2
            if (r12 != 0) goto L_0x00f2
            yq3.e r11 = yq3.C79143a.m95768g(r10)
            boolean r12 = r14 instanceof v53.C78342e0
            if (r12 == 0) goto L_0x006d
            android.os.Bundle r12 = r10.getInput()
            java.lang.String r13 = "intent_bind_end"
            r12.putBoolean(r13, r2)
            if (r11 == 0) goto L_0x0067
            java.lang.String r12 = r11.mo91258e()
            java.lang.String r13 = "realname_verify_process"
            boolean r12 = r13.equals(r12)
            if (r12 != 0) goto L_0x0067
            r12 = 2131838851(0x7f114783, float:1.9310937E38)
            java.lang.String r12 = r10.getString(r12)
            nj3.C76879j.m92726T(r10, r12)
        L_0x0067:
            java.lang.String r12 = "query bound bank card resp!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r12)
            goto L_0x0089
        L_0x006d:
            boolean r12 = r11.mo91267t(r10, r4)
            if (r12 == 0) goto L_0x0089
            v53.e0 r12 = new v53.e0
            java.lang.String r13 = r10.getPayReqKey()
            r0 = 13
            r12.<init>(r13, r0)
            r10.doSceneForceProgress(r12)
            java.lang.String r12 = "to query bound bank card!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r12)
            r12 = 0
            goto L_0x008a
        L_0x0089:
            r12 = 1
        L_0x008a:
            boolean r13 = r14 instanceof v53.C78355w
            if (r13 == 0) goto L_0x00af
            com.tencent.mm.plugin.report.service.n r13 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r0 = 10707(0x29d3, float:1.5004E-41)
            r4 = 2
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5[r3] = r4
            long r6 = java.lang.System.currentTimeMillis()
            long r8 = com.tencent.p014mm.plugin.wallet_core.utils.C72517z.f210938a
            long r6 = r6 - r8
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 / r8
            int r4 = (int) r6
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5[r2] = r4
            r13.mo160131h(r0, r5)
        L_0x00af:
            com.tencent.mm.plugin.wallet_core.model.Authen r13 = r10.f210310j
            if (r13 == 0) goto L_0x00cc
            boolean r13 = r14 instanceof fr3.C75790l
            if (r13 == 0) goto L_0x00cc
            fr3.l r14 = (fr3.C75790l) r14
            java.lang.String r13 = r14.getToken()
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r14 != 0) goto L_0x00cc
            android.os.Bundle r14 = r10.getInput()
            java.lang.String r0 = "kreq_token"
            r14.putString(r0, r13)
        L_0x00cc:
            if (r12 == 0) goto L_0x00f2
            java.lang.String r12 = "forwardProcess1 and finish!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r12)
            android.os.Bundle r12 = r10.getInput()
            yq3.C79143a.m95765d(r10, r12)
            if (r11 == 0) goto L_0x00e9
            java.lang.String r11 = r11.mo91258e()
            java.lang.String r12 = "PayProcess"
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x00e9
            goto L_0x00f1
        L_0x00e9:
            java.lang.String r11 = "finish self"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r11)
            r10.finish()
        L_0x00f1:
            return r2
        L_0x00f2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet_core.p125ui.WalletVerifyCodeUI.onSceneEnd(int, int, java.lang.String, ob0.y):boolean");
    }
}
