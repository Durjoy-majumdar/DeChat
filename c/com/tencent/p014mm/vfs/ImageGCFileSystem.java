package com.tencent.p014mm.vfs;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.sdk.platformtools.FilePathGenerator;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116344z0;
import com.tencent.p014mm.vfs.FileSystem;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.mm.vfs.ImageGCFileSystem */
public class ImageGCFileSystem extends AbstractFileSystem {
    public static final Parcelable.Creator<ImageGCFileSystem> CREATOR = new C116216a();

    /* renamed from: f */
    public static boolean f348762f;

    /* renamed from: g */
    public static boolean f348763g;

    /* renamed from: e */
    public final FileSystem f348764e;

    /* renamed from: com.tencent.mm.vfs.ImageGCFileSystem$a */
    public class C116216a implements Parcelable.Creator<ImageGCFileSystem> {
        public Object createFromParcel(Parcel parcel) {
            return new ImageGCFileSystem(parcel);
        }

        public Object[] newArray(int i) {
            return new ImageGCFileSystem[i];
        }
    }

    /* renamed from: com.tencent.mm.vfs.ImageGCFileSystem$b */
    public static final class C116217b implements C116344z0.C116345a {
        /* renamed from: a */
        public void mo177613a(String str, FileSystem fileSystem, int i, Map<String, Object> map) {
            Log.m105924i("VFS.ImageGCFileSystem", "statistics id = " + str + ", p = " + map.toString());
        }
    }

    /* renamed from: com.tencent.mm.vfs.ImageGCFileSystem$c */
    public class C116218c extends C116309m {

        /* renamed from: e */
        public final FileSystem.C85995c f348765e;

        /* renamed from: f */
        public final List<FileSystem.C85995c> f348766f;

        public C116218c(FileSystem.C85995c cVar) {
            this.f348765e = cVar;
            this.f348766f = Collections.singletonList(cVar);
        }

        /* renamed from: G */
        public List<FileSystem.C85995c> mo119926G() {
            return this.f348766f;
        }

        /* renamed from: H */
        public FileSystem.C85995c mo119927H(String str, int i) {
            return this.f348765e;
        }

        /* renamed from: N */
        public final boolean mo177666N(C86001b0 b0Var) {
            if (!ImageGCFileSystem.f348762f || System.currentTimeMillis() - b0Var.f250475e <= 86400000) {
                return false;
            }
            boolean b = b0Var.mo119955b(true);
            Log.m105924i("VFS.ImageGCFileSystem", "deleteFile, fe = " + b0Var.f250471a + ", ret = " + b + ", modifiedTime = " + b0Var.f250475e);
            return b;
        }

        /* JADX WARNING: Removed duplicated region for block: B:103:0x0232  */
        /* JADX WARNING: Removed duplicated region for block: B:104:0x0234  */
        /* JADX WARNING: Removed duplicated region for block: B:106:0x0237  */
        /* JADX WARNING: Removed duplicated region for block: B:113:0x0266  */
        /* JADX WARNING: Removed duplicated region for block: B:115:0x026a  */
        /* JADX WARNING: Removed duplicated region for block: B:150:0x0340  */
        /* JADX WARNING: Removed duplicated region for block: B:161:0x03ad  */
        /* JADX WARNING: Removed duplicated region for block: B:165:0x03c5  */
        /* JADX WARNING: Removed duplicated region for block: B:168:0x047f  */
        /* JADX WARNING: Removed duplicated region for block: B:171:0x0510  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x012b A[Catch:{ all -> 0x01c9, all -> 0x01d1, Exception -> 0x01d7 }] */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x013c  */
        /* JADX WARNING: Removed duplicated region for block: B:97:0x01fe  */
        /* JADX WARNING: Removed duplicated region for block: B:98:0x0200  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo119928a(android.os.CancellationSignal r46) {
            /*
                r45 = this;
                r1 = r45
                java.lang.String r2 = "image-clean"
                long r3 = com.tencent.p014mm.vfs.C116299g2.m163863s(r2)
                f40.o r0 = f40.C86709a0.m107535s()
                boolean r0 = r0.mo121146m()
                r5 = 22046(0x561e, float:3.0893E-41)
                java.lang.String r6 = "VFS.ImageGCFileSystem"
                if (r0 == 0) goto L_0x0024
                kj2.d r0 = kj2.C117407d.INSTANCE
                java.lang.String r2 = "image2-hasCorruptedDB"
                r0.kvStat(r5, r2)
                java.lang.String r0 = "hasCorruptedDB, skip cleanup."
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
                goto L_0x0534
            L_0x0024:
                f40.o r0 = f40.C86709a0.m107535s()
                boolean r0 = r0.mo121136b()
                if (r0 == 0) goto L_0x003c
                kj2.d r0 = kj2.C117407d.INSTANCE
                java.lang.String r2 = "image2-C2CToBeRescued"
                r0.kvStat(r5, r2)
                java.lang.String r0 = "c2cErrorToBeRescued, skip cleanup."
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
                goto L_0x0534
            L_0x003c:
                boolean r0 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
                java.lang.String r7 = "0"
                r8 = 1
                r9 = 0
                if (r0 != 0) goto L_0x0059
                oa1.d r0 = oa1.C117731d.m166007c()
                java.lang.String r10 = "clicfg_image2_wild_file"
                java.lang.String r0 = r0.mo182444f(r10, r7, r9, r8)
                boolean r0 = r7.equals(r0)
                if (r0 != 0) goto L_0x0057
                goto L_0x0059
            L_0x0057:
                r0 = 0
                goto L_0x005a
            L_0x0059:
                r0 = 1
            L_0x005a:
                if (r0 != 0) goto L_0x0063
                java.lang.String r0 = "X Switch disabled, skip cleanup."
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
                goto L_0x0534
            L_0x0063:
                r10 = 777600000(0x2e593c00, double:3.84185446E-315)
                r12 = 2
                int r0 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
                if (r0 >= 0) goto L_0x0080
                java.lang.Object[] r0 = new java.lang.Object[r12]
                java.lang.Long r2 = java.lang.Long.valueOf(r3)
                r0[r9] = r2
                java.lang.Long r2 = java.lang.Long.valueOf(r10)
                r0[r8] = r2
                java.lang.String r2 = "Image cleanup interval not match, skip cleanup. %d / %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r2, r0)
                goto L_0x0534
            L_0x0080:
                java.lang.String r0 = "doMaintenance"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
                long r3 = java.lang.System.currentTimeMillis()
                java.lang.String r10 = "Failed to get hash list."
                f40.o r0 = f40.C86709a0.m107535s()
                zh3.f r0 = r0.f251811i
                com.tencent.wcdb.database.SQLiteDatabase r0 = r0.mo125615f()
                java.lang.String r11 = "^THUMBNAIL_DIRPATH://th_[0-9a-f]{32}$"
                java.util.regex.Pattern r11 = java.util.regex.Pattern.compile(r11)
                java.lang.String r13 = "^[0-9a-f]{32}"
                java.util.regex.Pattern r13 = java.util.regex.Pattern.compile(r13)
                java.lang.String r14 = "^([A-Za-z0-9_@\\-]+_[A-Za-z0-9_@\\-]+_[0-9]+_backup)(?:__hd)?$"
                java.util.regex.Pattern r14 = java.util.regex.Pattern.compile(r14)
                java.lang.String r15 = "^([A-Za-z0-9_@\\-]+_[A-Za-z0-9_@\\-]+_[0-9]+_backup)(?:_hd)?$"
                java.util.regex.Pattern r15 = java.util.regex.Pattern.compile(r15)
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                r12 = 0
                com.tencent.wcdb.database.SQLiteDatabase$CursorFactory r8 = com.tencent.wcdb.database.SQLiteDirectCursor.FACTORY     // Catch:{ Exception -> 0x01d9 }
                java.lang.String r9 = "SELECT bigImgPath,thumbImgPath FROM ImgInfo2, message WHERE message.type=3 AND (ImgInfo2.msglocalid=message.msgId OR ImgInfo2.msgSvrId=message.msgSvrId)"
                r17 = r2
                java.lang.String r2 = "ImgInfo2"
                com.tencent.wcdb.Cursor r2 = r0.rawQueryWithFactory(r8, r9, r12, r2)     // Catch:{ Exception -> 0x01d7 }
            L_0x00bf:
                boolean r8 = r2.moveToNext()     // Catch:{ all -> 0x01c9 }
                if (r8 == 0) goto L_0x0145
                r46.throwIfCanceled()     // Catch:{ all -> 0x01c9 }
                r8 = 0
                java.lang.String r12 = r2.getString(r8)     // Catch:{ all -> 0x01c9 }
                r8 = 1
                java.lang.String r9 = r2.getString(r8)     // Catch:{ all -> 0x01c9 }
                java.util.regex.Matcher r8 = r11.matcher(r9)     // Catch:{ all -> 0x01c9 }
                boolean r8 = r8.matches()     // Catch:{ all -> 0x01c9 }
                if (r8 == 0) goto L_0x00e7
                r8 = 23
                java.lang.String r8 = r9.substring(r8)     // Catch:{ all -> 0x01c9 }
                r5.add(r8)     // Catch:{ all -> 0x01c9 }
                r8 = 1
                goto L_0x00e8
            L_0x00e7:
                r8 = 0
            L_0x00e8:
                java.util.regex.Matcher r19 = r13.matcher(r12)     // Catch:{ all -> 0x01c9 }
                boolean r20 = r19.find()     // Catch:{ all -> 0x01c9 }
                if (r20 == 0) goto L_0x00fc
                java.lang.String r8 = r19.group()     // Catch:{ all -> 0x01c9 }
                r5.add(r8)     // Catch:{ all -> 0x01c9 }
                r20 = r13
                goto L_0x0127
            L_0x00fc:
                r19 = r8
                java.util.regex.Matcher r8 = r14.matcher(r12)     // Catch:{ all -> 0x01c9 }
                boolean r20 = r8.matches()     // Catch:{ all -> 0x01c9 }
                if (r20 == 0) goto L_0x0113
                r20 = r13
                r13 = 1
                java.lang.String r8 = r8.group(r13)     // Catch:{ all -> 0x01c9 }
                r5.add(r8)     // Catch:{ all -> 0x01c9 }
                goto L_0x0127
            L_0x0113:
                r20 = r13
                java.util.regex.Matcher r8 = r15.matcher(r12)     // Catch:{ all -> 0x01c9 }
                boolean r13 = r8.matches()     // Catch:{ all -> 0x01c9 }
                if (r13 == 0) goto L_0x0129
                r13 = 1
                java.lang.String r8 = r8.group(r13)     // Catch:{ all -> 0x01c9 }
                r5.add(r8)     // Catch:{ all -> 0x01c9 }
            L_0x0127:
                r19 = 1
            L_0x0129:
                if (r19 != 0) goto L_0x013c
                java.lang.String r8 = "Invalid ImgInfo found, thumbPath: %s, bigPath: %s"
                r19 = r14
                r13 = 2
                java.lang.Object[] r14 = new java.lang.Object[r13]     // Catch:{ all -> 0x01c9 }
                r13 = 0
                r14[r13] = r9     // Catch:{ all -> 0x01c9 }
                r9 = 1
                r14[r9] = r12     // Catch:{ all -> 0x01c9 }
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r6, r8, r14)     // Catch:{ all -> 0x01c9 }
                goto L_0x013e
            L_0x013c:
                r19 = r14
            L_0x013e:
                r14 = r19
                r13 = r20
                r12 = 0
                goto L_0x00bf
            L_0x0145:
                r2.close()     // Catch:{ Exception -> 0x01d7 }
                com.tencent.wcdb.database.SQLiteDatabase$CursorFactory r2 = com.tencent.wcdb.database.SQLiteDirectCursor.FACTORY     // Catch:{ Exception -> 0x01c0 }
                java.lang.String r8 = "SELECT imgPath FROM message WHERE type=49 OR type=1040187441 OR type=452984881 OR type=436207665"
                java.lang.String r9 = "message"
                r12 = 0
                com.tencent.wcdb.Cursor r2 = r0.rawQueryWithFactory(r2, r8, r12, r9)     // Catch:{ Exception -> 0x01c0 }
            L_0x0153:
                boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x01b2 }
                if (r0 == 0) goto L_0x0183
                r46.throwIfCanceled()     // Catch:{ all -> 0x01b2 }
                r8 = 0
                java.lang.String r0 = r2.getString(r8)     // Catch:{ all -> 0x01b2 }
                java.util.regex.Matcher r8 = r11.matcher(r0)     // Catch:{ all -> 0x01b2 }
                boolean r8 = r8.matches()     // Catch:{ all -> 0x01b2 }
                if (r8 == 0) goto L_0x0175
                r8 = 23
                java.lang.String r0 = r0.substring(r8)     // Catch:{ all -> 0x01b2 }
                r5.add(r0)     // Catch:{ all -> 0x01b2 }
                goto L_0x0153
            L_0x0175:
                r8 = 23
                java.lang.String r9 = "Invalid imgPath in message found, imgPath: %s"
                r12 = 1
                java.lang.Object[] r13 = new java.lang.Object[r12]     // Catch:{ all -> 0x01b2 }
                r12 = 0
                r13[r12] = r0     // Catch:{ all -> 0x01b2 }
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r6, r9, r13)     // Catch:{ all -> 0x01b2 }
                goto L_0x0153
            L_0x0183:
                r2.close()     // Catch:{ Exception -> 0x01c0 }
                java.util.Collections.sort(r5)
                java.util.ArrayList r12 = new java.util.ArrayList
                int r0 = r5.size()
                r12.<init>(r0)
                java.util.Iterator r0 = r5.iterator()
                r2 = 0
            L_0x0197:
                boolean r5 = r0.hasNext()
                if (r5 == 0) goto L_0x01b0
                java.lang.Object r5 = r0.next()
                java.lang.String r5 = (java.lang.String) r5
                if (r5 == 0) goto L_0x0197
                boolean r8 = r5.equals(r2)
                if (r8 != 0) goto L_0x0197
                r12.add(r5)
                r2 = r5
                goto L_0x0197
            L_0x01b0:
                r2 = 0
                goto L_0x01e3
            L_0x01b2:
                r0 = move-exception
                r5 = r0
                if (r2 == 0) goto L_0x01bf
                r2.close()     // Catch:{ all -> 0x01ba }
                goto L_0x01bf
            L_0x01ba:
                r0 = move-exception
                r2 = r0
                r5.addSuppressed(r2)     // Catch:{ Exception -> 0x01c0 }
            L_0x01bf:
                throw r5     // Catch:{ Exception -> 0x01c0 }
            L_0x01c0:
                r0 = move-exception
                r2 = 0
                java.lang.Object[] r5 = new java.lang.Object[r2]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r10, r5)
                r2 = 0
                goto L_0x01e2
            L_0x01c9:
                r0 = move-exception
                r5 = r0
                if (r2 == 0) goto L_0x01d6
                r2.close()     // Catch:{ all -> 0x01d1 }
                goto L_0x01d6
            L_0x01d1:
                r0 = move-exception
                r2 = r0
                r5.addSuppressed(r2)     // Catch:{ Exception -> 0x01d7 }
            L_0x01d6:
                throw r5     // Catch:{ Exception -> 0x01d7 }
            L_0x01d7:
                r0 = move-exception
                goto L_0x01dc
            L_0x01d9:
                r0 = move-exception
                r17 = r2
            L_0x01dc:
                r2 = 0
                java.lang.Object[] r5 = new java.lang.Object[r2]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r10, r5)
            L_0x01e2:
                r12 = 0
            L_0x01e3:
                r46.throwIfCanceled()
                boolean r0 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
                if (r0 != 0) goto L_0x0200
                oa1.d r0 = oa1.C117731d.m166007c()
                java.lang.String r5 = "clicfg_wild_file_image_clean"
                r8 = 1
                java.lang.String r0 = r0.mo182444f(r5, r7, r2, r8)
                boolean r0 = r7.equals(r0)
                if (r0 != 0) goto L_0x01fe
                goto L_0x0200
            L_0x01fe:
                r0 = 0
                goto L_0x0201
            L_0x0200:
                r0 = 1
            L_0x0201:
                com.tencent.p014mm.vfs.ImageGCFileSystem.f348762f = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "isCleanExpt = "
                r0.append(r2)
                boolean r2 = com.tencent.p014mm.vfs.ImageGCFileSystem.f348762f
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
                boolean r0 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
                if (r0 != 0) goto L_0x0234
                oa1.d r0 = oa1.C117731d.m166007c()
                java.lang.String r2 = "clicfg_wild_file_image2_thumb_scan"
                r5 = 1
                r8 = 0
                java.lang.String r0 = r0.mo182444f(r2, r7, r8, r5)
                boolean r0 = r7.equals(r0)
                if (r0 != 0) goto L_0x0232
                goto L_0x0234
            L_0x0232:
                r0 = 0
                goto L_0x0235
            L_0x0234:
                r0 = 1
            L_0x0235:
                if (r0 == 0) goto L_0x0266
                boolean r0 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
                if (r0 != 0) goto L_0x0252
                oa1.d r0 = oa1.C117731d.m166007c()
                java.lang.String r2 = "clicfg_wild_file_image2_thumb_clean_1"
                r5 = 1
                r8 = 0
                java.lang.String r0 = r0.mo182444f(r2, r7, r8, r5)
                boolean r0 = r7.equals(r0)
                if (r0 != 0) goto L_0x0250
                goto L_0x0252
            L_0x0250:
                r0 = 0
                goto L_0x0253
            L_0x0252:
                r0 = 1
            L_0x0253:
                com.tencent.p014mm.vfs.ImageGCFileSystem.f348763g = r0
                zt3.t r0 = zt3.C119157j.f356862d
                com.tencent.mm.vfs.h0 r2 = new com.tencent.mm.vfs.h0
                r5 = r46
                r2.<init>(r1, r5)
                zt3.j r0 = (zt3.C119157j) r0
                java.lang.String r7 = "ScanAndReportThumb"
                r0.mo183876g(r2, r7)
                goto L_0x0268
            L_0x0266:
                r5 = r46
            L_0x0268:
                if (r12 == 0) goto L_0x03c5
                java.lang.String r0 = ""
                r2 = 0
                r9 = 0
                java.lang.Iterable r0 = com.tencent.p014mm.vfs.C116299g2.m163860p(r1, r0, r9, r2)
                if (r0 != 0) goto L_0x0278
                java.util.List r0 = java.util.Collections.emptyList()
            L_0x0278:
                java.lang.String r2 = "[0-9a-f]{32}"
                java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
                java.lang.String r9 = "[A-Za-z0-9_@\\-]+_[A-Za-z0-9_@\\-]+_[0-9]+_backup"
                java.util.regex.Pattern r9 = java.util.regex.Pattern.compile(r9)
                java.lang.String r10 = "(?:th_(?:photoEdited|capture)_)?(1[3-7][0-9]{11,})"
                java.util.regex.Pattern r10 = java.util.regex.Pattern.compile(r10)
                java.util.Iterator r0 = r0.iterator()
                r11 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 0
                r23 = 0
                r25 = 0
                r27 = 0
                r29 = 0
                r31 = 0
            L_0x02a4:
                boolean r33 = r0.hasNext()
                if (r33 == 0) goto L_0x03be
                java.lang.Object r33 = r0.next()
                r7 = r33
                com.tencent.mm.vfs.b0 r7 = (com.tencent.p014mm.vfs.C86001b0) r7
                boolean r8 = r46.isCanceled()
                if (r8 == 0) goto L_0x02c5
                java.lang.String r0 = "cs.isCanceled break"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
                r36 = r3
                r8 = r11
                r2 = r21
                r0 = 1
                goto L_0x03de
            L_0x02c5:
                java.lang.String r8 = r7.f250471a
                r33 = r0
                java.lang.String r0 = ".ref"
                boolean r0 = r8.startsWith(r0)
                if (r0 == 0) goto L_0x02d4
                r0 = r33
                goto L_0x02a4
            L_0x02d4:
                boolean r0 = r7.f250476f
                if (r0 != 0) goto L_0x03b4
                java.lang.String r0 = r7.f250472b
                java.util.regex.Matcher r0 = r2.matcher(r0)
                boolean r8 = r0.find()
                if (r8 == 0) goto L_0x02fa
                java.lang.String r0 = r0.group()
                int r0 = java.util.Collections.binarySearch(r12, r0)
                if (r0 < 0) goto L_0x02f2
                r0 = r2
                r36 = r3
                goto L_0x0313
            L_0x02f2:
                int r15 = r15 + 1
                r0 = r2
                r36 = r3
                long r2 = r7.f250474d
                goto L_0x0319
            L_0x02fa:
                r0 = r2
                r36 = r3
                java.lang.String r2 = r7.f250472b
                java.util.regex.Matcher r2 = r9.matcher(r2)
                boolean r3 = r2.find()
                if (r3 == 0) goto L_0x031c
                java.lang.String r2 = r2.group()
                int r2 = java.util.Collections.binarySearch(r12, r2)
                if (r2 < 0) goto L_0x0315
            L_0x0313:
                r2 = 0
                goto L_0x033e
            L_0x0315:
                int r15 = r15 + 1
                long r2 = r7.f250474d
            L_0x0319:
                long r29 = r29 + r2
                goto L_0x0339
            L_0x031c:
                java.lang.String r2 = r7.f250472b
                java.util.regex.Matcher r2 = r10.matcher(r2)
                boolean r2 = r2.matches()
                if (r2 == 0) goto L_0x032f
                int r18 = r18 + 1
                long r2 = r7.f250474d
                long r31 = r31 + r2
                goto L_0x0339
            L_0x032f:
                java.lang.String r2 = r7.f250472b
                java.lang.String r3 = ".nomedia"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x033b
            L_0x0339:
                r2 = 1
                goto L_0x033e
            L_0x033b:
                int r19 = r19 + 1
                r2 = 2
            L_0x033e:
                if (r2 == 0) goto L_0x03ad
                java.lang.String r3 = ", diskSpace = "
                r4 = 1
                if (r2 == r4) goto L_0x037c
                r4 = 2
                if (r2 == r4) goto L_0x0349
                goto L_0x03b7
            L_0x0349:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "Illegal file found: "
                r2.append(r4)
                java.lang.String r4 = r7.f250471a
                r2.append(r4)
                r2.append(r3)
                long r3 = r7.f250474d
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r2)
                int r14 = r14 + 1
                long r2 = r7.f250474d
                long r27 = r27 + r2
                int r20 = r20 + 1
                long r21 = r21 + r2
                boolean r2 = r1.mo177666N(r7)
                if (r2 == 0) goto L_0x03b7
                int r11 = r11 + 1
                long r2 = r7.f250474d
                goto L_0x03aa
            L_0x037c:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "Wild file found: "
                r2.append(r4)
                java.lang.String r4 = r7.f250471a
                r2.append(r4)
                r2.append(r3)
                long r3 = r7.f250474d
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r2)
                int r20 = r20 + 1
                long r2 = r7.f250474d
                long r21 = r21 + r2
                boolean r2 = r1.mo177666N(r7)
                if (r2 == 0) goto L_0x03b7
                int r11 = r11 + 1
                long r2 = r7.f250474d
            L_0x03aa:
                long r23 = r23 + r2
                goto L_0x03b7
            L_0x03ad:
                int r13 = r13 + 1
                long r2 = r7.f250474d
                long r25 = r25 + r2
                goto L_0x03b7
            L_0x03b4:
                r0 = r2
                r36 = r3
            L_0x03b7:
                r2 = r0
                r0 = r33
                r3 = r36
                goto L_0x02a4
            L_0x03be:
                r36 = r3
                r8 = r11
                r2 = r21
                r0 = 0
                goto L_0x03de
            L_0x03c5:
                r36 = r3
                r0 = 0
                r2 = 0
                r8 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                r23 = 0
                r25 = 0
                r27 = 0
                r29 = 0
                r31 = 0
            L_0x03de:
                r4 = 14
                java.lang.Object[] r7 = new java.lang.Object[r4]
                java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
                r10 = 0
                r7[r10] = r9
                java.lang.Long r9 = java.lang.Long.valueOf(r23)
                r10 = 1
                r7[r10] = r9
                java.lang.Integer r9 = java.lang.Integer.valueOf(r13)
                r10 = 2
                r7[r10] = r9
                java.lang.Long r9 = java.lang.Long.valueOf(r25)
                r10 = 3
                r7[r10] = r9
                java.lang.Integer r9 = java.lang.Integer.valueOf(r14)
                r11 = 4
                r7[r11] = r9
                java.lang.Long r9 = java.lang.Long.valueOf(r27)
                r12 = 5
                r7[r12] = r9
                java.lang.Integer r9 = java.lang.Integer.valueOf(r15)
                r21 = 6
                r7[r21] = r9
                java.lang.Long r9 = java.lang.Long.valueOf(r29)
                r22 = 7
                r7[r22] = r9
                java.lang.Integer r9 = java.lang.Integer.valueOf(r18)
                r33 = 8
                r7[r33] = r9
                java.lang.Long r9 = java.lang.Long.valueOf(r31)
                r38 = 9
                r7[r38] = r9
                java.lang.Integer r9 = java.lang.Integer.valueOf(r19)
                r39 = 10
                r7[r39] = r9
                r34 = 0
                java.lang.Long r9 = java.lang.Long.valueOf(r34)
                r40 = 11
                r7[r40] = r9
                java.lang.Integer r9 = java.lang.Integer.valueOf(r20)
                r41 = 12
                r7[r41] = r9
                java.lang.Long r9 = java.lang.Long.valueOf(r2)
                r42 = 13
                r7[r42] = r9
                java.lang.String r9 = " > deletedFiles: %d, deletedSize: %d\n > keptFiles: %d, keptSize: %d\n > illegalFiles: %d, illegalSize: %d\n > wildFiles: %d, wildSize: %d\n > tempFiles: %d, tempSize: %d\n > customFiles: %d, customSize: %d\n > totalWildFiles: %d, totalWildSize: %d\n"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r9, r7)
                long r43 = java.lang.System.currentTimeMillis()
                long r4 = r43 - r36
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r7 = "duration = "
                r9.append(r7)
                r9.append(r4)
                java.lang.String r7 = r9.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r6 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
                r11 = -1
                java.lang.String r7 = "extreme_storage_wechat_total"
                long r6 = r6.getLong(r7, r11)
                r43 = -1
                int r44 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r44 == 0) goto L_0x0489
                float r9 = (float) r2
                float r6 = (float) r6
                float r9 = r9 / r6
                r6 = 1120403456(0x42c80000, float:100.0)
                float r9 = r9 * r6
                int r6 = (int) r9
                r43 = r6
            L_0x0489:
                kj2.d r6 = kj2.C117407d.INSTANCE
                r7 = 18
                java.lang.Object[] r7 = new java.lang.Object[r7]
                java.lang.String r9 = "image-v3"
                r16 = 0
                r7[r16] = r9
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                r9 = 1
                r7[r9] = r8
                java.lang.Long r8 = java.lang.Long.valueOf(r23)
                r9 = 2
                r7[r9] = r8
                java.lang.Integer r8 = java.lang.Integer.valueOf(r13)
                r7[r10] = r8
                java.lang.Long r8 = java.lang.Long.valueOf(r25)
                r9 = 4
                r7[r9] = r8
                java.lang.Integer r8 = java.lang.Integer.valueOf(r14)
                r9 = 5
                r7[r9] = r8
                java.lang.Long r8 = java.lang.Long.valueOf(r27)
                r7[r21] = r8
                java.lang.Integer r8 = java.lang.Integer.valueOf(r15)
                r7[r22] = r8
                java.lang.Long r8 = java.lang.Long.valueOf(r29)
                r7[r33] = r8
                java.lang.Integer r8 = java.lang.Integer.valueOf(r18)
                r7[r38] = r8
                java.lang.Long r8 = java.lang.Long.valueOf(r31)
                r7[r39] = r8
                java.lang.Integer r8 = java.lang.Integer.valueOf(r19)
                r7[r40] = r8
                r8 = 0
                java.lang.Long r8 = java.lang.Long.valueOf(r8)
                r7[r41] = r8
                java.lang.Integer r8 = java.lang.Integer.valueOf(r20)
                r7[r42] = r8
                java.lang.Long r8 = java.lang.Long.valueOf(r2)
                r9 = 14
                r7[r9] = r8
                r8 = 15
                java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
                r7[r8] = r9
                r8 = 16
                java.lang.Integer r9 = java.lang.Integer.valueOf(r43)
                r7[r8] = r9
                r8 = 17
                java.lang.Long r4 = java.lang.Long.valueOf(r4)
                r7[r8] = r4
                r4 = 22046(0x561e, float:3.0893E-41)
                r6.mo160131h(r4, r7)
                if (r0 != 0) goto L_0x0534
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
                java.lang.String r4 = "recent_image_wild_file_size"
                r0.putLong(r4, r2)
                com.tencent.p014mm.vfs.C116299g2.m163864t(r17)
                r4 = 209715200(0xc800000, double:1.036130757E-315)
                java.lang.String r0 = "extreme_storage_image2_wild_file_size"
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 <= 0) goto L_0x052d
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r4 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
                r4.putLong(r0, r2)
                goto L_0x0534
            L_0x052d:
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r2 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
                r2.putLong(r0, r11)
            L_0x0534:
                r46.throwIfCanceled()
                super.mo119928a(r46)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.vfs.ImageGCFileSystem.C116218c.mo119928a(android.os.CancellationSignal):void");
        }

        public String toString() {
            return "imageGC <- " + this.f348765e;
        }

        /* renamed from: u */
        public FileSystem mo119930u() {
            return ImageGCFileSystem.this;
        }
    }

    public ImageGCFileSystem(FileSystem fileSystem) {
        this.f348764e = fileSystem;
    }

    /* renamed from: b */
    public static String m163646b(String str, String str2, String str3, boolean z) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        String str4 = VFSStrategy.m163776d("image2") + "/";
        if (str.startsWith("THUMBNAIL_DIRPATH://")) {
            str = str.substring(23);
            str2 = "th_";
        }
        return FilePathGenerator.defGenPathWithOld(VFSStrategy.m163776d("image") + "/", str4, str2, str, str3, 1, z);
    }

    public String toString() {
        return "imageGC <- " + this.f348764e;
    }

    /* renamed from: v */
    public Object mo177578v(Map map) {
        return new C116218c((FileSystem.C85995c) this.f348764e.mo177578v(map));
    }

    public void writeToParcel(Parcel parcel, int i) {
        C116299g2.m163866v(parcel, ImageGCFileSystem.class, 1);
        parcel.writeParcelable(this.f348764e, i);
    }

    public ImageGCFileSystem(Parcel parcel) {
        C116299g2.m163845a(parcel, ImageGCFileSystem.class, 1);
        this.f348764e = (FileSystem) parcel.readParcelable(ImageGCFileSystem.class.getClassLoader());
    }
}
