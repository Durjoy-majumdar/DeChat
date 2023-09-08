package wt1;

import android.widget.TextView;
import com.tencent.p014mm.plugin.fingerprint.p842ui.FingerPrintAuthTransparentUI;

/* renamed from: wt1.i */
public class C78686i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ TextView f230389d;

    public C78686i(FingerPrintAuthTransparentUI fingerPrintAuthTransparentUI, TextView textView) {
        this.f230389d = textView;
    }

    public void run() {
        this.f230389d.setVisibility(0);
    }
}
