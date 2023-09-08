package ne1;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ei3.C86522b;
import gy3.C87412m;
import ht1.C8774i3;
import ht1.C8794p5;
import pe3.C89349b;
import te3.C49411fd1;

@C86522b
/* renamed from: ne1.f0 */
public final class C47232f0 extends C61685z0<C49411fd1> implements C8774i3 {

    /* renamed from: e */
    public final String f126798e = "Finder.FinderModMessageSetting";

    /* renamed from: h8 */
    public void mo9596h8(boolean z) {
        C49411fd1 fd12 = new C49411fd1();
        fd12.f133437d = z ? 1 : 0;
        C61685z0.Ax0(this, fd12, (C8794p5) null, false, false, 12, (Object) null);
    }

    public C89349b vx0(Object obj) {
        C49411fd1 fd12 = (C49411fd1) obj;
        C87412m.m108594g(fd12, "cmdBufItem");
        return C89349b.m111674a(fd12.toByteArray());
    }

    public int xx0() {
        return 8;
    }

    public String yx0() {
        return this.f126798e;
    }

    public void zx0(Object obj, int i) {
        C49411fd1 fd12 = (C49411fd1) obj;
        C87412m.m108594g(fd12, "cmdBufItem");
        String str = this.f126798e;
        Log.m105924i(str, "opType=" + fd12.f133437d + " retcode:" + i);
        if (i != 0) {
            C115669n.INSTANCE.mo175913w(1473, 10, 1);
        }
    }
}
