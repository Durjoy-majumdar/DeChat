package qj1;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import d60.C58124b;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C49712hj1;

/* renamed from: qj1.d3 */
public final class C62696d3 extends C62660c {

    /* renamed from: p */
    public final C58124b f178019p;

    /* renamed from: q */
    public final String f178020q = "Finder.FinderLiveAnchorPauseRecoveryPlugin";

    /* renamed from: r */
    public final TextView f178021r;

    /* renamed from: s */
    public int f178022s;

    /* renamed from: t */
    public boolean f178023t;

    /* renamed from: u */
    public final C13601g f178024u;

    /* renamed from: qj1.d3$a */
    public static final class C62697a implements View.OnClickListener {

        /* renamed from: d */
        public static final C62697a f178025d = new C62697a();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorPauseRecoveryPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorPauseRecoveryPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.d3$b */
    public static final class C62698b extends C87413o implements C32224a<MTimerHandler> {

        /* renamed from: d */
        public final /* synthetic */ C62696d3 f178026d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62698b(C62696d3 d3Var) {
            super(0);
            this.f178026d = d3Var;
        }

        public Object invoke() {
            return new MTimerHandler("LiveAnchorPauseRecovery::Timer", (MTimerHandler.CallBack) new C62802h3(this.f178026d), true);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62696d3(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f178019p = bVar;
        TextView textView = (TextView) viewGroup.findViewById(C0966R.C0970id.bu7);
        this.f178021r = textView;
        this.f178022s = 3;
        viewGroup.setOnClickListener(C62697a.f178025d);
        C85875k4.m106189j0(textView.getPaint(), 0.8f);
        C85875k4.m106189j0(((TextView) viewGroup.findViewById(C0966R.C0970id.iik)).getPaint(), 0.8f);
        this.f178024u = C36568h.m40985a(new C62698b(this));
    }

    /* renamed from: Z0 */
    public final void mo87710Z0() {
        this.f178022s = 3;
        this.f178021r.setText(String.valueOf(3));
        ((MTimerHandler) ((C36570n) this.f178024u).getValue()).stopTimer();
        ((MTimerHandler) ((C36570n) this.f178024u).getValue()).startTimer(1000);
        C56032b.hideLoadingLayer$default(mo14484z0(), false, 1, (Object) null);
        mo10792g(0);
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
        if (ordinal == 176) {
            this.f178023t = false;
            mo87710Z0();
        } else if (ordinal == 192) {
            this.f178023t = true;
            mo87710Z0();
        }
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        ((MTimerHandler) ((C36570n) this.f178024u).getValue()).stopTimer();
    }
}
