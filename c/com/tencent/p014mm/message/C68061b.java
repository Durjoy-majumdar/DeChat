package com.tencent.p014mm.message;

import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Map;
import p1081gi.C98121d;

/* renamed from: com.tencent.mm.message.b */
public class C68061b extends C68066g {

    /* renamed from: A */
    public String f195353A;

    /* renamed from: B */
    public String f195354B;

    /* renamed from: b */
    public String f195355b;

    /* renamed from: c */
    public String f195356c;

    /* renamed from: d */
    public String f195357d;

    /* renamed from: e */
    public String f195358e;

    /* renamed from: f */
    public String f195359f;

    /* renamed from: g */
    public String f195360g;

    /* renamed from: h */
    public String f195361h;

    /* renamed from: i */
    public String f195362i;

    /* renamed from: j */
    public String f195363j;

    /* renamed from: k */
    public String f195364k;

    /* renamed from: l */
    public String f195365l;

    /* renamed from: m */
    public String f195366m;

    /* renamed from: n */
    public String f195367n;

    /* renamed from: o */
    public String f195368o;

    /* renamed from: p */
    public String f195369p;

    /* renamed from: q */
    public String f195370q;

    /* renamed from: r */
    public String f195371r;

    /* renamed from: s */
    public String f195372s;

    /* renamed from: t */
    public String f195373t;

    /* renamed from: u */
    public String f195374u;

    /* renamed from: v */
    public String f195375v;

    /* renamed from: w */
    public String f195376w;

    /* renamed from: x */
    public String f195377x;

    /* renamed from: y */
    public String f195378y;

    /* renamed from: z */
    public String f195379z;

    /* renamed from: a */
    public C68066g mo7615a() {
        return new C68061b();
    }

    /* renamed from: c */
    public void mo7616c(StringBuilder sb, C68070l.C68072b bVar, String str, C98121d dVar, int i, int i2) {
    }

    /* renamed from: d */
    public void mo7617d(Map<String, String> map, C68070l.C68072b bVar) {
        int i = bVar.f195582i;
        if (i == 2002 || i == 2003) {
            mo93542f(map, "templateid");
            mo93542f(map, "senderurl");
            this.f195355b = mo93542f(map, "sendernativeurl");
            mo93542f(map, "receiverurl");
            this.f195356c = mo93542f(map, "receivernativeurl");
            this.f195357d = mo93542f(map, "iconurl");
            this.f195358e = mo93542f(map, "darkiconurl");
            mo93542f(map, "miniiconurl");
            mo93542f(map, "backgroundurl");
            mo93542f(map, "backgroundname");
            mo93542f(map, "backgroundcolor");
            this.f195359f = mo93542f(map, "receivertitle");
            this.f195360g = mo93542f(map, "sendertitle");
            this.f195364k = mo93542f(map, "senderdes");
            this.f195365l = mo93542f(map, "receiverdes");
            mo93542f(map, "sceneid");
            this.f195367n = mo93542f(map, "paymsgid");
            this.f195361h = mo93542f(map, "titlecolor");
            this.f195374u = mo93542f(map, "titlecolordark");
            this.f195375v = mo93542f(map, "realtitlecolordark");
            this.f195366m = mo93542f(map, "descolor");
            this.f195376w = mo93542f(map, "descolordark");
            this.f195377x = mo93542f(map, "realdescolordark");
            this.f195362i = mo93542f(map, "senderscenetext");
            this.f195363j = mo93542f(map, "receiverscenetext");
            this.f195379z = mo93542f(map, "scenetextcolor");
            this.f195378y = mo93542f(map, "scenetextcolordark");
            this.f195368o = mo93542f(map, "senderbackgroundname");
            this.f195369p = mo93542f(map, "senderbackgroundurl");
            this.f195370q = mo93542f(map, "senderbackgroundurldark");
            this.f195371r = mo93542f(map, "receiverbackgroundname");
            this.f195372s = mo93542f(map, "receiverbackgroundurl");
            this.f195373t = mo93542f(map, "receiverbackgroundurldark");
            this.f195353A = mo93542f(map, "seperatorcolor");
            this.f195354B = mo93542f(map, "seperatorcolordark");
        }
    }

    /* renamed from: f */
    public final String mo93542f(Map<String, String> map, String str) {
        return Util.nullAsNil(map.get(".msg.appmsg.wcpaythirdinfo." + str));
    }
}
