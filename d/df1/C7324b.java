package df1;

import com.tencent.p014mm.sdk.platformtools.Log;
import df1.C58259c;
import ef1.C58553c;
import ef1.C58555d;
import ef1.C7637b;
import er1.C58784w3;
import gy3.C87412m;
import up1.C37521f;

/* renamed from: df1.b */
public final class C7324b extends C58555d {

    /* renamed from: g */
    public final String f25438g = "FinderPlayProgressObserver";

    /* renamed from: B1 */
    public void mo2331B1(C7637b bVar) {
        C87412m.m108594g(bVar, "ev");
        if (bVar instanceof C58259c.C58260a) {
            String str = this.f25438g;
            StringBuilder sb = new StringBuilder();
            sb.append("offset = ");
            C58259c.C58260a aVar = (C58259c.C58260a) bVar;
            sb.append(aVar.f166815f);
            sb.append(",total = ");
            sb.append(aVar.f166816g);
            Log.m105924i(str, sb.toString());
            C37521f.f99374d.getClass();
            if (C37521f.f99254P2.mo60266n().intValue() == 1 && aVar.f166815f >= aVar.f166816g - 1) {
                C58784w3.f168295a.mo83881K1(aVar.f166817h, true, 2);
            }
        }
    }

    /* renamed from: z1 */
    public boolean mo2333z1(C58553c cVar, C7637b bVar) {
        C87412m.m108594g(cVar, "dispatcher");
        C87412m.m108594g(bVar, "event");
        return (bVar instanceof C58259c.C58260a) && ((C58259c.C58260a) bVar).f166811b == 3;
    }
}
