package p243tn;

import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f12.C7970a;
import f40.C86709a0;
import p227rn.C22240c0;
import p823sg.C90193h;

/* renamed from: tn.a */
public class C14050a {
    /* renamed from: a */
    public static String m13404a() {
        return ((C22240c0) C86312j.m106911c(C22240c0.class)).mo35410vH() ? C7970a.m8129c() : "wcf://bizimg/";
    }

    /* renamed from: b */
    public static String m13405b(String str) {
        if (Util.isNullOrNil(str)) {
            return "";
        }
        if (((C22240c0) C86312j.m106911c(C22240c0.class)).mo35410vH()) {
            return String.format("%spic_%s", new Object[]{C7970a.m8129c(), MD5Util.getMD5String(str)});
        } else if (!C86709a0.m107523b().mo121114l()) {
            return "";
        } else {
            return String.format("%s%s", new Object[]{"wcf://bizimg/", C90193h.m112878f((C86709a0.m107523b().mo121111i() + str).getBytes())});
        }
    }
}
