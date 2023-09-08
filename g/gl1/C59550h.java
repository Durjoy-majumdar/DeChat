package gl1;

import android.view.View;
import qj1.C62647ba;

/* renamed from: gl1.h */
public final class C59550h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f170185d;

    /* renamed from: e */
    public final /* synthetic */ C59559k f170186e;

    public C59550h(View view, C59559k kVar) {
        this.f170185d = view;
        this.f170186e = kVar;
    }

    public final void run() {
        int[] iArr = new int[2];
        this.f170185d.getLocationOnScreen(iArr);
        C62647ba baVar = this.f170186e.f170209K;
        if (baVar != null) {
            baVar.mo87676Z0(iArr[1]);
        }
        C62647ba baVar2 = this.f170186e.f170210L;
        if (baVar2 != null) {
            baVar2.mo87676Z0(iArr[1]);
        }
    }
}
