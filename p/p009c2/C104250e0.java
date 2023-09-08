package p009c2;

import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import gy3.C87412m;
import java.util.List;

/* renamed from: c2.e0 */
public final class C104250e0 implements C104262m {

    /* renamed from: a */
    public final /* synthetic */ C104242c0 f308575a;

    public C104250e0(C104242c0 c0Var) {
        this.f308575a = c0Var;
    }

    /* renamed from: a */
    public void mo145868a(List<? extends C104247d> list) {
        C87412m.m108594g(list, "editCommands");
        this.f308575a.f308553d.invoke(list);
    }

    /* renamed from: b */
    public void mo145869b(KeyEvent keyEvent) {
        C87412m.m108594g(keyEvent, "event");
        ((BaseInputConnection) this.f308575a.f308558i.getValue()).sendKeyEvent(keyEvent);
    }

    /* renamed from: c */
    public void mo145870c(int i) {
        this.f308575a.f308554e.invoke(new C104260k(i));
    }
}
