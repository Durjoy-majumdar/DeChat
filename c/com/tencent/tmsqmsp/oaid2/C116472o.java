package com.tencent.tmsqmsp.oaid2;

import android.content.Context;
import com.tencent.tmsqmsp.oaid2.C116473p;

/* renamed from: com.tencent.tmsqmsp.oaid2.o */
public class C116472o implements C116443b, C116473p.C116475b {

    /* renamed from: a */
    public C116473p f349408a;

    /* renamed from: b */
    public IVendorCallback f349409b;

    /* renamed from: a */
    public void mo120388a(Context context, IVendorCallback iVendorCallback) {
        this.f349409b = iVendorCallback;
        this.f349408a = new C116473p(context, this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        r0 = r2.f349408a.mo179924c();
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
            com.tencent.tmsqmsp.oaid2.p r0 = r2.f349408a
            java.lang.String r0 = r0.mo179924c()
            if (r0 != 0) goto L_0x0012
            goto L_0x0013
        L_0x0012:
            r1 = r0
        L_0x0013:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmsqmsp.oaid2.C116472o.mo120389d():java.lang.String");
    }

    /* renamed from: e */
    public boolean mo120390e() {
        C116473p pVar = this.f349408a;
        if (pVar != null) {
            return pVar.mo179923b();
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
        C116473p pVar = this.f349408a;
        if (pVar != null) {
            pVar.mo179925d();
        }
    }

    /* renamed from: a */
    public String mo120387a() {
        String a;
        if (mo120390e() && (a = this.f349408a.mo179920a()) != null) {
            return a;
        }
        return "";
    }

    /* renamed from: a */
    public void mo179919a(C116473p pVar) {
        try {
            IVendorCallback iVendorCallback = this.f349409b;
            if (iVendorCallback != null) {
                iVendorCallback.onResult(mo120390e(), mo120389d(), mo120387a());
            }
        } catch (Exception unused) {
            IVendorCallback iVendorCallback2 = this.f349409b;
            if (iVendorCallback2 != null) {
                iVendorCallback2.onResult(false, "null", "null");
            }
        }
    }
}
