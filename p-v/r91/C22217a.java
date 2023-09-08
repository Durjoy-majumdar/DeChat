package r91;

import com.tencent.p014mm.autogen.events.FinderBizEvent;
import com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b;
import gy3.C87412m;
import t91.C64208c;

/* renamed from: r91.a */
public final class C22217a {
    /* renamed from: a */
    public static final void m25719a(String str, Integer num, int i) {
        if (str != null && num != null) {
            num.intValue();
            C64208c.C64209a aVar = C64208c.f181951a;
            if ((C87412m.m108589b("com.tencent.mm.plugin.finder.ui.FinderHomeUI", str) || C87412m.m108589b("com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI", str) || C87412m.m108589b("com.tencent.mm.plugin.finder.ui.FinderConversationUI", str) || C87412m.m108589b("FinderHomeUI", str) || C87412m.m108589b("FinderHomeAffinityUI", str) || C87412m.m108589b("FinderConversationUI", str)) || ((i == 2 || i == 3) && C87412m.m108589b(C115411b.f345922a.mo175246c(), "143"))) {
                FinderBizEvent finderBizEvent = new FinderBizEvent();
                FinderBizEvent.C17677a aVar2 = finderBizEvent.f48088d;
                aVar2.f48089a = i;
                aVar2.f48090b = str;
                aVar2.f48091c = num.intValue();
                finderBizEvent.publish();
            }
        }
    }
}
