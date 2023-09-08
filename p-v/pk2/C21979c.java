package pk2;

import android.os.Bundle;
import android.os.Message;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.rtos.p320ui.RtosWatchLoginUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8479f0;

/* renamed from: pk2.c */
public final class C21979c<T> implements C1256g {

    /* renamed from: d */
    public final /* synthetic */ RtosWatchLoginUI f62233d;

    public C21979c(RtosWatchLoginUI rtosWatchLoginUI) {
        this.f62233d = rtosWatchLoginUI;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        Bundle bundle = (Bundle) obj;
        boolean z = true;
        if (bundle == null || !bundle.getBoolean("result", false)) {
            z = false;
        }
        C8479f0 f0Var = new C8479f0();
        f0Var.f27484d = bundle != null ? bundle.getString("device_name") : null;
        Log.m105924i("MicroMsg.Rtos.RtosWatchLoginUI", "checkChannelReady " + z);
        if (z) {
            this.f62233d.f53351H.sendEmptyMessage(1005);
            RtosWatchLoginUI rtosWatchLoginUI = this.f62233d;
            rtosWatchLoginUI.f53351H.postUI(new C21978b(rtosWatchLoginUI, f0Var));
            return;
        }
        this.f62233d.f53370y = 2;
        Message message = new Message();
        message.what = 1004;
        RtosWatchLoginUI rtosWatchLoginUI2 = this.f62233d;
        message.arg1 = rtosWatchLoginUI2.f53370y;
        rtosWatchLoginUI2.f53351H.sendMessage(message);
    }
}
