package gj3;

import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.p136ui.anim.transition.MMTransitionHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import java.util.List;

/* renamed from: gj3.f */
public final class C59473f {

    /* renamed from: a */
    public final AppCompatActivity f169943a;

    /* renamed from: b */
    public final C59474h f169944b;

    public C59473f(AppCompatActivity appCompatActivity, C59474h hVar) {
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(hVar, "uic");
        this.f169943a = appCompatActivity;
        this.f169944b = hVar;
    }

    /* renamed from: a */
    public static Bundle m69397a(C59473f fVar, View view, C59469a aVar, Intent intent, int i, Object obj) {
        List<Pair<View, String>> list = null;
        if ((i & 2) != 0) {
            aVar = null;
        }
        if ((i & 4) != 0) {
            intent = null;
        }
        if (fVar.f169944b.f169948f) {
            Log.m105918d("MM.Transition", "getAnimOptionBundleByView has already called startForResult");
            return null;
        }
        MMTransitionHelper mMTransitionHelper = MMTransitionHelper.f165034a;
        AppCompatActivity appCompatActivity = fVar.f169943a;
        if (view != null) {
            list = C59470c.m69393a(view);
        }
        return mMTransitionHelper.mo81990a(appCompatActivity, list, aVar, intent);
    }
}
