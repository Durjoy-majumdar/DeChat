package com.tencent.kinda.framework.app;

import android.content.Context;
import android.os.Bundle;
import com.tencent.kinda.framework.widget.tools.KindaContext;
import com.tencent.kinda.gen.KindaPasswordManager;
import com.tencent.kinda.gen.VoidCallback;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import i53.C76286a;
import yq3.C79143a;
import yq3.C79148e;

public class KindaPasswordManagerImpl implements KindaPasswordManager {
    private final String KEY_PROCESS_ID = "process_id";
    private final String TAG = "KindaPasswordManagerImpl";

    public void startResetPasswordImpl(final VoidCallback voidCallback, final VoidCallback voidCallback2, boolean z) {
        Class<C76286a> cls = C76286a.class;
        final Context context = KindaContext.get();
        if (!(context instanceof MMActivity)) {
            context.getClass();
            Log.m105921e("KindaPasswordManagerImpl", "Fail to start ResetPasswordImpl due to incompatible context(%s)", context.getClass().getName());
            return;
        }
        MMActivity mMActivity = (MMActivity) context;
        mMActivity.getIntent().putExtra("process_id", cls.hashCode());
        Bundle bundle = new Bundle();
        bundle.putBoolean("isFromKinda", true);
        bundle.putBoolean("isDomesticUser", z);
        C79143a.m95771j(mMActivity, cls, bundle, (C79148e.C79149a) null);
        C79148e g = C79143a.m95768g(mMActivity);
        if (!(g instanceof C76286a)) {
            Log.m105921e("KindaPasswordManagerImpl", "Fail to get correct wallet process in ResetPasswordImpl, expect ForgotPwdProcess got %s", g.getClass().getName());
            return;
        }
        ((C76286a) g).f223481d = new C76286a.C76293g() {
            public void run(int i) {
                KindaContext.popToContext(context);
                if (i == 0) {
                    voidCallback.call();
                } else {
                    voidCallback2.call();
                }
            }
        };
    }
}
