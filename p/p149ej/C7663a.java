package p149ej;

import android.hardware.Camera;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import java.util.concurrent.Callable;

/* renamed from: ej.a */
public final class C7663a<V> implements Callable {

    /* renamed from: d */
    public static final C7663a<V> f26016d = new C7663a<>();

    public Object call() {
        Log.m105924i("MicroMsg.PluginCamera", "initCameraNumbers getNumberOfCameras start");
        C107276c cVar = C107276c.f320945a;
        C107276c.f320946b = Camera.getNumberOfCameras();
        Log.m105924i("MicroMsg.PluginCamera", "initCameraNumbers getNumberOfCameras Done mCameraNumber is " + C107276c.f320946b);
        C107276c cVar2 = C107276c.f320945a;
        cVar2.mo157749b();
        cVar2.mo157748a();
        MultiProcessMMKV.getDefault().putInt("cameraNumberCache", C107276c.f320946b);
        MultiProcessMMKV.getDefault().putInt("camera2NumberInfoCache", C107276c.f320949e);
        MultiProcessMMKV.getDefault().putString("camera2SupportLevelsCache", C107276c.f320950f);
        return Integer.valueOf(C107276c.f320946b);
    }
}
