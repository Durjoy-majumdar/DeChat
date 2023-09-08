package cj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import pe3.C89349b;
import te3.C50083k51;
import te3.C51873wt0;
import te3.C52013xs0;

/* renamed from: cj1.e1 */
public final class C0534e1 extends C0643z0 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0534e1(C52013xs0 xs02) {
        super(xs02);
        C87412m.m108594g(xs02, "msg");
    }

    public String getContent() {
        String str;
        Object q = mo563q();
        C50083k51 k512 = null;
        C51873wt0 wt02 = q instanceof C51873wt0 ? (C51873wt0) q : null;
        if (wt02 == null || wt02.f144251d != 2) {
            return "";
        }
        C50083k51 k513 = new C50083k51();
        C89349b bVar = wt02.f144252e;
        byte[] f = bVar != null ? bVar.mo123703f() : null;
        if (f != null) {
            try {
                k513.parseFrom(f);
                k512 = k513;
            } catch (Exception e) {
                Log.printDebugStack("safeParser", "", e);
            }
        }
        return (k512 == null || (str = k512.f136567d) == null) ? "" : str;
    }

    /* renamed from: q */
    public Object mo563q() {
        byte[] bArr = null;
        if (this.f1530a.f144903e != 20074) {
            return null;
        }
        C51873wt0 wt02 = new C51873wt0();
        C89349b bVar = this.f1530a.f144906h;
        if (bVar != null) {
            bArr = bVar.mo123703f();
        }
        wt02.parseFrom(bArr);
        return wt02;
    }
}
