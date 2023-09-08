package qj1;

import ak1.C0073g0;
import ak1.C54108o;
import android.animation.Animator;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.xweb.WCWebUpdater;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import o40.C61926c;
import org.json.JSONObject;
import rx3.C13598b0;
import te3.C49712hj1;
import zj1.C16217b;
import zp3.C23555k;
import zp3.C23564m;

/* renamed from: qj1.u2 */
public final class C12693u2 extends C62660c implements View.OnClickListener {

    /* renamed from: p */
    public final C58124b f36374p;

    /* renamed from: q */
    public int f36375q;

    /* renamed from: r */
    public C32224a<C13598b0> f36376r;

    /* renamed from: qj1.u2$a */
    public static final class C12694a extends C23555k.C23562d {

        /* renamed from: a */
        public final /* synthetic */ C12693u2 f36377a;

        public C12694a(C12693u2 u2Var) {
            this.f36377a = u2Var;
        }

        /* renamed from: b */
        public void mo53b(View view, long j, long j2, boolean z) {
            Class cls = C54108o.class;
            C87412m.m108594g(view, "view");
            if (this.f36377a.mo12265Z0()) {
                C7335d c = C86312j.m106911c(cls);
                C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                C0073g0 g0Var = C0073g0.LIVING_SING_SONG;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", "3");
                C13598b0 b0Var = C13598b0.f38549a;
                C8777j5.C8778a.m8605f((C8777j5) c, g0Var, jSONObject.toString(), (String) null, 4, (Object) null);
                return;
            }
            C7335d c2 = C86312j.m106911c(cls);
            C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("type", "1");
            C13598b0 b0Var2 = C13598b0.f38549a;
            C8777j5.C8778a.m8600a((C8777j5) c2, 34, jSONObject2.toString(), (String) null, 4, (Object) null);
        }
    }

    /* renamed from: qj1.u2$b */
    public static final class C12695b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C12693u2 f36378d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12695b(C12693u2 u2Var) {
            super(0);
            this.f36378d = u2Var;
        }

        public Object invoke() {
            this.f36378d.f166287d.setVisibility(0);
            this.f36378d.f166287d.animate().translationY(0.0f).setDuration(200).setListener((Animator.AnimatorListener) null).start();
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12693u2(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f36374p = bVar;
        new LinkedHashMap();
        viewGroup.setTranslationY((float) C75044y4.m89990b(viewGroup.getContext()).y);
        ((RelativeLayout) viewGroup.findViewById(C0966R.C0970id.mri)).setOnClickListener(this);
        ((RelativeLayout) viewGroup.findViewById(C0966R.C0970id.mrf)).setOnClickListener(this);
        viewGroup.setOnClickListener(this);
        C23564m.m28138h(viewGroup, new C12694a(this));
    }

    /* renamed from: Z0 */
    public final boolean mo12265Z0() {
        return ((C54991o) mo87696x0(C54991o.class)).mo75999e4();
    }

    /* renamed from: a1 */
    public final void mo12266a1(boolean z) {
        if (mo12265Z0()) {
            C54991o oVar = (C54991o) mo87696x0(C54991o.class);
            oVar.f154286Z = z;
            Bundle bundle = new Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", oVar.f154286Z);
            this.f36374p.statusChange(C58124b.C58125b.FINDER_LIVE_CLEAR_SCREEN, bundle);
        }
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return false;
    }

    /* renamed from: b1 */
    public final void mo12267b1(C32224a<C13598b0> aVar) {
        this.f36375q = 0;
        this.f36376r = aVar;
        mo12266a1(true);
        C61926c.m72668M(new C12695b(this));
        View findViewById = this.f166287d.findViewById(C0966R.C0970id.hyu);
        View findViewById2 = this.f166287d.findViewById(C0966R.C0970id.oos);
        Context context = this.f166287d.getContext();
        C87412m.m108592e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        AppCompatActivity appCompatActivity = (AppCompatActivity) context;
        if (mo12265Z0()) {
            C16217b bVar = C16217b.f43438a;
            C16217b.m15108i(bVar, appCompatActivity, "anchorlive.bottom.music.bgmusic", findViewById, (View) null, (TextView) null, 24, (Object) null);
            C16217b.m15108i(bVar, appCompatActivity, "anchorlive.bottom.music.song", findViewById2, (View) null, (TextView) null, 24, (Object) null);
            bVar.mo14751g("anchorlive.bottom.music.bgmusic");
            bVar.mo14751g("anchorlive.bottom.music.song");
            return;
        }
        C16217b bVar2 = C16217b.f43438a;
        C16217b.m15108i(bVar2, appCompatActivity, "startlive.bottom.music.bgmusic", findViewById, (View) null, (TextView) null, 24, (Object) null);
        C16217b.m15108i(bVar2, appCompatActivity, "startlive.bottom.music.song", findViewById2, (View) null, (TextView) null, 24, (Object) null);
        bVar2.mo14751g("startlive.bottom.music.bgmusic");
        bVar2.mo14751g("startlive.bottom.music.song");
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: i0 */
    public void mo8357i0() {
        super.mo8357i0();
    }

    /* renamed from: l0 */
    public boolean mo3207l0() {
        if (this.f166287d.getVisibility() != 0) {
            return false;
        }
        int i = this.f36375q;
        if (i == 0) {
            C61926c.m72668M(new C12722w2(this));
        } else if (i == 1) {
            this.f36375q = 0;
            C58124b.C7172a.m7372a(this.f36374p, C58124b.C58125b.FINDER_LIVE_ANCHOR_MUSIC_HIDE, (Bundle) null, 2, (Object) null);
        } else if (i != 2) {
            return false;
        } else {
            this.f36375q = 0;
            C58124b.C7172a.m7372a(this.f36374p, C58124b.C58125b.FINDER_LIVE_ANCHOR_MUSIC_SING_SONG_LIST_HIDE, (Bundle) null, 2, (Object) null);
        }
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }

    public void onClick(View view) {
        Class cls = C54108o.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorMusicSelectPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == C0966R.C0970id.mri) {
            this.f36375q = 2;
            if (mo12265Z0()) {
                C7335d c = C86312j.m106911c(cls);
                C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                C0073g0 g0Var = C0073g0.LIVING_SING_SONG;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL);
                C13598b0 b0Var = C13598b0.f38549a;
                C8777j5.C8778a.m8605f((C8777j5) c, g0Var, jSONObject.toString(), (String) null, 4, (Object) null);
            } else {
                C7335d c2 = C86312j.m106911c(cls);
                C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("type", "2");
                C13598b0 b0Var2 = C13598b0.f38549a;
                C8777j5.C8778a.m8600a((C8777j5) c2, 34, jSONObject2.toString(), (String) null, 4, (Object) null);
            }
            C58124b.C7172a.m7372a(this.f36374p, C58124b.C58125b.FINDER_LIVE_ANCHOR_MUSIC_SING_SONG_LIST_SHOW, (Bundle) null, 2, (Object) null);
            if (mo12265Z0()) {
                C16217b.f43438a.mo14745b("anchorlive.bottom.music.song", false);
            } else {
                C16217b.f43438a.mo14745b("startlive.bottom.music.song", false);
            }
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.mrf) {
            this.f36375q = 1;
            C58124b.C7172a.m7372a(this.f36374p, C58124b.C58125b.FINDER_LIVE_ANCHOR_MUSIC_SHOW, (Bundle) null, 2, (Object) null);
            if (mo12265Z0()) {
                C16217b.f43438a.mo14745b("anchorlive.bottom.music.bgmusic", false);
            } else {
                C16217b.f43438a.mo14745b("startlive.bottom.music.bgmusic", false);
            }
        } else {
            C61926c.m72668M(new C12722w2(this));
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorMusicSelectPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        super.mo3210u0(bVar, bundle);
        int ordinal = bVar.ordinal();
        if (ordinal != 89) {
            if (ordinal == 90) {
                int i = this.f36375q;
                if (i == 1) {
                    C58124b.C7172a.m7372a(this.f36374p, C58124b.C58125b.FINDER_LIVE_ANCHOR_MUSIC_HIDE, (Bundle) null, 2, (Object) null);
                    this.f36375q = 0;
                } else if (i == 2) {
                    this.f36375q = 0;
                    C58124b.C7172a.m7372a(this.f36374p, C58124b.C58125b.FINDER_LIVE_ANCHOR_MUSIC_SING_SONG_LIST_HIDE, (Bundle) null, 2, (Object) null);
                }
                C61926c.m72668M(new C12722w2(this));
            }
        } else if (!mo12265Z0()) {
            mo12267b1((C32224a<C13598b0>) null);
        } else {
            mo12267b1((C32224a<C13598b0>) null);
        }
    }
}
