package com.tencent.p014mm.sdk.storage.sql;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo182094d2 = {"<anonymous>", "", "it", "Lcom/tencent/mm/sdk/storage/sql/ISqlOrder;", "invoke"}, mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.sdk.storage.sql.SelectSql$Builder$build$orderClause$2$1 */
public final class SelectSql$Builder$build$orderClause$2$1 extends C87413o implements C32226l<ISqlOrder, CharSequence> {
    public static final SelectSql$Builder$build$orderClause$2$1 INSTANCE = new SelectSql$Builder$build$orderClause$2$1();

    public SelectSql$Builder$build$orderClause$2$1() {
        super(1);
    }

    public final CharSequence invoke(ISqlOrder iSqlOrder) {
        C87412m.m108594g(iSqlOrder, LocaleUtil.ITALIAN);
        return iSqlOrder.toSql();
    }
}
