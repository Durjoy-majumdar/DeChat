package com.tencent.p014mm.sdk.storage.sql;

import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0010B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\b\u0010\u000f\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0011"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/sql/DeleteSql;", "Lcom/tencent/mm/sdk/storage/sql/SqlObj;", "table", "", "whereSql", "params", "", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V", "getTable", "()Ljava/lang/String;", "getWhereSql", "run", "", "db", "Lcom/tencent/mm/sdk/storage/ISQLiteDatabase;", "toSql", "Builder", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.sdk.storage.sql.DeleteSql */
public final class DeleteSql extends SqlObj {
    private final String table;
    private final String whereSql;

    @Metadata(mo182093d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\bJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/sql/DeleteSql$Builder;", "", "table", "Lcom/tencent/mm/sdk/storage/sql/Table;", "(Lcom/tencent/mm/sdk/storage/sql/Table;)V", "condition", "Lcom/tencent/mm/sdk/storage/sql/ISqlCondition;", "logTag", "", "getTable", "()Lcom/tencent/mm/sdk/storage/sql/Table;", "build", "Lcom/tencent/mm/sdk/storage/sql/DeleteSql;", "log", "tag", "where", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.storage.sql.DeleteSql$Builder */
    public static final class Builder {
        private ISqlCondition condition;
        private String logTag;
        private final Table table;

        public Builder(Table table2) {
            C87412m.m108594g(table2, "table");
            this.table = table2;
        }

        public final DeleteSql build() {
            Table table2 = this.table;
            if (!(table2 instanceof MultiTable)) {
                String sql = table2.toSql();
                ISqlCondition iSqlCondition = this.condition;
                String[] strArr = null;
                String sql2 = iSqlCondition != null ? iSqlCondition.toSql() : null;
                ISqlCondition iSqlCondition2 = this.condition;
                if (iSqlCondition2 != null) {
                    strArr = iSqlCondition2.params();
                }
                return new DeleteSql(sql, sql2, strArr);
            }
            throw new IllegalArgumentException("Not support multi table delete");
        }

        public final Table getTable() {
            return this.table;
        }

        public final Builder log(String str) {
            C87412m.m108594g(str, "tag");
            this.logTag = str;
            return this;
        }

        public final Builder where(ISqlCondition iSqlCondition) {
            C87412m.m108594g(iSqlCondition, "condition");
            this.condition = iSqlCondition;
            return this;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeleteSql(String str, String str2, String[] strArr) {
        super("", strArr);
        C87412m.m108594g(str, "table");
        this.table = str;
        this.whereSql = str2;
    }

    public final String getTable() {
        return this.table;
    }

    public final String getWhereSql() {
        return this.whereSql;
    }

    public final int run(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase != null) {
            return iSQLiteDatabase.delete(this.table, this.whereSql, params());
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r0 == null) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toSql() {
        /*
            r3 = this;
            java.lang.String r0 = r3.whereSql
            if (r0 == 0) goto L_0x0025
            boolean r1 = z04.C112551y.m153811k(r0)
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x000d
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x0025
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = " WHERE "
            r0.append(r1)
            java.lang.String r1 = r3.whereSql
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L_0x0027
        L_0x0025:
            java.lang.String r0 = ""
        L_0x0027:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "DELETE FROM "
            r1.append(r2)
            java.lang.String r2 = r3.table
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.storage.sql.DeleteSql.toSql():java.lang.String");
    }
}
