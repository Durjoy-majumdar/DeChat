package x22;

import com.tencent.p014mm.plugin.location.p069ui.VolumeMeter;
import com.tencent.p014mm.sdk.platformtools.MMHandler;

/* renamed from: x22.t */
public class C118818t implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ VolumeMeter f355489d;

    public C118818t(VolumeMeter volumeMeter) {
        this.f355489d = volumeMeter;
    }

    public void run() {
        this.f355489d.f346410n = new MMHandler();
        VolumeMeter volumeMeter = this.f355489d;
        MMHandler mMHandler = volumeMeter.f346410n;
        if (mMHandler == null) {
            new MMHandler().postDelayed(new C118818t(volumeMeter), 100);
        } else {
            mMHandler.post(volumeMeter);
        }
    }
}
