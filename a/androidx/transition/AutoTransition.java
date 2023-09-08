package androidx.transition;

import android.content.Context;
import android.util.AttributeSet;

public class AutoTransition extends TransitionSet {
    public AutoTransition() {
        mo145264Y();
    }

    /* renamed from: Y */
    public final void mo145264Y() {
        mo145351X(1);
        mo145348U(new Fade(2));
        mo145348U(new ChangeBounds());
        mo145348U(new Fade(1));
    }

    public AutoTransition(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo145264Y();
    }
}
