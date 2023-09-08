package os2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import p749xh.C38710z0;

/* renamed from: os2.d */
public class C35289d extends C38710z0 {

    /* renamed from: r */
    public static IAutoDBItem.MAutoDBInfo f94547r = C38710z0.initAutoDBInfo(C35289d.class);

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        SnsMethodCalculate.markStartTimeMs("getDBInfo", "com.tencent.mm.plugin.sns.storage.AdCanvasInfo");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = f94547r;
        SnsMethodCalculate.markEndTimeMs("getDBInfo", "com.tencent.mm.plugin.sns.storage.AdCanvasInfo");
        return mAutoDBInfo;
    }
}
