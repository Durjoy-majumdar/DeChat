package androidx.browser.customtabs;

import android.os.IBinder;
import androidx.browser.customtabs.CustomTabsService;
import java.util.NoSuchElementException;
import p1042u.C111059i;
import p1205p.C117908a;

/* renamed from: androidx.browser.customtabs.a */
public class C112856a implements IBinder.DeathRecipient {

    /* renamed from: d */
    public final /* synthetic */ C117908a f337883d;

    /* renamed from: e */
    public final /* synthetic */ CustomTabsService.C112854a f337884e;

    public C112856a(CustomTabsService.C112854a aVar, C117908a aVar2) {
        this.f337884e = aVar;
        this.f337883d = aVar2;
    }

    public void binderDied() {
        CustomTabsService customTabsService = CustomTabsService.this;
        C117908a aVar = this.f337883d;
        customTabsService.getClass();
        try {
            synchronized (customTabsService.f337879d) {
                IBinder asBinder = aVar.f352433a.asBinder();
                asBinder.unlinkToDeath((IBinder.DeathRecipient) ((C111059i) customTabsService.f337879d).getOrDefault(asBinder, null), 0);
                ((C111059i) customTabsService.f337879d).remove(asBinder);
            }
        } catch (NoSuchElementException unused) {
        }
    }
}
