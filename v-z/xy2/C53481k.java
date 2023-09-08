package xy2;

import az2.C39674e;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import qy2.C77457v;
import uy2.C52657a;
import yy2.C53658a;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: xy2.k */
public final class C53481k extends C86301e implements C77457v {
    /* renamed from: G */
    public boolean mo74146G(String str, String str2) {
        if ((str == null || str.length() == 0) || str2 == null) {
            return false;
        }
        C53658a D = C39674e.f106452d.mo62238D();
        D.getClass();
        C87412m.m108594g(str, "sessionId");
        C52657a jo = D.mo74248jo(str);
        jo.field_editingMsg = str2;
        boolean update = D.update(jo.systemRowid, jo, false);
        D.doNotify(jo.field_sessionId, 7, jo);
        Log.m105924i("MicroMsg.TextStatus.TextStatusConversationStorage", "[setTopPlace] ret=" + update + " editing=" + str2 + " sessionId=" + str);
        return update;
    }

    /* renamed from: U */
    public String mo74147U(String str) {
        String str2;
        return (!(str == null || str.length() == 0) && (str2 = C39674e.f106452d.mo62238D().mo74248jo(str).field_editingMsg) != null) ? str2 : "";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0070, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0071, code lost:
        cy3.C58003b.m67160a(r2, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0074, code lost:
        throw r0;
     */
    /* renamed from: V */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo74148V(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            if (r6 == 0) goto L_0x000d
            int r2 = r6.length()
            if (r2 != 0) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            r2 = 0
            goto L_0x000e
        L_0x000d:
            r2 = 1
        L_0x000e:
            if (r2 == 0) goto L_0x0011
            return r1
        L_0x0011:
            az2.e r2 = az2.C39674e.f106452d
            yy2.a r2 = r2.mo62238D()
            r2.getClass()
            java.lang.String r3 = "sessionId"
            gy3.C87412m.m108594g(r6, r3)
            android.os.SystemClock.uptimeMillis()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "select unReadCount, sum(unReadCount) from TextStatusConversation WHERE sessionId="
            r3.append(r4)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r2 = r2.f150722d
            r4 = 0
            android.database.Cursor r2 = r2.rawQuery(r3, r4)
            boolean r3 = r2.moveToFirst()     // Catch:{ all -> 0x006e }
            if (r3 == 0) goto L_0x004a
            boolean r3 = r2.isAfterLast()     // Catch:{ all -> 0x006e }
            if (r3 != 0) goto L_0x004a
            int r1 = r2.getInt(r0)     // Catch:{ all -> 0x006e }
        L_0x004a:
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x006e }
            cy3.C58003b.m67160a(r2, r4)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "[getUnreadCount] sessionId="
            r0.append(r2)
            r0.append(r6)
            r6 = 32
            r0.append(r6)
            r0.append(r1)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "MicroMsg.TextStatus.TextStatusConversationStorage"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r6)
            return r1
        L_0x006e:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0070 }
        L_0x0070:
            r0 = move-exception
            cy3.C58003b.m67160a(r2, r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xy2.C53481k.mo74148V(java.lang.String):int");
    }
}
