package android.support.p427v4.content;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.vfs.VFSFileProvider;
import java.io.File;

@Deprecated
/* renamed from: android.support.v4.content.FileProvider */
public class FileProvider extends VFSFileProvider {
    private static File sSwitchFile;
    private final androidx.core.content.FileProvider mFallback = new androidx.core.content.FileProvider();

    public static Uri getUriForFile(Context context, String str, File file) {
        return useOldProvider() ? androidx.core.content.FileProvider.getUriForFile(context, str, file) : C86013q1.m106449j(C86009m1.m106378c(file), str);
    }

    private static boolean isOldUri(Uri uri) {
        String path = uri.getPath();
        return path.startsWith("/root_path/") || path.startsWith("/external/");
    }

    private static boolean useOldProvider() {
        return !sSwitchFile.exists();
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        this.mFallback.attachInfo(context, providerInfo);
        sSwitchFile = new File(context.getCacheDir().getParentFile(), ".vfs/use-vfs-provider");
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return isOldUri(uri) ? this.mFallback.delete(uri, str, strArr) : super.delete(uri, str, strArr);
    }

    public String getType(Uri uri) {
        return isOldUri(uri) ? this.mFallback.getType(uri) : super.getType(uri);
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return isOldUri(uri) ? this.mFallback.insert(uri, contentValues) : super.insert(uri, contentValues);
    }

    public ParcelFileDescriptor openFile(Uri uri, String str) {
        return isOldUri(uri) ? this.mFallback.openFile(uri, str) : super.openFile(uri, str);
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return isOldUri(uri) ? this.mFallback.query(uri, strArr, str, strArr2, str2) : super.query(uri, strArr, str, strArr2, str2);
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return isOldUri(uri) ? this.mFallback.update(uri, contentValues, str, strArr) : super.update(uri, contentValues, str, strArr);
    }
}
