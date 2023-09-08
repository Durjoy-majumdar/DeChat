package b33;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.videocomposition.play.VideoCompositionPlayView;
import gy3.C87412m;
import java.io.IOException;
import java.util.HashMap;
import te3.C64899zy;

/* renamed from: b33.c */
public final class C92175c {

    /* renamed from: a */
    public static final C92175c f263819a = new C92175c();

    /* renamed from: b */
    public static final HashMap<Long, C92176d> f263820b = new HashMap<>();

    /* renamed from: a */
    public final long mo126134a(byte[] bArr, VideoCompositionPlayView videoCompositionPlayView, boolean z) {
        C87412m.m108594g(bArr, "info");
        C87412m.m108594g(videoCompositionPlayView, "playView");
        C64899zy zyVar = new C64899zy();
        try {
            zyVar.parseFrom(bArr);
            long currentTimeMillis = System.currentTimeMillis();
            Log.m105924i("MicroMsg.SnsFakeVideoPlayManager", "key: " + currentTimeMillis);
            if (z) {
                zyVar.f186903h = "";
                zyVar.f186902g = false;
            }
            f263820b.put(Long.valueOf(currentTimeMillis), new C92176d(zyVar, videoCompositionPlayView));
            return currentTimeMillis;
        } catch (IOException unused) {
            Log.m105920e("MicroMsg.SnsFakeVideoPlayManager", "parse byte error");
            return -1;
        }
    }
}
