package wx0;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import p749xh.C38609m0;
import te3.C49948j6;

/* renamed from: wx0.a */
public class C38338a extends C38609m0 {

    /* renamed from: t */
    public static IAutoDBItem.MAutoDBInfo f101193t = C38609m0.initAutoDBInfo(C38338a.class);

    public C38338a() {
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f101193t;
    }

    public String toString() {
        return "BizAppMsgReportContext{field_appMsgReportContextId=" + this.field_appMsgReportContextId + ", field_url='" + this.field_url + '\'' + ", field_reportTime=" + this.field_reportTime + ", field_aScene=" + this.field_aScene + '}';
    }

    public C38338a(C49948j6 j6Var) {
        this.field_url = j6Var.f135877d;
        this.field_reportTime = j6Var.f135878e;
    }
}
