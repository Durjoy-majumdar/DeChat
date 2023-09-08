package x21;

import android.view.View;

/* renamed from: x21.d */
public class C102549d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f301950d;

    /* renamed from: e */
    public final /* synthetic */ boolean f301951e;

    public C102549d(C102538a aVar, View view, boolean z) {
        this.f301950d = view;
        this.f301951e = z;
    }

    public void run() {
        this.f301950d.setPressed(this.f301951e);
    }
}
