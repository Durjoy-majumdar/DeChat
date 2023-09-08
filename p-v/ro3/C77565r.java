package ro3;

import android.view.View;
import com.tencent.p014mm.p136ui.C85975v4;

/* renamed from: ro3.r */
public final class C77565r implements View.OnFocusChangeListener {

    /* renamed from: d */
    public final /* synthetic */ C110588j f226129d;

    public C77565r(C110588j jVar) {
        this.f226129d = jVar;
    }

    public final void onFocusChange(View view, boolean z) {
        if (this.f226129d.f330851z) {
            C85975v4.m106304a("SelectableEditTextHelper", "onFocusChange:" + z, new Object[0]);
            if (!z) {
                this.f226129d.mo162139j(false);
            }
        }
        View.OnFocusChangeListener onFocusChangeListener = this.f226129d.f330842q;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z);
        }
    }
}
