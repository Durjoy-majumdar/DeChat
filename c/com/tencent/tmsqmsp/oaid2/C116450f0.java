package com.tencent.tmsqmsp.oaid2;

import android.content.Context;

/* renamed from: com.tencent.tmsqmsp.oaid2.f0 */
public class C116450f0 implements C116443b {

    /* renamed from: a */
    public Context f349365a = null;

    /* renamed from: b */
    public IVendorCallback f349366b = null;

    /* renamed from: com.tencent.tmsqmsp.oaid2.f0$a */
    public class C116451a implements Runnable {
        public C116451a() {
        }

        public void run() {
            try {
                Thread.sleep(1000);
                if (C116450f0.this.f349366b != null) {
                    C116450f0.this.f349366b.onResult(C116448e0.m164146a(), C116448e0.m164145a(C116450f0.this.f349365a), C116448e0.m164147b(C116450f0.this.f349365a));
                }
            } catch (Exception unused) {
                if (C116450f0.this.f349366b != null) {
                    C116450f0.this.f349366b.onResult(false, "null", "null");
                }
            }
        }
    }

    /* renamed from: a */
    public String mo120387a() {
        return "";
    }

    /* renamed from: d */
    public String mo120389d() {
        return "";
    }

    /* renamed from: e */
    public boolean mo120390e() {
        return C116448e0.m164146a();
    }

    /* renamed from: j */
    public void mo120391j() {
        new Thread(new C116451a()).start();
    }

    /* renamed from: k */
    public boolean mo120392k() {
        return false;
    }

    /* renamed from: l */
    public void mo120393l() {
    }

    /* renamed from: a */
    public void mo120388a(Context context, IVendorCallback iVendorCallback) {
        this.f349365a = context;
        this.f349366b = iVendorCallback;
        C116448e0.m164148c(context);
    }
}
