package p568iv;

import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import ht1.C98521u5;
import nb2.C61643b0;
import p580jv.C60924d;
import te3.C64488kb1;
import te3.C64719t23;
import z04.C66725r;

@C86522b
/* renamed from: iv.e */
public final class C60633e extends C86301e implements C60924d {
    /* renamed from: d8 */
    public String mo85586d8(C64488kb1 kb12, C64719t23 t232) {
        C87412m.m108594g(kb12, "songInfo");
        StringBuilder sb = new StringBuilder();
        sb.append("\n<MusicVideoStatusOpenParams>\n");
        sb.append(C61643b0.m72360b(kb12));
        sb.append(10);
        if (t232 == null) {
            t232 = new C64719t23();
        }
        String a = C98521u5.m127973a(t232);
        C87412m.m108593f(a, "makeContent(this)");
        sb.append(a);
        sb.append("\n</MusicVideoStatusOpenParams>");
        return C66725r.m78728b(sb.toString());
    }
}
