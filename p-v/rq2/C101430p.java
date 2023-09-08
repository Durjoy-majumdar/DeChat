package rq2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.Random;

/* renamed from: rq2.p */
public class C101430p {

    /* renamed from: a */
    public static final Random f297081a = new Random();

    /* renamed from: a */
    public static float m133117a(float f, float f2) {
        SnsMethodCalculate.markStartTimeMs("getRandom", "com.tencent.mm.plugin.sns.ad.utils.RandomUtils");
        float min = Math.min(f, f2);
        SnsMethodCalculate.markStartTimeMs("getRandom", "com.tencent.mm.plugin.sns.ad.utils.RandomUtils");
        float nextFloat = f297081a.nextFloat();
        SnsMethodCalculate.markEndTimeMs("getRandom", "com.tencent.mm.plugin.sns.ad.utils.RandomUtils");
        float max = (nextFloat * (Math.max(f, f2) - min)) + min;
        SnsMethodCalculate.markEndTimeMs("getRandom", "com.tencent.mm.plugin.sns.ad.utils.RandomUtils");
        return max;
    }
}
