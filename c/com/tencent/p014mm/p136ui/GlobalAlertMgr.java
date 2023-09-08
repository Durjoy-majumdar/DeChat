package com.tencent.p014mm.p136ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.telephony.TelephonyManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.CheckMobileSpaceEvent;
import com.tencent.p014mm.autogen.events.GlobalAlertEvent;
import com.tencent.p014mm.modelsimple.C1302b0;
import com.tencent.p014mm.modelsimple.C1307j0;
import com.tencent.p014mm.p136ui.LauncherUI;
import com.tencent.p014mm.plugin.account.bind.p021ui.BindMContactUI;
import com.tencent.p014mm.plugin.account.p024ui.RegByMobileSetPwdUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsAccountInfoUI;
import com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsModifyAliasUI;
import com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsModifyEmailAddrUI;
import com.tencent.p014mm.protocal.GeneralControlWrapper;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C97625j3;
import j20.C117292a;
import java.util.LinkedList;
import k20.C9556a;
import ke3.C88144b;
import nc0.C76850a;
import nj3.C76879j;
import ob0.C11385n;
import p182kk.C61104a;
import qo3.C77398g;
import se3.C77683a;
import se3.C77684b;
import sf0.C77702q0;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.GlobalAlertMgr */
public class GlobalAlertMgr {

    /* renamed from: a */
    public MMFragmentActivity f214221a;

    /* renamed from: b */
    public LauncherUI.C73063d f214222b;

    /* renamed from: c */
    public GlobalAlertEvent.C67717a f214223c = null;

    /* renamed from: d */
    public View f214224d;

    /* renamed from: e */
    public EditText f214225e;

    /* renamed from: f */
    public C77398g f214226f;

    /* renamed from: g */
    public ProgressDialog f214227g;

    /* renamed from: h */
    public boolean f214228h;

    /* renamed from: i */
    public C11385n f214229i;

    /* renamed from: j */
    public boolean f214230j = false;

    /* renamed from: k */
    public IListener f214231k;

    /* renamed from: l */
    public int f214232l;

    /* renamed from: m */
    public IListener<CheckMobileSpaceEvent> f214233m;

    /* renamed from: com.tencent.mm.ui.GlobalAlertMgr$a */
    public class C73020a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ int f214236d;

        /* renamed from: e */
        public final /* synthetic */ C77683a f214237e;

        public C73020a(int i, C77683a aVar) {
            this.f214236d = i;
            this.f214237e = aVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            GlobalAlertMgr globalAlertMgr = GlobalAlertMgr.this;
            int i2 = this.f214236d;
            C77683a aVar = this.f214237e;
            globalAlertMgr.mo101299c(i2, aVar.f226452e, aVar.f226451d, aVar.f226454g);
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.tencent.mm.ui.GlobalAlertMgr$b */
    public class C73021b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ int f214239d;

        /* renamed from: e */
        public final /* synthetic */ C77683a f214240e;

        public C73021b(int i, C77683a aVar) {
            this.f214239d = i;
            this.f214240e = aVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            GlobalAlertMgr globalAlertMgr = GlobalAlertMgr.this;
            int i2 = this.f214239d;
            C77683a aVar = this.f214240e;
            globalAlertMgr.mo101299c(i2, aVar.f226452e, aVar.f226451d, aVar.f226454g);
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.tencent.mm.ui.GlobalAlertMgr$c */
    public class C73022c implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ int f214242d;

        /* renamed from: e */
        public final /* synthetic */ C77683a f214243e;

        public C73022c(int i, C77683a aVar) {
            this.f214242d = i;
            this.f214243e = aVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            GlobalAlertMgr globalAlertMgr = GlobalAlertMgr.this;
            int i2 = this.f214242d;
            C77683a aVar = this.f214243e;
            globalAlertMgr.mo101299c(i2, aVar.f226452e, aVar.f226451d, aVar.f226454g);
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.tencent.mm.ui.GlobalAlertMgr$d */
    public class C73023d implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C1302b0 f214245d;

        public C73023d(GlobalAlertMgr globalAlertMgr, C1302b0 b0Var) {
            this.f214245d = b0Var;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C97625j3.m125815e().mo123458d(this.f214245d);
        }
    }

    /* renamed from: com.tencent.mm.ui.GlobalAlertMgr$e */
    public class C73024e implements DialogInterface.OnClickListener {

        /* renamed from: com.tencent.mm.ui.GlobalAlertMgr$e$a */
        public class C73025a implements DialogInterface.OnClickListener {
            public C73025a(C73024e eVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }

        /* renamed from: com.tencent.mm.ui.GlobalAlertMgr$e$b */
        public class C73026b implements DialogInterface.OnCancelListener {

            /* renamed from: d */
            public final /* synthetic */ C1307j0 f214247d;

            public C73026b(C1307j0 j0Var) {
                this.f214247d = j0Var;
            }

            public void onCancel(DialogInterface dialogInterface) {
                C97625j3.m125815e().mo123470p(384, GlobalAlertMgr.this.f214229i);
                GlobalAlertMgr.this.f214229i = null;
                C97625j3.m125815e().mo123458d(this.f214247d);
            }
        }

        public C73024e() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            InputMethodManager inputMethodManager;
            IBinder windowToken;
            String obj = GlobalAlertMgr.this.f214225e.getText().toString();
            GlobalAlertMgr.this.f214225e.setText("");
            GlobalAlertMgr.this.f214225e.clearFocus();
            GlobalAlertMgr globalAlertMgr = GlobalAlertMgr.this;
            MMFragmentActivity mMFragmentActivity = globalAlertMgr.f214221a;
            EditText editText = globalAlertMgr.f214225e;
            int i2 = C77702q0.f226484a;
            if (!(editText == null || (inputMethodManager = (InputMethodManager) mMFragmentActivity.getSystemService("input_method")) == null || (windowToken = editText.getWindowToken()) == null)) {
                try {
                    inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
                } catch (IllegalArgumentException e) {
                    Log.m105921e("MicroMsg.Util", "hide VKB(View) exception %s", e);
                }
            }
            if (obj == null || obj.equals("")) {
                C76879j.m92742m(GlobalAlertMgr.this.f214221a, C0966R.string.k9z, C0966R.string.a3h, new C73025a(this));
                return;
            }
            GlobalAlertMgr globalAlertMgr2 = GlobalAlertMgr.this;
            if (globalAlertMgr2.f214229i == null) {
                globalAlertMgr2.f214229i = new C74818t0(globalAlertMgr2);
            }
            C97625j3.m125815e().mo123455a(384, GlobalAlertMgr.this.f214229i);
            C1307j0 j0Var = new C1307j0(1, obj, "", "", "", false);
            C97625j3.m125815e().mo123460f(j0Var);
            GlobalAlertMgr globalAlertMgr3 = GlobalAlertMgr.this;
            globalAlertMgr3.f214227g = C76879j.m92723Q(globalAlertMgr3.f214221a, globalAlertMgr3.mo101297a(C0966R.string.a3h), GlobalAlertMgr.this.mo101297a(C0966R.string.it9), true, true, new C73026b(j0Var));
        }
    }

    /* renamed from: com.tencent.mm.ui.GlobalAlertMgr$f */
    public class C73027f implements DialogInterface.OnClickListener {
        public C73027f() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            GlobalAlertMgr.this.f214225e.setText("");
            GlobalAlertMgr.this.f214226f.dismiss();
        }
    }

    public GlobalAlertMgr(MMFragmentActivity mMFragmentActivity, LauncherUI.C73063d dVar) {
        C40008f fVar = C40008f.f107254d;
        this.f214231k = new IListener<GlobalAlertEvent>(fVar) {
            {
                this.__eventId = 1638723793;
            }

            public boolean callback(IEvent iEvent) {
                GlobalAlertEvent.C67717a aVar;
                GlobalAlertEvent globalAlertEvent = (GlobalAlertEvent) iEvent;
                if (globalAlertEvent == null || (aVar = globalAlertEvent.f193674d) == null || aVar.f193675a == null) {
                    Log.m105925i("MicroMsg.LauncherUI.GlobalAlertMgr", "summeralert event is illegal event[%s]", globalAlertEvent);
                } else {
                    Log.m105925i("MicroMsg.LauncherUI.GlobalAlertMgr", "summeralert event launcherUI isResumeStatus[%b], tid[%d]", Boolean.valueOf(((HomeUI) GlobalAlertMgr.this.f214222b).mo101320k()), Long.valueOf(Thread.currentThread().getId()));
                    if (!((HomeUI) GlobalAlertMgr.this.f214222b).mo101320k()) {
                        GlobalAlertMgr.this.f214223c = globalAlertEvent.f193674d;
                    } else {
                        GlobalAlertMgr.this.f214223c = null;
                        ((C119157j) C119157j.f356862d).mo183895z(new GlobalAlertMgr$1$$a(this, globalAlertEvent));
                    }
                }
                return false;
            }
        };
        this.f214232l = 0;
        this.f214233m = new IListener<CheckMobileSpaceEvent>(fVar) {
            {
                this.__eventId = -2026915730;
            }

            public boolean callback(IEvent iEvent) {
                GlobalAlertMgr.this.f214232l = ((CheckMobileSpaceEvent) iEvent).f193524d.f193525a;
                return false;
            }
        };
        this.f214221a = mMFragmentActivity;
        this.f214222b = dVar;
    }

    /* renamed from: a */
    public String mo101297a(int i) {
        return this.f214221a.getString(i);
    }

    /* renamed from: b */
    public final void mo101298b(boolean z) {
        Log.m105918d("MicroMsg.LauncherUI.GlobalAlertMgr", "summeralert handlePassword " + z);
        if (z) {
            mo101301e();
            return;
        }
        Intent intent = new Intent(this.f214221a, RegByMobileSetPwdUI.class);
        intent.putExtra("kintent_hint", mo101297a(C0966R.string.iul));
        MMFragmentActivity mMFragmentActivity = this.f214221a;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        MMFragmentActivity mMFragmentActivity2 = mMFragmentActivity;
        C117292a.m165358d(mMFragmentActivity2, aVar.mo10232b(), "com/tencent/mm/ui/GlobalAlertMgr", "handlePassword", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        mMFragmentActivity.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(mMFragmentActivity2, "com/tencent/mm/ui/GlobalAlertMgr", "handlePassword", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: c */
    public final void mo101299c(int i, int i2, int i3, String str) {
        C76850a.C76851a a;
        Log.m105925i("MicroMsg.LauncherUI.GlobalAlertMgr", "summeralert jumpByActionType  alertId[%d], actionType[%d], btnId[%d], url[%s]", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        C115669n.INSTANCE.mo160131h(13191, Integer.valueOf(i), Integer.valueOf(i3), Boolean.FALSE);
        switch (i2) {
            case 2:
                Intent intent = new Intent();
                intent.putExtra("rawUrl", str);
                intent.putExtra("showShare", false);
                intent.putExtra("show_bottom", false);
                intent.putExtra("needRedirect", false);
                intent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.f121047h);
                intent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.f121044e);
                C88144b.m109791i(this.f214221a, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                return;
            case 3:
                if (this.f214228h) {
                    mo101298b(true);
                    return;
                }
                if (this.f214229i == null) {
                    this.f214229i = new C74818t0(this);
                }
                C97625j3.m125815e().mo123455a(255, this.f214229i);
                C1302b0 b0Var = new C1302b0(1);
                C97625j3.m125815e().mo123460f(b0Var);
                this.f214227g = C76879j.m92723Q(this.f214221a, mo101297a(C0966R.string.a3h), mo101297a(C0966R.string.it9), true, true, new C73023d(this, b0Var));
                return;
            case 4:
                Intent intent2 = new Intent();
                intent2.setClass(this.f214221a, BindMContactUI.class);
                intent2.putExtra("bind_scene", 3);
                String simCountryIso = ((TelephonyManager) this.f214221a.getSystemService("phone")).getSimCountryIso();
                if (!Util.isNullOrNil(simCountryIso) && (a = C76850a.m92629a(this.f214221a, simCountryIso, mo101297a(C0966R.string.bvs))) != null) {
                    intent2.putExtra("country_name", a.f224677c);
                    intent2.putExtra("couttry_code", a.f224676b);
                }
                MMWizardActivity.m7017L7(this.f214221a, intent2);
                return;
            case 5:
                Intent intent3 = new Intent();
                intent3.putExtra("BaseScanUI_select_scan_mode", 1);
                intent3.putExtra("GetFriendQRCodeUI.INTENT_FROM_ACTIVITY", 0);
                intent3.setFlags(65536);
                if (!C61104a.m71651g(this.f214221a) && !C61104a.m71667w(this.f214221a) && !C61104a.m71647c(this.f214221a, true)) {
                    C88144b.m109791i(this.f214221a, "scanner", ".ui.BaseScanUI", intent3, (Bundle) null);
                    return;
                }
                return;
            case 6:
                Intent intent4 = new Intent(this.f214221a, SettingsModifyAliasUI.class);
                intent4.putExtra("WizardRootClass", SettingsAccountInfoUI.class.getCanonicalName());
                MMWizardActivity.m7017L7(this.f214221a, intent4);
                return;
            case 7:
                Intent intent5 = new Intent(this.f214221a, SettingsModifyEmailAddrUI.class);
                MMFragmentActivity mMFragmentActivity = this.f214221a;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent5);
                MMFragmentActivity mMFragmentActivity2 = mMFragmentActivity;
                C117292a.m165358d(mMFragmentActivity2, aVar.mo10232b(), "com/tencent/mm/ui/GlobalAlertMgr", "jumpByActionType", "(IIILjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                mMFragmentActivity.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(mMFragmentActivity2, "com/tencent/mm/ui/GlobalAlertMgr", "jumpByActionType", "(IIILjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return;
            default:
                return;
        }
    }

    /* renamed from: d */
    public final boolean mo101300d(GlobalAlertEvent.C67717a aVar) {
        C77684b bVar;
        LinkedList<C77683a> linkedList;
        if (aVar == null || (bVar = aVar.f193675a) == null || (linkedList = bVar.f226458g) == null || linkedList.size() == 0) {
            return false;
        }
        C77684b bVar2 = aVar.f193675a;
        int i = bVar2.f226455d;
        String str = bVar2.f226456e;
        String str2 = bVar2.f226457f;
        int i2 = aVar.f193678d;
        int size = bVar2.f226458g.size();
        C77684b bVar3 = aVar.f193675a;
        int i3 = bVar3.f226459h;
        if (i3 < 0 || i3 >= size) {
            if (i2 == 0) {
                if (size == 1) {
                    C77683a aVar2 = bVar3.f226458g.get(0);
                    Log.m105925i("MicroMsg.LauncherUI.GlobalAlertMgr", "summeralert id[%d], title[%s], msg[%s], id[%d], action[%d], btnstr[%s], btnurl[%s]", Integer.valueOf(i), str, str2, Integer.valueOf(aVar2.f226451d), Integer.valueOf(aVar2.f226452e), aVar2.f226453f, aVar2.f226454g);
                    C76879j.m92711E(this.f214221a, str2, str, aVar2.f226453f, false, new C73020a(i, aVar2));
                } else {
                    C77683a aVar3 = bVar3.f226458g.get(1);
                    C77683a aVar4 = aVar.f193675a.f226458g.get(0);
                    Log.m105925i("MicroMsg.LauncherUI.GlobalAlertMgr", "summeralert title[%s], msg[%s], id1[%d], action1[%d], btnstr1[%s],btnurl1[%s], id2[%d], action2[%d], btnstr2[%s], btnurl2[%s]", str, str2, Integer.valueOf(aVar3.f226451d), Integer.valueOf(aVar3.f226452e), aVar3.f226453f, aVar3.f226454g, Integer.valueOf(aVar4.f226451d), Integer.valueOf(aVar4.f226452e), aVar4.f226453f, aVar4.f226454g);
                    C76879j.m92709C(this.f214221a, str2, str, aVar3.f226453f, aVar4.f226453f, false, new C73021b(i, aVar3), new C73022c(i, aVar4));
                }
            } else if (i2 == 1) {
                C76879j.m92709C(this.f214221a, str2, str, bVar3.f226458g.get(0).f226453f, aVar.f193675a.f226458g.get(1).f226453f, false, aVar.f193676b, aVar.f193677c);
            }
            return true;
        }
        C77683a aVar5 = bVar3.f226458g.get(i3);
        mo101299c(i, aVar5.f226452e, aVar5.f226451d, aVar5.f226454g);
        return true;
    }

    /* renamed from: e */
    public final void mo101301e() {
        C77398g gVar = this.f214226f;
        if (gVar != null) {
            gVar.show();
            return;
        }
        if (this.f214224d == null) {
            View inflate = View.inflate(this.f214221a, C0966R.C0971layout.bwo, (ViewGroup) null);
            this.f214224d = inflate;
            ((TextView) inflate.findViewById(C0966R.C0970id.jc8)).setText(mo101297a(C0966R.string.iss));
            EditText editText = (EditText) this.f214224d.findViewById(C0966R.C0970id.jc7);
            this.f214225e = editText;
            editText.setInputType(129);
        }
        this.f214226f = C76879j.m92753x(this.f214221a, (String) null, (String) null, this.f214224d, new C73024e(), new C73027f());
    }
}
