package l02;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f62.C45760z0;
import gy3.C87412m;
import md3.C47001b;
import n02.C100030c;
import n02.C34721f;
import o40.C61926c;
import te3.C50052jy2;
import te3.C50482n20;
import te3.C52085y83;
import z04.C112551y;

/* renamed from: l02.d */
public final class C34147d implements C45760z0, C47001b.C47003b {
    /* renamed from: W4 */
    public void mo59215W4(C72996z1 z1Var, C72996z1 z1Var2, C50052jy2 jy22, byte[] bArr, boolean z) {
        if (jy22 != null && z1Var != null && z1Var.mo62927s3()) {
            Log.m105918d("MicroMsg.HashInfo.PluginHashInfo", "afterContactUpdate update " + z1Var.getUsername());
            C100030c vx02 = ((C99275h) C86312j.m106911c(C99275h.class)).vx0();
            String username = z1Var.getUsername();
            C87412m.m108593f(username, "newContact.username");
            vx02.mo139361i3(username);
        }
    }

    /* renamed from: Z1 */
    public void mo59216Z1(C72996z1 z1Var, C72996z1 z1Var2, C50052jy2 jy22, byte[] bArr, boolean z) {
    }

    /* renamed from: b1 */
    public void mo59217b1(C72996z1 z1Var, C50482n20 n202) {
    }

    /* renamed from: v2 */
    public void mo59463v2(String str, int i, C52085y83 y832) {
        Log.m105918d("MicroMsg.HashInfo.PluginHashInfo", "onDeleteContact() called with: username = " + str + ", ret = " + i + ", oplogErrMsg = " + y832);
        if (i == 0) {
            boolean z = false;
            if (!(str == null || C112551y.m153811k(str))) {
                C100030c vx02 = ((C99275h) C86312j.m106911c(C99275h.class)).vx0();
                if (str == null || C112551y.m153811k(str)) {
                    z = true;
                }
                if (!z) {
                    C61926c.m72657B("MicroMsg.HashInfo.HashUserNameMapStorage", true, new C34721f(vx02, str));
                }
            }
        }
    }
}
