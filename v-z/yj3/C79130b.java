package yj3;

import com.tencent.p014mm.p136ui.tools.TestTimeForChatting;

/* renamed from: yj3.b */
public class C79130b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C79123a f232380d;

    public C79130b(C79123a aVar) {
        this.f232380d = aVar;
    }

    public void run() {
        this.f232380d.onSwipe(1.0f);
        C79123a aVar = this.f232380d;
        TestTimeForChatting testTimeForChatting = aVar.f232355i;
        if (!(testTimeForChatting == null || aVar.f232352f == null)) {
            testTimeForChatting.mo104056a();
        }
        this.f232380d.f232353g.onEnterEnd();
        this.f232380d.mo109075l();
    }
}
