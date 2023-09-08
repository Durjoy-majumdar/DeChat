package os2;

import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.SelectSql;
import java.util.List;
import p749xh.C102661q8;

/* renamed from: os2.f0 */
public final class C100404f0 {

    /* renamed from: a */
    public static final C100404f0 f294118a = new C100404f0();

    /* renamed from: a */
    public final List<SnsInfo> mo139845a(int i) {
        SnsMethodCalculate.markStartTimeMs("getSnsInfoLargeThanCreateTime", "com.tencent.mm.plugin.sns.storage.SnsInfoStorageKt");
        Log.m105924i("MicroMsg.SnsInfoStorageKt", "getSnsInfoLargeThanCreateTime >> createTime: " + i);
        SelectSql.Builder selectAll = C102661q8.TABLE.selectAll();
        Column column = C102661q8.CREATETIME;
        List<SnsInfo> multiQuery = selectAll.where(column.largerThan(String.valueOf(i))).orderBy(column.orderDesc()).build().multiQuery(C94866e1.Bx0(), SnsInfo.class);
        Log.m105924i("MicroMsg.SnsInfoStorageKt", "getSnsInfoLargeThanCreateTime >> createTime: " + i + ", size: " + multiQuery.size());
        for (SnsInfo snsInfo : multiQuery) {
            Log.m105924i("MicroMsg.SnsInfoStorageKt", "getSnsInfoLargeThanCreateTime >> " + snsInfo.getCreateTime() + ", " + snsInfo.getSnsId() + ". " + snsInfo.localid);
        }
        SnsMethodCalculate.markEndTimeMs("getSnsInfoLargeThanCreateTime", "com.tencent.mm.plugin.sns.storage.SnsInfoStorageKt");
        return multiQuery;
    }

    /* renamed from: b */
    public final List<SnsInfo> mo139846b(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("getSnsInfoSmallThanCreateTimeAndLimit", "com.tencent.mm.plugin.sns.storage.SnsInfoStorageKt");
        SelectSql.Builder selectAll = C102661q8.TABLE.selectAll();
        Column column = C102661q8.CREATETIME;
        List<SnsInfo> multiQuery = selectAll.where(column.smallerThan(String.valueOf(i))).orderBy(column.orderDesc()).limit(i2, 0).build().multiQuery(C94866e1.Bx0(), SnsInfo.class);
        Log.m105924i("MicroMsg.SnsInfoStorageKt", "getSnsInfoSmallThanCreateTimeAndLimit >> createTime: " + i + ", size: " + multiQuery.size() + ", limit: " + i2);
        for (SnsInfo snsInfo : multiQuery) {
            Log.m105924i("MicroMsg.SnsInfoStorageKt", "getSnsInfoSmallThanCreateTimeAndLimit >> " + snsInfo.getCreateTime() + ", " + snsInfo.getSnsId() + ". " + snsInfo.localid);
        }
        SnsMethodCalculate.markEndTimeMs("getSnsInfoSmallThanCreateTimeAndLimit", "com.tencent.mm.plugin.sns.storage.SnsInfoStorageKt");
        return multiQuery;
    }
}
