package bd1;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import p749xh.C66278y2;
import te3.C49183dr2;
import zc1.C66785b;

/* renamed from: bd1.b */
public class C54446b extends C66278y2 implements Cloneable {

    /* renamed from: e1 */
    public static final IAutoDBItem.MAutoDBInfo f152697e1 = C66278y2.initAutoDBInfo(C54446b.class);

    public C54446b() {
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f152697e1;
    }

    /* renamed from: l2 */
    public C54446b clone() {
        C54446b bVar = new C54446b();
        bVar.convertFrom(new C54450j(convertTo(), f152697e1, (List) null, 4, (C8480h) null));
        return bVar;
    }

    /* renamed from: m2 */
    public final C49183dr2 mo75251m2() {
        C49183dr2 dr22 = this.field_prepareFinder;
        return dr22 == null ? new C49183dr2() : dr22;
    }

    /* renamed from: n2 */
    public final boolean mo75252n2() {
        long j = mo75251m2().f132485B;
        C66785b bVar = C66785b.f191882e;
        String str = this.field_username;
        C87412m.m108593f(str, "field_username");
        return (j & 1) != 0 || !bVar.mo90676q0(str);
    }

    public String toString() {
        String contentValues = convertTo().toString();
        C87412m.m108593f(contentValues, "this.convertTo().toString()");
        return contentValues;
    }

    public C54446b(String str) {
        C87412m.m108594g(str, "finderUsername");
        this.field_username = str;
    }
}
