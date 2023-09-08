package qj1;

import cl1.C0700z;
import com.tencent.p014mm.plugin.finder.live.infrastructure.livedata.LiveMutableData;

/* renamed from: qj1.l7 */
public final class C12499l7 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C12282d7 f35950d;

    public C12499l7(C12282d7 d7Var) {
        this.f35950d = d7Var;
    }

    public final void run() {
        LiveMutableData<Boolean> liveMutableData = ((C0700z) this.f35950d.mo87696x0(C0700z.class)).f1664p;
        if (liveMutableData != null) {
            liveMutableData.postValue(Boolean.TRUE);
        }
    }
}
