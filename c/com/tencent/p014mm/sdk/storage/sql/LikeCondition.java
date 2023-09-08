package com.tencent.p014mm.sdk.storage.sql;

import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0015\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rH\u0016¢\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0010"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/sql/LikeCondition;", "Lcom/tencent/mm/sdk/storage/sql/SingleCondition;", "column", "", "isNot", "", "likeValue", "(Ljava/lang/String;ZLjava/lang/String;)V", "getColumn", "()Ljava/lang/String;", "()Z", "getLikeValue", "params", "", "()[Ljava/lang/String;", "toSql", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.sdk.storage.sql.LikeCondition */
public class LikeCondition extends SingleCondition {
    private final String column;
    private final boolean isNot;
    private final String likeValue;

    public LikeCondition(String str, boolean z, String str2) {
        C87412m.m108594g(str, "column");
        C87412m.m108594g(str2, "likeValue");
        this.column = str;
        this.isNot = z;
        this.likeValue = str2;
    }

    public final String getColumn() {
        return this.column;
    }

    public final String getLikeValue() {
        return this.likeValue;
    }

    public final boolean isNot() {
        return this.isNot;
    }

    public String[] params() {
        return null;
    }

    public String toSql() {
        if (this.isNot) {
            return this.column + " NOT LIKE " + this.likeValue;
        }
        return this.column + " LIKE " + this.likeValue;
    }
}
