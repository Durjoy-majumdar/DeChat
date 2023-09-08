package fv3;

import av3.C79633a;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.ShareTinkerLog;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: fv3.c */
public class C87097c {
    /* renamed from: a */
    public static boolean m108110a(ZipFile zipFile, ZipEntry zipEntry, File file, String str, boolean z) {
        BufferedInputStream bufferedInputStream;
        BufferedOutputStream bufferedOutputStream;
        int i = 0;
        boolean z2 = false;
        while (i < 2 && !z2) {
            i++;
            ShareTinkerLog.m106532i("Tinker.BasePatchInternal", "try Extracting " + file.getPath(), new Object[0]);
            BufferedOutputStream bufferedOutputStream2 = null;
            try {
                bufferedInputStream = new BufferedInputStream(zipFile.getInputStream(zipEntry));
                try {
                    bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                } catch (Throwable th) {
                    th = th;
                    C79633a.m96712a(bufferedOutputStream2);
                    C79633a.m96712a(bufferedInputStream);
                    throw th;
                }
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = bufferedInputStream.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        bufferedOutputStream.write(bArr, 0, read);
                    }
                    C79633a.m96712a(bufferedOutputStream);
                    C79633a.m96712a(bufferedInputStream);
                    boolean verifyDexFileMd5 = str != null ? z ? SharePatchFileUtil.verifyDexFileMd5(file, str) : SharePatchFileUtil.verifyFileMd5(file, str) : true;
                    ShareTinkerLog.m106532i("Tinker.BasePatchInternal", "isExtractionSuccessful: %b", Boolean.valueOf(verifyDexFileMd5));
                    if (!verifyDexFileMd5 && (!file.delete() || file.exists())) {
                        ShareTinkerLog.m106531e("Tinker.BasePatchInternal", "Failed to delete corrupted dex " + file.getPath(), new Object[0]);
                    }
                    z2 = verifyDexFileMd5;
                } catch (Throwable th4) {
                    th = th4;
                    bufferedOutputStream2 = bufferedOutputStream;
                    C79633a.m96712a(bufferedOutputStream2);
                    C79633a.m96712a(bufferedInputStream);
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                bufferedInputStream = null;
                C79633a.m96712a(bufferedOutputStream2);
                C79633a.m96712a(bufferedInputStream);
                throw th;
            }
        }
        return z2;
    }

    /* renamed from: b */
    public static int m108111b(int i) {
        if (i == 3) {
            return -3;
        }
        if (i == 5) {
            return -4;
        }
        return i == 6 ? -8 : 0;
    }
}
