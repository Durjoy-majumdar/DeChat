package xb3;

import android.graphics.Color;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.wxmm.v2helper;
import gy3.C87412m;
import kg3.C76577a;
import p1057w2.C90885a;

/* renamed from: xb3.a */
public final class C91162a {

    /* renamed from: a */
    public static final int f261394a = ((int) ((float) Math.pow((double) ((float) C76577a.m92157h(MMApplicationContext.getContext(), C0966R.dimen.f3732cl)), (double) 2)));

    /* renamed from: a */
    public static final int m114378a(int i, int i2) {
        if (!WeChatEnvironment.hasDebugger() || Color.alpha(i2) == 255) {
            int alpha = Color.alpha(i);
            if (alpha == 0) {
                return i2;
            }
            if (alpha == 255) {
                return i;
            }
            double d = ((double) alpha) / 255.0d;
            double d2 = ((double) 1) - d;
            return Color.rgb((int) ((((double) Color.red(i)) * d) + (((double) Color.red(i2)) * d2)), (int) ((((double) Color.green(i)) * d) + (((double) Color.green(i2)) * d2)), (int) ((d * ((double) Color.blue(i))) + (d2 * ((double) Color.blue(i2)))));
        }
        throw new RuntimeException("bgColor can't have alpha channel");
    }

    /* renamed from: b */
    public static final double m114379b(double d, double d2) {
        int i = (d > 0.0d ? 1 : (d == 0.0d ? 0 : -1));
        if (i == 0) {
            return 90.0d;
        }
        double atan = Math.atan(d2 / d) * 57.29577951308232d;
        if (d > 0.0d && d2 > 0.0d) {
            return atan;
        }
        return atan + ((double) (((i >= 0 || d2 <= 0.0d) && (i >= 0 || d2 >= 0.0d)) ? v2helper.VOIP_ENC_HEIGHT_LV1 : 180));
    }

    /* renamed from: c */
    public static final String m114380c(int i) {
        String hexString = Integer.toHexString(i);
        C87412m.m108593f(hexString, "toHexString(color)");
        return hexString;
    }

    /* renamed from: d */
    public static final C38481c m114381d(int i) {
        double[] dArr = new double[3];
        ThreadLocal<double[]> threadLocal = C90885a.f260864a;
        C90885a.m113997b(Color.red(i), Color.green(i), Color.blue(i), dArr);
        double d = dArr[0];
        double d2 = dArr[1];
        double d3 = dArr[2];
        double k = C90885a.m114006k(d / 95.047d);
        double k2 = C90885a.m114006k(d2 / 100.0d);
        double k3 = C90885a.m114006k(d3 / 108.883d);
        double max = Math.max(0.0d, (116.0d * k2) - 16.0d);
        dArr[0] = max;
        double d4 = (k - k2) * 500.0d;
        dArr[1] = d4;
        double d5 = (k2 - k3) * 200.0d;
        dArr[2] = d5;
        return new C38481c(max, d4, d5);
    }
}
