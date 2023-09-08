package com.tencent.p014mm.pluginsdk.p133ui.tools;

import com.tencent.p014mm.message.C68066g;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Map;
import p1081gi.C98121d;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.n */
public class C6690n extends C68066g {

    /* renamed from: b */
    public int f24054b = 0;

    /* renamed from: a */
    public C68066g mo7615a() {
        C6690n nVar = new C6690n();
        nVar.f24054b = this.f24054b;
        return nVar;
    }

    /* renamed from: c */
    public void mo7616c(StringBuilder sb, C68070l.C68072b bVar, String str, C98121d dVar, int i, int i2) {
        sb.append("<directshare>");
        sb.append(this.f24054b);
        sb.append("</directshare>");
    }

    /* renamed from: d */
    public void mo7617d(Map<String, String> map, C68070l.C68072b bVar) {
        String str = map.get(".msg.appmsg.directshare");
        if (!Util.isNullOrNil(str)) {
            this.f24054b = Util.safeParseInt(str);
        }
    }
}
