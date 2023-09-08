package dn2;

import android.content.DialogInterface;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import d62.C7250m;
import eb0.C75592q0;
import nj3.C76879j;
import pc0.C100760a0;
import qo3.C89779i0;

/* renamed from: dn2.l */
public final class C75417l implements MMActivity.C6739d {

    /* renamed from: d */
    public final /* synthetic */ C7373a f221701d;

    /* renamed from: e */
    public final /* synthetic */ String f221702e;

    public C75417l(C7373a aVar, String str) {
        this.f221701d = aVar;
        this.f221702e = str;
    }

    public final void mmOnActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && intent != null && i == 1) {
            C7373a aVar = this.f221701d;
            MMActivity mMActivity = aVar.f25505a;
            String str = this.f221702e;
            aVar.getClass();
            String stringExtra = intent.getStringExtra("Select_Conv_User");
            C89779i0 Q = C76879j.m92723Q(mMActivity, "", mMActivity.getResources().getString(C0966R.string.hit), true, false, (DialogInterface.OnCancelListener) null);
            String stringExtra2 = intent.getStringExtra("custom_send_text");
            C100760a0.C100764f b = C100760a0.m131932b(C100760a0.C100763e.IMAGE);
            b.f295195i = 4;
            b.f295188b = C75592q0.m90789s();
            b.f295187a = stringExtra;
            b.f295196j = str;
            b.f295197k = 0;
            b.f295198l = null;
            b.f295200n = 0;
            b.f295204r = "";
            b.f295205s = "";
            b.f295202p = true;
            b.f295201o = C0966R.C0969drawable.by8;
            b.f295194h = 11;
            b.mo140195a().mo123694a();
            C7250m.m7431a().mo136252Ar(stringExtra2, stringExtra);
            if (Q != null) {
                Q.dismiss();
            }
        }
    }
}
