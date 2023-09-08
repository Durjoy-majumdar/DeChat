package wi0;

import android.database.Cursor;
import android.net.Uri;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Arrays;
import p736wc.C38051a;

/* renamed from: wi0.f0 */
public class C90980f0 {

    /* renamed from: a */
    public static final Uri f261055a = Uri.parse("content://" + C38051a.f100592a + "/" + "WxaAttributesTable");

    /* renamed from: b */
    public static final C90980f0 f261056b = new C90980f0();

    /* renamed from: b */
    public static C90980f0 m114143b() {
        return f261056b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x007c A[SYNTHETIC, Splitter:B:22:0x007c] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.tencent.p014mm.plugin.appbrand.config.WxaAttributes> mo125057a(java.util.List<java.lang.String> r13, java.lang.String... r14) {
        /*
            r12 = this;
            if (r13 == 0) goto L_0x00a3
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L_0x000a
            goto L_0x00a3
        L_0x000a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r13)
            r1 = 0
            r2 = 0
        L_0x0011:
            int r3 = r0.size()
            r4 = 1
            if (r2 >= r3) goto L_0x002e
            java.util.Locale r3 = java.util.Locale.ENGLISH
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Object r5 = r0.get(r2)
            r4[r1] = r5
            java.lang.String r5 = "'%s'"
            java.lang.String r3 = java.lang.String.format(r3, r5, r4)
            r0.set(r2, r3)
            int r2 = r2 + 1
            goto L_0x0011
        L_0x002e:
            java.lang.String r2 = ","
            java.lang.String r0 = u24.C90599h.m113512e(r0, r2)
            r2 = 0
            r3 = 2
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x008c }
            android.content.ContentResolver r6 = r5.getContentResolver()     // Catch:{ all -> 0x008c }
            android.net.Uri r7 = f261055a     // Catch:{ all -> 0x008c }
            int r5 = r14.length     // Catch:{ all -> 0x008c }
            if (r5 > 0) goto L_0x0045
            r8 = r2
            goto L_0x0046
        L_0x0045:
            r8 = r14
        L_0x0046:
            java.util.Locale r14 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x008c }
            java.lang.String r5 = "%s in (%s)"
            java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch:{ all -> 0x008c }
            java.lang.String r10 = "appId"
            r9[r1] = r10     // Catch:{ all -> 0x008c }
            r9[r4] = r0     // Catch:{ all -> 0x008c }
            java.lang.String r9 = java.lang.String.format(r14, r5, r9)     // Catch:{ all -> 0x008c }
            r10 = 0
            r11 = 0
            android.database.Cursor r14 = r6.query(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x008c }
            java.util.LinkedList r0 = new java.util.LinkedList     // Catch:{ all -> 0x0080 }
            r0.<init>()     // Catch:{ all -> 0x0080 }
            if (r14 == 0) goto L_0x007a
            boolean r5 = r14.moveToFirst()     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x007a
        L_0x0069:
            com.tencent.mm.plugin.appbrand.config.WxaAttributes r5 = new com.tencent.mm.plugin.appbrand.config.WxaAttributes     // Catch:{ all -> 0x0080 }
            r5.<init>()     // Catch:{ all -> 0x0080 }
            r5.convertFrom(r14)     // Catch:{ all -> 0x0080 }
            r0.add(r5)     // Catch:{ all -> 0x0080 }
            boolean r5 = r14.moveToNext()     // Catch:{ all -> 0x0080 }
            if (r5 != 0) goto L_0x0069
        L_0x007a:
            if (r14 == 0) goto L_0x007f
            r14.close()     // Catch:{ all -> 0x008c }
        L_0x007f:
            return r0
        L_0x0080:
            r0 = move-exception
            if (r14 == 0) goto L_0x008b
            r14.close()     // Catch:{ all -> 0x0087 }
            goto L_0x008b
        L_0x0087:
            r14 = move-exception
            r0.addSuppressed(r14)     // Catch:{ all -> 0x008c }
        L_0x008b:
            throw r0     // Catch:{ all -> 0x008c }
        L_0x008c:
            r14 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r3]
            int r13 = r13.size()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r0[r1] = r13
            r0[r4] = r14
            java.lang.String r13 = "Luggage.WxaAttrsContentResolver"
            java.lang.String r14 = "batchQueryWithAppIds appIdList.size:%d, t=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r13, r14, r0)
            return r2
        L_0x00a3:
            java.util.List r13 = java.util.Collections.emptyList()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: wi0.C90980f0.mo125057a(java.util.List, java.lang.String[]):java.util.List");
    }

    /* renamed from: c */
    public WxaAttributes mo125058c(String str, String... strArr) {
        long currentTicks = Util.currentTicks();
        WxaAttributes e = mo125060e((String[]) null, String.format("%s=?", new Object[]{"appId"}), new String[]{str});
        Log.m105925i("Luggage.WxaAttrsContentResolver", "queryWithAppId appId:%s, cost:%dms, columns:%s", str, Long.valueOf(Util.currentTicks() - currentTicks), Arrays.toString(strArr));
        return e;
    }

    /* renamed from: d */
    public WxaAttributes mo125059d(String str, String... strArr) {
        return mo125060e((String[]) null, String.format("%s=?", new Object[]{"username"}), new String[]{str});
    }

    /* renamed from: e */
    public final WxaAttributes mo125060e(String[] strArr, String str, String[] strArr2) {
        Cursor query = MMApplicationContext.getContext().getContentResolver().query(f261055a, strArr, str, strArr2, (String) null);
        WxaAttributes wxaAttributes = null;
        if (query == null) {
            return null;
        }
        if (!query.isClosed() && query.moveToFirst()) {
            wxaAttributes = new WxaAttributes();
            wxaAttributes.convertFrom(query);
        }
        query.close();
        return wxaAttributes;
    }
}
