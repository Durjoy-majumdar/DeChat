package qs3;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: qs3.a */
public class C36079a {

    /* renamed from: a */
    public static int f96165a = 6;

    /* renamed from: b */
    public static List<String> f96166b;

    /* renamed from: c */
    public static List<String> f96167c = new ArrayList();

    static {
        ArrayList arrayList = new ArrayList();
        f96166b = arrayList;
        arrayList.add("weixin://wxpay/");
        f96166b.add("wxp://");
        f96166b.add("https://wx.tenpay.com/");
        List<String> list = f96166b;
        list.add(HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fm9) + "/");
        List<String> list2 = f96166b;
        list2.add(HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.flf) + "/");
        f96166b.add("https://payapp.wechatpay.cn/");
    }

    /* renamed from: a */
    public static boolean m40902a(String str) {
        if (str == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        Iterator it = ((ArrayList) f96167c).iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (!Util.isNullOrNil(str2) && lowerCase.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }
}
