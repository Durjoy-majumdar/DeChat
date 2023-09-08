package b50;

import com.tencent.p014mm.live.core.core.trtc.sdkadapter.feature.Vcodec2Decoder;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.rtmp.TXLiveBase;
import gy3.C87412m;
import p156gj.C107842p;

/* renamed from: b50.k */
public final class C54425k {

    /* renamed from: a */
    public static final C54425k f152655a = new C54425k();

    /* renamed from: a */
    public final boolean mo75239a(String str) {
        C87412m.m108594g(str, "playerName");
        Log.m105924i("MicroMsg.Live.Vcodec2DecoderInjector", "doInject");
        int a = C107842p.m146108a();
        boolean z = (a & 255) > 60;
        Log.m105924i("MicroMsg.Live.Vcodec2DecoderInjector", str + " set HEVC soft dec, cpuFlag:" + a + ", svrEnable:" + true + ", cpuEnable:" + z);
        if (!z) {
            return false;
        }
        TXLiveBase.setExternalDecoderFactory(Vcodec2Decoder.f266769a);
        Log.m105924i("MicroMsg.Live.Vcodec2DecoderInjector", str + " opens the vcodec2 decoder");
        return true;
    }
}
