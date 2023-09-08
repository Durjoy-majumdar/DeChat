package p248ug;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;

/* renamed from: ug.u0 */
public class C14184u0 {
    /* renamed from: a */
    public static boolean m13519a() {
        return BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || WeChatEnvironment.hasDebugger();
    }
}
