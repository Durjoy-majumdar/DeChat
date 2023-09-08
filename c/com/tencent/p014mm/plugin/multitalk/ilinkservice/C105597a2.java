package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.a2 */
public class C105597a2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C105598b f314056d;

    /* renamed from: e */
    public final /* synthetic */ boolean f314057e;

    /* renamed from: f */
    public final /* synthetic */ C105724z f314058f;

    public C105597a2(C105724z zVar, C105598b bVar, boolean z) {
        this.f314058f = zVar;
        this.f314056d = bVar;
        this.f314057e = z;
    }

    public void run() {
        boolean z;
        if (this.f314058f.f314401n != 1) {
            Log.m105920e("MicroMsg.Multitalk.ILinkService", "hy: not in room!");
            C105598b bVar = this.f314056d;
            if (bVar != null) {
                bVar.mo150477a(-10086, -1001, "not in room", "");
                return;
            }
        }
        C105657m mVar = this.f314058f.f314390g;
        boolean z2 = this.f314057e;
        if (mVar.f314154b != null) {
            mVar.f314154b.mo161909n(z2);
            z = true;
        } else {
            z = false;
        }
        Object[] objArr = new Object[1];
        objArr[0] = this.f314057e ? "mute" : "unMute";
        Log.m105925i("MicroMsg.Multitalk.ILinkService", "hy: setMuteRecord call switchAV %s", objArr);
        C105724z zVar = this.f314058f;
        boolean z3 = true ^ this.f314057e;
        zVar.f314407p1 = z3;
        C105714w.f314302c.SwitchAV(z3 ? 1 : 0, zVar.f314423x0 ? 1 : 0, zVar.f314426y0);
        C105598b bVar2 = this.f314056d;
        if (bVar2 == null) {
            return;
        }
        if (z) {
            bVar2.mo150477a(0, 0, "ok", "");
        } else {
            bVar2.mo150477a(-10086, -15, "set mute failed", "");
        }
    }
}
