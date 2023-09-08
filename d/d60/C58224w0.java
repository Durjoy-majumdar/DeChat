package d60;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import d60.C58124b;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import te3.C49317ep2;

/* renamed from: d60.w0 */
public final class C58224w0 extends C58121a {

    /* renamed from: f */
    public final C58124b f166737f;

    /* renamed from: g */
    public final int f166738g = 3;

    /* renamed from: h */
    public final TextView f166739h;

    /* renamed from: i */
    public int f166740i;

    /* renamed from: j */
    public final MTimerHandler f166741j;

    /* renamed from: d60.w0$a */
    public static final class C58225a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C58224w0 f166742d;

        public C58225a(C58224w0 w0Var) {
            this.f166742d = w0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/plugin/LiveReadyPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f166742d.f166741j.stopTimer();
            this.f166742d.mo82965x0();
            RoomLiveService roomLiveService = RoomLiveService.f157190a;
            RoomLiveService.f157197h = new C49317ep2();
            C58124b.C7172a.m7372a(this.f166742d.f166737f, C58124b.C58125b.BEFORE_LIVE, (Bundle) null, 2, (Object) null);
            C58124b.C7172a.m7372a(this.f166742d.f166737f, C58124b.C58125b.LIVE_READY_CANCEL_COUNTER, (Bundle) null, 2, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/live/plugin/LiveReadyPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: d60.w0$b */
    public static final class C58226b implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ C58224w0 f166743d;

        public C58226b(C58224w0 w0Var) {
            this.f166743d = w0Var;
        }

        public final boolean onTimerExpired() {
            C58224w0 w0Var = this.f166743d;
            int i = w0Var.f166740i;
            w0Var.getClass();
            if (i > 0) {
                C58224w0 w0Var2 = this.f166743d;
                w0Var2.f166740i--;
                w0Var2.mo82966y0();
                return true;
            }
            C58124b.C7172a.m7372a(this.f166743d.f166737f, C58124b.C58125b.LIVE_STATUS_JOIN_LIVE, (Bundle) null, 2, (Object) null);
            return false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58224w0(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f166737f = bVar;
        this.f166739h = (TextView) viewGroup.findViewById(C0966R.C0970id.fx4);
        this.f166740i = 3;
        this.f166741j = new MTimerHandler(new C58226b(this), true);
        ((Button) viewGroup.findViewById(C0966R.C0970id.f358583fx2)).setOnClickListener(new C58225a(this));
    }

    /* renamed from: g */
    public void mo10792g(int i) {
        super.mo10792g(i);
        if (i == 4 || i == 8) {
            this.f166741j.stopTimer();
            mo82965x0();
        }
    }

    /* renamed from: l0 */
    public boolean mo3207l0() {
        if (this.f166287d.getVisibility() != 0) {
            return false;
        }
        this.f166741j.stopTimer();
        mo82965x0();
        RoomLiveService roomLiveService = RoomLiveService.f157190a;
        RoomLiveService.f157197h = new C49317ep2();
        C58124b.C7172a.m7372a(this.f166737f, C58124b.C58125b.BEFORE_LIVE, (Bundle) null, 2, (Object) null);
        return true;
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        if (ordinal != 5) {
            if (ordinal == 6) {
                mo10792g(0);
                mo82966y0();
                this.f166741j.startTimer(1000, 1000);
                return;
            } else if (!(ordinal == 7 || ordinal == 27)) {
                if (ordinal == 56) {
                    RoomLiveService roomLiveService = RoomLiveService.f157190a;
                    RoomLiveService.f157170B = true;
                    Log.m105924i("MicroMsg.LiveAnchorIDKeyStat", "markAnchorStopCounter");
                    C115669n.INSTANCE.mo175913w(1380, 4, 1);
                    return;
                }
                return;
            }
        }
        mo10792g(8);
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        this.f166741j.stopTimer();
        mo82965x0();
    }

    /* renamed from: x0 */
    public final void mo82965x0() {
        this.f166739h.setScaleX(1.0f);
        this.f166739h.setScaleY(1.0f);
        this.f166740i = this.f166738g;
    }

    /* renamed from: y0 */
    public final void mo82966y0() {
        this.f166739h.setText(String.valueOf(this.f166740i));
        this.f166739h.setScaleX(1.5f);
        this.f166739h.setScaleY(1.5f);
        this.f166739h.animate().scaleX(1.0f).scaleY(1.0f).setDuration(200).start();
    }
}
