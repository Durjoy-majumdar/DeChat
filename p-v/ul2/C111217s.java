package ul2;

import android.os.Vibrator;
import com.tencent.p014mm.plugin.scanner.p101ui.widget.ScanCodeProductMergeMaskView;

/* renamed from: ul2.s */
public final class C111217s implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ScanCodeProductMergeMaskView f333042d;

    public C111217s(ScanCodeProductMergeMaskView scanCodeProductMergeMaskView) {
        this.f333042d = scanCodeProductMergeMaskView;
    }

    public final void run() {
        Vibrator vibrator = this.f333042d.f316043i1;
        if (vibrator != null) {
            vibrator.vibrate(10);
        }
    }
}
