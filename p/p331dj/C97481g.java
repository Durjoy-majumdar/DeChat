package p331dj;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.HttpCookie;
import java.util.List;
import java.util.Map;
import p206nj.C11171e;

/* renamed from: dj.g */
public class C97481g extends MediaPlayer {
    public C97481g() {
        int hashCode = hashCode();
        C107046f.f320456g++;
        Log.m105921e("MicroMsg.MMAudioManager", "mm media player init [%d] mmMpInitCount[%d] mmMpReleaseCount[%d]", Integer.valueOf(hashCode), Integer.valueOf(C107046f.f320456g), Integer.valueOf(C107046f.f320457h));
        C107046f.f320458i.put(Integer.valueOf(hashCode), Util.getStack().toString());
        C107046f.m144906a();
    }

    /* renamed from: a */
    public static C97481g m125558a(Context context, Uri uri) {
        try {
            C97481g gVar = new C97481g();
            gVar.setDataSource(context, uri);
            gVar.prepare();
            return gVar;
        } catch (IOException e) {
            Log.m105919d("MicroMsg.MediaPlayerWrapper", "create failed:", e);
            return null;
        } catch (IllegalArgumentException e2) {
            Log.m105919d("MicroMsg.MediaPlayerWrapper", "create failed:", e2);
            return null;
        } catch (SecurityException e3) {
            Log.m105919d("MicroMsg.MediaPlayerWrapper", "create failed:", e3);
            return null;
        }
    }

    public void release() {
        super.release();
        int hashCode = hashCode();
        C107046f.f320457h++;
        Log.m105921e("MicroMsg.MMAudioManager", "mm media player release [%d] mmMpInitCount[%d] mmMpReleaseCount[%d]", Integer.valueOf(hashCode), Integer.valueOf(C107046f.f320456g), Integer.valueOf(C107046f.f320457h));
        C107046f.f320458i.remove(Integer.valueOf(hashCode));
    }

    public void setDataSource(String str) {
        ParcelFileDescriptor z;
        try {
            z = C86013q1.m106465z(str, "r");
            setDataSource(z.getFileDescriptor());
            z.close();
            return;
        } catch (FileNotFoundException e) {
            Log.m105928w("MicroMsg.MediaPlayerWrapper", "Cannot find path: " + str + ", " + e.getMessage());
            super.setDataSource(str);
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public void setDataSource(Context context, Uri uri) {
        if (C11171e.m11046c(26)) {
            setDataSource(context, uri, (Map<String, String>) null, (List<HttpCookie>) null);
        } else {
            setDataSource(context, uri, (Map<String, String>) null);
        }
    }

    public void setDataSource(Context context, Uri uri, Map<String, String> map) {
        if (C11171e.m11046c(26)) {
            setDataSource(context, uri, map, (List<HttpCookie>) null);
            return;
        }
        String scheme = uri.getScheme();
        if (scheme == null || scheme.equals("file") || scheme.equals("wcf") || scheme.equals(TPMediaCompositionHelper.XML_TAG_ASSERT)) {
            ParcelFileDescriptor y = C86013q1.m106464y(uri, (C116281f0.C116288h) null, "r");
            try {
                setDataSource(y.getFileDescriptor());
                y.close();
                return;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            super.setDataSource(context, uri, map);
            return;
        }
        throw th;
    }

    public void setDataSource(Context context, Uri uri, Map<String, String> map, List<HttpCookie> list) {
        String scheme = uri.getScheme();
        if (scheme == null || scheme.equals("file") || scheme.equals("wcf") || scheme.equals(TPMediaCompositionHelper.XML_TAG_ASSERT)) {
            ParcelFileDescriptor y = C86013q1.m106464y(uri, (C116281f0.C116288h) null, "r");
            try {
                setDataSource(y.getFileDescriptor());
                y.close();
                return;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            super.setDataSource(context, uri, map, list);
            return;
        }
        throw th;
    }
}
