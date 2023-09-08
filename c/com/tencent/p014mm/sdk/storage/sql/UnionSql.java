package com.tencent.p014mm.sdk.storage.sql;

import com.tencent.p014mm.sdk.storage.sql.SelectSql;
import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import kotlin.Metadata;
import sx3.C26236u;

@Metadata(mo182093d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \r2\u00020\u0001:\u0002\f\rB;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000b¨\u0006\u000e"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/sql/UnionSql;", "Lcom/tencent/mm/sdk/storage/sql/SelectSql;", "sql", "", "params", "", "timeout", "", "existLimitOrFunctionColumnCondition", "", "explainQueryPlan", "(Ljava/lang/String;[Ljava/lang/String;JZZ)V", "Builder", "Companion", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.sdk.storage.sql.UnionSql */
public final class UnionSql extends SelectSql {
    public static final Companion Companion = new Companion((C8480h) null);
    public static final String TAG = "MicroMsg.Sql.UnionSql";

    @Metadata(mo182093d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0010\u001a\u00020\u0003J\u0016\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\fJ\u0014\u0010\u0013\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u0010\u0010\u0015\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0016"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/sql/UnionSql$Builder;", "", "selectSql1", "Lcom/tencent/mm/sdk/storage/sql/SelectSql;", "selectSql2", "(Lcom/tencent/mm/sdk/storage/sql/SelectSql;Lcom/tencent/mm/sdk/storage/sql/SelectSql;)V", "condition", "Lcom/tencent/mm/sdk/storage/sql/ISqlCondition;", "limit", "Lcom/tencent/mm/sdk/storage/sql/SelectSql$Limit;", "orders", "", "Lcom/tencent/mm/sdk/storage/sql/ISqlOrder;", "getSelectSql1", "()Lcom/tencent/mm/sdk/storage/sql/SelectSql;", "getSelectSql2", "build", "", "offset", "orderBy", "order", "where", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.storage.sql.UnionSql$Builder */
    public static final class Builder {
        private ISqlCondition condition;
        private SelectSql.Limit limit;
        private List<? extends ISqlOrder> orders;
        private final SelectSql selectSql1;
        private final SelectSql selectSql2;

        public Builder(SelectSql selectSql, SelectSql selectSql3) {
            C87412m.m108594g(selectSql, "selectSql1");
            C87412m.m108594g(selectSql3, "selectSql2");
            this.selectSql1 = selectSql;
            this.selectSql2 = selectSql3;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b7, code lost:
            if (r2 == null) goto L_0x00b9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ed, code lost:
            if (r4 == null) goto L_0x00ef;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.tencent.p014mm.sdk.storage.sql.SelectSql build() {
            /*
                r21 = this;
                r0 = r21
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "SELECT * FROM ("
                r1.append(r2)
                com.tencent.mm.sdk.storage.sql.SelectSql r2 = r0.selectSql1
                java.lang.String r2 = r2.toSql()
                r1.append(r2)
                java.lang.String r2 = ") UNION SELECT * FROM ("
                r1.append(r2)
                com.tencent.mm.sdk.storage.sql.SelectSql r2 = r0.selectSql2
                java.lang.String r2 = r2.toSql()
                r1.append(r2)
                r2 = 41
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                com.tencent.mm.sdk.storage.sql.SelectSql r3 = r0.selectSql1
                java.lang.String[] r3 = r3.params()
                if (r3 == 0) goto L_0x003c
                sx3.C64175a0.m75509q(r2, r3)
            L_0x003c:
                com.tencent.mm.sdk.storage.sql.SelectSql r3 = r0.selectSql2
                java.lang.String[] r3 = r3.params()
                if (r3 == 0) goto L_0x0047
                sx3.C64175a0.m75509q(r2, r3)
            L_0x0047:
                com.tencent.mm.sdk.storage.sql.ISqlCondition r3 = r0.condition
                if (r3 == 0) goto L_0x0054
                java.lang.String[] r3 = r3.params()
                if (r3 == 0) goto L_0x0054
                sx3.C64175a0.m75509q(r2, r3)
            L_0x0054:
                r3 = 0
                java.lang.String[] r4 = new java.lang.String[r3]
                java.lang.Object[] r2 = r2.toArray(r4)
                java.lang.String r4 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
                gy3.C87412m.m108592e(r2, r4)
                r7 = r2
                java.lang.String[] r7 = (java.lang.String[]) r7
                com.tencent.mm.sdk.storage.sql.SelectSql r2 = r0.selectSql1
                long r4 = r2.getTimeout()
                com.tencent.mm.sdk.storage.sql.SelectSql r2 = r0.selectSql2
                long r8 = r2.getTimeout()
                long r8 = java.lang.Math.max(r4, r8)
                com.tencent.mm.sdk.storage.sql.SelectSql r2 = r0.selectSql1
                boolean r2 = r2.getExplainQueryPlan()
                r4 = 1
                if (r2 != 0) goto L_0x0087
                com.tencent.mm.sdk.storage.sql.SelectSql r2 = r0.selectSql2
                boolean r2 = r2.getExplainQueryPlan()
                if (r2 == 0) goto L_0x0085
                goto L_0x0087
            L_0x0085:
                r11 = 0
                goto L_0x0088
            L_0x0087:
                r11 = 1
            L_0x0088:
                com.tencent.mm.sdk.storage.sql.SelectSql r2 = r0.selectSql1
                boolean r2 = r2.getExistLimitOrFunctionColumnCondition()
                if (r2 != 0) goto L_0x009b
                com.tencent.mm.sdk.storage.sql.SelectSql r2 = r0.selectSql2
                boolean r2 = r2.getExistLimitOrFunctionColumnCondition()
                if (r2 == 0) goto L_0x0099
                goto L_0x009b
            L_0x0099:
                r10 = 0
                goto L_0x009c
            L_0x009b:
                r10 = 1
            L_0x009c:
                com.tencent.mm.sdk.storage.sql.ISqlCondition r2 = r0.condition
                java.lang.String r3 = ""
                if (r2 == 0) goto L_0x00b9
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = " WHERE "
                r5.append(r6)
                java.lang.String r2 = r2.toSql()
                r5.append(r2)
                java.lang.String r2 = r5.toString()
                if (r2 != 0) goto L_0x00ba
            L_0x00b9:
                r2 = r3
            L_0x00ba:
                java.util.List<? extends com.tencent.mm.sdk.storage.sql.ISqlOrder> r5 = r0.orders
                if (r5 == 0) goto L_0x00ef
                boolean r6 = r5.isEmpty()
                r4 = r4 ^ r6
                if (r4 == 0) goto L_0x00c6
                goto L_0x00c7
            L_0x00c6:
                r5 = 0
            L_0x00c7:
                r12 = r5
                if (r12 == 0) goto L_0x00ef
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = " ORDER BY "
                r4.append(r5)
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                com.tencent.mm.sdk.storage.sql.UnionSql$Builder$build$orderClause$2$1 r18 = com.tencent.p014mm.sdk.storage.sql.UnionSql$Builder$build$orderClause$2$1.INSTANCE
                r19 = 30
                r20 = 0
                java.lang.String r13 = ", "
                java.lang.String r5 = sx3.C110818d0.m150921S(r12, r13, r14, r15, r16, r17, r18, r19, r20)
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                if (r4 != 0) goto L_0x00f0
            L_0x00ef:
                r4 = r3
            L_0x00f0:
                com.tencent.mm.sdk.storage.sql.SelectSql$Limit r5 = r0.limit
                if (r5 == 0) goto L_0x0119
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r12 = " LIMIT "
                r6.append(r12)
                int r12 = r5.getLimit()
                r6.append(r12)
                java.lang.String r12 = " OFFSET "
                r6.append(r12)
                int r5 = r5.getOffset()
                r6.append(r5)
                java.lang.String r5 = r6.toString()
                if (r5 != 0) goto L_0x0118
                goto L_0x0119
            L_0x0118:
                r3 = r5
            L_0x0119:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r1)
                r5.append(r2)
                r5.append(r4)
                r5.append(r3)
                java.lang.String r6 = r5.toString()
                com.tencent.mm.sdk.storage.sql.UnionSql r1 = new com.tencent.mm.sdk.storage.sql.UnionSql
                r5 = r1
                r5.<init>(r6, r7, r8, r10, r11)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.storage.sql.UnionSql.Builder.build():com.tencent.mm.sdk.storage.sql.SelectSql");
        }

        public final SelectSql getSelectSql1() {
            return this.selectSql1;
        }

        public final SelectSql getSelectSql2() {
            return this.selectSql2;
        }

        public final Builder limit(int i, int i2) {
            this.limit = new SelectSql.Limit(i, i2);
            return this;
        }

        public final Builder orderBy(List<? extends ISqlOrder> list) {
            C87412m.m108594g(list, "orders");
            this.orders = list;
            return this;
        }

        public final Builder where(ISqlCondition iSqlCondition) {
            this.condition = iSqlCondition;
            return this;
        }

        public final Builder orderBy(ISqlOrder iSqlOrder) {
            C87412m.m108594g(iSqlOrder, "order");
            this.orders = C26236u.m33719b(iSqlOrder);
            return this;
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/sql/UnionSql$Companion;", "", "()V", "TAG", "", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.storage.sql.UnionSql$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UnionSql(String str, String[] strArr, long j, boolean z, boolean z2, int i, C8480h hVar) {
        this(str, strArr, (i & 4) != 0 ? -1 : j, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UnionSql(String str, String[] strArr, long j, boolean z, boolean z2) {
        super(str, strArr, j, z, z2);
        C87412m.m108594g(str, "sql");
    }
}
