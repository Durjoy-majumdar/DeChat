package tf0;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import er1.C58736i1;
import gy3.C87412m;
import ht1.C60172g4;
import java.util.Map;
import l31.C61212e;
import o40.C61926c;
import p151er.C31670u;
import p749xh.C66261f3;
import rx3.C13604l;
import sx3.C90363p0;

@C86522b
/* renamed from: tf0.y0 */
public final class C64925y0 extends C86301e implements C31670u {
    /* renamed from: JE */
    public void mo58294JE(Context context, View view, FinderObject finderObject) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(finderObject, C66261f3.COL_FINDEROBJECT);
        Map b = C90363p0.m113143b(new C13604l("feed_id", C61926c.m72691p(finderObject.f164794id)));
        View findViewById = view.findViewById(C0966R.C0970id.f1j);
        if (findViewById != null) {
            findViewById.hasOnClickListeners();
        }
        C61212e eVar = (C61212e) C86312j.m106911c(C61212e.class);
        eVar.o30(view, "friend_circle_cover_preview");
        eVar.mo86175pO(view, 40, 25496);
        eVar.mo86149PM(view, b);
        C60172g4 gr02 = ((C64916p1) C86312j.m106911c(C64916p1.class)).gr0(context);
        eVar.E60(view, new C58736i1.C58738b(gr02 != null ? gr02.mo12861q3() : null));
    }
}
