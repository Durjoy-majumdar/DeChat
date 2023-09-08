package com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service;

import com.tencent.p014mm.sdk.platformtools.Log;
import p576jp.C33610c;

/* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.j0 */
public class C85153j0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C33610c.C33611a f248105d;

    /* renamed from: e */
    public final /* synthetic */ C85147b f248106e;

    /* renamed from: f */
    public final /* synthetic */ C105181w f248107f;

    public C85153j0(C105181w wVar, C33610c.C33611a aVar, C85147b bVar) {
        this.f248107f = wVar;
        this.f248105d = aVar;
        this.f248106e = bVar;
    }

    public void run() {
        int f = this.f248107f.mo149499f(this.f248105d);
        if (f == -9999) {
            Log.m105928w("MicroMsg.OpenVoice.OpenVoiceService", "hy: pending exit. waiting for next time");
            this.f248107f.f312353Q = this.f248106e;
            return;
        }
        C85147b bVar = this.f248106e;
        if (bVar == null) {
            return;
        }
        if (f == 0) {
            bVar.mo118169a(0, 0, "", "");
        } else {
            bVar.mo118169a(-10086, -17, "exit failed", "");
        }
    }
}
