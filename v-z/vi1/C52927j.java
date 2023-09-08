package vi1;

import a14.C53872d1;
import a14.C53934p0;
import al1.C39611s;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.sdk.platformtools.Log;
import nk1.C11207i;
import wx3.C15601d;

/* renamed from: vi1.j */
public final class C52927j<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C52931n f147776d;

    public C52927j(C52931n nVar) {
        this.f147776d = nVar;
    }

    public void onChanged(Object obj) {
        C39611s sVar = (C39611s) obj;
        Log.m105924i("MicIntercomPlugin", "receive micCloseEvent: " + sVar);
        if (sVar != null) {
            C52931n nVar = this.f147776d;
            nVar.getClass();
            C11207i.m11072h(nVar, C53872d1.f151119c, (C53934p0) null, new C52924i(nVar, false, sVar, (C15601d<? super C52924i>) null), 2, (Object) null);
        }
    }
}
