package com.tencent.tmsqmsp.oaid2;

import android.os.AsyncTask;

/* renamed from: com.tencent.tmsqmsp.oaid2.t */
public class C116482t extends AsyncTask<Void, Void, Boolean> {

    /* renamed from: a */
    public C116476q f349424a;

    /* renamed from: b */
    public C116481s f349425b;

    public C116482t(C116476q qVar, C116481s sVar) {
        this.f349424a = qVar;
        this.f349425b = sVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:5|6|(2:8|9)(1:18)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0008 */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0008 A[LOOP:0: B:5:0x0008->B:10:0x0019, LOOP_START, PHI: r4 
      PHI: (r4v3 int) = (r4v2 int), (r4v6 int) binds: [B:4:0x0007, B:10:0x0019] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC, Splitter:B:5:0x0008] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Boolean doInBackground(java.lang.Void... r4) {
        /*
            r3 = this;
            com.tencent.tmsqmsp.oaid2.q r4 = r3.f349424a
            if (r4 != 0) goto L_0x0007
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L_0x0007:
            r4 = 0
        L_0x0008:
            com.tencent.tmsqmsp.oaid2.q r0 = r3.f349424a     // Catch:{ InterruptedException -> 0x0008 }
            boolean r0 = r0.mo179929c()     // Catch:{ InterruptedException -> 0x0008 }
            if (r0 != 0) goto L_0x001b
            r1 = 10
            java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x0008 }
            int r4 = r4 + 1
            r1 = 30
            if (r4 < r1) goto L_0x0008
        L_0x001b:
            if (r0 == 0) goto L_0x0025
            com.tencent.tmsqmsp.oaid2.s r4 = r3.f349425b
            if (r4 == 0) goto L_0x0025
            r1 = 1
            r4.mo179941a(r1)
        L_0x0025:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmsqmsp.oaid2.C116482t.doInBackground(java.lang.Void[]):java.lang.Boolean");
    }

    /* renamed from: a */
    public void onPostExecute(Boolean bool) {
        super.onPostExecute(bool);
    }
}
