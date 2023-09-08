package gj3;

import android.app.Instrumentation;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.p136ui.anim.transition.MMTransitionHelper;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C8480h;
import gy3.C87412m;
import ij3.C60331a;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* renamed from: gj3.h */
public final class C59474h extends UIComponent {

    /* renamed from: h */
    public static final C59475a f169945h = new C59475a((C8480h) null);

    /* renamed from: d */
    public final C59472e f169946d;

    /* renamed from: e */
    public final C59473f f169947e;

    /* renamed from: f */
    public boolean f169948f;

    /* renamed from: g */
    public boolean f169949g;

    /* renamed from: gj3.h$a */
    public static final class C59475a {
        public C59475a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo84575a(List<String> list, Map<String, View> map, View view, int i) {
            List<Pair<View, String>> a;
            C87412m.m108594g(list, "names");
            C87412m.m108594g(map, "sharedElements");
            MMTransitionHelper mMTransitionHelper = MMTransitionHelper.f165034a;
            if (view != null && (a = C59470c.m69393a(view)) != null) {
                for (Pair pair : a) {
                    if (!list.contains(pair.second)) {
                        Object obj = pair.second;
                        C87412m.m108593f(obj, "it.second");
                        list.add(obj);
                        Object obj2 = pair.second;
                        C87412m.m108593f(obj2, "it.second");
                        Object obj3 = pair.first;
                        C87412m.m108593f(obj3, "it.first");
                        map.put(obj2, obj3);
                    }
                    if (list.size() >= i) {
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59474h(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f169946d = new C59472e(appCompatActivity, this);
        this.f169947e = new C59473f(appCompatActivity, this);
    }

    public void onBeforeFinishAfterTransition() {
        super.onBeforeFinishAfterTransition();
        this.f169949g = true;
        for (WeakReference weakReference : MMTransitionHelper.f165034a.mo81991b(getActivity()).f165041e) {
            C60331a aVar = (C60331a) weakReference.get();
            if (aVar != null) {
                aVar.mo82001j();
                aVar.mo81999g(false);
            }
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f169948f) {
            Log.m105918d("MM.Transition", "resume hasCalledStartActivityForResult false");
            this.f169948f = false;
        }
    }

    public void onStartActivityForResult(Intent intent, int i, Bundle bundle) {
        this.f169948f = true;
        Log.m105918d("MM.Transition", "onStartActivityForResult called");
        if (bundle != null && Build.VERSION.SDK_INT >= 29 && !getActivity().isFinishing()) {
            new Instrumentation().callActivityOnSaveInstanceState(getActivity(), new Bundle());
        }
        super.onStartActivityForResult(intent, i, bundle);
    }
}
