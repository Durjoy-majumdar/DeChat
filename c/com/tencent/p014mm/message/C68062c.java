package com.tencent.p014mm.message;

import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Map;
import p1081gi.C98121d;

/* renamed from: com.tencent.mm.message.c */
public class C68062c extends C68066g {

    /* renamed from: A */
    public String f195380A;

    /* renamed from: B */
    public int f195381B;

    /* renamed from: C */
    public String f195382C;

    /* renamed from: D */
    public String f195383D;

    /* renamed from: E */
    public C68067h f195384E;

    /* renamed from: b */
    public String f195385b;

    /* renamed from: c */
    public String f195386c;

    /* renamed from: d */
    public String f195387d;

    /* renamed from: e */
    public String f195388e;

    /* renamed from: f */
    public String f195389f;

    /* renamed from: g */
    public String f195390g;

    /* renamed from: h */
    public String f195391h;

    /* renamed from: i */
    public String f195392i;

    /* renamed from: j */
    public String f195393j;

    /* renamed from: k */
    public String f195394k;

    /* renamed from: l */
    public String f195395l;

    /* renamed from: m */
    public int f195396m;

    /* renamed from: n */
    public String f195397n;

    /* renamed from: o */
    public String f195398o;

    /* renamed from: p */
    public String f195399p;

    /* renamed from: q */
    public String f195400q;

    /* renamed from: r */
    public String f195401r;

    /* renamed from: s */
    public String f195402s;

    /* renamed from: t */
    public String f195403t;

    /* renamed from: u */
    public int f195404u;

    /* renamed from: v */
    public String f195405v;

    /* renamed from: w */
    public String f195406w;

    /* renamed from: x */
    public String f195407x;

    /* renamed from: y */
    public String f195408y;

    /* renamed from: z */
    public String f195409z;

    /* renamed from: a */
    public C68066g mo7615a() {
        return new C68062c();
    }

    /* renamed from: c */
    public void mo7616c(StringBuilder sb, C68070l.C68072b bVar, String str, C98121d dVar, int i, int i2) {
    }

    /* renamed from: d */
    public void mo7617d(Map<String, String> map, C68070l.C68072b bVar) {
        if (bVar.f195582i == 2001) {
            C68067h hVar = new C68067h();
            this.f195384E = hVar;
            hVar.mo7617d(map, bVar);
            this.f195385b = Util.nullAsNil(map.get(".msg.appmsg.wcpayinfo.locallogoicon"));
            this.f195386c = Util.nullAsNil(map.get(".msg.appmsg.wcpayinfo.localbubbleicon"));
            Log.m105925i("MicroMsg.AppContentC2cMsgPiece", "locallogoicon: %s, localbubbleicon: %s, effectResource: %s", this.f195385b, this.f195386c, Util.nullAsNil(map.get(".msg.appmsg.wcpayinfo.effectresource")));
            this.f195387d = Util.nullAsNil(map.get(".msg.appmsg.wcpayinfo.corpname"));
            if (!Util.isNullOrNil(this.f195384E.f195436b)) {
                this.f195388e = this.f195384E.f195436b;
            } else {
                this.f195388e = Util.nullAsNil(map.get(".msg.appmsg.wcpayinfo.senderc2cshowsourceurl"));
            }
            if (!Util.isNullOrNil(this.f195384E.f195437c)) {
                this.f195389f = this.f195384E.f195437c;
            } else {
                this.f195389f = Util.nullAsNil(map.get(".msg.appmsg.wcpayinfo.senderc2cshowsourcemd5"));
            }
            if (!Util.isNullOrNil(this.f195384E.f195438d)) {
                this.f195390g = this.f195384E.f195438d;
            } else {
                this.f195390g = Util.nullAsNil(map.get(".msg.appmsg.wcpayinfo.receiverc2cshowsourceurl"));
            }
            if (!Util.isNullOrNil(this.f195384E.f195439e)) {
                this.f195391h = this.f195384E.f195439e;
            } else {
                this.f195391h = Util.nullAsNil(map.get(".msg.appmsg.wcpayinfo.receiverc2cshowsourcemd5"));
            }
            if (!Util.isNullOrNil(this.f195384E.f195440f)) {
                this.f195392i = this.f195384E.f195440f;
            } else {
                this.f195392i = Util.nullAsNil(map.get(".msg.appmsg.wcpayinfo.recshowsourceurl"));
            }
            if (!Util.isNullOrNil(this.f195384E.f195441g)) {
                this.f195393j = this.f195384E.f195441g;
            } else {
                this.f195393j = Util.nullAsNil(map.get(".msg.appmsg.wcpayinfo.recshowsourcemd5"));
            }
            if (!Util.isNullOrNil(this.f195384E.f195442h)) {
                this.f195394k = this.f195384E.f195442h;
            } else {
                this.f195394k = Util.nullAsNil(map.get(".msg.appmsg.wcpayinfo.detailshowsourceurl"));
            }
            if (!Util.isNullOrNil(this.f195384E.f195443i)) {
                this.f195395l = this.f195384E.f195443i;
            } else {
                this.f195395l = Util.nullAsNil(map.get(".msg.appmsg.wcpayinfo.detailshowsourcemd5"));
            }
            this.f195396m = Util.getInt(map.get(".msg.appmsg.wcpayinfo.subtype"), 0);
            this.f195397n = Util.nullAsNil(map.get(".msg.appmsg.wcpayinfo.exclusive_recv_username"));
            if (!Util.isNullOrNil(this.f195384E.f195451q)) {
                this.f195398o = this.f195384E.f195451q;
            }
            if (!Util.isNullOrNil(this.f195384E.f195452r)) {
                this.f195399p = this.f195384E.f195452r;
            }
            if (!Util.isNullOrNil(this.f195384E.f195453s)) {
                this.f195400q = this.f195384E.f195453s;
            }
            if (!Util.isNullOrNil(this.f195384E.f195454t)) {
                this.f195401r = this.f195384E.f195454t;
            }
            if (!Util.isNullOrNil(this.f195384E.f195455u)) {
                this.f195402s = this.f195384E.f195455u;
            }
            if (!Util.isNullOrNil(this.f195384E.f195456v)) {
                this.f195403t = this.f195384E.f195456v;
            }
            C68067h hVar2 = this.f195384E;
            this.f195404u = hVar2.f195457w;
            if (!Util.isNullOrNil(hVar2.f195458x)) {
                this.f195405v = this.f195384E.f195458x;
            }
            if (!Util.isNullOrNil(this.f195384E.f195459y)) {
                this.f195406w = this.f195384E.f195459y;
            }
            if (!Util.isNullOrNil(this.f195384E.f195460z)) {
                this.f195407x = this.f195384E.f195460z;
            }
            if (!Util.isNullOrNil(this.f195384E.f195430A)) {
                this.f195408y = this.f195384E.f195430A;
            }
            if (!Util.isNullOrNil(this.f195384E.f195431B)) {
                this.f195409z = this.f195384E.f195431B;
            }
            if (!Util.isNullOrNil(this.f195384E.f195432C)) {
                this.f195380A = this.f195384E.f195432C;
            }
            C68067h hVar3 = this.f195384E;
            this.f195381B = hVar3.f195433D;
            if (!Util.isNullOrNil(hVar3.f195434E)) {
                this.f195382C = this.f195384E.f195434E;
            }
            if (!Util.isNullOrNil(this.f195384E.f195435F)) {
                this.f195383D = this.f195384E.f195435F;
            }
        }
    }
}
