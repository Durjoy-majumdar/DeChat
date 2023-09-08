package com.tencent.p014mm.feature.performance;

import com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner;
import com.tencent.matrix.mallctl.MallCtl;
import com.tencent.tinker.loader.shareutil.ShareConstants;
import com.tencent.xweb.util.XWebFileUtil;

/* renamed from: com.tencent.mm.feature.performance.x */
public class C28938x extends MallCtl.C28672a {

    /* renamed from: a */
    public final /* synthetic */ C28937w f79392a;

    public C28938x(C28937w wVar) {
        this.f79392a = wVar;
    }

    /* renamed from: a */
    public boolean mo56261a(String str, String str2) {
        if (this.f79392a.f79390j.f237695e || AppUIForegroundOwner.INSTANCE.isForeground()) {
            return false;
        }
        if (this.f79392a.f79384d && str.contains("/files/mmkv/")) {
            return true;
        }
        if (str2.contains("w")) {
            return false;
        }
        if (this.f79392a.f79385e && str2.contains("x") && str.endsWith(".so")) {
            return true;
        }
        if (this.f79392a.f79386f && str2.contains("x") && str.endsWith(ShareConstants.ODEX_SUFFIX)) {
            return true;
        }
        if (this.f79392a.f79387g && str.endsWith(XWebFileUtil.XWALK_CORE_APK_NAME) && !str.contains("xwalk")) {
            return true;
        }
        if (!this.f79392a.f79388h || !str.endsWith(ShareConstants.CLASS_N_APK_NAME)) {
            return this.f79392a.f79389i && str.contains("com.tencent.mm") && str.endsWith(".apk") && !str.contains("xwalk");
        }
        return true;
    }
}
