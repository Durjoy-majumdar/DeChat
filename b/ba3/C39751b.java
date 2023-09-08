package ba3;

import android.app.Activity;
import android.view.ViewGroup;

/* renamed from: ba3.b */
public class C39751b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Activity f106647d;

    /* renamed from: e */
    public final /* synthetic */ C39753d f106648e;

    public C39751b(C39753d dVar, Activity activity) {
        this.f106648e = dVar;
        this.f106647d = activity;
    }

    public void run() {
        ViewGroup viewGroup = (ViewGroup) this.f106647d.getWindow().getDecorView();
        viewGroup.setSystemUiVisibility(viewGroup.getSystemUiVisibility() & -5895);
        this.f106648e.f106661k = true;
    }
}
