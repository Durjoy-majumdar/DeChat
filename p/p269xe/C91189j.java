package p269xe;

import com.tencent.p014mm.plugin.appbrand.jsapi.profile.C1838k;
import com.tencent.p014mm.plugin.appbrand.jsapi.profile.C40475h;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: xe.j */
public class C91189j {
    /* renamed from: a */
    public final int mo125249a(String str) {
        if (str.equalsIgnoreCase(MMApplicationContext.getApplicationId())) {
            return 1033;
        }
        if (str.equalsIgnoreCase(MMApplicationContext.getApplicationId() + ":tools")) {
            return 1187;
        }
        if (str.equalsIgnoreCase(MMApplicationContext.getApplicationId() + ":push")) {
            return 1189;
        }
        if (str.startsWith(MMApplicationContext.getApplicationId() + ":appbrand")) {
            return 1190;
        }
        return C40475h.CTRL_INDEX;
    }

    /* renamed from: b */
    public final int mo125250b(String str) {
        if (str.endsWith("SnsTimeLineUI")) {
            return 0;
        }
        if (str.endsWith("ChattingUIFragment") || str.endsWith("ChattingUI")) {
            return 20;
        }
        if (str.endsWith("MainUI")) {
            return 40;
        }
        if (str.endsWith("FinderHomeUI") || str.endsWith("FinderHomeAffinityUI")) {
            return 100;
        }
        if (str.endsWith("FinderProfileUI")) {
            return 120;
        }
        if (str.endsWith("FinderTimelineLbsUI")) {
            return 140;
        }
        return str.endsWith("AddressUI") ? 160 : -1;
    }

    /* renamed from: c */
    public final int mo125251c(String str) {
        if (str.equalsIgnoreCase(MMApplicationContext.getApplicationId())) {
            return 1192;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(MMApplicationContext.getApplicationId());
        sb.append(":tools");
        return str.equalsIgnoreCase(sb.toString()) ? C1838k.CTRL_INDEX : C40475h.CTRL_INDEX;
    }
}
