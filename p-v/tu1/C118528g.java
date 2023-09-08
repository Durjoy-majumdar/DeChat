package tu1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.api.ITPPlayer;
import com.tencent.thumbplayer.api.ITPPlayerListener;

/* renamed from: tu1.g */
public final class C118528g implements ITPPlayerListener.IOnCompletionListener {

    /* renamed from: d */
    public final /* synthetic */ C118522d f354726d;

    public C118528g(C118522d dVar) {
        this.f354726d = dVar;
    }

    public final void onCompletion(ITPPlayer iTPPlayer) {
        String str = this.f354726d.f354709a;
        Log.m105924i(str, iTPPlayer + " on complete");
        C118541p pVar = this.f354726d.f354713e;
        if (pVar != null) {
            ((C118539n) pVar).mo183257a(false, 4);
        }
    }
}
