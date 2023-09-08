package z03;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: z03.h */
public class C23432h implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C23433i f67192d;

    public C23432h(C23433i iVar) {
        this.f67192d = iVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!this.f67192d.getListVideoUIComponent().mo24995y5().f66031e) {
            Log.m105924i("MicroMsg.TopStory.TopStoryListVideoContainer", "no video play now");
        } else if (this.f67192d.f67194G.getVideoTotalTime() - this.f67192d.f67194G.getmPosition() < 2) {
            Log.m105924i("MicroMsg.TopStory.TopStoryListVideoContainer", "cannot change play status in last 2 seconds");
            C117292a.m165361g(this, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        } else {
            this.f67192d.getListVideoUIComponent().mo24967U2().mo36206d(this.f67192d.f65924E);
            if (this.f67192d.getListVideoUIComponent().mo24995y5().mo36212d()) {
                this.f67192d.getListVideoUIComponent().mo24995y5().mo36216h();
                MTimerHandler mTimerHandler = this.f67192d.f67194G.f67220F;
                if (mTimerHandler != null) {
                    mTimerHandler.stopTimer();
                }
            } else {
                this.f67192d.getListVideoUIComponent().mo24995y5().mo36219k();
                C23446j jVar = this.f67192d.f67194G;
                MTimerHandler mTimerHandler2 = jVar.f67220F;
                if (mTimerHandler2 != null) {
                    mTimerHandler2.stopTimer();
                    jVar.f67220F.startTimer(2000);
                }
            }
            this.f67192d.mo36155k();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
