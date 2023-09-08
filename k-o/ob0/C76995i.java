package ob0;

import android.os.HandlerThread;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import gy3.C87412m;

/* renamed from: ob0.i */
public final class C76995i {

    /* renamed from: a */
    public final HandlerThread f224991a;

    /* renamed from: b */
    public final MMHandler f224992b;

    public C76995i(HandlerThread handlerThread, MMHandler mMHandler) {
        C87412m.m108594g(handlerThread, "thread");
        C87412m.m108594g(mMHandler, "handler");
        this.f224991a = handlerThread;
        this.f224992b = mMHandler;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C76995i)) {
            return false;
        }
        C76995i iVar = (C76995i) obj;
        return C87412m.m108589b(this.f224991a, iVar.f224991a) && C87412m.m108589b(this.f224992b, iVar.f224992b);
    }

    public int hashCode() {
        return (this.f224991a.hashCode() * 31) + this.f224992b.hashCode();
    }

    public String toString() {
        return "HandlerData(thread=" + this.f224991a + ", handler=" + this.f224992b + ')';
    }
}
