package h02;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86301e;
import ei3.C86522b;
import i02.C33175b;
import k02.C21299a;
import k02.C21300b;
import lp3.C88633e;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: h02.d */
public class C87416d extends C86301e implements C33175b {
    /* renamed from: On */
    public void mo58995On(boolean z) {
        C88633e eVar = new C88633e();
        eVar.mo123077t(MMApplicationContext.getContext());
        eVar.mo123060U(new C21299a()).mo123064p(new C21300b(z)).mo123065b(new C32645c(this)).mo114038a(new C32644b(this));
    }

    public void onAccountInitialized(Context context) {
        super.onAccountInitialized(context);
        if (MMApplicationContext.isMainProcess()) {
            mo58995On(false);
        }
    }
}
