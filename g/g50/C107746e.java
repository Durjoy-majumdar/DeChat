package g50;

import android.os.Bundle;
import com.tencent.rtmp.TXLiveConstants;

/* renamed from: g50.e */
public class C107746e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C107747f f322452d;

    public C107746e(C107747f fVar) {
        this.f322452d = fVar;
    }

    public void run() {
        if (this.f322452d.f322453A != null) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("fromCustomRender", true);
            this.f322452d.f322453A.onPlayEvent(TXLiveConstants.PLAY_EVT_RENDER_FIRST_FRAME_ON_VIEW, bundle);
        }
    }
}
