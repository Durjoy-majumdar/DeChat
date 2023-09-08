package androidx.lifecycle;

import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C54209k0;

/* renamed from: androidx.lifecycle.l0 */
public class C39629l0 {
    /* renamed from: a */
    public static C54209k0 m42233a(FragmentActivity fragmentActivity, C54209k0.C54210b bVar) {
        Application application = fragmentActivity.getApplication();
        if (application != null) {
            if (bVar == null) {
                if (C54209k0.C39627a.f106387c == null) {
                    C54209k0.C39627a.f106387c = new C54209k0.C39627a(application);
                }
                bVar = C54209k0.C39627a.f106387c;
            }
            return new C54209k0(fragmentActivity.getViewModelStore(), bVar);
        }
        throw new IllegalStateException("Your activity/fragment is not yet attached to Application. You can't request ViewModel before onCreate call.");
    }
}
