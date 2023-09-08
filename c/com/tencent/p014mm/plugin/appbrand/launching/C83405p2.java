package com.tencent.p014mm.plugin.appbrand.launching;

import android.util.Pair;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appcache.C81396z3;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.appbrand.launching.precondition.C83430q;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import wi0.C90975b0;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.p2 */
public final class C83405p2 implements C83447q2 {

    /* renamed from: d */
    public final String f243699d;

    /* renamed from: e */
    public final String f243700e;

    /* renamed from: f */
    public final String f243701f;

    /* renamed from: g */
    public final boolean f243702g;

    /* renamed from: h */
    public long f243703h;

    /* renamed from: i */
    public long f243704i;

    /* renamed from: j */
    public long f243705j;

    public C83405p2(String str, String str2, String str3, boolean z) {
        this.f243699d = str;
        this.f243700e = str2;
        this.f243701f = str3;
        this.f243702g = z;
    }

    /* renamed from: a */
    public long mo115587a() {
        return this.f243703h;
    }

    /* renamed from: b */
    public long mo115588b() {
        return this.f243704i;
    }

    /* renamed from: c */
    public long mo115589c() {
        return this.f243705j;
    }

    /* renamed from: d */
    public Pair<WxaAttributes, Boolean> mo115679d() {
        WxaAttributes wxaAttributes;
        Class cls = C90975b0.class;
        this.f243703h = Util.nowMilliSecond();
        String str = this.f243700e;
        if (!(str == null || str.length() == 0)) {
            wxaAttributes = ((C90975b0) C81161g2.Bx0(cls)).mo114011mL(this.f243700e, new String[0]);
        } else {
            String str2 = this.f243699d;
            C87412m.m108591d(str2);
            wxaAttributes = ((C90975b0) C81161g2.Bx0(cls)).mo114000LL(str2, new String[0]);
        }
        if (wxaAttributes != null && !this.f243702g) {
            String str3 = wxaAttributes.field_appId;
            C87412m.m108593f(str3, "attrs.field_appId");
            WxaAttributes.WxaVersionInfo o2 = wxaAttributes.mo113942o2();
            String str4 = this.f243701f;
            C7335d c = C86312j.m106911c(C81396z3.class);
            C87412m.m108593f(c, "getService(WxaVersionPag…IndexStorage::class.java)");
            boolean a = C83430q.m102386a(str3, o2, str4, (C81396z3) c);
            Log.m105924i("LaunchPreconditionTaskGetBackupWxaAttrs", "callSync for username:" + wxaAttributes.field_username + ", appId:" + wxaAttributes.field_appId + ", path:" + this.f243701f + ", pathAccessible:" + a);
            if (!a) {
                Pair<WxaAttributes, Boolean> create = Pair.create((Object) null, Boolean.FALSE);
                C87412m.m108593f(create, "create(null, false)");
                return create;
            }
        }
        Pair<WxaAttributes, Boolean> create2 = Pair.create(wxaAttributes, Boolean.FALSE);
        C87412m.m108593f(create2, "create(attrs, false)");
        long nowMilliSecond = Util.nowMilliSecond();
        this.f243704i = nowMilliSecond;
        this.f243705j = nowMilliSecond - this.f243703h;
        return create2;
    }

    public String name() {
        return "LaunchPreconditionTaskGetBackupWxaAttrs";
    }
}
