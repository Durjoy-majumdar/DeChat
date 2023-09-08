package com.tencent.p014mm.pluginsdk.p133ui.tools;

import com.tencent.p014mm.message.C68066g;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Map;
import p1081gi.C98121d;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.l */
public class C72915l extends C68066g {

    /* renamed from: b */
    public String f212511b;

    /* renamed from: c */
    public int f212512c = 0;

    /* renamed from: d */
    public String f212513d;

    /* renamed from: e */
    public String f212514e;

    /* renamed from: f */
    public int f212515f = 0;

    /* renamed from: g */
    public int f212516g = -1;

    /* renamed from: h */
    public int f212517h = 0;

    /* renamed from: i */
    public String f212518i;

    /* renamed from: a */
    public C68066g mo7615a() {
        C72915l lVar = new C72915l();
        lVar.f212511b = this.f212511b;
        lVar.f212512c = this.f212512c;
        lVar.f212513d = this.f212513d;
        lVar.f212514e = this.f212514e;
        lVar.f212515f = this.f212515f;
        lVar.f212516g = this.f212516g;
        lVar.f212517h = this.f212517h;
        lVar.f212518i = this.f212518i;
        return lVar;
    }

    /* renamed from: c */
    public void mo7616c(StringBuilder sb, C68070l.C68072b bVar, String str, C98121d dVar, int i, int i2) {
        sb.append("<gameshare>");
        sb.append("<liteappext>");
        sb.append("<liteappbizdata>");
        sb.append(Util.escapeStringForXml(this.f212511b));
        sb.append("</liteappbizdata>");
        sb.append("<liteapppriority>");
        sb.append(this.f212512c);
        sb.append("</liteapppriority>");
        sb.append("</liteappext>");
        sb.append("<gameshareid>");
        sb.append(Util.escapeStringForXml(this.f212513d));
        sb.append("</gameshareid>");
        sb.append("<sharedata>");
        sb.append(Util.escapeStringForXml(this.f212514e));
        sb.append("</sharedata>");
        sb.append("<isvideo>");
        sb.append(this.f212515f);
        sb.append("</isvideo>");
        sb.append("<duration>");
        sb.append(this.f212516g);
        sb.append("</duration>");
        sb.append("<isexposed>");
        sb.append(this.f212517h);
        sb.append("</isexposed>");
        sb.append("<readtext>");
        sb.append(Util.escapeStringForXml(this.f212518i));
        sb.append("</readtext>");
        sb.append("</gameshare>");
    }

    /* renamed from: d */
    public void mo7617d(Map<String, String> map, C68070l.C68072b bVar) {
        this.f212511b = map.get(".msg.appmsg.gameshare.liteappext.liteappbizdata");
        this.f212512c = Util.getInt(map.get(".msg.appmsg.gameshare.liteappext.liteapppriority"), 0);
        this.f212513d = map.get(".msg.appmsg.gameshare.gameshareid");
        this.f212514e = map.get(".msg.appmsg.gameshare.sharedata");
        this.f212515f = Util.getInt(map.get(".msg.appmsg.gameshare.isvideo"), 0);
        this.f212516g = Util.getInt(map.get(".msg.appmsg.gameshare.duration"), 0);
        this.f212517h = Util.getInt(map.get(".msg.appmsg.gameshare.isexposed"), 0);
        this.f212518i = map.get(".msg.appmsg.gameshare.readtext");
    }
}
