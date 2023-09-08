package com.tencent.p014mm.plugin.account.bind.p021ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelsimple.C1302b0;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import gg0.C107796t;
import gg0.C45916r;
import gg0.C45917s;
import hg0.C46057k0;
import ke3.C88144b;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p823sg.C77710q;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.account.bind.ui.BindQQUI */
public class BindQQUI extends MMWizardActivity implements C11385n {

    /* renamed from: h */
    public static final /* synthetic */ int f344317h = 0;

    /* renamed from: e */
    public int f344318e = 0;

    /* renamed from: f */
    public C89779i0 f344319f;

    /* renamed from: g */
    public String f344320g = null;

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindQQUI$a */
    public class C114861a implements DialogInterface.OnCancelListener {
        public C114861a(BindQQUI bindQQUI) {
        }

        public void onCancel(DialogInterface dialogInterface) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindQQUI$b */
    public class C114862b implements MenuItem.OnMenuItemClickListener {
        public C114862b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            BindQQUI bindQQUI = BindQQUI.this;
            int i = BindQQUI.f344317h;
            bindQQUI.mo7681K7(1);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindQQUI$c */
    public class C114863c implements MenuItem.OnMenuItemClickListener {
        public C114863c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            BindQQUI.this.hideVKB();
            BindQQUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindQQUI$d */
    public class C114864d implements DialogInterface.OnClickListener {
        public C114864d() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent();
            intent.putExtra("kintent_hint", BindQQUI.this.getString(C0966R.string.j1b));
            intent.putExtra("from_unbind", true);
            C88144b.m109795m(BindQQUI.this, "account", "com.tencent.mm.plugin.account.ui.RegByMobileSetPwdUI", intent, 1);
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindQQUI$e */
    public class C114865e implements DialogInterface.OnClickListener {
        public C114865e(BindQQUI bindQQUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindQQUI$f */
    public class C114866f implements DialogInterface.OnClickListener {
        public C114866f() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent();
            intent.putExtra("kintent_hint", BindQQUI.this.getString(C0966R.string.j1b));
            intent.putExtra("from_unbind", true);
            C88144b.m109795m(BindQQUI.this, "account", "com.tencent.mm.plugin.account.ui.RegByMobileSetPwdUI", intent, 1);
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindQQUI$g */
    public class C114867g implements DialogInterface.OnClickListener {
        public C114867g(BindQQUI bindQQUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6578iu;
    }

    public void initView() {
        long longValue = new C77710q(Util.nullAsNil((Integer) C86709a0.m107535s().mo121142i().mo119684e(9, (Object) null))).longValue();
        if (longValue == 0) {
            setMMTitle((int) C0966R.string.aly);
            TextView textView = (TextView) findViewById(C0966R.C0970id.jdk);
            textView.setVisibility(8);
            textView.setText(C0966R.string.alw);
            ((TextView) findViewById(C0966R.C0970id.jdl)).setVisibility(8);
            Button button = (Button) findViewById(C0966R.C0970id.a_4);
            button.setVisibility(0);
            button.setText(C0966R.string.alv);
            button.setOnClickListener(new C45916r(this));
            removeOptionMenu(1);
        } else {
            setMMTitle((int) C0966R.string.alu);
            TextView textView2 = (TextView) findViewById(C0966R.C0970id.jdk);
            textView2.setVisibility(8);
            textView2.setText(C0966R.string.als);
            TextView textView3 = (TextView) findViewById(C0966R.C0970id.jdl);
            textView3.setVisibility(0);
            textView3.setText(getString(C0966R.string.alt) + longValue);
            Button button2 = (Button) findViewById(C0966R.C0970id.a_4);
            button2.setVisibility(8);
            button2.setText(C0966R.string.fie);
            button2.setOnClickListener(new C45917s(this));
            addIconOptionMenu(1, C0966R.raw.icons_outlined_more, new C107796t(this));
        }
        if (this.f344318e == 1) {
            addTextOptionMenu(0, getString(C0966R.string.f8032zu), new C114862b());
        } else {
            setBackBtn(new C114863c());
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Log.m105919d("MicroMsg.BindQQUI", "summerunbind onAcvityResult requestCode:%d, resultCode:%d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i == 1 && i2 == -1) {
            Log.m105924i("MicroMsg.BindQQUI", "summerunbind REQUEST_CODE_SET_PSW ok and start NetSceneCheckUnBind again qq");
            C86709a0.m107524d().mo123460f(new C46057k0(1));
            this.f344319f = C76879j.m92723Q(this, getString(C0966R.string.a3h), getString(C0966R.string.f360085a04), true, true, new C114861a(this));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f344318e = getIntent().getIntExtra("bindqq_regbymobile", 0);
        C86709a0.m107524d().mo123455a(254, this);
        C86709a0.m107524d().mo123455a(255, this);
    }

    public void onDestroy() {
        C86709a0.m107524d().mo123470p(254, this);
        C86709a0.m107524d().mo123470p(255, this);
        super.onDestroy();
    }

    public void onResume() {
        super.onResume();
        initView();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int i3 = i;
        int i4 = i2;
        Class<StartUnbindQQ> cls = StartUnbindQQ.class;
        Log.m105918d("MicroMsg.BindQQUI", "onSceneEnd " + i3 + " errCode " + i4 + " errMsg " + str + "  " + yVar.getType());
        C89779i0 i0Var = this.f344319f;
        if (i0Var != null) {
            i0Var.dismiss();
            this.f344319f = null;
        }
        if (yVar.getType() == 254) {
            if (i3 == 0 && i4 == 0) {
                String j1 = ((C46057k0) yVar).mo71475j1();
                this.f344320g = j1;
                if (j1 != null && j1.length() > 0) {
                    C86709a0.m107535s().mo121142i().mo119676J(102407, this.f344320g);
                }
                if (!Util.isNullOrNil((String) null)) {
                    Intent intent = new Intent(this, cls);
                    intent.putExtra("notice", (String) null);
                    MMWizardActivity.m7017L7(this, intent);
                    return;
                }
                C86709a0.m107524d().mo123460f(new C1302b0(2));
                return;
            }
            C89779i0 i0Var2 = this.f344319f;
            if (i0Var2 != null) {
                i0Var2.dismiss();
                this.f344319f = null;
            }
            if (i4 == -3) {
                Log.m105918d("MicroMsg.BindQQUI", "summerunbind MMFunc_QueryHasPasswd err and set psw");
                C76879j.m92709C(getContext(), getString(C0966R.string.j1e), (String) null, getString(C0966R.string.j1f), getString(C0966R.string.j1d), true, new C114864d(), new C114865e(this));
            } else if (i4 == -81) {
                C76879j.m92742m(this, C0966R.string.iom, C0966R.string.a3h, (DialogInterface.OnClickListener) null);
            } else if (i4 == -82) {
                C76879j.m92742m(this, C0966R.string.ion, C0966R.string.a3h, (DialogInterface.OnClickListener) null);
            } else if (i4 == -83) {
                C76879j.m92742m(this, C0966R.string.iok, C0966R.string.a3h, (DialogInterface.OnClickListener) null);
            } else if (i4 == -84) {
                C76879j.m92742m(this, C0966R.string.iol, C0966R.string.a3h, (DialogInterface.OnClickListener) null);
            } else if (i4 == -85) {
                C76879j.m92742m(this, C0966R.string.ioj, C0966R.string.a3h, (DialogInterface.OnClickListener) null);
            } else if (i4 == -86) {
                C76879j.m92742m(this, C0966R.string.iop, C0966R.string.a3h, (DialogInterface.OnClickListener) null);
            }
        } else if (yVar.getType() != 255) {
        } else {
            if (i4 == 0) {
                MMWizardActivity.m7017L7(this, new Intent(this, cls));
            } else {
                C76879j.m92709C(getContext(), getString(C0966R.string.j1e), (String) null, getString(C0966R.string.j1f), getString(C0966R.string.j1d), true, new C114866f(), new C114867g(this));
            }
        }
    }
}
