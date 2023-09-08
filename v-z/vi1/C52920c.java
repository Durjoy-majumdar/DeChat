package vi1;

import androidx.lifecycle.C0120a0;
import cl1.C39981t0;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j50.C60735a;

/* renamed from: vi1.c */
public final class C52920c<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C65750a f147756d;

    public C52920c(C65750a aVar) {
        this.f147756d = aVar;
    }

    public void onChanged(Object obj) {
        Class cls = C39981t0.class;
        if (C87412m.m108589b((Boolean) obj, Boolean.TRUE)) {
            this.f147756d.mo10792g(4);
            return;
        }
        this.f147756d.mo10792g(8);
        this.f147756d.mo89764f1();
        FinderLiveService.f159376d.getClass();
        C60735a aVar = FinderLiveService.f159378f;
        boolean z = true;
        if (aVar == null || !aVar.mo85682Z()) {
            z = false;
        }
        if (z && ((C39981t0) this.f147756d.mo87696x0(cls)).f107203r) {
            Log.m105924i("FinderLiveMicIntercomBo", "micIntercomEnable close startTrtcExitRoom");
            ((C39981t0) this.f147756d.mo87696x0(cls)).mo62591i3();
        }
    }
}
