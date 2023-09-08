package fv3;

import android.content.Context;
import com.tencent.tinker.loader.TinkerRuntimeException;
import com.tencent.tinker.loader.shareutil.ShareArkHotDiffPatchInfo;
import com.tencent.tinker.loader.shareutil.ShareConstants;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.ShareSecurityCheck;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import iv3.C87821a;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.ZipFile;

/* renamed from: fv3.b */
public class C87096b extends C87097c {

    /* renamed from: a */
    public static ArrayList<ShareArkHotDiffPatchInfo> f252695a = new ArrayList<>();

    /* renamed from: c */
    public static boolean m108109c(C87821a aVar, ShareSecurityCheck shareSecurityCheck, Context context, String str, File file) {
        String str2;
        String str3 = shareSecurityCheck.getMetaContentMap().get(ShareConstants.ARKHOT_META_FILE);
        if (str3 == null) {
            return true;
        }
        String str4 = str + "/" + ShareConstants.ARKHOTFIX_PATH + "/";
        f252695a.clear();
        ShareArkHotDiffPatchInfo.parseDiffPatchInfo(str3, f252695a);
        C87821a c = C87821a.m109275c(context);
        ZipFile zipFile = null;
        try {
            ZipFile zipFile2 = new ZipFile(file);
            try {
                Iterator<ShareArkHotDiffPatchInfo> it = f252695a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ShareArkHotDiffPatchInfo next = it.next();
                    String str5 = next.path;
                    if (str5.equals("")) {
                        str2 = next.name;
                    } else {
                        str2 = str5 + "/" + next.name;
                    }
                    String str6 = next.patchMd5;
                    if (!SharePatchFileUtil.checkIfMd5Valid(str6)) {
                        c.f254232e.mo109440b(file, C87097c.m108111b(8));
                        break;
                    }
                    File file2 = new File(str4 + next.name);
                    if (!file2.exists()) {
                        file2.getParentFile().mkdirs();
                    } else if (!str6.equals(SharePatchFileUtil.getMD5(file2))) {
                        file2.delete();
                    }
                    if (!C87097c.m108110a(zipFile2, zipFile2.getEntry(str2), file2, str6, false)) {
                        c.f254232e.mo109442d(file, file2, next.name, 8);
                        break;
                    }
                }
                SharePatchFileUtil.closeZip(zipFile2);
                return true;
            } catch (IOException e) {
                e = e;
                zipFile = zipFile2;
                try {
                    throw new TinkerRuntimeException("patch " + ShareTinkerInternals.getTypeString(8) + " extract failed (" + e.getMessage() + ").", e);
                } catch (Throwable th) {
                    th = th;
                    zipFile2 = zipFile;
                    SharePatchFileUtil.closeZip(zipFile2);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                SharePatchFileUtil.closeZip(zipFile2);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            throw new TinkerRuntimeException("patch " + ShareTinkerInternals.getTypeString(8) + " extract failed (" + e.getMessage() + ").", e);
        }
    }
}
