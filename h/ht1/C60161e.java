package ht1;

import com.tencent.p014mm.message.C68066g;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import gy3.C87412m;
import java.util.Map;
import p1081gi.C98121d;
import te3.C64659qk1;

/* renamed from: ht1.e */
public final class C60161e extends C68066g {

    /* renamed from: b */
    public C64659qk1 f171701b = new C64659qk1();

    /* renamed from: c */
    public String f171702c = "";

    /* renamed from: d */
    public String f171703d = "";

    /* renamed from: e */
    public String f171704e = "";

    /* renamed from: f */
    public String f171705f = "";

    /* renamed from: g */
    public int f171706g;

    /* renamed from: h */
    public String f171707h = "";

    /* renamed from: i */
    public String f171708i = "";

    /* renamed from: a */
    public C68066g mo7615a() {
        C60161e eVar = new C60161e();
        eVar.mo85136j(this.f171702c);
        eVar.mo85134h(this.f171703d);
        eVar.mo85135i(this.f171704e);
        eVar.mo85133g(this.f171705f);
        int i = this.f171706g;
        eVar.f171701b.f185049h = i;
        eVar.f171706g = i;
        eVar.f171707h = this.f171707h;
        eVar.f171701b = this.f171701b;
        return eVar;
    }

    /* renamed from: c */
    public void mo7616c(StringBuilder sb, C68070l.C68072b bVar, String str, C98121d dVar, int i, int i2) {
        C87412m.m108594g(sb, "sb");
        sb.append("<findernamecard>");
        sb.append("<username>");
        sb.append(Util.escapeStringForXml(this.f171702c));
        sb.append("</username>");
        sb.append("<avatar>");
        sb.append(C68070l.C68072b.m80417g(this.f171703d));
        sb.append("</avatar>");
        sb.append("<nickname>");
        sb.append(Util.escapeStringForXml(this.f171704e));
        sb.append("</nickname>");
        sb.append("<auth_job>");
        sb.append(Util.escapeStringForXml(this.f171705f));
        sb.append("</auth_job>");
        sb.append("<auth_icon>");
        sb.append(this.f171706g);
        sb.append("</auth_icon>");
        sb.append("<auth_icon_url>");
        sb.append(Util.escapeStringForXml(this.f171707h));
        sb.append("</auth_icon_url>");
        sb.append("<ecSource>");
        sb.append(XmlParser.getCDataWrapper(this.f171708i));
        sb.append("</ecSource>");
        sb.append("</findernamecard>");
    }

    /* renamed from: d */
    public void mo7617d(Map<String, String> map, C68070l.C68072b bVar) {
        C87412m.m108594g(map, "values");
        String nullAsNil = Util.nullAsNil(map.get(".msg.appmsg.findernamecard.username"));
        C87412m.m108593f(nullAsNil, "nullAsNil(values.get(\".m…indernamecard.username\"))");
        mo85136j(nullAsNil);
        String nullAsNil2 = Util.nullAsNil(map.get(".msg.appmsg.findernamecard.avatar"));
        C87412m.m108593f(nullAsNil2, "nullAsNil(values.get(\".m….findernamecard.avatar\"))");
        mo85134h(nullAsNil2);
        String nullAsNil3 = Util.nullAsNil(map.get(".msg.appmsg.findernamecard.nickname"));
        C87412m.m108593f(nullAsNil3, "nullAsNil(values.get(\".m…indernamecard.nickname\"))");
        mo85135i(nullAsNil3);
        String nullAsNil4 = Util.nullAsNil(map.get(".msg.appmsg.findernamecard.auth_job"));
        C87412m.m108593f(nullAsNil4, "nullAsNil(values.get(\".m…indernamecard.auth_job\"))");
        mo85133g(nullAsNil4);
        int safeParseInt = Util.safeParseInt(map.get(".msg.appmsg.findernamecard.auth_icon"));
        this.f171701b.f185049h = safeParseInt;
        this.f171706g = safeParseInt;
        String nullAsNil5 = Util.nullAsNil(map.get(".msg.appmsg.findernamecard.auth_icon_url"));
        C87412m.m108593f(nullAsNil5, "nullAsNil(values.get(\".m…namecard.auth_icon_url\"))");
        this.f171707h = nullAsNil5;
        String nullAsNil6 = Util.nullAsNil(map.get(".msg.appmsg.findernamecard.ecSource"));
        C87412m.m108593f(nullAsNil6, "nullAsNil(values.get(\".m…indernamecard.ecSource\"))");
        this.f171708i = nullAsNil6;
        C64659qk1 qk12 = this.f171701b;
        qk12.f185045d = this.f171702c;
        qk12.f185047f = this.f171703d;
        qk12.f185046e = this.f171704e;
        qk12.f185048g = this.f171705f;
        qk12.f185049h = this.f171706g;
        qk12.f185051j = nullAsNil6;
    }

    /* renamed from: f */
    public final String mo85132f() {
        return this.f171704e;
    }

    /* renamed from: g */
    public final void mo85133g(String str) {
        C87412m.m108594g(str, "value");
        this.f171701b.f185048g = str;
        this.f171705f = str;
    }

    /* renamed from: h */
    public final void mo85134h(String str) {
        C87412m.m108594g(str, "value");
        this.f171701b.f185047f = str;
        this.f171703d = str;
    }

    /* renamed from: i */
    public final void mo85135i(String str) {
        C87412m.m108594g(str, "value");
        this.f171701b.f185046e = str;
        this.f171704e = str;
    }

    /* renamed from: j */
    public final void mo85136j(String str) {
        C87412m.m108594g(str, "value");
        this.f171701b.f185045d = str;
        this.f171702c = str;
    }
}
