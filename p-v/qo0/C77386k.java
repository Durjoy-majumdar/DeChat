package qo0;

import android.view.KeyEvent;
import com.tencent.p014mm.plugin.appbrand.C81974j3;
import ej0.C86525c;
import fy3.C32227p;
import gy3.C87412m;
import rx3.C13598b0;

/* renamed from: qo0.k */
public final class C77386k extends C81974j3 {

    /* renamed from: c */
    public final /* synthetic */ C89741g f225615c;

    public C77386k(C89741g gVar) {
        this.f225615c = gVar;
    }

    /* renamed from: a */
    public boolean mo107509a(KeyEvent keyEvent) {
        C87412m.m108594g(keyEvent, "event");
        if (1 == keyEvent.getAction()) {
            return false;
        }
        C32227p<? super C86525c, ? super Integer, C13598b0> pVar = this.f225615c.f258066v;
        if (pVar != null) {
            C13598b0 invoke = pVar.invoke(null, 0);
        }
        this.f225615c.mo124036e();
        return true;
    }
}
