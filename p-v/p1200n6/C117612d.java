package p1200n6;

import android.content.Context;
import android.database.ContentObserver;
import fy3.C32226l;
import gy3.C87412m;
import rx3.C13598b0;

/* renamed from: n6.d */
public final class C117612d {

    /* renamed from: a */
    public final Context f351836a;

    /* renamed from: b */
    public final C32226l<String, C13598b0> f351837b;

    /* renamed from: c */
    public ContentObserver f351838c;

    public C117612d(Context context, C32226l<? super String, C13598b0> lVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(lVar, "callback");
        this.f351836a = context;
        this.f351837b = lVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0045, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0046, code lost:
        cy3.C58003b.m67160a(r9, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        throw r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.String> mo182330a(android.net.Uri r9) {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "_data"
            java.lang.String[] r4 = new java.lang.String[]{r1}
            android.content.Context r2 = r8.f351836a
            android.content.ContentResolver r2 = r2.getContentResolver()
            r5 = 0
            r6 = 0
            r7 = 0
            r3 = r9
            android.database.Cursor r9 = r2.query(r3, r4, r5, r6, r7)
            if (r9 != 0) goto L_0x001c
            goto L_0x0042
        L_0x001c:
            r2 = 0
            int r1 = r9.getColumnIndex(r1)     // Catch:{ all -> 0x0043 }
        L_0x0021:
            boolean r3 = r9.moveToNext()     // Catch:{ all -> 0x0043 }
            if (r3 == 0) goto L_0x003d
            java.lang.String r3 = r9.getString(r1)     // Catch:{ all -> 0x0043 }
            java.lang.String r4 = "path"
            gy3.C87412m.m108593f(r3, r4)     // Catch:{ all -> 0x0043 }
            java.lang.String r4 = "screenshot"
            r5 = 1
            boolean r4 = z04.C112550d0.m153801u(r3, r4, r5)     // Catch:{ all -> 0x0043 }
            if (r4 == 0) goto L_0x0021
            r0.add(r3)     // Catch:{ all -> 0x0043 }
            goto L_0x0021
        L_0x003d:
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0043 }
            cy3.C58003b.m67160a(r9, r2)
        L_0x0042:
            return r0
        L_0x0043:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0045 }
        L_0x0045:
            r1 = move-exception
            cy3.C58003b.m67160a(r9, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p1200n6.C117612d.mo182330a(android.net.Uri):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0059, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005a, code lost:
        cy3.C58003b.m67160a(r11, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005d, code lost:
        throw r1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.String> mo182331b(android.net.Uri r11) {
        /*
            r10 = this;
            java.lang.String r0 = "screenshot"
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r2 = "_display_name"
            java.lang.String r3 = "relative_path"
            java.lang.String[] r6 = new java.lang.String[]{r2, r3}
            android.content.Context r4 = r10.f351836a
            android.content.ContentResolver r4 = r4.getContentResolver()
            r7 = 0
            r8 = 0
            r9 = 0
            r5 = r11
            android.database.Cursor r11 = r4.query(r5, r6, r7, r8, r9)
            if (r11 != 0) goto L_0x0020
            goto L_0x0056
        L_0x0020:
            r4 = 0
            int r3 = r11.getColumnIndex(r3)     // Catch:{ all -> 0x0057 }
            int r2 = r11.getColumnIndex(r2)     // Catch:{ all -> 0x0057 }
        L_0x0029:
            boolean r5 = r11.moveToNext()     // Catch:{ all -> 0x0057 }
            if (r5 == 0) goto L_0x0051
            java.lang.String r5 = r11.getString(r2)     // Catch:{ all -> 0x0057 }
            java.lang.String r6 = r11.getString(r3)     // Catch:{ all -> 0x0057 }
            java.lang.String r7 = "name"
            gy3.C87412m.m108593f(r5, r7)     // Catch:{ all -> 0x0057 }
            r7 = 1
            boolean r8 = z04.C112550d0.m153801u(r5, r0, r7)     // Catch:{ all -> 0x0057 }
            java.lang.String r9 = "relativePath"
            gy3.C87412m.m108593f(r6, r9)     // Catch:{ all -> 0x0057 }
            boolean r6 = z04.C112550d0.m153801u(r6, r0, r7)     // Catch:{ all -> 0x0057 }
            r6 = r6 | r8
            if (r6 == 0) goto L_0x0029
            r1.add(r5)     // Catch:{ all -> 0x0057 }
            goto L_0x0029
        L_0x0051:
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0057 }
            cy3.C58003b.m67160a(r11, r4)
        L_0x0056:
            return r1
        L_0x0057:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r1 = move-exception
            cy3.C58003b.m67160a(r11, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p1200n6.C117612d.mo182331b(android.net.Uri):java.util.List");
    }
}
