package bi3;

import com.tencent.p014mm.sdk.storage.sql.ISqlOrder;

/* renamed from: bi3.b */
public final class C54461b implements ISqlOrder {
    public String[] params() {
        return ISqlOrder.DefaultImpls.params(this);
    }

    public String toSql() {
        return " upper(flag) desc,  upper(conversationTime) desc";
    }
}
