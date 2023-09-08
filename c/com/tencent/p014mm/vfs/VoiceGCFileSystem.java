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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kj2.C117407d;
import oa1.C117731d;
import zh3.C119118e;

/* renamed from: com.tencent.mm.vfs.VoiceGCFileSystem */
public class VoiceGCFileSystem extends AbstractFileSystem {
    public static final Parcelable.Creator<VoiceGCFileSystem> CREATOR = new C116258a();

    /* renamed from: f */
    public static boolean f348886f;

    /* renamed from: e */
    public final FileSystem f348887e;

    /* renamed from: com.tencent.mm.vfs.VoiceGCFileSystem$a */
    public class C116258a implements Parcelable.Creator<VoiceGCFileSystem> {
        public Object createFromParcel(Parcel parcel) {
            return new VoiceGCFileSystem(parcel);
        }

        public Object[] newArray(int i) {
            return new VoiceGCFileSystem[i];
        }
    }

    /* renamed from: com.tencent.mm.vfs.VoiceGCFileSystem$b */
    public static final class C116259b implements C116344z0.C116345a {
        /* renamed from: a */
        public void mo177613a(String str, FileSystem fileSystem, int i, Map<String, Object> map) {
        }
    }

    /* renamed from: com.tencent.mm.vfs.VoiceGCFileSystem$c */
    public class C116260c extends C116309m {

        /* renamed from: e */
        public final FileSystem.C85995c f348888e;

        /* renamed from: f */
        public final List<FileSystem.C85995c> f348889f;

        public C116260c(FileSystem.C85995c cVar) {
            this.f348888e = cVar;
            this.f348889f = Collections.singletonList(cVar);
        }

        /* renamed from: G */
        public List<FileSystem.C85995c> mo119926G() {
            return this.f348889f;
        }

        /* renamed from: H */
        public FileSystem.C85995c mo119927H(String str, int i) {
            return this.f348888e;
        }

        /* renamed from: N */
        public final boolean mo177774N(C86001b0 b0Var) {
            if (!VoiceGCFileSystem.f348886f || System.currentTimeMillis() - b0Var.f250475e <= 86400000) {
                return false;
            }
            boolean b = b0Var.mo119955b(true);
            Log.m105924i("VFS.VoiceGCFileSystem", "deleteFile, fe = " + b0Var.f250471a + ", ret = " + b + ", modifiedTime = " + b0Var.f250475e);
            return b;
        }

        /* renamed from: a */
        public void mo119928a(CancellationSignal cancellationSignal) {
            String str;
            String str2;
            String str3;
            long s = C116299g2.m163863s("voice-clean");
            if (C86709a0.m107535s().mo121146m()) {
                C117407d.INSTANCE.kvStat(22046, "voice-hasCorruptedDB");
                Log.m105924i("VFS.VoiceGCFileSystem", "hasCorruptedDB, skip cleanup.");
            } else if (C86709a0.m107535s().mo121136b()) {
                C117407d.INSTANCE.kvStat(22046, "voice-C2CToBeRescued");
                Log.m105924i("VFS.VoiceGCFileSystem", "c2cErrorToBeRescued, skip cleanup.");
            } else {
                if (!(WeChatEnvironment.hasDebugger() || !"0".equals(C117731d.m166007c().mo182444f("clicfg_wild_file_voice_scan_12", "0", false, true)))) {
                    Log.m105924i("VFS.VoiceGCFileSystem", "X Switch disabled, skip cleanup.");
                } else {
                    if (s < 1036800000) {
                        Log.m105925i("VFS.VoiceGCFileSystem", "Image cleanup interval not match, skip cleanup. %d / %d", Long.valueOf(s), 1036800000L);
                    } else {
                        String str4 = ".amr";
                        String str5 = "msg_";
                        Log.m105924i("VFS.VoiceGCFileSystem", "doMaintenance");
                        long currentTimeMillis = System.currentTimeMillis();
                        VoiceGCFileSystem.f348886f = WeChatEnvironment.hasDebugger() || !"0".equals(C117731d.m166007c().mo182444f("clicfg_wild_file_voice_clean", "0", false, true));
                        Log.m105924i("VFS.VoiceGCFileSystem", "isCleanExpt = " + VoiceGCFileSystem.f348886f);
                        cancellationSignal.throwIfCanceled();
                        FileSystem.C85995c[] cVarArr = {new NativeFileSystem("${sdTo}/MicroMsg/${accountSd}/voice2").mo177578v(C116281f0.C116289i.f348994a.mo177791d()), this};
                        C119118e eVar = C86709a0.m107535s().f251811i.f262815b;
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor u = eVar.mo183823u("SELECT imgPath from message WHERE type=34", (String[]) null, 0, false);
                            while (u.moveToNext()) {
                                arrayList.add(u.getString(0));
                            }
                            u.close();
                            Log.m105924i("VFS.VoiceGCFileSystem", "voicePathList size = " + arrayList.size());
                            int i = 0;
                            int i2 = 0;
                            long j = 0;
                            int i3 = 0;
                            long j2 = 0;
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
                                        str = str4;
                                        str2 = str5;
                                        break;
                                    }
                                    C86001b0 b0Var = (C86001b0) it.next();
                                    if (cancellationSignal.isCanceled()) {
                                        Log.m105924i("VFS.VoiceGCFileSystem", "cs.isCanceled break");
                                        str = str4;
                                        str2 = str5;
                                        i4 = 1;
                                        break;
                                    }
                                    if (!b0Var.f250471a.startsWith(".ref") && !b0Var.f250476f) {
                                        try {
                                            if (b0Var.f250472b.startsWith(str5)) {
                                                if (b0Var.f250472b.endsWith(str4)) {
                                                    String str6 = b0Var.f250472b;
                                                    str3 = str5;
                                                    try {
                                                        String substring = str6.substring(str6.indexOf(str5) + 4, b0Var.f250472b.lastIndexOf(str4));
                                                        if (!arrayList.contains(substring)) {
                                                            str = str4;
                                                            Cursor u2 = eVar.mo183823u("SELECT filename FROM massendinfo WHERE filename=?", new String[]{substring}, 0, false);
                                                            u2.moveToFirst();
                                                            u2.close();
                                                            if (!(((long) u2.getCount()) != 0)) {
                                                                i3++;
                                                                j += b0Var.f250474d;
                                                                if (mo177774N(b0Var)) {
                                                                    i6++;
                                                                    j2 += b0Var.f250474d;
                                                                }
                                                                Log.m105920e("VFS.VoiceGCFileSystem", "wildFile 0 name = " + b0Var.f250471a);
                                                            } else {
                                                                Log.m105924i("VFS.VoiceGCFileSystem", "isMassVoice, name = " + substring);
                                                            }
                                                        } else {
                                                            str = str4;
                                                        }
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        Log.printErrStackTrace("VFS.VoiceGCFileSystem", th, "", new Object[0]);
                                                        str5 = str3;
                                                        str4 = str;
                                                    }
                                                }
                                            }
                                            str = str4;
                                            str3 = str5;
                                            Log.m105920e("VFS.VoiceGCFileSystem", "illegal name = " + b0Var.f250471a);
                                            i3++;
                                            j += b0Var.f250474d;
                                            if (mo177774N(b0Var)) {
                                                i6++;
                                                j2 += b0Var.f250474d;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            str = str4;
                                            str3 = str5;
                                            Log.printErrStackTrace("VFS.VoiceGCFileSystem", th, "", new Object[0]);
                                            str5 = str3;
                                            str4 = str;
                                        }
                                    } else {
                                        str = str4;
                                        str3 = str5;
                                    }
                                    str5 = str3;
                                    str4 = str;
                                }
                                i2++;
                                i = i6;
                                str5 = str2;
                                str4 = str;
                            }
                            arrayList.clear();
                            long j3 = MultiProcessMMKV.getDefault().getLong("extreme_storage_wechat_total", -1);
                            int i7 = -1;
                            long j4 = j;
                            if (j3 != -1) {
                                i7 = (int) ((((float) j4) / ((float) j3)) * 100.0f);
                            }
                            Log.m105925i("VFS.VoiceGCFileSystem", " > deletedFiles: %d, deletedSize: %d\n > keptFiles: %d, keptSize: %d\n > illegalFiles: %d, illegalSize: %d\n > wildFiles: %d, wildSize: %d\n > tempFiles: %d, tempSize: %d\n > noMediaFiles: %d, noMediaSize: %d > totalWildFile: %d, totalWildSize: %d", Integer.valueOf(i), Long.valueOf(j2), 0, 0L, 0, 0L, 0, 0L, 0, 0L, 0, 0L, Integer.valueOf(i3), Long.valueOf(j4));
                            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                            Log.m105924i("VFS.VoiceGCFileSystem", "duration = " + currentTimeMillis2);
                            C117407d.INSTANCE.mo160131h(22046, "voice-v3", Integer.valueOf(i), Long.valueOf(j2), 0, 0L, 0, 0L, 0, 0L, 0, 0L, 0, 0L, Integer.valueOf(i3), Long.valueOf(j4), Integer.valueOf(i4), Integer.valueOf(i7), Long.valueOf(currentTimeMillis2));
                            if (i4 == 0) {
                                MultiProcessMMKV.getDefault().putLong("recent_voice_wild_file_size", j4);
                                C116299g2.m163864t("voice-clean");
                                if (j4 > 209715200) {
                                    MultiProcessMMKV.getDefault().putLong("extreme_storage_voice_wild_file_size", j4);
                                } else {
                                    MultiProcessMMKV.getDefault().putLong("extreme_storage_voice_wild_file_size", -1);
                                }
                            }
                        } catch (Throwable th5) {
                            Log.m105920e("VFS.VoiceGCFileSystem", "fill voicePathList error : " + th5.getMessage());
                        }
                    }
                }
            }
            cancellationSignal.throwIfCanceled();
            super.mo119928a(cancellationSignal);
        }

        public String toString() {
            return "voiceGC <- " + this.f348888e;
        }

        /* renamed from: u */
        public FileSystem mo119930u() {
            return VoiceGCFileSystem.this;
        }
    }

    public VoiceGCFileSystem(FileSystem fileSystem) {
        this.f348887e = fileSystem;
    }

    public String toString() {
        return "voiceGC <- " + this.f348887e;
    }

    /* renamed from: v */
    public Object mo177578v(Map map) {
        return new C116260c((FileSystem.C85995c) this.f348887e.mo177578v(map));
    }

    public void writeToParcel(Parcel parcel, int i) {
        C116299g2.m163866v(parcel, VoiceGCFileSystem.class, 1);
        parcel.writeParcelable(this.f348887e, i);
    }

    public VoiceGCFileSystem(Parcel parcel) {
        C116299g2.m163845a(parcel, VoiceGCFileSystem.class, 1);
        this.f348887e = (FileSystem) parcel.readParcelable(VoiceGCFileSystem.class.getClassLoader());
    }
}
