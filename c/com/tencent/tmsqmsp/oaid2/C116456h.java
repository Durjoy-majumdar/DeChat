package com.tencent.tmsqmsp.oaid2;

import android.content.Context;
import android.os.IBinder;

/* renamed from: com.tencent.tmsqmsp.oaid2.h */
public class C116456h implements C116443b, C116452g {

    /* renamed from: a */
    public IVendorCallback f349369a;

    /* renamed from: b */
    public String f349370b = "";

    /* renamed from: c */
    public String f349371c = "";

    /* renamed from: d */
    public C116459i f349372d;

    /* renamed from: e */
    public boolean f349373e = false;

    /* renamed from: f */
    public boolean f349374f = false;

    /* renamed from: a */
    public void mo120388a(Context context, IVendorCallback iVendorCallback) {
        this.f349369a = iVendorCallback;
        C116459i iVar = new C116459i(context);
        this.f349372d = iVar;
        iVar.mo179900a((C116452g) this);
    }

    public IBinder asBinder() {
        return null;
    }

    /* renamed from: b */
    public void mo179890b() {
        IVendorCallback iVendorCallback = this.f349369a;
        if (iVendorCallback != null) {
            iVendorCallback.onResult(false, (String) null, (String) null);
        }
    }

    /* renamed from: d */
    public String mo120389d() {
        return this.f349371c;
    }

    /* renamed from: e */
    public boolean mo120390e() {
        return this.f349374f;
    }

    /* renamed from: j */
    public void mo120391j() {
        this.f349372d.mo179900a((C116452g) this);
    }

    /* renamed from: k */
    public boolean mo120392k() {
        return false;
    }

    /* renamed from: l */
    public void mo120393l() {
        C116459i iVar;
        if (this.f349373e && (iVar = this.f349372d) != null) {
            iVar.mo179899a();
        }
    }

    /* renamed from: a */
    public String mo120387a() {
        return this.f349370b;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|(1:4)|5|6|(1:8)|9|10|12|(2:14|15)(1:16)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0016 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0014 A[Catch:{ Exception -> 0x0016 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo179889a(com.tencent.tmsqmsp.oaid2.C116449f r4) {
        /*
            r3 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = r4.mo120376c()     // Catch:{ Exception -> 0x000c }
            r3.f349370b = r1     // Catch:{ Exception -> 0x000c }
            if (r1 != 0) goto L_0x000c
            r3.f349370b = r0     // Catch:{ Exception -> 0x000c }
        L_0x000c:
            java.lang.String r1 = r4.mo120377i()     // Catch:{ Exception -> 0x0016 }
            r3.f349371c = r1     // Catch:{ Exception -> 0x0016 }
            if (r1 != 0) goto L_0x0016
            r3.f349371c = r0     // Catch:{ Exception -> 0x0016 }
        L_0x0016:
            boolean r4 = r4.mo120375b()     // Catch:{ Exception -> 0x001d }
            r3.f349374f = r4     // Catch:{ Exception -> 0x001d }
            goto L_0x001e
        L_0x001d:
        L_0x001e:
            r4 = 1
            r3.f349373e = r4
            com.tencent.tmsqmsp.oaid2.IVendorCallback r4 = r3.f349369a
            if (r4 == 0) goto L_0x002e
            boolean r0 = r3.f349374f
            java.lang.String r1 = r3.f349371c
            java.lang.String r2 = r3.f349370b
            r4.onResult(r0, r1, r2)
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmsqmsp.oaid2.C116456h.mo179889a(com.tencent.tmsqmsp.oaid2.f):void");
    }
}
