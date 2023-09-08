package com.tencent.p014mm.sdk.storage.sql;

import android.content.ContentValues;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0014B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\b\u0010\u0013\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0015"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/sql/UpdateSql;", "Lcom/tencent/mm/sdk/storage/sql/SqlObj;", "table", "", "values", "Landroid/content/ContentValues;", "whereSql", "params", "", "(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)V", "getTable", "()Ljava/lang/String;", "getValues", "()Landroid/content/ContentValues;", "getWhereSql", "run", "", "db", "Lcom/tencent/mm/sdk/storage/ISQLiteDatabase;", "toSql", "Builder", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.sdk.storage.sql.UpdateSql */
public final class UpdateSql extends SqlObj {
    private final String table;
    private final ContentValues values;
    private final String whereSql;

    @Metadata(mo182093d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/sql/UpdateSql$Builder;", "", "table", "Lcom/tencent/mm/sdk/storage/sql/Table;", "values", "Landroid/content/ContentValues;", "(Lcom/tencent/mm/sdk/storage/sql/Table;Landroid/content/ContentValues;)V", "condition", "Lcom/tencent/mm/sdk/storage/sql/ISqlCondition;", "getTable", "()Lcom/tencent/mm/sdk/storage/sql/Table;", "getValues", "()Landroid/content/ContentValues;", "build", "Lcom/tencent/mm/sdk/storage/sql/UpdateSql;", "where", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.storage.sql.UpdateSql$Builder */
    public static final class Builder {
        private ISqlCondition condition;
        private final Table table;
        private final ContentValues values;

        public Builder(Table table2, ContentValues contentValues) {
            C87412m.m108594g(table2, "table");
            C87412m.m108594g(contentValues, "values");
            this.table = table2;
            this.values = contentValues;
        }

        public final UpdateSql build() {
            Table table2 = this.table;
            if (!(table2 instanceof MultiTable)) {
                String sql = table2.toSql();
                ContentValues contentValues = this.values;
                ISqlCondition iSqlCondition = this.condition;
                String[] strArr = null;
                String sql2 = iSqlCondition != null ? iSqlCondition.toSql() : null;
                ISqlCondition iSqlCondition2 = this.condition;
                if (iSqlCondition2 != null) {
                    strArr = iSqlCondition2.params();
                }
                return new UpdateSql(sql, contentValues, sql2, strArr);
            }
            throw new IllegalArgumentException("Not support multi table delete");
        }

        public final Table getTable() {
            return this.table;
        }

        public final ContentValues getValues() {
            return this.values;
        }

        public final Builder where(ISqlCondition iSqlCondition) {
            C87412m.m108594g(iSqlCondition, "condition");
            this.condition = iSqlCondition;
            return this;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdateSql(String str, ContentValues contentValues, String str2, String[] strArr) {
        super("", strArr);
        C87412m.m108594g(str, "table");
        C87412m.m108594g(contentValues, "values");
        this.table = str;
        this.values = contentValues;
        this.whereSql = str2;
    }

    public final String getTable() {
        return this.table;
    }

    public final ContentValues getValues() {
        return this.values;
    }

    public final String getWhereSql() {
        return this.whereSql;
    }

    public final int run(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase != null) {
            return iSQLiteDatabase.update(this.table, this.values, this.whereSql, params());
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0094, code lost:
        if (r1 == null) goto L_0x0096;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toSql() {
        /*
            r11 = this;
            android.content.ContentValues r0 = r11.values
            java.util.Set r0 = r0.keySet()
            java.lang.String r1 = "values.keySet()"
            gy3.C87412m.m108593f(r0, r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r1 = 10
            int r1 = sx3.C36907w.m41090l(r0, r1)
            r2.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L_0x001b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0063
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            android.content.ContentValues r3 = r11.values
            java.lang.Object r3 = r3.get(r1)
            boolean r4 = r3 instanceof java.lang.Number
            if (r4 == 0) goto L_0x0046
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r1 = " = "
            r4.append(r1)
            r4.append(r3)
            java.lang.String r1 = r4.toString()
            goto L_0x005f
        L_0x0046:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r1 = " = '"
            r4.append(r1)
            r4.append(r3)
            r1 = 39
            r4.append(r1)
            java.lang.String r1 = r4.toString()
        L_0x005f:
            r2.add(r1)
            goto L_0x001b
        L_0x0063:
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 62
            r10 = 0
            java.lang.String r3 = ", "
            java.lang.String r0 = sx3.C110818d0.m150921S(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.String r1 = r11.whereSql
            if (r1 == 0) goto L_0x0096
            boolean r2 = z04.C112551y.m153811k(r1)
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x007e
            goto L_0x007f
        L_0x007e:
            r1 = 0
        L_0x007f:
            if (r1 == 0) goto L_0x0096
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = " WHERE "
            r1.append(r2)
            java.lang.String r2 = r11.whereSql
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            if (r1 != 0) goto L_0x0098
        L_0x0096:
            java.lang.String r1 = ""
        L_0x0098:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "UPDATE "
            r2.append(r3)
            java.lang.String r3 = r11.table
            r2.append(r3)
            java.lang.String r3 = " SET "
            r2.append(r3)
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.storage.sql.UpdateSql.toSql():java.lang.String");
    }
}
