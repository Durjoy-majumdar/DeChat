package ij2;

import bp3.C79758p;
import com.tencent.p014mm.autogen.events.RepairerActionEvent;
import com.tencent.p014mm.plugin.mvvmlist.MvvmList;
import fj2.C59106c;
import gy3.C87412m;
import java.util.List;
import te3.C64563mr3;
import yi2.C16013b;
import z04.C66730w;
import z04.C66731x;

/* renamed from: ij2.f */
public final class C60320f implements C16013b {

    /* renamed from: a */
    public final /* synthetic */ List<String> f171965a;

    /* renamed from: b */
    public final /* synthetic */ C64563mr3 f171966b;

    /* renamed from: c */
    public final /* synthetic */ C59106c f171967c;

    /* renamed from: d */
    public final /* synthetic */ C60313c f171968d;

    public C60320f(List<String> list, C64563mr3 mr32, C59106c cVar, C60313c cVar2) {
        this.f171965a = list;
        this.f171966b = mr32;
        this.f171967c = cVar;
        this.f171968d = cVar2;
    }

    /* renamed from: a */
    public void mo14637a(String str) {
        C87412m.m108594g(str, "value");
        List<String> list = this.f171965a;
        String str2 = list.get(list.size() - 1);
        switch (str2.hashCode()) {
            case -1808118735:
                if (str2.equals("String")) {
                    C79758p pVar = C79758p.f233760a;
                    String str3 = this.f171966b.f184380d;
                    C87412m.m108593f(str3, "configItem.key");
                    pVar.mo109888k(str3, str);
                    break;
                }
                break;
            case 73679:
                if (str2.equals("Int")) {
                    C79758p pVar2 = C79758p.f233760a;
                    String str4 = this.f171966b.f184380d;
                    C87412m.m108593f(str4, "configItem.key");
                    Integer e = C66731x.m78731e(str);
                    pVar2.mo109888k(str4, Integer.valueOf(e != null ? e.intValue() : 0));
                    break;
                }
                break;
            case 2374300:
                if (str2.equals("Long")) {
                    C79758p pVar3 = C79758p.f233760a;
                    String str5 = this.f171966b.f184380d;
                    C87412m.m108593f(str5, "configItem.key");
                    Long f = C66731x.m78732f(str);
                    pVar3.mo109888k(str5, Long.valueOf(f != null ? f.longValue() : 0));
                    break;
                }
                break;
            case 67973692:
                if (str2.equals("Float")) {
                    C79758p pVar4 = C79758p.f233760a;
                    String str6 = this.f171966b.f184380d;
                    C87412m.m108593f(str6, "configItem.key");
                    Float d = C66730w.m78730d(str);
                    pVar4.mo109888k(str6, Float.valueOf(d != null ? d.floatValue() : 0.0f));
                    break;
                }
                break;
        }
        C59106c cVar = (C59106c) this.f171967c.mo90777Ow();
        cVar.f169070g = str;
        MvvmList<C59106c> mvvmList = this.f171968d.f171946d;
        if (mvvmList != null) {
            MvvmList.m119210t(mvvmList, cVar, false, 2, (Object) null);
        }
        RepairerActionEvent repairerActionEvent = new RepairerActionEvent();
        C64563mr3 mr32 = this.f171966b;
        RepairerActionEvent.C28799a aVar = repairerActionEvent.f78918d;
        aVar.f78919a = 1;
        aVar.f78920b = mr32.f184380d;
        aVar.f78921c = str;
        repairerActionEvent.publish();
    }
}
