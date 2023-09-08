package pk2;

import android.os.Message;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.type.IPCInteger;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.rtos.p320ui.RtosWatchLoginUI;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import di3.C86312j;
import hk2.C32939b;
import jk2.C21246d;

/* renamed from: pk2.v */
public final class C21997v<T> implements C1256g {

    /* renamed from: d */
    public final /* synthetic */ RtosWatchLoginUI f62252d;

    public C21997v(RtosWatchLoginUI rtosWatchLoginUI) {
        this.f62252d = rtosWatchLoginUI;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        RtosWatchLoginUI rtosWatchLoginUI = this.f62252d;
        int i = ((IPCInteger) obj).f10313d;
        rtosWatchLoginUI.f53370y = i;
        if (i == 12) {
            C80907o.m98781d(WeChatProcess.PROCESS_EXDEVICE, new IPCVoid(), C21246d.class, new C21979c(rtosWatchLoginUI));
        } else if (i == 10) {
            rtosWatchLoginUI.f53351H.sendEmptyMessage(1006);
            this.f62252d.mo24204L7();
            RtosWatchLoginUI rtosWatchLoginUI2 = this.f62252d;
            rtosWatchLoginUI2.f53351H.postUI(new C21995t(rtosWatchLoginUI2));
            RtosWatchLoginUI rtosWatchLoginUI3 = this.f62252d;
            rtosWatchLoginUI3.f53369x.f60676d = rtosWatchLoginUI3.f53370y;
            ((C32939b) C86312j.m106911c(C32939b.class)).ev0(this.f62252d.f53369x);
            C115669n.INSTANCE.mo175911u(1904, this.f62252d.f53370y);
            RtosWatchLoginUI rtosWatchLoginUI4 = this.f62252d;
            rtosWatchLoginUI4.f53351H.postUIDelayed(new C21996u(rtosWatchLoginUI4), 300);
        } else {
            Message message = new Message();
            message.what = 1004;
            RtosWatchLoginUI rtosWatchLoginUI5 = this.f62252d;
            message.arg1 = rtosWatchLoginUI5.f53370y;
            rtosWatchLoginUI5.f53351H.sendMessage(message);
        }
    }
}
