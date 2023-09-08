package com.tencent.p014mm.sdk.storage.sql;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import sx3.C110818d0;

@Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/sql/IndexSql;", "Lcom/tencent/mm/sdk/storage/sql/SqlObj;", "sql", "", "(Ljava/lang/String;)V", "Builder", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.sdk.storage.sql.IndexSql */
public final class IndexSql extends SqlObj {

    @Metadata(mo182093d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0005J\u001f\u0010\u0015\u001a\u00020\u00002\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\u0016\"\u00020\t¢\u0006\u0002\u0010\u0017J\u0014\u0010\u0015\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0018"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/sql/IndexSql$Builder;", "", "table", "Lcom/tencent/mm/sdk/storage/sql/Table;", "name", "", "(Lcom/tencent/mm/sdk/storage/sql/Table;Ljava/lang/String;)V", "columns", "", "Lcom/tencent/mm/sdk/storage/sql/ISqlColumn;", "isUnique", "", "logTag", "getName", "()Ljava/lang/String;", "getTable", "()Lcom/tencent/mm/sdk/storage/sql/Table;", "build", "Lcom/tencent/mm/sdk/storage/sql/IndexSql;", "log", "tag", "on", "", "([Lcom/tencent/mm/sdk/storage/sql/ISqlColumn;)Lcom/tencent/mm/sdk/storage/sql/IndexSql$Builder;", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.storage.sql.IndexSql$Builder */
    public static final class Builder {
        private List<? extends ISqlColumn> columns;
        private boolean isUnique;
        private String logTag;
        private final String name;
        private final Table table;

        public Builder(Table table2, String str) {
            C87412m.m108594g(table2, "table");
            C87412m.m108594g(str, "name");
            this.table = table2;
            this.name = str;
        }

        public final IndexSql build() {
            if (this.table instanceof SingleTable) {
                List<? extends ISqlColumn> list = this.columns;
                if (list != null) {
                    boolean z = true;
                    if (list == null || !list.isEmpty()) {
                        z = false;
                    }
                    if (!z) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("CREATE ");
                        sb.append(this.isUnique ? "UNIQUE " : "");
                        sb.append("INDEX IF NOT EXISTS ");
                        sb.append(this.name);
                        sb.append(" ON ");
                        sb.append(((SingleTable) this.table).getName());
                        sb.append('(');
                        List<? extends ISqlColumn> list2 = this.columns;
                        sb.append(list2 != null ? C110818d0.m150921S(list2, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, IndexSql$Builder$build$sql$1.INSTANCE, 30, (Object) null) : null);
                        sb.append(')');
                        String sb4 = sb.toString();
                        String str = this.logTag;
                        if (str != null) {
                            Log.m105924i(str, "IndexSql.Builder: sql=" + sb4);
                        }
                        return new IndexSql(sb4);
                    }
                }
                throw new IllegalArgumentException("empty columns");
            }
            throw new IllegalArgumentException("Not support multi table index");
        }

        public final String getName() {
            return this.name;
        }

        public final Table getTable() {
            return this.table;
        }

        public final Builder isUnique(boolean z) {
            this.isUnique = z;
            return this;
        }

        public final Builder log(String str) {
            C87412m.m108594g(str, "tag");
            this.logTag = str;
            return this;
        }

        /* renamed from: on */
        public final Builder mo81861on(List<? extends ISqlColumn> list) {
            C87412m.m108594g(list, "columns");
            this.columns = list;
            return this;
        }

        /* renamed from: on */
        public final Builder mo81862on(ISqlColumn... iSqlColumnArr) {
            C87412m.m108594g(iSqlColumnArr, "columns");
            ArrayList arrayList = new ArrayList(iSqlColumnArr.length);
            for (ISqlColumn add : iSqlColumnArr) {
                arrayList.add(add);
            }
            this.columns = arrayList;
            return this;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IndexSql(String str) {
        super(str, (String[]) null);
        C87412m.m108594g(str, "sql");
    }
}
