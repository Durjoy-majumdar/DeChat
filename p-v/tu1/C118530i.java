package tu1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.api.ITPPlayerListener;

/* renamed from: tu1.i */
public final class C118530i implements ITPPlayerListener.IOnStateChangeListener {

    /* renamed from: d */
    public final /* synthetic */ C118522d f354728d;

    public C118530i(C118522d dVar) {
        this.f354728d = dVar;
    }

    public final void onStateChange(int i, int i2) {
        C118541p pVar;
        String str = this.f354728d.f354709a;
        Log.m105924i(str, this.f354728d.f354711c + " prestate: " + i + ", curState: " + i2);
        C118522d dVar = this.f354728d;
        dVar.f354716h = i2;
        if (i2 == 3 && (pVar = dVar.f354713e) != null) {
            ((C118539n) pVar).mo183257a(false, 5);
        }
    }
}
