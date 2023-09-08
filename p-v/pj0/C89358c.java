package pj0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.udp.libmmudp.C30803a;
import p206nj.C88957l;
import zj0.C91763d;

/* renamed from: pj0.c */
public class C89358c implements C30803a.C30805b {
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
