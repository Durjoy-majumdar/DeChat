package com.tencent.p014mm.plugin.wallet_core.id_verify;

import android.content.Context;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.picker.C7045j;
import java.util.ArrayList;
import te3.C77922en3;

/* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.n */
public class C72156n implements C0120a0<Boolean> {

    /* renamed from: d */
    public int f209321d = 0;

    /* renamed from: e */
    public final /* synthetic */ WcPayRealnameVerifyIdInputUI f209322e;

    public C72156n(WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI) {
        this.f209322e = wcPayRealnameVerifyIdInputUI;
    }

    public void onChanged(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f209322e.hideTenpayKB();
        if (bool == null || !bool.booleanValue()) {
            C7045j jVar = this.f209322e.f209194t;
            if (jVar != null) {
                jVar.mo8101d();
            }
        } else if (((ArrayList) this.f209322e.f209164F).size() > 0) {
            String[] strArr = new String[((ArrayList) this.f209322e.f209164F).size()];
            this.f209322e.getResources().getIntArray(C0966R.array.f2611ay);
            for (int i = 0; i < ((ArrayList) this.f209322e.f209164F).size(); i++) {
                strArr[i] = ((C77922en3) ((ArrayList) this.f209322e.f209164F).get(i)).f227260d.f184009e;
            }
            WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI = this.f209322e;
            wcPayRealnameVerifyIdInputUI.f209194t = new C7045j((Context) wcPayRealnameVerifyIdInputUI.getContext(), strArr);
            C7045j jVar2 = this.f209322e.f209194t;
            jVar2.f24869t = new C72153m(this);
            jVar2.mo8106i(this.f209321d);
            this.f209322e.f209194t.mo8109l();
        }
    }
}
