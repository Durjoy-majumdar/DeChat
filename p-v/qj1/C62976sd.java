package qj1;

import a14.C53930o0;
import a14.C53973z1;
import ak1.C54067f0;
import ak1.C54108o;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import ci1.C39952a;
import cj1.C54795n5;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import d14.C58052j1;
import d14.C58087u0;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import er1.C58704c5;
import er1.C58713e5;
import fy3.C32230s;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8777j5;
import it1.C9247b;
import it1.C9253g;
import j20.C117292a;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import org.json.JSONObject;
import pe3.C89349b;
import rx3.C13598b0;
import rx3.C13604l;
import te3.C49712hj1;
import te3.C50262lh0;
import te3.C64273c21;

/* renamed from: qj1.sd */
public final class C62976sd extends C62660c {

    /* renamed from: p */
    public final C58124b f178689p;

    /* renamed from: q */
    public final String f178690q = "Finder.FinderLiveReadyPlugin";

    /* renamed from: r */
    public final int f178691r = 3;

    /* renamed from: s */
    public final Button f178692s;

    /* renamed from: t */
    public final TextView f178693t;

    /* renamed from: u */
    public C9247b f178694u;

    /* renamed from: v */
    public int f178695v;

    /* renamed from: w */
    public final MTimerHandler f178696w;

    /* renamed from: qj1.sd$b */
    public static final class C35913b extends C87413o implements C32230s<Boolean, Integer, Integer, String, C50262lh0, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C62976sd f95806d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35913b(C62976sd sdVar) {
            super(5);
            this.f95806d = sdVar;
        }

        /* renamed from: D */
        public Object mo237D(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            ((Number) obj2).intValue();
            ((Number) obj3).intValue();
            C50262lh0 lh02 = (C50262lh0) obj5;
            C87412m.m108594g((String) obj4, "errMsg");
            String str = this.f95806d.f178690q;
            Log.m105924i(str, "close live result:" + booleanValue);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.sd$a */
    public static final class C62977a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C62976sd f178697d;

        public C62977a(C62976sd sdVar) {
            this.f178697d = sdVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveReadyPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i(this.f178697d.f178690q, "cancel live by click btn.");
            this.f178697d.mo87908Z0();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveReadyPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.sd$c */
    public static final class C62978c implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ C62976sd f178698d;

        public C62978c(C62976sd sdVar) {
            this.f178698d = sdVar;
        }

        public final boolean onTimerExpired() {
            C62976sd sdVar = this.f178698d;
            int i = sdVar.f178695v;
            sdVar.getClass();
            if (i > 0) {
                C62976sd sdVar2 = this.f178698d;
                sdVar2.f178693t.setVisibility(0);
                sdVar2.f178693t.setText(String.valueOf(sdVar2.f178695v));
                C62976sd sdVar3 = this.f178698d;
                sdVar3.f178695v--;
                return true;
            }
            C62976sd sdVar4 = this.f178698d;
            sdVar4.getClass();
            C58704c5.m68184a(C58704c5.f168044a, C58713e5.f168095w.f168101b, (C89349b) null, false, false, 14, (Object) null);
            ((C58052j1) ((C54991o) sdVar4.mo87684A0().mo71262a(C54991o.class)).f154221K3).setValue(Boolean.TRUE);
            C9247b bVar = sdVar4.f178694u;
            if (bVar != null) {
                bVar.begin();
            }
            sdVar4.f178693t.setVisibility(8);
            sdVar4.f178692s.setVisibility(8);
            return false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62976sd(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        C9247b bVar2 = null;
        this.f178689p = bVar;
        Button button = (Button) viewGroup.findViewById(C0966R.C0970id.f358228dy3);
        this.f178692s = button;
        this.f178693t = (TextView) viewGroup.findViewById(C0966R.C0970id.dy4);
        ProgressBar progressBar = (ProgressBar) viewGroup.findViewById(C0966R.C0970id.dql);
        if (progressBar != null) {
            bVar2 = new C9247b();
            bVar2.f28992c = 1000;
            C9253g gVar = new C9253g();
            gVar.f28998b = progressBar;
            bVar2.f28991b = gVar;
        }
        this.f178694u = bVar2;
        this.f178695v = 3;
        this.f178696w = new MTimerHandler(new C62978c(this), true);
        button.setOnClickListener(new C62977a(this));
        C9247b bVar3 = this.f178694u;
        if (bVar3 != null) {
            bVar3.mo8913b();
        }
    }

    /* renamed from: Z0 */
    public final void mo87908Z0() {
        String str;
        Class cls = C54108o.class;
        Class cls2 = LiveAnchorSlice.class;
        Log.m105924i(this.f178690q, "[cancelLive]");
        mo87910b1();
        this.f178696w.stopTimer();
        mo87909a1();
        C58124b.C7172a.m7372a(this.f178689p, C58124b.C58125b.BEFORE_LIVE, (Bundle) null, 2, (Object) null);
        C58124b.C7172a.m7372a(this.f178689p, C58124b.C58125b.LIVE_READY_CANCEL_COUNTER, (Bundle) null, 2, (Object) null);
        C58704c5 c5Var = C58704c5.f168044a;
        C58713e5.C58715b bVar = C58713e5.f168073a;
        C58704c5.m68184a(c5Var, C58713e5.f168071C.f168101b, (C89349b) null, false, true, 6, (Object) null);
        ((C55001u) mo87696x0(C55001u.class)).mo76042m3(new C64273c21());
        if (this.f178689p.getLiveRole() == 1) {
            int i = ((LiveAnchorSlice) mo87696x0(cls2)).f160032h;
            long j = ((LiveAnchorSlice) mo87696x0(cls2)).f160033i;
            if (i == 0 || j == 0) {
                str = "";
            } else {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("entrance_type", i);
                jSONObject.put("entrance_id", j);
                str = jSONObject.toString();
            }
            String str2 = str;
            C87412m.m108593f(str2, "if (entranceType != 0 &&…         \"\"\n            }");
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8600a((C8777j5) c, 11, str2, (String) null, 4, (Object) null);
            ((C54108o) C86312j.m106911c(cls)).ay0(C54067f0.C54077p.LIVE_EXIT_CANCEL_TIMER);
        }
    }

    /* renamed from: a1 */
    public void mo87909a1() {
        this.f178693t.setScaleX(1.0f);
        this.f178693t.setScaleY(1.0f);
        this.f178695v = this.f178691r;
        C9247b bVar = this.f178694u;
        if (bVar != null) {
            bVar.mo8913b();
        }
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return false;
    }

    /* renamed from: b1 */
    public final void mo87910b1() {
        C39952a securityDataScope;
        Class cls = C54991o.class;
        Context context = this.f166287d.getContext();
        C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        if (!((MMActivity) context).isStopped()) {
            Context context2 = this.f166287d.getContext();
            C87412m.m108592e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            if (!((MMActivity) context2).isFinishing()) {
                C53973z1 z1Var = ((C54991o) mo87684A0().mo71262a(cls)).f154217J3;
                if (z1Var != null) {
                    C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
                }
                C58087u0<Boolean> u0Var = ((C54991o) mo87684A0().mo71262a(cls)).f154221K3;
                Boolean bool = Boolean.FALSE;
                ((C58052j1) u0Var).setValue(bool);
                Log.printInfoStack(this.f178690q, "isReadyPluginCountDownOk resetData", new Object[0]);
                ((C58052j1) ((C54991o) mo87684A0().mo71262a(cls)).f154213I3).setValue(new C13604l(bool, null));
                FinderLiveService.f159376d.getClass();
                C56032b bVar = FinderLiveService.f159379g;
                if (bVar != null && (securityDataScope = bVar.getSecurityDataScope()) != null) {
                    C53930o0.m60556c(securityDataScope, (CancellationException) null);
                }
            }
        }
    }

    /* renamed from: g */
    public void mo10792g(int i) {
        super.mo10792g(i);
        if (i == 4 || i == 8) {
            mo87910b1();
            this.f178696w.stopTimer();
            mo87909a1();
        }
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: l0 */
    public boolean mo3207l0() {
        if (this.f166287d.getVisibility() != 0) {
            return false;
        }
        Log.m105924i(this.f178690q, "cancel live by click back.");
        mo87908Z0();
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        super.mo3210u0(bVar, bundle);
        int ordinal = bVar.ordinal();
        if (ordinal != 5) {
            if (ordinal == 6) {
                Log.printInfoStack(this.f178690q, "ILiveStatusLiveStatusREADY", new Object[0]);
                mo10792g(0);
                this.f178692s.setVisibility(0);
                this.f178696w.startTimer(0, 1000);
                C9247b bVar2 = this.f178694u;
                if (bVar2 != null) {
                    bVar2.mo8913b();
                    return;
                }
                return;
            } else if (!(ordinal == 7 || ordinal == 27)) {
                if (ordinal == 56) {
                    C54795n5 D0 = mo14476D0();
                    if (D0 != null) {
                        C54795n5.C54796a.m61723a(D0, 0, new C35913b(this), 1, (Object) null);
                    }
                    ((C54991o) mo87684A0().mo71262a(C54991o.class)).f154209H3 = false;
                    return;
                }
                return;
            }
        }
        mo10792g(8);
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        super.mo3211w0();
        mo87910b1();
        this.f178696w.stopTimer();
        mo87909a1();
    }
}
