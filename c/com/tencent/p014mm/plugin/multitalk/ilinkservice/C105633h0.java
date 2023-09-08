package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import te3.C64718sz;
import te3.rs4;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.h0 */
public class C105633h0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C64718sz f314117d;

    /* renamed from: e */
    public final /* synthetic */ C105641i0 f314118e;

    public C105633h0(C105641i0 i0Var, C64718sz szVar) {
        this.f314118e = i0Var;
        this.f314117d = szVar;
    }

    public void run() {
        Log.m105924i("MicroMsg.Multitalk.ILinkService", "recv invite busy callback!");
        if (this.f314117d != null) {
            Map<Long, rs4> map = this.f314118e.f314132a.f314427y1;
            if (map != null && ((ConcurrentHashMap) map).size() > 0) {
                ((ConcurrentHashMap) this.f314118e.f314132a.f314427y1).clear();
                Log.m105918d("MicroMsg.Multitalk.ILinkService", "clearmap recvInviteInfoMap success");
            }
            Log.m105925i("MicroMsg.Multitalk.ILinkService", "recv invite busy, imroomid:%d roomid:%d selfmemberid:%d", Long.valueOf(this.f314117d.f185455d), Long.valueOf(this.f314117d.f185456e), Integer.valueOf(this.f314117d.f185458g));
        }
        C105724z zVar = this.f314118e.f314132a;
        C105724z zVar2 = C105724z.INSTANCE;
        zVar.mo150603m();
    }
}
