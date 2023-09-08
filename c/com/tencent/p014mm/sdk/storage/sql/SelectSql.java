package com.tencent.p014mm.sdk.storage.sql;

import android.database.Cursor;
import com.tencent.p014mm.sdk.storage.ISQLCancelable;
import com.tencent.p014mm.sdk.storage.sql.UnionSql;
import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import kotlin.Metadata;
import lu3.C34379c;
import sx3.C26236u;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0016\u0018\u0000 92\u00020\u0001:\u0003:9;B=\u0012\u0006\u00104\u001a\u00020#\u0012\u000e\u00106\u001a\n\u0012\u0004\u0012\u00020#\u0018\u000105\u0012\b\b\u0002\u0010*\u001a\u00020\u001d\u0012\b\b\u0002\u0010.\u001a\u00020\u0004\u0012\b\b\u0002\u00102\u001a\u00020\u0004¢\u0006\u0004\b7\u00108J\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0016\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0006H\u0002J\u0014\u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0002J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0000J1\u0010\u0017\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0014*\u00020\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015¢\u0006\u0004\b\u0017\u0010\u0018J.\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019\"\b\b\u0000\u0010\u0014*\u00020\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015J\u0010\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u001e\u001a\u00020\u001d2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010 \u001a\u00020\u001f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\"\u001a\u00020!2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0012\u0010$\u001a\u0004\u0018\u00010#2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00192\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00192\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00192\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020#0\u00192\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010)\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0017\u0010*\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010.\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u00102\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u00101¨\u0006<"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/sql/SelectSql;", "Lcom/tencent/mm/sdk/storage/sql/SqlObj;", "Lcom/tencent/mm/sdk/storage/ISQLiteDatabase;", "db", "", "singleResult", "Landroid/database/Cursor;", "executeRawQuery", "cursor", "Llu3/c;", "tickTimeout", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "Lrx3/b0;", "handleTimeoutException", "selectSql", "Lcom/tencent/mm/sdk/storage/sql/UnionSql$Builder;", "union", "Lcom/tencent/mm/sdk/storage/IAutoDBItem;", "T", "Ljava/lang/Class;", "clazz", "singleQuery", "(Lcom/tencent/mm/sdk/storage/ISQLiteDatabase;Ljava/lang/Class;)Lcom/tencent/mm/sdk/storage/IAutoDBItem;", "", "multiQuery", "", "singleInt", "", "singleLong", "", "singleFloat", "", "singleDouble", "", "singleString", "multiInt", "multiLong", "multiFloat", "multiString", "isExist", "timeout", "J", "getTimeout", "()J", "existLimitOrFunctionColumnCondition", "Z", "getExistLimitOrFunctionColumnCondition", "()Z", "explainQueryPlan", "getExplainQueryPlan", "sql", "", "params", "<init>", "(Ljava/lang/String;[Ljava/lang/String;JZZ)V", "Companion", "Builder", "Limit", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.storage.sql.SelectSql */
public class SelectSql extends SqlObj {
    public static final Companion Companion = new Companion((C8480h) null);
    public static final String TAG = "MicroMsg.Sql.SelectSql";
    private final boolean existLimitOrFunctionColumnCondition;
    private final boolean explainQueryPlan;
    private final long timeout;

    @Metadata(mo182093d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/sql/SelectSql$Limit;", "", "limit", "", "offset", "(II)V", "getLimit", "()I", "getOffset", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.storage.sql.SelectSql$Limit */
    public static final class Limit {
        private final int limit;
        private final int offset;

        public Limit(int i, int i2) {
            this.limit = i;
            this.offset = i2;
        }

        public static /* synthetic */ Limit copy$default(Limit limit2, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = limit2.limit;
            }
            if ((i3 & 2) != 0) {
                i2 = limit2.offset;
            }
            return limit2.copy(i, i2);
        }

        public final int component1() {
            return this.limit;
        }

        public final int component2() {
            return this.offset;
        }

        public final Limit copy(int i, int i2) {
            return new Limit(i, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Limit)) {
                return false;
            }
            Limit limit2 = (Limit) obj;
            return this.limit == limit2.limit && this.offset == limit2.offset;
        }

        public final int getLimit() {
            return this.limit;
        }

        public final int getOffset() {
            return this.offset;
        }

        public int hashCode() {
            return (this.limit * 31) + this.offset;
        }

        public String toString() {
            return "Limit(limit=" + this.limit + ", offset=" + this.offset + ')';
        }
    }

    @Metadata(mo182093d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u000fJ\u0014\u0010\u000e\u001a\u00020\u00002\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0005J\u0016\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eJ\u000e\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0013J\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0015J\u0014\u0010\"\u001a\u00020\u00002\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0005J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0019J\u0010\u0010$\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/sql/SelectSql$Builder;", "", "table", "Lcom/tencent/mm/sdk/storage/sql/Table;", "columns", "", "Lcom/tencent/mm/sdk/storage/sql/ISqlColumn;", "(Lcom/tencent/mm/sdk/storage/sql/Table;Ljava/util/List;)V", "getColumns", "()Ljava/util/List;", "condition", "Lcom/tencent/mm/sdk/storage/sql/ISqlCondition;", "explainQueryPlan", "", "groupBy", "Lcom/tencent/mm/sdk/storage/sql/Column;", "limit", "Lcom/tencent/mm/sdk/storage/sql/SelectSql$Limit;", "logTag", "", "orders", "Lcom/tencent/mm/sdk/storage/sql/ISqlOrder;", "getTable", "()Lcom/tencent/mm/sdk/storage/sql/Table;", "timeout", "", "build", "Lcom/tencent/mm/sdk/storage/sql/SelectSql;", "column", "groupByColumns", "", "offset", "log", "tag", "orderBy", "order", "where", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.storage.sql.SelectSql$Builder */
    public static final class Builder {
        private final List<ISqlColumn> columns;
        private ISqlCondition condition;
        private boolean explainQueryPlan;
        private List<? extends Column> groupBy;
        private Limit limit;
        private String logTag;
        private List<? extends ISqlOrder> orders;
        private final Table table;
        private long timeout = -1;

        public Builder(Table table2, List<? extends ISqlColumn> list) {
            C87412m.m108594g(table2, "table");
            C87412m.m108594g(list, "columns");
            this.table = table2;
            this.columns = list;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0077, code lost:
            if (r4 == null) goto L_0x0079;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x00ad, code lost:
            if (r6 == null) goto L_0x00af;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e2, code lost:
            if (r9 == null) goto L_0x00e4;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.tencent.p014mm.sdk.storage.sql.SelectSql build() {
            /*
                r20 = this;
                r0 = r20
                gy3.a0 r1 = new gy3.a0
                r1.<init>()
                java.util.List<com.tencent.mm.sdk.storage.sql.ISqlColumn> r2 = r0.columns
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L_0x0020
                com.tencent.mm.sdk.storage.sql.Table r2 = r0.table
                boolean r2 = r2 instanceof com.tencent.p014mm.sdk.storage.sql.SingleTable
                if (r2 == 0) goto L_0x0018
                java.lang.String r2 = "SELECT rowid, *"
                goto L_0x0045
            L_0x0018:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Not support multi table select all"
                r1.<init>(r2)
                throw r1
            L_0x0020:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "SELECT "
                r2.append(r3)
                java.util.List<com.tencent.mm.sdk.storage.sql.ISqlColumn> r4 = r0.columns
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                com.tencent.mm.sdk.storage.sql.SelectSql$Builder$build$selectClause$1 r10 = new com.tencent.mm.sdk.storage.sql.SelectSql$Builder$build$selectClause$1
                r10.<init>(r1)
                r11 = 30
                r12 = 0
                java.lang.String r5 = ", "
                java.lang.String r3 = sx3.C110818d0.m150921S(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
            L_0x0045:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = " FROM "
                r3.append(r4)
                com.tencent.mm.sdk.storage.sql.Table r4 = r0.table
                java.lang.String r4 = r4.toSql()
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                com.tencent.mm.sdk.storage.sql.ISqlCondition r4 = r0.condition
                java.lang.String r5 = ""
                if (r4 == 0) goto L_0x0079
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = " WHERE "
                r6.append(r7)
                java.lang.String r4 = r4.toSql()
                r6.append(r4)
                java.lang.String r4 = r6.toString()
                if (r4 != 0) goto L_0x007a
            L_0x0079:
                r4 = r5
            L_0x007a:
                java.util.List<? extends com.tencent.mm.sdk.storage.sql.Column> r6 = r0.groupBy
                r7 = 0
                r8 = 1
                if (r6 == 0) goto L_0x00af
                boolean r9 = r6.isEmpty()
                r9 = r9 ^ r8
                if (r9 == 0) goto L_0x0089
                r10 = r6
                goto L_0x008a
            L_0x0089:
                r10 = r7
            L_0x008a:
                if (r10 == 0) goto L_0x00af
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r9 = " GROUP BY "
                r6.append(r9)
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                com.tencent.mm.sdk.storage.sql.SelectSql$Builder$build$groupByClause$2$1 r16 = com.tencent.p014mm.sdk.storage.sql.SelectSql$Builder$build$groupByClause$2$1.INSTANCE
                r17 = 30
                r18 = 0
                java.lang.String r11 = ", "
                java.lang.String r9 = sx3.C110818d0.m150921S(r10, r11, r12, r13, r14, r15, r16, r17, r18)
                r6.append(r9)
                java.lang.String r6 = r6.toString()
                if (r6 != 0) goto L_0x00b0
            L_0x00af:
                r6 = r5
            L_0x00b0:
                java.util.List<? extends com.tencent.mm.sdk.storage.sql.ISqlOrder> r9 = r0.orders
                if (r9 == 0) goto L_0x00e4
                boolean r10 = r9.isEmpty()
                r10 = r10 ^ r8
                if (r10 == 0) goto L_0x00bd
                r11 = r9
                goto L_0x00be
            L_0x00bd:
                r11 = r7
            L_0x00be:
                if (r11 == 0) goto L_0x00e4
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = " ORDER BY "
                r9.append(r10)
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                com.tencent.mm.sdk.storage.sql.SelectSql$Builder$build$orderClause$2$1 r17 = com.tencent.p014mm.sdk.storage.sql.SelectSql$Builder$build$orderClause$2$1.INSTANCE
                r18 = 30
                r19 = 0
                java.lang.String r12 = ", "
                java.lang.String r10 = sx3.C110818d0.m150921S(r11, r12, r13, r14, r15, r16, r17, r18, r19)
                r9.append(r10)
                java.lang.String r9 = r9.toString()
                if (r9 != 0) goto L_0x00e5
            L_0x00e4:
                r9 = r5
            L_0x00e5:
                com.tencent.mm.sdk.storage.sql.SelectSql$Limit r10 = r0.limit
                if (r10 == 0) goto L_0x010e
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r12 = " LIMIT "
                r11.append(r12)
                int r12 = r10.getLimit()
                r11.append(r12)
                java.lang.String r12 = " OFFSET "
                r11.append(r12)
                int r10 = r10.getOffset()
                r11.append(r10)
                java.lang.String r10 = r11.toString()
                if (r10 != 0) goto L_0x010d
                goto L_0x010e
            L_0x010d:
                r5 = r10
            L_0x010e:
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r10.append(r2)
                r10.append(r3)
                r10.append(r4)
                r10.append(r6)
                r10.append(r9)
                r10.append(r5)
                java.lang.String r12 = r10.toString()
                java.lang.String r2 = r0.logTag
                r3 = 0
                if (r2 == 0) goto L_0x0167
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r6 = "SelectSql.Builder: sql="
                r4.append(r6)
                r4.append(r12)
                java.lang.String r6 = " params="
                r4.append(r6)
                com.tencent.mm.sdk.storage.sql.ISqlCondition r6 = r0.condition
                if (r6 == 0) goto L_0x015c
                java.lang.String[] r6 = r6.params()
                if (r6 == 0) goto L_0x015c
                java.util.ArrayList r9 = new java.util.ArrayList
                int r10 = r6.length
                r9.<init>(r10)
                int r10 = r6.length
                r11 = 0
            L_0x0152:
                if (r11 >= r10) goto L_0x015d
                r13 = r6[r11]
                r9.add(r13)
                int r11 = r11 + 1
                goto L_0x0152
            L_0x015c:
                r9 = r7
            L_0x015d:
                r4.append(r9)
                java.lang.String r4 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            L_0x0167:
                com.tencent.mm.sdk.storage.sql.SelectSql r2 = new com.tencent.mm.sdk.storage.sql.SelectSql
                com.tencent.mm.sdk.storage.sql.ISqlCondition r4 = r0.condition
                if (r4 == 0) goto L_0x0171
                java.lang.String[] r7 = r4.params()
            L_0x0171:
                r13 = r7
                long r14 = r0.timeout
                boolean r4 = z04.C112551y.m153811k(r5)
                r4 = r4 ^ r8
                if (r4 != 0) goto L_0x0183
                boolean r1 = r1.f27482d
                if (r1 == 0) goto L_0x0180
                goto L_0x0183
            L_0x0180:
                r16 = 0
                goto L_0x0185
            L_0x0183:
                r16 = 1
            L_0x0185:
                boolean r1 = r0.explainQueryPlan
                r11 = r2
                r17 = r1
                r11.<init>(r12, r13, r14, r16, r17)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.storage.sql.SelectSql.Builder.build():com.tencent.mm.sdk.storage.sql.SelectSql");
        }

        public final Builder explainQueryPlan(boolean z) {
            this.explainQueryPlan = z;
            return this;
        }

        public final List<ISqlColumn> getColumns() {
            return this.columns;
        }

        public final Table getTable() {
            return this.table;
        }

        public final Builder groupBy(List<? extends Column> list) {
            C87412m.m108594g(list, "groupByColumns");
            this.groupBy = list;
            return this;
        }

        public final Builder limit(int i, int i2) {
            this.limit = new Limit(i, i2);
            return this;
        }

        public final Builder log(String str) {
            C87412m.m108594g(str, "tag");
            this.logTag = str;
            return this;
        }

        public final Builder orderBy(List<? extends ISqlOrder> list) {
            C87412m.m108594g(list, "orders");
            this.orders = list;
            return this;
        }

        public final Builder timeout(long j) {
            this.timeout = j;
            return this;
        }

        public final Builder where(ISqlCondition iSqlCondition) {
            this.condition = iSqlCondition;
            return this;
        }

        public final Builder groupBy(Column column) {
            C87412m.m108594g(column, "column");
            this.groupBy = C26236u.m33719b(column);
            return this;
        }

        public final Builder orderBy(ISqlOrder iSqlOrder) {
            C87412m.m108594g(iSqlOrder, "order");
            this.orders = C26236u.m33719b(iSqlOrder);
            return this;
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/sql/SelectSql$Companion;", "", "()V", "TAG", "", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.storage.sql.SelectSql$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SelectSql(String str, String[] strArr, long j, boolean z, boolean z2, int i, C8480h hVar) {
        this(str, strArr, (i & 4) != 0 ? -1 : j, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00bb, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00bc, code lost:
        cy3.C58003b.m67160a(r3, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00bf, code lost:
        throw r11;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.database.Cursor executeRawQuery(com.tencent.p014mm.sdk.storage.ISQLiteDatabase r10, boolean r11) {
        /*
            r9 = this;
            java.lang.String r0 = "MicroMsg.Sql.SelectSql"
            boolean r1 = r9.existLimitOrFunctionColumnCondition
            if (r1 != 0) goto L_0x001e
            if (r11 == 0) goto L_0x001e
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r1 = r9.toSql()
            r11.append(r1)
            java.lang.String r1 = " LIMIT 1"
            r11.append(r1)
            java.lang.String r11 = r11.toString()
            goto L_0x0022
        L_0x001e:
            java.lang.String r11 = r9.toSql()
        L_0x0022:
            boolean r1 = r9.explainQueryPlan
            r2 = 0
            if (r1 == 0) goto L_0x00c0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "EXPLAIN QUERY PLAN "
            r1.append(r3)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            if (r10 == 0) goto L_0x00c0
            java.lang.String[] r3 = r9.params()
            android.database.Cursor r3 = r10.rawQuery(r1, r3)
            if (r3 == 0) goto L_0x00c0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b9 }
            r4.<init>()     // Catch:{ all -> 0x00b9 }
            java.lang.String r5 = "explainQueryPlanSql: "
            r4.append(r5)     // Catch:{ all -> 0x00b9 }
            r4.append(r1)     // Catch:{ all -> 0x00b9 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x00b9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ all -> 0x00b9 }
        L_0x0058:
            boolean r1 = r3.moveToNext()     // Catch:{ all -> 0x00b9 }
            if (r1 == 0) goto L_0x00b3
            java.lang.String r1 = "id"
            int r1 = r3.getColumnIndex(r1)     // Catch:{ all -> 0x00b9 }
            java.lang.String r4 = "parent"
            int r4 = r3.getColumnIndex(r4)     // Catch:{ all -> 0x00b9 }
            java.lang.String r5 = "notused"
            int r5 = r3.getColumnIndex(r5)     // Catch:{ all -> 0x00b9 }
            java.lang.String r6 = "detail"
            int r6 = r3.getColumnIndex(r6)     // Catch:{ all -> 0x00b9 }
            int r1 = r3.getInt(r1)     // Catch:{ all -> 0x00b9 }
            int r4 = r3.getInt(r4)     // Catch:{ all -> 0x00b9 }
            int r5 = r3.getInt(r5)     // Catch:{ all -> 0x00b9 }
            java.lang.String r6 = r3.getString(r6)     // Catch:{ all -> 0x00b9 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b9 }
            r7.<init>()     // Catch:{ all -> 0x00b9 }
            java.lang.String r8 = "===== selectId:"
            r7.append(r8)     // Catch:{ all -> 0x00b9 }
            r7.append(r1)     // Catch:{ all -> 0x00b9 }
            java.lang.String r1 = " order:"
            r7.append(r1)     // Catch:{ all -> 0x00b9 }
            r7.append(r4)     // Catch:{ all -> 0x00b9 }
            java.lang.String r1 = " from:"
            r7.append(r1)     // Catch:{ all -> 0x00b9 }
            r7.append(r5)     // Catch:{ all -> 0x00b9 }
            java.lang.String r1 = " detail:"
            r7.append(r1)     // Catch:{ all -> 0x00b9 }
            r7.append(r6)     // Catch:{ all -> 0x00b9 }
            java.lang.String r1 = r7.toString()     // Catch:{ all -> 0x00b9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ all -> 0x00b9 }
            goto L_0x0058
        L_0x00b3:
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00b9 }
            cy3.C58003b.m67160a(r3, r2)
            goto L_0x00c0
        L_0x00b9:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x00bb }
        L_0x00bb:
            r11 = move-exception
            cy3.C58003b.m67160a(r3, r10)
            throw r11
        L_0x00c0:
            long r0 = r9.timeout
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x00d3
            if (r10 == 0) goto L_0x00dd
            java.lang.String[] r0 = r9.params()
            android.database.Cursor r2 = r10.rawQueryWithCancel(r11, r0)
            goto L_0x00dd
        L_0x00d3:
            if (r10 == 0) goto L_0x00dd
            java.lang.String[] r0 = r9.params()
            android.database.Cursor r2 = r10.rawQuery(r11, r0)
        L_0x00dd:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.storage.sql.SelectSql.executeRawQuery(com.tencent.mm.sdk.storage.ISQLiteDatabase, boolean):android.database.Cursor");
    }

    private final void handleTimeoutException(Exception exc) {
        if (C87412m.m108589b(exc.getClass().getSimpleName(), "OperationCanceledException")) {
            throw new SQLTimeoutException("SQLTimeoutException SQL:" + toSql() + " Timeout:" + this.timeout, exc);
        }
        throw exc;
    }

    private final C34379c<?> tickTimeout(Cursor cursor) {
        if (!(cursor instanceof ISQLCancelable)) {
            return null;
        }
        return ((C119157j) C119157j.f356862d).mo183878i(new SelectSql$tickTimeout$futureTask$1(cursor), this.timeout);
    }

    public final boolean getExistLimitOrFunctionColumnCondition() {
        return this.existLimitOrFunctionColumnCondition;
    }

    public final boolean getExplainQueryPlan() {
        return this.explainQueryPlan;
    }

    public final long getTimeout() {
        return this.timeout;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
        r6 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001a, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001c, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001d, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0026, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        cy3.C58003b.m67160a(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x002a, code lost:
        throw r3;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:8:0x0010, B:20:0x0025] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isExist(com.tencent.p014mm.sdk.storage.ISQLiteDatabase r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = 1
            android.database.Cursor r6 = r5.executeRawQuery(r6, r1)     // Catch:{ Exception -> 0x002d }
            if (r6 == 0) goto L_0x0036
            lu3.c r2 = r5.tickTimeout(r6)     // Catch:{ all -> 0x0021 }
            boolean r3 = r6.moveToFirst()     // Catch:{ all -> 0x001f }
            cy3.C58003b.m67160a(r6, r0)     // Catch:{ Exception -> 0x001c, all -> 0x0019 }
            if (r2 == 0) goto L_0x0018
            r2.cancel(r1)
        L_0x0018:
            return r3
        L_0x0019:
            r6 = move-exception
            r0 = r2
            goto L_0x0038
        L_0x001c:
            r6 = move-exception
            r0 = r2
            goto L_0x002e
        L_0x001f:
            r0 = move-exception
            goto L_0x0025
        L_0x0021:
            r2 = move-exception
            r4 = r2
            r2 = r0
            r0 = r4
        L_0x0025:
            throw r0     // Catch:{ all -> 0x0026 }
        L_0x0026:
            r3 = move-exception
            cy3.C58003b.m67160a(r6, r0)     // Catch:{ Exception -> 0x001c, all -> 0x0019 }
            throw r3     // Catch:{ Exception -> 0x001c, all -> 0x0019 }
        L_0x002b:
            r6 = move-exception
            goto L_0x0038
        L_0x002d:
            r6 = move-exception
        L_0x002e:
            r5.handleTimeoutException(r6)     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0036
            r0.cancel(r1)
        L_0x0036:
            r6 = 0
            return r6
        L_0x0038:
            if (r0 == 0) goto L_0x003d
            r0.cancel(r1)
        L_0x003d:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.storage.sql.SelectSql.isExist(com.tencent.mm.sdk.storage.ISQLiteDatabase):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003b, code lost:
        if (r2 != null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003d, code lost:
        r2.cancel(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0047, code lost:
        if (r2 != null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x004a, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.Float> multiFloat(com.tencent.p014mm.sdk.storage.ISQLiteDatabase r7) {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = 0
            r3 = 1
            android.database.Cursor r7 = r6.executeRawQuery(r7, r1)     // Catch:{ Exception -> 0x0043 }
            if (r7 == 0) goto L_0x003b
            lu3.c r4 = r6.tickTimeout(r7)     // Catch:{ all -> 0x0034 }
        L_0x0012:
            boolean r5 = r7.moveToNext()     // Catch:{ all -> 0x0031 }
            if (r5 == 0) goto L_0x0024
            float r5 = r7.getFloat(r1)     // Catch:{ all -> 0x0031 }
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch:{ all -> 0x0031 }
            r0.add(r5)     // Catch:{ all -> 0x0031 }
            goto L_0x0012
        L_0x0024:
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0031 }
            cy3.C58003b.m67160a(r7, r2)     // Catch:{ Exception -> 0x002e, all -> 0x002b }
            r2 = r4
            goto L_0x003b
        L_0x002b:
            r7 = move-exception
            r2 = r4
            goto L_0x004b
        L_0x002e:
            r7 = move-exception
            r2 = r4
            goto L_0x0044
        L_0x0031:
            r1 = move-exception
            r2 = r4
            goto L_0x0035
        L_0x0034:
            r1 = move-exception
        L_0x0035:
            throw r1     // Catch:{ all -> 0x0036 }
        L_0x0036:
            r4 = move-exception
            cy3.C58003b.m67160a(r7, r1)     // Catch:{ Exception -> 0x0043 }
            throw r4     // Catch:{ Exception -> 0x0043 }
        L_0x003b:
            if (r2 == 0) goto L_0x004a
        L_0x003d:
            r2.cancel(r3)
            goto L_0x004a
        L_0x0041:
            r7 = move-exception
            goto L_0x004b
        L_0x0043:
            r7 = move-exception
        L_0x0044:
            r6.handleTimeoutException(r7)     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x004a
            goto L_0x003d
        L_0x004a:
            return r0
        L_0x004b:
            if (r2 == 0) goto L_0x0050
            r2.cancel(r3)
        L_0x0050:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.storage.sql.SelectSql.multiFloat(com.tencent.mm.sdk.storage.ISQLiteDatabase):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003b, code lost:
        if (r2 != null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003d, code lost:
        r2.cancel(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0047, code lost:
        if (r2 != null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x004a, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.Integer> multiInt(com.tencent.p014mm.sdk.storage.ISQLiteDatabase r7) {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = 0
            r3 = 1
            android.database.Cursor r7 = r6.executeRawQuery(r7, r1)     // Catch:{ Exception -> 0x0043 }
            if (r7 == 0) goto L_0x003b
            lu3.c r4 = r6.tickTimeout(r7)     // Catch:{ all -> 0x0034 }
        L_0x0012:
            boolean r5 = r7.moveToNext()     // Catch:{ all -> 0x0031 }
            if (r5 == 0) goto L_0x0024
            int r5 = r7.getInt(r1)     // Catch:{ all -> 0x0031 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0031 }
            r0.add(r5)     // Catch:{ all -> 0x0031 }
            goto L_0x0012
        L_0x0024:
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0031 }
            cy3.C58003b.m67160a(r7, r2)     // Catch:{ Exception -> 0x002e, all -> 0x002b }
            r2 = r4
            goto L_0x003b
        L_0x002b:
            r7 = move-exception
            r2 = r4
            goto L_0x004b
        L_0x002e:
            r7 = move-exception
            r2 = r4
            goto L_0x0044
        L_0x0031:
            r1 = move-exception
            r2 = r4
            goto L_0x0035
        L_0x0034:
            r1 = move-exception
        L_0x0035:
            throw r1     // Catch:{ all -> 0x0036 }
        L_0x0036:
            r4 = move-exception
            cy3.C58003b.m67160a(r7, r1)     // Catch:{ Exception -> 0x0043 }
            throw r4     // Catch:{ Exception -> 0x0043 }
        L_0x003b:
            if (r2 == 0) goto L_0x004a
        L_0x003d:
            r2.cancel(r3)
            goto L_0x004a
        L_0x0041:
            r7 = move-exception
            goto L_0x004b
        L_0x0043:
            r7 = move-exception
        L_0x0044:
            r6.handleTimeoutException(r7)     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x004a
            goto L_0x003d
        L_0x004a:
            return r0
        L_0x004b:
            if (r2 == 0) goto L_0x0050
            r2.cancel(r3)
        L_0x0050:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.storage.sql.SelectSql.multiInt(com.tencent.mm.sdk.storage.ISQLiteDatabase):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003b, code lost:
        if (r2 != null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003d, code lost:
        r2.cancel(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0047, code lost:
        if (r2 != null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x004a, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.Long> multiLong(com.tencent.p014mm.sdk.storage.ISQLiteDatabase r8) {
        /*
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = 0
            r3 = 1
            android.database.Cursor r8 = r7.executeRawQuery(r8, r1)     // Catch:{ Exception -> 0x0043 }
            if (r8 == 0) goto L_0x003b
            lu3.c r4 = r7.tickTimeout(r8)     // Catch:{ all -> 0x0034 }
        L_0x0012:
            boolean r5 = r8.moveToNext()     // Catch:{ all -> 0x0031 }
            if (r5 == 0) goto L_0x0024
            long r5 = r8.getLong(r1)     // Catch:{ all -> 0x0031 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0031 }
            r0.add(r5)     // Catch:{ all -> 0x0031 }
            goto L_0x0012
        L_0x0024:
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0031 }
            cy3.C58003b.m67160a(r8, r2)     // Catch:{ Exception -> 0x002e, all -> 0x002b }
            r2 = r4
            goto L_0x003b
        L_0x002b:
            r8 = move-exception
            r2 = r4
            goto L_0x004b
        L_0x002e:
            r8 = move-exception
            r2 = r4
            goto L_0x0044
        L_0x0031:
            r1 = move-exception
            r2 = r4
            goto L_0x0035
        L_0x0034:
            r1 = move-exception
        L_0x0035:
            throw r1     // Catch:{ all -> 0x0036 }
        L_0x0036:
            r4 = move-exception
            cy3.C58003b.m67160a(r8, r1)     // Catch:{ Exception -> 0x0043 }
            throw r4     // Catch:{ Exception -> 0x0043 }
        L_0x003b:
            if (r2 == 0) goto L_0x004a
        L_0x003d:
            r2.cancel(r3)
            goto L_0x004a
        L_0x0041:
            r8 = move-exception
            goto L_0x004b
        L_0x0043:
            r8 = move-exception
        L_0x0044:
            r7.handleTimeoutException(r8)     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x004a
            goto L_0x003d
        L_0x004a:
            return r0
        L_0x004b:
            if (r2 == 0) goto L_0x0050
            r2.cancel(r3)
        L_0x0050:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.storage.sql.SelectSql.multiLong(com.tencent.mm.sdk.storage.ISQLiteDatabase):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0041, code lost:
        if (r2 != null) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0043, code lost:
        r2.cancel(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x004d, code lost:
        if (r2 != null) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0050, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T extends com.tencent.p014mm.sdk.storage.IAutoDBItem> java.util.List<T> multiQuery(com.tencent.p014mm.sdk.storage.ISQLiteDatabase r6, java.lang.Class<T> r7) {
        /*
            r5 = this;
            java.lang.String r0 = "clazz"
            gy3.C87412m.m108594g(r7, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = 0
            r3 = 1
            android.database.Cursor r6 = r5.executeRawQuery(r6, r1)     // Catch:{ Exception -> 0x0049 }
            if (r6 == 0) goto L_0x0041
            lu3.c r1 = r5.tickTimeout(r6)     // Catch:{ all -> 0x003a }
        L_0x0017:
            boolean r4 = r6.moveToNext()     // Catch:{ all -> 0x0037 }
            if (r4 == 0) goto L_0x002a
            java.lang.Object r4 = r7.newInstance()     // Catch:{ all -> 0x0037 }
            com.tencent.mm.sdk.storage.IAutoDBItem r4 = (com.tencent.p014mm.sdk.storage.IAutoDBItem) r4     // Catch:{ all -> 0x0037 }
            r4.convertFrom(r6)     // Catch:{ all -> 0x0037 }
            r0.add(r4)     // Catch:{ all -> 0x0037 }
            goto L_0x0017
        L_0x002a:
            rx3.b0 r7 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0037 }
            cy3.C58003b.m67160a(r6, r2)     // Catch:{ Exception -> 0x0034, all -> 0x0031 }
            r2 = r1
            goto L_0x0041
        L_0x0031:
            r6 = move-exception
            r2 = r1
            goto L_0x0051
        L_0x0034:
            r6 = move-exception
            r2 = r1
            goto L_0x004a
        L_0x0037:
            r7 = move-exception
            r2 = r1
            goto L_0x003b
        L_0x003a:
            r7 = move-exception
        L_0x003b:
            throw r7     // Catch:{ all -> 0x003c }
        L_0x003c:
            r1 = move-exception
            cy3.C58003b.m67160a(r6, r7)     // Catch:{ Exception -> 0x0049 }
            throw r1     // Catch:{ Exception -> 0x0049 }
        L_0x0041:
            if (r2 == 0) goto L_0x0050
        L_0x0043:
            r2.cancel(r3)
            goto L_0x0050
        L_0x0047:
            r6 = move-exception
            goto L_0x0051
        L_0x0049:
            r6 = move-exception
        L_0x004a:
            r5.handleTimeoutException(r6)     // Catch:{ all -> 0x0047 }
            if (r2 == 0) goto L_0x0050
            goto L_0x0043
        L_0x0050:
            return r0
        L_0x0051:
            if (r2 == 0) goto L_0x0056
            r2.cancel(r3)
        L_0x0056:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.storage.sql.SelectSql.multiQuery(com.tencent.mm.sdk.storage.ISQLiteDatabase, java.lang.Class):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0037, code lost:
        if (r2 != null) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0039, code lost:
        r2.cancel(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0043, code lost:
        if (r2 != null) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0046, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.String> multiString(com.tencent.p014mm.sdk.storage.ISQLiteDatabase r7) {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = 0
            r3 = 1
            android.database.Cursor r7 = r6.executeRawQuery(r7, r1)     // Catch:{ Exception -> 0x003f }
            if (r7 == 0) goto L_0x0037
            lu3.c r4 = r6.tickTimeout(r7)     // Catch:{ all -> 0x0030 }
        L_0x0012:
            boolean r5 = r7.moveToNext()     // Catch:{ all -> 0x002d }
            if (r5 == 0) goto L_0x0020
            java.lang.String r5 = r7.getString(r1)     // Catch:{ all -> 0x002d }
            r0.add(r5)     // Catch:{ all -> 0x002d }
            goto L_0x0012
        L_0x0020:
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x002d }
            cy3.C58003b.m67160a(r7, r2)     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
            r2 = r4
            goto L_0x0037
        L_0x0027:
            r7 = move-exception
            r2 = r4
            goto L_0x0047
        L_0x002a:
            r7 = move-exception
            r2 = r4
            goto L_0x0040
        L_0x002d:
            r1 = move-exception
            r2 = r4
            goto L_0x0031
        L_0x0030:
            r1 = move-exception
        L_0x0031:
            throw r1     // Catch:{ all -> 0x0032 }
        L_0x0032:
            r4 = move-exception
            cy3.C58003b.m67160a(r7, r1)     // Catch:{ Exception -> 0x003f }
            throw r4     // Catch:{ Exception -> 0x003f }
        L_0x0037:
            if (r2 == 0) goto L_0x0046
        L_0x0039:
            r2.cancel(r3)
            goto L_0x0046
        L_0x003d:
            r7 = move-exception
            goto L_0x0047
        L_0x003f:
            r7 = move-exception
        L_0x0040:
            r6.handleTimeoutException(r7)     // Catch:{ all -> 0x003d }
            if (r2 == 0) goto L_0x0046
            goto L_0x0039
        L_0x0046:
            return r0
        L_0x0047:
            if (r2 == 0) goto L_0x004c
            r2.cancel(r3)
        L_0x004c:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.storage.sql.SelectSql.multiString(com.tencent.mm.sdk.storage.ISQLiteDatabase):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x002e, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        cy3.C58003b.m67160a(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0032, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0033, code lost:
        r7 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0034, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0036, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0037, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x004d, code lost:
        r0.cancel(true);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:10:0x0017, B:23:0x002d] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final double singleDouble(com.tencent.p014mm.sdk.storage.ISQLiteDatabase r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = 1
            android.database.Cursor r7 = r6.executeRawQuery(r7, r1)     // Catch:{ Exception -> 0x0041 }
            if (r7 == 0) goto L_0x0039
            lu3.c r2 = r6.tickTimeout(r7)     // Catch:{ all -> 0x0029 }
            boolean r3 = r7.moveToNext()     // Catch:{ all -> 0x0027 }
            if (r3 == 0) goto L_0x0020
            r3 = 0
            double r3 = r7.getDouble(r3)     // Catch:{ all -> 0x0027 }
            cy3.C58003b.m67160a(r7, r0)     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
            if (r2 == 0) goto L_0x001f
            r2.cancel(r1)
        L_0x001f:
            return r3
        L_0x0020:
            rx3.b0 r3 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0027 }
            cy3.C58003b.m67160a(r7, r0)     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
            r0 = r2
            goto L_0x0039
        L_0x0027:
            r0 = move-exception
            goto L_0x002d
        L_0x0029:
            r2 = move-exception
            r5 = r2
            r2 = r0
            r0 = r5
        L_0x002d:
            throw r0     // Catch:{ all -> 0x002e }
        L_0x002e:
            r3 = move-exception
            cy3.C58003b.m67160a(r7, r0)     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
            throw r3     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
        L_0x0033:
            r7 = move-exception
            r0 = r2
            goto L_0x004b
        L_0x0036:
            r7 = move-exception
            r0 = r2
            goto L_0x0042
        L_0x0039:
            if (r0 == 0) goto L_0x0048
        L_0x003b:
            r0.cancel(r1)
            goto L_0x0048
        L_0x003f:
            r7 = move-exception
            goto L_0x004b
        L_0x0041:
            r7 = move-exception
        L_0x0042:
            r6.handleTimeoutException(r7)     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x0048
            goto L_0x003b
        L_0x0048:
            r0 = 0
            return r0
        L_0x004b:
            if (r0 == 0) goto L_0x0050
            r0.cancel(r1)
        L_0x0050:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.storage.sql.SelectSql.singleDouble(com.tencent.mm.sdk.storage.ISQLiteDatabase):double");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x002e, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        cy3.C58003b.m67160a(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0032, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0033, code lost:
        r6 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0034, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0036, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0037, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x004c, code lost:
        r0.cancel(true);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:10:0x0017, B:23:0x002d] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float singleFloat(com.tencent.p014mm.sdk.storage.ISQLiteDatabase r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = 1
            android.database.Cursor r6 = r5.executeRawQuery(r6, r1)     // Catch:{ Exception -> 0x0041 }
            if (r6 == 0) goto L_0x0039
            lu3.c r2 = r5.tickTimeout(r6)     // Catch:{ all -> 0x0029 }
            boolean r3 = r6.moveToNext()     // Catch:{ all -> 0x0027 }
            if (r3 == 0) goto L_0x0020
            r3 = 0
            float r3 = r6.getFloat(r3)     // Catch:{ all -> 0x0027 }
            cy3.C58003b.m67160a(r6, r0)     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
            if (r2 == 0) goto L_0x001f
            r2.cancel(r1)
        L_0x001f:
            return r3
        L_0x0020:
            rx3.b0 r3 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0027 }
            cy3.C58003b.m67160a(r6, r0)     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
            r0 = r2
            goto L_0x0039
        L_0x0027:
            r0 = move-exception
            goto L_0x002d
        L_0x0029:
            r2 = move-exception
            r4 = r2
            r2 = r0
            r0 = r4
        L_0x002d:
            throw r0     // Catch:{ all -> 0x002e }
        L_0x002e:
            r3 = move-exception
            cy3.C58003b.m67160a(r6, r0)     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
            throw r3     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
        L_0x0033:
            r6 = move-exception
            r0 = r2
            goto L_0x004a
        L_0x0036:
            r6 = move-exception
            r0 = r2
            goto L_0x0042
        L_0x0039:
            if (r0 == 0) goto L_0x0048
        L_0x003b:
            r0.cancel(r1)
            goto L_0x0048
        L_0x003f:
            r6 = move-exception
            goto L_0x004a
        L_0x0041:
            r6 = move-exception
        L_0x0042:
            r5.handleTimeoutException(r6)     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x0048
            goto L_0x003b
        L_0x0048:
            r6 = 0
            return r6
        L_0x004a:
            if (r0 == 0) goto L_0x004f
            r0.cancel(r1)
        L_0x004f:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.storage.sql.SelectSql.singleFloat(com.tencent.mm.sdk.storage.ISQLiteDatabase):float");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x002e, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        cy3.C58003b.m67160a(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0032, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0033, code lost:
        r7 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0034, code lost:
        r1 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0036, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0037, code lost:
        r1 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0039, code lost:
        if (r1 != null) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x003b, code lost:
        r1.cancel(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0045, code lost:
        if (r1 != null) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0048, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x004b, code lost:
        r1.cancel(true);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:10:0x0017, B:23:0x002d] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int singleInt(com.tencent.p014mm.sdk.storage.ISQLiteDatabase r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
            r2 = 1
            android.database.Cursor r7 = r6.executeRawQuery(r7, r2)     // Catch:{ Exception -> 0x0041 }
            if (r7 == 0) goto L_0x0039
            lu3.c r3 = r6.tickTimeout(r7)     // Catch:{ all -> 0x0029 }
            boolean r4 = r7.moveToNext()     // Catch:{ all -> 0x0027 }
            if (r4 == 0) goto L_0x0020
            int r4 = r7.getInt(r0)     // Catch:{ all -> 0x0027 }
            cy3.C58003b.m67160a(r7, r1)     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
            if (r3 == 0) goto L_0x001f
            r3.cancel(r2)
        L_0x001f:
            return r4
        L_0x0020:
            rx3.b0 r4 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0027 }
            cy3.C58003b.m67160a(r7, r1)     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
            r1 = r3
            goto L_0x0039
        L_0x0027:
            r1 = move-exception
            goto L_0x002d
        L_0x0029:
            r3 = move-exception
            r5 = r3
            r3 = r1
            r1 = r5
        L_0x002d:
            throw r1     // Catch:{ all -> 0x002e }
        L_0x002e:
            r4 = move-exception
            cy3.C58003b.m67160a(r7, r1)     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
            throw r4     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
        L_0x0033:
            r7 = move-exception
            r1 = r3
            goto L_0x0049
        L_0x0036:
            r7 = move-exception
            r1 = r3
            goto L_0x0042
        L_0x0039:
            if (r1 == 0) goto L_0x0048
        L_0x003b:
            r1.cancel(r2)
            goto L_0x0048
        L_0x003f:
            r7 = move-exception
            goto L_0x0049
        L_0x0041:
            r7 = move-exception
        L_0x0042:
            r6.handleTimeoutException(r7)     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x0048
            goto L_0x003b
        L_0x0048:
            return r0
        L_0x0049:
            if (r1 == 0) goto L_0x004e
            r1.cancel(r2)
        L_0x004e:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.storage.sql.SelectSql.singleInt(com.tencent.mm.sdk.storage.ISQLiteDatabase):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x002e, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        cy3.C58003b.m67160a(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0032, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0033, code lost:
        r7 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0034, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0036, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0037, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x004d, code lost:
        r0.cancel(true);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:10:0x0017, B:23:0x002d] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long singleLong(com.tencent.p014mm.sdk.storage.ISQLiteDatabase r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = 1
            android.database.Cursor r7 = r6.executeRawQuery(r7, r1)     // Catch:{ Exception -> 0x0041 }
            if (r7 == 0) goto L_0x0039
            lu3.c r2 = r6.tickTimeout(r7)     // Catch:{ all -> 0x0029 }
            boolean r3 = r7.moveToNext()     // Catch:{ all -> 0x0027 }
            if (r3 == 0) goto L_0x0020
            r3 = 0
            long r3 = r7.getLong(r3)     // Catch:{ all -> 0x0027 }
            cy3.C58003b.m67160a(r7, r0)     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
            if (r2 == 0) goto L_0x001f
            r2.cancel(r1)
        L_0x001f:
            return r3
        L_0x0020:
            rx3.b0 r3 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0027 }
            cy3.C58003b.m67160a(r7, r0)     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
            r0 = r2
            goto L_0x0039
        L_0x0027:
            r0 = move-exception
            goto L_0x002d
        L_0x0029:
            r2 = move-exception
            r5 = r2
            r2 = r0
            r0 = r5
        L_0x002d:
            throw r0     // Catch:{ all -> 0x002e }
        L_0x002e:
            r3 = move-exception
            cy3.C58003b.m67160a(r7, r0)     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
            throw r3     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
        L_0x0033:
            r7 = move-exception
            r0 = r2
            goto L_0x004b
        L_0x0036:
            r7 = move-exception
            r0 = r2
            goto L_0x0042
        L_0x0039:
            if (r0 == 0) goto L_0x0048
        L_0x003b:
            r0.cancel(r1)
            goto L_0x0048
        L_0x003f:
            r7 = move-exception
            goto L_0x004b
        L_0x0041:
            r7 = move-exception
        L_0x0042:
            r6.handleTimeoutException(r7)     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x0048
            goto L_0x003b
        L_0x0048:
            r0 = 0
            return r0
        L_0x004b:
            if (r0 == 0) goto L_0x0050
            r0.cancel(r1)
        L_0x0050:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.storage.sql.SelectSql.singleLong(com.tencent.mm.sdk.storage.ISQLiteDatabase):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0034, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        cy3.C58003b.m67160a(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0038, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0039, code lost:
        r5 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x003c, code lost:
        if (r2 != null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x003e, code lost:
        r2.cancel(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0049, code lost:
        if (r2 == null) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x004c, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:10:0x0020, B:22:0x0033] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0051  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T extends com.tencent.p014mm.sdk.storage.IAutoDBItem> T singleQuery(com.tencent.p014mm.sdk.storage.ISQLiteDatabase r5, java.lang.Class<T> r6) {
        /*
            r4 = this;
            java.lang.String r0 = "clazz"
            gy3.C87412m.m108594g(r6, r0)
            r0 = 0
            r1 = 1
            android.database.Cursor r5 = r4.executeRawQuery(r5, r1)     // Catch:{ Exception -> 0x0044, all -> 0x0042 }
            if (r5 == 0) goto L_0x003b
            lu3.c r2 = r4.tickTimeout(r5)     // Catch:{ all -> 0x0031 }
            boolean r3 = r5.moveToNext()     // Catch:{ all -> 0x002f }
            if (r3 == 0) goto L_0x0029
            java.lang.Object r6 = r6.newInstance()     // Catch:{ all -> 0x002f }
            com.tencent.mm.sdk.storage.IAutoDBItem r6 = (com.tencent.p014mm.sdk.storage.IAutoDBItem) r6     // Catch:{ all -> 0x002f }
            r6.convertFrom(r5)     // Catch:{ all -> 0x002f }
            cy3.C58003b.m67160a(r5, r0)     // Catch:{ Exception -> 0x0039 }
            if (r2 == 0) goto L_0x0028
            r2.cancel(r1)
        L_0x0028:
            return r6
        L_0x0029:
            rx3.b0 r6 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x002f }
            cy3.C58003b.m67160a(r5, r0)     // Catch:{ Exception -> 0x0039 }
            goto L_0x003c
        L_0x002f:
            r6 = move-exception
            goto L_0x0033
        L_0x0031:
            r6 = move-exception
            r2 = r0
        L_0x0033:
            throw r6     // Catch:{ all -> 0x0034 }
        L_0x0034:
            r3 = move-exception
            cy3.C58003b.m67160a(r5, r6)     // Catch:{ Exception -> 0x0039 }
            throw r3     // Catch:{ Exception -> 0x0039 }
        L_0x0039:
            r5 = move-exception
            goto L_0x0046
        L_0x003b:
            r2 = r0
        L_0x003c:
            if (r2 == 0) goto L_0x004c
        L_0x003e:
            r2.cancel(r1)
            goto L_0x004c
        L_0x0042:
            r5 = move-exception
            goto L_0x004f
        L_0x0044:
            r5 = move-exception
            r2 = r0
        L_0x0046:
            r4.handleTimeoutException(r5)     // Catch:{ all -> 0x004d }
            if (r2 == 0) goto L_0x004c
            goto L_0x003e
        L_0x004c:
            return r0
        L_0x004d:
            r5 = move-exception
            r0 = r2
        L_0x004f:
            if (r0 == 0) goto L_0x0054
            r0.cancel(r1)
        L_0x0054:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.storage.sql.SelectSql.singleQuery(com.tencent.mm.sdk.storage.ISQLiteDatabase, java.lang.Class):com.tencent.mm.sdk.storage.IAutoDBItem");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x002b, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        cy3.C58003b.m67160a(r6, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x002f, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0030, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0033, code lost:
        if (r2 != null) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0035, code lost:
        r2.cancel(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0040, code lost:
        if (r2 == null) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0043, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:10:0x0017, B:22:0x002a] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String singleString(com.tencent.p014mm.sdk.storage.ISQLiteDatabase r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = 1
            android.database.Cursor r6 = r5.executeRawQuery(r6, r1)     // Catch:{ Exception -> 0x003b, all -> 0x0039 }
            if (r6 == 0) goto L_0x0032
            lu3.c r2 = r5.tickTimeout(r6)     // Catch:{ all -> 0x0028 }
            boolean r3 = r6.moveToNext()     // Catch:{ all -> 0x0026 }
            if (r3 == 0) goto L_0x0020
            r3 = 0
            java.lang.String r3 = r6.getString(r3)     // Catch:{ all -> 0x0026 }
            cy3.C58003b.m67160a(r6, r0)     // Catch:{ Exception -> 0x0030 }
            if (r2 == 0) goto L_0x001f
            r2.cancel(r1)
        L_0x001f:
            return r3
        L_0x0020:
            rx3.b0 r3 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0026 }
            cy3.C58003b.m67160a(r6, r0)     // Catch:{ Exception -> 0x0030 }
            goto L_0x0033
        L_0x0026:
            r3 = move-exception
            goto L_0x002a
        L_0x0028:
            r3 = move-exception
            r2 = r0
        L_0x002a:
            throw r3     // Catch:{ all -> 0x002b }
        L_0x002b:
            r4 = move-exception
            cy3.C58003b.m67160a(r6, r3)     // Catch:{ Exception -> 0x0030 }
            throw r4     // Catch:{ Exception -> 0x0030 }
        L_0x0030:
            r6 = move-exception
            goto L_0x003d
        L_0x0032:
            r2 = r0
        L_0x0033:
            if (r2 == 0) goto L_0x0043
        L_0x0035:
            r2.cancel(r1)
            goto L_0x0043
        L_0x0039:
            r6 = move-exception
            goto L_0x0046
        L_0x003b:
            r6 = move-exception
            r2 = r0
        L_0x003d:
            r5.handleTimeoutException(r6)     // Catch:{ all -> 0x0044 }
            if (r2 == 0) goto L_0x0043
            goto L_0x0035
        L_0x0043:
            return r0
        L_0x0044:
            r6 = move-exception
            r0 = r2
        L_0x0046:
            if (r0 == 0) goto L_0x004b
            r0.cancel(r1)
        L_0x004b:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.storage.sql.SelectSql.singleString(com.tencent.mm.sdk.storage.ISQLiteDatabase):java.lang.String");
    }

    public final UnionSql.Builder union(SelectSql selectSql) {
        C87412m.m108594g(selectSql, "selectSql");
        return new UnionSql.Builder(this, selectSql);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectSql(String str, String[] strArr, long j, boolean z, boolean z2) {
        super(str, strArr);
        C87412m.m108594g(str, "sql");
        this.timeout = j;
        this.existLimitOrFunctionColumnCondition = z;
        this.explainQueryPlan = z2;
    }
}
