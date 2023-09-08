package com.tencent.p014mm.storage;

import androidx.lifecycle.C0123n0;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54209k0;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.ISqlColumn;
import com.tencent.p014mm.sdk.storage.sql.ISqlCondition;
import com.tencent.p014mm.sdk.storage.sql.ISqlOrder;
import com.tencent.p014mm.sdk.storage.sql.SelectSql;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import f40.C86709a0;
import gy3.C8480h;
import i40.C60247c;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import p749xh.C102645g6;
import sx3.C22415w0;

/* renamed from: com.tencent.mm.storage.e4 */
public final class C57594e4 extends C60247c {

    /* renamed from: n */
    public static final C57595a f164913n = new C57595a((C8480h) null);

    /* renamed from: i */
    public final long f164914i = -5000000;

    /* renamed from: j */
    public final AtomicLong f164915j = new AtomicLong(-5000000);

    /* renamed from: com.tencent.mm.storage.e4$a */
    public static final class C57595a {
        public C57595a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C57594e4 mo81948a() {
            C39622i0 a;
            Class cls = C57594e4.class;
            synchronized (C60247c.f171776h) {
                C86709a0.m107523b().mo121108c();
                if (C60247c.class.isAssignableFrom(cls)) {
                    a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls);
                } else {
                    throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                }
            }
            return (C57594e4) a;
        }
    }

    /* renamed from: e3 */
    public boolean mo75299e3() {
        return false;
    }

    /* renamed from: f3 */
    public final C102645g6 mo81947f3() {
        SingleTable singleTable = C102645g6.f302371o;
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        LinkedList linkedList3 = new LinkedList();
        linkedList2.add(C102645g6.f302372p.orderDesc());
        SelectSql.Limit limit = new SelectSql.Limit(1, 0);
        SelectSql.Builder groupBy = C102645g6.f302371o.select((List<? extends ISqlColumn>) linkedList).where((ISqlCondition) null).orderBy((List<? extends ISqlOrder>) linkedList2).groupBy((List<? extends Column>) linkedList3);
        groupBy.limit(limit.getLimit(), limit.getOffset());
        return (C102645g6) groupBy.build().singleQuery(f164913n.mo81948a().getDB(), C102645g6.class);
    }

    public Set<IAutoDBItem> getAutoDBItemSet() {
        return C22415w0.m26092a(new C102645g6());
    }
}
