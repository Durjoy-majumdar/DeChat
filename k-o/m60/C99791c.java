package m60;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import gy3.C87412m;
import java.io.OutputStream;
import o40.C61925b;

/* renamed from: m60.c */
public final class C99791c {

    /* renamed from: a */
    public static final C99791c f292469a = new C99791c();

    /* renamed from: a */
    public static boolean m130249a(C99791c cVar, Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i, OutputStream outputStream, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            compressFormat = Bitmap.CompressFormat.JPEG;
        }
        if ((i2 & 4) != 0) {
            i = 80;
        }
        cVar.getClass();
        C87412m.m108594g(bitmap, "bm");
        C87412m.m108594g(compressFormat, TPReportKeys.PlayerStep.PLAYER_FORMAT);
        C87412m.m108594g(outputStream, "stream");
        C61925b bVar = new C61925b("compress");
        boolean compress = bitmap.compress(compressFormat, i, outputStream);
        if (!compress) {
            Log.m105921e("MicroMsg.Loader.DiskFunction", "compress error %s", Util.getStack().toString());
        }
        bVar.mo86838a();
        return compress;
    }

    /* renamed from: b */
    public final OutputStream mo139149b(String str) {
        C87412m.m108594g(str, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        if (str.length() == 0) {
            return null;
        }
        try {
            C86009m1 l = new C86009m1(str).mo119974l();
            if (l != null) {
                l.mo119987x();
            }
            return C86013q1.m106429K(str, false);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.Loader.DiskFunction", "obtainOutputStream:%s", e);
            return null;
        }
    }
}
