package pk2;

import android.widget.TextView;
import com.tencent.p014mm.plugin.rtos.p320ui.RtosWatchLoginUI;
import gy3.C8479f0;

/* renamed from: pk2.b */
public final class C21978b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ RtosWatchLoginUI f62231d;

    /* renamed from: e */
    public final /* synthetic */ C8479f0<String> f62232e;

    public C21978b(RtosWatchLoginUI rtosWatchLoginUI, C8479f0<String> f0Var) {
        this.f62231d = rtosWatchLoginUI;
        this.f62232e = f0Var;
    }

    public final void run() {
        TextView textView = this.f62231d.f53355g;
        if (textView != null) {
            textView.setText((CharSequence) this.f62232e.f27484d);
        }
        RtosWatchLoginUI rtosWatchLoginUI = this.f62231d;
        rtosWatchLoginUI.f53344A = true;
        rtosWatchLoginUI.mo24205M7();
    }
}
