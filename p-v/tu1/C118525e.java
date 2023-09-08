package tu1;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.api.ITPPlayer;
import com.tencent.thumbplayer.api.ITPPlayerListener;
import zt3.C119157j;

/* renamed from: tu1.e */
public final class C118525e implements ITPPlayerListener.IOnPreparedListener {

    /* renamed from: d */
    public final /* synthetic */ C118522d f354723d;

    /* renamed from: tu1.e$a */
    public static final class C118526a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C118522d f354724d;

        public C118526a(C118522d dVar) {
            this.f354724d = dVar;
        }

        public final void run() {
            C118541p pVar = this.f354724d.f354713e;
            if (pVar != null) {
                ((C118539n) pVar).mo183257a(false, 2);
            }
        }
    }

    public C118525e(C118522d dVar) {
        this.f354723d = dVar;
    }

    public final void onPrepared(ITPPlayer iTPPlayer) {
        String str = this.f354723d.f354709a;
        Log.m105924i(str, "FVPlayer video_status " + iTPPlayer + " prepared");
        this.f354723d.getClass();
        C118541p pVar = this.f354723d.f354713e;
        if (pVar != null) {
            ((C118539n) pVar).mo183257a(false, 3);
        }
        C115669n.INSTANCE.mo175911u(1414, 0);
        ((C119157j) C119157j.f356862d).mo183895z(new C118526a(this.f354723d));
    }
}
