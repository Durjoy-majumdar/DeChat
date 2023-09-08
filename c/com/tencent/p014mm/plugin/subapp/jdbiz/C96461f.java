package com.tencent.p014mm.plugin.subapp.jdbiz;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import eb0.C97625j3;
import java.util.Map;

/* renamed from: com.tencent.mm.plugin.subapp.jdbiz.f */
public class C96461f {

    /* renamed from: a */
    public String f282215a = "";

    /* renamed from: b */
    public String f282216b = "";

    /* renamed from: c */
    public long f282217c;

    /* renamed from: d */
    public long f282218d = 0;

    /* renamed from: e */
    public boolean f282219e = false;

    /* renamed from: f */
    public boolean f282220f = false;

    /* renamed from: g */
    public String f282221g = "";

    /* renamed from: h */
    public String f282222h = "";

    /* renamed from: i */
    public long f282223i;

    /* renamed from: j */
    public long f282224j;

    /* renamed from: k */
    public String f282225k = "";

    /* renamed from: l */
    public String f282226l = "";

    /* renamed from: m */
    public String f282227m = "";

    /* renamed from: n */
    public String f282228n = "";

    /* renamed from: o */
    public String f282229o = "";

    /* renamed from: p */
    public String f282230p = "";

    /* renamed from: q */
    public String f282231q = "";

    /* renamed from: r */
    public int f282232r = 0;

    /* renamed from: s */
    public String f282233s = "";

    /* renamed from: a */
    public static C96461f m123739a() {
        String str = (String) C97625j3.m125812b().mo105906u().mo119684e(327942, "");
        C96461f fVar = new C96461f();
        Log.m105924i("MicroMsg.JdMsgContent", " create xml : " + str);
        fVar.mo134434b(str);
        return fVar;
    }

    /* renamed from: b */
    public void mo134434b(String str) {
        this.f282215a = "";
        this.f282216b = "";
        this.f282218d = 0;
        this.f282221g = "";
        this.f282219e = false;
        this.f282220f = false;
        this.f282226l = "";
        this.f282227m = "";
        this.f282228n = "";
        this.f282225k = "";
        this.f282229o = "";
        this.f282233s = str;
        if (!Util.isNullOrNil(str)) {
            Log.m105925i("MicroMsg.JdMsgContent", "feed xml %s", str);
            Map<String, String> parseXml = XmlParser.parseXml(str, "sysmsg", (String) null);
            if (parseXml != null) {
                this.f282215a = Util.nullAs(parseXml.get(".sysmsg.biztype"), "");
                this.f282225k = Util.nullAs(parseXml.get(".sysmsg.alert"), "");
                this.f282216b = Util.nullAs(parseXml.get(".sysmsg.activityid"), "");
                this.f282217c = Util.safeParseLong(parseXml.get(".sysmsg.starttime"));
                this.f282218d = Util.safeParseLong(parseXml.get(".sysmsg.expiretime"));
                Util.nullAs(parseXml.get(".sysmsg.content.title"), "");
                Util.nullAs(parseXml.get(".sysmsg.content.icon"), "");
                this.f282229o = Util.nullAs(parseXml.get(".sysmsg.content.jumpurl"), "");
                this.f282230p = Util.nullAs(parseXml.get(".sysmsg.content.jumpweapp.username"), "");
                this.f282231q = Util.nullAs(parseXml.get(".sysmsg.content.jumpweapp.path"), "");
                this.f282232r = Util.safeParseInt(parseXml.get(".sysmsg.content.jumpweapp.version"));
                this.f282223i = Util.safeParseLong(parseXml.get(".sysmsg.content.urlstarttime"));
                this.f282224j = Util.safeParseLong(parseXml.get(".sysmsg.content.urlexpiretime"));
                this.f282221g = Util.nullAs(parseXml.get(".sysmsg.content.jdcelltitle"), "");
                this.f282222h = Util.nullAs(parseXml.get(".sysmsg.content.jdcellicon"), "");
                Util.safeParseLong(parseXml.get(".sysmsg.content.titlestarttime"));
                Util.safeParseLong(parseXml.get(".sysmsg.content.titleexpiretime"));
                this.f282219e = "1".equals(parseXml.get(".sysmsg.content.findshowreddot"));
                this.f282220f = "1".equals(parseXml.get(".sysmsg.content.jdcellshowred"));
                this.f282226l = Util.nullAs(parseXml.get(".sysmsg.content.alertviewtitle"), "");
                this.f282227m = Util.nullAs(parseXml.get(".sysmsg.content.alertviewconfirm"), "");
                this.f282228n = Util.nullAs(parseXml.get(".sysmsg.content.alertviewcancel"), "");
            }
        }
    }

    /* renamed from: c */
    public boolean mo134435c(C96461f fVar) {
        return fVar == null || !Util.nullAs(this.f282216b, "").equals(Util.nullAs(fVar.f282216b, ""));
    }

    /* renamed from: d */
    public boolean mo134436d() {
        long j = this.f282218d;
        return j != 0 && j < System.currentTimeMillis() / 1000;
    }

    /* renamed from: e */
    public boolean mo134437e() {
        return this.f282217c < System.currentTimeMillis() / 1000;
    }
}
