package qj1;

import android.os.Bundle;
import d60.C58124b;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import il1.C9012h4;
import qj1.C12677tg;
import rx3.C13598b0;

/* renamed from: qj1.xg */
public final class C12756xg extends C87413o implements C32227p<C12677tg.C12678a, Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C12677tg f36546d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12756xg(C12677tg tgVar) {
        super(2);
        this.f36546d = tgVar;
    }

    public Object invoke(Object obj, Object obj2) {
        C12677tg.C12678a aVar = (C12677tg.C12678a) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        C87412m.m108594g(aVar, "fromScene");
        if (booleanValue && aVar != C12677tg.C12678a.TEAM_UP_FANS) {
            this.f36546d.mo12261d1();
            C9012h4 h4Var = this.f36546d.f36313s;
            if (h4Var != null) {
                h4Var.mo9828d(true);
            }
        }
        if (booleanValue) {
            C58124b.C7172a.m7372a(this.f36546d.f177936g, C58124b.C58125b.FINDER_LIVE_FANS_CLUB_JOIN_SUCCESSFUL, (Bundle) null, 2, (Object) null);
        } else {
            C58124b.C7172a.m7372a(this.f36546d.f177936g, C58124b.C58125b.FINDER_LIVE_FANS_CLUB_JOIN_FAILED, (Bundle) null, 2, (Object) null);
        }
        return C13598b0.f38549a;
    }
}
