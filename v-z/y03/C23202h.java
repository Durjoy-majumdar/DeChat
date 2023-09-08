package y03;

import com.tencent.p014mm.sdk.platformtools.Log;
import v73.C102158a;
import xn2.C102693c;

/* renamed from: y03.h */
public class C23202h implements C102693c {

    /* renamed from: d */
    public final /* synthetic */ C23184e f66611d;

    public C23202h(C23184e eVar) {
        this.f66611d = eVar;
    }

    /* renamed from: a */
    public void mo4335a(int i) {
        Log.m105925i("MicroMsg.TopStory.TopStoryFSVideoContainer", "onSeekTo %d", Integer.valueOf(i));
        this.f66611d.mo36142f(i);
        this.f66611d.f66579G.mo36651A();
        C102158a.m134600a(22);
    }

    /* renamed from: c */
    public void mo4336c(int i) {
    }

    public void onSeekPre() {
        Log.m105924i("MicroMsg.TopStory.TopStoryFSVideoContainer", "onSeekPre");
        this.f66611d.f66579G.mo36652B();
    }
}
