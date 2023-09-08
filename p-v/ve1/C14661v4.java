package ve1;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.convert.C2422e;
import com.tencent.p014mm.plugin.finder.video.FinderVideoGreenSeekBar;
import j20.C117292a;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;

/* renamed from: ve1.v4 */
public final class C14661v4 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C60905o f40545d;

    /* renamed from: e */
    public final /* synthetic */ C2422e f40546e;

    public C14661v4(C60905o oVar, C2422e eVar) {
        this.f40545d = oVar;
        this.f40546e = eVar;
    }

    public final void run() {
        View D = this.f40545d.mo85812D(C0966R.C0970id.n9s);
        if (D.getVisibility() == 0 && !((FinderVideoGreenSeekBar) this.f40545d.mo85812D(C0966R.C0970id.n9t)).f17581y0) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = D;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$checkHideSeekBar$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$checkHideSeekBar$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View D2 = this.f40545d.mo85812D(C0966R.C0970id.eah);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            C117292a.m165358d(D2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$checkHideSeekBar$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(D2, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$checkHideSeekBar$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f40546e.f12845T = null;
    }
}
