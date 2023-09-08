package com.tencent.p014mm.pluginsdk.p133ui.tools;

import com.tencent.p014mm.message.C68066g;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import java.util.Map;
import p1081gi.C98121d;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.p */
public final class C6691p extends C68066g {

    /* renamed from: b */
    public int f24055b;

    /* renamed from: a */
    public C68066g mo7615a() {
        C6691p pVar = new C6691p();
        pVar.f24055b = this.f24055b;
        return pVar;
    }

    /* renamed from: c */
    public void mo7616c(StringBuilder sb, C68070l.C68072b bVar, String str, C98121d dVar, int i, int i2) {
        C87412m.m108594g(sb, "sb");
        sb.append("<referfromscene>");
        sb.append(this.f24055b);
        sb.append("</referfromscene>");
    }

    /* renamed from: d */
    public void mo7617d(Map<String, String> map, C68070l.C68072b bVar) {
        C87412m.m108594g(map, "values");
        C87412m.m108594g(bVar, "content");
        String str = map.get(".msg.appmsg.referfromscene");
        if (!Util.isNullOrNil(str)) {
            this.f24055b = Util.safeParseInt(str);
        }
    }
}
