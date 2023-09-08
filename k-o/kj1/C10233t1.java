package kj1;

import android.view.View;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import d50.C58113g;
import d50.C58114h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import kj1.C10125e1;
import lj1.C10538e;
import nj3.C11182m0;
import nj3.C76874e0;
import qo3.C77407n;
import te3.C49083d21;
import te3.C64890zp2;

/* renamed from: kj1.t1 */
public final class C10233t1 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C10125e1.C10127b f31248d;

    public C10233t1(C10125e1.C10127b bVar) {
        this.f31248d = bVar;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        C58113g gVar;
        C64890zp2 zp22;
        C77407n nVar = this.f31248d.f31012e;
        String str = null;
        if (nVar != null) {
            nVar.mo107567l((View) null);
        }
        e0Var.clear();
        C10125e1.C10127b bVar = this.f31248d;
        Class cls = C54991o.class;
        String str2 = bVar.f31029v.f30980a;
        StringBuilder sb = new StringBuilder();
        sb.append("prepareVisitorMenuItems: objectId:");
        FinderObject finderObject = ((C54991o) bVar.f31029v.mo10534b(cls)).f154341n;
        sb.append(finderObject != null ? Long.valueOf(finderObject.f164794id) : null);
        sb.append(", haveJoinLive:");
        sb.append(((C54991o) bVar.f31029v.mo10534b(cls)).f154186C);
        sb.append(", hlsUrl:");
        C58114h hVar = ((C55001u) bVar.f31029v.mo10534b(C55001u.class)).f154421r;
        sb.append((hVar == null || (gVar = hVar.f166251b) == null || (zp22 = gVar.f166244n) == null) ? null : zp22.f186828z);
        Log.m105924i(str2, sb.toString());
        Iterator it = ((ArrayList) bVar.f31024q).iterator();
        while (it.hasNext()) {
            ((C10538e) it.next()).mo10809p(e0Var);
        }
        C10125e1 e1Var = bVar.f31029v;
        C87412m.m108594g(e1Var, "<this>");
        C49083d21 d212 = ((C54991o) e1Var.mo10534b(cls)).f154250R3;
        if (d212 != null) {
            str = d212.f132074d;
        }
        boolean z = !(str == null || str.length() == 0);
        Log.m105924i(e1Var.f30980a, "canShowInnerData:" + z);
        if (z) {
            e0Var.mo107144g(e1Var.f30977X, "统计(内部)", C0966R.raw.icons_outlined_more2);
        }
        C10210q0.m10127a(bVar.f31029v, e0Var);
    }
}
