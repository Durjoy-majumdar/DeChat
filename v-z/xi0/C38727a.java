package xi0;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import p749xh.C38694x;

/* renamed from: xi0.a */
public final class C38727a extends C38694x {

    /* renamed from: r */
    public static final IAutoDBItem.MAutoDBInfo f104494r;

    /* renamed from: s */
    public static final String[] f104495s;

    static {
        IAutoDBItem.MAutoDBInfo initAutoDBInfo = C38694x.initAutoDBInfo(C38727a.class);
        f104494r = initAutoDBInfo;
        f104495s = new String[]{MAutoStorage.getCreateSQLs(initAutoDBInfo, "AppBrandPrefetchWxaAttrsMarkTable")};
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f104494r;
    }
}
