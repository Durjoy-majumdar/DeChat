package com.tencent.p014mm.message;

import android.util.Base64;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Map;
import p1081gi.C98121d;
import pe3.C89349b;
import te3.C77973op3;

/* renamed from: com.tencent.mm.message.h */
public class C68067h extends C68066g {

    /* renamed from: A */
    public String f195430A;

    /* renamed from: B */
    public String f195431B;

    /* renamed from: C */
    public String f195432C;

    /* renamed from: D */
    public int f195433D;

    /* renamed from: E */
    public String f195434E;

    /* renamed from: F */
    public String f195435F;

    /* renamed from: b */
    public String f195436b;

    /* renamed from: c */
    public String f195437c;

    /* renamed from: d */
    public String f195438d;

    /* renamed from: e */
    public String f195439e;

    /* renamed from: f */
    public String f195440f;

    /* renamed from: g */
    public String f195441g;

    /* renamed from: h */
    public String f195442h;

    /* renamed from: i */
    public String f195443i;

    /* renamed from: j */
    public String f195444j;

    /* renamed from: k */
    public String f195445k;

    /* renamed from: l */
    public int f195446l;

    /* renamed from: m */
    public String f195447m;

    /* renamed from: n */
    public String f195448n;

    /* renamed from: o */
    public boolean f195449o;

    /* renamed from: p */
    public int f195450p;

    /* renamed from: q */
    public String f195451q;

    /* renamed from: r */
    public String f195452r;

    /* renamed from: s */
    public String f195453s;

    /* renamed from: t */
    public String f195454t;

    /* renamed from: u */
    public String f195455u;

    /* renamed from: v */
    public String f195456v;

    /* renamed from: w */
    public int f195457w;

    /* renamed from: x */
    public String f195458x;

    /* renamed from: y */
    public String f195459y;

    /* renamed from: z */
    public String f195460z;

    /* renamed from: a */
    public C68066g mo7615a() {
        return new C68067h();
    }

    /* renamed from: c */
    public void mo7616c(StringBuilder sb, C68070l.C68072b bVar, String str, C98121d dVar, int i, int i2) {
    }

    /* renamed from: d */
    public void mo7617d(Map<String, String> map, C68070l.C68072b bVar) {
        String nullAsNil = Util.nullAsNil(map.get(".msg.appmsg.wcpayinfo.coverinfo"));
        C77973op3 op32 = new C77973op3();
        try {
            if (!Util.isNullOrNil(nullAsNil)) {
                op32.parseFrom(Base64.decode(nullAsNil, 0));
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.AppContentRedPacketCoverInfoPiece", e, "", new Object[0]);
        }
        this.f195436b = op32.f227948d;
        this.f195437c = op32.f227949e;
        this.f195438d = op32.f227950f;
        this.f195439e = op32.f227951g;
        this.f195440f = op32.f227952h;
        this.f195441g = op32.f227953i;
        this.f195442h = op32.f227954j;
        this.f195443i = op32.f227955n;
        this.f195444j = op32.f227956o;
        this.f195445k = op32.f227957p;
        this.f195446l = op32.f227958q;
        this.f195447m = op32.f227959r;
        this.f195448n = op32.f227960s;
        this.f195449o = op32.f227961t;
        this.f195450p = op32.f227962u;
        this.f195451q = op32.f227963v;
        this.f195452r = op32.f227964w;
        this.f195453s = op32.f227965x;
        this.f195454t = op32.f227966y;
        this.f195455u = op32.f227967z;
        this.f195456v = op32.f227935A;
        this.f195457w = op32.f227936B;
        C89349b bVar2 = op32.f227937C;
        if (bVar2 != null) {
            this.f195458x = bVar2.mo123705h();
        }
        this.f195459y = op32.f227938D;
        this.f195460z = op32.f227947M;
        this.f195430A = op32.f227939E;
        this.f195431B = op32.f227942H;
        this.f195432C = op32.f227943I;
        this.f195433D = op32.f227946L;
        this.f195434E = op32.f227944J;
        this.f195435F = op32.f227945K;
    }
}
