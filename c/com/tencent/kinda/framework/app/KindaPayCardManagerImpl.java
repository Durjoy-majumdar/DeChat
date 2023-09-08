package com.tencent.kinda.framework.app;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.tencent.kinda.framework.widget.tools.KindaContext;
import com.tencent.kinda.gen.KindaPayCardManager;
import com.tencent.kinda.gen.VoidCallback;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import t53.C77866b;
import yq3.C79143a;
import yq3.C79148e;

public class KindaPayCardManagerImpl implements KindaPayCardManager {
    public void addPayCardImpl(final VoidCallback voidCallback, final VoidCallback voidCallback2) {
        Class<C77866b> cls = C77866b.class;
        Context context = KindaContext.get();
        if (!(context instanceof MMActivity)) {
            Log.m105921e("KindaPayCardManagerImpl", "Fail to start addPayCardImpl due to incompatible context(%s)", context.getClass().getName());
            return;
        }
        Activity activity = (Activity) context;
        activity.getIntent().putExtra("process_id", cls.hashCode());
        Bundle bundle = new Bundle();
        bundle.putInt("key_bind_scene", 0);
        bundle.putBoolean("is_from_new_cashier", true);
        bundle.putString("start_activity_class", activity.getClass().getName());
        C79143a.m95771j(activity, cls, bundle, (C79148e.C79149a) null);
        C79148e g = C79143a.m95768g(activity);
        if (!(g instanceof C77866b)) {
            Log.m105921e("KindaPayCardManagerImpl", "Fail to get correct wallet process in addPayCardImpl, expect BindCardProcess got %s", g.getClass().getName());
            return;
        }
        ((C77866b) g).f226891d = new C77866b.C77873e() {
            public void run(int i) {
                if (i == -1) {
                    voidCallback.call();
                } else {
                    voidCallback2.call();
                }
            }
        };
    }
}
