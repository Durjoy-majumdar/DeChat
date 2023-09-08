package b91;

import a91.C79474a;
import s81.C90153a;

/* renamed from: b91.c */
public class C79676c extends C79474a {

    /* renamed from: a */
    public C90153a f233586a;

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        if (r5.isReleased() == false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
        r5.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006c, code lost:
        if (r5.isReleased() == false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x012a, code lost:
        if (r15.isReleased() == false) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x012c, code lost:
        r15.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0152, code lost:
        if (r15.isReleased() == false) goto L_0x012c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0162 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x00f8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00f1 A[SYNTHETIC, Splitter:B:68:0x00f1] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x014e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo109467a(com.eclipsesource.mmv8.V8Array r15) {
        /*
            r14 = this;
            java.lang.String r0 = "[EdgeComputingJsApiSaveToEdgeTable] throw Exception : "
            java.lang.String r1 = "EdgeComputingJsApiBase"
            r2 = 0
            if (r15 == 0) goto L_0x016f
            int r3 = r15.length()
            r4 = 3
            if (r3 >= r4) goto L_0x0010
            goto L_0x016f
        L_0x0010:
            r3 = 0
            java.lang.String r4 = r15.getString(r3)
            boolean r5 = u24.C90599h.m113511d(r4)
            if (r5 == 0) goto L_0x001c
            return r2
        L_0x001c:
            r5 = 1
            com.eclipsesource.mmv8.V8Array r5 = r15.getArray(r5)     // Catch:{ Exception -> 0x004d, all -> 0x004a }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ Exception -> 0x0047 }
            r6.<init>()     // Catch:{ Exception -> 0x0047 }
            r7 = 0
        L_0x0027:
            int r8 = r5.length()     // Catch:{ Exception -> 0x0041 }
            if (r7 >= r8) goto L_0x0037
            java.lang.String r8 = r5.getString(r7)     // Catch:{ Exception -> 0x0041 }
            r6.add(r8)     // Catch:{ Exception -> 0x0041 }
            int r7 = r7 + 1
            goto L_0x0027
        L_0x0037:
            boolean r7 = r5.isReleased()
            if (r7 != 0) goto L_0x006f
        L_0x003d:
            r5.release()
            goto L_0x006f
        L_0x0041:
            r7 = move-exception
            goto L_0x0050
        L_0x0043:
            r15 = move-exception
            r2 = r5
            goto L_0x0163
        L_0x0047:
            r7 = move-exception
            r6 = r2
            goto L_0x0050
        L_0x004a:
            r15 = move-exception
            goto L_0x0163
        L_0x004d:
            r7 = move-exception
            r5 = r2
            r6 = r5
        L_0x0050:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0043 }
            r8.<init>()     // Catch:{ all -> 0x0043 }
            r8.append(r0)     // Catch:{ all -> 0x0043 }
            java.lang.String r7 = r7.getMessage()     // Catch:{ all -> 0x0043 }
            r8.append(r7)     // Catch:{ all -> 0x0043 }
            java.lang.String r7 = r8.toString()     // Catch:{ all -> 0x0043 }
            j81.C87906e.m109407a(r1, r7)     // Catch:{ all -> 0x0043 }
            if (r5 == 0) goto L_0x006f
            boolean r7 = r5.isReleased()
            if (r7 != 0) goto L_0x006f
            goto L_0x003d
        L_0x006f:
            if (r6 == 0) goto L_0x0162
            int r5 = r6.size()
            if (r5 > 0) goto L_0x0079
            goto L_0x0162
        L_0x0079:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "[EdgeComputingJsApiSaveToEdgeTable] logic, table : "
            r5.append(r7)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            j81.C87906e.m109407a(r1, r5)
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r7 = 2
            com.eclipsesource.mmv8.V8Array r15 = r15.getArray(r7)     // Catch:{ Exception -> 0x0132, all -> 0x0130 }
            if (r15 == 0) goto L_0x0124
            int r7 = r15.length()     // Catch:{ Exception -> 0x0122 }
            if (r7 <= 0) goto L_0x0124
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ Exception -> 0x0122 }
            r7.<init>()     // Catch:{ Exception -> 0x0122 }
            r8 = 0
        L_0x00a2:
            int r9 = r15.length()     // Catch:{ Exception -> 0x0122 }
            if (r8 >= r9) goto L_0x0107
            com.eclipsesource.mmv8.V8Array r9 = r15.getArray(r8)     // Catch:{ Exception -> 0x00d7, all -> 0x00d3 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ Exception -> 0x00d1 }
            r10.<init>()     // Catch:{ Exception -> 0x00d1 }
            r11 = 0
        L_0x00b2:
            int r12 = r9.length()     // Catch:{ Exception -> 0x00d1 }
            if (r11 >= r12) goto L_0x00c2
            java.lang.String r12 = r9.getString(r11)     // Catch:{ Exception -> 0x00d1 }
            r10.add(r12)     // Catch:{ Exception -> 0x00d1 }
            int r11 = r11 + 1
            goto L_0x00b2
        L_0x00c2:
            r7.add(r10)     // Catch:{ Exception -> 0x00d1 }
            boolean r10 = r9.isReleased()     // Catch:{ Exception -> 0x0122 }
            if (r10 != 0) goto L_0x00f8
        L_0x00cb:
            r9.release()     // Catch:{ Exception -> 0x0122 }
            goto L_0x00f8
        L_0x00cf:
            r2 = move-exception
            goto L_0x00fb
        L_0x00d1:
            r10 = move-exception
            goto L_0x00d9
        L_0x00d3:
            r3 = move-exception
            r9 = r2
            r2 = r3
            goto L_0x00fb
        L_0x00d7:
            r10 = move-exception
            r9 = r2
        L_0x00d9:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00cf }
            r11.<init>()     // Catch:{ all -> 0x00cf }
            r11.append(r0)     // Catch:{ all -> 0x00cf }
            java.lang.String r10 = r10.getMessage()     // Catch:{ all -> 0x00cf }
            r11.append(r10)     // Catch:{ all -> 0x00cf }
            java.lang.String r10 = r11.toString()     // Catch:{ all -> 0x00cf }
            j81.C87906e.m109407a(r1, r10)     // Catch:{ all -> 0x00cf }
            if (r9 == 0) goto L_0x00f8
            boolean r10 = r9.isReleased()     // Catch:{ Exception -> 0x0122 }
            if (r10 != 0) goto L_0x00f8
            goto L_0x00cb
        L_0x00f8:
            int r8 = r8 + 1
            goto L_0x00a2
        L_0x00fb:
            if (r9 == 0) goto L_0x0106
            boolean r3 = r9.isReleased()     // Catch:{ Exception -> 0x0122 }
            if (r3 != 0) goto L_0x0106
            r9.release()     // Catch:{ Exception -> 0x0122 }
        L_0x0106:
            throw r2     // Catch:{ Exception -> 0x0122 }
        L_0x0107:
            s81.a r2 = r14.f233586a     // Catch:{ Exception -> 0x0122 }
            if (r2 != 0) goto L_0x0112
            s81.a r2 = new s81.a     // Catch:{ Exception -> 0x0122 }
            r2.<init>()     // Catch:{ Exception -> 0x0122 }
            r14.f233586a = r2     // Catch:{ Exception -> 0x0122 }
        L_0x0112:
            s81.a r2 = r14.f233586a     // Catch:{ Exception -> 0x0122 }
            java.lang.String r3 = "Edge.db"
            boolean r2 = r2.mo124410d(r3, r4, r6, r7)     // Catch:{ Exception -> 0x0122 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)     // Catch:{ Exception -> 0x0122 }
            goto L_0x0124
        L_0x011f:
            r0 = move-exception
            r2 = r15
            goto L_0x0156
        L_0x0122:
            r2 = move-exception
            goto L_0x0136
        L_0x0124:
            if (r15 == 0) goto L_0x0155
            boolean r0 = r15.isReleased()
            if (r0 != 0) goto L_0x0155
        L_0x012c:
            r15.release()
            goto L_0x0155
        L_0x0130:
            r0 = move-exception
            goto L_0x0156
        L_0x0132:
            r15 = move-exception
            r13 = r2
            r2 = r15
            r15 = r13
        L_0x0136:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x011f }
            r3.<init>()     // Catch:{ all -> 0x011f }
            r3.append(r0)     // Catch:{ all -> 0x011f }
            java.lang.String r0 = r2.getMessage()     // Catch:{ all -> 0x011f }
            r3.append(r0)     // Catch:{ all -> 0x011f }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x011f }
            j81.C87906e.m109407a(r1, r0)     // Catch:{ all -> 0x011f }
            if (r15 == 0) goto L_0x0155
            boolean r0 = r15.isReleased()
            if (r0 != 0) goto L_0x0155
            goto L_0x012c
        L_0x0155:
            return r5
        L_0x0156:
            if (r2 == 0) goto L_0x0161
            boolean r15 = r2.isReleased()
            if (r15 != 0) goto L_0x0161
            r2.release()
        L_0x0161:
            throw r0
        L_0x0162:
            return r2
        L_0x0163:
            if (r2 == 0) goto L_0x016e
            boolean r0 = r2.isReleased()
            if (r0 != 0) goto L_0x016e
            r2.release()
        L_0x016e:
            throw r15
        L_0x016f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b91.C79676c.mo109467a(com.eclipsesource.mmv8.V8Array):java.lang.Object");
    }

    /* renamed from: b */
    public String mo109468b() {
        return "save_to_edge_table";
    }

    public int getType() {
        return 4;
    }

    public void release() {
        C90153a aVar = this.f233586a;
        if (aVar != null) {
            aVar.mo124409c();
            this.f233586a = null;
        }
    }
}
