package qj1;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import cl1.C54951d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import d60.C58124b;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import te3.C49712hj1;

/* renamed from: qj1.w */
public final class C63064w extends C62660c {

    /* renamed from: p */
    public final ViewGroup f178966p;

    /* renamed from: q */
    public final C58124b f178967q;

    /* renamed from: r */
    public final TextView f178968r;

    /* renamed from: s */
    public final View f178969s;

    /* renamed from: t */
    public final ProgressBar f178970t;

    /* renamed from: u */
    public volatile int f178971u;

    /* renamed from: v */
    public final MMHandler f178972v = new MMHandler(Looper.getMainLooper(), (MMHandler.Callback) new C63066b(this));

    /* renamed from: w */
    public ValueAnimator f178973w;

    /* renamed from: qj1.w$a */
    public /* synthetic */ class C63065a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f178974a;

        static {
            int[] iArr = new int[C58124b.C58125b.values().length];
            C58124b.C58125b bVar = C58124b.C58125b.UNKNOWN;
            iArr[7] = 1;
            f178974a = iArr;
        }
    }

    /* renamed from: qj1.w$b */
    public static final class C63066b implements MMHandler.Callback {

        /* renamed from: d */
        public final /* synthetic */ C63064w f178975d;

        public C63066b(C63064w wVar) {
            this.f178975d = wVar;
        }

        public final boolean handleMessage(Message message) {
            C87412m.m108594g(message, LocaleUtil.ITALIAN);
            if (message.what == 1) {
                this.f178975d.f178971u = message.arg1;
                C63064w wVar = this.f178975d;
                wVar.getClass();
                Log.m105924i("FinderLiveAdVideoTimerPlugin", "startLoop: " + wVar.f178971u);
                wVar.f178972v.sendMessageDelayed(wVar.f178972v.obtainMessage(1, 0, 0), 500);
            }
            return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63064w(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "rootView");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f178966p = viewGroup;
        this.f178967q = bVar;
        this.f178968r = (TextView) viewGroup.findViewById(C0966R.C0970id.n8h);
        this.f178969s = viewGroup.findViewById(C0966R.C0970id.n8j);
        this.f178970t = (ProgressBar) viewGroup.findViewById(C0966R.C0970id.n8i);
        mo10792g(8);
    }

    /* renamed from: Z0 */
    public final void mo88000Z0() {
        Log.m105924i("FinderLiveAdVideoTimerPlugin", "showProgressTimerTv");
        this.f178968r.setVisibility(0);
        View view = this.f178969s;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAdVideoTimerPlugin", "showProgressTimerTv", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAdVideoTimerPlugin", "showProgressTimerTv", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo10792g(0);
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return false;
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return false;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return true;
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        if (C63065a.f178974a[bVar.ordinal()] == 1) {
            ((C54951d) mo87696x0(C54951d.class)).f154003h.observe(this, new C35918x(this));
        }
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        super.mo3211w0();
        this.f178971u = 0;
        this.f178972v.removeMessages(1);
        mo10792g(8);
    }
}
