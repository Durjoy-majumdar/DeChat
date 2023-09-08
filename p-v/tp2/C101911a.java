package tp2;

import android.content.Context;
import aq2.C92063b;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import up2.C102061b;
import wp2.C102480a;
import yp2.C102896b;

/* renamed from: tp2.a */
public final class C101911a {
    /* renamed from: a */
    public static C101913c m134112a(int i, Context context) {
        SnsMethodCalculate.markStartTimeMs("make", "com.tencent.mm.plugin.sns.ad.timeline.clicker.AdTimelinePartActionMaker");
        if (i == 1) {
            try {
                C102480a aVar = new C102480a(context);
                SnsMethodCalculate.markEndTimeMs("make", "com.tencent.mm.plugin.sns.ad.timeline.clicker.AdTimelinePartActionMaker");
                return aVar;
            } catch (Throwable unused) {
            }
        } else if (i == 3) {
            C102061b bVar = new C102061b(context);
            SnsMethodCalculate.markEndTimeMs("make", "com.tencent.mm.plugin.sns.ad.timeline.clicker.AdTimelinePartActionMaker");
            return bVar;
        } else if (i == 4) {
            C102896b bVar2 = new C102896b(context);
            SnsMethodCalculate.markEndTimeMs("make", "com.tencent.mm.plugin.sns.ad.timeline.clicker.AdTimelinePartActionMaker");
            return bVar2;
        } else {
            if (i == 5) {
                C92063b bVar3 = new C92063b(context);
                SnsMethodCalculate.markEndTimeMs("make", "com.tencent.mm.plugin.sns.ad.timeline.clicker.AdTimelinePartActionMaker");
                return bVar3;
            }
            SnsMethodCalculate.markEndTimeMs("make", "com.tencent.mm.plugin.sns.ad.timeline.clicker.AdTimelinePartActionMaker");
            return null;
        }
    }

    /* renamed from: b */
    public static C101913c m134113b(Context context) {
        SnsMethodCalculate.markStartTimeMs("makeAvatarAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.AdTimelinePartActionMaker");
        C101913c a = m134112a(1, context);
        SnsMethodCalculate.markEndTimeMs("makeAvatarAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.AdTimelinePartActionMaker");
        return a;
    }
}
