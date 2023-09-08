package com.tencent.p014mm.sdk.storage.sql;

import android.content.ContentValues;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.sql.DeleteSql;
import com.tencent.p014mm.sdk.storage.sql.ISqlTable;
import com.tencent.p014mm.sdk.storage.sql.IndexSql;
import com.tencent.p014mm.sdk.storage.sql.SelectSql;
import com.tencent.p014mm.sdk.storage.sql.UpdateSql;
import gy3.C87412m;
import java.util.List;
import kotlin.Metadata;
import sx3.C26236u;
import sx3.C64186f0;

@Metadata(mo182093d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0014\u0010\t\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u0006\u0010\u0010\u001a\u00020\nJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016¨\u0006\u0017"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/sql/Table;", "Lcom/tencent/mm/sdk/storage/sql/ISqlTable;", "()V", "delete", "Lcom/tencent/mm/sdk/storage/sql/DeleteSql$Builder;", "index", "Lcom/tencent/mm/sdk/storage/sql/IndexSql$Builder;", "name", "", "select", "Lcom/tencent/mm/sdk/storage/sql/SelectSql$Builder;", "column", "Lcom/tencent/mm/sdk/storage/sql/Column;", "columns", "", "Lcom/tencent/mm/sdk/storage/sql/ISqlColumn;", "selectAll", "update", "Lcom/tencent/mm/sdk/storage/sql/UpdateSql$Builder;", "values", "Landroid/content/ContentValues;", "item", "Lcom/tencent/mm/sdk/storage/IAutoDBItem;", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.sdk.storage.sql.Table */
public abstract class Table implements ISqlTable {
    public final DeleteSql.Builder delete() {
        return new DeleteSql.Builder(this);
    }

    public final IndexSql.Builder index(String str) {
        C87412m.m108594g(str, "name");
        return new IndexSql.Builder(this, str);
    }

    public String[] params() {
        return ISqlTable.DefaultImpls.params(this);
    }

    public final SelectSql.Builder select(Column column) {
        C87412m.m108594g(column, "column");
        return select((List<? extends ISqlColumn>) C26236u.m33719b(column));
    }

    public final SelectSql.Builder selectAll() {
        return new SelectSql.Builder(this, C64186f0.f181907d);
    }

    public final UpdateSql.Builder update(IAutoDBItem iAutoDBItem) {
        C87412m.m108594g(iAutoDBItem, "item");
        ContentValues convertTo = iAutoDBItem.convertTo();
        C87412m.m108593f(convertTo, "item.convertTo()");
        return new UpdateSql.Builder(this, convertTo);
    }

    public final SelectSql.Builder select(List<? extends ISqlColumn> list) {
        C87412m.m108594g(list, "columns");
        return new SelectSql.Builder(this, list);
    }

    public final UpdateSql.Builder update(ContentValues contentValues) {
        C87412m.m108594g(contentValues, "values");
        return new UpdateSql.Builder(this, contentValues);
    }
}
