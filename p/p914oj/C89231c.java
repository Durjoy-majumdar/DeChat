package p914oj;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.stubs.logger.Log;
import java.io.IOException;
import java.util.Map;

/* renamed from: oj.c */
public class C89231c extends MediaMetadataRetriever {
    public void setDataSource(String str) {
        ParcelFileDescriptor z;
        try {
            z = C86013q1.m106465z(str, "r");
            setDataSource(z.getFileDescriptor());
            z.close();
            return;
        } catch (IOException e) {
            Log.m106513w("MicroMsg.VFSMediaMetadataRetriever", "Cannot find path: " + str + ", " + e.getMessage());
            super.setDataSource(str);
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public void setDataSource(String str, Map<String, String> map) {
        ParcelFileDescriptor z;
        String scheme = Uri.parse(str).getScheme();
        if (scheme == null || scheme.equals("file") || scheme.equals("wcf") || scheme.equals(TPMediaCompositionHelper.XML_TAG_ASSERT)) {
            try {
                z = C86013q1.m106465z(str, "r");
                setDataSource(z.getFileDescriptor());
                z.close();
                return;
            } catch (IOException e) {
                Log.m106513w("MicroMsg.VFSMediaMetadataRetriever", "Cannot open URI: " + str + ", " + e.getMessage());
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        super.setDataSource(str, map);
        return;
        throw th;
    }

    public void setDataSource(Context context, Uri uri) {
        ParcelFileDescriptor y;
        String scheme = uri.getScheme();
        if (scheme == null || scheme.equals("file") || scheme.equals("wcf") || scheme.equals(TPMediaCompositionHelper.XML_TAG_ASSERT)) {
            try {
                y = C86013q1.m106464y(uri, (C116281f0.C116288h) null, "r");
                setDataSource(y.getFileDescriptor());
                y.close();
                return;
            } catch (IOException e) {
                Log.m106513w("MicroMsg.VFSMediaMetadataRetriever", "Cannot open URI: " + uri + ", " + e.getMessage());
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        super.setDataSource(context, uri);
        return;
        throw th;
    }
}
