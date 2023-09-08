package com.tencent.p014mm.plugin.appbrand.config;

import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.config.C81662k;
import wi0.C90990o;

/* renamed from: com.tencent.mm.plugin.appbrand.config.l */
public class C81677l implements C81662k.C81670g<WxaAttributes> {

    /* renamed from: b */
    public final /* synthetic */ String f239722b;

    /* renamed from: c */
    public final /* synthetic */ C81662k.C81673i f239723c;

    public C81677l(String str, C81662k.C81673i iVar) {
        this.f239722b = str;
        this.f239723c = iVar;
    }

    public String getUsername() {
        return C81661j.m100181f(this.f239722b);
    }

    /* renamed from: m */
    public Object mo114015m(String str) {
        return C81161g2.Cx0().mo114011mL(this.f239722b, C81662k.C81670g.f239716a);
    }

    /* renamed from: n */
    public boolean mo114016n(Object obj) {
        WxaAttributes wxaAttributes = (WxaAttributes) obj;
        return C81681p.m100219a(wxaAttributes) || C81681p.m100220b(wxaAttributes);
    }

    /* renamed from: o */
    public C90990o mo114017o(String str) {
        C81662k.C81673i iVar = this.f239723c;
        if (iVar == null) {
            return new C90990o((String) null, str, false);
        }
        return new C90990o((String) null, str, false, iVar.mo114019a(), this.f239723c.mo114021c(), this.f239723c.mo114020b());
    }
}
