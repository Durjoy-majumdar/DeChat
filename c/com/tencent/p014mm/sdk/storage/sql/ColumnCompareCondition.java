package com.tencent.p014mm.sdk.storage.sql;

import com.tencent.p014mm.sdk.storage.sql.ISqlObj;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0015\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eH\u0016¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/sql/ColumnCompareCondition;", "Lcom/tencent/mm/sdk/storage/sql/SingleCondition;", "column1", "", "column2", "operator", "Lcom/tencent/mm/sdk/storage/sql/ISqlObj$ConditionOperation;", "(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/sdk/storage/sql/ISqlObj$ConditionOperation;)V", "getColumn1", "()Ljava/lang/String;", "getColumn2", "getOperator", "()Lcom/tencent/mm/sdk/storage/sql/ISqlObj$ConditionOperation;", "params", "", "()[Ljava/lang/String;", "toSql", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.sdk.storage.sql.ColumnCompareCondition */
public class ColumnCompareCondition extends SingleCondition {
    private final String column1;
    private final String column2;
    private final ISqlObj.ConditionOperation operator;

    public ColumnCompareCondition(String str, String str2, ISqlObj.ConditionOperation conditionOperation) {
        C87412m.m108594g(str, "column1");
        C87412m.m108594g(str2, "column2");
        C87412m.m108594g(conditionOperation, "operator");
        this.column1 = str;
        this.column2 = str2;
        this.operator = conditionOperation;
    }

    public final String getColumn1() {
        return this.column1;
    }

    public final String getColumn2() {
        return this.column2;
    }

    public final ISqlObj.ConditionOperation getOperator() {
        return this.operator;
    }

    public String[] params() {
        return null;
    }

    public String toSql() {
        return this.column1 + ' ' + this.operator + ' ' + this.column2;
    }
}
