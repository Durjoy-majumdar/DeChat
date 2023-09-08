package com.tencent.p014mm.p136ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelsimple.C1307j0;
import com.tencent.p014mm.p136ui.C74785j2;
import com.tencent.p014mm.plugin.account.p024ui.RegByMobileSetPwdUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C97625j3;
import j20.C117292a;
import k20.C9556a;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: com.tencent.mm.ui.t0 */
public class C74818t0 implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ GlobalAlertMgr f219950d;

    /* renamed from: com.tencent.mm.ui.t0$a */
    public class C74819a implements DialogInterface.OnClickListener {
        public C74819a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C74818t0.this.f219950d.mo101301e();
        }
    }

    public C74818t0(GlobalAlertMgr globalAlertMgr) {
        this.f219950d = globalAlertMgr;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105924i("MicroMsg.LauncherUI.GlobalAlertMgr", "summeralert onSceneEnd " + i + " errCode " + i2 + " errMsg " + str + "  " + yVar.getType());
        ProgressDialog progressDialog = this.f219950d.f214227g;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f219950d.f214227g = null;
        }
        if (yVar.getType() == 255) {
            C97625j3.m125815e().mo123470p(255, this.f219950d.f214229i);
            if (i == 0 && i2 == 0) {
                this.f219950d.mo101298b(true);
            } else if (!C74785j2.C6981a.m7247a(this.f219950d.f214221a, i, i2, str, 4)) {
                this.f219950d.mo101298b(false);
            }
        } else if (yVar.getType() != 384) {
        } else {
            if (i == 0 && i2 == 0) {
                C97625j3.m125812b().mo105906u().mo119676J(77830, ((C1307j0) yVar).mo1225j1());
                Intent intent = new Intent(this.f219950d.f214221a, RegByMobileSetPwdUI.class);
                intent.putExtra("kintent_hint", this.f219950d.mo101297a(C0966R.string.iul));
                MMFragmentActivity mMFragmentActivity = this.f219950d.f214221a;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                MMFragmentActivity mMFragmentActivity2 = mMFragmentActivity;
                C117292a.m165358d(mMFragmentActivity2, aVar.mo10232b(), "com/tencent/mm/ui/GlobalAlertMgr$7", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                mMFragmentActivity.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(mMFragmentActivity2, "com/tencent/mm/ui/GlobalAlertMgr$7", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return;
            }
            GlobalAlertMgr globalAlertMgr = this.f219950d;
            globalAlertMgr.f214228h = true;
            C76879j.m92742m(globalAlertMgr.f214221a, C0966R.string.iw7, C0966R.string.a3h, new C74819a());
        }
    }
}
