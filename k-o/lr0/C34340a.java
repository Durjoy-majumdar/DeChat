package lr0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C30783v3;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import kr0.C33993f0;

/* renamed from: lr0.a */
public class C34340a implements C30783v3.C30789f {
    /* renamed from: A */
    public void mo57713A(C72976h2 h2Var, C30783v3 v3Var) {
        if (h2Var != null && !Util.isNullOrNil(h2Var.getUsername())) {
            String username = h2Var.getUsername();
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(username);
            if (z1Var == null || ((int) z1Var.f108320R1) == 0) {
                Log.m105921e("MicroMsg.AppBrandConversionExtension", "contact is null or contactId is 0 for %s", username);
            } else if (C72996z1.m85804J4(username) && !C72996z1.m85793A5(username)) {
                Log.m105924i("MicroMsg.AppBrandConversionExtension", "this conversation is a app brand contact!");
                h2Var.mo108807c3("appbrandcustomerservicemsg");
                ((C33993f0) C86312j.m106911c(C33993f0.class)).am0(h2Var);
            } else if (C72996z1.m85808L4(username)) {
                Log.m105924i("MicroMsg.AppBrandConversionExtension", "appBrandSuperConv is created");
                h2Var.mo108807c3((String) null);
            }
        }
    }
}
