package tj1;

import android.view.View;

/* renamed from: tj1.d */
public final class C13948d implements View.OnFocusChangeListener {

    /* renamed from: d */
    public final /* synthetic */ C13931b f39184d;

    public C13948d(C13931b bVar) {
        this.f39184d = bVar;
    }

    public final void onFocusChange(View view, boolean z) {
        C13931b bVar = this.f39184d;
        Object tag = view.getTag();
        Integer num = tag instanceof Integer ? (Integer) tag : null;
        bVar.f39156v = num != null ? num.intValue() : -1;
    }
}
