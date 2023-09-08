package tu1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.api.ITPPlayer;
import com.tencent.thumbplayer.api.ITPPlayerListener;

/* renamed from: tu1.h */
public final class C118529h implements ITPPlayerListener.IOnSeekCompleteListener {

    /* renamed from: d */
    public final /* synthetic */ C118522d f354727d;

    public C118529h(C118522d dVar) {
        this.f354727d = dVar;
    }

    public final void onSeekComplete(ITPPlayer iTPPlayer) {
        String str = this.f354727d.f354709a;
        Log.m105924i(str, iTPPlayer + " on seek");
        C118541p pVar = this.f354727d.f354713e;
        if (pVar != null) {
            ((C118539n) pVar).mo183257a(false, 9);
        }
    }
}
