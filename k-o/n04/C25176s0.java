package n04;

import fy3.C32226l;
import gy3.C87412m;
import q04.C25528k;
import q04.C35758l;
import sx3.C110818d0;
import xy3.C26566c;
import xy3.C26568e;
import yz3.C23393c;

/* renamed from: n04.s0 */
public abstract class C25176s0 extends C25198y1 implements C25528k, C35758l {
    /* renamed from: R0 */
    public abstract C25176s0 mo37084O0(boolean z);

    /* renamed from: S0 */
    public abstract C25176s0 mo51873Q0(C25122g1 g1Var);

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (C26566c q : getAnnotations()) {
            String[] strArr = {"[", C23393c.m27911q(C23393c.f67153b, q, (C26568e) null, 2, (Object) null), "] "};
            for (int i = 0; i < 3; i++) {
                sb.append(strArr[i]);
            }
        }
        sb.append(mo37081K0());
        if (!mo37079I0().isEmpty()) {
            C110818d0.m150920R(mo37079I0(), sb, ", ", "<", ">", 0, (CharSequence) null, (C32226l) null, 112, (Object) null);
        }
        if (mo37082L0()) {
            sb.append("?");
        }
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "StringBuilder().apply(builderAction).toString()");
        return sb4;
    }
}
