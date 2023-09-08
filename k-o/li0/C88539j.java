package li0;

import android.os.Message;
import com.tencent.p014mm.sdk.statemachine.State;

/* renamed from: li0.j */
public abstract class C88539j extends State {

    /* renamed from: d */
    public final C88540k f255743d;

    public C88539j(C88540k kVar) {
        this.f255743d = kVar;
    }

    public void enter() {
        C88508b C;
        super.enter();
        C88514d dVar = (C88514d) this.f255743d;
        dVar.f255689w.set((Object) null);
        dVar.f255690x.set(this);
        Message currentMessage = dVar.getCurrentMessage();
        if (currentMessage == null || currentMessage.what != -2) {
            State state = dVar.f255672A;
            dVar.f255672A = this;
            if (state != null && dVar.mo122986C(state) != (C = dVar.mo122986C(this))) {
                dVar.mo122985y(C);
                return;
            }
            return;
        }
        dVar.f255672A = this;
    }
}
