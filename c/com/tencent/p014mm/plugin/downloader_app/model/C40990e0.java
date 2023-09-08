package com.tencent.p014mm.plugin.downloader_app.model;

import com.tencent.p014mm.sdk.platformtools.Util;
import sx1.C48495c;
import u41.C52427g;
import v41.C52743b;
import v41.C52744c;

/* renamed from: com.tencent.mm.plugin.downloader_app.model.e0 */
public class C40990e0 extends C48495c {

    /* renamed from: a */
    public boolean f110330a = false;

    /* renamed from: b */
    public boolean f110331b = false;

    /* renamed from: c */
    public int f110332c;

    /* renamed from: d */
    public int f110333d;

    /* renamed from: e */
    public boolean f110334e;

    /* renamed from: f */
    public String f110335f = "";

    /* renamed from: g */
    public String f110336g;

    /* renamed from: h */
    public String f110337h;

    /* renamed from: i */
    public String f110338i;

    /* renamed from: j */
    public String f110339j;

    /* renamed from: k */
    public String f110340k;

    /* renamed from: l */
    public int f110341l = 0;

    /* renamed from: m */
    public C52744c f110342m;

    /* renamed from: n */
    public C52427g f110343n;

    /* renamed from: o */
    public C52743b f110344o;

    /* renamed from: p */
    public int f110345p;

    public C40990e0(int i) {
        this.f110332c = i;
    }

    /* renamed from: a */
    public int mo64012a(C48495c cVar) {
        return Integer.compare(this.f110332c, ((Integer) cVar.mo64013b()).intValue());
    }

    /* renamed from: b */
    public Object mo64013b() {
        return Integer.valueOf(this.f110332c);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C40990e0)) {
            return false;
        }
        C40990e0 e0Var = (C40990e0) obj;
        if (Util.isNullOrNil(e0Var.f110335f) || Util.isNullOrNil(this.f110335f)) {
            return false;
        }
        return e0Var.f110335f.equals(this.f110335f);
    }

    public C40990e0() {
    }
}
