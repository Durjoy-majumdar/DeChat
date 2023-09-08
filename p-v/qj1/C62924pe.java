package qj1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import cl1.C0668l;
import cl1.C54979h1;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import d60.C58124b;
import gy3.C87412m;
import java.util.regex.Pattern;
import np1.C61817a;
import np1.C61877r;
import np1.C61878s;
import o40.C61926c;
import ok1.C62042e;
import op1.C62075a;
import op1.C62084h;
import te3.C49712hj1;

/* renamed from: qj1.pe */
public final class C62924pe extends C62660c {

    /* renamed from: p */
    public final C58124b f178554p;

    /* renamed from: q */
    public final String f178555q = "Finder.LiveShoppingListPlugin";

    /* renamed from: r */
    public C61817a f178556r;

    /* renamed from: qj1.pe$a */
    public static final class C62925a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C62924pe f178557d;

        public C62925a(C62924pe peVar) {
            this.f178557d = peVar;
        }

        public final void run() {
            C62924pe peVar = this.f178557d;
            Context context = peVar.f166287d.getContext();
            Intent intent = null;
            Activity activity = context instanceof Activity ? (Activity) context : null;
            if (activity != null) {
                intent = activity.getIntent();
            }
            peVar.mo87866Z0(intent);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62924pe(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f178554p = bVar;
        if (C62042e.f176370a.mo87027N0() && ((C54991o) mo87696x0(C54991o.class)).f154301c3) {
            viewGroup.setElevation((float) viewGroup.getContext().getResources().getDimensionPixelSize(C0966R.dimen.adb));
        }
        Log.m105924i("Finder.LiveShoppingListPlugin", "FinderLiveShoppingListPlugin init!");
    }

    /* renamed from: S0 */
    public void mo87693S0(Intent intent) {
        boolean z = false;
        if (intent != null) {
            z = intent.getBooleanExtra("extra_start_by_half_screen_empty_area_click_scene", false);
        }
        String str = this.f178555q;
        Log.m105924i(str, "clickEmptyAreaClose = " + z);
        mo87866Z0(intent);
    }

    /* renamed from: Z0 */
    public final void mo87866Z0(Intent intent) {
        Intent intent2;
        if ((intent != null ? intent.getIntExtra("KEY_PARAMS_DO_ACTION", 0) : 0) == 6) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_SHOPPING_SOURCE_CLICK", false);
            this.f178554p.statusChange(C58124b.C58125b.FINDER_LIVE_SHOPPING_LIST_SHOW, bundle);
            Context context = this.f166287d.getContext();
            Activity activity = context instanceof Activity ? (Activity) context : null;
            if (activity != null && (intent2 = activity.getIntent()) != null) {
                intent2.putExtra("KEY_PARAMS_DO_ACTION", 0);
            }
        }
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return false;
    }

    /* renamed from: e */
    public void mo12022e(Bundle bundle, Object obj, long j) {
        C61817a aVar = this.f178556r;
        if (aVar != null) {
            String str = "";
            String string = bundle != null ? bundle.getString("ACTION_POST_PORTRAIT", str) : null;
            if (string != null) {
                str = string;
            }
            if (C87412m.m108589b(str, "PORTRAIT_ACTION_FULL_SCREEN_MINIPRO")) {
                C61877r rVar = new C61877r(aVar, obj, j);
                Pattern pattern = C61926c.f176038a;
                MMHandlerThread.postToMainThreadDelayed(rVar, j);
            } else if (C87412m.m108589b(str, "PORTRAIT_ACTION_HALF_SCREEN_MINIPRO")) {
                C61878s sVar = new C61878s(aVar, obj, j);
                Pattern pattern2 = C61926c.f176038a;
                MMHandlerThread.postToMainThreadDelayed(sVar, j);
            }
        }
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: i0 */
    public void mo8357i0() {
        C62075a aVar;
        C62084h hVar;
        C62084h hVar2;
        Log.m105924i(this.f178555q, "FinderLiveShoppingListPlugin mount!");
        super.mo8357i0();
        C61817a aVar2 = new C61817a(1, this.f166287d, this.f178554p, mo87684A0(), mo14476D0(), this);
        this.f178556r = aVar2;
        aVar2.mo86764t();
        C61817a aVar3 = this.f178556r;
        if (aVar3 != null) {
            aVar3.mo86762r();
        }
        C61817a aVar4 = this.f178556r;
        if (aVar4 != null) {
            aVar4.mo86763s();
        }
        C61817a aVar5 = this.f178556r;
        if (!(aVar5 == null || (hVar2 = aVar5.f175761C) == null)) {
            hVar2.f176542s = aVar5;
        }
        if (!(aVar5 == null || (hVar = aVar5.f175763E) == null)) {
            hVar.f176542s = aVar5;
        }
        if (aVar5 != null && (aVar = aVar5.f175762D) != null) {
            aVar.f176495n = aVar5;
        }
    }

    /* renamed from: k0 */
    public void mo8400k0(int i, int i2, Intent intent) {
        C61817a aVar = this.f178556r;
        if (aVar != null) {
            aVar.mo86769y(i, i2, intent);
        }
    }

    /* renamed from: l0 */
    public boolean mo3207l0() {
        if (mo14483f0() != 0) {
            return false;
        }
        C61817a aVar = this.f178556r;
        if (aVar != null) {
            aVar.mo86761q();
        }
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C0668l) mo87696x0(C0668l.class)).mo632i3();
    }

    /* renamed from: s0 */
    public void mo3209s0() {
        Context context = this.f166287d.getContext();
        Intent intent = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            intent = activity.getIntent();
        }
        mo87866Z0(intent);
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        Class cls = C54979h1.class;
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        if (ordinal == 7) {
            this.f166287d.post(new C62925a(this));
        } else if (ordinal != 27) {
            switch (ordinal) {
                case 81:
                    C61817a aVar = this.f178556r;
                    if (aVar != null) {
                        aVar.mo86736C(bundle);
                        return;
                    }
                    return;
                case 82:
                    C61817a aVar2 = this.f178556r;
                    if (aVar2 != null) {
                        aVar2.mo86735B(bundle);
                        return;
                    }
                    return;
                case 83:
                    C61817a aVar3 = this.f178556r;
                    if (aVar3 != null) {
                        aVar3.mo86734A(bundle);
                        return;
                    }
                    return;
                case 84:
                    C61817a aVar4 = this.f178556r;
                    if (aVar4 != null) {
                        aVar4.mo86740G();
                        return;
                    }
                    return;
                case 85:
                    C61817a aVar5 = this.f178556r;
                    if (aVar5 != null) {
                        aVar5.mo86743J(((C54979h1) mo87696x0(cls)).f154140o, (Bundle) null);
                        return;
                    }
                    return;
                default:
                    return;
            }
        } else {
            C61817a aVar6 = this.f178556r;
            if (aVar6 != null) {
                C54979h1 h1Var = (C54979h1) aVar6.f175774g.mo71262a(cls);
                h1Var.f154110B = false;
                h1Var.f154111C = null;
                h1Var.f154146u = 0;
                h1Var.f154140o.f127225a.clear();
                C62660c cVar = aVar6.f175776i;
                if (cVar != null) {
                    cVar.mo10792g(8);
                }
            }
        }
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        C62084h hVar;
        C62075a aVar;
        C62084h hVar2;
        super.mo3211w0();
        C61817a aVar2 = this.f178556r;
        if (aVar2 != null) {
            aVar2.mo86746N();
        }
        C61817a aVar3 = this.f178556r;
        if (aVar3 != null) {
            aVar3.mo86745M();
        }
        C61817a aVar4 = this.f178556r;
        if (!(aVar4 == null || (hVar2 = aVar4.f175761C) == null)) {
            hVar2.f176542s = null;
        }
        if (!(aVar4 == null || (aVar = aVar4.f175762D) == null)) {
            aVar.f176495n = null;
        }
        if (!(aVar4 == null || (hVar = aVar4.f175763E) == null)) {
            hVar.f176542s = aVar4;
        }
        if (aVar4 != null) {
            aVar4.mo86770z();
        }
        this.f178556r = null;
    }
}
