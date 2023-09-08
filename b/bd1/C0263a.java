package bd1;

import com.tencent.tmassistantsdk.storage.table.ClientInfoTable;
import gy3.C87412m;
import te3.C49783i10;
import te3.C49849ii0;

/* renamed from: bd1.a */
public final class C0263a {

    /* renamed from: a */
    public final String f807a;

    /* renamed from: b */
    public String f808b = "";

    /* renamed from: c */
    public String f809c = "";

    /* renamed from: d */
    public String f810d = "";

    /* renamed from: e */
    public C49849ii0 f811e;

    /* renamed from: f */
    public C49849ii0 f812f;

    /* renamed from: g */
    public int f813g;

    /* renamed from: h */
    public int f814h;

    /* renamed from: i */
    public int f815i;

    /* renamed from: j */
    public int f816j;

    /* renamed from: k */
    public C49783i10 f817k;

    public C0263a(String str) {
        C87412m.m108594g(str, ClientInfoTable.Columns.CLIENTID);
        this.f807a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0263a) && C87412m.m108589b(this.f807a, ((C0263a) obj).f807a);
    }

    public int hashCode() {
        return this.f807a.hashCode();
    }

    public String toString() {
        return "CreateFinderAccountArgs(clientId=" + this.f807a + ')';
    }
}
