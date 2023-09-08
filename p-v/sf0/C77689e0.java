package sf0;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.net.Uri;
import com.tencent.p014mm.sdk.platformtools.FileProviderHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import java.io.File;
import p331dj.C97481g;
import pu0.C110248b;

/* renamed from: sf0.e0 */
public class C77689e0 {

    /* renamed from: sf0.e0$a */
    public class C77690a implements MediaPlayer.OnCompletionListener {
        public void onCompletion(MediaPlayer mediaPlayer) {
            try {
                mediaPlayer.release();
            } catch (Exception e) {
                Log.printErrStackTrace("MiroMsg.NotificationUtil", e, "", new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public static void m93685a(Context context, String str, boolean z) {
        Uri defaultUri = str == null ? RingtoneManager.getDefaultUri(2) : z ? FileProviderHelper.getUriForFile(context, C86009m1.m106378c(new File(str))) : Uri.parse(str);
        C97481g gVar = new C97481g();
        try {
            gVar.setDataSource(context, defaultUri);
            gVar.setOnCompletionListener(new C77690a());
            if (C110248b.yx0(5) == 0) {
                return;
            }
            if (C110248b.zx0()) {
                int yx02 = C110248b.yx0(8);
                C110248b.C110249a aVar = C110248b.f329777h;
                int d = aVar.mo161657b().mo157507d(8);
                int yx03 = C110248b.yx0(5);
                if (yx03 <= d) {
                    d = yx03;
                }
                aVar.mo161657b().mo157508g(8, d, 0);
                gVar.setAudioStreamType(8);
                gVar.setLooping(true);
                gVar.prepare();
                gVar.setLooping(false);
                gVar.start();
                aVar.mo161657b().mo157508g(8, yx02, 0);
                Log.m105919d("MiroMsg.NotificationUtil", "oldVolume is %d, toneVolume is %d", Integer.valueOf(yx02), Integer.valueOf(d));
                return;
            }
            gVar.setAudioStreamType(5);
            gVar.setLooping(true);
            gVar.prepare();
            gVar.setLooping(false);
            gVar.start();
        } catch (Exception e) {
            Log.printErrStackTrace("MiroMsg.NotificationUtil", e, "", new Object[0]);
        }
    }
}
