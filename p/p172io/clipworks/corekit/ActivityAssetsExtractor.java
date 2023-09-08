package p172io.clipworks.corekit;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: io.clipworks.corekit.ActivityAssetsExtractor */
public class ActivityAssetsExtractor {
    private static String TAG = "SunnyActivity";
    private final Activity _activity;

    public ActivityAssetsExtractor(Activity activity) {
        this._activity = activity;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:8|(5:9|10|11|12|(3:13|14|(2:16|17)))|18|19|49|45) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x002e */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x003e A[SYNTHETIC, Splitter:B:29:0x003e] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0045 A[SYNTHETIC, Splitter:B:33:0x0045] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x004d A[SYNTHETIC, Splitter:B:41:0x004d] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0055 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void copyAssets(java.io.File r9) {
        /*
            r8 = this;
            android.app.Activity r0 = r8._activity
            android.content.res.AssetManager r0 = r0.getAssets()
            r1 = 0
            java.lang.String r2 = ""
            java.lang.String[] r2 = r0.list(r2)     // Catch:{ IOException -> 0x000e }
            goto L_0x0010
        L_0x000e:
            r2 = r1
        L_0x0010:
            if (r2 == 0) goto L_0x0058
            int r3 = r2.length
            r4 = 0
        L_0x0014:
            if (r4 >= r3) goto L_0x0058
            r5 = r2[r4]
            java.io.InputStream r6 = r0.open(r5)     // Catch:{ IOException -> 0x0049, all -> 0x003a }
            java.io.File r7 = new java.io.File     // Catch:{ IOException -> 0x0038, all -> 0x0034 }
            r7.<init>(r9, r5)     // Catch:{ IOException -> 0x0038, all -> 0x0034 }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0038, all -> 0x0034 }
            r5.<init>(r7)     // Catch:{ IOException -> 0x0038, all -> 0x0034 }
            r8.copyFile(r6, r5)     // Catch:{ IOException -> 0x004b, all -> 0x0032 }
            if (r6 == 0) goto L_0x002e
            r6.close()     // Catch:{ IOException -> 0x002e }
        L_0x002e:
            r5.close()     // Catch:{ IOException -> 0x0055 }
            goto L_0x0055
        L_0x0032:
            r9 = move-exception
            goto L_0x0036
        L_0x0034:
            r9 = move-exception
            r5 = r1
        L_0x0036:
            r1 = r6
            goto L_0x003c
        L_0x0038:
            r5 = r1
            goto L_0x004b
        L_0x003a:
            r9 = move-exception
            r5 = r1
        L_0x003c:
            if (r1 == 0) goto L_0x0043
            r1.close()     // Catch:{ IOException -> 0x0042 }
            goto L_0x0043
        L_0x0042:
        L_0x0043:
            if (r5 == 0) goto L_0x0048
            r5.close()     // Catch:{ IOException -> 0x0048 }
        L_0x0048:
            throw r9
        L_0x0049:
            r5 = r1
            r6 = r5
        L_0x004b:
            if (r6 == 0) goto L_0x0052
            r6.close()     // Catch:{ IOException -> 0x0051 }
            goto L_0x0052
        L_0x0051:
        L_0x0052:
            if (r5 == 0) goto L_0x0055
            goto L_0x002e
        L_0x0055:
            int r4 = r4 + 1
            goto L_0x0014
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p172io.clipworks.corekit.ActivityAssetsExtractor.copyAssets(java.io.File):void");
    }

    private void copyFile(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public void extractAssetsIfNeeded(String str, boolean z) {
        int i;
        try {
            i = this._activity.getPackageManager().getPackageInfo(this._activity.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            i = 0;
        }
        SharedPreferences preferences = this._activity.getPreferences(0);
        int i2 = preferences.getInt(AssistantStore.DownloadInfos.DownloadInfoColumns.VERSIONCODE, -1);
        if (i > i2 || z) {
            File externalFilesDir = this._activity.getExternalFilesDir(str);
            if (externalFilesDir.exists()) {
                copyAssets(externalFilesDir);
            }
            if (i != i2) {
                SharedPreferences.Editor edit = preferences.edit();
                edit.putInt(AssistantStore.DownloadInfos.DownloadInfoColumns.VERSIONCODE, i);
                edit.commit();
            }
        }
    }
}
