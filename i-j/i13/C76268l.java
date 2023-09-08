package i13;

import android.os.Message;
import android.view.View;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.transvoice.model.C71561b;
import com.tencent.p014mm.plugin.transvoice.model.C71562c;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: i13.l */
public final class C76268l implements MMHandler.Callback {

    /* renamed from: d */
    public final /* synthetic */ C76259g f223455d;

    public C76268l(C76259g gVar) {
        this.f223455d = gVar;
    }

    public final boolean handleMessage(Message message) {
        C87412m.m108594g(message, LocaleUtil.ITALIAN);
        if (message.what == 5000) {
            C71562c cVar = this.f223455d.f223421f;
            cVar.f207379n = 1;
            cVar.f207380o = System.currentTimeMillis();
            C76259g gVar = this.f223455d;
            gVar.f223421f.f207384s = 0;
            MTimerHandler mTimerHandler = gVar.f223403H;
            if (mTimerHandler != null) {
                mTimerHandler.stopTimer();
            }
            C71561b bVar = this.f223455d.f223436w;
            if (bVar != null) {
                bVar.mo98687a(false, false);
            }
            if (!Util.isNullOrNil(this.f223455d.f223438x0)) {
                MMEditText mMEditText = this.f223455d.f223426n;
                if (mMEditText != null) {
                    mMEditText.setFocusable(true);
                }
                MMEditText mMEditText2 = this.f223455d.f223426n;
                if (mMEditText2 != null) {
                    mMEditText2.setFocusableInTouchMode(true);
                }
            }
            C76259g gVar2 = this.f223455d;
            MMEditText mMEditText3 = gVar2.f223426n;
            if (mMEditText3 != null) {
                mMEditText3.setText(gVar2.f223438x0);
            }
            View view = this.f223455d.f223428p;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog$init$14", "handleMessage", "(Landroid/os/Message;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog$init$14", "handleMessage", "(Landroid/os/Message;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        return true;
    }
}
