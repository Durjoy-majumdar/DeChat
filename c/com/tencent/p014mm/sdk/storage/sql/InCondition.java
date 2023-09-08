package com.tencent.p014mm.sdk.storage.sql;

import fy3.C32226l;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import sx3.C110818d0;
import sx3.C36907w;

@Metadata(mo182093d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011H\u0016¢\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0014"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/sql/InCondition;", "Lcom/tencent/mm/sdk/storage/sql/SingleCondition;", "column", "", "isNot", "", "values", "", "(Ljava/lang/String;ZLjava/util/List;)V", "getColumn", "()Ljava/lang/String;", "()Z", "questionMarks", "getQuestionMarks", "()Ljava/util/List;", "getValues", "params", "", "()[Ljava/lang/String;", "toSql", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.sdk.storage.sql.InCondition */
public class InCondition extends SingleCondition {
    private final String column;
    private final boolean isNot;
    private final List<String> questionMarks;
    private final List<String> values;

    public InCondition(String str, boolean z, List<String> list) {
        C87412m.m108594g(str, "column");
        C87412m.m108594g(list, "values");
        this.column = str;
        this.isNot = z;
        this.values = list;
        ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
        for (String str2 : list) {
            arrayList.add("?");
        }
        this.questionMarks = arrayList;
    }

    public final String getColumn() {
        return this.column;
    }

    public final List<String> getQuestionMarks() {
        return this.questionMarks;
    }

    public final List<String> getValues() {
        return this.values;
    }

    public final boolean isNot() {
        return this.isNot;
    }

    public String[] params() {
        Object[] array = this.values.toArray(new String[0]);
        C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    public String toSql() {
        String S = C110818d0.m150921S(this.questionMarks, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null);
        if (this.isNot) {
            return this.column + " NOT IN (" + S + ')';
        }
        return this.column + " IN (" + S + ')';
    }
}
