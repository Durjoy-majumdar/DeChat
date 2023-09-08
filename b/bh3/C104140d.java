package bh3;

import android.util.Pair;
import com.tencent.p014mm.autogen.events.CameraKitOperateEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import java.util.List;

/* renamed from: bh3.d */
public final class C104140d {

    /* renamed from: a */
    public static final C104140d f308132a = new C104140d();

    /* renamed from: b */
    public static final HashMap<String, List<Pair<String, String>>> f308133b = new HashMap<>();

    /* renamed from: c */
    public static final HashMap<String, List<Pair<String, String>>> f308134c = new HashMap<>();

    /* renamed from: d */
    public static final HashMap<String, List<Pair<String, String>>> f308135d = new HashMap<>();

    /* renamed from: a */
    public static final void m138970a(C104140d dVar, int i, int i2, String str) {
        dVar.getClass();
        CameraKitOperateEvent cameraKitOperateEvent = new CameraKitOperateEvent();
        CameraKitOperateEvent.C104590a aVar = cameraKitOperateEvent.f309992d;
        aVar.f309993a = i;
        aVar.f309994b = i2;
        aVar.f309995c = str;
        Log.m105924i("CameraHooker", "publish event type:" + i + " event:" + cameraKitOperateEvent + " scene:" + str);
        cameraKitOperateEvent.publish();
    }
}
