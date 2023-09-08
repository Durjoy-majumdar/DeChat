package os2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import p749xh.C38619n8;

/* renamed from: os2.a0 */
public class C35285a0 extends C38619n8 {

    /* renamed from: t */
    public static IAutoDBItem.MAutoDBInfo f94540t = C38619n8.initAutoDBInfo(C35285a0.class);

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        SnsMethodCalculate.markStartTimeMs("getDBInfo", "com.tencent.mm.plugin.sns.storage.SnsDraft");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = f94540t;
        SnsMethodCalculate.markEndTimeMs("getDBInfo", "com.tencent.mm.plugin.sns.storage.SnsDraft");
        return mAutoDBInfo;
    }
}
