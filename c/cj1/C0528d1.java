package cj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import o40.C61937h;
import pe3.C89349b;
import te3.C51443tt0;
import te3.C52013xs0;

/* renamed from: cj1.d1 */
public final class C0528d1 extends C0643z0 {

    /* renamed from: b */
    public final String f1292b = "FinderLiveComboRewardMsg";

    /* renamed from: c */
    public C51443tt0 f1293c;

    /* renamed from: d */
    public boolean f1294d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0528d1(C52013xs0 xs02) {
        super(xs02);
        C87412m.m108594g(xs02, "msg");
    }

    /* renamed from: q */
    public Object mo563q() {
        byte[] bArr = null;
        if (this.f1530a.f144903e != 20013) {
            return null;
        }
        if (this.f1294d) {
            String str = this.f1292b;
            StringBuilder sb = new StringBuilder();
            sb.append("FinderLiveComboRewardMsg is selfSend getPayLoadContent:");
            Object obj = this.f1293c;
            if (obj == null) {
                obj = "";
            }
            sb.append(C61937h.m72709h(obj));
            Log.m105924i(str, sb.toString());
            return this.f1293c;
        }
        C51443tt0 tt02 = new C51443tt0();
        C89349b bVar = this.f1530a.f144906h;
        if (bVar != null) {
            bArr = bVar.mo123703f();
        }
        tt02.parseFrom(bArr);
        return tt02;
    }
}
