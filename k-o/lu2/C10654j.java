package lu2;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.item.C95953r;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: lu2.j */
public class C10654j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f32070d;

    public C10654j(C95953r rVar, View view) {
        this.f32070d = view;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem$1");
        View view = this.f32070d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/VideoTimeLineItem$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/item/VideoTimeLineItem$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem$1");
    }
}
