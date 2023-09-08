package cj1;

import gy3.C87412m;
import pe3.C89349b;
import te3.C49752hu0;
import te3.C52013xs0;

/* renamed from: cj1.k3 */
public final class C0564k3 extends C0643z0 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0564k3(C52013xs0 xs02) {
        super(xs02);
        C87412m.m108594g(xs02, "msg");
    }

    /* renamed from: q */
    public Object mo563q() {
        byte[] bArr = null;
        if (this.f1530a.f144903e != 20076) {
            return null;
        }
        C49752hu0 hu02 = new C49752hu0();
        C89349b bVar = this.f1530a.f144906h;
        if (bVar != null) {
            bArr = bVar.mo123703f();
        }
        hu02.parseFrom(bArr);
        return hu02;
    }
}
