package com.tencent.p014mm.p136ui.chatting.viewitems;

import com.tencent.p014mm.message.C68066g;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Map;
import p1081gi.C98121d;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.a1 */
public class C73920a1 extends C68066g {

    /* renamed from: b */
    public int f216975b;

    /* renamed from: c */
    public String f216976c;

    /* renamed from: d */
    public String f216977d;

    /* renamed from: e */
    public int f216978e;

    /* renamed from: f */
    public String f216979f;

    /* renamed from: a */
    public C68066g mo7615a() {
        return new C73920a1();
    }

    /* renamed from: c */
    public void mo7616c(StringBuilder sb, C68070l.C68072b bVar, String str, C98121d dVar, int i, int i2) {
    }

    /* renamed from: d */
    public void mo7617d(Map<String, String> map, C68070l.C68072b bVar) {
        if (bVar.f195582i == 671088689) {
            Log.m105925i("MicroMsg.ChattingItemAppMsgDownloader", "values: %s", map.toString());
            this.f216975b = Util.getInt(mo103005f(map, "state"), 0);
            this.f216976c = mo103005f(map, "appid");
            this.f216977d = mo103005f(map, "appname");
            this.f216978e = Util.getInt(mo103005f(map, "appsize"), 0);
            this.f216979f = mo103005f(map, "iconurl");
        }
    }

    /* renamed from: f */
    public final String mo103005f(Map<String, String> map, String str) {
        return Util.nullAsNil(map.get(".msg.appmsg.downloaderapp." + str));
    }
}
