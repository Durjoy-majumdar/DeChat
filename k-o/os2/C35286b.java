package os2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import p749xh.C38556f;

/* renamed from: os2.b */
public class C35286b extends C38556f {

    /* renamed from: z */
    public static IAutoDBItem.MAutoDBInfo f94541z = C38556f.initAutoDBInfo(C35286b.class);

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        SnsMethodCalculate.markStartTimeMs("getDBInfo", "com.tencent.mm.plugin.sns.storage.AdCanvasCacheInfo");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = f94541z;
        SnsMethodCalculate.markEndTimeMs("getDBInfo", "com.tencent.mm.plugin.sns.storage.AdCanvasCacheInfo");
        return mAutoDBInfo;
    }
}
