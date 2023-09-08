package kb3;

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wepkg.model.C44501k;
import com.tencent.p014mm.plugin.wepkg.utils.C44536d;
import com.tencent.p014mm.plugin.wepkg.utils.WepkgListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86301e;
import ei3.C86522b;
import java.util.Map;
import lu3.C34379c;
import mb3.C46988i;
import sx1.C48493b;
import zt3.C119157j;
import zt3.C119179t;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS})
/* renamed from: kb3.g */
public class C46670g extends C86301e {

    /* renamed from: d */
    public C34379c f125640d;

    /* renamed from: e */
    public WepkgListener f125641e;

    /* renamed from: kb3.g$a */
    public class C46671a implements C48493b.C48494a {
        public C46671a(C46670g gVar) {
        }

        /* renamed from: a */
        public void mo65649a() {
            try {
                Map<String, C44501k> map = C46676l.f125644a;
                if (!C80907o.m98784g(MMApplicationContext.getMainProcessName())) {
                    C44536d.m48915a("", new C46673i());
                }
                C46665a.m51973b();
                String str = C46668d.f125638a;
                Log.m105924i("MicroMsg.GameJsServerCommLibPkg", "load");
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.WePkg.PluginWePkg", e, "", new Object[0]);
                C115669n.INSTANCE.idkeyStat(859, 19, 1, false);
            }
        }
    }

    /* renamed from: kb3.g$b */
    public class C46672b implements Runnable {
        public C46672b() {
        }

        public void run() {
            C46670g gVar = C46670g.this;
            if (gVar.f125641e == null) {
                gVar.f125641e = new WepkgListener();
            }
            WepkgListener wepkgListener = C46670g.this.f125641e;
            wepkgListener.getClass();
            Log.m105924i("MicroMsg.Wepkg.WepkgListener", "wepkg start listen");
            wepkgListener.f120758c.alive();
            wepkgListener.f120757b.alive();
            if (C46988i.f126346a == null) {
                C46988i.f126346a = new C46988i.C46990b((C46988i.C46989a) null);
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.wifi.STATE_CHANGE");
            intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            try {
                MMApplicationContext.getContext().registerReceiver(C46988i.f126346a, intentFilter);
            } catch (Exception unused) {
            }
            Log.m105924i("MicroMsg.Wepkg.WepkgAutoDownloader", "WepkgAutoDownloader startListen");
            wepkgListener.f120756a.alive();
            Context context = MMApplicationContext.getContext();
            if (context != null) {
                try {
                    SharedPreferences sharedPreferences = context.getSharedPreferences("we_pkg_sp", 4);
                    if (sharedPreferences == null) {
                        Log.m105920e("MicroMsg.Wepkg.WepkgListener", "sp is null");
                        return;
                    }
                    if (sharedPreferences.getBoolean("disable_we_pkg", false)) {
                        Log.m105924i("MicroMsg.Wepkg.WepkgListener", "enable wepkg");
                        sharedPreferences.edit().putBoolean("disable_we_pkg", false).commit();
                    }
                    sharedPreferences.edit().putInt("white_screen_times", 0).commit();
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.Wepkg.WepkgListener", e.getMessage());
                }
            }
        }
    }

    public void onAccountInitialized(Context context) {
        super.onAccountInitialized(context);
        Log.m105924i("MicroMsg.WePkg.PluginWePkg", "onAccountInitialized");
        C119179t tVar = C119157j.f356862d;
        C46672b bVar = new C46672b();
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        this.f125640d = jVar.mo183892w(bVar, 1000, false);
    }

    public void onAccountReleased(Context context) {
        super.onAccountReleased(context);
        Log.m105924i("MicroMsg.WePkg.PluginWePkg", "onAccountRelease");
        C34379c cVar = this.f125640d;
        if (cVar != null) {
            cVar.cancel(true);
        }
        WepkgListener wepkgListener = this.f125641e;
        if (wepkgListener != null) {
            wepkgListener.getClass();
            Log.m105924i("MicroMsg.Wepkg.WepkgListener", "wepkg stop listen");
            wepkgListener.f120758c.dead();
            wepkgListener.f120756a.dead();
            wepkgListener.f120757b.dead();
            if (C46988i.f126346a != null) {
                try {
                    MMApplicationContext.getContext().unregisterReceiver(C46988i.f126346a);
                } catch (Exception unused) {
                }
            }
            C46988i.f126346a = null;
            Log.m105924i("MicroMsg.Wepkg.WepkgAutoDownloader", "WepkgAutoDownloader stopListen");
            if (C44536d.f120771b != null) {
                synchronized (C44536d.f120770a) {
                    if (C44536d.f120771b != null) {
                        C44536d.f120771b.quit();
                        C44536d.f120771b = null;
                    }
                }
            }
            this.f125641e = null;
        }
    }

    public void onCreate(Context context) {
        super.onCreate(context);
        if (MMApplicationContext.isToolsProcess()) {
            C48493b.m53856b().mo73124a("preload_commlib", new C46671a(this));
        }
        MMApplicationContext.isMainProcess();
    }
}
