package s41;

import android.os.FileObserver;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1884v4;
import com.tencent.p014mm.sdk.platformtools.Log;
import p823sg.C48380r;

/* renamed from: s41.a */
public class C48225a extends FileObserver {

    /* renamed from: a */
    public String f129212a;

    public C48225a(String str) {
        super(C48380r.m53726a(str, false), C1884v4.CTRL_INDEX);
        this.f129212a = str;
    }

    public void onEvent(int i, String str) {
        if (str == null) {
            Log.m105920e("DownloadsObserver", "path should be null");
            return;
        }
        String str2 = this.f129212a + str;
        if (i == 8) {
            Log.m105925i("DownloadsObserver", "close write file: %s", str2);
        } else if (i == 32) {
            Log.m105925i("DownloadsObserver", "open file: %s", str2);
        } else if (i == 64) {
            Log.m105925i("DownloadsObserver", "move from file: %s", str2);
        } else if (i == 512) {
            Log.m105925i("DownloadsObserver", "delete file: %s", str2);
        }
    }
}
