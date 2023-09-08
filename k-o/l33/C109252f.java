package l33;

import android.media.MediaCodecList;
import com.tencent.p014mm.sdk.platformtools.Log;
import p149ej.C107276c;

/* renamed from: l33.f */
public class C109252f implements Runnable {
    public C109252f(C109247e eVar) {
    }

    public void run() {
        Log.m105924i("MicroMsg.SubCoreVoip", "makeCameraCache getCodecCountCache");
        C107276c cVar = C107276c.f320945a;
        try {
            Log.m105924i("MicroMsg.PluginCamera", "initCodecCount start");
            long currentTimeMillis = System.currentTimeMillis();
            MediaCodecList.getCodecCount();
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            Log.m105924i("MicroMsg.PluginCamera", "initCodecCount end, duration : " + currentTimeMillis2);
        } catch (Exception unused) {
            Log.m105920e("MicroMsg.PluginCamera", "initCodecCount error");
        }
        C107276c.f320945a.mo157752e();
    }
}
