package p190l1;

import android.view.MotionEvent;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import p583k2.C108830a;

/* renamed from: l1.b0 */
public final class C109084b0 extends C87413o implements C32226l<MotionEvent, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ C108830a f326653d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109084b0(C108830a aVar) {
        super(1);
        this.f326653d = aVar;
    }

    public Object invoke(Object obj) {
        boolean z;
        MotionEvent motionEvent = (MotionEvent) obj;
        C87412m.m108594g(motionEvent, "motionEvent");
        switch (motionEvent.getActionMasked()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                z = this.f326653d.dispatchTouchEvent(motionEvent);
                break;
            default:
                z = this.f326653d.dispatchGenericMotionEvent(motionEvent);
                break;
        }
        return Boolean.valueOf(z);
    }
}
