package jz1;

import bz1.C0394d;
import com.tencent.p014mm.game.report.C40306c;
import cz1.C7143c;
import di3.C86312j;
import gy3.C87412m;
import hz1.C46161a;
import jz1.C46595b;
import jz1.C46625t;
import xy1.C15912f;
import xy1.C15913g;

/* renamed from: jz1.n */
public final class C46612n extends C46625t {

    /* renamed from: b */
    public C46595b.C46597b f125544b;

    /* renamed from: c */
    public C46595b.C46598c f125545c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46612n(C46625t.C46626a aVar) {
        super(aVar);
        C87412m.m108594g(aVar, "delegate");
    }

    /* renamed from: a */
    public static final void m51918a(C46612n nVar, C7143c cVar, long j, int i) {
        C46612n nVar2 = nVar;
        C7143c cVar2 = cVar;
        nVar.getClass();
        String str = j == 72 ? "2" : null;
        if (!cVar.mo8334m2()) {
            C15912f X3 = ((C15913g) C86312j.m106911c(C15913g.class)).mo440X3(cVar2.field_selfUserName);
            if (X3 != null) {
                int w2 = nVar2.f125565a.mo71886w2();
                String str2 = cVar2.field_sessionId;
                String str3 = str2;
                C87412m.m108593f(str2, "item.field_sessionId");
                long D0 = (long) X3.mo422D0();
                String str4 = cVar2.field_selfUserName;
                String str5 = str4;
                C87412m.m108593f(str4, "item.field_selfUserName");
                C0394d dVar = cVar2.f25115F;
                C87412m.m108591d(dVar);
                long j2 = (long) dVar.field_accountType;
                String str6 = cVar2.field_talker;
                C87412m.m108593f(str6, "item.field_talker");
                C40306c.f108374a.mo62988e(i + 1, j, w2, str3, D0, str5, j2, str6, cVar.mo8333l2(), C46161a.f124440a, str);
                return;
            }
            return;
        }
        int w25 = nVar2.f125565a.mo71886w2();
        String str7 = cVar2.field_sessionId;
        C87412m.m108593f(str7, "item.field_sessionId");
        C40306c.f108374a.mo62988e(i + 1, j, w25, str7, 0, "", 0, "", cVar.mo8333l2(), C46161a.f124440a, str);
    }
}
