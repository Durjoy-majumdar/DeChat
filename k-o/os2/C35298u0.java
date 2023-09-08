package os2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import p749xh.C38569g9;

/* renamed from: os2.u0 */
public class C35298u0 extends C38569g9 {

    /* renamed from: t */
    public static IAutoDBItem.MAutoDBInfo f94561t = C38569g9.initAutoDBInfo(C35298u0.class);

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        SnsMethodCalculate.markStartTimeMs("getDBInfo", "com.tencent.mm.plugin.sns.storage.UxCanvasInfo");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = f94561t;
        SnsMethodCalculate.markEndTimeMs("getDBInfo", "com.tencent.mm.plugin.sns.storage.UxCanvasInfo");
        return mAutoDBInfo;
    }
}
