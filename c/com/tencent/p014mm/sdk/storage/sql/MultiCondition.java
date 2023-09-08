package com.tencent.p014mm.sdk.storage.sql;

import com.tencent.p014mm.sdk.storage.sql.ISqlObj;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.Set;
import kotlin.Metadata;
import rx3.C13603j;
import sx3.C110826x0;
import sx3.C64175a0;

@Metadata(mo182093d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\f\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0016J\u0016\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0016J\u0015\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0016¢\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\tH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006X\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u000e¢\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u000b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/sql/MultiCondition;", "Lcom/tencent/mm/sdk/storage/sql/ISqlCondition;", "cond", "Lcom/tencent/mm/sdk/storage/sql/SingleCondition;", "(Lcom/tencent/mm/sdk/storage/sql/SingleCondition;)V", "allConditionSet", "", "params", "", "", "[Ljava/lang/String;", "sql", "and", "getAllCondition", "", "merge", "operator", "Lcom/tencent/mm/sdk/storage/sql/ISqlObj$ConditionConnectOperation;", "or", "()[Ljava/lang/String;", "toSql", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.sdk.storage.sql.MultiCondition */
public final class MultiCondition implements ISqlCondition {
    private final Set<ISqlCondition> allConditionSet;
    private String[] params;
    private String sql;

    @Metadata(mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.storage.sql.MultiCondition$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ISqlObj.ConditionConnectOperation.values().length];
            iArr[ISqlObj.ConditionConnectOperation.AND.ordinal()] = 1;
            iArr[ISqlObj.ConditionConnectOperation.OR.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MultiCondition(SingleCondition singleCondition) {
        C87412m.m108594g(singleCondition, "cond");
        this.sql = singleCondition.toSql();
        this.params = singleCondition.params();
        this.allConditionSet = C110826x0.m151015c(singleCondition);
    }

    public Set<ISqlCondition> getAllCondition() {
        return this.allConditionSet;
    }

    public final MultiCondition merge(ISqlCondition iSqlCondition, ISqlObj.ConditionConnectOperation conditionConnectOperation) {
        String str;
        C87412m.m108594g(iSqlCondition, "cond");
        C87412m.m108594g(conditionConnectOperation, "operator");
        int i = WhenMappings.$EnumSwitchMapping$0[conditionConnectOperation.ordinal()];
        if (i == 1) {
            str = "AND";
        } else if (i == 2) {
            str = "OR";
        } else {
            throw new C13603j();
        }
        this.sql = '(' + this.sql + ") " + str + ' ' + iSqlCondition.toSql();
        LinkedList linkedList = new LinkedList();
        String[] strArr = this.params;
        if (strArr != null) {
            C64175a0.m75509q(linkedList, strArr);
        }
        String[] params2 = iSqlCondition.params();
        if (params2 != null) {
            C64175a0.m75509q(linkedList, params2);
        }
        Object[] array = linkedList.toArray(new String[0]);
        C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        this.params = (String[]) array;
        this.allConditionSet.addAll(iSqlCondition.getAllCondition());
        return this;
    }

    public String[] params() {
        return this.params;
    }

    public String toSql() {
        return this.sql;
    }

    public MultiCondition and(ISqlCondition iSqlCondition) {
        C87412m.m108594g(iSqlCondition, "cond");
        return merge(iSqlCondition, ISqlObj.ConditionConnectOperation.AND);
    }

    /* renamed from: or */
    public MultiCondition m124483or(ISqlCondition iSqlCondition) {
        C87412m.m108594g(iSqlCondition, "cond");
        return merge(iSqlCondition, ISqlObj.ConditionConnectOperation.OR);
    }
}
