package com.tencent.p014mm.sdk.storage.sql;

import com.tencent.p014mm.sdk.storage.sql.ISqlObj;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0015\u001a\u00020\u0003H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/sql/ColumnBitValueCondition;", "Lcom/tencent/mm/sdk/storage/sql/SingleCondition;", "column", "", "bitValue", "", "bitOperation", "Lcom/tencent/mm/sdk/storage/sql/ISqlObj$ConditionBitOperation;", "compareValue", "operator", "Lcom/tencent/mm/sdk/storage/sql/ISqlObj$ConditionOperation;", "(Ljava/lang/String;ILcom/tencent/mm/sdk/storage/sql/ISqlObj$ConditionBitOperation;ILcom/tencent/mm/sdk/storage/sql/ISqlObj$ConditionOperation;)V", "getBitOperation", "()Lcom/tencent/mm/sdk/storage/sql/ISqlObj$ConditionBitOperation;", "getBitValue", "()I", "getColumn", "()Ljava/lang/String;", "getCompareValue", "getOperator", "()Lcom/tencent/mm/sdk/storage/sql/ISqlObj$ConditionOperation;", "toSql", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.sdk.storage.sql.ColumnBitValueCondition */
public class ColumnBitValueCondition extends SingleCondition {
    private final ISqlObj.ConditionBitOperation bitOperation;
    private final int bitValue;
    private final String column;
    private final int compareValue;
    private final ISqlObj.ConditionOperation operator;

    public ColumnBitValueCondition(String str, int i, ISqlObj.ConditionBitOperation conditionBitOperation, int i2, ISqlObj.ConditionOperation conditionOperation) {
        C87412m.m108594g(str, "column");
        C87412m.m108594g(conditionBitOperation, "bitOperation");
        C87412m.m108594g(conditionOperation, "operator");
        this.column = str;
        this.bitValue = i;
        this.bitOperation = conditionBitOperation;
        this.compareValue = i2;
        this.operator = conditionOperation;
    }

    public final ISqlObj.ConditionBitOperation getBitOperation() {
        return this.bitOperation;
    }

    public final int getBitValue() {
        return this.bitValue;
    }

    public final String getColumn() {
        return this.column;
    }

    public final int getCompareValue() {
        return this.compareValue;
    }

    public final ISqlObj.ConditionOperation getOperator() {
        return this.operator;
    }

    public String toSql() {
        return '(' + this.column + ' ' + this.bitOperation + ' ' + this.bitValue + ") " + this.operator + ' ' + this.compareValue;
    }
}
