package lw3;

import android.content.Context;
import rv3.C90102d;
import vv3.C118702d;

/* renamed from: lw3.c */
public class C117488c {

    /* renamed from: a */
    public C118702d f351592a;

    /* renamed from: b */
    public C117487b f351593b = new C117487b();

    public C117488c(C118702d dVar) {
        this.f351592a = dVar;
        Context context = dVar.f355205a;
        try {
            context.getSharedPreferences("ts_" + C90102d.m112732a(C90102d.f258757a), 0);
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.io.File} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo182200a(java.io.File r8, java.lang.String r9, int r10) {
        /*
            r7 = this;
            lw3.b r0 = r7.f351593b
            java.lang.String r8 = r8.getAbsolutePath()
            r0.getClass()
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L_0x0013
        L_0x0011:
            r0 = r3
            goto L_0x003f
        L_0x0013:
            java.io.File[] r8 = r0.mo182196c(r8)
            if (r8 == 0) goto L_0x0011
            int r0 = r8.length
            if (r0 > 0) goto L_0x001d
            goto L_0x0011
        L_0x001d:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r8.length
            r4 = 0
        L_0x0024:
            if (r4 >= r1) goto L_0x003f
            r5 = r8[r4]
            boolean r6 = android.text.TextUtils.isEmpty(r9)
            if (r6 != 0) goto L_0x0039
            java.lang.String r6 = r5.getName()
            boolean r6 = r6.startsWith(r9)
            if (r6 != 0) goto L_0x0039
            goto L_0x003c
        L_0x0039:
            r0.add(r5)
        L_0x003c:
            int r4 = r4 + 1
            goto L_0x0024
        L_0x003f:
            lw3.b r8 = r7.f351593b
            r8.getClass()
            if (r0 == 0) goto L_0x0062
            boolean r9 = r0.isEmpty()
            if (r9 != 0) goto L_0x0062
            int r9 = r0.size()
            if (r9 > r10) goto L_0x0053
            goto L_0x0062
        L_0x0053:
            lw3.a r9 = new lw3.a
            r9.<init>(r8)
            java.util.Collections.sort(r0, r9)
            java.lang.Object r8 = r0.get(r2)
            r3 = r8
            java.io.File r3 = (java.io.File) r3
        L_0x0062:
            if (r3 == 0) goto L_0x0067
            r3.delete()
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lw3.C117488c.mo182200a(java.io.File, java.lang.String, int):void");
    }
}
