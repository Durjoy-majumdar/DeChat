package b60;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import eb0.C31543z5;
import f40.C86709a0;
import te3.C64587no2;

/* renamed from: b60.c */
public final class C54428c {

    /* renamed from: a */
    public static final C54428c f152656a = new C54428c();

    /* renamed from: b */
    public static final String f152657b = (C86709a0.m107535s().f251806d + "live/");

    /* renamed from: c */
    public static final String f152658c = "anchor.proto";

    /* renamed from: d */
    public static final int f152659d = 86400;

    /* renamed from: a */
    public final C64587no2 mo75240a() {
        C64587no2 no22 = new C64587no2();
        byte[] O = C86013q1.m106433O(f152657b + f152658c, 0, -1);
        if (O != null) {
            if (!(O.length == 0)) {
                try {
                    no22.parseFrom(O);
                } catch (Exception e) {
                    Log.printDebugStack("safeParser", "", e);
                }
                if (no22.f184526h > 0 && C31543z5.m39455e() - no22.f184526h >= f152659d) {
                    Log.m105924i("MicroMsg.LiveAnchorStorage", "liveAnchorInfo expirated, liveId:" + no22.f184522d);
                    no22.f184522d = 0;
                    no22.f184523e = "";
                    no22.f184524f = -1;
                    no22.f184525g = "";
                    no22.f184526h = 0;
                    no22.f184527i = "";
                    byte[] byteArray = no22.toByteArray();
                    C86013q1.m106437S(f152657b + f152658c, byteArray);
                }
            }
        }
        return no22;
    }

    /* renamed from: b */
    public final void mo75241b(long j) {
        Log.m105924i("MicroMsg.LiveAnchorStorage", "liveFinish liveId:" + j);
        C64587no2 no22 = new C64587no2();
        byte[] O = C86013q1.m106433O(f152657b + f152658c, 0, -1);
        if (O != null) {
            if (!(O.length == 0)) {
                try {
                    no22.parseFrom(O);
                } catch (Exception e) {
                    Log.printDebugStack("safeParser", "", e);
                }
            }
        }
        if (no22.f184522d == j) {
            no22.f184522d = 0;
            no22.f184523e = "";
            no22.f184524f = -1;
            no22.f184525g = "";
            no22.f184526h = 0;
            no22.f184527i = "";
            byte[] byteArray = no22.toByteArray();
            C86013q1.m106437S(f152657b + f152658c, byteArray);
        }
    }
}
