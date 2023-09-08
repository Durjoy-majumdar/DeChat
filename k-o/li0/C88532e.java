package li0;

import com.tencent.p014mm.sdk.statemachine.IState;
import li0.C88514d;

/* renamed from: li0.e */
public class C88532e extends C88542m<Boolean> {

    /* renamed from: h */
    public final /* synthetic */ C88514d f255732h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88532e(C88514d dVar, long j, Boolean bool) {
        super(j, bool);
        this.f255732h = dVar;
    }

    /* renamed from: b */
    public Object mo122994b() {
        IState currentState = this.f255732h.getCurrentState();
        C88514d.C88525i iVar = this.f255732h.f255676g;
        boolean z = false;
        if (currentState == iVar) {
            if ((iVar.f255740f & 1) > 0) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
