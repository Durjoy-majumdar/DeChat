package com.tencent.p014mm.vfs;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C116344z0;
import com.tencent.p014mm.vfs.FileSystem;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.mm.vfs.RecordAndExtraGCFileSystem */
public class RecordAndExtraGCFileSystem extends AbstractFileSystem {
    public static final Parcelable.Creator<RecordAndExtraGCFileSystem> CREATOR = new C116240a();

    /* renamed from: e */
    public final FileSystem f348823e;

    /* renamed from: com.tencent.mm.vfs.RecordAndExtraGCFileSystem$a */
    public class C116240a implements Parcelable.Creator<RecordAndExtraGCFileSystem> {
        public Object createFromParcel(Parcel parcel) {
            return new RecordAndExtraGCFileSystem(parcel);
        }

        public Object[] newArray(int i) {
            return new RecordAndExtraGCFileSystem[i];
        }
    }

    /* renamed from: com.tencent.mm.vfs.RecordAndExtraGCFileSystem$b */
    public static final class C116241b implements C116344z0.C116345a {
        /* renamed from: a */
        public void mo177613a(String str, FileSystem fileSystem, int i, Map<String, Object> map) {
            Log.m105924i("VFS.RecordGCFileSystem", "statistics id = " + str);
        }
    }

    /* renamed from: com.tencent.mm.vfs.RecordAndExtraGCFileSystem$c */
    public class C116242c extends C116309m {

        /* renamed from: e */
        public final FileSystem.C85995c f348824e;

        /* renamed from: f */
        public final List<FileSystem.C85995c> f348825f;

        public C116242c(FileSystem.C85995c cVar) {
            this.f348824e = cVar;
            this.f348825f = Collections.singletonList(cVar);
        }

        /* renamed from: G */
        public List<FileSystem.C85995c> mo119926G() {
            return this.f348825f;
        }

        /* renamed from: H */
        public FileSystem.C85995c mo119927H(String str, int i) {
            return this.f348824e;
        }

        /* JADX WARNING: Removed duplicated region for block: B:100:0x04d2  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x02d0  */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x0437  */
        /* JADX WARNING: Removed duplicated region for block: B:97:0x0440  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo119928a(android.os.CancellationSignal r41) {
            /*
                r40 = this;
                java.lang.String r1 = "record-clean"
                long r2 = com.tencent.p014mm.vfs.C116299g2.m163863s(r1)
                f40.o r0 = f40.C86709a0.m107535s()
                boolean r0 = r0.mo121146m()
                r4 = 22046(0x561e, float:3.0893E-41)
                java.lang.String r5 = "VFS.RecordGCFileSystem"
                if (r0 == 0) goto L_0x0022
                kj2.d r0 = kj2.C117407d.INSTANCE
                java.lang.String r1 = "record-hasCorruptedDB"
                r0.kvStat(r4, r1)
                java.lang.String r0 = "hasCorruptedDB, skip cleanup."
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
                goto L_0x05c1
            L_0x0022:
                f40.o r0 = f40.C86709a0.m107535s()
                boolean r0 = r0.mo121136b()
                if (r0 == 0) goto L_0x003a
                kj2.d r0 = kj2.C117407d.INSTANCE
                java.lang.String r1 = "record-C2CToBeRescued"
                r0.kvStat(r4, r1)
                java.lang.String r0 = "c2cErrorToBeRescued, skip cleanup."
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
                goto L_0x05c1
            L_0x003a:
                boolean r0 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
                java.lang.String r6 = "0"
                r7 = 0
                r8 = 1
                if (r0 != 0) goto L_0x0057
                oa1.d r0 = oa1.C117731d.m166007c()
                java.lang.String r9 = "clicfg_wild_file_record_scan"
                java.lang.String r0 = r0.mo182444f(r9, r6, r7, r8)
                boolean r0 = r6.equals(r0)
                if (r0 != 0) goto L_0x0055
                goto L_0x0057
            L_0x0055:
                r0 = 0
                goto L_0x0058
            L_0x0057:
                r0 = 1
            L_0x0058:
                if (r0 != 0) goto L_0x0061
                java.lang.String r0 = "X Switch disabled, skip cleanup."
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
                goto L_0x05c1
            L_0x0061:
                r9 = 691200000(0x2932e000, double:3.414981744E-315)
                r11 = 2
                int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
                if (r0 >= 0) goto L_0x007e
                java.lang.Object[] r0 = new java.lang.Object[r11]
                java.lang.Long r1 = java.lang.Long.valueOf(r2)
                r0[r7] = r1
                java.lang.Long r1 = java.lang.Long.valueOf(r9)
                r0[r8] = r1
                java.lang.String r1 = "record cleanup interval not match, skip cleanup. %d / %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r1, r0)
                goto L_0x05c1
            L_0x007e:
                java.lang.String r0 = "doMaintenance"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
                long r2 = java.lang.System.currentTimeMillis()
                boolean r0 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
                if (r0 != 0) goto L_0x00a0
                oa1.d r0 = oa1.C117731d.m166007c()
                java.lang.String r9 = "clicfg_wild_file_record_clean"
                java.lang.String r0 = r0.mo182444f(r9, r6, r7, r8)
                boolean r0 = r6.equals(r0)
                if (r0 != 0) goto L_0x009e
                goto L_0x00a0
            L_0x009e:
                r0 = 0
                goto L_0x00a1
            L_0x00a0:
                r0 = 1
            L_0x00a1:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r9 = "isCleanExpt = "
                r6.append(r9)
                r6.append(r0)
                java.lang.String r6 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
                r41.throwIfCanceled()
                r6 = r40
                com.tencent.mm.vfs.FileSystem$c r9 = r6.f348824e
                java.lang.String r10 = ""
                java.lang.Iterable r9 = r9.list(r10)
                if (r9 != 0) goto L_0x00cb
                java.lang.String r0 = "it null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
                goto L_0x05c1
            L_0x00cb:
                f40.o r10 = f40.C86709a0.m107535s()
                zh3.f r10 = r10.f251811i
                zh3.e r10 = r10.f262815b
                java.util.Iterator r9 = r9.iterator()
                r4 = 0
                r11 = 0
                r14 = 0
                r16 = 0
                r18 = 0
                r20 = 0
            L_0x00e1:
                boolean r21 = r9.hasNext()
                if (r21 == 0) goto L_0x038a
                java.lang.Object r21 = r9.next()
                r12 = r21
                com.tencent.mm.vfs.b0 r12 = (com.tencent.p014mm.vfs.C86001b0) r12
                boolean r13 = r41.isCanceled()
                if (r13 == 0) goto L_0x0103
                java.lang.String r0 = "cs.isCanceled break"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
                r32 = r1
                r33 = r2
                r2 = r18
                r6 = 1
                goto L_0x0391
            L_0x0103:
                java.lang.String r13 = r12.f250472b
                boolean r21 = r13.isEmpty()
                if (r21 != 0) goto L_0x0370
                java.lang.String r7 = ".ref"
                boolean r7 = r13.equals(r7)
                if (r7 != 0) goto L_0x0370
                java.lang.String r7 = "web"
                boolean r7 = r13.equals(r7)
                if (r7 != 0) goto L_0x0370
                java.lang.String r7 = "record2"
                boolean r7 = r13.equals(r7)
                if (r7 == 0) goto L_0x0125
                goto L_0x0370
            L_0x0125:
                boolean r7 = r12.f250476f
                java.lang.String r8 = "delete dir : "
                if (r7 == 0) goto L_0x02ed
                java.lang.String r7 = "SELECT msgid FROM message WHERE type=49 AND msgid=?"
                r25 = r9
                r6 = 1
                java.lang.String[] r9 = new java.lang.String[r6]     // Catch:{ all -> 0x02c8 }
                r6 = 0
                r9[r6] = r13     // Catch:{ all -> 0x02c8 }
                android.database.Cursor r7 = r10.mo183823u(r7, r9, r6, r6)     // Catch:{ all -> 0x02c8 }
                r7.moveToFirst()     // Catch:{ all -> 0x02c2 }
                int r6 = r7.getCount()     // Catch:{ all -> 0x02c2 }
                r13 = r10
                long r9 = (long) r6     // Catch:{ all -> 0x02c2 }
                r7.close()     // Catch:{ all -> 0x02c2 }
                r6 = 0
                int r26 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
                if (r26 != 0) goto L_0x02ba
                java.lang.Iterable r6 = r12.mo119957d()
                java.util.Iterator r6 = r6.iterator()
                r9 = 0
                r26 = 0
            L_0x0157:
                boolean r7 = r6.hasNext()
                if (r7 == 0) goto L_0x025a
                java.lang.Object r7 = r6.next()
                com.tencent.mm.vfs.b0 r7 = (com.tencent.p014mm.vfs.C86001b0) r7
                if (r7 != 0) goto L_0x0166
                goto L_0x0157
            L_0x0166:
                r28 = r6
                boolean r6 = r7.f250476f
                r29 = r11
                java.lang.String r11 = ", diskSpace = "
                if (r6 == 0) goto L_0x0220
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r30 = r13
                java.lang.String r13 = "son File has dir File = "
                r6.append(r13)
                java.lang.String r13 = r7.f250471a
                r6.append(r13)
                java.lang.String r6 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
                java.lang.Iterable r6 = r7.mo119957d()
                java.util.Iterator r6 = r6.iterator()
            L_0x0190:
                boolean r13 = r6.hasNext()
                if (r13 == 0) goto L_0x021b
                java.lang.Object r13 = r6.next()
                com.tencent.mm.vfs.b0 r13 = (com.tencent.p014mm.vfs.C86001b0) r13
                r31 = r6
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r32 = r1
                java.lang.String r1 = "wildFile 0 = "
                r6.append(r1)
                java.lang.String r1 = r13.f250471a
                r6.append(r1)
                r6.append(r11)
                r33 = r2
                long r1 = r13.f250474d
                r6.append(r1)
                java.lang.String r1 = ", isDir = "
                r6.append(r1)
                boolean r1 = r13.f250476f
                r6.append(r1)
                java.lang.String r1 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
                boolean r1 = r13.f250476f
                if (r1 == 0) goto L_0x01eb
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "son'son's File has dir File = "
                r1.append(r2)
                java.lang.String r2 = r13.f250471a
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
                int r29 = r29 + 1
                long r1 = r12.f250474d
                long r18 = r18 + r1
                goto L_0x0213
            L_0x01eb:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "sonSonFe wildFile = "
                r1.append(r2)
                java.lang.String r2 = r7.f250471a
                r1.append(r2)
                r1.append(r11)
                long r2 = r7.f250474d
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
                long r1 = r13.f250474d
                long r14 = r14 + r1
                int r20 = r20 + 1
                long r9 = r9 + r1
                r1 = 1
                long r26 = r26 + r1
            L_0x0213:
                r6 = r31
                r1 = r32
                r2 = r33
                goto L_0x0190
            L_0x021b:
                r32 = r1
                r33 = r2
                goto L_0x024e
            L_0x0220:
                r32 = r1
                r33 = r2
                r30 = r13
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "wildFile 1 = "
                r1.append(r2)
                java.lang.String r2 = r7.f250471a
                r1.append(r2)
                r1.append(r11)
                long r2 = r7.f250474d
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
                long r1 = r7.f250474d
                long r14 = r14 + r1
                int r20 = r20 + 1
                long r9 = r9 + r1
                r1 = 1
                long r26 = r26 + r1
            L_0x024e:
                r11 = r29
                r6 = r28
                r13 = r30
                r1 = r32
                r2 = r33
                goto L_0x0157
            L_0x025a:
                r32 = r1
                r33 = r2
                r29 = r11
                r30 = r13
                if (r0 == 0) goto L_0x02b6
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r8)
                java.lang.String r2 = r12.f250471a
                r1.append(r2)
                java.lang.String r2 = ", modifiedTime = "
                r1.append(r2)
                long r2 = r12.f250475e
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
                long r1 = r12.f250475e
                long r2 = r33 - r1
                r6 = 86400000(0x5265c00, double:4.2687272E-316)
                int r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                if (r1 <= 0) goto L_0x02b6
                r1 = 1
                boolean r2 = r12.mo119955b(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r8)
                java.lang.String r3 = r12.f250471a
                r1.append(r3)
                java.lang.String r3 = ", ret = "
                r1.append(r3)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
                if (r2 == 0) goto L_0x02b6
                long r1 = (long) r4
                long r1 = r1 + r26
                int r4 = (int) r1
                long r16 = r16 + r9
            L_0x02b6:
                r11 = r29
                goto L_0x037c
            L_0x02ba:
                r32 = r1
                r33 = r2
                r30 = r13
                goto L_0x037c
            L_0x02c2:
                r0 = move-exception
                r32 = r1
                r33 = r2
                goto L_0x02ce
            L_0x02c8:
                r0 = move-exception
                r32 = r1
                r33 = r2
                r7 = 0
            L_0x02ce:
                if (r7 == 0) goto L_0x02d3
                r7.close()
            L_0x02d3:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "error : "
                r1.append(r2)
                java.lang.String r0 = r0.getMessage()
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
                goto L_0x038e
            L_0x02ed:
                r32 = r1
                r33 = r2
                r25 = r9
                r30 = r10
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "illegalFiles = "
                r1.append(r2)
                r1.append(r11)
                java.lang.String r2 = ", illegalSize = "
                r1.append(r2)
                r2 = r18
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r1)
                int r11 = r11 + 1
                long r6 = r12.f250474d
                long r18 = r2 + r6
                int r20 = r20 + 1
                long r14 = r14 + r6
                if (r0 == 0) goto L_0x037c
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r8)
                java.lang.String r2 = r12.f250471a
                r1.append(r2)
                java.lang.String r2 = ", modifiedTime = "
                r1.append(r2)
                long r2 = r12.f250475e
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
                long r1 = r12.f250475e
                long r2 = r33 - r1
                r6 = 86400000(0x5265c00, double:4.2687272E-316)
                int r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                if (r1 <= 0) goto L_0x037c
                r1 = 1
                boolean r2 = r12.mo119955b(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r8)
                java.lang.String r3 = r12.f250471a
                r1.append(r3)
                java.lang.String r3 = ", ret = "
                r1.append(r3)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
                if (r2 == 0) goto L_0x037c
                int r4 = r4 + 1
                long r1 = r12.f250474d
                long r14 = r14 + r1
                goto L_0x037c
            L_0x0370:
                r32 = r1
                r33 = r2
                r25 = r9
                r30 = r10
                r2 = r18
                r18 = r2
            L_0x037c:
                r9 = r25
                r10 = r30
                r1 = r32
                r2 = r33
                r7 = 0
                r8 = 1
                r6 = r40
                goto L_0x00e1
            L_0x038a:
                r32 = r1
                r33 = r2
            L_0x038e:
                r2 = r18
                r6 = 0
            L_0x0391:
                r0 = 14
                java.lang.Object[] r1 = new java.lang.Object[r0]
                java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
                r8 = 0
                r1[r8] = r7
                java.lang.Long r7 = java.lang.Long.valueOf(r16)
                r9 = 1
                r1[r9] = r7
                java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
                r9 = 2
                r1[r9] = r7
                r9 = 0
                java.lang.Long r7 = java.lang.Long.valueOf(r9)
                r9 = 3
                r1[r9] = r7
                java.lang.Integer r7 = java.lang.Integer.valueOf(r11)
                r10 = 4
                r1[r10] = r7
                java.lang.Long r7 = java.lang.Long.valueOf(r2)
                r12 = 5
                r1[r12] = r7
                java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
                r13 = 6
                r1[r13] = r7
                r18 = 0
                java.lang.Long r7 = java.lang.Long.valueOf(r18)
                r25 = 7
                r1[r25] = r7
                java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
                r26 = 8
                r1[r26] = r7
                java.lang.Long r7 = java.lang.Long.valueOf(r18)
                r27 = 9
                r1[r27] = r7
                java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
                r8 = 10
                r1[r8] = r7
                java.lang.Long r7 = java.lang.Long.valueOf(r18)
                r18 = 11
                r1[r18] = r7
                java.lang.Integer r7 = java.lang.Integer.valueOf(r20)
                r19 = 12
                r1[r19] = r7
                java.lang.Long r7 = java.lang.Long.valueOf(r14)
                r28 = 13
                r1[r28] = r7
                java.lang.String r7 = " > deletedFiles: %d, deletedSize: %d\n > keptFiles: %d, keptSize: %d\n > illegalFiles: %d, illegalSize: %d\n > wildFiles: %d, wildSize: %d\n > tempFiles: %d, tempSize: %d\n > noMediaFilesws: %d, noMediaSize: %d > totalWildFile: %d, totalWildSize: %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r7, r1)
                long r29 = java.lang.System.currentTimeMillis()
                long r0 = r29 - r33
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "duration = "
                r7.append(r8)
                r7.append(r0)
                java.lang.String r7 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r7)
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r5 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
                java.lang.String r7 = "extreme_storage_wechat_total"
                r12 = -1
                r33 = r11
                long r10 = r5.getLong(r7, r12)
                r5 = 1120403456(0x42c80000, float:100.0)
                r35 = -1
                int r36 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r36 == 0) goto L_0x0440
                float r7 = (float) r14
                float r8 = (float) r10
                float r7 = r7 / r8
                float r7 = r7 * r5
                int r7 = (int) r7
                r38 = r7
                goto L_0x0442
            L_0x0440:
                r38 = -1
            L_0x0442:
                kj2.d r7 = kj2.C117407d.INSTANCE
                r8 = 18
                java.lang.Object[] r8 = new java.lang.Object[r8]
                java.lang.String r39 = "record-v3"
                r21 = 0
                r8[r21] = r39
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r24 = 1
                r8[r24] = r4
                java.lang.Long r4 = java.lang.Long.valueOf(r16)
                r16 = 2
                r8[r16] = r4
                java.lang.Integer r4 = java.lang.Integer.valueOf(r21)
                r8[r9] = r4
                r16 = 0
                java.lang.Long r4 = java.lang.Long.valueOf(r16)
                r22 = 4
                r8[r22] = r4
                java.lang.Integer r4 = java.lang.Integer.valueOf(r33)
                r22 = 5
                r8[r22] = r4
                r4 = r8
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                r3 = 6
                r4[r3] = r2
                java.lang.Integer r2 = java.lang.Integer.valueOf(r21)
                r4[r25] = r2
                java.lang.Long r2 = java.lang.Long.valueOf(r16)
                r4[r26] = r2
                java.lang.Integer r2 = java.lang.Integer.valueOf(r21)
                r4[r27] = r2
                java.lang.Long r2 = java.lang.Long.valueOf(r16)
                r3 = 10
                r4[r3] = r2
                java.lang.Integer r2 = java.lang.Integer.valueOf(r21)
                r4[r18] = r2
                java.lang.Long r2 = java.lang.Long.valueOf(r16)
                r4[r19] = r2
                java.lang.Integer r2 = java.lang.Integer.valueOf(r20)
                r4[r28] = r2
                java.lang.Long r2 = java.lang.Long.valueOf(r14)
                r3 = 14
                r4[r3] = r2
                r2 = r7
                java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
                r16 = 15
                r4[r16] = r3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r38)
                r17 = 16
                r4[r17] = r3
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                r1 = 17
                r4[r1] = r0
                r3 = 22046(0x561e, float:3.0893E-41)
                r2.mo160131h(r3, r4)
                if (r6 != 0) goto L_0x05c1
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
                java.lang.String r3 = "recent_record_wild_file_size"
                r0.putLong(r3, r14)
                com.tencent.p014mm.vfs.C116299g2.m163864t(r32)
                r32 = 209715200(0xc800000, double:1.036130757E-315)
                java.lang.String r0 = "extreme_storage_record_wild_file_size"
                int r4 = (r14 > r32 ? 1 : (r14 == r32 ? 0 : -1))
                if (r4 <= 0) goto L_0x04ef
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r4 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
                r4.putLong(r0, r14)
                goto L_0x04f6
            L_0x04ef:
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r4 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
                r4.putLong(r0, r12)
            L_0x04f6:
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
                java.lang.String r4 = "recent_image_wild_file_size"
                long r14 = r0.decodeLong(r4, r12)
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
                java.lang.String r4 = "recent_video_wild_file_size"
                long r32 = r0.decodeLong(r4, r12)
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
                long r3 = r0.decodeLong(r3, r12)
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
                java.lang.String r6 = "recent_attachment_wild_file_size"
                long r37 = r0.decodeLong(r6, r12)
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
                java.lang.String r6 = "recent_voice_wild_file_size"
                long r12 = r0.decodeLong(r6, r12)
                r22 = 0
                int r0 = (r14 > r22 ? 1 : (r14 == r22 ? 0 : -1))
                if (r0 < 0) goto L_0x05c1
                int r0 = (r32 > r22 ? 1 : (r32 == r22 ? 0 : -1))
                if (r0 < 0) goto L_0x05c1
                int r0 = (r3 > r22 ? 1 : (r3 == r22 ? 0 : -1))
                if (r0 < 0) goto L_0x05c1
                int r0 = (r37 > r22 ? 1 : (r37 == r22 ? 0 : -1))
                if (r0 < 0) goto L_0x05c1
                int r0 = (r12 > r22 ? 1 : (r12 == r22 ? 0 : -1))
                if (r0 < 0) goto L_0x05c1
                long r14 = r14 + r32
                long r14 = r14 + r3
                long r14 = r14 + r37
                long r14 = r14 + r12
                if (r36 == 0) goto L_0x054c
                float r0 = (float) r14
                float r3 = (float) r10
                float r0 = r0 / r3
                float r0 = r0 * r5
                int r0 = (int) r0
                r35 = r0
            L_0x054c:
                java.lang.Object[] r0 = new java.lang.Object[r1]
                java.lang.String r1 = "total-v3"
                r3 = 0
                r0[r3] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
                r4 = 1
                r0[r4] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
                r4 = 2
                r0[r4] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
                r0[r9] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
                r4 = 4
                r0[r4] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
                r4 = 5
                r0[r4] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
                r4 = 6
                r0[r4] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
                r0[r25] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
                r0[r26] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
                r0[r27] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
                r4 = 10
                r0[r4] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
                r0[r18] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
                r0[r19] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
                r0[r28] = r1
                java.lang.Long r1 = java.lang.Long.valueOf(r14)
                r4 = 14
                r0[r4] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
                r0[r16] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r35)
                r0[r17] = r1
                r1 = 22046(0x561e, float:3.0893E-41)
                r2.mo160131h(r1, r0)
            L_0x05c1:
                r41.throwIfCanceled()
                super.mo119928a(r41)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.vfs.RecordAndExtraGCFileSystem.C116242c.mo119928a(android.os.CancellationSignal):void");
        }

        public String toString() {
            return "recordGC <- " + this.f348824e;
        }

        /* renamed from: u */
        public FileSystem mo119930u() {
            return RecordAndExtraGCFileSystem.this;
        }
    }

    public RecordAndExtraGCFileSystem(FileSystem fileSystem) {
        this.f348823e = fileSystem;
    }

    public String toString() {
        return "recordGC <- " + this.f348823e;
    }

    /* renamed from: v */
    public Object mo177578v(Map map) {
        return new C116242c((FileSystem.C85995c) this.f348823e.mo177578v(map));
    }

    public void writeToParcel(Parcel parcel, int i) {
        C116299g2.m163866v(parcel, RecordAndExtraGCFileSystem.class, 1);
        parcel.writeParcelable(this.f348823e, i);
    }

    public RecordAndExtraGCFileSystem(Parcel parcel) {
        C116299g2.m163845a(parcel, RecordAndExtraGCFileSystem.class, 1);
        this.f348823e = (FileSystem) parcel.readParcelable(RecordAndExtraGCFileSystem.class.getClassLoader());
    }
}
