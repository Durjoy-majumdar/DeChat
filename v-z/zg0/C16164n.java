package zg0;

import bh0.C113174b;
import bh0.C54460a;
import com.tencent.p014mm.autogen.events.RcptRecentAddrEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C97625j3;
import ob0.C11385n;
import ob0.C117747y;
import xg0.C78803b;

/* renamed from: zg0.n */
public class C16164n extends IStaticListener<RcptRecentAddrEvent> implements C11385n {

    /* renamed from: d */
    public RcptRecentAddrEvent f43356d;

    public boolean callback(IEvent iEvent) {
        RcptRecentAddrEvent rcptRecentAddrEvent = (RcptRecentAddrEvent) iEvent;
        if (rcptRecentAddrEvent instanceof RcptRecentAddrEvent) {
            this.f43356d = rcptRecentAddrEvent;
            C97625j3.m125815e().mo123455a(417, this);
            RcptRecentAddrEvent.C1111a aVar = this.f43356d.f9407d;
            C97625j3.m125815e().mo123460f(new C66803g(0, aVar.f9410b, aVar.f9409a, 1));
        }
        return true;
    }

    /* renamed from: d */
    public final void mo14721d(int i, boolean z) {
        Log.m105919d("MicroMsg.RcptGetAddrEventListener", "setResult errCode[%s], isAccept[%s]", Integer.valueOf(i), Boolean.valueOf(z));
        RcptRecentAddrEvent.C1112b bVar = this.f43356d.f9408e;
        bVar.f9411a = i;
        if (i != 0) {
            bVar.f9412b = false;
        } else if (!z) {
            bVar.f9412b = false;
        } else {
            bVar.f9412b = true;
            C78803b.vx0();
            C54460a aVar = C78803b.xx0().f356680a;
            if (aVar.f152728d.size() > 0) {
                C113174b first = aVar.f152728d.getFirst();
                RcptRecentAddrEvent.C1112b bVar2 = this.f43356d.f9408e;
                bVar2.f9413c = first.f338623p;
                bVar2.f9415e = first.f338621n;
                bVar2.f9414d = first.f338622o;
                bVar2.f9416f = first.f338619i;
                bVar2.f9417g = first.f338616f;
                bVar2.f9418h = first.f338617g;
                bVar2.f9419i = first.f338618h;
                bVar2.f9420j = first.f338624q;
                bVar2.f9421k = first.f338620j;
                bVar2.f9422l = aVar.f152728d;
            }
        }
        Runnable runnable = this.f43356d.callback;
        if (runnable != null) {
            runnable.run();
        }
        this.f43356d = null;
        C97625j3.m125815e().mo123470p(417, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105919d("MicroMsg.RcptGetAddrEventListener", "onSceneEnd errType[%s], errCode[%s]", Integer.valueOf(i), Integer.valueOf(i2));
        if (!(yVar instanceof C66803g)) {
            return;
        }
        if (i2 == 0) {
            mo14721d(i2, true);
        } else {
            mo14721d(i2, false);
        }
    }
}
