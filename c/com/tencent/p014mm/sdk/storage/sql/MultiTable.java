package com.tencent.p014mm.sdk.storage.sql;

import com.tencent.p014mm.sdk.storage.sql.ISqlObj;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\tJ\u0015\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0016H\u0016¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0003H\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u0019"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/sql/MultiTable;", "Lcom/tencent/mm/sdk/storage/sql/Table;", "table1", "", "table2", "operation", "Lcom/tencent/mm/sdk/storage/sql/ISqlObj$TableJoinOperation;", "(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/sdk/storage/sql/ISqlObj$TableJoinOperation;)V", "onCondition", "Lcom/tencent/mm/sdk/storage/sql/ISqlCondition;", "getOnCondition", "()Lcom/tencent/mm/sdk/storage/sql/ISqlCondition;", "setOnCondition", "(Lcom/tencent/mm/sdk/storage/sql/ISqlCondition;)V", "getOperation", "()Lcom/tencent/mm/sdk/storage/sql/ISqlObj$TableJoinOperation;", "getTable1", "()Ljava/lang/String;", "getTable2", "on", "condition", "params", "", "()[Ljava/lang/String;", "toSql", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.sdk.storage.sql.MultiTable */
public final class MultiTable extends Table {
    private ISqlCondition onCondition;
    private final ISqlObj.TableJoinOperation operation;
    private final String table1;
    private final String table2;

    @Metadata(mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.storage.sql.MultiTable$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ISqlObj.TableJoinOperation.values().length];
            iArr[ISqlObj.TableJoinOperation.InnerJoin.ordinal()] = 1;
            iArr[ISqlObj.TableJoinOperation.LeftJoin.ordinal()] = 2;
            iArr[ISqlObj.TableJoinOperation.RightJoin.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MultiTable(String str, String str2, ISqlObj.TableJoinOperation tableJoinOperation) {
        C87412m.m108594g(str, "table1");
        C87412m.m108594g(str2, "table2");
        C87412m.m108594g(tableJoinOperation, "operation");
        this.table1 = str;
        this.table2 = str2;
        this.operation = tableJoinOperation;
    }

    public final ISqlCondition getOnCondition() {
        return this.onCondition;
    }

    public final ISqlObj.TableJoinOperation getOperation() {
        return this.operation;
    }

    public final String getTable1() {
        return this.table1;
    }

    public final String getTable2() {
        return this.table2;
    }

    /* renamed from: on */
    public final MultiTable mo81868on(ISqlCondition iSqlCondition) {
        C87412m.m108594g(iSqlCondition, "condition");
        this.onCondition = iSqlCondition;
        return this;
    }

    public String[] params() {
        ISqlCondition iSqlCondition = this.onCondition;
        if (iSqlCondition != null) {
            return iSqlCondition.params();
        }
        return null;
    }

    public final void setOnCondition(ISqlCondition iSqlCondition) {
        this.onCondition = iSqlCondition;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
        if (r0 == null) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toSql() {
        /*
            r3 = this;
            com.tencent.mm.sdk.storage.sql.ISqlCondition r0 = r3.onCondition
            if (r0 == 0) goto L_0x0020
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = " ON ("
            r1.append(r2)
            java.lang.String r0 = r0.toSql()
            r1.append(r0)
            r0 = 41
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            if (r0 != 0) goto L_0x0022
        L_0x0020:
            java.lang.String r0 = ""
        L_0x0022:
            com.tencent.mm.sdk.storage.sql.ISqlObj$TableJoinOperation r1 = r3.operation
            int[] r2 = com.tencent.p014mm.sdk.storage.sql.MultiTable.WhenMappings.$EnumSwitchMapping$0
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 1
            if (r1 == r2) goto L_0x0073
            r2 = 2
            if (r1 == r2) goto L_0x0057
            r2 = 3
            if (r1 != r2) goto L_0x0051
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.table1
            r1.append(r2)
            java.lang.String r2 = " RIGHT JOIN "
            r1.append(r2)
            java.lang.String r2 = r3.table2
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L_0x0051:
            rx3.j r0 = new rx3.j
            r0.<init>()
            throw r0
        L_0x0057:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.table1
            r1.append(r2)
            java.lang.String r2 = " LEFT JOIN "
            r1.append(r2)
            java.lang.String r2 = r3.table2
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L_0x0073:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.table1
            r1.append(r2)
            java.lang.String r2 = " INNER JOIN "
            r1.append(r2)
            java.lang.String r2 = r3.table2
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.storage.sql.MultiTable.toSql():java.lang.String");
    }
}
