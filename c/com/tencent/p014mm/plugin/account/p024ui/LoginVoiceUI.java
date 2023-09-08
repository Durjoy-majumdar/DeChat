package com.tencent.p014mm.plugin.account.p024ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelsimple.C114735a0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import nj3.C76879j;
import p148ei.C7660a;

/* renamed from: com.tencent.mm.plugin.account.ui.LoginVoiceUI */
public class LoginVoiceUI extends BaseLoginVoiceUI {

    /* renamed from: com.tencent.mm.plugin.account.ui.LoginVoiceUI$a */
    public class C1436a implements View.OnClickListener {
        public C1436a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/ui/LoginVoiceUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C115669n.INSTANCE.mo160131h(11557, 2);
            Intent intent = new Intent();
            intent.putExtra("Kusername", LoginVoiceUI.this.f344432x);
            intent.putExtra("kscene_type", 1);
            C88144b.m109795m(LoginVoiceUI.this.getContext(), "voiceprint", ".ui.VoiceLoginUI", intent, 1024);
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/LoginVoiceUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.LoginVoiceUI$b */
    public class C1437b implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C114735a0 f10711d;

        public C1437b(C114735a0 a0Var) {
            this.f10711d = a0Var;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C86709a0.m107524d().mo123458d(this.f10711d);
            LoginVoiceUI loginVoiceUI = LoginVoiceUI.this;
            loginVoiceUI.getClass();
            C86709a0.m107524d().mo123470p(701, loginVoiceUI);
            C86709a0.m107524d().mo123470p(252, loginVoiceUI);
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.LoginVoiceUI$c */
    public class C1438c implements DialogInterface.OnDismissListener {
        public C1438c(LoginVoiceUI loginVoiceUI) {
        }

        public void onDismiss(DialogInterface dialogInterface) {
        }
    }

    /* renamed from: K7 */
    public void mo1423K7() {
        super.mo1423K7();
        C86709a0.m107524d().mo123455a(701, this);
        C86709a0.m107524d().mo123455a(252, this);
        C114735a0 a0Var = new C114735a0(this.f344424p.f345162b, this.f344407D, "", 0);
        a0Var.mo174366v1(this.f344407D);
        Object[] objArr = new Object[4];
        String str = this.f344407D;
        int i = -1;
        objArr[0] = Integer.valueOf(str == null ? -1 : str.length());
        objArr[1] = Util.secPrint(this.f344407D);
        String str2 = this.f344424p.f345163c;
        if (str2 != null) {
            i = str2.length();
        }
        objArr[2] = Integer.valueOf(i);
        objArr[3] = Util.secPrint(this.f344424p.f345163c);
        Log.m105919d("MicroMsg.LoginVoiceUI", "summerauth mAuthPwd len:%d content[%s] logindata.rawPsw len:%d content[%s]", objArr);
        this.f344422n = C76879j.m92723Q(this, getString(C0966R.string.a3h), getString(C0966R.string.gda), true, true, new C1437b(a0Var));
        C86709a0.m107524d().mo123460f(a0Var);
    }

    /* renamed from: O7 */
    public boolean mo1424O7() {
        return false;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b8h;
    }

    public void initView() {
        C7660a a;
        super.initView();
        if (getIntent() != null) {
            int intExtra = getIntent().getIntExtra("key_errType", 0);
            int intExtra2 = getIntent().getIntExtra("key_errCode", 0);
            String stringExtra = getIntent().getStringExtra("key_errMsg");
            Log.m105925i("MicroMsg.LoginVoiceUI", "initView,errType %d,errCode %d", Integer.valueOf(intExtra), Integer.valueOf(intExtra2));
            if (C1468a.m1501b(intExtra, intExtra2) && (a = C7660a.m7782a(stringExtra)) != null) {
                a.mo8793c(this, new C1438c(this));
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f344411H = 1;
        View view = this.f344417f;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/LoginVoiceUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/account/ui/LoginVoiceUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById(C0966R.C0970id.la8).setEnabled(false);
        ((TextView) findViewById(C0966R.C0970id.laf)).setTextColor(getResources().getColorStateList(C0966R.color.alc));
        ((TextView) findViewById(C0966R.C0970id.laf)).setBackgroundResource(getResources().getColor(C0966R.color.ahf));
        this.f344417f.setOnClickListener(new C1436a());
    }
}
