package p955df;

import android.widget.Toast;

/* renamed from: df.b */
public class C86262b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Toast f250864d;

    public C86262b(C86263c cVar, Toast toast) {
        this.f250864d = toast;
    }

    public void run() {
        this.f250864d.cancel();
    }
}
