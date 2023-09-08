package com.tencent.p014mm.plugin.account.p024ui;

import com.tencent.p014mm.modelsimple.C114735a0;
import com.tencent.p014mm.p136ui.applet.SecurityImage;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.account.ui.m0 */
public class C115135m0 extends SecurityImage.C116049b {

    /* renamed from: i */
    public static C115135m0 f345161i;

    /* renamed from: b */
    public String f345162b = null;

    /* renamed from: c */
    public String f345163c = null;

    /* renamed from: d */
    public String f345164d = null;

    /* renamed from: e */
    public String f345165e = null;

    /* renamed from: f */
    public String f345166f = null;

    /* renamed from: g */
    public byte[] f345167g = null;

    /* renamed from: h */
    public int f345168h = 0;

    /* renamed from: c */
    public static String m161943c() {
        C115135m0 m0Var = f345161i;
        if (m0Var != null) {
            return m0Var.f345162b;
        }
        return null;
    }

    /* renamed from: d */
    public static String m161944d() {
        C115135m0 m0Var = f345161i;
        if (m0Var != null) {
            return m0Var.f345163c;
        }
        return null;
    }

    /* renamed from: a */
    public void mo93941a() {
        if (!Util.isNullOrNil(this.f345164d)) {
            C86709a0.m107524d().mo123460f(new C114735a0(this.f345162b, this.f345164d, this.f348174a.getSecCodeType(), "", "", "", 0, "", false, true));
            return;
        }
        C86709a0.m107524d().mo123460f(new C114735a0(this.f345162b, this.f345163c, this.f348174a.getSecCodeType(), "", "", "", 0, "", false, false));
    }

    /* renamed from: b */
    public void mo93942b() {
    }
}
