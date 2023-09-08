package ki0;

import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import p749xh.C91210p7;
import tr0.C37240b;

/* renamed from: ki0.c */
public final class C88153c extends C91210p7 implements C37240b {

    /* renamed from: U */
    public static final String[] f254937U;

    /* renamed from: V */
    public static final IAutoDBItem.MAutoDBInfo f254938V = C91210p7.initAutoDBInfo(C88153c.class);

    static {
        String[] strArr = {"appId", "type", ProviderConstants.API_COLNAME_FEATURE_VERSION, "packageKey", "packageType"};
        f254937U = strArr;
        String str = " PRIMARY KEY ( ";
        for (String str2 : strArr) {
            str = str + ", " + str2;
        }
        StringBuilder sb = new StringBuilder();
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = f254938V;
        sb.append(mAutoDBInfo.sql);
        sb.append(",");
        sb.append(str.replaceFirst(",", "") + " )");
        mAutoDBInfo.sql = sb.toString();
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f254938V;
    }

    public String[] getKeys() {
        return f254937U;
    }

    public String toString() {
        return "CmdGetCodePersistentInfo{field_appId='" + this.field_appId + '\'' + ", field_version=" + this.field_version + ", field_type=" + this.field_type + ", field_retryTimes=" + this.field_retryTimes + ", field_retriedCount=" + this.field_retriedCount + ", field_retryInterval=" + this.field_retryInterval + ", field_networkType=" + this.field_networkType + ", field_pkgMd5='" + this.field_pkgMd5 + '\'' + ", field_packageKey='" + this.field_packageKey + '\'' + ", field_packageType=" + this.field_packageType + ", field_lastRetryTime=" + this.field_lastRetryTime + ", field_firstTimeTried=" + this.field_firstTimeTried + ", field_reportId=" + this.field_reportId + ", field_splitDownloadURLCgi=" + this.field_splitDownloadURLCgi + ", field_scene=" + this.field_scene + ", field_cmdSequence=" + this.field_cmdSequence + '}';
    }
}
