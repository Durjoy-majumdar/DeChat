package sl1;

import al1.C0082q;
import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;
import d60.C58124b;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rl1.C13022d0;
import rx3.C13598b0;
import te3.C52204z21;
import y50.C15936n0;

/* renamed from: sl1.g */
public final class C13726g extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C13717e f38825d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13726g(C13717e eVar) {
        super(0);
        this.f38825d = eVar;
    }

    public Object invoke() {
        C13713b bVar;
        C0082q qVar;
        C52204z21 z212;
        Class cls = C13022d0.class;
        C13717e eVar = this.f38825d;
        eVar.f38813t--;
        String str = eVar.f38805i;
        boolean z = false;
        if (!(str == null || str.length() == 0)) {
            C13717e eVar2 = this.f38825d;
            String str2 = eVar2.f38805i;
            C0082q qVar2 = ((C13022d0) eVar2.f38801e.mo71262a(cls)).f37098n;
            if (C87412m.m108589b(str2, (qVar2 == null || (z212 = qVar2.f509d) == null) ? null : z212.f145640d) && (qVar = ((C13022d0) this.f38825d.f38801e.mo71262a(cls)).f37098n) != null) {
                qVar.f507b = this.f38825d.f38813t;
            }
        }
        C13717e eVar3 = this.f38825d;
        int i = eVar3.f38813t;
        if (i >= 0) {
            if (eVar3.f38804h == null) {
                Log.m105924i(eVar3.f38803g, "viewCallback is empty!");
            }
            C0082q qVar3 = ((C13022d0) eVar3.f38801e.mo71262a(cls)).f37098n;
            if (qVar3 != null && qVar3.f506a == 1) {
                z = true;
            }
            if (z && (bVar = eVar3.f38804h) != null) {
                bVar.mo13091K(C15936n0.C15937a.m14866a(C15936n0.f42815a, i, XVFSFile.PATH_SEPARATOR, false, false, false, 24, (Object) null));
            }
            C58124b.C7172a.m7372a(eVar3.f38802f, C58124b.C58125b.FINDER_LIVE_LOTTERY_UPDATE_COUNTDOWN, (Bundle) null, 2, (Object) null);
        }
        C13717e eVar4 = this.f38825d;
        int i2 = eVar4.f38813t;
        if (i2 <= 0) {
            eVar4.mo13103x(i2);
        }
        return C13598b0.f38549a;
    }
}
