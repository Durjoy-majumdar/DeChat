package il1;

import ak1.C0073g0;
import ak1.C54067f0;
import ak1.C54108o;
import android.os.Bundle;
import android.view.View;
import cl1.C54991o;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32224a;
import gg1.C32444a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8777j5;
import i50.C60251a;
import j20.C117292a;
import java.util.ArrayList;
import ok1.C62042e;
import org.json.JSONObject;
import qj1.C12693u2;
import rx3.C13598b0;
import zj1.C16217b;

/* renamed from: il1.m */
public final class C9059m implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C9068n f28597d;

    /* renamed from: il1.m$a */
    public static final class C9060a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C9060a f28598d = new C9060a();

        public C9060a() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    public C9059m(C9068n nVar) {
        this.f28597d = nVar;
    }

    public final void onClick(View view) {
        Class cls = C54108o.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchoMusicEntranceWidget$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C7335d c = C86312j.m106911c(cls);
        C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
        C8777j5.C8778a.m8606g((C8777j5) c, C54067f0.C0064m.MUSIC, ((C54108o) C86312j.m106911c(cls)).Ex0(C54067f0.C0062l.LIVING), (String) null, 4, (Object) null);
        C9068n nVar = this.f28597d;
        C9060a aVar = C9060a.f28598d;
        boolean z = ((C54991o) nVar.f28614c.mo87696x0(C54991o.class)).f154305d3;
        boolean z2 = true;
        boolean z3 = C60251a.f171781k1 != null;
        boolean g = C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_ACCOUNT_LIVE_HAS_SING_SONG_ABILITY_SETTING_BOOLEAN_SYNC, false);
        boolean z4 = C32444a.f86189r.mo60266n().intValue() == 1;
        boolean z5 = g || z4;
        C62042e eVar = C62042e.f176370a;
        if (!eVar.mo86991B(nVar.f28614c.mo87684A0()) || !eVar.mo87027N0()) {
            z2 = false;
        }
        if (!z3) {
            if (z5 && z2) {
                C12693u2 u2Var = (C12693u2) nVar.f28614c.mo87687E0(C12693u2.class);
                if (u2Var != null) {
                    u2Var.mo12267b1(aVar);
                }
            } else if (z5) {
                C58124b.C7172a.m7372a(nVar.f28613b, C58124b.C58125b.FINDER_LIVE_ANCHOR_MUSIC_SING_SONG_LIST_SHOW, (Bundle) null, 2, (Object) null);
            } else {
                C58124b.C7172a.m7372a(nVar.f28613b, C58124b.C58125b.FINDER_LIVE_ANCHOR_MUSIC_SHOW, (Bundle) null, 2, (Object) null);
            }
            if (!z5 || !z2) {
                C16217b bVar = C16217b.f43438a;
                bVar.mo14751g("anchorlive.bottom.music.bgmusic");
                bVar.mo14751g("anchorlive.bottom.music.song");
            }
        } else if (z) {
            if (z5 && z2) {
                C12693u2 u2Var2 = (C12693u2) nVar.f28614c.mo87687E0(C12693u2.class);
                if (u2Var2 != null) {
                    u2Var2.mo12267b1(aVar);
                }
            } else if (z5) {
                C58124b.C7172a.m7372a(nVar.f28613b, C58124b.C58125b.FINDER_LIVE_ANCHOR_MUSIC_SING_SONG_LIST_SHOW, (Bundle) null, 2, (Object) null);
            } else {
                C58124b.C7172a.m7372a(nVar.f28613b, C58124b.C58125b.FINDER_LIVE_ANCHOR_MUSIC_SHOW, (Bundle) null, 2, (Object) null);
            }
        } else if (z5) {
            C58124b.C7172a.m7372a(nVar.f28613b, C58124b.C58125b.FINDER_LIVE_ANCHOR_MUSIC_SING_SONG_LIST_SHOW, (Bundle) null, 2, (Object) null);
        } else {
            String str = nVar.f28615d;
            Log.m105924i(str, "error in, checkVisible enableSingSongListFromBack: " + g + ", enableSwitch: " + z4 + ", isGameLive: " + z + ", isSecond: " + z3);
            C12693u2 u2Var3 = (C12693u2) nVar.f28614c.mo87687E0(C12693u2.class);
            if (u2Var3 != null) {
                u2Var3.mo12267b1(aVar);
            }
        }
        this.f28597d.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", 11);
        C7335d c2 = C86312j.m106911c(cls);
        C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
        C8777j5.C8778a.m8605f((C8777j5) c2, C0073g0.ANCHOR_MUSIC, jSONObject.toString(), (String) null, 4, (Object) null);
        C16217b.f43438a.mo14745b(this.f28597d.f28618g, false);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchoMusicEntranceWidget$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
