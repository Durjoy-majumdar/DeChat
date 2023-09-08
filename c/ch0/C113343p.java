package ch0;

import com.tencent.p014mm.autogen.events.NeedVerifyQQEvent;
import com.tencent.p014mm.plugin.address.p879ui.WalletSelectAddrUI;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C97625j3;
import zg0.C66802f;

/* renamed from: ch0.p */
public class C113343p implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ NeedVerifyQQEvent f339117d;

    /* renamed from: e */
    public final /* synthetic */ WalletSelectAddrUI f339118e;

    /* renamed from: ch0.p$a */
    public class C113344a implements Runnable {
        public C113344a() {
        }

        public void run() {
            if (C113343p.this.f339117d.f236244e.f236247a) {
                String nullAsNil = Util.nullAsNil((String) C97625j3.m125812b().mo105906u().mo119684e(46, (Object) null));
                String nullAsNil2 = Util.nullAsNil((String) C97625j3.m125812b().mo105906u().mo119684e(72, (Object) null));
                WalletSelectAddrUI walletSelectAddrUI = C113343p.this.f339118e;
                int i = WalletSelectAddrUI.f345287w;
                walletSelectAddrUI.f345292h.mo164546b(new C66802f(nullAsNil, nullAsNil2, walletSelectAddrUI.f345296o), true);
            }
        }
    }

    public C113343p(WalletSelectAddrUI walletSelectAddrUI, NeedVerifyQQEvent needVerifyQQEvent) {
        this.f339118e = walletSelectAddrUI;
        this.f339117d = needVerifyQQEvent;
    }

    public void run() {
        this.f339118e.f345291g.post(new C113344a());
    }
}
