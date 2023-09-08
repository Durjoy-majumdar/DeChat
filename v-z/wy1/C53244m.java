package wy1;

import android.app.ProgressDialog;
import android.content.Context;
import com.tencent.p014mm.p136ui.C45096v3;
import com.tencent.p014mm.p136ui.C45098w3;
import com.tencent.p014mm.sdk.platformtools.Log;
import wy1.C53221c;
import xy1.C15913g;

/* renamed from: wy1.m */
public final class C53244m implements C15913g.C15914a {

    /* renamed from: a */
    public final /* synthetic */ ProgressDialog f148577a;

    /* renamed from: b */
    public final /* synthetic */ C53221c.C53222a f148578b;

    /* renamed from: c */
    public final /* synthetic */ Context f148579c;

    public C53244m(ProgressDialog progressDialog, C53221c.C53222a aVar, Context context) {
        this.f148577a = progressDialog;
        this.f148578b = aVar;
        this.f148579c = context;
    }

    /* renamed from: a */
    public void mo14560a(boolean z, boolean z2) {
        Log.m105925i("GameLife.PluginGameLife", "isBlackListAssociateWithWAGame isAssociate:%b,isOwnBlack:%b", Boolean.valueOf(z), Boolean.valueOf(z2));
        ProgressDialog progressDialog = this.f148577a;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f148577a.dismiss();
        }
        C53221c.C53222a aVar = this.f148578b;
        if (aVar != null) {
            C45098w3 w3Var = (C45098w3) aVar;
            w3Var.f122331a.f121203q.f29691a = Boolean.valueOf(z2);
            w3Var.f122331a.f121202p.f29691a = Boolean.valueOf(z);
            w3Var.f122331a.runOnUiThread(new C45096v3(w3Var));
        }
    }
}
