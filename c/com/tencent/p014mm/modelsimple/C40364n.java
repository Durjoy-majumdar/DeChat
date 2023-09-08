package com.tencent.p014mm.modelsimple;

import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;

/* renamed from: com.tencent.mm.modelsimple.n */
public class C40364n extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f108471d;

    /* renamed from: e */
    public C47350c f108472e;

    /* renamed from: f */
    public List<String> f108473f;

    /* renamed from: g */
    public int f108474g;

    /* renamed from: h */
    public String f108475h;

    public C40364n(int i, List<String> list, String str) {
        this.f108474g = i;
        this.f108473f = list;
        this.f108475h = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0118, code lost:
        r14 = r14.f348991a.mo119945q(r14.f348992b);
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x032a  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x035d  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x037b  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x01e0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x039d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01ce A[SYNTHETIC, Splitter:B:60:0x01ce] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01f6 A[SYNTHETIC, Splitter:B:69:0x01f6] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int doScene(com.tencent.p014mm.network.C114770g r27, ob0.C11385n r28) {
        /*
            r26 = this;
            r1 = r26
            r0 = r28
            r1.f108471d = r0
            ob0.c$b r0 = new ob0.c$b
            r0.<init>()
            te3.uu r2 = new te3.uu
            r2.<init>()
            java.lang.String r3 = r1.f108475h
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x001c
            java.lang.String r3 = r1.f108475h
            r2.f143133e = r3
        L_0x001c:
            r0.f127066a = r2
            te3.vu r2 = new te3.vu
            r2.<init>()
            r0.f127067b = r2
            java.lang.String r2 = "/cgi-bin/micromsg-bin/checksystemshare"
            r0.f127068c = r2
            r2 = 837(0x345, float:1.173E-42)
            r0.f127069d = r2
            r2 = 0
            r0.f127070e = r2
            r0.f127071f = r2
            ob0.c r0 = r0.mo72403a()
            r1.f108472e = r0
            int r3 = r1.f108474g
            r4 = 0
            r6 = 0
            r7 = 4
            r8 = 3
            java.lang.String r9 = "MicroMsg.NetSceneCheckSysShare"
            r11 = 1
            if (r3 == r11) goto L_0x021e
            java.lang.String r12 = "cost %d ms"
            if (r3 == r8) goto L_0x014b
            if (r3 == r7) goto L_0x00c4
            r4 = 5
            if (r3 == r4) goto L_0x004f
            goto L_0x03df
        L_0x004f:
            java.util.List<java.lang.String> r3 = r1.f108473f
            ob0.c$c r0 = r0.f127055a
            pe3.a r0 = r0.f127080a
            te3.uu r0 = (te3.C51597uu) r0
            r0.f143132d = r4
            long r4 = java.lang.System.currentTimeMillis()
            java.util.Iterator r3 = r3.iterator()
        L_0x0061:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x00b2
            java.lang.Object r6 = r3.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object[] r7 = new java.lang.Object[r11]
            r7[r2] = r6
            java.lang.String r8 = "share text %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r8, r7)
            java.lang.String r7 = "|"
            int r7 = r6.indexOf(r7)
            te3.c44 r8 = new te3.c44
            r8.<init>()
            if (r7 < 0) goto L_0x009a
            int r10 = r7 + 1
            int r13 = r6.length()
            if (r10 >= r13) goto L_0x009a
            java.lang.String r7 = r6.substring(r2, r7)
            r8.f131508e = r7
            java.lang.String r6 = r6.substring(r10)
            r8.f131507d = r6
            goto L_0x00a0
        L_0x009a:
            java.lang.String r7 = ""
            r8.f131508e = r7
            r8.f131507d = r6
        L_0x00a0:
            java.lang.String r6 = r8.f131507d
            byte[] r6 = r6.getBytes()
            java.lang.String r6 = p823sg.C90193h.m112878f(r6)
            r8.f131509f = r6
            java.util.LinkedList<te3.c44> r6 = r0.f143138j
            r6.add(r8)
            goto L_0x0061
        L_0x00b2:
            java.lang.Object[] r0 = new java.lang.Object[r11]
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r4
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            r0[r2] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r12, r0)
            goto L_0x03df
        L_0x00c4:
            java.util.List<java.lang.String> r3 = r1.f108473f
            ob0.c$c r0 = r0.f127055a
            pe3.a r0 = r0.f127080a
            te3.uu r0 = (te3.C51597uu) r0
            r0.f143132d = r7
            long r7 = java.lang.System.currentTimeMillis()
            java.util.Iterator r3 = r3.iterator()
        L_0x00d6:
            boolean r10 = r3.hasNext()
            if (r10 == 0) goto L_0x0139
            java.lang.Object r10 = r3.next()
            java.lang.String r10 = (java.lang.String) r10
            te3.z34 r13 = new te3.z34
            r13.<init>()
            android.net.Uri r10 = com.tencent.p014mm.vfs.C116299g2.m163858n(r10)
            java.lang.String r14 = r10.getPath()
            if (r14 == 0) goto L_0x010b
            java.lang.String r14 = com.tencent.p014mm.vfs.C116299g2.m163855k(r14, r2, r2)
            java.lang.String r15 = r10.getPath()
            boolean r15 = r15.equals(r14)
            if (r15 != 0) goto L_0x010b
            android.net.Uri$Builder r10 = r10.buildUpon()
            android.net.Uri$Builder r10 = r10.path(r14)
            android.net.Uri r10 = r10.build()
        L_0x010b:
            com.tencent.mm.vfs.f0 r14 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r14 = r14.mo177799l(r10, r6)
            boolean r15 = r14.mo177810a()
            if (r15 != 0) goto L_0x0118
            goto L_0x0122
        L_0x0118:
            com.tencent.mm.vfs.FileSystem$c r15 = r14.f348991a
            java.lang.String r14 = r14.f348992b
            com.tencent.mm.vfs.b0 r14 = r15.mo119945q(r14)
            if (r14 != 0) goto L_0x0124
        L_0x0122:
            r14 = r4
            goto L_0x0126
        L_0x0124:
            long r14 = r14.f250473c
        L_0x0126:
            int r15 = (int) r14
            r13.f145675e = r15
            java.lang.String r10 = com.tencent.p014mm.vfs.C116299g2.m163865u(r10)
            java.lang.String r10 = com.tencent.p014mm.vfs.C86013q1.m106456q(r10)
            r13.f145674d = r10
            java.util.LinkedList<te3.z34> r10 = r0.f143137i
            r10.add(r13)
            goto L_0x00d6
        L_0x0139:
            java.lang.Object[] r0 = new java.lang.Object[r11]
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r7
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r0[r2] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r12, r0)
            goto L_0x03df
        L_0x014b:
            java.util.List<java.lang.String> r3 = r1.f108473f
            java.lang.String r4 = "%s"
            ob0.c$c r0 = r0.f127055a
            pe3.a r0 = r0.f127080a
            r5 = r0
            te3.uu r5 = (te3.C51597uu) r5
            r5.f143132d = r8
            long r7 = java.lang.System.currentTimeMillis()
            java.util.Iterator r3 = r3.iterator()
        L_0x0160:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x020a
            java.lang.Object r0 = r3.next()
            r13 = r0
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r2] = r13
            java.lang.String r14 = "video file %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r14, r0)
            te3.d44 r14 = new te3.d44
            r14.<init>()
            oj.c r15 = new oj.c     // Catch:{ Exception -> 0x01b9, all -> 0x01b6 }
            r15.<init>()     // Catch:{ Exception -> 0x01b9, all -> 0x01b6 }
            r15.setDataSource(r13)     // Catch:{ Exception -> 0x01b4, all -> 0x01b1 }
            r0 = 9
            java.lang.String r0 = r15.extractMetadata(r0)     // Catch:{ Exception -> 0x01b4, all -> 0x01b1 }
            r6 = -1
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r6)     // Catch:{ Exception -> 0x01b4, all -> 0x01b1 }
            java.lang.String r6 = "video duration %d"
            java.lang.Object[] r10 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x01b4, all -> 0x01b1 }
            java.lang.Integer r16 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x01b4, all -> 0x01b1 }
            r10[r2] = r16     // Catch:{ Exception -> 0x01b4, all -> 0x01b1 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r6, r10)     // Catch:{ Exception -> 0x01b4, all -> 0x01b1 }
            r14.f132110e = r0     // Catch:{ Exception -> 0x01b4, all -> 0x01b1 }
            r15.release()     // Catch:{ Exception -> 0x01a3 }
            goto L_0x01e0
        L_0x01a3:
            r0 = move-exception
            r6 = r0
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.String r10 = r6.getMessage()
            r0[r2] = r10
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r6, r4, r0)
            goto L_0x01e0
        L_0x01b1:
            r0 = move-exception
            r2 = r0
            goto L_0x01f4
        L_0x01b4:
            r0 = move-exception
            goto L_0x01bb
        L_0x01b6:
            r0 = move-exception
            r6 = 0
            goto L_0x01f2
        L_0x01b9:
            r0 = move-exception
            r15 = 0
        L_0x01bb:
            java.lang.String r6 = "Analysis duration of mediaItem %s error %s"
            r10 = 2
            java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ all -> 0x01f0 }
            r11[r2] = r13     // Catch:{ all -> 0x01f0 }
            java.lang.String r10 = r0.getMessage()     // Catch:{ all -> 0x01f0 }
            r2 = 1
            r11[r2] = r10     // Catch:{ all -> 0x01f0 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r0, r6, r11)     // Catch:{ all -> 0x01f0 }
            if (r15 == 0) goto L_0x01e0
            r15.release()     // Catch:{ Exception -> 0x01d2 }
            goto L_0x01e0
        L_0x01d2:
            r0 = move-exception
            r6 = r0
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = r6.getMessage()
            r10 = 0
            r0[r10] = r2
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r6, r4, r0)
        L_0x01e0:
            java.lang.String r0 = com.tencent.p014mm.vfs.C86013q1.m106456q(r13)
            r14.f132109d = r0
            java.util.LinkedList<te3.d44> r0 = r5.f143135g
            r0.add(r14)
            r2 = 0
            r6 = 0
            r11 = 1
            goto L_0x0160
        L_0x01f0:
            r0 = move-exception
            r6 = r15
        L_0x01f2:
            r2 = r0
            r15 = r6
        L_0x01f4:
            if (r15 == 0) goto L_0x0209
            r15.release()     // Catch:{ Exception -> 0x01fa }
            goto L_0x0209
        L_0x01fa:
            r0 = move-exception
            r3 = r0
            r5 = 1
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r5 = r3.getMessage()
            r6 = 0
            r0[r6] = r5
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r3, r4, r0)
        L_0x0209:
            throw r2
        L_0x020a:
            r5 = 1
            r6 = 0
            java.lang.Object[] r0 = new java.lang.Object[r5]
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r7
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0[r6] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r12, r0)
            goto L_0x03df
        L_0x021e:
            java.util.List<java.lang.String> r2 = r1.f108473f
            java.lang.Class<lx.c0> r3 = p200lx.C34393c0.class
            ob0.c$c r0 = r0.f127055a
            pe3.a r0 = r0.f127080a
            r6 = r0
            te3.uu r6 = (te3.C51597uu) r6
            r10 = 1
            r6.f143132d = r10
            android.graphics.BitmapFactory$Options r11 = new android.graphics.BitmapFactory$Options
            r11.<init>()
            r11.inJustDecodeBounds = r10
            long r12 = java.lang.System.currentTimeMillis()
            java.util.Iterator r2 = r2.iterator()
            r14 = r4
            r18 = r14
        L_0x023e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x03b1
            java.lang.Object r0 = r2.next()
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r5 = 0
            r0[r5] = r4
            java.lang.String r5 = "img file %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r5, r0)
            te3.b44 r5 = new te3.b44
            r5.<init>()
            java.lang.String r0 = p823sg.C90193h.m112876d(r4)
            r5.f130936d = r0
            long r14 = java.lang.System.currentTimeMillis()
            com.tencent.p014mm.graphics.MMBitmapFactory.m98735d(r4, r11)
            r10 = 2
            java.lang.Object[] r0 = new java.lang.Object[r10]
            int r10 = r11.outWidth
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r17 = 0
            r0[r17] = r10
            int r10 = r11.outHeight
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r16 = 1
            r0[r16] = r10
            java.lang.String r10 = "decode img, width %d, height: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r10, r0)
            int r0 = r11.outWidth
            r5.f130937e = r0
            int r0 = r11.outHeight
            r5.f130938f = r0
            long r18 = java.lang.System.currentTimeMillis()
            java.lang.Class<aw.d> r0 = p447aw.C103918d.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            aw.d r0 = (p447aw.C103918d) r0
            android.content.Context r10 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r8 = "android.permission.READ_EXTERNAL_STORAGE"
            r7 = 0
            boolean r0 = r0.Un0(r10, r8, r7)
            r8 = 1
            java.lang.Object[] r10 = new java.lang.Object[r8]
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
            r10[r7] = r8
            java.lang.String r8 = "checkPermission checkStorage[%b]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r8, r10)
            if (r0 != 0) goto L_0x02b4
            goto L_0x0320
        L_0x02b4:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.ContentResolver r20 = r0.getContentResolver()
            android.net.Uri r21 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            java.lang.String r0 = "_id"
            java.lang.String[] r22 = new java.lang.String[]{r0}
            r8 = 1
            java.lang.String[] r10 = new java.lang.String[r8]
            r10[r7] = r4
            r25 = 0
            java.lang.String r23 = "_data=?"
            r24 = r10
            android.database.Cursor r7 = r20.query(r21, r22, r23, r24, r25)
            if (r7 == 0) goto L_0x0320
            boolean r8 = r7.moveToFirst()     // Catch:{ Exception -> 0x0305 }
            if (r8 == 0) goto L_0x02fb
            int r0 = r7.getColumnIndex(r0)     // Catch:{ Exception -> 0x0305 }
            int r0 = r7.getInt(r0)     // Catch:{ Exception -> 0x0305 }
            android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0305 }
            android.content.ContentResolver r8 = r8.getContentResolver()     // Catch:{ Exception -> 0x0305 }
            r20 = r11
            long r10 = (long) r0
            r21 = r2
            r22 = r14
            r2 = 0
            r14 = 1
            android.graphics.Bitmap r0 = android.provider.MediaStore.Images.Thumbnails.getThumbnail(r8, r10, r14, r2)     // Catch:{ Exception -> 0x02f9 }
            goto L_0x0316
        L_0x02f9:
            r0 = move-exception
            goto L_0x030d
        L_0x02fb:
            r21 = r2
            r20 = r11
            r22 = r14
            r2 = 0
            goto L_0x0315
        L_0x0303:
            r0 = move-exception
            goto L_0x031c
        L_0x0305:
            r0 = move-exception
            r21 = r2
            r20 = r11
            r22 = r14
            r2 = 0
        L_0x030d:
            java.lang.String r8 = "query failed"
            r10 = 0
            java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ all -> 0x0303 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r0, r8, r11)     // Catch:{ all -> 0x0303 }
        L_0x0315:
            r0 = r2
        L_0x0316:
            r7.close()     // Catch:{ Exception -> 0x031a }
            goto L_0x0328
        L_0x031a:
            goto L_0x0328
        L_0x031c:
            r7.close()     // Catch:{ Exception -> 0x031f }
        L_0x031f:
            throw r0
        L_0x0320:
            r21 = r2
            r20 = r11
            r22 = r14
            r2 = 0
            r0 = r2
        L_0x0328:
            if (r0 == 0) goto L_0x035d
            r7 = 2
            java.lang.Object[] r4 = new java.lang.Object[r7]
            int r7 = r0.getWidth()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8 = 0
            r4[r8] = r7
            int r7 = r0.getHeight()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8 = 1
            r4[r8] = r7
            java.lang.String r7 = "have thumbnail(w:%d, h:%d)"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r7, r4)
            di3.d r4 = di3.C86312j.m106911c(r3)
            lx.c0 r4 = (p200lx.C34393c0) r4
            di3.d r7 = di3.C86312j.m106911c(r3)
            lx.c0 r7 = (p200lx.C34393c0) r7
            int[] r7 = r7.mo59440Qa()
            com.tencent.qbar.a$a r0 = r4.mo59441YG(r0, r7)
            goto L_0x0375
        L_0x035d:
            android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeFileWithSample(r4)
            di3.d r4 = di3.C86312j.m106911c(r3)
            lx.c0 r4 = (p200lx.C34393c0) r4
            di3.d r7 = di3.C86312j.m106911c(r3)
            lx.c0 r7 = (p200lx.C34393c0) r7
            int[] r7 = r7.mo59440Qa()
            com.tencent.qbar.a$a r0 = r4.mo59441YG(r0, r7)
        L_0x0375:
            long r7 = java.lang.System.currentTimeMillis()
            if (r0 == 0) goto L_0x039d
            r4 = 2
            java.lang.Object[] r10 = new java.lang.Object[r4]
            java.lang.String r4 = r0.f56828e
            r11 = 0
            r10[r11] = r4
            java.lang.String r4 = r0.f56829f
            r11 = 1
            r10[r11] = r4
            java.lang.String r4 = "scan qrcode, type %s, result %s, "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r4, r10)
            java.lang.String r4 = r0.f56828e
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x039d
            java.lang.String r4 = r0.f56828e
            r5.f130940h = r4
            java.lang.String r0 = r0.f56829f
            r5.f130939g = r0
        L_0x039d:
            java.util.LinkedList<te3.b44> r0 = r6.f143134f
            r0.add(r5)
            r14 = r18
            r11 = r20
            r2 = r21
            r4 = r22
            r10 = 1
            r18 = r7
            r7 = 4
            r8 = 3
            goto L_0x023e
        L_0x03b1:
            java.lang.Object[] r0 = new java.lang.Object[r7]
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r12
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 0
            r0[r3] = r2
            long r2 = r4 - r12
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 1
            r0[r3] = r2
            long r2 = r14 - r4
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 2
            r0[r3] = r2
            long r18 = r18 - r14
            java.lang.Long r2 = java.lang.Long.valueOf(r18)
            r3 = 3
            r0[r3] = r2
            java.lang.String r2 = "cost %d(%d, %d, %d)ms"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r2, r0)
        L_0x03df:
            boolean r0 = f40.C86709a0.m107522a()
            if (r0 == 0) goto L_0x03fd
            java.lang.Class<lc3.b> r0 = lc3.C10485b.class
            k40.a r0 = f40.C86709a0.m107533q(r0)
            lc3.b r0 = (lc3.C10485b) r0
            pj.f r0 = r0.vh0()
            java.lang.String r2 = "ShareExtCheckSwitch"
            java.lang.String r0 = r0.mo107405c(r2)
            r2 = 1
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r2)
            goto L_0x03ff
        L_0x03fd:
            r2 = 1
            r0 = 1
        L_0x03ff:
            if (r0 == r2) goto L_0x040a
            ob0.n r0 = r1.f108471d
            java.lang.String r2 = "need not check"
            r3 = 0
            r0.onSceneEnd(r3, r3, r2, r1)
            return r3
        L_0x040a:
            ob0.c r0 = r1.f108472e
            r2 = r27
            int r0 = r1.dispatch(r2, r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelsimple.C40364n.doScene(com.tencent.mm.network.g, ob0.n):int");
    }

    public int getType() {
        return 837;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneCheckSysShare", "errType %d, errCode %d, errMsg", Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f108471d.onSceneEnd(i2, i3, str, this);
    }
}
