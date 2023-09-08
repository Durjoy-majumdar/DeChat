package sa1;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import gy3.C87412m;
import p749xh.C38638pa;
import zh3.C91753f;

/* renamed from: sa1.a */
public final class C36646a extends MAutoStorage<C36647b> {

    /* renamed from: d */
    public static final String[] f97411d = {MAutoStorage.getCreateSQLs(C38638pa.initAutoDBInfo((Class<?>) null), "WxaTokenInfo")};

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36646a(C91753f fVar) {
        super(fVar, C36647b.f97412t, "WxaTokenInfo", (String[]) null);
        C87412m.m108594g(fVar, "dataDB");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C36647b.f97412t;
    }
}
