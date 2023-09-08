package com.tencent.p014mm.pluginsdk.p133ui.tools;

import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.LinkedList;
import p206nj.C117627q;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.r1 */
public class C85653r1 extends C85646a {
    /* renamed from: c */
    public static void m105759c(int i, C44561j jVar, WXMediaMessage wXMediaMessage, LinkedList<String> linkedList) {
        String str;
        C44561j jVar2 = jVar;
        WXMediaMessage wXMediaMessage2 = wXMediaMessage;
        String str2 = "UTF-8";
        Iterator<String> it = linkedList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            String str3 = jVar2.field_appId;
            String str4 = jVar2.field_appName;
            boolean k = jVar.mo69359k();
            int type = wXMediaMessage.getType();
            boolean U5 = C72996z1.m85820U5(next);
            try {
                String b = C117627q.m165909b(Util.nullAsNil(C85646a.m105756b(wXMediaMessage)), str2);
                String b2 = C117627q.m165909b(Util.nullAsNil(C85646a.m105755a(wXMediaMessage)), str2);
                String b3 = C117627q.m165909b(Util.nullAsNil(wXMediaMessage2.title), str2);
                String b4 = C117627q.m165909b(Util.nullAsNil(wXMediaMessage2.description), str2);
                StringBuilder sb = new StringBuilder();
                str = str2;
                try {
                    sb.append(i);
                    sb.append(",");
                    sb.append(str3);
                    sb.append(",");
                    sb.append(str4);
                    sb.append(",");
                    sb.append(k ? 1 : 0);
                    sb.append(",");
                    sb.append(type);
                    sb.append(",");
                    sb.append(U5 ? 1 : 0);
                    sb.append(",");
                    sb.append(1);
                    sb.append(",");
                    sb.append(next);
                    sb.append(",");
                    sb.append(b3);
                    sb.append(",");
                    sb.append(b4);
                    sb.append(",");
                    sb.append(b);
                    sb.append(",");
                    sb.append("");
                    sb.append(",");
                    sb.append("");
                    sb.append(",");
                    sb.append("");
                    sb.append(",");
                    sb.append(b2);
                    Log.m105924i("MicroMsg.ShareReport", sb.toString());
                    C115669n.INSTANCE.mo160131h(16492, Integer.valueOf(i), str3, str4, Integer.valueOf(k), Integer.valueOf(type), Integer.valueOf(U5), 1, next, b3, b4, b, "", "", "", b2);
                } catch (UnsupportedEncodingException unused) {
                }
            } catch (UnsupportedEncodingException unused2) {
                str = str2;
                Log.m105920e("MicroMsg.ShareReport", "URLEncoder.encode Error");
                jVar2 = jVar;
                wXMediaMessage2 = wXMediaMessage;
                str2 = str;
            }
            jVar2 = jVar;
            wXMediaMessage2 = wXMediaMessage;
            str2 = str;
        }
    }
}
