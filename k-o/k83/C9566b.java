package k83;

import android.database.Cursor;
import android.net.Uri;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.tmassistantsdk.downloadservice.DownloadHelper;
import f40.C86709a0;
import j83.C9286a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: k83.b */
public class C9566b {

    /* renamed from: c */
    public static C9566b f29794c;

    /* renamed from: a */
    public C9568c f29795a;

    /* renamed from: b */
    public Map<String, Long> f29796b = new HashMap();

    /* renamed from: k83.b$a */
    public class C9567a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f29797d;

        /* renamed from: e */
        public final /* synthetic */ String f29798e;

        /* renamed from: f */
        public final /* synthetic */ long f29799f;

        /* renamed from: g */
        public final /* synthetic */ String f29800g;

        /* renamed from: h */
        public final /* synthetic */ String f29801h;

        /* renamed from: i */
        public final /* synthetic */ String f29802i;

        /* renamed from: j */
        public final /* synthetic */ String f29803j;

        /* renamed from: n */
        public final /* synthetic */ String f29804n;

        public C9567a(long j, String str, long j2, String str2, String str3, String str4, String str5, String str6) {
            this.f29797d = j;
            this.f29798e = str;
            this.f29799f = j2;
            this.f29800g = str2;
            this.f29801h = str3;
            this.f29802i = str4;
            this.f29803j = str5;
            this.f29804n = str6;
        }

        public void run() {
            if (this.f29797d > 0) {
                ((HashMap) C9566b.this.f29796b).put(this.f29798e, Long.valueOf(this.f29799f - C9566b.this.mo10245d().mo10254qq(this.f29798e, this.f29797d)));
            } else {
                ((HashMap) C9566b.this.f29796b).put(this.f29798e, Long.valueOf(this.f29799f));
            }
            if (Util.isNullOrNil(this.f29800g)) {
                C9568c d = C9566b.this.mo10245d();
                String str = this.f29798e;
                String str2 = this.f29801h;
                String nullAs = Util.nullAs(this.f29802i, "1");
                C9566b bVar = C9566b.this;
                String str3 = this.f29803j;
                bVar.getClass();
                long j = Util.getLong(str3, 604800);
                d.mo10250SE(str, str2, "", nullAs, j > 2592000 ? 2592000 : j, this.f29804n);
            } else {
                C9568c d2 = C9566b.this.mo10245d();
                String str4 = this.f29798e;
                String str5 = this.f29801h;
                String str6 = this.f29800g;
                String nullAs2 = Util.nullAs(this.f29802i, "1");
                C9566b bVar2 = C9566b.this;
                String str7 = this.f29803j;
                bVar2.getClass();
                long j2 = Util.getLong(str7, 604800);
                d2.mo10250SE(str4, str5, str6, nullAs2, j2 > 2592000 ? 2592000 : j2, "");
            }
            C9568c d3 = C9566b.this.mo10245d();
            String str8 = this.f29798e;
            d3.mo10253kD(str8, ((HashMap) C9566b.this.f29796b).get(str8) == null ? 0 : ((Long) ((HashMap) C9566b.this.f29796b).get(this.f29798e)).longValue());
            C9568c d4 = C9566b.this.mo10245d();
            d4.getClass();
            Cursor rawQuery = d4.rawQuery(String.format("select * from %s where %s<%s", new Object[]{"WebViewData", "expireTime", Long.valueOf(System.currentTimeMillis() / 1000)}), new String[0]);
            if (rawQuery != null) {
                if (rawQuery.moveToFirst()) {
                    do {
                        C9565a aVar = new C9565a();
                        aVar.convertFrom(rawQuery);
                        if (!Util.isNullOrNil(aVar.field_localFile)) {
                            Uri n = C116299g2.m163858n(C9568c.m9252bD() + aVar.field_localFile);
                            String path = n.getPath();
                            if (path != null) {
                                String k = C116299g2.m163855k(path, false, false);
                                if (!n.getPath().equals(k)) {
                                    n = n.buildUpon().path(k).build();
                                }
                            }
                            C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                            Log.m105925i("MicroMsg.WebViewDataStorage", "clearExpireTimeData(), delete data file:%s, ret:%b", aVar.field_localFile, Boolean.valueOf(l.mo177810a() && l.f348991a.mo119933c(l.f348992b)));
                        }
                        Log.m105925i("MicroMsg.WebViewDataStorage", "clearExpireTimeData(), delete data appIdKey:%s, ret:%b", aVar.field_appIdKey, Boolean.valueOf(d4.delete(aVar, new String[0])));
                        String str9 = aVar.field_appId;
                        long Ow = d4.mo10249Ow(str9) - aVar.field_size;
                        Log.m105925i("MicroMsg.WebViewDataStorage", "clearExpireTimeData(), currSize:%d", Long.valueOf(Ow));
                        if (Ow < 0) {
                            Ow = 0;
                        }
                        d4.mo10253kD(str9, Ow);
                    } while (rawQuery.moveToNext());
                }
                rawQuery.close();
            }
        }
    }

    /* renamed from: c */
    public static C9566b m9247c() {
        if (f29794c == null) {
            f29794c = new C9566b();
        }
        return f29794c;
    }

    /* renamed from: a */
    public C9565a mo10243a(String str, String str2) {
        C9568c d = mo10245d();
        d.getClass();
        String format = String.format("select * from %s where %s=\"%s\"", new Object[]{"WebViewData", "appIdKey", d.mo10251Yt(str, str2)});
        Log.m105918d("MicroMsg.WebViewDataStorage", "getData: " + format);
        Cursor rawQuery = d.rawQuery(format, new String[0]);
        C9565a aVar = new C9565a();
        if (rawQuery != null) {
            if (rawQuery.moveToFirst()) {
                aVar.convertFrom(rawQuery);
            }
            rawQuery.close();
        }
        return aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0060 A[SYNTHETIC, Splitter:B:17:0x0060] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo10244b(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "MicroMsg.WebViewDataCenter"
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = k83.C9568c.m9252bD()
            r1.append(r5)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            com.tencent.mm.vfs.m1 r1 = new com.tencent.mm.vfs.m1     // Catch:{ Exception -> 0x0044 }
            r1.<init>((java.lang.String) r8)     // Catch:{ Exception -> 0x0044 }
            boolean r8 = r1.mo119967g()     // Catch:{ Exception -> 0x0044 }
            if (r8 != 0) goto L_0x002d
            return r2
        L_0x002d:
            java.io.InputStream r8 = com.tencent.p014mm.vfs.C86013q1.m106422D(r1)     // Catch:{ Exception -> 0x0044 }
            long r5 = r1.mo119980r()     // Catch:{ Exception -> 0x0042 }
            int r1 = (int) r5     // Catch:{ Exception -> 0x0042 }
            byte[] r1 = new byte[r1]     // Catch:{ Exception -> 0x0042 }
            r8.read(r1)     // Catch:{ Exception -> 0x0042 }
            java.lang.String r5 = new java.lang.String     // Catch:{ Exception -> 0x0042 }
            r5.<init>(r1)     // Catch:{ Exception -> 0x0042 }
            r2 = r5
            goto L_0x005e
        L_0x0042:
            r1 = move-exception
            goto L_0x0046
        L_0x0044:
            r1 = move-exception
            r8 = r2
        L_0x0046:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "read PageCache err: "
            r5.append(r6)
            java.lang.String r1 = r1.getMessage()
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
        L_0x005e:
            if (r8 == 0) goto L_0x0063
            r8.close()     // Catch:{ IOException -> 0x0063 }
        L_0x0063:
            r8 = 1
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r1 = 0
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r3
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r8[r1] = r3
            java.lang.String r1 = "PageCache getPageCache time:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: k83.C9566b.mo10244b(java.lang.String):java.lang.String");
    }

    /* renamed from: d */
    public C9568c mo10245d() {
        if (this.f29795a == null) {
            C86709a0.m107528h();
            this.f29795a = new C9568c(C86709a0.m107535s().f251811i);
        }
        return this.f29795a;
    }

    /* renamed from: e */
    public final boolean mo10246e(String str, String str2, String str3, String str4, String str5, boolean z, long j, String str6) {
        long j2;
        String str7 = str;
        C9568c d = mo10245d();
        d.getClass();
        Cursor rawQuery = d.rawQuery(String.format("select %s from %s where %s=\"%s\"", new Object[]{"size", "WebViewData", "appIdKey", d.mo10251Yt(str7, str2)}), new String[0]);
        if (rawQuery == null) {
            j2 = 0;
        } else {
            j2 = rawQuery.moveToFirst() ? rawQuery.getLong(0) : 0;
            rawQuery.close();
        }
        long j3 = j - j2;
        long longValue = (((HashMap) this.f29796b).containsKey(str7) ? ((Long) ((HashMap) this.f29796b).get(str7)).longValue() : mo10245d().mo10249Ow(str7)) + j3;
        long j4 = longValue - (str7.equals("wx62d9035fd4fd2059") ? DownloadHelper.SAVE_LENGTH : 10485760);
        Log.m105925i("MicroMsg.WebViewDataCenter", "prevSize = %d, valueSize = %d, diffSize = %d, newAppSize = %d, expireSize = %d", Long.valueOf(j2), Long.valueOf(j), Long.valueOf(j3), Long.valueOf(longValue), Long.valueOf(j4));
        if (j4 > 0 && !z) {
            return false;
        }
        C9286a.m8929a(new C9567a(j4, str, longValue, str3, str2, str4, str5, str6));
        return true;
    }
}
