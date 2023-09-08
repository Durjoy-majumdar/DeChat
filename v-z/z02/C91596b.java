package z02;

import a70.C79471a;
import android.os.Build;
import com.tencent.p014mm.sdk.platformtools.AndroidVersion;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.PeriodRecorder;
import com.tencent.p014mm.sdk.platformtools.TinkerStatusReport;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.entry.ApplicationLike;
import iv3.C87824b;
import java.io.File;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p156gj.C87201q;

/* renamed from: z02.b */
public final class C91596b {

    /* renamed from: a */
    public static final PeriodRecorder f262439a = new PeriodRecorder("TinkerPatchStatusProbe", TimeUnit.HOURS.toMillis(12), true, true, true);

    /* renamed from: b */
    public static final boolean[] f262440b = {false};

    /* renamed from: c */
    public static ApplicationLike f262441c = null;

    /* renamed from: d */
    public static File f262442d = null;

    /* renamed from: e */
    public static final C91600d[] f262443e = {new C91598b((C91595a) null), new C91597a((C91595a) null), new C91599c((C91595a) null)};

    /* renamed from: z02.b$a */
    public static final class C91597a implements C91600d {

        /* renamed from: a */
        public String f262444a = null;

        public C91597a(C91595a aVar) {
        }

        /* renamed from: a */
        public void mo125474a(TinkerStatusReport.Pairs.Builder builder) {
            if (this.f262444a == null) {
                try {
                    Map<String, String> c = C87201q.m108259c();
                    if (c != null) {
                        this.f262444a = c.get("Hardware");
                    }
                } catch (Throwable unused) {
                    this.f262444a = null;
                }
            }
            builder.add("art_version", Integer.valueOf(AndroidVersion.getARTVersion(MMApplicationContext.getContext()))).add("cpu_model", this.f262444a).add(FingerprintManagerProxy.FINGERPRINT_SERVICE, Build.FINGERPRINT);
        }
    }

    /* renamed from: z02.b$b */
    public static final class C91598b implements C91600d {

        /* renamed from: a */
        public Boolean f262445a = null;

        public C91598b(C91595a aVar) {
        }

        /* renamed from: a */
        public void mo125474a(TinkerStatusReport.Pairs.Builder builder) {
            if (this.f262445a == null) {
                this.f262445a = Boolean.valueOf(C87824b.m109281c(C91596b.f262441c));
            }
            builder.add("is_patched", this.f262445a);
            builder.add("patch_client_version", Integer.valueOf(BuildInfo.CLIENT_VERSION_INT));
            builder.add("patch_rev", BuildInfo.REV);
            builder.add("base_client_version", Integer.valueOf(Util.safeDecodeInt(C79471a.f233015c)));
            builder.add("base_rev", C79471a.f233014b);
        }
    }

    /* renamed from: z02.b$c */
    public static final class C91599c implements C91600d {
        public C91599c(C91595a aVar) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:58:0x0152  */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x01a0  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo125474a(com.tencent.p014mm.sdk.platformtools.TinkerStatusReport.Pairs.Builder r38) {
            /*
                r37 = this;
                com.tencent.tinker.entry.ApplicationLike r0 = z02.C91596b.f262441c
                java.lang.String r1 = "tinkerApplication is null"
                if (r0 == 0) goto L_0x02a3
                android.app.Application r2 = r0.getApplication()
                if (r2 == 0) goto L_0x02a3
                android.app.Application r0 = r0.getApplication()
                java.io.File r0 = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.getPatchDirectory(r0)
                r2 = 0
                r4 = 0
                if (r0 != 0) goto L_0x001b
                goto L_0x0070
            L_0x001b:
                java.lang.String r0 = r0.getAbsolutePath()
                java.io.File r5 = z02.C91596b.f262442d
                r6 = 0
                if (r5 != 0) goto L_0x0050
                com.tencent.tinker.entry.ApplicationLike r5 = z02.C91596b.f262441c     // Catch:{ all -> 0x004e }
                if (r5 == 0) goto L_0x0048
                android.app.Application r7 = r5.getApplication()     // Catch:{ all -> 0x004e }
                if (r7 == 0) goto L_0x0048
                android.app.Application r1 = r5.getApplication()     // Catch:{ all -> 0x004e }
                java.io.File r1 = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.getPatchDirectory(r1)     // Catch:{ all -> 0x004e }
                com.tencent.tinker.entry.ApplicationLike r5 = z02.C91596b.f262441c     // Catch:{ all -> 0x004e }
                java.lang.String r5 = iv3.C87824b.m109280b(r5)     // Catch:{ all -> 0x004e }
                java.lang.String r5 = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.getPatchVersionDirectory(r5)     // Catch:{ all -> 0x004e }
                java.io.File r7 = new java.io.File     // Catch:{ all -> 0x004e }
                r7.<init>(r1, r5)     // Catch:{ all -> 0x004e }
                z02.C91596b.f262442d = r7     // Catch:{ all -> 0x004e }
                goto L_0x0050
            L_0x0048:
                com.tencent.tinker.loader.TinkerRuntimeException r5 = new com.tencent.tinker.loader.TinkerRuntimeException     // Catch:{ all -> 0x004e }
                r5.<init>(r1)     // Catch:{ all -> 0x004e }
                throw r5     // Catch:{ all -> 0x004e }
            L_0x004e:
                z02.C91596b.f262442d = r6
            L_0x0050:
                java.io.File r1 = z02.C91596b.f262442d
                if (r1 == 0) goto L_0x0069
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = r1.getName()
                r5.append(r6)
                java.lang.String r6 = "/"
                r5.append(r6)
                java.lang.String r6 = r5.toString()
            L_0x0069:
                r5 = 1
                java.lang.Iterable r0 = com.tencent.p014mm.vfs.C86013q1.m106459t(r0, r5)
                if (r0 != 0) goto L_0x0087
            L_0x0070:
                r9 = r2
                r11 = r9
                r15 = r11
                r17 = r15
                r19 = r17
                r21 = r19
                r23 = r21
                r25 = r23
                r31 = r25
                r33 = r31
                r35 = r33
                r28 = 0
                goto L_0x0210
            L_0x0087:
                java.util.Iterator r0 = r0.iterator()
                r4 = r2
                r7 = r4
                r9 = r7
                r11 = r9
                r13 = r11
                r15 = r13
                r17 = r15
                r19 = r17
                r21 = r19
                r23 = r21
                r25 = r23
                r27 = 0
                r28 = 0
            L_0x009f:
                boolean r29 = r0.hasNext()
                if (r29 == 0) goto L_0x0207
                java.lang.Object r29 = r0.next()
                r30 = r0
                r0 = r29
                com.tencent.mm.vfs.b0 r0 = (com.tencent.p014mm.vfs.C86001b0) r0
                r31 = r2
                long r2 = r0.f250474d
                long r25 = r25 + r2
                java.lang.String r2 = r0.f250471a
                java.lang.String r3 = "patch-"
                boolean r2 = r2.startsWith(r3)
                r33 = r13
                java.lang.String r13 = ".apk"
                if (r2 == 0) goto L_0x0125
                boolean r2 = r0.f250476f
                if (r2 == 0) goto L_0x00d5
                java.lang.String r2 = r0.f250471a
                java.lang.String r14 = r0.f250472b
                boolean r2 = r2.equals(r14)
                if (r2 == 0) goto L_0x00d5
                int r28 = r28 + 1
                goto L_0x0125
            L_0x00d5:
                r35 = r4
                long r4 = r0.f250474d
                long r23 = r23 + r4
                if (r6 == 0) goto L_0x00e8
                java.lang.String r2 = r0.f250471a
                boolean r2 = r2.startsWith(r6)
                if (r2 == 0) goto L_0x00e8
                long r4 = r0.f250474d
                long r9 = r9 + r4
            L_0x00e8:
                boolean r2 = r0.f250476f
                if (r2 != 0) goto L_0x0127
                java.lang.String r2 = r0.f250472b
                boolean r2 = r2.startsWith(r3)
                if (r2 == 0) goto L_0x0127
                java.lang.String r2 = r0.f250472b
                boolean r2 = r2.endsWith(r13)
                if (r2 == 0) goto L_0x0127
                int r27 = r27 + 1
                long r2 = r0.f250474d
                long r21 = r21 + r2
                if (r1 == 0) goto L_0x0127
                java.lang.String r2 = r0.f250472b
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = r1.getName()
                r3.append(r4)
                java.lang.String r4 = "."
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                boolean r2 = r2.startsWith(r3)
                if (r2 == 0) goto L_0x0127
                long r2 = r0.f250474d
                long r7 = r7 + r2
                goto L_0x0127
            L_0x0125:
                r35 = r4
            L_0x0127:
                if (r6 == 0) goto L_0x01fd
                java.lang.String r2 = r0.f250471a
                boolean r2 = r2.startsWith(r6)
                if (r2 == 0) goto L_0x01fd
                java.lang.String r2 = r0.f250471a
                int r3 = r6.length()
                java.lang.String r2 = r2.substring(r3)
                java.lang.String r3 = "dex/"
                boolean r3 = r2.startsWith(r3)
                java.lang.String r4 = ".art"
                java.lang.String r5 = ".vdex"
                java.lang.String r14 = ".odex"
                if (r3 != 0) goto L_0x01a0
                java.lang.String r3 = "odex/"
                boolean r3 = r2.startsWith(r3)
                if (r3 == 0) goto L_0x0152
                goto L_0x01a0
            L_0x0152:
                java.lang.String r3 = "lib/"
                boolean r3 = r2.startsWith(r3)
                if (r3 == 0) goto L_0x016d
                java.lang.String r2 = r0.f250472b
                java.lang.String r3 = ".so"
                boolean r2 = r2.endsWith(r3)
                if (r2 == 0) goto L_0x0169
                long r2 = r0.f250474d
                long r15 = r15 + r2
                goto L_0x01fd
            L_0x0169:
                long r2 = r0.f250474d
                goto L_0x01f3
            L_0x016d:
                java.lang.String r3 = "res/"
                boolean r2 = r2.startsWith(r3)
                if (r2 == 0) goto L_0x017c
                long r2 = r0.f250474d
                long r17 = r17 + r2
                goto L_0x01fd
            L_0x017c:
                java.lang.String r2 = r0.f250472b
                boolean r2 = r2.endsWith(r14)
                if (r2 == 0) goto L_0x0187
                long r2 = r0.f250474d
                goto L_0x01d1
            L_0x0187:
                java.lang.String r2 = r0.f250472b
                boolean r2 = r2.endsWith(r5)
                if (r2 == 0) goto L_0x0192
                long r2 = r0.f250474d
                goto L_0x01dd
            L_0x0192:
                java.lang.String r2 = r0.f250472b
                boolean r2 = r2.endsWith(r4)
                if (r2 == 0) goto L_0x019d
                long r2 = r0.f250474d
                goto L_0x01ee
            L_0x019d:
                long r2 = r0.f250474d
                goto L_0x01f3
            L_0x01a0:
                java.lang.String r2 = r0.f250472b
                java.lang.String r3 = ".dex"
                boolean r2 = r2.endsWith(r3)
                if (r2 != 0) goto L_0x01f6
                java.lang.String r2 = r0.f250472b
                java.lang.String r3 = ".jar"
                boolean r2 = r2.endsWith(r3)
                if (r2 != 0) goto L_0x01f6
                java.lang.String r2 = r0.f250472b
                boolean r2 = r2.endsWith(r13)
                if (r2 != 0) goto L_0x01f6
                java.lang.String r2 = r0.f250472b
                java.lang.String r3 = ".zip"
                boolean r2 = r2.endsWith(r3)
                if (r2 == 0) goto L_0x01c7
                goto L_0x01f6
            L_0x01c7:
                java.lang.String r2 = r0.f250472b
                boolean r2 = r2.endsWith(r14)
                if (r2 == 0) goto L_0x01d3
                long r2 = r0.f250474d
            L_0x01d1:
                long r11 = r11 + r2
                goto L_0x01fd
            L_0x01d3:
                java.lang.String r2 = r0.f250472b
                boolean r2 = r2.endsWith(r5)
                if (r2 == 0) goto L_0x01e4
                long r2 = r0.f250474d
            L_0x01dd:
                long r4 = r35 + r2
                r2 = r31
                r13 = r33
                goto L_0x0203
            L_0x01e4:
                java.lang.String r2 = r0.f250472b
                boolean r2 = r2.endsWith(r4)
                if (r2 == 0) goto L_0x01f1
                long r2 = r0.f250474d
            L_0x01ee:
                long r13 = r33 + r2
                goto L_0x01ff
            L_0x01f1:
                long r2 = r0.f250474d
            L_0x01f3:
                long r19 = r19 + r2
                goto L_0x01fd
            L_0x01f6:
                long r2 = r0.f250474d
                long r2 = r31 + r2
                r13 = r33
                goto L_0x0201
            L_0x01fd:
                r13 = r33
            L_0x01ff:
                r2 = r31
            L_0x0201:
                r4 = r35
            L_0x0203:
                r0 = r30
                goto L_0x009f
            L_0x0207:
                r31 = r2
                r35 = r4
                r33 = r13
                r2 = r7
                r4 = r27
            L_0x0210:
                java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
                java.lang.String r1 = "patch_apk_count"
                r4 = r38
                com.tencent.mm.sdk.platformtools.TinkerStatusReport$Pairs$Builder r0 = r4.add(r1, r0)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r28)
                java.lang.String r4 = "patch_dir_count"
                com.tencent.mm.sdk.platformtools.TinkerStatusReport$Pairs$Builder r0 = r0.add(r4, r1)
                java.lang.Long r1 = java.lang.Long.valueOf(r2)
                java.lang.String r2 = "curr_patch_apk_size"
                com.tencent.mm.sdk.platformtools.TinkerStatusReport$Pairs$Builder r0 = r0.add(r2, r1)
                java.lang.Long r1 = java.lang.Long.valueOf(r9)
                java.lang.String r2 = "curr_patch_dir_size"
                com.tencent.mm.sdk.platformtools.TinkerStatusReport$Pairs$Builder r0 = r0.add(r2, r1)
                java.lang.Long r1 = java.lang.Long.valueOf(r31)
                java.lang.String r2 = "curr_patched_dex_total_size"
                com.tencent.mm.sdk.platformtools.TinkerStatusReport$Pairs$Builder r0 = r0.add(r2, r1)
                java.lang.Long r1 = java.lang.Long.valueOf(r11)
                java.lang.String r2 = "curr_patched_odex_total_size"
                com.tencent.mm.sdk.platformtools.TinkerStatusReport$Pairs$Builder r0 = r0.add(r2, r1)
                java.lang.Long r1 = java.lang.Long.valueOf(r35)
                java.lang.String r2 = "curr_patched_vdex_total_size"
                com.tencent.mm.sdk.platformtools.TinkerStatusReport$Pairs$Builder r0 = r0.add(r2, r1)
                java.lang.Long r1 = java.lang.Long.valueOf(r33)
                java.lang.String r2 = "curr_patched_art_total_size"
                com.tencent.mm.sdk.platformtools.TinkerStatusReport$Pairs$Builder r0 = r0.add(r2, r1)
                java.lang.Long r1 = java.lang.Long.valueOf(r15)
                java.lang.String r2 = "curr_patched_so_total_size"
                com.tencent.mm.sdk.platformtools.TinkerStatusReport$Pairs$Builder r0 = r0.add(r2, r1)
                java.lang.Long r1 = java.lang.Long.valueOf(r17)
                java.lang.String r2 = "curr_patched_res_total_size"
                com.tencent.mm.sdk.platformtools.TinkerStatusReport$Pairs$Builder r0 = r0.add(r2, r1)
                java.lang.Long r1 = java.lang.Long.valueOf(r19)
                java.lang.String r2 = "curr_patched_others_total_size"
                com.tencent.mm.sdk.platformtools.TinkerStatusReport$Pairs$Builder r0 = r0.add(r2, r1)
                java.lang.Long r1 = java.lang.Long.valueOf(r21)
                java.lang.String r2 = "patch_apk_total_size"
                com.tencent.mm.sdk.platformtools.TinkerStatusReport$Pairs$Builder r0 = r0.add(r2, r1)
                java.lang.Long r1 = java.lang.Long.valueOf(r23)
                java.lang.String r2 = "patch_dir_total_size"
                com.tencent.mm.sdk.platformtools.TinkerStatusReport$Pairs$Builder r0 = r0.add(r2, r1)
                java.lang.Long r1 = java.lang.Long.valueOf(r25)
                java.lang.String r2 = "tinker_base_dir_size"
                r0.add(r2, r1)
                return
            L_0x02a3:
                com.tencent.tinker.loader.TinkerRuntimeException r0 = new com.tencent.tinker.loader.TinkerRuntimeException
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: z02.C91596b.C91599c.mo125474a(com.tencent.mm.sdk.platformtools.TinkerStatusReport$Pairs$Builder):void");
        }
    }

    /* renamed from: z02.b$d */
    public interface C91600d {
        /* renamed from: a */
        void mo125474a(TinkerStatusReport.Pairs.Builder builder);
    }
}
