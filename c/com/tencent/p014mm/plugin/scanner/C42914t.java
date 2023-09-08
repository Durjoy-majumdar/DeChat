package com.tencent.p014mm.plugin.scanner;

import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import di3.C86312j;
import f40.C86709a0;
import h81.C32735h;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import lc3.C10485b;
import p189kx.C46752w;
import p645pj.C47505d;

/* renamed from: com.tencent.mm.plugin.scanner.t */
public class C42914t {

    /* renamed from: a */
    public static final String f116195a = MMApplicationContext.getApplicationId();

    /* renamed from: b */
    public static final String[] f116196b = {HttpWrapperBase.PROTOCAL_HTTP + WeChatHosts.domainString(C0966R.string.fmp) + "/g/", HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmp) + "/g/"};

    /* renamed from: c */
    public static final String[] f116197c = {HttpWrapperBase.PROTOCAL_HTTP + WeChatHosts.domainString(C0966R.string.fml) + "/", HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fml) + "/"};

    /* renamed from: d */
    public static final String[] f116198d = {HttpWrapperBase.PROTOCAL_HTTP + WeChatHosts.domainString(C0966R.string.fmr) + "/u/", HttpWrapperBase.PROTOCAL_HTTP + WeChatHosts.domainString(C0966R.string.fmr) + "/ct/", HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmr) + "/u/", HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmr) + "/ct/"};

    /* renamed from: e */
    public static final String[] f116199e = {"http://c.weixin.com/g/", "https://c.weixin.com/g/"};

    /* renamed from: f */
    public static final String[] f116200f;

    /* renamed from: g */
    public static final String[] f116201g;

    /* renamed from: h */
    public static final String[] f116202h = {"m", "n"};

    /* renamed from: i */
    public static final String[] f116203i = {HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmp) + "/f/", HttpWrapperBase.PROTOCAL_HTTP + WeChatHosts.domainString(C0966R.string.fmp) + "/f/"};

    /* renamed from: j */
    public static final String f116204j = C46752w.f125840a;

    /* renamed from: k */
    public static final String f116205k = C46752w.f125841b;

    /* renamed from: l */
    public static final String f116206l = C46752w.f125842c;

    /* renamed from: m */
    public static final String f116207m = C46752w.f125843d;

    /* renamed from: n */
    public static int f116208n = 1;

    /* renamed from: o */
    public static int f116209o = 2;

    /* renamed from: p */
    public static int f116210p = 4;

    /* renamed from: com.tencent.mm.plugin.scanner.t$a */
    public static class C5158a implements C80916r<Bundle, Bundle> {
        private C5158a() {
        }

        public Object invoke(Object obj) {
            Bundle bundle = (Bundle) obj;
            Bundle bundle2 = new Bundle();
            Set<String> a = C42914t.m46580a();
            StringBuilder sb = new StringBuilder();
            HashSet hashSet = (HashSet) a;
            if (!hashSet.isEmpty()) {
                Iterator it = hashSet.iterator();
                sb.append((String) it.next());
                while (it.hasNext()) {
                    sb.append("|");
                    sb.append((String) it.next());
                }
                bundle2.putString("brandCodePrefix", sb.toString());
            }
            return bundle2;
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.t$b */
    public static class C5159b implements C80916r<Bundle, Bundle> {
        private C5159b() {
        }

        public Object invoke(Object obj) {
            Bundle bundle = (Bundle) obj;
            Bundle bundle2 = new Bundle();
            Set<String> b = C42914t.m46581b();
            StringBuilder sb = new StringBuilder();
            HashSet hashSet = (HashSet) b;
            if (!hashSet.isEmpty()) {
                Iterator it = hashSet.iterator();
                sb.append((String) it.next());
                while (it.hasNext()) {
                    sb.append("|");
                    sb.append((String) it.next());
                }
                bundle2.putString("wxCodePrefix", sb.toString());
            }
            return bundle2;
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(HttpWrapperBase.PROTOCAL_HTTPS);
        sb.append(WeChatHosts.domainString(C0966R.string.fm9));
        sb.append("/qr/");
        String sb4 = sb.toString();
        String[] strArr = {"https://wx.tenpay.com/f2f", "wxp://f2f", sb4, "https://payapp.wechatpay.cn/qr/"};
        f116200f = strArr;
        f116201g = new String[]{strArr[0], strArr[1], sb4, "weixin://wxpay/bizpayurl", "wxp://wbf2f", "weixin://wxpay/bindurl", "wxhb://f2f", strArr[3]};
    }

    /* renamed from: a */
    public static Set<String> m46580a() {
        HashSet hashSet = new HashSet();
        hashSet.add(f116204j);
        hashSet.add(f116205k);
        hashSet.add(f116206l);
        hashSet.add(f116207m);
        if (MMApplicationContext.isMainProcess()) {
            C47505d g502 = ((C10485b) C86709a0.m107533q(C10485b.class)).g50();
            String a = g502 != null ? g502.mo72508a(1, "ScanCode", "brandCodePrefix") : "";
            Log.m105927v("MicroMsg.QRCodeLogic", "getWxBrandCodePrefix(%s)", a);
            if (!Util.isNullOrNil(a)) {
                String[] split = a.split("\\|");
                for (int i = 0; i < split.length; i++) {
                    if (!Util.isNullOrNil(split[i])) {
                        hashSet.add(split[i]);
                    }
                }
            }
        }
        return hashSet;
    }

    /* renamed from: b */
    public static Set<String> m46581b() {
        HashSet hashSet = new HashSet();
        hashSet.add("k");
        hashSet.add("l");
        if (MMApplicationContext.isMMProcess()) {
            C47505d g502 = ((C10485b) C86709a0.m107533q(C10485b.class)).g50();
            String a = g502 != null ? g502.mo72508a(1, "ScanCode", "weAppCodePrefix") : "";
            Log.m105927v("MicroMsg.QRCodeLogic", "getWxCodePrefix(%s)", a);
            if (!Util.isNullOrNil(a)) {
                String[] split = a.split("\\|");
                for (int i = 0; i < split.length; i++) {
                    if (!Util.isNullOrNil(split[i])) {
                        hashSet.add(split[i]);
                    }
                }
            }
        }
        return hashSet;
    }

    /* renamed from: c */
    public static boolean m46582c(int i, String str, boolean z, boolean z2) {
        Class cls = C32735h.class;
        if (str == null || str.isEmpty()) {
            return false;
        }
        int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_weapp_webview_qrcode_allowed_wx_code, 7);
        if (m46594o(i, str) && m46585f(Qe, z, z2)) {
            return true;
        }
        int Qe2 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_weapp_webview_qrcode_allowed_personal, 3);
        if (m46591l(i, str) && m46585f(Qe2, z, z2)) {
            return true;
        }
        int Qe3 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_weapp_webview_qrcode_allowed_group_chat, 3);
        if (m46587h(i, str) && m46585f(Qe3, z, z2)) {
            return true;
        }
        int Qe4 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_weapp_webview_qrcode_allowed_pay, 0);
        if (m46589j(i, str) && m46585f(Qe4, z, z2)) {
            return true;
        }
        int Qe5 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_weapp_webview_qrcode_allowed_wework_chat, 3);
        if (m46593n(i, str) && m46585f(Qe5, z, z2)) {
            return true;
        }
        int Qe6 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_weapp_webview_qrcode_allowed_wework_group_chat, 3);
        if (m46588i(i, str) && m46585f(Qe6, z, z2)) {
            return true;
        }
        int Qe7 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_weapp_webview_qrcode_allowed_brand_v2, 3);
        if (m46583d(i, str) && m46585f(Qe7, z, z2)) {
            return true;
        }
        int Qe8 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_weapp_webview_qrcode_allowed_finder, 0);
        if (!m46586g(i, str) || !m46585f(Qe8, z, z2)) {
            return m46585f(((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_weapp_webview_qrcode_allowed_other, 0), z, z2);
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        if ((!com.tencent.p014mm.ipcinvoker.C80906n.m98776c(r5) && ((java.util.concurrent.ConcurrentHashMap) r2.f237728c).get(r5) != null) == false) goto L_0x0073;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0081  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m46583d(int r5, java.lang.String r6) {
        /*
            r0 = 0
            r1 = 19
            if (r5 == r1) goto L_0x0006
            return r0
        L_0x0006:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r5 == 0) goto L_0x000d
            return r0
        L_0x000d:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            r1 = 1
            if (r5 != 0) goto L_0x0073
            android.os.Looper r5 = android.os.Looper.myLooper()
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            if (r5 != r2) goto L_0x003e
            java.lang.String r5 = f116195a
            com.tencent.mm.ipcinvoker.f r2 = com.tencent.p014mm.ipcinvoker.C80898f.m98769b()
            r2.getClass()
            boolean r3 = com.tencent.p014mm.ipcinvoker.C80906n.m98776c(r5)
            if (r3 == 0) goto L_0x002e
            goto L_0x003a
        L_0x002e:
            java.util.Map<java.lang.String, com.tencent.mm.ipcinvoker.f$e> r2 = r2.f237728c
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2
            java.lang.Object r5 = r2.get(r5)
            if (r5 == 0) goto L_0x003a
            r5 = 1
            goto L_0x003b
        L_0x003a:
            r5 = 0
        L_0x003b:
            if (r5 != 0) goto L_0x003e
            goto L_0x0073
        L_0x003e:
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.lang.String r2 = f116195a
            java.lang.Class<com.tencent.mm.plugin.scanner.t$a> r3 = com.tencent.p014mm.plugin.scanner.C42914t.C5158a.class
            r4 = 0
            android.os.Parcelable r2 = com.tencent.p014mm.ipcinvoker.C80907o.m98783f(r2, r4, r3)
            android.os.Bundle r2 = (android.os.Bundle) r2
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x0058
            java.lang.String r4 = "brandCodePrefix"
            java.lang.String r3 = r2.getString(r4, r3)
        L_0x0058:
            java.lang.String r2 = "\\|"
            java.lang.String[] r2 = r3.split(r2)
            r3 = 0
        L_0x005f:
            int r4 = r2.length
            if (r3 >= r4) goto L_0x0077
            r4 = r2[r3]
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 == 0) goto L_0x006b
            goto L_0x0070
        L_0x006b:
            r4 = r2[r3]
            r5.add(r4)
        L_0x0070:
            int r3 = r3 + 1
            goto L_0x005f
        L_0x0073:
            java.util.Set r5 = m46580a()
        L_0x0077:
            java.util.Iterator r5 = r5.iterator()
        L_0x007b:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x008e
            java.lang.Object r2 = r5.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r6.startsWith(r2)
            if (r2 == 0) goto L_0x007b
            return r1
        L_0x008e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.scanner.C42914t.m46583d(int, java.lang.String):boolean");
    }

    /* renamed from: e */
    public static boolean m46584e(int i, String str) {
        String trim = str.trim();
        return m46594o(i, trim) || m46583d(i, trim) || m46587h(i, trim) || m46591l(i, trim) || m46593n(i, trim) || m46590k(i, trim) || m46592m(i, trim) || m46586g(i, trim);
    }

    /* renamed from: f */
    public static boolean m46585f(int i, boolean z, boolean z2) {
        return z ? (i & f116209o) != 0 : z2 ? (i & f116210p) != 0 : (i & f116208n) != 0;
    }

    /* renamed from: g */
    public static boolean m46586g(int i, String str) {
        if (i != 19 || Util.isNullOrNil(str)) {
            return false;
        }
        for (String startsWith : f116203i) {
            if (str.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public static boolean m46587h(int i, String str) {
        if (i != 19 || Util.isNullOrNil(str)) {
            return false;
        }
        for (String startsWith : f116196b) {
            if (str.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m46588i(int i, String str) {
        if (i != 19 || Util.isNullOrNil(str)) {
            return false;
        }
        for (String startsWith : f116199e) {
            if (str.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public static boolean m46589j(int i, String str) {
        if (m46592m(i, str)) {
            return true;
        }
        if (i != 19 || Util.isNullOrNil(str)) {
            return false;
        }
        for (String startsWith : f116201g) {
            if (str.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public static boolean m46590k(int i, String str) {
        if (i != 19 || Util.isNullOrNil(str)) {
            return false;
        }
        for (String startsWith : f116200f) {
            if (str.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public static boolean m46591l(int i, String str) {
        if (i != 19 || Util.isNullOrNil(str)) {
            return false;
        }
        for (String startsWith : f116197c) {
            if (str.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public static boolean m46592m(int i, String str) {
        if (i != 22 || Util.isNullOrNil(str)) {
            return false;
        }
        for (String startsWith : f116202h) {
            if (str.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    public static boolean m46593n(int i, String str) {
        if (i != 19 || Util.isNullOrNil(str)) {
            return false;
        }
        for (String startsWith : f116198d) {
            if (str.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        if ((!com.tencent.p014mm.ipcinvoker.C80906n.m98776c(r5) && ((java.util.concurrent.ConcurrentHashMap) r2.f237728c).get(r5) != null) == false) goto L_0x0075;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0083  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m46594o(int r5, java.lang.String r6) {
        /*
            r0 = 0
            r1 = 22
            if (r5 == r1) goto L_0x0006
            return r0
        L_0x0006:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r5 == 0) goto L_0x000d
            return r0
        L_0x000d:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMMProcess()
            r1 = 1
            if (r5 != 0) goto L_0x0075
            android.os.Looper r5 = android.os.Looper.myLooper()
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            if (r5 != r2) goto L_0x003e
            java.lang.String r5 = f116195a
            com.tencent.mm.ipcinvoker.f r2 = com.tencent.p014mm.ipcinvoker.C80898f.m98769b()
            r2.getClass()
            boolean r3 = com.tencent.p014mm.ipcinvoker.C80906n.m98776c(r5)
            if (r3 == 0) goto L_0x002e
            goto L_0x003a
        L_0x002e:
            java.util.Map<java.lang.String, com.tencent.mm.ipcinvoker.f$e> r2 = r2.f237728c
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2
            java.lang.Object r5 = r2.get(r5)
            if (r5 == 0) goto L_0x003a
            r5 = 1
            goto L_0x003b
        L_0x003a:
            r5 = 0
        L_0x003b:
            if (r5 != 0) goto L_0x003e
            goto L_0x0075
        L_0x003e:
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.lang.String r2 = f116195a
            java.lang.Class<com.tencent.mm.plugin.scanner.t$b> r3 = com.tencent.p014mm.plugin.scanner.C42914t.C5159b.class
            r4 = 0
            android.os.Parcelable r2 = com.tencent.p014mm.ipcinvoker.C80907o.m98783f(r2, r4, r3)
            android.os.Bundle r2 = (android.os.Bundle) r2
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x0059
            java.lang.String r4 = "wxCodePrefix"
            java.lang.String r3 = r2.getString(r4, r3)
        L_0x0059:
            java.lang.String r2 = "|"
            java.lang.String[] r2 = r3.split(r2)
            r3 = 0
        L_0x0061:
            int r4 = r2.length
            if (r3 >= r4) goto L_0x0079
            r4 = r2[r3]
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 == 0) goto L_0x006d
            goto L_0x0072
        L_0x006d:
            r4 = r2[r3]
            r5.add(r4)
        L_0x0072:
            int r3 = r3 + 1
            goto L_0x0061
        L_0x0075:
            java.util.Set r5 = m46581b()
        L_0x0079:
            java.util.Iterator r5 = r5.iterator()
        L_0x007d:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x0090
            java.lang.Object r2 = r5.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r6.startsWith(r2)
            if (r2 == 0) goto L_0x007d
            return r1
        L_0x0090:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.scanner.C42914t.m46594o(int, java.lang.String):boolean");
    }
}
