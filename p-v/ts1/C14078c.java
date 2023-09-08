package ts1;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import bl3.C113200q;
import bl3.C39818r;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderTeenModeLimitUI;
import com.tencent.p014mm.plugin.finder.p056ui.FinderHomeAffinityUI;
import com.tencent.p014mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import fe1.C8013f;
import gy3.C87412m;
import ht1.C8813w4;
import ke3.C88144b;
import p565ir.C60606n;
import pt1.C35640b;
import zt3.C119157j;
import zt3.C119179t;

@C113200q(initialMode = 2)
/* renamed from: ts1.c */
public final class C14078c extends UIComponent implements C8813w4 {

    /* renamed from: d */
    public boolean f39485d;

    /* renamed from: e */
    public final C14079a f39486e = new C14079a(this);

    /* renamed from: ts1.c$a */
    public static final class C14079a implements C8013f {

        /* renamed from: a */
        public final /* synthetic */ C14078c f39487a;

        public C14079a(C14078c cVar) {
            this.f39487a = cVar;
        }

        /* renamed from: a */
        public void mo9102a(boolean z) {
            Log.m105924i("FinderTeenModeFloatPageUIC", "onEnjoyFinderOverLimit " + this.f39487a.f39485d);
            C14078c cVar = this.f39487a;
            if (!cVar.f39485d) {
                if (C35640b.f95284a.mo60347a(cVar.getActivity())) {
                    C14078c cVar2 = this.f39487a;
                    cVar2.getClass();
                    ((C60606n) C86312j.m106911c(C60606n.class)).mo84997Dr(false);
                    C119179t tVar = C119157j.f356862d;
                    C14077b bVar = new C14077b(cVar2);
                    C119157j jVar = (C119157j) tVar;
                    jVar.getClass();
                    jVar.mo183892w(bVar, 1500, false);
                }
                C14078c cVar3 = this.f39487a;
                cVar3.getClass();
                Intent intent = new Intent();
                intent.putExtra("key_is_curfew", z);
                intent.setClass(cVar3.getActivity(), FinderTeenModeLimitUI.class);
                cVar3.getActivity().startActivityForResult(intent, 11111);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14078c(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Log.m105924i("FinderTeenModeFloatPageUIC", "requestCode: " + i + ", " + i2);
        if (i != 11111) {
            return;
        }
        if (i2 != -1) {
            if (i2 == 11112) {
                boolean z = getActivity().getIntent().getIntExtra("FROM_SCENE_KEY", 2) == 6;
                if (!C35640b.f95284a.mo60347a(getActivity()) && !z) {
                    Intent intent2 = new Intent();
                    intent2.addFlags(67108864);
                    intent2.addFlags(268435456);
                    intent2.putExtra("preferred_tab", 2);
                    C88144b.m109801s(getActivity(), ".ui.LauncherUI", intent2, (Bundle) null);
                }
                if (getActivity().isFinishing() || getActivity().isDestroyed()) {
                    return;
                }
                if (getActivity() instanceof FinderHomeAffinityUI) {
                    getActivity().finishAndRemoveTask();
                } else {
                    getActivity().finish();
                }
            }
        } else if (C35640b.f95284a.mo60347a(getActivity())) {
            ((C60606n) C86312j.m106911c(C60606n.class)).mo85032Sc();
        }
    }

    public void onPause() {
        super.onPause();
        this.f39485d = true;
    }

    public void onResume() {
        super.onResume();
        this.f39485d = false;
    }

    public void onStart() {
        super.onStart();
        FinderTeenModeLimitVM finderTeenModeLimitVM = (FinderTeenModeLimitVM) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(FinderTeenModeLimitVM.class);
        C14079a aVar = this.f39486e;
        finderTeenModeLimitVM.getClass();
        C87412m.m108594g(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        synchronized (finderTeenModeLimitVM.f18820f) {
            finderTeenModeLimitVM.f18820f.add(aVar);
        }
    }

    public void onStop() {
        super.onStop();
        FinderTeenModeLimitVM finderTeenModeLimitVM = (FinderTeenModeLimitVM) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(FinderTeenModeLimitVM.class);
        C14079a aVar = this.f39486e;
        finderTeenModeLimitVM.getClass();
        C87412m.m108594g(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        synchronized (finderTeenModeLimitVM.f18820f) {
            finderTeenModeLimitVM.f18820f.remove(aVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14078c(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }
}
