package com.tencent.p014mm.sdk.storage.sql;

import com.tencent.p014mm.sdk.storage.sql.ISqlCondition;
import gy3.C87412m;
import java.util.Set;
import kotlin.Metadata;
import sx3.C22415w0;

@Metadata(mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0016J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0016¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/sql/SingleCondition;", "Lcom/tencent/mm/sdk/storage/sql/ISqlCondition;", "()V", "and", "cond", "getAllCondition", "", "or", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.sdk.storage.sql.SingleCondition */
public abstract class SingleCondition implements ISqlCondition {
    public ISqlCondition and(ISqlCondition iSqlCondition) {
        C87412m.m108594g(iSqlCondition, "cond");
        return new MultiCondition(this).and(iSqlCondition);
    }

    public Set<ISqlCondition> getAllCondition() {
        return C22415w0.m26092a(this);
    }

    /* renamed from: or */
    public ISqlCondition mo81855or(ISqlCondition iSqlCondition) {
        C87412m.m108594g(iSqlCondition, "cond");
        return new MultiCondition(this).mo81855or(iSqlCondition);
    }

    public String[] params() {
        return ISqlCondition.DefaultImpls.params(this);
    }
}
