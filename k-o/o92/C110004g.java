package o92;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;

/* renamed from: o92.g */
public final class C110004g {

    /* renamed from: a */
    public static final C110004g f329189a = new C110004g();

    /* renamed from: b */
    public static long f329190b = -1;

    /* renamed from: a */
    public final boolean mo161346a() {
        boolean z = MultiProcessMMKV.getMMKV("multitask_tips_config").getBoolean("multitask_first_add_flag", false);
        Log.m105924i("MicroMsg.MultiTaskTipsHelper", "isMultiTaskFirstAdd, flag: " + z);
        return z;
    }

    /* renamed from: b */
    public final void mo161347b(boolean z) {
        Log.m105924i("MicroMsg.MultiTaskTipsHelper", "setMultiTaskFirstAdd, flag: " + z);
        MultiProcessMMKV.getMMKV("multitask_tips_config").putBoolean("multitask_first_add_flag", z);
    }
}
