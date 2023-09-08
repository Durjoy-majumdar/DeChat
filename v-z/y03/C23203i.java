package y03;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: y03.i */
public class C23203i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C23184e f66612d;

    public C23203i(C23184e eVar) {
        this.f66612d = eVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f66612d.getFSVideoUIComponent().mo24995y5().f66031e) {
            C23204j jVar = this.f66612d.f66579G;
            if ((jVar instanceof C23222y) || jVar.getVideoTotalTime() - this.f66612d.f66579G.getmPosition() >= 2) {
                this.f66612d.getFSVideoUIComponent().mo24967U2().mo36206d(this.f66612d.f65924E);
                if (this.f66612d.getFSVideoUIComponent().mo24995y5().mo36212d()) {
                    this.f66612d.getFSVideoUIComponent().mo24995y5().mo36216h();
                    this.f66612d.f66579G.mo36652B();
                } else {
                    this.f66612d.getFSVideoUIComponent().mo24995y5().mo36219k();
                    this.f66612d.f66579G.mo36651A();
                }
                this.f66612d.mo36155k();
            } else {
                Log.m105924i("MicroMsg.TopStory.TopStoryFSVideoContainer", "cannot change play status in last 2 seconds");
                C117292a.m165361g(this, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        } else {
            Log.m105924i("MicroMsg.TopStory.TopStoryFSVideoContainer", "no video play now");
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
