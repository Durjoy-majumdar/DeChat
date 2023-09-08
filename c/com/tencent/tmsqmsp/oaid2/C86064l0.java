package com.tencent.tmsqmsp.oaid2;

import android.content.Context;

/* renamed from: com.tencent.tmsqmsp.oaid2.l0 */
public class C86064l0 {

    /* renamed from: a */
    public Context f250537a;

    public C86064l0(Context context) {
        this.f250537a = context;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0047  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo120383a(int r8, java.lang.String r9) {
        /*
            r7 = this;
            r0 = 0
            if (r8 == 0) goto L_0x0029
            r1 = 1
            if (r8 == r1) goto L_0x001a
            r1 = 2
            if (r8 == r1) goto L_0x000b
            r2 = r0
            goto L_0x0030
        L_0x000b:
            java.lang.String r8 = java.lang.String.valueOf(r9)
            java.lang.String r9 = "content://com.vivo.vms.IdProvider/IdentifierId/AAID_"
            java.lang.String r8 = r9.concat(r8)
            android.net.Uri r8 = android.net.Uri.parse(r8)
            goto L_0x002f
        L_0x001a:
            java.lang.String r8 = java.lang.String.valueOf(r9)
            java.lang.String r9 = "content://com.vivo.vms.IdProvider/IdentifierId/VAID_"
            java.lang.String r8 = r9.concat(r8)
            android.net.Uri r8 = android.net.Uri.parse(r8)
            goto L_0x002f
        L_0x0029:
            java.lang.String r8 = "content://com.vivo.vms.IdProvider/IdentifierId/OAID"
            android.net.Uri r8 = android.net.Uri.parse(r8)
        L_0x002f:
            r2 = r8
        L_0x0030:
            android.content.Context r8 = r7.f250537a
            android.content.ContentResolver r1 = r8.getContentResolver()
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)
            if (r8 != 0) goto L_0x0047
            java.lang.String r8 = "return cursor is null,return"
            com.tencent.tmsqmsp.oaid2.C116445c.m164139b(r8)
            goto L_0x005b
        L_0x0047:
            boolean r9 = r8.moveToNext()
            if (r9 == 0) goto L_0x0058
            java.lang.String r9 = "value"
            int r9 = r8.getColumnIndex(r9)
            java.lang.String r0 = r8.getString(r9)
        L_0x0058:
            r8.close()
        L_0x005b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmsqmsp.oaid2.C86064l0.mo120383a(int, java.lang.String):java.lang.String");
    }
}
