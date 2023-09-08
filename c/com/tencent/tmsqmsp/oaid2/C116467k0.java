package com.tencent.tmsqmsp.oaid2;

import android.content.Context;
import com.tencent.tmsqmsp.oaid2.C116464j0;

/* renamed from: com.tencent.tmsqmsp.oaid2.k0 */
public class C116467k0 implements C116443b, C116464j0.C116466b {

    /* renamed from: a */
    public IVendorCallback f349396a;

    /* renamed from: b */
    public C116464j0 f349397b;

    /* renamed from: a */
    public void mo179914a(C116464j0 j0Var) {
        IVendorCallback iVendorCallback = this.f349396a;
        if (iVendorCallback != null) {
            iVendorCallback.onResult(mo120390e(), mo120389d(), mo120387a());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        r0 = r2.f349397b.mo179907a();
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo120389d() {
        /*
            r2 = this;
            boolean r0 = r2.mo120390e()
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0009
            return r1
        L_0x0009:
            com.tencent.tmsqmsp.oaid2.j0 r0 = r2.f349397b
            java.lang.String r0 = r0.mo179907a()
            if (r0 != 0) goto L_0x0012
            goto L_0x0013
        L_0x0012:
            r1 = r0
        L_0x0013:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmsqmsp.oaid2.C116467k0.mo120389d():java.lang.String");
    }

    /* renamed from: e */
    public boolean mo120390e() {
        C116464j0 j0Var = this.f349397b;
        if (j0Var != null) {
            return j0Var.mo179910d();
        }
        return false;
    }

    /* renamed from: j */
    public void mo120391j() {
    }

    /* renamed from: k */
    public boolean mo120392k() {
        return false;
    }

    /* renamed from: l */
    public void mo120393l() {
        C116464j0 j0Var = this.f349397b;
        if (j0Var != null) {
            j0Var.mo179911e();
        }
    }

    /* renamed from: a */
    public void mo120388a(Context context, IVendorCallback iVendorCallback) {
        this.f349396a = iVendorCallback;
        C116464j0 j0Var = new C116464j0(context, this);
        this.f349397b = j0Var;
        j0Var.mo179909c();
    }

    /* renamed from: a */
    public String mo120387a() {
        String b;
        if (mo120390e() && (b = this.f349397b.mo179908b()) != null) {
            return b;
        }
        return "";
    }
}
