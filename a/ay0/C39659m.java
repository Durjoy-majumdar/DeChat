package ay0;

import android.os.Looper;
import android.os.MessageQueue;
import rx3.C36570n;
import xx0.C53458b;

/* renamed from: ay0.m */
public final class C39659m implements MessageQueue.IdleHandler {

    /* renamed from: d */
    public final /* synthetic */ int f106423d;

    public C39659m(int i) {
        this.f106423d = i;
    }

    public boolean queueIdle() {
        Looper.myQueue().removeIdleHandler(this);
        int i = this.f106423d;
        if (i == -1) {
            C53458b bVar = C53458b.f150358a;
            for (Integer intValue : (Integer[]) ((C36570n) C53458b.f150361d).getValue()) {
                C39656k.m42267a(C39656k.f106417a, intValue.intValue());
            }
        } else {
            C39656k.m42267a(C39656k.f106417a, i);
        }
        return false;
    }
}
