package pk2;

import android.widget.TextView;
import com.tencent.p014mm.plugin.rtos.p320ui.RtosWatchLoginUI;

/* renamed from: pk2.t */
public final class C21995t implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ RtosWatchLoginUI f62250d;

    public C21995t(RtosWatchLoginUI rtosWatchLoginUI) {
        this.f62250d = rtosWatchLoginUI;
    }

    public final void run() {
        TextView textView = this.f62250d.f53353e;
        if (textView != null) {
            textView.setEnabled(false);
        }
        this.f62250d.setBackBtnVisible(false);
    }
}
