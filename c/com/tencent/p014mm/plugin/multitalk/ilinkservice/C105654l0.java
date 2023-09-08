package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105703u;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import te3.rs4;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.l0 */
public class C105654l0 implements C105703u.C105704a<String, String> {

    /* renamed from: a */
    public final /* synthetic */ C105724z f314147a;

    public C105654l0(C105724z zVar) {
        this.f314147a = zVar;
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo150478a(byte[] bArr) {
        return "";
    }

    /* renamed from: b */
    public byte[] mo150479b(Object obj) {
        String str = (String) obj;
        return new byte[0];
    }

    /* renamed from: c */
    public Object mo150480c(int i, Object obj) {
        String str = (String) obj;
        Map<Long, rs4> map = this.f314147a.f314427y1;
        if (map != null && ((ConcurrentHashMap) map).size() > 0) {
            ((ConcurrentHashMap) this.f314147a.f314427y1).clear();
            Log.m105918d("MicroMsg.Multitalk.ILinkService", "clearmap recvInviteInfoMap success");
        }
        Log.m105924i("MicroMsg.Multitalk.ILinkService", "recv notify fail");
        return "";
    }

    /* renamed from: d */
    public boolean mo150481d() {
        return true;
    }
}
