package cj1;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import pe3.C89349b;
import te3.C50310lu0;
import te3.C52013xs0;
import te3.C64311db1;

/* renamed from: cj1.y3 */
public final class C0642y3 extends C0643z0 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0642y3(C52013xs0 xs02) {
        super(xs02);
        C87412m.m108594g(xs02, "msg");
    }

    public String getContent() {
        C64311db1 db12;
        Object q = mo563q();
        String str = null;
        C50310lu0 lu02 = q instanceof C50310lu0 ? (C50310lu0) q : null;
        String str2 = (lu02 == null || (db12 = lu02.f137642d) == null) ? null : db12.f182663f;
        if (str2 != null) {
            Object q2 = mo563q();
            C50310lu0 lu03 = q2 instanceof C50310lu0 ? (C50310lu0) q2 : null;
            String str3 = lu03 != null ? lu03.f137643e : null;
            if (!(str3 == null || str3.length() == 0)) {
                Object q3 = mo563q();
                C50310lu0 lu04 = q3 instanceof C50310lu0 ? (C50310lu0) q3 : null;
                if (lu04 != null) {
                    str = lu04.f137643e;
                }
            } else {
                str = MMApplicationContext.getContext().getString(C0966R.string.djn, new Object[]{str2});
            }
            return str == null ? "" : str;
        }
    }

    /* renamed from: q */
    public Object mo563q() {
        byte[] bArr = null;
        if (this.f1530a.f144903e != 20035) {
            return null;
        }
        C50310lu0 lu02 = new C50310lu0();
        C89349b bVar = this.f1530a.f144906h;
        if (bVar != null) {
            bArr = bVar.mo123703f();
        }
        lu02.parseFrom(bArr);
        return lu02;
    }
}
