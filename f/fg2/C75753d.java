package fg2;

import android.os.Message;
import android.view.View;
import com.tencent.p014mm.plugin.radar.p091ui.RadarMemberView;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: fg2.d */
public final class C75753d extends MMHandler {

    /* renamed from: a */
    public final /* synthetic */ RadarMemberView f222354a;

    public C75753d(RadarMemberView radarMemberView) {
        this.f222354a = radarMemberView;
    }

    public void handleMessage(Message message) {
        C87412m.m108594g(message, "msg");
        int i = message.what;
        int i2 = RadarMemberView.f203296C;
        if (i == 0) {
            RadarMemberView radarMemberView = this.f222354a;
            radarMemberView.mo96924f(radarMemberView.getMember(), this.f222354a.getState());
        } else if (i == 1) {
            this.f222354a.setVisibility(4);
            this.f222354a.mo96923e();
            View view = this.f222354a.f203299d;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/radar/ui/RadarMemberView$handler$1", "handleMessage", "(Landroid/os/Message;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/radar/ui/RadarMemberView$handler$1", "handleMessage", "(Landroid/os/Message;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            RadarMemberView radarMemberView2 = this.f222354a;
            RadarMemberView.C70382a aVar2 = radarMemberView2.f203314v;
            if (aVar2 != null) {
                aVar2.mo96931a(radarMemberView2.getMember(), this.f222354a.getState());
            }
        }
    }
}
