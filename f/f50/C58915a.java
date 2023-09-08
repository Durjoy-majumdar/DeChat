package f50;

import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.rtmp.ITXLivePlayListener;
import w50.C38014o;

/* renamed from: f50.a */
public abstract class C58915a implements ITXLivePlayListener {
    public void onPlayEvent(int i, Bundle bundle) {
        if (i == 2008) {
            Log.m105924i("AbsTXLivePlayListener", "receive EVT_START_VIDEO_DECODER " + bundle);
            C38014o.f100509a.mo61478a(bundle);
        }
    }
}
