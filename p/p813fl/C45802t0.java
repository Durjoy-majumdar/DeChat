package p813fl;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.LinkedList;
import jp3.C9486a;
import jp3.C9487b;

/* renamed from: fl.t0 */
public final class C45802t0 implements C9487b<C9486a> {

    /* renamed from: d */
    public final LinkedList<C9486a> f123708d = new LinkedList<>();

    /* renamed from: a */
    public final void mo71266a() {
        Log.m105924i("MicroMsg.PanelLifeCycle", "clear: ");
        for (C9486a dead : this.f123708d) {
            dead.dead();
        }
        this.f123708d.clear();
    }

    public void keep(C9486a aVar) {
        C87412m.m108594g(aVar, "iLifeCycle");
        Log.m105924i("MicroMsg.PanelLifeCycle", "keep: " + aVar);
        if (!this.f123708d.contains(aVar)) {
            this.f123708d.add(aVar);
        }
    }
}
