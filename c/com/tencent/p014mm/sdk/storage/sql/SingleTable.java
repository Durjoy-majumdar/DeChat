package com.tencent.p014mm.sdk.storage.sql;

import com.tencent.p014mm.sdk.storage.sql.ISqlObj;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0000J\u000e\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0000J\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0000J\b\u0010\r\u001a\u00020\u0003H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u000e"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/sql/SingleTable;", "Lcom/tencent/mm/sdk/storage/sql/Table;", "name", "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "setName", "innerJoin", "Lcom/tencent/mm/sdk/storage/sql/MultiTable;", "singleTable", "leftJoin", "rightJoin", "toSql", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.sdk.storage.sql.SingleTable */
public final class SingleTable extends Table {
    private String name;

    public SingleTable(String str) {
        C87412m.m108594g(str, "name");
        this.name = str;
    }

    public final String getName() {
        return this.name;
    }

    public final MultiTable innerJoin(SingleTable singleTable) {
        C87412m.m108594g(singleTable, "singleTable");
        return new MultiTable(this.name, singleTable.name, ISqlObj.TableJoinOperation.InnerJoin);
    }

    public final MultiTable leftJoin(SingleTable singleTable) {
        C87412m.m108594g(singleTable, "singleTable");
        return new MultiTable(this.name, singleTable.name, ISqlObj.TableJoinOperation.LeftJoin);
    }

    public final MultiTable rightJoin(SingleTable singleTable) {
        C87412m.m108594g(singleTable, "singleTable");
        return new MultiTable(this.name, singleTable.name, ISqlObj.TableJoinOperation.RightJoin);
    }

    public final void setName(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.name = str;
    }

    public String toSql() {
        return this.name;
    }
}
