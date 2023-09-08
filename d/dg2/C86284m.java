package dg2;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.plugin.qqmail.p090ui.ReadMailUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: dg2.m */
public class C86284m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Bundle f250899d;

    /* renamed from: e */
    public final /* synthetic */ C86285n f250900e;

    public C86284m(C86285n nVar, Bundle bundle) {
        this.f250900e = nVar;
        this.f250899d = bundle;
    }

    public void run() {
        this.f250900e.f250901d.f248809E = this.f250899d.getInt("download_status");
        float f = this.f250899d.getFloat("download_progress");
        int i = 0;
        Log.m105919d("MicroMsg.ReadMailUI", "download progress %f", Float.valueOf(f));
        View view = this.f250900e.f250901d.f248832v;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/qqmail/ui/ReadMailUI$18$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/qqmail/ui/ReadMailUI$18$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (f == 1.0f) {
            this.f250900e.f250901d.f248816L.stopTimer();
            this.f250900e.f250901d.mo118702K7();
            return;
        }
        this.f250900e.f250901d.mo118703L7();
        ReadMailUI readMailUI = this.f250900e.f250901d;
        int i2 = readMailUI.f248811G;
        if (i2 == 0) {
            readMailUI.f248811G = readMailUI.f248832v.getWidth();
        } else {
            i = (int) (f * ((float) i2));
        }
        ReadMailUI readMailUI2 = this.f250900e.f250901d;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) readMailUI2.f248833w.getLayoutParams();
        layoutParams.width = i;
        readMailUI2.f248833w.setLayoutParams(layoutParams);
        this.f250900e.f250901d.f248816L.startTimer(500);
    }
}
