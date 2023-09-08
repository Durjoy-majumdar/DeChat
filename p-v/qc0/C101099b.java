package qc0;

import com.tencent.p014mm.autogen.events.MusicActionEvent;
import java.util.List;

/* renamed from: qc0.b */
public class C101099b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ List f295934d;

    /* renamed from: e */
    public final /* synthetic */ boolean f295935e;

    public C101099b(List list, boolean z) {
        this.f295934d = list;
        this.f295935e = z;
    }

    public void run() {
        MusicActionEvent musicActionEvent = new MusicActionEvent();
        MusicActionEvent.C92531a aVar = musicActionEvent.f264920d;
        aVar.f264922a = 5;
        aVar.f264924c = this.f295934d;
        aVar.f264926e = this.f295935e;
        musicActionEvent.publish();
    }
}
