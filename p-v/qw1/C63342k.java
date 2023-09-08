package qw1;

import android.media.MediaMetadataRetriever;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.plugin.sight.base.C94555d;
import com.tencent.p014mm.plugin.sight.base.SightVideoJNI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: qw1.k */
public final class C63342k {

    /* renamed from: a */
    public static final C63342k f179710a = new C63342k();

    /* renamed from: a */
    public final C94554a mo88239a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new C94554a();
        }
        C94554a c = C94555d.m119567c(str, true);
        if (c == null) {
            c = new C94554a();
        }
        if (c.f273446d <= 0 || c.f273445c <= 0) {
            try {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(str);
                c.f273445c = Util.getInt(mediaMetadataRetriever.extractMetadata(18), 0);
                c.f273446d = Util.getInt(mediaMetadataRetriever.extractMetadata(19), 0);
                c.f273444b = Util.getInt(mediaMetadataRetriever.extractMetadata(20), 0);
                c.f273443a = Util.getInt(mediaMetadataRetriever.extractMetadata(9), 0);
                mediaMetadataRetriever.release();
            } catch (Exception unused) {
            }
        }
        int mp4RotateVFS = SightVideoJNI.getMp4RotateVFS(str);
        Log.m105925i("MicroMsg.MediaUtil", "width %d, height %d, rotate %d", Integer.valueOf(c.f273445c), Integer.valueOf(c.f273446d), Integer.valueOf(mp4RotateVFS));
        if (mp4RotateVFS == 90 || mp4RotateVFS == 270) {
            int i = c.f273446d;
            c.f273446d = c.f273445c;
            c.f273445c = i;
        }
        return c;
    }
}
