package o53;

import android.content.DialogInterface;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import gy3.C87412m;
import java.util.UUID;
import m53.C10763i;
import n53.C11124g;
import qo3.C89779i0;

/* renamed from: o53.o */
public final class C11370o implements MMActivity.C6739d {

    /* renamed from: d */
    public final /* synthetic */ C11371p f33473d;

    public C11370o(C11371p pVar) {
        this.f33473d = pVar;
    }

    public final void mmOnActivityResult(int i, int i2, Intent intent) {
        if (i != 20001) {
            return;
        }
        if (i2 == -1) {
            String stringExtra = intent != null ? intent.getStringExtra("intent_auth_token") : null;
            if (!(stringExtra == null || stringExtra.length() == 0)) {
                C11371p pVar = this.f33473d;
                MMActivity mMActivity = pVar.f33474a;
                pVar.f33477d = C89779i0.m112248e(mMActivity, mMActivity.getString(C0966R.string.gas), false, 3, (DialogInterface.OnCancelListener) null);
                String uuid = UUID.randomUUID().toString();
                C87412m.m108593f(uuid, "uuid.toString()");
                new C11124g(stringExtra, uuid, pVar.f33475b.f32234a).mo9225i().mo123062e(new C11369n(pVar)).mo11397F(mMActivity);
                return;
            }
            C10763i iVar = this.f33473d.f33476c.get();
            if (iVar != null) {
                iVar.mo11006a2();
                return;
            }
            return;
        }
        C10763i iVar2 = this.f33473d.f33476c.get();
        if (iVar2 != null) {
            iVar2.mo11006a2();
        }
    }
}
