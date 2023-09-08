package co3;

import android.app.Activity;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import xq3.C38806a;

/* renamed from: co3.b */
public interface C28633b {

    /* renamed from: a */
    public static final /* synthetic */ int f78562a = 0;

    /* renamed from: co3.b$a */
    public static final class C28634a {

        /* renamed from: a */
        public static final C28633b f78563a = new C28635a();

        /* renamed from: co3.b$a$a */
        public static final class C28635a implements C28633b {
            /* renamed from: a */
            public void mo56105a(C38806a aVar) {
                C87412m.m108594g(aVar, "result");
            }

            /* renamed from: b */
            public void mo56106b(Activity activity) {
                C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            }
        }
    }

    /* renamed from: a */
    void mo56105a(C38806a aVar);

    /* renamed from: b */
    void mo56106b(Activity activity);
}
