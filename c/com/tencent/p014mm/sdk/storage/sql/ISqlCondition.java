package com.tencent.p014mm.sdk.storage.sql;

import com.tencent.p014mm.sdk.storage.sql.ISqlObj;
import java.util.Set;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H&J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H&¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/sql/ISqlCondition;", "Lcom/tencent/mm/sdk/storage/sql/ISqlObj;", "and", "cond", "getAllCondition", "", "or", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.sdk.storage.sql.ISqlCondition */
public interface ISqlCondition extends ISqlObj {

    @Metadata(mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.storage.sql.ISqlCondition$DefaultImpls */
    public static final class DefaultImpls {
        public static String[] params(ISqlCondition iSqlCondition) {
            return ISqlObj.DefaultImpls.params(iSqlCondition);
        }
    }

    ISqlCondition and(ISqlCondition iSqlCondition);

    Set<ISqlCondition> getAllCondition();

    /* renamed from: or */
    ISqlCondition mo81855or(ISqlCondition iSqlCondition);
}
