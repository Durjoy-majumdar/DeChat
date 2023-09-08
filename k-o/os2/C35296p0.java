package os2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import p749xh.C38669t8;

/* renamed from: os2.p0 */
public class C35296p0 extends C38669t8 {

    /* renamed from: t */
    public static IAutoDBItem.MAutoDBInfo f94558t = C38669t8.initAutoDBInfo(C35296p0.class);

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        SnsMethodCalculate.markStartTimeMs("getDBInfo", "com.tencent.mm.plugin.sns.storage.SnsWsFoldGroup");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = f94558t;
        SnsMethodCalculate.markEndTimeMs("getDBInfo", "com.tencent.mm.plugin.sns.storage.SnsWsFoldGroup");
        return mAutoDBInfo;
    }
}
