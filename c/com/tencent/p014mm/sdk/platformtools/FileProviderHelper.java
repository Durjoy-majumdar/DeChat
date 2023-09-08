package com.tencent.p014mm.sdk.platformtools;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.core.content.FileProvider;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.File;

/* renamed from: com.tencent.mm.sdk.platformtools.FileProviderHelper */
public class FileProviderHelper {
    private static final String TAG = "MicroMsg.FileProviderHelper";

    public static Uri getUriForFile(Context context, C86009m1 m1Var) {
        String i;
        if (Build.VERSION.SDK_INT < 24 && (i = C86013q1.m106448i(m1Var.mo119976n(), false)) != null && i.startsWith("/data/")) {
            return Uri.fromFile(new File(i));
        }
        if (useVFSFileProvider()) {
            return C86013q1.m106449j(m1Var, context.getPackageName() + ".external.fileprovider");
        }
        String i2 = C86013q1.m106448i(m1Var.mo119976n(), false);
        if (i2 == null) {
            return null;
        }
        return FileProvider.getUriForFile(context, context.getPackageName() + ".external.fileprovider", new File(i2));
    }

    public static Uri getUriForFileWithoutVFSRemap(Context context, File file) {
        return getUriForFile(context, C86009m1.m106378c(file));
    }

    public static void setIntentDataAndType(Context context, Intent intent, C86009m1 m1Var, String str, boolean z) {
        Uri uriForFile = getUriForFile(context, m1Var);
        if (!BuildInfo.IS_FLAVOR_RED || uriForFile != null) {
            int i = 1;
            if (z) {
                i = 3;
            }
            intent.setDataAndType(uriForFile, str).addFlags(i);
            return;
        }
        throw new IllegalArgumentException("Path cannot be exported via provider: " + m1Var);
    }

    private static boolean useVFSFileProvider() {
        return new File(MMApplicationContext.getContext().getCacheDir().getParentFile(), ".vfs/use-vfs-provider").exists();
    }

    public static void setIntentDataAndType(Context context, Intent intent, Uri uri, String str, boolean z) {
        String scheme = uri.getScheme();
        if (scheme == null || scheme.isEmpty() || scheme.equals("file") || scheme.equals("wcf")) {
            setIntentDataAndType(context, intent, new C86009m1(uri.getPath()), str, z);
            return;
        }
        intent.setDataAndType(uri, str);
        intent.addFlags(1);
        if (z) {
            intent.addFlags(2);
        }
    }
}
