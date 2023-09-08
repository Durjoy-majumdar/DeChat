package p768ys;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import di3.C86301e;
import di3.C86312j;
import eb0.C31543z5;
import ei3.C86522b;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.List;
import p749xh.C78828v4;
import p823sg.C101611g;
import sz1.C77815b;
import wz1.C78747b;
import xz1.C79013a;
import xz1.C79015c;

@C86522b
/* renamed from: ys.c */
public final class C79151c extends C86301e implements C79152e {
    /* renamed from: kP */
    public void mo109135kP(String str, C79013a aVar) {
        C87412m.m108594g(aVar, "groupSolitatire");
        ((C77815b) C86312j.m106911c(C77815b.class)).vx0().mo108673k(str, aVar);
    }

    /* renamed from: rF */
    public List<C79013a> mo109136rF(String str, String str2) {
        C79015c xx02 = ((C77815b) C86312j.m106911c(C77815b.class)).xx0();
        xx02.getClass();
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return new LinkedList();
        }
        SingleTable singleTable = C78828v4.f231490p;
        Column column = C78828v4.f231491q;
        Column column2 = C78828v4.f231492r;
        Column column3 = C78828v4.f231493s;
        Column column4 = C78828v4.f231494t;
        C101611g<Integer, C79013a> gVar = C78747b.f230457a;
        List<C79013a> multiQuery = singleTable.selectAll().where(column.equal(Util.escapeSqlValue(str)).and(column2.equal(str2)).and(column3.equal((Number) 1)).and(column4.largerEqual((Number) Long.valueOf(((long) C31543z5.m39455e()) - (((long) 5) * C79015c.f232016e.longValue()))))).orderBy(column4.orderDesc()).build().multiQuery(xx02.f232020d, C79013a.class);
        for (C79013a n : multiQuery) {
            C78747b.m95114n(n);
        }
        return multiQuery;
    }
}
