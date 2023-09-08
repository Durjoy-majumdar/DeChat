package com.tencent.p014mm.sdk.storage.sql;

import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0015\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bH\u0016¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/sql/NullOrEmptyCondition;", "Lcom/tencent/mm/sdk/storage/sql/SingleCondition;", "column", "", "(Ljava/lang/String;)V", "getColumn", "()Ljava/lang/String;", "params", "", "()[Ljava/lang/String;", "toSql", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.sdk.storage.sql.NullOrEmptyCondition */
public class NullOrEmptyCondition extends SingleCondition {
    private final String column;

    public NullOrEmptyCondition(String str) {
        C87412m.m108594g(str, "column");
        this.column = str;
    }

    public final String getColumn() {
        return this.column;
    }

    public String[] params() {
        return null;
    }

    public String toSql() {
        return this.column + " is null OR " + this.column + " = ''";
    }
}
