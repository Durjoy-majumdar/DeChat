package b12;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.shareutil.ShareConstants;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: b12.b */
public class C79644b {
    /* renamed from: a */
    public static Properties m96723a(File file) {
        ZipFile zipFile;
        InputStream inputStream;
        ZipFile zipFile2 = null;
        if (file == null || !file.isFile() || file.length() == 0) {
            return null;
        }
        try {
            zipFile = new ZipFile(file);
            try {
                ZipEntry entry = zipFile.getEntry(ShareConstants.PACKAGE_META_FILE);
                if (entry == null) {
                    SharePatchFileUtil.closeZip(zipFile);
                    return null;
                }
                try {
                    inputStream = zipFile.getInputStream(entry);
                    try {
                        Properties properties = new Properties();
                        properties.load(inputStream);
                        SharePatchFileUtil.closeQuietly(inputStream);
                        SharePatchFileUtil.closeZip(zipFile);
                        return properties;
                    } catch (Throwable th) {
                        th = th;
                        SharePatchFileUtil.closeQuietly(inputStream);
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    inputStream = null;
                    SharePatchFileUtil.closeQuietly(inputStream);
                    throw th;
                }
            } catch (IOException e) {
                e = e;
                try {
                    e.getMessage();
                    SharePatchFileUtil.closeZip(zipFile);
                    return null;
                } catch (Throwable th5) {
                    th = th5;
                    zipFile2 = zipFile;
                    SharePatchFileUtil.closeZip(zipFile2);
                    throw th;
                }
            }
        } catch (IOException e2) {
            e = e2;
            zipFile = null;
            e.getMessage();
            SharePatchFileUtil.closeZip(zipFile);
            return null;
        } catch (Throwable th6) {
            th = th6;
            SharePatchFileUtil.closeZip(zipFile2);
            throw th;
        }
    }

    /* renamed from: b */
    public static boolean m96724b(String str) {
        if (!Util.isNullOrNil(str) && str.length() == 10) {
            try {
                int intValue = Integer.decode(str).intValue() & 255;
                return intValue >= 0 && intValue <= 31;
            } catch (Exception e) {
                Log.printErrStackTrace("Tinker.TinkerUtils", e, "checkAplhVersion failed.", new Object[0]);
            }
        }
        return false;
    }
}
