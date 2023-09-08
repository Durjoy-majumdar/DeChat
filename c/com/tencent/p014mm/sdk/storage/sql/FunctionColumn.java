package com.tencent.p014mm.sdk.storage.sql;

import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\u0003H\u0016R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\f"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/sql/FunctionColumn;", "Lcom/tencent/mm/sdk/storage/sql/Column;", "name", "", "dataType", "tableName", "referTo", "function", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFunction", "()Ljava/lang/String;", "tableColumnName", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.sdk.storage.sql.FunctionColumn */
public final class FunctionColumn extends Column {
    private final String function;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FunctionColumn(String str, String str2, String str3, String str4, String str5) {
        super(str, str2, str3, str4);
        C87412m.m108594g(str, "name");
        C87412m.m108594g(str2, "dataType");
        C87412m.m108594g(str3, "tableName");
        C87412m.m108594g(str4, "referTo");
        C87412m.m108594g(str5, "function");
        this.function = str5;
    }

    public final String getFunction() {
        return this.function;
    }

    public String tableColumnName() {
        return this.function + '(' + super.tableColumnName() + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FunctionColumn(String str, String str2, String str3, String str4, String str5, int i, C8480h hVar) {
        this(str, str2, str3, (i & 8) != 0 ? "" : str4, str5);
    }
}
