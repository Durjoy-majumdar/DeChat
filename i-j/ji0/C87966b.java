package ji0;

import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import gy3.C87412m;
import p749xh.C91204d0;
import tr0.C37242c;

/* renamed from: ji0.b */
public final class C87966b extends C37242c<C87967c> {

    /* renamed from: f */
    public static final String[] f254559f = {MAutoStorage.getCreateSQLs(C87967c.f254561A, "AppBrandWxaPkgPreDownloadStatistics2"), "DROP TABLE IF EXISTS AppBrandWxaPkgPreDownloadStatistics"};

    /* renamed from: e */
    public final ISQLiteDatabase f254560e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87966b(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C87967c.f254561A, "AppBrandWxaPkgPreDownloadStatistics2", C91204d0.f261482o);
        C87412m.m108594g(iSQLiteDatabase, "db");
        this.f254560e = iSQLiteDatabase;
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x0029 A[SYNTHETIC] */
    /* renamed from: Lo */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo122422Lo() {
        /*
            r11 = this;
            android.database.Cursor r0 = r11.getAll()
            r1 = 0
            if (r0 == 0) goto L_0x00ee
            boolean r2 = r0.moveToFirst()     // Catch:{ all -> 0x00ec }
            if (r2 != 0) goto L_0x000f
            goto L_0x00ee
        L_0x000f:
            java.util.LinkedList r2 = new java.util.LinkedList     // Catch:{ all -> 0x00ec }
            r2.<init>()     // Catch:{ all -> 0x00ec }
        L_0x0014:
            ji0.c r3 = new ji0.c     // Catch:{ all -> 0x00ec }
            r3.<init>()     // Catch:{ all -> 0x00ec }
            r3.convertFrom(r0)     // Catch:{ all -> 0x00ec }
            r2.add(r3)     // Catch:{ all -> 0x00ec }
            boolean r3 = r0.moveToNext()     // Catch:{ all -> 0x00ec }
            if (r3 != 0) goto L_0x0014
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00ec }
        L_0x0029:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00ec }
            if (r3 == 0) goto L_0x00ee
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00ec }
            ji0.c r3 = (ji0.C87967c) r3     // Catch:{ all -> 0x00ec }
            java.lang.String r4 = r3.field_appId     // Catch:{ all -> 0x00ec }
            java.lang.String r5 = r3.field_packageKey     // Catch:{ all -> 0x00ec }
            int r6 = r3.field_packageType     // Catch:{ all -> 0x00ec }
            r7 = 36
            java.lang.String r8 = ""
            if (r6 == 0) goto L_0x008e
            r9 = 6
            if (r6 == r9) goto L_0x008b
            r9 = 12
            java.lang.String r10 = "__WITHOUT_PLUGINCODE__"
            if (r6 == r9) goto L_0x008f
            r9 = 13
            if (r6 == r9) goto L_0x0074
            r9 = 22
            java.lang.String r10 = "__WITHOUT_MULTI_PLUGINCODE__"
            if (r6 == r9) goto L_0x008f
            r9 = 23
            if (r6 == r9) goto L_0x005d
            java.lang.String r10 = com.tencent.p014mm.plugin.appbrand.appcache.C81273j1.m99631a(r5)     // Catch:{ all -> 0x00ec }
            goto L_0x008f
        L_0x005d:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ec }
            r6.<init>()     // Catch:{ all -> 0x00ec }
            java.lang.String r5 = com.tencent.p014mm.plugin.appbrand.appcache.C81273j1.m99631a(r5)     // Catch:{ all -> 0x00ec }
            r6.append(r5)     // Catch:{ all -> 0x00ec }
            r6.append(r7)     // Catch:{ all -> 0x00ec }
            r6.append(r10)     // Catch:{ all -> 0x00ec }
            java.lang.String r10 = r6.toString()     // Catch:{ all -> 0x00ec }
            goto L_0x008f
        L_0x0074:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ec }
            r6.<init>()     // Catch:{ all -> 0x00ec }
            java.lang.String r5 = com.tencent.p014mm.plugin.appbrand.appcache.C81273j1.m99631a(r5)     // Catch:{ all -> 0x00ec }
            r6.append(r5)     // Catch:{ all -> 0x00ec }
            r6.append(r7)     // Catch:{ all -> 0x00ec }
            r6.append(r10)     // Catch:{ all -> 0x00ec }
            java.lang.String r10 = r6.toString()     // Catch:{ all -> 0x00ec }
            goto L_0x008f
        L_0x008b:
            java.lang.String r10 = "__PLUGINCODE__"
            goto L_0x008f
        L_0x008e:
            r10 = r8
        L_0x008f:
            com.tencent.p014mm.plugin.appbrand.app.C81161g2.requireAccountInitializedOnDemand()     // Catch:{ all -> 0x00ec }
            com.tencent.mm.plugin.appbrand.appcache.h3 r5 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.f238471g     // Catch:{ all -> 0x00ec }
            r6 = 0
            if (r5 == 0) goto L_0x00d2
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)     // Catch:{ all -> 0x00ec }
            if (r9 == 0) goto L_0x00c3
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ec }
            r9.<init>()     // Catch:{ all -> 0x00ec }
            r9.append(r4)     // Catch:{ all -> 0x00ec }
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)     // Catch:{ all -> 0x00ec }
            if (r4 == 0) goto L_0x00ac
            goto L_0x00bb
        L_0x00ac:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ec }
            r4.<init>()     // Catch:{ all -> 0x00ec }
            r4.append(r7)     // Catch:{ all -> 0x00ec }
            r4.append(r10)     // Catch:{ all -> 0x00ec }
            java.lang.String r8 = r4.toString()     // Catch:{ all -> 0x00ec }
        L_0x00bb:
            r9.append(r8)     // Catch:{ all -> 0x00ec }
            java.lang.String r4 = r9.toString()     // Catch:{ all -> 0x00ec }
            goto L_0x00c4
        L_0x00c3:
            r4 = r1
        L_0x00c4:
            int r7 = r3.field_version     // Catch:{ all -> 0x00ec }
            java.lang.String r8 = "pkgPath"
            java.lang.String[] r8 = new java.lang.String[]{r8}     // Catch:{ all -> 0x00ec }
            com.tencent.mm.plugin.appbrand.appcache.z2 r4 = r5.mo113533pl(r4, r7, r6, r8)     // Catch:{ all -> 0x00ec }
            goto L_0x00d3
        L_0x00d2:
            r4 = r1
        L_0x00d3:
            if (r4 == 0) goto L_0x00e5
            java.lang.String r4 = r4.field_pkgPath     // Catch:{ all -> 0x00ec }
            if (r4 == 0) goto L_0x00e2
            int r4 = r4.length()     // Catch:{ all -> 0x00ec }
            if (r4 != 0) goto L_0x00e0
            goto L_0x00e2
        L_0x00e0:
            r4 = 0
            goto L_0x00e3
        L_0x00e2:
            r4 = 1
        L_0x00e3:
            if (r4 == 0) goto L_0x0029
        L_0x00e5:
            java.lang.String[] r4 = new java.lang.String[r6]     // Catch:{ all -> 0x00ec }
            super.delete(r3, r4)     // Catch:{ all -> 0x00ec }
            goto L_0x0029
        L_0x00ec:
            r1 = move-exception
            goto L_0x00f4
        L_0x00ee:
            rx3.b0 r2 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00ec }
            cy3.C58003b.m67160a(r0, r1)
            return
        L_0x00f4:
            throw r1     // Catch:{ all -> 0x00f5 }
        L_0x00f5:
            r2 = move-exception
            cy3.C58003b.m67160a(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ji0.C87966b.mo122422Lo():void");
    }

    /* renamed from: jo */
    public final String mo122423jo(C87967c cVar) {
        return "appId:" + cVar.field_appId + ", version:" + cVar.field_version + ", packageType:" + cVar.field_packageType + ", packageKey:" + cVar.field_packageKey + ", source:" + cVar.field_source + ", reportId:" + cVar.field_reportId;
    }
}
