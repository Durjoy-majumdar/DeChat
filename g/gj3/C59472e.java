package gj3;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.p136ui.anim.transition.MMTransitionHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import hj3.C59931c;

/* renamed from: gj3.e */
public final class C59472e {

    /* renamed from: a */
    public final AppCompatActivity f169942a;

    public C59472e(AppCompatActivity appCompatActivity, C59474h hVar) {
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(hVar, "uic");
        this.f169942a = appCompatActivity;
    }

    /* renamed from: a */
    public final void mo84573a(C59469a aVar) {
        MMTransitionHelper mMTransitionHelper = MMTransitionHelper.f165034a;
        AppCompatActivity appCompatActivity = this.f169942a;
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Log.m105924i("MM.Transition", "onEnterActivityOnCreate() called with: activity = " + appCompatActivity);
        appCompatActivity.postponeEnterTransition();
        mMTransitionHelper.mo81992c(appCompatActivity, true, aVar);
        mMTransitionHelper.mo81991b(appCompatActivity).f165038b = true;
        mMTransitionHelper.mo81993d(appCompatActivity);
    }

    /* renamed from: b */
    public final void mo84574b(C59471d dVar, C59931c cVar) {
        C87412m.m108594g(cVar, "customCallback");
        MMTransitionHelper mMTransitionHelper = MMTransitionHelper.f165034a;
        AppCompatActivity appCompatActivity = this.f169942a;
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Log.m105924i("MM.Transition", "onEnterActivityReady() called with: activity = " + appCompatActivity);
        cVar.mo32697a(appCompatActivity, dVar);
        appCompatActivity.startPostponedEnterTransition();
    }
}
