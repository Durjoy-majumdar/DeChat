package ak2;

import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import nj2.C109749c;
import nj2.C61759g;
import pu0.C110248b;
import wj2.C66131d;
import zj2.C66857b;
import zj2.C66862f;

/* renamed from: ak2.a */
public abstract class C54119a {

    /* renamed from: a */
    public C61759g f151966a;

    /* renamed from: b */
    public C109749c.C61756a f151967b = C109749c.C61756a.VOIP;

    public C54119a(C61759g gVar) {
        C87412m.m108594g(gVar, "helper");
        this.f151966a = gVar;
    }

    /* renamed from: a */
    public final boolean mo74908a(int i) {
        C66862f vx02;
        C110248b.C110249a aVar = C110248b.f329777h;
        if (!aVar.mo161665j() && !aVar.mo161666k() && (C87412m.m108589b(aVar.mo161656a(), "silent") || C87412m.m108589b(aVar.mo161656a(), "vibrate"))) {
            return false;
        }
        try {
            this.f151966a.xx0(C66131d.CLOSE_SOUND, i, false);
            this.f151966a.Ax0((String) null, false, 0);
            if ((aVar.mo161665j() || aVar.mo161666k()) && (vx02 = this.f151966a.vx0()) != null) {
                C66857b bVar = vx02.f192051c;
                if (bVar != null) {
                    bVar.mo36971a(0.5f, 0.5f);
                    vx02.f192057i = -1.0f;
                } else {
                    vx02.f192057i = 0.5f;
                }
            }
            C61759g gVar = this.f151966a;
            boolean l = aVar.mo161667l();
            C66862f vx03 = gVar.vx0();
            if (vx03 != null) {
                vx03.mo90867f(l);
            }
            return true;
        } catch (Throwable th) {
            Log.m105929w("MicroMsg.BaseSceneSetting", "playSound Failed Throwable t = ", th);
            return false;
        }
    }

    /* renamed from: b */
    public abstract boolean mo74909b(String str, Bundle bundle);
}
