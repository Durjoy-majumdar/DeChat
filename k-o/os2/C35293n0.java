package os2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import p749xh.C38676u8;

/* renamed from: os2.n0 */
public class C35293n0 extends C38676u8 {

    /* renamed from: r */
    public static IAutoDBItem.MAutoDBInfo f94553r = C38676u8.initAutoDBInfo(C35293n0.class);

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        SnsMethodCalculate.markStartTimeMs("getDBInfo", "com.tencent.mm.plugin.sns.storage.SnsWsFoldDetail");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = f94553r;
        SnsMethodCalculate.markEndTimeMs("getDBInfo", "com.tencent.mm.plugin.sns.storage.SnsWsFoldDetail");
        return mAutoDBInfo;
    }
}
