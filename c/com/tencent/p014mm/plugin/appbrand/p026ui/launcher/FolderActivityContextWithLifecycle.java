package com.tencent.p014mm.plugin.appbrand.p026ui.launcher;

import android.content.ContextWrapper;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.p136ui.MMActivity;
import cu0.C75304a;
import zr0.C91931a;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.launcher.FolderActivityContextWithLifecycle */
public abstract class FolderActivityContextWithLifecycle extends ContextWrapper implements C91931a, C0124r {
    public FolderActivityContextWithLifecycle(MMActivity mMActivity) {
        super(mMActivity);
    }

    /* renamed from: a */
    public final MMActivity mo117251a() {
        return (MMActivity) getBaseContext();
    }

    /* renamed from: b */
    public void mo117188b(Intent intent) {
    }

    @C112974b0(C39623j.C39625b.ON_CREATE)
    public final void onActivityDidCreateCall() {
        mo117188b(mo117251a().getIntent());
    }

    @C112974b0(C39623j.C39625b.ON_RESUME)
    public void onActivityDidResume() {
    }

    @C112974b0(C39623j.C39625b.ON_DESTROY)
    public void onActivityWillDestroy() {
        View findViewById = mo117251a().findViewById(16908290);
        if (findViewById instanceof ViewGroup) {
            C75304a.m90323a((ViewGroup) findViewById);
        }
    }

    @C112974b0(C39623j.C39625b.ON_PAUSE)
    public void onActivityWillPause() {
    }
}
