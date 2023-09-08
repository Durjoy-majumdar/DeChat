package mk1;

import a14.C0000n0;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import android.app.Activity;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C7335d;
import di3.C86312j;
import er1.C7813i5;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C8777j5;
import java.util.Map;
import ob0.C11385n;
import ob0.C117747y;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: mk1.g */
public final class C10905g implements C11385n {

    /* renamed from: d */
    public final Activity f32530d;

    /* renamed from: e */
    public C7813i5 f32531e;

    /* renamed from: f */
    public final C10906h f32532f;

    /* renamed from: g */
    public final C0000n0 f32533g = C53930o0.m60555b();

    public C10905g(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f32530d = activity;
        C10906h hVar = new C10906h((MMFragmentActivity) activity, 3, 0, 4, (C8480h) null);
        this.f32532f = hVar;
        this.f32531e = C7813i5.C7814a.m7953a(C7813i5.f26336f, activity, activity.getResources().getString(C0966R.string.ett), 500, (DialogInterface.OnCancelListener) null, 8, (Object) null);
        C7335d c = C86312j.m106911c(C8777j5.class);
        C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
        C8777j5.C8778a.m8601b((C8777j5) c, 1, hVar.f32535b, hVar.f32536c, (Map) null, 8, (Object) null);
    }

    /* renamed from: a */
    public static final void m10903a(C10905g gVar) {
        C10905g gVar2 = gVar;
        gVar.getClass();
        Log.m105924i("Finder.FinderLivePostForNearby", "handleConfirmPostLive");
        C7335d c = C86312j.m106911c(C8777j5.class);
        C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
        C10906h hVar = gVar2.f32532f;
        C8777j5.C8778a.m8601b((C8777j5) c, 4, hVar.f32535b, hVar.f32536c, (Map) null, 8, (Object) null);
        C53895h.m60466d(gVar2.f32533g, (C66212f) null, (C53934p0) null, new C10900b(gVar2, (C15601d<? super C10900b>) null), 3, (Object) null);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
    }
}
