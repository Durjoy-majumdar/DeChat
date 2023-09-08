package kr3;

import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import java.util.Arrays;
import java.util.List;

/* renamed from: kr3.a */
public final class C88285a {

    /* renamed from: a */
    public static final WeChatBrands.AppInfo.WhichApp f255196a;

    /* renamed from: b */
    public static final List<WeChatBrands.AppInfo.WhichApp> f255197b;

    static {
        WeChatBrands.AppInfo.WhichApp whichApp = new WeChatBrands.AppInfo.WhichApp("com.wechat.mm", "WeChatUSApp", 3);
        WeChatBrands.AppInfo.WhichApp whichApp2 = new WeChatBrands.AppInfo.WhichApp("com.wechatus.im", "WeChatUSApp", 3);
        WeChatBrands.AppInfo.WhichApp whichApp3 = new WeChatBrands.AppInfo.WhichApp("com.tencent.mm", "Weixin", 0);
        f255196a = whichApp3;
        f255197b = Arrays.asList(new WeChatBrands.AppInfo.WhichApp[]{whichApp3, whichApp, whichApp2});
    }
}
