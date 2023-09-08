package p1217u6;

import android.content.Context;
import android.view.WindowManager;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: u6.e */
public class C118599e {

    /* renamed from: a */
    public final Context f354905a;

    public C118599e(Context context) {
        this.f354905a = context;
    }

    /* renamed from: a */
    public C118591b mo183346a() {
        int rotation = ((WindowManager) this.f354905a.getSystemService("window")).getDefaultDisplay().getRotation();
        int i = this.f354905a.getResources().getConfiguration().orientation;
        C118591b bVar = rotation != 0 ? rotation != 1 ? rotation != 2 ? rotation != 3 ? C118591b.Unknown : C118591b.LandscapeRight : C118591b.PortraitDown : C118591b.LandscapeLeft : C118591b.PortraitUp;
        Log.m105924i("MicroMsg.PatchedOrientationReader", "getOrientation, orientation:" + i + ", rotation:" + rotation + ", returnOrientation:" + bVar);
        return bVar;
    }
}
