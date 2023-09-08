package cm1;

import com.tencent.p014mm.protocal.protobuf.FinderContact;
import gy3.C87412m;
import jq3.C9493c;
import tf1.C13914m;

/* renamed from: cm1.q */
public final class C0767q implements C9493c, C13914m {

    /* renamed from: d */
    public FinderContact f1809d;

    public C0767q(FinderContact finderContact) {
        C87412m.m108594g(finderContact, "contact");
        this.f1809d = finderContact;
    }

    /* renamed from: c */
    public int mo75c() {
        return C0767q.class.getName().hashCode();
    }

    /* renamed from: f */
    public int mo76f(C13914m mVar) {
        C87412m.m108594g(mVar, "obj");
        return 0;
    }

    public long getItemId() {
        String str = this.f1809d.username;
        return (long) (str != null ? str.hashCode() : 0);
    }
}
