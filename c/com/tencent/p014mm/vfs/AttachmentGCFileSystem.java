package com.tencent.p014mm.vfs;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116344z0;
import com.tencent.p014mm.vfs.FileSystem;
import f40.C86709a0;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kj2.C117407d;
import oa1.C117731d;
import zh3.C119118e;

/* renamed from: com.tencent.mm.vfs.AttachmentGCFileSystem */
public class AttachmentGCFileSystem extends AbstractFileSystem {
    public static final Parcelable.Creator<AttachmentGCFileSystem> CREATOR = new C116194a();

    /* renamed from: f */
    public static boolean f348717f;

    /* renamed from: e */
    public final FileSystem f348718e;

    /* renamed from: com.tencent.mm.vfs.AttachmentGCFileSystem$a */
    public class C116194a implements Parcelable.Creator<AttachmentGCFileSystem> {
        public Object createFromParcel(Parcel parcel) {
            return new AttachmentGCFileSystem(parcel);
        }

        public Object[] newArray(int i) {
            return new AttachmentGCFileSystem[i];
        }
    }

    /* renamed from: com.tencent.mm.vfs.AttachmentGCFileSystem$b */
    public static final class C116195b implements C116344z0.C116345a {
        /* renamed from: a */
        public void mo177613a(String str, FileSystem fileSystem, int i, Map<String, Object> map) {
        }
    }

    /* renamed from: com.tencent.mm.vfs.AttachmentGCFileSystem$c */
    public class C116196c extends C116309m {

        /* renamed from: e */
        public final FileSystem.C85995c f348719e;

        /* renamed from: f */
        public final List<FileSystem.C85995c> f348720f;

        public C116196c(FileSystem.C85995c cVar) {
            this.f348719e = cVar;
            this.f348720f = Collections.singletonList(cVar);
        }

        /* renamed from: G */
        public List<FileSystem.C85995c> mo119926G() {
            return this.f348720f;
        }

        /* renamed from: H */
        public FileSystem.C85995c mo119927H(String str, int i) {
            return this.f348719e;
        }

        /* renamed from: N */
        public final boolean mo177614N(C86001b0 b0Var) {
            if (!AttachmentGCFileSystem.f348717f || System.currentTimeMillis() - b0Var.f250475e <= 86400000) {
                return false;
            }
            boolean b = b0Var.mo119955b(true);
            Log.m105924i("VFS.AttachmentGCFileSystem", "deleteFile, fe = " + b0Var.f250471a + ", ret = " + b + ", modifiedTime = " + b0Var.f250475e);
            return b;
        }

        /* renamed from: a */
        public void mo119928a(CancellationSignal cancellationSignal) {
            String str;
            FileSystem.C85995c[] cVarArr;
            String str2;
            Iterator it;
            FileSystem.C85995c[] cVarArr2;
            String str3;
            long j;
            StringBuilder sb;
            String str4 = "attachment-clean";
            long s = C116299g2.m163863s(str4);
            if (C86709a0.m107535s().mo121146m()) {
                C117407d.INSTANCE.kvStat(22046, "attachment-hasCorruptedDB");
                Log.m105924i("VFS.AttachmentGCFileSystem", "hasCorruptedDB, skip cleanup.");
            } else if (C86709a0.m107535s().mo121136b()) {
                C117407d.INSTANCE.kvStat(22046, "attachment-C2CToBeRescued");
                Log.m105924i("VFS.AttachmentGCFileSystem", "c2cErrorToBeRescued, skip cleanup.");
            } else {
                boolean z = false;
                if (!(WeChatEnvironment.hasDebugger() || !"0".equals(C117731d.m166007c().mo182444f("clicfg_wild_file_attachment_scan", "0", false, true)))) {
                    Log.m105924i("VFS.AttachmentGCFileSystem", "X Switch disabled, skip cleanup.");
                } else {
                    if (s < 950400000) {
                        Log.m105925i("VFS.AttachmentGCFileSystem", "Image cleanup interval not match, skip cleanup. %d / %d", Long.valueOf(s), 950400000L);
                    } else {
                        Log.m105924i("VFS.AttachmentGCFileSystem", "doMaintenance");
                        long currentTimeMillis = System.currentTimeMillis();
                        FileSystem.C85995c[] cVarArr3 = {new NativeFileSystem("${sdTo}/MicroMsg/${accountSd}/attachment").mo177578v(C116281f0.C116289i.f348994a.mo177791d()), this};
                        AttachmentGCFileSystem.f348717f = WeChatEnvironment.hasDebugger() || !"0".equals(C117731d.m166007c().mo182444f("clicfg_wild_file_attachment_clean", "0", false, true));
                        Log.m105924i("VFS.AttachmentGCFileSystem", "isCleanExpt = " + AttachmentGCFileSystem.f348717f);
                        cancellationSignal.throwIfCanceled();
                        C119118e eVar = C86709a0.m107535s().f251811i.f262815b;
                        int i = 0;
                        int i2 = 0;
                        long j2 = 0;
                        long j3 = 0;
                        int i3 = 0;
                        int i4 = 0;
                        for (int i5 = 2; i2 < i5; i5 = 2) {
                            Iterable o = C116299g2.m163859o(cVarArr3[i2], "");
                            if (o == null) {
                                o = Collections.emptyList();
                            }
                            Iterator it4 = o.iterator();
                            int i6 = i;
                            while (true) {
                                if (!it4.hasNext()) {
                                    str = str4;
                                    cVarArr = cVarArr3;
                                    break;
                                }
                                C86001b0 b0Var = (C86001b0) it4.next();
                                if (cancellationSignal.isCanceled()) {
                                    Log.m105924i("VFS.AttachmentGCFileSystem", "cs.isCanceled break");
                                    str = str4;
                                    cVarArr = cVarArr3;
                                    i3 = 1;
                                    break;
                                } else if (!b0Var.f250471a.startsWith(".ref")) {
                                    if (!b0Var.f250476f) {
                                        try {
                                            String str5 = b0Var.f250472b;
                                            if (str5.endsWith("_tmp")) {
                                                str3 = "SELECT msgInfoId FROM appattach WHERE (status=199 AND fileFullPath LIKE '%/" + str5 + "') OR (status!=199 AND fileFullPath LIKE '%/" + str5.substring(z, str5.length() - 4) + "')";
                                            } else {
                                                str3 = "SELECT msgInfoId FROM appattach WHERE fileFullPath LIKE '%/" + str5 + "'";
                                            }
                                            Cursor u = eVar.mo183823u(str3, (String[]) null, z ? 1 : 0, z);
                                            u.moveToFirst();
                                            if (((long) u.getCount()) == 0) {
                                                StringBuilder sb4 = new StringBuilder();
                                                sb4.append("downloadAttachmentWildFile 0 wildFile = ");
                                                sb4.append(b0Var.f250471a);
                                                sb4.append(", diskspace = ");
                                                FileSystem.C85995c[] cVarArr4 = cVarArr3;
                                                try {
                                                    sb4.append(b0Var.f250474d);
                                                    Log.m105920e("VFS.AttachmentGCFileSystem", sb4.toString());
                                                    i4++;
                                                    j2 += b0Var.f250474d;
                                                    if (mo177614N(b0Var)) {
                                                        i6++;
                                                        j3 += b0Var.f250474d;
                                                    }
                                                    str2 = str4;
                                                    it = it4;
                                                    cVarArr2 = cVarArr4;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    str2 = str4;
                                                    it = it4;
                                                    cVarArr2 = cVarArr4;
                                                    Log.m105920e("VFS.AttachmentGCFileSystem", "db error e = " + th.getMessage());
                                                    cVarArr3 = cVarArr2;
                                                    it4 = it;
                                                    str4 = str2;
                                                    z = false;
                                                }
                                            } else {
                                                cVarArr2 = cVarArr3;
                                                try {
                                                    j = u.getLong(0);
                                                    sb = new StringBuilder();
                                                    it = it4;
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    str2 = str4;
                                                    it = it4;
                                                    Log.m105920e("VFS.AttachmentGCFileSystem", "db error e = " + th.getMessage());
                                                    cVarArr3 = cVarArr2;
                                                    it4 = it;
                                                    str4 = str2;
                                                    z = false;
                                                }
                                                try {
                                                    sb.append("SELECT msgId FROM message WHERE msgId=");
                                                    sb.append(j);
                                                    str2 = str4;
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    str2 = str4;
                                                    Log.m105920e("VFS.AttachmentGCFileSystem", "db error e = " + th.getMessage());
                                                    cVarArr3 = cVarArr2;
                                                    it4 = it;
                                                    str4 = str2;
                                                    z = false;
                                                }
                                                try {
                                                    Cursor u2 = eVar.mo183823u(sb.toString(), (String[]) null, 0, false);
                                                    if (u2.getCount() == 0) {
                                                        Log.m105920e("VFS.AttachmentGCFileSystem", "downloadAttachmentWildFile 1 wildFile = " + b0Var.f250471a + ", diskspace = " + b0Var.f250474d + ", msgId = " + j);
                                                        i4++;
                                                        j2 += b0Var.f250474d;
                                                        if (mo177614N(b0Var)) {
                                                            i6++;
                                                            j3 += b0Var.f250474d;
                                                        }
                                                    }
                                                    u2.close();
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    Log.m105920e("VFS.AttachmentGCFileSystem", "db error e = " + th.getMessage());
                                                    cVarArr3 = cVarArr2;
                                                    it4 = it;
                                                    str4 = str2;
                                                    z = false;
                                                }
                                            }
                                            u.close();
                                        } catch (Throwable th7) {
                                            th = th7;
                                            str2 = str4;
                                            it = it4;
                                            cVarArr2 = cVarArr3;
                                            Log.m105920e("VFS.AttachmentGCFileSystem", "db error e = " + th.getMessage());
                                            cVarArr3 = cVarArr2;
                                            it4 = it;
                                            str4 = str2;
                                            z = false;
                                        }
                                    } else {
                                        str2 = str4;
                                        it = it4;
                                        cVarArr2 = cVarArr3;
                                    }
                                    cVarArr3 = cVarArr2;
                                    it4 = it;
                                    str4 = str2;
                                    z = false;
                                }
                            }
                            i2++;
                            i = i6;
                            cVarArr3 = cVarArr;
                            str4 = str;
                            z = false;
                        }
                        String str6 = str4;
                        long j4 = MultiProcessMMKV.getDefault().getLong("extreme_storage_wechat_total", -1);
                        int i7 = -1;
                        long j5 = j2;
                        if (j4 != -1) {
                            i7 = (int) ((((float) j5) / ((float) j4)) * 100.0f);
                        }
                        Log.m105925i("VFS.AttachmentGCFileSystem", " > deletedFiles: %d, deletedSize: %d\n > keptFiles: %d, keptSize: %d\n > illegalFiles: %d, illegalSize: %d\n > wildFiles: %d, wildSize: %d\n > tempFiles: %d, tempSize: %d\n > noMediaFiles: %d, noMediaSize: %d > totalWildFile: %d, totalWildSize: %d", Integer.valueOf(i), Long.valueOf(j3), 0, 0L, 0, 0L, 0, 0L, 0, 0L, 0, 0L, Integer.valueOf(i4), Long.valueOf(j5));
                        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                        Log.m105924i("VFS.AttachmentGCFileSystem", "duration = " + currentTimeMillis2);
                        C117407d.INSTANCE.mo160131h(22046, "attachment-v3", Integer.valueOf(i), Long.valueOf(j3), 0, 0L, 0, 0L, 0, 0L, 0, 0L, 0, 0L, Integer.valueOf(i4), Long.valueOf(j5), Integer.valueOf(i3), Integer.valueOf(i7), Long.valueOf(currentTimeMillis2));
                        if (i3 == 0) {
                            MultiProcessMMKV.getDefault().putLong("recent_attachment_wild_file_size", j5);
                            C116299g2.m163864t(str6);
                            if (j5 > 209715200) {
                                MultiProcessMMKV.getDefault().putLong("extreme_storage_attachment_wild_file_size", j5);
                            } else {
                                MultiProcessMMKV.getDefault().putLong("extreme_storage_attachment_wild_file_size", -1);
                            }
                        }
                    }
                }
            }
            cancellationSignal.throwIfCanceled();
            super.mo119928a(cancellationSignal);
        }

        public String toString() {
            return "attchmentGC <- " + this.f348719e;
        }

        /* renamed from: u */
        public FileSystem mo119930u() {
            return AttachmentGCFileSystem.this;
        }
    }

    public AttachmentGCFileSystem(FileSystem fileSystem) {
        this.f348718e = fileSystem;
    }

    public String toString() {
        return "attachmentGC <- " + this.f348718e;
    }

    /* renamed from: v */
    public Object mo177578v(Map map) {
        return new C116196c((FileSystem.C85995c) this.f348718e.mo177578v(map));
    }

    public void writeToParcel(Parcel parcel, int i) {
        C116299g2.m163866v(parcel, AttachmentGCFileSystem.class, 1);
        parcel.writeParcelable(this.f348718e, i);
    }

    public AttachmentGCFileSystem(Parcel parcel) {
        C116299g2.m163845a(parcel, AttachmentGCFileSystem.class, 1);
        this.f348718e = (FileSystem) parcel.readParcelable(AttachmentGCFileSystem.class.getClassLoader());
    }
}
