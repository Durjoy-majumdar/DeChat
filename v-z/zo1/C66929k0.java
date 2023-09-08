package zo1;

import com.tencent.p014mm.plugin.finder.replay.FinderLiveThumbPlayerProxy;
import qj1.C62979sf;

/* renamed from: zo1.k0 */
public final class C66929k0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveThumbPlayerProxy f192306d;

    /* renamed from: e */
    public final /* synthetic */ C66925j0 f192307e;

    public C66929k0(FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy, C66925j0 j0Var) {
        this.f192306d = finderLiveThumbPlayerProxy;
        this.f192307e = j0Var;
    }

    public final void run() {
        int[] iArr = new int[2];
        this.f192306d.getLocationOnScreen(iArr);
        int height = iArr[1] + this.f192306d.getHeight();
        C62979sf sfVar = (C62979sf) this.f192307e.mo87687E0(C62979sf.class);
        if (sfVar != null) {
            C62979sf.m74202c1(sfVar, height, 0, 2, (Object) null);
        }
    }
}
