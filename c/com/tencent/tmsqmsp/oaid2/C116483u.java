package com.tencent.tmsqmsp.oaid2;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: com.tencent.tmsqmsp.oaid2.u */
public class C116483u implements C116443b, C116481s {

    /* renamed from: a */
    public C116479r f349426a;

    /* renamed from: b */
    public Context f349427b;

    /* renamed from: c */
    public IVendorCallback f349428c;

    /* renamed from: a */
    public void mo120388a(Context context, IVendorCallback iVendorCallback) {
        if (C116479r.m164257a(context)) {
            String a = C86057e.m106549a(context);
            if (!TextUtils.isEmpty(a)) {
                C116479r.m164256a(context, a);
            }
            this.f349426a = new C116479r(context, this);
            this.f349428c = iVendorCallback;
            this.f349427b = context;
        }
    }

    /* renamed from: b */
    public void mo179942b() {
        IVendorCallback iVendorCallback = this.f349428c;
        if (iVendorCallback != null) {
            iVendorCallback.onResult(false, "", "");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r2.f349426a.mo179934a();
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo120389d() {
        /*
            r2 = this;
            boolean r0 = r2.mo120390e()
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0012
            com.tencent.tmsqmsp.oaid2.r r0 = r2.f349426a
            java.lang.String r0 = r0.mo179934a()
            if (r0 != 0) goto L_0x0011
            goto L_0x0012
        L_0x0011:
            r1 = r0
        L_0x0012:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmsqmsp.oaid2.C116483u.mo120389d():java.lang.String");
    }

    /* renamed from: e */
    public boolean mo120390e() {
        C116479r rVar = this.f349426a;
        if (rVar != null) {
            return rVar.mo179937c();
        }
        return false;
    }

    /* renamed from: j */
    public void mo120391j() {
        C116479r rVar = this.f349426a;
        if (rVar != null) {
            rVar.mo179935a(C86057e.m106549a(this.f349427b));
        } else {
            mo179942b();
        }
    }

    /* renamed from: k */
    public boolean mo120392k() {
        return false;
    }

    /* renamed from: l */
    public void mo120393l() {
        C116479r rVar = this.f349426a;
        if (rVar != null) {
            rVar.mo179938d();
        }
    }

    /* renamed from: a */
    public String mo120387a() {
        String b;
        if (!mo120390e() || (b = this.f349426a.mo179936b()) == null) {
            return "";
        }
        return b;
    }

    /* renamed from: a */
    public void mo179941a(boolean z) {
        IVendorCallback iVendorCallback = this.f349428c;
        if (iVendorCallback != null) {
            iVendorCallback.onResult(mo120390e(), mo120389d(), mo120387a());
        }
    }
}
