package com.tencent.p014mm.modelstat;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMEntryLock;
import f40.C86709a0;

/* renamed from: com.tencent.mm.modelstat.p */
public class C29043p implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f79586d;

    /* renamed from: e */
    public final /* synthetic */ int f79587e;

    /* renamed from: f */
    public final /* synthetic */ int f79588f;

    /* renamed from: g */
    public final /* synthetic */ boolean f79589g;

    /* renamed from: h */
    public final /* synthetic */ C29039o f79590h;

    public C29043p(C29039o oVar, int i, int i2, String str, int i3, String str2, boolean z) {
        this.f79590h = oVar;
        this.f79586d = i;
        this.f79587e = i2;
        this.f79588f = i3;
        this.f79589g = z;
    }

    public void run() {
        C29039o oVar = this.f79590h;
        int i = this.f79586d;
        int i2 = this.f79587e;
        int i3 = this.f79588f;
        boolean z = this.f79589g;
        oVar.getClass();
        if (C86709a0.m107523b().mo121114l()) {
            if (i == 4) {
                Log.m105918d("MicroMsg.NetStatMsgExtension", "recv bytes flow:" + i3);
                if (z) {
                    C114749s.m161433b((long) i3, 0, i2);
                } else {
                    C114749s.m161432a((long) i3, 0, i2);
                }
            } else if (i == 5) {
                Log.m105918d("MicroMsg.NetStatMsgExtension", "send bytes flow:" + i3);
                if (z) {
                    C114749s.m161433b(0, (long) i3, i2);
                } else {
                    C114749s.m161432a(0, (long) i3, i2);
                }
            } else if (i == 8) {
                MMEntryLock.lock("dns_failed_report");
            }
        }
    }

    public String toString() {
        return super.toString() + "|report";
    }
}
