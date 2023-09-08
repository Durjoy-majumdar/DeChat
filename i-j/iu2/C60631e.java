package iu2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import i40.C60247c;
import java.util.Set;
import p749xh.C102654l5;
import sx3.C22415w0;

/* renamed from: iu2.e */
public final class C60631e extends C60247c {
    /* renamed from: e3 */
    public boolean mo75299e3() {
        SnsMethodCalculate.markStartTimeMs("isEncrypt", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveDB");
        SnsMethodCalculate.markEndTimeMs("isEncrypt", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveDB");
        return false;
    }

    public Set<IAutoDBItem> getAutoDBItemSet() {
        SnsMethodCalculate.markStartTimeMs("getAutoDBItemSet", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveDB");
        Set<IAutoDBItem> a = C22415w0.m26092a(new C102654l5());
        SnsMethodCalculate.markEndTimeMs("getAutoDBItemSet", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveDB");
        return a;
    }
}
