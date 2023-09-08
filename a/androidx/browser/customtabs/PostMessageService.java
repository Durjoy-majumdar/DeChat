package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import p426a.C112698c;

public class PostMessageService extends Service {

    /* renamed from: d */
    public C112698c f337882d = new C112855a(this);

    /* renamed from: androidx.browser.customtabs.PostMessageService$a */
    public class C112855a extends C112698c {
        public C112855a(PostMessageService postMessageService) {
        }
    }

    public IBinder onBind(Intent intent) {
        return this.f337882d;
    }
}
