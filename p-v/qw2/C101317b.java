package qw2;

import android.os.Looper;
import com.tencent.p014mm.app.C114661d0;
import com.tencent.p014mm.plugin.subapp.jdbiz.C96461f;
import com.tencent.p014mm.plugin.subapp.jdbiz.C96462g;
import com.tencent.p014mm.plugin.subapp.jdbiz.C96463h;
import com.tencent.p014mm.pluginsdk.platformtools.C96796d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C97625j3;

/* renamed from: qw2.b */
public class C101317b extends C114661d0.C28676a {
    public void onAppBackground(String str) {
    }

    public void onAppForeground(String str) {
        if (C96796d.m124292a() != null) {
            C96463h.yx0().getClass();
            if (C97625j3.m125811a()) {
                if (!C96463h.yx0().Ex0()) {
                    C96463h.yx0().getClass();
                    if (!"1".equals((String) C97625j3.m125812b().mo105906u().mo119684e(327938, ""))) {
                        return;
                    }
                }
                C96461f Dx0 = C96463h.yx0().Dx0();
                if ((!Util.isNullOrNil(Dx0.f282221g) || Dx0.f282220f) && Dx0.mo134436d()) {
                    Log.m105924i("MicroMsg.SubCoreJdIP6", "clear red dot/friend dot");
                    C96463h.yx0().wx0();
                    C96463h.yx0().vx0();
                    C96463h yx02 = C96463h.yx0();
                    yx02.getClass();
                    new MMHandler(Looper.getMainLooper()).post(new C96462g(yx02));
                }
            }
        }
    }
}
