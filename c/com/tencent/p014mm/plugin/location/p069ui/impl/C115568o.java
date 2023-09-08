package com.tencent.p014mm.plugin.location.p069ui.impl;

import com.tencent.p014mm.modelgeo.Addr;
import com.tencent.p014mm.sdk.platformtools.Util;
import te3.C118452o93;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.o */
public class C115568o {

    /* renamed from: a */
    public String f346608a;

    /* renamed from: b */
    public String f346609b;

    /* renamed from: c */
    public double f346610c;

    /* renamed from: d */
    public double f346611d;

    /* renamed from: e */
    public String f346612e;

    /* renamed from: f */
    public String f346613f;

    /* renamed from: g */
    public String f346614g;

    /* renamed from: h */
    public String f346615h;

    /* renamed from: i */
    public String f346616i;

    /* renamed from: j */
    public Addr f346617j;

    /* renamed from: k */
    public String f346618k;

    /* renamed from: l */
    public String f346619l;

    /* renamed from: m */
    public int f346620m;

    /* renamed from: n */
    public String f346621n;

    /* renamed from: o */
    public String f346622o;

    /* renamed from: p */
    public String f346623p;

    /* renamed from: q */
    public int f346624q = -1;

    public C115568o() {
    }

    /* renamed from: a */
    public boolean mo175617a(Addr addr) {
        this.f346617j = addr;
        if (!Util.isNullOrNil(addr.f343956d)) {
            this.f346608a = addr.f343956d;
        }
        if (!Util.isNullOrNil(addr.f343961i)) {
            this.f346609b = addr.f343961i;
        }
        if (!Util.isNullOrNil(addr.f343962j)) {
            this.f346609b += addr.f343962j;
        }
        if (!Util.isNullOrNil(addr.f343963n)) {
            this.f346609b += addr.f343963n;
        }
        if (!Util.isNullOrNil(addr.f343964o)) {
            this.f346609b += addr.f343964o;
        }
        this.f346611d = (double) addr.f343969t;
        this.f346610c = (double) addr.f343970u;
        this.f346613f = addr.f343958f;
        this.f346614g = addr.f343959g;
        this.f346615h = addr.f343961i;
        this.f346616i = addr.f343964o;
        this.f346619l = addr.f343968s;
        if (Util.isNullOrNil(this.f346608a) && Util.isNullOrNil(this.f346609b)) {
            return false;
        }
        this.f346621n = addr.f343973x;
        return true;
    }

    public C115568o(C118452o93 o932, String str) {
        this.f346608a = o932.f354191d;
        this.f346609b = o932.f354192e;
        this.f346610c = o932.f354193f;
        this.f346611d = o932.f354194g;
        this.f346612e = o932.f354195h;
        this.f346613f = o932.f354198n;
        this.f346614g = o932.f354199o;
        this.f346615h = o932.f354200p;
        this.f346616i = o932.f354202r;
        this.f346618k = str;
        this.f346622o = (Util.isNullOrNil(o932.f354204t) || o932.f354204t.equals("0")) ? null : o932.f354204t;
        this.f346623p = o932.f354205u;
        Addr addr = new Addr();
        this.f346617j = addr;
        addr.f343956d = this.f346609b;
        String str2 = this.f346614g;
        addr.f343959g = str2;
        addr.f343960h = str2;
        addr.f343961i = this.f346615h;
        addr.f343963n = this.f346616i;
        addr.f343967r = this.f346608a;
        addr.f343958f = this.f346613f;
        addr.f343970u = (float) o932.f354193f;
        addr.f343969t = (float) o932.f354194g;
        this.f346620m = 0;
    }
}
