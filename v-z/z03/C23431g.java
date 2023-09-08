package z03;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import v73.C102158a;
import xn2.C102693c;

/* renamed from: z03.g */
public class C23431g implements C102693c {

    /* renamed from: d */
    public final /* synthetic */ C23433i f67191d;

    public C23431g(C23433i iVar) {
        this.f67191d = iVar;
    }

    /* renamed from: a */
    public void mo4335a(int i) {
        Log.m105925i("MicroMsg.TopStory.TopStoryListVideoContainer", "onSeekTo %d", Integer.valueOf(i));
        this.f67191d.mo36142f(i);
        C23446j jVar = this.f67191d.f67194G;
        MTimerHandler mTimerHandler = jVar.f67220F;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
            jVar.f67220F.startTimer(2000);
        }
        C102158a.m134600a(22);
    }

    /* renamed from: c */
    public void mo4336c(int i) {
    }

    public void onSeekPre() {
        Log.m105924i("MicroMsg.TopStory.TopStoryListVideoContainer", "onSeekPre");
        MTimerHandler mTimerHandler = this.f67191d.f67194G.f67220F;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
        }
    }
}
