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

/* renamed from: com.tencent.mm.plugin.account.ui.LoginFaceUI */
public class LoginFaceUI extends LoginHistoryUI {

    /* renamed from: com.tencent.mm.plugin.account.ui.LoginFaceUI$a */
    public class C1431a implements View.OnClickListener {
        public C1431a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/ui/LoginFaceUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C115669n.INSTANCE.mo160131h(11557, 2);
            Intent intent = new Intent();
            intent.putExtra("k_user_name", LoginFaceUI.this.f344498B);
            intent.putExtra("k_purpose", 2);
            intent.putExtra("k_need_signature", true);
            C88144b.m109795m(LoginFaceUI.this.getContext(), "facedetect", ".ui.FaceDetectUI", intent, 1025);
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/LoginFaceUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.LoginFaceUI$b */
    public class C1432b implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C114735a0 f10683d;

        public C1432b(C114735a0 a0Var) {
            this.f10683d = a0Var;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C86709a0.m107524d().mo123458d(this.f10683d);
            LoginFaceUI loginFaceUI = LoginFaceUI.this;
            loginFaceUI.getClass();
            C86709a0.m107524d().mo123470p(701, loginFaceUI);
            C86709a0.m107524d().mo123470p(252, loginFaceUI);
        }
    }

    /* renamed from: K7 */
    public void mo1399K7() {
        super.mo1399K7();
        mo174614J7();
        C114735a0 a0Var = new C114735a0(this.f344498B, this.f344509M, "", 0);
        Object[] objArr = new Object[4];
        String str = this.f344509M;
        int i = -1;
        objArr[0] = Integer.valueOf(str == null ? -1 : str.length());
        objArr[1] = Util.secPrint(this.f344509M);
        String str2 = this.f344532t.f345163c;
        if (str2 != null) {
            i = str2.length();
        }
        objArr[2] = Integer.valueOf(i);
        objArr[3] = Util.secPrint(this.f344532t.f345163c);
        Log.m105919d("MicroMsg.LoginFaceUI", "summerauth mAuthPwd len:%d content[%s] logindata.rawPsw len:%d content[%s]", objArr);
        this.f344530r = C76879j.m92723Q(this, getString(C0966R.string.a3h), getString(C0966R.string.gda), true, true, new C1432b(a0Var));
        C86709a0.m107524d().mo123460f(a0Var);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f344513R = 4;
        this.f344505I.setVisibility(0);
        View view = this.f344524i;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/LoginFaceUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/account/ui/LoginFaceUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById(C0966R.C0970id.cp5).setEnabled(false);
        ((TextView) findViewById(C0966R.C0970id.cqf)).setTextColor(getResources().getColorStateList(C0966R.color.alc));
        ((TextView) findViewById(C0966R.C0970id.cqf)).setBackgroundResource(getResources().getColor(C0966R.color.ahf));
        this.f344524i.setOnClickListener(new C1431a());
    }
}
