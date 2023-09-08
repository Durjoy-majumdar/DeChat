package com.tencent.kinda.framework.app;

import a63.C67008a;
import android.content.Context;
import com.tencent.kinda.framework.widget.tools.KindaContext;
import com.tencent.kinda.gen.KRealNameService;
import com.tencent.kinda.gen.VoidCallback;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import cr3.C75281f;
import cr3.C75296i;
import di3.C86312j;
import p281yz.C79173v;

public class KindaRealNameServiceImpl implements KRealNameService {
    private static final String TAG = "MicroMsg.KindaRealNameServiceImpl";

    public void checkRealnameLicenseImpl(int i, VoidCallback voidCallback, VoidCallback voidCallback2, VoidCallback voidCallback3, VoidCallback voidCallback4) {
        MMActivity mMActivity = null;
        C75296i iVar = new C75296i(KindaContext.get(), (C75281f) null);
        final VoidCallback voidCallback5 = voidCallback;
        final VoidCallback voidCallback6 = voidCallback2;
        final VoidCallback voidCallback7 = voidCallback3;
        final VoidCallback voidCallback8 = voidCallback4;
        C675311 r4 = new C67008a.C67019k() {
            public void onRequesting() {
                voidCallback7.call();
            }

            public void onResponsed() {
                voidCallback8.call();
            }

            public boolean run(int i, int i2, String str, boolean z) {
                if (i != 0) {
                    Log.m105921e(KindaRealNameServiceImpl.TAG, "WalletGetDisclaimerCallback resultCode=%d,errMsg=%s,errcode=%d", Integer.valueOf(i), str, Integer.valueOf(i2));
                    voidCallback5.call();
                } else if (z) {
                    voidCallback5.call();
                } else {
                    voidCallback6.call();
                }
                return true;
            }
        };
        Context context = KindaContext.get();
        if (context instanceof MMActivity) {
            mMActivity = (MMActivity) context;
        }
        ((C79173v) C86312j.m106911c(C79173v.class)).f232485t.mo90979g(mMActivity, i, iVar, r4, false, 1, false);
    }
}
