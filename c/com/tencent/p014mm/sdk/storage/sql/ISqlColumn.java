package com.tencent.p014mm.sdk.storage.sql;

import com.tencent.p014mm.sdk.storage.sql.ISqlObj;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/sql/ISqlColumn;", "Lcom/tencent/mm/sdk/storage/sql/ISqlObj;", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.sdk.storage.sql.ISqlColumn */
public interface ISqlColumn extends ISqlObj {

    @Metadata(mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.storage.sql.ISqlColumn$DefaultImpls */
    public static final class DefaultImpls {
        public static String[] params(ISqlColumn iSqlColumn) {
            return ISqlObj.DefaultImpls.params(iSqlColumn);
        }
    }
}
