package com.tencent.tmsqmsp.oaid2;

import android.content.Context;

/* renamed from: com.tencent.tmsqmsp.oaid2.m0 */
public class C86068m0 implements C116443b {

    /* renamed from: a */
    public C86064l0 f250539a;

    /* renamed from: a */
    public void mo120388a(Context context, IVendorCallback iVendorCallback) {
        this.f250539a = new C86064l0(context);
    }

    /* renamed from: d */
    public String mo120389d() {
        return null;
    }

    /* renamed from: e */
    public boolean mo120390e() {
        return "1".equals(m106565a("persist.sys.identifierid.supported", "0"));
    }

    /* renamed from: j */
    public void mo120391j() {
    }

    /* renamed from: k */
    public boolean mo120392k() {
        return true;
    }

    /* renamed from: l */
    public void mo120393l() {
    }

    /* renamed from: a */
    public String mo120387a() {
        return this.f250539a.mo120383a(0, "");
    }

    /* renamed from: a */
    public static String m106565a(String str, String str2) {
        Class<String> cls = String.class;
        try {
            Class<?> cls2 = Class.forName("android.os.SystemProperties");
            return (String) cls2.getMethod("get", new Class[]{cls, cls}).invoke(cls2, new Object[]{str, "unknown"});
        } catch (Exception unused) {
            return "";
        }
    }
}
