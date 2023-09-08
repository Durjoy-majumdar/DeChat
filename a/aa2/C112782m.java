package aa2;

import com.tencent.p014mm.plugin.multitask.p079ui.p888bg.DynamicBgContainer;
import com.tencent.p014mm.plugin.multitask.p079ui.uic.MultiTaskUIC;

/* renamed from: aa2.m */
public final class C112782m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MultiTaskUIC f337697d;

    public C112782m(MultiTaskUIC multiTaskUIC) {
        this.f337697d = multiTaskUIC;
    }

    public final void run() {
        DynamicBgContainer dynamicBgContainer = this.f337697d.f346715x;
        if (dynamicBgContainer != null) {
            dynamicBgContainer.mo96167b();
        }
    }
}
