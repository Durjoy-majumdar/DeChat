package com.tencent.p014mm.sdk.platformtools;

import com.tencent.p014mm.sdk.platformtools.WeChatBrands;

/* renamed from: com.tencent.mm.sdk.platformtools.WeChatSomeFeatureSwitch */
public class WeChatSomeFeatureSwitch {
    public static boolean isDeviceTypeTablet;

    public static boolean blockBizEetnryRemoteConfigs() {
        return true;
    }

    public static boolean blockCNMobile() {
        return !WeChatBrands.AppInfo.current().isMainland();
    }

    public static boolean blockFTSUpdate() {
        return !WeChatBrands.AppInfo.current().isMainland();
    }

    public static boolean blockWeixinUrl() {
        return !WeChatBrands.AppInfo.current().isMainland();
    }

    public static boolean forceGooglePlayChannel() {
        return !WeChatBrands.AppInfo.current().isMainland();
    }

    public static boolean hardcodeWeChatUSTeam() {
        return WeChatBrands.AppInfo.current().isUS();
    }

    public static boolean onlyUSMobile() {
        return WeChatBrands.AppInfo.current().isUS();
    }

    public static boolean temporaryBlockMinorLanguage() {
        return !WeChatBrands.AppInfo.current().isMainland();
    }
}
