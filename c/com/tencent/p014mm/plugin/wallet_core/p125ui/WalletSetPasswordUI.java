package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.wallet_core.id_verify.RealNameVerifyProcess;
import com.tencent.p014mm.plugin.wallet_core.utils.C5810l;
import com.tencent.p014mm.plugin.wallet_core.utils.C72517z;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75217h;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import com.tencent.p014mm.wallet_core.p137ui.formview.EditHintPasswdView;
import eb0.C75592q0;
import gr3.C76024a;
import j20.C117292a;
import java.util.HashSet;
import k20.C60958c;
import k20.C9556a;
import nj3.C88989a;
import ob0.C117747y;
import yq3.C79143a;

@C88989a(1)
/* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI */
public class WalletSetPasswordUI extends WalletBaseUI {

    /* renamed from: d */
    public EditHintPasswdView f210285d;

    /* renamed from: e */
    public TextView f210286e;

    /* renamed from: f */
    public TextView f210287f;

    /* renamed from: g */
    public ScrollView f210288g;

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI$a */
    public class C72310a implements MenuItem.OnMenuItemClickListener {
        public C72310a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            if (WalletSetPasswordUI.this.needConfirmFinish()) {
                WalletSetPasswordUI.this.hideVKB();
                WalletSetPasswordUI.this.showDialog(1000);
                return false;
            }
            WalletSetPasswordUI.this.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI$b */
    public class C72311b implements EditHintPasswdView.C75206c {
        public C72311b() {
        }

        public void onInputValidChange(boolean z) {
            if (z) {
                String md5Value = WalletSetPasswordUI.this.f210285d.getMd5Value();
                Bundle bundle = new Bundle();
                bundle.putString("key_new_pwd1", md5Value);
                WalletSetPasswordUI.this.f210285d.mo105043a();
                C79143a.m95765d(WalletSetPasswordUI.this, bundle);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI$c */
    public class C72312c implements C75217h {

        /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI$c$a */
        public class C72313a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ boolean f210292d;

            public C72313a(boolean z) {
                this.f210292d = z;
            }

            public void run() {
                if (this.f210292d) {
                    WalletSetPasswordUI.this.f210288g.fullScroll(130);
                } else {
                    WalletSetPasswordUI.this.f210288g.fullScroll(33);
                }
            }
        }

        public C72312c() {
        }

        public void onVisibleStateChange(boolean z) {
            WalletSetPasswordUI.this.f210288g.post(new C72313a(z));
        }
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cgh;
    }

    public void initView() {
        this.f210288g = (ScrollView) findViewById(C0966R.C0970id.iwq);
        this.f210286e = (TextView) findViewById(C0966R.C0970id.lja);
        this.f210287f = (TextView) findViewById(C0966R.C0970id.lj6);
        C75228t.m90240d(this.f210286e);
        if (getInput().getBoolean("key_is_forgot_process", false) && !Util.isNullOrNil(getInput().getString("key_identity")) && getInput().getInt("key_id_type", -1) != -1 && !Util.isNullOrNil(getInput().getString("key_true_name"))) {
            this.f210287f.setVisibility(4);
        }
        if ((getProcess() == null || !"ModifyPwdProcess".equals(getProcess().mo91258e())) && getProcess() != null && "ResetPwdProcessByToken".equals(getProcess().mo91258e())) {
            String string = getInput().getString("key_pwd_title");
            String string2 = getInput().getString("key_pwd_desc");
            if (!Util.isNullOrNil(string)) {
                this.f210286e.setText(string);
            }
            if (!Util.isNullOrNil(string2)) {
                this.f210287f.setText(string2);
                this.f210287f.setVisibility(0);
            }
        }
        if (getInput().getInt("key_err_code", 0) == -1002) {
            this.f210287f.setTextColor(getResources().getColor(C0966R.color.f2966ao));
            this.f210287f.setText(C75592q0.m90763K() ? getString(C0966R.string.l9b) : getString(C0966R.string.l9a));
            getInput().putInt("key_err_code", 0);
        }
        EditHintPasswdView editHintPasswdView = (EditHintPasswdView) findViewById(C0966R.C0970id.f7k);
        this.f210285d = editHintPasswdView;
        C76024a.m91321b(editHintPasswdView);
        View findViewById = findViewById(C0966R.C0970id.a__);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view = findViewById;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/WalletSetPasswordUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/wallet_core/ui/WalletSetPasswordUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f210285d.setOnInputValidListener(new C72311b());
        setTenpayKBStateListener(new C72312c());
        hideKeyboardPushDownBtn();
        setEditFocusListener(this.f210285d, 0, false);
        showTenpayKB();
    }

    public boolean needConfirmFinish() {
        return !(getProcess() instanceof RealNameVerifyProcess);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(C0966R.C0968anim.f2503er, C0966R.C0968anim.f2498em);
        setActionbarColor(getContext().getResources().getColor(C0966R.color.al6));
        hideActionbarLine();
        setMMTitle("");
        initView();
        C72517z.m84856d(this, getInput(), 5);
        setBackBtn(new C72310a());
        if (C75228t.m90212E()) {
            getWindow().addFlags(8192);
        }
    }

    public void onResume() {
        this.f210285d.requestFocus();
        super.onResume();
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        return false;
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C5810l.class);
    }
}
