package fe3;

import android.widget.TextView;
import fe3.C58970b;
import gy3.C87412m;
import java.lang.ref.WeakReference;

/* renamed from: fe3.c */
public final class C58983c implements C58970b.C58974d.C58976b {
    /* renamed from: a */
    public void mo84212a(C58970b.C58974d dVar, int i) {
        if ((dVar != null ? dVar.f168758d : null) != null) {
            WeakReference<TextView> weakReference = dVar.f168758d;
            C87412m.m108591d(weakReference);
            TextView textView = weakReference.get();
            if (textView != null) {
                C58970b.C58974d.f168756h.mo84211a(textView, i);
                C58970b.C58974d.f168757i.remove(textView);
            }
        }
    }
}
