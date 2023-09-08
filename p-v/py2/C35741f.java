package py2;

import android.util.Base64;
import az2.C39674e;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import f40.C86709a0;
import f62.C45760z0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import md3.C47001b;
import o40.C61926c;
import p327ct.C20362d;
import rx3.C13598b0;
import rz2.C48206h;
import te3.C50052jy2;
import te3.C50482n20;
import te3.C52085y83;
import uz2.C52718u;
import z04.C112551y;

/* renamed from: py2.f */
public final class C35741f implements C45760z0, C47001b.C47003b, C20362d.C20364b {

    /* renamed from: py2.f$a */
    public static final class C35742a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f95456d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35742a(String str) {
            super(0);
            this.f95456d = str;
        }

        public Object invoke() {
            C39674e.f106452d.mo62255t0().mo72973qq(this.f95456d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: P0 */
    public void mo31845P0(int i, int i2, String str) {
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_TEXT_STATUS_LAST_MARK_READ_TIME_LONG_SYNC, Long.valueOf(System.currentTimeMillis()));
        Log.m105924i("MicroMsg.TextStatus.PluginTextStatus", "bradge mark read");
    }

    /* renamed from: W4 */
    public void mo59215W4(C72996z1 z1Var, C72996z1 z1Var2, C50052jy2 jy22, byte[] bArr, boolean z) {
        C50052jy2 jy23 = jy22;
        if (jy23 != null && jy23.f136455t1 == 2 && z1Var != null && z1Var.mo62927s3()) {
            String str = jy23.f136449q1;
            String str2 = jy23.f136453s1;
            Log.m105924i("MicroMsg.TextStatus.PluginTextStatus", "afterContactUpdate, statusID: " + str + ", extInfo: " + str2);
            boolean z2 = true;
            if (!(str == null || str.length() == 0)) {
                if (!(str2 == null || str2.length() == 0)) {
                    z2 = false;
                }
                if (!z2) {
                    C52718u uVar = new C52718u();
                    try {
                        uVar.parseFrom(Base64.decode(str2, 0));
                        C39674e eVar = C39674e.f106452d;
                        String username = z1Var.getUsername();
                        C87412m.m108593f(username, "newContact.username");
                        C87412m.m108593f(str, "statusID");
                        C39674e.m42303X0(eVar, username, str, uVar, 0, (String) null, 0, 56, (Object) null);
                        return;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.TextStatus.PluginTextStatus", th, "afterContactUpdate err id:" + str, new Object[0]);
                        return;
                    }
                }
            }
            C48206h t0 = C39674e.f106452d.mo62255t0();
            String username2 = z1Var.getUsername();
            C87412m.m108593f(username2, "newContact.username");
            t0.mo72973qq(username2);
        }
    }

    /* renamed from: Z1 */
    public void mo59216Z1(C72996z1 z1Var, C72996z1 z1Var2, C50052jy2 jy22, byte[] bArr, boolean z) {
    }

    /* renamed from: b1 */
    public void mo59217b1(C72996z1 z1Var, C50482n20 n202) {
    }

    /* renamed from: v0 */
    public void mo31846v0(C72994y1.C72995a aVar, int i, String str) {
    }

    /* renamed from: v2 */
    public void mo59463v2(String str, int i, C52085y83 y832) {
        Log.m105918d("MicroMsg.TextStatus.PluginTextStatus", "onDeleteContact() called with: username = " + str + ", ret = " + i + ", oplogErrMsg = " + y832);
        if (i == 0) {
            if (!(str == null || C112551y.m153811k(str))) {
                C61926c.m72656A((String) null, new C35742a(str));
            }
        }
    }
}
