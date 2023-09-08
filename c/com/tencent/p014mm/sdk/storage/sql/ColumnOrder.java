package com.tencent.p014mm.sdk.storage.sql;

import com.tencent.p014mm.sdk.storage.sql.ISqlOrder;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\f"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/sql/ColumnOrder;", "Lcom/tencent/mm/sdk/storage/sql/ISqlOrder;", "column", "", "increase", "", "(Ljava/lang/String;Z)V", "getColumn", "()Ljava/lang/String;", "getIncrease", "()Z", "toSql", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.sdk.storage.sql.ColumnOrder */
public class ColumnOrder implements ISqlOrder {
    private final String column;
    private final boolean increase;

    public ColumnOrder(String str, boolean z) {
        C87412m.m108594g(str, "column");
        this.column = str;
        this.increase = z;
    }

    public final String getColumn() {
        return this.column;
    }

    public final boolean getIncrease() {
        return this.increase;
    }

    public String[] params() {
        return ISqlOrder.DefaultImpls.params(this);
    }

    public String toSql() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.column);
        sb.append(this.increase ? "" : " DESC");
        return sb.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ColumnOrder(String str, boolean z, int i, C8480h hVar) {
        this(str, (i & 2) != 0 ? true : z);
    }
}
