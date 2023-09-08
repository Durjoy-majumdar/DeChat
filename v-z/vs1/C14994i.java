package vs1;

import android.widget.EditText;

/* renamed from: vs1.i */
public final class C14994i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ EditText f41105d;

    /* renamed from: e */
    public final /* synthetic */ C14974a f41106e;

    public C14994i(EditText editText, C14974a aVar) {
        this.f41105d = editText;
        this.f41106e = aVar;
    }

    public final void run() {
        this.f41105d.requestFocus();
        this.f41106e.f41043n = false;
    }
}
