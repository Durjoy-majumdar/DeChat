package vf1;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveDelManagerUI;
import z04.C112550d0;

/* renamed from: vf1.n2 */
public final class C65717n2 implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveDelManagerUI f189073d;

    public C65717n2(FinderLiveDelManagerUI finderLiveDelManagerUI) {
        this.f189073d = finderLiveDelManagerUI;
    }

    public void afterTextChanged(Editable editable) {
        this.f189073d.f158986d.mo88156G4(String.valueOf(editable != null ? C112550d0.m153799i0(editable) : null));
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
