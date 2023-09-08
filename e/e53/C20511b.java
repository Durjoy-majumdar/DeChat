package e53;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import ob0.C117747y;

/* renamed from: e53.b */
public class C20511b {

    /* renamed from: a */
    public static long f57737a;

    /* renamed from: a */
    public static void m22216a(String str, int i, int i2) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - f57737a > 1000) {
            f57737a = currentTimeMillis;
            C117747y yVar = null;
            if (!Util.isNullOrNil(str)) {
                if (str.startsWith("sns_aa_")) {
                    yVar = new C20514e(str, i, i2);
                } else if (str.startsWith("sns_tf_")) {
                    yVar = new C20517h(str, i, i2);
                } else if (str.startsWith("sns_ff_")) {
                    yVar = new C20516g(str, i, i2);
                } else if (str.startsWith("sns_")) {
                    yVar = new C20515f(str, i, i2);
                } else if (str.startsWith("ts_")) {
                    yVar = new C20519j(str, i, i2);
                } else if (str.startsWith("up_")) {
                    yVar = new C20520k(str, i, i2);
                } else if (str.startsWith("seb_ff_")) {
                    yVar = new C20513d(str, i, i2);
                } else if (str.startsWith("tax_")) {
                    yVar = new C20518i(str, i, i2);
                } else if (str.startsWith("dc_")) {
                    yVar = new C20512c(str, i, i2);
                }
            }
            if (yVar != null) {
                Log.m105926v("NetSceneCancelPayHelper", "start cancelPay request");
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123460f(yVar);
            }
        }
    }
}
