package zu0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: zu0.u */
public class C103092u {

    /* renamed from: a */
    public static int f304189a;

    /* renamed from: b */
    public static int f304190b;

    /* renamed from: c */
    public static int f304191c;

    /* renamed from: d */
    public static int f304192d;

    /* renamed from: e */
    public static int f304193e;

    /* renamed from: f */
    public static int f304194f;

    /* renamed from: g */
    public static int f304195g;

    /* renamed from: h */
    public static long f304196h;

    /* renamed from: i */
    public static long f304197i;

    /* renamed from: a */
    public static void m136364a() {
        Log.m105918d("MicroMsg.TestInfo", "netTime" + (Util.nowMilliSecond() - 0));
    }

    /* renamed from: b */
    public static void m136365b() {
        Log.m105918d("MicroMsg.TestInfo", "total_count: " + f304195g + "text_count: " + f304191c + "normal_count : " + f304190b + " image_count: " + f304189a + " voice_count : " + f304193e + " video_count " + f304192d + " app_count : " + f304194f + " time: " + (Util.nowMilliSecond() - f304196h) + " net: " + f304197i);
    }

    /* renamed from: c */
    public static void m136366c(int i) {
        if (i == 1) {
            f304191c++;
        } else if (i == 3) {
            f304189a++;
        } else if (i != 34) {
            if (!(i == 37 || i == 40 || i == 66 || i == 10000 || i == 42)) {
                if (i == 43) {
                    f304192d++;
                } else if (i != 48) {
                    if (i == 49) {
                        f304194f++;
                    }
                }
            }
            f304190b++;
        } else {
            f304193e++;
        }
        f304195g++;
    }
}
