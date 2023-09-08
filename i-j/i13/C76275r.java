package i13;

import android.view.View;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.transvoice.model.C71561b;
import com.tencent.p014mm.plugin.transvoice.model.C71562c;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;

/* renamed from: i13.r */
public final class C76275r implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C76259g f223463d;

    public C76275r(C76259g gVar) {
        this.f223463d = gVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog$init$4$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C76259g gVar = this.f223463d;
        C71562c cVar = gVar.f223421f;
        cVar.f207386u = 1;
        gVar.f223410P = true;
        if (gVar.f223404I) {
            gVar.f223404I = false;
            cVar.f207384s = 0;
            cVar.f207380o = System.currentTimeMillis();
            C71561b bVar = this.f223463d.f223436w;
            if (bVar != null) {
                bVar.mo98687a(false, true);
            }
            View view2 = this.f223463d.f223428p;
            if (view2 != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view3 = view2;
                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog$init$4$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog$init$4$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            MMHandler mMHandler = this.f223463d.f223407L;
            if (mMHandler != null) {
                mMHandler.removeMessages(5000);
            }
            MTimerHandler mTimerHandler = this.f223463d.f223403H;
            if (mTimerHandler != null) {
                mTimerHandler.stopTimer();
            }
            C76259g gVar2 = this.f223463d;
            MMEditText mMEditText = gVar2.f223426n;
            if (mMEditText != null) {
                mMEditText.setText(gVar2.f223438x0);
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog$init$4$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
