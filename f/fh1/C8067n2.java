package fh1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import cl1.C0691u1;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import fy3.C32224a;
import gg1.C32444a;
import gh1.C59440c;
import gh1.C8313a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import nj3.C76912y0;
import o40.C61926c;
import ok1.C62042e;
import qj1.C12469j1;
import qj1.C12490l0;
import qj1.C62741dg;
import qj1.C63100x2;
import rx3.C13598b0;
import sx3.C64197v;
import te3.C48742ao0;
import te3.C52005xq0;
import wg1.C66010g0;
import wg1.C66109y0;
import xs1.C15883o;

/* renamed from: fh1.n2 */
public final class C8067n2 extends C8313a implements C59440c {

    /* renamed from: o */
    public static final List<Integer> f26824o = C64197v.m75537f(1, 2, 4, 8, 16);

    /* renamed from: p */
    public static final List<Integer> f26825p = C64197v.m75537f(2, 4);

    /* renamed from: q */
    public static final List<Integer> f26826q = C64197v.m75537f(1, 8);

    /* renamed from: j */
    public final String f26827j = "Finder.JoinLivePreloadController";

    /* renamed from: n */
    public boolean f26828n;

    /* renamed from: fh1.n2$a */
    public static final class C8068a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8067n2 f26829d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8068a(C8067n2 n2Var) {
            super(0);
            this.f26829d = n2Var;
        }

        public Object invoke() {
            this.f26829d.mo9149m3(true);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8067n2(LiveRoomControllerStore liveRoomControllerStore) {
        super(liveRoomControllerStore);
        C87412m.m108594g(liveRoomControllerStore, "store");
    }

    /* renamed from: e */
    public boolean mo9121e() {
        return false;
    }

    /* renamed from: m3 */
    public final void mo9149m3(boolean z) {
        C62741dg dgVar;
        Context context;
        Context context2;
        Context context3;
        C63100x2 x2Var;
        Intent intent;
        Class cls = C0691u1.class;
        Class cls2 = C54991o.class;
        FinderLiveService.f159376d.getClass();
        C56032b bVar = FinderLiveService.f159379g;
        MMActivity mMActivity = null;
        Context context4 = bVar != null ? bVar.getContext() : null;
        if (context4 instanceof MMActivity) {
            mMActivity = (MMActivity) context4;
        }
        int intExtra = (mMActivity == null || (intent = mMActivity.getIntent()) == null) ? 0 : intent.getIntExtra("FunctionGuideAction", 0);
        if (intExtra != 0) {
            String str = this.f26827j;
            Log.m105924i(str, "actionType " + intExtra);
            if (!((C54991o) business(cls2)).f154190D || f26825p.contains(Integer.valueOf(intExtra))) {
                C62042e eVar = C62042e.f176370a;
                if (eVar.mo87027N0() && !f26824o.contains(Integer.valueOf(intExtra))) {
                    String str2 = this.f26827j;
                    Log.m105924i(str2, "error actionType: " + intExtra);
                } else if (!((C54991o) business(cls2)).mo75995c4() || f26826q.contains(Integer.valueOf(intExtra))) {
                    boolean z2 = true;
                    if (intExtra == 1) {
                        C12469j1 j1Var = (C12469j1) mo9307d3(C12469j1.class);
                        if (j1Var != null) {
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("PARAM_FINDER_LIVE_SHOW_FANS_MODIFY", true);
                            j1Var.mo12127Z0(bundle);
                        }
                        mo9150n3();
                    } else if (intExtra != 2) {
                        if (intExtra != 4) {
                            if (intExtra != 8) {
                                if (intExtra == 16) {
                                    boolean g = C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_ACCOUNT_LIVE_HAS_SING_SONG_ABILITY_SETTING_BOOLEAN_SYNC, false);
                                    boolean z3 = C32444a.f86189r.mo60266n().intValue() == 1;
                                    if (!g && !z3) {
                                        z2 = false;
                                    }
                                    if (z2 && (x2Var = (C63100x2) mo9307d3(C63100x2.class)) != null) {
                                        x2Var.mo10792g(0);
                                        C66109y0 y0Var = x2Var.f179062r;
                                        if (y0Var != null) {
                                            ((C66010g0) y0Var).mo90047P0(false);
                                        }
                                    }
                                    mo9150n3();
                                }
                            } else if (((C54991o) business(cls2)).mo75995c4()) {
                                if (eVar.mo87067b1(FinderLiveService.f159348A)) {
                                    ((C0691u1) business(cls)).mo658c3().postValue(Boolean.TRUE);
                                } else {
                                    C56032b bVar2 = FinderLiveService.f159379g;
                                    if (!(bVar2 == null || (context3 = bVar2.getContext()) == null)) {
                                        C76912y0.m92768g(context3, context3.getResources().getString(C0966R.string.fp6));
                                    }
                                }
                                mo9150n3();
                            } else if (z) {
                                if (((C54991o) business(cls2)).mo75963I3()) {
                                    ((C0691u1) business(cls)).mo658c3().postValue(Boolean.TRUE);
                                } else {
                                    C56032b bVar3 = FinderLiveService.f159379g;
                                    if (!(bVar3 == null || (context2 = bVar3.getContext()) == null)) {
                                        C76912y0.m92768g(context2, context2.getResources().getString(C0966R.string.fp6));
                                    }
                                }
                                mo9150n3();
                            }
                        } else if (z) {
                            if (((C54991o) business(cls2)).f154275W3 != null) {
                                C15883o oVar = (C15883o) mo9307d3(C15883o.class);
                                if (oVar != null) {
                                    oVar.mo14535c1();
                                }
                            } else {
                                C55001u uVar = (C55001u) business(C55001u.class);
                                C56032b bVar4 = FinderLiveService.f159379g;
                                if (!(bVar4 == null || (context = bVar4.getContext()) == null)) {
                                    eVar.mo87012I0(context, uVar.f154420q.f182392d, uVar.f154416j, uVar.f154423t, ((C54991o) business(cls2)).f154345o);
                                }
                            }
                            mo9150n3();
                        }
                    } else if (z) {
                        if (eVar.mo87027N0()) {
                            C12490l0 l0Var = (C12490l0) mo9307d3(C12490l0.class);
                            if (l0Var != null) {
                                l0Var.f35933w.mo12530c();
                            }
                        } else if (((C54991o) business(cls2)).f154190D && (dgVar = (C62741dg) mo9307d3(C62741dg.class)) != null) {
                            dgVar.f178131z.mo12530c();
                        }
                        mo9150n3();
                    }
                } else {
                    String str3 = this.f26827j;
                    Log.m105924i(str3, "error live before actionType: " + intExtra);
                }
            } else {
                String str4 = this.f26827j;
                Log.m105924i(str4, "isAssistant: " + ((C54991o) business(cls2)).f154190D);
            }
        }
    }

    /* renamed from: n3 */
    public final void mo9150n3() {
        Intent intent;
        FinderLiveService.f159376d.getClass();
        C56032b bVar = FinderLiveService.f159379g;
        MMActivity mMActivity = null;
        Context context = bVar != null ? bVar.getContext() : null;
        if (context instanceof MMActivity) {
            mMActivity = (MMActivity) context;
        }
        if (mMActivity != null && (intent = mMActivity.getIntent()) != null) {
            intent.removeExtra("FunctionGuideAction");
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onFloatMode() {
        super.onFloatMode();
        this.f26828n = true;
    }

    public void onLiveActivate() {
    }

    public void onLiveDeactivate() {
        super.onLiveDeactivate();
    }

    public void onLiveMsg(C48742ao0 ao02) {
        super.onLiveMsg(ao02);
        C61926c.m72668M(new C8068a(this));
    }

    public void onLiveStart(C52005xq0 xq02) {
        mo9149m3(false);
    }

    public void onNewIntent(Intent intent) {
        mo9149m3(false);
    }

    public void onNormalMode() {
        super.onNormalMode();
        if (this.f26828n) {
            mo9149m3(false);
            this.f26828n = false;
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C59440c.C8315a.m8366a(this, i, strArr, iArr);
    }

    public boolean onSwipeBack() {
        return false;
    }

    public void onViewMount(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "pluginLayout");
        super.onViewMount(viewGroup);
        if (((C54991o) business(C54991o.class)).mo75995c4()) {
            mo9149m3(false);
        }
    }

    public void resume() {
    }

    /* renamed from: x0 */
    public void mo9131x0(boolean z, int i) {
    }
}
