package com.tencent.p014mm.vfs;

import a70.C112760b;
import android.os.CancellationSignal;
import android.os.Environment;
import android.os.StatFs;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116344z0;
import com.tencent.p014mm.vfs.FileSystem;
import com.tencent.tinker.loader.shareutil.ShareConstants;
import com.tencent.xweb.file.XVFSFile;
import f40.C86709a0;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.regex.Pattern;
import kj2.C117407d;

/* renamed from: com.tencent.mm.vfs.o */
public class C116314o implements C116344z0.C116345a {

    /* renamed from: f */
    public static final int f349035f;

    /* renamed from: g */
    public static final Object f349036g = new Object();

    /* renamed from: h */
    public static Map<String, C116316b> f349037h = new HashMap();

    /* renamed from: i */
    public static Map<String, C116316b> f349038i;

    /* renamed from: j */
    public static boolean f349039j = false;

    /* renamed from: k */
    public static Set<String> f349040k = new HashSet();

    /* renamed from: l */
    public static Set<String> f349041l = new HashSet();

    /* renamed from: m */
    public static Set<String> f349042m = new HashSet();

    /* renamed from: n */
    public static Set<String> f349043n = new HashSet();

    /* renamed from: o */
    public static Set<String> f349044o = new HashSet();

    /* renamed from: p */
    public static Set<String> f349045p = new HashSet();

    /* renamed from: q */
    public static final Set<C116317c> f349046q = new HashSet();

    /* renamed from: r */
    public static final C116281f0.C116286f f349047r = new C116315a();

    /* renamed from: s */
    public static final Pattern f349048s = Pattern.compile("[0-9a-f]{32}(?:temp[0-9]+)?");

    /* renamed from: t */
    public static final String[] f349049t = {".auth_cache", "app_execdir", "app_font", "app_midaslib_0", "app_midaslib_1", "app_midasplugins", "app_qmsp", "app_sslcache", "app_tbs_common_share", "app_turingdfp", "app_turingfd", "app_turingsmi", "cert", "code_cache", "extqbar", "face_detect", "huaweiks", "ilink", "no_backup", "scan_goods", ShareConstants.PATCH_TEMP_DIRECTORY_NAME, "xweb_lock"};

    /* renamed from: a */
    public final String f349050a;

    /* renamed from: b */
    public final int f349051b;

    /* renamed from: c */
    public final int f349052c;

    /* renamed from: d */
    public final long f349053d;

    /* renamed from: e */
    public final long f349054e;

    /* renamed from: com.tencent.mm.vfs.o$a */
    public class C116315a implements C116281f0.C116286f {
        /* renamed from: a */
        public boolean mo177782a(String str, FileSystem.C85995c cVar, CancellationSignal cancellationSignal) {
            return true;
        }

        /* renamed from: b */
        public void mo177783b(CancellationSignal cancellationSignal) {
            synchronized (C116314o.f349036g) {
                C116314o.f349038i = new HashMap();
            }
            Log.m105924i("VFS.DiskFileStatistics", "Begin statistics maintenance");
        }

        /* JADX WARNING: Removed duplicated region for block: B:74:0x030a A[SYNTHETIC, Splitter:B:74:0x030a] */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo177784c(boolean r43, boolean r44, android.os.CancellationSignal r45) {
            /*
                r42 = this;
                r1 = r42
                r2 = 0
                if (r43 != 0) goto L_0x05d7
                if (r44 != 0) goto L_0x05d7
                java.lang.String r0 = ""
                r3 = 3
                r4 = 13
                r8 = 0
                r15 = 6
                r16 = 5
                r5 = 4
                r6 = 0
                r7 = 1
                com.tencent.mm.vfs.NativeFileSystem r13 = new com.tencent.mm.vfs.NativeFileSystem     // Catch:{ Exception -> 0x01e4 }
                java.lang.String r11 = "${extData}/MicroMsg/${accountSalt}/record"
                r13.<init>((java.lang.String) r11)     // Catch:{ Exception -> 0x01e4 }
                com.tencent.mm.vfs.f0 r11 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ Exception -> 0x01e4 }
                java.util.Map r11 = r11.mo177791d()     // Catch:{ Exception -> 0x01e4 }
                com.tencent.mm.vfs.FileSystem$c r11 = r13.mo177578v(r11)     // Catch:{ Exception -> 0x01e4 }
                java.lang.Iterable r11 = com.tencent.p014mm.vfs.C116299g2.m163860p(r11, r0, r6, r2)     // Catch:{ Exception -> 0x01e4 }
                if (r11 == 0) goto L_0x0060
                qp3.a r11 = (qp3.C118196a) r11     // Catch:{ Exception -> 0x01e4 }
                java.util.Iterator r11 = r11.iterator()     // Catch:{ Exception -> 0x01e4 }
                r12 = r8
            L_0x0032:
                r19 = r11
                qp3.b r19 = (qp3.C118197b) r19     // Catch:{ Exception -> 0x01e4 }
                boolean r20 = r19.hasNext()     // Catch:{ Exception -> 0x01e4 }
                if (r20 == 0) goto L_0x0061
                java.lang.Object r19 = r19.next()     // Catch:{ Exception -> 0x01e4 }
                r2 = r19
                com.tencent.mm.vfs.b0 r2 = (com.tencent.p014mm.vfs.C86001b0) r2     // Catch:{ Exception -> 0x01e4 }
                boolean r14 = r2.f250476f     // Catch:{ Exception -> 0x01e4 }
                if (r14 == 0) goto L_0x005a
                r21 = r11
                long r10 = r2.f250475e     // Catch:{ Exception -> 0x01e4 }
                r22 = 1650902400000(0x18061737c00, double:8.15654160477E-312)
                int r2 = (r10 > r22 ? 1 : (r10 == r22 ? 0 : -1))
                if (r2 <= 0) goto L_0x005c
                long r12 = java.lang.Math.max(r12, r10)     // Catch:{ Exception -> 0x01e4 }
                goto L_0x005c
            L_0x005a:
                r21 = r11
            L_0x005c:
                r11 = r21
                r2 = 0
                goto L_0x0032
            L_0x0060:
                r12 = r8
            L_0x0061:
                r2 = 1912(0x778, float:2.679E-42)
                int r10 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
                if (r10 <= 0) goto L_0x00e9
                kj2.d r10 = kj2.C117407d.INSTANCE     // Catch:{ Exception -> 0x01e4 }
                java.lang.Object[] r11 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x01e4 }
                java.lang.String r21 = "@WrongMigration-record"
                r11[r6] = r21     // Catch:{ Exception -> 0x01e4 }
                java.lang.Integer r21 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x01e4 }
                r11[r7] = r21     // Catch:{ Exception -> 0x01e4 }
                java.lang.Integer r21 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x01e4 }
                r14 = 2
                r11[r14] = r21     // Catch:{ Exception -> 0x01e4 }
                r11[r3] = r0     // Catch:{ Exception -> 0x01e4 }
                java.lang.Integer r21 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x01e4 }
                r11[r5] = r21     // Catch:{ Exception -> 0x01e4 }
                java.lang.Integer r21 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x01e4 }
                r11[r16] = r21     // Catch:{ Exception -> 0x01e4 }
                java.lang.Integer r21 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x01e4 }
                r11[r15] = r21     // Catch:{ Exception -> 0x01e4 }
                java.lang.Integer r21 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x01e4 }
                r19 = 7
                r11[r19] = r21     // Catch:{ Exception -> 0x01e4 }
                java.lang.Integer r21 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x01e4 }
                r18 = 8
                r11[r18] = r21     // Catch:{ Exception -> 0x01e4 }
                java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ Exception -> 0x01e4 }
                r13 = 9
                r11[r13] = r12     // Catch:{ Exception -> 0x01e4 }
                java.lang.Integer r12 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x01e4 }
                r13 = 10
                r11[r13] = r12     // Catch:{ Exception -> 0x01e4 }
                java.lang.Integer r12 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x01e4 }
                r13 = 11
                r11[r13] = r12     // Catch:{ Exception -> 0x01e4 }
                java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.BuildInfo.REV     // Catch:{ Exception -> 0x01e4 }
                r13 = 12
                r11[r13] = r12     // Catch:{ Exception -> 0x01e4 }
                r12 = 21388(0x538c, float:2.9971E-41)
                r10.mo160131h(r12, r11)     // Catch:{ Exception -> 0x01e4 }
                r11 = 2
                r10.mo182088q(r2, r11)     // Catch:{ Exception -> 0x01e4 }
                f40.o r10 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x01e4 }
                com.tencent.mm.storage.v1 r10 = r10.mo121142i()     // Catch:{ Exception -> 0x01e4 }
                com.tencent.mm.storage.y1$a r11 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_C2C_OTHER_ACCOUNT_WRONG_MIGRANT_INT_SYNC     // Catch:{ Exception -> 0x01e4 }
                long r12 = r10.mo119673G(r11, r8)     // Catch:{ Exception -> 0x01e4 }
                int r10 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
                if (r10 != 0) goto L_0x00e9
                f40.o r10 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x01e4 }
                com.tencent.mm.storage.v1 r10 = r10.mo121142i()     // Catch:{ Exception -> 0x01e4 }
                r12 = 2
                java.lang.Integer r13 = java.lang.Integer.valueOf(r12)     // Catch:{ Exception -> 0x01e4 }
                r10.mo119677K(r11, r13)     // Catch:{ Exception -> 0x01e4 }
            L_0x00e9:
                f40.o r10 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x01e4 }
                com.tencent.mm.storage.v1 r10 = r10.mo121142i()     // Catch:{ Exception -> 0x01e4 }
                com.tencent.mm.storage.y1$a r11 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_C2C_RESCUE_OTHER_ACCOUNT_VOICE2_HIT_INT_SYNC     // Catch:{ Exception -> 0x01e4 }
                int r10 = r10.mo119689j(r11, r6)     // Catch:{ Exception -> 0x01e4 }
                if (r10 == 0) goto L_0x0166
                f40.o r10 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x01e4 }
                com.tencent.mm.storage.v1 r10 = r10.mo121142i()     // Catch:{ Exception -> 0x01e4 }
                java.lang.Integer r12 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x01e4 }
                r10.mo119677K(r11, r12)     // Catch:{ Exception -> 0x01e4 }
                kj2.d r10 = kj2.C117407d.INSTANCE     // Catch:{ Exception -> 0x01e4 }
                java.lang.Object[] r11 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x01e4 }
                java.lang.String r12 = "@WrongMigration-voice2"
                r11[r6] = r12     // Catch:{ Exception -> 0x01e4 }
                java.lang.Integer r12 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x01e4 }
                r11[r7] = r12     // Catch:{ Exception -> 0x01e4 }
                java.lang.Integer r12 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x01e4 }
                r13 = 2
                r11[r13] = r12     // Catch:{ Exception -> 0x01e4 }
                r11[r3] = r0     // Catch:{ Exception -> 0x01e4 }
                java.lang.Integer r12 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x01e4 }
                r11[r5] = r12     // Catch:{ Exception -> 0x01e4 }
                java.lang.Integer r12 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x01e4 }
                r11[r16] = r12     // Catch:{ Exception -> 0x01e4 }
                java.lang.Integer r12 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x01e4 }
                r11[r15] = r12     // Catch:{ Exception -> 0x01e4 }
                java.lang.Integer r12 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x01e4 }
                r13 = 7
                r11[r13] = r12     // Catch:{ Exception -> 0x01e4 }
                java.lang.Integer r12 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x01e4 }
                r13 = 8
                r11[r13] = r12     // Catch:{ Exception -> 0x01e4 }
                java.lang.Integer r12 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x01e4 }
                r13 = 9
                r11[r13] = r12     // Catch:{ Exception -> 0x01e4 }
                java.lang.Integer r12 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x01e4 }
                r13 = 10
                r11[r13] = r12     // Catch:{ Exception -> 0x01e4 }
                java.lang.Integer r12 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x01e4 }
                r13 = 11
                r11[r13] = r12     // Catch:{ Exception -> 0x01e4 }
                java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.BuildInfo.REV     // Catch:{ Exception -> 0x01e4 }
                r13 = 12
                r11[r13] = r12     // Catch:{ Exception -> 0x01e4 }
                r12 = 21388(0x538c, float:2.9971E-41)
                r10.mo160131h(r12, r11)     // Catch:{ Exception -> 0x01e4 }
                r10.mo182088q(r2, r3)     // Catch:{ Exception -> 0x01e4 }
            L_0x0166:
                f40.o r10 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x01e4 }
                com.tencent.mm.storage.v1 r10 = r10.mo121142i()     // Catch:{ Exception -> 0x01e4 }
                com.tencent.mm.storage.y1$a r11 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_C2C_RESCUE_OTHER_ACCOUNT_VIDEO_HIT_INT_SYNC     // Catch:{ Exception -> 0x01e4 }
                int r10 = r10.mo119689j(r11, r6)     // Catch:{ Exception -> 0x01e4 }
                if (r10 == 0) goto L_0x01ee
                f40.o r10 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x01e4 }
                com.tencent.mm.storage.v1 r10 = r10.mo121142i()     // Catch:{ Exception -> 0x01e4 }
                java.lang.Integer r12 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x01e4 }
                r10.mo119677K(r11, r12)     // Catch:{ Exception -> 0x01e4 }
                kj2.d r10 = kj2.C117407d.INSTANCE     // Catch:{ Exception -> 0x01e4 }
                java.lang.Object[] r11 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x01e4 }
                java.lang.String r12 = "@WrongMigration-video"
                r11[r6] = r12     // Catch:{ Exception -> 0x01e4 }
                java.lang.Integer r12 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x01e4 }
                r11[r7] = r12     // Catch:{ Exception -> 0x01e4 }
                java.lang.Integer r12 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x01e4 }
                r13 = 2
                r11[r13] = r12     // Catch:{ Exception -> 0x01e4 }
                r11[r3] = r0     // Catch:{ Exception -> 0x01e4 }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x01e4 }
                r11[r5] = r0     // Catch:{ Exception -> 0x01e4 }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x01e4 }
                r11[r16] = r0     // Catch:{ Exception -> 0x01e4 }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x01e4 }
                r11[r15] = r0     // Catch:{ Exception -> 0x01e4 }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x01e4 }
                r12 = 7
                r11[r12] = r0     // Catch:{ Exception -> 0x01e4 }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x01e4 }
                r12 = 8
                r11[r12] = r0     // Catch:{ Exception -> 0x01e4 }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x01e4 }
                r12 = 9
                r11[r12] = r0     // Catch:{ Exception -> 0x01e4 }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x01e4 }
                r12 = 10
                r11[r12] = r0     // Catch:{ Exception -> 0x01e4 }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x01e4 }
                r12 = 11
                r11[r12] = r0     // Catch:{ Exception -> 0x01e4 }
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.REV     // Catch:{ Exception -> 0x01e4 }
                r12 = 12
                r11[r12] = r0     // Catch:{ Exception -> 0x01e4 }
                r12 = 21388(0x538c, float:2.9971E-41)
                r10.mo160131h(r12, r11)     // Catch:{ Exception -> 0x01e4 }
                r10.mo182088q(r2, r5)     // Catch:{ Exception -> 0x01e4 }
                goto L_0x01ee
            L_0x01e4:
                r0 = move-exception
                java.lang.Object[] r2 = new java.lang.Object[r6]
                java.lang.String r10 = "VFS.DiskFileStatistics"
                java.lang.String r11 = "Cannot report wrong migration"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r10, r0, r11, r2)
            L_0x01ee:
                java.util.Map<java.lang.String, zh3.e> r0 = zh3.C119118e.f356727g     // Catch:{ Exception -> 0x02b1 }
                zt3.t r2 = zt3.C119157j.f356862d     // Catch:{ Exception -> 0x02b1 }
                com.tencent.mm.vfs.n r10 = new com.tencent.mm.vfs.n     // Catch:{ Exception -> 0x02b1 }
                r10.<init>(r1, r0, r7)     // Catch:{ Exception -> 0x02b1 }
                zt3.j r2 = (zt3.C119157j) r2     // Catch:{ Exception -> 0x02b1 }
                java.lang.String r0 = "saveDbFreePage"
                r2.mo183876g(r10, r0)     // Catch:{ Exception -> 0x02b1 }
                java.util.Map<java.lang.String, zh3.e> r0 = zh3.C119118e.f356728h     // Catch:{ Exception -> 0x02b1 }
                zt3.t r2 = zt3.C119157j.f356862d     // Catch:{ Exception -> 0x02b1 }
                com.tencent.mm.vfs.n r10 = new com.tencent.mm.vfs.n     // Catch:{ Exception -> 0x02b1 }
                r10.<init>(r1, r0, r6)     // Catch:{ Exception -> 0x02b1 }
                zt3.j r2 = (zt3.C119157j) r2     // Catch:{ Exception -> 0x02b1 }
                java.lang.String r0 = "saveDbFreePage"
                r2.mo183876g(r10, r0)     // Catch:{ Exception -> 0x02b1 }
                long r10 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x02b1 }
                com.tencent.mm.vfs.NativeFileSystem r0 = new com.tencent.mm.vfs.NativeFileSystem     // Catch:{ Exception -> 0x02b1 }
                java.lang.String r2 = "${data}/MicroMsg/${account}"
                r0.<init>((java.lang.String) r2)     // Catch:{ Exception -> 0x02b1 }
                com.tencent.mm.vfs.f0 r2 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ Exception -> 0x02b1 }
                java.util.Map r2 = r2.mo177791d()     // Catch:{ Exception -> 0x02b1 }
                com.tencent.mm.vfs.FileSystem$c r0 = r0.mo177578v(r2)     // Catch:{ Exception -> 0x02b1 }
                java.lang.String r2 = ""
                java.lang.Iterable r0 = r0.list(r2)     // Catch:{ Exception -> 0x02b1 }
                if (r0 != 0) goto L_0x022d
                goto L_0x02bb
            L_0x022d:
                java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x02b1 }
            L_0x0231:
                boolean r2 = r0.hasNext()     // Catch:{ Exception -> 0x02b1 }
                if (r2 == 0) goto L_0x02bb
                java.lang.Object r2 = r0.next()     // Catch:{ Exception -> 0x02b1 }
                com.tencent.mm.vfs.b0 r2 = (com.tencent.p014mm.vfs.C86001b0) r2     // Catch:{ Exception -> 0x02b1 }
                boolean r12 = r2.f250476f     // Catch:{ Exception -> 0x02b1 }
                if (r12 != 0) goto L_0x0231
                java.lang.String r12 = r2.f250472b     // Catch:{ Exception -> 0x02b1 }
                java.lang.String r13 = ".db"
                boolean r12 = r12.endsWith(r13)     // Catch:{ Exception -> 0x02b1 }
                if (r12 != 0) goto L_0x024c
                goto L_0x0231
            L_0x024c:
                java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02b1 }
                r12.<init>()     // Catch:{ Exception -> 0x02b1 }
                java.lang.String r13 = "${data}/MicroMsg/${account}/"
                r12.append(r13)     // Catch:{ Exception -> 0x02b1 }
                java.lang.String r13 = r2.f250472b     // Catch:{ Exception -> 0x02b1 }
                r12.append(r13)     // Catch:{ Exception -> 0x02b1 }
                java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x02b1 }
                com.tencent.mm.vfs.o$b r13 = new com.tencent.mm.vfs.o$b     // Catch:{ Exception -> 0x02b1 }
                java.lang.String r22 = "@DiskSpace-DB"
                long r14 = r2.f250474d     // Catch:{ Exception -> 0x02b1 }
                r28 = 1
                r29 = 0
                r30 = 1
                long r4 = r2.f250473c     // Catch:{ Exception -> 0x02b1 }
                long r8 = r2.f250475e     // Catch:{ Exception -> 0x02b1 }
                long r33 = r8 - r10
                r35 = 0
                r37 = 0
                r23 = 12
                r24 = 0
                r21 = r13
                r25 = r12
                r26 = r14
                r31 = r4
                r21.<init>(r22, r23, r24, r25, r26, r28, r29, r30, r31, r33, r35, r37)     // Catch:{ Exception -> 0x02b1 }
                java.lang.Object r2 = com.tencent.p014mm.vfs.C116314o.f349036g     // Catch:{ Exception -> 0x02b1 }
                monitor-enter(r2)     // Catch:{ Exception -> 0x02b1 }
                java.util.Map<java.lang.String, com.tencent.mm.vfs.o$b> r4 = com.tencent.p014mm.vfs.C116314o.f349038i     // Catch:{ all -> 0x02ae }
                if (r4 != 0) goto L_0x028d
                java.util.Map<java.lang.String, com.tencent.mm.vfs.o$b> r4 = com.tencent.p014mm.vfs.C116314o.f349037h     // Catch:{ all -> 0x02ae }
            L_0x028d:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x02ae }
                r5.<init>()     // Catch:{ all -> 0x02ae }
                r5.append(r12)     // Catch:{ all -> 0x02ae }
                r8 = 124(0x7c, float:1.74E-43)
                r5.append(r8)     // Catch:{ all -> 0x02ae }
                java.lang.String r8 = "@DiskSpace-DB"
                r5.append(r8)     // Catch:{ all -> 0x02ae }
                java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x02ae }
                r4.put(r5, r13)     // Catch:{ all -> 0x02ae }
                monitor-exit(r2)     // Catch:{ all -> 0x02ae }
                r4 = 13
                r5 = 4
                r8 = 0
                r15 = 6
                goto L_0x0231
            L_0x02ae:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x02ae }
                throw r0     // Catch:{ Exception -> 0x02b1 }
            L_0x02b1:
                r0 = move-exception
                java.lang.String r2 = "VFS.DiskFileStatistics"
                java.lang.String r4 = "Failed to calculate databases."
                java.lang.Object[] r5 = new java.lang.Object[r6]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r4, r5)
            L_0x02bb:
                oa1.d r0 = oa1.C117731d.m166007c()
                java.lang.String r2 = "clicfg_diskspace_force_report"
                java.lang.String r4 = "0"
                java.lang.String r0 = r0.mo182444f(r2, r4, r7, r7)
                java.lang.String r2 = "1"
                boolean r0 = r2.equals(r0)
                if (r0 != 0) goto L_0x0306
                oa1.d r0 = oa1.C117731d.m166007c()
                r2 = 1024(0x400, float:1.435E-42)
                java.lang.String r4 = java.lang.String.valueOf(r2)
                java.lang.String r5 = "clicfg_vfs_statistics_sampling_factor"
                java.lang.String r0 = r0.mo182444f(r5, r4, r6, r6)
                int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r2)
                int r4 = com.tencent.p014mm.vfs.C116314o.f349035f
                f40.e r5 = f40.C86709a0.m107523b()
                int r5 = r5.mo121110g()
                r4 = r4 ^ r5
                int r5 = com.tencent.p014mm.sdk.platformtools.BuildInfo.CLIENT_VERSION_INT
                r4 = r4 ^ r5
                if (r0 != 0) goto L_0x02f4
                goto L_0x02f5
            L_0x02f4:
                r2 = r0
            L_0x02f5:
                int r4 = r4 % r2
                if (r4 != 0) goto L_0x02fa
                r0 = 1
                goto L_0x02fb
            L_0x02fa:
                r0 = 0
            L_0x02fb:
                if (r0 != 0) goto L_0x0306
                boolean r0 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
                if (r0 == 0) goto L_0x0304
                goto L_0x0306
            L_0x0304:
                r0 = 0
                goto L_0x0307
            L_0x0306:
                r0 = 1
            L_0x0307:
                java.lang.Object r2 = com.tencent.p014mm.vfs.C116314o.f349036g
                monitor-enter(r2)
                java.util.Map<java.lang.String, com.tencent.mm.vfs.o$b> r4 = com.tencent.p014mm.vfs.C116314o.f349038i     // Catch:{ all -> 0x05d0 }
                com.tencent.p014mm.vfs.C116314o.f349037h = r4     // Catch:{ all -> 0x05d0 }
                java.util.Collection r4 = r4.values()     // Catch:{ all -> 0x05d0 }
                java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x05d0 }
                r5 = 0
            L_0x0317:
                boolean r8 = r4.hasNext()     // Catch:{ all -> 0x05d0 }
                r9 = 14
                if (r8 == 0) goto L_0x042a
                java.lang.Object r8 = r4.next()     // Catch:{ all -> 0x05d0 }
                com.tencent.mm.vfs.o$b r8 = (com.tencent.p014mm.vfs.C116314o.C116316b) r8     // Catch:{ all -> 0x05d0 }
                java.util.Set<com.tencent.mm.vfs.o$c> r10 = com.tencent.p014mm.vfs.C116314o.f349046q     // Catch:{ all -> 0x05d0 }
                java.util.HashSet r10 = (java.util.HashSet) r10     // Catch:{ all -> 0x05d0 }
                java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x05d0 }
            L_0x032d:
                boolean r11 = r10.hasNext()     // Catch:{ all -> 0x05d0 }
                if (r11 == 0) goto L_0x0341
                java.lang.Object r11 = r10.next()     // Catch:{ all -> 0x05d0 }
                com.tencent.mm.vfs.o$c r11 = (com.tencent.p014mm.vfs.C116314o.C116317c) r11     // Catch:{ all -> 0x05d0 }
                boolean r11 = r11.mo177816b(r8)     // Catch:{ all -> 0x05d0 }
                if (r11 == 0) goto L_0x032d
                r10 = 1
                goto L_0x0342
            L_0x0341:
                r10 = 0
            L_0x0342:
                if (r10 != 0) goto L_0x0317
                if (r0 == 0) goto L_0x03cb
                long r10 = r8.f349059e     // Catch:{ all -> 0x05d0 }
                r12 = 0
                int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r14 <= 0) goto L_0x03cb
                kj2.d r10 = kj2.C117407d.INSTANCE     // Catch:{ all -> 0x05d0 }
                java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ all -> 0x05d0 }
                java.lang.String r11 = r8.f349055a     // Catch:{ all -> 0x05d0 }
                r9[r6] = r11     // Catch:{ all -> 0x05d0 }
                int r11 = r8.f349056b     // Catch:{ all -> 0x05d0 }
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x05d0 }
                r9[r7] = r11     // Catch:{ all -> 0x05d0 }
                int r11 = r8.f349057c     // Catch:{ all -> 0x05d0 }
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x05d0 }
                r12 = 2
                r9[r12] = r11     // Catch:{ all -> 0x05d0 }
                java.lang.String r11 = r8.f349058d     // Catch:{ all -> 0x05d0 }
                r9[r3] = r11     // Catch:{ all -> 0x05d0 }
                long r11 = r8.f349059e     // Catch:{ all -> 0x05d0 }
                java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x05d0 }
                r12 = 4
                r9[r12] = r11     // Catch:{ all -> 0x05d0 }
                int r11 = r8.f349060f     // Catch:{ all -> 0x05d0 }
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x05d0 }
                r9[r16] = r11     // Catch:{ all -> 0x05d0 }
                int r11 = r8.f349061g     // Catch:{ all -> 0x05d0 }
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x05d0 }
                r12 = 6
                r9[r12] = r11     // Catch:{ all -> 0x05d0 }
                int r11 = r8.f349062h     // Catch:{ all -> 0x05d0 }
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x05d0 }
                r12 = 7
                r9[r12] = r11     // Catch:{ all -> 0x05d0 }
                long r11 = r8.f349063i     // Catch:{ all -> 0x05d0 }
                java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x05d0 }
                r12 = 8
                r9[r12] = r11     // Catch:{ all -> 0x05d0 }
                r11 = 0
                java.lang.Long r13 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x05d0 }
                r11 = 9
                r9[r11] = r13     // Catch:{ all -> 0x05d0 }
                long r11 = r8.f349064j     // Catch:{ all -> 0x05d0 }
                java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x05d0 }
                r12 = 10
                r9[r12] = r11     // Catch:{ all -> 0x05d0 }
                long r11 = r8.f349065k     // Catch:{ all -> 0x05d0 }
                java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x05d0 }
                r12 = 11
                r9[r12] = r11     // Catch:{ all -> 0x05d0 }
                long r11 = r8.f349066l     // Catch:{ all -> 0x05d0 }
                java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x05d0 }
                r12 = 12
                r9[r12] = r11     // Catch:{ all -> 0x05d0 }
                java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.BuildInfo.REV     // Catch:{ all -> 0x05d0 }
                r12 = 13
                r9[r12] = r11     // Catch:{ all -> 0x05d0 }
                r11 = 21388(0x538c, float:2.9971E-41)
                r10.mo160131h(r11, r9)     // Catch:{ all -> 0x05d0 }
            L_0x03cb:
                java.lang.String r9 = "VFS.DiskFileStatistics"
                java.lang.String r10 = "KV > name: %s, type: %d, flags: %d, path: %s, totalSize: %d, fileCount: %d, dirCount: %d, maxDepth: %d, maxFileSize: %d, filesAge: %d"
                r11 = 10
                java.lang.Object[] r12 = new java.lang.Object[r11]     // Catch:{ all -> 0x05d0 }
                java.lang.String r11 = r8.f349055a     // Catch:{ all -> 0x05d0 }
                r12[r6] = r11     // Catch:{ all -> 0x05d0 }
                int r11 = r8.f349056b     // Catch:{ all -> 0x05d0 }
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x05d0 }
                r12[r7] = r11     // Catch:{ all -> 0x05d0 }
                int r11 = r8.f349057c     // Catch:{ all -> 0x05d0 }
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x05d0 }
                r13 = 2
                r12[r13] = r11     // Catch:{ all -> 0x05d0 }
                java.lang.String r11 = r8.f349058d     // Catch:{ all -> 0x05d0 }
                r12[r3] = r11     // Catch:{ all -> 0x05d0 }
                long r14 = r8.f349059e     // Catch:{ all -> 0x05d0 }
                java.lang.Long r13 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x05d0 }
                r14 = 4
                r12[r14] = r13     // Catch:{ all -> 0x05d0 }
                int r13 = r8.f349060f     // Catch:{ all -> 0x05d0 }
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x05d0 }
                r12[r16] = r13     // Catch:{ all -> 0x05d0 }
                int r13 = r8.f349061g     // Catch:{ all -> 0x05d0 }
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x05d0 }
                r14 = 6
                r12[r14] = r13     // Catch:{ all -> 0x05d0 }
                int r13 = r8.f349062h     // Catch:{ all -> 0x05d0 }
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x05d0 }
                r14 = 7
                r12[r14] = r13     // Catch:{ all -> 0x05d0 }
                long r13 = r8.f349063i     // Catch:{ all -> 0x05d0 }
                java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x05d0 }
                r14 = 8
                r12[r14] = r13     // Catch:{ all -> 0x05d0 }
                long r13 = r8.f349064j     // Catch:{ all -> 0x05d0 }
                java.lang.Long r8 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x05d0 }
                r13 = 9
                r12[r13] = r8     // Catch:{ all -> 0x05d0 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r10, r12)     // Catch:{ all -> 0x05d0 }
                int r5 = r5 + 1
                goto L_0x0317
            L_0x042a:
                java.util.Set<com.tencent.mm.vfs.o$c> r4 = com.tencent.p014mm.vfs.C116314o.f349046q     // Catch:{ all -> 0x05d0 }
                java.util.HashSet r4 = (java.util.HashSet) r4     // Catch:{ all -> 0x05d0 }
                java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x05d0 }
            L_0x0432:
                boolean r8 = r4.hasNext()     // Catch:{ all -> 0x05d0 }
                if (r8 == 0) goto L_0x05a1
                java.lang.Object r8 = r4.next()     // Catch:{ all -> 0x05d0 }
                com.tencent.mm.vfs.o$c r8 = (com.tencent.p014mm.vfs.C116314o.C116317c) r8     // Catch:{ all -> 0x05d0 }
                boolean r10 = r8.f349077k     // Catch:{ all -> 0x05d0 }
                if (r10 == 0) goto L_0x047e
                com.tencent.mm.vfs.o$b r10 = new com.tencent.mm.vfs.o$b     // Catch:{ all -> 0x05d0 }
                java.lang.String r12 = r8.f349067a     // Catch:{ all -> 0x05d0 }
                int r13 = r8.f349068b     // Catch:{ all -> 0x05d0 }
                int r14 = r8.f349069c     // Catch:{ all -> 0x05d0 }
                java.lang.String r15 = r8.f349070d     // Catch:{ all -> 0x05d0 }
                r39 = r4
                long r3 = r8.f349071e     // Catch:{ all -> 0x05d0 }
                int r11 = r8.f349072f     // Catch:{ all -> 0x05d0 }
                int r7 = r8.f349073g     // Catch:{ all -> 0x05d0 }
                int r6 = r8.f349074h     // Catch:{ all -> 0x05d0 }
                r40 = r10
                long r9 = r8.f349075i     // Catch:{ all -> 0x05d0 }
                r41 = r2
                long r1 = r8.f349076j     // Catch:{ all -> 0x05d5 }
                r35 = 0
                r37 = 0
                r21 = r40
                r22 = r12
                r23 = r13
                r24 = r14
                r25 = r15
                r26 = r3
                r28 = r11
                r29 = r7
                r30 = r6
                r31 = r9
                r33 = r1
                r21.<init>(r22, r23, r24, r25, r26, r28, r29, r30, r31, r33, r35, r37)     // Catch:{ all -> 0x05d5 }
                r1 = r40
                goto L_0x0483
            L_0x047e:
                r41 = r2
                r39 = r4
                r1 = 0
            L_0x0483:
                if (r1 == 0) goto L_0x0583
                if (r0 == 0) goto L_0x0512
                long r2 = r1.f349059e     // Catch:{ all -> 0x05d5 }
                r6 = 0
                int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                if (r4 <= 0) goto L_0x0512
                kj2.d r2 = kj2.C117407d.INSTANCE     // Catch:{ all -> 0x05d5 }
                r3 = 14
                java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x05d5 }
                java.lang.String r6 = r1.f349055a     // Catch:{ all -> 0x05d5 }
                r7 = 0
                r4[r7] = r6     // Catch:{ all -> 0x05d5 }
                int r6 = r1.f349056b     // Catch:{ all -> 0x05d5 }
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x05d5 }
                r7 = 1
                r4[r7] = r6     // Catch:{ all -> 0x05d5 }
                int r6 = r1.f349057c     // Catch:{ all -> 0x05d5 }
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x05d5 }
                r7 = 2
                r4[r7] = r6     // Catch:{ all -> 0x05d5 }
                java.lang.String r6 = r1.f349058d     // Catch:{ all -> 0x05d5 }
                r7 = 3
                r4[r7] = r6     // Catch:{ all -> 0x05d5 }
                long r6 = r1.f349059e     // Catch:{ all -> 0x05d5 }
                java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x05d5 }
                r7 = 4
                r4[r7] = r6     // Catch:{ all -> 0x05d5 }
                int r6 = r1.f349060f     // Catch:{ all -> 0x05d5 }
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x05d5 }
                r4[r16] = r6     // Catch:{ all -> 0x05d5 }
                int r6 = r1.f349061g     // Catch:{ all -> 0x05d5 }
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x05d5 }
                r7 = 6
                r4[r7] = r6     // Catch:{ all -> 0x05d5 }
                int r6 = r1.f349062h     // Catch:{ all -> 0x05d5 }
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x05d5 }
                r7 = 7
                r4[r7] = r6     // Catch:{ all -> 0x05d5 }
                long r6 = r1.f349063i     // Catch:{ all -> 0x05d5 }
                java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x05d5 }
                r7 = 8
                r4[r7] = r6     // Catch:{ all -> 0x05d5 }
                r6 = 0
                java.lang.Long r8 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x05d5 }
                r9 = 9
                r4[r9] = r8     // Catch:{ all -> 0x05d5 }
                long r8 = r1.f349064j     // Catch:{ all -> 0x05d5 }
                java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x05d5 }
                r9 = 10
                r4[r9] = r8     // Catch:{ all -> 0x05d5 }
                long r8 = r1.f349065k     // Catch:{ all -> 0x05d5 }
                java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x05d5 }
                r9 = 11
                r4[r9] = r8     // Catch:{ all -> 0x05d5 }
                long r10 = r1.f349066l     // Catch:{ all -> 0x05d5 }
                java.lang.Long r8 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x05d5 }
                r10 = 12
                r4[r10] = r8     // Catch:{ all -> 0x05d5 }
                java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.BuildInfo.REV     // Catch:{ all -> 0x05d5 }
                r11 = 13
                r4[r11] = r8     // Catch:{ all -> 0x05d5 }
                r8 = 21388(0x538c, float:2.9971E-41)
                r2.mo160131h(r8, r4)     // Catch:{ all -> 0x05d5 }
                goto L_0x051e
            L_0x0512:
                r3 = 14
                r6 = 0
                r8 = 21388(0x538c, float:2.9971E-41)
                r9 = 11
                r10 = 12
                r11 = 13
            L_0x051e:
                java.lang.String r2 = "VFS.DiskFileStatistics"
                java.lang.String r4 = "KV > name: %s, type: %d, flags: %d, path: %s, totalSize: %d, fileCount: %d, dirCount: %d, maxDepth: %d, maxFileSize: %d, filesAge: %d"
                r12 = 10
                java.lang.Object[] r13 = new java.lang.Object[r12]     // Catch:{ all -> 0x05d5 }
                java.lang.String r15 = r1.f349055a     // Catch:{ all -> 0x05d5 }
                r17 = 0
                r13[r17] = r15     // Catch:{ all -> 0x05d5 }
                int r15 = r1.f349056b     // Catch:{ all -> 0x05d5 }
                java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x05d5 }
                r17 = 1
                r13[r17] = r15     // Catch:{ all -> 0x05d5 }
                int r15 = r1.f349057c     // Catch:{ all -> 0x05d5 }
                java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x05d5 }
                r14 = 2
                r13[r14] = r15     // Catch:{ all -> 0x05d5 }
                java.lang.String r15 = r1.f349058d     // Catch:{ all -> 0x05d5 }
                r17 = 3
                r13[r17] = r15     // Catch:{ all -> 0x05d5 }
                long r6 = r1.f349059e     // Catch:{ all -> 0x05d5 }
                java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x05d5 }
                r7 = 4
                r13[r7] = r6     // Catch:{ all -> 0x05d5 }
                int r6 = r1.f349060f     // Catch:{ all -> 0x05d5 }
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x05d5 }
                r13[r16] = r6     // Catch:{ all -> 0x05d5 }
                int r6 = r1.f349061g     // Catch:{ all -> 0x05d5 }
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x05d5 }
                r15 = 6
                r13[r15] = r6     // Catch:{ all -> 0x05d5 }
                int r6 = r1.f349062h     // Catch:{ all -> 0x05d5 }
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x05d5 }
                r19 = 7
                r13[r19] = r6     // Catch:{ all -> 0x05d5 }
                long r7 = r1.f349063i     // Catch:{ all -> 0x05d5 }
                java.lang.Long r6 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x05d5 }
                r7 = 8
                r13[r7] = r6     // Catch:{ all -> 0x05d5 }
                long r7 = r1.f349064j     // Catch:{ all -> 0x05d5 }
                java.lang.Long r1 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x05d5 }
                r6 = 9
                r13[r6] = r1     // Catch:{ all -> 0x05d5 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r13)     // Catch:{ all -> 0x05d5 }
                int r5 = r5 + 1
                goto L_0x0594
            L_0x0583:
                r3 = 14
                r6 = 9
                r9 = 11
                r10 = 12
                r11 = 13
                r12 = 10
                r15 = 6
                r17 = 3
                r19 = 7
            L_0x0594:
                r1 = r42
                r4 = r39
                r2 = r41
                r3 = 3
                r6 = 0
                r7 = 1
                r9 = 14
                goto L_0x0432
            L_0x05a1:
                r41 = r2
                if (r0 == 0) goto L_0x05a8
                com.tencent.p014mm.vfs.C116314o.m163916b()     // Catch:{ all -> 0x05d5 }
            L_0x05a8:
                java.lang.String r0 = "VFS.DiskFileStatistics"
                java.lang.String r1 = "End statistics maintenance, reported: %d, count: %d"
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x05d5 }
                java.lang.Integer r3 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x05d5 }
                r4 = 0
                r2[r4] = r3     // Catch:{ all -> 0x05d5 }
                java.util.Map<java.lang.String, com.tencent.mm.vfs.o$b> r3 = com.tencent.p014mm.vfs.C116314o.f349038i     // Catch:{ all -> 0x05d5 }
                int r3 = r3.size()     // Catch:{ all -> 0x05d5 }
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x05d5 }
                r4 = 1
                r2[r4] = r3     // Catch:{ all -> 0x05d5 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r2)     // Catch:{ all -> 0x05d5 }
                r1 = 0
                com.tencent.p014mm.vfs.C116314o.f349038i = r1     // Catch:{ all -> 0x05d5 }
                com.tencent.p014mm.vfs.C116314o.f349039j = r4     // Catch:{ all -> 0x05d5 }
                monitor-exit(r41)     // Catch:{ all -> 0x05d5 }
                com.tencent.p014mm.vfs.C116314o.m163917c()
                goto L_0x0601
            L_0x05d0:
                r0 = move-exception
                r41 = r2
            L_0x05d3:
                monitor-exit(r41)     // Catch:{ all -> 0x05d5 }
                throw r0
            L_0x05d5:
                r0 = move-exception
                goto L_0x05d3
            L_0x05d7:
                java.lang.Object r1 = com.tencent.p014mm.vfs.C116314o.f349036g
                monitor-enter(r1)
                java.lang.String r0 = "VFS.DiskFileStatistics"
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0602 }
                r2.<init>()     // Catch:{ all -> 0x0602 }
                java.lang.String r3 = "Interrupted statistics maintenance, statistics count: "
                r2.append(r3)     // Catch:{ all -> 0x0602 }
                java.util.Map<java.lang.String, com.tencent.mm.vfs.o$b> r3 = com.tencent.p014mm.vfs.C116314o.f349038i     // Catch:{ all -> 0x0602 }
                int r3 = r3.size()     // Catch:{ all -> 0x0602 }
                r2.append(r3)     // Catch:{ all -> 0x0602 }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0602 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)     // Catch:{ all -> 0x0602 }
                java.util.Map<java.lang.String, com.tencent.mm.vfs.o$b> r0 = com.tencent.p014mm.vfs.C116314o.f349037h     // Catch:{ all -> 0x0602 }
                java.util.Map<java.lang.String, com.tencent.mm.vfs.o$b> r2 = com.tencent.p014mm.vfs.C116314o.f349038i     // Catch:{ all -> 0x0602 }
                r0.putAll(r2)     // Catch:{ all -> 0x0602 }
                r2 = 0
                com.tencent.p014mm.vfs.C116314o.f349038i = r2     // Catch:{ all -> 0x0602 }
                monitor-exit(r1)     // Catch:{ all -> 0x0602 }
            L_0x0601:
                return
            L_0x0602:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0602 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.vfs.C116314o.C116315a.mo177784c(boolean, boolean, android.os.CancellationSignal):void");
        }
    }

    /* renamed from: com.tencent.mm.vfs.o$b */
    public static final class C116316b {

        /* renamed from: a */
        public final String f349055a;

        /* renamed from: b */
        public final int f349056b;

        /* renamed from: c */
        public final int f349057c;

        /* renamed from: d */
        public final String f349058d;

        /* renamed from: e */
        public final long f349059e;

        /* renamed from: f */
        public final int f349060f;

        /* renamed from: g */
        public final int f349061g;

        /* renamed from: h */
        public final int f349062h;

        /* renamed from: i */
        public final long f349063i;

        /* renamed from: j */
        public final long f349064j;

        /* renamed from: k */
        public final long f349065k;

        /* renamed from: l */
        public final long f349066l;

        public C116316b(String str, int i, int i2, String str2, long j, int i3, int i4, int i5, long j2, long j3, long j4, long j5) {
            this.f349055a = str;
            this.f349056b = i;
            this.f349057c = i2;
            this.f349058d = str2;
            this.f349059e = j;
            this.f349060f = i3;
            this.f349061g = i4;
            this.f349062h = i5;
            this.f349063i = j2;
            this.f349064j = j3;
            this.f349065k = j4;
            this.f349066l = j5;
        }
    }

    /* renamed from: com.tencent.mm.vfs.o$c */
    public static abstract class C116317c {

        /* renamed from: a */
        public final String f349067a;

        /* renamed from: b */
        public final int f349068b;

        /* renamed from: c */
        public final int f349069c;

        /* renamed from: d */
        public final String f349070d;

        /* renamed from: e */
        public long f349071e = 0;

        /* renamed from: f */
        public int f349072f = 0;

        /* renamed from: g */
        public int f349073g = 0;

        /* renamed from: h */
        public int f349074h = 0;

        /* renamed from: i */
        public long f349075i = 0;

        /* renamed from: j */
        public long f349076j = 0;

        /* renamed from: k */
        public boolean f349077k = false;

        public C116317c(String str, int i, int i2, String str2) {
            this.f349067a = str;
            this.f349068b = i;
            this.f349069c = i2;
            this.f349070d = str2;
        }

        /* renamed from: a */
        public abstract boolean mo177815a(C116316b bVar);

        /* renamed from: b */
        public boolean mo177816b(C116316b bVar) {
            if (!mo177815a(bVar)) {
                return false;
            }
            int i = this.f349072f;
            if (i == 0) {
                this.f349076j = bVar.f349064j;
            } else {
                long j = (this.f349076j * ((long) i)) + bVar.f349064j;
                int i2 = bVar.f349060f;
                this.f349076j = (j + ((long) i2)) / ((long) (i2 + i));
            }
            this.f349071e += bVar.f349059e;
            this.f349072f = i + bVar.f349060f;
            this.f349073g += bVar.f349061g;
            int i3 = bVar.f349062h;
            if (i3 > this.f349074h) {
                this.f349074h = i3;
            }
            long j2 = bVar.f349063i;
            if (j2 > this.f349075i) {
                this.f349075i = j2;
            }
            this.f349077k = true;
            return true;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C116317c)) {
                return false;
            }
            C116317c cVar = (C116317c) obj;
            return Objects.equals(this.f349067a, cVar.f349067a) && Objects.equals(this.f349070d, cVar.f349070d) && this.f349068b == cVar.f349068b && this.f349069c == cVar.f349069c;
        }

        public int hashCode() {
            return ((this.f349067a.hashCode() ^ this.f349070d.hashCode()) ^ (this.f349068b << 16)) ^ this.f349069c;
        }
    }

    static {
        long nanoTime = System.nanoTime();
        Random random = new Random();
        random.setSeed(nanoTime);
        f349035f = random.nextInt();
    }

    public C116314o(String str, int i, int i2, long j, long j2) {
        this.f349050a = str;
        this.f349051b = i;
        this.f349052c = i2;
        this.f349053d = j;
        this.f349054e = j2;
    }

    /* renamed from: b */
    public static void m163916b() {
        File file = new File(C112760b.m154216X());
        C117407d dVar = C117407d.INSTANCE;
        dVar.mo160131h(21388, "@TotalSpace-Data", 0, 0, file.getAbsolutePath(), Long.valueOf(file.getUsableSpace()), 0, 0, 0, Long.valueOf(file.getTotalSpace()), 0, 0, 0, 0, BuildInfo.REV);
        File file2 = new File(C112760b.m154230f0());
        dVar.mo160131h(21388, "@TotalSpace-SDCard", 0, 0, file2.getAbsolutePath(), Long.valueOf(file2.getUsableSpace()), 0, 0, 0, Long.valueOf(file2.getTotalSpace()), 0, 0, 0, 0, BuildInfo.REV);
    }

    /* JADX WARNING: Removed duplicated region for block: B:73:0x0205 A[Catch:{ all -> 0x0413, all -> 0x041b, IOException | JSONException -> 0x0424 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0217 A[Catch:{ all -> 0x0413, all -> 0x041b, IOException | JSONException -> 0x0424 }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m163917c() {
        /*
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            r2.<init>()     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            r3.<init>()     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            java.lang.Object r4 = f349036g     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            monitor-enter(r4)     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            java.util.Map<java.lang.String, com.tencent.mm.vfs.o$b> r0 = f349037h     // Catch:{ all -> 0x0421 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x0421 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0421 }
            r5 = 0
            r7 = r5
            r10 = r7
            r12 = r10
            r14 = r12
            r16 = r14
            r18 = r16
            r20 = r18
            r22 = r20
            r24 = r22
            r26 = r24
            r28 = r26
            r30 = r28
            r32 = r30
            r34 = r32
            r36 = r34
            r38 = r36
            r9 = 0
        L_0x0036:
            boolean r40 = r0.hasNext()     // Catch:{ all -> 0x0421 }
            if (r40 == 0) goto L_0x022d
            java.lang.Object r40 = r0.next()     // Catch:{ all -> 0x0421 }
            r1 = r40
            com.tencent.mm.vfs.o$b r1 = (com.tencent.p014mm.vfs.C116314o.C116316b) r1     // Catch:{ all -> 0x0421 }
            r40 = r0
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x0421 }
            r0.<init>()     // Catch:{ all -> 0x0421 }
            r41 = r9
            java.lang.String r9 = "name"
            r42 = r14
            java.lang.String r14 = r1.f349055a     // Catch:{ all -> 0x0421 }
            org.json.JSONObject r0 = r0.put(r9, r14)     // Catch:{ all -> 0x0421 }
            java.lang.String r9 = "type"
            int r14 = r1.f349056b     // Catch:{ all -> 0x0421 }
            org.json.JSONObject r0 = r0.put(r9, r14)     // Catch:{ all -> 0x0421 }
            java.lang.String r9 = "flags"
            int r14 = r1.f349057c     // Catch:{ all -> 0x0421 }
            org.json.JSONObject r0 = r0.put(r9, r14)     // Catch:{ all -> 0x0421 }
            java.lang.String r9 = "path"
            java.lang.String r14 = r1.f349058d     // Catch:{ all -> 0x0421 }
            org.json.JSONObject r0 = r0.put(r9, r14)     // Catch:{ all -> 0x0421 }
            java.lang.String r9 = "totalSize"
            long r14 = r1.f349059e     // Catch:{ all -> 0x0421 }
            org.json.JSONObject r0 = r0.put(r9, r14)     // Catch:{ all -> 0x0421 }
            java.lang.String r9 = "fileCount"
            int r14 = r1.f349060f     // Catch:{ all -> 0x0421 }
            org.json.JSONObject r0 = r0.put(r9, r14)     // Catch:{ all -> 0x0421 }
            java.lang.String r9 = "dirCount"
            int r14 = r1.f349061g     // Catch:{ all -> 0x0421 }
            org.json.JSONObject r0 = r0.put(r9, r14)     // Catch:{ all -> 0x0421 }
            java.lang.String r9 = "maxDepth"
            int r14 = r1.f349062h     // Catch:{ all -> 0x0421 }
            org.json.JSONObject r0 = r0.put(r9, r14)     // Catch:{ all -> 0x0421 }
            java.lang.String r9 = "maxFileSize"
            long r14 = r1.f349063i     // Catch:{ all -> 0x0421 }
            org.json.JSONObject r0 = r0.put(r9, r14)     // Catch:{ all -> 0x0421 }
            java.lang.String r9 = "filesAge"
            long r14 = r1.f349064j     // Catch:{ all -> 0x0421 }
            org.json.JSONObject r0 = r0.put(r9, r14)     // Catch:{ all -> 0x0421 }
            java.lang.String r9 = "targetSize"
            long r14 = r1.f349065k     // Catch:{ all -> 0x0421 }
            org.json.JSONObject r0 = r0.put(r9, r14)     // Catch:{ all -> 0x0421 }
            java.lang.String r9 = "expireTime"
            long r14 = r1.f349066l     // Catch:{ all -> 0x0421 }
            org.json.JSONObject r0 = r0.put(r9, r14)     // Catch:{ all -> 0x0421 }
            r2.put(r0)     // Catch:{ all -> 0x0421 }
            long r14 = r1.f349059e     // Catch:{ all -> 0x0421 }
            r44 = 2147483648(0x80000000, double:1.0609978955E-314)
            int r9 = (r14 > r44 ? 1 : (r14 == r44 ? 0 : -1))
            if (r9 <= 0) goto L_0x00c1
            r3.put(r0)     // Catch:{ all -> 0x0421 }
            goto L_0x00e2
        L_0x00c1:
            java.lang.String r9 = r1.f349055a     // Catch:{ all -> 0x0421 }
            java.lang.String r14 = "xlog"
            boolean r9 = r9.equals(r14)     // Catch:{ all -> 0x0421 }
            if (r9 != 0) goto L_0x00d5
            java.lang.String r9 = r1.f349055a     // Catch:{ all -> 0x0421 }
            java.lang.String r14 = "xlogPrivate"
            boolean r9 = r9.equals(r14)     // Catch:{ all -> 0x0421 }
            if (r9 == 0) goto L_0x00e2
        L_0x00d5:
            long r14 = r1.f349059e     // Catch:{ all -> 0x0421 }
            long r5 = r5 + r14
            r44 = 524288000(0x1f400000, double:2.590326893E-315)
            int r9 = (r14 > r44 ? 1 : (r14 == r44 ? 0 : -1))
            if (r9 <= 0) goto L_0x00e2
            r3.put(r0)     // Catch:{ all -> 0x0421 }
        L_0x00e2:
            int r9 = r1.f349056b     // Catch:{ all -> 0x0421 }
            r14 = 5
            if (r9 == r14) goto L_0x01e8
            r14 = 9
            if (r9 != r14) goto L_0x00ed
            goto L_0x01e8
        L_0x00ed:
            r14 = 1
            if (r9 != r14) goto L_0x018f
            long r14 = r1.f349059e     // Catch:{ all -> 0x0421 }
            r44 = r2
            r45 = r3
            r2 = r22
            long r22 = r2 + r14
            java.lang.String r2 = r1.f349055a     // Catch:{ all -> 0x0421 }
            java.lang.String r3 = "image2"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0421 }
            if (r2 == 0) goto L_0x0114
            long r2 = r1.f349059e     // Catch:{ all -> 0x0421 }
            r14 = r20
            long r20 = r14 + r2
            r14 = r20
            r2 = r22
            r22 = r0
            r20 = r5
            goto L_0x0201
        L_0x0114:
            r14 = r20
            java.lang.String r2 = r1.f349055a     // Catch:{ all -> 0x0421 }
            java.lang.String r3 = "video"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0421 }
            if (r2 == 0) goto L_0x012e
            long r2 = r1.f349059e     // Catch:{ all -> 0x0421 }
            r20 = r5
            r5 = r28
            long r28 = r5 + r2
        L_0x0128:
            r2 = r22
            r22 = r0
            goto L_0x0201
        L_0x012e:
            r20 = r5
            r5 = r28
            java.lang.String r2 = r1.f349055a     // Catch:{ all -> 0x0421 }
            java.lang.String r3 = "record"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0421 }
            if (r2 == 0) goto L_0x0145
            long r2 = r1.f349059e     // Catch:{ all -> 0x0421 }
            r28 = r5
            r5 = r36
            long r36 = r5 + r2
            goto L_0x0128
        L_0x0145:
            r28 = r5
            r5 = r36
            java.lang.String r2 = r1.f349055a     // Catch:{ all -> 0x0421 }
            java.lang.String r3 = "attachment"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0421 }
            if (r2 == 0) goto L_0x015c
            long r2 = r1.f349059e     // Catch:{ all -> 0x0421 }
            r36 = r5
            r5 = r30
            long r30 = r5 + r2
            goto L_0x0128
        L_0x015c:
            r36 = r5
            r5 = r30
            java.lang.String r2 = r1.f349055a     // Catch:{ all -> 0x0421 }
            java.lang.String r3 = "Download"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0421 }
            if (r2 == 0) goto L_0x0173
            long r2 = r1.f349059e     // Catch:{ all -> 0x0421 }
            r30 = r5
            r5 = r32
            long r32 = r5 + r2
            goto L_0x0128
        L_0x0173:
            r30 = r5
            r5 = r32
            java.lang.String r2 = r1.f349055a     // Catch:{ all -> 0x0421 }
            java.lang.String r3 = "voice2"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0421 }
            if (r2 == 0) goto L_0x018a
            long r2 = r1.f349059e     // Catch:{ all -> 0x0421 }
            r32 = r5
            r5 = r34
            long r34 = r5 + r2
            goto L_0x0128
        L_0x018a:
            r32 = r5
            r5 = r34
            goto L_0x0128
        L_0x018f:
            r44 = r2
            r45 = r3
            r14 = r20
            r2 = r22
            r22 = r0
            r20 = r5
            r5 = r34
            r0 = 3
            if (r9 != r0) goto L_0x01ab
            r34 = r5
            long r5 = r1.f349059e     // Catch:{ all -> 0x0421 }
            r46 = r14
            r14 = r24
            long r24 = r14 + r5
            goto L_0x01ff
        L_0x01ab:
            r34 = r5
            r46 = r14
            r14 = r24
            r0 = 4
            if (r9 != r0) goto L_0x01bd
            long r5 = r1.f349059e     // Catch:{ all -> 0x0421 }
            r23 = r14
            r14 = r26
            long r26 = r14 + r5
            goto L_0x01fd
        L_0x01bd:
            r23 = r14
            r14 = r26
            r0 = 12
            if (r9 != r0) goto L_0x01c9
            long r5 = r1.f349059e     // Catch:{ all -> 0x0421 }
            long r10 = r10 + r5
            goto L_0x01fb
        L_0x01c9:
            r0 = 13
            if (r9 != r0) goto L_0x01d2
            long r5 = r1.f349059e     // Catch:{ all -> 0x0421 }
            long r16 = r16 + r5
            goto L_0x01fb
        L_0x01d2:
            r0 = 6
            if (r9 == r0) goto L_0x01e4
            r0 = 7
            if (r9 == r0) goto L_0x01e4
            r0 = 8
            if (r9 == r0) goto L_0x01e4
            r0 = 10
            if (r9 == r0) goto L_0x01e4
            r0 = 11
            if (r9 != r0) goto L_0x01fb
        L_0x01e4:
            long r5 = r1.f349059e     // Catch:{ all -> 0x0421 }
            long r7 = r7 + r5
            goto L_0x01fb
        L_0x01e8:
            r44 = r2
            r45 = r3
            r46 = r20
            r2 = r22
            r23 = r24
            r14 = r26
            r22 = r0
            r20 = r5
            long r5 = r1.f349059e     // Catch:{ all -> 0x0421 }
            long r12 = r12 + r5
        L_0x01fb:
            r26 = r14
        L_0x01fd:
            r24 = r23
        L_0x01ff:
            r14 = r46
        L_0x0201:
            int r0 = r1.f349056b     // Catch:{ all -> 0x0421 }
            if (r0 == 0) goto L_0x0217
            long r0 = r1.f349059e     // Catch:{ all -> 0x0421 }
            long r5 = r42 + r0
            long r18 = r18 + r0
            int r9 = (r0 > r38 ? 1 : (r0 == r38 ? 0 : -1))
            if (r9 <= 0) goto L_0x0214
            r38 = r0
            r9 = r22
            goto L_0x021b
        L_0x0214:
            r9 = r41
            goto L_0x021b
        L_0x0217:
            r9 = r41
            r5 = r42
        L_0x021b:
            r22 = r2
            r0 = r40
            r2 = r44
            r3 = r45
            r48 = r5
            r5 = r20
            r20 = r14
            r14 = r48
            goto L_0x0036
        L_0x022d:
            r44 = r2
            r45 = r3
            r41 = r9
            r42 = r14
            r46 = r20
            r2 = r22
            r23 = r24
            r14 = r26
            java.util.Set<com.tencent.mm.vfs.o$c> r0 = f349046q     // Catch:{ all -> 0x0421 }
            java.util.HashSet r0 = (java.util.HashSet) r0     // Catch:{ all -> 0x0421 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0421 }
            r20 = r5
            r5 = r18
            r48 = r12
            r12 = r16
            r16 = r48
        L_0x024f:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0421 }
            if (r1 == 0) goto L_0x0275
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0421 }
            com.tencent.mm.vfs.o$c r1 = (com.tencent.p014mm.vfs.C116314o.C116317c) r1     // Catch:{ all -> 0x0421 }
            int r9 = r1.f349068b     // Catch:{ all -> 0x0421 }
            r18 = r0
            r0 = 13
            if (r9 != r0) goto L_0x0269
            r25 = r7
            long r7 = r1.f349071e     // Catch:{ all -> 0x0421 }
            long r12 = r12 + r7
            goto L_0x026b
        L_0x0269:
            r25 = r7
        L_0x026b:
            if (r9 == 0) goto L_0x0270
            long r7 = r1.f349071e     // Catch:{ all -> 0x0421 }
            long r5 = r5 + r7
        L_0x0270:
            r0 = r18
            r7 = r25
            goto L_0x024f
        L_0x0275:
            r25 = r7
            monitor-exit(r4)     // Catch:{ all -> 0x0421 }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            java.lang.String r1 = "daily_storage_wechat_persist"
            r0.encode((java.lang.String) r1, (long) r2)     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            java.lang.String r1 = "daily_storage_wechat_expire"
            r2 = r23
            r0.encode((java.lang.String) r1, (long) r2)     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            java.lang.String r1 = "daily_storage_wechat_lru"
            r0.encode((java.lang.String) r1, (long) r14)     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            java.lang.String r1 = "daily_storage_wechat_database"
            r0.encode((java.lang.String) r1, (long) r10)     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            java.lang.String r1 = "daily_storage_webview"
            r0.encode((java.lang.String) r1, (long) r12)     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            java.lang.String r1 = "daily_storage_not_sorted"
            r7 = r25
            r0.encode((java.lang.String) r1, (long) r7)     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            java.lang.String r1 = "daily_other_storage_other_account"
            r12 = r16
            r0.encode((java.lang.String) r1, (long) r12)     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            java.lang.String r1 = "daily_storage_c2c_image2"
            r14 = r46
            r0.encode((java.lang.String) r1, (long) r14)     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            java.lang.String r1 = "daily_storage_c2c_video"
            r2 = r28
            r0.encode((java.lang.String) r1, (long) r2)     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            java.lang.String r1 = "daily_storage_c2c_attachment"
            r2 = r30
            r0.encode((java.lang.String) r1, (long) r2)     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            java.lang.String r1 = "daily_storage_c2c_download"
            r2 = r32
            r0.encode((java.lang.String) r1, (long) r2)     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            java.lang.String r1 = "daily_storage_c2c_voice2"
            r2 = r34
            r0.encode((java.lang.String) r1, (long) r2)     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            java.lang.String r1 = "daily_storage_c2c_record"
            r2 = r36
            r0.encode((java.lang.String) r1, (long) r2)     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            java.lang.String r1 = "daily_storage_xlog"
            r2 = r20
            r0.encode((java.lang.String) r1, (long) r2)     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            java.lang.String r1 = "daily_storage_latest_mt_time"
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            r0.encode((java.lang.String) r1, (long) r2)     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()     // Catch:{ all -> 0x0338 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0338 }
            r1.<init>()     // Catch:{ all -> 0x0338 }
            java.lang.String r2 = "other_storage_other_account_"
            r1.append(r2)     // Catch:{ all -> 0x0338 }
            f40.e r2 = f40.C86709a0.m107523b()     // Catch:{ all -> 0x0338 }
            java.lang.String r2 = r2.mo121111i()     // Catch:{ all -> 0x0338 }
            r1.append(r2)     // Catch:{ all -> 0x0338 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0338 }
            r0.encode((java.lang.String) r1, (long) r12)     // Catch:{ all -> 0x0338 }
            goto L_0x0353
        L_0x0338:
            r0 = move-exception
            java.lang.String r1 = "VFS.DiskFileStatistics"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            r2.<init>()     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            java.lang.String r3 = "encode other_storage_other_account failed : "
            r2.append(r3)     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            r2.append(r0)     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            java.lang.String r0 = r2.toString()     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
        L_0x0353:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            r0.<init>()     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            java.lang.String r1 = "version"
            r2 = 1
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            java.lang.String r1 = "content"
            r2 = r44
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            java.io.File r1 = r1.getFilesDir()     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            java.lang.String r3 = "vfs-statistics"
            if (r1 != 0) goto L_0x0375
            r1 = 0
            goto L_0x037d
        L_0x0375:
            java.lang.String r1 = r1.getPath()     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            android.net.Uri r1 = com.tencent.p014mm.vfs.C116299g2.m163858n(r1)     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
        L_0x037d:
            if (r1 != 0) goto L_0x0389
            android.net.Uri$Builder r1 = new android.net.Uri$Builder     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            r1.<init>()     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            android.net.Uri$Builder r1 = r1.path(r3)     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            goto L_0x0390
        L_0x0389:
            android.net.Uri$Builder r1 = r1.buildUpon()     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            r1.appendPath(r3)     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
        L_0x0390:
            android.net.Uri r3 = r1.build()     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            java.lang.String r4 = r3.getPath()     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            if (r4 == 0) goto L_0x03b1
            r7 = 0
            java.lang.String r4 = com.tencent.p014mm.vfs.C116299g2.m163855k(r4, r7, r7)     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            java.lang.String r7 = r3.getPath()     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            boolean r7 = r7.equals(r4)     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            if (r7 != 0) goto L_0x03b1
            android.net.Uri$Builder r1 = r1.path(r4)     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            android.net.Uri r3 = r1.build()     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
        L_0x03b1:
            com.tencent.mm.vfs.f0 r1 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            r4 = 0
            com.tencent.mm.vfs.f0$h r1 = r1.mo177799l(r3, r4)     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            r4 = 0
            java.io.OutputStream r1 = com.tencent.p014mm.vfs.C86013q1.m106425G(r3, r1, r4)     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0413 }
            byte[] r0 = r0.getBytes()     // Catch:{ all -> 0x0413 }
            r1.write(r0)     // Catch:{ all -> 0x0413 }
            r1.close()     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            java.lang.String r0 = "VFS.DiskFileStatistics"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            r1.<init>()     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            java.lang.String r3 = "Saved statistics, count: "
            r1.append(r3)     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            int r2 = r2.length()     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            r1.append(r2)     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            java.lang.String r1 = r1.toString()     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            java.lang.String r1 = "extreme_storage_single_file"
            java.lang.String r2 = r45.toString()     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            r0.encode((java.lang.String) r1, (java.lang.String) r2)     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            java.lang.String r1 = "extreme_storage_wechat_total"
            r2 = r42
            r0.encode((java.lang.String) r1, (long) r2)     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            java.lang.String r1 = "extreme_storage_wechat_total_webview"
            r0.encode((java.lang.String) r1, (long) r5)     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            if (r41 != 0) goto L_0x040b
            java.lang.String r0 = ""
            goto L_0x040f
        L_0x040b:
            java.lang.String r0 = r41.toString()     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
        L_0x040f:
            m163923i(r2, r0)     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
            goto L_0x0431
        L_0x0413:
            r0 = move-exception
            r2 = r0
            if (r1 == 0) goto L_0x0420
            r1.close()     // Catch:{ all -> 0x041b }
            goto L_0x0420
        L_0x041b:
            r0 = move-exception
            r1 = r0
            r2.addSuppressed(r1)     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
        L_0x0420:
            throw r2     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
        L_0x0421:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0421 }
            throw r0     // Catch:{ JSONException -> 0x0426, IOException -> 0x0424 }
        L_0x0424:
            r0 = move-exception
            goto L_0x0427
        L_0x0426:
            r0 = move-exception
        L_0x0427:
            java.lang.String r1 = "VFS.DiskFileStatistics"
            java.lang.String r2 = "Unable to save statistics"
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r2, r3)
        L_0x0431:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.vfs.C116314o.m163917c():void");
    }

    /* renamed from: d */
    public static void m163918d(C116281f0.C116283b bVar, String str, int i, String[] strArr, Set<String> set, boolean z, boolean z2) {
        Map<String, Object> map;
        String str2 = str;
        String[] strArr2 = strArr;
        Map<String, Object> d = C116281f0.C116289i.f348994a.mo177791d();
        int length = strArr2.length;
        int i2 = 0;
        while (i2 < length) {
            String str3 = strArr2[i2];
            ArrayList arrayList = new ArrayList();
            try {
                NativeFileSystem nativeFileSystem = new NativeFileSystem(str3);
                Iterable<C86001b0> list = nativeFileSystem.mo177578v(d).list("");
                if (list != null) {
                    for (C86001b0 next : list) {
                        try {
                            if (next.f250476f) {
                                try {
                                    if (!set.contains(next.f250472b)) {
                                        if (f349048s.matcher(next.f250472b).matches() == z) {
                                            try {
                                                arrayList.add(next.f250472b);
                                            } catch (Exception unused) {
                                            }
                                        }
                                    }
                                } catch (Exception unused2) {
                                    boolean z3 = z;
                                    C116281f0.C116283b bVar2 = bVar;
                                    map = d;
                                    i2++;
                                    strArr2 = strArr;
                                    d = map;
                                }
                            } else {
                                Set<String> set2 = set;
                            }
                            boolean z4 = z;
                        } catch (Exception unused3) {
                            Set<String> set3 = set;
                            boolean z34 = z;
                            C116281f0.C116283b bVar22 = bVar;
                            map = d;
                            i2++;
                            strArr2 = strArr;
                            d = map;
                        }
                    }
                    Set<String> set4 = set;
                    boolean z5 = z;
                    if (z2) {
                        arrayList.add("\u0000");
                    }
                    if (!arrayList.isEmpty()) {
                        ArrayList arrayList2 = new ArrayList();
                        for (String next2 : set) {
                            if (next2.indexOf(47) >= 0) {
                                arrayList2.add(next2);
                            }
                        }
                        StatisticsFileSystem statisticsFileSystem = new StatisticsFileSystem(nativeFileSystem, true, arrayList, arrayList2);
                        C116314o oVar = r5;
                        map = d;
                        StatisticsFileSystem statisticsFileSystem2 = statisticsFileSystem;
                        String str4 = str2 + str3.replace('$', '#');
                        try {
                            C116314o oVar2 = new C116314o(str3, i, 0, 0, 0);
                            statisticsFileSystem2.mo177573a(str4, oVar);
                            try {
                                bVar.mo177804d(str2 + str3, statisticsFileSystem2);
                            } catch (Exception unused4) {
                            }
                        } catch (Exception unused5) {
                            C116281f0.C116283b bVar3 = bVar;
                        }
                        i2++;
                        strArr2 = strArr;
                        d = map;
                    }
                    C116281f0.C116283b bVar222 = bVar;
                    map = d;
                    i2++;
                    strArr2 = strArr;
                    d = map;
                }
            } catch (Exception unused6) {
            }
            C116281f0.C116283b bVar4 = bVar;
            Set<String> set5 = set;
            boolean z6 = z;
            map = d;
            i2++;
            strArr2 = strArr;
            d = map;
        }
    }

    /* renamed from: e */
    public static void m163919e(int i) {
        C72994y1.C72995a aVar;
        int i2;
        if (i == 1) {
            aVar = C72994y1.C72995a.USERINFO_C2C_RESCUE_OTHER_ACCOUNT_VOICE2_HIT_INT_SYNC;
            i2 = 0;
        } else if (i == 2) {
            aVar = C72994y1.C72995a.USERINFO_C2C_RESCUE_OTHER_ACCOUNT_VIDEO_HIT_INT_SYNC;
            i2 = 1;
        } else if (i == 3) {
            aVar = C72994y1.C72995a.USERINFO_C2C_RESCUE_OTHER_ACCOUNT_RECORD_HIT_INT_SYNC;
            i2 = 5;
        } else if (i == 4) {
            aVar = C72994y1.C72995a.USERINFO_C2C_RESCUE_OTHER_ACCOUNT_ATTACHMENT_HIT_INT_SYNC;
            i2 = 6;
        } else {
            return;
        }
        try {
            C86709a0.m107535s().mo121142i().mo119677K(aVar, 1);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_C2C_OTHER_ACCOUNT_WRONG_MIGRANT_INT_SYNC, 1);
            C117407d.INSTANCE.mo182088q(1912, i2);
        } catch (Exception e) {
            Log.printErrStackTrace("VFS.DiskFileStatistics", e, "Cannot mark wrong migration", new Object[0]);
        }
    }

    /* renamed from: f */
    public static void m163920f(String str, C116316b bVar) {
        synchronized (f349036g) {
            Map<String, C116316b> map = f349038i;
            if (map == null) {
                map = f349037h;
            }
            map.put(str, bVar);
        }
    }

    /* renamed from: g */
    public static void m163921g(String str, String str2, int i) {
        boolean z = false;
        boolean z2 = (i & 2048) != 0;
        boolean z3 = !z2 && (i & 4) == 0;
        boolean z4 = (i & 1) != 0;
        if ((i & 2) != 0) {
            z = true;
        }
        synchronized (f349036g) {
            if (z4) {
                (z3 ? f349042m : f349041l).add(str2);
            }
            if (z) {
                if (z3) {
                    f349043n.add(str2);
                    if (str != null) {
                        f349040k.add(str);
                    }
                } else if (!z2 || !str2.startsWith("files/")) {
                    f349044o.add(str2);
                } else {
                    f349045p.add(str2.substring(6));
                }
            }
        }
    }

    /* renamed from: h */
    public static void m163922h(C116317c cVar) {
        synchronized (f349036g) {
            ((HashSet) f349046q).add(cVar);
        }
    }

    /* renamed from: i */
    public static void m163923i(long j, String str) {
        try {
            Log.m105924i("VFS.DiskFileStatistics", "reportPercentageHeavyUser, wechatTotalSize = " + j + ", info = " + str);
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            long availableBytes = statFs.getAvailableBytes();
            long blockSizeLong = statFs.getBlockSizeLong() * statFs.getBlockCountLong();
            StatFs statFs2 = new StatFs(C112760b.m154230f0());
            long availableBytes2 = statFs2.getAvailableBytes();
            long blockSizeLong2 = statFs2.getBlockSizeLong() * statFs2.getBlockCountLong();
            int round = Math.round((((float) j) * 100.0f) / ((float) Math.max(blockSizeLong, blockSizeLong2)));
            Log.m105924i("VFS.DiskFileStatistics", "reportPercentageHeavyUser, dataFreeSpace = " + availableBytes + ", sdcardFreeSpace = " + availableBytes2);
            Log.m105924i("VFS.DiskFileStatistics", "reportPercentageHeavyUser, dataTotalSpace = " + blockSizeLong + ", sdcardTotalSpace = " + blockSizeLong2);
            Log.m105924i("VFS.DiskFileStatistics", "reportPercentageHeavyUser, percentageData = " + round + ", percentageSdcard = " + round);
            if (round > 50) {
                MultiProcessMMKV.getDefault().encode("extreme_storage_wechat_percentage", round);
            } else {
                MultiProcessMMKV.getDefault().encode("extreme_storage_wechat_percentage", -1);
            }
        } catch (Throwable th) {
            Log.m105920e("VFS.DiskFileStatistics", "reportPercentageHeavyUser error : " + th.getMessage());
        }
    }

    /* renamed from: a */
    public void mo177613a(String str, FileSystem fileSystem, int i, Map<String, Object> map) {
        String str2;
        Map<String, Object> map2 = map;
        String str3 = (String) map2.get("relPath");
        boolean equals = Boolean.TRUE.equals(map2.get("recursive"));
        if (str3 != null) {
            if (str3.isEmpty()) {
                str2 = this.f349050a;
                if (!equals) {
                    str2 = str2 + "/(root)";
                }
            } else {
                str2 = this.f349050a + XVFSFile.SEPARATOR_CHAR + str3;
            }
            C116316b bVar = r3;
            C116316b bVar2 = new C116316b(str, this.f349051b, this.f349052c, str2, ((Long) map2.get("totalSize")).longValue(), ((Integer) map2.get("fileCount")).intValue(), ((Integer) map2.get("dirCount")).intValue(), ((Integer) map2.get("maxDepth")).intValue(), ((Long) map2.get("maxFileSize")).longValue(), ((Long) map2.get("averageAge")).longValue(), this.f349053d, this.f349054e);
            m163920f(str2 + '|' + str, bVar);
        }
    }
}
