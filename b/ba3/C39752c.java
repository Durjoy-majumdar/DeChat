package ba3;

import android.app.Activity;
import android.view.ViewGroup;

/* renamed from: ba3.c */
public class C39752c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Activity f106649d;

    /* renamed from: e */
    public final /* synthetic */ C39753d f106650e;

    public C39752c(C39753d dVar, Activity activity) {
        this.f106650e = dVar;
        this.f106649d = activity;
    }

    public void run() {
        this.f106650e.f106661k = false;
        ((ViewGroup) this.f106649d.getWindow().getDecorView()).setSystemUiVisibility(5894);
    }
}
