package cj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import pe3.C89349b;
import te3.C49049cu0;
import te3.C52013xs0;

/* renamed from: cj1.w1 */
public final class C0631w1 extends C0643z0 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0631w1(C52013xs0 xs02) {
        super(xs02);
        C87412m.m108594g(xs02, "msg");
    }

    /* renamed from: q */
    public Object mo563q() {
        byte[] bArr = null;
        if (this.f1530a.f144903e != 20047) {
            return null;
        }
        C49049cu0 cu02 = new C49049cu0();
        C89349b bVar = this.f1530a.f144906h;
        if (bVar != null) {
            bArr = bVar.mo123703f();
        }
        if (bArr != null) {
            try {
                cu02.parseFrom(bArr);
            } catch (Exception e) {
                Log.printDebugStack("safeParser", "", e);
            }
        }
        return cu02;
    }
}
