package cj1;

import gy3.C87412m;
import pe3.C89349b;
import te3.C49611gu0;
import te3.C52013xs0;

/* renamed from: cj1.g2 */
public final class C0542g2 extends C0643z0 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0542g2(C52013xs0 xs02) {
        super(xs02);
        C87412m.m108594g(xs02, "msg");
    }

    /* renamed from: q */
    public Object mo563q() {
        byte[] bArr = null;
        if (this.f1530a.f144903e != 20050) {
            return null;
        }
        C49611gu0 gu02 = new C49611gu0();
        C89349b bVar = this.f1530a.f144906h;
        if (bVar != null) {
            bArr = bVar.mo123703f();
        }
        gu02.parseFrom(bArr);
        return gu02;
    }
}
