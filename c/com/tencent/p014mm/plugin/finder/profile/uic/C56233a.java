package com.tencent.p014mm.plugin.finder.profile.uic;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.plugin.p081mv.p082ui.MusicMvRouterUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import er1.C58684b;
import fy3.C32226l;
import gy3.C8478d0;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.UUID;
import k20.C9556a;
import p640ox.C77049b;
import rx3.C13598b0;
import te3.C64621p23;
import te3.C64793w23;

/* renamed from: com.tencent.mm.plugin.finder.profile.uic.a */
public final class C56233a extends C87413o implements C32226l<C64621p23, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderProfileDraftUIC f160668d;

    /* renamed from: e */
    public final /* synthetic */ C8478d0 f160669e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56233a(FinderProfileDraftUIC finderProfileDraftUIC, C8478d0 d0Var) {
        super(1);
        this.f160668d = finderProfileDraftUIC;
        this.f160669e = d0Var;
    }

    public Object invoke(Object obj) {
        C64621p23 p232 = (C64621p23) obj;
        Class cls = C58684b.class;
        C87412m.m108594g(p232, "mvTrackData");
        Intent intent = new Intent();
        intent.putExtra("key_track_data", p232.toByteArray());
        intent.putExtra("key_mv_from_scene", 1);
        intent.putExtra("key_mv_enter_maker_ui_from_scene", 2);
        C64793w23 w232 = (C64793w23) ((C77049b) C86312j.m106911c(C77049b.class)).mo72357nb(this.f160668d.getActivity(), "MusicMvRouterUI", 7, C64793w23.class);
        if (w232 != null) {
            String uuid = UUID.randomUUID().toString();
            C87412m.m108593f(uuid, "randomUUID().toString()");
            w232.f186034e = uuid;
            w232.f186035f = 86;
        }
        int i = this.f160669e.f27483d;
        if (i == 2 || i == 1) {
            AppCompatActivity activity = this.f160668d.getActivity();
            ((C58684b) C86312j.m106911c(cls)).getClass();
            C87412m.m108594g(activity, "context");
            Class<MusicMvRouterUI> cls2 = MusicMvRouterUI.class;
            try {
                int i2 = MusicMvRouterUI.f272340g;
                intent.putExtra("KEY_MUSIC_ROUTER", 7);
                intent.setClass(activity, cls2);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterMusicMvPostUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activity.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(activity, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterMusicMvPostUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (ClassNotFoundException e) {
                Log.m105920e("Finder.ActivityRouter", "enterMusicMvPostUI : " + e);
            }
        } else {
            ((C58684b) C86312j.m106911c(cls)).ky0(this.f160668d.getActivity(), intent);
        }
        return C13598b0.f38549a;
    }
}
