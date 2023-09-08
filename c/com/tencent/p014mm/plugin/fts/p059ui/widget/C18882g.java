package com.tencent.p014mm.plugin.fts.p059ui.widget;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import kv1.C99252h;
import ob0.C11385n;
import p206nj.C117627q;
import te3.C51593us3;
import u73.C52464j0;
import zv1.C23592b;

/* renamed from: com.tencent.mm.plugin.fts.ui.widget.g */
public class C18882g implements C11385n {
    /* renamed from: a */
    public static void m19813a(String str, C23592b bVar, int i, String str2, String str3, String str4, String str5, int i2) {
        try {
            if (!Util.isNullOrNil(str, String.valueOf(bVar.f67729z), str5)) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("pardussearch=expose&searchid=");
                stringBuffer.append(bVar.f67698E);
                stringBuffer.append("&query=");
                stringBuffer.append(C117627q.m165909b(str, "utf8"));
                stringBuffer.append("&type=");
                stringBuffer.append(i);
                stringBuffer.append("&docid=");
                stringBuffer.append(str2);
                stringBuffer.append("&title=");
                stringBuffer.append(C117627q.m165909b(str3, "utf8"));
                stringBuffer.append("&clienttimestamp=");
                stringBuffer.append(System.currentTimeMillis());
                stringBuffer.append("&sug=");
                stringBuffer.append(C117627q.m165909b(str4, "utf8"));
                stringBuffer.append("&relatedsug=");
                stringBuffer.append(C117627q.m165909b(str5, "utf8"));
                stringBuffer.append("&sugtype=");
                stringBuffer.append(i2);
                stringBuffer.append("&requestid=");
                stringBuffer.append(bVar.f67729z);
                stringBuffer.append("&sessionid=");
                stringBuffer.append(C99252h.f291030c);
                Log.m105925i("MicroMsg.FTS.PardusSearchLogic", "realtimeSearchExposeReport %s", stringBuffer.toString());
                C51593us3 us32 = new C51593us3();
                us32.f143104t = stringBuffer.toString();
                C86709a0.m107524d().mo123460f(new C52464j0(us32));
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.FTS.PardusSearchLogic", e, "realtimeSearchExposeReport", new Object[0]);
        }
    }
}
