package com.tencent.p014mm.plugin.account.p024ui;

import a70.C112760b;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.graphics.MMBitmapFactory;
import com.tencent.p014mm.modelavatar.C92725m;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.MMClearEditText;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import nj3.C76879j;
import p156gj.C87203t;
import p196ln.C117475p;
import p196ln.C99514m;
import p214om.C11502f;
import qg0.C12215a;
import qn3.C77382c;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.account.ui.RegAffiliateAccountUI */
public class RegAffiliateAccountUI extends MMActivity {

    /* renamed from: d */
    public boolean f344789d = true;

    /* renamed from: e */
    public MMClearEditText f344790e;

    /* renamed from: f */
    public MMClearEditText f344791f;

    /* renamed from: g */
    public MMClearEditText f344792g;

    /* renamed from: h */
    public Button f344793h;

    /* renamed from: i */
    public CheckBox f344794i;

    /* renamed from: j */
    public Button f344795j;

    /* renamed from: n */
    public C89779i0 f344796n;

    /* renamed from: o */
    public int f344797o;

    /* renamed from: p */
    public String f344798p;

    /* renamed from: q */
    public String f344799q;

    /* renamed from: r */
    public String f344800r;

    /* renamed from: s */
    public String f344801s;

    /* renamed from: t */
    public String f344802t;

    /* renamed from: com.tencent.mm.plugin.account.ui.RegAffiliateAccountUI$b */
    public class C104714b implements C99514m.C99515a {

        /* renamed from: d */
        public final /* synthetic */ String f310963d;

        /* renamed from: com.tencent.mm.plugin.account.ui.RegAffiliateAccountUI$b$a */
        public class C104715a implements Runnable {
            public C104715a() {
            }

            public void run() {
                View findViewById = RegAffiliateAccountUI.this.findViewById(C0966R.C0970id.jcz);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/RegAffiliateAccountUI$8$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(findViewById, "com/tencent/mm/plugin/account/ui/RegAffiliateAccountUI$8$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ((ImageView) RegAffiliateAccountUI.this.findViewById(C0966R.C0970id.jcx)).setImageBitmap(MMBitmapFactory.m98734c(C104714b.this.f310963d));
                C89779i0 i0Var = RegAffiliateAccountUI.this.f344796n;
                if (i0Var != null && i0Var.isShowing()) {
                    RegAffiliateAccountUI.this.f344796n.dismiss();
                }
            }
        }

        public C104714b(String str) {
            this.f310963d = str;
        }

        /* renamed from: e */
        public void mo138914e(int i, int i2, String str) {
            C86013q1.m106447h(C112760b.m154235i() + "temp.avatar");
            C89779i0 i0Var = RegAffiliateAccountUI.this.f344796n;
            if (i0Var != null && i0Var.isShowing()) {
                RegAffiliateAccountUI.this.f344796n.dismiss();
            }
        }

        /* renamed from: v */
        public void mo138915v(String str, String str2) {
            RegAffiliateAccountUI regAffiliateAccountUI = RegAffiliateAccountUI.this;
            regAffiliateAccountUI.f344801s = str;
            regAffiliateAccountUI.f344802t = str2;
            regAffiliateAccountUI.findViewById(C0966R.C0970id.jcz).post(new C104715a());
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegAffiliateAccountUI$a */
    public class C114993a implements MenuItem.OnMenuItemClickListener {
        public C114993a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            RegAffiliateAccountUI.this.onBackPressed();
            return true;
        }
    }

    /* renamed from: H7 */
    public static void m161880H7(RegAffiliateAccountUI regAffiliateAccountUI) {
        String str = regAffiliateAccountUI.f344800r;
        int length = str != null ? str.length() : 0;
        if (length < 1 || length > 32 || !regAffiliateAccountUI.f344794i.isChecked()) {
            regAffiliateAccountUI.f344793h.setEnabled(false);
        } else {
            regAffiliateAccountUI.f344793h.setEnabled(true);
        }
    }

    /* renamed from: I7 */
    public void mo174735I7(C12215a.C12216a aVar) {
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            C76879j.m92738i(this, C0966R.string.hxl, C0966R.string.hxn);
        } else if (ordinal == 1) {
            C76879j.m92738i(this, C0966R.string.hxm, C0966R.string.hxn);
        } else if (ordinal == 2) {
            C76879j.m92738i(this, C0966R.string.k_1, C0966R.string.hxn);
        } else if (ordinal == 3) {
            C76879j.m92738i(this, C0966R.string.k9y, C0966R.string.hxn);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359942br2;
    }

    public void initView() {
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        if (this.f344789d) {
            View findViewById = findViewById(C0966R.C0970id.f358899hr0);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/RegAffiliateAccountUI", "initStepOneView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById, "com/tencent/mm/plugin/account/ui/RegAffiliateAccountUI", "initStepOneView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f344793h = (Button) findViewById(C0966R.C0970id.hfe);
            MMClearEditText mMClearEditText = (MMClearEditText) findViewById(C0966R.C0970id.hfz);
            this.f344790e = mMClearEditText;
            C77382c b = C77382c.m93286b(mMClearEditText);
            b.f225611e = 1;
            b.f225610d = 32;
            b.f225607a = false;
            b.mo107499d((C77382c.C77383a) null);
            this.f344793h.setOnClickListener(new C115130j2(this));
            this.f344790e.requestFocus();
            this.f344790e.addTextChangedListener(new C115133k2(this));
            findViewById(C0966R.C0970id.jcy).setOnClickListener(new C1483l2(this));
            findViewById(C0966R.C0970id.ik4).setOnClickListener(new C1484m2(this));
            CheckBox checkBox = (CheckBox) findViewById(C0966R.C0970id.ik5);
            this.f344794i = checkBox;
            checkBox.setOnCheckedChangeListener(new C115144n2(this));
            if (this.f344797o == 0) {
                View findViewById2 = findViewById(C0966R.C0970id.kh7);
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(0);
                C117292a.m165358d(findViewById2, aVar2.mo10232b(), "com/tencent/mm/plugin/account/ui/RegAffiliateAccountUI", "initStepOneView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(findViewById2, "com/tencent/mm/plugin/account/ui/RegAffiliateAccountUI", "initStepOneView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                this.f344794i.setChecked(true);
                this.f344793h.setEnabled(true);
            }
        } else {
            View findViewById3 = findViewById(C0966R.C0970id.f358900hr1);
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(0);
            C117292a.m165358d(findViewById3, aVar3.mo10232b(), "com/tencent/mm/plugin/account/ui/RegAffiliateAccountUI", "initStepTwoView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById3, "com/tencent/mm/plugin/account/ui/RegAffiliateAccountUI", "initStepTwoView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f344791f = (MMClearEditText) findViewById(C0966R.C0970id.hrd);
            this.f344792g = (MMClearEditText) findViewById(C0966R.C0970id.bls);
            Button button = (Button) findViewById(C0966R.C0970id.bkp);
            this.f344795j = button;
            button.setEnabled(true);
            this.f344795j.setOnClickListener(new C115148o2(this));
        }
        setBackBtn(new C114993a());
        C115669n nVar = C115669n.INSTANCE;
        Object[] objArr = new Object[8];
        objArr[0] = this.f344799q;
        objArr[1] = C87203t.m108273i();
        objArr[2] = 0;
        objArr[3] = 1;
        objArr[4] = Integer.valueOf(this.f344789d ? 1005 : 1006);
        objArr[5] = 0;
        objArr[6] = null;
        objArr[7] = Integer.valueOf(this.f344797o);
        nVar.mo160131h(23530, objArr);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 702 && i2 == -1) {
            setResult(-1, intent);
            finish();
        } else if (((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93147R5(this, i, i2, intent) != null) {
            String str = C112760b.m154235i() + "temp.avatar";
            ((C92725m) ((C117475p) C86312j.m106911c(C117475p.class)).Dw0(str, new C104714b(str))).mo126948a();
            this.f344796n = C76879j.m92723Q(getContext(), getString(C0966R.string.a3h), getString(C0966R.string.a4d), true, true, (DialogInterface.OnCancelListener) null);
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f344797o = getIntent().getIntExtra("RegScene", 0);
        this.f344798p = getIntent().getStringExtra("RegTicket");
        this.f344799q = getIntent().getStringExtra("sessionID");
        this.f344800r = getIntent().getStringExtra("NickName");
        this.f344801s = getIntent().getStringExtra("AvatarFileID");
        this.f344802t = getIntent().getStringExtra("AvatarAESKey");
        this.f344789d = getIntent().getBooleanExtra("STEP_ONE", true);
        Log.m105925i("MicroMsg.RegAffiliateAccountUI", "regScene:%d", Integer.valueOf(this.f344797o));
        initView();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        finish();
        return false;
    }
}
