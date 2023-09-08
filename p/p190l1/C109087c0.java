package p190l1;

import android.view.MotionEvent;
import fy3.C32226l;
import p1166z0.C112539e;
import rx3.C13598b0;

/* renamed from: l1.c0 */
public final class C109087c0 {
    /* renamed from: a */
    public static final void m148100a(C109106l lVar, long j, C32226l<? super MotionEvent, C13598b0> lVar2, boolean z) {
        C109097g gVar = lVar.f326710b;
        MotionEvent motionEvent = gVar != null ? gVar.f326683b.f326733b : null;
        if (motionEvent != null) {
            int action = motionEvent.getAction();
            if (z) {
                motionEvent.setAction(3);
            }
            motionEvent.offsetLocation(-C112539e.m153738c(j), -C112539e.m153739d(j));
            lVar2.invoke(motionEvent);
            motionEvent.offsetLocation(C112539e.m153738c(j), C112539e.m153739d(j));
            motionEvent.setAction(action);
            return;
        }
        throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.".toString());
    }
}
