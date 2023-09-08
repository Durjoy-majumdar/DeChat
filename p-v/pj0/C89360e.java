package pj0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import p206nj.C88957l;
import t10.C36935a;
import zj0.C91763d;

/* renamed from: pj0.e */
public class C89360e implements C36935a.C36937b {
    public void loadLibrary(String str) {
        try {
            Log.m105925i("MicroMsg.WAGame.MBLoadDelegateRegistryWC", "loadLibrary libName:%s", str);
            C88957l.m111079o(str, C89362g.f257343a);
        } catch (UnsatisfiedLinkError e) {
            Log.printErrStackTrace("MicroMsg.WAGame.MBLoadDelegateRegistryWC", e, "hy: link %s error!!", str);
            C91763d.m115295a(MMApplicationContext.getContext());
        }
    }
}
