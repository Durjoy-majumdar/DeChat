package com.tencent.kinda.framework.app;

import android.content.DialogInterface;
import com.tencent.kinda.framework.widget.tools.KindaContext;
import com.tencent.kinda.gen.KindaTextStatusSetupManager;
import com.tencent.kinda.gen.VoidBoolStringCallback;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import nj3.C76879j;
import p773yy.C66708h;
import qy2.C63349b0;
import qy2.C77444c0;
import uz2.C52696l;
import uz2.C65489g0;

public class KindaTextStatusSetupManagerImpl implements KindaTextStatusSetupManager {
    private final String TAG = "MicorMsg.KindaTextStatusSetupManagerImpl";

    public void setupTextStatusImpl(String str, final String str2, String str3, int i, final VoidBoolStringCallback voidBoolStringCallback) {
        Log.m105924i("MicorMsg.KindaTextStatusSetupManagerImpl", "leadViewInfo click jump status");
        C52696l lVar = new C52696l();
        lVar.f147154d = str2;
        lVar.f147155e = str3;
        C77444c0 c0Var = new C77444c0((C77444c0.C77445a) null);
        c0Var.f229419d = str;
        c0Var.f229420e = lVar;
        c0Var.f229427o = String.valueOf(i);
        C115669n.INSTANCE.mo160131h(24498, 1, str2);
        ((C66708h) C86312j.m106911c(C66708h.class)).mo90745uq(KindaContext.get(), c0Var, new C63349b0() {
            public void onFinishAction(int i, String str, C65489g0 g0Var) {
                Log.m105925i("MicorMsg.KindaTextStatusSetupManagerImpl", "onFinishAction result :%s", Integer.valueOf(i));
                if (i == 0) {
                    Log.m105924i("MicorMsg.KindaTextStatusSetupManagerImpl", "onFinishAction click ok");
                    C115669n.INSTANCE.mo160131h(24498, 3, str2);
                    if (voidBoolStringCallback != null && g0Var != null && g0Var.f188443d == 2) {
                        Log.m105925i("MicorMsg.KindaTextStatusSetupManagerImpl", "desc :%s", g0Var.f188444e.f188455d);
                        voidBoolStringCallback.call(true, KindaContext.get().getString(C0966R.string.l0n, new Object[]{g0Var.f188444e.f188455d}));
                    }
                } else if (i == 1) {
                    Log.m105924i("MicorMsg.KindaTextStatusSetupManagerImpl", "onFinishAction click error");
                    C115669n.INSTANCE.mo160131h(24498, 4, str2);
                    C76879j.m92754y(KindaContext.get(), KindaContext.get().getString(C0966R.string.l0o), "", KindaContext.get().getString(C0966R.string.kke), new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Log.m105924i("MicorMsg.KindaTextStatusSetupManagerImpl", "click AlertDialog");
                        }
                    });
                } else if (i != 2) {
                    Log.m105924i("MicorMsg.KindaTextStatusSetupManagerImpl", "onFinishAction default");
                } else {
                    Log.m105924i("MicorMsg.KindaTextStatusSetupManagerImpl", "onFinishAction click cancel");
                    C115669n.INSTANCE.mo160131h(24498, 2, str2);
                    VoidBoolStringCallback voidBoolStringCallback = voidBoolStringCallback;
                    if (voidBoolStringCallback != null) {
                        voidBoolStringCallback.call(false, "");
                    }
                }
            }
        });
    }
}
