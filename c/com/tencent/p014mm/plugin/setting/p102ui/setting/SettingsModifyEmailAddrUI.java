package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelsimple.C1302b0;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.account.p024ui.RegByMobileSetPwdUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import f40.C86709a0;
import hg0.C46057k0;
import hg0.C46066v0;
import j20.C117292a;
import java.util.ArrayList;
import jg0.C46556e;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import pe3.C47465a;
import te3.C49901iv;
import te3.C51677vc;
import tm2.C14049d;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI */
public class SettingsModifyEmailAddrUI extends MMActivity implements C11385n, MStorageEx.IOnStorageChange {

    /* renamed from: q */
    public static final /* synthetic */ int f347153q = 0;

    /* renamed from: d */
    public ProgressDialog f347154d;

    /* renamed from: e */
    public EditText f347155e;

    /* renamed from: f */
    public String f347156f;

    /* renamed from: g */
    public String f347157g;

    /* renamed from: h */
    public TextView f347158h;

    /* renamed from: i */
    public TextView f347159i;

    /* renamed from: j */
    public String f347160j = null;

    /* renamed from: n */
    public boolean f347161n;

    /* renamed from: o */
    public boolean f347162o;

    /* renamed from: p */
    public boolean f347163p;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI$a */
    public class C115700a implements DialogInterface.OnClickListener {
        public C115700a(SettingsModifyEmailAddrUI settingsModifyEmailAddrUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI$a0 */
    public class C115701a0 implements MenuItem.OnMenuItemClickListener {

        /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI$a0$a */
        public class C115702a implements DialogInterface.OnCancelListener {

            /* renamed from: d */
            public final /* synthetic */ C46556e f347165d;

            public C115702a(C115701a0 a0Var, C46556e eVar) {
                this.f347165d = eVar;
            }

            public void onCancel(DialogInterface dialogInterface) {
                C86709a0.m107524d().mo123458d(this.f347165d);
            }
        }

        public C115701a0() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingsModifyEmailAddrUI settingsModifyEmailAddrUI = SettingsModifyEmailAddrUI.this;
            settingsModifyEmailAddrUI.f347157g = settingsModifyEmailAddrUI.f347155e.getText().toString().trim();
            if (!Util.isValidEmail(SettingsModifyEmailAddrUI.this.f347157g)) {
                C76879j.m92738i(SettingsModifyEmailAddrUI.this.getContext(), C0966R.string.k9v, C0966R.string.a3h);
                return true;
            }
            Integer num = (Integer) C86709a0.m107535s().mo121142i().mo119684e(7, (Object) null);
            Boolean valueOf = Boolean.valueOf((num == null || (num.intValue() & 2) == 0) ? false : true);
            SettingsModifyEmailAddrUI settingsModifyEmailAddrUI2 = SettingsModifyEmailAddrUI.this;
            if (!settingsModifyEmailAddrUI2.f347157g.equals(settingsModifyEmailAddrUI2.f347156f) || !valueOf.booleanValue()) {
                C46556e eVar = new C46556e(1, SettingsModifyEmailAddrUI.this.f347157g);
                C86709a0.m107524d().mo123460f(eVar);
                SettingsModifyEmailAddrUI settingsModifyEmailAddrUI3 = SettingsModifyEmailAddrUI.this;
                settingsModifyEmailAddrUI3.f347154d = C76879j.m92723Q(settingsModifyEmailAddrUI3, settingsModifyEmailAddrUI3.getString(C0966R.string.a3h), SettingsModifyEmailAddrUI.this.getString(C0966R.string.iqx), true, true, new C115702a(this, eVar));
                SettingsModifyEmailAddrUI.this.hideVKB();
            } else {
                SettingsModifyEmailAddrUI.this.finish();
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI$b */
    public class C115703b implements DialogInterface.OnClickListener {
        public C115703b(SettingsModifyEmailAddrUI settingsModifyEmailAddrUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI$b0 */
    public class C115704b0 implements DialogInterface.OnClickListener {
        public C115704b0() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent(SettingsModifyEmailAddrUI.this, RegByMobileSetPwdUI.class);
            if (WeChatBrands.AppInfo.current().isMainland()) {
                intent.putExtra("kintent_hint", SettingsModifyEmailAddrUI.this.getString(C0966R.string.j1b));
            } else {
                intent.putExtra("kintent_hint", SettingsModifyEmailAddrUI.this.getString(C0966R.string.j1c));
            }
            intent.putExtra("from_unbind", true);
            SettingsModifyEmailAddrUI.this.startActivityForResult(intent, 1);
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI$c */
    public class C115705c implements DialogInterface.OnClickListener {
        public C115705c(SettingsModifyEmailAddrUI settingsModifyEmailAddrUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI$d */
    public class C115706d implements DialogInterface.OnClickListener {
        public C115706d(SettingsModifyEmailAddrUI settingsModifyEmailAddrUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI$e */
    public class C115707e implements DialogInterface.OnClickListener {
        public C115707e(SettingsModifyEmailAddrUI settingsModifyEmailAddrUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI$f */
    public class C115708f implements DialogInterface.OnClickListener {
        public C115708f(SettingsModifyEmailAddrUI settingsModifyEmailAddrUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI$g */
    public class C115709g implements DialogInterface.OnClickListener {
        public C115709g(SettingsModifyEmailAddrUI settingsModifyEmailAddrUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI$h */
    public class C115710h implements DialogInterface.OnClickListener {
        public C115710h(SettingsModifyEmailAddrUI settingsModifyEmailAddrUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI$i */
    public class C115711i implements DialogInterface.OnClickListener {
        public C115711i(SettingsModifyEmailAddrUI settingsModifyEmailAddrUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI$j */
    public class C115712j implements DialogInterface.OnClickListener {
        public C115712j(SettingsModifyEmailAddrUI settingsModifyEmailAddrUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI$k */
    public class C115713k implements MenuItem.OnMenuItemClickListener {
        public C115713k() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingsModifyEmailAddrUI settingsModifyEmailAddrUI = SettingsModifyEmailAddrUI.this;
            int i = SettingsModifyEmailAddrUI.f347153q;
            settingsModifyEmailAddrUI.hideVKB();
            settingsModifyEmailAddrUI.finish();
            if (settingsModifyEmailAddrUI.f347163p) {
                settingsModifyEmailAddrUI.setResult(-1);
                return true;
            }
            settingsModifyEmailAddrUI.setResult(0);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI$l */
    public class C115714l implements DialogInterface.OnClickListener {
        public C115714l(SettingsModifyEmailAddrUI settingsModifyEmailAddrUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI$m */
    public class C115715m implements DialogInterface.OnClickListener {
        public C115715m(SettingsModifyEmailAddrUI settingsModifyEmailAddrUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI$n */
    public class C115716n implements DialogInterface.OnClickListener {
        public C115716n(SettingsModifyEmailAddrUI settingsModifyEmailAddrUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI$o */
    public class C115717o implements DialogInterface.OnClickListener {
        public C115717o(SettingsModifyEmailAddrUI settingsModifyEmailAddrUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI$p */
    public class C115718p implements DialogInterface.OnClickListener {
        public C115718p(SettingsModifyEmailAddrUI settingsModifyEmailAddrUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI$q */
    public class C115719q implements DialogInterface.OnClickListener {
        public C115719q(SettingsModifyEmailAddrUI settingsModifyEmailAddrUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI$r */
    public class C115720r implements DialogInterface.OnClickListener {
        public C115720r() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent(SettingsModifyEmailAddrUI.this, RegByMobileSetPwdUI.class);
            if (WeChatBrands.AppInfo.current().isMainland()) {
                intent.putExtra("kintent_hint", SettingsModifyEmailAddrUI.this.getString(C0966R.string.j1b));
            } else {
                intent.putExtra("kintent_hint", SettingsModifyEmailAddrUI.this.getString(C0966R.string.j1c));
            }
            intent.putExtra("from_unbind", true);
            SettingsModifyEmailAddrUI.this.startActivityForResult(intent, 1);
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI$s */
    public class C115721s implements DialogInterface.OnClickListener {
        public C115721s(SettingsModifyEmailAddrUI settingsModifyEmailAddrUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI$t */
    public class C115722t implements DialogInterface.OnCancelListener {
        public C115722t(SettingsModifyEmailAddrUI settingsModifyEmailAddrUI) {
        }

        public void onCancel(DialogInterface dialogInterface) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI$u */
    public class C115723u implements InputFilter {
        public C115723u(SettingsModifyEmailAddrUI settingsModifyEmailAddrUI) {
        }

        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            return charSequence.length() < 1 ? spanned.subSequence(i3, i4) : "";
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI$v */
    public class C115724v implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI$v$a */
        public class C115725a implements DialogInterface.OnCancelListener {
            public C115725a(C115724v vVar) {
            }

            public void onCancel(DialogInterface dialogInterface) {
            }
        }

        public C115724v() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsModifyEmailAddrUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C86709a0.m107524d().mo123460f(new C46057k0(4));
            SettingsModifyEmailAddrUI settingsModifyEmailAddrUI = SettingsModifyEmailAddrUI.this;
            settingsModifyEmailAddrUI.f347154d = C76879j.m92723Q(settingsModifyEmailAddrUI, settingsModifyEmailAddrUI.getString(C0966R.string.a3h), SettingsModifyEmailAddrUI.this.getString(C0966R.string.j1g), true, true, new C115725a(this));
            SettingsModifyEmailAddrUI.this.hideVKB();
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsModifyEmailAddrUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI$w */
    public class C115726w implements InputFilter {
        public C115726w(SettingsModifyEmailAddrUI settingsModifyEmailAddrUI) {
        }

        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            return charSequence.length() < 1 ? spanned.subSequence(i3, i4) : "";
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI$x */
    public class C115727x implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI$x$a */
        public class C115728a implements DialogInterface.OnCancelListener {

            /* renamed from: d */
            public final /* synthetic */ C46066v0 f347171d;

            public C115728a(C115727x xVar, C46066v0 v0Var) {
                this.f347171d = v0Var;
            }

            public void onCancel(DialogInterface dialogInterface) {
                C86709a0.m107524d().mo123458d(this.f347171d);
            }
        }

        public C115727x() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsModifyEmailAddrUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C46066v0 v0Var = new C46066v0((String) C86709a0.m107535s().mo121142i().mo119684e(2, (Object) null));
            C86709a0.m107524d().mo123460f(v0Var);
            SettingsModifyEmailAddrUI settingsModifyEmailAddrUI = SettingsModifyEmailAddrUI.this;
            settingsModifyEmailAddrUI.f347154d = C76879j.m92723Q(settingsModifyEmailAddrUI.getContext(), SettingsModifyEmailAddrUI.this.getString(C0966R.string.a3h), SettingsModifyEmailAddrUI.this.getString(C0966R.string.irc), true, true, new C115728a(this, v0Var));
            SettingsModifyEmailAddrUI.this.hideVKB();
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsModifyEmailAddrUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI$y */
    public class C115729y implements MenuItem.OnMenuItemClickListener {
        public C115729y() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingsModifyEmailAddrUI settingsModifyEmailAddrUI = SettingsModifyEmailAddrUI.this;
            int i = SettingsModifyEmailAddrUI.f347153q;
            settingsModifyEmailAddrUI.mo175998H7();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI$z */
    public class C115730z implements InputFilter {
        public C115730z(SettingsModifyEmailAddrUI settingsModifyEmailAddrUI) {
        }

        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            return null;
        }
    }

    /* renamed from: H7 */
    public final void mo175998H7() {
        this.f347158h.setVisibility(8);
        this.f347158h.setText(getString(C0966R.string.j1a));
        this.f347159i.setText(getString(C0966R.string.iuc));
        this.f347159i.setTextColor(getResources().getColor(C0966R.color.f3007c4));
        this.f347155e.setEnabled(true);
        this.f347155e.setFilters(new InputFilter[]{new C115730z(this)});
        addTextOptionMenu(0, getString(C0966R.string.a2n), new C115701a0());
    }

    /* renamed from: I7 */
    public final void mo175999I7() {
        if (this.f347161n) {
            this.f347158h.setVisibility(0);
            this.f347158h.setText(getString(C0966R.string.j1a));
            this.f347159i.setText(getString(C0966R.string.iuc));
            this.f347159i.setTextColor(getResources().getColor(C0966R.color.f3007c4));
            this.f347155e.setEnabled(false);
            this.f347155e.setFilters(new InputFilter[]{new C115723u(this)});
            this.f347158h.setOnClickListener(new C115724v());
            hideVKB(this.f347155e);
        } else if (!Util.isNullOrNil(this.f347156f)) {
            this.f347158h.setVisibility(0);
            this.f347158h.setText(getString(C0966R.string.f356910int));
            this.f347159i.setText(getString(C0966R.string.imv));
            this.f347159i.setTextColor(getResources().getColor(C0966R.color.a_0));
            this.f347155e.setEnabled(false);
            this.f347155e.setFilters(new InputFilter[]{new C115726w(this)});
            this.f347158h.setOnClickListener(new C115727x());
            addTextOptionMenu(0, getString(C0966R.string.f7956xe), new C115729y());
            hideVKB(this.f347155e);
        } else {
            mo175998H7();
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bxl;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.iub);
        this.f347155e = (EditText) findViewById(C0966R.C0970id.jew);
        this.f347158h = (TextView) findViewById(C0966R.C0970id.kzo);
        this.f347159i = (TextView) findViewById(C0966R.C0970id.gyc);
        String str = (String) C86709a0.m107535s().mo121142i().mo119684e(5, (Object) null);
        this.f347156f = str;
        this.f347155e.setText(str);
        Integer num = (Integer) C86709a0.m107535s().mo121142i().mo119684e(7, (Object) null);
        this.f347161n = (num == null || (num.intValue() & 2) == 0) ? false : true;
        setBackBtn(new C115713k());
        this.f347162o = true;
        mo175999I7();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Log.m105919d("MiroMsg.SettingsModifyEmailAddrUI", "summerunbind onAcvityResult requestCode:%d, resultCode:%d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i == 1 && i2 == -1) {
            Log.m105924i("MiroMsg.SettingsModifyEmailAddrUI", "summerunbind REQUEST_CODE_SET_PSW ok and start NetSceneCheckUnBind again oldEmail: " + this.f347156f + " newEmail: " + this.f347157g);
            C86709a0.m107524d().mo123460f(new C46057k0(4));
            this.f347154d = C76879j.m92723Q(this, getString(C0966R.string.a3h), getString(C0966R.string.it9), true, true, new C115722t(this));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
        C86709a0.m107524d().mo123455a(138, this);
        C86709a0.m107524d().mo123455a(254, this);
        C86709a0.m107524d().mo123455a(256, this);
        C86709a0.m107524d().mo123455a(108, this);
        C86709a0.m107524d().mo123455a(255, this);
        C86709a0.m107535s().mo121142i().add(this);
    }

    public void onDestroy() {
        C86709a0.m107524d().mo123470p(138, this);
        C86709a0.m107524d().mo123470p(254, this);
        C86709a0.m107524d().mo123470p(256, this);
        C86709a0.m107524d().mo123470p(108, this);
        C86709a0.m107524d().mo123470p(255, this);
        C86709a0.m107535s().mo121142i().remove(this);
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        hideVKB();
        finish();
        if (this.f347163p) {
            setResult(-1);
            return true;
        }
        setResult(0);
        return true;
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        boolean z = false;
        int nullAsInt = Util.nullAsInt(obj, 0);
        Log.m105919d("MiroMsg.SettingsModifyEmailAddrUI", "onNotifyChange event:%d obj:%d stg:%s", Integer.valueOf(i), Integer.valueOf(nullAsInt), mStorageEx);
        if (mStorageEx != C86709a0.m107535s().mo121142i() || nullAsInt <= 0) {
            Log.m105921e("MiroMsg.SettingsModifyEmailAddrUI", "onNotifyChange error obj:%d stg:%s", Integer.valueOf(nullAsInt), mStorageEx);
            return;
        }
        Integer num = (Integer) C86709a0.m107535s().mo121142i().mo119684e(7, (Object) null);
        this.f347156f = (String) C86709a0.m107535s().mo121142i().mo119684e(5, (Object) null);
        if (!(num == null || (2 & num.intValue()) == 0)) {
            z = true;
        }
        this.f347161n = z;
        this.f347163p = z;
        if (this.f347162o) {
            mo175999I7();
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int i3 = i;
        int i4 = i2;
        String str2 = str;
        Log.m105924i("MiroMsg.SettingsModifyEmailAddrUI", "onSceneEnd: sceneType = " + yVar.getType() + " errType = " + i3 + " errCode = " + i4 + " errMsg = " + str2);
        ProgressDialog progressDialog = this.f347154d;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f347154d = null;
        }
        if (!C14049d.m13402a().mo93163uP(getContext(), i3, i4, str2)) {
            if (yVar.getType() == 254) {
                if (i3 == 0 && i4 == 0) {
                    C46057k0 k0Var = (C46057k0) yVar;
                    this.f347160j = ((C49901iv) k0Var.f124181e.f127056b.f127083a).f135687e;
                    k0Var.mo71475j1();
                    if (!Util.isNullOrNil(this.f347160j)) {
                        C86709a0.m107524d().mo123460f(new C46556e(2, this.f347155e.getText().toString().trim()));
                        return;
                    }
                    C86709a0.m107524d().mo123460f(new C1302b0(2));
                    return;
                }
                ProgressDialog progressDialog2 = this.f347154d;
                if (progressDialog2 != null) {
                    progressDialog2.dismiss();
                    this.f347154d = null;
                }
                if (i4 == -3) {
                    Log.m105918d("MiroMsg.SettingsModifyEmailAddrUI", "summerunbind MMFunc_QueryHasPasswd err and set psw");
                    C76879j.m92709C(getContext(), getString(C0966R.string.j1e), (String) null, getString(C0966R.string.j1f), getString(C0966R.string.j1d), true, new C115704b0(), new C115700a(this));
                } else if (i4 == -82) {
                    C76879j.m92742m(this, C0966R.string.ion, C0966R.string.a3h, new C115703b(this));
                } else if (i4 == -83) {
                    C76879j.m92742m(this, C0966R.string.iok, C0966R.string.a3h, new C115705c(this));
                } else if (i4 == -84) {
                    C76879j.m92742m(this, C0966R.string.iol, C0966R.string.a3h, new C115706d(this));
                } else if (i4 == -85) {
                    C76879j.m92742m(this, C0966R.string.ioe, C0966R.string.a3h, new C115707e(this));
                }
            } else if (yVar.getType() == 256) {
                C14049d.m13402a().mo93136Bk();
                C47465a aVar = ((C46556e) yVar).f125448e.f127055a.f127080a;
                if (((C51677vc) aVar).f143425d == 1) {
                    if (i3 == 0 && i4 == 0) {
                        C76879j.m92742m(getContext(), C0966R.string.irb, C0966R.string.a3h, new C115708f(this));
                        return;
                    }
                    ProgressDialog progressDialog3 = this.f347154d;
                    if (progressDialog3 != null) {
                        progressDialog3.dismiss();
                        this.f347154d = null;
                    }
                    if (i4 == -82) {
                        C76879j.m92742m(this, C0966R.string.ion, C0966R.string.a3h, new C115709g(this));
                    } else if (i4 == -83) {
                        C76879j.m92742m(this, C0966R.string.iok, C0966R.string.a3h, new C115710h(this));
                    } else if (i4 == -84) {
                        C76879j.m92742m(this, C0966R.string.iol, C0966R.string.a3h, new C115711i(this));
                    } else if (i4 == -85) {
                        C76879j.m92742m(this, C0966R.string.ioe, C0966R.string.a3h, new C115712j(this));
                    } else if (i4 == -86) {
                        C76879j.m92742m(this, C0966R.string.iop, C0966R.string.a3h, new C115714l(this));
                    } else {
                        C76879j.m92749t(getContext(), getString(C0966R.string.ira, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}), getString(C0966R.string.a3h), new C115715m(this));
                    }
                } else if (((C51677vc) aVar).f143425d == 2) {
                    ProgressDialog progressDialog4 = this.f347154d;
                    if (progressDialog4 != null) {
                        progressDialog4.dismiss();
                        this.f347154d = null;
                    }
                    if (i3 == 0 && i4 == 0) {
                        C86709a0.m107535s().mo121142i().mo119676J(7, Integer.valueOf(((Integer) C86709a0.m107535s().mo121142i().mo119684e(7, (Object) null)).intValue() | 2));
                        if (!Util.isNullOrNil(this.f347160j)) {
                            C76879j.m92754y(getContext(), this.f347160j, "", getString(C0966R.string.f8029zr), new C115716n(this));
                        } else {
                            C76879j.m92742m(getContext(), C0966R.string.iog, C0966R.string.a3h, new C115717o(this));
                        }
                    }
                }
            } else if (yVar.getType() != 138) {
                if (yVar.getType() == 108) {
                    ProgressDialog progressDialog5 = this.f347154d;
                    if (progressDialog5 != null) {
                        progressDialog5.dismiss();
                        this.f347154d = null;
                    }
                    if (i3 == 0 && i4 == 0) {
                        C76879j.m92742m(getContext(), C0966R.string.irb, C0966R.string.a3h, new C115718p(this));
                        return;
                    }
                    C76879j.m92749t(getContext(), getString(C0966R.string.ira, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}), getString(C0966R.string.a3h), new C115719q(this));
                } else if (yVar.getType() != 255) {
                } else {
                    if (i4 == 0) {
                        C86709a0.m107524d().mo123460f(new C46556e(2, this.f347155e.getText().toString().trim()));
                        return;
                    }
                    ProgressDialog progressDialog6 = this.f347154d;
                    if (progressDialog6 != null) {
                        progressDialog6.dismiss();
                        this.f347154d = null;
                    }
                    C76879j.m92709C(getContext(), getString(C0966R.string.j1e), (String) null, getString(C0966R.string.j1f), getString(C0966R.string.j1d), true, new C115720r(), new C115721s(this));
                }
            }
        }
    }
}
