package v82;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import o40.C61926c;
import rx3.C36570n;

/* renamed from: v82.r */
public final class C52798r implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C111474m f147505d;

    public C52798r(C111474m mVar) {
        this.f147505d = mVar;
    }

    public final void run() {
        Log.m105924i("MicroMsg.MT.ControlPanelLogic", "controlBottomLayout height update");
        C111474m mVar = this.f147505d;
        C111474m.m151983a(mVar, (int) mVar.mo163178c().getY());
        C111474m mVar2 = this.f147505d;
        int intValue = ((Number) ((C36570n) mVar2.f333760v).getValue()).intValue();
        View c = this.f147505d.mo163178c();
        C87412m.m108593f(c, "controlBottomLayout");
        mVar2.f333755q.invoke(Integer.valueOf(intValue - C61926c.m72689n(c)[1]));
    }
}
