package jl3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C97625j3;
import f62.C45760z0;
import kr0.C34010q0;
import p740wo.C53193b;
import te3.C50052jy2;
import te3.C50482n20;

/* renamed from: jl3.a */
public final class C33600a implements C45760z0 {
    /* renamed from: W4 */
    public void mo59215W4(C72996z1 z1Var, C72996z1 z1Var2, C50052jy2 jy22, byte[] bArr, boolean z) {
    }

    /* renamed from: Z1 */
    public void mo59216Z1(C72996z1 z1Var, C72996z1 z1Var2, C50052jy2 jy22, byte[] bArr, boolean z) {
    }

    /* renamed from: b1 */
    public void mo59217b1(C72996z1 z1Var, C50482n20 n202) {
        Class cls = C34010q0.class;
        StringBuilder sb = new StringBuilder();
        sb.append("del contact, talker: ");
        String str = null;
        sb.append(z1Var != null ? z1Var.getUsername() : null);
        Log.m105924i("MicroMsg.ConvBoxContactAssemblerImpl", sb.toString());
        C53193b bVar = (C53193b) C86312j.m106911c(C53193b.class);
        if (z1Var != null) {
            str = z1Var.getUsername();
        }
        if (!bVar.mo73723Hd(str)) {
            return;
        }
        if (((C34010q0) C86312j.m106911c(cls)).nj0() == 0) {
            ((C44660i2) C97625j3.m125812b().mo105908w()).mo69763f("conversationboxservice");
        } else {
            ((C34010q0) C86312j.m106911c(cls)).mo59405u9(false);
        }
    }
}
