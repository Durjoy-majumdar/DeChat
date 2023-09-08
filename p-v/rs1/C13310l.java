package rs1;

import cm1.C0740i2;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import gy3.C87412m;
import java.util.List;
import tf1.C13914m;

/* renamed from: rs1.l */
public final class C13310l implements C0740i2 {

    /* renamed from: d */
    public final FinderContact f37767d;

    /* renamed from: e */
    public final String f37768e;

    /* renamed from: f */
    public final List<FinderObject> f37769f;

    public C13310l(FinderContact finderContact, String str, List<? extends FinderObject> list) {
        C87412m.m108594g(finderContact, "contact");
        C87412m.m108594g(str, "friend_follow_count_text");
        C87412m.m108594g(list, "objects");
        this.f37767d = finderContact;
        this.f37768e = str;
        this.f37769f = list;
    }

    /* renamed from: c */
    public int mo75c() {
        return 0;
    }

    /* renamed from: f */
    public int mo76f(C13914m mVar) {
        C87412m.m108594g(mVar, "obj");
        int i = 0;
        if (!(mVar instanceof C13310l)) {
            return 0;
        }
        String str = this.f37767d.username;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = ((C13310l) mVar).f37767d.username;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return C87412m.m108596i(hashCode, i);
    }

    public long getItemId() {
        String str = this.f37767d.username;
        return (long) (str != null ? str.hashCode() : 0);
    }
}
