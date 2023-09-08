package bi3;

import com.tencent.p014mm.contact.C40294d;
import com.tencent.p014mm.contact.ContactUpgradeHelper;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.ColumnOrder;
import com.tencent.p014mm.sdk.storage.sql.ISqlColumn;
import com.tencent.p014mm.sdk.storage.sql.ISqlCondition;
import com.tencent.p014mm.sdk.storage.sql.ISqlOrder;
import com.tencent.p014mm.sdk.storage.sql.SelectSql;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import com.tencent.p014mm.sdk.storage.sql.Sql;
import com.tencent.p014mm.storage.C72996z1;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import p749xh.C53339k1;
import sx3.C110818d0;
import sx3.C26236u;
import sx3.C64197v;

/* renamed from: bi3.a */
public final class C0289a {

    /* renamed from: a */
    public static final C0290a f857a = new C0290a((C8480h) null);

    /* renamed from: bi3.a$a */
    public static final class C0290a {

        /* renamed from: bi3.a$a$a */
        public static final class C0291a implements ISqlOrder {
            public String[] params() {
                return ISqlOrder.DefaultImpls.params(this);
            }

            public String toSql() {
                return " case when length(conRemarkPYFull) > 0 then upper(conRemarkPYFull)  else upper(quanPin) end asc,  case when length(conRemark) > 0 then upper(conRemark)  else upper(quanPin) end asc,  upper(quanPin) asc,  upper(nickname) asc,  upper(username) asc ";
            }
        }

        public C0290a(C8480h hVar) {
        }

        /* renamed from: a */
        public final boolean mo336a() {
            boolean a = ContactUpgradeHelper.f10280h.mo1134a();
            Column column = C53339k1.f149476j1;
            IAutoDBItem.MAutoDBInfo mAutoDBInfo = C40294d.f108318T1;
            ISqlCondition bitAndEqual = column.bitAndEqual(8, 0);
            bitAndEqual.and(a ? C53339k1.f149479m1.equal((Number) 2L) : C53339k1.f149475i1.like("'@chatroom'"));
            LinkedList linkedList = new LinkedList();
            LinkedList linkedList2 = new LinkedList();
            LinkedList linkedList3 = new LinkedList();
            linkedList.add(C53339k1.f149475i1);
            return C53339k1.f149474h1.select((List<? extends ISqlColumn>) linkedList).where(bitAndEqual).orderBy((List<? extends ISqlOrder>) linkedList2).groupBy((List<? extends Column>) linkedList3).build().isExist(C86709a0.m107535s().f251811i);
        }

        /* renamed from: b */
        public final List<String> mo337b(List<String> list) {
            C87412m.m108594g(list, "usernameList");
            SingleTable singleTable = C53339k1.f149474h1;
            Column column = C53339k1.f149475i1;
            Set<T> D0 = C110818d0.m150904D0(singleTable.select((List<? extends ISqlColumn>) C26236u.m33719b(column)).where(column.inString(list).and(C53339k1.f149477k1.bitAndEqual(8, 0))).build().multiString(C86709a0.m107535s().f251811i));
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                if (D0.contains(str)) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        }

        /* renamed from: c */
        public final List<C72996z1> mo338c(List<String> list) {
            C87412m.m108594g(list, "usernameList");
            SelectSql build = C53339k1.f149474h1.selectAll().where(C53339k1.f149475i1.inString(list)).build();
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (C72996z1 z1Var : build.multiQuery(C86709a0.m107535s().f251811i, C72996z1.class)) {
                String username = z1Var.getUsername();
                C87412m.m108593f(username, "contact.username");
                hashMap.put(username, z1Var);
            }
            for (String str : list) {
                C72996z1 z1Var2 = (C72996z1) hashMap.get(str);
                if (z1Var2 != null) {
                    arrayList.add(z1Var2);
                }
            }
            return arrayList;
        }

        /* renamed from: d */
        public final ISqlCondition mo339d() {
            Column column = C53339k1.f149476j1;
            IAutoDBItem.MAutoDBInfo mAutoDBInfo = C40294d.f108318T1;
            ISqlCondition and = column.bitAndEqual(1, 1).and(new Sql.BitAndEqual("type", 32, 0)).and(new Sql.BitAndEqual("type", 8, 0));
            int i = C72996z1.f214113Y1;
            return and.and(new Sql.BitAndEqual("verifyFlag", 8, 0));
        }

        /* renamed from: e */
        public final List<ISqlOrder> mo340e() {
            return C64197v.m75537f(new ColumnOrder("showHead", false, 2, (C8480h) null), new C0291a());
        }
    }
}
