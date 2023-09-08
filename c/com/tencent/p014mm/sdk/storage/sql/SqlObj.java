package com.tencent.p014mm.sdk.storage.sql;

import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H\u0016¢\u0006\u0002\u0010\bJ\b\u0010\f\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016R\u001b\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/sql/SqlObj;", "Lcom/tencent/mm/sdk/storage/sql/ISqlObj;", "sql", "", "params", "", "(Ljava/lang/String;[Ljava/lang/String;)V", "getParams", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getSql", "()Ljava/lang/String;", "toSql", "toString", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.sdk.storage.sql.SqlObj */
public class SqlObj implements ISqlObj {
    private final String[] params;
    private final String sql;

    public SqlObj(String str, String[] strArr) {
        C87412m.m108594g(str, "sql");
        this.sql = str;
        this.params = strArr;
    }

    public final String[] getParams() {
        return this.params;
    }

    public final String getSql() {
        return this.sql;
    }

    public String[] params() {
        return this.params;
    }

    public String toSql() {
        return this.sql;
    }

    public String toString() {
        return "sql=" + this.sql + " params=" + this.params;
    }
}
