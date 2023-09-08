package androidx.core.content;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import p382t2.C22435c;
import p385u2.C22579c;

public abstract class UnusedAppRestrictionsBackportService extends Service {

    /* renamed from: d */
    public C22435c f44563d = new C16571a();

    /* renamed from: androidx.core.content.UnusedAppRestrictionsBackportService$a */
    public class C16571a extends C22435c {
        public C16571a() {
        }
    }

    /* renamed from: a */
    public abstract void mo16729a(C22579c cVar);

    public IBinder onBind(Intent intent) {
        return this.f44563d;
    }
}
