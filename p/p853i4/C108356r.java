package p853i4;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* renamed from: i4.r */
public class C108356r implements C108357s {

    /* renamed from: a */
    public final ViewGroupOverlay f324398a;

    public C108356r(ViewGroup viewGroup) {
        this.f324398a = viewGroup.getOverlay();
    }

    /* renamed from: a */
    public void mo158849a(View view) {
        this.f324398a.remove(view);
    }
}
