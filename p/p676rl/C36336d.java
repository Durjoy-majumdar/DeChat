package p676rl;

import gy3.C87412m;
import p248ug.C37467u;
import p696tl.C37114a;

/* renamed from: rl.d */
public final class C36336d {

    /* renamed from: a */
    public final int f96712a;

    /* renamed from: b */
    public final C37467u f96713b;

    /* renamed from: c */
    public final C37114a f96714c;

    public C36336d(int i, C37467u uVar, C37114a aVar) {
        C87412m.m108594g(uVar, "item");
        C87412m.m108594g(aVar, "executor");
        this.f96712a = i;
        this.f96713b = uVar;
        this.f96714c = aVar;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C36336d) {
            return C87412m.m108589b(((C36336d) obj).f96713b.field_functionmsgid, this.f96713b.field_functionmsgid);
        }
        return false;
    }

    public String toString() {
        return "FunctionMsgTask(mOpCode=" + this.f96712a + ", mItem=" + this.f96713b + ')';
    }
}
