package y43;

import com.tencent.p014mm.autogen.events.WCPayWalletBufferEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: y43.q */
public class C15932q implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ WCPayWalletBufferEvent f42809d;

    /* renamed from: e */
    public final /* synthetic */ String f42810e;

    public C15932q(C15934s sVar, WCPayWalletBufferEvent wCPayWalletBufferEvent, String str) {
        this.f42809d = wCPayWalletBufferEvent;
        this.f42810e = str;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(1767, this);
        if (i == 0 && i2 == 0) {
            WCPayWalletBufferEvent.C1160b bVar = this.f42809d.f9579e;
            bVar.f9591b = this.f42810e;
            bVar.f9592c.run();
            return;
        }
        Log.m105925i("MicroMsg.HandleWCPayWalletBufferListener", "check jsapi error: %s, %s", Integer.valueOf(i2), str);
        WCPayWalletBufferEvent.C1160b bVar2 = this.f42809d.f9579e;
        bVar2.f9590a = -1;
        bVar2.f9592c.run();
    }
}
