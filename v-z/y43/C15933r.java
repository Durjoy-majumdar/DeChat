package y43;

import com.tencent.p014mm.autogen.events.WCPayWalletBufferEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: y43.r */
public class C15933r implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ int f42811d;

    /* renamed from: e */
    public final /* synthetic */ WCPayWalletBufferEvent f42812e;

    /* renamed from: f */
    public final /* synthetic */ C15934s f42813f;

    public C15933r(C15934s sVar, int i, WCPayWalletBufferEvent wCPayWalletBufferEvent) {
        this.f42813f = sVar;
        this.f42811d = i;
        this.f42812e = wCPayWalletBufferEvent;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(1767, this);
        if (i == 0 && i2 == 0) {
            C15934s sVar = this.f42813f;
            int i3 = this.f42811d;
            String str2 = this.f42812e.f9578d.f9589j;
            sVar.getClass();
            if (i3 == 1) {
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WCPAY_WALLET_BUFFER_CN_STRING_SYNC, str2);
            } else if (i3 == 2) {
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WCPAY_WALLET_BUFFER_MY_STRING_SYNC, str2);
            } else if (i3 == 4) {
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WCPAY_WALLET_BUFFER_ZA_STRING_SYNC, str2);
            } else if (i3 == 8) {
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WCPAY_WALLET_BUFFER_HK_STRING_SYNC, str2);
            }
            this.f42812e.f9579e.f9592c.run();
            return;
        }
        Log.m105925i("MicroMsg.HandleWCPayWalletBufferListener", "check jsapi error: %s, %s", Integer.valueOf(i2), str);
        WCPayWalletBufferEvent.C1160b bVar = this.f42812e.f9579e;
        bVar.f9590a = -1;
        bVar.f9592c.run();
    }
}
