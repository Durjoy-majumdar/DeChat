package com.tencent.p014mm.plugin.webview.modeltools;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import pe3.C89349b;

/* renamed from: com.tencent.mm.plugin.webview.modeltools.l */
public class C43756l {

    /* renamed from: a */
    public static String f118233a;

    /* renamed from: b */
    public static String f118234b;

    /* renamed from: c */
    public static C89349b f118235c;

    /* renamed from: a */
    public static void m47603a(String str, String str2) {
        String str3;
        String str4;
        String str5 = "";
        int i = (!Util.isNullOrNil(f118233a) && !Util.isEqual(str, f118233a)) ? 1 : 0;
        try {
            str3 = URLEncoder.encode(Util.nullAsNil(str2), "UTF-8");
            try {
                str4 = URLEncoder.encode(Util.nullAsNil(str), "UTF-8");
                try {
                    str5 = URLEncoder.encode(Util.nullAsNil(f118233a), "UTF-8");
                } catch (UnsupportedEncodingException e) {
                    e = e;
                    Log.printErrStackTrace("MicroMsg.SmartPickWordHelper", e, str5, new Object[0]);
                    C115669n.INSTANCE.mo160131h(13742, 2, str3, str5, str4, Integer.valueOf(i), f118234b);
                }
            } catch (UnsupportedEncodingException e2) {
                e = e2;
                str4 = str5;
                Log.printErrStackTrace("MicroMsg.SmartPickWordHelper", e, str5, new Object[0]);
                C115669n.INSTANCE.mo160131h(13742, 2, str3, str5, str4, Integer.valueOf(i), f118234b);
            }
        } catch (UnsupportedEncodingException e3) {
            e = e3;
            str4 = str5;
            str3 = str4;
            Log.printErrStackTrace("MicroMsg.SmartPickWordHelper", e, str5, new Object[0]);
            C115669n.INSTANCE.mo160131h(13742, 2, str3, str5, str4, Integer.valueOf(i), f118234b);
        }
        C115669n.INSTANCE.mo160131h(13742, 2, str3, str5, str4, Integer.valueOf(i), f118234b);
    }
}
