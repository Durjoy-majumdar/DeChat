package mk2;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import org.xwalk.core.XWalkEnvironment;

/* renamed from: mk2.d */
public final class C34582d {

    /* renamed from: a */
    public static String f92998a;

    static {
        String str = BuildInfo.IS_ARM64 ? XWalkEnvironment.RUNTIME_ABI_ARM64_STR : XWalkEnvironment.RUNTIME_ABI_ARM32_STR;
        f92998a = "wechat_rtos_service" + '_' + 2048 + '_' + str;
    }
}
