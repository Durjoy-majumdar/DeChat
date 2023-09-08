package wr2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Comparator;
import java.util.List;

/* renamed from: wr2.c */
public class C91099c {

    /* renamed from: a */
    public List<String> f261283a;

    /* renamed from: b */
    public List<String> f261284b;

    /* renamed from: c */
    public String f261285c;

    /* renamed from: d */
    public String f261286d;

    /* renamed from: e */
    public String f261287e;

    /* renamed from: f */
    public int f261288f;

    /* renamed from: wr2.c$a */
    public static class C91100a implements Comparator<C91099c> {
        public int compare(Object obj, Object obj2) {
            int i;
            SnsMethodCalculate.markStartTimeMs("compare", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketTagNode$MarketTagComparator");
            C91099c cVar = (C91099c) obj;
            C91099c cVar2 = (C91099c) obj2;
            SnsMethodCalculate.markStartTimeMs("compare", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketTagNode$MarketTagComparator");
            try {
                i = Integer.compare(cVar.f261288f, cVar2.f261288f);
                SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketTagNode$MarketTagComparator");
            } catch (Throwable unused) {
                i = 0;
                SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketTagNode$MarketTagComparator");
            }
            SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketTagNode$MarketTagComparator");
            return i;
        }
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketTagNode");
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append("brand=");
            sb.append(this.f261285c);
            sb.append(", appPkg=");
            sb.append(this.f261286d);
            sb.append(", name=");
            sb.append(this.f261287e);
            sb.append(", priority=");
            sb.append(this.f261288f);
            List<String> list = this.f261284b;
            if (list != null) {
                if (list.size() > 0) {
                    sb.append(", pkgs=");
                    for (String append : list) {
                        sb.append(append);
                        sb.append("|");
                    }
                }
            }
            List<String> list2 = this.f261283a;
            if (list2 != null && list2.size() > 0) {
                sb.append(", urls=");
                for (String append2 : list2) {
                    sb.append(append2);
                    sb.append("|");
                }
            }
            sb.append("]");
            String sb4 = sb.toString();
            SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketTagNode");
            return sb4;
        } catch (Throwable th) {
            Log.m105920e("AdAppMarketTagNode", "toString exp=" + th.toString());
            SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketTagNode");
            return "";
        }
    }
}
