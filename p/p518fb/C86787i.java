package p518fb;

import com.tencent.luggage.game.widget.input.WAGamePanelInputEditText;
import li0.C88508b;
import li0.C88509c;
import p912nb.C88909b;

/* renamed from: fb.i */
public class C86787i implements C88509c.C88512b {

    /* renamed from: d */
    public final /* synthetic */ C88909b f251907d;

    /* renamed from: e */
    public final /* synthetic */ WAGamePanelInputEditText f251908e;

    public C86787i(C86795q qVar, C88909b bVar, WAGamePanelInputEditText wAGamePanelInputEditText) {
        this.f251907d = bVar;
        this.f251908e = wAGamePanelInputEditText;
    }

    /* renamed from: b */
    public void mo113102b(String str, C88508b bVar) {
        if (C88508b.DESTROYED == bVar && this.f251907d.getAttachedEditText() == this.f251908e) {
            this.f251907d.mo117893z();
        }
    }
}
