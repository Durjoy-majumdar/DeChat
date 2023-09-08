package ij2;

import android.view.MenuItem;
import bp3.C79758p;
import com.tencent.p014mm.autogen.events.RepairerActionEvent;
import com.tencent.p014mm.plugin.mvvmlist.MvvmList;
import fj2.C59106c;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.List;
import nj3.C11184p0;
import sx3.C110818d0;
import te3.C64563mr3;

/* renamed from: ij2.e */
public final class C60319e implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C64563mr3 f171961d;

    /* renamed from: e */
    public final /* synthetic */ List<String> f171962e;

    /* renamed from: f */
    public final /* synthetic */ C59106c f171963f;

    /* renamed from: g */
    public final /* synthetic */ C60313c f171964g;

    public C60319e(C64563mr3 mr32, List<String> list, C59106c cVar, C60313c cVar2) {
        this.f171961d = mr32;
        this.f171962e = list;
        this.f171963f = cVar;
        this.f171964g = cVar2;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        LinkedList<String> linkedList = this.f171961d.f184383g;
        C87412m.m108593f(linkedList, "configItem.values");
        String str = (String) C110818d0.m150917O(linkedList, menuItem.getItemId());
        if (str != null) {
            List<String> list = this.f171962e;
            C64563mr3 mr32 = this.f171961d;
            C59106c cVar = this.f171963f;
            C60313c cVar2 = this.f171964g;
            String str2 = list.get(list.size() - 1);
            switch (str2.hashCode()) {
                case -1808118735:
                    if (str2.equals("String")) {
                        C79758p pVar = C79758p.f233760a;
                        String str3 = mr32.f184380d;
                        C87412m.m108593f(str3, "configItem.key");
                        pVar.mo109888k(str3, str);
                        break;
                    }
                    break;
                case 73679:
                    if (str2.equals("Int")) {
                        C79758p pVar2 = C79758p.f233760a;
                        String str4 = mr32.f184380d;
                        C87412m.m108593f(str4, "configItem.key");
                        pVar2.mo109888k(str4, Integer.valueOf(Integer.parseInt(str)));
                        break;
                    }
                    break;
                case 2374300:
                    if (str2.equals("Long")) {
                        C79758p pVar3 = C79758p.f233760a;
                        String str5 = mr32.f184380d;
                        C87412m.m108593f(str5, "configItem.key");
                        pVar3.mo109888k(str5, Long.valueOf(Long.parseLong(str)));
                        break;
                    }
                    break;
                case 67973692:
                    if (str2.equals("Float")) {
                        C79758p pVar4 = C79758p.f233760a;
                        String str6 = mr32.f184380d;
                        C87412m.m108593f(str6, "configItem.key");
                        pVar4.mo109888k(str6, Float.valueOf(Float.parseFloat(str)));
                        break;
                    }
                    break;
            }
            C59106c cVar3 = (C59106c) cVar.mo90777Ow();
            cVar3.f169070g = str;
            MvvmList<C59106c> mvvmList = cVar2.f171946d;
            if (mvvmList != null) {
                MvvmList.m119210t(mvvmList, cVar3, false, 2, (Object) null);
            }
            RepairerActionEvent repairerActionEvent = new RepairerActionEvent();
            RepairerActionEvent.C28799a aVar = repairerActionEvent.f78918d;
            aVar.f78919a = 1;
            aVar.f78920b = mr32.f184380d;
            aVar.f78921c = str;
            repairerActionEvent.publish();
        }
    }
}
