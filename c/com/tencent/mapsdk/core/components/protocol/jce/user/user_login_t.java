package com.tencent.mapsdk.core.components.protocol.jce.user;

import com.p013qq.taf.jce.MapJceStruct;
import com.tencent.mapsdk.internal.C113953m;
import com.tencent.mapsdk.internal.C113979n;

public final class user_login_t extends MapJceStruct {
    public String channel;

    /* renamed from: fr */
    public String f339581fr;
    public String imei;
    public boolean is_login;
    public String nettp;

    /* renamed from: pf */
    public String f339582pf;
    public String session_id;
    public long uin;
    public int uip;
    public long user_id;
    public String version;

    /* renamed from: x */
    public double f339583x;

    /* renamed from: y */
    public double f339584y;

    public user_login_t() {
        this.user_id = 0;
        this.session_id = "";
        this.uin = 0;
        this.uip = 0;
        this.imei = "";
        this.f339583x = 0.0d;
        this.f339584y = 0.0d;
        this.f339582pf = "";
        this.version = "";
        this.is_login = true;
        this.f339581fr = "";
        this.nettp = "";
        this.channel = "";
    }

    public final String className() {
        return "navsns.user_login_t";
    }

    public final void readFrom(C113953m mVar) {
        this.user_id = mVar.mo172381a(this.user_id, 0, true);
        this.session_id = mVar.mo172389b(1, true);
        this.uin = mVar.mo172381a(this.uin, 2, true);
        this.uip = mVar.mo172379a(this.uip, 3, true);
        this.imei = mVar.mo172389b(4, false);
        this.f339583x = mVar.mo172377a(this.f339583x, 5, false);
        this.f339584y = mVar.mo172377a(this.f339584y, 6, false);
        this.f339582pf = mVar.mo172389b(7, false);
        this.version = mVar.mo172389b(8, false);
        this.is_login = mVar.mo172388a(9, false);
        this.f339581fr = mVar.mo172389b(10, false);
        this.nettp = mVar.mo172389b(11, false);
        this.channel = mVar.mo172389b(12, false);
    }

    public final void writeTo(C113979n nVar) {
        nVar.mo172514a(this.user_id, 0);
        nVar.mo172517a(this.session_id, 1);
        nVar.mo172514a(this.uin, 2);
        nVar.mo172513a(this.uip, 3);
        String str = this.imei;
        if (str != null) {
            nVar.mo172517a(str, 4);
        }
        nVar.mo172511a(this.f339583x, 5);
        nVar.mo172511a(this.f339584y, 6);
        String str2 = this.f339582pf;
        if (str2 != null) {
            nVar.mo172517a(str2, 7);
        }
        String str3 = this.version;
        if (str3 != null) {
            nVar.mo172517a(str3, 8);
        }
        nVar.mo172521a(this.is_login, 9);
        String str4 = this.f339581fr;
        if (str4 != null) {
            nVar.mo172517a(str4, 10);
        }
        String str5 = this.nettp;
        if (str5 != null) {
            nVar.mo172517a(str5, 11);
        }
        String str6 = this.channel;
        if (str6 != null) {
            nVar.mo172517a(str6, 12);
        }
    }

    public user_login_t(long j, String str, long j2, int i, String str2, double d, double d2, String str3, String str4, boolean z, String str5, String str6, String str7) {
        this.user_id = j;
        this.session_id = str;
        this.uin = j2;
        this.uip = i;
        this.imei = str2;
        this.f339583x = d;
        this.f339584y = d2;
        this.f339582pf = str3;
        this.version = str4;
        this.is_login = z;
        this.f339581fr = str5;
        this.nettp = str6;
        this.channel = str7;
    }
}
