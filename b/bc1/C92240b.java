package bc1;

import android.net.Uri;
import cc1.C92413a;
import cc1.C92414b;
import com.tencent.p014mm.autogen.mmdata.rpt.FavCacheStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f40.C86709a0;
import h81.C32735h;
import java.util.ArrayList;
import java.util.Iterator;
import yb1.C38987b;

/* renamed from: bc1.b */
public class C92240b {
    /* renamed from: a */
    public static void m115962a(long j, long j2) {
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FAV_OFFLINE_ALL_SIZE_LONG_SYNC, Long.valueOf(m115968g() + (j2 - j)));
    }

    /* renamed from: b */
    public static void m115963b() {
        Class cls = C38987b.class;
        ArrayList arrayList = (ArrayList) ((C38987b) C86312j.m106911c(cls)).wx0().mo126417jo();
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((C38987b) C86312j.m106911c(cls)).wx0().delete(((C92413a) it.next()).systemRowid)) {
                i++;
            }
        }
        C86013q1.m106445f("wcf://favoffline");
        Log.m105925i("MicroMsg.offline.FavOfflineHelp", "cleanAllCache maxSize:%s allSize:%s allNum:%s deleteResult:%s", Long.valueOf(m115966e()), Long.valueOf(m115968g()), Integer.valueOf(arrayList.size()), Integer.valueOf(i));
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FAV_OFFLINE_ALL_SIZE_LONG_SYNC, 0L);
    }

    /* renamed from: c */
    public static boolean m115964c(String str, String str2, String str3) {
        boolean z;
        int i;
        long f = m115967f(str2);
        boolean h = C86013q1.m106447h(str2);
        if (h) {
            m115962a(f, 0);
        }
        if (!Util.isNullOrNil(str3)) {
            long f2 = m115967f(str3);
            z = C86013q1.m106446g(str3, true);
            if (z) {
                m115962a(f2, 0);
            }
        } else {
            z = true;
        }
        if (!h || !z) {
            Log.m105925i("MicroMsg.offline.FavOfflineHelp", "deleteFavOffline deleteHtml:%s deleteImg:%s", Boolean.valueOf(h), Boolean.valueOf(z));
            return false;
        }
        C92414b wx02 = ((C38987b) C86312j.m106911c(C38987b.class)).wx0();
        wx02.getClass();
        if (Util.isNullOrNil(str)) {
            Log.m105924i("MicroMsg.offline.FavOfflineStorage", "url is null!");
            return true;
        }
        try {
            i = wx02.f264465d.delete("FavOffline", "url=?", new String[]{str});
        } catch (Exception e) {
            Log.m105921e("MicroMsg.offline.FavOfflineStorage", "deleteByUrl url:%s Exception:%s %s", str, e.getClass().getSimpleName(), e.getMessage());
            i = 0;
        }
        return i > 0;
    }

    /* renamed from: d */
    public static long m115965d() {
        long He = ((C32735h) C86312j.m106911c(C32735h.class)).mo58777He(C32735h.C32737c.clicfg_fav_web_cache_max_size, 20971520);
        Log.m105919d("MicroMsg.offline.FavOfflineHelp", "getFavOfflineMaxSize() maxSize:%s", Long.valueOf(He));
        return He;
    }

    /* renamed from: e */
    public static long m115966e() {
        return (long) ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_fav_web_cache_max_total_size, 1073741824);
    }

    /* renamed from: f */
    public static long m115967f(String str) {
        long j = 0;
        if (Util.isNullOrNil(str)) {
            return 0;
        }
        C86009m1 m1Var = new C86009m1(str);
        if (m1Var.mo119978p()) {
            return m1Var.mo119980r();
        }
        Iterable<C86001b0> t = C86013q1.m106459t(str, true);
        if (t == null) {
            return 0;
        }
        for (C86001b0 next : t) {
            if (next != null) {
                j += next.f250473c;
            }
        }
        return j;
    }

    /* renamed from: g */
    public static long m115968g() {
        return C86709a0.m107535s().mo121142i().mo119673G(C72994y1.C72995a.USERINFO_FAV_OFFLINE_ALL_SIZE_LONG_SYNC, 0);
    }

    /* renamed from: h */
    public static boolean m115969h() {
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_fav_web_cache_open, 0);
        Log.m105919d("MicroMsg.offline.FavOfflineHelp", "isOpenFavOffline() open:%s", Integer.valueOf(Qe));
        return Qe == 1;
    }

    /* renamed from: i */
    public static boolean m115970i(C92413a aVar, int i, int i2) {
        C86001b0 q;
        if (aVar == null) {
            Log.m105924i("MicroMsg.offline.FavOfflineHelp", "report: favOffline is null!");
            return false;
        } else if (aVar.field_isReport == 1) {
            return false;
        } else {
            FavCacheStruct favCacheStruct = new FavCacheStruct();
            favCacheStruct.f265518d = aVar.systemRowid;
            if (i == 0) {
                Uri n = C116299g2.m163858n(aVar.field_path);
                String path = n.getPath();
                if (path != null) {
                    String k = C116299g2.m163855k(path, false, false);
                    if (!n.getPath().equals(k)) {
                        n = n.buildUpon().path(k).build();
                    }
                }
                C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                long j = 0;
                if (l.mo177810a() && (q = l.f348991a.mo119945q(l.f348992b)) != null) {
                    j = q.f250473c;
                }
                if (!Util.isNullOrNil(aVar.field_imgDirPath)) {
                    j += m115967f(aVar.field_imgDirPath);
                }
                favCacheStruct.f265519e = j;
            } else {
                favCacheStruct.f265519e = (long) i;
            }
            favCacheStruct.f265520f = (long) ((ArrayList) ((C38987b) C86312j.m106911c(C38987b.class)).wx0().mo126417jo()).size();
            favCacheStruct.f265521g = m115968g();
            favCacheStruct.f265522h = (long) i2;
            favCacheStruct.mo86054n();
            return true;
        }
    }

    /* renamed from: j */
    public static boolean m115971j(String str, String str2, int i) {
        return m115972k(str, str2, "", i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0064, code lost:
        r7 = r7.f348991a.mo119945q(r7.f348992b);
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m115972k(java.lang.String r27, java.lang.String r28, java.lang.String r29, int r30) {
        /*
            r0 = r27
            r1 = r30
            java.lang.Class<yb1.b> r2 = yb1.C38987b.class
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r27)
            r4 = 0
            java.lang.String r5 = "MicroMsg.offline.FavOfflineHelp"
            if (r3 == 0) goto L_0x0016
            java.lang.String r0 = "updateFavOffline: url is null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            return r4
        L_0x0016:
            di3.d r3 = di3.C86312j.m106911c(r2)
            yb1.b r3 = (yb1.C38987b) r3
            cc1.b r3 = r3.wx0()
            cc1.a r3 = r3.mo126415Lo(r0)
            r6 = 1
            if (r3 != 0) goto L_0x0032
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r1[r4] = r0
            java.lang.String r0 = "updateFavOffline: favOffline(%s) is null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r0, r1)
            return r4
        L_0x0032:
            android.net.Uri r7 = com.tencent.p014mm.vfs.C116299g2.m163858n(r28)
            r8 = 0
            java.lang.String r9 = r7.getPath()
            if (r9 == 0) goto L_0x0057
            java.lang.String r9 = com.tencent.p014mm.vfs.C116299g2.m163855k(r9, r4, r4)
            java.lang.String r10 = r7.getPath()
            boolean r10 = r10.equals(r9)
            if (r10 != 0) goto L_0x0057
            android.net.Uri$Builder r7 = r7.buildUpon()
            android.net.Uri$Builder r7 = r7.path(r9)
            android.net.Uri r7 = r7.build()
        L_0x0057:
            com.tencent.mm.vfs.f0 r9 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r7 = r9.mo177799l(r7, r8)
            boolean r8 = r7.mo177810a()
            if (r8 != 0) goto L_0x0064
            goto L_0x006e
        L_0x0064:
            com.tencent.mm.vfs.FileSystem$c r8 = r7.f348991a
            java.lang.String r7 = r7.f348992b
            com.tencent.mm.vfs.b0 r7 = r8.mo119945q(r7)
            if (r7 != 0) goto L_0x0071
        L_0x006e:
            r7 = 0
            goto L_0x0073
        L_0x0071:
            long r7 = r7.f250473c
        L_0x0073:
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r29)
            if (r11 != 0) goto L_0x007e
            long r11 = m115967f(r29)
            long r7 = r7 + r11
        L_0x007e:
            long r11 = m115965d()
            r13 = 2
            r14 = 3
            int r15 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r15 <= 0) goto L_0x00ad
            java.lang.Object[] r2 = new java.lang.Object[r14]
            r2[r4] = r0
            java.lang.Long r9 = java.lang.Long.valueOf(r7)
            r2[r6] = r9
            long r9 = m115965d()
            java.lang.Long r6 = java.lang.Long.valueOf(r9)
            r2[r13] = r6
            java.lang.String r6 = "url(%s) bytelength(%s) exceed %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r2)
            if (r1 != 0) goto L_0x00a8
            int r1 = (int) r7
            m115970i(r3, r1, r4)
        L_0x00a8:
            boolean r0 = m115964c(r27, r28, r29)
            return r0
        L_0x00ad:
            int r11 = r3.field_status
            long r14 = r3.field_size
            m115962a(r14, r7)
            r14 = r28
            r3.field_path = r14
            r3.field_size = r7
            long r14 = eb0.C31543z5.m39451a()
            r3.field_updateTime = r14
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r29)
            if (r14 != 0) goto L_0x00d2
            java.lang.String r14 = r3.field_imgDirPath
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r14 == 0) goto L_0x00d2
            r14 = r29
            r3.field_imgDirPath = r14
        L_0x00d2:
            r3.field_status = r1
            di3.d r14 = di3.C86312j.m106911c(r2)
            yb1.b r14 = (yb1.C38987b) r14
            cc1.b r14 = r14.wx0()
            boolean r14 = r14.mo126416Yt(r3)
            if (r11 == r6) goto L_0x00fb
            if (r1 != r13) goto L_0x00fb
            boolean r11 = m115970i(r3, r4, r6)
            if (r11 == 0) goto L_0x00fb
            r3.field_isReport = r6
            di3.d r11 = di3.C86312j.m106911c(r2)
            yb1.b r11 = (yb1.C38987b) r11
            cc1.b r11 = r11.wx0()
            r11.mo126416Yt(r3)
        L_0x00fb:
            long r15 = m115968g()
            long r17 = m115966e()
            int r11 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r11 <= 0) goto L_0x01f7
            di3.d r11 = di3.C86312j.m106911c(r2)
            yb1.b r11 = (yb1.C38987b) r11
            cc1.b r11 = r11.wx0()
            java.util.List r11 = r11.mo126417jo()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            java.util.Iterator r18 = r11.iterator()
            r19 = 0
        L_0x0122:
            boolean r21 = r18.hasNext()
            if (r21 == 0) goto L_0x014a
            java.lang.Object r21 = r18.next()
            r3 = r21
            cc1.a r3 = (cc1.C92413a) r3
            long r21 = m115966e()
            r23 = 2
            long r21 = r21 / r23
            int r23 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
            if (r23 < 0) goto L_0x013d
            goto L_0x014a
        L_0x013d:
            r29 = r14
            long r13 = r3.field_size
            long r19 = r19 + r13
            r12.add(r3)
            r14 = r29
            r13 = 2
            goto L_0x0122
        L_0x014a:
            r29 = r14
            java.util.Iterator r3 = r12.iterator()
            r13 = 0
        L_0x0151:
            boolean r14 = r3.hasNext()
            if (r14 == 0) goto L_0x01b6
            java.lang.Object r14 = r3.next()
            cc1.a r14 = (cc1.C92413a) r14
            java.lang.String r4 = r14.field_path
            boolean r4 = com.tencent.p014mm.vfs.C86013q1.m106447h(r4)
            java.lang.String r9 = r14.field_path
            long r9 = m115967f(r9)
            java.lang.String r1 = r14.field_imgDirPath
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106446g(r1, r6)
            java.lang.String r6 = r14.field_imgDirPath
            r25 = r7
            long r6 = m115967f(r6)
            if (r4 == 0) goto L_0x019a
            if (r1 == 0) goto L_0x019a
            long r9 = r9 + r6
            r6 = 0
            m115962a(r9, r6)
            di3.d r1 = di3.C86312j.m106911c(r2)
            yb1.b r1 = (yb1.C38987b) r1
            cc1.b r1 = r1.wx0()
            long r6 = r14.systemRowid
            boolean r1 = r1.delete(r6)
            if (r1 == 0) goto L_0x0195
            int r13 = r13 + 1
        L_0x0195:
            r4 = r2
            r8 = r3
            r2 = 0
            goto L_0x01ad
        L_0x019a:
            if (r4 == 0) goto L_0x01a4
            r4 = r2
            r8 = r3
            r2 = 0
            m115962a(r9, r2)
            goto L_0x01a8
        L_0x01a4:
            r4 = r2
            r8 = r3
            r2 = 0
        L_0x01a8:
            if (r1 == 0) goto L_0x01ad
            m115962a(r6, r2)
        L_0x01ad:
            r1 = r30
            r2 = r4
            r3 = r8
            r7 = r25
            r4 = 0
            r6 = 1
            goto L_0x0151
        L_0x01b6:
            r25 = r7
            r1 = 6
            java.lang.Object[] r1 = new java.lang.Object[r1]
            long r2 = m115966e()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            java.lang.Long r2 = java.lang.Long.valueOf(r15)
            r3 = 1
            r1[r3] = r2
            int r2 = r11.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 2
            r1[r3] = r2
            java.lang.Long r2 = java.lang.Long.valueOf(r19)
            r3 = 3
            r1[r3] = r2
            int r3 = r12.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 4
            r1[r4] = r3
            r3 = 5
            java.lang.Integer r6 = java.lang.Integer.valueOf(r13)
            r1[r3] = r6
            java.lang.String r3 = "cleanHalfCache maxSize:%s allSize:%s allNum:%s deleteSize:%s deleteNum:%s deleteResult:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r3, r1)
            goto L_0x01fc
        L_0x01f7:
            r25 = r7
            r29 = r14
            r4 = 4
        L_0x01fc:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            long r3 = m115968g()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r4 = 0
            r1[r4] = r3
            r3 = 1
            r1[r3] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r30)
            r3 = 2
            r1[r3] = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r25)
            r2 = 3
            r1[r2] = r0
            java.lang.String r0 = "allFavOffline size:%s, url(%s) status(%s) size:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r0, r1)
            return r29
        */
        throw new UnsupportedOperationException("Method not decompiled: bc1.C92240b.m115972k(java.lang.String, java.lang.String, java.lang.String, int):boolean");
    }

    /* renamed from: l */
    public static int m115973l(String str) {
        Class cls = C38987b.class;
        if (Util.isNullOrNil(str)) {
            Log.m105924i("MicroMsg.offline.FavOfflineHelp", "updateOfflineTaskFailNum: url is null!");
            return -1;
        }
        C92413a Lo = ((C38987b) C86312j.m106911c(cls)).wx0().mo126415Lo(str);
        if (Lo == null) {
            Log.m105925i("MicroMsg.offline.FavOfflineHelp", "updateOfflineTaskFailNum: favOffline(%s) is null!", str);
            return -1;
        }
        Lo.field_failNum++;
        Log.m105925i("MicroMsg.offline.FavOfflineHelp", "updateOfflineTaskFailNum result:%s", Boolean.valueOf(((C38987b) C86312j.m106911c(cls)).wx0().mo126416Yt(Lo)));
        if (Lo.field_failNum >= 5 && m115970i(Lo, 0, 0)) {
            Lo.field_isReport = 1;
            ((C38987b) C86312j.m106911c(cls)).wx0().mo126416Yt(Lo);
        }
        return Lo.field_failNum;
    }
}
