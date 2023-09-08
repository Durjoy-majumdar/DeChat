package bj2;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.sql.ISqlColumn;
import java.util.List;
import p749xh.C66275u5;
import sx3.C26236u;

/* renamed from: bj2.v */
public final class C54473v extends C66275u5 {
    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return C66275u5.initAutoDBInfo(C54473v.class);
    }

    public String[] getIndexCreateSQL() {
        return new String[]{C66275u5.f190679p.index("Test").mo81861on((List<? extends ISqlColumn>) C26236u.m33719b(C66275u5.f190681r)).log("MicroMsg.RepairerMvvmDBDemoUI").build().toSql()};
    }
}
