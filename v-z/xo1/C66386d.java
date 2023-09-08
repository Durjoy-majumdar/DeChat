package xo1;

import com.tencent.thumbplayer.api.ITPPlayer;
import com.tencent.thumbplayer.api.ITPPlayerListener;

/* renamed from: xo1.d */
public final class C66386d implements ITPPlayerListener.IOnPreparedListener {

    /* renamed from: d */
    public final /* synthetic */ C66388f f191111d;

    public C66386d(C66388f fVar) {
        this.f191111d = fVar;
    }

    public final void onPrepared(ITPPlayer iTPPlayer) {
        this.f191111d.mo90486G3(iTPPlayer.getVideoWidth() > iTPPlayer.getVideoHeight());
    }
}
