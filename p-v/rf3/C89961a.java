package rf3;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.VersionUtilities;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import gg3.C59432j;
import kf3.C61082e;
import kf3.C99143g;

/* renamed from: rf3.a */
public final class C89961a extends C99143g {
    /* renamed from: a */
    public String mo54531a() {
        return "RepairerConfig_FavSupportNest";
    }

    /* renamed from: b */
    public String mo54532b() {
        return "收藏使用支持嵌套";
    }

    /* renamed from: d */
    public Class<? extends C61082e> mo54533d() {
        return C59432j.class;
    }

    /* renamed from: g */
    public Object mo54534g() {
        boolean z;
        int i = 0;
        if (!BuildInfo.DEBUG) {
            if (!(BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_RED || BuildInfo.CLIENT_VERSION_INT == 788529167) && !WeChatEnvironment.hasDebugger()) {
                z = false;
                if (z || VersionUtilities.checkAlphaVersion(BuildInfo.CLIENT_VERSION_INT)) {
                    i = 1;
                }
                return Integer.valueOf(i);
            }
        }
        z = true;
        i = 1;
        return Integer.valueOf(i);
    }

    /* renamed from: i */
    public String mo54535i() {
        return "clicfg_fav_support_nest_flag";
    }
}
