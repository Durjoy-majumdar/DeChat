package ry2;

import android.content.Context;
import az2.C39674e;
import com.tencent.p014mm.C0966R;
import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import nj3.C76879j;
import qo3.C89779i0;
import qy2.C47902u;
import rz2.C48212k;
import sx3.C110818d0;
import uy2.C52660e;
import uy2.C52665g;
import uz2.C52684h;
import xy2.C53482m;
import zy2.C53847c;

/* renamed from: ry2.m */
public final class C48195m implements C47902u.C36207b {

    /* renamed from: a */
    public final /* synthetic */ C48196n f129166a;

    /* renamed from: b */
    public final /* synthetic */ Context f129167b;

    /* renamed from: c */
    public final /* synthetic */ C52660e f129168c;

    public C48195m(C48196n nVar, Context context, C52660e eVar) {
        this.f129166a = nVar;
        this.f129167b = context;
        this.f129168c = eVar;
    }

    /* renamed from: a */
    public final void mo60567a(boolean z, List<C52684h> list) {
        if (z) {
            C48196n nVar = this.f129166a;
            Context context = this.f129167b;
            C87412m.m108593f(context, "context");
            C52660e eVar = this.f129168c;
            nVar.getClass();
            if (list != null && (!list.isEmpty())) {
                C52684h hVar = (C52684h) C110818d0.m150914L(list);
                if (C39674e.f106452d.mo62253n0(eVar.field_session_id) == null) {
                    new C53847c(context, (C48212k) null, eVar, false, 10, (C8480h) null).mo140655A();
                    C52665g.C52666a aVar = C52665g.f147055f;
                    String str = eVar.field_session_id;
                    C87412m.m108593f(str, "item.field_session_id");
                    aVar.mo73606c(str, 104);
                } else {
                    C53482m.f150398a.mo74150b(context, hVar.f147114f, "greeting", eVar);
                    C52665g.C52666a aVar2 = C52665g.f147055f;
                    String str2 = eVar.field_session_id;
                    C87412m.m108593f(str2, "item.field_session_id");
                    aVar2.mo73606c(str2, 103);
                }
            }
        } else {
            Context context2 = this.f129167b;
            C76879j.m92748s(context2, context2.getString(C0966R.string.msg_net_error), "");
        }
        C89779i0 i0Var = this.f129166a.f129170e;
        if (i0Var != null) {
            i0Var.dismiss();
        }
    }
}
