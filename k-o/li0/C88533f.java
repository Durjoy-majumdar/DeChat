package li0;

import com.tencent.p014mm.sdk.statemachine.IState;
import li0.C88514d;

/* renamed from: li0.f */
public class C88533f extends C88542m<Boolean> {

    /* renamed from: h */
    public final /* synthetic */ C88514d f255733h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88533f(C88514d dVar, long j, Boolean bool) {
        super(j, bool);
        this.f255733h = dVar;
    }

    /* renamed from: b */
    public Object mo122994b() {
        IState currentState = this.f255733h.getCurrentState();
        C88514d.C88525i iVar = this.f255733h.f255676g;
        return Boolean.valueOf(currentState == iVar && iVar.f255740f > 0);
    }
}
