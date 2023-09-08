package zp1;

import a14.C53895h;
import a14.C53934p0;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import fy3.C32224a;
import gy3.C87412m;
import p204mr.C109636p;
import p204mr.C61567i;
import p204mr.C61570q;
import wx3.C15601d;
import wx3.C66212f;

@C86522b
/* renamed from: zp1.a */
public final class C112646a extends C86301e implements C61567i {
    public void Dh0(C61570q qVar, String str, C32224a<String> aVar) {
        String invoke;
        C87412m.m108594g(qVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        C112654j jVar = C112650f.f337321a;
        String str2 = str == null ? "" : str;
        if (((C109636p) C86312j.m106911c(C109636p.class)).isEnable()) {
            C112654j jVar2 = C112650f.f337321a;
            jVar2.getClass();
            C53895h.m60466d(jVar2.f337348b, (C66212f) null, (C53934p0) null, new C112652h(qVar, str2, jVar2, (aVar == null || (invoke = aVar.invoke()) == null) ? "" : invoke, (C15601d<? super C112652h>) null), 3, (Object) null);
        }
    }

    /* renamed from: Tw */
    public void mo86500Tw(C61570q qVar, String str, C32224a<String> aVar) {
        String invoke;
        C87412m.m108594g(qVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        C112654j jVar = C112650f.f337321a;
        String str2 = str == null ? "" : str;
        if (((C109636p) C86312j.m106911c(C109636p.class)).isEnable()) {
            C112654j jVar2 = C112650f.f337321a;
            jVar2.getClass();
            C53895h.m60466d(jVar2.f337348b, (C66212f) null, (C53934p0) null, new C112651g(qVar, str2, jVar2, (aVar == null || (invoke = aVar.invoke()) == null) ? "" : invoke, (C15601d<? super C112651g>) null), 3, (Object) null);
        }
    }

    /* renamed from: dh */
    public void mo86501dh(C61570q qVar, String str) {
        C87412m.m108594g(qVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        C112654j jVar = C112650f.f337321a;
        if (str == null) {
            str = "";
        }
        if (((C109636p) C86312j.m106911c(C109636p.class)).isEnable()) {
            C112654j jVar2 = C112650f.f337321a;
            jVar2.getClass();
            C53895h.m60466d(jVar2.f337348b, (C66212f) null, (C53934p0) null, new C112653i(qVar, str, jVar2, (C15601d<? super C112653i>) null), 3, (Object) null);
        }
    }
}
