package com.tencent.p014mm.plugin.finder.life;

import androidx.lifecycle.C0125s;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.finder.life.SupportLifecycle;
import com.tencent.p014mm.sdk.platformtools.Log;
import dg1.C58263a;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/finder/life/SupportLifecycle$life$1", "Ldg1/a;", "plugin-finder-base_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.life.SupportLifecycle$life$1 */
public final class SupportLifecycle$life$1 implements C58263a {

    /* renamed from: d */
    public final /* synthetic */ SupportLifecycle f159174d;

    /* renamed from: e */
    public final /* synthetic */ C58263a f159175e;

    /* renamed from: f */
    public final /* synthetic */ MMFragmentActivity f159176f;

    public SupportLifecycle$life$1(SupportLifecycle supportLifecycle, C58263a aVar, MMFragmentActivity mMFragmentActivity) {
        this.f159174d = supportLifecycle;
        this.f159175e = aVar;
        this.f159176f = mMFragmentActivity;
    }

    public void onCreate(C0125s sVar) {
        C87412m.m108594g(sVar, "var1");
        this.f159174d.f159163d = SupportLifecycle.C55872a.ON_CREATE;
        C58263a aVar = this.f159175e;
        if (aVar != null) {
            aVar.onCreate(sVar);
        }
    }

    public void onDestroy(C0125s sVar) {
        C87412m.m108594g(sVar, "var1");
        this.f159174d.f159163d = SupportLifecycle.C55872a.ON_DESTROY;
        C58263a aVar = this.f159175e;
        if (aVar != null) {
            aVar.onDestroy(sVar);
        }
        SupportLifecycle supportLifecycle = this.f159174d;
        C58263a aVar2 = supportLifecycle.f159165f;
        if (aVar2 != null) {
            MMFragmentActivity mMFragmentActivity = this.f159176f;
            Log.m105924i("Finder.EventObserver", "auto life remove " + mMFragmentActivity + " this" + supportLifecycle);
            mMFragmentActivity.getLifecycle().removeObserver(aVar2);
            supportLifecycle.f159165f = null;
        }
    }

    public void onPause(C0125s sVar) {
        C87412m.m108594g(sVar, "var1");
        this.f159174d.f159163d = SupportLifecycle.C55872a.ON_PAUSE;
        C58263a aVar = this.f159175e;
        if (aVar != null) {
            aVar.onPause(sVar);
        }
        Log.m105926v("Finder.EventObserver", "onPause life " + this.f159176f + " this" + this.f159174d);
    }

    public void onResume(C0125s sVar) {
        C87412m.m108594g(sVar, "var1");
        this.f159174d.f159163d = SupportLifecycle.C55872a.ON_RESUME;
        C58263a aVar = this.f159175e;
        if (aVar != null) {
            aVar.onResume(sVar);
        }
        Log.m105926v("Finder.EventObserver", "onResume life " + this.f159176f + " this" + this.f159174d);
    }

    public void onStart(C0125s sVar) {
        C87412m.m108594g(sVar, "var1");
        this.f159174d.f159163d = SupportLifecycle.C55872a.ON_START;
        C58263a aVar = this.f159175e;
        if (aVar != null) {
            aVar.onStart(sVar);
        }
    }

    public void onStop(C0125s sVar) {
        C87412m.m108594g(sVar, "var1");
        this.f159174d.f159163d = SupportLifecycle.C55872a.ON_STOP;
        C58263a aVar = this.f159175e;
        if (aVar != null) {
            aVar.onStop(sVar);
        }
    }
}
