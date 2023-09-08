package ki0;

import android.net.Uri;
import fy3.C32224a;
import gy3.C87413o;
import p736wc.C38051a;
import rx3.C13601g;
import rx3.C36568h;

/* renamed from: ki0.k */
public final class C33916k {

    /* renamed from: a */
    public static final C33916k f91610a = new C33916k();

    /* renamed from: b */
    public static final C13601g f91611b = C36568h.m40985a(C33917a.f91612d);

    /* renamed from: ki0.k$a */
    public static final class C33917a extends C87413o implements C32224a<Uri> {

        /* renamed from: d */
        public static final C33917a f91612d = new C33917a();

        public C33917a() {
            super(0);
        }

        public Object invoke() {
            return Uri.parse("content://" + C38051a.f100592a + "/PersistentWxaSyncInvalidContactCmd");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005a, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        cy3.C58003b.m67160a(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005e, code lost:
        throw r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo59364a(java.lang.String r12) {
        /*
            r11 = this;
            r0 = 0
            r1 = 1
            if (r12 == 0) goto L_0x000d
            int r2 = r12.length()
            if (r2 != 0) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            r2 = 0
            goto L_0x000e
        L_0x000d:
            r2 = 1
        L_0x000e:
            r3 = -1
            if (r2 == 0) goto L_0x0013
            return r3
        L_0x0013:
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x005f }
            android.content.ContentResolver r5 = r2.getContentResolver()     // Catch:{ Exception -> 0x005f }
            if (r5 == 0) goto L_0x007e
            rx3.g r2 = f91611b     // Catch:{ Exception -> 0x005f }
            rx3.n r2 = (rx3.C36570n) r2     // Catch:{ Exception -> 0x005f }
            java.lang.Object r2 = r2.getValue()     // Catch:{ Exception -> 0x005f }
            r6 = r2
            android.net.Uri r6 = (android.net.Uri) r6     // Catch:{ Exception -> 0x005f }
            r7 = 0
            java.lang.String r8 = "username=?"
            java.lang.String[] r9 = new java.lang.String[r1]     // Catch:{ Exception -> 0x005f }
            r9[r0] = r12     // Catch:{ Exception -> 0x005f }
            r10 = 0
            android.database.Cursor r0 = r5.query(r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x005f }
            if (r0 == 0) goto L_0x007e
            r1 = 0
            boolean r2 = r0.isClosed()     // Catch:{ all -> 0x0058 }
            if (r2 != 0) goto L_0x0052
            boolean r2 = r0.moveToFirst()     // Catch:{ all -> 0x0058 }
            if (r2 == 0) goto L_0x0052
            ki0.h r2 = new ki0.h     // Catch:{ all -> 0x0058 }
            r2.<init>()     // Catch:{ all -> 0x0058 }
            r2.convertFrom(r0)     // Catch:{ all -> 0x0058 }
            long r5 = r2.field_timestamp     // Catch:{ all -> 0x0058 }
            cy3.C58003b.m67160a(r0, r1)     // Catch:{ Exception -> 0x005f }
            return r5
        L_0x0052:
            rx3.b0 r2 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0058 }
            cy3.C58003b.m67160a(r0, r1)     // Catch:{ Exception -> 0x005f }
            goto L_0x007e
        L_0x0058:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005a }
        L_0x005a:
            r2 = move-exception
            cy3.C58003b.m67160a(r0, r1)     // Catch:{ Exception -> 0x005f }
            throw r2     // Catch:{ Exception -> 0x005f }
        L_0x005f:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "getInvalidContactTimestampForUsername("
            r1.append(r2)
            r1.append(r12)
            java.lang.String r12 = ") get exception:"
            r1.append(r12)
            r1.append(r0)
            java.lang.String r12 = r1.toString()
            java.lang.String r0 = "MicroMsg.WxaSyncCmdPersistentContentResolver"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r12)
        L_0x007e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ki0.C33916k.mo59364a(java.lang.String):long");
    }
}
