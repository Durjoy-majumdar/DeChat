package mg1;

import ak1.C54067f0;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import ht1.C8777j5;
import java.util.HashMap;

/* renamed from: mg1.a */
public final class C10886a {

    /* renamed from: a */
    public static final C10886a f32497a = new C10886a();

    /* renamed from: b */
    public static String f32498b;

    /* renamed from: a */
    public final void mo11103a(boolean z) {
        Class cls = C8777j5.class;
        HashMap hashMap = new HashMap();
        String str = f32498b;
        if (str == null) {
            str = "";
        }
        hashMap.put("group_box_number", str);
        Log.m105924i("FinderLiveBoxReportUtils", "boxBtnReport reportMap: " + hashMap + " isSwitch: " + z);
        if (z) {
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
            C8777j5.C8778a.m8606g((C8777j5) c, C54067f0.C0064m.BOX_SWITCH, hashMap, (String) null, 4, (Object) null);
            return;
        }
        ((C8777j5) C86312j.m106911c(cls)).mo9602Jz(C54067f0.C0066n.BOX_SWITCH, hashMap);
    }
}
