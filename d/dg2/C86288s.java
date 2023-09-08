package dg2;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.qqmail.p090ui.ReadMailUI;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;

/* renamed from: dg2.s */
public class C86288s implements C1256g<Bundle> {

    /* renamed from: d */
    public final /* synthetic */ ReadMailUI f250906d;

    public C86288s(ReadMailUI readMailUI) {
        this.f250906d = readMailUI;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (!this.f250906d.isFinishing() && !this.f250906d.isDestroyed()) {
            String string = bundle.getString("mail_id");
            if (this.f250906d.f248818e.f233213a.equals(string)) {
                MMHandlerThread.postToMainThread(new C86287q(this, bundle, string));
            }
        }
    }
}
