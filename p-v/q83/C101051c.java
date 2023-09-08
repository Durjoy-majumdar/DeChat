package q83;

import com.tencent.p014mm.plugin.webview.fts.p810ui.FtsWebVideoView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import r83.C47955h;
import xn2.C102693c;

/* renamed from: q83.c */
public class C101051c implements C102693c {

    /* renamed from: d */
    public final /* synthetic */ FtsWebVideoView f295843d;

    public C101051c(FtsWebVideoView ftsWebVideoView) {
        this.f295843d = ftsWebVideoView;
    }

    /* renamed from: a */
    public void mo4335a(int i) {
        Log.m105925i("MicroMsg.FtsWebVideoView", "onSeekTo %d", Integer.valueOf(i));
        this.f295843d.mo134755j(i, false);
        this.f295843d.f282962g.mo134731z();
        C47955h hVar = this.f295843d.f282946H;
        if (hVar != null) {
            hVar.mo72727i();
        }
    }

    /* renamed from: c */
    public void mo4336c(int i) {
    }

    public void onSeekPre() {
        Log.m105924i("MicroMsg.FtsWebVideoView", "onSeekPre");
        MTimerHandler mTimerHandler = this.f295843d.f282962g.f282905L;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
        }
    }
}
