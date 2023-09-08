package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import java.util.List;
import java.util.Map;
import p1042u.C111055b;
import p1205p.C117908a;
import p426a.C112697b;

public abstract class CustomTabsService extends Service {

    /* renamed from: d */
    public final Map<IBinder, IBinder.DeathRecipient> f337879d = new C111055b();

    /* renamed from: e */
    public C112697b f337880e = new C112854a();

    /* renamed from: androidx.browser.customtabs.CustomTabsService$a */
    public class C112854a extends C112697b {
        public C112854a() {
        }
    }

    /* renamed from: a */
    public abstract Bundle mo164691a(String str, Bundle bundle);

    /* renamed from: b */
    public abstract boolean mo164692b(C117908a aVar, Uri uri, Bundle bundle, List<Bundle> list);

    /* renamed from: c */
    public abstract boolean mo164693c(C117908a aVar);

    /* renamed from: d */
    public abstract int mo164694d(C117908a aVar, String str, Bundle bundle);

    /* renamed from: e */
    public abstract boolean mo164695e(C117908a aVar, Uri uri);

    /* renamed from: f */
    public abstract boolean mo164696f(C117908a aVar, Bundle bundle);

    /* renamed from: g */
    public abstract boolean mo164697g(C117908a aVar, int i, Uri uri, Bundle bundle);

    /* renamed from: h */
    public abstract boolean mo164698h(long j);

    public IBinder onBind(Intent intent) {
        return this.f337880e;
    }
}
