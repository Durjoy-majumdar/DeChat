package ag2;

import android.util.Base64;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;

/* renamed from: ag2.h0 */
public class C27894h0 {

    /* renamed from: a */
    public C39581g0 f77058a;

    public C27894h0() {
        String str = (String) C86709a0.m107535s().mo121142i().mo119684e(282625, "");
        try {
            C39581g0 g0Var = new C39581g0();
            this.f77058a = g0Var;
            g0Var.parseFrom(Base64.decode(str, 0));
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ShareMailInfoMgr", e, "", new Object[0]);
            Log.m105928w("MicroMsg.ShareMailInfoMgr", "parse from config fail");
            this.f77058a = new C39581g0();
        }
    }
}
