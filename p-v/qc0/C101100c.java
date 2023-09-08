package qc0;

import com.tencent.p014mm.autogen.events.MusicActionEvent;

/* renamed from: qc0.c */
public class C101100c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C47800k f295936d;

    public C101100c(C47800k kVar) {
        this.f295936d = kVar;
    }

    public void run() {
        MusicActionEvent musicActionEvent = new MusicActionEvent();
        MusicActionEvent.C92531a aVar = musicActionEvent.f264920d;
        aVar.f264922a = 13;
        aVar.f264929h = this.f295936d;
        musicActionEvent.publish();
    }
}
