package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import b63.C67210w;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.WalletPwdConfirmDoSecondaryProgressCallbackEvent;
import com.tencent.p014mm.autogen.events.WalletPwdConfirmDoSecondaryProgressEvent;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.wallet_core.id_verify.RealNameVerifyProcess;
import com.tencent.p014mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.p014mm.plugin.wallet_core.utils.C5810l;
import com.tencent.p014mm.plugin.wallet_core.utils.C72517z;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.event.EventCenter;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75217h;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import com.tencent.p014mm.wallet_core.p137ui.formview.EditHintPasswdView;
import com.tencent.xweb.WCWebUpdater;
import gr3.C76024a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import k20.C60958c;
import k20.C9556a;
import nj3.C88989a;
import ob0.C117747y;
import v53.C78342e0;
import yq3.C79143a;

@C88989a(1)
/* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI */
public class WalletPwdConfirmUI extends WalletBaseUI {

    /* renamed from: d */
    public EditHintPasswdView f210257d;

    /* renamed from: e */
    public TextView f210258e;

    /* renamed from: f */
    public PayInfo f210259f;

    /* renamed from: g */
    public TextView f210260g;

    /* renamed from: h */
    public TextView f210261h;

    /* renamed from: i */
    public boolean f210262i = false;

    /* renamed from: j */
    public int f210263j = 1;

    /* renamed from: n */
    public boolean f210264n = false;

    /* renamed from: o */
    public MTimerHandler f210265o = new MTimerHandler(new C72306e(), false);

    /* renamed from: p */
    public IListener f210266p = new IListener<WalletPwdConfirmDoSecondaryProgressCallbackEvent>(C40008f.f107254d) {
        {
            this.__eventId = -1940712853;
        }

        public boolean callback(IEvent iEvent) {
            if (((WalletPwdConfirmDoSecondaryProgressCallbackEvent) iEvent) instanceof WalletPwdConfirmDoSecondaryProgressCallbackEvent) {
                Log.m105918d("Micromsg.WalletPwdConfirmUI", "event WalletPwdConfirmDoSecondaryProgressCallbackEvent");
                WalletPwdConfirmUI walletPwdConfirmUI = WalletPwdConfirmUI.this;
                walletPwdConfirmUI.f210264n = false;
                walletPwdConfirmUI.mo99632H7();
            }
            return false;
        }
    };

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI$a */
    public class C72302a implements MenuItem.OnMenuItemClickListener {
        public C72302a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            if (WalletPwdConfirmUI.this.needConfirmFinish()) {
                WalletPwdConfirmUI.this.hideVKB();
                WalletPwdConfirmUI.this.showDialog(1000);
                return false;
            }
            WalletPwdConfirmUI.this.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI$b */
    public class C72303b implements View.OnClickListener {
        public C72303b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletPwdConfirmUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            String string = WalletPwdConfirmUI.this.getInput().getString("key_new_pwd1");
            String md5Value = WalletPwdConfirmUI.this.f210257d.getMd5Value();
            String string2 = WalletPwdConfirmUI.this.getInput().getString("kreq_token");
            String string3 = WalletPwdConfirmUI.this.getInput().getString("key_verify_code");
            Log.m105918d("Micromsg.WalletPwdConfirmUI", "mPayInfo " + WalletPwdConfirmUI.this.f210259f + " vertifyCode: " + string3);
            if (string == null || !string.equals(md5Value)) {
                C79143a.m95763b(WalletPwdConfirmUI.this, -1002);
            } else {
                C67210w wVar = new C67210w();
                wVar.f192984b = WalletPwdConfirmUI.this.f210257d.getText();
                WalletPwdConfirmUI walletPwdConfirmUI = WalletPwdConfirmUI.this;
                wVar.f192996n = walletPwdConfirmUI.f210259f;
                wVar.f192986d = string2;
                wVar.f192985c = string3;
                wVar.f192989g = walletPwdConfirmUI.getInput().getBoolean("key_is_bind_bankcard", true);
                if (!C79143a.m95768g(WalletPwdConfirmUI.this).mo109116r()) {
                    wVar.f192983a = "1";
                } else {
                    wVar.f192983a = WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL;
                }
                FavorPayInfo favorPayInfo = (FavorPayInfo) WalletPwdConfirmUI.this.getInput().getParcelable("key_favor_pay_info");
                if (favorPayInfo != null) {
                    wVar.f192991i = favorPayInfo.f209527g;
                    wVar.f192992j = favorPayInfo.f209524d;
                }
                WalletPwdConfirmUI.this.getNetController().mo91271d(wVar);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdConfirmUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI$c */
    public class C72304c implements EditHintPasswdView.C75206c {
        public C72304c() {
        }

        public void onInputValidChange(boolean z) {
            if (z) {
                String string = WalletPwdConfirmUI.this.getInput().getString("key_new_pwd1");
                String md5Value = WalletPwdConfirmUI.this.f210257d.getMd5Value();
                if (string == null || !string.equals(md5Value)) {
                    C79143a.m95763b(WalletPwdConfirmUI.this, -1002);
                    return;
                }
                WalletPwdConfirmUI.this.f210258e.setEnabled(z);
                WalletPwdConfirmUI.this.f210258e.setClickable(z);
                return;
            }
            WalletPwdConfirmUI.this.f210258e.setEnabled(z);
            WalletPwdConfirmUI.this.f210258e.setClickable(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI$d */
    public class C72305d implements C75217h {

        /* renamed from: a */
        public final /* synthetic */ ScrollView f210271a;

        public C72305d(ScrollView scrollView) {
            this.f210271a = scrollView;
        }

        public void onVisibleStateChange(boolean z) {
            if (z) {
                WalletPwdConfirmUI walletPwdConfirmUI = WalletPwdConfirmUI.this;
                walletPwdConfirmUI.scrollToFormEditPosAfterShowTenPay(this.f210271a, walletPwdConfirmUI.f210258e, 30);
                return;
            }
            this.f210271a.scrollTo(0, 0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI$e */
    public class C72306e implements MTimerHandler.CallBack {
        public C72306e() {
        }

        public boolean onTimerExpired() {
            WalletPwdConfirmUI walletPwdConfirmUI = WalletPwdConfirmUI.this;
            if (walletPwdConfirmUI.f210264n) {
                walletPwdConfirmUI.f210264n = false;
                walletPwdConfirmUI.mo99632H7();
            }
            return false;
        }
    }

    /* renamed from: H7 */
    public final void mo99632H7() {
        Bundle input = getInput();
        input.putBoolean("intent_bind_end", true);
        C79143a.m95765d(this, input);
    }

    public boolean getCancelable() {
        return false;
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cgh;
    }

    public void initView() {
        this.f210260g = (TextView) findViewById(C0966R.C0970id.lja);
        this.f210261h = (TextView) findViewById(C0966R.C0970id.lj6);
        C75228t.m90240d(this.f210260g);
        if (getProcess() != null) {
            "ModifyPwdProcess".equals(getProcess().mo91258e());
        }
        this.f210261h.setText(C0966R.string.l98);
        this.f210258e = (TextView) findViewById(C0966R.C0970id.f7m);
        if (!Util.isNullOrNil(getTips(0))) {
            this.f210258e.setText(C0966R.string.l9c);
        } else {
            this.f210258e.setText(C0966R.string.f8014z_);
        }
        this.f210258e.setVisibility(0);
        this.f210258e.setOnClickListener(new C72303b());
        this.f210258e.setEnabled(false);
        this.f210258e.setClickable(false);
        EditHintPasswdView editHintPasswdView = (EditHintPasswdView) findViewById(C0966R.C0970id.f7k);
        this.f210257d = editHintPasswdView;
        C76024a.m91321b(editHintPasswdView);
        this.f210257d.setEditTextMaxLength(6);
        if (this.f210262i) {
            this.f210257d.setEncrType(this.f210263j);
        }
        this.f210257d.setOnInputValidListener(new C72304c());
        View findViewById = findViewById(C0966R.C0970id.a__);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdConfirmUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdConfirmUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        hideKeyboardPushDownBtn();
        setEditFocusListener(this.f210257d, 0, false);
        showTenpayKB();
        setTenpayKBStateListener(new C72305d((ScrollView) findViewById(C0966R.C0970id.iwq)));
    }

    public boolean needConfirmFinish() {
        return !(getProcess() instanceof RealNameVerifyProcess);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setActionbarColor(getContext().getResources().getColor(C0966R.color.al6));
        hideActionbarLine();
        setMMTitle("");
        this.f210259f = (PayInfo) getInput().getParcelable("key_pay_info");
        Bundle input = getInput();
        if (input != null) {
            boolean z = input.getBoolean("isNeedSm2Encrypt", false);
            this.f210262i = z;
            if (z) {
                int i = input.getInt("Sm2EncryptType", 1);
                this.f210263j = i;
                Log.m105925i("Micromsg.WalletPwdConfirmUI", "pwd encrypt type need smc, type:%d", Integer.valueOf(i));
            }
        }
        initView();
        C72517z.m84856d(this, getInput(), 6);
        setBackBtn(new C72302a());
        if (C75228t.m90212E()) {
            getWindow().addFlags(8192);
        }
    }

    public void onPause() {
        super.onPause();
        this.f210266p.dead();
    }

    public boolean onProgressFinish() {
        return true;
    }

    public void onResume() {
        this.f210257d.requestFocus();
        super.onResume();
        this.f210266p.alive();
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (i != 0 || i2 != 0) {
            return false;
        }
        getInput().putString("key_pwd1", this.f210257d.getText());
        if (yVar instanceof C78342e0) {
            if (!this.f210264n) {
                mo99632H7();
            }
        } else if (C79143a.m95768g(this) == null || !C79143a.m95768g(this).mo91267t(this, (Bundle) null)) {
            C79143a.m95765d(this, getInput());
        } else {
            PayInfo payInfo = this.f210259f;
            doSceneForceProgress(new C78342e0(payInfo != null ? payInfo.f212592j : "", 22));
            WalletPwdConfirmDoSecondaryProgressEvent walletPwdConfirmDoSecondaryProgressEvent = new WalletPwdConfirmDoSecondaryProgressEvent();
            if (EventCenter.instance.hasListener(WalletPwdConfirmDoSecondaryProgressEvent.class)) {
                this.f210264n = true;
                walletPwdConfirmDoSecondaryProgressEvent.publish();
            }
            this.f210265o.startTimer(10000);
        }
        return true;
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C5810l.class);
    }
}
