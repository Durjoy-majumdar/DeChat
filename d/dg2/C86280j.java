package dg2;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.qqmail.p090ui.ReadMailUI;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;

/* renamed from: dg2.j */
public class C86280j implements C1256g<Bundle> {

    /* renamed from: d */
    public final /* synthetic */ ReadMailUI f250895d;

    public C86280j(ReadMailUI readMailUI) {
        this.f250895d = readMailUI;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (!this.f250895d.isFinishing() && !this.f250895d.isDestroyed()) {
            MMHandlerThread.postToMainThread(new C86279i(this, bundle));
        }
    }
}
