package ji0;

import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import p749xh.C91204d0;
import tr0.C37240b;

/* renamed from: ji0.c */
public class C87967c extends C91204d0 implements C37240b {

    /* renamed from: A */
    public static final IAutoDBItem.MAutoDBInfo f254561A;

    /* renamed from: z */
    public static final String[] f254562z;

    static {
        String[] strArr = {"appId", ProviderConstants.API_COLNAME_FEATURE_VERSION, "packageType", "packageKey"};
        f254562z = strArr;
        IAutoDBItem.MAutoDBInfo initAutoDBInfo = C91204d0.initAutoDBInfo(C91204d0.class);
        f254561A = initAutoDBInfo;
        initAutoDBInfo.sql += C37240b.C37241a.m41249a(strArr);
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f254561A;
    }

    public String[] getKeys() {
        return f254562z;
    }
}
