package l02;

import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.SelectSql;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86301e;
import ei3.C86522b;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C87412m;
import i40.C60247c;
import java.util.LinkedList;
import java.util.List;
import m02.C46940b;
import n02.C100030c;
import n02.C34715b;
import n02.C34720e;
import n02.C61596a;
import o02.C35072a;
import z04.C112551y;

@C86522b
/* renamed from: l02.h */
public final class C99275h extends C86301e implements C46940b {
    public C72996z1 K30(String str, int i) {
        String g3 = vx0().mo139360g3(str, i);
        if (g3 == null) {
            return null;
        }
        C72996z1 N2 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69664N2(g3);
        if (N2.mo62927s3()) {
            return N2;
        }
        return null;
    }

    public List<String> Vg0(List<String> list, int i) {
        C100030c vx02 = vx0();
        LinkedList linkedList = new LinkedList();
        if (list != null) {
            for (String g3 : list) {
                String g35 = vx02.mo139360g3(g3, i);
                if (g35 == null) {
                    g35 = "";
                }
                linkedList.add(g35);
            }
        }
        return linkedList;
    }

    /* renamed from: cE */
    public String mo72126cE(String str, int i) {
        C100030c vx02 = vx0();
        if (str == null || C112551y.m153811k(str)) {
            return "";
        }
        C100030c.C34717b bVar = vx02.f293055f;
        bVar.getClass();
        C87412m.m108594g(str, "userName");
        C34715b a = bVar.mo59708a(new C34720e(str));
        if (a == null) {
            SingleTable singleTable = C35072a.f94102g;
            C87412m.m108593f(singleTable, "TABLE");
            Column column = C35072a.f94103h;
            C87412m.m108593f(column, "USERNAME");
            SelectSql.Builder selectAll = singleTable.selectAll();
            String escapeSqlValue = Util.escapeSqlValue(str);
            C87412m.m108593f(escapeSqlValue, "escapeSqlValue(userName)");
            a = (C34715b) selectAll.where(column.equal(escapeSqlValue)).build().singleQuery(vx02.getDbProvider().getDB(), C34715b.class);
            if (a != null) {
                vx02.f293055f.mo59709b(a);
            } else {
                a = new C34715b();
                a.field_UserName = str;
                a.field_HashUserName = vx02.mo139357c3(str, vx02.mo139359f3());
                a.field_CommHashUserName = vx02.mo139357c3(str, vx02.mo139358e3());
                a.field_HardCodeHashUserName = vx02.mo139357c3(str, vx02.mo139356a());
                vx02.f293055f.mo59709b(a);
            }
        }
        return i != 2 ? i != 3 ? a.field_HashUserName : a.field_HardCodeHashUserName : a.field_CommHashUserName;
    }

    /* renamed from: jk */
    public String mo72127jk(String str, int i) {
        return vx0().mo139360g3(str, i);
    }

    public final C100030c vx0() {
        Class cls = C61596a.class;
        C60247c.C60248a aVar = C60247c.f171775g;
        String str = C100030c.f293052g;
        ((C61596a) aVar.mo85234a(cls)).mo85232c3(C100030c.f293052g);
        return (C100030c) ((C60247c) aVar.mo85234a(cls)).mo85233d3(C100030c.class);
    }
}
