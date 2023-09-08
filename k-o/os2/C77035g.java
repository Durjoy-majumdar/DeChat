package os2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import gy3.C8480h;
import p749xh.C78808g;

/* renamed from: os2.g */
public final class C77035g extends C78808g {

    /* renamed from: B */
    public static final IAutoDBItem.MAutoDBInfo f225046B = C78808g.initAutoDBInfo(C77035g.class);

    /* renamed from: os2.g$a */
    public static final class C77036a {
        public C77036a(C8480h hVar) {
        }
    }

    static {
        new C77036a((C8480h) null);
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        SnsMethodCalculate.markStartTimeMs("getDBInfo", "com.tencent.mm.plugin.sns.storage.AdPullRecordsInfo");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = f225046B;
        SnsMethodCalculate.markEndTimeMs("getDBInfo", "com.tencent.mm.plugin.sns.storage.AdPullRecordsInfo");
        return mAutoDBInfo;
    }
}
