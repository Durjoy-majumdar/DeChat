package p248ug;

import com.tencent.p014mm.sdk.platformtools.Util;
import f12.C7970a;
import p823sg.C90193h;

/* renamed from: ug.a */
public class C52556a {
    /* renamed from: a */
    public static String m58840a(String str) {
        if (Util.isNullOrNil(str)) {
            str = "tempConv";
        }
        return C7970a.m8128b() + C90193h.m112878f(str.getBytes()) + "/" + "conv/";
    }
}
