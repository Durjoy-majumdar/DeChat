package com.tencent.p014mm.message;

import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Map;
import p1081gi.C98121d;
import s90.C48300n;

/* renamed from: com.tencent.mm.message.f */
public class C68065f extends C68066g {

    /* renamed from: b */
    public int f195417b = -1;

    /* renamed from: c */
    public int f195418c = -1;

    /* renamed from: d */
    public int f195419d = -1;

    /* renamed from: e */
    public int f195420e = -1;

    /* renamed from: f */
    public int f195421f = -1;

    /* renamed from: g */
    public int f195422g = 0;

    /* renamed from: h */
    public int f195423h = 0;

    /* renamed from: i */
    public int f195424i = 0;

    /* renamed from: j */
    public String f195425j = "";

    /* renamed from: k */
    public boolean f195426k = false;

    /* renamed from: l */
    public C48300n f195427l;

    /* renamed from: m */
    public int f195428m = 0;

    /* renamed from: f */
    public static boolean m80397f(int i) {
        return i == 5 || i == 16;
    }

    /* renamed from: a */
    public C68066g mo7615a() {
        if (this.f195417b == -1 && !this.f195426k && this.f195428m != 1) {
            return null;
        }
        C68065f fVar = new C68065f();
        fVar.f195417b = this.f195417b;
        fVar.f195418c = this.f195418c;
        fVar.f195419d = this.f195419d;
        fVar.f195420e = this.f195420e;
        fVar.f195421f = this.f195421f;
        fVar.f195422g = this.f195422g;
        fVar.f195425j = this.f195425j;
        fVar.f195424i = this.f195424i;
        fVar.f195426k = this.f195426k;
        fVar.f195427l = this.f195427l;
        fVar.f195423h = this.f195423h;
        fVar.f195428m = this.f195428m;
        return fVar;
    }

    /* renamed from: c */
    public void mo7616c(StringBuilder sb, C68070l.C68072b bVar, String str, C98121d dVar, int i, int i2) {
        if (this.f195417b != -1 || this.f195428m == 1) {
            if (!Util.isNullOrNil(this.f195425j)) {
                this.f195422g = 1;
            }
            sb.append("<mmreadershare>");
            sb.append("<itemshowtype>");
            sb.append(this.f195417b);
            sb.append("</itemshowtype>");
            sb.append("<ispaysubscribe>");
            sb.append(this.f195423h);
            sb.append("</ispaysubscribe>");
            if (this.f195428m == 1) {
                sb.append("<showsourceinfo>");
                sb.append(this.f195428m);
                sb.append("</showsourceinfo>");
            }
            int i3 = this.f195417b;
            if (i3 == 5 || i3 == 16) {
                sb.append("<pubtime>");
                sb.append(this.f195418c);
                sb.append("</pubtime>");
                sb.append("<duration>");
                sb.append(this.f195419d);
                sb.append("</duration>");
                sb.append("<width>");
                sb.append(this.f195420e);
                sb.append("</width>");
                sb.append("<height>");
                sb.append(this.f195421f);
                sb.append("</height>");
                sb.append("<nativepage>");
                sb.append(this.f195422g);
                sb.append("</nativepage>");
                sb.append("<funcflag>");
                sb.append(this.f195424i);
                sb.append("</funcflag>");
                sb.append("<vid>");
                sb.append(Util.escapeStringForXml(this.f195425j));
                sb.append("</vid>");
            }
            sb.append("</mmreadershare>");
        }
        if (this.f195426k && this.f195427l != null) {
            sb.append("<mmbrandmpvideo>");
            sb.append("<vid>");
            sb.append(Util.escapeStringForXml(this.f195427l.f133368f));
            sb.append("</vid>");
            sb.append("<videourl>");
            sb.append(Util.escapeStringForXml(this.f195427l.f133367e));
            sb.append("</videourl>");
            sb.append("<mpurl>");
            sb.append(Util.escapeStringForXml(this.f195427l.f133366d));
            sb.append("</mpurl>");
            sb.append("<thumbwidth>");
            sb.append(this.f195427l.f133372j);
            sb.append("</thumbwidth>");
            sb.append("<thumbheight>");
            sb.append(this.f195427l.f133373n);
            sb.append("</thumbheight>");
            sb.append("<duration>");
            sb.append(this.f195427l.f133371i);
            sb.append("</duration>");
            sb.append("</mmbrandmpvideo>");
        }
    }

    /* renamed from: d */
    public void mo7617d(Map<String, String> map, C68070l.C68072b bVar) {
        this.f195423h = Util.getInt(map.get(".msg.appmsg.mmreadershare.ispaysubscribe"), 0);
        this.f195417b = Util.getInt(map.get(".msg.appmsg.mmreadershare.itemshowtype"), -1);
        this.f195428m = Util.getInt(map.get(".msg.appmsg.mmreadershare.showsourceinfo"), 0);
        int i = this.f195417b;
        if (i == 5 || i == 16) {
            this.f195418c = Util.getInt(map.get(".msg.appmsg.mmreadershare.pubtime"), 0);
            this.f195419d = Util.getInt(map.get(".msg.appmsg.mmreadershare.duration"), 0);
            this.f195420e = Util.getInt(map.get(".msg.appmsg.mmreadershare.width"), 0);
            this.f195421f = Util.getInt(map.get(".msg.appmsg.mmreadershare.height"), 0);
            this.f195422g = Util.getInt(map.get(".msg.appmsg.mmreadershare.nativepage"), 0);
            this.f195424i = Util.getInt(map.get(".msg.appmsg.mmreadershare.funcflag"), 0);
            this.f195425j = map.get(".msg.appmsg.mmreadershare.vid");
        }
        if (!Util.isNullOrNil(map.get(".msg.appmsg.mmbrandmpvideo.mpurl")) && !Util.isNullOrNil(map.get(".msg.appmsg.mmbrandmpvideo.videourl"))) {
            this.f195426k = true;
            C48300n nVar = new C48300n();
            this.f195427l = nVar;
            nVar.f133368f = map.get(".msg.appmsg.mmbrandmpvideo.vid");
            this.f195427l.f133367e = map.get(".msg.appmsg.mmbrandmpvideo.videourl");
            this.f195427l.f133366d = map.get(".msg.appmsg.mmbrandmpvideo.mpurl");
            this.f195427l.f133370h = map.get(".msg.appmsg.thumburl");
            this.f195427l.f133369g = map.get(".msg.appmsg.title");
            this.f195427l.f133374o = map.get(".msg.appmsg.url");
            this.f195427l.f133375p = map.get(".msg.appmsg.sourceusername");
            this.f195427l.f133376q = map.get(".msg.appmsg.sourcedisplayname");
            this.f195427l.f133371i = (int) Util.getFloat(map.get(".msg.appmsg.mmbrandmpvideo.duration"), 0.0f);
            this.f195427l.f133372j = (int) Util.getFloat(map.get(".msg.appmsg.mmbrandmpvideo.thumbwidth"), 0.0f);
            this.f195427l.f133373n = (int) Util.getFloat(map.get(".msg.appmsg.mmbrandmpvideo.thumbheight"), 0.0f);
        }
    }
}
