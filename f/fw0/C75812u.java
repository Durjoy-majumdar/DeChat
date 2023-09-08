package fw0;

import android.content.Context;
import com.tencent.p014mm.autogen.events.StartFavServiceEvent;
import com.tencent.p014mm.modelimage.C68129u;
import com.tencent.p014mm.modelimage.C68135v;
import com.tencent.p014mm.modelimage.C92837k0;
import com.tencent.p014mm.network.C29060q;
import com.tencent.p014mm.pluginsdk.model.app.C72709y1;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C31519v2;
import f40.C86709a0;
import f40.C86718e;
import hd0.C98398h0;
import kd0.C76546u;
import uw2.C78291e;

/* renamed from: fw0.u */
public class C75812u extends C29060q.C29061a {

    /* renamed from: d */
    public final /* synthetic */ Context f222431d;

    public C75812u(Context context) {
        this.f222431d = context;
    }

    public void onNetworkChange(int i) {
        if (i != 4 && i != 6) {
            return;
        }
        if (!C86709a0.m107522a() || C86718e.m107551r()) {
            Log.m105928w("MicroMsg.OnNetworkAvailableListener", "dealWithNetworkAvailable hasSetuin:" + C86709a0.m107522a() + " isHold:" + C86718e.m107551r());
            return;
        }
        C76546u.xx0().mo107480e();
        C98398h0.Dx0().mo137787d();
        C68129u Ax0 = C92837k0.Ax0();
        Ax0.getClass();
        C86709a0.m107528h();
        C86709a0.m107525e().postToWorker(new C68135v(Ax0));
        C72709y1.zx0().mo100171d();
        if (C31519v2.m39437b() != null) {
            ((C78291e) C31519v2.m39437b()).getClass();
            C78291e.wx0().mo108316c();
        }
        new StartFavServiceEvent().publish();
    }
}
