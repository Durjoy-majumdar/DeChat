package qc0;

import com.tencent.p014mm.autogen.events.MusicActionEvent;
import java.util.List;

/* renamed from: qc0.h */
public class C101105h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ List f295938d;

    /* renamed from: e */
    public final /* synthetic */ int f295939e;

    public C101105h(List list, int i) {
        this.f295938d = list;
        this.f295939e = i;
    }

    public void run() {
        MusicActionEvent musicActionEvent = new MusicActionEvent();
        MusicActionEvent.C92531a aVar = musicActionEvent.f264920d;
        aVar.f264922a = 4;
        aVar.f264924c = this.f295938d;
        aVar.f264925d = this.f295939e;
        musicActionEvent.publish();
    }
}
