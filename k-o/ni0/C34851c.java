package ni0;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import gy3.C87412m;
import p749xh.C38629oa;

/* renamed from: ni0.c */
public final class C34851c extends C38629oa {

    /* renamed from: p */
    public static final IAutoDBItem.MAutoDBInfo f93631p;

    /* renamed from: q */
    public static final String[] f93632q;

    static {
        IAutoDBItem.MAutoDBInfo initAutoDBInfo = C38629oa.initAutoDBInfo(C34851c.class);
        f93631p = initAutoDBInfo;
        String createSQLs = MAutoStorage.getCreateSQLs(initAutoDBInfo, "WxaSecurityStorageInfo");
        C87412m.m108593f(createSQLs, "getCreateSQLs(INFO, TABLE_NAME)");
        f93632q = new String[]{createSQLs};
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f93631p;
    }
}
