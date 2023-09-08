package com.tencent.p014mm.plugin.expt.p472ui;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import la1.C61258b;

/* renamed from: com.tencent.mm.plugin.expt.ui.m */
public class C55647m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ExptReportBanner f158380d;

    public C55647m(ExptReportBanner exptReportBanner) {
        this.f158380d = exptReportBanner;
    }

    public void run() {
        Log.m105924i("MicroMsg.ExptReportBanner", "expt report banner show");
        TextView textView = this.f158380d.f158365j;
        textView.setText("expt debug now!!! key=" + C61258b.vx0().f174351d);
        View view = this.f158380d.f158363h;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/expt/ui/ExptReportBanner$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/expt/ui/ExptReportBanner$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view2 = this.f158380d.f158364i;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(0);
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/expt/ui/ExptReportBanner$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/expt/ui/ExptReportBanner$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
