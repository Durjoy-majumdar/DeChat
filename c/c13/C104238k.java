package c13;

import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import xv0.C53451i;

/* renamed from: c13.k */
public final class C104238k extends C53451i {

    /* renamed from: a */
    public static final C104238k f308536a = new C104238k();

    /* renamed from: b */
    public static long f308537b = 0;

    /* renamed from: c */
    public static long f308538c = 0;

    /* renamed from: d */
    public static long f308539d = 0;

    /* renamed from: e */
    public static boolean f308540e = false;

    /* renamed from: f */
    public static String f308541f = "Unknown";

    /* renamed from: D2 */
    public void mo74085D2(BallInfo ballInfo) {
    }

    /* renamed from: G1 */
    public void mo64040G1(BallInfo ballInfo) {
        if (ballInfo != null) {
            Log.m105924i("FloatBallInfo", "onFloatBallInfoClicked scene: " + ballInfo.mo149046i());
        }
    }

    /* renamed from: H */
    public void mo64041H(BallInfo ballInfo) {
        if (ballInfo != null) {
            Log.m105924i("FloatBallInfo", "onFloatBallInfoExposed scene: " + ballInfo.mo149046i());
        }
    }

    /* renamed from: X4 */
    public void mo74086X4(BallInfo ballInfo, BallInfo ballInfo2) {
    }

    /* renamed from: a */
    public final boolean mo145848a(BallInfo ballInfo) {
        Integer valueOf = ballInfo != null ? Integer.valueOf(ballInfo.f311686d) : null;
        if (valueOf != null && valueOf.intValue() == 9) {
            return true;
        }
        return valueOf != null && valueOf.intValue() == 35;
    }

    /* renamed from: b */
    public final long mo145849b(long j) {
        if (j <= 0) {
            return 0;
        }
        Map<String, Long> map = C0412w.f1020a;
        if (!((HashMap) map).containsKey(f308541f)) {
            return 0;
        }
        Object obj = ((HashMap) map).get(f308541f);
        C87412m.m108591d(obj);
        return (long) (((double) ((Number) obj).longValue()) * ((((double) j) / ((double) 1000)) / ((double) 60)));
    }

    /* renamed from: c2 */
    public void mo64042c2(BallInfo ballInfo) {
        if (ballInfo != null && mo145848a(ballInfo)) {
            f308540e = false;
            long currentTimeMillis = System.currentTimeMillis() - f308539d;
            long b = mo145849b(currentTimeMillis);
            if (b > 0) {
                f308538c += b;
                f308537b += currentTimeMillis;
            }
            Log.m105924i("FloatBallInfo", "onFloatBallInfoRemoved scene: " + ballInfo.mo149046i() + ", duration=" + currentTimeMillis + ", predictTraffic=" + b);
        }
    }

    /* renamed from: f5 */
    public void mo74087f5(BallInfo ballInfo) {
    }

    /* renamed from: t5 */
    public void mo74088t5(BallInfo ballInfo) {
        if (ballInfo != null && mo145848a(ballInfo)) {
            f308539d = System.currentTimeMillis();
            f308541f = '<' + ballInfo.mo149046i() + '>';
            f308540e = true;
            Log.m105924i("FloatBallInfo", "onFloatBallInfoAdded scene: " + ballInfo.mo149046i());
        }
    }

    /* renamed from: u5 */
    public boolean mo74089u5(BallInfo ballInfo) {
        StringBuilder sb = new StringBuilder();
        sb.append("onAddMessageFloatBall scene: ");
        sb.append(ballInfo != null ? ballInfo.mo149046i() : null);
        Log.m105924i("FloatBallInfo", sb.toString());
        return false;
    }
}
