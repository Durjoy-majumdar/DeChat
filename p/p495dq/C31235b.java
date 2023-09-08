package p495dq;

/* renamed from: dq.b */
public class C31235b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f83687d;

    public C31235b(C97518c cVar, String str) {
        this.f83687d = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0079, code lost:
        if (r2 != null) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008b, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009d, code lost:
        if (r8 >= 3600000) goto L_0x00a1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r10 = this;
            java.lang.Class<aq.g> r0 = p441aq.C92054g.class
            di3.d r1 = di3.C86312j.m106911c(r0)
            aq.g r1 = (p441aq.C92054g) r1
            r1.getClass()
            com.tencent.mm.storage.w2 r1 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.f r1 = r1.mo57714a()
            java.lang.String r2 = r10.f83687d
            r1.getClass()
            boolean r3 = u61.C101964h.m134232n(r2)
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x00a0
            android.content.SharedPreferences r3 = r1.f100772e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r7 = 274544(0x43070, float:3.84718E-40)
            r6.append(r7)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            r7 = 0
            long r6 = r3.getLong(r6, r7)
            long r8 = java.lang.System.currentTimeMillis()
            long r8 = r8 - r6
            r6 = 86400000(0x5265c00, double:4.2687272E-316)
            int r3 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r3 < 0) goto L_0x0047
            goto L_0x00a1
        L_0x0047:
            boolean r3 = u61.C101964h.m134232n(r2)
            if (r3 == 0) goto L_0x0095
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r6 = "desc"
            r3[r5] = r6
            java.lang.String r6 = "EmojiInfoDesc"
            r3[r4] = r6
            r6 = 2
            java.lang.String r7 = "groupId"
            r3[r6] = r7
            java.lang.String r7 = "select %s from %s where %s=?"
            java.lang.String r3 = java.lang.String.format(r7, r3)
            java.lang.String[] r7 = new java.lang.String[r4]
            r7[r5] = r2
            r2 = 0
            com.tencent.mm.sdk.storage.ISQLiteDatabase r1 = r1.f100771d     // Catch:{ Exception -> 0x007e }
            android.database.Cursor r2 = r1.rawQuery(r3, r7, r6)     // Catch:{ Exception -> 0x007e }
            if (r2 == 0) goto L_0x0078
            boolean r1 = r2.moveToFirst()     // Catch:{ Exception -> 0x007e }
            if (r1 == 0) goto L_0x0078
            r1 = 1
            goto L_0x0079
        L_0x0078:
            r1 = 0
        L_0x0079:
            if (r2 == 0) goto L_0x0096
            goto L_0x008b
        L_0x007c:
            r0 = move-exception
            goto L_0x008f
        L_0x007e:
            r1 = move-exception
            java.lang.String r3 = "MicroMsg.emoji.EmojiInfoDescStorage"
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x007c }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r1)     // Catch:{ all -> 0x007c }
            if (r2 == 0) goto L_0x0095
            r1 = 0
        L_0x008b:
            r2.close()
            goto L_0x0096
        L_0x008f:
            if (r2 == 0) goto L_0x0094
            r2.close()
        L_0x0094:
            throw r0
        L_0x0095:
            r1 = 0
        L_0x0096:
            if (r1 != 0) goto L_0x00a0
            r1 = 3600000(0x36ee80, double:1.7786363E-317)
            int r3 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r3 < 0) goto L_0x00a0
            goto L_0x00a1
        L_0x00a0:
            r4 = 0
        L_0x00a1:
            if (r4 == 0) goto L_0x00ce
            di3.d r0 = di3.C86312j.m106911c(r0)
            aq.g r0 = (p441aq.C92054g) r0
            i61.h r0 = r0.xx0()
            java.lang.String r1 = r10.f83687d
            r0.getClass()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r0 == 0) goto L_0x00c0
            java.lang.String r0 = "MicroMsg.emoji.EmojiMgrImpl"
            java.lang.String r1 = "doSceneGetEmotionDesc get emotion desc faild."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
            goto L_0x00ce
        L_0x00c0:
            j61.n r0 = new j61.n
            r0.<init>(r1)
            f40.g r1 = f40.C86709a0.m107529k()
            ob0.b0 r1 = r1.f251779b
            r1.mo123460f(r0)
        L_0x00ce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p495dq.C31235b.run():void");
    }
}
