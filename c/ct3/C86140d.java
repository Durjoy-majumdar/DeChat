package ct3;

/* renamed from: ct3.d */
public abstract class C86140d implements C86134a {
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0032 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ct3.C86139c mo120551a(android.content.Context r9) {
        /*
            r8 = this;
            java.lang.String r0 = "supported"
            r1 = 0
            android.content.ContentResolver r2 = r9.getContentResolver()     // Catch:{ all -> 0x001a }
            java.lang.String r9 = "content://com.meizu.flyme.openidsdk/"
            android.net.Uri r3 = android.net.Uri.parse(r9)     // Catch:{ all -> 0x001a }
            r4 = 0
            r5 = 0
            java.lang.String[] r6 = new java.lang.String[]{r0}     // Catch:{ all -> 0x001a }
            r7 = 0
            android.database.Cursor r9 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x001a }
            goto L_0x001c
        L_0x001a:
            r9 = r1
        L_0x001c:
            java.lang.String r0 = ""
            if (r9 != 0) goto L_0x0021
            goto L_0x0035
        L_0x0021:
            boolean r2 = r9.moveToNext()
            if (r2 == 0) goto L_0x0035
            java.lang.String r2 = "value"
            int r2 = r9.getColumnIndex(r2)     // Catch:{ all -> 0x0032 }
            java.lang.String r0 = r9.getString(r2)     // Catch:{ all -> 0x0032 }
        L_0x0032:
            r9.close()     // Catch:{ all -> 0x0035 }
        L_0x0035:
            java.lang.String r9 = "0"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0044
            r9 = -107(0xffffffffffffff95, float:NaN)
            ct3.c r9 = ct3.C86139c.m106651a(r9)
            return r9
        L_0x0044:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ct3.C86140d.mo120551a(android.content.Context):ct3.c");
    }
}
