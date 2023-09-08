package pk2;

import android.widget.TextView;
import com.tencent.p014mm.plugin.rtos.p320ui.RtosWatchLoginUI;

/* renamed from: pk2.e */
public final class C21980e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ RtosWatchLoginUI f62234d;

    public C21980e(RtosWatchLoginUI rtosWatchLoginUI) {
        this.f62234d = rtosWatchLoginUI;
    }

    public final void run() {
        TextView textView = this.f62234d.f53353e;
        if (textView != null) {
            textView.setEnabled(false);
        }
        this.f62234d.setBackBtnVisible(false);
    }
}
