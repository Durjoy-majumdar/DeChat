package re0;

import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import p239sv.C36841s;
import p749xh.C38533b7;
import zh3.C91753f;

/* renamed from: re0.l */
public class C36315l extends MAutoStorage<C38533b7> implements C36841s {

    /* renamed from: e */
    public static final String[] f96670e = {MAutoStorage.getCreateSQLs(C36314k.f96669z, "OpenIMWordingInfo")};

    /* renamed from: d */
    public C91753f f96671d;

    public C36315l(C91753f fVar) {
        super(fVar, C36314k.f96669z, "OpenIMWordingInfo", (String[]) null);
        this.f96671d = fVar;
    }

    /* renamed from: Lo */
    public boolean replace(C38533b7 b7Var) {
        b7Var.field_updateTime = Util.nowSecond();
        return super.replace(b7Var);
    }

    /* renamed from: jo */
    public /* bridge */ /* synthetic */ boolean mo60615jo(C38533b7 b7Var, String[] strArr) {
        return super.get(b7Var, strArr);
    }
}
