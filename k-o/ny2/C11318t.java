package ny2;

import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.teenmode.p111ui.SettingsTeenModeMain;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import ke3.C88144b;
import ky2.C10432i;
import nj3.C11184p0;
import nj3.C76912y0;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: ny2.t */
public class C11318t implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ SettingsTeenModeMain f33276d;

    /* renamed from: ny2.t$a */
    public class C11319a implements Runnable {

        /* renamed from: ny2.t$a$a */
        public class C11320a implements Runnable {
            public C11320a() {
            }

            public void run() {
                C11318t.this.f33276d.finish();
            }
        }

        public C11319a() {
        }

        public void run() {
            C88144b.m109789g(C11318t.this.f33276d, "teenmode", ".ui.SettingsTeenModeIntro");
            C11318t.this.f33276d.overridePendingTransition(0, 0);
            C119179t tVar = C119157j.f356862d;
            C11320a aVar = new C11320a();
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            jVar.mo183886q(aVar, 200, (String) null);
        }
    }

    public C11318t(SettingsTeenModeMain settingsTeenModeMain) {
        this.f33276d = settingsTeenModeMain;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (menuItem.getItemId() == 0) {
            ((C10432i) C86312j.m106911c(C10432i.class)).mo10752gg();
            SettingsTeenModeMain settingsTeenModeMain = this.f33276d;
            C76912y0.m92768g(settingsTeenModeMain, settingsTeenModeMain.getString(C0966R.string.jwm));
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_TEEN_MODE_ENJOY_TIME_LONG_SYNC, 0L);
            MMHandlerThread.postToMainThreadDelayed(new C11319a(), 2000);
        }
    }
}
