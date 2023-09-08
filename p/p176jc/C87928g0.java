package p176jc;

import com.tencent.luggage.skyline.SkylineView;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.skyline.SkylineLogic;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import p172io.flutter.embedding.engine.renderer.FlutterRenderer;
import rx3.C13598b0;
import zt3.C119157j;

/* renamed from: jc.g0 */
public final class C87928g0 extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ SkylineView f254483d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87928g0(SkylineView skylineView) {
        super(1);
        this.f254483d = skylineView;
    }

    public Object invoke(Object obj) {
        ArrayList arrayList;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean z = this.f254483d.f235011n.get();
        Log.m105924i("SkylineView", "waitFlutterReady isSuccess:" + booleanValue + ", isDestroyed:" + z);
        if (!z) {
            SkylineView skylineView = this.f254483d;
            synchronized (skylineView) {
                skylineView.f235008h = true;
                arrayList = new ArrayList(skylineView.f235009i);
                skylineView.f235009i.clear();
                C13598b0 b0Var = C13598b0.f38549a;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C32224a) it.next()).invoke();
            }
            if (BuildInfo.DEBUG) {
                SkylineView skylineView2 = this.f254483d;
                if (MMHandlerThread.isMainThread()) {
                    skylineView2.getClass();
                    FlutterRenderer obtainRenderer = SkylineLogic.INSTANCE.obtainRenderer(skylineView2.f235004d);
                    if (obtainRenderer != null) {
                        obtainRenderer.addIsDisplayingFlutterUiListener(new C87922e0(skylineView2));
                    }
                } else {
                    ((C119157j) C119157j.f356862d).mo183895z(new C87927f0(skylineView2));
                }
            }
        }
        return C13598b0.f38549a;
    }
}
