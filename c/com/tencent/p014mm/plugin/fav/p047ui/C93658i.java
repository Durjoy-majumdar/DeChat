package com.tencent.p014mm.plugin.fav.p047ui;

import com.tencent.p014mm.autogen.mmdata.rpt.FavAddQualityStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import di3.C86312j;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import pb1.C100695a0;
import pb1.C100698b0;
import pb1.C100718j1;
import pb1.C100734q;
import pb1.C100745t;
import pb1.C100755z;
import te3.C101834rc0;
import wb1.C102421x;
import xb1.C102614d;

/* renamed from: com.tencent.mm.plugin.fav.ui.i */
public class C93658i {

    /* renamed from: com.tencent.mm.plugin.fav.ui.i$a */
    public static class C93659a implements Runnable {

        /* renamed from: d */
        public C100755z f270437d;

        /* renamed from: e */
        public final FavAddQualityStruct f270438e;

        /* renamed from: com.tencent.mm.plugin.fav.ui.i$a$a */
        public class C93660a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ boolean f270439d;

            public C93660a(boolean z) {
                this.f270439d = z;
            }

            public void run() {
                Class cls = C100718j1.class;
                if (this.f270439d) {
                    C93659a aVar = C93659a.this;
                    FavAddQualityStruct favAddQualityStruct = aVar.f270438e;
                    if (favAddQualityStruct != null) {
                        favAddQualityStruct.f265504j = 1;
                    }
                    Log.m105925i("MicroMsg.Fav.FavAddService", "has data, check cdn now, type %d", Integer.valueOf(aVar.f270437d.field_type));
                    C100755z zVar = C93659a.this.f270437d;
                    zVar.field_itemStatus = 1;
                    zVar.field_xml = C100755z.m131907w2(zVar);
                    if (!C100734q.m131842d(C93659a.this.f270437d)) {
                        ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).insert(C93659a.this.f270437d);
                    } else {
                        ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).update(C93659a.this.f270437d, new String[0]);
                    }
                    long j = C93659a.this.f270437d.field_localId;
                    HashSet<String> hashSet = C100745t.f295154a;
                    long d = C100698b0.f295038a.mo140128d(1);
                    C100698b0.f295043f.put(Long.valueOf(j), Long.valueOf(d));
                    Log.m105924i("MircoMsg.FavReport", "[registerLocalIdToSession] localId = " + j + ", session = " + d);
                    Log.m105924i("MicroMsg.FavApiUtil", "[linkFavAddReport] session = " + d + ", localId = " + j);
                    ((C100718j1) C86312j.m106911c(cls)).C30().run();
                    return;
                }
                C93659a aVar2 = C93659a.this;
                FavAddQualityStruct favAddQualityStruct2 = aVar2.f270438e;
                if (favAddQualityStruct2 != null) {
                    favAddQualityStruct2.f265504j = 0;
                }
                Log.m105925i("MicroMsg.Fav.FavAddService", "no data, send item now, type %d", Integer.valueOf(aVar2.f270437d.field_type));
                C100755z zVar2 = C93659a.this.f270437d;
                zVar2.field_itemStatus = 9;
                zVar2.field_xml = C100755z.m131907w2(zVar2);
                if (!C100734q.m131842d(C93659a.this.f270437d)) {
                    ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).insert(C93659a.this.f270437d);
                } else {
                    ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).update(C93659a.this.f270437d, new String[0]);
                }
                ((C102421x) ((C100718j1) C86312j.m106911c(cls)).th0()).mo142000c();
            }
        }

        public C93659a(C100755z zVar, FavAddQualityStruct favAddQualityStruct) {
            this.f270437d = zVar;
            this.f270438e = favAddQualityStruct;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:70:0x017c, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x017d, code lost:
            r12 = r13;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x017f, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x0180, code lost:
            r17 = r12;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x017c A[ExcHandler: all (th java.lang.Throwable), Splitter:B:63:0x015f] */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x0196  */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x019f  */
        /* JADX WARNING: Removed duplicated region for block: B:91:0x01a9  */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x01e4  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo128583a(java.util.List<te3.C101834rc0> r19) {
            /*
                r18 = this;
                r1 = r18
                r2 = 0
                r0 = 0
                r3 = 0
            L_0x0005:
                int r4 = r19.size()
                if (r3 >= r4) goto L_0x0210
                r4 = r19
                java.lang.Object r5 = r4.get(r3)
                te3.rc0 r5 = (te3.C101834rc0) r5
                java.lang.String r6 = r5.f299280T
                boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
                if (r6 == 0) goto L_0x002c
                java.lang.String r6 = r5.toString()
                pb1.z r7 = r1.f270437d
                int r7 = r7.field_type
                java.util.HashMap<java.lang.Long, java.util.ArrayList<java.lang.String>> r8 = pb1.C100734q.f295126a
                java.lang.String r6 = pb1.C100745t.m131892d(r6, r7)
                r5.mo141257m(r6)
            L_0x002c:
                int r6 = r5.f299258I
                r7 = 1
                if (r6 == r7) goto L_0x003b
                boolean r8 = r5.f299283U0
                if (r8 == 0) goto L_0x0039
                boolean r8 = r5.f299287W0
                if (r8 != 0) goto L_0x003b
            L_0x0039:
                r8 = 1
                goto L_0x003c
            L_0x003b:
                r8 = r0
            L_0x003c:
                r0 = 17
                if (r6 != r0) goto L_0x0057
                te3.kd0 r0 = r5.f299275Q1
                if (r0 == 0) goto L_0x020b
                boolean r0 = pb1.C100734q.m131843d0()
                if (r0 == 0) goto L_0x020b
                te3.kd0 r0 = r5.f299275Q1
                java.util.LinkedList<te3.rc0> r0 = r0.f298618f
                boolean r0 = r1.mo128583a(r0)
                if (r0 == 0) goto L_0x020b
                r0 = 1
                goto L_0x020c
            L_0x0057:
                long r9 = java.lang.System.currentTimeMillis()
                java.lang.String r6 = r5.f299284V
                boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r6)
                r11 = 3
                r12 = 0
                r13 = 256(0x100, float:3.59E-43)
                java.lang.String r15 = "MicroMsg.Fav.FavAddService"
                if (r0 == 0) goto L_0x00f2
                java.lang.String r0 = com.tencent.p014mm.vfs.C86013q1.m106456q(r6)
                java.lang.String r14 = p823sg.C90193h.m112877e(r6, r2, r13)
                r5.mo141268x(r0)
                r5.mo141270z(r14)
                android.net.Uri r0 = com.tencent.p014mm.vfs.C116299g2.m163858n(r6)
                java.lang.String r14 = r0.getPath()
                if (r14 == 0) goto L_0x009b
                java.lang.String r14 = com.tencent.p014mm.vfs.C116299g2.m163855k(r14, r2, r2)
                java.lang.String r13 = r0.getPath()
                boolean r13 = r13.equals(r14)
                if (r13 != 0) goto L_0x009b
                android.net.Uri$Builder r0 = r0.buildUpon()
                android.net.Uri$Builder r0 = r0.path(r14)
                android.net.Uri r0 = r0.build()
            L_0x009b:
                com.tencent.mm.vfs.f0 r13 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
                com.tencent.mm.vfs.f0$h r0 = r13.mo177799l(r0, r12)
                boolean r13 = r0.mo177810a()
                r16 = 0
                if (r13 != 0) goto L_0x00ac
            L_0x00a9:
                r13 = r16
                goto L_0x00bc
            L_0x00ac:
                com.tencent.mm.vfs.FileSystem$c r13 = r0.f348991a
                java.lang.String r0 = r0.f348992b
                com.tencent.mm.vfs.b0 r0 = r13.mo119945q(r0)
                if (r0 != 0) goto L_0x00b7
                goto L_0x00a9
            L_0x00b7:
                long r13 = r0.f250473c
                r16 = r13
                goto L_0x00a9
            L_0x00bc:
                r5.mo141269y(r13)
                java.lang.String r0 = pb1.C100734q.m131880w(r5)
                boolean r13 = r6.equals(r0)
                if (r13 != 0) goto L_0x00f0
                android.content.Context r13 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.net.Uri r13 = com.tencent.p014mm.sdk.platformtools.ScopedStorageUtil.Imports.getFilesExternalUri(r13, r6)
                if (r13 == 0) goto L_0x00d8
                java.lang.String r13 = r13.toString()
                goto L_0x00d9
            L_0x00d8:
                r13 = r6
            L_0x00d9:
                long r16 = com.tencent.p014mm.vfs.C86013q1.m106443d(r13, r0, r2)
                java.lang.Object[] r14 = new java.lang.Object[r11]
                java.lang.Long r16 = java.lang.Long.valueOf(r16)
                r14[r2] = r16
                r14[r7] = r13
                r13 = 2
                r14[r13] = r0
                java.lang.String r0 = "copy data file result:%s from:%s to:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r0, r14)
                goto L_0x0104
            L_0x00f0:
                r13 = 2
                goto L_0x0104
            L_0x00f2:
                r13 = 2
                java.lang.Object[] r0 = new java.lang.Object[r13]
                int r13 = r5.f299258I
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
                r0[r2] = r13
                r0[r7] = r6
                java.lang.String r13 = "copy file fail, type:%d, %s not exist!"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r13, r0)
            L_0x0104:
                java.lang.String r0 = r5.f299286W
                boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r13 == 0) goto L_0x01a3
                boolean r13 = com.tencent.p014mm.vfs.C86013q1.m106450k(r6)
                if (r13 == 0) goto L_0x01a3
                pb1.z r13 = r1.f270437d
                int r14 = r13.field_type
                r12 = 4
                if (r14 != r12) goto L_0x01a3
                te3.kd0 r12 = r13.field_favProto
                te3.rd0 r12 = r12.f298616d
                int r12 = r12.f299346d
                r13 = 13
                if (r12 != r13) goto L_0x01a3
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r12 = pb1.C100734q.m131880w(r5)
                r0.append(r12)
                java.lang.String r12 = "_tempthumb"
                r0.append(r12)
                java.lang.String r12 = r0.toString()
                android.graphics.Bitmap r0 = com.tencent.p014mm.plugin.fav.p047ui.C93693r.m118401b(r6)
                if (r0 == 0) goto L_0x0153
                java.lang.String r13 = "add fav service: create thumbpath bitmap, saveBitmapToImage "
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r13)     // Catch:{ Exception -> 0x014b }
                r13 = 60
                android.graphics.Bitmap$CompressFormat r14 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x014b }
                com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r0, r13, r14, r12, r7)     // Catch:{ Exception -> 0x014b }
                goto L_0x0153
            L_0x014b:
                r0 = move-exception
                java.lang.Object[] r13 = new java.lang.Object[r2]
                java.lang.String r14 = ""
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r0, r14, r13)
            L_0x0153:
                r5.f299286W = r12
                java.lang.String r0 = "add fav service: get video duration"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)     // Catch:{ Exception -> 0x0187, all -> 0x0184 }
                oj.c r13 = new oj.c     // Catch:{ Exception -> 0x0187, all -> 0x0184 }
                r13.<init>()     // Catch:{ Exception -> 0x0187, all -> 0x0184 }
                r13.setDataSource(r6)     // Catch:{ Exception -> 0x017f, all -> 0x017c }
                r0 = 9
                java.lang.String r0 = r13.extractMetadata(r0)     // Catch:{ Exception -> 0x017f, all -> 0x017c }
                int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r2)     // Catch:{ Exception -> 0x017f, all -> 0x017c }
                r17 = r12
                long r11 = (long) r0
                int r0 = com.tencent.p014mm.sdk.platformtools.Util.videoMsToSec(r11)     // Catch:{ Exception -> 0x017a, all -> 0x017c }
                r5.mo141266v(r0)     // Catch:{ Exception -> 0x017a, all -> 0x017c }
                r13.release()
                goto L_0x0199
            L_0x017a:
                r0 = move-exception
                goto L_0x0182
            L_0x017c:
                r0 = move-exception
                r12 = r13
                goto L_0x019d
            L_0x017f:
                r0 = move-exception
                r17 = r12
            L_0x0182:
                r12 = r13
                goto L_0x018b
            L_0x0184:
                r0 = move-exception
                r12 = 0
                goto L_0x019d
            L_0x0187:
                r0 = move-exception
                r17 = r12
                r12 = 0
            L_0x018b:
                java.lang.String r11 = "get video duration error. path %s"
                java.lang.Object[] r13 = new java.lang.Object[r7]     // Catch:{ all -> 0x019c }
                r13[r2] = r6     // Catch:{ all -> 0x019c }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r0, r11, r13)     // Catch:{ all -> 0x019c }
                if (r12 == 0) goto L_0x0199
                r12.release()
            L_0x0199:
                r0 = r17
                goto L_0x01a3
            L_0x019c:
                r0 = move-exception
            L_0x019d:
                if (r12 == 0) goto L_0x01a2
                r12.release()
            L_0x01a2:
                throw r0
            L_0x01a3:
                boolean r6 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
                if (r6 == 0) goto L_0x01e4
                java.lang.String r6 = com.tencent.p014mm.vfs.C86013q1.m106456q(r0)
                long r11 = com.tencent.p014mm.vfs.C86013q1.m106451l(r0)
                r13 = 256(0x100, float:3.59E-43)
                java.lang.String r13 = p823sg.C90193h.m112877e(r0, r2, r13)
                r5.mo141245T(r6)
                r5.mo141244S(r13)
                r5.mo141243R(r11)
                java.lang.String r5 = pb1.C100734q.m131826Q(r5)
                boolean r6 = r0.equals(r5)
                if (r6 != 0) goto L_0x01e2
                long r11 = com.tencent.p014mm.vfs.C86013q1.m106443d(r0, r5, r2)
                r6 = 3
                java.lang.Object[] r6 = new java.lang.Object[r6]
                java.lang.Long r11 = java.lang.Long.valueOf(r11)
                r6[r2] = r11
                r6[r7] = r0
                r11 = 2
                r6[r11] = r5
                java.lang.String r0 = "copy thumb file result:%s from:%s to:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r0, r6)
                goto L_0x01ee
            L_0x01e2:
                r11 = 2
                goto L_0x01ee
            L_0x01e4:
                r11 = 2
                java.lang.Object[] r5 = new java.lang.Object[r7]
                r5[r2] = r0
                java.lang.String r0 = "copy thumb fail, %s not exist!"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r0, r5)
            L_0x01ee:
                java.lang.Object[] r0 = new java.lang.Object[r11]
                pb1.z r5 = r1.f270437d
                long r5 = r5.field_localId
                java.lang.Long r5 = java.lang.Long.valueOf(r5)
                r0[r2] = r5
                long r5 = java.lang.System.currentTimeMillis()
                long r5 = r5 - r9
                java.lang.Long r5 = java.lang.Long.valueOf(r5)
                r0[r7] = r5
                java.lang.String r5 = "klem cul md5 and copy file, favLocalId:%d  time:%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r5, r0)
            L_0x020b:
                r0 = r8
            L_0x020c:
                int r3 = r3 + 1
                goto L_0x0005
            L_0x0210:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.fav.p047ui.C93658i.C93659a.mo128583a(java.util.List):boolean");
        }

        public void run() {
            LinkedList<C101834rc0> linkedList = this.f270437d.field_favProto.f298618f;
            if (linkedList.size() > 0) {
                int size = linkedList.size();
                boolean z = true;
                Log.m105925i("MicroMsg.Fav.FavAddService", "run addfavservice copyrunable info.field_type = %d", Integer.valueOf(this.f270437d.field_type));
                C100755z zVar = this.f270437d;
                if (zVar.field_type == 18 && zVar.field_sourceType == 6) {
                    boolean z2 = false;
                    for (int i = 0; i < size; i++) {
                        C101834rc0 rc02 = linkedList.get(i);
                        if (!rc02.f299283U0 || !rc02.f299287W0) {
                            z2 = true;
                        }
                    }
                    z = z2;
                } else if (!mo128583a(linkedList)) {
                    z = false;
                }
                MMHandlerThread.postToMainThread(new C93660a(z));
            }
        }
    }

    /* renamed from: a */
    public static void m118346a(C100755z zVar) {
        zVar.field_updateTime = System.currentTimeMillis();
        if (!C100734q.m131842d(zVar)) {
            zVar.field_localId = System.currentTimeMillis();
        }
        m118347b(zVar);
        C100734q.m131885y0(zVar);
    }

    /* renamed from: b */
    public static void m118347b(C100755z zVar) {
        Class cls = C100718j1.class;
        long j = zVar.field_localId;
        if (!((HashMap) C100695a0.f295014a).containsKey(Long.valueOf(j))) {
            ((HashMap) C100695a0.f295014a).put(Long.valueOf(j), Long.valueOf(System.currentTimeMillis()));
        }
        if (zVar.field_favProto.f298618f.size() > 0) {
            ThreadPool.post(new C93659a(zVar, C100698b0.f295038a.mo140126b()), "AddFavService_copy");
            return;
        }
        FavAddQualityStruct b = C100698b0.f295038a.mo140126b();
        if (b != null) {
            b.f265504j = 0;
        }
        zVar.field_itemStatus = 9;
        if (!C100734q.m131842d(zVar)) {
            ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).insert(zVar);
        } else {
            ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).update(zVar, new String[0]);
        }
        ((C102421x) ((C100718j1) C86312j.m106911c(cls)).th0()).mo142000c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0082, code lost:
        if (r8.startsWith(com.tencent.p014mm.sdk.http.HttpWrapperBase.PROTOCAL_HTTP + com.tencent.p014mm.sdk.platformtools.WeChatHosts.domainString(com.tencent.p014mm.C0966R.string.f360885fm3) + "/") != false) goto L_0x0087;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02db  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x02f0  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0309  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0328  */
    /* JADX WARNING: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0283 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x02ba  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02bf  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m118348c(com.tencent.p014mm.autogen.events.DoFavoriteEvent r23) {
        /*
            r0 = r23
            java.lang.Class<pb1.j1> r1 = pb1.C100718j1.class
            pb1.z r2 = new pb1.z
            r2.<init>()
            pb1.b0 r3 = pb1.C100698b0.f295038a
            com.tencent.mm.autogen.mmdata.rpt.FavAddQualityStruct r4 = r3.mo140126b()
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r5 = r0.f264674d
            te3.kd0 r5 = r5.f264676a
            te3.rd0 r5 = r5.f298616d
            java.lang.String r5 = r5.f299352j
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            r6 = 1
            r7 = 0
            if (r5 != 0) goto L_0x0022
            r4.f265500f = r6
            goto L_0x0024
        L_0x0022:
            r4.f265500f = r7
        L_0x0024:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r5 = r0.f264674d
            int r8 = r5.f264678c
            java.lang.String r9 = "MicroMsg.Fav.FavAddService"
            r10 = 5
            r11 = -1
            if (r10 != r8) goto L_0x0178
            te3.kd0 r5 = r5.f264676a
            te3.rd0 r5 = r5.f298616d
            java.lang.String r8 = r5.f299364y
            java.lang.String r5 = r5.f299352j
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r14 != 0) goto L_0x0178
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r14 == 0) goto L_0x0043
            goto L_0x0085
        L_0x0043:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "https://"
            r14.append(r15)
            r15 = 2131831321(0x7f112a19, float:1.9295664E38)
            java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.WeChatHosts.domainString(r15)
            r14.append(r10)
            java.lang.String r10 = "/"
            r14.append(r10)
            java.lang.String r14 = r14.toString()
            boolean r14 = r8.startsWith(r14)
            if (r14 != 0) goto L_0x0087
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r12 = "http://"
            r14.append(r12)
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.WeChatHosts.domainString(r15)
            r14.append(r12)
            r14.append(r10)
            java.lang.String r10 = r14.toString()
            boolean r10 = r8.startsWith(r10)
            if (r10 == 0) goto L_0x0085
            goto L_0x0087
        L_0x0085:
            r10 = 0
            goto L_0x0088
        L_0x0087:
            r10 = 1
        L_0x0088:
            if (r10 == 0) goto L_0x010b
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r10 = r0.f264674d
            te3.kd0 r10 = r10.f264676a
            te3.ad0 r10 = r10.f298612K
            if (r10 == 0) goto L_0x0095
            int r10 = r10.f297848d
            goto L_0x0096
        L_0x0095:
            r10 = -1
        L_0x0096:
            java.lang.Class<e00.w> r12 = e00.C31379w.class
            di3.d r12 = di3.C86312j.m106911c(r12)
            e00.w r12 = (e00.C31379w) r12
            java.lang.String r8 = r12.mo57932lF(r8, r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "use keyURL "
            r10.append(r12)
            r10.append(r8)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r10 != 0) goto L_0x0178
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r10 != 0) goto L_0x0101
            di3.d r8 = di3.C86312j.m106911c(r1)
            pb1.j1 r8 = (pb1.C100718j1) r8
            pb1.w0 r8 = r8.mo128199Jq()
            xb1.d r8 = (xb1.C102614d) r8
            pb1.z r8 = r8.mo142263Ow(r5)
            if (r8 == 0) goto L_0x00f3
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r10 = r0.f264674d
            te3.kd0 r10 = r10.f264676a
            te3.rd0 r10 = r10.f298616d
            java.lang.String r12 = r10.f299348f
            r2.field_fromUser = r12
            java.lang.String r12 = r10.f299350h
            r2.field_toUser = r12
            java.lang.String r12 = r10.f299352j
            r2.field_sourceId = r12
            long r12 = r10.f299356q
            r2.field_sourceCreateTime = r12
            int r10 = r10.f299346d
            r2.field_sourceType = r10
            long r12 = r8.field_localId
            r8 = 1
            goto L_0x00f6
        L_0x00f3:
            r8 = 0
            r12 = -1
        L_0x00f6:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r10 = r0.f264674d
            te3.kd0 r10 = r10.f264676a
            te3.rd0 r10 = r10.f298616d
            r10.mo141278n(r5)
            goto L_0x017b
        L_0x0101:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r5 = r0.f264674d
            te3.kd0 r5 = r5.f264676a
            te3.rd0 r5 = r5.f298616d
            r5.mo141278n(r8)
            goto L_0x0178
        L_0x010b:
            java.lang.String r10 = "#"
            int r10 = r8.indexOf(r10)
            if (r10 == r11) goto L_0x0117
            java.lang.String r8 = r8.substring(r7, r10)
        L_0x0117:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "use original URL "
            r10.append(r12)
            r10.append(r8)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r10 != 0) goto L_0x016f
            di3.d r10 = di3.C86312j.m106911c(r1)
            pb1.j1 r10 = (pb1.C100718j1) r10
            pb1.w0 r10 = r10.mo128199Jq()
            xb1.d r10 = (xb1.C102614d) r10
            pb1.z r8 = r10.mo142263Ow(r8)
            if (r8 == 0) goto L_0x0162
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r10 = r0.f264674d
            te3.kd0 r10 = r10.f264676a
            te3.rd0 r10 = r10.f298616d
            java.lang.String r12 = r10.f299348f
            r2.field_fromUser = r12
            java.lang.String r12 = r10.f299350h
            r2.field_toUser = r12
            java.lang.String r12 = r10.f299352j
            r2.field_sourceId = r12
            long r12 = r10.f299356q
            r2.field_sourceCreateTime = r12
            int r10 = r10.f299346d
            r2.field_sourceType = r10
            long r12 = r8.field_localId
            r8 = 1
            goto L_0x0165
        L_0x0162:
            r8 = 0
            r12 = -1
        L_0x0165:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r10 = r0.f264674d
            te3.kd0 r10 = r10.f264676a
            te3.rd0 r10 = r10.f298616d
            r10.mo141278n(r5)
            goto L_0x017b
        L_0x016f:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r5 = r0.f264674d
            te3.kd0 r5 = r5.f264676a
            te3.rd0 r5 = r5.f298616d
            r5.mo141278n(r8)
        L_0x0178:
            r8 = 0
            r12 = -1
        L_0x017b:
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r5 = r0.f264674d
            te3.kd0 r10 = r5.f264676a
            r2.field_favProto = r10
            java.lang.String r14 = r5.f264683h
            r2.field_sessionId = r14
            int r5 = r5.f264688m
            te3.rd0 r10 = r10.f298616d
            java.lang.String r14 = ""
            if (r10 == 0) goto L_0x025d
            java.lang.String r11 = r10.f299352j
            r2.field_sourceId = r11
            if (r11 == 0) goto L_0x01fc
            boolean r11 = r11.equals(r14)
            if (r11 == 0) goto L_0x019a
            goto L_0x01fc
        L_0x019a:
            di3.d r11 = di3.C86312j.m106911c(r1)
            pb1.j1 r11 = (pb1.C100718j1) r11
            pb1.w0 r11 = r11.mo128199Jq()
            java.lang.String r15 = r2.field_sourceId
            xb1.d r11 = (xb1.C102614d) r11
            pb1.z r11 = r11.mo142263Ow(r15)
            if (r11 == 0) goto L_0x01f4
            int r15 = r11.field_id
            if (r15 <= 0) goto L_0x01f4
            if (r15 > 0) goto L_0x01c7
            r16 = r14
            java.lang.Object[] r14 = new java.lang.Object[r6]
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r14[r7] = r15
            java.lang.String r15 = "modUpdateTime favId illegal:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r9, r15, r14)
            r21 = r12
            goto L_0x01f8
        L_0x01c7:
            r16 = r14
            java.util.LinkedList r14 = new java.util.LinkedList
            r14.<init>()
            te3.ry2 r7 = new te3.ry2
            r7.<init>()
            r7.f299366d = r6
            long r17 = java.lang.System.currentTimeMillis()
            r19 = 1000(0x3e8, double:4.94E-321)
            r21 = r12
            long r12 = r17 / r19
            int r13 = (int) r12
            r7.f299367e = r13
            r14.add(r7)
            pb1.r1 r7 = new pb1.r1
            r12 = 0
            r13 = 0
            r7.<init>(r15, r14, r12, r13)
            ob0.b0 r12 = f40.C86709a0.m107524d()
            r12.mo123460f(r7)
            goto L_0x01f8
        L_0x01f4:
            r21 = r12
            r16 = r14
        L_0x01f8:
            if (r11 == 0) goto L_0x0200
            r7 = 1
            goto L_0x0201
        L_0x01fc:
            r21 = r12
            r16 = r14
        L_0x0200:
            r7 = 0
        L_0x0201:
            if (r7 == 0) goto L_0x020b
            java.lang.String r5 = "handleEvent, msg already exist, do not insert"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r5)
            r5 = 0
            goto L_0x0281
        L_0x020b:
            int r7 = r10.f299346d
            if (r7 == r6) goto L_0x022e
            r11 = 3
            if (r7 == r11) goto L_0x0215
            r2.field_sourceType = r7
            goto L_0x024c
        L_0x0215:
            if (r5 != r6) goto L_0x021c
            r5 = 24
            r2.field_sourceType = r5
            goto L_0x024c
        L_0x021c:
            r12 = 2
            if (r5 != r12) goto L_0x0224
            r5 = 25
            r2.field_sourceType = r5
            goto L_0x024c
        L_0x0224:
            if (r5 != r11) goto L_0x022b
            r5 = 26
            r2.field_sourceType = r5
            goto L_0x024c
        L_0x022b:
            r2.field_sourceType = r7
            goto L_0x024c
        L_0x022e:
            java.lang.String r5 = r2.field_fromUser
            boolean r5 = eb0.C45628s0.m50738C(r5)
            if (r5 == 0) goto L_0x023b
            r5 = 23
            r2.field_sourceType = r5
            goto L_0x024c
        L_0x023b:
            java.lang.String r5 = r2.field_fromUser
            boolean r5 = com.tencent.p014mm.storage.C72996z1.m85820U5(r5)
            if (r5 == 0) goto L_0x0248
            r5 = 22
            r2.field_sourceType = r5
            goto L_0x024c
        L_0x0248:
            r5 = 21
            r2.field_sourceType = r5
        L_0x024c:
            java.lang.String r5 = r10.f299348f
            r2.field_fromUser = r5
            java.lang.String r5 = r10.f299350h
            r2.field_toUser = r5
            java.lang.String r5 = r10.f299352j
            r2.field_sourceId = r5
            long r10 = r10.f299356q
            r2.field_sourceCreateTime = r10
            goto L_0x0261
        L_0x025d:
            r21 = r12
            r16 = r14
        L_0x0261:
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r7 = r2.field_fromUser
            r10 = 0
            r5[r10] = r7
            java.lang.String r7 = r2.field_toUser
            r5[r6] = r7
            java.lang.String r7 = r2.field_sourceId
            r10 = 2
            r5[r10] = r7
            int r7 = r2.field_sourceType
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r10 = 3
            r5[r10] = r7
            java.lang.String r7 = "deal with source item, fromUser is %s, toUser %s, sourceId %s, sourceType %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r7, r5)
            r5 = 1
        L_0x0281:
            if (r5 != 0) goto L_0x02a7
            if (r8 != 0) goto L_0x02a7
            di3.d r0 = di3.C86312j.m106911c(r1)
            pb1.j1 r0 = (pb1.C100718j1) r0
            pb1.w0 r0 = r0.mo128199Jq()
            java.lang.String r1 = r2.field_sourceId
            xb1.d r0 = (xb1.C102614d) r0
            pb1.z r0 = r0.mo142263Ow(r1)
            if (r0 == 0) goto L_0x029d
            long r0 = r0.field_localId
            pb1.C100734q.f295127b = r0
        L_0x029d:
            r4.f265501g = r6
            r4.mo86054n()
            r3.mo140131g(r6)
            r1 = 0
            return r1
        L_0x02a7:
            r1 = 0
            r4.f265501g = r1
            r2.field_flag = r1
            long r10 = java.lang.System.currentTimeMillis()
            r2.field_updateTime = r10
            if (r8 == 0) goto L_0x02bf
            r7 = -1
            int r1 = (r21 > r7 ? 1 : (r21 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x02bf
            r12 = r21
            r2.field_localId = r12
            goto L_0x02c5
        L_0x02bf:
            long r7 = java.lang.System.currentTimeMillis()
            r2.field_localId = r7
        L_0x02c5:
            long r7 = r2.field_localId
            pb1.C100734q.f295127b = r7
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r1 = r0.f264674d
            int r3 = r1.f264678c
            r2.field_type = r3
            java.lang.String r1 = r1.f264680e
            if (r1 == 0) goto L_0x02f0
            int r1 = r1.length()
            r3 = 10001(0x2711, float:1.4014E-41)
            if (r1 < r3) goto L_0x02f0
            java.lang.String r1 = "length more than 10000, do cut desc"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r1)
            te3.kd0 r1 = r2.field_favProto
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r5 = r0.f264674d
            java.lang.String r5 = r5.f264680e
            r7 = 0
            java.lang.String r3 = r5.substring(r7, r3)
            r1.mo141212j(r3)
            goto L_0x02f9
        L_0x02f0:
            te3.kd0 r1 = r2.field_favProto
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r3 = r0.f264674d
            java.lang.String r3 = r3.f264680e
            r1.mo141212j(r3)
        L_0x02f9:
            java.lang.String r1 = pb1.C100755z.m131907w2(r2)
            r2.field_xml = r1
            boolean r1 = pb1.C100745t.m131889a(r1)
            if (r1 == 0) goto L_0x0309
            r1 = 0
            r4.f265502h = r1
            goto L_0x0316
        L_0x0309:
            r1 = -1
            r4.f265502h = r1
            java.lang.String r1 = r2.field_xml
            java.lang.String r3 = "IllegalXmlContent"
            java.lang.String r1 = r4.mo86045b(r3, r1, r6)
            r4.f265503i = r1
        L_0x0316:
            m118347b(r2)
            pb1.C100734q.m131885y0(r2)
            pb1.z$c r1 = pb1.C100755z.f295170V0
            r2.mo140187q2(r9, r1)
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r0 = r0.f264674d
            int r0 = r0.f264678c
            r1 = 5
            if (r1 != r0) goto L_0x034e
            te3.kd0 r0 = r2.field_favProto
            te3.ae0 r1 = r0.f298622j
            if (r1 == 0) goto L_0x0331
            java.lang.String r14 = r1.f297867h
            goto L_0x0333
        L_0x0331:
            r14 = r16
        L_0x0333:
            te3.rd0 r0 = r0.f298616d
            if (r0 == 0) goto L_0x0343
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r0 == 0) goto L_0x0343
            te3.kd0 r0 = r2.field_favProto
            te3.rd0 r0 = r0.f298616d
            java.lang.String r14 = r0.f299364y
        L_0x0343:
            java.lang.Class<pb1.i1> r0 = pb1.C35435i1.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            pb1.i1 r0 = (pb1.C35435i1) r0
            r0.mo55910F0(r14)
        L_0x034e:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.fav.p047ui.C93658i.m118348c(com.tencent.mm.autogen.events.DoFavoriteEvent):int");
    }
}
