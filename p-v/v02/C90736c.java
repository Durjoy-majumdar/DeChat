package v02;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.File;
import java.io.RandomAccessFile;
import p1054vg.C90793a;
import p1054vg.C90799d;
import vu3.C90873a;

/* renamed from: v02.c */
public class C90736c {
    /* renamed from: a */
    public static int m113791a(String str, String str2, String str3, String str4) {
        int i;
        C90793a b;
        C90793a.C90794a aVar;
        if (!(str == null || str2 == null || str3 == null)) {
            try {
                File file = new File(str);
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                File file2 = new File(str3);
                C86013q1.m106461v(C86013q1.m106458s(str3));
                File file3 = new File(str2);
                if (!file.exists() || !file3.exists()) {
                    Log.m105921e("MicroMsg.Tinker.MergeBsDiffApk", "MicroMsg.MergePatchApk: file not found in merge(): oldFile.exists()=%s , newFile.exists()=%s , patch.exists()=%s ", Boolean.valueOf(file.exists()), Boolean.valueOf(file2.exists()), Boolean.valueOf(file3.exists()));
                    randomAccessFile.close();
                    return -1;
                }
                if (MMApplicationContext.getContext().getApplicationInfo().targetSdkVersion > 29 || (b = C90793a.m113861b(str)) == null || (aVar = b.f260723a) == null) {
                    i = 0;
                } else {
                    i = aVar.f260726a + 8;
                    Log.m105925i("MicroMsg.Tinker.MergeBsDiffApk", "MicroMsg.MergePatchApk:extLen = %d", Integer.valueOf(i));
                }
                if ((i != 0 ? C90799d.m113871a(randomAccessFile, file2, file3, i) : C90873a.m113986a(randomAccessFile, file2, file3, 0)) != 1) {
                    Log.m105924i("MicroMsg.Tinker.MergeBsDiffApk", "MicroMsg.MergePatchApk:merge failed in patchLessMemory()");
                    randomAccessFile.close();
                    return -1;
                }
                randomAccessFile.close();
                if (str4.equalsIgnoreCase(C86013q1.m106456q(str3))) {
                    return 0;
                }
                Log.m105925i("MicroMsg.Tinker.MergeBsDiffApk", "newApkMd5:%s file md5:%s", str4, C86013q1.m106456q(str3));
                return -2;
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.Tinker.MergeBsDiffApk", e, "merge apk failed.", new Object[0]);
            }
        }
        return -1;
    }

    /* renamed from: b */
    public static int m113792b(String str, String str2, String str3, String str4) {
        int i;
        C90793a b;
        C90793a.C90794a aVar;
        if (str == null || str2 == null || str3 == null) {
            return -5;
        }
        try {
            File file = new File(str);
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            File file2 = new File(str3);
            C86013q1.m106461v(C86013q1.m106458s(str3));
            File file3 = new File(str2);
            if (!file.exists() || !file3.exists()) {
                Log.m105921e("MicroMsg.Tinker.MergeBsDiffApk", "MicroMsg.MergePatchApk: file not found in merge(): oldFile.exists()=%s , newFile.exists()=%s , patch.exists()=%s ", Boolean.valueOf(file.exists()), Boolean.valueOf(file2.exists()), Boolean.valueOf(file3.exists()));
                randomAccessFile.close();
                return -1;
            }
            if (MMApplicationContext.getContext().getApplicationInfo().targetSdkVersion > 29 || (b = C90793a.m113861b(str)) == null || (aVar = b.f260723a) == null) {
                i = 0;
            } else {
                i = aVar.f260726a + 8;
                Log.m105925i("MicroMsg.Tinker.MergeBsDiffApk", "MicroMsg.MergePatchApk:extLen = %d", Integer.valueOf(i));
            }
            if ((i != 0 ? C90799d.m113871a(randomAccessFile, file2, file3, i) : C90873a.m113986a(randomAccessFile, file2, file3, 0)) != 1) {
                Log.m105924i("MicroMsg.Tinker.MergeBsDiffApk", "MicroMsg.MergePatchApk:merge failed in patchLessMemory()");
                randomAccessFile.close();
                return -2;
            }
            randomAccessFile.close();
            if (str4.equalsIgnoreCase(C86013q1.m106456q(str3))) {
                return 0;
            }
            Log.m105925i("MicroMsg.Tinker.MergeBsDiffApk", "newApkMd5:%s file md5:%s", str4, C86013q1.m106456q(str3));
            return -3;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Tinker.MergeBsDiffApk", e, "merge apk failed.", new Object[0]);
            return -4;
        }
    }
}
