package vq0;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import p749xh.C38562fa;
import tr0.C37240b;

/* renamed from: vq0.b */
public class C37802b extends C38562fa implements C37240b {

    /* renamed from: A */
    public static final IAutoDBItem.MAutoDBInfo f100121A = C38562fa.initAutoDBInfo(C37802b.class);

    /* renamed from: B */
    public static final String[] f100122B;

    /* renamed from: z */
    public static final String[] f100123z;

    static {
        String[] strArr = {"appId", "commLibVersionId", "appVersionId", "pageURL"};
        f100123z = strArr;
        String str = " PRIMARY KEY ( ";
        for (String str2 : strArr) {
            str = str + ", " + str2;
        }
        StringBuilder sb = new StringBuilder();
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = f100121A;
        sb.append(mAutoDBInfo.sql);
        sb.append(",");
        sb.append(str.replaceFirst(",", "") + " )");
        mAutoDBInfo.sql = sb.toString();
        f100122B = new String[]{MAutoStorage.getCreateSQLs(mAutoDBInfo, "WxaAppWebRenderingCacheAccessStatsTable")};
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f100121A;
    }

    public String[] getKeys() {
        return f100123z;
    }
}
