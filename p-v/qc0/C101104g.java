package qc0;

import com.tencent.p014mm.autogen.events.MusicActionEvent;

/* renamed from: qc0.g */
public class C101104g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C101106m f295937d;

    public C101104g(C101106m mVar) {
        this.f295937d = mVar;
    }

    public void run() {
        MusicActionEvent musicActionEvent = new MusicActionEvent();
        MusicActionEvent.C92531a aVar = musicActionEvent.f264920d;
        aVar.f264922a = 6;
        aVar.f264923b = this.f295937d;
        musicActionEvent.publish();
    }
}
