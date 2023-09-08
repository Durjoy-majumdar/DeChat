package e02;

import com.tencent.p014mm.plugin.handoff.model.HandOff;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import d02.C31041c;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: e02.c */
public final class C97563c extends C97561a {

    /* renamed from: a */
    public final C31041c f286283a = new C31041c(0, (Collection) null, 0, 7, (C8480h) null);

    /* renamed from: b */
    public final List<HandOff> f286284b = new ArrayList();

    /* renamed from: a */
    public void mo136827a(XmlPullParser xmlPullParser) {
        C87412m.m108594g(xmlPullParser, "parser");
        this.f286283a.f83273a = mo136829c(xmlPullParser, "opcode");
        C31041c cVar = this.f286283a;
        mo136830d(xmlPullParser, TPReportKeys.Common.COMMON_SEQ);
        cVar.getClass();
        super.mo136827a(xmlPullParser);
        C31041c cVar2 = this.f286283a;
        List<HandOff> list = this.f286284b;
        cVar2.getClass();
        C87412m.m108594g(list, "<set-?>");
        cVar2.f83274b = list;
    }

    /* renamed from: b */
    public void mo136828b(String str, XmlPullParser xmlPullParser) {
        C87412m.m108594g(str, "tag");
        C87412m.m108594g(xmlPullParser, "parser");
        if (C87412m.m108589b(str, "handoff")) {
            int c = mo136829c(xmlPullParser, "type");
            C97566f dVar = c != 1 ? c != 2 ? c != 3 ? c != 4 ? null : new C97564d() : new C97565e() : new C97568g() : new C97562b();
            if (dVar != null) {
                dVar.mo136827a(xmlPullParser);
                HandOff g = dVar.mo136834g();
                if (g != null) {
                    ((ArrayList) this.f286284b).add(g);
                }
            }
        }
    }
}
