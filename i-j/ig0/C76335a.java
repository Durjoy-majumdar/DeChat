package ig0;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.plugin.account.friend.p022ui.FindMContactAddUI;
import com.tencent.p014mm.plugin.account.friend.p022ui.FindMContactInviteUI;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;
import p910lj.C76701a;

/* renamed from: ig0.a */
public class C76335a implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ FindMContactAddUI f223591d;

    public C76335a(FindMContactAddUI findMContactAddUI) {
        this.f223591d = findMContactAddUI;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        ProgressDialog progressDialog = this.f223591d.f196544g;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f223591d.f196544g = null;
        }
        if (this.f223591d.f196552r != null) {
            C86709a0.m107524d().mo123470p(30, this.f223591d.f196552r);
            this.f223591d.f196552r = null;
        }
        if (i == 4 && i2 == -24 && !Util.isNullOrNil(str)) {
            C76701a.makeText((Context) this.f223591d.getContext(), (CharSequence) str, 1).show();
            return;
        }
        String str2 = this.f223591d.f196553s;
        if (str2 == null || !str2.contains("2")) {
            this.f223591d.mo93953O7();
            return;
        }
        Intent intent = new Intent(this.f223591d, FindMContactInviteUI.class);
        intent.putExtra("regsetinfo_ticket", this.f223591d.f196551q);
        intent.putExtra("login_type", this.f223591d.f196555u);
        intent.putExtra("regsetinfo_NextStyle", this.f223591d.f196554t);
        MMWizardActivity.m7017L7(this.f223591d, intent);
    }
}
