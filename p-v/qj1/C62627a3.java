package qj1;

import ak1.C54108o;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import c50.C54655b;
import cj1.C54768h6;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.xweb.file.XVFSFile;
import d60.C58124b;
import di3.C86312j;
import er1.C58739j4;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76912y0;
import o40.C61926c;
import ok1.C62042e;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C49712hj1;
import wg1.C66089v;
import y50.C15936n0;

/* renamed from: qj1.a3 */
public final class C62627a3 extends C62660c {

    /* renamed from: p */
    public final C58124b f177839p;

    /* renamed from: q */
    public final String f177840q = "Finder.FinderLiveAnchorPausePlugin";

    /* renamed from: r */
    public final TextView f177841r;

    /* renamed from: s */
    public int f177842s;

    /* renamed from: t */
    public long f177843t;

    /* renamed from: u */
    public long f177844u;

    /* renamed from: v */
    public final C13601g f177845v;

    /* renamed from: qj1.a3$a */
    public static final class C62628a implements View.OnClickListener {

        /* renamed from: d */
        public static final C62628a f177846d = new C62628a();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorPausePlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorPausePlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.a3$b */
    public static final class C62629b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C62627a3 f177847d;

        public C62629b(C62627a3 a3Var) {
            this.f177847d = a3Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorPausePlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (C58739j4.f168176a.mo83683L()) {
                Log.m105924i(this.f177847d.f177840q, "reset pause click too fast!");
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorPausePlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C62627a3 a3Var = this.f177847d;
            C58124b bVar = a3Var.f177839p;
            C58124b.C58125b bVar2 = C58124b.C58125b.FINDER_LIVE_ANCHOR_PAUSE_RECOVERY;
            Bundle bundle = new Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_ANCHOR_PAUSE_RECOVERY", true);
            C13598b0 b0Var = C13598b0.f38549a;
            bVar.statusChange(bVar2, bundle);
            ((C54108o) C86312j.m106911c(C54108o.class)).Jx0(2, a3Var.f177842s);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorPausePlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.a3$c */
    public static final class C62630c extends C87413o implements C32224a<MTimerHandler> {

        /* renamed from: d */
        public final /* synthetic */ C62627a3 f177848d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62630c(C62627a3 a3Var) {
            super(0);
            this.f177848d = a3Var;
        }

        public Object invoke() {
            return new MTimerHandler("LiveAnchorPause::Timer", (MTimerHandler.CallBack) new C62666c3(this.f177848d), true);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62627a3(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f177839p = bVar;
        TextView textView = (TextView) viewGroup.findViewById(C0966R.C0970id.hrw);
        this.f177841r = textView;
        TextView textView2 = (TextView) viewGroup.findViewById(C0966R.C0970id.f359091is3);
        this.f177844u = 10;
        viewGroup.setOnClickListener(C62628a.f177846d);
        textView2.setOnClickListener(new C62629b(this));
        C85875k4.m106189j0(((TextView) viewGroup.findViewById(C0966R.C0970id.hrv)).getPaint(), 0.8f);
        C85875k4.m106189j0(textView.getPaint(), 0.8f);
        C85875k4.m106189j0(textView2.getPaint(), 0.8f);
        this.f177845v = C36568h.m40985a(new C62630c(this));
    }

    /* renamed from: Z0 */
    public final void mo87662Z0() {
        C62987t2 t2Var;
        C66089v vVar;
        Class cls = C54991o.class;
        if (((C54991o) mo87696x0(cls)).mo75999e4() && C61926c.m72696u(((C54991o) mo87696x0(cls)).f154291a1, 524288) && !C61926c.m72696u(((C54991o) mo87696x0(cls)).f154291a1, 32)) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = ((C54991o) mo87696x0(cls)).f154279X2;
            this.f177842s = (1 > j ? 1 : (1 == j ? 0 : -1)) <= 0 && (j > elapsedRealtime ? 1 : (j == elapsedRealtime ? 0 : -1)) < 0 ? (int) ((elapsedRealtime - ((C54991o) mo87696x0(cls)).f154279X2) / ((long) 1000)) : ((C54991o) mo87696x0(cls)).f154284Y2;
            String str = this.f177840q;
            Log.printInfoStack(str, "showLivePauseView curTime:" + elapsedRealtime + ", anchorPauseStartTime:" + ((C54991o) mo87696x0(cls)).f154279X2 + ", anchorPauseTimeCount:" + ((C54991o) mo87696x0(cls)).f154284Y2 + ", remainTime:" + this.f177842s, new Object[0]);
            int i = this.f177842s;
            if (i < 0) {
                mo10792g(8);
                C76912y0.makeText(this.f166287d.getContext(), (CharSequence) this.f166287d.getContext().getResources().getString(C0966R.string.e1n), 0).show();
                String str2 = this.f177840q;
                Log.m105920e(str2, "show pause live error,remain time:" + this.f177842s + " illegal!");
                return;
            }
            this.f177841r.setText(C15936n0.f42815a.mo14587b(i, XVFSFile.PATH_SEPARATOR));
            mo14484z0().fillBlurBg(((C54991o) mo87696x0(cls)).f154345o, true);
            mo14484z0().showBlurBg();
            mo10792g(0);
            C54768h6 c = ((C54991o) mo87696x0(cls)).f154232N2.mo75646c();
            if (!(c == null || (t2Var = (C62987t2) mo87687E0(C62987t2.class)) == null || (vVar = t2Var.f178716q) == null)) {
                vVar.mo89990E0(c, ((C54991o) mo87696x0(cls)).f154232N2.f153467d);
            }
            C54655b b = FinderLiveService.f159376d.mo77626b();
            if (b != null) {
                b.mo85689g0();
            }
            mo87663a1().stopTimer();
            mo87663a1().startTimer(1000);
            if (C62042e.f176370a.mo87035Q0(mo87684A0())) {
                this.f166287d.setBackground((Drawable) null);
            }
        }
    }

    /* renamed from: a1 */
    public final MTimerHandler mo87663a1() {
        return (MTimerHandler) ((C36570n) this.f177845v).getValue();
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return false;
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        if (ordinal == 169) {
            mo87662Z0();
        } else if (ordinal == 175) {
            boolean z = bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_ANCHOR_PAUSE_RECOVERY", false) : false;
            String str = this.f177840q;
            Log.printInfoStack(str, "resumeLiveLogic showRecoveryView:" + z, new Object[0]);
            mo10792g(8);
            mo87663a1().stopTimer();
            C56032b.hideLoadingLayer$default(mo14484z0(), false, 1, (Object) null);
            if (!z) {
                C54655b b = FinderLiveService.f159376d.mo77626b();
                if (b != null) {
                    b.mo85695n0();
                    return;
                }
                return;
            }
            C58124b.C7172a.m7372a(this.f177839p, C58124b.C58125b.FINDER_LIVE_ANCHOR_PAUSE_RECOVERY_SHOW, (Bundle) null, 2, (Object) null);
        } else if (ordinal == 190 && mo14483f0() == 0) {
            Log.m105924i(this.f177840q, "anchor verification start, hide pause plugin");
            mo10792g(8);
            mo87663a1().stopTimer();
        }
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        mo87663a1().stopTimer();
    }
}
