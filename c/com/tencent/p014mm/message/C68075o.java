package com.tencent.p014mm.message;

import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Map;

/* renamed from: com.tencent.mm.message.o */
public class C68075o {

    /* renamed from: a */
    public int f195663a;

    /* renamed from: b */
    public int f195664b;

    /* renamed from: a */
    public static final C68075o m80440a(String str) {
        Map<String, String> map;
        C68075o oVar = new C68075o();
        C68070l.C68072b u = C68070l.C68072b.m80422u(str, (String) null);
        if (!(u == null || (map = u.f195491G2) == null)) {
            oVar.f195663a = Util.getInt(map.get(".msg.appmsg.xmlfulllen"), 0);
            oVar.f195664b = Util.getInt(map.get(".msg.appmsg.realinnertype"), 0);
        }
        return oVar;
    }
}
