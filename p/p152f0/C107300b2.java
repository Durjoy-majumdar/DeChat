package p152f0;

import android.view.KeyEvent;
import fy3.C32226l;
import gy3.C24565l;
import gy3.C8477a0;
import gy3.C87412m;
import p009c2.C104239a;
import p009c2.C28482z;
import p155g0.C107655y;
import p735w1.C38006x;
import p904j1.C108523c;
import p904j1.C76379b;
import sx3.C26236u;

/* renamed from: f0.b2 */
public final /* synthetic */ class C107300b2 extends C24565l implements C32226l<C76379b, Boolean> {
    public C107300b2(Object obj) {
        super(1, obj, C107404r1.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
    }

    public Object invoke(Object obj) {
        C104239a aVar;
        C27046k0 a;
        KeyEvent keyEvent = ((C76379b) obj).f223658a;
        C87412m.m108594g(keyEvent, "p0");
        C107404r1 r1Var = (C107404r1) this.receiver;
        r1Var.getClass();
        boolean z = false;
        if (keyEvent.getAction() == 0 && keyEvent.getUnicodeChar() != 0) {
            StringBuilder appendCodePoint = new StringBuilder().appendCodePoint(keyEvent.getUnicodeChar());
            C87412m.m108593f(appendCodePoint, "appendCodePointX");
            String sb = appendCodePoint.toString();
            C87412m.m108593f(sb, "StringBuilder().appendCo…              .toString()");
            aVar = new C104239a(sb, 1);
        } else {
            aVar = null;
        }
        if (aVar == null) {
            if ((C108523c.m147066b(keyEvent) == 2) && (a = r1Var.f321362i.mo54536a(keyEvent)) != null && (!a.f75218d || r1Var.f321357d)) {
                C8477a0 a0Var = new C8477a0();
                a0Var.f27482d = true;
                C107296a2 a2Var = new C107296a2(a, r1Var, a0Var);
                C107655y yVar = new C107655y(r1Var.f321356c, r1Var.f321360g, r1Var.f321354a.f321319g, r1Var.f321359f);
                a2Var.invoke(yVar);
                if (!C38006x.m41693a(yVar.f322004f, r1Var.f321356c.f78286b) || !C87412m.m108589b(yVar.f322005g, r1Var.f321356c.f78285a)) {
                    r1Var.f321363j.invoke(C28482z.m38223a(yVar.f322055h, yVar.f322005g, yVar.f322004f, (C38006x) null, 4, (Object) null));
                }
                C107411s2 s2Var = r1Var.f321361h;
                if (s2Var != null) {
                    s2Var.f321385f = true;
                }
                z = a0Var.f27482d;
            }
        } else if (r1Var.f321357d) {
            r1Var.mo157816a(C26236u.m33719b(aVar));
            r1Var.f321359f.f322014a = null;
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
