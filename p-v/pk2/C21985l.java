package pk2;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.rtos.p320ui.RtosWatchLoginUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import f40.C86709a0;
import hk2.C32939b;

/* renamed from: pk2.l */
public final class C21985l<T> implements C1256g {

    /* renamed from: d */
    public final /* synthetic */ RtosWatchLoginUI f62239d;

    public C21985l(RtosWatchLoginUI rtosWatchLoginUI) {
        this.f62239d = rtosWatchLoginUI;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        Bundle bundle = (Bundle) obj;
        boolean z = false;
        if (bundle != null && bundle.getBoolean("result", false)) {
            z = true;
        }
        Log.m105924i("MicroMsg.Rtos.RtosWatchLoginUI", "Login result " + z);
        if (z) {
            RtosWatchLoginUI rtosWatchLoginUI = this.f62239d;
            rtosWatchLoginUI.f53370y = 1;
            Class cls = C32939b.class;
            ((C32939b) C86312j.m106911c(cls)).mo33893TQ(rtosWatchLoginUI.f53364s, C86709a0.m107523b().mo121112j());
            rtosWatchLoginUI.f53369x.f60676d = 1;
            ((C32939b) C86312j.m106911c(cls)).ev0(rtosWatchLoginUI.f53369x);
            ((C32939b) C86312j.m106911c(cls)).mo33891Ir();
            C115669n.INSTANCE.mo175911u(1904, 1);
            rtosWatchLoginUI.f53351H.postUI(new C21983h(rtosWatchLoginUI));
            rtosWatchLoginUI.mo24204L7();
            rtosWatchLoginUI.f53351H.postUIDelayed(new C21984k(rtosWatchLoginUI), 300);
            return;
        }
        RtosWatchLoginUI rtosWatchLoginUI2 = this.f62239d;
        rtosWatchLoginUI2.f53370y = 8;
        rtosWatchLoginUI2.mo24206N7(8);
    }
}
