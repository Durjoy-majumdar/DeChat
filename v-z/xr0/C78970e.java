package xr0;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;

/* renamed from: xr0.e */
public final class C78970e {
    /* renamed from: a */
    public static final boolean m95478a() {
        return BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || WeChatEnvironment.hasDebugger();
    }
}
