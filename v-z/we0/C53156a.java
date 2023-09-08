package we0;

import android.content.Context;
import android.view.OrientationEventListener;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: we0.a */
public class C53156a extends OrientationEventListener {

    /* renamed from: a */
    public C53157a f148327a = C53157a.NONE;

    /* renamed from: b */
    public int f148328b = 45;

    /* renamed from: c */
    public C38082b f148329c;

    /* renamed from: we0.a$b */
    public interface C38082b {
        /* renamed from: a */
        void mo12953a(C53157a aVar, C53157a aVar2);
    }

    /* renamed from: we0.a$a */
    public enum C53157a {
        NONE,
        PORTRAIT,
        LANDSCAPE,
        REVERSE_PORTRAIT,
        REVERSE_LANDSCAPE
    }

    public C53156a(Context context, C38082b bVar) {
        super(context);
        this.f148329c = bVar;
        Log.m105924i("MicroMsg.OrientationListenerHelper", APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
    }

    public void disable() {
        super.disable();
        this.f148327a = C53157a.NONE;
    }

    public void enable() {
        super.enable();
    }

    public void onOrientationChanged(int i) {
        if (i != -1) {
            C53157a aVar = this.f148327a;
            int i2 = this.f148328b;
            C53157a aVar2 = ((i < 360 - i2 || i >= 360) && (i < 0 || i > i2 + 0)) ? (i < 270 - i2 || i > i2 + 270) ? (i < 180 - i2 || i > i2 + 180) ? (i < 90 - i2 || i > i2 + 90) ? aVar : C53157a.REVERSE_LANDSCAPE : C53157a.REVERSE_PORTRAIT : C53157a.LANDSCAPE : C53157a.PORTRAIT;
            if (aVar2 != aVar) {
                C38082b bVar = this.f148329c;
                if (!(bVar == null || aVar == C53157a.NONE)) {
                    bVar.mo12953a(aVar, aVar2);
                }
                this.f148327a = aVar2;
            }
        }
    }
}
