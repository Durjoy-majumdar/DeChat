package vm0;

import android.view.View;
import android.view.Window;

/* renamed from: vm0.f */
public class C90839f implements View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a */
    public final /* synthetic */ Window f260800a;

    /* renamed from: b */
    public final /* synthetic */ int f260801b;

    public C90839f(C90837e eVar, Window window, int i) {
        this.f260800a = window;
        this.f260801b = i;
    }

    public void onSystemUiVisibilityChange(int i) {
        if ((i & 4) == 0) {
            this.f260800a.getDecorView().setSystemUiVisibility(this.f260801b);
        }
    }
}
