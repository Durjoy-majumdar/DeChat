package com.tencent.p014mm.sdk.storage.sql;

import com.tencent.p014mm.sdk.storage.sql.ISqlObj;
import gy3.C87412m;
import java.util.ArrayList;
import kotlin.Metadata;
import sx3.C110823p;

@Metadata(mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0007\"\u00020\u0003¢\u0006\u0002\u0010\bJ\u0015\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007H\u0016¢\u0006\u0002\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0007¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/sql/MultiColumnValueCondition;", "Lcom/tencent/mm/sdk/storage/sql/SingleCondition;", "column", "", "operator", "Lcom/tencent/mm/sdk/storage/sql/ISqlObj$ConditionOperation;", "values", "", "(Ljava/lang/String;Lcom/tencent/mm/sdk/storage/sql/ISqlObj$ConditionOperation;[Ljava/lang/String;)V", "getColumn", "()Ljava/lang/String;", "getOperator", "()Lcom/tencent/mm/sdk/storage/sql/ISqlObj$ConditionOperation;", "getValues", "()[Ljava/lang/String;", "[Ljava/lang/String;", "params", "toSql", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.sdk.storage.sql.MultiColumnValueCondition */
public class MultiColumnValueCondition extends SingleCondition {
    private final String column;
    private final ISqlObj.ConditionOperation operator;
    private final String[] values;

    public MultiColumnValueCondition(String str, ISqlObj.ConditionOperation conditionOperation, String... strArr) {
        C87412m.m108594g(str, "column");
        C87412m.m108594g(conditionOperation, "operator");
        C87412m.m108594g(strArr, "values");
        this.column = str;
        this.operator = conditionOperation;
        this.values = strArr;
    }

    public final String getColumn() {
        return this.column;
    }

    public final ISqlObj.ConditionOperation getOperator() {
        return this.operator;
    }

    public final String[] getValues() {
        return this.values;
    }

    public String[] params() {
        String[] strArr = this.values;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String add : strArr) {
            arrayList.add(add);
        }
        Object[] array = arrayList.toArray(new String[0]);
        C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    public String toSql() {
        return C110823p.m150987M(this.values, " AND ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new MultiColumnValueCondition$toSql$1(this), 30, (Object) null);
    }
}
