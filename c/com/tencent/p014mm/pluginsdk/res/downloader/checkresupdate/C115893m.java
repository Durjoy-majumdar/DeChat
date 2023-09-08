package com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate;

import android.net.Uri;
import com.tencent.p014mm.jni.utils.UtilsJni;
import com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate.C115891k;
import com.tencent.p014mm.protocal.MMProtocalJni;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import p823sg.C90197s;
import rd3.C48020a;

/* renamed from: com.tencent.mm.pluginsdk.res.downloader.checkresupdate.m */
public final class C115893m {

    /* renamed from: a */
    public final String f347732a;

    /* renamed from: b */
    public final boolean f347733b;

    /* renamed from: c */
    public final boolean f347734c;

    /* renamed from: d */
    public final int f347735d;

    /* renamed from: e */
    public final int f347736e;

    /* renamed from: f */
    public final int f347737f;

    /* renamed from: g */
    public final long f347738g;

    /* renamed from: h */
    public final String f347739h;

    /* renamed from: i */
    public final String f347740i;

    /* renamed from: j */
    public final int f347741j;

    /* renamed from: k */
    public final int f347742k;

    /* renamed from: l */
    public final int f347743l;

    /* renamed from: m */
    public final String f347744m;

    /* renamed from: n */
    public final boolean f347745n;

    /* renamed from: o */
    public final boolean f347746o;

    /* renamed from: p */
    public final String f347747p;

    /* renamed from: q */
    public final byte[] f347748q;

    /* renamed from: r */
    public final String f347749r;

    /* renamed from: s */
    public volatile int f347750s = -1;

    /* renamed from: t */
    public volatile String f347751t = null;

    /* renamed from: u */
    public volatile String f347752u = null;

    public C115893m(int i, int i2, String str, boolean z, boolean z2, String str2, int i3, boolean z3, boolean z4, byte[] bArr, String str3, String str4, long j, String str5, int i4, int i5, int i6) {
        this.f347732a = C115890j.m163009c(i, i2);
        this.f347735d = i;
        this.f347736e = i2;
        this.f347744m = str;
        this.f347745n = z;
        this.f347746o = z2;
        this.f347747p = str2;
        this.f347737f = i3;
        this.f347748q = bArr;
        this.f347749r = str3;
        this.f347733b = z3;
        this.f347734c = z4;
        this.f347739h = str4;
        this.f347738g = j;
        this.f347740i = str5;
        this.f347741j = i4;
        this.f347742k = i5;
        this.f347743l = i6;
    }

    /* renamed from: c */
    public static boolean m163015c(String str, String str2) {
        C86009m1 m1Var = new C86009m1(str);
        if (!m1Var.mo119967g() || !m1Var.mo119978p()) {
            Log.m105925i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "inFile(%s) not exists", str);
            return false;
        }
        Uri n = C116299g2.m163858n(str2);
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
        if (l.mo177810a()) {
            boolean c = l.f348991a.mo119933c(l.f348992b);
        }
        byte[] c2 = C90197s.m112891c(C48020a.m53387d(str));
        if (!Util.isNullOrNil(c2)) {
            return C48020a.m53389f(str2, c2);
        }
        Log.m105924i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "uncompressed bytes empty");
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0253 A[SYNTHETIC, Splitter:B:50:0x0253] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x02a4  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m163016e(com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate.C115880a r23) {
        /*
            r0 = r23
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.m r15 = new com.tencent.mm.pluginsdk.res.downloader.checkresupdate.m
            int r1 = r0.f347682b
            int r2 = r0.f347683c
            java.lang.String r3 = r0.f347686f
            boolean r4 = r0.f347687g
            boolean r5 = r0.f347688h
            java.lang.String r6 = r0.f347689i
            int r7 = r0.f347690j
            boolean r8 = r0.f347693m
            boolean r9 = r0.f347685e
            byte[] r10 = r0.f347691k
            java.lang.String r11 = r0.f347692l
            java.lang.String r12 = r0.f347695o
            long r13 = r0.f347694n
            r16 = r13
            java.lang.String r13 = r0.f347696p
            int r14 = r0.f347697q
            r18 = r13
            int r13 = r0.f347698r
            int r0 = r0.f347684d
            r19 = r0
            r0 = r15
            r21 = r13
            r20 = r14
            r13 = r16
            r22 = r15
            r15 = r18
            r16 = r20
            r17 = r21
            r18 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18)
            r1 = r22
            boolean r0 = r1.f347746o
            java.lang.String r2 = "%s: checkFileExists(), file already valid"
            r3 = 32
            java.lang.String r4 = ".decrypted"
            r5 = 16
            java.lang.String r6 = ".decompressed"
            java.lang.String r7 = "MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer"
            r8 = 1
            r9 = 0
            if (r0 == 0) goto L_0x0086
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.String r10 = r1.f347732a
            r0[r9] = r10
            java.lang.String r10 = "%s: checkFileExists(), do fileDecompress"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r10, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r10 = r1.f347744m
            r0.append(r10)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r1.f347751t = r0
            r1.f347750s = r3
            java.lang.String r0 = r1.mo176439a()
            if (r0 == 0) goto L_0x00de
            r1.f347750s = r5
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.String r3 = r1.f347732a
            r0[r9] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r2, r0)
            goto L_0x00de
        L_0x0086:
            boolean r0 = r1.f347745n
            if (r0 == 0) goto L_0x00bc
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.String r10 = r1.f347732a
            r0[r9] = r10
            java.lang.String r10 = "%s: checkFileExists(), do fileDecrypt"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r10, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r10 = r1.f347744m
            r0.append(r10)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r1.f347751t = r0
            r1.f347750s = r3
            java.lang.String r0 = r1.mo176439a()
            if (r0 == 0) goto L_0x00de
            r1.f347750s = r5
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.String r3 = r1.f347732a
            r0[r9] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r2, r0)
            goto L_0x00de
        L_0x00bc:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.String r10 = r1.f347732a
            r0[r9] = r10
            java.lang.String r10 = "%s: checkFileExists(), just check sum"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r10, r0)
            java.lang.String r0 = r1.f347744m
            r1.f347751t = r0
            r1.f347750s = r3
            java.lang.String r0 = r1.mo176439a()
            if (r0 == 0) goto L_0x00de
            r1.f347750s = r5
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.String r3 = r1.f347732a
            r0[r9] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r2, r0)
        L_0x00de:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "%s: verify(), file_state "
            r0.append(r2)
            java.lang.String r2 = r1.mo176440b()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.String r3 = r1.f347732a
            r2[r9] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r0, r2)
            int r0 = r1.f347750s
            r2 = 2
            r3 = 4
            if (r5 != r0) goto L_0x0103
            goto L_0x0145
        L_0x0103:
            boolean r0 = r1.f347745n
            if (r0 == 0) goto L_0x0121
            java.lang.String r0 = r1.f347744m
            r1.f347751t = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = r1.f347744m
            r0.append(r5)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r1.f347752u = r0
            r1.f347750s = r8
            goto L_0x0145
        L_0x0121:
            boolean r0 = r1.f347746o
            if (r0 == 0) goto L_0x013f
            java.lang.String r0 = r1.f347744m
            r1.f347751t = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = r1.f347744m
            r0.append(r4)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r1.f347752u = r0
            r1.f347750s = r2
            goto L_0x0145
        L_0x013f:
            java.lang.String r0 = r1.f347744m
            r1.f347751t = r0
            r1.f347750s = r3
        L_0x0145:
            r0 = 5
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r4 = r1.f347732a
            r0[r9] = r4
            java.lang.String r4 = r1.mo176440b()
            r0[r8] = r4
            java.lang.String r4 = r1.f347751t
            r0[r2] = r4
            java.lang.String r4 = r1.f347752u
            r5 = 3
            r0[r5] = r4
            java.lang.String r4 = r1.f347747p
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r0[r3] = r4
            java.lang.String r4 = "%s: decrypt(), file_state = %s, before do decrypt, inPath = %s, outPath = %s, (key == empty) = %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r4, r0)
            int r0 = r1.f347750s
            java.lang.String r4 = ""
            r10 = 0
            r11 = 8
            if (r8 == r0) goto L_0x0177
            goto L_0x021b
        L_0x0177:
            java.lang.String r0 = r1.f347747p
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            r12 = 45
            if (r0 == 0) goto L_0x019e
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.String r6 = r1.f347732a
            r0[r9] = r6
            java.lang.String r6 = "%s: decrypt(), invalid encrypt key"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r6, r0)
            r1.f347751t = r10
            r1.f347750s = r11
            long r14 = r1.f347738g
            r5 = 54
            com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate.C115891k.m163010a(r14, r5)
            long r5 = r1.f347738g
            com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate.C115891k.m163010a(r5, r12)
            goto L_0x021b
        L_0x019e:
            java.lang.String r0 = r1.f347751t     // Catch:{ Exception -> 0x01bc }
            java.lang.String r5 = r1.f347752u     // Catch:{ Exception -> 0x01bc }
            java.lang.String r14 = r1.f347747p     // Catch:{ Exception -> 0x01bc }
            boolean r5 = r1.mo176441d(r0, r5, r14)     // Catch:{ Exception -> 0x01bc }
            java.lang.String r0 = "%s: decrypt(), decrypt done, ret = %b"
            java.lang.Object[] r14 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x01ba }
            java.lang.String r15 = r1.f347732a     // Catch:{ Exception -> 0x01ba }
            r14[r9] = r15     // Catch:{ Exception -> 0x01ba }
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r5)     // Catch:{ Exception -> 0x01ba }
            r14[r8] = r15     // Catch:{ Exception -> 0x01ba }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r0, r14)     // Catch:{ Exception -> 0x01ba }
            goto L_0x01dc
        L_0x01ba:
            r0 = move-exception
            goto L_0x01be
        L_0x01bc:
            r0 = move-exception
            r5 = 0
        L_0x01be:
            java.lang.Object[] r14 = new java.lang.Object[r9]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r4, r14)
            java.lang.Object[] r14 = new java.lang.Object[r2]
            java.lang.String r15 = r1.f347732a
            r14[r9] = r15
            r14[r8] = r0
            java.lang.String r0 = "%s: decrypt(), error = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r0, r14)
            long r14 = r1.f347738g
            com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate.C115891k.m163010a(r14, r12)
            long r12 = r1.f347738g
            r14 = 18
            com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate.C115891k.m163010a(r12, r14)
        L_0x01dc:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r12 = r1.f347732a
            r0[r9] = r12
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r5)
            r0[r8] = r12
            java.lang.String r12 = "%s: decrypt(), after try-catch, ret = %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r12, r0)
            if (r5 != 0) goto L_0x01f4
            r1.f347751t = r10
            r1.f347750s = r11
            goto L_0x021b
        L_0x01f4:
            long r12 = r1.f347738g
            r14 = 17
            com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate.C115891k.m163010a(r12, r14)
            java.lang.String r0 = r1.f347752u
            r1.f347751t = r0
            boolean r0 = r1.f347746o
            if (r0 == 0) goto L_0x0219
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = r1.f347744m
            r0.append(r5)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r1.f347752u = r0
            r1.f347750s = r2
            goto L_0x021b
        L_0x0219:
            r1.f347750s = r3
        L_0x021b:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r5 = r1.f347732a
            r0[r9] = r5
            java.lang.String r5 = r1.mo176440b()
            r0[r8] = r5
            java.lang.String r5 = r1.f347751t
            r0[r2] = r5
            java.lang.String r5 = r1.f347752u
            r6 = 3
            r0[r6] = r5
            java.lang.String r5 = "%s: decompress(), file_state = %s, before do decompress, inPath = %s, outPath = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r5, r0)
            int r0 = r1.f347750s
            if (r2 == r0) goto L_0x0253
            int r0 = r1.f347750s
            if (r11 != r0) goto L_0x02f0
            boolean r0 = r1.f347745n
            if (r0 == 0) goto L_0x02f0
            int r2 = r1.f347735d
            int r3 = r1.f347736e
            int r4 = r1.f347737f
            boolean r5 = r1.f347733b
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.String r9 = r1.f347739h
            com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate.C115891k.m163013d(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x02f0
        L_0x0253:
            java.lang.String r0 = r1.f347751t     // Catch:{ Exception -> 0x026f }
            java.lang.String r5 = r1.f347752u     // Catch:{ Exception -> 0x026f }
            boolean r5 = m163015c(r0, r5)     // Catch:{ Exception -> 0x026f }
            java.lang.String r0 = "%s: decompress(), decompress done, ret = %b"
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x026d }
            java.lang.String r12 = r1.f347732a     // Catch:{ Exception -> 0x026d }
            r6[r9] = r12     // Catch:{ Exception -> 0x026d }
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r5)     // Catch:{ Exception -> 0x026d }
            r6[r8] = r12     // Catch:{ Exception -> 0x026d }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r0, r6)     // Catch:{ Exception -> 0x026d }
            goto L_0x0283
        L_0x026d:
            r0 = move-exception
            goto L_0x0271
        L_0x026f:
            r0 = move-exception
            r5 = 0
        L_0x0271:
            java.lang.Object[] r6 = new java.lang.Object[r9]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r4, r6)
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r6 = r1.f347732a
            r4[r9] = r6
            r4[r8] = r0
            java.lang.String r0 = "%s: decompress(), error = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r0, r4)
        L_0x0283:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = r1.f347732a
            r0[r9] = r2
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r5)
            r0[r8] = r2
            java.lang.String r2 = "%s: decompress(), after try-catch, ret = %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r2, r0)
            if (r5 == 0) goto L_0x02a4
            java.lang.String r0 = r1.f347752u
            r1.f347751t = r0
            r1.f347750s = r3
            long r2 = r1.f347738g
            r4 = 19
            com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate.C115891k.m163010a(r2, r4)
            goto L_0x02f0
        L_0x02a4:
            r1.f347751t = r10
            r1.f347750s = r11
            long r2 = r1.f347738g
            r4 = 20
            com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate.C115891k.m163010a(r2, r4)
            long r2 = r1.f347738g
            r4 = 46
            com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate.C115891k.m163010a(r2, r4)
            boolean r0 = r1.f347745n
            if (r0 == 0) goto L_0x02cb
            int r2 = r1.f347735d
            int r3 = r1.f347736e
            int r4 = r1.f347737f
            boolean r5 = r1.f347733b
            r6 = 1
            r7 = 0
            r8 = 0
            java.lang.String r9 = r1.f347739h
            com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate.C115891k.m163013d(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x02f0
        L_0x02cb:
            boolean r0 = r1.f347746o
            if (r0 == 0) goto L_0x02f0
            boolean r0 = r1.f347734c
            if (r0 == 0) goto L_0x02f0
            int r2 = r1.f347735d
            int r3 = r1.f347736e
            java.lang.String r4 = r1.f347740i
            int r5 = r1.f347743l
            int r0 = r1.f347741j
            int r6 = r1.f347742k
            if (r0 <= r6) goto L_0x02e4
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.k$a r0 = com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate.C115891k.C115892a.RETRY_SUCC
            goto L_0x02e6
        L_0x02e4:
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.k$a r0 = com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate.C115891k.C115892a.SUCC
        L_0x02e6:
            r6 = r0
            r7 = 0
            boolean r8 = r1.f347733b
            r9 = 0
            java.lang.String r10 = r1.f347739h
            com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate.C115891k.m163012c(r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x02f0:
            java.lang.String r0 = r1.mo176439a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate.C115893m.m163016e(com.tencent.mm.pluginsdk.res.downloader.checkresupdate.a):java.lang.String");
    }

    /* renamed from: a */
    public final String mo176439a() {
        C115891k.C115892a aVar = C115891k.C115892a.RETRY_SUCC;
        C115891k.C115892a aVar2 = C115891k.C115892a.SUCC;
        Log.m105925i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: checkSum(), state " + mo176440b(), this.f347732a);
        if (16 == this.f347750s) {
            return this.f347751t;
        }
        String str = null;
        if (4 != this.f347750s && 32 != this.f347750s) {
            return null;
        }
        if (!Util.isNullOrNil(this.f347751t)) {
            Object[] objArr = new Object[4];
            objArr[0] = this.f347732a;
            objArr[1] = mo176440b();
            objArr[2] = this.f347749r;
            byte[] bArr = this.f347748q;
            objArr[3] = bArr == null ? "null" : String.valueOf(bArr.length);
            Log.m105925i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: checkSumImpl(), state = %s, originalMd5 = %s, eccSig.size = %s", objArr);
            if (Util.isNullOrNil(this.f347749r) || !Util.nullAsNil(C86013q1.m106456q(this.f347751t)).equals(this.f347749r)) {
                if (this.f347750s == 4) {
                    C115891k.m163010a(this.f347738g, 24);
                }
                if (!Util.isNullOrNil(this.f347748q) && UtilsJni.doEcdsaSHAVerify(C115890j.f347721a, C48020a.m53387d(this.f347751t), this.f347748q) > 0) {
                    Log.m105925i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: checkSumImpl(), state = %s, ecc check ok", this.f347732a, mo176440b());
                    if (this.f347750s == 4) {
                        C115891k.m163010a(this.f347738g, 25);
                    }
                    str = this.f347751t;
                } else if (this.f347750s == 4) {
                    C115891k.m163010a(this.f347738g, 26);
                }
            } else {
                Log.m105925i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: checkSumImpl(), state = %s, md5 ok", this.f347732a, mo176440b());
                if (this.f347750s == 4) {
                    C115891k.m163010a(this.f347738g, 23);
                }
                str = this.f347751t;
            }
        }
        Log.m105925i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: checkSumImpl return = %s", this.f347732a, str);
        if (this.f347750s == 4) {
            if (Util.isNullOrNil(str) && !this.f347746o) {
                C115891k.m163010a(this.f347738g, 58);
                C115891k.m163010a(this.f347738g, 45);
            }
            if (Util.isNullOrNil(str)) {
                if (this.f347745n) {
                    C115891k.m163013d(this.f347735d, this.f347736e, this.f347737f, this.f347733b, true, true, false, this.f347739h);
                } else if (this.f347746o && this.f347734c) {
                    C115891k.m163012c(this.f347735d, this.f347736e, this.f347740i, this.f347743l, this.f347741j > this.f347742k ? aVar : aVar2, false, this.f347733b, true, this.f347739h);
                }
            } else if (this.f347745n) {
                C115891k.m163013d(this.f347735d, this.f347736e, this.f347737f, this.f347733b, true, true, true, this.f347739h);
            } else if (this.f347746o && this.f347734c) {
                C115891k.m163012c(this.f347735d, this.f347736e, this.f347740i, this.f347743l, this.f347741j > this.f347742k ? aVar : aVar2, true, this.f347733b, true, this.f347739h);
            }
        }
        return str;
    }

    /* renamed from: b */
    public final String mo176440b() {
        int i = this.f347750s;
        if (i == 1) {
            return "state_decrypt";
        }
        if (i == 2) {
            return "state_decompress";
        }
        if (i == 4) {
            return "state_check_sum";
        }
        if (i == 8) {
            return "state_file_invalid";
        }
        if (i == 16) {
            return "state_file_valid";
        }
        if (i == 32) {
            return "state_pre_verify_check_sum";
        }
        return this.f347750s + "";
    }

    /* renamed from: d */
    public final boolean mo176441d(String str, String str2, String str3) {
        C86009m1 m1Var = new C86009m1(str);
        if (!m1Var.mo119967g() || !m1Var.mo119978p()) {
            Log.m105925i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "inFile(%s) not exists", str);
            return false;
        }
        C86009m1 m1Var2 = new C86009m1(str2);
        m1Var2.mo119974l().mo119987x();
        m1Var2.mo119966f();
        byte[] d = C48020a.m53387d(str);
        if (Util.isNullOrNil(d)) {
            Log.m105924i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "read bytes empty");
            C115891k.m163010a(this.f347738g, 56);
            C115891k.m163010a(this.f347738g, 45);
            C115891k.m163010a(this.f347738g, 18);
            return false;
        }
        byte[] aesDecrypt = MMProtocalJni.aesDecrypt(d, str3.getBytes());
        if (Util.isNullOrNil(aesDecrypt)) {
            Log.m105924i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "decrypted bytes empty");
            C115891k.m163010a(this.f347738g, 55);
            C115891k.m163010a(this.f347738g, 45);
            C115891k.m163010a(this.f347738g, 18);
            return false;
        }
        boolean f = C48020a.m53389f(str2, aesDecrypt);
        if (!f) {
            Log.m105924i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "decrypt write bytes fail");
            C115891k.m163010a(this.f347738g, 57);
            C115891k.m163010a(this.f347738g, 45);
            C115891k.m163010a(this.f347738g, 18);
        }
        return f;
    }
}
