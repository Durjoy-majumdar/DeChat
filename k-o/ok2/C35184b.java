package ok2;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import zh3.C91753f;

/* renamed from: ok2.b */
public final class C35184b extends MAutoStorage<C35183a> {

    /* renamed from: e */
    public static final String[] f94339e = {MAutoStorage.getCreateSQLs(C35183a.f94338p, "RtosQuickReplyInfo")};

    /* renamed from: d */
    public final C91753f f94340d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35184b(C91753f fVar) {
        super(fVar, C35183a.f94338p, "RtosQuickReplyInfo", (String[]) null);
        C87412m.m108594g(fVar, "db");
        this.f94340d = fVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        if (r10 == null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0031, code lost:
        if (r10 == null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
        r10.close();
     */
    /* renamed from: Lo */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList<ok2.C35183a> mo59900Lo() {
        /*
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r4 = ""
            java.lang.String r8 = "orderIndex ASC"
            r10 = 0
            zh3.f r1 = r11.f94340d     // Catch:{ Exception -> 0x0039 }
            java.lang.String r2 = "RtosQuickReplyInfo"
            r3 = 0
            r6 = 0
            r7 = 0
            r9 = 2
            r5 = 0
            android.database.Cursor r10 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0039 }
            if (r10 == 0) goto L_0x0031
            boolean r1 = r10.moveToFirst()     // Catch:{ Exception -> 0x0039 }
            if (r1 == 0) goto L_0x0031
        L_0x0020:
            ok2.a r1 = new ok2.a     // Catch:{ Exception -> 0x0039 }
            r1.<init>()     // Catch:{ Exception -> 0x0039 }
            r1.convertFrom(r10)     // Catch:{ Exception -> 0x0039 }
            r0.add(r1)     // Catch:{ Exception -> 0x0039 }
            boolean r1 = r10.moveToNext()     // Catch:{ Exception -> 0x0039 }
            if (r1 != 0) goto L_0x0020
        L_0x0031:
            if (r10 == 0) goto L_0x0046
        L_0x0033:
            r10.close()
            goto L_0x0046
        L_0x0037:
            r0 = move-exception
            goto L_0x0047
        L_0x0039:
            r1 = move-exception
            java.lang.String r2 = "MicroMsg.Rtos.RtosQuickReplyInfoStorage"
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r1)     // Catch:{ all -> 0x0037 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r1)     // Catch:{ all -> 0x0037 }
            if (r10 == 0) goto L_0x0046
            goto L_0x0033
        L_0x0046:
            return r0
        L_0x0047:
            if (r10 == 0) goto L_0x004c
            r10.close()
        L_0x004c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ok2.C35184b.mo59900Lo():java.util.ArrayList");
    }

    /* renamed from: Yt */
    public final boolean mo59901Yt(C35183a aVar) {
        C87412m.m108594g(aVar, "info");
        if (Util.isNullOrNil(aVar.field_quickMsg)) {
            Log.m105924i("MicroMsg.Rtos.RtosQuickReplyInfoStorage", "insertOrUpdate fail. msg is empty.");
            return false;
        } else if (get(aVar, new String[0])) {
            Log.m105924i("MicroMsg.Rtos.RtosQuickReplyInfoStorage", "insertOrUpdate exist update");
            return super.replace(aVar, false);
        } else {
            boolean insertNotify = super.insertNotify(aVar, false);
            Log.m105924i("MicroMsg.Rtos.RtosQuickReplyInfoStorage", "insertOrUpdate ret=" + insertNotify);
            return insertNotify;
        }
    }

    /* renamed from: jo */
    public final boolean mo59902jo() {
        int delete = this.f94340d.delete("RtosQuickReplyInfo", "", (String[]) null);
        Log.m105924i("MicroMsg.Rtos.RtosQuickReplyInfoStorage", "deleteAll result=" + delete);
        return delete >= 0;
    }

    /* renamed from: qq */
    public final boolean mo59903qq(ArrayList<C35183a> arrayList) {
        StringBuilder sb = new StringBuilder();
        sb.append("insertList size = ");
        C91753f fVar = null;
        sb.append(arrayList != null ? Integer.valueOf(arrayList.size()) : null);
        Log.m105924i("MicroMsg.Rtos.RtosQuickReplyInfoStorage", sb.toString());
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        long j = -1;
        C91753f fVar2 = this.f94340d;
        if (fVar2 instanceof C91753f) {
            C87412m.m108591d(fVar2);
            j = fVar2.beginTransaction(Thread.currentThread().getId());
            fVar = fVar2;
        }
        Iterator<C35183a> it = arrayList.iterator();
        while (it.hasNext()) {
            if (this.f94340d.replace("RtosQuickReplyInfo", "orderIndex", it.next().convertTo()) < 0) {
                if (fVar != null) {
                    fVar.endTransaction(j);
                }
                return false;
            }
        }
        if (fVar == null) {
            return true;
        }
        fVar.endTransaction(j);
        return true;
    }
}
