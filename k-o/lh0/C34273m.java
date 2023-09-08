package lh0;

import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import java.util.Date;
import jh0.C33573a;
import sf0.C90189z;

/* renamed from: lh0.m */
public class C34273m extends C34256a<C34272l> {

    /* renamed from: e */
    public static final String[] f92385e = {MAutoStorage.getCreateSQLs(C34272l.f92384x, "WechatAppHistory")};

    /* renamed from: f */
    public static final String[] f92386f = new String[0];

    public C34273m(C90189z.C90190a aVar) {
        super(aVar, C34272l.f92384x, "WechatAppHistory", f92386f);
        Log.m105924i("MicroMsg.WechatDurationHistoryStorage", "WechatDurationHistoryStorage init finish");
    }

    /* renamed from: Lo */
    public int mo59517Lo() {
        return 7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0036, code lost:
        r8.f92355d.endTransaction(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003b, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0035 A[ExcHandler: all (r9v4 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r3 
      PHI: (r3v4 long) = (r3v1 long), (r3v5 long) binds: [B:5:0x0010, B:8:0x0023] A[DONT_GENERATE, DONT_INLINE], Splitter:B:5:0x0010] */
    /* renamed from: Ow */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo59532Ow(java.util.List<lh0.C34272l> r9) {
        /*
            r8 = this;
            long r0 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            r2 = 0
            if (r9 == 0) goto L_0x005e
            int r3 = r9.size()
            if (r3 > 0) goto L_0x000e
            goto L_0x005e
        L_0x000e:
            r3 = 0
            sf0.z$a r5 = r8.f92355d     // Catch:{ Exception -> 0x003c, all -> 0x0035 }
            java.lang.Thread r6 = java.lang.Thread.currentThread()     // Catch:{ Exception -> 0x003c, all -> 0x0035 }
            long r6 = r6.getId()     // Catch:{ Exception -> 0x003c, all -> 0x0035 }
            long r3 = r5.beginTransaction(r6)     // Catch:{ Exception -> 0x003c, all -> 0x0035 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ Exception -> 0x003c, all -> 0x0035 }
            r5 = 0
        L_0x0023:
            boolean r6 = r9.hasNext()     // Catch:{ Exception -> 0x003d, all -> 0x0035 }
            if (r6 == 0) goto L_0x003d
            java.lang.Object r6 = r9.next()     // Catch:{ Exception -> 0x003d, all -> 0x0035 }
            lh0.l r6 = (lh0.C34272l) r6     // Catch:{ Exception -> 0x003d, all -> 0x0035 }
            super.insertNotify(r6, r2)     // Catch:{ Exception -> 0x003d, all -> 0x0035 }
            int r5 = r5 + 1
            goto L_0x0023
        L_0x0035:
            r9 = move-exception
            sf0.z$a r0 = r8.f92355d
            r0.endTransaction(r3)
            throw r9
        L_0x003c:
            r5 = 0
        L_0x003d:
            sf0.z$a r9 = r8.f92355d
            r9.endTransaction(r3)
            r9 = 2
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r9[r2] = r3
            long r0 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r1 = 1
            r9[r1] = r0
            java.lang.String r0 = "MicroMsg.WechatDurationHistoryStorage"
            java.lang.String r1 = "WechatDurationHistoryStorage insert [%d], cost[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r9)
            return r5
        L_0x005e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: lh0.C34273m.mo59532Ow(java.util.List):int");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.String[], android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r0v2, types: [android.database.Cursor] */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        if (r0 == 0) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r0 != 0) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        r0.close();
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: Yt */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo59533Yt(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            r2 = 0
            sf0.z$a r4 = r8.f92355d     // Catch:{ Exception -> 0x001e }
            android.database.Cursor r0 = r4.rawQuery(r9, r0, r1)     // Catch:{ Exception -> 0x001e }
            if (r0 == 0) goto L_0x0016
            boolean r4 = r0.moveToFirst()     // Catch:{ Exception -> 0x001e }
            if (r4 == 0) goto L_0x0016
            long r2 = r0.getLong(r1)     // Catch:{ Exception -> 0x001e }
        L_0x0016:
            if (r0 == 0) goto L_0x0035
        L_0x0018:
            r0.close()
            goto L_0x0035
        L_0x001c:
            r9 = move-exception
            goto L_0x0036
        L_0x001e:
            r4 = move-exception
            java.lang.String r5 = "MicroMsg.WechatDurationHistoryStorage"
            java.lang.String r6 = "do sql error[%s] sql[%s]"
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x001c }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x001c }
            r7[r1] = r4     // Catch:{ all -> 0x001c }
            r1 = 1
            r7[r1] = r9     // Catch:{ all -> 0x001c }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r6, r7)     // Catch:{ all -> 0x001c }
            if (r0 == 0) goto L_0x0035
            goto L_0x0018
        L_0x0035:
            return r2
        L_0x0036:
            if (r0 == 0) goto L_0x003b
            r0.close()
        L_0x003b:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: lh0.C34273m.mo59533Yt(java.lang.String):long");
    }

    /* renamed from: bD */
    public long mo59534bD(int i) {
        long nowMilliSecond = Util.nowMilliSecond();
        return mo59533Yt("SELECT SUM( appIn ) FROM WechatAppHistory WHERE  ( appTbe >= " + (nowMilliSecond - ((long) ((i * 60) * 1000))) + " AND " + "appTbe" + " <= " + nowMilliSecond + " ) ");
    }

    /* renamed from: jo */
    public String mo59518jo() {
        return "appDs";
    }

    /* renamed from: kD */
    public long mo59535kD(int i, int i2) {
        PInt pInt = new PInt();
        PInt pInt2 = new PInt();
        long nowMilliSecond = Util.nowMilliSecond();
        long j = nowMilliSecond - (((long) i) * 86400000);
        long j2 = nowMilliSecond - 86400000;
        String format = C33573a.m40125a().format(new Date(nowMilliSecond));
        String format2 = C33573a.m40125a().format(new Date(j));
        String format3 = C33573a.m40125a().format(new Date(j2));
        pInt.value = Util.getInt(format2, -1);
        pInt2.value = Util.getInt(format3, -1);
        boolean z = false;
        Log.m105925i("MicroMsg.FeatureUtil", "to sql date [%d, %d] day[%d] timeMs[%s]", Integer.valueOf(pInt.value), Integer.valueOf(pInt2.value), Integer.valueOf(i), format);
        if (!(pInt.value == -1 || pInt2.value == -1)) {
            z = true;
        }
        if (!z) {
            return 0;
        }
        return mo59533Yt("SELECT SUM( appIn ) FROM WechatAppHistory WHERE  ( appDs >= " + pInt.value + " AND " + "appDs" + " <= " + pInt2.value + " )  AND " + "appHour" + " = " + i2);
    }

    /* renamed from: qq */
    public String mo59519qq() {
        return "WechatAppHistory";
    }
}
