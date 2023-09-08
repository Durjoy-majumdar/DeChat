package com.tencent.p014mm.vfs;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116344z0;
import com.tencent.p014mm.vfs.FileSystem;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kj2.C117407d;
import oa1.C117731d;
import zh3.C119118e;

/* renamed from: com.tencent.mm.vfs.VideoGCFileSystem */
public class VideoGCFileSystem extends AbstractFileSystem {
    public static final Parcelable.Creator<VideoGCFileSystem> CREATOR = new C116255a();

    /* renamed from: f */
    public static boolean f348881f;

    /* renamed from: e */
    public final FileSystem f348882e;

    /* renamed from: com.tencent.mm.vfs.VideoGCFileSystem$a */
    public class C116255a implements Parcelable.Creator<VideoGCFileSystem> {
        public Object createFromParcel(Parcel parcel) {
            return new VideoGCFileSystem(parcel);
        }

        public Object[] newArray(int i) {
            return new VideoGCFileSystem[i];
        }
    }

    /* renamed from: com.tencent.mm.vfs.VideoGCFileSystem$b */
    public static final class C116256b implements C116344z0.C116345a {
        /* renamed from: a */
        public void mo177613a(String str, FileSystem fileSystem, int i, Map<String, Object> map) {
        }
    }

    /* renamed from: com.tencent.mm.vfs.VideoGCFileSystem$c */
    public class C116257c extends C116309m {

        /* renamed from: e */
        public final FileSystem.C85995c f348883e;

        /* renamed from: f */
        public final List<FileSystem.C85995c> f348884f;

        public C116257c(FileSystem.C85995c cVar) {
            this.f348883e = cVar;
            this.f348884f = Collections.singletonList(cVar);
        }

        /* renamed from: G */
        public List<FileSystem.C85995c> mo119926G() {
            return this.f348884f;
        }

        /* renamed from: H */
        public FileSystem.C85995c mo119927H(String str, int i) {
            return this.f348883e;
        }

        /* renamed from: N */
        public final boolean mo177769N(C86001b0 b0Var) {
            if (!VideoGCFileSystem.f348881f || System.currentTimeMillis() - b0Var.f250475e <= 86400000) {
                return false;
            }
            boolean b = b0Var.mo119955b(true);
            Log.m105924i("VFS.VideoGCFileSystem", "deleteFile, fe = " + b0Var.f250471a + ", ret = " + b + ", modifiedTime = " + b0Var.f250475e);
            return b;
        }

        /* renamed from: a */
        public void mo119928a(CancellationSignal cancellationSignal) {
            String str;
            long j;
            long j2;
            String str2;
            String str3 = "video-clean";
            long s = C116299g2.m163863s(str3);
            if (C86709a0.m107535s().mo121146m()) {
                C117407d.INSTANCE.kvStat(22046, "video-hasCorruptedDB");
                Log.m105924i("VFS.VideoGCFileSystem", "hasCorruptedDB, skip cleanup.");
            } else if (C86709a0.m107535s().mo121136b()) {
                C117407d.INSTANCE.kvStat(22046, "video-C2CToBeRescued");
                Log.m105924i("VFS.VideoGCFileSystem", "c2cErrorToBeRescued, skip cleanup.");
            } else {
                if (!(WeChatEnvironment.hasDebugger() || !"0".equals(C117731d.m166007c().mo182444f("clicfg_wild_file_video_scan", "0", false, true)))) {
                    Log.m105924i("VFS.VideoGCFileSystem", "X Switch disabled, skip cleanup.");
                } else {
                    if (s < 864000000) {
                        Log.m105925i("VFS.VideoGCFileSystem", "Image cleanup interval not match, skip cleanup. %d / %d", Long.valueOf(s), 864000000L);
                    } else {
                        long currentTimeMillis = System.currentTimeMillis();
                        FileSystem.C85995c[] cVarArr = {new NativeFileSystem("${sdTo}/MicroMsg/${accountSd}/video").mo177578v(C116281f0.C116289i.f348994a.mo177791d()), this};
                        VideoGCFileSystem.f348881f = WeChatEnvironment.hasDebugger() || !"0".equals(C117731d.m166007c().mo182444f("clicfg_wild_file_video_clean", "0", false, true));
                        Log.m105924i("VFS.VideoGCFileSystem", "isCleanExpt = " + VideoGCFileSystem.f348881f);
                        cancellationSignal.throwIfCanceled();
                        C119118e eVar = C86709a0.m107535s().f251811i.f262815b;
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor u = eVar.mo183823u("SELECT imgPath FROM message WHERE type=43", (String[]) null, 0, false);
                            while (u.moveToNext()) {
                                arrayList.add(u.getString(0));
                            }
                            u.close();
                            Log.m105924i("VFS.VideoGCFileSystem", "videoPathList size = " + arrayList.size());
                            int i = 0;
                            int i2 = 0;
                            long j3 = 0;
                            int i3 = 0;
                            long j4 = 0;
                            int i4 = 0;
                            for (int i5 = 2; i2 < i5; i5 = 2) {
                                Iterable o = C116299g2.m163859o(cVarArr[i2], "");
                                if (o == null) {
                                    o = Collections.emptyList();
                                }
                                Iterator it = o.iterator();
                                int i6 = i;
                                while (true) {
                                    if (!it.hasNext()) {
                                        str = str3;
                                        j = currentTimeMillis;
                                        break;
                                    }
                                    C86001b0 b0Var = (C86001b0) it.next();
                                    if (cancellationSignal.isCanceled()) {
                                        Log.m105924i("VFS.VideoGCFileSystem", "cs.isCanceled break");
                                        str = str3;
                                        j = currentTimeMillis;
                                        i4 = 1;
                                        break;
                                    } else if (!b0Var.f250471a.startsWith(".ref")) {
                                        if (b0Var.f250476f) {
                                            str2 = str3;
                                            j2 = currentTimeMillis;
                                        } else if (!b0Var.f250472b.contains(".")) {
                                            StringBuilder sb = new StringBuilder();
                                            sb.append("videoDataWildFile0 path = ");
                                            sb.append(b0Var.f250471a);
                                            sb.append(", diskSpace = ");
                                            str2 = str3;
                                            j2 = currentTimeMillis;
                                            sb.append(b0Var.f250474d);
                                            Log.m105924i("VFS.VideoGCFileSystem", sb.toString());
                                            i3++;
                                            j3 += b0Var.f250474d;
                                            if (mo177769N(b0Var)) {
                                                i6++;
                                                j4 += b0Var.f250474d;
                                            }
                                        } else {
                                            str2 = str3;
                                            j2 = currentTimeMillis;
                                            String str4 = b0Var.f250472b;
                                            String substring = str4.substring(0, str4.lastIndexOf("."));
                                            if (substring.startsWith("send")) {
                                                substring = substring.substring(4);
                                            }
                                            if (substring.endsWith(FirebaseAnalytics.C113379b.ORIGIN)) {
                                                substring = substring.substring(0, substring.length() - 6);
                                            }
                                            if (substring.endsWith("_hd")) {
                                                substring = substring.substring(0, substring.length() - 3);
                                            }
                                            try {
                                                if (!arrayList.contains(substring)) {
                                                    Cursor u2 = eVar.mo183823u("SELECT filename FROM massendinfo WHERE filename=?", new String[]{substring}, 0, false);
                                                    u2.moveToFirst();
                                                    u2.close();
                                                    if (!(((long) u2.getCount()) != 0)) {
                                                        i3++;
                                                        j3 += b0Var.f250474d;
                                                        if (mo177769N(b0Var)) {
                                                            i6++;
                                                            j4 += b0Var.f250474d;
                                                        }
                                                        Log.m105924i("VFS.VideoGCFileSystem", "videoDataWildFile1 path = " + b0Var.f250471a + ", diskSpace = " + b0Var.f250474d + ", fe.modifiedTime = " + b0Var.f250475e);
                                                    }
                                                }
                                            } catch (Throwable th) {
                                                Log.m105920e("VFS.VideoGCFileSystem", "db error e = " + th.getMessage());
                                            }
                                        }
                                        str3 = str2;
                                        currentTimeMillis = j2;
                                    }
                                }
                                i2++;
                                i = i6;
                                str3 = str;
                                currentTimeMillis = j;
                            }
                            String str5 = str3;
                            long j5 = currentTimeMillis;
                            arrayList.clear();
                            long j6 = MultiProcessMMKV.getDefault().getLong("extreme_storage_wechat_total", -1);
                            int i7 = -1;
                            long j7 = j3;
                            if (j6 != -1) {
                                i7 = (int) ((((float) j7) / ((float) j6)) * 100.0f);
                            }
                            Log.m105925i("VFS.VideoGCFileSystem", " > deletedFiles: %d, deletedSize: %d\n > keptFiles: %d, keptSize: %d\n > illegalFiles: %d, illegalSize: %d\n > wildFiles: %d, wildSize: %d\n > tempFiles: %d, tempSize: %d\n > noMediaFilesws: %d, noMediaSize: %d > totalWildFile: %d, totalWildSize: %d", Integer.valueOf(i), Long.valueOf(j4), 0, 0L, 0, 0L, 0, 0L, 0, 0L, 0, 0L, Integer.valueOf(i3), Long.valueOf(j7));
                            long currentTimeMillis2 = System.currentTimeMillis() - j5;
                            Log.m105924i("VFS.VideoGCFileSystem", "duration = " + currentTimeMillis2);
                            C117407d.INSTANCE.mo160131h(22046, "video-v3", Integer.valueOf(i), Long.valueOf(j4), 0, 0L, 0, 0L, 0, 0L, 0, 0L, 0, 0L, Integer.valueOf(i3), Long.valueOf(j7), Integer.valueOf(i4), Integer.valueOf(i7), Long.valueOf(currentTimeMillis2));
                            if (i4 == 0) {
                                MultiProcessMMKV.getDefault().putLong("recent_video_wild_file_size", j7);
                                C116299g2.m163864t(str5);
                                if (j7 > 209715200) {
                                    MultiProcessMMKV.getDefault().putLong("extreme_storage_video_wild_file_size", j7);
                                } else {
                                    MultiProcessMMKV.getDefault().putLong("extreme_storage_video_wild_file_size", -1);
                                }
                            }
                        } catch (Throwable th4) {
                            Log.m105920e("VFS.VideoGCFileSystem", "fill videoPathList error : " + th4.getMessage());
                        }
                    }
                }
            }
            cancellationSignal.throwIfCanceled();
            super.mo119928a(cancellationSignal);
        }

        public String toString() {
            return "videoGC <- " + this.f348883e;
        }

        /* renamed from: u */
        public FileSystem mo119930u() {
            return VideoGCFileSystem.this;
        }
    }

    public VideoGCFileSystem(FileSystem fileSystem) {
        this.f348882e = fileSystem;
    }

    public String toString() {
        return "videoGC <- " + this.f348882e;
    }

    /* renamed from: v */
    public Object mo177578v(Map map) {
        return new C116257c((FileSystem.C85995c) this.f348882e.mo177578v(map));
    }

    public void writeToParcel(Parcel parcel, int i) {
        C116299g2.m163866v(parcel, VideoGCFileSystem.class, 1);
        parcel.writeParcelable(this.f348882e, i);
    }

    public VideoGCFileSystem(Parcel parcel) {
        C116299g2.m163845a(parcel, VideoGCFileSystem.class, 1);
        this.f348882e = (FileSystem) parcel.readParcelable(VideoGCFileSystem.class.getClassLoader());
    }
}
