package com.tencent.p014mm.p136ui.tools;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.BackupCoreResetEvent;
import com.tencent.p014mm.p136ui.LauncherUI;
import com.tencent.p014mm.p136ui.MMActivity;
import f40.C86718e;
import j20.C117292a;
import k20.C9556a;
import nj3.C76879j;
import nj3.C88989a;
import p148ei.C7660a;

@C88989a(3)
/* renamed from: com.tencent.mm.ui.tools.AccountDeletedAlphaAlertUI */
public class AccountDeletedAlphaAlertUI extends MMActivity {

    /* renamed from: d */
    public static AccountDeletedAlphaAlertUI f348460d;

    /* renamed from: com.tencent.mm.ui.tools.AccountDeletedAlphaAlertUI$a */
    public class C116112a implements DialogInterface.OnClickListener {
        public C116112a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            AccountDeletedAlphaAlertUI.m163401H7(AccountDeletedAlphaAlertUI.this);
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.AccountDeletedAlphaAlertUI$b */
    public class C116113b implements DialogInterface.OnClickListener {
        public C116113b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            AccountDeletedAlphaAlertUI.m163401H7(AccountDeletedAlphaAlertUI.this);
        }
    }

    /* renamed from: H7 */
    public static void m163401H7(AccountDeletedAlphaAlertUI accountDeletedAlphaAlertUI) {
        accountDeletedAlphaAlertUI.finish();
        Intent intent = new Intent(accountDeletedAlphaAlertUI.getContext(), LauncherUI.class);
        intent.putExtra("Intro_Switch", true).addFlags(67108864);
        AppCompatActivity context = accountDeletedAlphaAlertUI.getContext();
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        AppCompatActivity appCompatActivity = context;
        C117292a.m165358d(appCompatActivity, aVar.mo10232b(), "com/tencent/mm/ui/tools/AccountDeletedAlphaAlertUI", "kickOff", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(appCompatActivity, "com/tencent/mm/ui/tools/AccountDeletedAlphaAlertUI", "kickOff", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public int getLayoutId() {
        return -1;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f348460d = this;
        new BackupCoreResetEvent().publish();
        C86718e.m107550n();
        C7660a a = C7660a.m7782a(getIntent().getStringExtra("errmsg"));
        if (a != null) {
            a.mo8792b(this, new C116112a(), (DialogInterface.OnClickListener) null);
        } else {
            C76879j.m92713G(this, getString(C0966R.string.gmb), (String) null, false, new C116113b());
        }
    }

    public void onDestroy() {
        if (equals(f348460d)) {
            f348460d = null;
        }
        super.onDestroy();
    }
}
