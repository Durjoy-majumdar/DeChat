package p375qh;

import android.os.Build;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import h81.C32735h;
import p156gj.C107842p;
import p206nj.C88957l;

/* renamed from: qh.p */
public class C101195p {

    /* renamed from: a */
    public static boolean f296202a;

    /* renamed from: b */
    public static boolean f296203b;

    static {
        m132710a();
    }

    /* renamed from: a */
    public static void m132710a() {
        Class<C101193k> cls = C101193k.class;
        C32735h hVar = (C32735h) C86312j.m106911c(C32735h.class);
        boolean z = hVar == null || hVar.mo58779Qe(C32735h.C32737c.clicfg_load_silkso_ignore_cpu, 1) == 1;
        Log.m105925i("MicroMsg.SilkCodec", "load wechatvoicesilk, ignore cpu: %s", Boolean.valueOf(z));
        int a = C107842p.m146108a();
        String str = Build.CPU_ABI;
        String str2 = Build.CPU_ABI2;
        Log.m105925i("MicroMsg.SilkCodec", "abi: %s, abi2: %s, cpuFlag: %d", str, str2, Integer.valueOf(a));
        if (z) {
            try {
                C88957l.m111079o("wechatvoicesilk", cls.getClassLoader());
                f296202a = true;
                f296203b = true;
            } catch (UnsatisfiedLinkError unused) {
                Log.m105920e("MicroMsg.SilkCodec", "load library failed!");
                f296202a = false;
                f296203b = false;
            }
        } else if (!Util.isNullOrNil(str) && !str.contains("armeabi") && !Util.isNullOrNil(str2) && !str2.contains("armeabi")) {
            Log.m105924i("MicroMsg.SilkCodec", "don't contains armeabi");
            Log.m105920e("voice SilkCodec", "load library failed! silk don't support armv5!!!!");
            f296202a = false;
            f296203b = false;
        } else if ((a & 1024) != 0) {
            try {
                C88957l.m111079o("wechatvoicesilk", cls.getClassLoader());
                f296202a = true;
                f296203b = true;
            } catch (UnsatisfiedLinkError unused2) {
                Log.m105920e("MicroMsg.SilkCodec", "load library failed!");
                f296202a = false;
                f296203b = false;
            }
        } else if ((a & 512) != 0) {
            Log.m105920e("voice SilkCodec", "load library failed! silk don't support armv6!!!!");
            f296202a = false;
            f296203b = false;
        } else {
            Log.m105920e("voice SilkCodec", "load library failed! silk don't support armv5!!!!");
            f296202a = false;
            f296203b = false;
        }
        Log.m105925i("MicroMsg.SilkCodec", "finish load silk so, canUseSilkDecode: %b, canUseSilkEncode: %b", Boolean.valueOf(f296202a), Boolean.valueOf(f296203b));
    }
}
