package qj1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Bundle;
import d60.C58124b;

/* renamed from: qj1.v2 */
public final class C12704v2 extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C12693u2 f36400d;

    public C12704v2(C12693u2 u2Var) {
        this.f36400d = u2Var;
    }

    public void onAnimationEnd(Animator animator) {
        this.f36400d.f166287d.setVisibility(8);
        if (!this.f36400d.mo12265Z0()) {
            C58124b.C7172a.m7372a(this.f36400d.f36374p, C58124b.C58125b.FINDER_LIVE_RESTORE_POST_UI, (Bundle) null, 2, (Object) null);
        }
    }
}
