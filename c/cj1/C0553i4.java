package cj1;

import gy3.C87412m;
import pe3.C89349b;
import te3.C51877wu0;
import te3.C52013xs0;

/* renamed from: cj1.i4 */
public final class C0553i4 extends C0643z0 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0553i4(C52013xs0 xs02) {
        super(xs02);
        C87412m.m108594g(xs02, "msg");
    }

    /* renamed from: q */
    public Object mo563q() {
        byte[] bArr = null;
        if (this.f1530a.f144903e != 20014) {
            return null;
        }
        C51877wu0 wu02 = new C51877wu0();
        C89349b bVar = this.f1530a.f144906h;
        if (bVar != null) {
            bArr = bVar.mo123703f();
        }
        wu02.parseFrom(bArr);
        return wu02;
    }
}
