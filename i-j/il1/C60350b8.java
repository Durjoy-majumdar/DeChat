package il1;

import cl1.C54991o;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87413o;
import ob0.C89132b;
import qo3.C12925w;
import rx3.C13598b0;
import te3.C48933c01;
import te3.C64247az0;

/* renamed from: il1.b8 */
public final class C60350b8 extends C87413o implements C32226l<C89132b.C89134c<C48933c01>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C60362c7 f172019d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60350b8(C60362c7 c7Var) {
        super(1);
        this.f172019d = c7Var;
    }

    public Object invoke(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Class cls = C54991o.class;
        boolean z = false;
        if (!(cVar != null && cVar.f256793a == 0) || cVar.f256794b != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("refresh gameteam fail: ");
            Integer num = null;
            sb.append(cVar != null ? Integer.valueOf(cVar.f256793a) : null);
            sb.append(' ');
            if (cVar != null) {
                num = Integer.valueOf(cVar.f256794b);
            }
            sb.append(num);
            Log.m105928w("Finder.FinderLiveVisitorGameTeamWidget", sb.toString());
        } else {
            C12925w wVar = this.f172019d.f172130o;
            if (wVar != null && !wVar.mo12466f()) {
                z = true;
            }
            if (!z) {
                C60362c7 c7Var = this.f172019d;
                if (!c7Var.f172106H && !c7Var.f172107I) {
                    C64247az0 az02 = ((C48933c01) cVar.f256796d).f131419d;
                    if (az02 != null) {
                        ((C54991o) c7Var.f172118c.mo87696x0(cls)).mo76024u4(az02);
                        ((C54991o) c7Var.f172118c.mo87696x0(cls)).mo75957E4(((C48933c01) cVar.f256796d).f131421f);
                        c7Var.mo85340o(az02);
                    }
                }
            }
            Log.m105924i("Finder.FinderLiveVisitorGameTeamWidget", "refresh game team fail");
        }
        return C13598b0.f38549a;
    }
}
