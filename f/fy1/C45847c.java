package fy1;

import com.tencent.kinda.framework.app.KindaConfigCacheStg;
import com.tencent.p014mm.plugin.game.luggage.ipc.CommonLogicTask;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import te3.C50187kw2;
import te3.C52105ye2;
import x93.C53299a;

/* renamed from: fy1.c */
public class C45847c {

    /* renamed from: a */
    public String f123789a;

    /* renamed from: b */
    public List<C50187kw2> f123790b = C53299a.f148887a;

    /* renamed from: c */
    public Map<Integer, C45845a> f123791c = new HashMap();

    public C45847c(String str) {
        this.f123789a = str;
        try {
            CommonLogicTask commonLogicTask = new CommonLogicTask();
            commonLogicTask.f112909g = 9;
            commonLogicTask.f112908f.putString("game_hv_menu_appid", this.f123789a);
            commonLogicTask.mo114396f();
            String string = commonLogicTask.f112908f.getString("game_hv_menu_pbcache");
            if (!Util.isNullOrNil(string)) {
                byte[] bytes = string.getBytes(KindaConfigCacheStg.SAVE_CHARSET);
                C52105ye2 ye22 = new C52105ye2();
                ye22.parseFrom(bytes);
                if (!Util.isNullOrNil((List) ye22.f145248d)) {
                    this.f123790b = ye22.f145248d;
                    Log.m105924i("MicroMsg.H5GameMenuHelp", "use net menu data");
                }
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.H5GameMenuHelp", "get cache hv game menu fail! exception:%s", e.getMessage());
        }
        Collections.sort(this.f123790b, new C45846b(this));
        List<C50187kw2> list = this.f123790b;
        int i = list.get(list.size() - 1).f137074i;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add((Object) null);
        }
        for (C50187kw2 next : this.f123790b) {
            int i3 = next.f137074i;
            if (i3 > 0 && i3 <= arrayList.size()) {
                arrayList.set(next.f137074i - 1, next);
            }
        }
        this.f123790b = arrayList;
        mo71309a(new C45861k(1));
        mo71309a(new C45857i(2));
        mo71309a(new C45863m(3));
        mo71309a(new C45858j(4));
        mo71309a(new C45862l(7));
        mo71309a(new C45851g(8));
        mo71309a(new C45855h(10));
    }

    /* renamed from: a */
    public final void mo71309a(C45845a aVar) {
        this.f123791c.put(Integer.valueOf(aVar.f123788a), aVar);
    }
}
