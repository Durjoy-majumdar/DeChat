package lk0;

import fy3.C32226l;
import java.util.TimerTask;

/* renamed from: lk0.o */
public final class C88563o extends TimerTask {

    /* renamed from: d */
    public final /* synthetic */ C32226l f255784d;

    public C88563o(C32226l lVar) {
        this.f255784d = lVar;
    }

    public void run() {
        this.f255784d.invoke(Boolean.FALSE);
        cancel();
    }
}
