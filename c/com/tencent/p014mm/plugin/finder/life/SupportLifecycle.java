package com.tencent.p014mm.plugin.finder.life;

import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import dg1.C58263a;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.finder.life.SupportLifecycle */
public abstract class SupportLifecycle {

    /* renamed from: d */
    public C55872a f159163d;

    /* renamed from: e */
    public final C55872a[] f159164e;

    /* renamed from: f */
    public C58263a f159165f;

    /* renamed from: com.tencent.mm.plugin.finder.life.SupportLifecycle$a */
    public enum C55872a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY
    }

    public SupportLifecycle() {
        C55872a aVar = C55872a.ON_ANY;
        this.f159163d = aVar;
        this.f159164e = new C55872a[]{C55872a.ON_CREATE, C55872a.ON_START, C55872a.ON_RESUME, aVar};
    }

    /* renamed from: x1 */
    public final void mo77491x1(MMFragmentActivity mMFragmentActivity, C58263a aVar) {
        C87412m.m108594g(mMFragmentActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Log.m105924i("Finder.EventObserver", "life " + mMFragmentActivity + ' ' + this);
        SupportLifecycle$life$1 supportLifecycle$life$1 = new SupportLifecycle$life$1(this, aVar, mMFragmentActivity);
        this.f159165f = supportLifecycle$life$1;
        mMFragmentActivity.getLifecycle().addObserver(supportLifecycle$life$1);
    }
}
