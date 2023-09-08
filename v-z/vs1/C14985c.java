package vs1;

import android.view.View;

/* renamed from: vs1.c */
public final class C14985c implements View.OnFocusChangeListener {

    /* renamed from: d */
    public final /* synthetic */ View f41074d;

    /* renamed from: e */
    public final /* synthetic */ C14974a f41075e;

    public C14985c(View view, C14974a aVar) {
        this.f41074d = view;
        this.f41075e = aVar;
    }

    public final void onFocusChange(View view, boolean z) {
        if (z) {
            this.f41074d.getLocationInWindow(new int[2]);
            this.f41075e.getClass();
            return;
        }
        this.f41075e.getClass();
    }
}
